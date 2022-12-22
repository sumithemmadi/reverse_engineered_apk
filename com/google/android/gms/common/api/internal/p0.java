package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.internal.base.e;
import java.util.concurrent.atomic.AtomicReference;

public abstract class p0 extends LifecycleCallback implements DialogInterface.OnCancelListener {
  protected volatile boolean c;
  
  protected final AtomicReference<r0> d = new AtomicReference<r0>(null);
  
  private final Handler e = (Handler)new e(Looper.getMainLooper());
  
  protected final b f;
  
  protected p0(h paramh) {
    this(paramh, b.n());
  }
  
  private p0(h paramh, b paramb) {
    super(paramh);
    this.f = paramb;
  }
  
  private static int l(r0 paramr0) {
    return (paramr0 == null) ? -1 : paramr0.b();
  }
  
  public void e(int paramInt1, int paramInt2, Intent paramIntent) {
    r0 r0 = this.d.get();
    int i = 1;
    boolean bool = true;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        r0 r01 = r0;
      } else {
        i = this.f.g((Context)b());
        if (i == 0) {
          paramInt2 = bool;
        } else {
          paramInt2 = 0;
        } 
        if (r0 == null)
          return; 
        r0 r01 = r0;
        paramInt1 = paramInt2;
        if (r0.a().o0() == 18) {
          r01 = r0;
          paramInt1 = paramInt2;
          if (i == 18)
            return; 
        } 
        if (paramInt1 != 0) {
          p();
          return;
        } 
      } 
    } else {
      if (paramInt2 == -1) {
        r0 r01 = r0;
        paramInt1 = i;
      } else {
        r0 r01 = r0;
        if (paramInt2 == 0) {
          paramInt1 = 13;
          if (paramIntent != null)
            paramInt1 = paramIntent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13); 
          r01 = new r0(new ConnectionResult(paramInt1, null, r0.a().toString()), l(r0));
          this.d.set(r01);
        } 
        paramInt1 = 0;
      } 
      if (paramInt1 != 0) {
        p();
        return;
      } 
    } 
    paramInt1 = 0;
  }
  
  public void f(Bundle paramBundle) {
    super.f(paramBundle);
    if (paramBundle != null) {
      AtomicReference<r0> atomicReference = this.d;
      if (paramBundle.getBoolean("resolving_error", false)) {
        r0 r0 = new r0(new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution")), paramBundle.getInt("failed_client_id", -1));
      } else {
        paramBundle = null;
      } 
      atomicReference.set(paramBundle);
    } 
  }
  
  public void i(Bundle paramBundle) {
    super.i(paramBundle);
    r0 r0 = this.d.get();
    if (r0 != null) {
      paramBundle.putBoolean("resolving_error", true);
      paramBundle.putInt("failed_client_id", r0.b());
      paramBundle.putInt("failed_status", r0.a().o0());
      paramBundle.putParcelable("failed_resolution", (Parcelable)r0.a().q0());
    } 
  }
  
  public void j() {
    super.j();
    this.c = true;
  }
  
  public void k() {
    super.k();
    this.c = false;
  }
  
  protected abstract void m(ConnectionResult paramConnectionResult, int paramInt);
  
  public final void n(ConnectionResult paramConnectionResult, int paramInt) {
    r0 r0 = new r0(paramConnectionResult, paramInt);
    if (this.d.compareAndSet(null, r0))
      this.e.post(new q0(this, r0)); 
  }
  
  protected abstract void o();
  
  public void onCancel(DialogInterface paramDialogInterface) {
    m(new ConnectionResult(13, null), l(this.d.get()));
    p();
  }
  
  protected final void p() {
    this.d.set(null);
    o();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */