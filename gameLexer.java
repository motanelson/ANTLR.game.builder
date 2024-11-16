// Generated from game.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gameLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		VALUE=10, INT=11, FLOAT=12, STRING=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ID", 
			"VALUE", "INT", "FLOAT", "STRING", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CASTLE '", "','", "'HOUSE '", "'MAN '", "'integer'", "'float'", 
			"'string'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "VALUE", 
			"INT", "FLOAT", "STRING", "WS"
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


	public gameLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "game.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\7\nS\n\n\f\n\16\nV\13\n\3\13\3\13"+
		"\3\13\5\13[\n\13\3\f\6\f^\n\f\r\f\16\f_\3\r\6\rc\n\r\r\r\16\rd\3\r\3\r"+
		"\7\ri\n\r\f\r\16\rl\13\r\3\16\3\16\6\16p\n\16\r\16\16\16q\3\16\3\16\3"+
		"\17\3\17\3\20\6\20y\n\20\r\20\16\20z\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\20\3\2\7\5\2C"+
		"\\aac|\6\2\62;C\\aac|\4\2\13\f\17\17\3\2\62;\6\2\13\f\17\17\"\"==\2\u0084"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5)\3\2\2\2\7+\3\2\2"+
		"\2\t\62\3\2\2\2\13\67\3\2\2\2\r?\3\2\2\2\17E\3\2\2\2\21L\3\2\2\2\23P\3"+
		"\2\2\2\25Z\3\2\2\2\27]\3\2\2\2\31b\3\2\2\2\33m\3\2\2\2\35u\3\2\2\2\37"+
		"x\3\2\2\2!\"\7E\2\2\"#\7C\2\2#$\7U\2\2$%\7V\2\2%&\7N\2\2&\'\7G\2\2\'("+
		"\7\"\2\2(\4\3\2\2\2)*\7.\2\2*\6\3\2\2\2+,\7J\2\2,-\7Q\2\2-.\7W\2\2./\7"+
		"U\2\2/\60\7G\2\2\60\61\7\"\2\2\61\b\3\2\2\2\62\63\7O\2\2\63\64\7C\2\2"+
		"\64\65\7P\2\2\65\66\7\"\2\2\66\n\3\2\2\2\678\7k\2\289\7p\2\29:\7v\2\2"+
		":;\7g\2\2;<\7i\2\2<=\7g\2\2=>\7t\2\2>\f\3\2\2\2?@\7h\2\2@A\7n\2\2AB\7"+
		"q\2\2BC\7c\2\2CD\7v\2\2D\16\3\2\2\2EF\7u\2\2FG\7v\2\2GH\7t\2\2HI\7k\2"+
		"\2IJ\7p\2\2JK\7i\2\2K\20\3\2\2\2LM\7f\2\2MN\7g\2\2NO\7h\2\2O\22\3\2\2"+
		"\2PT\t\2\2\2QS\t\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\24\3\2"+
		"\2\2VT\3\2\2\2W[\5\27\f\2X[\5\31\r\2Y[\5\33\16\2ZW\3\2\2\2ZX\3\2\2\2Z"+
		"Y\3\2\2\2[\26\3\2\2\2\\^\5\35\17\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`\30\3\2\2\2ac\5\35\17\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"ef\3\2\2\2fj\7\60\2\2gi\5\35\17\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2k\32\3\2\2\2lj\3\2\2\2mo\7$\2\2np\n\4\2\2on\3\2\2\2pq\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2rs\3\2\2\2st\7$\2\2t\34\3\2\2\2uv\t\5\2\2v\36\3\2\2\2"+
		"wy\t\6\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\20\2"+
		"\2} \3\2\2\2\n\2TZ_djqz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}