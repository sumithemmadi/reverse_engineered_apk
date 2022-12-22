package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

final class ep1 implements wn1 {
  private final Object a;
  
  private final dp1 b;
  
  private final np1 c;
  
  private final pn1 d;
  
  ep1(Object paramObject, dp1 paramdp1, np1 paramnp1, pn1 parampn1) {
    this.a = paramObject;
    this.b = paramdp1;
    this.c = paramnp1;
    this.d = parampn1;
  }
  
  private final byte[] i(Map<String, String> paramMap, Map<String, Object> paramMap1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic currentTimeMillis : ()J
    //   5: lstore_3
    //   6: aload_0
    //   7: getfield a : Ljava/lang/Object;
    //   10: invokevirtual getClass : ()Ljava/lang/Class;
    //   13: ldc 'xss'
    //   15: iconst_2
    //   16: anewarray java/lang/Class
    //   19: dup
    //   20: iconst_0
    //   21: ldc java/util/Map
    //   23: aastore
    //   24: dup
    //   25: iconst_1
    //   26: ldc java/util/Map
    //   28: aastore
    //   29: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   32: aload_0
    //   33: getfield a : Ljava/lang/Object;
    //   36: iconst_2
    //   37: anewarray java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aconst_null
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: aload_2
    //   47: aastore
    //   48: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast [B
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: areturn
    //   59: astore_1
    //   60: aload_0
    //   61: getfield d : Lcom/google/android/gms/internal/ads/pn1;
    //   64: sipush #2007
    //   67: invokestatic currentTimeMillis : ()J
    //   70: lload_3
    //   71: lsub
    //   72: aload_1
    //   73: invokevirtual b : (IJLjava/lang/Exception;)Lcom/google/android/gms/tasks/g;
    //   76: pop
    //   77: aload_0
    //   78: monitorexit
    //   79: aconst_null
    //   80: areturn
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Exception table:
    //   from	to	target	type
    //   2	6	81	finally
    //   6	55	59	java/lang/Exception
    //   6	55	81	finally
    //   60	77	81	finally
  }
  
  private static String j(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : Base64.encodeToString(((ri0)ri0.O().x(zzcm.f).y(zzejr.zzt(paramArrayOfbyte)).h()).g(), 11);
  }
  
  public final String a(Context paramContext, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/google/android/gms/internal/ads/np1;
    //   6: invokeinterface b : ()Ljava/util/Map;
    //   11: astore_2
    //   12: aload_2
    //   13: ldc 'f'
    //   15: ldc 'q'
    //   17: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   22: pop
    //   23: aload_2
    //   24: ldc 'ctx'
    //   26: aload_1
    //   27: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   32: pop
    //   33: aload_2
    //   34: ldc 'aid'
    //   36: aconst_null
    //   37: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   42: pop
    //   43: aload_0
    //   44: aconst_null
    //   45: aload_2
    //   46: invokespecial i : (Ljava/util/Map;Ljava/util/Map;)[B
    //   49: invokestatic j : ([B)Ljava/lang/String;
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: areturn
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Exception table:
    //   from	to	target	type
    //   2	53	57	finally
  }
  
  public final void b(String paramString, MotionEvent paramMotionEvent) {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
    try {
      long l = System.currentTimeMillis();
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("aid", null);
      hashMap.put("evt", paramMotionEvent);
      this.a.getClass().getDeclaredMethod("he", new Class[] { Map.class }).invoke(this.a, new Object[] { hashMap });
      this.d.j(3003, System.currentTimeMillis() - l);
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
      return;
    } catch (Exception exception) {
      zzduz zzduz = new zzduz();
      this(2005, exception);
      throw zzduz;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
    throw paramString;
  }
  
  public final String c(Context paramContext, String paramString1, String paramString2, View paramView, Activity paramActivity) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/google/android/gms/internal/ads/np1;
    //   6: invokeinterface a : ()Ljava/util/Map;
    //   11: astore_2
    //   12: aload_2
    //   13: ldc 'f'
    //   15: ldc 'c'
    //   17: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   22: pop
    //   23: aload_2
    //   24: ldc 'ctx'
    //   26: aload_1
    //   27: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   32: pop
    //   33: aload_2
    //   34: ldc 'cs'
    //   36: aload_3
    //   37: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   42: pop
    //   43: aload_2
    //   44: ldc 'aid'
    //   46: aconst_null
    //   47: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   52: pop
    //   53: aload_2
    //   54: ldc 'view'
    //   56: aload #4
    //   58: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   63: pop
    //   64: aload_2
    //   65: ldc 'act'
    //   67: aload #5
    //   69: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   74: pop
    //   75: aload_0
    //   76: aconst_null
    //   77: aload_2
    //   78: invokespecial i : (Ljava/util/Map;Ljava/util/Map;)[B
    //   81: invokestatic j : ([B)Ljava/lang/String;
    //   84: astore_1
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_1
    //   88: areturn
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_1
    //   93: athrow
    // Exception table:
    //   from	to	target	type
    //   2	85	89	finally
  }
  
  public final String d(Context paramContext, String paramString, View paramView, Activity paramActivity) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/google/android/gms/internal/ads/np1;
    //   6: invokeinterface c : ()Ljava/util/Map;
    //   11: astore_2
    //   12: aload_2
    //   13: ldc 'f'
    //   15: ldc 'v'
    //   17: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   22: pop
    //   23: aload_2
    //   24: ldc 'ctx'
    //   26: aload_1
    //   27: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   32: pop
    //   33: aload_2
    //   34: ldc 'aid'
    //   36: aconst_null
    //   37: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   42: pop
    //   43: aload_2
    //   44: ldc 'view'
    //   46: aload_3
    //   47: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   52: pop
    //   53: aload_2
    //   54: ldc 'act'
    //   56: aload #4
    //   58: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   63: pop
    //   64: aload_0
    //   65: aconst_null
    //   66: aload_2
    //   67: invokespecial i : (Ljava/util/Map;Ljava/util/Map;)[B
    //   70: invokestatic j : ([B)Ljava/lang/String;
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: areturn
    //   78: astore_1
    //   79: aload_0
    //   80: monitorexit
    //   81: aload_1
    //   82: athrow
    // Exception table:
    //   from	to	target	type
    //   2	74	78	finally
  }
  
  public final void e() {
    Exception exception;
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
    try {
      long l = System.currentTimeMillis();
      this.a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.a, new Object[0]);
      this.d.j(3001, System.currentTimeMillis() - l);
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
      return;
    } catch (Exception null) {
      zzduz zzduz = new zzduz();
      this(2003, exception);
      throw zzduz;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
    throw exception;
  }
  
  final dp1 f() {
    return this.b;
  }
  
  final boolean g() {
    Exception exception;
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
    try {
      boolean bool = ((Boolean)this.a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.a, new Object[0])).booleanValue();
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
      return bool;
    } catch (Exception exception1) {
      exception = new zzduz();
      this(2001, exception1);
      throw exception;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
    throw exception;
  }
  
  public final int h() {
    Exception exception;
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
    try {
      int i = ((Integer)this.a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.a, new Object[0])).intValue();
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
      return i;
    } catch (Exception null) {
      zzduz zzduz = new zzduz();
      this(2006, exception);
      throw zzduz;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/ep1}} */
    throw exception;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ep1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */