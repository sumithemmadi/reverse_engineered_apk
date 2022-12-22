package b.h.h;

import android.graphics.Typeface;
import android.os.Handler;

class a {
  private final f.c a;
  
  private final Handler b;
  
  a(f.c paramc, Handler paramHandler) {
    this.a = paramc;
    this.b = paramHandler;
  }
  
  private void a(int paramInt) {
    f.c c1 = this.a;
    this.b.post(new b(this, c1, paramInt));
  }
  
  private void c(Typeface paramTypeface) {
    f.c c1 = this.a;
    this.b.post(new a(this, c1, paramTypeface));
  }
  
  void b(e.e parame) {
    if (parame.a()) {
      c(parame.a);
    } else {
      a(parame.b);
    } 
  }
  
  class a implements Runnable {
    a(a this$0, f.c param1c, Typeface param1Typeface) {}
    
    public void run() {
      this.b.b(this.c);
    }
  }
  
  class b implements Runnable {
    b(a this$0, f.c param1c, int param1Int) {}
    
    public void run() {
      this.b.a(this.c);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */