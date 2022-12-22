package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public abstract class WidgetRun implements d {
  public int a;
  
  ConstraintWidget b;
  
  l c;
  
  protected ConstraintWidget.DimensionBehaviour d;
  
  f e = new f(this);
  
  public int f = 0;
  
  boolean g = false;
  
  public DependencyNode h = new DependencyNode(this);
  
  public DependencyNode i = new DependencyNode(this);
  
  protected RunType j = RunType.b;
  
  public WidgetRun(ConstraintWidget paramConstraintWidget) {
    this.b = paramConstraintWidget;
  }
  
  private void l(int paramInt1, int paramInt2) {
    int i = this.a;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i == 3) {
            m m;
            ConstraintWidget constraintWidget = this.b;
            k k = constraintWidget.f;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = k.d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.d;
            if (dimensionBehaviour1 == dimensionBehaviour2 && k.a == 3) {
              m m1 = constraintWidget.g;
              if (m1.d == dimensionBehaviour2 && m1.a == 3)
                return; 
            } 
            if (paramInt1 == 0)
              m = constraintWidget.g; 
            if (m.e.j) {
              float f1 = constraintWidget.w();
              if (paramInt1 == 1) {
                paramInt1 = (int)(m.e.g / f1 + 0.5F);
              } else {
                paramInt1 = (int)(f1 * m.e.g + 0.5F);
              } 
              this.e.d(paramInt1);
            } 
          } 
        } else {
          ConstraintWidget constraintWidget = this.b.L();
          if (constraintWidget != null) {
            k k;
            m m;
            if (paramInt1 == 0) {
              k = constraintWidget.f;
            } else {
              m = ((ConstraintWidget)k).g;
            } 
            f f1 = m.e;
            if (f1.j) {
              float f2;
              ConstraintWidget constraintWidget1 = this.b;
              if (paramInt1 == 0) {
                f2 = constraintWidget1.v;
              } else {
                f2 = constraintWidget1.y;
              } 
              paramInt2 = (int)(f1.g * f2 + 0.5F);
              this.e.d(g(paramInt2, paramInt1));
            } 
          } 
        } 
      } else {
        paramInt1 = g(this.e.m, paramInt1);
        this.e.d(Math.min(paramInt1, paramInt2));
      } 
    } else {
      this.e.d(g(paramInt2, paramInt1));
    } 
  }
  
  public void a(d paramd) {}
  
  protected final void b(DependencyNode paramDependencyNode1, DependencyNode paramDependencyNode2, int paramInt) {
    paramDependencyNode1.l.add(paramDependencyNode2);
    paramDependencyNode1.f = paramInt;
    paramDependencyNode2.k.add(paramDependencyNode1);
  }
  
  protected final void c(DependencyNode paramDependencyNode1, DependencyNode paramDependencyNode2, int paramInt, f paramf) {
    paramDependencyNode1.l.add(paramDependencyNode2);
    paramDependencyNode1.l.add(this.e);
    paramDependencyNode1.h = paramInt;
    paramDependencyNode1.i = paramf;
    paramDependencyNode2.k.add(paramDependencyNode1);
    paramf.k.add(paramDependencyNode1);
  }
  
  abstract void d();
  
  abstract void e();
  
  abstract void f();
  
  protected final int g(int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      ConstraintWidget constraintWidget = this.b;
      int i = constraintWidget.u;
      paramInt2 = Math.max(constraintWidget.t, paramInt1);
      if (i > 0)
        paramInt2 = Math.min(i, paramInt1); 
      i = paramInt1;
      if (paramInt2 != paramInt1)
        return paramInt2; 
    } else {
      ConstraintWidget constraintWidget = this.b;
      int i = constraintWidget.x;
      paramInt2 = Math.max(constraintWidget.w, paramInt1);
      if (i > 0)
        paramInt2 = Math.min(i, paramInt1); 
      i = paramInt1;
      if (paramInt2 != paramInt1)
        return paramInt2; 
    } 
    return SYNTHETIC_LOCAL_VARIABLE_4;
  }
  
  protected final DependencyNode h(ConstraintAnchor paramConstraintAnchor) {
    DependencyNode dependencyNode;
    ConstraintAnchor constraintAnchor = paramConstraintAnchor.f;
    paramConstraintAnchor = null;
    if (constraintAnchor == null)
      return null; 
    ConstraintWidget constraintWidget = constraintAnchor.d;
    ConstraintAnchor.Type type = constraintAnchor.e;
    int i = a.a[type.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i == 5)
              dependencyNode = constraintWidget.g.i; 
          } else {
            dependencyNode = constraintWidget.g.k;
          } 
        } else {
          dependencyNode = constraintWidget.g.h;
        } 
      } else {
        dependencyNode = constraintWidget.f.i;
      } 
    } else {
      dependencyNode = constraintWidget.f.h;
    } 
    return dependencyNode;
  }
  
  protected final DependencyNode i(ConstraintAnchor paramConstraintAnchor, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   4: astore_3
    //   5: aconst_null
    //   6: astore #4
    //   8: aload_3
    //   9: ifnonnull -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: aload_3
    //   15: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   18: astore_1
    //   19: iload_2
    //   20: ifne -> 31
    //   23: aload_1
    //   24: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   27: astore_1
    //   28: goto -> 36
    //   31: aload_1
    //   32: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   35: astore_1
    //   36: aload_3
    //   37: getfield e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   40: astore_3
    //   41: getstatic androidx/constraintlayout/solver/widgets/analyzer/WidgetRun$a.a : [I
    //   44: aload_3
    //   45: invokevirtual ordinal : ()I
    //   48: iaload
    //   49: istore_2
    //   50: iload_2
    //   51: iconst_1
    //   52: if_icmpeq -> 84
    //   55: iload_2
    //   56: iconst_2
    //   57: if_icmpeq -> 76
    //   60: iload_2
    //   61: iconst_3
    //   62: if_icmpeq -> 84
    //   65: iload_2
    //   66: iconst_5
    //   67: if_icmpeq -> 76
    //   70: aload #4
    //   72: astore_1
    //   73: goto -> 89
    //   76: aload_1
    //   77: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   80: astore_1
    //   81: goto -> 89
    //   84: aload_1
    //   85: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   88: astore_1
    //   89: aload_1
    //   90: areturn
  }
  
  public long j() {
    f f1 = this.e;
    return f1.j ? f1.g : 0L;
  }
  
  public boolean k() {
    return this.g;
  }
  
  abstract boolean m();
  
  protected void n(d paramd, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, int paramInt) {
    DependencyNode dependencyNode = h(paramConstraintAnchor1);
    paramd = h(paramConstraintAnchor2);
    if (dependencyNode.j && ((DependencyNode)paramd).j) {
      float f2;
      int i = dependencyNode.g + paramConstraintAnchor1.f();
      int j = ((DependencyNode)paramd).g - paramConstraintAnchor2.f();
      int k = j - i;
      if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.d)
        l(paramInt, k); 
      f f1 = this.e;
      if (!f1.j)
        return; 
      if (f1.g == k) {
        this.h.d(i);
        this.i.d(j);
        return;
      } 
      ConstraintWidget constraintWidget = this.b;
      if (paramInt == 0) {
        f2 = constraintWidget.z();
      } else {
        f2 = constraintWidget.P();
      } 
      paramInt = j;
      if (dependencyNode == paramd) {
        i = dependencyNode.g;
        paramInt = ((DependencyNode)paramd).g;
        f2 = 0.5F;
      } 
      j = this.e.g;
      this.h.d((int)(i + 0.5F + (paramInt - i - j) * f2));
      this.i.d(this.h.g + this.e.g);
    } 
  }
  
  protected void o(d paramd) {}
  
  protected void p(d paramd) {}
  
  enum RunType {
    b, c, d, e;
    
    static {
      RunType runType1 = new RunType("NONE", 0);
      b = runType1;
      RunType runType2 = new RunType("START", 1);
      c = runType2;
      RunType runType3 = new RunType("END", 2);
      d = runType3;
      RunType runType4 = new RunType("CENTER", 3);
      e = runType4;
      f = new RunType[] { runType1, runType2, runType3, runType4 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/WidgetRun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */