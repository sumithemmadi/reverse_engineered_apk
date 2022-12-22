package com.google.android.gms.internal.ads;

public final class kv0<DelegateT, AdapterT> implements hv0<AdapterT> {
  private final hv0<DelegateT> a;
  
  private final kq1<DelegateT, AdapterT> b;
  
  public kv0(hv0<DelegateT> paramhv0, kq1<DelegateT, AdapterT> paramkq1) {
    this.a = paramhv0;
    this.b = paramkq1;
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    return this.a.a(paramci1, paramnh1);
  }
  
  public final ot1<AdapterT> b(ci1 paramci1, nh1 paramnh1) {
    return dt1.j(this.a.b(paramci1, paramnh1), this.b, fm.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */