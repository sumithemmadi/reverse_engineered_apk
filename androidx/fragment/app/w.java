package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import androidx.savedstate.c;

class w implements c, u {
  private final Fragment b;
  
  private final t c;
  
  private i d = null;
  
  private b e = null;
  
  w(Fragment paramFragment, t paramt) {
    this.b = paramFragment;
    this.c = paramt;
  }
  
  public Lifecycle a() {
    d();
    return (Lifecycle)this.d;
  }
  
  void b(Lifecycle.Event paramEvent) {
    this.d.h(paramEvent);
  }
  
  void d() {
    if (this.d == null) {
      this.d = new i((h)this);
      this.e = b.a(this);
    } 
  }
  
  boolean e() {
    boolean bool;
    if (this.d != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void f(Bundle paramBundle) {
    this.e.c(paramBundle);
  }
  
  void g(Bundle paramBundle) {
    this.e.d(paramBundle);
  }
  
  public t h() {
    d();
    return this.c;
  }
  
  void i(Lifecycle.State paramState) {
    this.d.o(paramState);
  }
  
  public SavedStateRegistry j() {
    d();
    return this.e.b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */