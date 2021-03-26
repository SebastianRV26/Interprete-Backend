// Generated from C:/Users/Usuario/IdeaProjects/Interprete-Backend\InterpreteScanner.g4 by ANTLR 4.9.1
package com.edbinns.interprete.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreteScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, SWITCH=3, CASE=4, DEFAULT=5, DO=6, WHILE=7, FOR=8, BREAK=9, 
		CONTINUE=10, IN=11, RETRUN=12, PRINT=13, ABSTRACT=14, ENUM=15, THIS=16, 
		SYNCHRONIZED=17, CLASS=18, SUPER=19, EXTENDS=20, IMPLEMENTS=21, INTERFACE=22, 
		NEW=23, IMPORT=24, PACKAGE=25, NATIVE=26, VOID=27, PUBLIC=28, PRIVATE=29, 
		PROTECTED=30, STATIC=31, TRY=32, CATCH=33, FINALLY=34, THROW=35, THROWS=36, 
		FINAL=37, INSTANCEOF=38, VOLATILE=39, BOOLEAN=40, BYTE=41, CHAR=42, DOUBLE=43, 
		FLOAT=44, INT=45, LONG=46, SHORT=47, PyCOMA=48, EQUALS=49, SUM=50, DIV=51, 
		MUL=52, BLOCK_COMMENT=53, LINE_COMMENT=54, WS=55, ID=56, NUM=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "DO", "WHILE", "FOR", "BREAK", 
			"CONTINUE", "IN", "RETRUN", "PRINT", "ABSTRACT", "ENUM", "THIS", "SYNCHRONIZED", 
			"CLASS", "SUPER", "EXTENDS", "IMPLEMENTS", "INTERFACE", "NEW", "IMPORT", 
			"PACKAGE", "NATIVE", "VOID", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", 
			"TRY", "CATCH", "FINALLY", "THROW", "THROWS", "FINAL", "INSTANCEOF", 
			"VOLATILE", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "FLOAT", "INT", "LONG", 
			"SHORT", "PyCOMA", "EQUALS", "SUM", "DIV", "MUL", "BLOCK_COMMENT", "LINE_COMMENT", 
			"WS", "NUMBER", "LETTER", "DIGIT", "ID", "NUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'switch'", "'case'", "'default'", "'do'", "'while'", 
			"'for'", "'break'", "'continue'", "'in'", "'return'", "'print'", "'abstract'", 
			"'enum'", "'this'", "'synchronized'", "'class'", "'super'", "'extends'", 
			"'implements'", "'interface'", "'new'", "'import'", "'package'", "'native'", 
			"'void'", "' public'", "'private'", "'protected'", "'static'", "'try'", 
			"'catch'", "'finally'", "'throw'", "'throws'", "'final'", "'instanceof'", 
			"'volatile'", "'boolean'", "'byte'", "'char'", "'double'", "'float'", 
			"'int'", "'long'", "'short'", "';'", "'=='", "'+'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "DO", "WHILE", "FOR", 
			"BREAK", "CONTINUE", "IN", "RETRUN", "PRINT", "ABSTRACT", "ENUM", "THIS", 
			"SYNCHRONIZED", "CLASS", "SUPER", "EXTENDS", "IMPLEMENTS", "INTERFACE", 
			"NEW", "IMPORT", "PACKAGE", "NATIVE", "VOID", "PUBLIC", "PRIVATE", "PROTECTED", 
			"STATIC", "TRY", "CATCH", "FINALLY", "THROW", "THROWS", "FINAL", "INSTANCEOF", 
			"VOLATILE", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "FLOAT", "INT", "LONG", 
			"SHORT", "PyCOMA", "EQUALS", "SUM", "DIV", "MUL", "BLOCK_COMMENT", "LINE_COMMENT", 
			"WS", "ID", "NUM"
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


	public InterpreteScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "InterpreteScanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u020a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u01c3"+
		"\n\66\f\66\16\66\u01c6\13\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01e6\n\67\3\67\3\67\38\6"+
		"8\u01eb\n8\r8\168\u01ec\38\38\39\39\79\u01f3\n9\f9\169\u01f6\139\3:\3"+
		":\3;\3;\3<\3<\3<\7<\u01ff\n<\f<\16<\u0202\13<\3=\3=\7=\u0206\n=\f=\16"+
		"=\u0209\13=\3\u01c4\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q\2s\2u\2w:y;\3\2\4\5\2\13\f\17\17\"\"\4\2C\\c|\2"+
		"\u0210\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5~\3\2\2\2\7\u0083"+
		"\3\2\2\2\t\u008a\3\2\2\2\13\u008f\3\2\2\2\r\u0097\3\2\2\2\17\u009a\3\2"+
		"\2\2\21\u00a0\3\2\2\2\23\u00a4\3\2\2\2\25\u00aa\3\2\2\2\27\u00b3\3\2\2"+
		"\2\31\u00b6\3\2\2\2\33\u00bd\3\2\2\2\35\u00c3\3\2\2\2\37\u00cc\3\2\2\2"+
		"!\u00d1\3\2\2\2#\u00d6\3\2\2\2%\u00e3\3\2\2\2\'\u00e9\3\2\2\2)\u00ef\3"+
		"\2\2\2+\u00f7\3\2\2\2-\u0102\3\2\2\2/\u010c\3\2\2\2\61\u0110\3\2\2\2\63"+
		"\u0117\3\2\2\2\65\u011f\3\2\2\2\67\u0126\3\2\2\29\u012b\3\2\2\2;\u0133"+
		"\3\2\2\2=\u013b\3\2\2\2?\u0145\3\2\2\2A\u014c\3\2\2\2C\u0150\3\2\2\2E"+
		"\u0156\3\2\2\2G\u015e\3\2\2\2I\u0164\3\2\2\2K\u016b\3\2\2\2M\u0171\3\2"+
		"\2\2O\u017c\3\2\2\2Q\u0185\3\2\2\2S\u018d\3\2\2\2U\u0192\3\2\2\2W\u0197"+
		"\3\2\2\2Y\u019e\3\2\2\2[\u01a4\3\2\2\2]\u01a8\3\2\2\2_\u01ad\3\2\2\2a"+
		"\u01b3\3\2\2\2c\u01b5\3\2\2\2e\u01b8\3\2\2\2g\u01ba\3\2\2\2i\u01bc\3\2"+
		"\2\2k\u01be\3\2\2\2m\u01cc\3\2\2\2o\u01ea\3\2\2\2q\u01f4\3\2\2\2s\u01f7"+
		"\3\2\2\2u\u01f9\3\2\2\2w\u01fb\3\2\2\2y\u0203\3\2\2\2{|\7k\2\2|}\7h\2"+
		"\2}\4\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082"+
		"\7g\2\2\u0082\6\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085\7y\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7v\2\2\u0087\u0088\7e\2\2\u0088\u0089\7j\2\2\u0089"+
		"\b\3\2\2\2\u008a\u008b\7e\2\2\u008b\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7g\2\2\u008e\n\3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7h\2\2\u0092\u0093\7c\2\2\u0093\u0094\7w\2\2\u0094\u0095\7n\2\2"+
		"\u0095\u0096\7v\2\2\u0096\f\3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7q"+
		"\2\2\u0099\16\3\2\2\2\u009a\u009b\7y\2\2\u009b\u009c\7j\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f\20\3\2\2\2\u00a0\u00a1"+
		"\7h\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7t\2\2\u00a3\22\3\2\2\2\u00a4\u00a5"+
		"\7d\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7m\2\2\u00a9\24\3\2\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7q\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7w\2\2\u00b1\u00b2\7g\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7"+
		"k\2\2\u00b4\u00b5\7p\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7t\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc\32\3\2\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7v\2\2\u00c2\34\3\2\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7v\2\2"+
		"\u00c7\u00c8\7t\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb"+
		"\7v\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf"+
		"\7w\2\2\u00cf\u00d0\7o\2\2\u00d0 \3\2\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3"+
		"\7j\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7u\2\2\u00d5\"\3\2\2\2\u00d6\u00d7"+
		"\7u\2\2\u00d7\u00d8\7{\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7e\2\2\u00da"+
		"\u00db\7j\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7p\2\2"+
		"\u00de\u00df\7k\2\2\u00df\u00e0\7|\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7f\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6"+
		"\7c\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7u\2\2\u00e8&\3\2\2\2\u00e9\u00ea"+
		"\7u\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7t\2\2\u00ee(\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7z\2\2\u00f1"+
		"\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7f\2\2"+
		"\u00f5\u00f6\7u\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7o\2"+
		"\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd"+
		"\7o\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7v\2\2\u0100"+
		"\u0101\7u\2\2\u0101,\3\2\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104"+
		"\u0105\7v\2\2\u0105\u0106\7g\2\2\u0106\u0107\7t\2\2\u0107\u0108\7h\2\2"+
		"\u0108\u0109\7c\2\2\u0109\u010a\7e\2\2\u010a\u010b\7g\2\2\u010b.\3\2\2"+
		"\2\u010c\u010d\7p\2\2\u010d\u010e\7g\2\2\u010e\u010f\7y\2\2\u010f\60\3"+
		"\2\2\2\u0110\u0111\7k\2\2\u0111\u0112\7o\2\2\u0112\u0113\7r\2\2\u0113"+
		"\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115\u0116\7v\2\2\u0116\62\3\2\2\2\u0117"+
		"\u0118\7r\2\2\u0118\u0119\7c\2\2\u0119\u011a\7e\2\2\u011a\u011b\7m\2\2"+
		"\u011b\u011c\7c\2\2\u011c\u011d\7i\2\2\u011d\u011e\7g\2\2\u011e\64\3\2"+
		"\2\2\u011f\u0120\7p\2\2\u0120\u0121\7c\2\2\u0121\u0122\7v\2\2\u0122\u0123"+
		"\7k\2\2\u0123\u0124\7x\2\2\u0124\u0125\7g\2\2\u0125\66\3\2\2\2\u0126\u0127"+
		"\7x\2\2\u0127\u0128\7q\2\2\u0128\u0129\7k\2\2\u0129\u012a\7f\2\2\u012a"+
		"8\3\2\2\2\u012b\u012c\7\"\2\2\u012c\u012d\7r\2\2\u012d\u012e\7w\2\2\u012e"+
		"\u012f\7d\2\2\u012f\u0130\7n\2\2\u0130\u0131\7k\2\2\u0131\u0132\7e\2\2"+
		"\u0132:\3\2\2\2\u0133\u0134\7r\2\2\u0134\u0135\7t\2\2\u0135\u0136\7k\2"+
		"\2\u0136\u0137\7x\2\2\u0137\u0138\7c\2\2\u0138\u0139\7v\2\2\u0139\u013a"+
		"\7g\2\2\u013a<\3\2\2\2\u013b\u013c\7r\2\2\u013c\u013d\7t\2\2\u013d\u013e"+
		"\7q\2\2\u013e\u013f\7v\2\2\u013f\u0140\7g\2\2\u0140\u0141\7e\2\2\u0141"+
		"\u0142\7v\2\2\u0142\u0143\7g\2\2\u0143\u0144\7f\2\2\u0144>\3\2\2\2\u0145"+
		"\u0146\7u\2\2\u0146\u0147\7v\2\2\u0147\u0148\7c\2\2\u0148\u0149\7v\2\2"+
		"\u0149\u014a\7k\2\2\u014a\u014b\7e\2\2\u014b@\3\2\2\2\u014c\u014d\7v\2"+
		"\2\u014d\u014e\7t\2\2\u014e\u014f\7{\2\2\u014fB\3\2\2\2\u0150\u0151\7"+
		"e\2\2\u0151\u0152\7c\2\2\u0152\u0153\7v\2\2\u0153\u0154\7e\2\2\u0154\u0155"+
		"\7j\2\2\u0155D\3\2\2\2\u0156\u0157\7h\2\2\u0157\u0158\7k\2\2\u0158\u0159"+
		"\7p\2\2\u0159\u015a\7c\2\2\u015a\u015b\7n\2\2\u015b\u015c\7n\2\2\u015c"+
		"\u015d\7{\2\2\u015dF\3\2\2\2\u015e\u015f\7v\2\2\u015f\u0160\7j\2\2\u0160"+
		"\u0161\7t\2\2\u0161\u0162\7q\2\2\u0162\u0163\7y\2\2\u0163H\3\2\2\2\u0164"+
		"\u0165\7v\2\2\u0165\u0166\7j\2\2\u0166\u0167\7t\2\2\u0167\u0168\7q\2\2"+
		"\u0168\u0169\7y\2\2\u0169\u016a\7u\2\2\u016aJ\3\2\2\2\u016b\u016c\7h\2"+
		"\2\u016c\u016d\7k\2\2\u016d\u016e\7p\2\2\u016e\u016f\7c\2\2\u016f\u0170"+
		"\7n\2\2\u0170L\3\2\2\2\u0171\u0172\7k\2\2\u0172\u0173\7p\2\2\u0173\u0174"+
		"\7u\2\2\u0174\u0175\7v\2\2\u0175\u0176\7c\2\2\u0176\u0177\7p\2\2\u0177"+
		"\u0178\7e\2\2\u0178\u0179\7g\2\2\u0179\u017a\7q\2\2\u017a\u017b\7h\2\2"+
		"\u017bN\3\2\2\2\u017c\u017d\7x\2\2\u017d\u017e\7q\2\2\u017e\u017f\7n\2"+
		"\2\u017f\u0180\7c\2\2\u0180\u0181\7v\2\2\u0181\u0182\7k\2\2\u0182\u0183"+
		"\7n\2\2\u0183\u0184\7g\2\2\u0184P\3\2\2\2\u0185\u0186\7d\2\2\u0186\u0187"+
		"\7q\2\2\u0187\u0188\7q\2\2\u0188\u0189\7n\2\2\u0189\u018a\7g\2\2\u018a"+
		"\u018b\7c\2\2\u018b\u018c\7p\2\2\u018cR\3\2\2\2\u018d\u018e\7d\2\2\u018e"+
		"\u018f\7{\2\2\u018f\u0190\7v\2\2\u0190\u0191\7g\2\2\u0191T\3\2\2\2\u0192"+
		"\u0193\7e\2\2\u0193\u0194\7j\2\2\u0194\u0195\7c\2\2\u0195\u0196\7t\2\2"+
		"\u0196V\3\2\2\2\u0197\u0198\7f\2\2\u0198\u0199\7q\2\2\u0199\u019a\7w\2"+
		"\2\u019a\u019b\7d\2\2\u019b\u019c\7n\2\2\u019c\u019d\7g\2\2\u019dX\3\2"+
		"\2\2\u019e\u019f\7h\2\2\u019f\u01a0\7n\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2"+
		"\7c\2\2\u01a2\u01a3\7v\2\2\u01a3Z\3\2\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6"+
		"\7p\2\2\u01a6\u01a7\7v\2\2\u01a7\\\3\2\2\2\u01a8\u01a9\7n\2\2\u01a9\u01aa"+
		"\7q\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7i\2\2\u01ac^\3\2\2\2\u01ad\u01ae"+
		"\7u\2\2\u01ae\u01af\7j\2\2\u01af\u01b0\7q\2\2\u01b0\u01b1\7t\2\2\u01b1"+
		"\u01b2\7v\2\2\u01b2`\3\2\2\2\u01b3\u01b4\7=\2\2\u01b4b\3\2\2\2\u01b5\u01b6"+
		"\7?\2\2\u01b6\u01b7\7?\2\2\u01b7d\3\2\2\2\u01b8\u01b9\7-\2\2\u01b9f\3"+
		"\2\2\2\u01ba\u01bb\7\61\2\2\u01bbh\3\2\2\2\u01bc\u01bd\7,\2\2\u01bdj\3"+
		"\2\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c0\7,\2\2\u01c0\u01c4\3\2\2\2\u01c1"+
		"\u01c3\13\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c5\3"+
		"\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\7,\2\2\u01c8\u01c9\7\61\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\b\66"+
		"\2\2\u01cbl\3\2\2\2\u01cc\u01cd\7\61\2\2\u01cd\u01ce\7\61\2\2\u01ce\u01e5"+
		"\3\2\2\2\u01cf\u01e6\5s:\2\u01d0\u01e6\5u;\2\u01d1\u01e6\t\2\2\2\u01d2"+
		"\u01d3\7B\2\2\u01d3\u01d4\7%\2\2\u01d4\u01d5\7&\2\2\u01d5\u01d6\7\'\2"+
		"\2\u01d6\u01d7\7`\2\2\u01d7\u01d8\7(\2\2\u01d8\u01d9\7#\2\2\u01d9\u01da"+
		"\7a\2\2\u01da\u01db\7/\2\2\u01db\u01dc\7-\2\2\u01dc\u01dd\7?\2\2\u01dd"+
		"\u01de\7\60\2\2\u01de\u01df\7.\2\2\u01df\u01e0\7@\2\2\u01e0\u01e1\7>\2"+
		"\2\u01e1\u01e2\7A\2\2\u01e2\u01e3\7\61\2\2\u01e3\u01e4\7b\2\2\u01e4\u01e6"+
		"\7$\2\2\u01e5\u01cf\3\2\2\2\u01e5\u01d0\3\2\2\2\u01e5\u01d1\3\2\2\2\u01e5"+
		"\u01d2\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\b\67\3\2\u01e8n\3\2\2\2"+
		"\u01e9\u01eb\t\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\b8\3\2\u01ef"+
		"p\3\2\2\2\u01f0\u01f3\5u;\2\u01f1\u01f3\5u;\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5r\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\t\3\2\2\u01f8t\3\2"+
		"\2\2\u01f9\u01fa\4\62;\2\u01fav\3\2\2\2\u01fb\u0200\5s:\2\u01fc\u01ff"+
		"\5s:\2\u01fd\u01ff\5u;\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff"+
		"\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201x\3\2\2\2"+
		"\u0202\u0200\3\2\2\2\u0203\u0207\5u;\2\u0204\u0206\5u;\2\u0205\u0204\3"+
		"\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"z\3\2\2\2\u0209\u0207\3\2\2\2\13\2\u01c4\u01e5\u01ec\u01f2\u01f4\u01fe"+
		"\u0200\u0207\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}