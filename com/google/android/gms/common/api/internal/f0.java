package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c.c.a.a.c.a;
import c.c.a.a.c.c;
import c.c.a.a.c.d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.signin.internal.c;
import com.google.android.gms.signin.internal.d;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

public final class f0 extends d implements d.a, d.b {
  private static a.a<? extends d, a> b = c.c;
  
  private final Context c;
  
  private final Handler d;
  
  private final a.a<? extends d, a> e;
  
  private Set<Scope> f;
  
  private e g;
  
  private d h;
  
  private g0 i;
  
  public f0(Context paramContext, Handler paramHandler, e parame) {
    this(paramContext, paramHandler, parame, b);
  }
  
  public f0(Context paramContext, Handler paramHandler, e parame, a.a<? extends d, a> parama) {
    this.c = paramContext;
    this.d = paramHandler;
    this.g = (e)t.k(parame, "ClientSettings must not be null");
    this.f = parame.i();
    this.e = parama;
  }
  
  private final void R5(zak paramzak) {
    String str;
    ConnectionResult connectionResult = paramzak.o0();
    if (connectionResult.s0()) {
      ResolveAccountResponse resolveAccountResponse = paramzak.p0();
      ConnectionResult connectionResult1 = resolveAccountResponse.p0();
      if (!connectionResult1.s0()) {
        str = String.valueOf(connectionResult1);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 48);
        stringBuilder.append("Sign-in succeeded with resolve account failure: ");
        stringBuilder.append(str);
        Log.wtf("SignInCoordinator", stringBuilder.toString(), new Exception());
        this.i.c(connectionResult1);
        this.h.a();
        return;
      } 
      this.i.b(str.o0(), this.f);
    } else {
      this.i.c((ConnectionResult)str);
    } 
    this.h.a();
  }
  
  public final void M2(g0 paramg0) {
    d d1 = this.h;
    if (d1 != null)
      d1.a(); 
    this.g.k(Integer.valueOf(System.identityHashCode(this)));
    a.a<? extends d, a> a1 = this.e;
    Context context = this.c;
    Looper looper = this.d.getLooper();
    e e1 = this.g;
    this.h = (d)a1.a(context, looper, e1, e1.j(), this, this);
    this.i = paramg0;
    Set<Scope> set = this.f;
    if (set == null || set.isEmpty()) {
      this.d.post(new e0(this));
      return;
    } 
    this.h.b();
  }
  
  public final void T2(zak paramzak) {
    this.d.post(new h0(this, paramzak));
  }
  
  public final void Y0(int paramInt) {
    this.h.a();
  }
  
  public final void i1(ConnectionResult paramConnectionResult) {
    this.i.c(paramConnectionResult);
  }
  
  public final void j3() {
    d d1 = this.h;
    if (d1 != null)
      d1.a(); 
  }
  
  public final void o1(Bundle paramBundle) {
    this.h.f((c)this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */