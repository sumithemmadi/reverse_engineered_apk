package b.k.a;

public final class e {
  double a = Math.sqrt(1500.0D);
  
  double b = 0.5D;
  
  private boolean c = false;
  
  private double d;
  
  private double e;
  
  private double f;
  
  private double g;
  
  private double h;
  
  private double i = Double.MAX_VALUE;
  
  private final b.o j = new b.o();
  
  public e() {}
  
  public e(float paramFloat) {
    this.i = paramFloat;
  }
  
  private void b() {
    if (this.c)
      return; 
    if (this.i != Double.MAX_VALUE) {
      double d = this.b;
      if (d > 1.0D) {
        double d1 = -d;
        double d2 = this.a;
        this.f = d1 * d2 + d2 * Math.sqrt(d * d - 1.0D);
        d = this.b;
        d2 = -d;
        d1 = this.a;
        this.g = d2 * d1 - d1 * Math.sqrt(d * d - 1.0D);
      } else if (d >= 0.0D && d < 1.0D) {
        this.h = this.a * Math.sqrt(1.0D - d * d);
      } 
      this.c = true;
      return;
    } 
    throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
  }
  
  public float a() {
    return (float)this.i;
  }
  
  public boolean c(float paramFloat1, float paramFloat2) {
    return (Math.abs(paramFloat2) < this.e && Math.abs(paramFloat1 - a()) < this.d);
  }
  
  public e d(float paramFloat) {
    if (paramFloat >= 0.0F) {
      this.b = paramFloat;
      this.c = false;
      return this;
    } 
    throw new IllegalArgumentException("Damping ratio must be non-negative");
  }
  
  public e e(float paramFloat) {
    this.i = paramFloat;
    return this;
  }
  
  public e f(float paramFloat) {
    if (paramFloat > 0.0F) {
      this.a = Math.sqrt(paramFloat);
      this.c = false;
      return this;
    } 
    throw new IllegalArgumentException("Spring stiffness constant must be positive.");
  }
  
  void g(double paramDouble) {
    paramDouble = Math.abs(paramDouble);
    this.d = paramDouble;
    this.e = paramDouble * 62.5D;
  }
  
  b.o h(double paramDouble1, double paramDouble2, long paramLong) {
    b();
    double d1 = paramLong;
    Double.isNaN(d1);
    d1 /= 1000.0D;
    double d2 = paramDouble1 - this.i;
    paramDouble1 = this.b;
    if (paramDouble1 > 1.0D) {
      paramDouble1 = this.g;
      double d3 = this.f;
      double d4 = d2 - (paramDouble1 * d2 - paramDouble2) / (paramDouble1 - d3);
      paramDouble2 = (d2 * paramDouble1 - paramDouble2) / (paramDouble1 - d3);
      paramDouble1 = Math.pow(Math.E, paramDouble1 * d1) * d4 + Math.pow(Math.E, this.f * d1) * paramDouble2;
      d3 = this.g;
      d2 = Math.pow(Math.E, d3 * d1);
      double d5 = this.f;
      paramDouble2 = d4 * d3 * d2 + paramDouble2 * d5 * Math.pow(Math.E, d5 * d1);
    } else if (paramDouble1 == 1.0D) {
      paramDouble1 = this.a;
      paramDouble2 += paramDouble1 * d2;
      d2 += paramDouble2 * d1;
      paramDouble1 = Math.pow(Math.E, -paramDouble1 * d1) * d2;
      double d4 = Math.pow(Math.E, -this.a * d1);
      double d5 = this.a;
      double d3 = -d5;
      paramDouble2 = paramDouble2 * Math.pow(Math.E, -d5 * d1) + d2 * d4 * d3;
    } else {
      double d3 = 1.0D / this.h;
      double d4 = this.a;
      paramDouble2 = d3 * (paramDouble1 * d4 * d2 + paramDouble2);
      paramDouble1 = Math.pow(Math.E, -paramDouble1 * d4 * d1) * (Math.cos(this.h * d1) * d2 + Math.sin(this.h * d1) * paramDouble2);
      double d5 = this.a;
      d3 = -d5;
      d4 = this.b;
      double d6 = Math.pow(Math.E, -d4 * d5 * d1);
      double d7 = this.h;
      d5 = -d7;
      d7 = Math.sin(d7 * d1);
      double d8 = this.h;
      paramDouble2 = d3 * paramDouble1 * d4 + d6 * (d5 * d2 * d7 + paramDouble2 * d8 * Math.cos(d8 * d1));
    } 
    b.o o1 = this.j;
    o1.a = (float)(paramDouble1 + this.i);
    o1.b = (float)paramDouble2;
    return o1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/k/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */