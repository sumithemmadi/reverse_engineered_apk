package com.google.android.gms.internal.ads;

public final class va2 extends kb2 {
  private static volatile Long i;
  
  private static final Object j = new Object();
  
  public va2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 22);
  }
  
  protected final void a() {
    if (i == null)
      synchronized (j) {
        if (i == null)
          i = (Long)this.f.invoke(null, new Object[0]); 
      }  
    synchronized (this.e) {
      this.e.R(i.longValue());
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/va2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */