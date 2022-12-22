package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;

public final class yw implements a92<sw> {
  private final m92<wa> a;
  
  private final m92<qw> b;
  
  private final m92<Executor> c;
  
  private final m92<nw> d;
  
  private final m92<e> e;
  
  private yw(m92<wa> paramm92, m92<qw> paramm921, m92<Executor> paramm922, m92<nw> paramm923, m92<e> paramm924) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
    this.d = paramm923;
    this.e = paramm924;
  }
  
  public static yw a(m92<wa> paramm92, m92<qw> paramm921, m92<Executor> paramm922, m92<nw> paramm923, m92<e> paramm924) {
    return new yw(paramm92, paramm921, paramm922, paramm923, paramm924);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */