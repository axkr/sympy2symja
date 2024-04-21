package org.matheclipse.core.sympy2symja;

import java.util.List;
import io.github.danielnaczo.python3parser.model.expr.Expression;
import io.github.danielnaczo.python3parser.model.expr.comprehensions.Comprehension;

public class SymjaComprehensionVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{

	@Override
	public String visitComprehension(Comprehension comprehension, SymjaIndentation param) {
		String string = new String();
		
		Expression target = comprehension.getTarget();
		Expression iter = comprehension.getIter();
		List<Expression> ifs = comprehension.getIfs();
		int isAsync = comprehension.getIsAsync();
		
		if (isAsync == 1) {
			string = string.concat("async ");
		}
		
		string = string.concat("for ");
		
        string = string.concat(target.accept(new SymjaExpressionVisitor(),
            new SymjaIndentation(param.getIndentationLevel())));
		string = string.concat(" in ");
        string = string.concat(iter.accept(new SymjaExpressionVisitor(),
            new SymjaIndentation(param.getIndentationLevel())));
		
		for (int i = 0; i < ifs.size(); i++) {
			string = string.concat(" if ");
            string = string.concat(ifs.get(i).accept(new SymjaExpressionVisitor(),
                new SymjaIndentation(param.getIndentationLevel())));
		}
		
		return string;
	}
}
