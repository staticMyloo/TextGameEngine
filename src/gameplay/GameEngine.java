package gameplay;

import gamemap_grammar.GameMapLexer;
import gamemap_grammar.GameMapParser;
import graph_components.GraphBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class GameEngine
{

    public static void main(String[] args)
    {
        //read the World object instance from a text file or literal
        //World world = ReadWorldDataFile.basicWorld();

        //Player playerOne = new Player("Sir Kendric",100,50);
        //world.play(playerOne);
        GameMapLexer lexer = new GameMapLexer(CharStreams.fromString("MAP [\n" +
                "    VERTICES [\n" +
                "        VERTEX [ ID = room1 , NAME = \"room1\" ]\n" +
                "        VERTEX [ ID = room2 , NAME = \"room2\" , TREASURE_CHEST = [ axe ] ]\n" +
                "    ]\n" +
                "    EDGES [\n" +
                "        EDGE [ ID = edge1 , START = room1, END = room2 ]\n" +
                "    ]\n" +
                "]"));

        GameMapParser parser = new GameMapParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.gamemap();
        GraphBuilder gb = new GraphBuilder();
        gb.visit(tree);

        System.out.println(gb.getGraph());


    }

}
