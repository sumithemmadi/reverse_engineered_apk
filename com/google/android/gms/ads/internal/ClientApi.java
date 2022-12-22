package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.b;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.overlay.v;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.af;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.js2;
import com.google.android.gms.internal.ads.kg0;
import com.google.android.gms.internal.ads.li;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.mb;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.q3;
import com.google.android.gms.internal.ads.qc1;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.rs2;
import com.google.android.gms.internal.ads.ss;
import com.google.android.gms.internal.ads.t3;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.tk;
import com.google.android.gms.internal.ads.ur2;
import com.google.android.gms.internal.ads.v11;
import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.xr2;
import com.google.android.gms.internal.ads.zzazn;
import com.google.android.gms.internal.ads.zzvs;
import java.util.HashMap;

public class ClientApi extends js2 {
  public final ur2 L3(a parama, String paramString, mb parammb, int paramInt) {
    Context context = (Context)b.o1(parama);
    return (ur2)new v11(ss.b(context, parammb, paramInt), context, paramString);
  }
  
  public final t3 L6(a parama1, a parama2, a parama3) {
    return (t3)new kg0((View)b.o1(parama1), (HashMap)b.o1(parama2), (HashMap)b.o1(parama3));
  }
  
  public final tk M1(a parama, mb parammb, int paramInt) {
    return (tk)ss.b((Context)b.o1(parama), parammb, paramInt).x();
  }
  
  public final af M5(a parama) {
    Activity activity = (Activity)b.o1(parama);
    AdOverlayInfoParcel adOverlayInfoParcel = AdOverlayInfoParcel.p0(activity.getIntent());
    if (adOverlayInfoParcel == null)
      return (af)new t(activity); 
    int i = adOverlayInfoParcel.l;
    return (af)((i != 1) ? ((i != 2) ? ((i != 3) ? ((i != 4) ? ((i != 5) ? new t(activity) : new b(activity)) : new v(activity, adOverlayInfoParcel)) : new c(activity)) : new d(activity)) : new q(activity));
  }
  
  public final xr2 Q9(a parama, zzvs paramzzvs, String paramString, mb parammb, int paramInt) {
    Context context = (Context)b.o1(parama);
    return (xr2)ss.b(context, parammb, paramInt).s().a(context).d(paramzzvs).b(paramString).c().a();
  }
  
  public final rs2 W8(a parama) {
    return null;
  }
  
  public final li X4(a parama, String paramString, mb parammb, int paramInt) {
    Context context = (Context)b.o1(parama);
    return (li)ss.b(context, parammb, paramInt).v().c(context).a(paramString).b().b();
  }
  
  public final pf X7(a parama) {
    return null;
  }
  
  public final rh Y4(a parama, mb parammb, int paramInt) {
    Context context = (Context)b.o1(parama);
    return (rh)ss.b(context, parammb, paramInt).v().c(context).b().a();
  }
  
  public final xr2 a8(a parama, zzvs paramzzvs, String paramString, mb parammb, int paramInt) {
    Context context = (Context)b.o1(parama);
    return (xr2)ss.b(context, parammb, paramInt).n().d(context).b(paramzzvs).a(paramString).c().a();
  }
  
  public final xr2 i2(a parama, zzvs paramzzvs, String paramString, mb parammb, int paramInt) {
    Context context = (Context)b.o1(parama);
    qc1 qc1 = ss.b(context, parammb, paramInt).q().b(paramString).c(context).a();
    x x = m0.O3;
    return (xr2)((paramInt >= ((Integer)er2.e().c(x)).intValue()) ? qc1.a() : qc1.b());
  }
  
  public final te j0(a parama, mb parammb, int paramInt) {
    return (te)ss.b((Context)b.o1(parama), parammb, paramInt).y();
  }
  
  public final xr2 o5(a parama, zzvs paramzzvs, String paramString, int paramInt) {
    return (xr2)new k((Context)b.o1(parama), paramzzvs, paramString, new zzazn(204204000, paramInt, true, false));
  }
  
  public final rs2 o8(a parama, int paramInt) {
    return (rs2)ss.A((Context)b.o1(parama), paramInt).l();
  }
  
  public final q3 s5(a parama1, a parama2) {
    return (q3)new jg0((FrameLayout)b.o1(parama1), (FrameLayout)b.o1(parama2), 204204000);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/ClientApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */