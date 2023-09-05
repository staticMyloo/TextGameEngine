package graph_components;
import gamemap_grammar.GameMapBaseVisitor;
import gamemap_grammar.GameMapParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GraphBuilder extends GameMapBaseVisitor<Vertex> {

    private final Graph graph = new Graph();

    @Override
    public Vertex visitGamemap(GameMapParser.GamemapContext ctx) {
        return super.visitGamemap(ctx);
    }

    @Override
    public Vertex visitVertexList(GameMapParser.VertexListContext ctx) {
        for (ParseTree tree : ctx.children) {
            visit(tree);
        }
        //Suppress warning for return
        return null;
    }

    @Override
    public Vertex visitEdgeList(GameMapParser.EdgeListContext ctx) {
        for (ParseTree tree : ctx.children) {
            visit(tree);
        }
        //Suppress warning for return
        return null;
    }

    @Override
    public Vertex visitVertex(GameMapParser.VertexContext ctx) {
        String id = ctx.ID().getText();
        String name = ctx.STRING().getText();
        // Removing quotes from the string
        name = name.substring(1, name.length() - 1);
        Vertex vertex = new Vertex(id, name);
        graph.addVertex(vertex);
        return vertex;
    }

    @Override
    public Vertex visitEdge(GameMapParser.EdgeContext ctx) {
        String id = ctx.ID(0).getText();
        String start = ctx.ID(1).getText();
        String end = ctx.ID(2).getText();

        Vertex startV = graph.getVertex(start);
        Vertex endV = graph.getVertex(end);

        if(startV == null | endV == null) {
            throw new IllegalArgumentException("Invalid edge: source or destination vertex does not exist");
        }

        Edge newEdge = new Edge(id, startV, endV);
        graph.addEdge(newEdge);
        return null;
    }

    public Graph getGraph() {
        return graph;
    }
}
