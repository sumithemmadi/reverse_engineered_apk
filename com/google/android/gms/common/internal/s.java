package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;

public class s {
  private static final b a = new e0();
  
  public static <R extends com.google.android.gms.common.api.i, T> g<T> a(f<R> paramf, a<R, T> parama) {
    b b1 = a;
    h h = new h();
    paramf.a(new f0(paramf, h, parama, b1));
    return h.a();
  }
  
  public static <R extends com.google.android.gms.common.api.i> g<Void> b(f<R> paramf) {
    return a(paramf, new g0());
  }
  
  public static interface a<R extends com.google.android.gms.common.api.i, T> {
    T a(R param1R);
  }
  
  public static interface b {
    ApiException a(Status param1Status);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */