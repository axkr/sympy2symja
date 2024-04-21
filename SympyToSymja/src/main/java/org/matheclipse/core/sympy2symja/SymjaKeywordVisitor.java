package org.matheclipse.core.sympy2symja;

import java.util.Optional;
import io.github.danielnaczo.python3parser.model.expr.Expression;
import io.github.danielnaczo.python3parser.model.expr.atoms.trailers.arguments.Keyword;

public class SymjaKeywordVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{

	@Override
	public String visitKeyword(Keyword keyword, SymjaIndentation param) {
		String string = new String();
		
		Optional<Expression> arg = keyword.getArg();
		Expression value = keyword.getValue();
		
		if (arg.isPresent()) {
          string = string.concat(arg.get().accept(new SymjaExpressionVisitor(),
              new SymjaIndentation(param.getIndentationLevel())));
			string = string.concat("=");
		}
        string = string.concat(value.accept(new SymjaExpressionVisitor(),
            new SymjaIndentation(param.getIndentationLevel())));
		return string;
	}
}
