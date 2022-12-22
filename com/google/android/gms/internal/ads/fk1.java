package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

public final class fk1 {
  private HashMap<zzdpi, ek1<? extends p00>> a = new HashMap<zzdpi, ek1<? extends p00>>();
  
  public final <AdT extends p00> ek1<AdT> a(zzdpi paramzzdpi, Context paramContext, lj1 paramlj1, mk1<AdT> parammk1) {
    ek1<p00> ek11 = (ek1)this.a.get(paramzzdpi);
    ek1<p00> ek12 = ek11;
    if (ek11 == null) {
      sj1 sj1 = new sj1(zzdpf.o0(paramzzdpi, paramContext));
      ek12 = new ek1<p00>(sj1, new jk1<p00>(sj1, paramlj1, parammk1));
      this.a.put(paramzzdpi, ek12);
    } 
    return (ek1)ek12;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */