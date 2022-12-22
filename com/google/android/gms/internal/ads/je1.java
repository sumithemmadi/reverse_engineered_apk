package com.google.android.gms.internal.ads;

final class je1<R extends u30<AdT>, AdT extends p00> implements mk1<AdT> {
  private final cf1<R, bk1<AdT>> a;
  
  public je1(cf1<R, bk1<AdT>> paramcf1) {
    this.a = paramcf1;
  }
  
  public final void a(Throwable paramThrowable) {}
  
  public final ot1<bk1<AdT>> b(qk1 paramqk1) {
    paramqk1 = paramqk1;
    return this.a.b(((ie1)paramqk1).b, ((ie1)paramqk1).a);
  }
  
  public final void c(bk1<AdT> parambk1) {
    parambk1.a = ((u30<AdT>)this.a.a()).a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/je1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */