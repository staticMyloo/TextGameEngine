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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, ID=16, WS=17, 
		NEWLINE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "STRING", "ID", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MAP'", "'['", "']'", "'VERTICES'", "'EDGES'", "'VERTEX'", "'ID'", 
			"'='", "','", "'NAME'", "'TREASURE_CHEST'", "'EDGE'", "'START'", "'END'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "ID", "WS", "NEWLINE"
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
		"\u0004\u0000\u0012\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000ep\b\u000e\n\u000e"+
		"\f\u000es\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005"+
		"\u000fy\b\u000f\n\u000f\f\u000f|\t\u000f\u0001\u0010\u0004\u0010\u007f"+
		"\b\u0010\u000b\u0010\f\u0010\u0080\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0003\u0011\u0086\b\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0003\u0000\n\n\r\r"+
		"\"\"\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000\t\n\r\r  \u008c\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007"+
		"-\u0001\u0000\u0000\u0000\t6\u0001\u0000\u0000\u0000\u000b<\u0001\u0000"+
		"\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000fF\u0001\u0000\u0000\u0000"+
		"\u0011H\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015O"+
		"\u0001\u0000\u0000\u0000\u0017^\u0001\u0000\u0000\u0000\u0019c\u0001\u0000"+
		"\u0000\u0000\u001bi\u0001\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000"+
		"\u001fv\u0001\u0000\u0000\u0000!~\u0001\u0000\u0000\u0000#\u0085\u0001"+
		"\u0000\u0000\u0000%&\u0005M\u0000\u0000&\'\u0005A\u0000\u0000\'(\u0005"+
		"P\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005[\u0000\u0000*\u0004"+
		"\u0001\u0000\u0000\u0000+,\u0005]\u0000\u0000,\u0006\u0001\u0000\u0000"+
		"\u0000-.\u0005V\u0000\u0000./\u0005E\u0000\u0000/0\u0005R\u0000\u0000"+
		"01\u0005T\u0000\u000012\u0005I\u0000\u000023\u0005C\u0000\u000034\u0005"+
		"E\u0000\u000045\u0005S\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005"+
		"E\u0000\u000078\u0005D\u0000\u000089\u0005G\u0000\u00009:\u0005E\u0000"+
		"\u0000:;\u0005S\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005V\u0000"+
		"\u0000=>\u0005E\u0000\u0000>?\u0005R\u0000\u0000?@\u0005T\u0000\u0000"+
		"@A\u0005E\u0000\u0000AB\u0005X\u0000\u0000B\f\u0001\u0000\u0000\u0000"+
		"CD\u0005I\u0000\u0000DE\u0005D\u0000\u0000E\u000e\u0001\u0000\u0000\u0000"+
		"FG\u0005=\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HI\u0005,\u0000\u0000"+
		"I\u0012\u0001\u0000\u0000\u0000JK\u0005N\u0000\u0000KL\u0005A\u0000\u0000"+
		"LM\u0005M\u0000\u0000MN\u0005E\u0000\u0000N\u0014\u0001\u0000\u0000\u0000"+
		"OP\u0005T\u0000\u0000PQ\u0005R\u0000\u0000QR\u0005E\u0000\u0000RS\u0005"+
		"A\u0000\u0000ST\u0005S\u0000\u0000TU\u0005U\u0000\u0000UV\u0005R\u0000"+
		"\u0000VW\u0005E\u0000\u0000WX\u0005_\u0000\u0000XY\u0005C\u0000\u0000"+
		"YZ\u0005H\u0000\u0000Z[\u0005E\u0000\u0000[\\\u0005S\u0000\u0000\\]\u0005"+
		"T\u0000\u0000]\u0016\u0001\u0000\u0000\u0000^_\u0005E\u0000\u0000_`\u0005"+
		"D\u0000\u0000`a\u0005G\u0000\u0000ab\u0005E\u0000\u0000b\u0018\u0001\u0000"+
		"\u0000\u0000cd\u0005S\u0000\u0000de\u0005T\u0000\u0000ef\u0005A\u0000"+
		"\u0000fg\u0005R\u0000\u0000gh\u0005T\u0000\u0000h\u001a\u0001\u0000\u0000"+
		"\u0000ij\u0005E\u0000\u0000jk\u0005N\u0000\u0000kl\u0005D\u0000\u0000"+
		"l\u001c\u0001\u0000\u0000\u0000mq\u0005\"\u0000\u0000np\b\u0000\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tu\u0005\"\u0000\u0000u\u001e\u0001\u0000\u0000\u0000"+
		"vz\u0007\u0001\u0000\u0000wy\u0007\u0002\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{ \u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f"+
		"\u0007\u0003\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0006\u0010\u0000"+
		"\u0000\u0083\"\u0001\u0000\u0000\u0000\u0084\u0086\u0005\r\u0000\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005\n\u0000\u0000\u0088"+
		"$\u0001\u0000\u0000\u0000\u0005\u0000qz\u0080\u0085\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}