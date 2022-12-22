package androidx.activity.result;

import androidx.activity.result.e.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import androidx.lifecycle.h;

class ActivityResultRegistry$1 implements f {
  public void c(h paramh, Lifecycle.Event paramEvent) {
    if (Lifecycle.Event.ON_START.equals(paramEvent)) {
      this.e.f.put(this.b, new c.b(this.c, this.d));
      if (this.e.g.containsKey(this.b)) {
        paramh = (h)this.e.g.get(this.b);
        this.e.g.remove(this.b);
        this.c.a(paramh);
      } 
      ActivityResult activityResult = (ActivityResult)this.e.h.getParcelable(this.b);
      if (activityResult != null) {
        this.e.h.remove(this.b);
        this.c.a(this.d.c(activityResult.b(), activityResult.a()));
      } 
    } else if (Lifecycle.Event.ON_STOP.equals(paramEvent)) {
      this.e.f.remove(this.b);
    } else if (Lifecycle.Event.ON_DESTROY.equals(paramEvent)) {
      this.e.k(this.b);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/result/ActivityResultRegistry$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */