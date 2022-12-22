package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class t {
  private final HashMap<String, r> a = new HashMap<String, r>();
  
  public final void a() {
    Iterator<r> iterator = this.a.values().iterator();
    while (iterator.hasNext())
      ((r)iterator.next()).a(); 
    this.a.clear();
  }
  
  final r b(String paramString) {
    return this.a.get(paramString);
  }
  
  Set<String> c() {
    return new HashSet<String>(this.a.keySet());
  }
  
  final void d(String paramString, r paramr) {
    r r1 = this.a.put(paramString, paramr);
    if (r1 != null)
      r1.d(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */