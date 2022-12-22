package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class zs0 implements a92<is0> {
  private final m92<Context> a;
  
  private final m92<Executor> b;
  
  private final m92<hh> c;
  
  private final m92<wv> d;
  
  private final m92<eh> e;
  
  private final m92<HashMap<String, ys0>> f;
  
  private zs0(m92<Context> paramm92, m92<Executor> paramm921, m92<hh> paramm922, m92<wv> paramm923, m92<eh> paramm924, m92<HashMap<String, ys0>> paramm925) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
    this.d = paramm923;
    this.e = paramm924;
    this.f = paramm925;
  }
  
  public static zs0 a(m92<Context> paramm92, m92<Executor> paramm921, m92<hh> paramm922, m92<wv> paramm923, m92<eh> paramm924, m92<HashMap<String, ys0>> paramm925) {
    return new zs0(paramm92, paramm921, paramm922, paramm923, paramm924, paramm925);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zs0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */