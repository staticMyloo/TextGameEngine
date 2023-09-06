package graph_components;
import gamemap_grammar.GameMapBaseVisitor;
import gamemap_grammar.GameMapParser;
import structure.Inventory;
import structure.TreasureChest;
import org.antlr.v4.runtime.tree.ParseTree;

public class GraphBuilder extends GameMapBaseVisitor<Room> {

    private final Graph graph = new Graph();

    @Override
    public Room visitGamemap(GameMapParser.GamemapContext ctx) {
        return super.visitGamemap(ctx);
    }

    @Override
    public Room visitRoomList(GameMapParser.RoomListContext ctx) {
        for (ParseTree tree : ctx.children) {
            visit(tree);
        }
        //Suppress warning for return
        return null;
    }

    @Override
    public Room visitEdgeList(GameMapParser.EdgeListContext ctx) {
        for (ParseTree tree : ctx.children) {
            visit(tree);
        }
        //Suppress warning for return
        return null;
    }

    @Override
    public Room visitRoom(GameMapParser.RoomContext ctx) {
        String desc = ctx.roomName().getText();
        System.out.println(desc);
        Room room = new Room(desc, new Inventory(), new Room[4]);

        GameMapParser.TreasureItemContext treasureItemContext = ctx.treasureItem();
        if(treasureItemContext != null) {
            room.spawnTreasureChest(new TreasureChest("Treasure Chest"));
        }

        graph.addRoom(room);

        return room;
    }

    @Override
    public Room visitEdge(GameMapParser.EdgeContext ctx) {
        String id = ctx.ID(0).getText();
        String start = ctx.ID(1).getText();
        String end = ctx.ID(2).getText();
        System.out.println(graph.getRoomMap());
        Room startR = graph.getRoom(start);
        Room endR = graph.getRoom(end);

        if(startR == null | endR == null) {
            throw new IllegalArgumentException("Invalid edge: source or destination vertex does not exist");
        }

        Edge newEdge = new Edge(id, startR, endR);
        graph.addEdge(newEdge);
        return null;
    }

    public Graph getGraph() {
        return graph;
    }
}
