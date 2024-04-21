package org.matheclipse.core.sympy2symja;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.matheclipse.core.expression.F;

public class SympyToSymjaTest {

  static {
    F.initSymbols();
  }

  @Before
  public void setUp() throws Exception {}

  @Test
  public void testBessel() {
    check("csc(pi*nu)*besselj(-nu, z) - cot(pi*nu)*bessely(nu, z)", //
        "Subtract(Times(Csc(Times(Pi, nu)), BesselJ(Minusnu, z)), Times(Cot(Times(Pi, nu)), BesselY(nu, z)))");
  }

  @Test
  public void testPower() {
    check("x*3**Rational(1, 6) / gamma(Rational(1, 3))", //
        "Divide(Times(x, Power(3, Rational(1, 6))), Gamma(Rational(1, 3)))");
  }

  private void check(String str, String expected) {
    String symjaForm = SympyToSymjaExpr.toSymjaForm(str);
    assertEquals(expected, symjaForm);
  }
}
