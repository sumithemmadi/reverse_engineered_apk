package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.a;
import com.google.android.gms.ads.formats.d;
import com.google.android.gms.ads.t;
import com.google.android.gms.dynamic.a;
import java.util.List;

public final class b4 extends d {
  private final a4 a;
  
  private final List<a.b> b;
  
  private final n3 c;
  
  private final t d;
  
  private final a.a e;
  
  public b4(a4 parama4) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield b : Ljava/util/List;
    //   15: aload_0
    //   16: new com/google/android/gms/ads/t
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: putfield d : Lcom/google/android/gms/ads/t;
    //   26: aload_0
    //   27: aload_1
    //   28: putfield a : Lcom/google/android/gms/internal/ads/a4;
    //   31: aconst_null
    //   32: astore_2
    //   33: aload_1
    //   34: invokeinterface k : ()Ljava/util/List;
    //   39: astore_1
    //   40: aload_1
    //   41: ifnull -> 166
    //   44: aload_1
    //   45: invokeinterface iterator : ()Ljava/util/Iterator;
    //   50: astore_3
    //   51: aload_3
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 166
    //   60: aload_3
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: astore_1
    //   67: aload_1
    //   68: instanceof android/os/IBinder
    //   71: ifeq -> 123
    //   74: aload_1
    //   75: checkcast android/os/IBinder
    //   78: astore #4
    //   80: aload #4
    //   82: ifnull -> 123
    //   85: aload #4
    //   87: ldc 'com.google.android.gms.ads.internal.formats.client.INativeAdImage'
    //   89: invokeinterface queryLocalInterface : (Ljava/lang/String;)Landroid/os/IInterface;
    //   94: astore_1
    //   95: aload_1
    //   96: instanceof com/google/android/gms/internal/ads/m3
    //   99: ifeq -> 110
    //   102: aload_1
    //   103: checkcast com/google/android/gms/internal/ads/m3
    //   106: astore_1
    //   107: goto -> 125
    //   110: new com/google/android/gms/internal/ads/o3
    //   113: dup
    //   114: aload #4
    //   116: invokespecial <init> : (Landroid/os/IBinder;)V
    //   119: astore_1
    //   120: goto -> 125
    //   123: aconst_null
    //   124: astore_1
    //   125: aload_1
    //   126: ifnull -> 51
    //   129: aload_0
    //   130: getfield b : Ljava/util/List;
    //   133: astore #4
    //   135: new com/google/android/gms/internal/ads/n3
    //   138: astore #5
    //   140: aload #5
    //   142: aload_1
    //   143: invokespecial <init> : (Lcom/google/android/gms/internal/ads/m3;)V
    //   146: aload #4
    //   148: aload #5
    //   150: invokeinterface add : (Ljava/lang/Object;)Z
    //   155: pop
    //   156: goto -> 51
    //   159: astore_1
    //   160: ldc ''
    //   162: aload_1
    //   163: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   166: aload_0
    //   167: getfield a : Lcom/google/android/gms/internal/ads/a4;
    //   170: invokeinterface t : ()Lcom/google/android/gms/internal/ads/m3;
    //   175: astore_3
    //   176: aload_3
    //   177: ifnull -> 199
    //   180: new com/google/android/gms/internal/ads/n3
    //   183: astore_1
    //   184: aload_1
    //   185: aload_3
    //   186: invokespecial <init> : (Lcom/google/android/gms/internal/ads/m3;)V
    //   189: goto -> 201
    //   192: astore_1
    //   193: ldc ''
    //   195: aload_1
    //   196: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   199: aconst_null
    //   200: astore_1
    //   201: aload_0
    //   202: aload_1
    //   203: putfield c : Lcom/google/android/gms/internal/ads/n3;
    //   206: aload_2
    //   207: astore_1
    //   208: aload_0
    //   209: getfield a : Lcom/google/android/gms/internal/ads/a4;
    //   212: invokeinterface g : ()Lcom/google/android/gms/internal/ads/f3;
    //   217: ifnull -> 249
    //   220: new com/google/android/gms/internal/ads/g3
    //   223: astore_1
    //   224: aload_1
    //   225: aload_0
    //   226: getfield a : Lcom/google/android/gms/internal/ads/a4;
    //   229: invokeinterface g : ()Lcom/google/android/gms/internal/ads/f3;
    //   234: invokespecial <init> : (Lcom/google/android/gms/internal/ads/f3;)V
    //   237: goto -> 249
    //   240: astore_1
    //   241: ldc ''
    //   243: aload_1
    //   244: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   247: aload_2
    //   248: astore_1
    //   249: aload_0
    //   250: aload_1
    //   251: putfield e : Lcom/google/android/gms/ads/formats/a$a;
    //   254: return
    // Exception table:
    //   from	to	target	type
    //   33	40	159	android/os/RemoteException
    //   44	51	159	android/os/RemoteException
    //   51	80	159	android/os/RemoteException
    //   85	107	159	android/os/RemoteException
    //   110	120	159	android/os/RemoteException
    //   129	156	159	android/os/RemoteException
    //   166	176	192	android/os/RemoteException
    //   180	189	192	android/os/RemoteException
    //   208	237	240	android/os/RemoteException
  }
  
  private final a k() {
    try {
      return this.a.v();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final CharSequence b() {
    try {
      return this.a.j();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final CharSequence c() {
    try {
      return this.a.h();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final CharSequence d() {
    try {
      return this.a.f();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final a.b e() {
    return this.c;
  }
  
  public final List<a.b> f() {
    return this.b;
  }
  
  public final CharSequence g() {
    try {
      return this.a.s();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final Double h() {
    try {
      double d1 = this.a.w();
      return (d1 == -1.0D) ? null : Double.valueOf(d1);
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final CharSequence i() {
    try {
      return this.a.C();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final t j() {
    try {
      if (this.a.getVideoController() != null)
        this.d.b(this.a.getVideoController()); 
    } catch (RemoteException remoteException) {
      cm.c("Exception occurred while getting video controller", (Throwable)remoteException);
    } 
    return this.d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */