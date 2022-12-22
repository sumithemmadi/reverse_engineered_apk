package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.f;

class i extends WidgetRun {
  public i(ConstraintWidget paramConstraintWidget) {
    super(paramConstraintWidget);
    paramConstraintWidget.f.f();
    paramConstraintWidget.g.f();
    this.f = ((f)paramConstraintWidget).f1();
  }
  
  private void q(DependencyNode paramDependencyNode) {
    this.h.k.add(paramDependencyNode);
    paramDependencyNode.l.add(this.h);
  }
  
  public void a(d paramd) {
    paramd = this.h;
    if (!((DependencyNode)paramd).c)
      return; 
    if (((DependencyNode)paramd).j)
      return; 
    paramd = ((DependencyNode)paramd).l.get(0);
    f f = (f)this.b;
    int j = (int)(((DependencyNode)paramd).g * f.i1() + 0.5F);
    this.h.d(j);
  }
  
  void d() {
    f f = (f)this.b;
    int j = f.g1();
    int k = f.h1();
    f.i1();
    if (f.f1() == 1) {
      if (j != -1) {
        this.h.l.add(this.b.W.f.h);
        this.b.W.f.h.k.add(this.h);
        this.h.f = j;
      } else if (k != -1) {
        this.h.l.add(this.b.W.f.i);
        this.b.W.f.i.k.add(this.h);
        this.h.f = -k;
      } else {
        DependencyNode dependencyNode = this.h;
        dependencyNode.b = true;
        dependencyNode.l.add(this.b.W.f.i);
        this.b.W.f.i.k.add(this.h);
      } 
      q(this.b.f.h);
      q(this.b.f.i);
    } else {
      if (j != -1) {
        this.h.l.add(this.b.W.g.h);
        this.b.W.g.h.k.add(this.h);
        this.h.f = j;
      } else if (k != -1) {
        this.h.l.add(this.b.W.g.i);
        this.b.W.g.i.k.add(this.h);
        this.h.f = -k;
      } else {
        DependencyNode dependencyNode = this.h;
        dependencyNode.b = true;
        dependencyNode.l.add(this.b.W.g.i);
        this.b.W.g.i.k.add(this.h);
      } 
      q(this.b.g.h);
      q(this.b.g.i);
    } 
  }
  
  public void e() {
    if (((f)this.b).f1() == 1) {
      this.b.Z0(this.h.g);
    } else {
      this.b.a1(this.h.g);
    } 
  }
  
  void f() {
    this.h.c();
  }
  
  boolean m() {
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */