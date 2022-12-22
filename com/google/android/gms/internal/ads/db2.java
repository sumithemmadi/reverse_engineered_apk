package com.google.android.gms.internal.ads;

public final class db2 extends kb2 {
  private final boolean i;
  
  public db2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 61);
    this.i = paramz92.q();
  }
  
  protected final void a() {
    long l = ((Long)this.f.invoke(null, new Object[] { this.b.a(), Boolean.valueOf(this.i) })).longValue();
    synchronized (this.e) {
      this.e.n0(l);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/db2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */