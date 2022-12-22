package com.google.android.gms.internal.ads;

import android.content.Context;

public final class gf1 {
  public static cf1<rx, by> a(Context paramContext, lj1 paramlj1, fk1 paramfk1) {
    return c(paramContext, paramlj1, paramfk1);
  }
  
  public static cf1<fy, ly> b(Context paramContext, lj1 paramlj1, fk1 paramfk1) {
    return c(paramContext, paramlj1, paramfk1);
  }
  
  private static <AppOpenAdRequestComponent extends u30<AppOpenAd>, AppOpenAd extends p00> cf1<AppOpenAdRequestComponent, AppOpenAd> c(Context paramContext, lj1 paramlj1, fk1 paramfk1) {
    x<Integer> x = m0.j5;
    if (((Integer)er2.e().<Integer>c(x)).intValue() > 0) {
      ae1<u30<p00>, p00> ae1 = new ae1<u30<p00>, p00>();
      ek1<p00> ek1 = paramfk1.a(zzdpi.d, paramContext, paramlj1, new je1<u30<p00>, p00>(ae1));
      te1<u30<?>, Object> te1 = new te1<u30<?>, Object>(new ue1<u30<?>, Object>());
      tj1 tj1 = ek1.a;
      nt1 nt1 = fm.a;
      return new fe1<AppOpenAdRequestComponent, AppOpenAd>((cf1)te1, new ke1<AppOpenAdRequestComponent, AppOpenAd>(tj1, nt1), (jk1)ek1.b, nt1);
    } 
    return new ue1<AppOpenAdRequestComponent, AppOpenAd>();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */