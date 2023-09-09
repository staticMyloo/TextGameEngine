// Generated from C:/Users/myles/Desktop/TextGameEngine/src\GameMap.g4 by ANTLR 4.12.0
package gamemap_grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GameMapLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, CHEST=17, 
		WAR_ITEM=18, TREASURE_ITEM=19, STRING=20, END_ROOM=21, ID=22, WS=23, NEWLINE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "CHEST", 
			"WAR_ITEM", "TREASURE_ITEM", "STRING", "END_ROOM", "ID", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MAP'", "'['", "']'", "'ROOMS'", "'EDGES'", "'ROOM'", "'DESC'", 
			"'='", "','", "'TREASURE_CHEST'", "'WAR_CHEST'", "'END_ROOM'", "'EDGE'", 
			"'ID'", "'START'", "'END'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "CHEST", "WAR_ITEM", "TREASURE_ITEM", "STRING", 
			"END_ROOM", "ID", "WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GameMapLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GameMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u00e2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u009d\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a7\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ba\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00be\b\u0013\n\u0013\f\u0013\u00c1"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00ce\b\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u00d2\b\u0015"+
		"\n\u0015\f\u0015\u00d5\t\u0015\u0001\u0016\u0004\u0016\u00d8\b\u0016\u000b"+
		"\u0016\f\u0016\u00d9\u0001\u0016\u0001\u0016\u0001\u0017\u0003\u0017\u00df"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0004\u0003"+
		"\u0000\n\n\r\r\"\"\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000\t\n\r"+
		"\r  \u00ea\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u0003"+
		"5\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000\u00079\u0001"+
		"\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000"+
		"\u0000\rJ\u0001\u0000\u0000\u0000\u000fO\u0001\u0000\u0000\u0000\u0011"+
		"Q\u0001\u0000\u0000\u0000\u0013S\u0001\u0000\u0000\u0000\u0015b\u0001"+
		"\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019u\u0001\u0000\u0000"+
		"\u0000\u001bz\u0001\u0000\u0000\u0000\u001d}\u0001\u0000\u0000\u0000\u001f"+
		"\u0083\u0001\u0000\u0000\u0000!\u009c\u0001\u0000\u0000\u0000#\u00a6\u0001"+
		"\u0000\u0000\u0000%\u00b9\u0001\u0000\u0000\u0000\'\u00bb\u0001\u0000"+
		"\u0000\u0000)\u00cd\u0001\u0000\u0000\u0000+\u00cf\u0001\u0000\u0000\u0000"+
		"-\u00d7\u0001\u0000\u0000\u0000/\u00de\u0001\u0000\u0000\u000012\u0005"+
		"M\u0000\u000023\u0005A\u0000\u000034\u0005P\u0000\u00004\u0002\u0001\u0000"+
		"\u0000\u000056\u0005[\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0005"+
		"]\u0000\u00008\u0006\u0001\u0000\u0000\u00009:\u0005R\u0000\u0000:;\u0005"+
		"O\u0000\u0000;<\u0005O\u0000\u0000<=\u0005M\u0000\u0000=>\u0005S\u0000"+
		"\u0000>\b\u0001\u0000\u0000\u0000?@\u0005E\u0000\u0000@A\u0005D\u0000"+
		"\u0000AB\u0005G\u0000\u0000BC\u0005E\u0000\u0000CD\u0005S\u0000\u0000"+
		"D\n\u0001\u0000\u0000\u0000EF\u0005R\u0000\u0000FG\u0005O\u0000\u0000"+
		"GH\u0005O\u0000\u0000HI\u0005M\u0000\u0000I\f\u0001\u0000\u0000\u0000"+
		"JK\u0005D\u0000\u0000KL\u0005E\u0000\u0000LM\u0005S\u0000\u0000MN\u0005"+
		"C\u0000\u0000N\u000e\u0001\u0000\u0000\u0000OP\u0005=\u0000\u0000P\u0010"+
		"\u0001\u0000\u0000\u0000QR\u0005,\u0000\u0000R\u0012\u0001\u0000\u0000"+
		"\u0000ST\u0005T\u0000\u0000TU\u0005R\u0000\u0000UV\u0005E\u0000\u0000"+
		"VW\u0005A\u0000\u0000WX\u0005S\u0000\u0000XY\u0005U\u0000\u0000YZ\u0005"+
		"R\u0000\u0000Z[\u0005E\u0000\u0000[\\\u0005_\u0000\u0000\\]\u0005C\u0000"+
		"\u0000]^\u0005H\u0000\u0000^_\u0005E\u0000\u0000_`\u0005S\u0000\u0000"+
		"`a\u0005T\u0000\u0000a\u0014\u0001\u0000\u0000\u0000bc\u0005W\u0000\u0000"+
		"cd\u0005A\u0000\u0000de\u0005R\u0000\u0000ef\u0005_\u0000\u0000fg\u0005"+
		"C\u0000\u0000gh\u0005H\u0000\u0000hi\u0005E\u0000\u0000ij\u0005S\u0000"+
		"\u0000jk\u0005T\u0000\u0000k\u0016\u0001\u0000\u0000\u0000lm\u0005E\u0000"+
		"\u0000mn\u0005N\u0000\u0000no\u0005D\u0000\u0000op\u0005_\u0000\u0000"+
		"pq\u0005R\u0000\u0000qr\u0005O\u0000\u0000rs\u0005O\u0000\u0000st\u0005"+
		"M\u0000\u0000t\u0018\u0001\u0000\u0000\u0000uv\u0005E\u0000\u0000vw\u0005"+
		"D\u0000\u0000wx\u0005G\u0000\u0000xy\u0005E\u0000\u0000y\u001a\u0001\u0000"+
		"\u0000\u0000z{\u0005I\u0000\u0000{|\u0005D\u0000\u0000|\u001c\u0001\u0000"+
		"\u0000\u0000}~\u0005S\u0000\u0000~\u007f\u0005T\u0000\u0000\u007f\u0080"+
		"\u0005A\u0000\u0000\u0080\u0081\u0005R\u0000\u0000\u0081\u0082\u0005T"+
		"\u0000\u0000\u0082\u001e\u0001\u0000\u0000\u0000\u0083\u0084\u0005E\u0000"+
		"\u0000\u0084\u0085\u0005N\u0000\u0000\u0085\u0086\u0005D\u0000\u0000\u0086"+
		" \u0001\u0000\u0000\u0000\u0087\u0088\u0005W\u0000\u0000\u0088\u0089\u0005"+
		"a\u0000\u0000\u0089\u008a\u0005r\u0000\u0000\u008a\u008b\u0005C\u0000"+
		"\u0000\u008b\u008c\u0005h\u0000\u0000\u008c\u008d\u0005e\u0000\u0000\u008d"+
		"\u008e\u0005s\u0000\u0000\u008e\u009d\u0005t\u0000\u0000\u008f\u0090\u0005"+
		"T\u0000\u0000\u0090\u0091\u0005r\u0000\u0000\u0091\u0092\u0005e\u0000"+
		"\u0000\u0092\u0093\u0005a\u0000\u0000\u0093\u0094\u0005s\u0000\u0000\u0094"+
		"\u0095\u0005u\u0000\u0000\u0095\u0096\u0005r\u0000\u0000\u0096\u0097\u0005"+
		"e\u0000\u0000\u0097\u0098\u0005C\u0000\u0000\u0098\u0099\u0005h\u0000"+
		"\u0000\u0099\u009a\u0005e\u0000\u0000\u009a\u009b\u0005s\u0000\u0000\u009b"+
		"\u009d\u0005t\u0000\u0000\u009c\u0087\u0001\u0000\u0000\u0000\u009c\u008f"+
		"\u0001\u0000\u0000\u0000\u009d\"\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		"A\u0000\u0000\u009f\u00a0\u0005x\u0000\u0000\u00a0\u00a7\u0005e\u0000"+
		"\u0000\u00a1\u00a2\u0005S\u0000\u0000\u00a2\u00a3\u0005w\u0000\u0000\u00a3"+
		"\u00a4\u0005o\u0000\u0000\u00a4\u00a5\u0005r\u0000\u0000\u00a5\u00a7\u0005"+
		"d\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a7$\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005R\u0000\u0000"+
		"\u00a9\u00aa\u0005i\u0000\u0000\u00aa\u00ab\u0005n\u0000\u0000\u00ab\u00ba"+
		"\u0005g\u0000\u0000\u00ac\u00ad\u0005J\u0000\u0000\u00ad\u00ae\u0005e"+
		"\u0000\u0000\u00ae\u00af\u0005w\u0000\u0000\u00af\u00b0\u0005e\u0000\u0000"+
		"\u00b0\u00ba\u0005l\u0000\u0000\u00b1\u00b2\u0005G\u0000\u0000\u00b2\u00b3"+
		"\u0005o\u0000\u0000\u00b3\u00b4\u0005l\u0000\u0000\u00b4\u00b5\u0005d"+
		"\u0000\u0000\u00b5\u00b6\u0005b\u0000\u0000\u00b6\u00b7\u0005a\u0000\u0000"+
		"\u00b7\u00b8\u0005r\u0000\u0000\u00b8\u00ba\u0005s\u0000\u0000\u00b9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ac\u0001\u0000\u0000\u0000\u00b9\u00b1"+
		"\u0001\u0000\u0000\u0000\u00ba&\u0001\u0000\u0000\u0000\u00bb\u00bf\u0005"+
		"\"\u0000\u0000\u00bc\u00be\b\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\"\u0000"+
		"\u0000\u00c3(\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005t\u0000\u0000\u00c5"+
		"\u00c6\u0005r\u0000\u0000\u00c6\u00c7\u0005u\u0000\u0000\u00c7\u00ce\u0005"+
		"e\u0000\u0000\u00c8\u00c9\u0005f\u0000\u0000\u00c9\u00ca\u0005a\u0000"+
		"\u0000\u00ca\u00cb\u0005l\u0000\u0000\u00cb\u00cc\u0005s\u0000\u0000\u00cc"+
		"\u00ce\u0005e\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000\u00cd\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ce*\u0001\u0000\u0000\u0000\u00cf\u00d3\u0007"+
		"\u0001\u0000\u0000\u00d0\u00d2\u0007\u0002\u0000\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4,\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8\u0007\u0003"+
		"\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0006\u0016"+
		"\u0000\u0000\u00dc.\u0001\u0000\u0000\u0000\u00dd\u00df\u0005\r\u0000"+
		"\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\n\u0000\u0000"+
		"\u00e10\u0001\u0000\u0000\u0000\t\u0000\u009c\u00a6\u00b9\u00bf\u00cd"+
		"\u00d3\u00d9\u00de\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}