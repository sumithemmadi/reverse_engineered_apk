package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.c;
import java.util.ArrayList;

public class k extends ConstraintWidget {
  public ArrayList<ConstraintWidget> N0 = new ArrayList<ConstraintWidget>();
  
  public void a(ConstraintWidget paramConstraintWidget) {
    this.N0.add(paramConstraintWidget);
    if (paramConstraintWidget.L() != null)
      ((k)paramConstraintWidget.L()).g1(paramConstraintWidget); 
    paramConstraintWidget.Q0(this);
  }
  
  public ArrayList<ConstraintWidget> e1() {
    return this.N0;
  }
  
  public void f1() {
    ArrayList<ConstraintWidget> arrayList = this.N0;
    if (arrayList == null)
      return; 
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      ConstraintWidget constraintWidget = this.N0.get(b);
      if (constraintWidget instanceof k)
        ((k)constraintWidget).f1(); 
    } 
  }
  
  public void g1(ConstraintWidget paramConstraintWidget) {
    this.N0.remove(paramConstraintWidget);
    paramConstraintWidget.k0();
  }
  
  public void h1() {
    this.N0.clear();
  }
  
  public void k0() {
    this.N0.clear();
    super.k0();
  }
  
  public void n0(c paramc) {
    super.n0(paramc);
    int i = this.N0.size();
    for (byte b = 0; b < i; b++)
      ((ConstraintWidget)this.N0.get(b)).n0(paramc); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */