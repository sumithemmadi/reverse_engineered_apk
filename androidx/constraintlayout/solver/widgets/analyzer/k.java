package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public class k extends WidgetRun {
  private static int[] k = new int[2];
  
  public k(ConstraintWidget paramConstraintWidget) {
    super(paramConstraintWidget);
    this.h.e = DependencyNode.Type.e;
    this.i.e = DependencyNode.Type.f;
    this.f = 0;
  }
  
  private void q(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    paramInt1 = paramInt2 - paramInt1;
    paramInt2 = paramInt4 - paramInt3;
    if (paramInt5 != -1) {
      if (paramInt5 != 0) {
        if (paramInt5 == 1) {
          paramInt2 = (int)(paramInt1 * paramFloat + 0.5F);
          paramArrayOfint[0] = paramInt1;
          paramArrayOfint[1] = paramInt2;
        } 
      } else {
        paramArrayOfint[0] = (int)(paramInt2 * paramFloat + 0.5F);
        paramArrayOfint[1] = paramInt2;
      } 
    } else {
      paramInt4 = (int)(paramInt2 * paramFloat + 0.5F);
      paramInt3 = (int)(paramInt1 / paramFloat + 0.5F);
      if (paramInt4 <= paramInt1) {
        paramArrayOfint[0] = paramInt4;
        paramArrayOfint[1] = paramInt2;
      } else if (paramInt3 <= paramInt2) {
        paramArrayOfint[0] = paramInt1;
        paramArrayOfint[1] = paramInt3;
      } 
    } 
  }
  
  public void a(d paramd) {
    int i = a.a[this.j.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3) {
          ConstraintWidget constraintWidget = this.b;
          n(paramd, constraintWidget.K, constraintWidget.M, 0);
          return;
        } 
      } else {
        o(paramd);
      } 
    } else {
      p(paramd);
    } 
    if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.d) {
      DependencyNode dependencyNode;
      ConstraintWidget constraintWidget = this.b;
      i = constraintWidget.q;
      if (i != 2) {
        if (i == 3) {
          i = constraintWidget.r;
          if (i == 0 || i == 3) {
            int j;
            int n;
            int i1;
            m m = constraintWidget.g;
            paramd = m.h;
            DependencyNode dependencyNode1 = m.i;
            if (constraintWidget.K.f != null) {
              i = 1;
            } else {
              i = 0;
            } 
            if (constraintWidget.L.f != null) {
              j = 1;
            } else {
              j = 0;
            } 
            if (constraintWidget.M.f != null) {
              n = 1;
            } else {
              n = 0;
            } 
            if (constraintWidget.N.f != null) {
              i1 = 1;
            } else {
              i1 = 0;
            } 
            int i2 = constraintWidget.x();
            if (i != 0 && j && n && i1) {
              float f = this.b.w();
              if (((DependencyNode)paramd).j && dependencyNode1.j) {
                DependencyNode dependencyNode2 = this.h;
                if (dependencyNode2.c && this.i.c) {
                  i1 = ((DependencyNode)dependencyNode2.l.get(0)).g;
                  j = this.h.f;
                  int i7 = ((DependencyNode)this.i.l.get(0)).g;
                  i = this.i.f;
                  int i8 = ((DependencyNode)paramd).g;
                  n = ((DependencyNode)paramd).f;
                  int i9 = dependencyNode1.g;
                  int i10 = dependencyNode1.f;
                  q(k, i1 + j, i7 - i, i8 + n, i9 - i10, f, i2);
                  this.e.d(k[0]);
                  this.b.g.e.d(k[1]);
                } 
                return;
              } 
              dependencyNode = this.h;
              if (dependencyNode.j) {
                DependencyNode dependencyNode2 = this.i;
                if (dependencyNode2.j) {
                  if (!((DependencyNode)paramd).c || !dependencyNode1.c)
                    return; 
                  n = dependencyNode.g;
                  int i9 = dependencyNode.f;
                  int i7 = dependencyNode2.g;
                  int i8 = dependencyNode2.f;
                  i1 = ((DependencyNode)((DependencyNode)paramd).l.get(0)).g;
                  i = ((DependencyNode)paramd).f;
                  j = ((DependencyNode)dependencyNode1.l.get(0)).g;
                  int i10 = dependencyNode1.f;
                  q(k, n + i9, i7 - i8, i1 + i, j - i10, f, i2);
                  this.e.d(k[0]);
                  this.b.g.e.d(k[1]);
                } 
              } 
              dependencyNode = this.h;
              if (!dependencyNode.c || !this.i.c || !((DependencyNode)paramd).c || !dependencyNode1.c)
                return; 
              int i6 = ((DependencyNode)dependencyNode.l.get(0)).g;
              int i4 = this.h.f;
              j = ((DependencyNode)this.i.l.get(0)).g;
              i = this.i.f;
              n = ((DependencyNode)((DependencyNode)paramd).l.get(0)).g;
              int i3 = ((DependencyNode)paramd).f;
              i1 = ((DependencyNode)dependencyNode1.l.get(0)).g;
              int i5 = dependencyNode1.f;
              q(k, i6 + i4, j - i, n + i3, i1 - i5, f, i2);
              this.e.d(k[0]);
              this.b.g.e.d(k[1]);
            } else if (i != 0 && n != 0) {
              if (!this.h.c || !this.i.c)
                return; 
              float f = this.b.w();
              j = ((DependencyNode)this.h.l.get(0)).g + this.h.f;
              i = ((DependencyNode)this.i.l.get(0)).g - this.i.f;
              if (i2 != -1 && i2 != 0) {
                if (i2 == 1) {
                  i = g(i - j, 0);
                  n = (int)(i / f + 0.5F);
                  j = g(n, 1);
                  if (n != j)
                    i = (int)(j * f + 0.5F); 
                  this.e.d(i);
                  this.b.g.e.d(j);
                } 
              } else {
                i = g(i - j, 0);
                n = (int)(i * f + 0.5F);
                j = g(n, 1);
                if (n != j)
                  i = (int)(j / f + 0.5F); 
                this.e.d(i);
                this.b.g.e.d(j);
              } 
            } else if (j != 0 && i1 != 0) {
              if (!((DependencyNode)paramd).c || !dependencyNode1.c)
                return; 
              float f = this.b.w();
              j = ((DependencyNode)((DependencyNode)paramd).l.get(0)).g + ((DependencyNode)paramd).f;
              i = ((DependencyNode)dependencyNode1.l.get(0)).g - dependencyNode1.f;
              if (i2 != -1)
                if (i2 != 0) {
                  if (i2 != 1)
                    paramd = this.h; 
                } else {
                  i = g(i - j, 1);
                  n = (int)(i * f + 0.5F);
                  j = g(n, 0);
                  if (n != j)
                    i = (int)(j / f + 0.5F); 
                  this.e.d(j);
                  this.b.g.e.d(i);
                  paramd = this.h;
                }  
              i = g(i - j, 1);
              n = (int)(i / f + 0.5F);
              j = g(n, 0);
              if (n != j)
                i = (int)(j * f + 0.5F); 
              this.e.d(j);
              this.b.g.e.d(i);
            } 
          } else {
            i = dependencyNode.x();
            if (i != -1) {
              if (i != 0) {
                if (i != 1) {
                  i = 0;
                } else {
                  ConstraintWidget constraintWidget1 = this.b;
                  float f1 = constraintWidget1.g.e.g;
                  float f2 = constraintWidget1.w();
                  f2 = f1 * f2;
                } 
              } else {
                ConstraintWidget constraintWidget1 = this.b;
                float f = constraintWidget1.g.e.g / constraintWidget1.w();
                i = (int)(f + 0.5F);
              } 
            } else {
              ConstraintWidget constraintWidget1 = this.b;
              float f1 = constraintWidget1.g.e.g;
              float f2 = constraintWidget1.w();
              f2 = f1 * f2;
            } 
            this.e.d(i);
          } 
        } 
      } else {
        ConstraintWidget constraintWidget1 = dependencyNode.L();
        if (constraintWidget1 != null) {
          f f = constraintWidget1.f.e;
          if (f.j) {
            float f1 = this.b.v;
            i = (int)(f.g * f1 + 0.5F);
            this.e.d(i);
          } 
        } 
      } 
    } 
    paramd = this.h;
  }
  
  void d() {
    DependencyNode dependencyNode2;
    ConstraintWidget constraintWidget2 = this.b;
    if (constraintWidget2.b)
      this.e.d(constraintWidget2.U()); 
    if (!this.e.j) {
      ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.b.B();
      this.d = dimensionBehaviour;
      if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.d) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.e;
        if (dimensionBehaviour == dimensionBehaviour1) {
          ConstraintWidget constraintWidget = this.b.L();
          if ((constraintWidget != null && constraintWidget.B() == ConstraintWidget.DimensionBehaviour.b) || constraintWidget.B() == dimensionBehaviour1) {
            int i = constraintWidget.U();
            int j = this.b.K.f();
            int m = this.b.M.f();
            b(this.h, constraintWidget.f.h, this.b.K.f());
            b(this.i, constraintWidget.f.i, -this.b.M.f());
            this.e.d(i - j - m);
            return;
          } 
        } 
        if (this.d == ConstraintWidget.DimensionBehaviour.b)
          this.e.d(this.b.U()); 
      } 
    } else {
      ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.d;
      ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.e;
      if (dimensionBehaviour2 == dimensionBehaviour1) {
        ConstraintWidget constraintWidget = this.b.L();
        if ((constraintWidget != null && constraintWidget.B() == ConstraintWidget.DimensionBehaviour.b) || constraintWidget.B() == dimensionBehaviour1) {
          b(this.h, constraintWidget.f.h, this.b.K.f());
          b(this.i, constraintWidget.f.i, -this.b.M.f());
          return;
        } 
      } 
    } 
    DependencyNode dependencyNode1 = this.e;
    if (dependencyNode1.j) {
      ConstraintWidget constraintWidget = this.b;
      if (constraintWidget.b) {
        ConstraintAnchor[] arrayOfConstraintAnchor1 = constraintWidget.S;
        if ((arrayOfConstraintAnchor1[0]).f != null && (arrayOfConstraintAnchor1[1]).f != null) {
          if (constraintWidget.c0()) {
            this.h.f = this.b.S[0].f();
            this.i.f = -this.b.S[1].f();
          } else {
            dependencyNode1 = h(this.b.S[0]);
            if (dependencyNode1 != null)
              b(this.h, dependencyNode1, this.b.S[0].f()); 
            dependencyNode1 = h(this.b.S[1]);
            if (dependencyNode1 != null)
              b(this.i, dependencyNode1, -this.b.S[1].f()); 
            this.h.b = true;
            this.i.b = true;
          } 
        } else if (((ConstraintAnchor)dependencyNode1[0]).f != null) {
          dependencyNode1 = h((ConstraintAnchor)dependencyNode1[0]);
          if (dependencyNode1 != null) {
            b(this.h, dependencyNode1, this.b.S[0].f());
            b(this.i, this.h, this.e.g);
          } 
        } else if (((ConstraintAnchor)dependencyNode1[1]).f != null) {
          dependencyNode1 = h((ConstraintAnchor)dependencyNode1[1]);
          if (dependencyNode1 != null) {
            b(this.i, dependencyNode1, -this.b.S[1].f());
            b(this.h, this.i, -this.e.g);
          } 
        } else if (!(constraintWidget instanceof androidx.constraintlayout.solver.widgets.g) && constraintWidget.L() != null && (this.b.p(ConstraintAnchor.Type.h)).f == null) {
          dependencyNode1 = (this.b.L()).f.h;
          b(this.h, dependencyNode1, this.b.V());
          b(this.i, this.h, this.e.g);
        } 
        return;
      } 
    } 
    if (this.d == ConstraintWidget.DimensionBehaviour.d) {
      ConstraintWidget constraintWidget = this.b;
      int i = constraintWidget.q;
      if (i != 2) {
        if (i == 3) {
          m m;
          if (constraintWidget.r == 3) {
            this.h.a = this;
            this.i.a = this;
            m m1 = constraintWidget.g;
            m1.h.a = this;
            m1.i.a = this;
            dependencyNode1.a = this;
            if (constraintWidget.e0()) {
              this.e.l.add(this.b.g.e);
              this.b.g.e.k.add(this.e);
              m = this.b.g;
              m.e.a = this;
              this.e.l.add(m.h);
              this.e.l.add(this.b.g.i);
              this.b.g.h.k.add(this.e);
              this.b.g.i.k.add(this.e);
            } else if (this.b.c0()) {
              this.b.g.e.l.add(this.e);
              this.e.k.add(this.b.g.e);
            } else {
              this.b.g.e.l.add(this.e);
            } 
          } else {
            dependencyNode2 = constraintWidget.g.e;
            ((DependencyNode)m).l.add(dependencyNode2);
            dependencyNode2.k.add(this.e);
            this.b.g.h.k.add(this.e);
            this.b.g.i.k.add(this.e);
            f f = this.e;
            f.b = true;
            f.k.add(this.h);
            this.e.k.add(this.i);
            this.h.l.add(this.e);
            this.i.l.add(this.e);
          } 
        } 
      } else {
        ConstraintWidget constraintWidget3 = constraintWidget.L();
        if (constraintWidget3 != null) {
          f f = constraintWidget3.g.e;
          this.e.l.add(f);
          f.k.add(this.e);
          f = this.e;
          f.b = true;
          f.k.add(this.h);
          this.e.k.add(this.i);
        } 
      } 
    } 
    ConstraintWidget constraintWidget1 = this.b;
    ConstraintAnchor[] arrayOfConstraintAnchor = constraintWidget1.S;
    if ((arrayOfConstraintAnchor[0]).f != null && (arrayOfConstraintAnchor[1]).f != null) {
      if (constraintWidget1.c0()) {
        this.h.f = this.b.S[0].f();
        this.i.f = -this.b.S[1].f();
      } else {
        DependencyNode dependencyNode = h(this.b.S[0]);
        dependencyNode2 = h(this.b.S[1]);
        dependencyNode.b(this);
        dependencyNode2.b(this);
        this.j = WidgetRun.RunType.e;
      } 
    } else if (((ConstraintAnchor)dependencyNode2[0]).f != null) {
      DependencyNode dependencyNode = h((ConstraintAnchor)dependencyNode2[0]);
      if (dependencyNode != null) {
        b(this.h, dependencyNode, this.b.S[0].f());
        c(this.i, this.h, 1, this.e);
      } 
    } else {
      DependencyNode dependencyNode;
      if (((ConstraintAnchor)dependencyNode2[1]).f != null) {
        dependencyNode = h((ConstraintAnchor)dependencyNode2[1]);
        if (dependencyNode != null) {
          b(this.i, dependencyNode, -this.b.S[1].f());
          c(this.h, this.i, -1, this.e);
        } 
      } else if (!(dependencyNode instanceof androidx.constraintlayout.solver.widgets.g) && dependencyNode.L() != null) {
        dependencyNode = (this.b.L()).f.h;
        b(this.h, dependencyNode, this.b.V());
        c(this.i, this.h, 1, this.e);
      } 
    } 
  }
  
  public void e() {
    DependencyNode dependencyNode = this.h;
    if (dependencyNode.j)
      this.b.Z0(dependencyNode.g); 
  }
  
  void f() {
    this.c = null;
    this.h.c();
    this.i.c();
    this.e.c();
    this.g = false;
  }
  
  boolean m() {
    return (this.d == ConstraintWidget.DimensionBehaviour.d) ? ((this.b.q == 0)) : true;
  }
  
  void r() {
    this.g = false;
    this.h.c();
    this.h.j = false;
    this.i.c();
    this.i.j = false;
    this.e.j = false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("HorizontalRun ");
    stringBuilder.append(this.b.u());
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */