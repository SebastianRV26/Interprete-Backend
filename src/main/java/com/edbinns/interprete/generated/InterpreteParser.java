// Generated from C:/Users/Usuario/IdeaProjects/Interprete-Backend\InterpreteParser.g4 by ANTLR 4.9.1
package com.edbinns.interprete.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreteParser extends Parser {
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
		ASYGN=51, EQUALS=52, SUM=53, RES=54, DIV=55, MUL=56, DIF=57, MAYOR=58, 
		MAYORIGUAL=59, MENOR=60, MENORIGUAL=61, ADMIRACION=62, PREGUNTA=63, DOBLECOMILLA=64, 
		NUMERAL=65, DOLAR=66, PORCENTAJE=67, AND=68, AND2=69, OR=70, OR2=71, PARENTESISIZQ=72, 
		PARENTESISDER=73, COMA=74, PUNTO=75, DOSPUNTOS=76, AROBA=77, BRACKETIZQ=78, 
		BRACKE5TDER=79, SLASH=80, ELEVADO=81, GUIONBAJO=82, TILDEALREVES=83, LLAVEIZQ=84, 
		LLAVEDER=85, RABO=86, INTLITERAL=87, REALLITERAL=88, BOOLLITERAL=89, STRINGLITERAL=90, 
		BLOCK_COMMENT=91, LINE_COMMENT=92, WS=93, ID=94, NUM=95;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_functionDecl = 3, 
		RULE_formalParams = 4, RULE_formalParam = 5, RULE_whileStatement = 6, 
		RULE_ifStatement = 7, RULE_returnStatement = 8, RULE_printStatement = 9, 
		RULE_classDecl = 10, RULE_classVariableDecl = 11, RULE_variableDecl = 12, 
		RULE_type = 13, RULE_arrayType = 14, RULE_assignment = 15, RULE_arrayAssignment = 16, 
		RULE_simpleType = 17, RULE_expression = 18, RULE_simpleExpression = 19, 
		RULE_term = 20, RULE_factor = 21, RULE_unary = 22, RULE_allocationExpression = 23, 
		RULE_arrayAllocationEspression = 24, RULE_subEspression = 25, RULE_functionCall = 26, 
		RULE_actualParams = 27, RULE_arrayLookup = 28, RULE_arrayLenght = 29, 
		RULE_relacionalop = 30, RULE_additiveop = 31, RULE_multiplicativeop = 32, 
		RULE_literal = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "functionDecl", "formalParams", "formalParam", 
			"whileStatement", "ifStatement", "returnStatement", "printStatement", 
			"classDecl", "classVariableDecl", "variableDecl", "type", "arrayType", 
			"assignment", "arrayAssignment", "simpleType", "expression", "simpleExpression", 
			"term", "factor", "unary", "allocationExpression", "arrayAllocationEspression", 
			"subEspression", "functionCall", "actualParams", "arrayLookup", "arrayLenght", 
			"relacionalop", "additiveop", "multiplicativeop", "literal"
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
			"'volatile'", "'lenght'", "'String'", "'boolean'", "'byte'", "'char'", 
			"'double'", "'float'", "'int'", "'long'", "'short'", "';'", "'='", "'=='", 
			"'+'", "'-'", "'/'", "'*'", "'!='", "'>'", "'>='", "'<'", "'<='", "'!'", 
			"'?'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'&&'", "'|'", "'||'", "'('", 
			"')'", "','", "'.'", "':'", "'@'", "'['", "']'", "'\\'", "'^'", "'_'", 
			"'`'", "'{'", "'}'", "'~'"
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
			"FLOAT", "INT", "LONG", "SHORT", "PyCOMA", "ASYGN", "EQUALS", "SUM", 
			"RES", "DIV", "MUL", "DIF", "MAYOR", "MAYORIGUAL", "MENOR", "MENORIGUAL", 
			"ADMIRACION", "PREGUNTA", "DOBLECOMILLA", "NUMERAL", "DOLAR", "PORCENTAJE", 
			"AND", "AND2", "OR", "OR2", "PARENTESISIZQ", "PARENTESISDER", "COMA", 
			"PUNTO", "DOSPUNTOS", "AROBA", "BRACKETIZQ", "BRACKE5TDER", "SLASH", 
			"ELEVADO", "GUIONBAJO", "TILDEALREVES", "LLAVEIZQ", "LLAVEDER", "RABO", 
			"INTLITERAL", "REALLITERAL", "BOOLLITERAL", "STRINGLITERAL", "BLOCK_COMMENT", 
			"LINE_COMMENT", "WS", "ID", "NUM"
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
	public String getGrammarFileName() { return "InterpreteParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterpreteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << STRING) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT))) != 0) || _la==LLAVEIZQ || _la==ID) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignSASTContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(InterpreteParser.PyCOMA, 0); }
		public AssignSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitAssignSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclSASTContext extends StatementContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(InterpreteParser.PyCOMA, 0); }
		public VariableDeclSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitVariableDeclSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockSASTContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitBlockSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDeclSASTContext extends StatementContext {
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public FunctionDeclSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitFunctionDeclSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileSASTContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitWhileSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfSASTContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitIfSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnSASTContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(InterpreteParser.PyCOMA, 0); }
		public ReturnSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitReturnSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignSASTContext extends StatementContext {
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(InterpreteParser.PyCOMA, 0); }
		public ArrayAssignSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayAssignSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassDeclSASTContext extends StatementContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(InterpreteParser.PyCOMA, 0); }
		public ClassDeclSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitClassDeclSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintSASTContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(InterpreteParser.PyCOMA, 0); }
		public PrintSASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitPrintSAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VariableDeclSASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				variableDecl();
				setState(75);
				match(PyCOMA);
				}
				break;
			case 2:
				_localctx = new ClassDeclSASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				classDecl();
				setState(78);
				match(PyCOMA);
				}
				break;
			case 3:
				_localctx = new AssignSASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				assignment();
				setState(81);
				match(PyCOMA);
				}
				break;
			case 4:
				_localctx = new ArrayAssignSASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				arrayAssignment();
				setState(84);
				match(PyCOMA);
				}
				break;
			case 5:
				_localctx = new PrintSASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				printStatement();
				setState(87);
				match(PyCOMA);
				}
				break;
			case 6:
				_localctx = new IfSASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				ifStatement();
				}
				break;
			case 7:
				_localctx = new WhileSASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				whileStatement();
				}
				break;
			case 8:
				_localctx = new ReturnSASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				returnStatement();
				setState(92);
				match(PyCOMA);
				}
				break;
			case 9:
				_localctx = new FunctionDeclSASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				functionDecl();
				}
				break;
			case 10:
				_localctx = new BlockSASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				block();
				}
				break;
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockASTContext extends BlockContext {
		public TerminalNode LLAVEIZQ() { return getToken(InterpreteParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(InterpreteParser.LLAVEDER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockASTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitBlockAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			_localctx = new BlockASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LLAVEIZQ);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << STRING) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT))) != 0) || _la==LLAVEIZQ || _la==ID) {
				{
				{
				setState(99);
				statement();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(LLAVEDER);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	 
		public FunctionDeclContext() { }
		public void copyFrom(FunctionDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclASTContext extends FunctionDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public TerminalNode PARENTESISIZQ() { return getToken(InterpreteParser.PARENTESISIZQ, 0); }
		public TerminalNode PARENTESISDER() { return getToken(InterpreteParser.PARENTESISDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FunctionDeclASTContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitFunctionDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDecl);
		int _la;
		try {
			_localctx = new FunctionDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			type();
			setState(108);
			match(ID);
			setState(109);
			match(PARENTESISIZQ);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (STRING - 41)) | (1L << (BOOLEAN - 41)) | (1L << (CHAR - 41)) | (1L << (INT - 41)) | (1L << (ID - 41)))) != 0)) {
				{
				setState(110);
				formalParams();
				}
			}

			setState(113);
			match(PARENTESISDER);
			setState(114);
			block();
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

	public static class FormalParamsContext extends ParserRuleContext {
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
	 
		public FormalParamsContext() { }
		public void copyFrom(FormalParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParamsASTContext extends FormalParamsContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(InterpreteParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(InterpreteParser.COMA, i);
		}
		public FormalParamsASTContext(FormalParamsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitFormalParamsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParams);
		int _la;
		try {
			_localctx = new FormalParamsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			formalParam();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(117);
				match(COMA);
				setState(118);
				formalParam();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FormalParamContext extends ParserRuleContext {
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
	 
		public FormalParamContext() { }
		public void copyFrom(FormalParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParamASTContext extends FormalParamContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public FormalParamASTContext(FormalParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitFormalParamAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParam);
		try {
			_localctx = new FormalParamASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			type();
			setState(125);
			match(ID);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileASTContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(InterpreteParser.WHILE, 0); }
		public TerminalNode PARENTESISIZQ() { return getToken(InterpreteParser.PARENTESISIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTESISDER() { return getToken(InterpreteParser.PARENTESISDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileASTContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitWhileAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			_localctx = new WhileASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(WHILE);
			setState(128);
			match(PARENTESISIZQ);
			setState(129);
			expression();
			setState(130);
			match(PARENTESISDER);
			setState(131);
			block();
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(InterpreteParser.IF, 0); }
		public TerminalNode PARENTESISIZQ() { return getToken(InterpreteParser.PARENTESISIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTESISDER() { return getToken(InterpreteParser.PARENTESISDER, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(InterpreteParser.ELSE, 0); }
		public IfASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitIfAST(this);
			else return visitor.visitChildren(this);
		}
			{
			setState(133);
			match(IF);
			setState(134);
			match(PARENTESISIZQ);
			setState(135);
			expression();
			setState(136);
			match(PARENTESISDER);
			setState(137);
			block();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(138);
				match(ELSE);
				setState(139);
				block();
				}
			}

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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnASTContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(InterpreteParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnASTContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitReturnAST(this);
			else return visitor.visitChildren(this);
		}
			setState(142);
			match(RETURN);
			setState(143);
			expression();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintASTContext extends PrintStatementContext {
		public TerminalNode PRINT() { return getToken(InterpreteParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintASTContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitPrintAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			_localctx = new PrintASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(PRINT);
			setState(146);
			expression();
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

	public static class ClassDeclContext extends ParserRuleContext {
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
	 
		public ClassDeclContext() { }
		public void copyFrom(ClassDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclASTContext extends ClassDeclContext {
		public TerminalNode CLASS() { return getToken(InterpreteParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(InterpreteParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(InterpreteParser.LLAVEDER, 0); }
		public List<ClassVariableDeclContext> classVariableDecl() {
			return getRuleContexts(ClassVariableDeclContext.class);
		}
		public ClassVariableDeclContext classVariableDecl(int i) {
			return getRuleContext(ClassVariableDeclContext.class,i);
		}
		public ClassDeclASTContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitClassDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDecl);
		int _la;
		try {
			_localctx = new ClassDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(CLASS);
			setState(149);
			match(ID);
			setState(150);
			match(LLAVEIZQ);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT))) != 0)) {
				{
				{
				setState(151);
				classVariableDecl();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(LLAVEDER);
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

	public static class ClassVariableDeclContext extends ParserRuleContext {
		public ClassVariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVariableDecl; }
	 
		public ClassVariableDeclContext() { }
		public void copyFrom(ClassVariableDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassVariableDeclASTContext extends ClassVariableDeclContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public TerminalNode ASYGN() { return getToken(InterpreteParser.ASYGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassVariableDeclASTContext(ClassVariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitClassVariableDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVariableDeclContext classVariableDecl() throws RecognitionException {
		ClassVariableDeclContext _localctx = new ClassVariableDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classVariableDecl);
		int _la;
		try {
			_localctx = new ClassVariableDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			simpleType();
			setState(160);
			match(ID);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYGN) {
				{
				setState(161);
				match(ASYGN);
				setState(162);
				expression();
				}
			}

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

	public static class VariableDeclContext extends ParserRuleContext {
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
	 
		public VariableDeclContext() { }
		public void copyFrom(VariableDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclASTContext extends VariableDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public TerminalNode ASYGN() { return getToken(InterpreteParser.ASYGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclASTContext(VariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitVariableDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDecl);
		int _la;
		try {
			_localctx = new VariableDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			type();
			setState(166);
			match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYGN) {
				{
				setState(167);
				match(ASYGN);
				setState(168);
				expression();
				}
			}

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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdASTContext extends TypeContext {
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public IdASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitIdAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeASTContext extends TypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTypeTASTContext extends TypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayTypeTASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayTypeTAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new TypeASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				simpleType();
				}
				break;
			case 2:
				_localctx = new ArrayTypeTASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				arrayType();
				}
				break;
			case 3:
				_localctx = new IdASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(ID);
				}
				break;
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	 
		public ArrayTypeContext() { }
		public void copyFrom(ArrayTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeASTContext extends ArrayTypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode BRACKETIZQ() { return getToken(InterpreteParser.BRACKETIZQ, 0); }
		public TerminalNode BRACKE5TDER() { return getToken(InterpreteParser.BRACKE5TDER, 0); }
		public ArrayTypeASTContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			_localctx = new ArrayTypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			simpleType();
			setState(177);
			match(BRACKETIZQ);
			setState(178);
			match(BRACKE5TDER);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignASTContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(InterpreteParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreteParser.ID, i);
		}
		public TerminalNode ASYGN() { return getToken(InterpreteParser.ASYGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(InterpreteParser.PUNTO, 0); }
		public AssignASTContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitAssignAST(this);
			else return visitor.visitChildren(this);
		}
			{
			setState(180);
			match(ID);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO) {
				{
				setState(181);
				match(PUNTO);
				setState(182);
				match(ID);
				}
			}

			setState(185);
			match(ASYGN);
			setState(186);
			expression();
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
	 
		public ArrayAssignmentContext() { }
		public void copyFrom(ArrayAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAssignASTContext extends ArrayAssignmentContext {
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public TerminalNode BRACKETIZQ() { return getToken(InterpreteParser.BRACKETIZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BRACKE5TDER() { return getToken(InterpreteParser.BRACKE5TDER, 0); }
		public TerminalNode ASYGN() { return getToken(InterpreteParser.ASYGN, 0); }
		public ArrayAssignASTContext(ArrayAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayAssignAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayAssignment);
		try {
			_localctx = new ArrayAssignASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(189);
			match(BRACKETIZQ);
			setState(190);
			expression();
			setState(191);
			match(BRACKE5TDER);
			setState(192);
			match(ASYGN);
			setState(193);
			expression();
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	 
		public SimpleTypeContext() { }
		public void copyFrom(SimpleTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntTASTContext extends SimpleTypeContext {
		public TerminalNode INT() { return getToken(InterpreteParser.INT, 0); }
		public IntTASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitIntTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTASTContext extends SimpleTypeContext {
		public TerminalNode STRING() { return getToken(InterpreteParser.STRING, 0); }
		public StringTASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitStringTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharTASTContext extends SimpleTypeContext {
		public TerminalNode CHAR() { return getToken(InterpreteParser.CHAR, 0); }
		public CharTASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitCharTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTASTContext extends SimpleTypeContext {
		public TerminalNode BOOLEAN() { return getToken(InterpreteParser.BOOLEAN, 0); }
		public BooleanTASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitBooleanTAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleType);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(BOOLEAN);
				}
				break;
			case CHAR:
				_localctx = new CharTASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(CHAR);
				}
				break;
			case INT:
				_localctx = new IntTASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new StringTASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionASTContext extends ExpressionContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<RelacionalopContext> relacionalop() {
			return getRuleContexts(RelacionalopContext.class);
		}
		public RelacionalopContext relacionalop(int i) {
			return getRuleContext(RelacionalopContext.class,i);
		}
		public ExpressionASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			int _alt;
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			simpleExpression();
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					relacionalop();
					setState(203);
					simpleExpression();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	 
		public SimpleExpressionContext() { }
		public void copyFrom(SimpleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleExpressionASTContext extends SimpleExpressionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AdditiveopContext> additiveop() {
			return getRuleContexts(AdditiveopContext.class);
		}
		public AdditiveopContext additiveop(int i) {
			return getRuleContext(AdditiveopContext.class,i);
		}
		public SimpleExpressionASTContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitSimpleExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simpleExpression);
		try {
			int _alt;
			_localctx = new SimpleExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			term();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					additiveop();
					setState(212);
					term();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermASTContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultiplicativeopContext> multiplicativeop() {
			return getRuleContexts(MultiplicativeopContext.class);
		}
		public MultiplicativeopContext multiplicativeop(int i) {
			return getRuleContext(MultiplicativeopContext.class,i);
		}
		public TermASTContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitTermAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		try {
			int _alt;
			_localctx = new TermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			factor();
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					multiplicativeop();
					setState(221);
					factor();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallFASTContext extends FactorContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitFunctionCallFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAllocationEspressionFASTContext extends FactorContext {
		public ArrayAllocationEspressionContext arrayAllocationEspression() {
			return getRuleContext(ArrayAllocationEspressionContext.class,0);
		}
		public ArrayAllocationEspressionFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayAllocationEspressionFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLenghtFASTContext extends FactorContext {
		public ArrayLenghtContext arrayLenght() {
			return getRuleContext(ArrayLenghtContext.class,0);
		}
		public ArrayLenghtFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayLenghtFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralFASTContext extends FactorContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitLiteralFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdFASTContext extends FactorContext {
		public List<TerminalNode> ID() { return getTokens(InterpreteParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreteParser.ID, i);
		}
		public TerminalNode PUNTO() { return getToken(InterpreteParser.PUNTO, 0); }
		public IdFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitIdFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryFASTContext extends FactorContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public UnaryFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitUnaryFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLookupFASTContext extends FactorContext {
		public ArrayLookupContext arrayLookup() {
			return getRuleContext(ArrayLookupContext.class,0);
		}
		public ArrayLookupFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayLookupFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubEspressionFASTContext extends FactorContext {
		public SubEspressionContext subEspression() {
			return getRuleContext(SubEspressionContext.class,0);
		}
		public SubEspressionFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitSubEspressionFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllocationExpressionFASTContext extends FactorContext {
		public AllocationExpressionContext allocationExpression() {
			return getRuleContext(AllocationExpressionContext.class,0);
		}
		public AllocationExpressionFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitAllocationExpressionFAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new LiteralFASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				literal();
				}
				break;
			case 2:
				_localctx = new IdFASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(ID);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO) {
					{
					setState(230);
					match(PUNTO);
					setState(231);
					match(ID);
					}
				}

				}
				break;
			case 3:
				_localctx = new FunctionCallFASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				functionCall();
				}
				break;
			case 4:
				_localctx = new ArrayLookupFASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				arrayLookup();
				}
				break;
			case 5:
				_localctx = new ArrayLenghtFASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				arrayLenght();
				}
				break;
			case 6:
				_localctx = new SubEspressionFASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				subEspression();
				}
				break;
			case 7:
				_localctx = new ArrayAllocationEspressionFASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				arrayAllocationEspression();
				}
				break;
			case 8:
				_localctx = new AllocationExpressionFASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				allocationExpression();
				}
				break;
			case 9:
				_localctx = new UnaryFASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				unary();
				}
				break;
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryASTContext extends UnaryContext {
		public TerminalNode SUM() { return getToken(InterpreteParser.SUM, 0); }
		public TerminalNode RES() { return getToken(InterpreteParser.RES, 0); }
		public TerminalNode ADMIRACION() { return getToken(InterpreteParser.ADMIRACION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnaryASTContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitUnaryAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unary);
		int _la;
		try {
			int _alt;
			_localctx = new UnaryASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << RES) | (1L << ADMIRACION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					expression();
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
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

	public static class AllocationExpressionContext extends ParserRuleContext {
		public AllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocationExpression; }
	 
		public AllocationExpressionContext() { }
		public void copyFrom(AllocationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllocationExpressionASTContext extends AllocationExpressionContext {
		public TerminalNode NEW() { return getToken(InterpreteParser.NEW, 0); }
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public TerminalNode PARENTESISIZQ() { return getToken(InterpreteParser.PARENTESISIZQ, 0); }
		public TerminalNode PARENTESISDER() { return getToken(InterpreteParser.PARENTESISDER, 0); }
		public AllocationExpressionASTContext(AllocationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitAllocationExpressionAST(this);
			else return visitor.visitChildren(this);
		}
			setState(250);
			match(NEW);
			setState(251);
			match(ID);
			setState(252);
			match(PARENTESISIZQ);
			setState(253);
			match(PARENTESISDER);
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

	public static class ArrayAllocationEspressionContext extends ParserRuleContext {
		public ArrayAllocationEspressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAllocationEspression; }
	 
		public ArrayAllocationEspressionContext() { }
		public void copyFrom(ArrayAllocationEspressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAllocationEspressionASTContext extends ArrayAllocationEspressionContext {
		public TerminalNode NEW() { return getToken(InterpreteParser.NEW, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode BRACKETIZQ() { return getToken(InterpreteParser.BRACKETIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKE5TDER() { return getToken(InterpreteParser.BRACKE5TDER, 0); }
		public ArrayAllocationEspressionASTContext(ArrayAllocationEspressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayAllocationEspressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAllocationEspressionContext arrayAllocationEspression() throws RecognitionException {
		ArrayAllocationEspressionContext _localctx = new ArrayAllocationEspressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayAllocationEspression);
		try {
			_localctx = new ArrayAllocationEspressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(NEW);
			setState(256);
			simpleType();
			setState(257);
			match(BRACKETIZQ);
			setState(258);
			expression();
			setState(259);
			match(BRACKE5TDER);
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

	public static class SubEspressionContext extends ParserRuleContext {
		public SubEspressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subEspression; }
	 
		public SubEspressionContext() { }
		public void copyFrom(SubEspressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubEspressionASTContext extends SubEspressionContext {
		public TerminalNode PARENTESISIZQ() { return getToken(InterpreteParser.PARENTESISIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTESISDER() { return getToken(InterpreteParser.PARENTESISDER, 0); }
		public SubEspressionASTContext(SubEspressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitSubEspressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubEspressionContext subEspression() throws RecognitionException {
		SubEspressionContext _localctx = new SubEspressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_subEspression);
		try {
			_localctx = new SubEspressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(PARENTESISIZQ);
			setState(262);
			expression();
			setState(263);
			match(PARENTESISDER);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallASTContext extends FunctionCallContext {
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public TerminalNode PARENTESISIZQ() { return getToken(InterpreteParser.PARENTESISIZQ, 0); }
		public TerminalNode PARENTESISDER() { return getToken(InterpreteParser.PARENTESISDER, 0); }
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public FunctionCallASTContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitFunctionCallAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctionCallASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(ID);
			setState(266);
			match(PARENTESISIZQ);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUM) | (1L << RES) | (1L << ADMIRACION))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (PARENTESISIZQ - 72)) | (1L << (INTLITERAL - 72)) | (1L << (REALLITERAL - 72)) | (1L << (BOOLLITERAL - 72)) | (1L << (STRINGLITERAL - 72)) | (1L << (ID - 72)))) != 0)) {
				{
				setState(267);
				actualParams();
				}
			}

			setState(270);
			match(PARENTESISDER);
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

	public static class ActualParamsContext extends ParserRuleContext {
		public ActualParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParams; }
	 
		public ActualParamsContext() { }
		public void copyFrom(ActualParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActualParamsASTContext extends ActualParamsContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(InterpreteParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(InterpreteParser.COMA, i);
		}
		public ActualParamsASTContext(ActualParamsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitActualParamsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParamsContext actualParams() throws RecognitionException {
		ActualParamsContext _localctx = new ActualParamsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_actualParams);
		int _la;
		try {
			_localctx = new ActualParamsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			expression();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(273);
				match(COMA);
				setState(274);
				expression();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ArrayLookupContext extends ParserRuleContext {
		public ArrayLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLookup; }
	 
		public ArrayLookupContext() { }
		public void copyFrom(ArrayLookupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLookupASTContext extends ArrayLookupContext {
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public TerminalNode BRACKETIZQ() { return getToken(InterpreteParser.BRACKETIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKE5TDER() { return getToken(InterpreteParser.BRACKE5TDER, 0); }
		public ArrayLookupASTContext(ArrayLookupContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayLookupAST(this);
			else return visitor.visitChildren(this);
		}
			setState(280);
			match(ID);
			setState(281);
			match(BRACKETIZQ);
			setState(282);
			expression();
			setState(283);
			match(BRACKE5TDER);
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

	public static class ArrayLenghtContext extends ParserRuleContext {
		public ArrayLenghtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLenght; }
	 
		public ArrayLenghtContext() { }
		public void copyFrom(ArrayLenghtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLenghtASTContext extends ArrayLenghtContext {
		public TerminalNode ID() { return getToken(InterpreteParser.ID, 0); }
		public TerminalNode PUNTO() { return getToken(InterpreteParser.PUNTO, 0); }
		public TerminalNode LENGHT() { return getToken(InterpreteParser.LENGHT, 0); }
		public ArrayLenghtASTContext(ArrayLenghtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitArrayLenghtAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLenghtContext arrayLenght() throws RecognitionException {
		ArrayLenghtContext _localctx = new ArrayLenghtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayLenght);
		try {
			_localctx = new ArrayLenghtASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ID);
			setState(286);
			match(PUNTO);
			setState(287);
			match(LENGHT);
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

	public static class RelacionalopContext extends ParserRuleContext {
		public RelacionalopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacionalop; }
	 
		public RelacionalopContext() { }
		public void copyFrom(RelacionalopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MayorRASTContext extends RelacionalopContext {
		public TerminalNode MAYOR() { return getToken(InterpreteParser.MAYOR, 0); }
		public MayorRASTContext(RelacionalopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitMayorRAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsRASTContext extends RelacionalopContext {
		public TerminalNode EQUALS() { return getToken(InterpreteParser.EQUALS, 0); }
		public EqualsRASTContext(RelacionalopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitEqualsRAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayorIgualRASTContext extends RelacionalopContext {
		public TerminalNode MAYORIGUAL() { return getToken(InterpreteParser.MAYORIGUAL, 0); }
		public MayorIgualRASTContext(RelacionalopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitMayorIgualRAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorRASTContext extends RelacionalopContext {
		public TerminalNode MENOR() { return getToken(InterpreteParser.MENOR, 0); }
		public MenorRASTContext(RelacionalopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitMenorRAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorIgualRASTContext extends RelacionalopContext {
		public TerminalNode MENORIGUAL() { return getToken(InterpreteParser.MENORIGUAL, 0); }
		public MenorIgualRASTContext(RelacionalopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitMenorIgualRAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifRASTContext extends RelacionalopContext {
		public TerminalNode DIF() { return getToken(InterpreteParser.DIF, 0); }
		public DifRASTContext(RelacionalopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitDifRAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalopContext relacionalop() throws RecognitionException {
		RelacionalopContext _localctx = new RelacionalopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relacionalop);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAYOR:
				_localctx = new MayorRASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(MAYOR);
				}
				break;
			case MAYORIGUAL:
				_localctx = new MayorIgualRASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(MAYORIGUAL);
				}
				break;
			case MENOR:
				_localctx = new MenorRASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(MENOR);
				}
				break;
			case MENORIGUAL:
				_localctx = new MenorIgualRASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(MENORIGUAL);
				}
				break;
			case EQUALS:
				_localctx = new EqualsRASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(EQUALS);
				}
				break;
			case DIF:
				_localctx = new DifRASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				match(DIF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AdditiveopContext extends ParserRuleContext {
		public AdditiveopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveop; }
	 
		public AdditiveopContext() { }
		public void copyFrom(AdditiveopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumASTContext extends AdditiveopContext {
		public TerminalNode SUM() { return getToken(InterpreteParser.SUM, 0); }
		public SumASTContext(AdditiveopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitSumAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrASTContext extends AdditiveopContext {
		public TerminalNode OR() { return getToken(InterpreteParser.OR, 0); }
		public OrASTContext(AdditiveopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitOrAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResASTContext extends AdditiveopContext {
		public TerminalNode RES() { return getToken(InterpreteParser.RES, 0); }
		public ResASTContext(AdditiveopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitResAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveopContext additiveop() throws RecognitionException {
		AdditiveopContext _localctx = new AdditiveopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveop);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				_localctx = new SumASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(SUM);
				}
				break;
			case RES:
				_localctx = new ResASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(RES);
				}
				break;
			case OR:
				_localctx = new OrASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MultiplicativeopContext extends ParserRuleContext {
		public MultiplicativeopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeop; }
	 
		public MultiplicativeopContext() { }
		public void copyFrom(MultiplicativeopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivASTContext extends MultiplicativeopContext {
		public TerminalNode DIV() { return getToken(InterpreteParser.DIV, 0); }
		public DivASTContext(MultiplicativeopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitDivAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndASTContext extends MultiplicativeopContext {
		public TerminalNode AND() { return getToken(InterpreteParser.AND, 0); }
		public AndASTContext(MultiplicativeopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitAndAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulASTContext extends MultiplicativeopContext {
		public TerminalNode MUL() { return getToken(InterpreteParser.MUL, 0); }
		public MulASTContext(MultiplicativeopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitMulAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeopContext multiplicativeop() throws RecognitionException {
		MultiplicativeopContext _localctx = new MultiplicativeopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeop);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new MulASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(MUL);
				}
				break;
			case DIV:
				_localctx = new DivASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(DIV);
				}
				break;
			case AND:
				_localctx = new AndASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(AND);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RealLASTContext extends LiteralContext {
		public TerminalNode REALLITERAL() { return getToken(InterpreteParser.REALLITERAL, 0); }
		public RealLASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitRealLAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InLASTContext extends LiteralContext {
		public TerminalNode INTLITERAL() { return getToken(InterpreteParser.INTLITERAL, 0); }
		public InLASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitInLAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLASTContext extends LiteralContext {
		public TerminalNode BOOLLITERAL() { return getToken(InterpreteParser.BOOLLITERAL, 0); }
		public BoolLASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitBoolLAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLASTContext extends LiteralContext {
		public TerminalNode STRINGLITERAL() { return getToken(InterpreteParser.STRINGLITERAL, 0); }
		public StringLASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreteParserVisitor ) return ((InterpreteParserVisitor<? extends T>)visitor).visitStringLAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				_localctx = new InLASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(INTLITERAL);
				}
				break;
			case REALLITERAL:
				_localctx = new RealLASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(REALLITERAL);
				}
				break;
			case BOOLLITERAL:
				_localctx = new BoolLASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(BOOLLITERAL);
				}
				break;
			case STRINGLITERAL:
				_localctx = new StringLASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(STRINGLITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3c"+
		"\n\3\3\4\3\4\7\4g\n\4\f\4\16\4j\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5r\n\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u009b\n\f\f\f\16\f\u009e\13\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\5\r\u00a6\n\r\3\16\3\16\3\16\3\16\5\16\u00ac\n\16\3"+
		"\17\3\17\3\17\5\17\u00b1\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u00ba\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u00ca\n\23\3\24\3\24\3\24\3\24\7\24\u00d0\n\24\f\24\16"+
		"\24\u00d3\13\24\3\25\3\25\3\25\3\25\7\25\u00d9\n\25\f\25\16\25\u00dc\13"+
		"\25\3\26\3\26\3\26\3\26\7\26\u00e2\n\26\f\26\16\26\u00e5\13\26\3\27\3"+
		"\27\3\27\3\27\5\27\u00eb\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00f4\n\27\3\30\3\30\7\30\u00f8\n\30\f\30\16\30\u00fb\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\5\34\u010f\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u0116\n\35\f"+
		"\35\16\35\u0119\13\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \3 \5 \u012a\n \3!\3!\3!\5!\u012f\n!\3\"\3\"\3\"\5\"\u0134"+
		"\n\"\3#\3#\3#\3#\5#\u013a\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\4\2\678@@\2\u014b\2I\3\2\2\2\4"+
		"b\3\2\2\2\6d\3\2\2\2\bm\3\2\2\2\nv\3\2\2\2\f~\3\2\2\2\16\u0081\3\2\2\2"+
		"\20\u0087\3\2\2\2\22\u0090\3\2\2\2\24\u0093\3\2\2\2\26\u0096\3\2\2\2\30"+
		"\u00a1\3\2\2\2\32\u00a7\3\2\2\2\34\u00b0\3\2\2\2\36\u00b2\3\2\2\2 \u00b6"+
		"\3\2\2\2\"\u00be\3\2\2\2$\u00c9\3\2\2\2&\u00cb\3\2\2\2(\u00d4\3\2\2\2"+
		"*\u00dd\3\2\2\2,\u00f3\3\2\2\2.\u00f5\3\2\2\2\60\u00fc\3\2\2\2\62\u0101"+
		"\3\2\2\2\64\u0107\3\2\2\2\66\u010b\3\2\2\28\u0112\3\2\2\2:\u011a\3\2\2"+
		"\2<\u011f\3\2\2\2>\u0129\3\2\2\2@\u012e\3\2\2\2B\u0133\3\2\2\2D\u0139"+
		"\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2"+
		"KI\3\2\2\2LM\5\32\16\2MN\7\64\2\2Nc\3\2\2\2OP\5\26\f\2PQ\7\64\2\2Qc\3"+
		"\2\2\2RS\5 \21\2ST\7\64\2\2Tc\3\2\2\2UV\5\"\22\2VW\7\64\2\2Wc\3\2\2\2"+
		"XY\5\24\13\2YZ\7\64\2\2Zc\3\2\2\2[c\5\20\t\2\\c\5\16\b\2]^\5\22\n\2^_"+
		"\7\64\2\2_c\3\2\2\2`c\5\b\5\2ac\5\6\4\2bL\3\2\2\2bO\3\2\2\2bR\3\2\2\2"+
		"bU\3\2\2\2bX\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2b`\3\2\2\2ba\3\2\2"+
		"\2c\5\3\2\2\2dh\7T\2\2eg\5\4\3\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2ik\3\2\2\2jh\3\2\2\2kl\7U\2\2l\7\3\2\2\2mn\5\34\17\2no\7^\2\2oq\7H\2"+
		"\2pr\5\n\6\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7I\2\2tu\5\6\4\2u\t\3\2\2"+
		"\2v{\5\f\7\2wx\7J\2\2xz\5\f\7\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\13\3\2\2\2}{\3\2\2\2~\177\5\34\17\2\177\u0080\7^\2\2\u0080\r\3\2\2"+
		"\2\u0081\u0082\7\t\2\2\u0082\u0083\7H\2\2\u0083\u0084\5&\24\2\u0084\u0085"+
		"\7I\2\2\u0085\u0086\5\6\4\2\u0086\17\3\2\2\2\u0087\u0088\7\3\2\2\u0088"+
		"\u0089\7H\2\2\u0089\u008a\5&\24\2\u008a\u008b\7I\2\2\u008b\u008e\5\6\4"+
		"\2\u008c\u008d\7\4\2\2\u008d\u008f\5\6\4\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\21\3\2\2\2\u0090\u0091\7\16\2\2\u0091\u0092\5&\24\2\u0092"+
		"\23\3\2\2\2\u0093\u0094\7\17\2\2\u0094\u0095\5&\24\2\u0095\25\3\2\2\2"+
		"\u0096\u0097\7\24\2\2\u0097\u0098\7^\2\2\u0098\u009c\7T\2\2\u0099\u009b"+
		"\5\30\r\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0"+
		"\7U\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a5\7^\2\2\u00a3"+
		"\u00a4\7\65\2\2\u00a4\u00a6\5&\24\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00ab\7^\2\2\u00a9"+
		"\u00aa\7\65\2\2\u00aa\u00ac\5&\24\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ac\33\3\2\2\2\u00ad\u00b1\5$\23\2\u00ae\u00b1\5\36\20\2\u00af"+
		"\u00b1\7^\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\5$\23\2\u00b3\u00b4\7N\2\2\u00b4\u00b5"+
		"\7O\2\2\u00b5\37\3\2\2\2\u00b6\u00b9\7^\2\2\u00b7\u00b8\7K\2\2\u00b8\u00ba"+
		"\7^\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\7\65\2\2\u00bc\u00bd\5&\24\2\u00bd!\3\2\2\2\u00be\u00bf\7^\2\2"+
		"\u00bf\u00c0\7N\2\2\u00c0\u00c1\5&\24\2\u00c1\u00c2\7O\2\2\u00c2\u00c3"+
		"\7\65\2\2\u00c3\u00c4\5&\24\2\u00c4#\3\2\2\2\u00c5\u00ca\7,\2\2\u00c6"+
		"\u00ca\7.\2\2\u00c7\u00ca\7\61\2\2\u00c8\u00ca\7+\2\2\u00c9\u00c5\3\2"+
		"\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"%\3\2\2\2\u00cb\u00d1\5(\25\2\u00cc\u00cd\5> \2\u00cd\u00ce\5(\25\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\'\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00da"+
		"\5*\26\2\u00d5\u00d6\5@!\2\u00d6\u00d7\5*\26\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db)\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e3\5,\27\2\u00de\u00df"+
		"\5B\"\2\u00df\u00e0\5,\27\2\u00e0\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4+\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e6\u00f4\5D#\2\u00e7\u00ea\7^\2\2\u00e8\u00e9"+
		"\7K\2\2\u00e9\u00eb\7^\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00f4\3\2\2\2\u00ec\u00f4\5\66\34\2\u00ed\u00f4\5:\36\2\u00ee\u00f4\5"+
		"<\37\2\u00ef\u00f4\5\64\33\2\u00f0\u00f4\5\62\32\2\u00f1\u00f4\5\60\31"+
		"\2\u00f2\u00f4\5.\30\2\u00f3\u00e6\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00ec"+
		"\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3"+
		"\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4-\3\2\2\2"+
		"\u00f5\u00f9\t\2\2\2\u00f6\u00f8\5&\24\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa/\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\7\31\2\2\u00fd\u00fe\7^\2\2\u00fe\u00ff\7H"+
		"\2\2\u00ff\u0100\7I\2\2\u0100\61\3\2\2\2\u0101\u0102\7\31\2\2\u0102\u0103"+
		"\5$\23\2\u0103\u0104\7N\2\2\u0104\u0105\5&\24\2\u0105\u0106\7O\2\2\u0106"+
		"\63\3\2\2\2\u0107\u0108\7H\2\2\u0108\u0109\5&\24\2\u0109\u010a\7I\2\2"+
		"\u010a\65\3\2\2\2\u010b\u010c\7^\2\2\u010c\u010e\7H\2\2\u010d\u010f\5"+
		"8\35\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\7I\2\2\u0111\67\3\2\2\2\u0112\u0117\5&\24\2\u0113\u0114\7J\2\2"+
		"\u0114\u0116\5&\24\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u01189\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7^\2\2\u011b\u011c\7N\2\2\u011c\u011d\5&\24\2\u011d\u011e\7O\2"+
		"\2\u011e;\3\2\2\2\u011f\u0120\7^\2\2\u0120\u0121\7K\2\2\u0121\u0122\7"+
		"*\2\2\u0122=\3\2\2\2\u0123\u012a\7<\2\2\u0124\u012a\7=\2\2\u0125\u012a"+
		"\7>\2\2\u0126\u012a\7?\2\2\u0127\u012a\7\66\2\2\u0128\u012a\7;\2\2\u0129"+
		"\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a?\3\2\2\2\u012b\u012f"+
		"\7\67\2\2\u012c\u012f\78\2\2\u012d\u012f\7G\2\2\u012e\u012b\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012fA\3\2\2\2\u0130\u0134\7:\2\2\u0131"+
		"\u0134\79\2\2\u0132\u0134\7F\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2"+
		"\2\u0133\u0132\3\2\2\2\u0134C\3\2\2\2\u0135\u013a\7W\2\2\u0136\u013a\7"+
		"X\2\2\u0137\u013a\7Y\2\2\u0138\u013a\7Z\2\2\u0139\u0135\3\2\2\2\u0139"+
		"\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013aE\3\2\2\2"+
		"\32Ibhq{\u008e\u009c\u00a5\u00ab\u00b0\u00b9\u00c9\u00d1\u00da\u00e3\u00ea"+
		"\u00f3\u00f9\u010e\u0117\u0129\u012e\u0133\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}