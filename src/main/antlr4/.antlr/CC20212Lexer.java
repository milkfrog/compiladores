// Generated from /home/milkfrog/git/compiladores/src/main/antlr4/CC20212.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CC20212Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, STRING=3, NULL=4, INT_CONSTANT=5, FLOAT_CONSTANT=6, STRING_CONSTANT=7, 
		IF=8, FOR=9, ELSE=10, RETURN=11, READ=12, PRINT=13, NEW=14, BREAK=15, 
		DEF=16, ADD=17, SUB=18, DIV=19, MUL=20, MOD=21, ASSIGN=22, GREATER_THAN=23, 
		LESS_THAN=24, EQUAL=25, LESS_EQUAL=26, GREATER_EQUAL=27, NOT_EQUAL=28, 
		LPAREN=29, RPAREN=30, LBRACE=31, RBRACE=32, LBRACK=33, RBRACK=34, SEMI=35, 
		COMMA=36, DOT=37, COLON=38, IDENT=39, WHITESPACE=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "STRING", "NULL", "INT_CONSTANT", "FLOAT_CONSTANT", "STRING_CONSTANT", 
			"DIGITS", "IF", "FOR", "ELSE", "RETURN", "READ", "PRINT", "NEW", "BREAK", 
			"DEF", "ADD", "SUB", "DIV", "MUL", "MOD", "ASSIGN", "GREATER_THAN", "LESS_THAN", 
			"EQUAL", "LESS_EQUAL", "GREATER_EQUAL", "NOT_EQUAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "COLON", 
			"IDENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'string'", "'null'", null, null, null, "'if'", 
			"'for'", "'else'", "'return'", "'read'", "'print'", "'new'", "'break'", 
			"'def'", "'+'", "'-'", "'/'", "'*'", "'%'", "'='", "'>'", "'<'", "'=='", 
			"'<='", "'>='", "'!='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "STRING", "NULL", "INT_CONSTANT", "FLOAT_CONSTANT", 
			"STRING_CONSTANT", "IF", "FOR", "ELSE", "RETURN", "READ", "PRINT", "NEW", 
			"BREAK", "DEF", "ADD", "SUB", "DIV", "MUL", "MOD", "ASSIGN", "GREATER_THAN", 
			"LESS_THAN", "EQUAL", "LESS_EQUAL", "GREATER_EQUAL", "NOT_EQUAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"COLON", "IDENT", "WHITESPACE"
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


	public CC20212Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CC20212.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7t\n\7\3\b\3\b\7\bx\n\b\f"+
		"\b\16\b{\13\b\3\b\3\b\3\t\6\t\u0080\n\t\r\t\16\t\u0081\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\7)\u00e2\n)\f)\16"+
		")\u00e5\13)\3*\6*\u00e8\n*\r*\16*\u00e9\3*\3*\2\2+\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\2\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'"+
		"\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K"+
		"&M\'O(Q)S*\3\2\7\3\2$$\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u00f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U"+
		"\3\2\2\2\5Y\3\2\2\2\7_\3\2\2\2\tf\3\2\2\2\13k\3\2\2\2\rs\3\2\2\2\17u\3"+
		"\2\2\2\21\177\3\2\2\2\23\u0083\3\2\2\2\25\u0086\3\2\2\2\27\u008a\3\2\2"+
		"\2\31\u008f\3\2\2\2\33\u0096\3\2\2\2\35\u009b\3\2\2\2\37\u00a1\3\2\2\2"+
		"!\u00a5\3\2\2\2#\u00ab\3\2\2\2%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3"+
		"\2\2\2+\u00b5\3\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63"+
		"\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67\u00c2\3\2\2\29\u00c5\3\2\2\2;\u00c8"+
		"\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C\u00d1\3\2\2\2E"+
		"\u00d3\3\2\2\2G\u00d5\3\2\2\2I\u00d7\3\2\2\2K\u00d9\3\2\2\2M\u00db\3\2"+
		"\2\2O\u00dd\3\2\2\2Q\u00df\3\2\2\2S\u00e7\3\2\2\2UV\7k\2\2VW\7p\2\2WX"+
		"\7v\2\2X\4\3\2\2\2YZ\7h\2\2Z[\7n\2\2[\\\7q\2\2\\]\7c\2\2]^\7v\2\2^\6\3"+
		"\2\2\2_`\7u\2\2`a\7v\2\2ab\7t\2\2bc\7k\2\2cd\7p\2\2de\7i\2\2e\b\3\2\2"+
		"\2fg\7p\2\2gh\7w\2\2hi\7n\2\2ij\7n\2\2j\n\3\2\2\2kl\5\21\t\2l\f\3\2\2"+
		"\2mn\5\21\t\2no\7\60\2\2op\5\21\t\2pt\3\2\2\2qr\7\60\2\2rt\5\21\t\2sm"+
		"\3\2\2\2sq\3\2\2\2t\16\3\2\2\2uy\7$\2\2vx\n\2\2\2wv\3\2\2\2x{\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7$\2\2}\20\3\2\2\2~\u0080\t"+
		"\3\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\22\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085"+
		"\24\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7q\2\2\u0088\u0089\7t\2\2\u0089"+
		"\26\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7g\2\2\u008e\30\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7v\2\2\u0092\u0093\7w\2\2\u0093\u0094\7t\2\2\u0094\u0095\7p\2\2"+
		"\u0095\32\3\2\2\2\u0096\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7"+
		"c\2\2\u0099\u009a\7f\2\2\u009a\34\3\2\2\2\u009b\u009c\7r\2\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\36\3\2\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7y\2\2\u00a4"+
		" \3\2\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7m\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7f\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7h\2\2\u00ae$\3\2\2\2\u00af\u00b0\7-\2\2\u00b0"+
		"&\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7\61\2\2\u00b4"+
		"*\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7\'\2\2\u00b8"+
		".\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc"+
		"\62\3\2\2\2\u00bd\u00be\7>\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0"+
		"\u00c1\7?\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7>\2\2\u00c3\u00c4\7?\2\2\u00c4"+
		"8\3\2\2\2\u00c5\u00c6\7@\2\2\u00c6\u00c7\7?\2\2\u00c7:\3\2\2\2\u00c8\u00c9"+
		"\7#\2\2\u00c9\u00ca\7?\2\2\u00ca<\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc>\3"+
		"\2\2\2\u00cd\u00ce\7+\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7}\2\2\u00d0B\3\2"+
		"\2\2\u00d1\u00d2\7\177\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7]\2\2\u00d4F\3"+
		"\2\2\2\u00d5\u00d6\7_\2\2\u00d6H\3\2\2\2\u00d7\u00d8\7=\2\2\u00d8J\3\2"+
		"\2\2\u00d9\u00da\7.\2\2\u00daL\3\2\2\2\u00db\u00dc\7\60\2\2\u00dcN\3\2"+
		"\2\2\u00dd\u00de\7<\2\2\u00deP\3\2\2\2\u00df\u00e3\t\4\2\2\u00e0\u00e2"+
		"\t\5\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4R\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\t\6\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b*\2\2\u00ecT\3\2\2\2\b\2sy\u0081"+
		"\u00e3\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}