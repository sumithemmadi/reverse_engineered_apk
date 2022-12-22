package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

public final class bh {
  private WeakHashMap<Context, dh> a = new WeakHashMap<Context, dh>();
  
  public final Future<yg> b(Context paramContext) {
    return fm.a.a(new ah(this, paramContext));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */