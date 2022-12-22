package com.google.android.gms.internal.ads;

import java.util.List;

public final class ab2 extends kb2 {
  private List<Long> i = null;
  
  public ab2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 31);
  }
  
  protected final void a() {
    this.e.T(-1L);
    this.e.U(-1L);
    if (this.i == null)
      this.i = (List<Long>)this.f.invoke(null, new Object[] { this.b.a() }); 
    List<Long> list = this.i;
    if (list != null && list.size() == 2)
      synchronized (this.e) {
        this.e.T(((Long)this.i.get(0)).longValue());
        this.e.U(((Long)this.i.get(1)).longValue());
        return;
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ab2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */