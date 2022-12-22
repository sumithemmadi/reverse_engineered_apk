package com.google.android.datatransport.h.x.j;

import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.y.a;
import e.a.a;

public final class c0 implements b<b0> {
  private final a<a> a;
  
  private final a<a> b;
  
  private final a<d> c;
  
  private final a<h0> d;
  
  public c0(a<a> parama1, a<a> parama2, a<d> parama, a<h0> parama3) {
    this.a = parama1;
    this.b = parama2;
    this.c = parama;
    this.d = parama3;
  }
  
  public static c0 a(a<a> parama1, a<a> parama2, a<d> parama, a<h0> parama3) {
    return new c0(parama1, parama2, parama, parama3);
  }
  
  public static b0 c(a parama1, a parama2, Object paramObject1, Object paramObject2) {
    return new b0(parama1, parama2, (d)paramObject1, (h0)paramObject2);
  }
  
  public b0 b() {
    return c((a)this.a.get(), (a)this.b.get(), this.c.get(), this.d.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/j/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */