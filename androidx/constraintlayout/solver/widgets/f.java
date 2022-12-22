package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.d;
import java.util.HashMap;

public class f extends ConstraintWidget {
  protected float N0 = -1.0F;
  
  protected int O0 = -1;
  
  protected int P0 = -1;
  
  private ConstraintAnchor Q0 = this.L;
  
  private int R0;
  
  private int S0;
  
  private boolean T0;
  
  public f() {
    byte b = 0;
    this.R0 = 0;
    this.S0 = 0;
    this.T.clear();
    this.T.add(this.Q0);
    int i = this.S.length;
    while (b < i) {
      this.S[b] = this.Q0;
      b++;
    } 
  }
  
  public void d1(d paramd, boolean paramBoolean) {
    if (L() == null)
      return; 
    int i = paramd.x(this.Q0);
    if (this.R0 == 1) {
      Z0(i);
      a1(0);
      z0(L().y());
      Y0(0);
    } else {
      Z0(0);
      a1(i);
      Y0(L().U());
      z0(0);
    } 
  }
  
  public ConstraintAnchor e1() {
    return this.Q0;
  }
  
  public int f1() {
    return this.R0;
  }
  
  public void g(d paramd, boolean paramBoolean) {
    SolverVariable solverVariable;
    boolean bool2;
    d d1 = (d)L();
    if (d1 == null)
      return; 
    ConstraintAnchor constraintAnchor1 = d1.p(ConstraintAnchor.Type.c);
    ConstraintAnchor constraintAnchor2 = d1.p(ConstraintAnchor.Type.e);
    ConstraintWidget constraintWidget = this.W;
    boolean bool1 = true;
    if (constraintWidget != null && constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.c) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (this.R0 == 0) {
      constraintAnchor1 = d1.p(ConstraintAnchor.Type.d);
      constraintAnchor2 = d1.p(ConstraintAnchor.Type.f);
      ConstraintWidget constraintWidget1 = this.W;
      if (constraintWidget1 != null && constraintWidget1.V[1] == ConstraintWidget.DimensionBehaviour.c) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
    } 
    if (this.T0 && this.Q0.n()) {
      SolverVariable solverVariable1 = paramd.q(this.Q0);
      paramd.f(solverVariable1, this.Q0.e());
      if (this.O0 != -1) {
        if (bool2)
          paramd.h(paramd.q(constraintAnchor2), solverVariable1, 0, 5); 
      } else if (this.P0 != -1 && bool2) {
        solverVariable = paramd.q(constraintAnchor2);
        paramd.h(solverVariable1, paramd.q(constraintAnchor1), 0, 5);
        paramd.h(solverVariable, solverVariable1, 0, 5);
      } 
      this.T0 = false;
      return;
    } 
    if (this.O0 != -1) {
      SolverVariable solverVariable1 = paramd.q(this.Q0);
      paramd.e(solverVariable1, paramd.q(constraintAnchor1), this.O0, 8);
      if (bool2)
        paramd.h(paramd.q(solverVariable), solverVariable1, 0, 5); 
    } else if (this.P0 != -1) {
      SolverVariable solverVariable1 = paramd.q(this.Q0);
      solverVariable = paramd.q(solverVariable);
      paramd.e(solverVariable1, solverVariable, -this.P0, 8);
      if (bool2) {
        paramd.h(solverVariable1, paramd.q(constraintAnchor1), 0, 5);
        paramd.h(solverVariable, solverVariable1, 0, 5);
      } 
    } else if (this.N0 != -1.0F) {
      paramd.d(d.s(paramd, paramd.q(this.Q0), paramd.q(solverVariable), this.N0));
    } 
  }
  
  public int g1() {
    return this.O0;
  }
  
  public boolean h() {
    return true;
  }
  
  public boolean h0() {
    return this.T0;
  }
  
  public int h1() {
    return this.P0;
  }
  
  public boolean i0() {
    return this.T0;
  }
  
  public float i1() {
    return this.N0;
  }
  
  public void j1(int paramInt) {
    this.Q0.t(paramInt);
    this.T0 = true;
  }
  
  public void k1(int paramInt) {
    if (paramInt > -1) {
      this.N0 = -1.0F;
      this.O0 = paramInt;
      this.P0 = -1;
    } 
  }
  
  public void l1(int paramInt) {
    if (paramInt > -1) {
      this.N0 = -1.0F;
      this.O0 = -1;
      this.P0 = paramInt;
    } 
  }
  
  public void m(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap) {
    super.m(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = paramConstraintWidget;
    this.N0 = ((f)paramConstraintWidget).N0;
    this.O0 = ((f)paramConstraintWidget).O0;
    this.P0 = ((f)paramConstraintWidget).P0;
    n1(((f)paramConstraintWidget).R0);
  }
  
  public void m1(float paramFloat) {
    if (paramFloat > -1.0F) {
      this.N0 = paramFloat;
      this.O0 = -1;
      this.P0 = -1;
    } 
  }
  
  public void n1(int paramInt) {
    if (this.R0 == paramInt)
      return; 
    this.R0 = paramInt;
    this.T.clear();
    if (this.R0 == 1) {
      this.Q0 = this.K;
    } else {
      this.Q0 = this.L;
    } 
    this.T.add(this.Q0);
    int i = this.S.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      this.S[paramInt] = this.Q0; 
  }
  
  public ConstraintAnchor p(ConstraintAnchor.Type paramType) {
    switch (a.a[paramType.ordinal()]) {
      default:
        throw new AssertionError(paramType.name());
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
        return null;
      case 3:
      case 4:
        if (this.R0 == 0)
          return this.Q0; 
      case 1:
      case 2:
        break;
    } 
    if (this.R0 == 1)
      return this.Q0; 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */