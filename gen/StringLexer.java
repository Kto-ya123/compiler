// Generated from /home/mrbig/Projects/compiler/grammar/StringLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StringLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, WHILE=4, END=5, BOOL=6, INT=7, STR=8, LIST=9, TRUE=10, 
		FALSE=11, NOT=12, AND=13, OR=14, FUNC=15, RETURN=16, LEN=17, IN=18, EQ=19, 
		LESS=20, GREATER=21, PRINT=22, SUM=23, MULT=24, ASSIGN=25, NAME=26, STRING=27, 
		NUMBER=28, BOOLEAN=29, COMMA=30, OPEN_PARANTHESIS=31, CLOSE_PARANTHESIS=32, 
		OPEN_SQUARE_BRACKET=33, CLOSE_SQUARE_BRACKET=34, OPEN_TRIANGLE_BRACKET=35, 
		CLOSE_TRIANGLE_BRACKET=36, SEP_SLICE=37, BEGIN=38, RET_TYPE=39, OPERATOR_DEL=40, 
		DIGIT=41, COMMENT=42, WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "FOR", "WHILE", "END", "BOOL", "INT", "STR", "LIST", "TRUE", 
			"FALSE", "NOT", "AND", "OR", "FUNC", "RETURN", "LEN", "IN", "EQ", "LESS", 
			"GREATER", "PRINT", "SUM", "MULT", "ASSIGN", "NAME", "STRING", "NUMBER", 
			"BOOLEAN", "COMMA", "OPEN_PARANTHESIS", "CLOSE_PARANTHESIS", "OPEN_SQUARE_BRACKET", 
			"CLOSE_SQUARE_BRACKET", "OPEN_TRIANGLE_BRACKET", "CLOSE_TRIANGLE_BRACKET", 
			"SEP_SLICE", "BEGIN", "RET_TYPE", "OPERATOR_DEL", "D_CHAR", "S_CHAR", 
			"CHAR", "NONDIGIT", "Q_CHAR", "D_ESCAPE", "S_ESCAPE", "ESCAPE", "DIGIT", 
			"NON_ZERO_DIGIT", "ZERO", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'while'", "'end'", "'bool'", "'int'", 
			"'str'", "'list'", "'true'", "'false'", "'not'", "'and'", "'or'", "'func'", 
			"'return'", "'len'", "'in'", "'eq'", "'ls'", "'gr'", "'print'", "'+'", 
			"'*'", "'='", null, null, null, null, "','", "'('", "')'", "'['", "']'", 
			"'<'", "'>'", "':'", null, "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "WHILE", "END", "BOOL", "INT", "STR", "LIST", 
			"TRUE", "FALSE", "NOT", "AND", "OR", "FUNC", "RETURN", "LEN", "IN", "EQ", 
			"LESS", "GREATER", "PRINT", "SUM", "MULT", "ASSIGN", "NAME", "STRING", 
			"NUMBER", "BOOLEAN", "COMMA", "OPEN_PARANTHESIS", "CLOSE_PARANTHESIS", 
			"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_TRIANGLE_BRACKET", 
			"CLOSE_TRIANGLE_BRACKET", "SEP_SLICE", "BEGIN", "RET_TYPE", "OPERATOR_DEL", 
			"DIGIT", "COMMENT", "WS"
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


	public StringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StringLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0156\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\7\33\u00d7\n\33\f\33\16\33\u00da\13\33\3\34\3\34\3\34\7\34"+
		"\u00df\n\34\f\34\16\34\u00e2\13\34\3\34\3\34\3\35\5\35\u00e7\n\35\3\35"+
		"\3\35\7\35\u00eb\n\35\f\35\16\35\u00ee\13\35\3\35\5\35\u00f1\n\35\3\36"+
		"\3\36\5\36\u00f5\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%"+
		"\3&\3&\3\'\3\'\7\'\u0109\n\'\f\'\16\'\u010c\13\'\3(\3(\3(\3)\3)\3)\6)"+
		"\u0114\n)\r)\16)\u0115\3)\6)\u0119\n)\r)\16)\u011a\5)\u011d\n)\3*\3*\5"+
		"*\u0121\n*\3+\3+\5+\u0125\n+\3,\3,\3-\3-\3.\3.\3.\5.\u012e\n.\3/\3/\3"+
		"/\5/\u0133\n/\3\60\3\60\3\60\5\60\u0138\n\60\3\61\3\61\3\61\3\62\3\62"+
		"\5\62\u013f\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0149\n"+
		"\65\f\65\16\65\u014c\13\65\3\65\3\65\3\66\6\66\u0151\n\66\r\66\16\66\u0152"+
		"\3\66\3\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2]\2_\2a\2c+e\2"+
		"g\2i,k-\3\2\b\4\2\f\f\17\17\5\2$$))^^\5\2C\\aac|\t\2##%(*\61<B]]_`}\u0080"+
		"\13\2AA^^cdhhppttvvxx\u201b\u201b\4\2\13\13\"\"\2\u0161\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2c\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\3m\3\2\2\2\5p\3\2\2\2\7u\3\2\2\2\ty\3\2\2\2\13\177\3\2\2\2\r\u0083"+
		"\3\2\2\2\17\u0088\3\2\2\2\21\u008c\3\2\2\2\23\u0090\3\2\2\2\25\u0095\3"+
		"\2\2\2\27\u009a\3\2\2\2\31\u00a0\3\2\2\2\33\u00a4\3\2\2\2\35\u00a8\3\2"+
		"\2\2\37\u00ab\3\2\2\2!\u00b0\3\2\2\2#\u00b7\3\2\2\2%\u00bb\3\2\2\2\'\u00be"+
		"\3\2\2\2)\u00c1\3\2\2\2+\u00c4\3\2\2\2-\u00c7\3\2\2\2/\u00cd\3\2\2\2\61"+
		"\u00cf\3\2\2\2\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67\u00db\3\2\2\29\u00f0"+
		"\3\2\2\2;\u00f4\3\2\2\2=\u00f6\3\2\2\2?\u00f8\3\2\2\2A\u00fa\3\2\2\2C"+
		"\u00fc\3\2\2\2E\u00fe\3\2\2\2G\u0100\3\2\2\2I\u0102\3\2\2\2K\u0104\3\2"+
		"\2\2M\u0106\3\2\2\2O\u010d\3\2\2\2Q\u011c\3\2\2\2S\u0120\3\2\2\2U\u0124"+
		"\3\2\2\2W\u0126\3\2\2\2Y\u0128\3\2\2\2[\u012d\3\2\2\2]\u0132\3\2\2\2_"+
		"\u0137\3\2\2\2a\u0139\3\2\2\2c\u013e\3\2\2\2e\u0140\3\2\2\2g\u0142\3\2"+
		"\2\2i\u0144\3\2\2\2k\u0150\3\2\2\2mn\7k\2\2no\7h\2\2o\4\3\2\2\2pq\7g\2"+
		"\2qr\7n\2\2rs\7u\2\2st\7g\2\2t\6\3\2\2\2uv\7h\2\2vw\7q\2\2wx\7t\2\2x\b"+
		"\3\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7g\2\2~\n\3\2\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7p\2\2\u0081\u0082\7f\2\2\u0082\f\3\2\2\2\u0083\u0084"+
		"\7d\2\2\u0084\u0085\7q\2\2\u0085\u0086\7q\2\2\u0086\u0087\7n\2\2\u0087"+
		"\16\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b"+
		"\20\3\2\2\2\u008c\u008d\7u\2\2\u008d\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f"+
		"\22\3\2\2\2\u0090\u0091\7n\2\2\u0091\u0092\7k\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7v\2\2\u0094\24\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097"+
		"\u0098\7w\2\2\u0098\u0099\7g\2\2\u0099\26\3\2\2\2\u009a\u009b\7h\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2"+
		"\u009f\30\3\2\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7"+
		"v\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7f\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa\36"+
		"\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7e\2\2\u00af \3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7p\2\2"+
		"\u00b6\"\3\2\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7p"+
		"\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd&\3\2\2"+
		"\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7s\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7"+
		"n\2\2\u00c2\u00c3\7u\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7i\2\2\u00c5\u00c6"+
		"\7t\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc.\3\2\2\2\u00cd\u00ce"+
		"\7-\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0\62\3\2\2\2\u00d1\u00d2"+
		"\7?\2\2\u00d2\64\3\2\2\2\u00d3\u00d8\5Y-\2\u00d4\u00d7\5c\62\2\u00d5\u00d7"+
		"\5Y-\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\66\3\2\2\2\u00da\u00d8\3\2\2"+
		"\2\u00db\u00e0\7$\2\2\u00dc\u00df\5S*\2\u00dd\u00df\5]/\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7$"+
		"\2\2\u00e48\3\2\2\2\u00e5\u00e7\7/\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\5e\63\2\u00e9\u00eb\5c\62\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\5g\64\2\u00f0"+
		"\u00e6\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1:\3\2\2\2\u00f2\u00f5\5\25\13"+
		"\2\u00f3\u00f5\5\27\f\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"<\3\2\2\2\u00f6\u00f7\7.\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7*\2\2\u00f9@"+
		"\3\2\2\2\u00fa\u00fb\7+\2\2\u00fbB\3\2\2\2\u00fc\u00fd\7]\2\2\u00fdD\3"+
		"\2\2\2\u00fe\u00ff\7_\2\2\u00ffF\3\2\2\2\u0100\u0101\7>\2\2\u0101H\3\2"+
		"\2\2\u0102\u0103\7@\2\2\u0103J\3\2\2\2\u0104\u0105\7<\2\2\u0105L\3\2\2"+
		"\2\u0106\u010a\7<\2\2\u0107\u0109\t\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010bN\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010e\7/\2\2\u010e\u010f\7@\2\2\u010fP\3\2\2\2\u0110"+
		"\u011d\7=\2\2\u0111\u0113\7=\2\2\u0112\u0114\t\2\2\2\u0113\u0112\3\2\2"+
		"\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011d"+
		"\3\2\2\2\u0117\u0119\t\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0110\3\2"+
		"\2\2\u011c\u0111\3\2\2\2\u011c\u0118\3\2\2\2\u011dR\3\2\2\2\u011e\u0121"+
		"\5W,\2\u011f\u0121\7)\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"T\3\2\2\2\u0122\u0125\5W,\2\u0123\u0125\7$\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0123\3\2\2\2\u0125V\3\2\2\2\u0126\u0127\n\3\2\2\u0127X\3\2\2\2\u0128"+
		"\u0129\t\4\2\2\u0129Z\3\2\2\2\u012a\u012e\5Y-\2\u012b\u012e\5c\62\2\u012c"+
		"\u012e\t\5\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2"+
		"\2\2\u012e\\\3\2\2\2\u012f\u0133\5a\61\2\u0130\u0131\7^\2\2\u0131\u0133"+
		"\7$\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0133^\3\2\2\2\u0134\u0138"+
		"\5a\61\2\u0135\u0136\7^\2\2\u0136\u0138\7)\2\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138`\3\2\2\2\u0139\u013a\7^\2\2\u013a\u013b\t\6\2\2\u013b"+
		"b\3\2\2\2\u013c\u013f\5g\64\2\u013d\u013f\5e\63\2\u013e\u013c\3\2\2\2"+
		"\u013e\u013d\3\2\2\2\u013fd\3\2\2\2\u0140\u0141\4\63;\2\u0141f\3\2\2\2"+
		"\u0142\u0143\7\62\2\2\u0143h\3\2\2\2\u0144\u0145\7\61\2\2\u0145\u0146"+
		"\7\61\2\2\u0146\u014a\3\2\2\2\u0147\u0149\n\2\2\2\u0148\u0147\3\2\2\2"+
		"\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\b\65\2\2\u014ej\3\2\2\2\u014f"+
		"\u0151\t\7\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\66\2\2\u0155"+
		"l\3\2\2\2\27\2\u00d6\u00d8\u00de\u00e0\u00e6\u00ec\u00f0\u00f4\u010a\u0115"+
		"\u011a\u011c\u0120\u0124\u012d\u0132\u0137\u013e\u014a\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}