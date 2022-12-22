package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.util.r0;
import com.google.android.gms.common.e;
import com.google.android.gms.common.k.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class i0 implements SharedPreferences.OnSharedPreferenceChangeListener {
  private final Object a = new Object();
  
  private final ConditionVariable b = new ConditionVariable();
  
  private volatile boolean c = false;
  
  private volatile boolean d = false;
  
  private SharedPreferences e = null;
  
  private Bundle f = new Bundle();
  
  private Context g;
  
  private JSONObject h = new JSONObject();
  
  private final void e() {
    if (this.e == null)
      return; 
    try {
      k0 k0 = new k0();
      this(this);
      String str = (String)r0.b(k0);
      JSONObject jSONObject = new JSONObject();
      this(str);
      this.h = jSONObject;
    } catch (JSONException jSONException) {}
  }
  
  public final void a(Context paramContext) {
    if (this.c)
      return; 
    synchronized (this.a) {
      Context context;
      if (this.c)
        return; 
      if (!this.d)
        this.d = true; 
      if (paramContext.getApplicationContext() == null) {
        context = paramContext;
      } else {
        context = paramContext.getApplicationContext();
      } 
      this.g = context;
      try {
        this.f = (c.a(context).c(this.g.getPackageName(), 128)).metaData;
      } catch (android.content.pm.PackageManager.NameNotFoundException|NullPointerException nameNotFoundException) {}
      try {
        Context context1 = e.d(paramContext);
        context = context1;
        if (context1 == null) {
          context = paramContext.getApplicationContext();
          if (context != null)
            paramContext = context; 
          context = paramContext;
        } 
        if (context == null)
          return; 
        er2.c();
        SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
        this.e = sharedPreferences;
        if (sharedPreferences != null)
          sharedPreferences.registerOnSharedPreferenceChangeListener(this); 
        j0 j0 = new j0();
        this(this);
        t2.a(j0);
        e();
        this.c = true;
        return;
      } finally {
        this.d = false;
        this.b.open();
      } 
    } 
  }
  
  public final <T> T c(x<T> paramx) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroid/os/ConditionVariable;
    //   4: ldc2_w 5000
    //   7: invokevirtual block : (J)Z
    //   10: ifne -> 49
    //   13: aload_0
    //   14: getfield a : Ljava/lang/Object;
    //   17: astore_2
    //   18: aload_2
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield d : Z
    //   24: ifeq -> 32
    //   27: aload_2
    //   28: monitorexit
    //   29: goto -> 49
    //   32: new java/lang/IllegalStateException
    //   35: astore_1
    //   36: aload_1
    //   37: ldc 'Flags.initialize() was not called!'
    //   39: invokespecial <init> : (Ljava/lang/String;)V
    //   42: aload_1
    //   43: athrow
    //   44: astore_1
    //   45: aload_2
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    //   49: aload_0
    //   50: getfield c : Z
    //   53: ifeq -> 63
    //   56: aload_0
    //   57: getfield e : Landroid/content/SharedPreferences;
    //   60: ifnonnull -> 89
    //   63: aload_0
    //   64: getfield a : Ljava/lang/Object;
    //   67: astore_2
    //   68: aload_2
    //   69: monitorenter
    //   70: aload_0
    //   71: getfield c : Z
    //   74: ifeq -> 161
    //   77: aload_0
    //   78: getfield e : Landroid/content/SharedPreferences;
    //   81: ifnonnull -> 87
    //   84: goto -> 161
    //   87: aload_2
    //   88: monitorexit
    //   89: aload_1
    //   90: invokevirtual b : ()I
    //   93: iconst_2
    //   94: if_icmpne -> 117
    //   97: aload_0
    //   98: getfield f : Landroid/os/Bundle;
    //   101: astore_2
    //   102: aload_2
    //   103: ifnonnull -> 111
    //   106: aload_1
    //   107: invokevirtual m : ()Ljava/lang/Object;
    //   110: areturn
    //   111: aload_1
    //   112: aload_2
    //   113: invokevirtual h : (Landroid/os/Bundle;)Ljava/lang/Object;
    //   116: areturn
    //   117: aload_1
    //   118: invokevirtual b : ()I
    //   121: iconst_1
    //   122: if_icmpne -> 148
    //   125: aload_0
    //   126: getfield h : Lorg/json/JSONObject;
    //   129: aload_1
    //   130: invokevirtual a : ()Ljava/lang/String;
    //   133: invokevirtual has : (Ljava/lang/String;)Z
    //   136: ifeq -> 148
    //   139: aload_1
    //   140: aload_0
    //   141: getfield h : Lorg/json/JSONObject;
    //   144: invokevirtual l : (Lorg/json/JSONObject;)Ljava/lang/Object;
    //   147: areturn
    //   148: new com/google/android/gms/internal/ads/h0
    //   151: dup
    //   152: aload_0
    //   153: aload_1
    //   154: invokespecial <init> : (Lcom/google/android/gms/internal/ads/i0;Lcom/google/android/gms/internal/ads/x;)V
    //   157: invokestatic b : (Lcom/google/android/gms/internal/ads/dr1;)Ljava/lang/Object;
    //   160: areturn
    //   161: aload_1
    //   162: invokevirtual m : ()Ljava/lang/Object;
    //   165: astore_1
    //   166: aload_2
    //   167: monitorexit
    //   168: aload_1
    //   169: areturn
    //   170: astore_1
    //   171: aload_2
    //   172: monitorexit
    //   173: aload_1
    //   174: athrow
    // Exception table:
    //   from	to	target	type
    //   20	29	44	finally
    //   32	44	44	finally
    //   45	47	44	finally
    //   70	84	170	finally
    //   87	89	170	finally
    //   161	168	170	finally
    //   171	173	170	finally
  }
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString) {
    if ("flag_configuration".equals(paramString))
      e(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */