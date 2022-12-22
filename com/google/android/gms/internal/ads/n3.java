package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.a;

public final class n3 extends a.b {
  private final m3 a;
  
  private final Drawable b;
  
  private final Uri c;
  
  private final double d;
  
  private final int e;
  
  private final int f;
  
  public n3(m3 paramm3) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield a : Lcom/google/android/gms/internal/ads/m3;
    //   9: aconst_null
    //   10: astore_2
    //   11: aload_1
    //   12: invokeinterface D9 : ()Lcom/google/android/gms/dynamic/a;
    //   17: astore_1
    //   18: aload_1
    //   19: ifnull -> 40
    //   22: aload_1
    //   23: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   26: checkcast android/graphics/drawable/Drawable
    //   29: astore_1
    //   30: goto -> 42
    //   33: astore_1
    //   34: ldc ''
    //   36: aload_1
    //   37: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   40: aconst_null
    //   41: astore_1
    //   42: aload_0
    //   43: aload_1
    //   44: putfield b : Landroid/graphics/drawable/Drawable;
    //   47: aload_0
    //   48: getfield a : Lcom/google/android/gms/internal/ads/m3;
    //   51: invokeinterface e0 : ()Landroid/net/Uri;
    //   56: astore_1
    //   57: goto -> 69
    //   60: astore_1
    //   61: ldc ''
    //   63: aload_1
    //   64: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   67: aload_2
    //   68: astore_1
    //   69: aload_0
    //   70: aload_1
    //   71: putfield c : Landroid/net/Uri;
    //   74: dconst_1
    //   75: dstore_3
    //   76: aload_0
    //   77: getfield a : Lcom/google/android/gms/internal/ads/m3;
    //   80: invokeinterface N5 : ()D
    //   85: dstore #5
    //   87: dload #5
    //   89: dstore_3
    //   90: goto -> 100
    //   93: astore_1
    //   94: ldc ''
    //   96: aload_1
    //   97: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   100: aload_0
    //   101: dload_3
    //   102: putfield d : D
    //   105: iconst_m1
    //   106: istore #7
    //   108: aload_0
    //   109: getfield a : Lcom/google/android/gms/internal/ads/m3;
    //   112: invokeinterface getWidth : ()I
    //   117: istore #8
    //   119: goto -> 132
    //   122: astore_1
    //   123: ldc ''
    //   125: aload_1
    //   126: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   129: iconst_m1
    //   130: istore #8
    //   132: aload_0
    //   133: iload #8
    //   135: putfield e : I
    //   138: aload_0
    //   139: getfield a : Lcom/google/android/gms/internal/ads/m3;
    //   142: invokeinterface getHeight : ()I
    //   147: istore #8
    //   149: goto -> 163
    //   152: astore_1
    //   153: ldc ''
    //   155: aload_1
    //   156: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   159: iload #7
    //   161: istore #8
    //   163: aload_0
    //   164: iload #8
    //   166: putfield f : I
    //   169: return
    // Exception table:
    //   from	to	target	type
    //   11	18	33	android/os/RemoteException
    //   22	30	33	android/os/RemoteException
    //   47	57	60	android/os/RemoteException
    //   76	87	93	android/os/RemoteException
    //   108	119	122	android/os/RemoteException
    //   138	149	152	android/os/RemoteException
  }
  
  public final Drawable a() {
    return this.b;
  }
  
  public final int b() {
    return this.f;
  }
  
  public final double c() {
    return this.d;
  }
  
  public final Uri d() {
    return this.c;
  }
  
  public final int e() {
    return this.e;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */