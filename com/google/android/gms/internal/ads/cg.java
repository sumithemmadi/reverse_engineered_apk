package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.internal.d;

public final class cg extends c<jg> {
  public cg(Context paramContext, Looper paramLooper, d.a parama, d.b paramb) {
    super(lh.a(paramContext), paramLooper, 8, parama, paramb, null);
  }
  
  public final jg i0() {
    return (jg)C();
  }
  
  protected final String l() {
    return "com.google.android.gms.ads.internal.request.IAdRequestService";
  }
  
  protected final String r() {
    return "com.google.android.gms.ads.service.START";
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */