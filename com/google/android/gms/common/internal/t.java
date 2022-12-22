package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.y;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class t {
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
  
  public static void c(boolean paramBoolean, String paramString, Object... paramVarArgs) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
  
  public static void d(Handler paramHandler) {
    Looper looper = Looper.myLooper();
    if (looper != paramHandler.getLooper()) {
      String str1;
      if (looper != null) {
        str1 = looper.getThread().getName();
      } else {
        str1 = "null current looper";
      } 
      String str2 = paramHandler.getLooper().getThread().getName();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 36 + String.valueOf(str1).length());
      stringBuilder.append("Must be called on ");
      stringBuilder.append(str2);
      stringBuilder.append(" thread, but got ");
      stringBuilder.append(str1);
      stringBuilder.append(".");
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
  
  public static void e(String paramString) {
    if (y.a())
      return; 
    throw new IllegalStateException(paramString);
  }
  
  public static String f(String paramString) {
    if (!TextUtils.isEmpty(paramString))
      return paramString; 
    throw new IllegalArgumentException("Given String is empty or null");
  }
  
  public static String g(String paramString, Object paramObject) {
    if (!TextUtils.isEmpty(paramString))
      return paramString; 
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void h() {
    i("Must not be called on the main application thread");
  }
  
  public static void i(String paramString) {
    if (!y.a())
      return; 
    throw new IllegalStateException(paramString);
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T j(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException("null reference");
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T k(T paramT, Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static int l(int paramInt) {
    if (paramInt != 0)
      return paramInt; 
    throw new IllegalArgumentException("Given Integer is zero");
  }
  
  public static void m(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException();
  }
  
  public static void n(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  public static void o(boolean paramBoolean, String paramString, Object... paramVarArgs) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(String.format(paramString, paramVarArgs));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */