package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Future;

public final class qn2 {
  private in2 a;
  
  private boolean b;
  
  private final Context c;
  
  private final Object d = new Object();
  
  qn2(Context paramContext) {
    this.c = paramContext;
  }
  
  private final void a() {
    synchronized (this.d) {
      in2 in21 = this.a;
      if (in21 == null)
        return; 
      in21.a();
      this.a = null;
      Binder.flushPendingCommands();
      return;
    } 
  }
  
  final Future<yn2> g(zzth paramzzth) {
    null = new pn2(this);
    sn2 sn2 = new sn2(this, paramzzth, null);
    wn2 wn2 = new wn2(this, null);
    synchronized (this.d) {
      in2 in21 = new in2();
      this(this.c, q.q().b(), sn2, wn2);
      this.a = in21;
      in21.s();
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */