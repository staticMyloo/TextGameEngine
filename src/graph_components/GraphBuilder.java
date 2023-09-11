package graph_components;
import gamemap_grammar.GameMapBaseVisitor;
import gamemap_grammar.GameMapParser;
import structure.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

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
        Room room = new Room(desc, new Inventory(), new Room[4]);
        if(ctx.END_ROOM() != null) {
            room.setEndRoom();
        }

        GameMapParser.TreasureItemContext treasureItemContext = ctx.treasureItem();
        if(treasureItemContext != null) {
            List<GameMapParser.PickupContext> pickups = treasureItemContext.pickup();
            Pickup[] pickupArray = new Pickup[pickups.size()];
            for (int i = 0; i < pickups.size(); i++) {
                String itemType = pickups.get(i).TREASURE_ITEM().getText();
                pickupArray[i] = (Pickup) createNewItem(itemType);
            }
            room.spawnTreasureChest(new TreasureChest("TreasureChest", pickupArray));
        }

        GameMapParser.WieldableContext wieldableContext = ctx.wieldable();
        if(wieldableContext != null) {
            List<GameMapParser.PickupContext> pickups = wieldableContext.pickup();
            Pickup[] pickupArray = new Pickup[pickups.size()];
            for (int i = 0; i < pickups.size(); i++) {
                String itemType = pickups.get(i).WAR_ITEM().getText();
                pickupArray[i] = (Pickup) createNewItem(itemType);
            }
            room.spawnWarChest(new WarChest("WarChest", pickupArray));
        }

        GameMapParser.PickupContext pickupContext = ctx.pickup();
        if(pickupContext != null) {
            String itemType = pickupContext.getText();
            System.out.println(itemType);
            Pickup pickup = createNewItem(itemType);
            room.addItemInRoom(pickup);
        }

        graph.addRoom(room);

        return room;
    }

    @Override
    public Room visitEdge(GameMapParser.EdgeContext ctx) {
        String id = ctx.ID(0).getText();
        String start = ctx.ID(1).getText();
        String end = ctx.ID(2).getText();
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

    private Pickup createNewItem(String item) {
        return switch (item) {
            //Food Pickups
            case "Bread" -> new Bread(item, 10);
            case "Mead" -> new Mead(item, 15);
            case "RoastBoar" -> new RoastBoar(item, 20);
            //Valuable Pickups
            case "Chalice" -> new Chalice(item, 20);
            case "Coin" -> new Coin(item, 2);
            case "Gold bars" -> new Goldbars(item, 7);
            case "Jewel" -> new Jewel(item, 10);
            case "Money Bag" -> new MoneyBag(item, 10);
            case "Ring" -> new Ring(item, 5);
            //Weapon pickups
            case "Sword" -> new Sword(item, 5, 10);
            case "Axe" -> new Axe(item, 7, 12);
            default -> null;
        };
    }
}
