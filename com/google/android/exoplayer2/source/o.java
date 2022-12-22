package com.google.android.exoplayer2.source;

public class o implements c0 {
  protected final c0[] b;
  
  public o(c0[] paramArrayOfc0) {
    this.b = paramArrayOfc0;
  }
  
  public boolean r() {
    c0[] arrayOfC0 = this.b;
    int i = arrayOfC0.length;
    for (byte b = 0; b < i; b++) {
      if (arrayOfC0[b].r())
        return true; 
    } 
    return false;
  }
  
  public final long s() {
    c0[] arrayOfC0 = this.b;
    int i = arrayOfC0.length;
    byte b = 0;
    long l1;
    for (l1 = Long.MAX_VALUE; b < i; l1 = l4) {
      long l3 = arrayOfC0[b].s();
      long l4 = l1;
      if (l3 != Long.MIN_VALUE)
        l4 = Math.min(l1, l3); 
      b++;
    } 
    long l2 = l1;
    if (l1 == Long.MAX_VALUE)
      l2 = Long.MIN_VALUE; 
    return l2;
  }
  
  public boolean t(long paramLong) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: invokevirtual s : ()J
    //   6: lstore #4
    //   8: lload #4
    //   10: ldc2_w -9223372036854775808
    //   13: lcmp
    //   14: ifne -> 20
    //   17: goto -> 142
    //   20: aload_0
    //   21: getfield b : [Lcom/google/android/exoplayer2/source/c0;
    //   24: astore #6
    //   26: aload #6
    //   28: arraylength
    //   29: istore #7
    //   31: iconst_0
    //   32: istore #8
    //   34: iconst_0
    //   35: istore #9
    //   37: iload #8
    //   39: iload #7
    //   41: if_icmpge -> 125
    //   44: aload #6
    //   46: iload #8
    //   48: aaload
    //   49: astore #10
    //   51: aload #10
    //   53: invokeinterface s : ()J
    //   58: lstore #11
    //   60: lload #11
    //   62: ldc2_w -9223372036854775808
    //   65: lcmp
    //   66: ifeq -> 82
    //   69: lload #11
    //   71: lload_1
    //   72: lcmp
    //   73: ifgt -> 82
    //   76: iconst_1
    //   77: istore #13
    //   79: goto -> 85
    //   82: iconst_0
    //   83: istore #13
    //   85: lload #11
    //   87: lload #4
    //   89: lcmp
    //   90: ifeq -> 102
    //   93: iload #9
    //   95: istore #14
    //   97: iload #13
    //   99: ifeq -> 115
    //   102: iload #9
    //   104: aload #10
    //   106: lload_1
    //   107: invokeinterface t : (J)Z
    //   112: ior
    //   113: istore #14
    //   115: iinc #8, 1
    //   118: iload #14
    //   120: istore #9
    //   122: goto -> 37
    //   125: iload_3
    //   126: iload #9
    //   128: ior
    //   129: istore #15
    //   131: iload #15
    //   133: istore_3
    //   134: iload #9
    //   136: ifne -> 2
    //   139: iload #15
    //   141: istore_3
    //   142: iload_3
    //   143: ireturn
  }
  
  public final long u() {
    c0[] arrayOfC0 = this.b;
    int i = arrayOfC0.length;
    byte b = 0;
    long l1;
    for (l1 = Long.MAX_VALUE; b < i; l1 = l4) {
      long l3 = arrayOfC0[b].u();
      long l4 = l1;
      if (l3 != Long.MIN_VALUE)
        l4 = Math.min(l1, l3); 
      b++;
    } 
    long l2 = l1;
    if (l1 == Long.MAX_VALUE)
      l2 = Long.MIN_VALUE; 
    return l2;
  }
  
  public final void v(long paramLong) {
    c0[] arrayOfC0 = this.b;
    int i = arrayOfC0.length;
    for (byte b = 0; b < i; b++)
      arrayOfC0[b].v(paramLong); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */