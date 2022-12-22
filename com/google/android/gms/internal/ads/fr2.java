package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

abstract class fr2<T> {
  private static final ks2 a = e();
  
  private static ks2 e() {
    try {
      IBinder iBinder1 = (IBinder)sq2.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      if (!(iBinder1 instanceof IBinder)) {
        cm.i("ClientApi class is not an instance of IBinder.");
        return null;
      } 
      IBinder iBinder2 = iBinder1;
      if (iBinder2 == null)
        return null; 
      null = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
      return (null instanceof ks2) ? (ks2)null : new ms2(iBinder2);
    } catch (Exception exception) {
      cm.i("Failed to instantiate ClientApi class.");
      return null;
    } 
  }
  
  private final T f() {
    ks2 ks21 = a;
    if (ks21 == null) {
      cm.i("ClientApi class cannot be loaded.");
      return null;
    } 
    try {
      return a(ks21);
    } catch (RemoteException remoteException) {
      cm.d("Cannot invoke local loader using ClientApi class.", (Throwable)remoteException);
      return null;
    } 
  }
  
  private final T g() {
    try {
      return d();
    } catch (RemoteException remoteException) {
      cm.d("Cannot invoke remote loader.", (Throwable)remoteException);
      return null;
    } 
  }
  
  protected abstract T a(ks2 paramks2);
  
  public final T b(Context paramContext, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_2
    //   3: ifne -> 12
    //   6: iconst_0
    //   7: istore #4
    //   9: goto -> 15
    //   12: iconst_1
    //   13: istore #4
    //   15: iload #4
    //   17: istore #5
    //   19: iload #4
    //   21: ifne -> 49
    //   24: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   27: pop
    //   28: iload #4
    //   30: istore #5
    //   32: aload_1
    //   33: ldc 12451000
    //   35: invokestatic u : (Landroid/content/Context;I)Z
    //   38: ifne -> 49
    //   41: ldc 'Google Play Services is not available.'
    //   43: invokestatic e : (Ljava/lang/String;)V
    //   46: iconst_1
    //   47: istore #5
    //   49: aload_1
    //   50: ldc 'com.google.android.gms.ads.dynamite'
    //   52: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   55: aload_1
    //   56: ldc 'com.google.android.gms.ads.dynamite'
    //   58: invokestatic c : (Landroid/content/Context;Ljava/lang/String;)I
    //   61: if_icmple -> 67
    //   64: iconst_1
    //   65: istore #5
    //   67: aload_1
    //   68: invokestatic a : (Landroid/content/Context;)V
    //   71: getstatic com/google/android/gms/internal/ads/b2.a : Lcom/google/android/gms/internal/ads/t1;
    //   74: invokevirtual a : ()Ljava/lang/Object;
    //   77: checkcast java/lang/Boolean
    //   80: invokevirtual booleanValue : ()Z
    //   83: ifeq -> 92
    //   86: iconst_0
    //   87: istore #5
    //   89: goto -> 116
    //   92: getstatic com/google/android/gms/internal/ads/b2.b : Lcom/google/android/gms/internal/ads/t1;
    //   95: invokevirtual a : ()Ljava/lang/Object;
    //   98: checkcast java/lang/Boolean
    //   101: invokevirtual booleanValue : ()Z
    //   104: ifeq -> 116
    //   107: iconst_1
    //   108: istore #4
    //   110: iconst_1
    //   111: istore #5
    //   113: goto -> 127
    //   116: iconst_0
    //   117: istore #6
    //   119: iload #5
    //   121: istore #4
    //   123: iload #6
    //   125: istore #5
    //   127: iload #4
    //   129: ifeq -> 162
    //   132: aload_0
    //   133: invokespecial f : ()Ljava/lang/Object;
    //   136: astore #7
    //   138: aload #7
    //   140: astore_1
    //   141: aload #7
    //   143: ifnonnull -> 284
    //   146: aload #7
    //   148: astore_1
    //   149: iload #5
    //   151: ifne -> 284
    //   154: aload_0
    //   155: invokespecial g : ()Ljava/lang/Object;
    //   158: astore_1
    //   159: goto -> 284
    //   162: aload_0
    //   163: invokespecial g : ()Ljava/lang/Object;
    //   166: astore #7
    //   168: aload #7
    //   170: ifnonnull -> 179
    //   173: iconst_1
    //   174: istore #5
    //   176: goto -> 182
    //   179: iconst_0
    //   180: istore #5
    //   182: iload #5
    //   184: ifeq -> 268
    //   187: getstatic com/google/android/gms/internal/ads/o2.a : Lcom/google/android/gms/internal/ads/t1;
    //   190: invokevirtual a : ()Ljava/lang/Object;
    //   193: checkcast java/lang/Long
    //   196: invokevirtual intValue : ()I
    //   199: istore #6
    //   201: iload_3
    //   202: istore #4
    //   204: invokestatic h : ()Ljava/util/Random;
    //   207: iload #6
    //   209: invokevirtual nextInt : (I)I
    //   212: ifne -> 218
    //   215: iconst_1
    //   216: istore #4
    //   218: iload #4
    //   220: ifeq -> 268
    //   223: new android/os/Bundle
    //   226: dup
    //   227: invokespecial <init> : ()V
    //   230: astore #8
    //   232: aload #8
    //   234: ldc 'action'
    //   236: ldc 'dynamite_load'
    //   238: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   241: aload #8
    //   243: ldc 'is_missing'
    //   245: iload #5
    //   247: invokevirtual putInt : (Ljava/lang/String;I)V
    //   250: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   253: aload_1
    //   254: invokestatic g : ()Lcom/google/android/gms/internal/ads/zzazn;
    //   257: getfield b : Ljava/lang/String;
    //   260: ldc 'gmob-apps'
    //   262: aload #8
    //   264: iconst_1
    //   265: invokevirtual c : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V
    //   268: aload #7
    //   270: ifnonnull -> 281
    //   273: aload_0
    //   274: invokespecial f : ()Ljava/lang/Object;
    //   277: astore_1
    //   278: goto -> 284
    //   281: aload #7
    //   283: astore_1
    //   284: aload_1
    //   285: astore #7
    //   287: aload_1
    //   288: ifnonnull -> 297
    //   291: aload_0
    //   292: invokevirtual c : ()Ljava/lang/Object;
    //   295: astore #7
    //   297: aload #7
    //   299: areturn
  }
  
  protected abstract T c();
  
  protected abstract T d();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */