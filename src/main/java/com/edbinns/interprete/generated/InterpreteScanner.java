// Generated from C:/Users/Usuario/IdeaProjects/Interprete-Backend\InterpreteScanner.g4 by ANTLR 4.9.1
package generated;
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
		CONTINUE=10, IN=11, RETURN=12, PRINT=13, ABSTRACT=14, ENUM=15, THIS=16, 
		SYNCHRONIZED=17, CLASS=18, SUPER=19, EXTENDS=20, IMPLEMENTS=21, INTERFACE=22, 
		NEW=23, IMPORT=24, PACKAGE=25, NATIVE=26, VOID=27, PUBLIC=28, PRIVATE=29, 
		PROTECTED=30, STATIC=31, TRY=32, CATCH=33, FINALLY=34, THROW=35, THROWS=36, 
		FINAL=37, INSTANCEOF=38, VOLATILE=39, LENGHT=40, STRING=41, BOOLEAN=42, 
		BYTE=43, CHAR=44, DOUBLE=45, FLOAT=46, INT=47, LONG=48, SHORT=49, PyCOMA=50, 
		ASYGN=51, SUM=52, RES=53, DIV=54, MUL=55, ADMIRACION=56, PREGUNTA=57, 
		DOBLECOMILLA=58, NUMERAL=59, DOLAR=60, PORCENTAJE=61, AND=62, OR=63, PARENTESISIZQ=64, 
		PARENTESISDER=65, COMA=66, PUNTO=67, DOSPUNTOS=68, AROBA=69, BRACKETIZQ=70, 
		BRACKE5TDER=71, SLASH=72, ELEVADO=73, GUIONBAJO=74, TILDEALREVES=75, LLAVEIZQ=76, 
		LLAVEDER=77, RABO=78, RELACIONALOP=79, ADDITIVEOP=80, MULTIPLICATIVEOP=81, 
		LITERAL=82, INTLITERAL=83, REALLITERAL=84, BOOLLITERAL=85, STRINGLITERAL=86, 
		BLOCK_COMMENT=87, LINE_COMMENT=88, WS=89, ID=90, NUM=91;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "DO", "WHILE", "FOR", "BREAK", 
			"CONTINUE", "IN", "RETURN", "PRINT", "ABSTRACT", "ENUM", "THIS", "SYNCHRONIZED", 
			"CLASS", "SUPER", "EXTENDS", "IMPLEMENTS", "INTERFACE", "NEW", "IMPORT", 
			"PACKAGE", "NATIVE", "VOID", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", 
			"TRY", "CATCH", "FINALLY", "THROW", "THROWS", "FINAL", "INSTANCEOF", 
			"VOLATILE", "LENGHT", "STRING", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", 
			"FLOAT", "INT", "LONG", "SHORT", "TRUE", "FALSE", "PyCOMA", "ASYGN", 
			"EQUALS", "SUM", "RES", "DIV", "MUL", "DIF", "MAYOR", "MAYORIGUAL", "MENOR", 
			"MENORIGUAL", "ADMIRACION", "PREGUNTA", "DOBLECOMILLA", "NUMERAL", "DOLAR", 
			"PORCENTAJE", "AND", "OR", "PARENTESISIZQ", "PARENTESISDER", "COMA", 
			"PUNTO", "DOSPUNTOS", "AROBA", "BRACKETIZQ", "BRACKE5TDER", "SLASH", 
			"ELEVADO", "GUIONBAJO", "TILDEALREVES", "LLAVEIZQ", "LLAVEDER", "RABO", 
			"RELACIONALOP", "ADDITIVEOP", "MULTIPLICATIVEOP", "LITERAL", "INTLITERAL", 
			"REALLITERAL", "BOOLLITERAL", "STRINGLITERAL", "PRINTABLE", "BLOCK_COMMENT", 
			"LINE_COMMENT", "WS", "NUMBER", "LETTER", "DIGIT", "ID", "NUM"
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
			"'volatile'", "'lenght'", "'string'", "'boolean'", "'byte'", "'char'", 
			"'double'", "'float'", "'int'", "'long'", "'short'", "';'", "'='", "'+'", 
			"'-'", "'/'", "'*'", "'!'", "'?'", "'\"'", "'#'", "'$'", "'%'", "'&'", 
			"'|'", "'('", "')'", "','", "'.'", "':'", "'@'", "'['", "']'", "'\\'", 
			"'^'", "'_'", "'`'", "'{'", "'}'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "DO", "WHILE", "FOR", 
			"BREAK", "CONTINUE", "IN", "RETURN", "PRINT", "ABSTRACT", "ENUM", "THIS", 
			"SYNCHRONIZED", "CLASS", "SUPER", "EXTENDS", "IMPLEMENTS", "INTERFACE", 
			"NEW", "IMPORT", "PACKAGE", "NATIVE", "VOID", "PUBLIC", "PRIVATE", "PROTECTED", 
			"STATIC", "TRY", "CATCH", "FINALLY", "THROW", "THROWS", "FINAL", "INSTANCEOF", 
			"VOLATILE", "LENGHT", "STRING", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", 
			"FLOAT", "INT", "LONG", "SHORT", "PyCOMA", "ASYGN", "SUM", "RES", "DIV", 
			"MUL", "ADMIRACION", "PREGUNTA", "DOBLECOMILLA", "NUMERAL", "DOLAR", 
			"PORCENTAJE", "AND", "OR", "PARENTESISIZQ", "PARENTESISDER", "COMA", 
			"PUNTO", "DOSPUNTOS", "AROBA", "BRACKETIZQ", "BRACKE5TDER", "SLASH", 
			"ELEVADO", "GUIONBAJO", "TILDEALREVES", "LLAVEIZQ", "LLAVEDER", "RABO", 
			"RELACIONALOP", "ADDITIVEOP", "MULTIPLICATIVEOP", "LITERAL", "INTLITERAL", 
			"REALLITERAL", "BOOLLITERAL", "STRINGLITERAL", "BLOCK_COMMENT", "LINE_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2]\u0327\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;"+
		"\3;\3<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E"+
		"\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P"+
		"\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3X\3X\3X\3X\5X\u0273"+
		"\nX\3Y\3Y\3Y\5Y\u0278\nY\3Z\3Z\3Z\5Z\u027d\nZ\3[\3[\3[\3[\5[\u0283\n["+
		"\3\\\3\\\7\\\u0287\n\\\f\\\16\\\u028a\13\\\3]\3]\7]\u028e\n]\f]\16]\u0291"+
		"\13]\3]\3]\7]\u0295\n]\f]\16]\u0298\13]\3]\3]\3]\7]\u029d\n]\f]\16]\u02a0"+
		"\13]\5]\u02a2\n]\3^\3^\5^\u02a6\n^\3_\3_\7_\u02aa\n_\f_\16_\u02ad\13_"+
		"\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u02d6\n`\3a\3a\3a"+
		"\3a\7a\u02dc\na\fa\16a\u02df\13a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u02ff\nb\3b\3"+
		"b\3c\6c\u0304\nc\rc\16c\u0305\3c\3c\3d\3d\7d\u030c\nd\fd\16d\u030f\13"+
		"d\3e\3e\3f\3f\3g\3g\5g\u0317\ng\3g\3g\3g\7g\u031c\ng\fg\16g\u031f\13g"+
		"\3h\3h\7h\u0323\nh\fh\16h\u0326\13h\3\u02dd\2i\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\64k\65m\2o\66q\67s8u9w\2y\2{\2}\2"+
		"\177\2\u0081:\u0083;\u0085<\u0087=\u0089>\u008b?\u008d@\u008fA\u0091B"+
		"\u0093C\u0095D\u0097E\u0099F\u009bG\u009dH\u009fI\u00a1J\u00a3K\u00a5"+
		"L\u00a7M\u00a9N\u00abO\u00adP\u00afQ\u00b1R\u00b3S\u00b5T\u00b7U\u00b9"+
		"V\u00bbW\u00bdX\u00bf\2\u00c1Y\u00c3Z\u00c5[\u00c7\2\u00c9\2\u00cb\2\u00cd"+
		"\\\u00cf]\3\2\4\5\2\13\f\17\17\"\"\4\2C\\c|\2\u035d\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\3\u00d1"+
		"\3\2\2\2\5\u00d4\3\2\2\2\7\u00d9\3\2\2\2\t\u00e0\3\2\2\2\13\u00e5\3\2"+
		"\2\2\r\u00ed\3\2\2\2\17\u00f0\3\2\2\2\21\u00f6\3\2\2\2\23\u00fa\3\2\2"+
		"\2\25\u0100\3\2\2\2\27\u0109\3\2\2\2\31\u010c\3\2\2\2\33\u0113\3\2\2\2"+
		"\35\u0119\3\2\2\2\37\u0122\3\2\2\2!\u0127\3\2\2\2#\u012c\3\2\2\2%\u0139"+
		"\3\2\2\2\'\u013f\3\2\2\2)\u0145\3\2\2\2+\u014d\3\2\2\2-\u0158\3\2\2\2"+
		"/\u0162\3\2\2\2\61\u0166\3\2\2\2\63\u016d\3\2\2\2\65\u0175\3\2\2\2\67"+
		"\u017c\3\2\2\29\u0181\3\2\2\2;\u0189\3\2\2\2=\u0191\3\2\2\2?\u019b\3\2"+
		"\2\2A\u01a2\3\2\2\2C\u01a6\3\2\2\2E\u01ac\3\2\2\2G\u01b4\3\2\2\2I\u01ba"+
		"\3\2\2\2K\u01c1\3\2\2\2M\u01c7\3\2\2\2O\u01d2\3\2\2\2Q\u01db\3\2\2\2S"+
		"\u01e2\3\2\2\2U\u01e9\3\2\2\2W\u01f1\3\2\2\2Y\u01f6\3\2\2\2[\u01fb\3\2"+
		"\2\2]\u0202\3\2\2\2_\u0208\3\2\2\2a\u020c\3\2\2\2c\u0211\3\2\2\2e\u0217"+
		"\3\2\2\2g\u021c\3\2\2\2i\u0222\3\2\2\2k\u0224\3\2\2\2m\u0226\3\2\2\2o"+
		"\u0229\3\2\2\2q\u022b\3\2\2\2s\u022d\3\2\2\2u\u022f\3\2\2\2w\u0231\3\2"+
		"\2\2y\u0234\3\2\2\2{\u0236\3\2\2\2}\u0239\3\2\2\2\177\u023b\3\2\2\2\u0081"+
		"\u023e\3\2\2\2\u0083\u0240\3\2\2\2\u0085\u0242\3\2\2\2\u0087\u0244\3\2"+
		"\2\2\u0089\u0246\3\2\2\2\u008b\u0248\3\2\2\2\u008d\u024a\3\2\2\2\u008f"+
		"\u024c\3\2\2\2\u0091\u024e\3\2\2\2\u0093\u0250\3\2\2\2\u0095\u0252\3\2"+
		"\2\2\u0097\u0254\3\2\2\2\u0099\u0256\3\2\2\2\u009b\u0258\3\2\2\2\u009d"+
		"\u025a\3\2\2\2\u009f\u025c\3\2\2\2\u00a1\u025e\3\2\2\2\u00a3\u0260\3\2"+
		"\2\2\u00a5\u0262\3\2\2\2\u00a7\u0264\3\2\2\2\u00a9\u0266\3\2\2\2\u00ab"+
		"\u0268\3\2\2\2\u00ad\u026a\3\2\2\2\u00af\u0272\3\2\2\2\u00b1\u0277\3\2"+
		"\2\2\u00b3\u027c\3\2\2\2\u00b5\u0282\3\2\2\2\u00b7\u0284\3\2\2\2\u00b9"+
		"\u02a1\3\2\2\2\u00bb\u02a5\3\2\2\2\u00bd\u02a7\3\2\2\2\u00bf\u02d5\3\2"+
		"\2\2\u00c1\u02d7\3\2\2\2\u00c3\u02e5\3\2\2\2\u00c5\u0303\3\2\2\2\u00c7"+
		"\u030d\3\2\2\2\u00c9\u0310\3\2\2\2\u00cb\u0312\3\2\2\2\u00cd\u0316\3\2"+
		"\2\2\u00cf\u0320\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7h\2\2\u00d3\4"+
		"\3\2\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\6\3\2\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7y\2\2\u00db"+
		"\u00dc\7k\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7j\2\2"+
		"\u00df\b\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7u"+
		"\2\2\u00e3\u00e4\7g\2\2\u00e4\n\3\2\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7w\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7v\2\2\u00ec\f\3\2\2\2\u00ed\u00ee\7f\2\2\u00ee"+
		"\u00ef\7q\2\2\u00ef\16\3\2\2\2\u00f0\u00f1\7y\2\2\u00f1\u00f2\7j\2\2\u00f2"+
		"\u00f3\7k\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5\20\3\2\2\2\u00f6"+
		"\u00f7\7h\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7t\2\2\u00f9\22\3\2\2\2\u00fa"+
		"\u00fb\7d\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7c\2\2"+
		"\u00fe\u00ff\7m\2\2\u00ff\24\3\2\2\2\u0100\u0101\7e\2\2\u0101\u0102\7"+
		"q\2\2\u0102\u0103\7p\2\2\u0103\u0104\7v\2\2\u0104\u0105\7k\2\2\u0105\u0106"+
		"\7p\2\2\u0106\u0107\7w\2\2\u0107\u0108\7g\2\2\u0108\26\3\2\2\2\u0109\u010a"+
		"\7k\2\2\u010a\u010b\7p\2\2\u010b\30\3\2\2\2\u010c\u010d\7t\2\2\u010d\u010e"+
		"\7g\2\2\u010e\u010f\7v\2\2\u010f\u0110\7w\2\2\u0110\u0111\7t\2\2\u0111"+
		"\u0112\7p\2\2\u0112\32\3\2\2\2\u0113\u0114\7r\2\2\u0114\u0115\7t\2\2\u0115"+
		"\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7v\2\2\u0118\34\3\2\2\2\u0119"+
		"\u011a\7c\2\2\u011a\u011b\7d\2\2\u011b\u011c\7u\2\2\u011c\u011d\7v\2\2"+
		"\u011d\u011e\7t\2\2\u011e\u011f\7c\2\2\u011f\u0120\7e\2\2\u0120\u0121"+
		"\7v\2\2\u0121\36\3\2\2\2\u0122\u0123\7g\2\2\u0123\u0124\7p\2\2\u0124\u0125"+
		"\7w\2\2\u0125\u0126\7o\2\2\u0126 \3\2\2\2\u0127\u0128\7v\2\2\u0128\u0129"+
		"\7j\2\2\u0129\u012a\7k\2\2\u012a\u012b\7u\2\2\u012b\"\3\2\2\2\u012c\u012d"+
		"\7u\2\2\u012d\u012e\7{\2\2\u012e\u012f\7p\2\2\u012f\u0130\7e\2\2\u0130"+
		"\u0131\7j\2\2\u0131\u0132\7t\2\2\u0132\u0133\7q\2\2\u0133\u0134\7p\2\2"+
		"\u0134\u0135\7k\2\2\u0135\u0136\7|\2\2\u0136\u0137\7g\2\2\u0137\u0138"+
		"\7f\2\2\u0138$\3\2\2\2\u0139\u013a\7e\2\2\u013a\u013b\7n\2\2\u013b\u013c"+
		"\7c\2\2\u013c\u013d\7u\2\2\u013d\u013e\7u\2\2\u013e&\3\2\2\2\u013f\u0140"+
		"\7u\2\2\u0140\u0141\7w\2\2\u0141\u0142\7r\2\2\u0142\u0143\7g\2\2\u0143"+
		"\u0144\7t\2\2\u0144(\3\2\2\2\u0145\u0146\7g\2\2\u0146\u0147\7z\2\2\u0147"+
		"\u0148\7v\2\2\u0148\u0149\7g\2\2\u0149\u014a\7p\2\2\u014a\u014b\7f\2\2"+
		"\u014b\u014c\7u\2\2\u014c*\3\2\2\2\u014d\u014e\7k\2\2\u014e\u014f\7o\2"+
		"\2\u014f\u0150\7r\2\2\u0150\u0151\7n\2\2\u0151\u0152\7g\2\2\u0152\u0153"+
		"\7o\2\2\u0153\u0154\7g\2\2\u0154\u0155\7p\2\2\u0155\u0156\7v\2\2\u0156"+
		"\u0157\7u\2\2\u0157,\3\2\2\2\u0158\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a"+
		"\u015b\7v\2\2\u015b\u015c\7g\2\2\u015c\u015d\7t\2\2\u015d\u015e\7h\2\2"+
		"\u015e\u015f\7c\2\2\u015f\u0160\7e\2\2\u0160\u0161\7g\2\2\u0161.\3\2\2"+
		"\2\u0162\u0163\7p\2\2\u0163\u0164\7g\2\2\u0164\u0165\7y\2\2\u0165\60\3"+
		"\2\2\2\u0166\u0167\7k\2\2\u0167\u0168\7o\2\2\u0168\u0169\7r\2\2\u0169"+
		"\u016a\7q\2\2\u016a\u016b\7t\2\2\u016b\u016c\7v\2\2\u016c\62\3\2\2\2\u016d"+
		"\u016e\7r\2\2\u016e\u016f\7c\2\2\u016f\u0170\7e\2\2\u0170\u0171\7m\2\2"+
		"\u0171\u0172\7c\2\2\u0172\u0173\7i\2\2\u0173\u0174\7g\2\2\u0174\64\3\2"+
		"\2\2\u0175\u0176\7p\2\2\u0176\u0177\7c\2\2\u0177\u0178\7v\2\2\u0178\u0179"+
		"\7k\2\2\u0179\u017a\7x\2\2\u017a\u017b\7g\2\2\u017b\66\3\2\2\2\u017c\u017d"+
		"\7x\2\2\u017d\u017e\7q\2\2\u017e\u017f\7k\2\2\u017f\u0180\7f\2\2\u0180"+
		"8\3\2\2\2\u0181\u0182\7\"\2\2\u0182\u0183\7r\2\2\u0183\u0184\7w\2\2\u0184"+
		"\u0185\7d\2\2\u0185\u0186\7n\2\2\u0186\u0187\7k\2\2\u0187\u0188\7e\2\2"+
		"\u0188:\3\2\2\2\u0189\u018a\7r\2\2\u018a\u018b\7t\2\2\u018b\u018c\7k\2"+
		"\2\u018c\u018d\7x\2\2\u018d\u018e\7c\2\2\u018e\u018f\7v\2\2\u018f\u0190"+
		"\7g\2\2\u0190<\3\2\2\2\u0191\u0192\7r\2\2\u0192\u0193\7t\2\2\u0193\u0194"+
		"\7q\2\2\u0194\u0195\7v\2\2\u0195\u0196\7g\2\2\u0196\u0197\7e\2\2\u0197"+
		"\u0198\7v\2\2\u0198\u0199\7g\2\2\u0199\u019a\7f\2\2\u019a>\3\2\2\2\u019b"+
		"\u019c\7u\2\2\u019c\u019d\7v\2\2\u019d\u019e\7c\2\2\u019e\u019f\7v\2\2"+
		"\u019f\u01a0\7k\2\2\u01a0\u01a1\7e\2\2\u01a1@\3\2\2\2\u01a2\u01a3\7v\2"+
		"\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7{\2\2\u01a5B\3\2\2\2\u01a6\u01a7\7"+
		"e\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa\7e\2\2\u01aa\u01ab"+
		"\7j\2\2\u01abD\3\2\2\2\u01ac\u01ad\7h\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af"+
		"\7p\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7n\2\2\u01b1\u01b2\7n\2\2\u01b2"+
		"\u01b3\7{\2\2\u01b3F\3\2\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7j\2\2\u01b6"+
		"\u01b7\7t\2\2\u01b7\u01b8\7q\2\2\u01b8\u01b9\7y\2\2\u01b9H\3\2\2\2\u01ba"+
		"\u01bb\7v\2\2\u01bb\u01bc\7j\2\2\u01bc\u01bd\7t\2\2\u01bd\u01be\7q\2\2"+
		"\u01be\u01bf\7y\2\2\u01bf\u01c0\7u\2\2\u01c0J\3\2\2\2\u01c1\u01c2\7h\2"+
		"\2\u01c2\u01c3\7k\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6"+
		"\7n\2\2\u01c6L\3\2\2\2\u01c7\u01c8\7k\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca"+
		"\7u\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7p\2\2\u01cd"+
		"\u01ce\7e\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d0\7q\2\2\u01d0\u01d1\7h\2\2"+
		"\u01d1N\3\2\2\2\u01d2\u01d3\7x\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7n\2"+
		"\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7v\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9"+
		"\7n\2\2\u01d9\u01da\7g\2\2\u01daP\3\2\2\2\u01db\u01dc\7n\2\2\u01dc\u01dd"+
		"\7g\2\2\u01dd\u01de\7p\2\2\u01de\u01df\7i\2\2\u01df\u01e0\7j\2\2\u01e0"+
		"\u01e1\7v\2\2\u01e1R\3\2\2\2\u01e2\u01e3\7u\2\2\u01e3\u01e4\7v\2\2\u01e4"+
		"\u01e5\7t\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7\7p\2\2\u01e7\u01e8\7i\2\2"+
		"\u01e8T\3\2\2\2\u01e9\u01ea\7d\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ec\7q\2"+
		"\2\u01ec\u01ed\7n\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef\7c\2\2\u01ef\u01f0"+
		"\7p\2\2\u01f0V\3\2\2\2\u01f1\u01f2\7d\2\2\u01f2\u01f3\7{\2\2\u01f3\u01f4"+
		"\7v\2\2\u01f4\u01f5\7g\2\2\u01f5X\3\2\2\2\u01f6\u01f7\7e\2\2\u01f7\u01f8"+
		"\7j\2\2\u01f8\u01f9\7c\2\2\u01f9\u01fa\7t\2\2\u01faZ\3\2\2\2\u01fb\u01fc"+
		"\7f\2\2\u01fc\u01fd\7q\2\2\u01fd\u01fe\7w\2\2\u01fe\u01ff\7d\2\2\u01ff"+
		"\u0200\7n\2\2\u0200\u0201\7g\2\2\u0201\\\3\2\2\2\u0202\u0203\7h\2\2\u0203"+
		"\u0204\7n\2\2\u0204\u0205\7q\2\2\u0205\u0206\7c\2\2\u0206\u0207\7v\2\2"+
		"\u0207^\3\2\2\2\u0208\u0209\7k\2\2\u0209\u020a\7p\2\2\u020a\u020b\7v\2"+
		"\2\u020b`\3\2\2\2\u020c\u020d\7n\2\2\u020d\u020e\7q\2\2\u020e\u020f\7"+
		"p\2\2\u020f\u0210\7i\2\2\u0210b\3\2\2\2\u0211\u0212\7u\2\2\u0212\u0213"+
		"\7j\2\2\u0213\u0214\7q\2\2\u0214\u0215\7t\2\2\u0215\u0216\7v\2\2\u0216"+
		"d\3\2\2\2\u0217\u0218\7v\2\2\u0218\u0219\7t\2\2\u0219\u021a\7w\2\2\u021a"+
		"\u021b\7g\2\2\u021bf\3\2\2\2\u021c\u021d\7h\2\2\u021d\u021e\7c\2\2\u021e"+
		"\u021f\7n\2\2\u021f\u0220\7u\2\2\u0220\u0221\7g\2\2\u0221h\3\2\2\2\u0222"+
		"\u0223\7=\2\2\u0223j\3\2\2\2\u0224\u0225\7?\2\2\u0225l\3\2\2\2\u0226\u0227"+
		"\7?\2\2\u0227\u0228\7?\2\2\u0228n\3\2\2\2\u0229\u022a\7-\2\2\u022ap\3"+
		"\2\2\2\u022b\u022c\7/\2\2\u022cr\3\2\2\2\u022d\u022e\7\61\2\2\u022et\3"+
		"\2\2\2\u022f\u0230\7,\2\2\u0230v\3\2\2\2\u0231\u0232\7#\2\2\u0232\u0233"+
		"\7?\2\2\u0233x\3\2\2\2\u0234\u0235\7@\2\2\u0235z\3\2\2\2\u0236\u0237\7"+
		"@\2\2\u0237\u0238\7?\2\2\u0238|\3\2\2\2\u0239\u023a\7>\2\2\u023a~\3\2"+
		"\2\2\u023b\u023c\7>\2\2\u023c\u023d\7?\2\2\u023d\u0080\3\2\2\2\u023e\u023f"+
		"\7#\2\2\u023f\u0082\3\2\2\2\u0240\u0241\7A\2\2\u0241\u0084\3\2\2\2\u0242"+
		"\u0243\7$\2\2\u0243\u0086\3\2\2\2\u0244\u0245\7%\2\2\u0245\u0088\3\2\2"+
		"\2\u0246\u0247\7&\2\2\u0247\u008a\3\2\2\2\u0248\u0249\7\'\2\2\u0249\u008c"+
		"\3\2\2\2\u024a\u024b\7(\2\2\u024b\u008e\3\2\2\2\u024c\u024d\7~\2\2\u024d"+
		"\u0090\3\2\2\2\u024e\u024f\7*\2\2\u024f\u0092\3\2\2\2\u0250\u0251\7+\2"+
		"\2\u0251\u0094\3\2\2\2\u0252\u0253\7.\2\2\u0253\u0096\3\2\2\2\u0254\u0255"+
		"\7\60\2\2\u0255\u0098\3\2\2\2\u0256\u0257\7<\2\2\u0257\u009a\3\2\2\2\u0258"+
		"\u0259\7B\2\2\u0259\u009c\3\2\2\2\u025a\u025b\7]\2\2\u025b\u009e\3\2\2"+
		"\2\u025c\u025d\7_\2\2\u025d\u00a0\3\2\2\2\u025e\u025f\7^\2\2\u025f\u00a2"+
		"\3\2\2\2\u0260\u0261\7`\2\2\u0261\u00a4\3\2\2\2\u0262\u0263\7a\2\2\u0263"+
		"\u00a6\3\2\2\2\u0264\u0265\7b\2\2\u0265\u00a8\3\2\2\2\u0266\u0267\7}\2"+
		"\2\u0267\u00aa\3\2\2\2\u0268\u0269\7\177\2\2\u0269\u00ac\3\2\2\2\u026a"+
		"\u026b\7\u0080\2\2\u026b\u00ae\3\2\2\2\u026c\u0273\5y=\2\u026d\u0273\5"+
		"{>\2\u026e\u0273\5}?\2\u026f\u0273\5\177@\2\u0270\u0273\5m\67\2\u0271"+
		"\u0273\5w<\2\u0272\u026c\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u026e\3\2\2"+
		"\2\u0272\u026f\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273\u00b0"+
		"\3\2\2\2\u0274\u0278\5o8\2\u0275\u0278\5q9\2\u0276\u0278\5\u008fH\2\u0277"+
		"\u0274\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278\u00b2\3\2"+
		"\2\2\u0279\u027d\5u;\2\u027a\u027d\5s:\2\u027b\u027d\5\u008dG\2\u027c"+
		"\u0279\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027b\3\2\2\2\u027d\u00b4\3\2"+
		"\2\2\u027e\u0283\5\u00b7\\\2\u027f\u0283\5\u00b9]\2\u0280\u0283\5\u00bb"+
		"^\2\u0281\u0283\5\u00bd_\2\u0282\u027e\3\2\2\2\u0282\u027f\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283\u00b6\3\2\2\2\u0284\u0288\5\u00cb"+
		"f\2\u0285\u0287\5\u00cbf\2\u0286\u0285\3\2\2\2\u0287\u028a\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u00b8\3\2\2\2\u028a\u0288\3\2"+
		"\2\2\u028b\u028f\5\u00cbf\2\u028c\u028e\5\u00cbf\2\u028d\u028c\3\2\2\2"+
		"\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292"+
		"\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0296\5\u0097L\2\u0293\u0295\5\u00cb"+
		"f\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u02a2\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\5\u0097"+
		"L\2\u029a\u029e\5\u00cbf\2\u029b\u029d\5\u00cbf\2\u029c\u029b\3\2\2\2"+
		"\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a2"+
		"\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u028b\3\2\2\2\u02a1\u0299\3\2\2\2\u02a2"+
		"\u00ba\3\2\2\2\u02a3\u02a6\5e\63\2\u02a4\u02a6\5g\64\2\u02a5\u02a3\3\2"+
		"\2\2\u02a5\u02a4\3\2\2\2\u02a6\u00bc\3\2\2\2\u02a7\u02ab\5\u0085C\2\u02a8"+
		"\u02aa\5\u00bf`\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae"+
		"\u02af\5\u0085C\2\u02af\u00be\3\2\2\2\u02b0\u02d6\5\u00cbf\2\u02b1\u02d6"+
		"\5\u00c9e\2\u02b2\u02d6\5\u00c5c\2\u02b3\u02d6\5i\65\2\u02b4\u02d6\5k"+
		"\66\2\u02b5\u02d6\5m\67\2\u02b6\u02d6\5o8\2\u02b7\u02d6\5q9\2\u02b8\u02d6"+
		"\5s:\2\u02b9\u02d6\5u;\2\u02ba\u02d6\5w<\2\u02bb\u02d6\5y=\2\u02bc\u02d6"+
		"\5{>\2\u02bd\u02d6\5}?\2\u02be\u02d6\5\177@\2\u02bf\u02d6\5\u0081A\2\u02c0"+
		"\u02d6\5\u0083B\2\u02c1\u02d6\5\u0085C\2\u02c2\u02d6\5\u0087D\2\u02c3"+
		"\u02d6\5\u0089E\2\u02c4\u02d6\5\u008bF\2\u02c5\u02d6\5\u008dG\2\u02c6"+
		"\u02d6\5\u008fH\2\u02c7\u02d6\5\u0091I\2\u02c8\u02d6\5\u0093J\2\u02c9"+
		"\u02d6\5\u0095K\2\u02ca\u02d6\5\u0097L\2\u02cb\u02d6\5\u0099M\2\u02cc"+
		"\u02d6\5\u009bN\2\u02cd\u02d6\5\u009fP\2\u02ce\u02d6\5\u009dO\2\u02cf"+
		"\u02d6\5\u00a3R\2\u02d0\u02d6\5\u00a5S\2\u02d1\u02d6\5\u00a7T\2\u02d2"+
		"\u02d6\5\u00a9U\2\u02d3\u02d6\5\u00abV\2\u02d4\u02d6\5\u00adW\2\u02d5"+
		"\u02b0\3\2\2\2\u02d5\u02b1\3\2\2\2\u02d5\u02b2\3\2\2\2\u02d5\u02b3\3\2"+
		"\2\2\u02d5\u02b4\3\2\2\2\u02d5\u02b5\3\2\2\2\u02d5\u02b6\3\2\2\2\u02d5"+
		"\u02b7\3\2\2\2\u02d5\u02b8\3\2\2\2\u02d5\u02b9\3\2\2\2\u02d5\u02ba\3\2"+
		"\2\2\u02d5\u02bb\3\2\2\2\u02d5\u02bc\3\2\2\2\u02d5\u02bd\3\2\2\2\u02d5"+
		"\u02be\3\2\2\2\u02d5\u02bf\3\2\2\2\u02d5\u02c0\3\2\2\2\u02d5\u02c1\3\2"+
		"\2\2\u02d5\u02c2\3\2\2\2\u02d5\u02c3\3\2\2\2\u02d5\u02c4\3\2\2\2\u02d5"+
		"\u02c5\3\2\2\2\u02d5\u02c6\3\2\2\2\u02d5\u02c7\3\2\2\2\u02d5\u02c8\3\2"+
		"\2\2\u02d5\u02c9\3\2\2\2\u02d5\u02ca\3\2\2\2\u02d5\u02cb\3\2\2\2\u02d5"+
		"\u02cc\3\2\2\2\u02d5\u02cd\3\2\2\2\u02d5\u02ce\3\2\2\2\u02d5\u02cf\3\2"+
		"\2\2\u02d5\u02d0\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d5\u02d2\3\2\2\2\u02d5"+
		"\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\u00c0\3\2\2\2\u02d7\u02d8\7\61"+
		"\2\2\u02d8\u02d9\7,\2\2\u02d9\u02dd\3\2\2\2\u02da\u02dc\13\2\2\2\u02db"+
		"\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02de\3\2\2\2\u02dd\u02db\3\2"+
		"\2\2\u02de\u02e0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\7,\2\2\u02e1"+
		"\u02e2\7\61\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\ba\2\2\u02e4\u00c2\3\2"+
		"\2\2\u02e5\u02e6\7\61\2\2\u02e6\u02e7\7\61\2\2\u02e7\u02fe\3\2\2\2\u02e8"+
		"\u02ff\5\u00c9e\2\u02e9\u02ff\5\u00cbf\2\u02ea\u02ff\t\2\2\2\u02eb\u02ec"+
		"\7B\2\2\u02ec\u02ed\7%\2\2\u02ed\u02ee\7&\2\2\u02ee\u02ef\7\'\2\2\u02ef"+
		"\u02f0\7`\2\2\u02f0\u02f1\7(\2\2\u02f1\u02f2\7#\2\2\u02f2\u02f3\7a\2\2"+
		"\u02f3\u02f4\7/\2\2\u02f4\u02f5\7-\2\2\u02f5\u02f6\7?\2\2\u02f6\u02f7"+
		"\7\60\2\2\u02f7\u02f8\7.\2\2\u02f8\u02f9\7@\2\2\u02f9\u02fa\7>\2\2\u02fa"+
		"\u02fb\7A\2\2\u02fb\u02fc\7\61\2\2\u02fc\u02fd\7b\2\2\u02fd\u02ff\7$\2"+
		"\2\u02fe\u02e8\3\2\2\2\u02fe\u02e9\3\2\2\2\u02fe\u02ea\3\2\2\2\u02fe\u02eb"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\bb\3\2\u0301\u00c4\3\2\2\2\u0302"+
		"\u0304\t\2\2\2\u0303\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0303\3\2"+
		"\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\bc\3\2\u0308"+
		"\u00c6\3\2\2\2\u0309\u030c\5\u00cbf\2\u030a\u030c\5\u00cbf\2\u030b\u0309"+
		"\3\2\2\2\u030b\u030a\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u00c8\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311\t\3"+
		"\2\2\u0311\u00ca\3\2\2\2\u0312\u0313\4\62;\2\u0313\u00cc\3\2\2\2\u0314"+
		"\u0317\5\u00a5S\2\u0315\u0317\5\u00c9e\2\u0316\u0314\3\2\2\2\u0316\u0315"+
		"\3\2\2\2\u0317\u031d\3\2\2\2\u0318\u031c\5\u00a5S\2\u0319\u031c\5\u00c9"+
		"e\2\u031a\u031c\5\u00cbf\2\u031b\u0318\3\2\2\2\u031b\u0319\3\2\2\2\u031b"+
		"\u031a\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2"+
		"\2\2\u031e\u00ce\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0324\5\u00cbf\2\u0321"+
		"\u0323\5\u00cbf\2\u0322\u0321\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322"+
		"\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u00d0\3\2\2\2\u0326\u0324\3\2\2\2\30"+
		"\2\u0272\u0277\u027c\u0282\u0288\u028f\u0296\u029e\u02a1\u02a5\u02ab\u02d5"+
		"\u02dd\u02fe\u0305\u030b\u030d\u0316\u031b\u031d\u0324\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}