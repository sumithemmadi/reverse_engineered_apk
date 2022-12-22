package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import b.e.a;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.gc;
import com.google.android.gms.internal.measurement.kc;
import com.google.android.gms.internal.measurement.nc;
import com.google.android.gms.internal.measurement.p9;
import com.google.android.gms.internal.measurement.pc;
import com.google.android.gms.internal.measurement.zzz;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@DynamiteApi
public class AppMeasurementDynamiteService extends gc {
  s4 b = null;
  
  private final Map<Integer, u5> c = (Map<Integer, u5>)new a();
  
  @EnsuresNonNull({"scion"})
  private final void i1() {
    if (this.b != null)
      return; 
    throw new IllegalStateException("Attempting to perform action before initialize.");
  }
  
  private final void o1(kc paramkc, String paramString) {
    i1();
    this.b.G().R(paramkc, paramString);
  }
  
  public void beginAdUnitExposure(@RecentlyNonNull String paramString, long paramLong) {
    i1();
    this.b.g().i(paramString, paramLong);
  }
  
  public void clearConditionalUserProperty(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2, @RecentlyNonNull Bundle paramBundle) {
    i1();
    this.b.F().B(paramString1, paramString2, paramBundle);
  }
  
  public void clearMeasurementEnabled(long paramLong) {
    i1();
    this.b.F().T(null);
  }
  
  public void endAdUnitExposure(@RecentlyNonNull String paramString, long paramLong) {
    i1();
    this.b.g().j(paramString, paramLong);
  }
  
  public void generateEventId(kc paramkc) {
    i1();
    long l = this.b.G().h0();
    i1();
    this.b.G().S(paramkc, l);
  }
  
  public void getAppInstanceId(kc paramkc) {
    i1();
    this.b.c().r((Runnable)new d6(this, paramkc));
  }
  
  public void getCachedAppInstanceId(kc paramkc) {
    i1();
    o1(paramkc, this.b.F().q());
  }
  
  public void getConditionalUserProperties(String paramString1, String paramString2, kc paramkc) {
    i1();
    this.b.c().r((Runnable)new x9(this, paramkc, paramString1, paramString2));
  }
  
  public void getCurrentScreenClass(kc paramkc) {
    i1();
    o1(paramkc, this.b.F().F());
  }
  
  public void getCurrentScreenName(kc paramkc) {
    i1();
    o1(paramkc, this.b.F().E());
  }
  
  public void getGmpAppId(kc paramkc) {
    i1();
    o1(paramkc, this.b.F().G());
  }
  
  public void getMaxUserProperties(String paramString, kc paramkc) {
    i1();
    this.b.F().y(paramString);
    i1();
    this.b.G().T(paramkc, 25);
  }
  
  public void getTestFlag(kc paramkc, int paramInt) {
    i1();
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt != 4)
              return; 
            this.b.G().V(paramkc, this.b.F().O().booleanValue());
            return;
          } 
          this.b.G().T(paramkc, this.b.F().R().intValue());
          return;
        } 
        u9 u9 = this.b.G();
        double d = this.b.F().S().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", d);
        try {
          paramkc.z(bundle);
          return;
        } catch (RemoteException remoteException) {
          u9.a.f().r().b("Error returning double value to wrapper", remoteException);
          return;
        } 
      } 
      this.b.G().S((kc)remoteException, this.b.F().Q().longValue());
      return;
    } 
    this.b.G().R((kc)remoteException, this.b.F().P());
  }
  
  public void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, kc paramkc) {
    i1();
    this.b.c().r((Runnable)new e8(this, paramkc, paramString1, paramString2, paramBoolean));
  }
  
  public void initForTests(@RecentlyNonNull Map paramMap) {
    i1();
  }
  
  public void initialize(a parama, zzz paramzzz, long paramLong) {
    s4 s41 = this.b;
    if (s41 == null) {
      this.b = s4.h((Context)t.j(b.o1(parama)), paramzzz, Long.valueOf(paramLong));
      return;
    } 
    s41.f().r().a("Attempting to initialize multiple times");
  }
  
  public void isDataCollectionEnabled(kc paramkc) {
    i1();
    this.b.c().r((Runnable)new y9(this, paramkc));
  }
  
  public void logEvent(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2, @RecentlyNonNull Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong) {
    i1();
    this.b.F().a0(paramString1, paramString2, paramBundle, paramBoolean1, paramBoolean2, paramLong);
  }
  
  public void logEventAndBundle(String paramString1, String paramString2, Bundle paramBundle, kc paramkc, long paramLong) {
    Bundle bundle;
    i1();
    t.f(paramString2);
    if (paramBundle != null) {
      bundle = new Bundle(paramBundle);
    } else {
      bundle = new Bundle();
    } 
    bundle.putString("_o", "app");
    zzas zzas = new zzas(paramString2, new zzaq(paramBundle), "app", paramLong);
    this.b.c().r((Runnable)new e7(this, paramkc, zzas, paramString1));
  }
  
  public void logHealthData(int paramInt, @RecentlyNonNull String paramString, @RecentlyNonNull a parama1, @RecentlyNonNull a parama2, @RecentlyNonNull a parama3) {
    Object object1;
    Object object2;
    Object object3;
    i1();
    a a1 = null;
    if (parama1 == null) {
      parama1 = null;
    } else {
      object1 = b.o1(parama1);
    } 
    if (parama2 == null) {
      parama2 = null;
    } else {
      object2 = b.o1(parama2);
    } 
    if (parama3 == null) {
      parama3 = a1;
    } else {
      object3 = b.o1(parama3);
    } 
    this.b.f().y(paramInt, true, false, paramString, object1, object2, object3);
  }
  
  public void onActivityCreated(@RecentlyNonNull a parama, @RecentlyNonNull Bundle paramBundle, long paramLong) {
    i1();
    u6 u6 = (this.b.F()).c;
    if (u6 != null) {
      this.b.F().N();
      u6.onActivityCreated((Activity)b.o1(parama), paramBundle);
    } 
  }
  
  public void onActivityDestroyed(@RecentlyNonNull a parama, long paramLong) {
    i1();
    u6 u6 = (this.b.F()).c;
    if (u6 != null) {
      this.b.F().N();
      u6.onActivityDestroyed((Activity)b.o1(parama));
    } 
  }
  
  public void onActivityPaused(@RecentlyNonNull a parama, long paramLong) {
    i1();
    u6 u6 = (this.b.F()).c;
    if (u6 != null) {
      this.b.F().N();
      u6.onActivityPaused((Activity)b.o1(parama));
    } 
  }
  
  public void onActivityResumed(@RecentlyNonNull a parama, long paramLong) {
    i1();
    u6 u6 = (this.b.F()).c;
    if (u6 != null) {
      this.b.F().N();
      u6.onActivityResumed((Activity)b.o1(parama));
    } 
  }
  
  public void onActivitySaveInstanceState(a parama, kc paramkc, long paramLong) {
    i1();
    u6 u6 = (this.b.F()).c;
    Bundle bundle = new Bundle();
    if (u6 != null) {
      this.b.F().N();
      u6.onActivitySaveInstanceState((Activity)b.o1(parama), bundle);
    } 
    try {
      paramkc.z(bundle);
      return;
    } catch (RemoteException remoteException) {
      this.b.f().r().b("Error returning bundle value to wrapper", remoteException);
      return;
    } 
  }
  
  public void onActivityStarted(@RecentlyNonNull a parama, long paramLong) {
    i1();
    if ((this.b.F()).c != null) {
      this.b.F().N();
      Activity activity = (Activity)b.o1(parama);
    } 
  }
  
  public void onActivityStopped(@RecentlyNonNull a parama, long paramLong) {
    i1();
    if ((this.b.F()).c != null) {
      this.b.F().N();
      Activity activity = (Activity)b.o1(parama);
    } 
  }
  
  public void performAction(Bundle paramBundle, kc paramkc, long paramLong) {
    i1();
    paramkc.z(null);
  }
  
  public void registerOnMeasurementEventListener(nc paramnc) {
    i1();
    synchronized (this.c) {
      aa aa;
      u5 u51 = this.c.get(Integer.valueOf(paramnc.A()));
      u5 u52 = u51;
      if (u51 == null) {
        aa = new aa();
        this(this, paramnc);
        this.c.put(Integer.valueOf(paramnc.A()), aa);
      } 
      this.b.F().w((u5)aa);
      return;
    } 
  }
  
  public void resetAnalyticsData(long paramLong) {
    i1();
    this.b.F().s(paramLong);
  }
  
  public void setConditionalUserProperty(@RecentlyNonNull Bundle paramBundle, long paramLong) {
    i1();
    if (paramBundle == null) {
      this.b.f().o().a("Conditional user property must not be null");
      return;
    } 
    this.b.F().A(paramBundle, paramLong);
  }
  
  public void setConsent(@RecentlyNonNull Bundle paramBundle, long paramLong) {
    i1();
    v6 v6 = this.b.F();
    g9.a();
    if (((m5)v6).a.z().w(null, c3.w0)) {
      p9.a();
      if (!((m5)v6).a.z().w(null, c3.H0) || TextUtils.isEmpty(((m5)v6).a.e().q())) {
        v6.U(paramBundle, 0, paramLong);
        return;
      } 
      ((m5)v6).a.f().t().a("Using developer consent only; google app id found");
      return;
    } 
  }
  
  public void setConsentThirdParty(@RecentlyNonNull Bundle paramBundle, long paramLong) {
    i1();
    v6 v6 = this.b.F();
    g9.a();
    if (((m5)v6).a.z().w(null, c3.x0))
      v6.U(paramBundle, -20, paramLong); 
  }
  
  public void setCurrentScreen(@RecentlyNonNull a parama, @RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2, long paramLong) {
    i1();
    this.b.Q().v((Activity)b.o1(parama), paramString1, paramString2);
  }
  
  public void setDataCollectionEnabled(boolean paramBoolean) {
    i1();
    v6 v6 = this.b.F();
    v6.j();
    ((m5)v6).a.c().r((Runnable)new y5(v6, paramBoolean));
  }
  
  public void setDefaultEventParameters(@RecentlyNonNull Bundle paramBundle) {
    i1();
    v6 v6 = this.b.F();
    if (paramBundle == null) {
      paramBundle = null;
    } else {
      paramBundle = new Bundle(paramBundle);
    } 
    ((m5)v6).a.c().r((Runnable)new w5(v6, paramBundle));
  }
  
  public void setEventInterceptor(nc paramnc) {
    i1();
    z9 z9 = new z9(this, paramnc);
    if (this.b.c().o()) {
      this.b.F().v((t5)z9);
      return;
    } 
    this.b.c().r((Runnable)new f9(this, z9));
  }
  
  public void setInstanceIdProvider(pc parampc) {
    i1();
  }
  
  public void setMeasurementEnabled(boolean paramBoolean, long paramLong) {
    i1();
    this.b.F().T(Boolean.valueOf(paramBoolean));
  }
  
  public void setMinimumSessionDuration(long paramLong) {
    i1();
  }
  
  public void setSessionTimeoutDuration(long paramLong) {
    i1();
    v6 v6 = this.b.F();
    ((m5)v6).a.c().r((Runnable)new a6(v6, paramLong));
  }
  
  public void setUserId(@RecentlyNonNull String paramString, long paramLong) {
    i1();
    if (this.b.z().w(null, c3.F0) && paramString != null && paramString.length() == 0) {
      this.b.f().r().a("User ID must be non-empty");
      return;
    } 
    this.b.F().d0(null, "_id", paramString, true, paramLong);
  }
  
  public void setUserProperty(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2, @RecentlyNonNull a parama, boolean paramBoolean, long paramLong) {
    i1();
    Object object = b.o1(parama);
    this.b.F().d0(paramString1, paramString2, object, paramBoolean, paramLong);
  }
  
  public void unregisterOnMeasurementEventListener(nc paramnc) {
    Map<Integer, u5> map;
    aa aa;
    i1();
    synchronized (this.c) {
      u5 u52 = this.c.remove(Integer.valueOf(paramnc.A()));
      u5 u51 = u52;
      if (u52 == null)
        aa = new aa(this, paramnc); 
      this.b.F().x((u5)aa);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/AppMeasurementDynamiteService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */