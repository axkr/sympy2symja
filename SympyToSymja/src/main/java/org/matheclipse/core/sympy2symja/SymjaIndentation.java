package org.matheclipse.core.sympy2symja;

public class SymjaIndentation {

	//class for managing indentationLevel
	
	private int indentationLevel;
	
	public SymjaIndentation(int indentationLevel) {
		this.indentationLevel = indentationLevel;
	}
	
	public int getIndentationLevel() {
		return indentationLevel;
	}
	
	public String getIndentationString() {
		String string = new String();
		for (int i = 0; i < indentationLevel; i++) {
			string = string.concat("    ");
		}
		
		return string;
	}
}
