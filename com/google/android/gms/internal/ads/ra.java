package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.q;

public final class ra {
  private static final q<u8> a = new qa();
  
  private static final q<u8> b = new ta();
  
  private final h9 c;
  
  public ra(Context paramContext, zzazn paramzzazn, String paramString) {
    this.c = new h9(paramContext, paramzzazn, paramString, a, b);
  }
  
  public final <I, O> ja<I, O> a(String paramString, ka<I> paramka, la<O> paramla) {
    return new sa<I, O>(this.c, paramString, paramka, paramla);
  }
  
  public final wa b() {
    return new wa(this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */