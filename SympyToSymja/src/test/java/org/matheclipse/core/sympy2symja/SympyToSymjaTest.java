package org.matheclipse.core.sympy2symja;

import static org.junit.Assert.assertEquals;
import org.apfloat.Apfloat;
import org.junit.Before;
import org.junit.Test;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.INum;

public class SympyToSymjaTest {

  static {
    F.initSymbols();
  }

  @Before
  public void setUp() throws Exception {}

  @Test
  public void testBessel() {
    check("csc(pi*nu)*besselj(-nu, z) - cot(pi*nu)*bessely(nu, z)", //
        "F.Subtract(F.Times(F.Csc(F.Times(F.Pi, nu)), F.BesselJ(F.Negate(nu), z)), F.Times(F.Cot(F.Times(F.Pi, nu)), F.BesselY(nu, z)))");
  }

  @Test
  public void testLineComment() {
    check("test  # this is a line comment", //
        "test");
    check("integrate((1 - t**z) / (1 - t), (t, 0, 1))  # this is a line comment", //
        "F.Integrate(F.Divide(F.Subtract(F.C1, F.Power(t, z)), F.Subtract(F.C1, t)), F.List(t, F.C0, F.C1))");
  }

  @Test
  public void testFloat() {
    INum apfloat = F.num(new Apfloat("0.3", 20));
    assertEquals(apfloat.toString(), "3*10^-1");
    check("Float(0.3, 20)", //
        "F.num(new Apfloat(\"0.3\", 20))");
    check("Float(3.5)", //
        "F.num(3.5)");
  }

  @Test
  public void testInteger() {
    check("Integer(42)", //
        "F.IntegerPart(F.ZZ(42))");
    check("Integer(-3.8)", //
        "F.IntegerPart(F.Negate(F.num(3.8)))");
    check("Integer(3.5)", //
        "F.IntegerPart(F.num(3.5))");
  }

  @Test
  public void testLegendreExpr() {
    // check("S.Half", //
    // "F.C1D2");
    check("(k, 0, floor((n - m)*S.Half))", //
        "F.List(k, F.C0, F.Floor(F.Times(F.Subtract(n, m), F.C1D2)))");
    check("(1 - x**2)**(m/2) * Sum(kern, (k, 0, floor((n - m)*S.Half)))", //
        "F.Times(F.Power(F.Subtract(F.C1, F.Power(x, F.C2)), F.Divide(m, F.C2)), F.Sum(kern, F.List(k, F.C0, F.Floor(F.Times(F.Subtract(n, m), F.C1D2)))))");
  }

  @Test
  public void testIntegrate() {
    check("-oo", //
        "F.CNInfinity");
    check("integrate(exp(-x**2), (x, -oo, oo))", //
        "F.Integrate(F.Exp(F.Negate(F.Power(x, F.C2))), F.List(x, F.CNInfinity, F.CInfinity))");
  }

  @Test
  public void testRelations() {
    check("(Tuple(Le(a, b), Le(c, a)), ITE(b >= c, true, Or(Le(a, b), Ge(a, c))))", //
        "F.List(F.List(F.LessEqual(a, b), F.LessEqual(c, a)), F.If(F.GreaterEqual(b, c), true, F.Or(F.LessEqual(a, b), F.GreaterEqual(a, c))))");
  }

  @Test
  public void testProduct() {
    check("product(ratio, (n, n0, n - 1))", //
        "F.Product(ratio, F.List(n, n0, F.Subtract(n, F.C1)))");
  }

  @Test
  public void testPower() {
    check("x*3**Rational(1, 6) / gamma(Rational(1, 3))", //
        "F.Divide(F.Times(x, F.Power(F.C3, F.Rational(F.C1, F.C6))), F.Gamma(F.Rational(F.C1, F.C3)))");
  }

  private void check(String str, String expected) {
    String symjaForm = SympyToSymjaExpr.toSymjaForm(str);
    assertEquals(expected, symjaForm);
  }
}
