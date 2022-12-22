package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class hq {
  private final ArrayList<zi2> a = new ArrayList<zi2>();
  
  private long b;
  
  final void a(zi2 paramzi2) {
    this.a.add(paramzi2);
  }
  
  final long b() {
    Iterator<zi2> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      Map<String, List<String>> map = ((zi2)iterator.next()).getResponseHeaders();
      if (map != null) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
          try {
            if ("content-length".equalsIgnoreCase((String)entry.getKey())) {
              long l = Long.parseLong(((List<String>)entry.getValue()).get(0));
              this.b = Math.max(this.b, l);
            } 
          } catch (RuntimeException runtimeException) {}
        } 
        iterator.remove();
      } 
    } 
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */