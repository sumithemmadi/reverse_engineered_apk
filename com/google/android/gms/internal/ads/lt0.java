package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class lt0 implements fm1 {
  private final Map<zzdrk, String> b;
  
  private final Map<zzdrk, String> c;
  
  private final rm1 d;
  
  public lt0(Set<ot0> paramSet, rm1 paramrm1) {
    this.d = paramrm1;
    this.b = new HashMap<zzdrk, String>();
    this.c = new HashMap<zzdrk, String>();
    for (ot0 ot0 : paramSet) {
      this.b.put(ot0.a(ot0), ot0.b(ot0));
      this.c.put(ot0.c(ot0), ot0.b(ot0));
    } 
  }
  
  public final void B(zzdrk paramzzdrk, String paramString) {
    rm1 rm11 = this.d;
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "task.".concat(paramString);
    } else {
      paramString = new String("task.");
    } 
    rm11.j(paramString, "s.");
    if (this.c.containsKey(paramzzdrk)) {
      rm1 rm12 = this.d;
      String str = String.valueOf(this.c.get(paramzzdrk));
      if (str.length() != 0) {
        str = "label.".concat(str);
      } else {
        str = new String("label.");
      } 
      rm12.j(str, "s.");
    } 
  }
  
  public final void C(zzdrk paramzzdrk, String paramString, Throwable paramThrowable) {
    rm1 rm11 = this.d;
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "task.".concat(paramString);
    } else {
      paramString = new String("task.");
    } 
    rm11.j(paramString, "f.");
    if (this.c.containsKey(paramzzdrk)) {
      rm1 rm12 = this.d;
      String str = String.valueOf(this.c.get(paramzzdrk));
      if (str.length() != 0) {
        str = "label.".concat(str);
      } else {
        str = new String("label.");
      } 
      rm12.j(str, "f.");
    } 
  }
  
  public final void g0(zzdrk paramzzdrk, String paramString) {}
  
  public final void t(zzdrk paramzzdrk, String paramString) {
    rm1 rm11 = this.d;
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "task.".concat(paramString);
    } else {
      paramString = new String("task.");
    } 
    rm11.f(paramString);
    if (this.b.containsKey(paramzzdrk)) {
      rm1 rm12 = this.d;
      String str = String.valueOf(this.b.get(paramzzdrk));
      if (str.length() != 0) {
        str = "label.".concat(str);
      } else {
        str = new String("label.");
      } 
      rm12.f(str);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */