package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.q;
import com.google.android.gms.ads.internal.util.s0;

public final class h9 {
  private final Object a = new Object();
  
  private final Context b;
  
  private final String c;
  
  private final zzazn d;
  
  private q<u8> e;
  
  private q<u8> f;
  
  private z9 g;
  
  private int h = 1;
  
  private h9(Context paramContext, zzazn paramzzazn, String paramString) {
    this.c = paramString;
    this.b = paramContext.getApplicationContext();
    this.d = paramzzazn;
    this.e = new w9<u8>();
    this.f = new w9<u8>();
  }
  
  public h9(Context paramContext, zzazn paramzzazn, String paramString, q<u8> paramq1, q<u8> paramq2) {
    this(paramContext, paramzzazn, paramString);
    this.e = paramq1;
    this.f = paramq2;
  }
  
  protected final z9 c(p12 paramp12) {
    z9 z91 = new z9(this.f);
    fm.e.execute(new g9(this, paramp12, z91));
    z91.d(new r9(this, z91), new u9(this, z91));
    return z91;
  }
  
  public final v9 h(p12 paramp12) {
    synchronized (this.a) {
      synchronized (this.a) {
        z9 z91 = this.g;
        if (z91 != null && this.h == 0) {
          k9 k9 = new k9();
          this(this);
          z91.d(k9, j9.a);
        } 
        null = this.g;
        if (null == null || null.a() == -1) {
          this.h = 2;
          null = c(null);
          this.g = (z9)null;
          null = null.g();
          return (v9)null;
        } 
        int i = this.h;
        if (i == 0) {
          null = this.g.g();
          return (v9)null;
        } 
        if (i == 1) {
          this.h = 2;
          c(null);
          null = this.g.g();
          return (v9)null;
        } 
        if (i == 2) {
          null = this.g.g();
          return (v9)null;
        } 
        null = this.g.g();
        return (v9)null;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */