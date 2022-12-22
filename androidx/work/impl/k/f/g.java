package androidx.work.impl.k.f;

import android.content.Context;
import androidx.work.impl.utils.j.a;

public class g {
  private static g a;
  
  private a b;
  
  private b c;
  
  private e d;
  
  private f e;
  
  private g(Context paramContext, a parama) {
    paramContext = paramContext.getApplicationContext();
    this.b = new a(paramContext, parama);
    this.c = new b(paramContext, parama);
    this.d = new e(paramContext, parama);
    this.e = new f(paramContext, parama);
  }
  
  public static g c(Context paramContext, a parama) {
    // Byte code:
    //   0: ldc androidx/work/impl/k/f/g
    //   2: monitorenter
    //   3: getstatic androidx/work/impl/k/f/g.a : Landroidx/work/impl/k/f/g;
    //   6: ifnonnull -> 23
    //   9: new androidx/work/impl/k/f/g
    //   12: astore_2
    //   13: aload_2
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial <init> : (Landroid/content/Context;Landroidx/work/impl/utils/j/a;)V
    //   19: aload_2
    //   20: putstatic androidx/work/impl/k/f/g.a : Landroidx/work/impl/k/f/g;
    //   23: getstatic androidx/work/impl/k/f/g.a : Landroidx/work/impl/k/f/g;
    //   26: astore_0
    //   27: ldc androidx/work/impl/k/f/g
    //   29: monitorexit
    //   30: aload_0
    //   31: areturn
    //   32: astore_0
    //   33: ldc androidx/work/impl/k/f/g
    //   35: monitorexit
    //   36: aload_0
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   3	23	32	finally
    //   23	27	32	finally
  }
  
  public a a() {
    return this.b;
  }
  
  public b b() {
    return this.c;
  }
  
  public e d() {
    return this.d;
  }
  
  public f e() {
    return this.e;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */