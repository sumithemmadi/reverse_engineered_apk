package com.google.android.gms.internal.ads;

public final class za2 extends kb2 {
  private static volatile String i;
  
  private static final Object j = new Object();
  
  public za2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 1);
  }
  
  protected final void a() {
    this.e.x("E");
    if (i == null)
      synchronized (j) {
        if (i == null)
          i = (String)this.f.invoke(null, new Object[0]); 
      }  
    synchronized (this.e) {
      this.e.x(i);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/za2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */