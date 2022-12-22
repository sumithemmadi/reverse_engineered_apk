package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.b;
import androidx.constraintlayout.solver.widgets.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class n {
  static int a;
  
  ArrayList<ConstraintWidget> b = new ArrayList<ConstraintWidget>();
  
  int c = -1;
  
  boolean d = false;
  
  int e = 0;
  
  ArrayList<a> f = null;
  
  private int g = -1;
  
  public n(int paramInt) {
    int i = a;
    a = i + 1;
    this.c = i;
    this.e = paramInt;
  }
  
  private String e() {
    int i = this.e;
    return (i == 0) ? "Horizontal" : ((i == 1) ? "Vertical" : ((i == 2) ? "Both" : "Unknown"));
  }
  
  private int j(d paramd, ArrayList<ConstraintWidget> paramArrayList, int paramInt) {
    byte b = 0;
    d d1 = (d)((ConstraintWidget)paramArrayList.get(0)).L();
    paramd.D();
    d1.g(paramd, false);
    int i;
    for (i = 0; i < paramArrayList.size(); i++)
      ((ConstraintWidget)paramArrayList.get(i)).g(paramd, false); 
    if (paramInt == 0 && d1.Y0 > 0)
      b.b(d1, paramd, paramArrayList, 0); 
    if (paramInt == 1 && d1.Z0 > 0)
      b.b(d1, paramd, paramArrayList, 1); 
    try {
      paramd.z();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    this.f = new ArrayList<a>();
    for (i = b; i < paramArrayList.size(); i++) {
      a a = new a(this, paramArrayList.get(i), paramd, paramInt);
      this.f.add(a);
    } 
    if (paramInt == 0) {
      paramInt = paramd.x(((ConstraintWidget)d1).K);
      i = paramd.x(((ConstraintWidget)d1).M);
      paramd.D();
      return i - paramInt;
    } 
    paramInt = paramd.x(((ConstraintWidget)d1).L);
    i = paramd.x(((ConstraintWidget)d1).N);
    paramd.D();
    return i - paramInt;
  }
  
  public boolean a(ConstraintWidget paramConstraintWidget) {
    if (this.b.contains(paramConstraintWidget))
      return false; 
    this.b.add(paramConstraintWidget);
    return true;
  }
  
  public void b(ArrayList<n> paramArrayList) {
    int i = this.b.size();
    if (this.g != -1 && i > 0)
      for (byte b = 0; b < paramArrayList.size(); b++) {
        n n1 = paramArrayList.get(b);
        if (this.g == n1.c)
          g(this.e, n1); 
      }  
    if (i == 0)
      paramArrayList.remove(this); 
  }
  
  public int c() {
    return this.c;
  }
  
  public int d() {
    return this.e;
  }
  
  public int f(d paramd, int paramInt) {
    return (this.b.size() == 0) ? 0 : j(paramd, this.b, paramInt);
  }
  
  public void g(int paramInt, n paramn) {
    for (ConstraintWidget constraintWidget : this.b) {
      paramn.a(constraintWidget);
      if (paramInt == 0) {
        constraintWidget.L0 = paramn.c();
        continue;
      } 
      constraintWidget.M0 = paramn.c();
    } 
    this.g = paramn.c;
  }
  
  public void h(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  public void i(int paramInt) {
    this.e = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(e());
    stringBuilder1.append(" [");
    stringBuilder1.append(this.c);
    stringBuilder1.append("] <");
    String str = stringBuilder1.toString();
    for (ConstraintWidget constraintWidget : this.b) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(" ");
      stringBuilder.append(constraintWidget.u());
      str = stringBuilder.toString();
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str);
    stringBuilder2.append(" >");
    return stringBuilder2.toString();
  }
  
  class a {
    WeakReference<ConstraintWidget> a;
    
    int b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    int g;
    
    public a(n this$0, ConstraintWidget param1ConstraintWidget, d param1d, int param1Int) {
      this.a = new WeakReference<ConstraintWidget>(param1ConstraintWidget);
      this.b = param1d.x(param1ConstraintWidget.K);
      this.c = param1d.x(param1ConstraintWidget.L);
      this.d = param1d.x(param1ConstraintWidget.M);
      this.e = param1d.x(param1ConstraintWidget.N);
      this.f = param1d.x(param1ConstraintWidget.O);
      this.g = param1Int;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */