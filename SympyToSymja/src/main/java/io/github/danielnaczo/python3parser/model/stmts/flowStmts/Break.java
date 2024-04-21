package io.github.danielnaczo.python3parser.model.stmts.flowStmts;

import io.github.danielnaczo.python3parser.model.stmts.Statement;
import io.github.danielnaczo.python3parser.visitors.basic.Python3ASTVisitor;

//e.g.:

// break
public class Break extends Statement{

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Break) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public <R, P> R accept(Python3ASTVisitor<R, P> visitor, P param) {
		return visitor.visitBreak(this, param);
	}
}
