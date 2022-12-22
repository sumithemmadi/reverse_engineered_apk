package com.google.android.gms.measurement.internal;

abstract class n5 extends m5 {
  private boolean b;
  
  n5(s4 params4) {
    super(params4);
    this.a.o();
  }
  
  protected abstract boolean i();
  
  protected void j() {}
  
  final boolean k() {
    return this.b;
  }
  
  protected final void l() {
    if (k())
      return; 
    throw new IllegalStateException("Not initialized");
  }
  
  public final void m() {
    if (!this.b) {
      if (!i()) {
        this.a.p();
        this.b = true;
      } 
      return;
    } 
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public final void n() {
    if (!this.b) {
      j();
      this.a.p();
      this.b = true;
      return;
    } 
    throw new IllegalStateException("Can't initialize twice");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/n5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */