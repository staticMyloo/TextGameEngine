package gameplay;

import gamemap_grammar.GameMapLexer;
import gamemap_grammar.GameMapParser;
import gameplay.World;
import graph_components.GraphBuilder;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;

public class ReadWorldDataFile
{

/**
 * Static method to read a text file containing
 * a basic World to be played by the Game Engine
 *
 * */
    public static World basicWorld()
    {
        StringBuilder gameData = new StringBuilder();

        try {
            InputStream inputStream = ReadWorldDataFile.class.getResourceAsStream("/game_files/gameworlddata.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            String fileLine;
            while ((fileLine = br.readLine()) != null) {
                gameData.append(fileLine).append("\n");
            }

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        GameMapLexer lexer = new GameMapLexer(CharStreams.fromString(gameData.toString()));
        GameMapParser parser = new GameMapParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.gamemap();
        GraphBuilder gb = new GraphBuilder();
        gb.visit(tree);
        gb.getGraph().addAdjacentRooms();

        return new World(gb.getGraph());
    }
}
