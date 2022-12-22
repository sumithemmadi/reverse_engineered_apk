package com.google.android.gms.internal.ads;

public final class oa2 extends kb2 {
  public oa2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 5);
  }
  
  protected final void a() {
    this.e.H(-1L);
    this.e.I(-1L);
    null = (int[])this.f.invoke(null, new Object[] { this.b.a() });
    synchronized (this.e) {
      this.e.H(null[0]);
      this.e.I(null[1]);
      if (null[2] != Integer.MIN_VALUE)
        this.e.l0(null[2]); 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oa2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */