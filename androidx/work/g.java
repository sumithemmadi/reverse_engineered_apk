package androidx.work;

import android.os.Build;

public final class g extends l {
  g(a parama) {
    super(parama.b, parama.c, parama.d);
  }
  
  public static final class a extends l.a<a, g> {
    public a(Class<? extends ListenableWorker> param1Class) {
      super(param1Class);
      this.c.f = OverwritingInputMerger.class.getName();
    }
    
    g g() {
      if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.l.h())
        return new g(this); 
      throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
    
    a h() {
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */