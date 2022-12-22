package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

public final class lk2 {
  private final Handler a;
  
  private final mk2 b;
  
  public lk2(Handler paramHandler, mk2 parammk2) {
    if (parammk2 != null) {
      paramHandler = jj2.<Handler>d(paramHandler);
    } else {
      paramHandler = null;
    } 
    this.a = paramHandler;
    this.b = parammk2;
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    if (this.b != null)
      this.a.post(new sk2(this, paramInt1, paramInt2, paramInt3, paramFloat)); 
  }
  
  public final void c(Surface paramSurface) {
    if (this.b != null)
      this.a.post(new rk2(this, paramSurface)); 
  }
  
  public final void d(ae2 paramae2) {
    if (this.b != null)
      this.a.post(new ok2(this, paramae2)); 
  }
  
  public final void e(String paramString, long paramLong1, long paramLong2) {
    if (this.b != null)
      this.a.post(new nk2(this, paramString, paramLong1, paramLong2)); 
  }
  
  public final void f(zzht paramzzht) {
    if (this.b != null)
      this.a.post(new qk2(this, paramzzht)); 
  }
  
  public final void g(ae2 paramae2) {
    if (this.b != null)
      this.a.post(new tk2(this, paramae2)); 
  }
  
  public final void h(int paramInt, long paramLong) {
    if (this.b != null)
      this.a.post(new pk2(this, paramInt, paramLong)); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */