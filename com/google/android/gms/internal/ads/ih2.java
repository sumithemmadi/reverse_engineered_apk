package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

public final class ih2 implements lh2, mh2 {
  private final Uri b;
  
  private final vi2 c;
  
  private final oe2 d;
  
  private final int e;
  
  private final Handler f;
  
  private final gh2 g;
  
  private final xc2 h;
  
  private final String i;
  
  private final int j;
  
  private lh2 k;
  
  private vc2 l;
  
  private boolean m;
  
  public ih2(Uri paramUri, vi2 paramvi2, oe2 paramoe2, int paramInt1, Handler paramHandler, gh2 paramgh2, String paramString, int paramInt2) {
    this.b = paramUri;
    this.c = paramvi2;
    this.d = paramoe2;
    this.e = paramInt1;
    this.f = paramHandler;
    this.g = paramgh2;
    this.i = null;
    this.j = paramInt2;
    this.h = new xc2();
  }
  
  public final kh2 a(int paramInt, ri2 paramri2) {
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.a(bool);
    return new zg2(this.b, this.c.a(), this.d.a(), this.e, this.f, this.g, this, paramri2, null, this.j);
  }
  
  public final void b(kh2 paramkh2) {
    ((zg2)paramkh2).r();
  }
  
  public final void c() {}
  
  public final void d(vc2 paramvc2, Object paramObject) {
    paramObject = this.h;
    boolean bool = false;
    if ((paramvc2.e(0, (xc2)paramObject, false)).d != -9223372036854775807L)
      bool = true; 
    if (this.m && !bool)
      return; 
    this.l = paramvc2;
    this.m = bool;
    this.k.d(paramvc2, null);
  }
  
  public final void e(bc2 parambc2, boolean paramBoolean, lh2 paramlh2) {
    this.k = paramlh2;
    zh2 zh2 = new zh2(-9223372036854775807L, false);
    this.l = zh2;
    paramlh2.d(zh2, null);
  }
  
  public final void f() {
    this.k = null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ih2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */