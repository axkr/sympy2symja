package org.matheclipse.core.sympy2symja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.form.Documentation;
import io.github.danielnaczo.python3parser.model.mods.ExpressionMod;
import io.github.danielnaczo.python3parser.utilities.ASTParser;

public class SympyToSymjaExpr {
  
  public static String readString() {
    final StringBuilder input = new StringBuilder();
    final BufferedReader in =
        new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
    boolean done = false;

    try {
      while (!done) {
        System.out.print("▶ ");
        final String s = in.readLine();
        if (s != null) {
          if ((s.length() > 0) && (s.charAt(s.length() - 1) != '\\')) {
            input.append(s);
            done = true;
          } else {
            if (s.length() > 1) {
              input.append(s.substring(0, s.length() - 1));
            } else {
              input.append(' ');
            }
          }
        }
      }
    } catch (final IOException e1) {
      e1.printStackTrace();
    }
    return input.toString();
  }

  
  public static void main(String[] args) throws Exception {
    System.out.println(
        "Create a Symja Java string from the SymPy expression input");
    F.initSymbols();
    String inputExpression;
    String trimmedInput;
    while (true) {
      try {
        inputExpression = readString();
        if (inputExpression != null) {
          trimmedInput = inputExpression.trim();
          if ((trimmedInput.length() >= 4)
              && trimmedInput.toLowerCase(Locale.ENGLISH).substring(0, 4).equals("exit")) {
            System.out.println("Closing Symja console... bye.");
            System.exit(0);
          } else if (trimmedInput.length() > 1 && trimmedInput.charAt(0) == '?') {
            Documentation.findDocumentation(System.out, trimmedInput);
            continue;
          }
          System.out.println();
          String symjaForm = toSymjaForm(trimmedInput);
          System.out.println(symjaForm);
          System.out.println();
        }
      } catch (final Exception e) {
        System.out.println(e.getMessage());
      }
    }
  

    // String str = "x*3**Rational(1, 6) / gamma(Rational(1, 3))";
    // String str = "csc(pi*nu)*bessely(-nu, z) - cot(pi*nu)*bessely(nu, z)";
    // toSymjaForm(str);
  }


  public static String toSymjaForm(String str) {
    ExpressionMod expressionModWithCode =
        ASTParser.parseExpressionModWithCode(str);
    return expressionModWithCode.accept(new SymjaModuleVisitor(), null);
  }
}
