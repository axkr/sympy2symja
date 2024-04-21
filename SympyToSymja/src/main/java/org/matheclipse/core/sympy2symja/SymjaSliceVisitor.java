package org.matheclipse.core.sympy2symja;

import java.util.List;
import java.util.Optional;
import io.github.danielnaczo.python3parser.model.expr.Expression;
import io.github.danielnaczo.python3parser.model.expr.atoms.trailers.subscripts.Index;
import io.github.danielnaczo.python3parser.model.expr.atoms.trailers.subscripts.slices.ExtSlice;
import io.github.danielnaczo.python3parser.model.expr.atoms.trailers.subscripts.slices.Slice;
import io.github.danielnaczo.python3parser.model.expr.atoms.trailers.subscripts.slices.SliceAbstract;

public class SymjaSliceVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{

	@Override
	public String visitExtSlice(ExtSlice extSlice, SymjaIndentation param) {
		String string =  new String();
		
		List<SliceAbstract> dims = extSlice.getDims();
		
		for (int i = 0; i < dims.size(); i++) {
			string = string.concat(dims.get(i).accept(new SymjaSliceVisitor(), new SymjaIndentation(param.getIndentationLevel())));
			
			if (i != dims.size() - 1) {
				string = string.concat(", ");
			}
		}
		return string;
	}
	
	@Override
	public String visitIndex(Index index, SymjaIndentation param) {
		String string = new String();
		
		Expression value = index.getValue();
        string = string.concat(value.accept(new SymjaExpressionVisitor(),
            new SymjaIndentation(param.getIndentationLevel())));
		return string;
	}
	
	@Override
	public String visitSlice(Slice slice, SymjaIndentation param) {
		String string = new String();
		
		Optional<Expression> lower = slice.getLower();
		Optional<Expression> upper = slice.getUpper();
		Optional<Expression> step = slice.getStep();
		
		if (lower.isPresent()) {
          string = string.concat(lower.get().accept(new SymjaExpressionVisitor(),
              new SymjaIndentation(param.getIndentationLevel())));
		}
		
		string = string.concat(":");
		
		if (upper.isPresent()) {
          string = string.concat(upper.get().accept(new SymjaExpressionVisitor(),
              new SymjaIndentation(param.getIndentationLevel())));
		}
		
		if (step.isPresent()) {
			string = string.concat(":");
            string = string.concat(step.get().accept(new SymjaExpressionVisitor(),
                new SymjaIndentation(param.getIndentationLevel())));
		}
		
		return string;
	}
}
