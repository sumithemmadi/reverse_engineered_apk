package androidx.transition;

import android.os.IBinder;

class r0 implements t0 {
  private final IBinder a;
  
  r0(IBinder paramIBinder) {
    this.a = paramIBinder;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool;
    if (paramObject instanceof r0 && ((r0)paramObject).a.equals(this.a)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */