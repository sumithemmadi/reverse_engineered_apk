package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;

public final class y<O extends a.d> extends r {
  private final c<O> c;
  
  public y(c<O> paramc) {
    super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    this.c = paramc;
  }
  
  public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.i, A>> T a(T paramT) {
    return (T)this.c.d((d)paramT);
  }
  
  public final Looper c() {
    return this.c.h();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */