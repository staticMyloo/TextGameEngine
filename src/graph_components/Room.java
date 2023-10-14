package graph_components;

import structure.*;

import java.util.ArrayList;

public class Room extends Entity {

    private ArrayList<Edge> adjacentEdges = null;
    private Inventory roomItems;
    private Room[] connectingRooms;
    private String roomName;
    private final int MAX_ROOM_SIZE = 4;
    private boolean endRoom = false;
    private ArrayList<Monster> monsters;

    public Room(String id) {
        super(id);
        this.adjacentEdges = new ArrayList<>();
    }

    public Room(String description, String roomName, Inventory roomItems, Room[] connectingRooms) {
        super(description);
        this.roomName = roomName;
        this.roomItems = roomItems;
        this.connectingRooms = connectingRooms;
        this.monsters = new ArrayList<>(1);
    }

    public boolean isEndRoom() {
        return this.endRoom;
    }
    public ArrayList<Monster> getMonsters() {
        return this.monsters;
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


    public void addItemInRoom(Pickup pickup) {
        this.roomItems.add(pickup);
    }

    public Room[] getConnectingRooms() {
        return connectingRooms;
    }
    public void spawnTreasureChest(TreasureChest chest) {
        this.roomItems.add(chest);
    }

    public void spawnWarChest(WarChest chest) {
        this.roomItems.add(chest);
    }
    public ArrayList<Edge> getAdjacentEdges() {
        return this.adjacentEdges;
    }

    public Inventory getRoomItems() {
        return this.roomItems;
    }

    @Override
    public String toString() {
        return roomName;
    }


}
