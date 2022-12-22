package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DependencyNode implements d {
  public d a = null;
  
  public boolean b = false;
  
  public boolean c = false;
  
  WidgetRun d;
  
  Type e = Type.b;
  
  int f;
  
  public int g;
  
  int h = 1;
  
  f i = null;
  
  public boolean j = false;
  
  List<d> k = new ArrayList<d>();
  
  List<DependencyNode> l = new ArrayList<DependencyNode>();
  
  public DependencyNode(WidgetRun paramWidgetRun) {
    this.d = paramWidgetRun;
  }
  
  public void a(d paramd) {
    Iterator<DependencyNode> iterator = this.l.iterator();
    while (iterator.hasNext()) {
      if (!((DependencyNode)iterator.next()).j)
        return; 
    } 
    this.c = true;
    d d1 = this.a;
    if (d1 != null)
      d1.a(this); 
    if (this.b) {
      this.d.a(this);
      return;
    } 
    d1 = null;
    byte b = 0;
    for (DependencyNode dependencyNode : this.l) {
      if (dependencyNode instanceof f)
        continue; 
      b++;
      d1 = dependencyNode;
    } 
    if (d1 != null && b == 1 && ((DependencyNode)d1).j) {
      f f1 = this.i;
      if (f1 != null)
        if (f1.j) {
          this.f = this.h * f1.g;
        } else {
          return;
        }  
      d(((DependencyNode)d1).g + this.f);
    } 
    d1 = this.a;
    if (d1 != null)
      d1.a(this); 
  }
  
  public void b(d paramd) {
    this.k.add(paramd);
    if (this.j)
      paramd.a(paramd); 
  }
  
  public void c() {
    this.l.clear();
    this.k.clear();
    this.j = false;
    this.g = 0;
    this.c = false;
    this.b = false;
  }
  
  public void d(int paramInt) {
    if (this.j)
      return; 
    this.j = true;
    this.g = paramInt;
    for (d d1 : this.k)
      d1.a(d1); 
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d.b.u());
    stringBuilder.append(":");
    stringBuilder.append(this.e);
    stringBuilder.append("(");
    if (this.j) {
      Integer integer = Integer.valueOf(this.g);
    } else {
      str = "unresolved";
    } 
    stringBuilder.append(str);
    stringBuilder.append(") <t=");
    stringBuilder.append(this.l.size());
    stringBuilder.append(":d=");
    stringBuilder.append(this.k.size());
    stringBuilder.append(">");
    return stringBuilder.toString();
  }
  
  enum Type {
    b, c, d, e, f, g, h, i;
    
    static {
      Type type1 = new Type("UNKNOWN", 0);
      b = type1;
      Type type2 = new Type("HORIZONTAL_DIMENSION", 1);
      c = type2;
      Type type3 = new Type("VERTICAL_DIMENSION", 2);
      d = type3;
      Type type4 = new Type("LEFT", 3);
      e = type4;
      Type type5 = new Type("RIGHT", 4);
      f = type5;
      Type type6 = new Type("TOP", 5);
      g = type6;
      Type type7 = new Type("BOTTOM", 6);
      h = type7;
      Type type8 = new Type("BASELINE", 7);
      i = type8;
      j = new Type[] { type1, type2, type3, type4, type5, type6, type7, type8 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/DependencyNode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */