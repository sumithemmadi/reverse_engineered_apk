package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class bd2 {
  private final Handler a;
  
  private final cd2 b;
  
  public bd2(Handler paramHandler, cd2 paramcd2) {
    if (paramcd2 != null) {
      paramHandler = jj2.<Handler>d(paramHandler);
    } else {
      paramHandler = null;
    } 
    this.a = paramHandler;
    this.b = paramcd2;
  }
  
  public final void b(int paramInt, long paramLong1, long paramLong2) {
    if (this.b != null)
      this.a.post(new fd2(this, paramInt, paramLong1, paramLong2)); 
  }
  
  public final void c(ae2 paramae2) {
    if (this.b != null)
      this.a.post(new ed2(this, paramae2)); 
  }
  
  public final void d(String paramString, long paramLong1, long paramLong2) {
    if (this.b != null)
      this.a.post(new dd2(this, paramString, paramLong1, paramLong2)); 
  }
  
  public final void e(zzht paramzzht) {
    if (this.b != null)
      this.a.post(new gd2(this, paramzzht)); 
  }
  
  public final void f(ae2 paramae2) {
    if (this.b != null)
      this.a.post(new id2(this, paramae2)); 
  }
  
  public final void g(int paramInt) {
    if (this.b != null)
      this.a.post(new hd2(this, paramInt)); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */