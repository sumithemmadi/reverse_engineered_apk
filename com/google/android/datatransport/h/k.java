package com.google.android.datatransport.h;

import com.google.android.datatransport.h.v.a;
import java.util.concurrent.Executor;

class k implements Executor {
  private final Executor b;
  
  k(Executor paramExecutor) {
    this.b = paramExecutor;
  }
  
  public void execute(Runnable paramRunnable) {
    this.b.execute(new a(paramRunnable));
  }
  
  static class a implements Runnable {
    private final Runnable b;
    
    a(Runnable param1Runnable) {
      this.b = param1Runnable;
    }
    
    public void run() {
      try {
        this.b.run();
      } catch (Exception exception) {
        a.c("Executor", "Background execution failure.", exception);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */