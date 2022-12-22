package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;

final class do1 implements d.a, d.b {
  private final xo1 a;
  
  private final zzdua b;
  
  private final Object c = new Object();
  
  private boolean d = false;
  
  private boolean e = false;
  
  do1(Context paramContext, Looper paramLooper, zzdua paramzzdua) {
    this.b = paramzzdua;
    this.a = new xo1(paramContext, paramLooper, this, this, 12800000);
  }
  
  private final void a() {
    synchronized (this.c) {
      if (this.a.c() || this.a.g())
        this.a.a(); 
      Binder.flushPendingCommands();
      return;
    } 
  }
  
  public final void Y0(int paramInt) {}
  
  final void b() {
    synchronized (this.c) {
      if (!this.d) {
        this.d = true;
        this.a.s();
      } 
      return;
    } 
  }
  
  public final void i1(ConnectionResult paramConnectionResult) {}
  
  public final void o1(Bundle paramBundle) {
    synchronized (this.c) {
      if (this.e)
        return; 
      this.e = true;
      try {
        cp1 cp1 = this.a.i0();
        zzduf zzduf = new zzduf();
        this(this.b.g());
        cp1.p9(zzduf);
      } catch (Exception exception) {
      
      } finally {
        a();
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/do1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */