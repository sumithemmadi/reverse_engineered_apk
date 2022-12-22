package com.google.android.gms.internal.ads;

public final class xo implements oc2 {
  private final wi2 a = new wi2(true, 65536);
  
  private long b = 15000000L;
  
  private long c = 30000000L;
  
  private long d = 2500000L;
  
  private long e = 5000000L;
  
  private int f;
  
  private boolean g;
  
  xo() {
    this(15000, 30000, 2500L, 5000L);
  }
  
  private xo(int paramInt1, int paramInt2, long paramLong1, long paramLong2) {}
  
  private final void l(boolean paramBoolean) {
    this.f = 0;
    this.g = false;
    if (paramBoolean)
      this.a.a(); 
  }
  
  public final void a() {
    l(false);
  }
  
  public final void b() {
    l(true);
  }
  
  public final boolean c(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : J
    //   6: lstore_3
    //   7: iconst_0
    //   8: istore #5
    //   10: lload_1
    //   11: lload_3
    //   12: lcmp
    //   13: ifle -> 22
    //   16: iconst_0
    //   17: istore #6
    //   19: goto -> 40
    //   22: lload_1
    //   23: aload_0
    //   24: getfield b : J
    //   27: lcmp
    //   28: ifge -> 37
    //   31: iconst_2
    //   32: istore #6
    //   34: goto -> 40
    //   37: iconst_1
    //   38: istore #6
    //   40: aload_0
    //   41: getfield a : Lcom/google/android/gms/internal/ads/wi2;
    //   44: invokevirtual c : ()I
    //   47: aload_0
    //   48: getfield f : I
    //   51: if_icmplt -> 60
    //   54: iconst_1
    //   55: istore #7
    //   57: goto -> 63
    //   60: iconst_0
    //   61: istore #7
    //   63: iload #6
    //   65: iconst_2
    //   66: if_icmpeq -> 99
    //   69: iload #5
    //   71: istore #8
    //   73: iload #6
    //   75: iconst_1
    //   76: if_icmpne -> 102
    //   79: iload #5
    //   81: istore #8
    //   83: aload_0
    //   84: getfield g : Z
    //   87: ifeq -> 102
    //   90: iload #5
    //   92: istore #8
    //   94: iload #7
    //   96: ifne -> 102
    //   99: iconst_1
    //   100: istore #8
    //   102: aload_0
    //   103: iload #8
    //   105: putfield g : Z
    //   108: aload_0
    //   109: monitorexit
    //   110: iload #8
    //   112: ireturn
    //   113: astore #9
    //   115: aload_0
    //   116: monitorexit
    //   117: aload #9
    //   119: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	113	finally
    //   22	31	113	finally
    //   40	54	113	finally
    //   83	90	113	finally
    //   102	108	113	finally
  }
  
  public final ri2 d() {
    return this.a;
  }
  
  public final void e(pc2[] paramArrayOfpc2, ai2 paramai2, oi2 paramoi2) {
    byte b = 0;
    this.f = 0;
    while (b < paramArrayOfpc2.length) {
      if (paramoi2.a(b) != null)
        this.f += wj2.n(paramArrayOfpc2[b].n()); 
      b++;
    } 
    this.a.b(this.f);
  }
  
  public final void f() {
    l(true);
  }
  
  public final boolean g(long paramLong, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_3
    //   3: ifeq -> 15
    //   6: aload_0
    //   7: getfield e : J
    //   10: lstore #4
    //   12: goto -> 21
    //   15: aload_0
    //   16: getfield d : J
    //   19: lstore #4
    //   21: lload #4
    //   23: lconst_0
    //   24: lcmp
    //   25: ifle -> 44
    //   28: lload_1
    //   29: lload #4
    //   31: lcmp
    //   32: iflt -> 38
    //   35: goto -> 44
    //   38: iconst_0
    //   39: istore_3
    //   40: aload_0
    //   41: monitorexit
    //   42: iload_3
    //   43: ireturn
    //   44: iconst_1
    //   45: istore_3
    //   46: goto -> 40
    //   49: astore #6
    //   51: aload_0
    //   52: monitorexit
    //   53: goto -> 59
    //   56: aload #6
    //   58: athrow
    //   59: goto -> 56
    // Exception table:
    //   from	to	target	type
    //   6	12	49	finally
    //   15	21	49	finally
  }
  
  public final void h(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: i2l
    //   4: lstore_2
    //   5: aload_0
    //   6: lload_2
    //   7: ldc2_w 1000
    //   10: lmul
    //   11: putfield d : J
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore #4
    //   19: aload_0
    //   20: monitorexit
    //   21: aload #4
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   5	14	17	finally
  }
  
  public final void i(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: i2l
    //   4: lstore_2
    //   5: aload_0
    //   6: lload_2
    //   7: ldc2_w 1000
    //   10: lmul
    //   11: putfield e : J
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore #4
    //   19: aload_0
    //   20: monitorexit
    //   21: aload #4
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   5	14	17	finally
  }
  
  public final void j(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: i2l
    //   4: lstore_2
    //   5: aload_0
    //   6: lload_2
    //   7: ldc2_w 1000
    //   10: lmul
    //   11: putfield b : J
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore #4
    //   19: aload_0
    //   20: monitorexit
    //   21: aload #4
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   5	14	17	finally
  }
  
  public final void k(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: i2l
    //   4: lstore_2
    //   5: aload_0
    //   6: lload_2
    //   7: ldc2_w 1000
    //   10: lmul
    //   11: putfield c : J
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore #4
    //   19: aload_0
    //   20: monitorexit
    //   21: aload #4
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   5	14	17	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */