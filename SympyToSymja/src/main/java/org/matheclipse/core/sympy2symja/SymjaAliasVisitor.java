package org.matheclipse.core.sympy2symja;

import java.util.Optional;
import io.github.danielnaczo.python3parser.model.Identifier;
import io.github.danielnaczo.python3parser.model.stmts.importStmts.Alias;

public class SymjaAliasVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{

	@Override
	public String visitAlias(Alias alias, SymjaIndentation param) {
		String string = new String();
		String name = alias.getName().getName();
		Optional<Identifier> asname = alias.getAsName();
		
		string = string.concat(name);
		
		if (asname.isPresent()) {
			string = string.concat(" as " + asname.get().getName());
		}
		
		return string;
	}
}
