package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public class m extends WidgetRun {
  public DependencyNode k;
  
  f l;
  
  public m(ConstraintWidget paramConstraintWidget) {
    super(paramConstraintWidget);
    DependencyNode dependencyNode = new DependencyNode(this);
    this.k = dependencyNode;
    this.l = null;
    this.h.e = DependencyNode.Type.g;
    this.i.e = DependencyNode.Type.h;
    dependencyNode.e = DependencyNode.Type.i;
    this.f = 1;
  }
  
  public void a(d paramd) {
    int i = a.a[this.j.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3) {
          ConstraintWidget constraintWidget = this.b;
          n(paramd, constraintWidget.L, constraintWidget.N, 1);
          return;
        } 
      } else {
        o(paramd);
      } 
    } else {
      p(paramd);
    } 
    paramd = this.e;
    if (((DependencyNode)paramd).c && !((DependencyNode)paramd).j && this.d == ConstraintWidget.DimensionBehaviour.d) {
      ConstraintWidget constraintWidget = this.b;
      i = constraintWidget.r;
      if (i != 2) {
        if (i == 3 && constraintWidget.f.e.j) {
          i = constraintWidget.x();
          if (i != -1) {
            if (i != 0) {
              if (i != 1) {
                i = 0;
              } else {
                constraintWidget = this.b;
                float f1 = constraintWidget.f.e.g;
                float f2 = constraintWidget.w();
                f2 = f1 / f2;
              } 
            } else {
              constraintWidget = this.b;
              float f1 = constraintWidget.f.e.g * constraintWidget.w();
              i = (int)(f1 + 0.5F);
            } 
          } else {
            constraintWidget = this.b;
            float f1 = constraintWidget.f.e.g;
            float f2 = constraintWidget.w();
            f2 = f1 / f2;
          } 
          this.e.d(i);
        } 
      } else {
        constraintWidget = constraintWidget.L();
        if (constraintWidget != null) {
          f f1 = constraintWidget.g.e;
          if (f1.j) {
            float f2 = this.b.y;
            i = (int)(f1.g * f2 + 0.5F);
            this.e.d(i);
          } 
        } 
      } 
    } 
    DependencyNode dependencyNode = this.h;
    if (dependencyNode.c) {
      paramd = this.i;
      if (((DependencyNode)paramd).c) {
        if (dependencyNode.j && ((DependencyNode)paramd).j && this.e.j)
          return; 
        if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.d) {
          ConstraintWidget constraintWidget = this.b;
          if (constraintWidget.q == 0 && !constraintWidget.e0()) {
            dependencyNode = this.h.l.get(0);
            DependencyNode dependencyNode1 = this.i.l.get(0);
            i = dependencyNode.g;
            dependencyNode = this.h;
            i += dependencyNode.f;
            int j = dependencyNode1.g + this.i.f;
            dependencyNode.d(i);
            this.i.d(j);
            this.e.d(j - i);
            return;
          } 
        } 
        if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.d && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
          paramd = this.h.l.get(0);
          dependencyNode = this.i.l.get(0);
          i = ((DependencyNode)paramd).g;
          int j = this.h.f;
          i = dependencyNode.g + this.i.f - i + j;
          paramd = this.e;
          j = ((f)paramd).m;
          if (i < j) {
            paramd.d(i);
          } else {
            paramd.d(j);
          } 
        } 
        if (!this.e.j)
          return; 
        if (this.h.l.size() > 0 && this.i.l.size() > 0) {
          paramd = this.h.l.get(0);
          dependencyNode = this.i.l.get(0);
          i = ((DependencyNode)paramd).g + this.h.f;
          int j = dependencyNode.g + this.i.f;
          float f1 = this.b.P();
          if (paramd == dependencyNode) {
            i = ((DependencyNode)paramd).g;
            j = dependencyNode.g;
            f1 = 0.5F;
          } 
          int k = this.e.g;
          this.h.d((int)(i + 0.5F + (j - i - k) * f1));
          this.i.d(this.h.g + this.e.g);
        } 
      } 
    } 
  }
  
  void d() {
    DependencyNode dependencyNode;
    ConstraintWidget constraintWidget = this.b;
    if (constraintWidget.b)
      this.e.d(constraintWidget.y()); 
    if (!this.e.j) {
      this.d = this.b.R();
      if (this.b.X())
        this.l = new a(this); 
      ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
      if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.d) {
        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.e) {
          ConstraintWidget constraintWidget1 = this.b.L();
          if (constraintWidget1 != null && constraintWidget1.R() == ConstraintWidget.DimensionBehaviour.b) {
            int i = constraintWidget1.y();
            int j = this.b.L.f();
            int k = this.b.N.f();
            b(this.h, constraintWidget1.g.h, this.b.L.f());
            b(this.i, constraintWidget1.g.i, -this.b.N.f());
            this.e.d(i - j - k);
            return;
          } 
        } 
        if (this.d == ConstraintWidget.DimensionBehaviour.b)
          this.e.d(this.b.y()); 
      } 
    } else if (this.d == ConstraintWidget.DimensionBehaviour.e) {
      constraintWidget = this.b.L();
      if (constraintWidget != null && constraintWidget.R() == ConstraintWidget.DimensionBehaviour.b) {
        b(this.h, constraintWidget.g.h, this.b.L.f());
        b(this.i, constraintWidget.g.i, -this.b.N.f());
        return;
      } 
    } 
    f f1 = this.e;
    boolean bool = f1.j;
    if (bool) {
      constraintWidget = this.b;
      if (constraintWidget.b) {
        arrayOfConstraintAnchor = constraintWidget.S;
        if ((arrayOfConstraintAnchor[2]).f != null && (arrayOfConstraintAnchor[3]).f != null) {
          if (constraintWidget.e0()) {
            this.h.f = this.b.S[2].f();
            this.i.f = -this.b.S[3].f();
          } else {
            DependencyNode dependencyNode1 = h(this.b.S[2]);
            if (dependencyNode1 != null)
              b(this.h, dependencyNode1, this.b.S[2].f()); 
            dependencyNode1 = h(this.b.S[3]);
            if (dependencyNode1 != null)
              b(this.i, dependencyNode1, -this.b.S[3].f()); 
            this.h.b = true;
            this.i.b = true;
          } 
          if (this.b.X())
            b(this.k, this.h, this.b.q()); 
        } else if ((arrayOfConstraintAnchor[2]).f != null) {
          DependencyNode dependencyNode1 = h(arrayOfConstraintAnchor[2]);
          if (dependencyNode1 != null) {
            b(this.h, dependencyNode1, this.b.S[2].f());
            b(this.i, this.h, this.e.g);
            if (this.b.X())
              b(this.k, this.h, this.b.q()); 
          } 
        } else if ((arrayOfConstraintAnchor[3]).f != null) {
          DependencyNode dependencyNode1 = h(arrayOfConstraintAnchor[3]);
          if (dependencyNode1 != null) {
            b(this.i, dependencyNode1, -this.b.S[3].f());
            b(this.h, this.i, -this.e.g);
          } 
          if (this.b.X())
            b(this.k, this.h, this.b.q()); 
        } else {
          DependencyNode dependencyNode1;
          if ((arrayOfConstraintAnchor[4]).f != null) {
            dependencyNode1 = h(arrayOfConstraintAnchor[4]);
            if (dependencyNode1 != null) {
              b(this.k, dependencyNode1, 0);
              b(this.h, this.k, -this.b.q());
              b(this.i, this.h, this.e.g);
            } 
          } else if (!(dependencyNode1 instanceof androidx.constraintlayout.solver.widgets.g) && dependencyNode1.L() != null && (this.b.p(ConstraintAnchor.Type.h)).f == null) {
            dependencyNode1 = (this.b.L()).g.h;
            b(this.h, dependencyNode1, this.b.W());
            b(this.i, this.h, this.e.g);
            if (this.b.X())
              b(this.k, this.h, this.b.q()); 
          } 
        } 
        return;
      } 
    } 
    if (!bool && this.d == ConstraintWidget.DimensionBehaviour.d) {
      f f2;
      constraintWidget = this.b;
      int i = constraintWidget.r;
      if (i != 2) {
        if (i == 3 && !constraintWidget.e0()) {
          constraintWidget = this.b;
          if (constraintWidget.q != 3) {
            f2 = constraintWidget.f.e;
            this.e.l.add(f2);
            f2.k.add(this.e);
            f2 = this.e;
            f2.b = true;
            f2.k.add(this.h);
            this.e.k.add(this.i);
          } 
        } 
      } else {
        ConstraintWidget constraintWidget1 = f2.L();
        if (constraintWidget1 != null) {
          f f3 = constraintWidget1.g.e;
          this.e.l.add(f3);
          f3.k.add(this.e);
          f3 = this.e;
          f3.b = true;
          f3.k.add(this.h);
          this.e.k.add(this.i);
        } 
      } 
    } else {
      arrayOfConstraintAnchor.b(this);
    } 
    constraintWidget = this.b;
    ConstraintAnchor[] arrayOfConstraintAnchor = constraintWidget.S;
    if ((arrayOfConstraintAnchor[2]).f != null && (arrayOfConstraintAnchor[3]).f != null) {
      if (constraintWidget.e0()) {
        this.h.f = this.b.S[2].f();
        this.i.f = -this.b.S[3].f();
      } else {
        dependencyNode = h(this.b.S[2]);
        DependencyNode dependencyNode1 = h(this.b.S[3]);
        dependencyNode.b(this);
        dependencyNode1.b(this);
        this.j = WidgetRun.RunType.e;
      } 
      if (this.b.X())
        c(this.k, this.h, 1, this.l); 
    } else {
      k k;
      if (((ConstraintAnchor)dependencyNode[2]).f != null) {
        DependencyNode dependencyNode1 = h((ConstraintAnchor)dependencyNode[2]);
        if (dependencyNode1 != null) {
          b(this.h, dependencyNode1, this.b.S[2].f());
          c(this.i, this.h, 1, this.e);
          if (this.b.X())
            c(this.k, this.h, 1, this.l); 
          ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.d;
          ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.d;
          if (dimensionBehaviour2 == dimensionBehaviour1 && this.b.w() > 0.0F) {
            k = this.b.f;
            if (k.d == dimensionBehaviour1) {
              k.e.k.add(this.e);
              this.e.l.add(this.b.f.e);
              this.e.a = this;
            } 
          } 
        } 
      } else if (((ConstraintAnchor)k[3]).f != null) {
        DependencyNode dependencyNode1 = h((ConstraintAnchor)k[3]);
        if (dependencyNode1 != null) {
          b(this.i, dependencyNode1, -this.b.S[3].f());
          c(this.h, this.i, -1, this.e);
          if (this.b.X())
            c(this.k, this.h, 1, this.l); 
        } 
      } else {
        DependencyNode dependencyNode1;
        if (((ConstraintAnchor)k[4]).f != null) {
          dependencyNode1 = h((ConstraintAnchor)k[4]);
          if (dependencyNode1 != null) {
            b(this.k, dependencyNode1, 0);
            c(this.h, this.k, -1, this.l);
            c(this.i, this.h, 1, this.e);
          } 
        } else if (!(dependencyNode1 instanceof androidx.constraintlayout.solver.widgets.g) && dependencyNode1.L() != null) {
          dependencyNode1 = (this.b.L()).g.h;
          b(this.h, dependencyNode1, this.b.W());
          c(this.i, this.h, 1, this.e);
          if (this.b.X())
            c(this.k, this.h, 1, this.l); 
          ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.d;
          ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.d;
          if (dimensionBehaviour2 == dimensionBehaviour1 && this.b.w() > 0.0F) {
            k k1 = this.b.f;
            if (k1.d == dimensionBehaviour1) {
              k1.e.k.add(this.e);
              this.e.l.add(this.b.f.e);
              this.e.a = this;
            } 
          } 
        } 
      } 
    } 
    if (this.e.l.size() == 0)
      this.e.c = true; 
  }
  
  public void e() {
    DependencyNode dependencyNode = this.h;
    if (dependencyNode.j)
      this.b.a1(dependencyNode.g); 
  }
  
  void f() {
    this.c = null;
    this.h.c();
    this.i.c();
    this.k.c();
    this.e.c();
    this.g = false;
  }
  
  boolean m() {
    return (this.d == ConstraintWidget.DimensionBehaviour.d) ? ((this.b.r == 0)) : true;
  }
  
  void q() {
    this.g = false;
    this.h.c();
    this.h.j = false;
    this.i.c();
    this.i.j = false;
    this.k.c();
    this.k.j = false;
    this.e.j = false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("VerticalRun ");
    stringBuilder.append(this.b.u());
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */