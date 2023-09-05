package graph_components;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {

    private final HashMap<String, Vertex> vertices;
    private final HashMap<String, Edge> edges;


    public Graph() {
        this.vertices = new HashMap<>();
        this.edges = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        vertices.put(v.getId(), v);
    }

    public void addEdge(Edge e) {
        edges.put(e.getId(), e);
    }

    public Vertex getVertex(String id) {
        return vertices.get(id);
    }

    public Edge getEdge(String id) {
        return edges.get(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Graph [\n");

        // Append vertices
        sb.append("  Vertices: [\n");
        for (Vertex vertex : vertices.values()) {
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

    public HashMap<String, Vertex> getVertices() {
        return this.vertices;
    }

    public HashMap<String, Edge> getEdges() {
        return edges;
    }
}

