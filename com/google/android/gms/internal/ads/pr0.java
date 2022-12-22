package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

public final class pr0 extends ir0 {
  private String g;
  
  private int h = qr0.a;
  
  public pr0(Context paramContext) {
    this.f = new cg(paramContext, q.q().b(), this, this);
  }
  
  public final ot1<InputStream> b(String paramString) {
    synchronized (this.b) {
      ot1<?> ot1;
      int i = this.h;
      if (i != qr0.a && i != qr0.c) {
        zzcoc zzcoc = new zzcoc();
        this(zzdom.c);
        ot1 = dt1.a(zzcoc);
        return (ot1)ot1;
      } 
      if (this.c) {
        ot1 = this.a;
        return (ot1)ot1;
      } 
      this.h = qr0.c;
      this.c = true;
      this.g = (String)ot1;
      this.f.s();
      sm<InputStream> sm = this.a;
      rr0 rr0 = new rr0();
      this(this);
      sm.a(rr0, fm.f);
      return this.a;
    } 
  }
  
  public final ot1<InputStream> c(zzatq paramzzatq) {
    synchronized (this.b) {
      int i = this.h;
      if (i != qr0.a && i != qr0.b) {
        zzcoc zzcoc = new zzcoc();
        this(zzdom.c);
        ot1 = dt1.a(zzcoc);
        return (ot1)ot1;
      } 
      if (this.c) {
        ot1 = this.a;
        return (ot1)ot1;
      } 
      this.h = qr0.b;
      this.c = true;
      this.e = (zzatq)ot1;
      this.f.s();
      ot1<?> ot1 = this.a;
      or0 or0 = new or0();
      this(this);
      ot1.a(or0, fm.f);
      ot1 = this.a;
      return (ot1)ot1;
    } 
  }
  
  public final void i1(ConnectionResult paramConnectionResult) {
    cm.e("Cannot connect to remote service, fallback to local instance.");
    this.a.d(new zzcoc(zzdom.b));
  }
  
  public final void o1(Bundle paramBundle) {
    synchronized (this.b) {
      if (!this.d) {
        this.d = true;
        try {
        
        } catch (RemoteException|IllegalArgumentException remoteException) {
          zzcoc zzcoc;
        } finally {
          Exception exception = null;
          q.g().e(exception, "RemoteUrlAndCacheKeyClientTask.onConnected");
          sm<InputStream> sm = this.a;
          zzcoc zzcoc = new zzcoc();
          this(zzdom.b);
        } 
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */