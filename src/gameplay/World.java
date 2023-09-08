
package gameplay;
import graph_components.Room;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import playercommand_grammar.PlayerCommandLexer;
import structure.*;
import graph_components.Graph;

import java.sql.SQLOutput;
import java.util.ArrayList;
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
    public void onEnterRoom()
	{
        Zombie zombie = new Zombie("Zombie", 10, 5, 40);
        if(zombie.appear()) { currentRoom.getMonsters().add(zombie); }

        if(!currentRoom.getMonsters().isEmpty()) {
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
        System.out.println("Choose action: (door n | pickup item | exit | describe | admire valuable | eat food | stats | wield weapon | open chest | help)");
        String input = scanner.nextLine();
        PlayerCommandLexer lexer = new PlayerCommandLexer(CharStreams.fromString(input));
        Token token = lexer.nextToken();

        while(token.getType() != Token.EOF) {
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
                    pickUpItem("Item");
                    //iterate through inventory
                    //place in players inventory
                    //remove from room inventory
                    token = lexer.nextToken();

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
                    tryToOpenChest();
                    token = lexer.nextToken();
                }
                default -> {
                    break;
                }
            }
        }


    }

    private void tryToOpenChest() {
        //try to open a chest in inventory
        //place item in inventory
        //consume lock etc.,
    }

    private void wieldWeapon() {
        //wield a new weapon from players inventory
    }
    private void displayPlayerStats() {
        //display current player stats
    }
    private void eatFood(String item) {

    }
    private void pickUpItem(String item) {

    }
    private void admireValuable() {
        System.out.println("You are admiring a valuable");
        //iterate inventory
        //update confidence
    }
    private void moveToRoom(int n) {
        Room[] currentConnectingRooms = currentRoom.getConnectingRooms();
        int roomCount = 0;
        for(Room room : currentRoom.getConnectingRooms()) {
            if(room != null) {
                roomCount++;
            }
        }
        if(n >= 0 && n < roomCount) {
            currentRoom = currentConnectingRooms[n];
        }
    }

    private void tryToExit() {
        if(currentRoom.isEndRoom()) {

        } else {
            System.out.println("There is no exit in this room... Keep going!");
        }
    }

    private void processBattleUserInput() {
        System.out.println("A monster appeared! Entering battle mode!");
    }

    private void describeRoom() {

        int roomCount = 0;
        for(int i = 0; i < currentRoom.getConnectingRooms().length; i++) {
            if(currentRoom.getConnectingRooms()[i] != null) {
                roomCount++;
            }
        }
        System.out.println("=================================");
        System.out.println("| You see "+roomCount+" doors");
        if(roomCount > 0) {
            for(int i = 0; i < currentRoom.getConnectingRooms().length; i++) {
                if(currentRoom.getConnectingRooms()[i] != null) {
                    System.out.print("Room Number "+i+": ["+currentRoom.getConnectingRooms()[i]+"]");
                }
            }
            System.out.println();
        }

        System.out.println("You look for items in the room...");
        if(!currentRoom.getRoomItems().isEmpty()) {
            System.out.println("You see the following...");
            for(Pickup pickup : currentRoom.getRoomItems().getItems()) {
                System.out.println(pickup+" ");
            }
        } else {
            System.out.println("You don't see anything...");
        }
        System.out.println("=================================");
    }


    //--------------------------------------------------------

    //--------------------------------------------------------
}


