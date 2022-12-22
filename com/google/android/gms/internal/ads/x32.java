package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

final class x32 implements w72 {
  private final zzekl a;
  
  private x32(zzekl paramzzekl) {
    paramzzekl = m42.<zzekl>d(paramzzekl, "output");
    this.a = paramzzekl;
    paramzzekl.c = this;
  }
  
  public static x32 P(zzekl paramzzekl) {
    x32 x321 = paramzzekl.c;
    return (x321 != null) ? x321 : new x32(paramzzekl);
  }
  
  public final void A(int paramInt, List<Long> paramList, boolean paramBoolean) {
    byte b = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      b = 0;
      paramInt = 0;
      while (b < paramList.size()) {
        paramInt += zzekl.U(((Long)paramList.get(b)).longValue());
        b++;
      } 
      this.a.b0(paramInt);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.Q(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (b < paramList.size()) {
      this.a.w0(paramInt, ((Long)paramList.get(b)).longValue());
      b++;
    } 
  }
  
  public final void B(int paramInt1, int paramInt2) {
    this.a.m(paramInt1, paramInt2);
  }
  
  public final void C(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += zzekl.T(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      } 
      this.a.b0(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.P(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.s0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    } 
  }
  
  public final void D(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += zzekl.h0(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      } 
      this.a.b0(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.c0(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.m(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    } 
  }
  
  public final void E(int paramInt1, int paramInt2) {
    this.a.n(paramInt1, paramInt2);
  }
  
  public final void F(int paramInt) {
    this.a.b(paramInt, 3);
  }
  
  public final void G(int paramInt, List<Double> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += zzekl.L(((Double)paramList.get(paramInt)).doubleValue());
        paramInt++;
      } 
      this.a.b0(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.K(((Double)paramList.get(paramInt)).doubleValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.A(paramInt, ((Double)paramList.get(i)).doubleValue());
      i++;
    } 
  }
  
  public final int H() {
    return v72.a;
  }
  
  public final void I(int paramInt, List<?> paramList, o62 paramo62) {
    for (byte b = 0; b < paramList.size(); b++)
      f(paramInt, paramList.get(b), paramo62); 
  }
  
  public final void J(int paramInt, List<zzejr> paramList) {
    for (byte b = 0; b < paramList.size(); b++)
      this.a.g(paramInt, paramList.get(b)); 
  }
  
  public final void K(int paramInt1, int paramInt2) {
    this.a.k(paramInt1, paramInt2);
  }
  
  public final void L(int paramInt, List<Float> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += zzekl.Y(((Float)paramList.get(paramInt)).floatValue());
        paramInt++;
      } 
      this.a.b0(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.O(((Float)paramList.get(paramInt)).floatValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.f(paramInt, ((Float)paramList.get(i)).floatValue());
      i++;
    } 
  }
  
  public final void M(int paramInt1, int paramInt2) {
    this.a.n(paramInt1, paramInt2);
  }
  
  public final void N(int paramInt, List<String> paramList) {
    boolean bool = paramList instanceof b52;
    byte b1 = 0;
    byte b2 = 0;
    if (bool) {
      b52 b52 = (b52)paramList;
      for (b1 = b2; b1 < paramList.size(); b1++) {
        Object object = b52.u(b1);
        if (object instanceof String) {
          this.a.t0(paramInt, (String)object);
        } else {
          this.a.g(paramInt, (zzejr)object);
        } 
      } 
      return;
    } 
    while (b1 < paramList.size()) {
      this.a.t0(paramInt, paramList.get(b1));
      b1++;
    } 
  }
  
  public final void O(int paramInt1, int paramInt2) {
    this.a.l(paramInt1, paramInt2);
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramObject instanceof zzejr) {
      this.a.B(paramInt, (zzejr)paramObject);
      return;
    } 
    this.a.h(paramInt, (u52)paramObject);
  }
  
  public final void b(int paramInt, long paramLong) {
    this.a.w0(paramInt, paramLong);
  }
  
  public final void c(int paramInt, List<Boolean> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += zzekl.G(((Boolean)paramList.get(paramInt)).booleanValue());
        paramInt++;
      } 
      this.a.b0(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.F(((Boolean)paramList.get(paramInt)).booleanValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.k0(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    } 
  }
  
  public final void d(int paramInt, double paramDouble) {
    this.a.A(paramInt, paramDouble);
  }
  
  public final void e(int paramInt, String paramString) {
    this.a.t0(paramInt, paramString);
  }
  
  public final void f(int paramInt, Object paramObject, o62<Object> paramo62) {
    zzekl zzekl1 = this.a;
    paramObject = paramObject;
    zzekl1.b(paramInt, 3);
    paramo62.b(paramObject, zzekl1.c);
    zzekl1.b(paramInt, 4);
  }
  
  public final void g(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    byte b = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      b = 0;
      paramInt = 0;
      while (b < paramList.size()) {
        paramInt += zzekl.f0(((Integer)paramList.get(b)).intValue());
        b++;
      } 
      this.a.b0(paramInt);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.a0(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (b < paramList.size()) {
      this.a.k(paramInt, ((Integer)paramList.get(b)).intValue());
      b++;
    } 
  }
  
  public final void h(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    byte b = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      b = 0;
      paramInt = 0;
      while (b < paramList.size()) {
        paramInt += zzekl.m0(((Integer)paramList.get(b)).intValue());
        b++;
      } 
      this.a.b0(paramInt);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.a0(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (b < paramList.size()) {
      this.a.k(paramInt, ((Integer)paramList.get(b)).intValue());
      b++;
    } 
  }
  
  public final void i(int paramInt, List<?> paramList, o62 paramo62) {
    for (byte b = 0; b < paramList.size(); b++)
      k(paramInt, paramList.get(b), paramo62); 
  }
  
  public final void j(int paramInt, long paramLong) {
    this.a.x0(paramInt, paramLong);
  }
  
  public final void k(int paramInt, Object paramObject, o62 paramo62) {
    this.a.i(paramInt, (u52)paramObject, paramo62);
  }
  
  public final <K, V> void l(int paramInt, m52<K, V> paramm52, Map<K, V> paramMap) {
    for (Map.Entry<K, V> entry : paramMap.entrySet()) {
      this.a.b(paramInt, 2);
      this.a.b0(n52.a(paramm52, (K)entry.getKey(), (V)entry.getValue()));
      n52.b(this.a, paramm52, (K)entry.getKey(), (V)entry.getValue());
    } 
  }
  
  public final void m(int paramInt, List<Long> paramList, boolean paramBoolean) {
    byte b = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      b = 0;
      paramInt = 0;
      while (b < paramList.size()) {
        paramInt += zzekl.S(((Long)paramList.get(b)).longValue());
        b++;
      } 
      this.a.b0(paramInt);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.P(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (b < paramList.size()) {
      this.a.s0(paramInt, ((Long)paramList.get(b)).longValue());
      b++;
    } 
  }
  
  public final void n(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += zzekl.W(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      } 
      this.a.b0(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.R(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.x0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    } 
  }
  
  public final void o(int paramInt, long paramLong) {
    this.a.s0(paramInt, paramLong);
  }
  
  public final void p(int paramInt) {
    this.a.b(paramInt, 4);
  }
  
  public final void q(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    byte b = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      b = 0;
      paramInt = 0;
      while (b < paramList.size()) {
        paramInt += zzekl.i0(((Integer)paramList.get(b)).intValue());
        b++;
      } 
      this.a.b0(paramInt);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.d0(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (b < paramList.size()) {
      this.a.n(paramInt, ((Integer)paramList.get(b)).intValue());
      b++;
    } 
  }
  
  public final void r(int paramInt, boolean paramBoolean) {
    this.a.k0(paramInt, paramBoolean);
  }
  
  public final void s(int paramInt, long paramLong) {
    this.a.s0(paramInt, paramLong);
  }
  
  public final void t(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += zzekl.g0(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      } 
      this.a.b0(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.b0(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.l(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    } 
  }
  
  public final void u(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    byte b = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      b = 0;
      paramInt = 0;
      while (b < paramList.size()) {
        paramInt += zzekl.l0(((Integer)paramList.get(b)).intValue());
        b++;
      } 
      this.a.b0(paramInt);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.d0(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (b < paramList.size()) {
      this.a.n(paramInt, ((Integer)paramList.get(b)).intValue());
      b++;
    } 
  }
  
  public final void v(int paramInt, long paramLong) {
    this.a.x0(paramInt, paramLong);
  }
  
  public final void w(int paramInt, float paramFloat) {
    this.a.f(paramInt, paramFloat);
  }
  
  public final void x(int paramInt, List<Long> paramList, boolean paramBoolean) {
    byte b = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.b(paramInt, 2);
      b = 0;
      paramInt = 0;
      while (b < paramList.size()) {
        paramInt += zzekl.V(((Long)paramList.get(b)).longValue());
        b++;
      } 
      this.a.b0(paramInt);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.R(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (b < paramList.size()) {
      this.a.x0(paramInt, ((Long)paramList.get(b)).longValue());
      b++;
    } 
  }
  
  public final void y(int paramInt1, int paramInt2) {
    this.a.k(paramInt1, paramInt2);
  }
  
  public final void z(int paramInt, zzejr paramzzejr) {
    this.a.g(paramInt, paramzzejr);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/x32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */