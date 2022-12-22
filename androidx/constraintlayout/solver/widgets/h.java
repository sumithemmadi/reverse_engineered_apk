package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.h;
import androidx.constraintlayout.solver.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class h extends ConstraintWidget implements g {
  public ConstraintWidget[] N0 = new ConstraintWidget[4];
  
  public int O0 = 0;
  
  public void a(ConstraintWidget paramConstraintWidget) {
    if (paramConstraintWidget != this && paramConstraintWidget != null) {
      int i = this.O0;
      ConstraintWidget[] arrayOfConstraintWidget = this.N0;
      if (i + 1 > arrayOfConstraintWidget.length)
        this.N0 = Arrays.<ConstraintWidget>copyOf(arrayOfConstraintWidget, arrayOfConstraintWidget.length * 2); 
      arrayOfConstraintWidget = this.N0;
      i = this.O0;
      arrayOfConstraintWidget[i] = paramConstraintWidget;
      this.O0 = i + 1;
    } 
  }
  
  public void b() {
    this.O0 = 0;
    Arrays.fill((Object[])this.N0, (Object)null);
  }
  
  public void c(d paramd) {}
  
  public void e1(ArrayList<n> paramArrayList, int paramInt, n paramn) {
    byte b3;
    byte b1 = 0;
    byte b2 = 0;
    while (true) {
      b3 = b1;
      if (b2 < this.O0) {
        paramn.a(this.N0[b2]);
        b2++;
        continue;
      } 
      break;
    } 
    while (b3 < this.O0) {
      h.a(this.N0[b3], paramInt, paramArrayList, paramn);
      b3++;
    } 
  }
  
  public int f1(int paramInt) {
    for (byte b = 0; b < this.O0; b++) {
      ConstraintWidget constraintWidget = this.N0[b];
      if (paramInt == 0) {
        int i = constraintWidget.L0;
        if (i != -1)
          return i; 
      } 
      if (paramInt == 1) {
        int i = constraintWidget.M0;
        if (i != -1)
          return i; 
      } 
    } 
    return -1;
  }
  
  public void m(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap) {
    super.m(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = paramConstraintWidget;
    byte b = 0;
    this.O0 = 0;
    int i = ((h)paramConstraintWidget).O0;
    while (b < i) {
      a(paramHashMap.get(((h)paramConstraintWidget).N0[b]));
      b++;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */