package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.util.e;

public final class p0 {
  private final b a;
  
  private final a b;
  
  private final y0 c;
  
  private int d;
  
  private Object e;
  
  private Handler f;
  
  private int g;
  
  private long h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  public p0(a parama, b paramb, y0 paramy0, int paramInt, Handler paramHandler) {
    this.b = parama;
    this.a = paramb;
    this.c = paramy0;
    this.f = paramHandler;
    this.g = paramInt;
    this.h = -9223372036854775807L;
    this.i = true;
  }
  
  public boolean a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Z
    //   6: invokestatic f : (Z)V
    //   9: aload_0
    //   10: getfield f : Landroid/os/Handler;
    //   13: invokevirtual getLooper : ()Landroid/os/Looper;
    //   16: invokevirtual getThread : ()Ljava/lang/Thread;
    //   19: invokestatic currentThread : ()Ljava/lang/Thread;
    //   22: if_acmpeq -> 30
    //   25: iconst_1
    //   26: istore_1
    //   27: goto -> 32
    //   30: iconst_0
    //   31: istore_1
    //   32: iload_1
    //   33: invokestatic f : (Z)V
    //   36: aload_0
    //   37: getfield l : Z
    //   40: ifne -> 50
    //   43: aload_0
    //   44: invokevirtual wait : ()V
    //   47: goto -> 36
    //   50: aload_0
    //   51: getfield k : Z
    //   54: istore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: iload_1
    //   58: ireturn
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: goto -> 67
    //   65: aload_2
    //   66: athrow
    //   67: goto -> 65
    // Exception table:
    //   from	to	target	type
    //   2	25	59	finally
    //   32	36	59	finally
    //   36	47	59	finally
    //   50	55	59	finally
  }
  
  public boolean b() {
    return this.i;
  }
  
  public Handler c() {
    return this.f;
  }
  
  public Object d() {
    return this.e;
  }
  
  public long e() {
    return this.h;
  }
  
  public b f() {
    return this.a;
  }
  
  public y0 g() {
    return this.c;
  }
  
  public int h() {
    return this.d;
  }
  
  public int i() {
    return this.g;
  }
  
  public boolean j() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield m : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public void k(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: aload_0
    //   5: getfield k : Z
    //   8: ior
    //   9: putfield k : Z
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield l : Z
    //   17: aload_0
    //   18: invokevirtual notifyAll : ()V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_2
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_2
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	24	finally
  }
  
  public p0 l() {
    e.f(this.j ^ true);
    if (this.h == -9223372036854775807L)
      e.a(this.i); 
    this.j = true;
    this.b.c(this);
    return this;
  }
  
  public p0 m(Object paramObject) {
    e.f(this.j ^ true);
    this.e = paramObject;
    return this;
  }
  
  public p0 n(int paramInt) {
    e.f(this.j ^ true);
    this.d = paramInt;
    return this;
  }
  
  public static interface a {
    void c(p0 param1p0);
  }
  
  public static interface b {
    void e(int param1Int, Object param1Object);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */