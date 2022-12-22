package com.google.android.gms.internal.ads;

public final class qa2 extends kb2 {
  private long i;
  
  public qa2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, long paramLong, int paramInt1, int paramInt2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 25);
    this.i = paramLong;
  }
  
  protected final void a() {
    long l = ((Long)this.f.invoke(null, new Object[0])).longValue();
    synchronized (this.e) {
      this.e.q0(l);
      long l1 = this.i;
      if (l1 != 0L) {
        this.e.P(l - l1);
        this.e.S(this.i);
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qa2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */