package androidx.coordinatorlayout.widget;

import b.e.g;
import b.h.j.f;
import b.h.j.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class a<T> {
  private final f<ArrayList<T>> a = (f<ArrayList<T>>)new g(10);
  
  private final g<T, ArrayList<T>> b = new g();
  
  private final ArrayList<T> c = new ArrayList<T>();
  
  private final HashSet<T> d = new HashSet<T>();
  
  private void e(T paramT, ArrayList<T> paramArrayList, HashSet<T> paramHashSet) {
    if (paramArrayList.contains(paramT))
      return; 
    if (!paramHashSet.contains(paramT)) {
      paramHashSet.add(paramT);
      ArrayList<T> arrayList = (ArrayList)this.b.get(paramT);
      if (arrayList != null) {
        byte b = 0;
        int i = arrayList.size();
        while (b < i) {
          e(arrayList.get(b), paramArrayList, paramHashSet);
          b++;
        } 
      } 
      paramHashSet.remove(paramT);
      paramArrayList.add(paramT);
      return;
    } 
    RuntimeException runtimeException = new RuntimeException("This graph contains cyclic dependencies");
    throw runtimeException;
  }
  
  private ArrayList<T> f() {
    ArrayList<T> arrayList1 = (ArrayList)this.a.b();
    ArrayList<T> arrayList2 = arrayList1;
    if (arrayList1 == null)
      arrayList2 = new ArrayList(); 
    return arrayList2;
  }
  
  private void k(ArrayList<T> paramArrayList) {
    paramArrayList.clear();
    this.a.c(paramArrayList);
  }
  
  public void a(T paramT1, T paramT2) {
    if (this.b.containsKey(paramT1) && this.b.containsKey(paramT2)) {
      ArrayList<T> arrayList1 = (ArrayList)this.b.get(paramT1);
      ArrayList<T> arrayList2 = arrayList1;
      if (arrayList1 == null) {
        arrayList2 = f();
        this.b.put(paramT1, arrayList2);
      } 
      arrayList2.add(paramT2);
      return;
    } 
    throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
  }
  
  public void b(T paramT) {
    if (!this.b.containsKey(paramT))
      this.b.put(paramT, null); 
  }
  
  public void c() {
    int i = this.b.size();
    for (byte b = 0; b < i; b++) {
      ArrayList<T> arrayList = (ArrayList)this.b.m(b);
      if (arrayList != null)
        k(arrayList); 
    } 
    this.b.clear();
  }
  
  public boolean d(T paramT) {
    return this.b.containsKey(paramT);
  }
  
  public List g(T paramT) {
    return (List)this.b.get(paramT);
  }
  
  public List<T> h(T paramT) {
    int i = this.b.size();
    ArrayList<Object> arrayList = null;
    byte b = 0;
    while (b < i) {
      ArrayList arrayList1 = (ArrayList)this.b.m(b);
      ArrayList<Object> arrayList2 = arrayList;
      if (arrayList1 != null) {
        arrayList2 = arrayList;
        if (arrayList1.contains(paramT)) {
          arrayList2 = arrayList;
          if (arrayList == null)
            arrayList2 = new ArrayList(); 
          arrayList2.add(this.b.i(b));
        } 
      } 
      b++;
      arrayList = arrayList2;
    } 
    return arrayList;
  }
  
  public ArrayList<T> i() {
    this.c.clear();
    this.d.clear();
    int i = this.b.size();
    for (byte b = 0; b < i; b++)
      e((T)this.b.i(b), this.c, this.d); 
    return this.c;
  }
  
  public boolean j(T paramT) {
    int i = this.b.size();
    for (byte b = 0; b < i; b++) {
      ArrayList arrayList = (ArrayList)this.b.m(b);
      if (arrayList != null && arrayList.contains(paramT))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/coordinatorlayout/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */