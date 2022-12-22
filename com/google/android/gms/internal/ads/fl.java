package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.d1;
import com.google.android.gms.ads.internal.util.g1;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class fl {
  private final Object a = new Object();
  
  private final g1 b;
  
  private final pl c;
  
  private boolean d;
  
  private Context e;
  
  private zzazn f;
  
  private p0 g;
  
  private Boolean h;
  
  private final AtomicInteger i;
  
  private final kl j;
  
  private final Object k;
  
  private ot1<ArrayList<String>> l;
  
  public fl() {
    g1 g11 = new g1();
    this.b = g11;
    this.c = new pl(er2.f(), (d1)g11);
    this.d = false;
    this.g = null;
    this.h = null;
    this.i = new AtomicInteger(0);
    this.j = new kl(null);
    this.k = new Object();
  }
  
  @TargetApi(16)
  private static ArrayList<String> f(Context paramContext) {
    ArrayList<String> arrayList = new ArrayList();
    try {
      PackageInfo packageInfo = c.a(paramContext).e((paramContext.getApplicationInfo()).packageName, 4096);
      if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
        byte b = 0;
        while (true) {
          String[] arrayOfString = packageInfo.requestedPermissions;
          if (b < arrayOfString.length) {
            if ((packageInfo.requestedPermissionsFlags[b] & 0x2) != 0)
              arrayList.add(arrayOfString[b]); 
            b++;
            continue;
          } 
          break;
        } 
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return arrayList;
  }
  
  public final Context a() {
    return this.e;
  }
  
  public final Resources b() {
    if (this.f.e)
      return this.e.getResources(); 
    try {
      bm.b(this.e).getResources();
      return null;
    } catch (zzazl zzazl) {
      cm.d("Cannot load resource from dynamite apk or local jar", zzazl);
      return null;
    } 
  }
  
  public final void d(Boolean paramBoolean) {
    synchronized (this.a) {
      this.h = paramBoolean;
      return;
    } 
  }
  
  public final void e(Throwable paramThrowable, String paramString) {
    wf.f(this.e, this.f).a(paramThrowable, paramString);
  }
  
  public final void h(Throwable paramThrowable, String paramString) {
    wf.f(this.e, this.f).b(paramThrowable, paramString, ((Double)o2.g.a()).floatValue());
  }
  
  @TargetApi(23)
  public final void k(Context paramContext, zzazn paramzzazn) {
    synchronized (this.a) {
      if (!this.d) {
        p0 p01;
        this.e = paramContext.getApplicationContext();
        this.f = paramzzazn;
        q.f().d(this.c);
        this.b.c(this.e);
        wf.f(this.e, this.f);
        q.l();
        if (!((Boolean)c2.c.a()).booleanValue()) {
          b1.m("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
          p01 = null;
        } else {
          p01 = new p0();
        } 
        this.g = p01;
        if (p01 != null) {
          hl hl = new hl();
          this(this);
          mm.a(hl.c(), "AppState.registerCsiReporter");
        } 
        this.d = true;
        s();
      } 
      q.c().r0(paramContext, paramzzazn.b);
      return;
    } 
  }
  
  public final p0 l() {
    synchronized (this.a) {
      return this.g;
    } 
  }
  
  public final Boolean m() {
    synchronized (this.a) {
      return this.h;
    } 
  }
  
  public final void n() {
    this.j.a();
  }
  
  public final void o() {
    this.i.incrementAndGet();
  }
  
  public final void p() {
    this.i.decrementAndGet();
  }
  
  public final int q() {
    return this.i.get();
  }
  
  public final d1 r() {
    synchronized (this.a) {
      return (d1)this.b;
    } 
  }
  
  public final ot1<ArrayList<String>> s() {
    if (o.c() && this.e != null) {
      x<Boolean> x = m0.V1;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
        synchronized (this.k) {
          ot1<ArrayList<String>> ot12 = this.l;
          if (ot12 != null)
            return ot12; 
          nt1 nt1 = fm.a;
          il il = new il();
          this(this);
          ot1<?> ot11 = nt1.a(il);
          this.l = (ot1)ot11;
          return (ot1)ot11;
        }  
    } 
    return dt1.h(new ArrayList<String>());
  }
  
  public final pl t() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */