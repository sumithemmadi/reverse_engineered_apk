package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

public final class la2 extends kb2 {
  private final Activity i;
  
  private final View j;
  
  public la2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2, View paramView, Activity paramActivity) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 62);
    this.j = paramView;
    this.i = paramActivity;
  }
  
  protected final void a() {
    if (this.j == null)
      return; 
    x<Boolean> x = m0.R1;
    boolean bool = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
    null = (Object[])this.f.invoke(null, new Object[] { this.j, this.i, Boolean.valueOf(bool) });
    synchronized (this.e) {
      this.e.o0(((Long)null[0]).longValue());
      this.e.p0(((Long)null[1]).longValue());
      if (bool)
        this.e.E((String)null[2]); 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/la2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */