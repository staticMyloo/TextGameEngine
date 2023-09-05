package graph_components;

import java.util.ArrayList;

public class Vertex {
    private final String id;
    private final String name;
    private final ArrayList<Edge> adjacentEdges;

    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
        this.adjacentEdges = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addEdge(Edge edge) {
        this.adjacentEdges.add(edge);
    }

    public ArrayList<Edge> getAdjacentEdges() {
        return this.adjacentEdges;
    }

    @Override
    public String toString() {
        return name;
    }

}
