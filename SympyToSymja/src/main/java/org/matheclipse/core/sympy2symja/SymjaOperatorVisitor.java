package org.matheclipse.core.sympy2symja;

import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.Add;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.At;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.BitAnd;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.BitOr;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.BitXor;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.Div;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.FloorDiv;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.LShift;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.Mult;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.Pow;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.RShift;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.Sub;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.boolops.And;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.boolops.Or;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.Eq;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.Gt;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.GtE;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.In;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.Is;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.IsNot;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.Lt;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.LtE;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.NotEq;
import io.github.danielnaczo.python3parser.model.expr.operators.binaryops.comparisons.NotIn;

public class SymjaOperatorVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{

	@Override
	public String visitAdd(Add add, SymjaIndentation param) {
      return "F.Plus";
	}
	
	@Override
	public String visitAt(At at, SymjaIndentation param) {
		return "@";
	}
	
	@Override
	public String visitBitAnd(BitAnd bitAnd, SymjaIndentation param) {
		return "&";
	}
	
	@Override
	public String visitBitOr(BitOr bitOr, SymjaIndentation param) {
		return "|";
	}
	
	@Override
	public String visitBitXor(BitXor bitXor, SymjaIndentation param) {
		return "^";
	}
	
	@Override
	public String visitDiv(Div div, SymjaIndentation param) {
      return "F.Divide";
	}
	
	@Override
	public String visitFloorDiv(FloorDiv floorDiv, SymjaIndentation param) {
      return "F.Quotient"; // maybe "//" could be wrong string
	}
	
	@Override
	public String visitLShift(LShift lShift, SymjaIndentation param) {
		return "<<";
	}
	
	@Override
	public String visitModulo(io.github.danielnaczo.python3parser.model.expr.operators.binaryops.Mod modulo, SymjaIndentation param) {
      return "F.Mod";
	}
	
	@Override
	public String visitMult(Mult mult, SymjaIndentation param) {
      return "F.Times";
	}
	
	@Override
	public String visitPow(Pow pow, SymjaIndentation param) {
      return "F.Power";
	}
	
	@Override
	public String visitRShift(RShift rShift, SymjaIndentation param) {
		return ">>";
	}
	
	@Override
	public String visitSub(Sub sub, SymjaIndentation param) {
      return "F.Subtract";
	}
	
	@Override
	public String visitEq(Eq eq, SymjaIndentation param) {
      return "F.Equal";
	}
	
	@Override
	public String visitGt(Gt gt, SymjaIndentation param) {
      return "F.Greater";
	}
	
	@Override
	public String visitGtE(GtE gte, SymjaIndentation param) {
      return "F.GreaterEqual";
	}
	
	@Override
	public String visitIn(In in, SymjaIndentation param) {
		return "in";
	}
	
	@Override
	public String visitIs(Is is, SymjaIndentation param) {
		return "is";
	}
	
	@Override
	public String visitIsNot(IsNot isNot, SymjaIndentation param) {
		return "is not";
	}
	
	@Override
	public String visitLt(Lt lt, SymjaIndentation param) {
      return "F.Less";
	}
	
	@Override
	public String visitLtE(LtE lte, SymjaIndentation param) {
      return "F.LessEqual";
	}
	
	@Override
	public String visitNotEq(NotEq notEq, SymjaIndentation param) {
      return "F.Unequal";
	}
	
	@Override
	public String visitNotIn(NotIn notIn, SymjaIndentation param) {
		return "not in";
	}
	
	@Override
	public String visitOr(Or notIn, SymjaIndentation param) {
      return "F.Or";
	}
	
	@Override
	public String visitAnd(And notIn, SymjaIndentation param) {
      return "F.And";
	}
}
