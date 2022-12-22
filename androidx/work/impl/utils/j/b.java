package androidx.work.impl.utils.j;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.f;
import java.util.concurrent.Executor;

public class b implements a {
  private final Executor a;
  
  private final Handler b = new Handler(Looper.getMainLooper());
  
  private final Executor c = new a(this);
  
  public b(Executor paramExecutor) {
    this.a = (Executor)new f(paramExecutor);
  }
  
  public Executor a() {
    return this.c;
  }
  
  public void b(Runnable paramRunnable) {
    this.a.execute(paramRunnable);
  }
  
  public Executor c() {
    return this.a;
  }
  
  public void d(Runnable paramRunnable) {
    this.b.post(paramRunnable);
  }
  
  class a implements Executor {
    a(b this$0) {}
    
    public void execute(Runnable param1Runnable) {
      this.b.d(param1Runnable);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */