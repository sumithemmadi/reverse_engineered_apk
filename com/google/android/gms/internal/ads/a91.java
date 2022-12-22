package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class a91 implements a92<t81> {
  private final m92<nt1> a;
  
  private final m92<ScheduledExecutorService> b;
  
  private final m92<String> c;
  
  private final m92<k11> d;
  
  private final m92<Context> e;
  
  private final m92<gi1> f;
  
  private final m92<i11> g;
  
  private a91(m92<nt1> paramm92, m92<ScheduledExecutorService> paramm921, m92<String> paramm922, m92<k11> paramm923, m92<Context> paramm924, m92<gi1> paramm925, m92<i11> paramm926) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
    this.d = paramm923;
    this.e = paramm924;
    this.f = paramm925;
    this.g = paramm926;
  }
  
  public static a91 a(m92<nt1> paramm92, m92<ScheduledExecutorService> paramm921, m92<String> paramm922, m92<k11> paramm923, m92<Context> paramm924, m92<gi1> paramm925, m92<i11> paramm926) {
    return new a91(paramm92, paramm921, paramm922, paramm923, paramm924, paramm925, paramm926);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */