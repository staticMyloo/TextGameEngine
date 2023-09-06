package structure;

import java.util.ArrayList;

public class Room extends Entity {

    private Room[] rooms;
    private Inventory roomItems;
    private ArrayList<Monster> monsters;


    public Room(String description) {
        super(description);
    }

    public Room(String description, Inventory roomItems, Room[] adjacentRooms) {
        super(description);
        this.roomItems = null;
        this.rooms = null;
    }
}
