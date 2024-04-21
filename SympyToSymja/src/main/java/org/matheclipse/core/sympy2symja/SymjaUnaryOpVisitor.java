package org.matheclipse.core.sympy2symja;

import io.github.danielnaczo.python3parser.model.expr.operators.unaryops.Await;
import io.github.danielnaczo.python3parser.model.expr.operators.unaryops.Invert;
import io.github.danielnaczo.python3parser.model.expr.operators.unaryops.Not;
import io.github.danielnaczo.python3parser.model.expr.operators.unaryops.Starred;
import io.github.danielnaczo.python3parser.model.expr.operators.unaryops.UAdd;
import io.github.danielnaczo.python3parser.model.expr.operators.unaryops.USub;

public class SymjaUnaryOpVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{

	@Override
	public String visitAwait(Await await, SymjaIndentation param) {
		return "await ";
	}
	
	@Override
	public String visitInvert(Invert invert, SymjaIndentation param) {
		return "~";
	}
	
	@Override
	public String visitNot(Not not, SymjaIndentation param) {
      return "F.Not";
	}
	
	@Override
	public String visitUAdd(UAdd uAdd, SymjaIndentation param) {
      return "F.Plus";
	}
	
	@Override
	public String visitUSub(USub uSub, SymjaIndentation param) {
      return "F.Negate";
	}
	
	@Override
  public String visitStarred(Starred starred, SymjaIndentation param) {
		return "*";
	}
}
