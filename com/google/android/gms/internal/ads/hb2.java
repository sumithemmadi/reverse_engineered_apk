package com.google.android.gms.internal.ads;

public final class hb2 extends kb2 {
  private static volatile Long i;
  
  private static final Object j = new Object();
  
  public hb2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 33);
  }
  
  protected final void a() {
    if (i == null)
      synchronized (j) {
        if (i == null)
          i = (Long)this.f.invoke(null, new Object[0]); 
      }  
    synchronized (this.e) {
      this.e.V(i.longValue());
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */