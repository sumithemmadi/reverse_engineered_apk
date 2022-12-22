package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;

class FragmentStateAdapter$5 implements f {
  public void c(h paramh, Lifecycle.Event paramEvent) {
    if (paramEvent == Lifecycle.Event.ON_DESTROY) {
      this.b.removeCallbacks(this.c);
      paramh.a().c((g)this);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager2/adapter/FragmentStateAdapter$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */