package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class o3 extends n5 {
  private char c = (char)Character.MIN_VALUE;
  
  private long d = -1L;
  
  private String e;
  
  private final m3 f = new m3(this, 6, false, false);
  
  private final m3 g = new m3(this, 6, true, false);
  
  private final m3 h = new m3(this, 6, false, true);
  
  private final m3 i = new m3(this, 5, false, false);
  
  private final m3 j = new m3(this, 5, true, false);
  
  private final m3 k = new m3(this, 5, false, true);
  
  private final m3 l = new m3(this, 4, false, false);
  
  private final m3 m = new m3(this, 3, false, false);
  
  private final m3 n = new m3(this, 2, false, false);
  
  o3(s4 params4) {
    super(params4);
  }
  
  static String A(boolean paramBoolean, String paramString, Object paramObject1, Object paramObject2, Object paramObject3) {
    Object object;
    String str1 = "";
    String str2 = paramString;
    if (paramString == null)
      str2 = ""; 
    String str3 = B(paramBoolean, paramObject1);
    String str4 = B(paramBoolean, paramObject2);
    String str5 = B(paramBoolean, paramObject3);
    paramObject3 = new StringBuilder();
    paramString = str1;
    if (!TextUtils.isEmpty(str2)) {
      paramObject3.append(str2);
      paramString = ": ";
    } 
    paramBoolean = TextUtils.isEmpty(str3);
    paramObject2 = ", ";
    paramObject1 = paramString;
    if (!paramBoolean) {
      paramObject3.append(paramString);
      paramObject3.append(str3);
      paramObject1 = ", ";
    } 
    if (!TextUtils.isEmpty(str4)) {
      paramObject3.append((String)paramObject1);
      paramObject3.append(str4);
      object = paramObject2;
    } else {
      object = paramObject1;
    } 
    if (!TextUtils.isEmpty(str5)) {
      paramObject3.append((String)object);
      paramObject3.append(str5);
    } 
    return paramObject3.toString();
  }
  
  static String B(boolean paramBoolean, Object paramObject) {
    String str = "";
    if (paramObject == null)
      return ""; 
    Object object = paramObject;
    if (paramObject instanceof Integer)
      object = Long.valueOf(((Integer)paramObject).intValue()); 
    boolean bool = object instanceof Long;
    byte b = 0;
    if (bool) {
      if (!paramBoolean)
        return String.valueOf(object); 
      Long long_ = (Long)object;
      if (Math.abs(long_.longValue()) < 100L)
        return String.valueOf(object); 
      paramObject = str;
      if (String.valueOf(object).charAt(0) == '-')
        paramObject = "-"; 
      object = String.valueOf(Math.abs(long_.longValue()));
      long l1 = Math.round(Math.pow(10.0D, (object.length() - 1)));
      long l2 = Math.round(Math.pow(10.0D, object.length()) - 1.0D);
      object = new StringBuilder(paramObject.length() + 43 + paramObject.length());
      object.append((String)paramObject);
      object.append(l1);
      object.append("...");
      object.append((String)paramObject);
      object.append(l2);
      return object.toString();
    } 
    if (object instanceof Boolean)
      return String.valueOf(object); 
    if (object instanceof Throwable) {
      object = object;
      if (paramBoolean) {
        paramObject = object.getClass().getName();
      } else {
        paramObject = object.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder((String)paramObject);
      paramObject = G(s4.class.getCanonicalName());
      object = object.getStackTrace();
      int i = object.length;
      while (b < i) {
        Object object1 = object[b];
        if (!object1.isNativeMethod()) {
          String str1 = object1.getClassName();
          if (str1 != null && G(str1).equals(paramObject)) {
            stringBuilder.append(": ");
            stringBuilder.append(object1);
            break;
          } 
        } 
        b++;
      } 
      return stringBuilder.toString();
    } 
    return (object instanceof n3) ? n3.a((n3)object) : (paramBoolean ? "-" : String.valueOf(object));
  }
  
  private static String G(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return ""; 
    int i = paramString.lastIndexOf('.');
    return (i == -1) ? paramString : paramString.substring(0, i);
  }
  
  protected static Object x(String paramString) {
    return (paramString == null) ? null : new n3(paramString);
  }
  
  protected final boolean i() {
    return false;
  }
  
  public final m3 o() {
    return this.f;
  }
  
  public final m3 p() {
    return this.g;
  }
  
  public final m3 q() {
    return this.h;
  }
  
  public final m3 r() {
    return this.i;
  }
  
  public final m3 s() {
    return this.j;
  }
  
  public final m3 t() {
    return this.k;
  }
  
  public final m3 u() {
    return this.l;
  }
  
  public final m3 v() {
    return this.m;
  }
  
  public final m3 w() {
    return this.n;
  }
  
  protected final void y(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString, Object paramObject1, Object paramObject2, Object paramObject3) {
    if (!paramBoolean1 && Log.isLoggable(z(), paramInt)) {
      String str = A(false, paramString, paramObject1, paramObject2, paramObject3);
      Log.println(paramInt, z(), str);
    } 
    if (!paramBoolean2 && paramInt >= 5) {
      t.j(paramString);
      p4 p4 = this.a.E();
      if (p4 == null) {
        Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        return;
      } 
      if (!p4.k()) {
        Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
        return;
      } 
      if (paramInt >= 9)
        paramInt = 8; 
      p4.r((Runnable)new l3(this, paramInt, paramString, paramObject1, paramObject2, paramObject3));
    } 
  }
  
  @EnsuresNonNull({"logTagDoNotUseDirectly"})
  protected final String z() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Ljava/lang/String;
    //   6: ifnonnull -> 47
    //   9: aload_0
    //   10: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   13: invokevirtual N : ()Ljava/lang/String;
    //   16: ifnull -> 33
    //   19: aload_0
    //   20: aload_0
    //   21: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   24: invokevirtual N : ()Ljava/lang/String;
    //   27: putfield e : Ljava/lang/String;
    //   30: goto -> 47
    //   33: aload_0
    //   34: aload_0
    //   35: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   38: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   41: invokevirtual l : ()Ljava/lang/String;
    //   44: putfield e : Ljava/lang/String;
    //   47: aload_0
    //   48: getfield e : Ljava/lang/String;
    //   51: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: pop
    //   55: aload_0
    //   56: getfield e : Ljava/lang/String;
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: areturn
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   2	30	64	finally
    //   33	47	64	finally
    //   47	62	64	finally
    //   65	67	64	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/o3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */