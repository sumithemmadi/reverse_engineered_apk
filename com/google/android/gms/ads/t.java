package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.nt2;
import com.google.android.gms.internal.ads.ot2;
import com.google.android.gms.internal.ads.r;

public final class t {
  private final Object a = new Object();
  
  private nt2 b;
  
  private a c;
  
  public final void a(a parama) {
    com.google.android.gms.common.internal.t.k(parama, "VideoLifecycleCallbacks may not be null.");
    synchronized (this.a) {
      this.c = parama;
      nt2 nt21 = this.b;
      if (nt21 == null)
        return; 
      try {
        r r = new r();
        this(parama);
        nt21.P2((ot2)r);
      } catch (RemoteException remoteException) {
        cm.c("Unable to call setVideoLifecycleCallbacks on video controller.", (Throwable)remoteException);
      } 
      return;
    } 
  }
  
  public final void b(nt2 paramnt2) {
    synchronized (this.a) {
      this.b = paramnt2;
      a a1 = this.c;
      if (a1 != null)
        a(a1); 
      return;
    } 
  }
  
  public final nt2 c() {
    synchronized (this.a) {
      return this.b;
    } 
  }
  
  public static class a {
    public void a() {}
    
    public void b(boolean param1Boolean) {}
    
    public void c() {}
    
    public void d() {}
    
    public void e() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */