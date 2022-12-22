package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class e {
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
  
  public static int c(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= paramInt2 && paramInt1 < paramInt3)
      return paramInt1; 
    throw new IndexOutOfBoundsException();
  }
  
  @EnsuresNonNull({"#1"})
  public static String d(String paramString) {
    if (!TextUtils.isEmpty(paramString))
      return paramString; 
    throw new IllegalArgumentException();
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T e(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  public static void f(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException();
  }
  
  public static void g(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T h(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new IllegalStateException();
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T i(T paramT, Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new IllegalStateException(String.valueOf(paramObject));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */