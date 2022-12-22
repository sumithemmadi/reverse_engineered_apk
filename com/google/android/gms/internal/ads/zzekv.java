package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

public enum zzekv {
  A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
  
  private static final zzekv[] a0;
  
  private static final Type[] b0;
  
  private final int id;
  
  private final zzelq zzips;
  
  private final zzekx zzipt;
  
  private final Class<?> zzipu;
  
  private final boolean zzipv;
  
  static {
    zzekx zzekx1 = zzekx.b;
    zzelq zzelq1 = zzelq.f;
    b = new zzekv("DOUBLE", 0, 0, zzekx1, zzelq1);
    zzelq zzelq2 = zzelq.e;
    c = new zzekv("FLOAT", 1, 1, zzekx1, zzelq2);
    zzelq zzelq3 = zzelq.d;
    d = new zzekv("INT64", 2, 2, zzekx1, zzelq3);
    e = new zzekv("UINT64", 3, 3, zzekx1, zzelq3);
    zzelq zzelq4 = zzelq.c;
    f = new zzekv("INT32", 4, 4, zzekx1, zzelq4);
    g = new zzekv("FIXED64", 5, 5, zzekx1, zzelq3);
    h = new zzekv("FIXED32", 6, 6, zzekx1, zzelq4);
    zzelq zzelq5 = zzelq.g;
    i = new zzekv("BOOL", 7, 7, zzekx1, zzelq5);
    zzelq zzelq6 = zzelq.h;
    j = new zzekv("STRING", 8, 8, zzekx1, zzelq6);
    zzelq zzelq7 = zzelq.k;
    k = new zzekv("MESSAGE", 9, 9, zzekx1, zzelq7);
    zzelq zzelq8 = zzelq.i;
    l = new zzekv("BYTES", 10, 10, zzekx1, zzelq8);
    m = new zzekv("UINT32", 11, 11, zzekx1, zzelq4);
    zzelq zzelq9 = zzelq.j;
    n = new zzekv("ENUM", 12, 12, zzekx1, zzelq9);
    o = new zzekv("SFIXED32", 13, 13, zzekx1, zzelq4);
    p = new zzekv("SFIXED64", 14, 14, zzekx1, zzelq3);
    q = new zzekv("SINT32", 15, 15, zzekx1, zzelq4);
    r = new zzekv("SINT64", 16, 16, zzekx1, zzelq3);
    s = new zzekv("GROUP", 17, 17, zzekx1, zzelq7);
    zzekx1 = zzekx.c;
    t = new zzekv("DOUBLE_LIST", 18, 18, zzekx1, zzelq1);
    u = new zzekv("FLOAT_LIST", 19, 19, zzekx1, zzelq2);
    v = new zzekv("INT64_LIST", 20, 20, zzekx1, zzelq3);
    w = new zzekv("UINT64_LIST", 21, 21, zzekx1, zzelq3);
    x = new zzekv("INT32_LIST", 22, 22, zzekx1, zzelq4);
    y = new zzekv("FIXED64_LIST", 23, 23, zzekx1, zzelq3);
    z = new zzekv("FIXED32_LIST", 24, 24, zzekx1, zzelq4);
    A = new zzekv("BOOL_LIST", 25, 25, zzekx1, zzelq5);
    B = new zzekv("STRING_LIST", 26, 26, zzekx1, zzelq6);
    C = new zzekv("MESSAGE_LIST", 27, 27, zzekx1, zzelq7);
    D = new zzekv("BYTES_LIST", 28, 28, zzekx1, zzelq8);
    E = new zzekv("UINT32_LIST", 29, 29, zzekx1, zzelq4);
    F = new zzekv("ENUM_LIST", 30, 30, zzekx1, zzelq9);
    G = new zzekv("SFIXED32_LIST", 31, 31, zzekx1, zzelq4);
    H = new zzekv("SFIXED64_LIST", 32, 32, zzekx1, zzelq3);
    I = new zzekv("SINT32_LIST", 33, 33, zzekx1, zzelq4);
    J = new zzekv("SINT64_LIST", 34, 34, zzekx1, zzelq3);
    zzekx zzekx2 = zzekx.d;
    K = new zzekv("DOUBLE_LIST_PACKED", 35, 35, zzekx2, zzelq1);
    L = new zzekv("FLOAT_LIST_PACKED", 36, 36, zzekx2, zzelq2);
    M = new zzekv("INT64_LIST_PACKED", 37, 37, zzekx2, zzelq3);
    N = new zzekv("UINT64_LIST_PACKED", 38, 38, zzekx2, zzelq3);
    O = new zzekv("INT32_LIST_PACKED", 39, 39, zzekx2, zzelq4);
    P = new zzekv("FIXED64_LIST_PACKED", 40, 40, zzekx2, zzelq3);
    Q = new zzekv("FIXED32_LIST_PACKED", 41, 41, zzekx2, zzelq4);
    R = new zzekv("BOOL_LIST_PACKED", 42, 42, zzekx2, zzelq5);
    S = new zzekv("UINT32_LIST_PACKED", 43, 43, zzekx2, zzelq4);
    T = new zzekv("ENUM_LIST_PACKED", 44, 44, zzekx2, zzelq9);
    U = new zzekv("SFIXED32_LIST_PACKED", 45, 45, zzekx2, zzelq4);
    zzelq2 = zzelq.d;
    V = new zzekv("SFIXED64_LIST_PACKED", 46, 46, zzekx2, zzelq2);
    W = new zzekv("SINT32_LIST_PACKED", 47, 47, zzekx2, zzelq.c);
    X = new zzekv("SINT64_LIST_PACKED", 48, 48, zzekx2, zzelq2);
    Y = new zzekv("GROUP_LIST", 49, 49, zzekx1, zzelq7);
    Z = new zzekv("MAP", 50, 50, zzekx.e, zzelq.b);
    zzekv zzekv1 = b;
    byte b = 0;
    c0 = new zzekv[] { 
        zzekv1, c, d, e, f, g, h, i, j, k, 
        l, m, n, o, p, q, r, s, t, u, 
        v, w, x, y, z, A, B, C, D, E, 
        F, G, H, I, J, K, L, M, N, O, 
        P, Q, R, S, T, U, V, W, X, Y, 
        Z };
    b0 = new Type[0];
    zzekv[] arrayOfZzekv = values();
    a0 = new zzekv[arrayOfZzekv.length];
    int i = arrayOfZzekv.length;
    while (b < i) {
      zzekv1 = arrayOfZzekv[b];
      a0[zzekv1.id] = zzekv1;
      b++;
    } 
  }
  
  zzekv(int paramInt1, zzekx paramzzekx, zzelq paramzzelq) {
    this.id = paramInt1;
    this.zzipt = paramzzekx;
    this.zzips = paramzzelq;
    this$enum$index = g42.a[paramzzekx.ordinal()];
    boolean bool = true;
    if (this$enum$index != 1) {
      if (this$enum$index != 2) {
        this.zzipu = null;
      } else {
        this.zzipu = paramzzelq.zzbjk();
      } 
    } else {
      this.zzipu = paramzzelq.zzbjk();
    } 
    if (paramzzekx == zzekx.b) {
      this$enum$index = g42.b[paramzzelq.ordinal()];
      if (this$enum$index != 1 && this$enum$index != 2 && this$enum$index != 3) {
        this.zzipv = bool;
        return;
      } 
    } 
    bool = false;
    this.zzipv = bool;
  }
  
  public final int id() {
    return this.id;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzekv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */