package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;

public class c {
  protected ConstraintWidget a;
  
  protected ConstraintWidget b;
  
  protected ConstraintWidget c;
  
  protected ConstraintWidget d;
  
  protected ConstraintWidget e;
  
  protected ConstraintWidget f;
  
  protected ConstraintWidget g;
  
  protected ArrayList<ConstraintWidget> h;
  
  protected int i;
  
  protected int j;
  
  protected float k = 0.0F;
  
  int l;
  
  int m;
  
  int n;
  
  boolean o;
  
  private int p;
  
  private boolean q = false;
  
  protected boolean r;
  
  protected boolean s;
  
  protected boolean t;
  
  protected boolean u;
  
  private boolean v;
  
  public c(ConstraintWidget paramConstraintWidget, int paramInt, boolean paramBoolean) {
    this.a = paramConstraintWidget;
    this.p = paramInt;
    this.q = paramBoolean;
  }
  
  private void b() {
    int i = this.p * 2;
    ConstraintWidget constraintWidget1 = this.a;
    boolean bool1 = true;
    this.o = true;
    ConstraintWidget constraintWidget2 = constraintWidget1;
    boolean bool2 = false;
    while (!bool2) {
      this.i++;
      ConstraintWidget[] arrayOfConstraintWidget = constraintWidget1.I0;
      int j = this.p;
      ConstraintWidget constraintWidget = null;
      arrayOfConstraintWidget[j] = null;
      constraintWidget1.H0[j] = null;
      if (constraintWidget1.T() != 8) {
        this.l++;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget1.v(this.p);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.d;
        if (dimensionBehaviour2 != dimensionBehaviour1)
          this.m += constraintWidget1.F(this.p); 
        int k = this.m + constraintWidget1.S[i].f();
        this.m = k;
        ConstraintAnchor[] arrayOfConstraintAnchor = constraintWidget1.S;
        j = i + 1;
        this.m = k + arrayOfConstraintAnchor[j].f();
        k = this.n + constraintWidget1.S[i].f();
        this.n = k;
        this.n = k + constraintWidget1.S[j].f();
        if (this.b == null)
          this.b = constraintWidget1; 
        this.d = constraintWidget1;
        ConstraintWidget.DimensionBehaviour[] arrayOfDimensionBehaviour = constraintWidget1.V;
        j = this.p;
        if (arrayOfDimensionBehaviour[j] == dimensionBehaviour1) {
          int[] arrayOfInt = constraintWidget1.s;
          if (arrayOfInt[j] == 0 || arrayOfInt[j] == 3 || arrayOfInt[j] == 2) {
            this.j++;
            float[] arrayOfFloat = constraintWidget1.G0;
            float f = arrayOfFloat[j];
            if (f > 0.0F)
              this.k += arrayOfFloat[j]; 
            if (c(constraintWidget1, j)) {
              if (f < 0.0F) {
                this.r = true;
              } else {
                this.s = true;
              } 
              if (this.h == null)
                this.h = new ArrayList<ConstraintWidget>(); 
              this.h.add(constraintWidget1);
            } 
            if (this.f == null)
              this.f = constraintWidget1; 
            ConstraintWidget constraintWidget3 = this.g;
            if (constraintWidget3 != null)
              constraintWidget3.H0[this.p] = constraintWidget1; 
            this.g = constraintWidget1;
          } 
          if (this.p == 0) {
            if (constraintWidget1.q != 0) {
              this.o = false;
            } else if (constraintWidget1.t != 0 || constraintWidget1.u != 0) {
              this.o = false;
            } 
          } else if (constraintWidget1.r != 0) {
            this.o = false;
          } else if (constraintWidget1.w != 0 || constraintWidget1.x != 0) {
            this.o = false;
          } 
          if (constraintWidget1.Z != 0.0F) {
            this.o = false;
            this.u = true;
          } 
        } 
      } 
      if (constraintWidget2 != constraintWidget1)
        constraintWidget2.I0[this.p] = constraintWidget1; 
      ConstraintAnchor constraintAnchor = (constraintWidget1.S[i + 1]).f;
      constraintWidget2 = constraintWidget;
      if (constraintAnchor != null) {
        ConstraintWidget constraintWidget3 = constraintAnchor.d;
        ConstraintAnchor[] arrayOfConstraintAnchor = constraintWidget3.S;
        constraintWidget2 = constraintWidget;
        if ((arrayOfConstraintAnchor[i]).f != null)
          if ((arrayOfConstraintAnchor[i]).f.d != constraintWidget1) {
            constraintWidget2 = constraintWidget;
          } else {
            constraintWidget2 = constraintWidget3;
          }  
      } 
      if (constraintWidget2 == null) {
        constraintWidget2 = constraintWidget1;
        bool2 = true;
      } 
      constraintWidget = constraintWidget1;
      constraintWidget1 = constraintWidget2;
      constraintWidget2 = constraintWidget;
    } 
    constraintWidget2 = this.b;
    if (constraintWidget2 != null)
      this.m -= constraintWidget2.S[i].f(); 
    constraintWidget2 = this.d;
    if (constraintWidget2 != null)
      this.m -= constraintWidget2.S[i + 1].f(); 
    this.c = constraintWidget1;
    if (this.p == 0 && this.q) {
      this.e = constraintWidget1;
    } else {
      this.e = this.a;
    } 
    if (!this.s || !this.r)
      bool1 = false; 
    this.t = bool1;
  }
  
  private static boolean c(ConstraintWidget paramConstraintWidget, int paramInt) {
    if (paramConstraintWidget.T() != 8 && paramConstraintWidget.V[paramInt] == ConstraintWidget.DimensionBehaviour.d) {
      int[] arrayOfInt = paramConstraintWidget.s;
      if (arrayOfInt[paramInt] == 0 || arrayOfInt[paramInt] == 3)
        return true; 
    } 
    return false;
  }
  
  public void a() {
    if (!this.v)
      b(); 
    this.v = true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */