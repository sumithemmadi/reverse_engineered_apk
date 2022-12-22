package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.v.a;
import java.io.IOException;

public final class ta2 extends kb2 {
  public ta2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 24);
  }
  
  private final void c() {
    a a = this.b.D();
    if (a == null)
      return; 
    try {
      a.a a1 = a.c();
      String str = ea2.e(a1.a());
      if (str != null)
        synchronized (this.e) {
          this.e.F(str);
          this.e.Y(a1.b());
          this.e.W(zzcf$zza.zzc.g);
          return;
        }  
    } catch (IOException iOException) {}
  }
  
  protected final void a() {
    if (this.b.v()) {
      c();
      return;
    } 
    synchronized (this.e) {
      this.e.F((String)this.f.invoke(null, new Object[] { this.b.a() }));
      return;
    } 
  }
  
  public final Void b() {
    if (this.b.b())
      return super.b(); 
    if (this.b.v())
      c(); 
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ta2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */