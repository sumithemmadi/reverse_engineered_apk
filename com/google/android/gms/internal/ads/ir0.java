package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;
import java.io.InputStream;

public abstract class ir0 implements d.a, d.b {
  protected final sm<InputStream> a = new sm<InputStream>();
  
  protected final Object b = new Object();
  
  protected boolean c = false;
  
  protected boolean d = false;
  
  protected zzatq e;
  
  protected cg f;
  
  public void Y0(int paramInt) {
    cm.e("Cannot connect to remote service, fallback to local instance.");
  }
  
  protected final void a() {
    synchronized (this.b) {
      this.d = true;
      if (this.f.c() || this.f.g())
        this.f.a(); 
      Binder.flushPendingCommands();
      return;
    } 
  }
  
  public void i1(ConnectionResult paramConnectionResult) {
    cm.e("Disconnected from remote ad request service.");
    this.a.d(new zzcoc(zzdom.b));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ir0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */