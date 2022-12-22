package com.google.android.exoplayer2.util;

public final class e0 {
  private long a;
  
  private long b;
  
  private volatile long c = -9223372036854775807L;
  
  public e0(long paramLong) {
    h(paramLong);
  }
  
  public static long f(long paramLong) {
    return paramLong * 1000000L / 90000L;
  }
  
  public static long i(long paramLong) {
    return paramLong * 90000L / 1000000L;
  }
  
  public long a(long paramLong) {
    // Byte code:
    //   0: lload_1
    //   1: ldc2_w -9223372036854775807
    //   4: lcmp
    //   5: ifne -> 12
    //   8: ldc2_w -9223372036854775807
    //   11: lreturn
    //   12: aload_0
    //   13: getfield c : J
    //   16: ldc2_w -9223372036854775807
    //   19: lcmp
    //   20: ifeq -> 31
    //   23: aload_0
    //   24: lload_1
    //   25: putfield c : J
    //   28: goto -> 64
    //   31: aload_0
    //   32: getfield a : J
    //   35: lstore_3
    //   36: lload_3
    //   37: ldc2_w 9223372036854775807
    //   40: lcmp
    //   41: ifeq -> 51
    //   44: aload_0
    //   45: lload_3
    //   46: lload_1
    //   47: lsub
    //   48: putfield b : J
    //   51: aload_0
    //   52: monitorenter
    //   53: aload_0
    //   54: lload_1
    //   55: putfield c : J
    //   58: aload_0
    //   59: invokevirtual notifyAll : ()V
    //   62: aload_0
    //   63: monitorexit
    //   64: lload_1
    //   65: aload_0
    //   66: getfield b : J
    //   69: ladd
    //   70: lreturn
    //   71: astore #5
    //   73: aload_0
    //   74: monitorexit
    //   75: aload #5
    //   77: athrow
    // Exception table:
    //   from	to	target	type
    //   53	64	71	finally
    //   73	75	71	finally
  }
  
  public long b(long paramLong) {
    if (paramLong == -9223372036854775807L)
      return -9223372036854775807L; 
    long l = paramLong;
    if (this.c != -9223372036854775807L) {
      long l1 = i(this.c);
      l = (4294967296L + l1) / 8589934592L;
      long l2 = (l - 1L) * 8589934592L + paramLong;
      paramLong += l * 8589934592L;
      l = paramLong;
      if (Math.abs(l2 - l1) < Math.abs(paramLong - l1))
        l = l2; 
    } 
    return a(f(l));
  }
  
  public long c() {
    return this.a;
  }
  
  public long d() {
    long l1 = this.c;
    long l2 = -9223372036854775807L;
    if (l1 != -9223372036854775807L) {
      l2 = this.c;
      l2 = this.b + l2;
    } else {
      l1 = this.a;
      if (l1 != Long.MAX_VALUE)
        l2 = l1; 
    } 
    return l2;
  }
  
  public long e() {
    long l1 = this.a;
    long l2 = -9223372036854775807L;
    if (l1 == Long.MAX_VALUE) {
      l2 = 0L;
    } else if (this.c != -9223372036854775807L) {
      l2 = this.b;
    } 
    return l2;
  }
  
  public void g() {
    this.c = -9223372036854775807L;
  }
  
  public void h(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : J
    //   6: ldc2_w -9223372036854775807
    //   9: lcmp
    //   10: ifne -> 18
    //   13: iconst_1
    //   14: istore_3
    //   15: goto -> 20
    //   18: iconst_0
    //   19: istore_3
    //   20: iload_3
    //   21: invokestatic f : (Z)V
    //   24: aload_0
    //   25: lload_1
    //   26: putfield a : J
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: astore #4
    //   34: aload_0
    //   35: monitorexit
    //   36: aload #4
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	32	finally
    //   20	29	32	finally
  }
  
  public void j() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : J
    //   6: ldc2_w -9223372036854775807
    //   9: lcmp
    //   10: ifne -> 20
    //   13: aload_0
    //   14: invokevirtual wait : ()V
    //   17: goto -> 2
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: goto -> 31
    //   29: aload_1
    //   30: athrow
    //   31: goto -> 29
    // Exception table:
    //   from	to	target	type
    //   2	17	23	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */