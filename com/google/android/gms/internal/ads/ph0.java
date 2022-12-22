package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h0;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ph0 implements xf0 {
  private final zb a;
  
  private final ac b;
  
  private final fc c;
  
  private final e50 d;
  
  private final l40 e;
  
  private final Context f;
  
  private final nh1 g;
  
  private final zzazn h;
  
  private final gi1 i;
  
  private boolean j = false;
  
  private boolean k = false;
  
  private boolean l = true;
  
  public ph0(zb paramzb, ac paramac, fc paramfc, e50 parame50, l40 paraml40, Context paramContext, nh1 paramnh1, zzazn paramzzazn, gi1 paramgi1) {
    this.a = paramzb;
    this.b = paramac;
    this.c = paramfc;
    this.d = parame50;
    this.e = paraml40;
    this.f = paramContext;
    this.g = paramnh1;
    this.h = paramzzazn;
    this.i = paramgi1;
  }
  
  private final void p(View paramView) {
    try {
      fc fc1 = this.c;
      if (fc1 != null && !fc1.d0()) {
        this.c.b0(b.a2(paramView));
        this.e.x();
        return;
      } 
      zb zb1 = this.a;
      if (zb1 != null && !zb1.d0()) {
        this.a.b0(b.a2(paramView));
        this.e.x();
        return;
      } 
      ac ac1 = this.b;
      if (ac1 != null && !ac1.d0()) {
        this.b.b0(b.a2(paramView));
        this.e.x();
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.d("Failed to call handleClick", (Throwable)remoteException);
      return;
    } 
  }
  
  private final Object q() {
    ac ac1;
    fc fc1 = this.c;
    if (fc1 != null) {
      try {
        a a = fc1.W();
      } catch (RemoteException remoteException) {
        return null;
      } 
    } else {
      zb zb1 = this.a;
      if (zb1 != null) {
        try {
          a a = zb1.W();
        } catch (RemoteException remoteException) {
          return null;
        } 
      } else {
        ac1 = this.b;
        if (ac1 != null) {
          try {
            a a = ac1.W();
          } catch (RemoteException remoteException) {
            return null;
          } 
        } else {
          ac1 = null;
        } 
      } 
    } 
    if (ac1 != null)
      try {
        return b.o1((a)ac1);
      } catch (IllegalArgumentException illegalArgumentException) {} 
    return null;
  }
  
  private static HashMap<String, View> r(Map<String, WeakReference<View>> paramMap) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: ifnonnull -> 14
    //   12: aload_1
    //   13: areturn
    //   14: aload_0
    //   15: monitorenter
    //   16: aload_0
    //   17: invokeinterface entrySet : ()Ljava/util/Set;
    //   22: invokeinterface iterator : ()Ljava/util/Iterator;
    //   27: astore_2
    //   28: aload_2
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 88
    //   37: aload_2
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast java/util/Map$Entry
    //   46: astore_3
    //   47: aload_3
    //   48: invokeinterface getValue : ()Ljava/lang/Object;
    //   53: checkcast java/lang/ref/WeakReference
    //   56: invokevirtual get : ()Ljava/lang/Object;
    //   59: checkcast android/view/View
    //   62: astore #4
    //   64: aload #4
    //   66: ifnull -> 28
    //   69: aload_1
    //   70: aload_3
    //   71: invokeinterface getKey : ()Ljava/lang/Object;
    //   76: checkcast java/lang/String
    //   79: aload #4
    //   81: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   84: pop
    //   85: goto -> 28
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_1
    //   91: areturn
    //   92: astore_3
    //   93: aload_0
    //   94: monitorexit
    //   95: goto -> 100
    //   98: aload_3
    //   99: athrow
    //   100: goto -> 98
    // Exception table:
    //   from	to	target	type
    //   16	28	92	finally
    //   28	64	92	finally
    //   69	85	92	finally
    //   88	90	92	finally
    //   93	95	92	finally
  }
  
  private final boolean s(Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2) {
    JSONObject jSONObject = this.g.e0;
    x<Boolean> x = m0.w1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && jSONObject.length() != 0) {
      Map<String, WeakReference<View>> map = paramMap1;
      if (paramMap1 == null)
        map = new HashMap<String, WeakReference<View>>(); 
      paramMap1 = paramMap2;
      if (paramMap2 == null)
        paramMap1 = new HashMap<String, WeakReference<View>>(); 
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      hashMap.putAll(map);
      hashMap.putAll(paramMap1);
      Iterator<String> iterator = jSONObject.keys();
      while (iterator.hasNext()) {
        String str = iterator.next();
        JSONArray jSONArray = jSONObject.optJSONArray(str);
        if (jSONArray != null) {
          Object<?> object;
          WeakReference<WeakReference> weakReference = (WeakReference)hashMap.get(str);
          if (weakReference == null)
            return false; 
          weakReference = weakReference.get();
          if (weakReference == null)
            return false; 
          Class<?> clazz2 = weakReference.getClass();
          x<Boolean> x1 = m0.x1;
          Class<?> clazz1 = clazz2;
          if (((Boolean)er2.e().<Boolean>c(x1)).booleanValue()) {
            clazz1 = clazz2;
            if (str.equals("3010")) {
              object = (Object<?>)q();
              if (object == null)
                return false; 
              object = (Object<?>)object.getClass();
            } 
          } 
          try {
            ArrayList arrayList = new ArrayList();
            this();
            h0.c(jSONArray, arrayList);
            q.c();
            boolean bool = h1.t(this.f.getClassLoader(), (Class)object, arrayList);
            if (!bool)
              return false; 
          } catch (JSONException jSONException) {}
        } 
      } 
    } 
    return true;
  }
  
  public final void B0() {
    this.k = true;
  }
  
  public final void G0(i5 parami5) {}
  
  public final void R0(ys2 paramys2) {
    cm.i("Mute This Ad is not supported for 3rd party ads");
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener) {
    try {
      a a = b.a2(paramView);
      this.l = s(paramMap1, paramMap2);
      paramMap1 = (Map)r(paramMap1);
      paramMap2 = (Map)r(paramMap2);
      fc fc1 = this.c;
      if (fc1 != null) {
        fc1.N(a, b.a2(paramMap1), b.a2(paramMap2));
        return;
      } 
      zb zb1 = this.a;
      if (zb1 != null) {
        zb1.N(a, b.a2(paramMap1), b.a2(paramMap2));
        this.a.x0(a);
        return;
      } 
      ac ac1 = this.b;
      if (ac1 != null) {
        ac1.N(a, b.a2(paramMap1), b.a2(paramMap2));
        this.b.x0(a);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.d("Failed to call trackView", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void c(View paramView) {}
  
  public final void d(View paramView, Map<String, WeakReference<View>> paramMap) {
    try {
      a a = b.a2(paramView);
      fc fc1 = this.c;
      if (fc1 != null) {
        fc1.F(a);
        return;
      } 
      zb zb1 = this.a;
      if (zb1 != null) {
        zb1.F(a);
        return;
      } 
      ac ac1 = this.b;
      if (ac1 != null)
        ac1.F(a); 
      return;
    } catch (RemoteException remoteException) {
      cm.d("Failed to call untrackView", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void destroy() {}
  
  public final void e(Bundle paramBundle) {}
  
  public final void f(View paramView1, MotionEvent paramMotionEvent, View paramView2) {}
  
  public final void g(View paramView1, View paramView2, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean) {
    if (this.k && this.g.G)
      return; 
    p(paramView1);
  }
  
  public final void h(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2) {
    try {
      boolean bool = this.j;
      if (!bool && this.g.B != null)
        this.j = bool | q.m().c(this.f, this.h.b, this.g.B.toString(), this.i.f); 
      if (!this.l)
        return; 
      fc fc1 = this.c;
      if (fc1 != null && !fc1.M()) {
        this.c.q();
        this.d.S();
        return;
      } 
      zb zb1 = this.a;
      if (zb1 != null && !zb1.M()) {
        this.a.q();
        this.d.S();
        return;
      } 
      ac ac1 = this.b;
      if (ac1 != null && !ac1.M()) {
        this.b.q();
        this.d.S();
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.d("Failed to call recordImpression", (Throwable)remoteException);
      return;
    } 
  }
  
  public final JSONObject i(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2) {
    return null;
  }
  
  public final void j(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean) {
    if (!this.k) {
      cm.i("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
      return;
    } 
    if (!this.g.G) {
      cm.i("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
      return;
    } 
    p(paramView);
  }
  
  public final void k() {}
  
  public final void l() {}
  
  public final void m() {
    cm.i("Mute This Ad is not supported for 3rd party ads");
  }
  
  public final boolean n(Bundle paramBundle) {
    return false;
  }
  
  public final boolean n1() {
    return this.g.G;
  }
  
  public final void o(String paramString) {}
  
  public final void o0(us2 paramus2) {
    cm.i("Mute This Ad is not supported for 3rd party ads");
  }
  
  public final void r0() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ph0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */