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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, IDENT=9, 
		INT=10, FLOAT=11, STRING=12, NULL=13, INT_CONSTANT=14, FLOAT_CONSTANT=15, 
		STRING_CONSTANT=16, IF=17, FOR=18, ELSE=19, RETURN=20, READ=21, PRINT=22, 
		NEW=23, BREAK=24, DEF=25, ADD=26, SUB=27, DIV=28, MUL=29, MOD=30, ASSIGN=31, 
		GREATER_THAN=32, LESS_THAN=33, EQUAL=34, LESS_EQUAL=35, GREATER_EQUAL=36, 
		NOT_EQUAL=37, WHITE_SPACE=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "IDENT", 
			"INT", "FLOAT", "STRING", "NULL", "INT_CONSTANT", "FLOAT_CONSTANT", "STRING_CONSTANT", 
			"DIGITS", "IF", "FOR", "ELSE", "RETURN", "READ", "PRINT", "NEW", "BREAK", 
			"DEF", "ADD", "SUB", "DIV", "MUL", "MOD", "ASSIGN", "GREATER_THAN", "LESS_THAN", 
			"EQUAL", "LESS_EQUAL", "GREATER_EQUAL", "NOT_EQUAL", "WHITE_SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "';'", "'['", "']'", null, "'int'", 
			"'float'", "'string'", "'null'", null, null, null, "'if'", "'for'", "'else'", 
			"'return'", "'read'", "'print'", "'new'", "'break'", "'def'", "'+'", 
			"'-'", "'/'", "'*'", "'%'", "'='", "'>'", "'<'", "'=='", "'<='", "'>='", 
			"'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "IDENT", "INT", 
			"FLOAT", "STRING", "NULL", "INT_CONSTANT", "FLOAT_CONSTANT", "STRING_CONSTANT", 
			"IF", "FOR", "ELSE", "RETURN", "READ", "PRINT", "NEW", "BREAK", "DEF", 
			"ADD", "SUB", "DIV", "MUL", "MOD", "ASSIGN", "GREATER_THAN", "LESS_THAN", 
			"EQUAL", "LESS_EQUAL", "GREATER_EQUAL", "NOT_EQUAL", "WHITE_SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00e5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7\nd\n\n\f\n\16\n"+
		"g\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0087\n\20\3\21\3\21\7\21\u008b\n\21\f\21\16\21\u008e\13\21\3"+
		"\21\3\21\3\22\6\22\u0093\n\22\r\22\16\22\u0094\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%"+
		"\3&\3&\3&\3\'\3\'\3\'\3(\6(\u00e0\n(\r(\16(\u00e1\3(\3(\2\2)\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\2%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C"+
		"\"E#G$I%K&M\'O(\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\3\2\62;\4\2\13\f"+
		"\17\17\2\u00e8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2"+
		"\2\7U\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3\2\2"+
		"\2\23a\3\2\2\2\25h\3\2\2\2\27l\3\2\2\2\31r\3\2\2\2\33y\3\2\2\2\35~\3\2"+
		"\2\2\37\u0086\3\2\2\2!\u0088\3\2\2\2#\u0092\3\2\2\2%\u0096\3\2\2\2\'\u0099"+
		"\3\2\2\2)\u009d\3\2\2\2+\u00a2\3\2\2\2-\u00a9\3\2\2\2/\u00ae\3\2\2\2\61"+
		"\u00b4\3\2\2\2\63\u00b8\3\2\2\2\65\u00be\3\2\2\2\67\u00c2\3\2\2\29\u00c4"+
		"\3\2\2\2;\u00c6\3\2\2\2=\u00c8\3\2\2\2?\u00ca\3\2\2\2A\u00cc\3\2\2\2C"+
		"\u00ce\3\2\2\2E\u00d0\3\2\2\2G\u00d2\3\2\2\2I\u00d5\3\2\2\2K\u00d8\3\2"+
		"\2\2M\u00db\3\2\2\2O\u00df\3\2\2\2QR\7*\2\2R\4\3\2\2\2ST\7+\2\2T\6\3\2"+
		"\2\2UV\7}\2\2V\b\3\2\2\2WX\7\177\2\2X\n\3\2\2\2YZ\7.\2\2Z\f\3\2\2\2[\\"+
		"\7=\2\2\\\16\3\2\2\2]^\7]\2\2^\20\3\2\2\2_`\7_\2\2`\22\3\2\2\2ae\t\2\2"+
		"\2bd\t\3\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\24\3\2\2\2ge\3\2"+
		"\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2k\26\3\2\2\2lm\7h\2\2mn\7n\2\2no\7q\2\2"+
		"op\7c\2\2pq\7v\2\2q\30\3\2\2\2rs\7u\2\2st\7v\2\2tu\7t\2\2uv\7k\2\2vw\7"+
		"p\2\2wx\7i\2\2x\32\3\2\2\2yz\7p\2\2z{\7w\2\2{|\7n\2\2|}\7n\2\2}\34\3\2"+
		"\2\2~\177\5#\22\2\177\36\3\2\2\2\u0080\u0081\5#\22\2\u0081\u0082\7\60"+
		"\2\2\u0082\u0083\5#\22\2\u0083\u0087\3\2\2\2\u0084\u0085\7\60\2\2\u0085"+
		"\u0087\5#\22\2\u0086\u0080\3\2\2\2\u0086\u0084\3\2\2\2\u0087 \3\2\2\2"+
		"\u0088\u008c\7$\2\2\u0089\u008b\n\4\2\2\u008a\u0089\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7$\2\2\u0090\"\3\2\2\2\u0091\u0093\t\5\2\2"+
		"\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095$\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098&\3"+
		"\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c"+
		"(\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a8,\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2"+
		"\2\u00ac\u00ad\7f\2\2\u00ad.\3\2\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7"+
		"t\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\60"+
		"\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7y\2\2\u00b7"+
		"\62\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7m\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7f\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7h\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3"+
		"8\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5:\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7"+
		"<\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9>\3\2\2\2\u00ca\u00cb\7\'\2\2\u00cb"+
		"@\3\2\2\2\u00cc\u00cd\7?\2\2\u00cdB\3\2\2\2\u00ce\u00cf\7@\2\2\u00cfD"+
		"\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1F\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4H\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6\u00d7\7?\2\2\u00d7J\3"+
		"\2\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da\7?\2\2\u00daL\3\2\2\2\u00db\u00dc"+
		"\7#\2\2\u00dc\u00dd\7?\2\2\u00ddN\3\2\2\2\u00de\u00e0\t\6\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\b(\2\2\u00e4P\3\2\2\2\b\2e\u0086\u008c\u0094"+
		"\u00e1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}