package com.google.android.gms.internal.auth_api;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.b.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.h;

public final class g extends h<j> {
  private final a.a H;
  
  public g(Context paramContext, Looper paramLooper, e parame, a.a parama, d.a parama1, d.b paramb) {
    super(paramContext, paramLooper, 68, parame, parama1, paramb);
    a.a a1 = parama;
    if (parama == null)
      a1 = a.a.b; 
    this.H = (new a.a.a(a1)).a(b.a()).b();
  }
  
  protected final String l() {
    return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
  }
  
  public final int o() {
    return 12800000;
  }
  
  protected final String r() {
    return "com.google.android.gms.auth.api.credentials.service.START";
  }
  
  protected final Bundle z() {
    return this.H.a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth_api/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */