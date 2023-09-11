package gameplay;

import gamemap_grammar.GameMapLexer;
import gamemap_grammar.GameMapParser;
import gameplay.World;
import graph_components.GraphBuilder;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ReadWorldDataFile
{

/**
 * Static method to read a text file containing
 * a basic World to be played by the Game Engine
 *
 * */
    public static World basicWorld()
    {
        GameMapLexer lexer = new GameMapLexer(CharStreams.fromString("MAP [\n" +
                "    ROOMS [\n" +
                "        ROOM [ DESC = room1 , ROOM_ITEMS = [ Bread ] ]\n" +
                "        ROOM [ DESC = room2 , TREASURE_CHEST = [ Jewel ] ]\n" +
                "        ROOM [ DESC = room3 , WAR_CHEST = [ Sword ] ]\n" +
                "        ROOM [ DESC = room4 ]\n" +
                "        ROOM [ DESC = room5]\n" +
                "        ROOM [ DESC = room6]\n" +
                "        ROOM [ DESC = room7]\n" +
                "        ROOM [ DESC = room8]\n" +
                "        ROOM [ DESC = room9]\n" +
                "        ROOM [ DESC = room10]\n" +
                "        ROOM [ DESC = room11 , END_ROOM = true ]\n" +
                "    ]\n" +
                "    EDGES [\n" +
                "        EDGE [ ID = edge1 , START = room1, END = room3 ]\n" +
                "        EDGE [ ID = edge2 , START = room3, END = room2 ]\n" +
                "        EDGE [ ID = edge3 , START = room3, END = room4 ]\n" +
                "        EDGE [ ID = edge4 , START = room2, END = room5 ]\n" +
                "        EDGE [ ID = edge5 , START = room3, END = room6 ]\n" +
                "        EDGE [ ID = edge6 , START = room4, END = room7 ]\n" +
                "        EDGE [ ID = edge7 , START = room5, END = room8 ]\n" +
                "        EDGE [ ID = edge8 , START = room5, END = room6 ]\n" +
                "        EDGE [ ID = edge9 , START = room6, END = room9 ]\n" +
                "        EDGE [ ID = edge10 , START = room6, END = room7 ]\n" +
                "        EDGE [ ID = edge11 , START = room7, END = room10 ]\n" +
                "        EDGE [ ID = edge12 , START = room8, END = room9 ]\n" +
                "        EDGE [ ID = edge13 , START = room9, END = room10 ]\n" +
                "        EDGE [ ID = edge14 , START = room9, END = room11 ]\n" +
                "    ]\n" +
                "]"));

        GameMapParser parser = new GameMapParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.gamemap();
        GraphBuilder gb = new GraphBuilder();
        gb.visit(tree);
        gb.getGraph().addAdjacentRooms();

        return new World(gb.getGraph());
    }
}
