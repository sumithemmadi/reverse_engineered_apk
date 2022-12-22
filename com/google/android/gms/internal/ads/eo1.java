package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

public final class eo1 {
  private final Context a;
  
  private final Looper b;
  
  public eo1(Context paramContext, Looper paramLooper) {
    this.a = paramContext;
    this.b = paramLooper;
  }
  
  public final void a(String paramString) {
    zzdua zzdua = (zzdua)zzdua.O().z(this.a.getPackageName()).y(zzdua.zza.c).x(zzdtt.M().y(paramString).x(zzdtt.zza.c)).h();
    (new do1(this.a, this.b, zzdua)).b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/eo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */