package gameplay;

import gamemap_grammar.GameMapLexer;
import graph_components.Room;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import playercommand_grammar.PlayerCommandLexer;
import structure.*;
import graph_components.Graph;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class World {
    public enum PlayMode {battle, explore;}

    private Graph graph;
    Player player;
    PlayMode mode;
    private Room startRoom;
    private Room currentRoom;
    private Room endRoom;
    private Room previousRoom;
    private final Scanner scanner;

    public World(Graph graph) {
        this.graph = graph;
        setStartRoom("room1");
        setEndRoom("room11");
        this.currentRoom = startRoom;
        scanner = new Scanner(System.in);
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    public void setStartRoom(String key) {
        this.startRoom = graph.getRoomMap().get(key);
    }

    public void setEndRoom(String key) {
        this.endRoom = graph.getRoomMap().get(key);
    }

    public Graph getGraph() {
        return this.graph;
    }

    //--------------------------------------------------------
    public void onEnterRoom() {

        if(currentRoom == endRoom) {
            Dragon dragon = new Dragon("Dragon", 100, 10, 100);
            currentRoom.getMonsters().add(dragon);
        } else if(currentRoom != startRoom) {
            Random rand = new Random();
            if(rand.nextInt(2) == 0) {
                Zombie zombie = new Zombie("Zombie", 10, 5, 60);
                if(zombie.appear()) { currentRoom.getMonsters().add(zombie); }

            } else {
                Ogre ogre = new Ogre("Ogre", 20, 5, 40);
                if(ogre.appear()) { currentRoom.getMonsters().add(ogre); }
            }
        }

        if (!currentRoom.getMonsters().isEmpty()) {
            this.mode = PlayMode.battle;
        } else {
            this.mode = PlayMode.explore;
        }
    }

    //--------------------------------------------------------
    public void play(Player player) {
        this.player = player;
        System.out.println("==================================================================");
        System.out.println("Welcome player " + player);
        System.out.println("Starting at [" + startRoom + "] End room is [" + endRoom + "]");
        System.out.println("==================================================================\n\n");
        this.onEnterRoom();

        boolean gameInProgress = true;
        while (gameInProgress) {
            switch (this.mode) {
                case explore -> {
                    processExploreUserInput();
                }
                case battle -> {
                    System.out.println("Entering battle mode!");
                    processBattleUserInput();
                }
            }
        }
    }

    private void processExploreUserInput() {
        System.out.println("| You are in : " + currentRoom + " |");
        System.out.println("Choose action: (door n | pickup item | exit | describe | admire valuable | eat food | stats | wield weapon | open chest | help)");
        describeRoom();
        String input = scanner.nextLine();
        PlayerCommandLexer lexer = new PlayerCommandLexer(CharStreams.fromString(input));
        Token token = lexer.nextToken();

        while (token.getType() != Token.EOF) {
            switch (token.getType()) {
                case PlayerCommandLexer.DOOR -> {
                    token = lexer.nextToken();
                    if (token.getType() == PlayerCommandLexer.INT) {
                        int door = Integer.parseInt(token.getText());
                        moveToRoom(door);
                        this.onEnterRoom();
                    }
                }
                case PlayerCommandLexer.PICKUP -> {
                    token = lexer.nextToken();
                    pickUpItem(token.getText());
                }
                case PlayerCommandLexer.EXIT -> {
                    tryToExit();
                    token = lexer.nextToken();
                }
                case PlayerCommandLexer.DESCRIBE -> {
                    describeRoom();
                    token = lexer.nextToken();
                }
                case PlayerCommandLexer.ADMIRE -> {
                    token = lexer.nextToken();
                    admireValuable(token.getText());
                }
                case PlayerCommandLexer.EAT -> {
                    token = lexer.nextToken();
                    eatFood(token.getText());
                }
                case PlayerCommandLexer.STATS -> {
                    displayPlayerStats();
                    token = lexer.nextToken();
                }
                case PlayerCommandLexer.WIELD -> {
                    token = lexer.nextToken();
                    wieldWeapon(token.getText());
                }
                case PlayerCommandLexer.OPEN -> {
                    token = lexer.nextToken();
                    tryToOpenChest(token.getText());
                }
                case PlayerCommandLexer.HELP -> {
                    displayCurrentHelpCommands(this.mode);
                    token = lexer.nextToken();
                }
                default -> {
                    input = scanner.nextLine();
                    break;
                }
            }
            token = lexer.nextToken();
        }
    }

    private void processBattleUserInput() {
            System.out.println("Entering combat!");
            Monster monster = currentRoom.getMonsters().get(0);
            while(this.mode == PlayMode.battle) {


            System.out.println("Choose action: (attack | stats | eat | flee | wield weapon | help)");
            String input = scanner.nextLine();
            PlayerCommandLexer lexer = new PlayerCommandLexer(CharStreams.fromString(input));
            Token token = lexer.nextToken();

            while(token.getType() != Token.EOF) {
                switch(token.getType()) {
                    case PlayerCommandLexer.ATTACK -> {
                        handleAttackInput(monster);
                    }
                    case PlayerCommandLexer.FLEE -> {
                        tryToFlee();
                    }
                    case PlayerCommandLexer.WIELD -> {
                        token = lexer.nextToken();
                        wieldWeapon(token.getText());
                    }
                    case PlayerCommandLexer.STATS -> {
                        displayPlayerStats();
                    }
                    case PlayerCommandLexer.EAT -> {
                        token = lexer.nextToken();
                        eatFood(token.getText());
                    }
                    case PlayerCommandLexer.HELP -> {
                        displayCurrentHelpCommands(this.mode);
                    }
                    default -> {
                        System.out.println("Invalid input. Try again");
                    }
                }
                token = lexer.nextToken();
            }
        }

    }

    private void tryToFlee() {

        if(currentRoom != endRoom) {

            System.out.println("You try to flee the battle!");
            Room temp = currentRoom;
            currentRoom = previousRoom;
            previousRoom = temp;
            this.mode = PlayMode.explore;

        } else {
            System.out.println("Cannot flee! Final boss");
        }

    }
    private void handleAttackInput(Monster monster) {

        int damageDealtToMonster = monster.defendAttack(player);

        System.out.println("=================================");
        System.out.println("| PLAYER:");
        System.out.println("| \t"+player);
        System.out.println("|");
        System.out.println("| \tYou attack the " + monster + "!");
        System.out.println("| \tDamage dealt: " + damageDealtToMonster);
        System.out.println("| \tMonster HP: [" + monster.getHp() + "]");
        System.out.println("=================================");

        if(monster.isDead()) {
            System.out.println("★ Victory! You defeated the " + monster + "! ★");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            currentRoom.getMonsters().remove(monster);
            this.mode = PlayMode.explore;

            checkForWinConditions();

            System.out.println("You can now continue your exploration...");
        } else {
            int damageDealtToPlayer = player.defendAttack(monster);
            System.out.println();
            System.out.println("The " + monster + " counter-attacks!");
            System.out.println("Damage received: " + damageDealtToPlayer);
            System.out.println("Your HP: [" + player.getHp() + "]");
            System.out.println("=================================");

            if(player.getHp() <= 0) {
                System.out.println("☠ You've been defeated! Game over. ☠");
                //gameInProgress = false;
            }
        }
        System.out.println();
    }


    private void displayCurrentHelpCommands(PlayMode mode) {
        System.out.println("\n=================================");
        System.out.println("| COMMANDS:");
        switch (mode) {
            case explore -> {
                System.out.println("|     door [n] - Go through door number [n]");
                System.out.println("|     pickup [item] - Pickup specified item");
                System.out.println("|     exit - Try to exit the current room");
                System.out.println("|     describe - Describe the current room");
                System.out.println("|     admire [valuable] - Admire a valuable from your inventory");
                System.out.println("|     eat [food] - Eat specified food from your inventory");
                System.out.println("|     stats - Display player's current stats and inventory");
                System.out.println("|     wield [weapon] - Wield a weapon from your inventory");
                System.out.println("|     open [chest] - Attempt to open a specified chest");
                System.out.println("|     help - Display this help menu");
            }
            case battle -> {
                System.out.println("|     attack - Attack the monster");
                System.out.println("|     stats - Display player's current stats and inventory");
                System.out.println("|     eat [food] - Eat specified food from your inventory to recover HP");
                System.out.println("|     flee - Try to escape from the battle");
                System.out.println("|     wield [weapon] - Wield a weapon from your inventory");
                System.out.println("|     help - Display this help menu");
            }
        }
        System.out.println("=================================\n");
    }


    private void checkForWinConditions() {
        if(currentRoom.getMonsters().isEmpty() && currentRoom == endRoom) {
            System.out.println("★★★ You win! Well done! ★★★");
        }
    }

    private void tryToOpenChest(String chest) {

        System.out.println("You are trying to open a "+chest);
        Pickup getChest = player.getInventory().select(chest);

        if(getChest != null) {
            Openable foundChest = (Openable) player.getInventory().select(chest);
            if(foundChest.getIsLocked()) {
                System.out.println("Chest is locked!");
            } else {
                System.out.println("Chest contains :"+foundChest.getChestItems());
                for(Pickup pickup : foundChest.getChestItems()) {
                    System.out.println("You put the "+pickup+" in your inventory.");
                    player.getInventory().add(pickup);
                }
                player.getInventory().remove(getChest);
            }

        } else {
            System.out.println("That item is not in your inventory!");
        }
    }

    private void wieldWeapon(String item) {
        Wieldable pickup = (Wieldable) player.getInventory().select(item);
        if(pickup == null) {
            System.out.println("No such item");
        } else {
            System.out.println("You are trying to wield "+pickup);
            player.setCurrentWeapon(pickup);
        }
    }

    private void displayPlayerStats() {
        System.out.println(this.player);
        System.out.println("Inventory: "+Arrays.toString(Arrays.stream(this.player.getInventory().getItems()).toArray()));
        System.out.println("Current weapon: "+player.getCurrentWeapon());
    }

    private void eatFood(String item) {
        Food pickup = (Food) player.getInventory().select(item);

        if(pickup == null) {
            System.out.println("No such items");
        }  else {
            System.out.println("You eat the "+item);
            System.out.println("You restore "+pickup.getRestoreHp()+" hp");
            player.setHp(player.getHp() + pickup.getRestoreHp());
            player.getInventory().remove(pickup);
        }

    }

    private void pickUpItem(String item) {
        Pickup pickup = currentRoom.getRoomItems().select(item);
        if (pickup == null) {
            System.out.println("No such items");
        } else {
              if((pickup instanceof WarChest || pickup instanceof TreasureChest) &&
                  player.getInventory().containsItemOfType(pickup.getClass())) {
                  System.out.println("You already have a chest of this type");
              } else {
                  currentRoom.getRoomItems().remove(pickup);
                  player.getInventory().add(pickup);
              }
        }
    }

    private void admireValuable(String item) {

        Valuable pickup = (Valuable) player.getInventory().select(item);
        if(pickup == null) {
            System.out.println("No such items");
        } else {
            System.out.println("You are admiring a valuable");
            if(!pickup.isHasAdmired()) {
                System.out.println("Your confidence has increased by "+pickup.getValue());
                player.setConfidence(player.getConfidence() + pickup.getValue());
                pickup.setHasAdmired(true);
            } else {
                System.out.println("This valuable has been admired before...");
            }
        }
    }

    private void moveToRoom(int n) {
        Room[] currentConnectingRooms = currentRoom.getConnectingRooms();
        int roomCount = 0;
        for (Room room : currentRoom.getConnectingRooms()) {
            if (room != null) {
                roomCount++;
            }
        }
        if (n >= 0 && n < roomCount) {
            previousRoom = currentRoom;
            currentRoom = currentConnectingRooms[n];
        }
    }

    private void tryToExit() {
        if (currentRoom.isEndRoom()) {

        } else {
            System.out.println("There is no exit in this room... Keep going!");
        }
    }


    private void describeRoom() {

        System.out.println("=================================");
        System.out.println("| DOORS:");
        int roomCount = 0;
        for (Room room : currentRoom.getConnectingRooms()) {
            if (room != null) {
                System.out.println("|     Door " + roomCount + " leads to " + room);
                roomCount++;
            }
        }
        if (roomCount == 0) {
            System.out.println("|     No doors in this room.");
        }
        System.out.println("|");

        System.out.println("| ITEMS:");
        if (!currentRoom.getRoomItems().isEmpty()) {
            for (Pickup pickup : currentRoom.getRoomItems().getItems()) {
                System.out.println("|     " + pickup);
            }
        } else {
            System.out.println("|     You don't see any items...");
        }

        System.out.println("=================================");
    }

}


