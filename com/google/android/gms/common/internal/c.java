package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

public final class c {
  public static void a(String paramString) {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
      return; 
    String str1 = String.valueOf(Thread.currentThread());
    String str2 = String.valueOf(Looper.getMainLooper().getThread());
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 57 + str2.length());
    stringBuilder.append("checkMainThread: current thread ");
    stringBuilder.append(str1);
    stringBuilder.append(" IS NOT the main thread ");
    stringBuilder.append(str2);
    stringBuilder.append("!");
    Log.e("Asserts", stringBuilder.toString());
    throw new IllegalStateException(paramString);
  }
  
  public static void b(String paramString) {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
      return; 
    String str1 = String.valueOf(Thread.currentThread());
    String str2 = String.valueOf(Looper.getMainLooper().getThread());
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 56 + str2.length());
    stringBuilder.append("checkNotMainThread: current thread ");
    stringBuilder.append(str1);
    stringBuilder.append(" IS the main thread ");
    stringBuilder.append(str2);
    stringBuilder.append("!");
    Log.e("Asserts", stringBuilder.toString());
    throw new IllegalStateException(paramString);
  }
  
  public static void c(Object paramObject) {
    if (paramObject != null)
      return; 
    throw new IllegalArgumentException("null reference");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */