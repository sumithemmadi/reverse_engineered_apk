package com.bumptech.glide.p;

import java.util.concurrent.Executor;

public final class e {
  private static final Executor a = new a();
  
  private static final Executor b = new b();
  
  public static Executor a() {
    return b;
  }
  
  public static Executor b() {
    return a;
  }
  
  class a implements Executor {
    public void execute(Runnable param1Runnable) {
      k.t(param1Runnable);
    }
  }
  
  class b implements Executor {
    public void execute(Runnable param1Runnable) {
      param1Runnable.run();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */