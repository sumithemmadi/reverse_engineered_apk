package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;

public final class b {
  private final c a;
  
  private final SavedStateRegistry b;
  
  private b(c paramc) {
    this.a = paramc;
    this.b = new SavedStateRegistry();
  }
  
  public static b a(c paramc) {
    return new b(paramc);
  }
  
  public SavedStateRegistry b() {
    return this.b;
  }
  
  public void c(Bundle paramBundle) {
    Lifecycle lifecycle = this.a.a();
    if (lifecycle.b() == Lifecycle.State.c) {
      lifecycle.a((g)new Recreator(this.a));
      this.b.b(lifecycle, paramBundle);
      return;
    } 
    throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
  }
  
  public void d(Bundle paramBundle) {
    this.b.c(paramBundle);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/savedstate/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */