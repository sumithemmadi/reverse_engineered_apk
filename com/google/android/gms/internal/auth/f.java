package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.b.b;
import com.google.android.gms.auth.b.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.h;

public final class f extends h<g> {
  private final Bundle H;
  
  public f(Context paramContext, Looper paramLooper, e parame, c paramc, d.a parama, d.b paramb) {
    super(paramContext, paramLooper, 16, parame, parama, paramb);
    if (paramc == null) {
      this.H = new Bundle();
      return;
    } 
    throw new NoSuchMethodError();
  }
  
  protected final String l() {
    return "com.google.android.gms.auth.api.internal.IAuthService";
  }
  
  public final int o() {
    return 12451000;
  }
  
  public final boolean q() {
    e e = i0();
    return (!TextUtils.isEmpty(e.b()) && !e.e(b.c).isEmpty());
  }
  
  protected final String r() {
    return "com.google.android.gms.auth.service.START";
  }
  
  protected final Bundle z() {
    return this.H;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */