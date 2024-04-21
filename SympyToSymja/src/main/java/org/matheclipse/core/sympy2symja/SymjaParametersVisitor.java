package org.matheclipse.core.sympy2symja;

import java.util.List;
import java.util.Optional;
import io.github.danielnaczo.python3parser.model.expr.Expression;
import io.github.danielnaczo.python3parser.model.stmts.compoundStmts.functionStmts.parameters.DefaultParameter;
import io.github.danielnaczo.python3parser.model.stmts.compoundStmts.functionStmts.parameters.Parameter;
import io.github.danielnaczo.python3parser.model.stmts.compoundStmts.functionStmts.parameters.Parameters;

public class SymjaParametersVisitor extends SymjaGenericUnsupportedASTVisitor<String, SymjaIndentation>{

	@Override
	public String visitParameters(Parameters parametersClass, SymjaIndentation param) {
		String string = new String();
		
		List<Parameter> parameters = parametersClass.getParams();
		List<DefaultParameter> defaultParams = parametersClass.getDefaultParams();
		Optional<Parameter> varParam = parametersClass.getVarParam();

		List<Parameter> kwonlyParams = parametersClass.getKwonlyParams();
		List<DefaultParameter> kwDefaultParams = parametersClass.getKwDefaultParams();
		Optional<Parameter> kwParam = parametersClass.getKwParam();
		
		if (parameters != null) {
			for (int i = 0; i < parameters.size(); i++) {
				if (!string.isEmpty()) {
					string = string.concat(", ");
				}
				
				string = string.concat(parameters.get(i).accept(new SymjaParametersVisitor(), new SymjaIndentation(param.getIndentationLevel())));
			}
		}
		
		if (defaultParams != null) {
			for (int i = 0; i < defaultParams.size(); i++	) {
				if (!string.isEmpty()) {
					string = string.concat(", ");
				}
				
				string = string.concat(defaultParams.get(i).accept(new SymjaParametersVisitor(), new SymjaIndentation(param.getIndentationLevel())));
			}
		}
		
		if (varParam.isPresent()) {
			if (!string.isEmpty()) {
				string = string.concat(", ");
			}
			string = string.concat("*");
			string = string.concat(varParam.get().accept(new SymjaParametersVisitor(), new SymjaIndentation(param.getIndentationLevel())));
		}
		
		if (kwonlyParams != null) {
			for (int i = 0; i < kwonlyParams.size(); i++) {
				if (!string.isEmpty()) {
					string = string.concat(", ");
				}
				string = string.concat(kwonlyParams.get(i).accept(new SymjaParametersVisitor(), new SymjaIndentation(param.getIndentationLevel())));
			}
		}
		
		if (kwDefaultParams != null) {
			for (int i = 0; i < kwDefaultParams.size(); i++) {
				if (!string.isEmpty()) {
					string = string.concat(", ");
				}
				string = string.concat(kwDefaultParams.get(i).accept(new SymjaParametersVisitor(), new SymjaIndentation(param.getIndentationLevel())));
			}
		}
		
		if (kwParam.isPresent()) {
			if (!string.isEmpty()) {
				string = string.concat(", ");
			}
			string = string.concat("**");
			string = string.concat(kwParam.get().accept(new SymjaParametersVisitor(), new SymjaIndentation(param.getIndentationLevel())));
		}
		
		return string;
	}
	
	@Override
	public String visitParameter(Parameter parameterClass, SymjaIndentation param) {
		String string = new String();
		
		String parameterName = parameterClass.getParameterName().getName(); //when parameter is '*' then it's this case: def sum(a, b, * , c, d)
		Optional<Expression> annotation = parameterClass.getAnnotation();
		
		if (!parameterName.equals("*")) {
			string = string.concat(parameterName);			
		}
		
		if (annotation.isPresent()) {
			string = string.concat(": ");
            string = string.concat(annotation.get().accept(new SymjaExpressionVisitor(),
                new SymjaIndentation(param.getIndentationLevel())));
		}
		
		return string;
	}
	
	@Override
	public String visitDefaultParameter(DefaultParameter defaultParameter, SymjaIndentation param) {
		String string = new String();
		
		Parameter parameter = defaultParameter.getParameter();
		Expression value = defaultParameter.getValue();
		
		string = string.concat(parameter.accept(new SymjaParametersVisitor(), new SymjaIndentation(param.getIndentationLevel())));
		string = string.concat(" = ");
        string = string.concat(value.accept(new SymjaExpressionVisitor(),
            new SymjaIndentation(param.getIndentationLevel())));
		return string;
	}
}
