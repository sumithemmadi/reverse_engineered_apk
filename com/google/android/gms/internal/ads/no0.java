package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class no0 implements fm1 {
  private final Map<zzdrk, Long> b;
  
  private final ho0 c;
  
  private final e d;
  
  private final Map<zzdrk, qo0> e;
  
  public no0(ho0 paramho0, Set<qo0> paramSet, e parame) {
    this.c = paramho0;
    this.b = new HashMap<zzdrk, Long>();
    this.e = new HashMap<zzdrk, qo0>();
    for (qo0 qo0 : paramSet)
      this.e.put(qo0.a(qo0), qo0); 
    this.d = parame;
  }
  
  private final void a(zzdrk paramzzdrk, boolean paramBoolean) {
    String str;
    zzdrk zzdrk1 = qo0.b(this.e.get(paramzzdrk));
    if (paramBoolean) {
      str = "s.";
    } else {
      str = "f.";
    } 
    if (this.b.containsKey(zzdrk1)) {
      long l1 = this.d.b();
      long l2 = ((Long)this.b.get(zzdrk1)).longValue();
      Map<String, String> map = this.c.c();
      String str1 = String.valueOf(qo0.c(this.e.get(paramzzdrk)));
      if (str1.length() != 0) {
        str1 = "label.".concat(str1);
      } else {
        str1 = new String("label.");
      } 
      String str2 = String.valueOf(Long.toString(l1 - l2));
      if (str2.length() != 0) {
        str = str.concat(str2);
      } else {
        str = new String(str);
      } 
      map.put(str1, str);
    } 
  }
  
  public final void B(zzdrk paramzzdrk, String paramString) {
    if (this.b.containsKey(paramzzdrk)) {
      long l1 = this.d.b();
      long l2 = ((Long)this.b.get(paramzzdrk)).longValue();
      Map<String, String> map = this.c.c();
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "task.".concat(paramString);
      } else {
        paramString = new String("task.");
      } 
      String str = String.valueOf(Long.toString(l1 - l2));
      if (str.length() != 0) {
        str = "s.".concat(str);
      } else {
        str = new String("s.");
      } 
      map.put(paramString, str);
    } 
    if (this.e.containsKey(paramzzdrk))
      a(paramzzdrk, true); 
  }
  
  public final void C(zzdrk paramzzdrk, String paramString, Throwable paramThrowable) {
    if (this.b.containsKey(paramzzdrk)) {
      long l1 = this.d.b();
      long l2 = ((Long)this.b.get(paramzzdrk)).longValue();
      Map<String, String> map = this.c.c();
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "task.".concat(paramString);
      } else {
        paramString = new String("task.");
      } 
      String str = String.valueOf(Long.toString(l1 - l2));
      if (str.length() != 0) {
        str = "f.".concat(str);
      } else {
        str = new String("f.");
      } 
      map.put(paramString, str);
    } 
    if (this.e.containsKey(paramzzdrk))
      a(paramzzdrk, false); 
  }
  
  public final void g0(zzdrk paramzzdrk, String paramString) {}
  
  public final void t(zzdrk paramzzdrk, String paramString) {
    this.b.put(paramzzdrk, Long.valueOf(this.d.b()));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/no0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */