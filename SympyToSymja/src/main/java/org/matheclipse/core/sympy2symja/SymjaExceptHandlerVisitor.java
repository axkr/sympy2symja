package org.matheclipse.core.sympy2symja;

import java.util.Optional;
import io.github.danielnaczo.python3parser.model.Identifier;
import io.github.danielnaczo.python3parser.model.expr.Expression;
import io.github.danielnaczo.python3parser.model.stmts.compoundStmts.tryExceptStmts.ExceptHandler;

public class SymjaExceptHandlerVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{

	@Override
	public String visitExceptHandler(ExceptHandler exceptHandler, SymjaIndentation param) {
		String string = new String();
		string = string.concat(param.getIndentationString());
		
		Optional<Expression> error = exceptHandler.getError();
		Optional<Identifier> errorAsName = exceptHandler.getErrorAsName();
		
		string = string.concat("except");
		
		if (error.isPresent()) {
			string = string.concat(" ");
            string = string.concat(error.get().accept(new SymjaExpressionVisitor(),
                new SymjaIndentation(param.getIndentationLevel())));
			
			if (errorAsName.isPresent()) {
				string = string.concat(" as ");
				string = string.concat(errorAsName.get().getName());
			}
		}
		
		string = string.concat(":");
		
		string = string.concat("\n");
		return string;
	}
}
