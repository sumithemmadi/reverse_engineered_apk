package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.t;

public final class tn {
  private final Context a;
  
  private final eo b;
  
  private final ViewGroup c;
  
  private zzbax d;
  
  private tn(Context paramContext, ViewGroup paramViewGroup, eo parameo, zzbax paramzzbax) {
    Context context = paramContext;
    if (paramContext.getApplicationContext() != null)
      context = paramContext.getApplicationContext(); 
    this.a = context;
    this.c = paramViewGroup;
    this.b = parameo;
    this.d = null;
  }
  
  public tn(Context paramContext, ViewGroup paramViewGroup, tq paramtq) {
    this(paramContext, paramViewGroup, paramtq, null);
  }
  
  public final void a() {
    t.e("onDestroy must be called from the UI thread.");
    zzbax zzbax1 = this.d;
    if (zzbax1 != null) {
      zzbax1.j();
      this.c.removeView((View)this.d);
      this.d = null;
    } 
  }
  
  public final void b() {
    t.e("onPause must be called from the UI thread.");
    zzbax zzbax1 = this.d;
    if (zzbax1 != null)
      zzbax1.k(); 
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, bo parambo) {
    if (this.d != null)
      return; 
    u0.a(this.b.m().c(), this.b.E(), new String[] { "vpr2" });
    Context context = this.a;
    eo eo1 = this.b;
    zzbax zzbax1 = new zzbax(context, eo1, paramInt5, paramBoolean, eo1.m().c(), parambo);
    this.d = zzbax1;
    this.c.addView((View)zzbax1, 0, new ViewGroup.LayoutParams(-1, -1));
    this.d.A(paramInt1, paramInt2, paramInt3, paramInt4);
    this.b.G0(false);
  }
  
  public final zzbax d() {
    t.e("getAdVideoUnderlay must be called from the UI thread.");
    return this.d;
  }
  
  public final void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    t.e("The underlay may only be modified from the UI thread.");
    zzbax zzbax1 = this.d;
    if (zzbax1 != null)
      zzbax1.A(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */