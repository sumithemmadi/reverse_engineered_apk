package com.google.android.gms.measurement.internal;

abstract class c4 extends b3 {
  private boolean b;
  
  c4(s4 params4) {
    super(params4);
    this.a.o();
  }
  
  final boolean i() {
    return this.b;
  }
  
  protected final void j() {
    if (i())
      return; 
    throw new IllegalStateException("Not initialized");
  }
  
  public final void k() {
    if (!this.b) {
      if (!m()) {
        this.a.p();
        this.b = true;
      } 
      return;
    } 
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public final void l() {
    if (!this.b) {
      n();
      this.a.p();
      this.b = true;
      return;
    } 
    throw new IllegalStateException("Can't initialize twice");
  }
  
  protected abstract boolean m();
  
  protected void n() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/c4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */