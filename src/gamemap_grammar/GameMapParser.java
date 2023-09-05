// Generated from C:/Users/myles/Desktop/TextGameEngine/src\GameMap.g4 by ANTLR 4.12.0
package gamemap_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GameMapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, ID=15, WS=16, NEWLINE=17;
	public static final int
		RULE_gamemap = 0, RULE_vertexList = 1, RULE_edgeList = 2, RULE_vertex = 3, 
		RULE_edge = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"gamemap", "vertexList", "edgeList", "vertex", "edge"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MAP'", "'['", "']'", "'VERTICES'", "'EDGES'", "'VERTEX'", "'ID'", 
			"'='", "','", "'NAME'", "'EDGE'", "'START'", "'END'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "ID", "WS", "NEWLINE"
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

	@Override
	public String getGrammarFileName() { return "GameMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameMapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GamemapContext extends ParserRuleContext {
		public VertexListContext vertexList() {
			return getRuleContext(VertexListContext.class,0);
		}
		public EdgeListContext edgeList() {
			return getRuleContext(EdgeListContext.class,0);
		}
		public GamemapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gamemap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterGamemap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitGamemap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitGamemap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GamemapContext gamemap() throws RecognitionException {
		GamemapContext _localctx = new GamemapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gamemap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			match(T__1);
			setState(12);
			vertexList();
			setState(13);
			edgeList();
			setState(14);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VertexListContext extends ParserRuleContext {
		public List<VertexContext> vertex() {
			return getRuleContexts(VertexContext.class);
		}
		public VertexContext vertex(int i) {
			return getRuleContext(VertexContext.class,i);
		}
		public VertexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertexList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterVertexList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitVertexList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitVertexList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VertexListContext vertexList() throws RecognitionException {
		VertexListContext _localctx = new VertexListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vertexList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__3);
			setState(17);
			match(T__1);
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				vertex();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(23);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EdgeListContext extends ParserRuleContext {
		public List<EdgeContext> edge() {
			return getRuleContexts(EdgeContext.class);
		}
		public EdgeContext edge(int i) {
			return getRuleContext(EdgeContext.class,i);
		}
		public EdgeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterEdgeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitEdgeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitEdgeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeListContext edgeList() throws RecognitionException {
		EdgeListContext _localctx = new EdgeListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_edgeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__4);
			setState(26);
			match(T__1);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				edge();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
			setState(32);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VertexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public TerminalNode STRING() { return getToken(GameMapParser.STRING, 0); }
		public VertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterVertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitVertex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitVertex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VertexContext vertex() throws RecognitionException {
		VertexContext _localctx = new VertexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__5);
			setState(35);
			match(T__1);
			setState(36);
			match(T__6);
			setState(37);
			match(T__7);
			setState(38);
			match(ID);
			setState(39);
			match(T__8);
			setState(40);
			match(T__9);
			setState(41);
			match(T__7);
			setState(42);
			match(STRING);
			setState(43);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EdgeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GameMapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameMapParser.ID, i);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__10);
			setState(46);
			match(T__1);
			setState(47);
			match(T__6);
			setState(48);
			match(T__7);
			setState(49);
			match(ID);
			setState(50);
			match(T__8);
			setState(51);
			match(T__11);
			setState(52);
			match(T__7);
			setState(53);
			match(ID);
			setState(54);
			match(T__8);
			setState(55);
			match(T__12);
			setState(56);
			match(T__7);
			setState(57);
			match(ID);
			setState(58);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011=\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0014\b\u0001\u000b\u0001\f"+
		"\u0001\u0015\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u001d\b\u0002\u000b\u0002\f\u0002\u001e\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u00009\u0000\n\u0001\u0000\u0000\u0000\u0002\u0010"+
		"\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006\"\u0001"+
		"\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n\u000b\u0005\u0001\u0000"+
		"\u0000\u000b\f\u0005\u0002\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u000e"+
		"\u0003\u0004\u0002\u0000\u000e\u000f\u0005\u0003\u0000\u0000\u000f\u0001"+
		"\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0004\u0000\u0000\u0011\u0013"+
		"\u0005\u0002\u0000\u0000\u0012\u0014\u0003\u0006\u0003\u0000\u0013\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u0003"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0005\u0000\u0000\u001a\u001c"+
		"\u0005\u0002\u0000\u0000\u001b\u001d\u0003\b\u0004\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 !\u0005\u0003\u0000\u0000!\u0005\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u0006\u0000\u0000#$\u0005\u0002\u0000\u0000$%\u0005\u0007\u0000"+
		"\u0000%&\u0005\b\u0000\u0000&\'\u0005\u000f\u0000\u0000\'(\u0005\t\u0000"+
		"\u0000()\u0005\n\u0000\u0000)*\u0005\b\u0000\u0000*+\u0005\u000e\u0000"+
		"\u0000+,\u0005\u0003\u0000\u0000,\u0007\u0001\u0000\u0000\u0000-.\u0005"+
		"\u000b\u0000\u0000./\u0005\u0002\u0000\u0000/0\u0005\u0007\u0000\u0000"+
		"01\u0005\b\u0000\u000012\u0005\u000f\u0000\u000023\u0005\t\u0000\u0000"+
		"34\u0005\f\u0000\u000045\u0005\b\u0000\u000056\u0005\u000f\u0000\u0000"+
		"67\u0005\t\u0000\u000078\u0005\r\u0000\u000089\u0005\b\u0000\u00009:\u0005"+
		"\u000f\u0000\u0000:;\u0005\u0003\u0000\u0000;\t\u0001\u0000\u0000\u0000"+
		"\u0002\u0015\u001e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}