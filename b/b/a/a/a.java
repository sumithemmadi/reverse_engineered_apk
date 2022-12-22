package b.b.a.a;

import java.util.concurrent.Executor;

public class a extends c {
  private static volatile a a;
  
  private static final Executor b = new a();
  
  private static final Executor c = new b();
  
  private c d;
  
  private c e;
  
  private a() {
    b b = new b();
    this.e = b;
    this.d = b;
  }
  
  public static Executor d() {
    return c;
  }
  
  public static a e() {
    // Byte code:
    //   0: getstatic b/b/a/a/a.a : Lb/b/a/a/a;
    //   3: ifnull -> 10
    //   6: getstatic b/b/a/a/a.a : Lb/b/a/a/a;
    //   9: areturn
    //   10: ldc b/b/a/a/a
    //   12: monitorenter
    //   13: getstatic b/b/a/a/a.a : Lb/b/a/a/a;
    //   16: ifnonnull -> 31
    //   19: new b/b/a/a/a
    //   22: astore_0
    //   23: aload_0
    //   24: invokespecial <init> : ()V
    //   27: aload_0
    //   28: putstatic b/b/a/a/a.a : Lb/b/a/a/a;
    //   31: ldc b/b/a/a/a
    //   33: monitorexit
    //   34: getstatic b/b/a/a/a.a : Lb/b/a/a/a;
    //   37: areturn
    //   38: astore_0
    //   39: ldc b/b/a/a/a
    //   41: monitorexit
    //   42: aload_0
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   13	31	38	finally
    //   31	34	38	finally
    //   39	42	38	finally
  }
  
  public void a(Runnable paramRunnable) {
    this.d.a(paramRunnable);
  }
  
  public boolean b() {
    return this.d.b();
  }
  
  public void c(Runnable paramRunnable) {
    this.d.c(paramRunnable);
  }
  
  static final class a implements Executor {
    public void execute(Runnable param1Runnable) {
      a.e().c(param1Runnable);
    }
  }
  
  static final class b implements Executor {
    public void execute(Runnable param1Runnable) {
      a.e().a(param1Runnable);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/b/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */