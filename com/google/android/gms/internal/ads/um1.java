package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class um1 {
  private final e a;
  
  private final Map<String, List<String>> b;
  
  private final Map<String, Long> c;
  
  public um1(e parame) {
    this.a = parame;
    this.b = new HashMap<String, List<String>>();
    this.c = new HashMap<String, Long>();
  }
  
  private final void d(String paramString1, String paramString2) {
    if (!this.b.containsKey(paramString1))
      this.b.put(paramString1, new ArrayList<String>()); 
    ((List<String>)this.b.get(paramString1)).add(paramString2);
  }
  
  public final List<xm1> a() {
    ArrayList<xm1> arrayList = new ArrayList();
    for (Map.Entry<String, List<String>> entry : this.b.entrySet()) {
      int i = ((List)entry.getValue()).size();
      byte b = 0;
      if (i > 1) {
        for (String str1 : entry.getValue()) {
          String str2 = (String)entry.getKey();
          b++;
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 12);
          stringBuilder.append(str2);
          stringBuilder.append(".");
          stringBuilder.append(b);
          arrayList.add(new xm1(stringBuilder.toString(), str1));
        } 
        continue;
      } 
      arrayList.add(new xm1((String)entry.getKey(), ((List<String>)entry.getValue()).get(0)));
    } 
    return arrayList;
  }
  
  public final void b(String paramString) {
    if (this.c.containsKey(paramString)) {
      long l1 = this.a.b();
      long l2 = ((Long)this.c.remove(paramString)).longValue();
      StringBuilder stringBuilder = new StringBuilder(20);
      stringBuilder.append(l1 - l2);
      d(paramString, stringBuilder.toString());
      return;
    } 
    this.c.put(paramString, Long.valueOf(this.a.b()));
  }
  
  public final void c(String paramString1, String paramString2) {
    if (this.c.containsKey(paramString1)) {
      long l1 = this.a.b();
      long l2 = ((Long)this.c.remove(paramString1)).longValue();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString2).length() + 20);
      stringBuilder.append(paramString2);
      stringBuilder.append(l1 - l2);
      d(paramString1, stringBuilder.toString());
      return;
    } 
    this.c.put(paramString1, Long.valueOf(this.a.b()));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/um1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */