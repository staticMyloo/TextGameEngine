package graph_components;

public class Edge {

    private final String id;
    private final Room startRoom;
    private final Room endRoom;

    public Edge(String id, Room startRoom, Room endRoom) {
        this.id = id;
        this.startRoom = startRoom;
        this.endRoom = endRoom;
    }

    public Edge() {
        this.id = null;
        this.startRoom = null;
        this.endRoom = null;
    }

    public String getId() {
        return this.id;
    }

    public Room getStartRoom() {
        return this.startRoom;
    }

    public Room getEndRoom() {
        return this.endRoom;
    }

    @Override
    public String toString() {
        return id + " " + startRoom + " " + endRoom;
    }

}
