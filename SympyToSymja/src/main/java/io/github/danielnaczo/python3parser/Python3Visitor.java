// Generated from Python3.g4 by ANTLR 4.7.1

package io.github.danielnaczo.python3parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Python3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Python3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(Python3Parser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(Python3Parser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(Python3Parser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(Python3Parser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#normalOrDefaultTfpDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalOrDefaultTfpDef(Python3Parser.NormalOrDefaultTfpDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#defaultTfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultTfpdef(Python3Parser.DefaultTfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#completeArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteArgs(Python3Parser.CompleteArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#afterPositionalArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterPositionalArgs(Python3Parser.AfterPositionalArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#positionalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalList(Python3Parser.PositionalListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#kwlistArgs1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwlistArgs1(Python3Parser.KwlistArgs1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#justKeywordsArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustKeywordsArgs(Python3Parser.JustKeywordsArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#kwlistArgs2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwlistArgs2(Python3Parser.KwlistArgs2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#kwOnlyListArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwOnlyListArgs(Python3Parser.KwOnlyListArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(Python3Parser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(Python3Parser.VfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varNormalOrDefaultTfpDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNormalOrDefaultTfpDef(Python3Parser.VarNormalOrDefaultTfpDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varDefaultVfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefaultVfpdef(Python3Parser.VarDefaultVfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varCompleteArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarCompleteArgs(Python3Parser.VarCompleteArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varAfterPositionalArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAfterPositionalArgs(Python3Parser.VarAfterPositionalArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varPositionalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPositionalList(Python3Parser.VarPositionalListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varKwlistArgs1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarKwlistArgs1(Python3Parser.VarKwlistArgs1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varJustKeywordsArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarJustKeywordsArgs(Python3Parser.VarJustKeywordsArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varKwlistArgs2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarKwlistArgs2(Python3Parser.VarKwlistArgs2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#varKwOnlyListArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarKwOnlyListArgs(Python3Parser.VarKwOnlyListArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(Python3Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(Python3Parser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#expr_stmtIndividualAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmtIndividualAssign(Python3Parser.Expr_stmtIndividualAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#expr_stmtNormalAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmtNormalAssign(Python3Parser.Expr_stmtNormalAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#expr_NormalAssignList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_NormalAssignList(Python3Parser.Expr_NormalAssignListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#annassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnassign(Python3Parser.AnnassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#testOrStar_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestOrStar_expr(Python3Parser.TestOrStar_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#testOrStarList_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestOrStarList_expr(Python3Parser.TestOrStarList_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(Python3Parser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(Python3Parser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(Python3Parser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(Python3Parser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(Python3Parser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(Python3Parser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(Python3Parser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(Python3Parser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(Python3Parser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_stmt(Python3Parser.Async_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(Python3Parser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(Python3Parser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(Python3Parser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(Python3Parser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_nocond(Python3Parser.Test_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(Python3Parser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(Python3Parser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(Python3Parser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(Python3Parser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(Python3Parser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(Python3Parser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Python3Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(Python3Parser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(Python3Parser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(Python3Parser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#shift_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_op(Python3Parser.Shift_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(Python3Parser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_op(Python3Parser.Arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Python3Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#term_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_op(Python3Parser.Term_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Python3Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#factor_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_op(Python3Parser.Factor_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(Python3Parser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#await}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwait(Python3Parser.AwaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(Python3Parser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(Python3Parser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#trailerCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailerCall(Python3Parser.TrailerCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#trailerSubscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailerSubscript(Python3Parser.TrailerSubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#trailerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailerName(Python3Parser.TrailerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(Python3Parser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#testlist_compTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_compTuple(Python3Parser.Testlist_compTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(Python3Parser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#testlist_compList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_compList(Python3Parser.Testlist_compListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dictionaryOrSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryOrSet(Python3Parser.DictionaryOrSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dictFirst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictFirst(Python3Parser.DictFirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dicts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDicts(Python3Parser.DictsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#setFirst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetFirst(Python3Parser.SetFirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSets(Python3Parser.SetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#subscriptIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptIndex(Python3Parser.SubscriptIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#subscriptSlice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptSlice(Python3Parser.SubscriptSliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#slicelLower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlicelLower(Python3Parser.SlicelLowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#sliceUpper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceUpper(Python3Parser.SliceUpperContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#sliceStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceStep(Python3Parser.SliceStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(Python3Parser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#exprOrStarExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOrStarExpr(Python3Parser.ExprOrStarExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(Python3Parser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(Python3Parser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(Python3Parser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#argumentNormal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentNormal(Python3Parser.ArgumentNormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#argumentKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentKeyword(Python3Parser.ArgumentKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#argumentStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentStar(Python3Parser.ArgumentStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#argumentDoubleStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDoubleStar(Python3Parser.ArgumentDoubleStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(Python3Parser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(Python3Parser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(Python3Parser.Yield_argContext ctx);
}