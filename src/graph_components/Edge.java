package graph_components;

public class Edge {

    private final String id;
    private final Vertex startVertex;
    private final Vertex endVertex;

    public Edge(String id, Vertex startVertex, Vertex endVertex) {
        this.id = id;
        this.startVertex = startVertex;
        this.endVertex = endVertex;
    }

    public Edge() {
        this.id = null;
        this.startVertex = null;
        this.endVertex = null;
    }

    public String getId() {
        return this.id;
    }

    public Vertex getStartVertex() {
        return this.startVertex;
    }

    public Vertex getEndVertex() {
        return this.endVertex;
    }

    @Override
    public String toString() {
        return id + " " + startVertex + " " + endVertex;
    }

}
