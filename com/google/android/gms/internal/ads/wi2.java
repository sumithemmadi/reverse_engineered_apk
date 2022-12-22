package com.google.android.gms.internal.ads;

public final class wi2 implements ri2 {
  private final boolean a;
  
  private final int b;
  
  private final byte[] c;
  
  private final si2[] d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private si2[] h;
  
  public wi2(boolean paramBoolean, int paramInt) {
    this(true, 65536, 0);
  }
  
  private wi2(boolean paramBoolean, int paramInt1, int paramInt2) {
    jj2.a(true);
    jj2.a(true);
    this.a = true;
    this.b = 65536;
    this.g = 0;
    this.h = new si2[100];
    this.c = null;
    this.d = new si2[1];
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: ifeq -> 14
    //   9: aload_0
    //   10: iconst_0
    //   11: invokevirtual b : (I)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public final void b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: aload_0
    //   4: getfield e : I
    //   7: if_icmpge -> 15
    //   10: iconst_1
    //   11: istore_2
    //   12: goto -> 17
    //   15: iconst_0
    //   16: istore_2
    //   17: aload_0
    //   18: iload_1
    //   19: putfield e : I
    //   22: iload_2
    //   23: ifeq -> 30
    //   26: aload_0
    //   27: invokevirtual f : ()V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: astore_3
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_3
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	33	finally
    //   17	22	33	finally
    //   26	30	33	finally
  }
  
  public final int c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : I
    //   6: istore_1
    //   7: aload_0
    //   8: getfield b : I
    //   11: istore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: iload_1
    //   15: iload_2
    //   16: imul
    //   17: ireturn
    //   18: astore_3
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_3
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	18	finally
  }
  
  public final void f() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: aload_0
    //   4: getfield e : I
    //   7: aload_0
    //   8: getfield b : I
    //   11: invokestatic p : (II)I
    //   14: aload_0
    //   15: getfield f : I
    //   18: isub
    //   19: invokestatic max : (II)I
    //   22: istore_1
    //   23: aload_0
    //   24: getfield g : I
    //   27: istore_2
    //   28: iload_1
    //   29: iload_2
    //   30: if_icmplt -> 36
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: aload_0
    //   37: getfield h : [Lcom/google/android/gms/internal/ads/si2;
    //   40: iload_1
    //   41: iload_2
    //   42: aconst_null
    //   43: invokestatic fill : ([Ljava/lang/Object;IILjava/lang/Object;)V
    //   46: aload_0
    //   47: iload_1
    //   48: putfield g : I
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: astore_3
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_3
    //   58: athrow
    // Exception table:
    //   from	to	target	type
    //   2	28	54	finally
    //   36	51	54	finally
  }
  
  public final void g(si2 paramsi2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : [Lcom/google/android/gms/internal/ads/si2;
    //   6: astore_2
    //   7: aload_2
    //   8: iconst_0
    //   9: aload_1
    //   10: aastore
    //   11: aload_0
    //   12: aload_2
    //   13: invokevirtual j : ([Lcom/google/android/gms/internal/ads/si2;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	19	finally
    //   11	16	19	finally
  }
  
  public final int h() {
    return this.b;
  }
  
  public final si2 i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield f : I
    //   7: iconst_1
    //   8: iadd
    //   9: putfield f : I
    //   12: aload_0
    //   13: getfield g : I
    //   16: istore_1
    //   17: iload_1
    //   18: ifle -> 45
    //   21: aload_0
    //   22: getfield h : [Lcom/google/android/gms/internal/ads/si2;
    //   25: astore_2
    //   26: iinc #1, -1
    //   29: aload_0
    //   30: iload_1
    //   31: putfield g : I
    //   34: aload_2
    //   35: iload_1
    //   36: aaload
    //   37: astore_3
    //   38: aload_2
    //   39: iload_1
    //   40: aconst_null
    //   41: aastore
    //   42: goto -> 60
    //   45: new com/google/android/gms/internal/ads/si2
    //   48: dup
    //   49: aload_0
    //   50: getfield b : I
    //   53: newarray byte
    //   55: iconst_0
    //   56: invokespecial <init> : ([BI)V
    //   59: astore_3
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_3
    //   63: areturn
    //   64: astore_3
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_3
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	64	finally
    //   21	26	64	finally
    //   29	34	64	finally
    //   45	60	64	finally
  }
  
  public final void j(si2[] paramArrayOfsi2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : I
    //   6: istore_2
    //   7: aload_1
    //   8: arraylength
    //   9: istore_3
    //   10: aload_0
    //   11: getfield h : [Lcom/google/android/gms/internal/ads/si2;
    //   14: astore #4
    //   16: iload_3
    //   17: iload_2
    //   18: iadd
    //   19: aload #4
    //   21: arraylength
    //   22: if_icmplt -> 49
    //   25: aload_0
    //   26: aload #4
    //   28: aload #4
    //   30: arraylength
    //   31: iconst_1
    //   32: ishl
    //   33: iload_2
    //   34: aload_1
    //   35: arraylength
    //   36: iadd
    //   37: invokestatic max : (II)I
    //   40: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   43: checkcast [Lcom/google/android/gms/internal/ads/si2;
    //   46: putfield h : [Lcom/google/android/gms/internal/ads/si2;
    //   49: aload_1
    //   50: arraylength
    //   51: istore_2
    //   52: iconst_0
    //   53: istore_3
    //   54: iload_3
    //   55: iload_2
    //   56: if_icmpge -> 136
    //   59: aload_1
    //   60: iload_3
    //   61: aaload
    //   62: astore #4
    //   64: aload #4
    //   66: getfield a : [B
    //   69: astore #5
    //   71: aload #5
    //   73: ifnull -> 95
    //   76: aload #5
    //   78: arraylength
    //   79: aload_0
    //   80: getfield b : I
    //   83: if_icmpne -> 89
    //   86: goto -> 95
    //   89: iconst_0
    //   90: istore #6
    //   92: goto -> 98
    //   95: iconst_1
    //   96: istore #6
    //   98: iload #6
    //   100: invokestatic a : (Z)V
    //   103: aload_0
    //   104: getfield h : [Lcom/google/android/gms/internal/ads/si2;
    //   107: astore #5
    //   109: aload_0
    //   110: getfield g : I
    //   113: istore #7
    //   115: aload_0
    //   116: iload #7
    //   118: iconst_1
    //   119: iadd
    //   120: putfield g : I
    //   123: aload #5
    //   125: iload #7
    //   127: aload #4
    //   129: aastore
    //   130: iinc #3, 1
    //   133: goto -> 54
    //   136: aload_0
    //   137: aload_0
    //   138: getfield f : I
    //   141: aload_1
    //   142: arraylength
    //   143: isub
    //   144: putfield f : I
    //   147: aload_0
    //   148: invokevirtual notifyAll : ()V
    //   151: aload_0
    //   152: monitorexit
    //   153: return
    //   154: astore_1
    //   155: aload_0
    //   156: monitorexit
    //   157: goto -> 162
    //   160: aload_1
    //   161: athrow
    //   162: goto -> 160
    // Exception table:
    //   from	to	target	type
    //   2	49	154	finally
    //   49	52	154	finally
    //   64	71	154	finally
    //   76	86	154	finally
    //   98	123	154	finally
    //   136	151	154	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */