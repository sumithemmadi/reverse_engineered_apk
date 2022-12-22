package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

public final class ud0 implements m40, ua0 {
  private final zj b;
  
  private final Context c;
  
  private final yj d;
  
  private final View e;
  
  private String f;
  
  private final zzug$zza.zza g;
  
  public ud0(zj paramzj, Context paramContext, yj paramyj, View paramView, zzug$zza.zza paramzza) {
    this.b = paramzj;
    this.c = paramContext;
    this.d = paramyj;
    this.e = paramView;
    this.g = paramzza;
  }
  
  public final void H(kh paramkh, String paramString1, String paramString2) {
    if (this.d.H(this.c))
      try {
        yj yj1 = this.d;
        Context context = this.c;
        yj1.h(context, yj1.o(context), this.b.i(), paramkh.l(), paramkh.P());
        return;
      } catch (RemoteException remoteException) {
        cm.d("Remote Exception to get reward item.", (Throwable)remoteException);
      }  
  }
  
  public final void I() {}
  
  public final void K() {}
  
  public final void L() {
    View view = this.e;
    if (view != null && this.f != null)
      this.d.u(view.getContext(), this.f); 
    this.b.l(true);
  }
  
  public final void O() {}
  
  public final void Y() {
    this.b.l(false);
  }
  
  public final void a() {}
  
  public final void b() {
    String str1 = this.d.l(this.c);
    this.f = str1;
    String str2 = String.valueOf(str1);
    if (this.g == zzug$zza.zza.i) {
      str1 = "/Rewarded";
    } else {
      str1 = "/Interstitial";
    } 
    if (str1.length() != 0) {
      str1 = str2.concat(str1);
    } else {
      str1 = new String(str2);
    } 
    this.f = str1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ud0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */