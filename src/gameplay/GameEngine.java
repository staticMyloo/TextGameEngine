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
        World world = ReadWorldDataFile.basicWorld();
        Player playerOne = new Player("Sir Kendric",1000,50);
        world.play(playerOne);
    }
}
