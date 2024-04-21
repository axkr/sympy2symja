package org.matheclipse.core.sympy2symja;

import java.util.Optional;
import io.github.danielnaczo.python3parser.model.expr.Expression;
import io.github.danielnaczo.python3parser.model.stmts.compoundStmts.withStmts.WithItem;

public class SymjaWithItemVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{
	
	@Override
	public String visitWithItem(WithItem withItem, SymjaIndentation param) {
		String string = new String();
		
		Expression contextExpr = withItem.getContextExpr();
		Optional<Expression> optionalVars = withItem.getOptionalVars();
		
        string = string.concat(contextExpr.accept(new SymjaExpressionVisitor(),
            new SymjaIndentation(param.getIndentationLevel())));
		
		if (optionalVars.isPresent()) {
			string = string.concat(" as ");
            string =
                string.concat(optionalVars.get().accept(new SymjaExpressionVisitor(),
                    new SymjaIndentation(param.getIndentationLevel())));
		}
		
		return string;
	}
}
