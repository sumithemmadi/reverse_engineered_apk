package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.a;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.t;
import com.google.android.gms.dynamic.a;
import java.util.List;

public final class f4 extends e {
  private final e4 a;
  
  private final List<a.b> b;
  
  private final n3 c;
  
  private final t d;
  
  private final a.a e;
  
  public f4(e4 parame4) {
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
    //   28: putfield a : Lcom/google/android/gms/internal/ads/e4;
    //   31: aconst_null
    //   32: astore_2
    //   33: aload_1
    //   34: invokeinterface k : ()Ljava/util/List;
    //   39: astore_1
    //   40: aload_1
    //   41: ifnull -> 165
    //   44: aload_1
    //   45: invokeinterface iterator : ()Ljava/util/Iterator;
    //   50: astore_3
    //   51: aload_3
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 165
    //   60: aload_3
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: astore_1
    //   67: aload_1
    //   68: instanceof android/os/IBinder
    //   71: ifeq -> 122
    //   74: aload_1
    //   75: checkcast android/os/IBinder
    //   78: astore_1
    //   79: aload_1
    //   80: ifnull -> 122
    //   83: aload_1
    //   84: ldc 'com.google.android.gms.ads.internal.formats.client.INativeAdImage'
    //   86: invokeinterface queryLocalInterface : (Ljava/lang/String;)Landroid/os/IInterface;
    //   91: astore #4
    //   93: aload #4
    //   95: instanceof com/google/android/gms/internal/ads/m3
    //   98: ifeq -> 110
    //   101: aload #4
    //   103: checkcast com/google/android/gms/internal/ads/m3
    //   106: astore_1
    //   107: goto -> 124
    //   110: new com/google/android/gms/internal/ads/o3
    //   113: dup
    //   114: aload_1
    //   115: invokespecial <init> : (Landroid/os/IBinder;)V
    //   118: astore_1
    //   119: goto -> 124
    //   122: aconst_null
    //   123: astore_1
    //   124: aload_1
    //   125: ifnull -> 51
    //   128: aload_0
    //   129: getfield b : Ljava/util/List;
    //   132: astore #4
    //   134: new com/google/android/gms/internal/ads/n3
    //   137: astore #5
    //   139: aload #5
    //   141: aload_1
    //   142: invokespecial <init> : (Lcom/google/android/gms/internal/ads/m3;)V
    //   145: aload #4
    //   147: aload #5
    //   149: invokeinterface add : (Ljava/lang/Object;)Z
    //   154: pop
    //   155: goto -> 51
    //   158: astore_1
    //   159: ldc ''
    //   161: aload_1
    //   162: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   165: aload_0
    //   166: getfield a : Lcom/google/android/gms/internal/ads/e4;
    //   169: invokeinterface k1 : ()Lcom/google/android/gms/internal/ads/m3;
    //   174: astore_3
    //   175: aload_3
    //   176: ifnull -> 198
    //   179: new com/google/android/gms/internal/ads/n3
    //   182: astore_1
    //   183: aload_1
    //   184: aload_3
    //   185: invokespecial <init> : (Lcom/google/android/gms/internal/ads/m3;)V
    //   188: goto -> 200
    //   191: astore_1
    //   192: ldc ''
    //   194: aload_1
    //   195: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   198: aconst_null
    //   199: astore_1
    //   200: aload_0
    //   201: aload_1
    //   202: putfield c : Lcom/google/android/gms/internal/ads/n3;
    //   205: aload_2
    //   206: astore_1
    //   207: aload_0
    //   208: getfield a : Lcom/google/android/gms/internal/ads/e4;
    //   211: invokeinterface g : ()Lcom/google/android/gms/internal/ads/f3;
    //   216: ifnull -> 248
    //   219: new com/google/android/gms/internal/ads/g3
    //   222: astore_1
    //   223: aload_1
    //   224: aload_0
    //   225: getfield a : Lcom/google/android/gms/internal/ads/e4;
    //   228: invokeinterface g : ()Lcom/google/android/gms/internal/ads/f3;
    //   233: invokespecial <init> : (Lcom/google/android/gms/internal/ads/f3;)V
    //   236: goto -> 248
    //   239: astore_1
    //   240: ldc ''
    //   242: aload_1
    //   243: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   246: aload_2
    //   247: astore_1
    //   248: aload_0
    //   249: aload_1
    //   250: putfield e : Lcom/google/android/gms/ads/formats/a$a;
    //   253: return
    // Exception table:
    //   from	to	target	type
    //   33	40	158	android/os/RemoteException
    //   44	51	158	android/os/RemoteException
    //   51	79	158	android/os/RemoteException
    //   83	107	158	android/os/RemoteException
    //   110	119	158	android/os/RemoteException
    //   128	155	158	android/os/RemoteException
    //   165	175	191	android/os/RemoteException
    //   179	188	191	android/os/RemoteException
    //   207	236	239	android/os/RemoteException
  }
  
  private final a i() {
    try {
      return this.a.v();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final CharSequence b() {
    try {
      return this.a.B();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final CharSequence c() {
    try {
      return this.a.j();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final CharSequence d() {
    try {
      return this.a.h();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final CharSequence e() {
    try {
      return this.a.f();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final List<a.b> f() {
    return this.b;
  }
  
  public final a.b g() {
    return this.c;
  }
  
  public final t h() {
    try {
      if (this.a.getVideoController() != null)
        this.d.b(this.a.getVideoController()); 
    } catch (RemoteException remoteException) {
      cm.c("Exception occurred while getting video controller", (Throwable)remoteException);
    } 
    return this.d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */