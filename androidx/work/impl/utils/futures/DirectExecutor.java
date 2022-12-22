package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

enum DirectExecutor implements Executor {
  b;
  
  static {
    DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
    b = directExecutor;
    c = new DirectExecutor[] { directExecutor };
  }
  
  public void execute(Runnable paramRunnable) {
    paramRunnable.run();
  }
  
  public String toString() {
    return "DirectExecutor";
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/futures/DirectExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */