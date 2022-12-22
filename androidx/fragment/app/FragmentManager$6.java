package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;

class FragmentManager$6 implements f {
  public void c(h paramh, Lifecycle.Event paramEvent) {
    if (paramEvent == Lifecycle.Event.ON_START) {
      Bundle bundle = (Bundle)FragmentManager.a(this.e).get(this.b);
      if (bundle != null) {
        this.c.a(this.b, bundle);
        this.e.q(this.b);
      } 
    } 
    if (paramEvent == Lifecycle.Event.ON_DESTROY) {
      this.d.c((g)this);
      FragmentManager.b(this.e).remove(this.b);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/FragmentManager$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */