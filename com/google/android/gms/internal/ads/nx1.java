package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

class nx1 implements yu1<uu1, uu1> {
  private static final Logger a = Logger.getLogger(nx1.class.getName());
  
  public final Class<uu1> a() {
    return uu1.class;
  }
  
  public final Class<uu1> b() {
    return uu1.class;
  }
  
  private static final class a implements uu1 {
    private final wu1<uu1> a;
    
    private final byte[] b = new byte[] { 0 };
    
    private a(wu1<uu1> param1wu1) {
      this.a = param1wu1;
    }
    
    public final byte[] a(byte[] param1ArrayOfbyte) {
      return this.a.e().c().equals(zzegx.d) ? e12.c(new byte[][] { this.a.e().d(), ((uu1)this.a.e().a()).a(e12.c(new byte[][] { param1ArrayOfbyte, this.b })) }) : e12.c(new byte[][] { this.a.e().d(), ((uu1)this.a.e().a()).a(param1ArrayOfbyte) });
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */