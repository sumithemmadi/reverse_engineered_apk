package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;

public final class jb2 extends kb2 {
  private final View i;
  
  public jb2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2, View paramView) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 57);
    this.i = paramView;
  }
  
  protected final void a() {
    if (this.i != null) {
      x<Boolean> x = m0.e2;
      Boolean bool = er2.e().<Boolean>c(x);
      DisplayMetrics displayMetrics = this.b.a().getResources().getDisplayMetrics();
      ha2 ha2 = new ha2((String)this.f.invoke(null, new Object[] { this.i, displayMetrics, bool }));
      zzcf$zza.c.a a = zzcf$zza.c.K();
      a.x(ha2.b.longValue()).y(ha2.c.longValue()).z(ha2.d.longValue());
      if (bool.booleanValue())
        a.A(ha2.e.longValue()); 
      this.e.X((zzcf$zza.c)a.h());
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */