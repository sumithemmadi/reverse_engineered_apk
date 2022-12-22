package com.google.android.gms.internal.ads;

public final class wa {
  private h9 a;
  
  private ot1<ga> b;
  
  wa(h9 paramh9) {
    this.a = paramh9;
  }
  
  private final void d() {
    if (this.b == null) {
      sm<ga> sm = new sm();
      this.b = sm;
      this.a.h(null).d(new za(sm), new ya(sm));
    } 
  }
  
  public final <I, O> db<I, O> a(String paramString, ka<I> paramka, la<O> paramla) {
    d();
    return new db<I, O>(this.b, paramString, paramka, paramla);
  }
  
  public final void b(String paramString, x6<? super ga> paramx6) {
    d();
    this.b = dt1.k(this.b, new bb(paramString, paramx6), fm.f);
  }
  
  public final void c(String paramString, x6<? super ga> paramx6) {
    this.b = dt1.j(this.b, new ab(paramString, paramx6), fm.f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */