package com.google.android.gms.internal.ads;

public final class cb2 extends kb2 {
  private final StackTraceElement[] i;
  
  public cb2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2, StackTraceElement[] paramArrayOfStackTraceElement) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 45);
    this.i = paramArrayOfStackTraceElement;
  }
  
  protected final void a() {
    StackTraceElement[] arrayOfStackTraceElement = this.i;
    if (arrayOfStackTraceElement != null) {
      null = new v92((String)this.f.invoke(null, new Object[] { arrayOfStackTraceElement }));
      synchronized (this.e) {
        this.e.h0(null.b.longValue());
        if (null.c.booleanValue()) {
          zzcq zzcq;
          zzcf$zza.a a = this.e;
          if (null.d.booleanValue()) {
            zzcq = zzcq.b;
          } else {
            zzcq = zzcq.c;
          } 
          a.v0(zzcq);
        } else {
          this.e.v0(zzcq.d);
        } 
        return;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */