// Generated from C:/Users/Usuario/IdeaProjects/Interprete-Backend\InterpreteParser.g4 by ANTLR 4.9.1
package com.edbinns.interprete.generated;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link InterpreteParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class InterpreteParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements InterpreteParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProgramAST(InterpreteParser.ProgramASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitStatement(InterpreteParser.StatementContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitVariableDeclSAST(InterpreteParser.VariableDeclSASTContext ctx) { return visitChildren(ctx); }
	 *
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitBlock(InterpreteParser.BlockContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitClassDeclSAST(InterpreteParser.ClassDeclSASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFunctionDecl(InterpreteParser.FunctionDeclContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitAssignSAST(InterpreteParser.AssignSASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFormalParams(InterpreteParser.FormalParamsContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitArrayAssignSAST(InterpreteParser.ArrayAssignSASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFormalParam(InterpreteParser.FormalParamContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitPrintSAST(InterpreteParser.PrintSASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitWhileStatement(InterpreteParser.WhileStatementContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitIfSAST(InterpreteParser.IfSASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitIfStatement(InterpreteParser.IfStatementContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitWhileSAST(InterpreteParser.WhileSASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitReturnStatement(InterpreteParser.ReturnStatementContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitReturnSAST(InterpreteParser.ReturnSASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitPrintStatement(InterpreteParser.PrintStatementContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitFunctionDeclSAST(InterpreteParser.FunctionDeclSASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitClassDecl(InterpreteParser.ClassDeclContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitBlockSAST(InterpreteParser.BlockSASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitClassVariableDecl(InterpreteParser.ClassVariableDeclContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitBlockAST(InterpreteParser.BlockASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitVariableDecl(InterpreteParser.VariableDeclContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitFunctionDeclAST(InterpreteParser.FunctionDeclASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitType(InterpreteParser.TypeContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitFormalParamsAST(InterpreteParser.FormalParamsASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitArrayType(InterpreteParser.ArrayTypeContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitFormalParamAST(InterpreteParser.FormalParamASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitAssignment(InterpreteParser.AssignmentContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitWhileAST(InterpreteParser.WhileASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitArrayAssignment(InterpreteParser.ArrayAssignmentContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitIfAST(InterpreteParser.IfASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitSimpleType(InterpreteParser.SimpleTypeContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitReturnAST(InterpreteParser.ReturnASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitExpression(InterpreteParser.ExpressionContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitPrintAST(InterpreteParser.PrintASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitSimpleExpression(InterpreteParser.SimpleExpressionContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitClassDeclAST(InterpreteParser.ClassDeclASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitTerm(InterpreteParser.TermContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitClassVariableDeclAST(InterpreteParser.ClassVariableDeclASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFactor(InterpreteParser.FactorContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitVariableDeclAST(InterpreteParser.VariableDeclASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitUnary(InterpreteParser.UnaryContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitTypeAST(InterpreteParser.TypeASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitAllocationExpression(InterpreteParser.AllocationExpressionContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitArrayTypeTAST(InterpreteParser.ArrayTypeTASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitArrayAllocationEspression(InterpreteParser.ArrayAllocationEspressionContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitIdAST(InterpreteParser.IdASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitSubEspression(InterpreteParser.SubEspressionContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitArrayTypeAST(InterpreteParser.ArrayTypeASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitFunctionCall(InterpreteParser.FunctionCallContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitAssignAST(InterpreteParser.AssignASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitActualParams(InterpreteParser.ActualParamsContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitArrayAssignAST(InterpreteParser.ArrayAssignASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitArrayLookup(InterpreteParser.ArrayLookupContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitBooleanTAST(InterpreteParser.BooleanTASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitArrayLenght(InterpreteParser.ArrayLenghtContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitCharTAST(InterpreteParser.CharTASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitRelacionalop(InterpreteParser.RelacionalopContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitIntTAST(InterpreteParser.IntTASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitAdditiveop(InterpreteParser.AdditiveopContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitStringTAST(InterpreteParser.StringTASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitMultiplicativeop(InterpreteParser.MultiplicativeopContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitExpressionAST(InterpreteParser.ExpressionASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
<<<<<<< HEAD
	@Override public T visitLiteral(InterpreteParser.LiteralContext ctx) { return visitChildren(ctx); }
=======
	@Override public T visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTermAST(InterpreteParser.TermASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdFAST(InterpreteParser.IdFASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunctionCallFAST(InterpreteParser.FunctionCallFASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayLookupFAST(InterpreteParser.ArrayLookupFASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayLenghtFAST(InterpreteParser.ArrayLenghtFASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSubEspressionFAST(InterpreteParser.SubEspressionFASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayAllocationEspressionFAST(InterpreteParser.ArrayAllocationEspressionFASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAllocationExpressionFAST(InterpreteParser.AllocationExpressionFASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnaryFAST(InterpreteParser.UnaryFASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnaryAST(InterpreteParser.UnaryASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAllocationExpressionAST(InterpreteParser.AllocationExpressionASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunctionCallAST(InterpreteParser.FunctionCallASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitActualParamsAST(InterpreteParser.ActualParamsASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayLookupAST(InterpreteParser.ArrayLookupASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayLenghtAST(InterpreteParser.ArrayLenghtASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMayorRAST(InterpreteParser.MayorRASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMayorIgualRAST(InterpreteParser.MayorIgualRASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMenorRAST(InterpreteParser.MenorRASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMenorIgualRAST(InterpreteParser.MenorIgualRASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEqualsRAST(InterpreteParser.EqualsRASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDifRAST(InterpreteParser.DifRASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSumAST(InterpreteParser.SumASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResAST(InterpreteParser.ResASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOrAST(InterpreteParser.OrASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMulAST(InterpreteParser.MulASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDivAST(InterpreteParser.DivASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAndAST(InterpreteParser.AndASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInLAST(InterpreteParser.InLASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRealLAST(InterpreteParser.RealLASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBoolLAST(InterpreteParser.BoolLASTContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStringLAST(InterpreteParser.StringLASTContext ctx) { return visitChildren(ctx); }
>>>>>>> 010e1a8e91fc734518ef9d5a1c307641dcf83296
}