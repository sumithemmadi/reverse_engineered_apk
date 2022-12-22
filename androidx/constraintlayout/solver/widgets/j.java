package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.b;

public class j extends h {
  private int P0 = 0;
  
  private int Q0 = 0;
  
  private int R0 = 0;
  
  private int S0 = 0;
  
  private int T0 = 0;
  
  private int U0 = 0;
  
  private int V0 = 0;
  
  private int W0 = 0;
  
  private boolean X0 = false;
  
  private int Y0 = 0;
  
  private int Z0 = 0;
  
  protected b.a a1 = new b.a();
  
  b.b b1 = null;
  
  public void A1(int paramInt) {
    this.P0 = paramInt;
  }
  
  public void c(d paramd) {
    h1();
  }
  
  public void g1(boolean paramBoolean) {
    int i = this.T0;
    if (i > 0 || this.U0 > 0)
      if (paramBoolean) {
        this.V0 = this.U0;
        this.W0 = i;
      } else {
        this.V0 = i;
        this.W0 = this.U0;
      }  
  }
  
  public void h1() {
    for (byte b1 = 0; b1 < this.O0; b1++) {
      ConstraintWidget constraintWidget = this.N0[b1];
      if (constraintWidget != null)
        constraintWidget.I0(true); 
    } 
  }
  
  public int i1() {
    return this.Z0;
  }
  
  public int j1() {
    return this.Y0;
  }
  
  public int k1() {
    return this.Q0;
  }
  
  public int l1() {
    return this.V0;
  }
  
  public int m1() {
    return this.W0;
  }
  
  public int n1() {
    return this.P0;
  }
  
  public void o1(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected void p1(ConstraintWidget paramConstraintWidget, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour1, int paramInt1, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour2, int paramInt2) {
    while (this.b1 == null && L() != null)
      this.b1 = ((d)L()).v1(); 
    b.a a1 = this.a1;
    a1.d = paramDimensionBehaviour1;
    a1.e = paramDimensionBehaviour2;
    a1.f = paramInt1;
    a1.g = paramInt2;
    this.b1.b(paramConstraintWidget, a1);
    paramConstraintWidget.Y0(this.a1.h);
    paramConstraintWidget.z0(this.a1.i);
    paramConstraintWidget.y0(this.a1.k);
    paramConstraintWidget.o0(this.a1.j);
  }
  
  protected boolean q1() {
    ConstraintWidget constraintWidget = this.W;
    if (constraintWidget != null) {
      b.b b2 = ((d)constraintWidget).v1();
    } else {
      constraintWidget = null;
    } 
    if (constraintWidget == null)
      return false; 
    byte b1 = 0;
    while (true) {
      int i = this.O0;
      boolean bool = true;
      if (b1 < i) {
        ConstraintWidget constraintWidget1 = this.N0[b1];
        if (constraintWidget1 != null && !(constraintWidget1 instanceof f)) {
          ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = constraintWidget1.v(0);
          ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget1.v(1);
          ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.d;
          if (dimensionBehaviour1 != dimensionBehaviour3 || constraintWidget1.q == 1 || dimensionBehaviour2 != dimensionBehaviour3 || constraintWidget1.r == 1)
            bool = false; 
          if (!bool) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviour1;
            if (dimensionBehaviour1 == dimensionBehaviour3)
              dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c; 
            dimensionBehaviour1 = dimensionBehaviour2;
            if (dimensionBehaviour2 == dimensionBehaviour3)
              dimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.c; 
            b.a a1 = this.a1;
            a1.d = dimensionBehaviour;
            a1.e = dimensionBehaviour1;
            a1.f = constraintWidget1.U();
            this.a1.g = constraintWidget1.y();
            constraintWidget.b(constraintWidget1, this.a1);
            constraintWidget1.Y0(this.a1.h);
            constraintWidget1.z0(this.a1.i);
            constraintWidget1.o0(this.a1.j);
          } 
        } 
        b1++;
        continue;
      } 
      return true;
    } 
  }
  
  public boolean r1() {
    return this.X0;
  }
  
  protected void s1(boolean paramBoolean) {
    this.X0 = paramBoolean;
  }
  
  public void t1(int paramInt1, int paramInt2) {
    this.Y0 = paramInt1;
    this.Z0 = paramInt2;
  }
  
  public void u1(int paramInt) {
    this.R0 = paramInt;
    this.P0 = paramInt;
    this.S0 = paramInt;
    this.Q0 = paramInt;
    this.T0 = paramInt;
    this.U0 = paramInt;
  }
  
  public void v1(int paramInt) {
    this.Q0 = paramInt;
  }
  
  public void w1(int paramInt) {
    this.U0 = paramInt;
  }
  
  public void x1(int paramInt) {
    this.R0 = paramInt;
    this.V0 = paramInt;
  }
  
  public void y1(int paramInt) {
    this.S0 = paramInt;
    this.W0 = paramInt;
  }
  
  public void z1(int paramInt) {
    this.T0 = paramInt;
    this.V0 = paramInt;
    this.W0 = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */