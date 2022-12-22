package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class vp implements Iterable<tp> {
  private final List<tp> b = new ArrayList<tp>();
  
  public static boolean f(eo parameo) {
    tp tp = i(parameo);
    if (tp != null) {
      tp.e.g();
      return true;
    } 
    return false;
  }
  
  static tp i(eo parameo) {
    for (tp tp : q.y()) {
      if (tp.d == parameo)
        return tp; 
    } 
    return null;
  }
  
  public final void a(tp paramtp) {
    this.b.add(paramtp);
  }
  
  public final void c(tp paramtp) {
    this.b.remove(paramtp);
  }
  
  public final Iterator<tp> iterator() {
    return this.b.iterator();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */