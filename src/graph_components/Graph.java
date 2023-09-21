package graph_components;

import java.util.HashMap;

public class Graph {

    private final HashMap<String, Room> roomMap;
    private final HashMap<String, Edge> edges;

    public Graph() {
        this.roomMap = new HashMap<>();
        this.edges = new HashMap<>();
    }

    public void addRoom(Room room) {
        roomMap.put(room.getId(), room);
    }

    public void addAdjacentRooms() {
        for(Edge edge : edges.values()) {
            Room start = edge.getStartRoom();
            Room end = edge.getEndRoom();

            start.addAdjacentRoom(end);
            end.addAdjacentRoom(start);
        }
    }

    public void addEdge(Edge e) {
        edges.put(e.getId(), e);
    }

    public Room getRoom(String name) {
        return roomMap.get(name);
    }

    public Edge getEdge(String id) {
        return edges.get(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Graph [\n");

        // Append vertices
        sb.append("  Rooms: [\n");
        for (Room vertex : roomMap.values()) {
            sb.append("    ").append(vertex.toString()).append(",\n");
        }
        sb.append("  ],\n");

        // Append edges
        sb.append("  Edges: [\n");
        for (Edge edge : edges.values()) {
            sb.append("    ").append(edge.toString()).append(",\n");
        }
        sb.append("  ]\n");

        sb.append("]");

        return sb.toString();
    }

    public HashMap<String, Room> getRoomMap() {
        return this.roomMap;
    }

    public HashMap<String, Edge> getEdges() {
        return edges;
    }
}

