package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import java.util.ArrayList;

class l {
  public static int a;
  
  public int b = 0;
  
  public boolean c = false;
  
  WidgetRun d = null;
  
  WidgetRun e = null;
  
  ArrayList<WidgetRun> f = new ArrayList<WidgetRun>();
  
  int g = 0;
  
  int h;
  
  public l(WidgetRun paramWidgetRun, int paramInt) {
    int i = a;
    this.g = i;
    a = i + 1;
    this.d = paramWidgetRun;
    this.e = paramWidgetRun;
    this.h = paramInt;
  }
  
  private long c(DependencyNode paramDependencyNode, long paramLong) {
    WidgetRun widgetRun = paramDependencyNode.d;
    if (widgetRun instanceof j)
      return paramLong; 
    int i = paramDependencyNode.k.size();
    byte b = 0;
    long l1;
    for (l1 = paramLong; b < i; l1 = l3) {
      d d = paramDependencyNode.k.get(b);
      long l3 = l1;
      if (d instanceof DependencyNode) {
        d = d;
        if (((DependencyNode)d).d == widgetRun) {
          l3 = l1;
        } else {
          l3 = Math.min(l1, c((DependencyNode)d, ((DependencyNode)d).f + paramLong));
        } 
      } 
      b++;
    } 
    long l2 = l1;
    if (paramDependencyNode == widgetRun.i) {
      l2 = widgetRun.j();
      paramDependencyNode = widgetRun.h;
      paramLong -= l2;
      l2 = Math.min(Math.min(l1, c(paramDependencyNode, paramLong)), paramLong - widgetRun.h.f);
    } 
    return l2;
  }
  
  private long d(DependencyNode paramDependencyNode, long paramLong) {
    WidgetRun widgetRun = paramDependencyNode.d;
    if (widgetRun instanceof j)
      return paramLong; 
    int i = paramDependencyNode.k.size();
    byte b = 0;
    long l1;
    for (l1 = paramLong; b < i; l1 = l3) {
      d d = paramDependencyNode.k.get(b);
      long l3 = l1;
      if (d instanceof DependencyNode) {
        d = d;
        if (((DependencyNode)d).d == widgetRun) {
          l3 = l1;
        } else {
          l3 = Math.max(l1, d((DependencyNode)d, ((DependencyNode)d).f + paramLong));
        } 
      } 
      b++;
    } 
    long l2 = l1;
    if (paramDependencyNode == widgetRun.h) {
      l2 = widgetRun.j();
      paramDependencyNode = widgetRun.i;
      paramLong += l2;
      l2 = Math.max(Math.max(l1, d(paramDependencyNode, paramLong)), paramLong - widgetRun.i.f);
    } 
    return l2;
  }
  
  public void a(WidgetRun paramWidgetRun) {
    this.f.add(paramWidgetRun);
    this.e = paramWidgetRun;
  }
  
  public long b(d paramd, int paramInt) {
    k k;
    m m1;
    m m2;
    long l3;
    WidgetRun widgetRun = this.d;
    boolean bool1 = widgetRun instanceof c;
    long l1 = 0L;
    if (bool1) {
      if (widgetRun.f != paramInt)
        return 0L; 
    } else if (paramInt == 0) {
      if (!(widgetRun instanceof k))
        return 0L; 
    } else if (!(widgetRun instanceof m)) {
      return 0L;
    } 
    if (paramInt == 0) {
      k k1 = ((ConstraintWidget)paramd).f;
    } else {
      m2 = ((ConstraintWidget)paramd).g;
    } 
    DependencyNode dependencyNode2 = m2.h;
    if (paramInt == 0) {
      k = ((ConstraintWidget)paramd).f;
    } else {
      m1 = ((ConstraintWidget)k).g;
    } 
    DependencyNode dependencyNode1 = m1.i;
    boolean bool2 = widgetRun.h.l.contains(dependencyNode2);
    bool1 = this.d.i.l.contains(dependencyNode1);
    long l2 = this.d.j();
    if (bool2 && bool1) {
      l3 = d(this.d.h, 0L);
      long l4 = c(this.d.i, 0L);
      long l5 = l3 - l2;
      WidgetRun widgetRun1 = this.d;
      int i = widgetRun1.i.f;
      l3 = l5;
      if (l5 >= -i)
        l3 = l5 + i; 
      l5 = -l4;
      i = widgetRun1.h.f;
      l4 = l5 - l2 - i;
      l5 = l4;
      if (l4 >= i)
        l5 = l4 - i; 
      float f1 = widgetRun1.b.r(paramInt);
      if (f1 > 0.0F)
        l1 = (long)((float)l5 / f1 + (float)l3 / (1.0F - f1)); 
      float f2 = (float)l1;
      l5 = (long)(f2 * f1 + 0.5F);
      l3 = (long)(f2 * (1.0F - f1) + 0.5F);
      widgetRun1 = this.d;
      l3 = widgetRun1.h.f + l5 + l2 + l3;
      paramInt = widgetRun1.i.f;
    } else {
      if (bool2) {
        dependencyNode1 = this.d.h;
        l3 = Math.max(d(dependencyNode1, dependencyNode1.f), this.d.h.f + l2);
      } else if (bool1) {
        dependencyNode1 = this.d.i;
        l3 = c(dependencyNode1, dependencyNode1.f);
        long l4 = -this.d.i.f;
        l3 = Math.max(-l3, l4 + l2);
      } else {
        WidgetRun widgetRun1 = this.d;
        l3 = widgetRun1.h.f + widgetRun1.j();
        paramInt = this.d.i.f;
        l3 -= paramInt;
      } 
      return l3;
    } 
    l3 -= paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */