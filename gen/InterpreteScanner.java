// Generated from C:/Users/edubi/OneDrive - Estudiantes ITCR/Quinto Semestre/Compiladores e interpretes/Proyectos/Proyecto 1/backend\InterpreteScanner.g4 by ANTLR 4.9.1
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
		FINAL=37, INSTANCEOF=38, VOLATILE=39, LENGHT=40, STRING=41, BOOLEAN=42, 
		BYTE=43, CHAR=44, DOUBLE=45, FLOAT=46, INT=47, LONG=48, SHORT=49, TRUE=50, 
		FALSE=51, PyCOMA=52, ASYGN=53, EQUALS=54, SUM=55, RES=56, DIV=57, MUL=58, 
		DIF=59, MAYOR=60, MAYORIGUAL=61, MENOR=62, MENORIGUAL=63, ADMIRACION=64, 
		PREGUNTA=65, DOBLECOMILLA=66, NUMERAL=67, DOLAR=68, PORCENTAJE=69, AND=70, 
		OR=71, PARENTESISIZQ=72, PARENTESISDER=73, COMA=74, PUNTO=75, DOSPUNTOS=76, 
		AROBA=77, BRACKETIZQ=78, BRACKE5TDER=79, ELEVADO=80, GUIONBAJO=81, TILDEALREVES=82, 
		LLAVEIZQ=83, LLAVEDER=84, RABO=85, RELACIONALOP=86, ADDITIVEOP=87, MULTIPLICATIVEOP=88, 
		LITERAL=89, INTLITERAL=90, REALLITERAL=91, BOOLLITEAL=92, STRINGLITERAL=93, 
		BLOCK_COMMENT=94, LINE_COMMENT=95, WS=96, ID=97, NUM=98;
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
			"VOLATILE", "LENGHT", "STRING", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", 
			"FLOAT", "INT", "LONG", "SHORT", "TRUE", "FALSE", "PyCOMA", "ASYGN", 
			"EQUALS", "SUM", "RES", "DIV", "MUL", "DIF", "MAYOR", "MAYORIGUAL", "MENOR", 
			"MENORIGUAL", "ADMIRACION", "PREGUNTA", "DOBLECOMILLA", "NUMERAL", "DOLAR", 
			"PORCENTAJE", "AND", "OR", "PARENTESISIZQ", "PARENTESISDER", "COMA", 
			"PUNTO", "DOSPUNTOS", "AROBA", "BRACKETIZQ", "BRACKE5TDER", "ELEVADO", 
			"GUIONBAJO", "TILDEALREVES", "LLAVEIZQ", "LLAVEDER", "RABO", "RELACIONALOP", 
			"ADDITIVEOP", "MULTIPLICATIVEOP", "LITERAL", "INTLITERAL", "REALLITERAL", 
			"BOOLLITEAL", "STRINGLITERAL", "BLOCK_COMMENT", "LINE_COMMENT", "WS", 
			"NUMBER", "LETTER", "DIGIT", "PRINTABLE", "ID", "NUM"
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
			"'double'", "'float'", "'int'", "'long'", "'short'", "'true'", "'false'", 
			"';'", "'='", "'=='", "'+'", "'-'", "'/'", "'*'", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'!'", "'?'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'|'", 
			"'('", "')'", "','", "'.'", "':'", "'@'", "'['", "']'", "'^'", "'_'", 
			"'`'", "'{'", "'}'", "'~'"
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
			"VOLATILE", "LENGHT", "STRING", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", 
			"FLOAT", "INT", "LONG", "SHORT", "TRUE", "FALSE", "PyCOMA", "ASYGN", 
			"EQUALS", "SUM", "RES", "DIV", "MUL", "DIF", "MAYOR", "MAYORIGUAL", "MENOR", 
			"MENORIGUAL", "ADMIRACION", "PREGUNTA", "DOBLECOMILLA", "NUMERAL", "DOLAR", 
			"PORCENTAJE", "AND", "OR", "PARENTESISIZQ", "PARENTESISDER", "COMA", 
			"PUNTO", "DOSPUNTOS", "AROBA", "BRACKETIZQ", "BRACKE5TDER", "ELEVADO", 
			"GUIONBAJO", "TILDEALREVES", "LLAVEIZQ", "LLAVEDER", "RABO", "RELACIONALOP", 
			"ADDITIVEOP", "MULTIPLICATIVEOP", "LITERAL", "INTLITERAL", "REALLITERAL", 
			"BOOLLITEAL", "STRINGLITERAL", "BLOCK_COMMENT", "LINE_COMMENT", "WS", 
			"ID", "NUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2d\u0324\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3."+
		"\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3"+
		"F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3"+
		"Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3W\3W\3W\3W\5W\u026f\nW\3X\3X\3"+
		"X\5X\u0274\nX\3Y\3Y\3Y\5Y\u0279\nY\3Z\3Z\3Z\3Z\5Z\u027f\nZ\3[\3[\7[\u0283"+
		"\n[\f[\16[\u0286\13[\3\\\3\\\7\\\u028a\n\\\f\\\16\\\u028d\13\\\3\\\3\\"+
		"\7\\\u0291\n\\\f\\\16\\\u0294\13\\\3\\\3\\\3\\\7\\\u0299\n\\\f\\\16\\"+
		"\u029c\13\\\5\\\u029e\n\\\3]\3]\5]\u02a2\n]\3^\3^\7^\u02a6\n^\f^\16^\u02a9"+
		"\13^\3^\3^\3_\3_\3_\3_\7_\u02b1\n_\f_\16_\u02b4\13_\3_\3_\3_\3_\3_\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\5`\u02d4\n`\3`\3`\3a\6a\u02d9\na\ra\16a\u02da\3a\3a\3b\3b\7b\u02e1"+
		"\nb\fb\16b\u02e4\13b\3c\3c\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\5e\u0310\ne\3f\3f\5f\u0314\nf\3f\3f\3f\7f\u0319\nf\ff\16f\u031c"+
		"\13f\3g\3g\7g\u0320\ng\fg\16g\u0323\13g\3\u02b2\2h\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7"+
		"U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb"+
		"_\u00bd`\u00bfa\u00c1b\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cbc\u00cdd\3"+
		"\2\4\5\2\13\f\17\17\"\"\4\2C\\c|\2\u0363\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\3\u00cf"+
		"\3\2\2\2\5\u00d2\3\2\2\2\7\u00d7\3\2\2\2\t\u00de\3\2\2\2\13\u00e3\3\2"+
		"\2\2\r\u00eb\3\2\2\2\17\u00ee\3\2\2\2\21\u00f4\3\2\2\2\23\u00f8\3\2\2"+
		"\2\25\u00fe\3\2\2\2\27\u0107\3\2\2\2\31\u010a\3\2\2\2\33\u0111\3\2\2\2"+
		"\35\u0117\3\2\2\2\37\u0120\3\2\2\2!\u0125\3\2\2\2#\u012a\3\2\2\2%\u0137"+
		"\3\2\2\2\'\u013d\3\2\2\2)\u0143\3\2\2\2+\u014b\3\2\2\2-\u0156\3\2\2\2"+
		"/\u0160\3\2\2\2\61\u0164\3\2\2\2\63\u016b\3\2\2\2\65\u0173\3\2\2\2\67"+
		"\u017a\3\2\2\29\u017f\3\2\2\2;\u0187\3\2\2\2=\u018f\3\2\2\2?\u0199\3\2"+
		"\2\2A\u01a0\3\2\2\2C\u01a4\3\2\2\2E\u01aa\3\2\2\2G\u01b2\3\2\2\2I\u01b8"+
		"\3\2\2\2K\u01bf\3\2\2\2M\u01c5\3\2\2\2O\u01d0\3\2\2\2Q\u01d9\3\2\2\2S"+
		"\u01e0\3\2\2\2U\u01e7\3\2\2\2W\u01ef\3\2\2\2Y\u01f4\3\2\2\2[\u01f9\3\2"+
		"\2\2]\u0200\3\2\2\2_\u0206\3\2\2\2a\u020a\3\2\2\2c\u020f\3\2\2\2e\u0215"+
		"\3\2\2\2g\u021a\3\2\2\2i\u0220\3\2\2\2k\u0222\3\2\2\2m\u0224\3\2\2\2o"+
		"\u0227\3\2\2\2q\u0229\3\2\2\2s\u022b\3\2\2\2u\u022d\3\2\2\2w\u022f\3\2"+
		"\2\2y\u0232\3\2\2\2{\u0234\3\2\2\2}\u0237\3\2\2\2\177\u0239\3\2\2\2\u0081"+
		"\u023c\3\2\2\2\u0083\u023e\3\2\2\2\u0085\u0240\3\2\2\2\u0087\u0242\3\2"+
		"\2\2\u0089\u0244\3\2\2\2\u008b\u0246\3\2\2\2\u008d\u0248\3\2\2\2\u008f"+
		"\u024a\3\2\2\2\u0091\u024c\3\2\2\2\u0093\u024e\3\2\2\2\u0095\u0250\3\2"+
		"\2\2\u0097\u0252\3\2\2\2\u0099\u0254\3\2\2\2\u009b\u0256\3\2\2\2\u009d"+
		"\u0258\3\2\2\2\u009f\u025a\3\2\2\2\u00a1\u025c\3\2\2\2\u00a3\u025e\3\2"+
		"\2\2\u00a5\u0260\3\2\2\2\u00a7\u0262\3\2\2\2\u00a9\u0264\3\2\2\2\u00ab"+
		"\u0266\3\2\2\2\u00ad\u026e\3\2\2\2\u00af\u0273\3\2\2\2\u00b1\u0278\3\2"+
		"\2\2\u00b3\u027e\3\2\2\2\u00b5\u0280\3\2\2\2\u00b7\u029d\3\2\2\2\u00b9"+
		"\u02a1\3\2\2\2\u00bb\u02a3\3\2\2\2\u00bd\u02ac\3\2\2\2\u00bf\u02ba\3\2"+
		"\2\2\u00c1\u02d8\3\2\2\2\u00c3\u02e2\3\2\2\2\u00c5\u02e5\3\2\2\2\u00c7"+
		"\u02e7\3\2\2\2\u00c9\u030f\3\2\2\2\u00cb\u0313\3\2\2\2\u00cd\u031d\3\2"+
		"\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7h\2\2\u00d1\4\3\2\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\6\3\2\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7k\2\2\u00da"+
		"\u00db\7v\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7j\2\2\u00dd\b\3\2\2\2\u00de"+
		"\u00df\7e\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2"+
		"\u00e2\n\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7h"+
		"\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea"+
		"\7v\2\2\u00ea\f\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7q\2\2\u00ed\16"+
		"\3\2\2\2\u00ee\u00ef\7y\2\2\u00ef\u00f0\7j\2\2\u00f0\u00f1\7k\2\2\u00f1"+
		"\u00f2\7n\2\2\u00f2\u00f3\7g\2\2\u00f3\20\3\2\2\2\u00f4\u00f5\7h\2\2\u00f5"+
		"\u00f6\7q\2\2\u00f6\u00f7\7t\2\2\u00f7\22\3\2\2\2\u00f8\u00f9\7d\2\2\u00f9"+
		"\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7m\2\2"+
		"\u00fd\24\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7"+
		"p\2\2\u0101\u0102\7v\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104\u0105"+
		"\7w\2\2\u0105\u0106\7g\2\2\u0106\26\3\2\2\2\u0107\u0108\7k\2\2\u0108\u0109"+
		"\7p\2\2\u0109\30\3\2\2\2\u010a\u010b\7t\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7v\2\2\u010d\u010e\7w\2\2\u010e\u010f\7t\2\2\u010f\u0110\7p\2\2\u0110"+
		"\32\3\2\2\2\u0111\u0112\7r\2\2\u0112\u0113\7t\2\2\u0113\u0114\7k\2\2\u0114"+
		"\u0115\7p\2\2\u0115\u0116\7v\2\2\u0116\34\3\2\2\2\u0117\u0118\7c\2\2\u0118"+
		"\u0119\7d\2\2\u0119\u011a\7u\2\2\u011a\u011b\7v\2\2\u011b\u011c\7t\2\2"+
		"\u011c\u011d\7c\2\2\u011d\u011e\7e\2\2\u011e\u011f\7v\2\2\u011f\36\3\2"+
		"\2\2\u0120\u0121\7g\2\2\u0121\u0122\7p\2\2\u0122\u0123\7w\2\2\u0123\u0124"+
		"\7o\2\2\u0124 \3\2\2\2\u0125\u0126\7v\2\2\u0126\u0127\7j\2\2\u0127\u0128"+
		"\7k\2\2\u0128\u0129\7u\2\2\u0129\"\3\2\2\2\u012a\u012b\7u\2\2\u012b\u012c"+
		"\7{\2\2\u012c\u012d\7p\2\2\u012d\u012e\7e\2\2\u012e\u012f\7j\2\2\u012f"+
		"\u0130\7t\2\2\u0130\u0131\7q\2\2\u0131\u0132\7p\2\2\u0132\u0133\7k\2\2"+
		"\u0133\u0134\7|\2\2\u0134\u0135\7g\2\2\u0135\u0136\7f\2\2\u0136$\3\2\2"+
		"\2\u0137\u0138\7e\2\2\u0138\u0139\7n\2\2\u0139\u013a\7c\2\2\u013a\u013b"+
		"\7u\2\2\u013b\u013c\7u\2\2\u013c&\3\2\2\2\u013d\u013e\7u\2\2\u013e\u013f"+
		"\7w\2\2\u013f\u0140\7r\2\2\u0140\u0141\7g\2\2\u0141\u0142\7t\2\2\u0142"+
		"(\3\2\2\2\u0143\u0144\7g\2\2\u0144\u0145\7z\2\2\u0145\u0146\7v\2\2\u0146"+
		"\u0147\7g\2\2\u0147\u0148\7p\2\2\u0148\u0149\7f\2\2\u0149\u014a\7u\2\2"+
		"\u014a*\3\2\2\2\u014b\u014c\7k\2\2\u014c\u014d\7o\2\2\u014d\u014e\7r\2"+
		"\2\u014e\u014f\7n\2\2\u014f\u0150\7g\2\2\u0150\u0151\7o\2\2\u0151\u0152"+
		"\7g\2\2\u0152\u0153\7p\2\2\u0153\u0154\7v\2\2\u0154\u0155\7u\2\2\u0155"+
		",\3\2\2\2\u0156\u0157\7k\2\2\u0157\u0158\7p\2\2\u0158\u0159\7v\2\2\u0159"+
		"\u015a\7g\2\2\u015a\u015b\7t\2\2\u015b\u015c\7h\2\2\u015c\u015d\7c\2\2"+
		"\u015d\u015e\7e\2\2\u015e\u015f\7g\2\2\u015f.\3\2\2\2\u0160\u0161\7p\2"+
		"\2\u0161\u0162\7g\2\2\u0162\u0163\7y\2\2\u0163\60\3\2\2\2\u0164\u0165"+
		"\7k\2\2\u0165\u0166\7o\2\2\u0166\u0167\7r\2\2\u0167\u0168\7q\2\2\u0168"+
		"\u0169\7t\2\2\u0169\u016a\7v\2\2\u016a\62\3\2\2\2\u016b\u016c\7r\2\2\u016c"+
		"\u016d\7c\2\2\u016d\u016e\7e\2\2\u016e\u016f\7m\2\2\u016f\u0170\7c\2\2"+
		"\u0170\u0171\7i\2\2\u0171\u0172\7g\2\2\u0172\64\3\2\2\2\u0173\u0174\7"+
		"p\2\2\u0174\u0175\7c\2\2\u0175\u0176\7v\2\2\u0176\u0177\7k\2\2\u0177\u0178"+
		"\7x\2\2\u0178\u0179\7g\2\2\u0179\66\3\2\2\2\u017a\u017b\7x\2\2\u017b\u017c"+
		"\7q\2\2\u017c\u017d\7k\2\2\u017d\u017e\7f\2\2\u017e8\3\2\2\2\u017f\u0180"+
		"\7\"\2\2\u0180\u0181\7r\2\2\u0181\u0182\7w\2\2\u0182\u0183\7d\2\2\u0183"+
		"\u0184\7n\2\2\u0184\u0185\7k\2\2\u0185\u0186\7e\2\2\u0186:\3\2\2\2\u0187"+
		"\u0188\7r\2\2\u0188\u0189\7t\2\2\u0189\u018a\7k\2\2\u018a\u018b\7x\2\2"+
		"\u018b\u018c\7c\2\2\u018c\u018d\7v\2\2\u018d\u018e\7g\2\2\u018e<\3\2\2"+
		"\2\u018f\u0190\7r\2\2\u0190\u0191\7t\2\2\u0191\u0192\7q\2\2\u0192\u0193"+
		"\7v\2\2\u0193\u0194\7g\2\2\u0194\u0195\7e\2\2\u0195\u0196\7v\2\2\u0196"+
		"\u0197\7g\2\2\u0197\u0198\7f\2\2\u0198>\3\2\2\2\u0199\u019a\7u\2\2\u019a"+
		"\u019b\7v\2\2\u019b\u019c\7c\2\2\u019c\u019d\7v\2\2\u019d\u019e\7k\2\2"+
		"\u019e\u019f\7e\2\2\u019f@\3\2\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2\7t\2"+
		"\2\u01a2\u01a3\7{\2\2\u01a3B\3\2\2\2\u01a4\u01a5\7e\2\2\u01a5\u01a6\7"+
		"c\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7e\2\2\u01a8\u01a9\7j\2\2\u01a9D"+
		"\3\2\2\2\u01aa\u01ab\7h\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7p\2\2\u01ad"+
		"\u01ae\7c\2\2\u01ae\u01af\7n\2\2\u01af\u01b0\7n\2\2\u01b0\u01b1\7{\2\2"+
		"\u01b1F\3\2\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7j\2\2\u01b4\u01b5\7t\2"+
		"\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7y\2\2\u01b7H\3\2\2\2\u01b8\u01b9\7"+
		"v\2\2\u01b9\u01ba\7j\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7q\2\2\u01bc\u01bd"+
		"\7y\2\2\u01bd\u01be\7u\2\2\u01beJ\3\2\2\2\u01bf\u01c0\7h\2\2\u01c0\u01c1"+
		"\7k\2\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4\7n\2\2\u01c4"+
		"L\3\2\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8\7u\2\2\u01c8"+
		"\u01c9\7v\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7p\2\2\u01cb\u01cc\7e\2\2"+
		"\u01cc\u01cd\7g\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7h\2\2\u01cfN\3\2\2"+
		"\2\u01d0\u01d1\7x\2\2\u01d1\u01d2\7q\2\2\u01d2\u01d3\7n\2\2\u01d3\u01d4"+
		"\7c\2\2\u01d4\u01d5\7v\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d7\7n\2\2\u01d7"+
		"\u01d8\7g\2\2\u01d8P\3\2\2\2\u01d9\u01da\7n\2\2\u01da\u01db\7g\2\2\u01db"+
		"\u01dc\7p\2\2\u01dc\u01dd\7i\2\2\u01dd\u01de\7j\2\2\u01de\u01df\7v\2\2"+
		"\u01dfR\3\2\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7t\2"+
		"\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6\7i\2\2\u01e6T\3\2"+
		"\2\2\u01e7\u01e8\7d\2\2\u01e8\u01e9\7q\2\2\u01e9\u01ea\7q\2\2\u01ea\u01eb"+
		"\7n\2\2\u01eb\u01ec\7g\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee\7p\2\2\u01ee"+
		"V\3\2\2\2\u01ef\u01f0\7d\2\2\u01f0\u01f1\7{\2\2\u01f1\u01f2\7v\2\2\u01f2"+
		"\u01f3\7g\2\2\u01f3X\3\2\2\2\u01f4\u01f5\7e\2\2\u01f5\u01f6\7j\2\2\u01f6"+
		"\u01f7\7c\2\2\u01f7\u01f8\7t\2\2\u01f8Z\3\2\2\2\u01f9\u01fa\7f\2\2\u01fa"+
		"\u01fb\7q\2\2\u01fb\u01fc\7w\2\2\u01fc\u01fd\7d\2\2\u01fd\u01fe\7n\2\2"+
		"\u01fe\u01ff\7g\2\2\u01ff\\\3\2\2\2\u0200\u0201\7h\2\2\u0201\u0202\7n"+
		"\2\2\u0202\u0203\7q\2\2\u0203\u0204\7c\2\2\u0204\u0205\7v\2\2\u0205^\3"+
		"\2\2\2\u0206\u0207\7k\2\2\u0207\u0208\7p\2\2\u0208\u0209\7v\2\2\u0209"+
		"`\3\2\2\2\u020a\u020b\7n\2\2\u020b\u020c\7q\2\2\u020c\u020d\7p\2\2\u020d"+
		"\u020e\7i\2\2\u020eb\3\2\2\2\u020f\u0210\7u\2\2\u0210\u0211\7j\2\2\u0211"+
		"\u0212\7q\2\2\u0212\u0213\7t\2\2\u0213\u0214\7v\2\2\u0214d\3\2\2\2\u0215"+
		"\u0216\7v\2\2\u0216\u0217\7t\2\2\u0217\u0218\7w\2\2\u0218\u0219\7g\2\2"+
		"\u0219f\3\2\2\2\u021a\u021b\7h\2\2\u021b\u021c\7c\2\2\u021c\u021d\7n\2"+
		"\2\u021d\u021e\7u\2\2\u021e\u021f\7g\2\2\u021fh\3\2\2\2\u0220\u0221\7"+
		"=\2\2\u0221j\3\2\2\2\u0222\u0223\7?\2\2\u0223l\3\2\2\2\u0224\u0225\7?"+
		"\2\2\u0225\u0226\7?\2\2\u0226n\3\2\2\2\u0227\u0228\7-\2\2\u0228p\3\2\2"+
		"\2\u0229\u022a\7/\2\2\u022ar\3\2\2\2\u022b\u022c\7\61\2\2\u022ct\3\2\2"+
		"\2\u022d\u022e\7,\2\2\u022ev\3\2\2\2\u022f\u0230\7#\2\2\u0230\u0231\7"+
		"?\2\2\u0231x\3\2\2\2\u0232\u0233\7@\2\2\u0233z\3\2\2\2\u0234\u0235\7@"+
		"\2\2\u0235\u0236\7?\2\2\u0236|\3\2\2\2\u0237\u0238\7>\2\2\u0238~\3\2\2"+
		"\2\u0239\u023a\7>\2\2\u023a\u023b\7?\2\2\u023b\u0080\3\2\2\2\u023c\u023d"+
		"\7#\2\2\u023d\u0082\3\2\2\2\u023e\u023f\7A\2\2\u023f\u0084\3\2\2\2\u0240"+
		"\u0241\7$\2\2\u0241\u0086\3\2\2\2\u0242\u0243\7%\2\2\u0243\u0088\3\2\2"+
		"\2\u0244\u0245\7&\2\2\u0245\u008a\3\2\2\2\u0246\u0247\7\'\2\2\u0247\u008c"+
		"\3\2\2\2\u0248\u0249\7(\2\2\u0249\u008e\3\2\2\2\u024a\u024b\7~\2\2\u024b"+
		"\u0090\3\2\2\2\u024c\u024d\7*\2\2\u024d\u0092\3\2\2\2\u024e\u024f\7+\2"+
		"\2\u024f\u0094\3\2\2\2\u0250\u0251\7.\2\2\u0251\u0096\3\2\2\2\u0252\u0253"+
		"\7\60\2\2\u0253\u0098\3\2\2\2\u0254\u0255\7<\2\2\u0255\u009a\3\2\2\2\u0256"+
		"\u0257\7B\2\2\u0257\u009c\3\2\2\2\u0258\u0259\7]\2\2\u0259\u009e\3\2\2"+
		"\2\u025a\u025b\7_\2\2\u025b\u00a0\3\2\2\2\u025c\u025d\7`\2\2\u025d\u00a2"+
		"\3\2\2\2\u025e\u025f\7a\2\2\u025f\u00a4\3\2\2\2\u0260\u0261\7b\2\2\u0261"+
		"\u00a6\3\2\2\2\u0262\u0263\7}\2\2\u0263\u00a8\3\2\2\2\u0264\u0265\7\177"+
		"\2\2\u0265\u00aa\3\2\2\2\u0266\u0267\7\u0080\2\2\u0267\u00ac\3\2\2\2\u0268"+
		"\u026f\5y=\2\u0269\u026f\5{>\2\u026a\u026f\5}?\2\u026b\u026f\5\177@\2"+
		"\u026c\u026f\5m\67\2\u026d\u026f\5w<\2\u026e\u0268\3\2\2\2\u026e\u0269"+
		"\3\2\2\2\u026e\u026a\3\2\2\2\u026e\u026b\3\2\2\2\u026e\u026c\3\2\2\2\u026e"+
		"\u026d\3\2\2\2\u026f\u00ae\3\2\2\2\u0270\u0274\5o8\2\u0271\u0274\5q9\2"+
		"\u0272\u0274\5\u008fH\2\u0273\u0270\3\2\2\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0272\3\2\2\2\u0274\u00b0\3\2\2\2\u0275\u0279\5u;\2\u0276\u0279\5s:\2"+
		"\u0277\u0279\5\u008dG\2\u0278\u0275\3\2\2\2\u0278\u0276\3\2\2\2\u0278"+
		"\u0277\3\2\2\2\u0279\u00b2\3\2\2\2\u027a\u027f\5\u00b5[\2\u027b\u027f"+
		"\5\u00b7\\\2\u027c\u027f\5\u00b9]\2\u027d\u027f\5\u00bb^\2\u027e\u027a"+
		"\3\2\2\2\u027e\u027b\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027f"+
		"\u00b4\3\2\2\2\u0280\u0284\5\u00c7d\2\u0281\u0283\5\u00c7d\2\u0282\u0281"+
		"\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u00b6\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u028b\5\u00c7d\2\u0288\u028a"+
		"\5\u00c7d\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2"+
		"\2\u028b\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0292"+
		"\5\u0097L\2\u028f\u0291\5\u00c7d\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2"+
		"\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u029e\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0295\u0296\5\u0097L\2\u0296\u029a\5\u00c7d\2\u0297\u0299"+
		"\5\u00c7d\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2"+
		"\2\u029a\u029b\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u0287"+
		"\3\2\2\2\u029d\u0295\3\2\2\2\u029e\u00b8\3\2\2\2\u029f\u02a2\5e\63\2\u02a0"+
		"\u02a2\5g\64\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u00ba\3\2"+
		"\2\2\u02a3\u02a7\5\u0085C\2\u02a4\u02a6\5\u00c9e\2\u02a5\u02a4\3\2\2\2"+
		"\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa"+
		"\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ab\5\u0085C\2\u02ab\u00bc\3\2\2"+
		"\2\u02ac\u02ad\7\61\2\2\u02ad\u02ae\7,\2\2\u02ae\u02b2\3\2\2\2\u02af\u02b1"+
		"\13\2\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b3\3\2\2\2"+
		"\u02b2\u02b0\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6"+
		"\7,\2\2\u02b6\u02b7\7\61\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\b_\2\2\u02b9"+
		"\u00be\3\2\2\2\u02ba\u02bb\7\61\2\2\u02bb\u02bc\7\61\2\2\u02bc\u02d3\3"+
		"\2\2\2\u02bd\u02d4\5\u00c5c\2\u02be\u02d4\5\u00c7d\2\u02bf\u02d4\t\2\2"+
		"\2\u02c0\u02c1\7B\2\2\u02c1\u02c2\7%\2\2\u02c2\u02c3\7&\2\2\u02c3\u02c4"+
		"\7\'\2\2\u02c4\u02c5\7`\2\2\u02c5\u02c6\7(\2\2\u02c6\u02c7\7#\2\2\u02c7"+
		"\u02c8\7a\2\2\u02c8\u02c9\7/\2\2\u02c9\u02ca\7-\2\2\u02ca\u02cb\7?\2\2"+
		"\u02cb\u02cc\7\60\2\2\u02cc\u02cd\7.\2\2\u02cd\u02ce\7@\2\2\u02ce\u02cf"+
		"\7>\2\2\u02cf\u02d0\7A\2\2\u02d0\u02d1\7\61\2\2\u02d1\u02d2\7b\2\2\u02d2"+
		"\u02d4\7$\2\2\u02d3\u02bd\3\2\2\2\u02d3\u02be\3\2\2\2\u02d3\u02bf\3\2"+
		"\2\2\u02d3\u02c0\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\b`\3\2\u02d6"+
		"\u00c0\3\2\2\2\u02d7\u02d9\t\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2"+
		"\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02dd\ba\3\2\u02dd\u00c2\3\2\2\2\u02de\u02e1\5\u00c7d\2\u02df\u02e1\5"+
		"\u00c7d\2\u02e0\u02de\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1\u02e4\3\2\2\2"+
		"\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u00c4\3\2\2\2\u02e4\u02e2"+
		"\3\2\2\2\u02e5\u02e6\t\3\2\2\u02e6\u00c6\3\2\2\2\u02e7\u02e8\4\62;\2\u02e8"+
		"\u00c8\3\2\2\2\u02e9\u0310\5\u00c7d\2\u02ea\u0310\5\u00c5c\2\u02eb\u0310"+
		"\5\u00c1a\2\u02ec\u0310\5i\65\2\u02ed\u0310\5k\66\2\u02ee\u0310\5m\67"+
		"\2\u02ef\u0310\5o8\2\u02f0\u0310\5q9\2\u02f1\u0310\5s:\2\u02f2\u0310\5"+
		"u;\2\u02f3\u0310\5w<\2\u02f4\u0310\5y=\2\u02f5\u0310\5{>\2\u02f6\u0310"+
		"\5}?\2\u02f7\u0310\5\177@\2\u02f8\u0310\5\u0081A\2\u02f9\u0310\5\u0083"+
		"B\2\u02fa\u0310\5\u0085C\2\u02fb\u0310\5\u0087D\2\u02fc\u0310\5\u0089"+
		"E\2\u02fd\u0310\5\u008bF\2\u02fe\u0310\5\u008dG\2\u02ff\u0310\5\u008f"+
		"H\2\u0300\u0310\5\u0091I\2\u0301\u0310\3\2\2\2\u0302\u0310\5\u0093J\2"+
		"\u0303\u0310\5\u0095K\2\u0304\u0310\5\u0097L\2\u0305\u0310\5\u0099M\2"+
		"\u0306\u0310\5\u009bN\2\u0307\u0310\5\u009fP\2\u0308\u0310\5\u009dO\2"+
		"\u0309\u0310\5\u00a1Q\2\u030a\u0310\5\u00a3R\2\u030b\u0310\5\u00a5S\2"+
		"\u030c\u0310\5\u00a7T\2\u030d\u0310\5\u00a9U\2\u030e\u0310\5\u00abV\2"+
		"\u030f\u02e9\3\2\2\2\u030f\u02ea\3\2\2\2\u030f\u02eb\3\2\2\2\u030f\u02ec"+
		"\3\2\2\2\u030f\u02ed\3\2\2\2\u030f\u02ee\3\2\2\2\u030f\u02ef\3\2\2\2\u030f"+
		"\u02f0\3\2\2\2\u030f\u02f1\3\2\2\2\u030f\u02f2\3\2\2\2\u030f\u02f3\3\2"+
		"\2\2\u030f\u02f4\3\2\2\2\u030f\u02f5\3\2\2\2\u030f\u02f6\3\2\2\2\u030f"+
		"\u02f7\3\2\2\2\u030f\u02f8\3\2\2\2\u030f\u02f9\3\2\2\2\u030f\u02fa\3\2"+
		"\2\2\u030f\u02fb\3\2\2\2\u030f\u02fc\3\2\2\2\u030f\u02fd\3\2\2\2\u030f"+
		"\u02fe\3\2\2\2\u030f\u02ff\3\2\2\2\u030f\u0300\3\2\2\2\u030f\u0301\3\2"+
		"\2\2\u030f\u0302\3\2\2\2\u030f\u0303\3\2\2\2\u030f\u0304\3\2\2\2\u030f"+
		"\u0305\3\2\2\2\u030f\u0306\3\2\2\2\u030f\u0307\3\2\2\2\u030f\u0308\3\2"+
		"\2\2\u030f\u0309\3\2\2\2\u030f\u030a\3\2\2\2\u030f\u030b\3\2\2\2\u030f"+
		"\u030c\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u030e\3\2\2\2\u0310\u00ca\3\2"+
		"\2\2\u0311\u0314\5\u00a3R\2\u0312\u0314\5\u00c5c\2\u0313\u0311\3\2\2\2"+
		"\u0313\u0312\3\2\2\2\u0314\u031a\3\2\2\2\u0315\u0319\5\u00a3R\2\u0316"+
		"\u0319\5\u00c5c\2\u0317\u0319\5\u00c7d\2\u0318\u0315\3\2\2\2\u0318\u0316"+
		"\3\2\2\2\u0318\u0317\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u00cc\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u0321\5\u00c7"+
		"d\2\u031e\u0320\5\u00c7d\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u00ce\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\30\2\u026e\u0273\u0278\u027e\u0284\u028b\u0292\u029a\u029d\u02a1"+
		"\u02a7\u02b2\u02d3\u02da\u02e0\u02e2\u030f\u0313\u0318\u031a\u0321\4\2"+
		"\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}