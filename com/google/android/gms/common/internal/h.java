package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public abstract class h<T extends IInterface> extends d<T> implements a.f {
  private final e E;
  
  private final Set<Scope> F;
  
  private final Account G;
  
  @Deprecated
  protected h(Context paramContext, Looper paramLooper, int paramInt, e parame, d.a parama, d.b paramb) {
    this(paramContext, paramLooper, paramInt, parame, (e)parama, (j)paramb);
  }
  
  protected h(Context paramContext, Looper paramLooper, int paramInt, e parame, e parame1, j paramj) {
    this(paramContext, paramLooper, i.c(paramContext), b.n(), paramInt, parame, t.<e>j(parame1), t.<j>j(paramj));
  }
  
  protected h(Context paramContext, Looper paramLooper, i parami, b paramb, int paramInt, e parame, e parame1, j paramj) {
    super(paramContext, paramLooper, parami, (c)paramb, paramInt, k0(parame1), l0(paramj), parame.g());
    this.E = parame;
    this.G = parame.a();
    this.F = m0(parame.d());
  }
  
  private static d.a k0(e parame) {
    return (parame == null) ? null : new b0(parame);
  }
  
  private static d.b l0(j paramj) {
    return (paramj == null) ? null : new c0(paramj);
  }
  
  private final Set<Scope> m0(Set<Scope> paramSet) {
    Set<Scope> set = j0(paramSet);
    Iterator<Scope> iterator = set.iterator();
    while (iterator.hasNext()) {
      if (paramSet.contains(iterator.next()))
        continue; 
      throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
    } 
    return set;
  }
  
  protected final Set<Scope> B() {
    return this.F;
  }
  
  public Set<Scope> d() {
    return q() ? this.F : Collections.emptySet();
  }
  
  protected final e i0() {
    return this.E;
  }
  
  protected Set<Scope> j0(Set<Scope> paramSet) {
    return paramSet;
  }
  
  public int o() {
    return super.o();
  }
  
  public final Account v() {
    return this.G;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */