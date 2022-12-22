package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.b0;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.b;

public final class in2 extends c<ln2> {
  in2(Context paramContext, Looper paramLooper, d.a parama, d.b paramb) {
    super(lh.a(paramContext), paramLooper, 123, parama, paramb, null);
  }
  
  public final ln2 i0() {
    return (ln2)C();
  }
  
  public final boolean j0() {
    Feature[] arrayOfFeature = p();
    x<Boolean> x = m0.D1;
    return (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && b.b((Object[])arrayOfFeature, b0.a));
  }
  
  protected final String l() {
    return "com.google.android.gms.ads.internal.cache.ICacheService";
  }
  
  protected final String r() {
    return "com.google.android.gms.ads.service.CACHE";
  }
  
  public final Feature[] w() {
    return b0.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/in2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */