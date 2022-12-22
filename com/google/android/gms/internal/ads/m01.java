package com.google.android.gms.internal.ads;

public final class m01<AdT, AdapterT, ListenerT extends v50> implements a92<i01<AdT, AdapterT, ListenerT>> {
  private final m92<am1> a;
  
  private final m92<nt1> b;
  
  private final m92<lv0<AdapterT, ListenerT>> c;
  
  private final m92<ov0<AdT, AdapterT, ListenerT>> d;
  
  private m01(m92<am1> paramm92, m92<nt1> paramm921, m92<lv0<AdapterT, ListenerT>> paramm922, m92<ov0<AdT, AdapterT, ListenerT>> paramm923) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
    this.d = paramm923;
  }
  
  public static <AdT, AdapterT, ListenerT extends v50> m01<AdT, AdapterT, ListenerT> a(m92<am1> paramm92, m92<nt1> paramm921, m92<lv0<AdapterT, ListenerT>> paramm922, m92<ov0<AdT, AdapterT, ListenerT>> paramm923) {
    return new m01<AdT, AdapterT, ListenerT>(paramm92, paramm921, paramm922, paramm923);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */