package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class ka2 extends kb2 {
  public ka2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 49);
  }
  
  protected final void a() {
    this.e.u0(zzcq.d);
    try {
      zzcq zzcq;
      boolean bool = ((Boolean)this.f.invoke(null, new Object[] { this.b.a() })).booleanValue();
      zzcf$zza.a a = this.e;
      if (bool) {
        zzcq = zzcq.c;
      } else {
        zzcq = zzcq.b;
      } 
      a.u0(zzcq);
      return;
    } catch (InvocationTargetException invocationTargetException) {
      if (invocationTargetException.getTargetException() instanceof android.provider.Settings.SettingNotFoundException)
        return; 
      throw invocationTargetException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ka2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */