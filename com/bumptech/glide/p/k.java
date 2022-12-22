package com.bumptech.glide.p;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.i.l;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class k {
  private static final char[] a = "0123456789abcdef".toCharArray();
  
  private static final char[] b = new char[64];
  
  private static volatile Handler c;
  
  public static void a() {
    if (q())
      return; 
    throw new IllegalArgumentException("You must call this method on the main thread");
  }
  
  public static boolean b(Object paramObject1, Object paramObject2) {
    if (paramObject1 == null) {
      boolean bool;
      if (paramObject2 == null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
    return (paramObject1 instanceof l) ? ((l)paramObject1).a(paramObject2) : paramObject1.equals(paramObject2);
  }
  
  public static boolean c(Object paramObject1, Object paramObject2) {
    boolean bool;
    if (paramObject1 == null) {
      if (paramObject2 == null) {
        bool = true;
      } else {
        bool = false;
      } 
    } else {
      bool = paramObject1.equals(paramObject2);
    } 
    return bool;
  }
  
  private static String d(byte[] paramArrayOfbyte, char[] paramArrayOfchar) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      int i = paramArrayOfbyte[b] & 0xFF;
      int j = b * 2;
      char[] arrayOfChar = a;
      paramArrayOfchar[j] = (char)arrayOfChar[i >>> 4];
      paramArrayOfchar[j + 1] = (char)arrayOfChar[i & 0xF];
    } 
    return new String(paramArrayOfchar);
  }
  
  public static <T> Queue<T> e(int paramInt) {
    return new ArrayDeque<T>(paramInt);
  }
  
  public static int f(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return paramInt1 * paramInt2 * h(paramConfig);
  }
  
  @TargetApi(19)
  public static int g(Bitmap paramBitmap) {
    if (!paramBitmap.isRecycled()) {
      if (Build.VERSION.SDK_INT >= 19)
        try {
          return paramBitmap.getAllocationByteCount();
        } catch (NullPointerException nullPointerException) {} 
      return paramBitmap.getHeight() * paramBitmap.getRowBytes();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot obtain size for recycled Bitmap: ");
    stringBuilder.append(paramBitmap);
    stringBuilder.append("[");
    stringBuilder.append(paramBitmap.getWidth());
    stringBuilder.append("x");
    stringBuilder.append(paramBitmap.getHeight());
    stringBuilder.append("] ");
    stringBuilder.append(paramBitmap.getConfig());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private static int h(Bitmap.Config paramConfig) {
    Bitmap.Config config = paramConfig;
    if (paramConfig == null)
      config = Bitmap.Config.ARGB_8888; 
    int i = a.a[config.ordinal()];
    byte b = 4;
    if (i != 1) {
      if (i != 2 && i != 3) {
        if (i == 4)
          b = 8; 
      } else {
        b = 2;
      } 
    } else {
      b = 1;
    } 
    return b;
  }
  
  public static <T> List<T> i(Collection<T> paramCollection) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_0
    //   5: invokeinterface size : ()I
    //   10: invokespecial <init> : (I)V
    //   13: astore_1
    //   14: aload_0
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_0
    //   21: aload_0
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 52
    //   30: aload_0
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: astore_2
    //   37: aload_2
    //   38: ifnull -> 21
    //   41: aload_1
    //   42: aload_2
    //   43: invokeinterface add : (Ljava/lang/Object;)Z
    //   48: pop
    //   49: goto -> 21
    //   52: aload_1
    //   53: areturn
  }
  
  private static Handler j() {
    // Byte code:
    //   0: getstatic com/bumptech/glide/p/k.c : Landroid/os/Handler;
    //   3: ifnonnull -> 42
    //   6: ldc com/bumptech/glide/p/k
    //   8: monitorenter
    //   9: getstatic com/bumptech/glide/p/k.c : Landroid/os/Handler;
    //   12: ifnonnull -> 30
    //   15: new android/os/Handler
    //   18: astore_0
    //   19: aload_0
    //   20: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   23: invokespecial <init> : (Landroid/os/Looper;)V
    //   26: aload_0
    //   27: putstatic com/bumptech/glide/p/k.c : Landroid/os/Handler;
    //   30: ldc com/bumptech/glide/p/k
    //   32: monitorexit
    //   33: goto -> 42
    //   36: astore_0
    //   37: ldc com/bumptech/glide/p/k
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    //   42: getstatic com/bumptech/glide/p/k.c : Landroid/os/Handler;
    //   45: areturn
    // Exception table:
    //   from	to	target	type
    //   9	30	36	finally
    //   30	33	36	finally
    //   37	40	36	finally
  }
  
  public static int k(float paramFloat) {
    return l(paramFloat, 17);
  }
  
  public static int l(float paramFloat, int paramInt) {
    return m(Float.floatToIntBits(paramFloat), paramInt);
  }
  
  public static int m(int paramInt1, int paramInt2) {
    return paramInt2 * 31 + paramInt1;
  }
  
  public static int n(Object paramObject, int paramInt) {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    } 
    return m(i, paramInt);
  }
  
  public static int o(boolean paramBoolean, int paramInt) {
    return m(paramBoolean, paramInt);
  }
  
  public static boolean p() {
    return q() ^ true;
  }
  
  public static boolean q() {
    boolean bool;
    if (Looper.myLooper() == Looper.getMainLooper()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean r(int paramInt) {
    return (paramInt > 0 || paramInt == Integer.MIN_VALUE);
  }
  
  public static boolean s(int paramInt1, int paramInt2) {
    boolean bool;
    if (r(paramInt1) && r(paramInt2)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static void t(Runnable paramRunnable) {
    j().post(paramRunnable);
  }
  
  public static void u(Runnable paramRunnable) {
    j().removeCallbacks(paramRunnable);
  }
  
  public static String v(byte[] paramArrayOfbyte) {
    synchronized (b) {
      return d(paramArrayOfbyte, null);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */