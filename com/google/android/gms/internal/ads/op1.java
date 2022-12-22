package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public final class op1 {
  private static final HashMap<String, Class<?>> a = new HashMap<String, Class<?>>();
  
  private final Context b;
  
  private final np1 c;
  
  private final pn1 d;
  
  private final on1 e;
  
  private ep1 f;
  
  private final Object g = new Object();
  
  public op1(Context paramContext, np1 paramnp1, pn1 parampn1, on1 paramon1) {
    this.b = paramContext;
    this.c = paramnp1;
    this.d = parampn1;
    this.e = paramon1;
  }
  
  private final Class<?> a(dp1 paramdp1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual a : ()Lcom/google/android/gms/internal/ads/rb2;
    //   6: ifnull -> 181
    //   9: aload_1
    //   10: invokevirtual a : ()Lcom/google/android/gms/internal/ads/rb2;
    //   13: invokevirtual R : ()Ljava/lang/String;
    //   16: astore_2
    //   17: getstatic com/google/android/gms/internal/ads/op1.a : Ljava/util/HashMap;
    //   20: astore_3
    //   21: aload_3
    //   22: aload_2
    //   23: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   26: checkcast java/lang/Class
    //   29: astore #4
    //   31: aload #4
    //   33: ifnull -> 41
    //   36: aload_0
    //   37: monitorexit
    //   38: aload #4
    //   40: areturn
    //   41: aload_0
    //   42: getfield e : Lcom/google/android/gms/internal/ads/on1;
    //   45: aload_1
    //   46: invokevirtual b : ()Ljava/io/File;
    //   49: invokevirtual a : (Ljava/io/File;)Z
    //   52: istore #5
    //   54: iload #5
    //   56: ifeq -> 151
    //   59: aload_1
    //   60: invokevirtual c : ()Ljava/io/File;
    //   63: astore #4
    //   65: aload #4
    //   67: invokevirtual exists : ()Z
    //   70: ifne -> 79
    //   73: aload #4
    //   75: invokevirtual mkdirs : ()Z
    //   78: pop
    //   79: new dalvik/system/DexClassLoader
    //   82: astore #6
    //   84: aload #6
    //   86: aload_1
    //   87: invokevirtual b : ()Ljava/io/File;
    //   90: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   93: aload #4
    //   95: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   98: aconst_null
    //   99: aload_0
    //   100: getfield b : Landroid/content/Context;
    //   103: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   106: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   109: aload #6
    //   111: ldc 'com.google.ccc.abuse.droidguard.DroidGuard'
    //   113: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   116: astore_1
    //   117: aload_3
    //   118: aload_2
    //   119: aload_1
    //   120: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   123: pop
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_1
    //   127: areturn
    //   128: astore_1
    //   129: goto -> 137
    //   132: astore_1
    //   133: goto -> 137
    //   136: astore_1
    //   137: new com/google/android/gms/internal/ads/zzduz
    //   140: astore_2
    //   141: aload_2
    //   142: sipush #2008
    //   145: aload_1
    //   146: invokespecial <init> : (ILjava/lang/Throwable;)V
    //   149: aload_2
    //   150: athrow
    //   151: new com/google/android/gms/internal/ads/zzduz
    //   154: astore_1
    //   155: aload_1
    //   156: sipush #2026
    //   159: ldc 'VM did not pass signature verification'
    //   161: invokespecial <init> : (ILjava/lang/String;)V
    //   164: aload_1
    //   165: athrow
    //   166: astore_1
    //   167: new com/google/android/gms/internal/ads/zzduz
    //   170: astore_2
    //   171: aload_2
    //   172: sipush #2026
    //   175: aload_1
    //   176: invokespecial <init> : (ILjava/lang/Throwable;)V
    //   179: aload_2
    //   180: athrow
    //   181: new com/google/android/gms/internal/ads/zzduz
    //   184: astore_1
    //   185: aload_1
    //   186: sipush #4010
    //   189: ldc 'mc'
    //   191: invokespecial <init> : (ILjava/lang/String;)V
    //   194: aload_1
    //   195: athrow
    //   196: astore_1
    //   197: aload_0
    //   198: monitorexit
    //   199: aload_1
    //   200: athrow
    // Exception table:
    //   from	to	target	type
    //   2	31	196	finally
    //   41	54	166	java/security/GeneralSecurityException
    //   41	54	196	finally
    //   59	79	136	java/lang/ClassNotFoundException
    //   59	79	132	java/lang/SecurityException
    //   59	79	128	java/lang/IllegalArgumentException
    //   59	79	196	finally
    //   79	117	136	java/lang/ClassNotFoundException
    //   79	117	132	java/lang/SecurityException
    //   79	117	128	java/lang/IllegalArgumentException
    //   79	117	196	finally
    //   117	124	196	finally
    //   137	151	196	finally
    //   151	166	166	java/security/GeneralSecurityException
    //   151	166	196	finally
    //   167	181	196	finally
    //   181	196	196	finally
  }
  
  private final Object b(Class<?> paramClass, dp1 paramdp1) {
    try {
      null = paramClass.getDeclaredConstructor(new Class[] { Context.class, String.class, byte[].class, Object.class, Bundle.class, int.class });
      Context context = this.b;
      byte[] arrayOfByte = paramdp1.d();
      Bundle bundle = new Bundle();
      this();
      return null.newInstance(new Object[] { context, "msa-r", arrayOfByte, null, bundle, Integer.valueOf(2) });
    } catch (Exception exception) {
      throw new zzduz(2004, exception);
    } 
  }
  
  public final wn1 c() {
    synchronized (this.g) {
      return this.f;
    } 
  }
  
  public final dp1 d() {
    synchronized (this.g) {
      ep1 ep11 = this.f;
      if (ep11 != null)
        return ep11.f(); 
      return null;
    } 
  }
  
  public final void e(dp1 paramdp1) {
    long l = System.currentTimeMillis();
    try {
      Object object = b(a(paramdp1), paramdp1);
      ep1 ep11 = new ep1();
      this(object, paramdp1, this.c, this.d);
      if (ep11.g()) {
        int i = ep11.h();
        if (i == 0)
          synchronized (this.g) {
            object = this.f;
            if (object != null)
              try {
                object.e();
              } catch (zzduz zzduz2) {
                this.d.b(zzduz2.zzayu(), -1L, zzduz2);
              }  
            this.f = ep11;
            this.d.j(3000, System.currentTimeMillis() - l);
            return;
          }  
        zzduz zzduz1 = new zzduz();
        StringBuilder stringBuilder = new StringBuilder();
        this(15);
        stringBuilder.append("ci: ");
        stringBuilder.append(i);
        this(4001, stringBuilder.toString());
        throw zzduz1;
      } 
      zzduz zzduz = new zzduz();
      this(4000, "init failed");
      throw zzduz;
    } catch (zzduz zzduz) {
      this.d.b(zzduz.zzayu(), System.currentTimeMillis() - l, zzduz);
      return;
    } catch (Exception exception) {
      this.d.b(4010, System.currentTimeMillis() - l, exception);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/op1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */