package com.google.android.gms.internal.ads;

public final class eb2 extends kb2 {
  private final ga2 i;
  
  private long j;
  
  public eb2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2, ga2 paramga2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 53);
    this.i = paramga2;
    if (paramga2 != null)
      this.j = paramga2.e(); 
  }
  
  protected final void a() {
    if (this.i != null)
      this.e.k0(((Long)this.f.invoke(null, new Object[] { Long.valueOf(this.j) })).longValue()); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/eb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */