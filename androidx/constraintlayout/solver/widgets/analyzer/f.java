package androidx.constraintlayout.solver.widgets.analyzer;

class f extends DependencyNode {
  public int m;
  
  public f(WidgetRun paramWidgetRun) {
    super(paramWidgetRun);
    if (paramWidgetRun instanceof k) {
      this.e = DependencyNode.Type.c;
    } else {
      this.e = DependencyNode.Type.d;
    } 
  }
  
  public void d(int paramInt) {
    if (this.j)
      return; 
    this.j = true;
    this.g = paramInt;
    for (d d : this.k)
      d.a(d); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */