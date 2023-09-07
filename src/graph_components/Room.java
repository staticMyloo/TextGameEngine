package graph_components;

import structure.Entity;
import structure.Inventory;
import structure.TreasureChest;
import structure.WarChest;

import java.util.ArrayList;

public class Room extends Entity {

    private ArrayList<Edge> adjacentEdges = null;
    private TreasureChest treasureChest;
    private WarChest warChest = null;
    private Inventory roomItems;
    private Room[] connectingRooms;
    private String roomName;
    private final int MAX_ROOM_SIZE = 4;
    private boolean endRoom = false;

    public Room(String id) {
        super(id);
        this.adjacentEdges = new ArrayList<>();
        this.treasureChest = null;
        this.warChest = null;
    }

    public Room(String roomName, Inventory roomItems, Room[] connectingRooms) {
        super(roomName);
        this.roomName = roomName;
        this.roomItems = roomItems;
        this.connectingRooms = connectingRooms;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public void addEdge(Edge edge) {
        this.adjacentEdges.add(edge);
    }

    public void setEndRoom() {
        this.endRoom = true;
    }
    public void addAdjacentRoom(Room room) {
        if(connectingRooms == null) {
            connectingRooms = new Room[MAX_ROOM_SIZE];
        }

        for(int i = 0; i < MAX_ROOM_SIZE; i++) {
            if(connectingRooms[i] == null) {
                connectingRooms[i] = room;
                break;
            }
        }

    }

    public Room[] getConnectingRooms() {
        return connectingRooms;
    }
    public void spawnTreasureChest(TreasureChest chest) {
        this.treasureChest = chest;
    }

    public void spawnWarChest(WarChest chest) {
        this.warChest = chest;
    }
    public ArrayList<Edge> getAdjacentEdges() {
        return this.adjacentEdges;
    }

    @Override
    public String toString() {
        StringBuilder room = new StringBuilder();
        room.append(getRoomName());

        if(connectingRooms != null) {
            room.append(" -> [");
            for (Room r : connectingRooms) {
                if (r != null) {
                    room.append(r.getRoomName()).append(", ");
                }
            }
            room.append("]");
        }
        if(endRoom) {
            room.append("End Room");
        }
        if (treasureChest != null) {
            room.append(treasureChest);
        }
        if(warChest !=null) {
            room.append(warChest);
        }

        return room.toString();
    }


}
