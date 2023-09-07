
package gameplay;
import graph_components.Room;
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
        //user to input playmode here
        //need to define play grammar
        //
	}
    //--------------------------------------------------------
    public void play(Player player)
    {
        System.out.println("Starting at "+startRoom+" End room is" + endRoom);
        this.player = player;
        System.out.println("Welcome player " + player);

        System.out.println(player);
        this.onEnterRoom();

        boolean gameInProgress = true;
        while (gameInProgress) {
            //switch (this.mode) {
            //    case explore:
            //        //processExploreUserInput();
            //        break;
            //    case battle:
            //        //processBattleUserInput();
            //        break;
                exploreRoom();
            }

        }


    private void exploreRoom() {
        System.out.println("Current room: "+currentRoom);
        System.out.println("You see these doors: ");
        Room[] currentConnectingRooms = currentRoom.getConnectingRooms();
        int roomCount = 0;
        for(Room room : currentRoom.getConnectingRooms()) {
            if(room != null) {
                System.out.println(roomCount + " " + room.getRoomName());
                roomCount++;
            }
        }

        System.out.println("Move to next room? (enter index): ");
        int roomIndex = scanner.nextInt();
        scanner.nextLine();

        if(roomIndex >= 0 && roomIndex < roomCount) {
            currentRoom = currentConnectingRooms[roomIndex];
            System.out.println("You moved to "+currentRoom.getRoomName());
        } else {
            System.out.println("Error with input");
        }






    }
    //--------------------------------------------------------

    //--------------------------------------------------------
}
