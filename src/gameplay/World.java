package gameplay;

import gamemap_grammar.GameMapLexer;
import graph_components.Room;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import playercommand_grammar.PlayerCommandLexer;
import structure.*;
import graph_components.Graph;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class World {
    public enum PlayMode {battle, explore;}

    private Graph graph;
    Player player;
    PlayMode mode;
    private Room startRoom;
    private Room currentRoom;
    private Room endRoom;
    private Scanner scanner;

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
//        Zombie zombie = new Zombie("Zombie", 10, 5, 40);
//        if(zombie.appear()) { currentRoom.getMonsters().add(zombie); }

        if (!currentRoom.getMonsters().isEmpty()) {
            this.mode = PlayMode.battle;
        } else {
            this.mode = PlayMode.explore;
        }
    }

    //--------------------------------------------------------
    public void play(Player player) {
        this.player = player;
        System.out.println("Welcome player " + player);
        System.out.println("Starting at [" + startRoom + "] End room is [" + endRoom + "]");
        this.onEnterRoom();

        boolean gameInProgress = true;
        while (gameInProgress) {
            switch (this.mode) {
                case explore -> {
                    processExploreUserInput();
                }
                case battle -> {
                    processBattleUserInput();
                }

            }

        }

    }

    private void processExploreUserInput() {
        System.out.println("| You enter Room: " + currentRoom + " |");
        System.out.println("Choose action: (door n | pickup item | exit | describe | admire valuable | eat food | stats | wield weapon | open chest | help)");
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
                    admireValuable();
                    token = lexer.nextToken();
                }
                case PlayerCommandLexer.EAT -> {
                    eatFood("Food");
                    token = lexer.nextToken();
                }
                case PlayerCommandLexer.STATS -> {
                    displayPlayerStats();
                    token = lexer.nextToken();
                }
                case PlayerCommandLexer.WIELD -> {
                    wieldWeapon();
                    token = lexer.nextToken();
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

    private void displayCurrentHelpCommands(PlayMode mode) {


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
                    player.getInventory().add(pickup);
                }
                player.getInventory().remove(getChest);
            }

        } else {
            System.out.println("That item is not in your inventory!");
        }

    }

    private void wieldWeapon() {
        //wield a new weapon from players inventory
    }

    private void displayPlayerStats() {
        System.out.println(this.player);
        System.out.println("Inventory: "+Arrays.toString(Arrays.stream(this.player.getInventory().getItems()).toArray()));
    }

    private void eatFood(String item) {

    }

    private void pickUpItem(String item) {
        //System.out.println(currentRoom.getRoomItems());
        for(Pickup pickup : currentRoom.getRoomItems().getItems()) {
            System.out.println(pickup);
        }
        System.out.println(item);
        Pickup pickup = currentRoom.getRoomItems().select(item);
        if (pickup == null) {
            System.out.println("No such items");
        } else {
            currentRoom.getRoomItems().remove(pickup);
            player.getInventory().add(pickup);
        }
    }

    private void admireValuable() {
        System.out.println("You are admiring a valuable");
        //iterate inventory
        //update confidence
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
            currentRoom = currentConnectingRooms[n];
        }
    }

    private void tryToExit() {
        if (currentRoom.isEndRoom()) {

        } else {
            System.out.println("There is no exit in this room... Keep going!");
        }
    }

    private void processBattleUserInput() {
        System.out.println("A monster appeared! Entering battle mode!");
    }

    private void describeRoom() {

        int roomCount = 0;
        for (int i = 0; i < currentRoom.getConnectingRooms().length; i++) {
            if (currentRoom.getConnectingRooms()[i] != null) {
                roomCount++;
            }
        }
        System.out.println("=================================");
        System.out.println("| You see " + roomCount + " doors");
        if (roomCount > 0) {
            for (int i = 0; i < currentRoom.getConnectingRooms().length; i++) {
                if (currentRoom.getConnectingRooms()[i] != null) {
                    System.out.print("Room Number " + i + ": [" + currentRoom.getConnectingRooms()[i] + "]");
                }
            }
            System.out.println();
        }

        System.out.println("You look for items in the room...");
        if (!currentRoom.getRoomItems().isEmpty()) {
            System.out.println("You see the following...");
            for (Pickup pickup : currentRoom.getRoomItems().getItems()) {
                System.out.println(pickup + " ");
            }
        } else {
            System.out.println("You don't see anything...");
        }
        System.out.println("=================================");
    }


    //--------------------------------------------------------

    //--------------------------------------------------------
}


