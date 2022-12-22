package com.google.android.datatransport.h;

import com.google.android.datatransport.b;
import com.google.android.datatransport.c;
import com.google.android.datatransport.d;
import com.google.android.datatransport.e;
import com.google.android.datatransport.g;

final class p<T> implements e<T> {
  private final m a;
  
  private final String b;
  
  private final b c;
  
  private final d<T, byte[]> d;
  
  private final q e;
  
  p(m paramm, String paramString, b paramb, d<T, byte[]> paramd, q paramq) {
    this.a = paramm;
    this.b = paramString;
    this.c = paramb;
    this.d = paramd;
    this.e = paramq;
  }
  
  public void a(c<T> paramc) {
    b(paramc, o.b());
  }
  
  public void b(c<T> paramc, g paramg) {
    this.e.a(l.a().e(this.a).c(paramc).f(this.b).d(this.d).b(this.c).a(), paramg);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */