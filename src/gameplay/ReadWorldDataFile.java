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
//        GameMapLexer lexer = new GameMapLexer(CharStreams.fromString("MAP [\n" +
//                "    ROOMS [\n" +
//                "        ROOM [ ID = room1 , NAME = \"Chamber of Echoes\" , DESC = \"You find yourself in a dimly lit chamber.. The ancient stone walls echo stories of old...\" , ROOM_ITEMS = [ Bread , LockPick ] ]\n" +
//                "        ROOM [ ID = room2 , NAME = \"Garden of Secrets\" , DESC = \"Vines and leaves cover the walls.. are they moving?\" , TREASURE_CHEST = [ Jewel ] ]\n" +
//                "        ROOM [ ID = room3 , NAME = \"Shadow Armory\" , DESC = \"Empty chests and shattered armour are amongst the rubble...\" , WAR_CHEST = [ Sword ] ]\n" +
//                "        ROOM [ ID = room4 , NAME = \"Halls of Laughter\" , DESC = \"Sound seems to travel further than normal... is that you talking?\" ]\n" +
//                "        ROOM [ ID = room5 , NAME = \"Treasure Trove\" , DESC = \"The bright room makes you squint.. golden walls shine brightly...\" , ROOM_ITEMS = [ Goldbars ] ]\n" +
//                "        ROOM [ ID = room6 , NAME = \"Corridor of Reflection\" , DESC = \"Mirrors cover the walls... each one reflects you differently...\" , WAR_CHEST = [ Axe ] ]\n" +
//                "        ROOM [ ID = room7 , NAME = \"Beast's Lair\" , DESC = \"A large cavernous area with scratch marks everywhere. The air feels heavy...\" , ROOM_ITEMS = [ Chalice , RoastBoar ] ]\n" +
//                "        ROOM [ ID = room8 , NAME = \"Azure Library\" , DESC = \"Shelves upon shelves of ancient tomes, some floating in the air...\" , ROOM_ITEMS = [ RoastBoar ] ]\n" +
//                "        ROOM [ ID = room9 , NAME = \"Crimson Laboratory\" , DESC = \"The remnants of an alchemist's playground.. some vials are still filled with bubbling liquid...\" ]\n" +
//                "        ROOM [ ID = room10, NAME = \"Balcony of Ponder\" , DESC = \"Open to the night sky... You can see stars you've never seen before...\" ]\n" +
//                "        ROOM [ ID = room11 ,NAME = \"Throne of the End\" , DESC = \"A giant throne shadows the room.. you shouldn't be here...\" , END_ROOM = true ]\n" +
//                "    ]\n" +
//                "    EDGES [\n" +
//                "        EDGE [ ID = edge1 , START = room1, END = room3 ]\n" +
//                "        EDGE [ ID = edge2 , START = room3, END = room2 ]\n" +
//                "        EDGE [ ID = edge3 , START = room3, END = room4 ]\n" +
//                "        EDGE [ ID = edge4 , START = room2, END = room5 ]\n" +
//                "        EDGE [ ID = edge5 , START = room3, END = room6 ]\n" +
//                "        EDGE [ ID = edge6 , START = room4, END = room7 ]\n" +
//                "        EDGE [ ID = edge7 , START = room5, END = room8 ]\n" +
//                "        EDGE [ ID = edge8 , START = room5, END = room6 ]\n" +
//                "        EDGE [ ID = edge9 , START = room6, END = room9 ]\n" +
//                "        EDGE [ ID = edge10 , START = room6, END = room7 ]\n" +
//                "        EDGE [ ID = edge11 , START = room7, END = room10 ]\n" +
//                "        EDGE [ ID = edge12 , START = room8, END = room9 ]\n" +
//                "        EDGE [ ID = edge13 , START = room9, END = room10 ]\n" +
//                "        EDGE [ ID = edge14 , START = room9, END = room11 ]\n" +
//                "    ]\n" +
//                "]"));

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
