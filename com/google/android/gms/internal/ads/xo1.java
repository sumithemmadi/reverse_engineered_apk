package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.internal.d;

public final class xo1 extends c<cp1> {
  private final int E;
  
  public xo1(Context paramContext, Looper paramLooper, d.a parama, d.b paramb, int paramInt) {
    super(paramContext, paramLooper, 116, parama, paramb, null);
    this.E = paramInt;
  }
  
  public final cp1 i0() {
    return (cp1)C();
  }
  
  protected final String l() {
    return "com.google.android.gms.gass.internal.IGassService";
  }
  
  public final int o() {
    return this.E;
  }
  
  protected final String r() {
    return "com.google.android.gms.gass.START";
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */