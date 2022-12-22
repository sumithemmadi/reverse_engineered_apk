package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.b;
import com.google.android.gms.ads.r;
import com.google.android.gms.ads.y.c;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class xt2 {
  private static xt2 a;
  
  private ArrayList<b> b = new ArrayList<b>();
  
  private final Object c = new Object();
  
  private rs2 d;
  
  private boolean e = false;
  
  private boolean f = false;
  
  private c g;
  
  private r h = (new r.a()).a();
  
  private com.google.android.gms.ads.initialization.a i;
  
  private final void h(r paramr) {
    try {
      rs2 rs21 = this.d;
      zzaao zzaao = new zzaao();
      this(paramr);
      rs21.d8(zzaao);
      return;
    } catch (RemoteException remoteException) {
      cm.c("Unable to set request configuration parcel.", (Throwable)remoteException);
      return;
    } 
  }
  
  private static com.google.android.gms.ads.initialization.a l(List<zzajh> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (zzajh zzajh : paramList) {
      AdapterStatus.State state;
      String str = zzajh.b;
      if (zzajh.c) {
        state = AdapterStatus.State.c;
      } else {
        state = AdapterStatus.State.b;
      } 
      hashMap.put(str, new f8(state, zzajh.e, zzajh.d));
    } 
    return new e8((Map)hashMap);
  }
  
  private final void m(Context paramContext) {
    if (this.d == null)
      this.d = (new cr2(er2.b(), paramContext)).b(paramContext, false); 
  }
  
  public static xt2 n() {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/xt2
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/internal/ads/xt2.a : Lcom/google/android/gms/internal/ads/xt2;
    //   6: ifnonnull -> 21
    //   9: new com/google/android/gms/internal/ads/xt2
    //   12: astore_0
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: putstatic com/google/android/gms/internal/ads/xt2.a : Lcom/google/android/gms/internal/ads/xt2;
    //   21: getstatic com/google/android/gms/internal/ads/xt2.a : Lcom/google/android/gms/internal/ads/xt2;
    //   24: astore_0
    //   25: ldc com/google/android/gms/internal/ads/xt2
    //   27: monitorexit
    //   28: aload_0
    //   29: areturn
    //   30: astore_0
    //   31: ldc com/google/android/gms/internal/ads/xt2
    //   33: monitorexit
    //   34: aload_0
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   3	21	30	finally
    //   21	28	30	finally
    //   31	34	30	finally
  }
  
  public final com.google.android.gms.ads.initialization.a a() {
    synchronized (this.c) {
      boolean bool;
      if (this.d != null) {
        bool = true;
      } else {
        bool = false;
      } 
      t.n(bool, "MobileAds.initialize() must be called prior to getting initialization status.");
      try {
        com.google.android.gms.ads.initialization.a a1 = this.i;
        if (a1 != null)
          return a1; 
        a1 = l(this.d.O9());
        return a1;
      } catch (RemoteException remoteException) {
        cm.g("Unable to get Initialization status.");
        return null;
      } 
    } 
  }
  
  public final r b() {
    return this.h;
  }
  
  public final c c(Context paramContext) {
    synchronized (this.c) {
      c c1 = this.g;
      if (c1 != null)
        return c1; 
      nb nb = new nb();
      this();
      sq2 sq2 = er2.b();
      dr2 dr2 = new dr2();
      this(sq2, paramContext, nb);
      rh rh = dr2.b(paramContext, false);
      ci ci = new ci();
      this(paramContext, rh);
      this.g = ci;
      return ci;
    } 
  }
  
  public final String d() {
    synchronized (this.c) {
      boolean bool;
      if (this.d != null) {
        bool = true;
      } else {
        bool = false;
      } 
      t.n(bool, "MobileAds.initialize() must be called prior to getting version string.");
      try {
        return er1.d(this.d.j5());
      } catch (RemoteException remoteException) {
        cm.c("Unable to get version string.", (Throwable)remoteException);
        return "";
      } 
    } 
  }
  
  public final void g(Context paramContext, String paramString, b paramb) {
    synchronized (this.c) {
      if (this.e) {
        if (paramb != null)
          (n()).b.add(paramb); 
        return;
      } 
      if (this.f) {
        if (paramb != null)
          paramb.a(a()); 
        return;
      } 
      this.e = true;
      if (paramb != null)
        (n()).b.add(paramb); 
      if (paramContext != null) {
        try {
          hb.b().a(paramContext, paramString);
          m(paramContext);
          if (paramb != null) {
            rs2 rs22 = this.d;
            a a1 = new a();
            this(this, null);
            rs22.I5(a1);
          } 
          rs2 rs21 = this.d;
          nb nb = new nb();
          this();
          rs21.D8(nb);
          this.d.D();
          rs21 = this.d;
          au2 au2 = new au2();
          this(this, paramContext);
          rs21.v5(paramString, b.a2(au2));
          if (this.h.b() != -1 || this.h.c() != -1)
            h(this.h); 
          m0.a(paramContext);
          x<Boolean> x = m0.T3;
          if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue() && !d().endsWith("0")) {
            cm.g("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
            cu2 cu2 = new cu2();
            this(this);
            this.i = cu2;
            if (paramb != null) {
              Handler handler = sl.a;
              zt2 zt2 = new zt2();
              this(this, paramb);
              handler.post(zt2);
            } 
          } 
        } catch (RemoteException remoteException) {
          cm.d("MobileAdsSettingManager initialization failed", (Throwable)remoteException);
        } 
        return;
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
      this("Context cannot be null.");
      throw illegalArgumentException;
    } 
  }
  
  private final class a extends d8 {
    private a(xt2 this$0) {}
    
    public final void C8(List<zzajh> param1List) {
      xt2 xt21 = this.b;
      byte b = 0;
      xt2.j(xt21, false);
      xt2.k(this.b, true);
      com.google.android.gms.ads.initialization.a a1 = xt2.e(this.b, param1List);
      ArrayList<List<zzajh>> arrayList = xt2.f(xt2.n());
      int i = arrayList.size();
      while (b < i) {
        param1List = arrayList.get(b);
        b++;
        ((b)param1List).a(a1);
      } 
      xt2.f(xt2.n()).clear();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */