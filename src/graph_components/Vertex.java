package graph_components;

import openable.TreasureChest;
import openable.WarChest;

import java.util.ArrayList;

public class Vertex {

    private final String id;
    private final String name;
    private ArrayList<Edge> adjacentEdges = null;
    private TreasureChest treasureChest;
    private WarChest warChest = null;


    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
        this.adjacentEdges = new ArrayList<>();
        this.treasureChest = null;
        this.warChest = null;
    }

    public Vertex(String id, String name, WarChest warChest) {
        this.id = id;
        this.name = name;
        this.warChest = warChest;
    }

    public Vertex(String id, String name, TreasureChest treasureChest) {
        this.id = id;
        this.name = name;
        this.treasureChest = treasureChest;
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
        String room = "";
        room += name;
        if(treasureChest != null) { room += " has a treasure chest"; }

        return room;
    }

}
