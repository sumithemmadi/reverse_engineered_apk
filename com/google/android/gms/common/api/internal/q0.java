package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.b;

final class q0 implements Runnable {
  private final r0 b;
  
  q0(p0 paramp0, r0 paramr0) {
    this.b = paramr0;
  }
  
  public final void run() {
    Dialog dialog;
    if (!this.c.c)
      return; 
    ConnectionResult connectionResult = this.b.a();
    if (connectionResult.r0()) {
      p0 p01 = this.c;
      p01.b.startActivityForResult(GoogleApiActivity.b((Context)p01.b(), connectionResult.q0(), this.b.b(), false), 1);
      return;
    } 
    if (this.c.f.j(connectionResult.o0())) {
      p0 p01 = this.c;
      p01.f.w(p01.b(), this.c.b, connectionResult.o0(), 2, this.c);
      return;
    } 
    if (connectionResult.o0() == 18) {
      dialog = b.q(this.c.b(), this.c);
      p0 p01 = this.c;
      p01.f.s(p01.b().getApplicationContext(), new s0(this, dialog));
      return;
    } 
    this.c.m((ConnectionResult)dialog, this.b.b());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */