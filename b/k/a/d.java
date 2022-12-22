package b.k.a;

public final class d extends b<d> {
  private e A = null;
  
  private float B = Float.MAX_VALUE;
  
  private boolean C = false;
  
  public <K> d(K paramK, c<K> paramc) {
    super(paramK, paramc);
  }
  
  private void o() {
    e e1 = this.A;
    if (e1 != null) {
      double d1 = e1.a();
      if (d1 <= this.u) {
        if (d1 >= this.v)
          return; 
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
      } 
      throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
    } 
    throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
  }
  
  public void j() {
    o();
    this.A.g(e());
    super.j();
  }
  
  boolean l(long paramLong) {
    if (this.C) {
      float f1 = this.B;
      if (f1 != Float.MAX_VALUE) {
        this.A.e(f1);
        this.B = Float.MAX_VALUE;
      } 
      this.p = this.A.a();
      this.o = 0.0F;
      this.C = false;
      return true;
    } 
    if (this.B != Float.MAX_VALUE) {
      this.A.a();
      e e1 = this.A;
      double d1 = this.p;
      double d2 = this.o;
      paramLong /= 2L;
      b.o o = e1.h(d1, d2, paramLong);
      this.A.e(this.B);
      this.B = Float.MAX_VALUE;
      o = this.A.h(o.a, o.b, paramLong);
      this.p = o.a;
      this.o = o.b;
    } else {
      b.o o = this.A.h(this.p, this.o, paramLong);
      this.p = o.a;
      this.o = o.b;
    } 
    float f = Math.max(this.p, this.v);
    this.p = f;
    f = Math.min(f, this.u);
    this.p = f;
    if (n(f, this.o)) {
      this.p = this.A.a();
      this.o = 0.0F;
      return true;
    } 
    return false;
  }
  
  public void m(float paramFloat) {
    if (f()) {
      this.B = paramFloat;
    } else {
      if (this.A == null)
        this.A = new e(paramFloat); 
      this.A.e(paramFloat);
      j();
    } 
  }
  
  boolean n(float paramFloat1, float paramFloat2) {
    return this.A.c(paramFloat1, paramFloat2);
  }
  
  public d p(e parame) {
    this.A = parame;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/k/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */