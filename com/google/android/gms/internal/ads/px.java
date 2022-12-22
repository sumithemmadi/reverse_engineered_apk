package com.google.android.gms.internal.ads;

public final class px {
  private final pm1 a;
  
  private final jo0 b;
  
  private final ci1 c;
  
  public px(jo0 paramjo0, ci1 paramci1, pm1 parampm1) {
    this.a = parampm1;
    this.b = paramjo0;
    this.c = paramci1;
  }
  
  private static String b(int paramInt) {
    paramInt = sx.a[paramInt - 1];
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? ((paramInt != 5) ? "u" : "cb") : "ac") : "cc") : "h") : "bb";
  }
  
  public final void a(long paramLong, int paramInt) {
    x<Boolean> x = m0.c6;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      this.a.b(rm1.d("ad_closed").b(this.c.b.b).i("show_time", String.valueOf(paramLong)).i("ad_format", "app_open_ad").i("acr", b(paramInt)));
      return;
    } 
    this.b.b().a(this.c.b.b).h("action", "ad_closed").h("show_time", String.valueOf(paramLong)).h("ad_format", "app_open_ad").h("acr", b(paramInt)).c();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/px.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */