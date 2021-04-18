// Generated from C:/Users/Usuario/IdeaProjects/Interprete-Backend\InterpreteParser.g4 by ANTLR 4.9.1
package com.edbinns.interprete.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterpreteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterpreteParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link InterpreteParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(InterpreteParser.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclSAST(InterpreteParser.VariableDeclSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclSAST(InterpreteParser.ClassDeclSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignSAST(InterpreteParser.AssignSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignSAST(InterpreteParser.ArrayAssignSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSAST(InterpreteParser.PrintSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSAST(InterpreteParser.IfSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSAST(InterpreteParser.WhileSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSAST(InterpreteParser.ReturnSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclSAST(InterpreteParser.FunctionDeclSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSAST}
	 * labeled alternative in {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSAST(InterpreteParser.BlockSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link InterpreteParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockAST(InterpreteParser.BlockASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclAST}
	 * labeled alternative in {@link InterpreteParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclAST(InterpreteParser.FunctionDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link InterpreteParser#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamsAST(InterpreteParser.FormalParamsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link InterpreteParser#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamAST(InterpreteParser.FormalParamASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileAST}
	 * labeled alternative in {@link InterpreteParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileAST(InterpreteParser.WhileASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifAST}
	 * labeled alternative in {@link InterpreteParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfAST(InterpreteParser.IfASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnAST}
	 * labeled alternative in {@link InterpreteParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAST(InterpreteParser.ReturnASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printAST}
	 * labeled alternative in {@link InterpreteParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintAST(InterpreteParser.PrintASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclAST}
	 * labeled alternative in {@link InterpreteParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclAST(InterpreteParser.ClassDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classVariableDeclAST}
	 * labeled alternative in {@link InterpreteParser#classVariableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariableDeclAST(InterpreteParser.ClassVariableDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclAST}
	 * labeled alternative in {@link InterpreteParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclAST(InterpreteParser.VariableDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAST}
	 * labeled alternative in {@link InterpreteParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAST(InterpreteParser.TypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypeTAST}
	 * labeled alternative in {@link InterpreteParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeTAST(InterpreteParser.ArrayTypeTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAST}
	 * labeled alternative in {@link InterpreteParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAST(InterpreteParser.IdASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link InterpreteParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeAST(InterpreteParser.ArrayTypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignAST}
	 * labeled alternative in {@link InterpreteParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAST(InterpreteParser.AssignASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignAST}
	 * labeled alternative in {@link InterpreteParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignAST(InterpreteParser.ArrayAssignASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanTAST}
	 * labeled alternative in {@link InterpreteParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTAST(InterpreteParser.BooleanTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charTAST}
	 * labeled alternative in {@link InterpreteParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharTAST(InterpreteParser.CharTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intTAST}
	 * labeled alternative in {@link InterpreteParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntTAST(InterpreteParser.IntTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringTAST}
	 * labeled alternative in {@link InterpreteParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTAST(InterpreteParser.StringTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link InterpreteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(InterpreteParser.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpressionAST}
	 * labeled alternative in {@link InterpreteParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link InterpreteParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAST(InterpreteParser.TermASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalFAST}
	 * labeled alternative in {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idFAST}
	 * labeled alternative in {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdFAST(InterpreteParser.IdFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallFAST}
	 * labeled alternative in {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallFAST(InterpreteParser.FunctionCallFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLookupFAST}
	 * labeled alternative in {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookupFAST(InterpreteParser.ArrayLookupFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLenghtFAST}
	 * labeled alternative in {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLenghtFAST(InterpreteParser.ArrayLenghtFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subEspressionFAST}
	 * labeled alternative in {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubEspressionFAST(InterpreteParser.SubEspressionFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAllocationEspressionFAST}
	 * labeled alternative in {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAllocationEspressionFAST(InterpreteParser.ArrayAllocationEspressionFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allocationExpressionFAST}
	 * labeled alternative in {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocationExpressionFAST(InterpreteParser.AllocationExpressionFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryFAST}
	 * labeled alternative in {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryFAST(InterpreteParser.UnaryFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link InterpreteParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryAST(InterpreteParser.UnaryASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allocationExpressionAST}
	 * labeled alternative in {@link InterpreteParser#allocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocationExpressionAST(InterpreteParser.AllocationExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAllocationEspressionAST}
	 * labeled alternative in {@link InterpreteParser#arrayAllocationEspression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subEspressionAST}
	 * labeled alternative in {@link InterpreteParser#subEspression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallAST}
	 * labeled alternative in {@link InterpreteParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallAST(InterpreteParser.FunctionCallASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link InterpreteParser#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParamsAST(InterpreteParser.ActualParamsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLookupAST}
	 * labeled alternative in {@link InterpreteParser#arrayLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookupAST(InterpreteParser.ArrayLookupASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLenghtAST}
	 * labeled alternative in {@link InterpreteParser#arrayLenght}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLenghtAST(InterpreteParser.ArrayLenghtASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorRAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorRAST(InterpreteParser.MayorRASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorIgualRAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorIgualRAST(InterpreteParser.MayorIgualRASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menorRAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorRAST(InterpreteParser.MenorRASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menorIgualRAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorIgualRAST(InterpreteParser.MenorIgualRASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsRAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsRAST(InterpreteParser.EqualsRASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code difRAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifRAST(InterpreteParser.DifRASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orRAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrRAST(InterpreteParser.OrRASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or2RAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr2RAST(InterpreteParser.Or2RASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andRAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndRAST(InterpreteParser.AndRASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and2RAST}
	 * labeled alternative in {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd2RAST(InterpreteParser.And2RASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumAST}
	 * labeled alternative in {@link InterpreteParser#additiveop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumAST(InterpreteParser.SumASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resAST}
	 * labeled alternative in {@link InterpreteParser#additiveop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResAST(InterpreteParser.ResASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orAST}
	 * labeled alternative in {@link InterpreteParser#additiveop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrAST(InterpreteParser.OrASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulAST}
	 * labeled alternative in {@link InterpreteParser#multiplicativeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulAST(InterpreteParser.MulASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divAST}
	 * labeled alternative in {@link InterpreteParser#multiplicativeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivAST(InterpreteParser.DivASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andAST}
	 * labeled alternative in {@link InterpreteParser#multiplicativeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndAST(InterpreteParser.AndASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inLAST}
	 * labeled alternative in {@link InterpreteParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInLAST(InterpreteParser.InLASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realLAST}
	 * labeled alternative in {@link InterpreteParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealLAST(InterpreteParser.RealLASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLAST}
	 * labeled alternative in {@link InterpreteParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLAST(InterpreteParser.BoolLASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLAST}
	 * labeled alternative in {@link InterpreteParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLAST(InterpreteParser.StringLASTContext ctx);
}