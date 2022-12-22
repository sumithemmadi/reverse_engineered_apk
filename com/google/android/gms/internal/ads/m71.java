package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

public final class m71 implements a92<k71> {
  private final m92<nt1> a;
  
  private final m92<ViewGroup> b;
  
  private final m92<Context> c;
  
  private final m92<Set<String>> d;
  
  private m71(m92<nt1> paramm92, m92<ViewGroup> paramm921, m92<Context> paramm922, m92<Set<String>> paramm923) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
    this.d = paramm923;
  }
  
  public static m71 a(m92<nt1> paramm92, m92<ViewGroup> paramm921, m92<Context> paramm922, m92<Set<String>> paramm923) {
    return new m71(paramm92, paramm921, paramm922, paramm923);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */