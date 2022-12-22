package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
public final class z0 {
  final boolean a;
  
  private final List<x0> b = new LinkedList<x0>();
  
  private final Map<String, String> c;
  
  private final Object d;
  
  private z0 e;
  
  public z0(boolean paramBoolean, String paramString1, String paramString2) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    this.c = (Map)linkedHashMap;
    this.d = new Object();
    this.a = true;
    linkedHashMap.put("action", paramString1);
    linkedHashMap.put("ad_format", paramString2);
  }
  
  public final boolean a(x0 paramx0, long paramLong, String... paramVarArgs) {
    synchronized (this.d) {
      int i = paramVarArgs.length;
      for (byte b = 0; b < i; b++) {
        String str = paramVarArgs[b];
        x0 x01 = new x0();
        this(paramLong, str, paramx0);
        this.b.add(x01);
      } 
      return true;
    } 
  }
  
  public final void b(z0 paramz0) {
    synchronized (this.d) {
      this.e = paramz0;
      return;
    } 
  }
  
  public final x0 c(long paramLong) {
    return !this.a ? null : new x0(paramLong, null, null);
  }
  
  public final void d(String paramString1, String paramString2) {
    if (!this.a || TextUtils.isEmpty(paramString2))
      return; 
    p0 p0 = q.g().l();
    if (p0 == null)
      return; 
    synchronized (this.d) {
      t0 t0 = p0.e(paramString1);
      Map<String, String> map = this.c;
      map.put(paramString1, t0.a(map.get(paramString1), paramString2));
      return;
    } 
  }
  
  public final c1 e() {
    null = m0.D1;
    boolean bool = ((Boolean)er2.e().<Boolean>c(null)).booleanValue();
    StringBuilder stringBuilder = new StringBuilder();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    synchronized (this.d) {
      String str;
      for (x0 x0 : this.b) {
        long l = x0.a();
        str = x0.b();
        x0 = x0.c();
        if (x0 != null && l > 0L) {
          long l1 = x0.a();
          stringBuilder.append(str);
          stringBuilder.append('.');
          stringBuilder.append(l - l1);
          stringBuilder.append(',');
          if (bool) {
            if (!hashMap.containsKey(Long.valueOf(x0.a()))) {
              l = x0.a();
              stringBuilder2 = new StringBuilder();
              this(str);
              hashMap.put(Long.valueOf(l), stringBuilder2);
              continue;
            } 
            StringBuilder stringBuilder2 = (StringBuilder)hashMap.get(Long.valueOf(stringBuilder2.a()));
            stringBuilder2.append('+');
            stringBuilder2.append(str);
          } 
        } 
      } 
      this.b.clear();
      null = null;
      if (!TextUtils.isEmpty(null)) {
        stringBuilder.append((String)null);
      } else if (stringBuilder.length() > 0) {
        stringBuilder.setLength(stringBuilder.length() - 1);
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      this();
      if (bool) {
        for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
          stringBuilder1.append((CharSequence)entry.getValue());
          stringBuilder1.append('.');
          long l = ((Long)entry.getKey()).longValue();
          stringBuilder1.append(q.j().a() + l - q.j().b());
          stringBuilder1.append(',');
        } 
        if (stringBuilder1.length() > 0)
          stringBuilder1.setLength(stringBuilder1.length() - 1); 
        str = stringBuilder1.toString();
      } 
      c1 c1 = new c1();
      this(stringBuilder.toString(), str);
      return c1;
    } 
  }
  
  public final Map<String, String> f() {
    synchronized (this.d) {
      p0 p0 = q.g().l();
      if (p0 != null) {
        z0 z01 = this.e;
        if (z01 != null)
          return p0.a(this.c, z01.f()); 
      } 
      return this.c;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */