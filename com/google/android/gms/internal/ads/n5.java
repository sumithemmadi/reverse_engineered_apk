package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.a;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.List;

public final class n5 extends g {
  private final m5 a;
  
  private final List<a.b> b;
  
  private final n3 c;
  
  private final t d;
  
  private final a.a e;
  
  private final List<?> f;
  
  public n5(m5 paramm5) {
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
    //   27: new java/util/ArrayList
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: putfield f : Ljava/util/List;
    //   37: aload_0
    //   38: aload_1
    //   39: putfield a : Lcom/google/android/gms/internal/ads/m5;
    //   42: aconst_null
    //   43: astore_2
    //   44: aload_1
    //   45: invokeinterface k : ()Ljava/util/List;
    //   50: astore_1
    //   51: aload_1
    //   52: ifnull -> 177
    //   55: aload_1
    //   56: invokeinterface iterator : ()Ljava/util/Iterator;
    //   61: astore_3
    //   62: aload_3
    //   63: invokeinterface hasNext : ()Z
    //   68: ifeq -> 177
    //   71: aload_3
    //   72: invokeinterface next : ()Ljava/lang/Object;
    //   77: astore_1
    //   78: aload_1
    //   79: instanceof android/os/IBinder
    //   82: ifeq -> 134
    //   85: aload_1
    //   86: checkcast android/os/IBinder
    //   89: astore #4
    //   91: aload #4
    //   93: ifnull -> 134
    //   96: aload #4
    //   98: ldc 'com.google.android.gms.ads.internal.formats.client.INativeAdImage'
    //   100: invokeinterface queryLocalInterface : (Ljava/lang/String;)Landroid/os/IInterface;
    //   105: astore_1
    //   106: aload_1
    //   107: instanceof com/google/android/gms/internal/ads/m3
    //   110: ifeq -> 121
    //   113: aload_1
    //   114: checkcast com/google/android/gms/internal/ads/m3
    //   117: astore_1
    //   118: goto -> 136
    //   121: new com/google/android/gms/internal/ads/o3
    //   124: dup
    //   125: aload #4
    //   127: invokespecial <init> : (Landroid/os/IBinder;)V
    //   130: astore_1
    //   131: goto -> 136
    //   134: aconst_null
    //   135: astore_1
    //   136: aload_1
    //   137: ifnull -> 62
    //   140: aload_0
    //   141: getfield b : Ljava/util/List;
    //   144: astore #4
    //   146: new com/google/android/gms/internal/ads/n3
    //   149: astore #5
    //   151: aload #5
    //   153: aload_1
    //   154: invokespecial <init> : (Lcom/google/android/gms/internal/ads/m3;)V
    //   157: aload #4
    //   159: aload #5
    //   161: invokeinterface add : (Ljava/lang/Object;)Z
    //   166: pop
    //   167: goto -> 62
    //   170: astore_1
    //   171: ldc ''
    //   173: aload_1
    //   174: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   177: aload_0
    //   178: getfield a : Lcom/google/android/gms/internal/ads/m5;
    //   181: invokeinterface D6 : ()Ljava/util/List;
    //   186: astore_1
    //   187: aload_1
    //   188: ifnull -> 275
    //   191: aload_1
    //   192: invokeinterface iterator : ()Ljava/util/Iterator;
    //   197: astore_3
    //   198: aload_3
    //   199: invokeinterface hasNext : ()Z
    //   204: ifeq -> 275
    //   207: aload_3
    //   208: invokeinterface next : ()Ljava/lang/Object;
    //   213: astore_1
    //   214: aload_1
    //   215: instanceof android/os/IBinder
    //   218: ifeq -> 232
    //   221: aload_1
    //   222: checkcast android/os/IBinder
    //   225: invokestatic S9 : (Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/ys2;
    //   228: astore_1
    //   229: goto -> 234
    //   232: aconst_null
    //   233: astore_1
    //   234: aload_1
    //   235: ifnull -> 198
    //   238: aload_0
    //   239: getfield f : Ljava/util/List;
    //   242: astore #4
    //   244: new com/google/android/gms/internal/ads/ct2
    //   247: astore #5
    //   249: aload #5
    //   251: aload_1
    //   252: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ys2;)V
    //   255: aload #4
    //   257: aload #5
    //   259: invokeinterface add : (Ljava/lang/Object;)Z
    //   264: pop
    //   265: goto -> 198
    //   268: astore_1
    //   269: ldc ''
    //   271: aload_1
    //   272: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   275: aload_0
    //   276: getfield a : Lcom/google/android/gms/internal/ads/m5;
    //   279: invokeinterface t : ()Lcom/google/android/gms/internal/ads/m3;
    //   284: astore_3
    //   285: aload_3
    //   286: ifnull -> 308
    //   289: new com/google/android/gms/internal/ads/n3
    //   292: astore_1
    //   293: aload_1
    //   294: aload_3
    //   295: invokespecial <init> : (Lcom/google/android/gms/internal/ads/m3;)V
    //   298: goto -> 310
    //   301: astore_1
    //   302: ldc ''
    //   304: aload_1
    //   305: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   308: aconst_null
    //   309: astore_1
    //   310: aload_0
    //   311: aload_1
    //   312: putfield c : Lcom/google/android/gms/internal/ads/n3;
    //   315: aload_2
    //   316: astore_1
    //   317: aload_0
    //   318: getfield a : Lcom/google/android/gms/internal/ads/m5;
    //   321: invokeinterface g : ()Lcom/google/android/gms/internal/ads/f3;
    //   326: ifnull -> 358
    //   329: new com/google/android/gms/internal/ads/g3
    //   332: astore_1
    //   333: aload_1
    //   334: aload_0
    //   335: getfield a : Lcom/google/android/gms/internal/ads/m5;
    //   338: invokeinterface g : ()Lcom/google/android/gms/internal/ads/f3;
    //   343: invokespecial <init> : (Lcom/google/android/gms/internal/ads/f3;)V
    //   346: goto -> 358
    //   349: astore_1
    //   350: ldc ''
    //   352: aload_1
    //   353: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   356: aload_2
    //   357: astore_1
    //   358: aload_0
    //   359: aload_1
    //   360: putfield e : Lcom/google/android/gms/ads/formats/a$a;
    //   363: return
    // Exception table:
    //   from	to	target	type
    //   44	51	170	android/os/RemoteException
    //   55	62	170	android/os/RemoteException
    //   62	91	170	android/os/RemoteException
    //   96	118	170	android/os/RemoteException
    //   121	131	170	android/os/RemoteException
    //   140	167	170	android/os/RemoteException
    //   177	187	268	android/os/RemoteException
    //   191	198	268	android/os/RemoteException
    //   198	229	268	android/os/RemoteException
    //   238	265	268	android/os/RemoteException
    //   275	285	301	android/os/RemoteException
    //   289	298	301	android/os/RemoteException
    //   317	346	349	android/os/RemoteException
  }
  
  private final a m() {
    try {
      return this.a.v();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final String a() {
    try {
      return this.a.B();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final String b() {
    try {
      return this.a.j();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final String c() {
    try {
      return this.a.h();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final String d() {
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
  
  public final String g() {
    try {
      return this.a.s();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final Double h() {
    try {
      double d = this.a.w();
      return (d == -1.0D) ? null : Double.valueOf(d);
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final String i() {
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
  
  public final Object l() {
    try {
      a a1 = this.a.e();
      if (a1 != null)
        return b.o1(a1); 
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
    } 
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */