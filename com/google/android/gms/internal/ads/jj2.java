package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class jj2 {
  public static void a(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException();
  }
  
  public static void b(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static String c(String paramString) {
    if (!TextUtils.isEmpty(paramString))
      return paramString; 
    throw new IllegalArgumentException();
  }
  
  public static <T> T d(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  public static void e(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException();
  }
  
  public static void f(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  public static int g(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= 0 && paramInt1 < paramInt3)
      return paramInt1; 
    throw new IndexOutOfBoundsException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */