package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;

public final class kr0 extends ir0 {
  public kr0(Context paramContext) {
    this.f = new cg(paramContext, q.q().b(), this, this);
  }
  
  public final ot1<InputStream> b(zzatq paramzzatq) {
    synchronized (this.b) {
      sm<InputStream> sm1;
      if (this.c) {
        sm1 = this.a;
        return sm1;
      } 
      this.c = true;
      this.e = (zzatq)sm1;
      this.f.s();
      sm<InputStream> sm2 = this.a;
      nr0 nr0 = new nr0();
      this(this);
      sm2.a(nr0, fm.f);
      return this.a;
    } 
  }
  
  public final void o1(Bundle paramBundle) {
    synchronized (this.b) {
      if (!this.d) {
        this.d = true;
        try {
          jg jg = this.f.i0();
          zzatq zzatq = this.e;
          lr0 lr0 = new lr0();
          this(this);
          jg.V4(zzatq, lr0);
        } catch (RemoteException|IllegalArgumentException remoteException) {
          zzcoc zzcoc;
        } finally {
          Exception exception = null;
          q.g().e(exception, "RemoteSignalsClientTask.onConnected");
          sm<InputStream> sm = this.a;
          exception = new zzcoc();
          super(zzdom.b);
        } 
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */