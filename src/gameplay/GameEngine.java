package gameplay;

import gamemap_grammar.GameMapLexer;
import gamemap_grammar.GameMapParser;
import graph_components.GraphBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import structure.Player;

public class GameEngine
{

    public static void main(String[] args)
    {
        //read the World object instance from a text file or literal
        //World world = ReadWorldDataFile.basicWorld();

        Player playerOne = new Player("Sir Kendric",100,50);
        //world.play(playerOne);
        System.out.println(playerOne.getInventory().getItems());
        GameMapLexer lexer = new GameMapLexer(CharStreams.fromString("MAP [\n" +
                "    ROOMS [\n" +
                "        ROOM [ DESC = room1 ]\n" +
                "        ROOM [ DESC = room2 , TREASURE_CHEST = [ \"axe\" ] ]\n" +
                "    ]\n" +
                "    EDGES [\n" +
                "        EDGE [ ID = edge1 , START = room1, END = room2 ]\n" +
                "    ]\n" +
                "]"));

        GameMapParser parser = new GameMapParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.gamemap();
        GraphBuilder gb = new GraphBuilder();
        gb.visit(tree);
        gb.getGraph().addAdjacentRooms();
        //System.out.println(gb.getGraph().getRoomMap());
        //System.out.println(gb.getGraph().getEdges());
        System.out.println(gb.getGraph());
    }

}
