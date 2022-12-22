package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

public abstract class x<T> {
  private final int a;
  
  private final String b;
  
  private final T c;
  
  private x(int paramInt, String paramString, T paramT) {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramT;
    er2.d().b(this);
  }
  
  public static x<Float> c(int paramInt, String paramString, float paramFloat) {
    return new b0(1, paramString, Float.valueOf(0.0F));
  }
  
  public static x<Integer> d(int paramInt1, String paramString, int paramInt2) {
    return new z(1, paramString, Integer.valueOf(paramInt2));
  }
  
  public static x<Boolean> e(int paramInt, String paramString, Boolean paramBoolean) {
    return new a0(paramInt, paramString, paramBoolean);
  }
  
  public static x<String> f(int paramInt, String paramString1, String paramString2) {
    return new e0(1, paramString1, paramString2);
  }
  
  public static x<String> j(int paramInt, String paramString) {
    x<String> x1 = f(1, paramString, null);
    er2.d().d(x1);
    return x1;
  }
  
  public static x<Long> k(int paramInt, String paramString, long paramLong) {
    return new c0(1, paramString, Long.valueOf(paramLong));
  }
  
  public final String a() {
    return this.b;
  }
  
  public final int b() {
    return this.a;
  }
  
  protected abstract T g(SharedPreferences paramSharedPreferences);
  
  public abstract T h(Bundle paramBundle);
  
  public abstract void i(SharedPreferences.Editor paramEditor, T paramT);
  
  protected abstract T l(JSONObject paramJSONObject);
  
  public final T m() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */