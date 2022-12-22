package com.google.android.datatransport.h;

import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.x.e;
import com.google.android.datatransport.h.y.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.p;
import e.a.a;

public final class t implements b<r> {
  private final a<a> a;
  
  private final a<a> b;
  
  private final a<e> c;
  
  private final a<l> d;
  
  private final a<p> e;
  
  public t(a<a> parama1, a<a> parama2, a<e> parama, a<l> parama3, a<p> parama4) {
    this.a = parama1;
    this.b = parama2;
    this.c = parama;
    this.d = parama3;
    this.e = parama4;
  }
  
  public static t a(a<a> parama1, a<a> parama2, a<e> parama, a<l> parama3, a<p> parama4) {
    return new t(parama1, parama2, parama, parama3, parama4);
  }
  
  public static r c(a parama1, a parama2, e parame, l paraml, p paramp) {
    return new r(parama1, parama2, parame, paraml, paramp);
  }
  
  public r b() {
    return c((a)this.a.get(), (a)this.b.get(), (e)this.c.get(), (l)this.d.get(), (p)this.e.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */