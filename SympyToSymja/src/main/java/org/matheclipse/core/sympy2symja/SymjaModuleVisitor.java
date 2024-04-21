package org.matheclipse.core.sympy2symja;

import java.util.List;
import java.util.Optional;
import io.github.danielnaczo.python3parser.model.AST;
import io.github.danielnaczo.python3parser.model.expr.Expression;
import io.github.danielnaczo.python3parser.model.mods.ExpressionMod;
import io.github.danielnaczo.python3parser.model.mods.Interactive;
import io.github.danielnaczo.python3parser.model.mods.Module;
import io.github.danielnaczo.python3parser.model.stmts.Statement;
import io.github.danielnaczo.python3parser.visitors.exceptions.Python3ParserException;

public class SymjaModuleVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{

	@Override
	public String visitAST(AST ast, SymjaIndentation param) {
		return ast.accept(new SymjaModuleVisitor(), param);
	}
	
	@Override
	public String visitModule(Module module, SymjaIndentation param) {
		String string = new String();
		if (!(param instanceof SymjaIndentation)) {
			int initialIndentationLevel = 0;
			param = new SymjaIndentation(initialIndentationLevel);
		}
		
		List<Statement> statements = module.getStatements();
		if (statements == null || statements.isEmpty()) {
			throw new Python3ParserException("'Module' has no statements.");
		}
		
		for (int i = 0; i < statements.size(); i++) {
			Statement statement = statements.get(i);
			if (statement instanceof Expression) {
				string = string.concat(param.getIndentationString());
                string = string.concat(statement.accept(new SymjaExpressionVisitor(),
                    new SymjaIndentation(param.getIndentationLevel())));
				string = string.concat("\n");
			} else {
				string = string.concat(statement.accept(new SymjaStatementVisitor(), new SymjaIndentation(param.getIndentationLevel())));
			}
		}
		
		return string;
	}
	
	@Override
	public String visitExpressionMod(ExpressionMod expressionMod, SymjaIndentation param) {
		String string= new String();
		if (!(param instanceof SymjaIndentation)) {
			int initialIndentationLevel = 0;
			param = new SymjaIndentation(initialIndentationLevel);
		}
		
		Expression body = expressionMod.getBody();
		
        string = string.concat(body.accept(new SymjaExpressionVisitor(),
            new SymjaIndentation(param.getIndentationLevel())));
		return string;
	}
	
	@Override
	public String visitInteractive(Interactive interactive, SymjaIndentation param) {
		String string = new String();
		if (!(param instanceof SymjaIndentation)) {
			int initialIndentationLevel = 0;
			param = new SymjaIndentation(initialIndentationLevel);
		}
		
		Optional<Statement> body = interactive.getBody();
		
		if (body.isPresent()) {
			string = string.concat(body.get().accept(new SymjaStatementVisitor(), new SymjaIndentation(param.getIndentationLevel())));
		}
		
		return string;
	}
}
