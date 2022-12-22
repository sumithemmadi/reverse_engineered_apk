package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.h;
import java.util.Iterator;

class j extends WidgetRun {
  public j(ConstraintWidget paramConstraintWidget) {
    super(paramConstraintWidget);
  }
  
  private void q(DependencyNode paramDependencyNode) {
    this.h.k.add(paramDependencyNode);
    paramDependencyNode.l.add(this.h);
  }
  
  public void a(d paramd) {
    Object object1;
    Object object2;
    a a = (a)this.b;
    int i = a.i1();
    Iterator<DependencyNode> iterator = this.h.l.iterator();
    byte b = 0;
    byte b1 = -1;
    while (true) {
      while (true)
        break; 
      if (b < SYNTHETIC_LOCAL_VARIABLE_6) {
        object1 = SYNTHETIC_LOCAL_VARIABLE_6;
        object2 = SYNTHETIC_LOCAL_VARIABLE_7;
      } 
    } 
    if (i == 0 || i == 2) {
      this.h.d(object2 + a.j1());
      return;
    } 
    this.h.d(object1 + a.j1());
  }
  
  void d() {
    ConstraintWidget constraintWidget = this.b;
    if (constraintWidget instanceof a) {
      this.h.b = true;
      a a = (a)constraintWidget;
      int i = a.i1();
      boolean bool = a.h1();
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      byte b = 0;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i == 3) {
              this.h.e = DependencyNode.Type.h;
              while (b < ((h)a).O0) {
                ConstraintWidget constraintWidget1 = ((h)a).N0[b];
                if (bool || constraintWidget1.T() != 8) {
                  DependencyNode dependencyNode = constraintWidget1.g.i;
                  dependencyNode.k.add(this.h);
                  this.h.l.add(dependencyNode);
                } 
                b++;
              } 
              q(this.b.g.h);
              q(this.b.g.i);
            } 
          } else {
            this.h.e = DependencyNode.Type.g;
            for (b = bool1; b < ((h)a).O0; b++) {
              ConstraintWidget constraintWidget1 = ((h)a).N0[b];
              if (bool || constraintWidget1.T() != 8) {
                DependencyNode dependencyNode = constraintWidget1.g.h;
                dependencyNode.k.add(this.h);
                this.h.l.add(dependencyNode);
              } 
            } 
            q(this.b.g.h);
            q(this.b.g.i);
          } 
        } else {
          this.h.e = DependencyNode.Type.f;
          for (b = bool2; b < ((h)a).O0; b++) {
            ConstraintWidget constraintWidget1 = ((h)a).N0[b];
            if (bool || constraintWidget1.T() != 8) {
              DependencyNode dependencyNode = constraintWidget1.f.i;
              dependencyNode.k.add(this.h);
              this.h.l.add(dependencyNode);
            } 
          } 
          q(this.b.f.h);
          q(this.b.f.i);
        } 
      } else {
        this.h.e = DependencyNode.Type.e;
        for (b = bool3; b < ((h)a).O0; b++) {
          ConstraintWidget constraintWidget1 = ((h)a).N0[b];
          if (bool || constraintWidget1.T() != 8) {
            DependencyNode dependencyNode = constraintWidget1.f.h;
            dependencyNode.k.add(this.h);
            this.h.l.add(dependencyNode);
          } 
        } 
        q(this.b.f.h);
        q(this.b.f.i);
      } 
    } 
  }
  
  public void e() {
    ConstraintWidget constraintWidget = this.b;
    if (constraintWidget instanceof a) {
      int i = ((a)constraintWidget).i1();
      if (i == 0 || i == 1) {
        this.b.Z0(this.h.g);
        return;
      } 
      this.b.a1(this.h.g);
    } 
  }
  
  void f() {
    this.c = null;
    this.h.c();
  }
  
  boolean m() {
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */