package org.matheclipse.core.sympy2symja;

import java.util.Optional;
import io.github.danielnaczo.python3parser.model.expr.Expression;
import io.github.danielnaczo.python3parser.model.stmts.compoundStmts.functionStmts.Decorator;

public class SymjaDecoratorVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation> {
	@Override
	public String visitDecorator(Decorator decorator, SymjaIndentation param) {
		String string = new String();
		
		String name = decorator.getName().getName();
		Optional<Expression> arguments = decorator.getArguments();
		
		string = string.concat("@");
		string = string.concat(name);

		if (arguments.isPresent()) {
          string = string.concat(arguments.get().accept(new SymjaExpressionVisitor(),
              new SymjaIndentation(param.getIndentationLevel())));
		}
		
		return string;
	}
}
