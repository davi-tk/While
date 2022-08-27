// Generated from .\src\plp\enquanto\parser\Enquanto.g4 by ANTLR 4.9.2
package plp.enquanto.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnquantoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		BOOLEANO=25, INT=26, ID=27, TEXTO=28, Comentario=29, Espaco=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "BOOLEANO", 
			"INT", "ID", "TEXTO", "Comentario", "Espaco"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'skip'", "'se'", "'entao'", "'senao'", "'enquanto'", 
			"'faca'", "'exiba'", "'escreva'", "'{'", "'}'", "'leia'", "'^'", "'*'", 
			"'/'", "'+'", "'-'", "'('", "')'", "'='", "'<='", "'nao'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BOOLEANO", "INT", "ID", "TEXTO", "Comentario", "Espaco"
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


	public EnquantoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Enquanto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00a6\n\32\3\33\6\33\u00a9\n\33\r"+
		"\33\16\33\u00aa\3\34\6\34\u00ae\n\34\r\34\16\34\u00af\3\35\3\35\7\35\u00b4"+
		"\n\35\f\35\16\35\u00b7\13\35\3\35\3\35\3\36\3\36\7\36\u00bd\n\36\f\36"+
		"\16\36\u00c0\13\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\4\u00b5\u00be"+
		"\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= \3\2\3\5\2\13\f\17\17\"\"\2\u00cd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5"+
		"A\3\2\2\2\7D\3\2\2\2\tI\3\2\2\2\13L\3\2\2\2\rR\3\2\2\2\17X\3\2\2\2\21"+
		"a\3\2\2\2\23f\3\2\2\2\25l\3\2\2\2\27t\3\2\2\2\31v\3\2\2\2\33x\3\2\2\2"+
		"\35}\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0085\3\2\2"+
		"\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2/\u0090"+
		"\3\2\2\2\61\u0094\3\2\2\2\63\u00a5\3\2\2\2\65\u00a8\3\2\2\2\67\u00ad\3"+
		"\2\2\29\u00b1\3\2\2\2;\u00ba\3\2\2\2=\u00c5\3\2\2\2?@\7=\2\2@\4\3\2\2"+
		"\2AB\7<\2\2BC\7?\2\2C\6\3\2\2\2DE\7u\2\2EF\7m\2\2FG\7k\2\2GH\7r\2\2H\b"+
		"\3\2\2\2IJ\7u\2\2JK\7g\2\2K\n\3\2\2\2LM\7g\2\2MN\7p\2\2NO\7v\2\2OP\7c"+
		"\2\2PQ\7q\2\2Q\f\3\2\2\2RS\7u\2\2ST\7g\2\2TU\7p\2\2UV\7c\2\2VW\7q\2\2"+
		"W\16\3\2\2\2XY\7g\2\2YZ\7p\2\2Z[\7s\2\2[\\\7w\2\2\\]\7c\2\2]^\7p\2\2^"+
		"_\7v\2\2_`\7q\2\2`\20\3\2\2\2ab\7h\2\2bc\7c\2\2cd\7e\2\2de\7c\2\2e\22"+
		"\3\2\2\2fg\7g\2\2gh\7z\2\2hi\7k\2\2ij\7d\2\2jk\7c\2\2k\24\3\2\2\2lm\7"+
		"g\2\2mn\7u\2\2no\7e\2\2op\7t\2\2pq\7g\2\2qr\7x\2\2rs\7c\2\2s\26\3\2\2"+
		"\2tu\7}\2\2u\30\3\2\2\2vw\7\177\2\2w\32\3\2\2\2xy\7n\2\2yz\7g\2\2z{\7"+
		"k\2\2{|\7c\2\2|\34\3\2\2\2}~\7`\2\2~\36\3\2\2\2\177\u0080\7,\2\2\u0080"+
		" \3\2\2\2\u0081\u0082\7\61\2\2\u0082\"\3\2\2\2\u0083\u0084\7-\2\2\u0084"+
		"$\3\2\2\2\u0085\u0086\7/\2\2\u0086&\3\2\2\2\u0087\u0088\7*\2\2\u0088("+
		"\3\2\2\2\u0089\u008a\7+\2\2\u008a*\3\2\2\2\u008b\u008c\7?\2\2\u008c,\3"+
		"\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\7?\2\2\u008f.\3\2\2\2\u0090\u0091"+
		"\7p\2\2\u0091\u0092\7c\2\2\u0092\u0093\7q\2\2\u0093\60\3\2\2\2\u0094\u0095"+
		"\7g\2\2\u0095\62\3\2\2\2\u0096\u0097\7x\2\2\u0097\u0098\7g\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7f\2\2\u009a\u009b\7c\2\2\u009b\u009c\7f\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7k\2\2\u009e\u009f\7t\2\2\u009f\u00a6\7q\2\2"+
		"\u00a0\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\u00a6\7q\2\2\u00a5\u0096\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a6"+
		"\64\3\2\2\2\u00a7\u00a9\4\62;\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\66\3\2\2\2\u00ac\u00ae"+
		"\4c|\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b08\3\2\2\2\u00b1\u00b5\7$\2\2\u00b2\u00b4\13\2\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9"+
		":\3\2\2\2\u00ba\u00be\7%\2\2\u00bb\u00bd\13\2\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\b\36\2\2\u00c4<\3\2\2\2\u00c5\u00c6\t\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00c8\b\37\2\2\u00c8>\3\2\2\2\b\2\u00a5\u00aa\u00af\u00b5\u00be"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}