package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class np0 {
  private boolean a = false;
  
  private boolean b = false;
  
  private final long c;
  
  private final sm<Boolean> d = new sm<Boolean>();
  
  private final Context e;
  
  private final WeakReference<Context> f;
  
  private final hm0 g;
  
  private final Executor h;
  
  private final Executor i;
  
  private final ScheduledExecutorService j;
  
  private final xo0 k;
  
  private final zzazn l;
  
  private Map<String, zzajh> m = new ConcurrentHashMap<String, zzajh>();
  
  private final la0 n;
  
  private boolean o = true;
  
  public np0(Executor paramExecutor1, Context paramContext, WeakReference<Context> paramWeakReference, Executor paramExecutor2, hm0 paramhm0, ScheduledExecutorService paramScheduledExecutorService, xo0 paramxo0, zzazn paramzzazn, la0 paramla0) {
    this.g = paramhm0;
    this.e = paramContext;
    this.f = paramWeakReference;
    this.h = paramExecutor2;
    this.j = paramScheduledExecutorService;
    this.i = paramExecutor1;
    this.k = paramxo0;
    this.l = paramzzazn;
    this.n = paramla0;
    this.c = q.j().b();
    h("com.google.android.gms.ads.MobileAds", false, "", 0);
  }
  
  private final void h(String paramString1, boolean paramBoolean, String paramString2, int paramInt) {
    this.m.put(paramString1, new zzajh(paramString1, paramBoolean, paramInt, paramString2));
  }
  
  private final ot1<String> l() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   5: invokevirtual r : ()Lcom/google/android/gms/ads/internal/util/d1;
    //   8: invokeinterface f : ()Lcom/google/android/gms/internal/ads/gl;
    //   13: invokevirtual c : ()Ljava/lang/String;
    //   16: astore_1
    //   17: aload_1
    //   18: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   21: ifne -> 33
    //   24: aload_1
    //   25: invokestatic h : (Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ot1;
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: new com/google/android/gms/internal/ads/sm
    //   36: astore_2
    //   37: aload_2
    //   38: invokespecial <init> : ()V
    //   41: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   44: invokevirtual r : ()Lcom/google/android/gms/ads/internal/util/d1;
    //   47: astore_3
    //   48: new com/google/android/gms/internal/ads/op0
    //   51: astore_1
    //   52: aload_1
    //   53: aload_0
    //   54: aload_2
    //   55: invokespecial <init> : (Lcom/google/android/gms/internal/ads/np0;Lcom/google/android/gms/internal/ads/sm;)V
    //   58: aload_3
    //   59: aload_1
    //   60: invokeinterface y : (Ljava/lang/Runnable;)V
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_2
    //   68: areturn
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	69	finally
    //   33	65	69	finally
  }
  
  private final void v(String paramString) {
    try {
      ArrayList<ot1<?>> arrayList = new ArrayList();
      this();
      JSONObject jSONObject = new JSONObject();
      this(paramString);
      jSONObject = jSONObject.getJSONObject("initializer_settings").getJSONObject("config");
      Iterator<String> iterator = jSONObject.keys();
      while (true) {
        if (iterator.hasNext()) {
          String str = iterator.next();
          Object object = new Object();
          this();
          sm<?> sm1 = new sm();
          this();
          x<Long> x = m0.B1;
          ot1<?> ot1 = dt1.d(sm1, ((Long)er2.e().<Long>c(x)).longValue(), TimeUnit.SECONDS, this.j);
          this.k.d(str);
          this.n.D(str);
          long l = q.j().b();
          qp0 qp0 = new qp0();
          this(this, object, sm1, str, l);
          ot1.a(qp0, this.h);
          arrayList.add(ot1);
          wp0 wp0 = new wp0();
          this(this, object, str, l, sm1);
          object = jSONObject.optJSONObject(str);
          ArrayList<zzajr> arrayList1 = new ArrayList();
          this();
          if (object != null)
            try {
              object = object.getJSONArray("data");
              for (byte b = 0; b < object.length(); b++) {
                JSONObject jSONObject1 = object.getJSONObject(b);
                String str1 = jSONObject1.optString("format", "");
                JSONObject jSONObject2 = jSONObject1.optJSONObject("data");
                Bundle bundle = new Bundle();
                this();
                if (jSONObject2 != null) {
                  Iterator<String> iterator1 = jSONObject2.keys();
                  while (iterator1.hasNext()) {
                    String str2 = iterator1.next();
                    bundle.putString(str2, jSONObject2.optString(str2, ""));
                  } 
                } 
                zzajr zzajr = new zzajr();
                this(str1, bundle);
                arrayList1.add(zzajr);
              } 
            } catch (JSONException jSONException) {} 
          h(str, false, "", 0);
          try {
            hm0 hm01 = this.g;
            object = new JSONObject();
            super();
            xi1 xi1 = hm01.d(str, (JSONObject)object);
            object = this.i;
            sp0 sp0 = new sp0();
            this(this, xi1, wp0, arrayList1, str);
            object.execute(sp0);
          } catch (zzdnt zzdnt) {
            try {
              wp0.p3("Failed to create Adapter.");
            } catch (RemoteException remoteException) {
              cm.c("", (Throwable)remoteException);
            } 
          } 
          continue;
        } 
        it1<?> it1 = dt1.o(arrayList);
        tp0 tp0 = new tp0();
        this(this);
        it1.a(tp0, this.h);
        return;
      } 
    } catch (JSONException jSONException) {
      b1.l("Malformed CLD response", (Throwable)jSONException);
      return;
    } 
  }
  
  public final void a() {
    this.o = false;
  }
  
  public final void j() {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/m0.z1 : Lcom/google/android/gms/internal/ads/x;
    //   3: astore_1
    //   4: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   7: aload_1
    //   8: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   11: checkcast java/lang/Boolean
    //   14: invokevirtual booleanValue : ()Z
    //   17: ifeq -> 214
    //   20: getstatic com/google/android/gms/internal/ads/k2.a : Lcom/google/android/gms/internal/ads/t1;
    //   23: invokevirtual a : ()Ljava/lang/Object;
    //   26: checkcast java/lang/Boolean
    //   29: invokevirtual booleanValue : ()Z
    //   32: ifne -> 214
    //   35: aload_0
    //   36: getfield l : Lcom/google/android/gms/internal/ads/zzazn;
    //   39: getfield d : I
    //   42: istore_2
    //   43: getstatic com/google/android/gms/internal/ads/m0.A1 : Lcom/google/android/gms/internal/ads/x;
    //   46: astore_1
    //   47: iload_2
    //   48: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   51: aload_1
    //   52: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   55: checkcast java/lang/Integer
    //   58: invokevirtual intValue : ()I
    //   61: if_icmplt -> 214
    //   64: aload_0
    //   65: getfield o : Z
    //   68: ifne -> 74
    //   71: goto -> 214
    //   74: aload_0
    //   75: getfield a : Z
    //   78: ifeq -> 82
    //   81: return
    //   82: aload_0
    //   83: monitorenter
    //   84: aload_0
    //   85: getfield a : Z
    //   88: ifeq -> 94
    //   91: aload_0
    //   92: monitorexit
    //   93: return
    //   94: aload_0
    //   95: getfield k : Lcom/google/android/gms/internal/ads/xo0;
    //   98: invokevirtual a : ()V
    //   101: aload_0
    //   102: getfield n : Lcom/google/android/gms/internal/ads/la0;
    //   105: invokevirtual B : ()V
    //   108: aload_0
    //   109: getfield d : Lcom/google/android/gms/internal/ads/sm;
    //   112: astore_3
    //   113: new com/google/android/gms/internal/ads/pp0
    //   116: astore_1
    //   117: aload_1
    //   118: aload_0
    //   119: invokespecial <init> : (Lcom/google/android/gms/internal/ads/np0;)V
    //   122: aload_3
    //   123: aload_1
    //   124: aload_0
    //   125: getfield h : Ljava/util/concurrent/Executor;
    //   128: invokevirtual a : (Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    //   131: aload_0
    //   132: iconst_1
    //   133: putfield a : Z
    //   136: aload_0
    //   137: invokespecial l : ()Lcom/google/android/gms/internal/ads/ot1;
    //   140: astore_1
    //   141: aload_0
    //   142: getfield j : Ljava/util/concurrent/ScheduledExecutorService;
    //   145: astore #4
    //   147: new com/google/android/gms/internal/ads/rp0
    //   150: astore #5
    //   152: aload #5
    //   154: aload_0
    //   155: invokespecial <init> : (Lcom/google/android/gms/internal/ads/np0;)V
    //   158: getstatic com/google/android/gms/internal/ads/m0.C1 : Lcom/google/android/gms/internal/ads/x;
    //   161: astore_3
    //   162: aload #4
    //   164: aload #5
    //   166: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   169: aload_3
    //   170: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   173: checkcast java/lang/Long
    //   176: invokevirtual longValue : ()J
    //   179: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   182: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   187: pop
    //   188: new com/google/android/gms/internal/ads/up0
    //   191: astore_3
    //   192: aload_3
    //   193: aload_0
    //   194: invokespecial <init> : (Lcom/google/android/gms/internal/ads/np0;)V
    //   197: aload_1
    //   198: aload_3
    //   199: aload_0
    //   200: getfield h : Ljava/util/concurrent/Executor;
    //   203: invokestatic g : (Lcom/google/android/gms/internal/ads/ot1;Lcom/google/android/gms/internal/ads/et1;Ljava/util/concurrent/Executor;)V
    //   206: aload_0
    //   207: monitorexit
    //   208: return
    //   209: astore_1
    //   210: aload_0
    //   211: monitorexit
    //   212: aload_1
    //   213: athrow
    //   214: aload_0
    //   215: getfield a : Z
    //   218: ifne -> 247
    //   221: aload_0
    //   222: ldc 'com.google.android.gms.ads.MobileAds'
    //   224: iconst_1
    //   225: ldc ''
    //   227: iconst_0
    //   228: invokespecial h : (Ljava/lang/String;ZLjava/lang/String;I)V
    //   231: aload_0
    //   232: getfield d : Lcom/google/android/gms/internal/ads/sm;
    //   235: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   238: invokevirtual c : (Ljava/lang/Object;)Z
    //   241: pop
    //   242: aload_0
    //   243: iconst_1
    //   244: putfield a : Z
    //   247: return
    // Exception table:
    //   from	to	target	type
    //   84	93	209	finally
    //   94	208	209	finally
    //   210	212	209	finally
  }
  
  public final List<zzajh> k() {
    ArrayList<zzajh> arrayList = new ArrayList();
    for (String str : this.m.keySet()) {
      zzajh zzajh = this.m.get(str);
      arrayList.add(new zzajh(str, zzajh.c, zzajh.d, zzajh.e));
    } 
    return arrayList;
  }
  
  public final void q(a8 parama8) {
    this.d.a(new mp0(this, parama8), this.i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/np0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */