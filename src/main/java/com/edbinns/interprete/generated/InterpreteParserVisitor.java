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
	 * Visit a parse tree produced by {@link InterpreteParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(InterpreteParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(InterpreteParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(InterpreteParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(InterpreteParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParams(InterpreteParser.FormalParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParam(InterpreteParser.FormalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(InterpreteParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(InterpreteParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(InterpreteParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(InterpreteParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(InterpreteParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#classVariableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariableDecl(InterpreteParser.ClassVariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(InterpreteParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(InterpreteParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(InterpreteParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(InterpreteParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(InterpreteParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(InterpreteParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(InterpreteParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(InterpreteParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(InterpreteParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(InterpreteParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(InterpreteParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#allocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocationExpression(InterpreteParser.AllocationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#arrayAllocationEspression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAllocationEspression(InterpreteParser.ArrayAllocationEspressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#subEspression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubEspression(InterpreteParser.SubEspressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(InterpreteParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParams(InterpreteParser.ActualParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#arrayLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookup(InterpreteParser.ArrayLookupContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#arrayLenght}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLenght(InterpreteParser.ArrayLenghtContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#relacionalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacionalop(InterpreteParser.RelacionalopContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#additiveop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveop(InterpreteParser.AdditiveopContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#multiplicativeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeop(InterpreteParser.MultiplicativeopContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreteParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(InterpreteParser.LiteralContext ctx);
}