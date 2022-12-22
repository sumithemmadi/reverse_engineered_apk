package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.e;

public final class m implements e {
  private final boolean a;
  
  private final int b;
  
  private final byte[] c;
  
  private final d[] d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private d[] h;
  
  public m(boolean paramBoolean, int paramInt) {
    this(paramBoolean, paramInt, 0);
  }
  
  public m(boolean paramBoolean, int paramInt1, int paramInt2) {
    boolean bool;
    byte b = 0;
    if (paramInt1 > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    if (paramInt2 >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.a = paramBoolean;
    this.b = paramInt1;
    this.g = paramInt2;
    this.h = new d[paramInt2 + 100];
    if (paramInt2 > 0) {
      this.c = new byte[paramInt2 * paramInt1];
      while (b < paramInt2) {
        this.h[b] = new d(this.c, b * paramInt1);
        b++;
      } 
    } else {
      this.c = null;
    } 
    this.d = new d[1];
  }
  
  public void a(d paramd) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : [Lcom/google/android/exoplayer2/upstream/d;
    //   6: astore_2
    //   7: aload_2
    //   8: iconst_0
    //   9: aload_1
    //   10: aastore
    //   11: aload_0
    //   12: aload_2
    //   13: invokevirtual d : ([Lcom/google/android/exoplayer2/upstream/d;)V
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
  
  public d b() {
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
    //   22: getfield h : [Lcom/google/android/exoplayer2/upstream/d;
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
    //   45: new com/google/android/exoplayer2/upstream/d
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
  
  public void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : I
    //   6: aload_0
    //   7: getfield b : I
    //   10: invokestatic i : (II)I
    //   13: istore_1
    //   14: aload_0
    //   15: getfield f : I
    //   18: istore_2
    //   19: iconst_0
    //   20: istore_3
    //   21: iconst_0
    //   22: iload_1
    //   23: iload_2
    //   24: isub
    //   25: invokestatic max : (II)I
    //   28: istore_2
    //   29: aload_0
    //   30: getfield g : I
    //   33: istore #4
    //   35: iload_2
    //   36: iload #4
    //   38: if_icmplt -> 44
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: iload_2
    //   45: istore_1
    //   46: aload_0
    //   47: getfield c : [B
    //   50: ifnull -> 165
    //   53: iload #4
    //   55: iconst_1
    //   56: isub
    //   57: istore_1
    //   58: iload_3
    //   59: iload_1
    //   60: if_icmpgt -> 144
    //   63: aload_0
    //   64: getfield h : [Lcom/google/android/exoplayer2/upstream/d;
    //   67: astore #5
    //   69: aload #5
    //   71: iload_3
    //   72: aaload
    //   73: astore #6
    //   75: aload #6
    //   77: getfield a : [B
    //   80: astore #7
    //   82: aload_0
    //   83: getfield c : [B
    //   86: astore #8
    //   88: aload #7
    //   90: aload #8
    //   92: if_acmpne -> 101
    //   95: iinc #3, 1
    //   98: goto -> 58
    //   101: aload #5
    //   103: iload_1
    //   104: aaload
    //   105: astore #7
    //   107: aload #7
    //   109: getfield a : [B
    //   112: aload #8
    //   114: if_acmpeq -> 123
    //   117: iinc #1, -1
    //   120: goto -> 58
    //   123: aload #5
    //   125: iload_3
    //   126: aload #7
    //   128: aastore
    //   129: aload #5
    //   131: iload_1
    //   132: aload #6
    //   134: aastore
    //   135: iinc #1, -1
    //   138: iinc #3, 1
    //   141: goto -> 58
    //   144: iload_2
    //   145: iload_3
    //   146: invokestatic max : (II)I
    //   149: istore_3
    //   150: aload_0
    //   151: getfield g : I
    //   154: istore_2
    //   155: iload_3
    //   156: istore_1
    //   157: iload_3
    //   158: iload_2
    //   159: if_icmplt -> 165
    //   162: aload_0
    //   163: monitorexit
    //   164: return
    //   165: aload_0
    //   166: getfield h : [Lcom/google/android/exoplayer2/upstream/d;
    //   169: iload_1
    //   170: aload_0
    //   171: getfield g : I
    //   174: aconst_null
    //   175: invokestatic fill : ([Ljava/lang/Object;IILjava/lang/Object;)V
    //   178: aload_0
    //   179: iload_1
    //   180: putfield g : I
    //   183: aload_0
    //   184: monitorexit
    //   185: return
    //   186: astore #6
    //   188: aload_0
    //   189: monitorexit
    //   190: goto -> 196
    //   193: aload #6
    //   195: athrow
    //   196: goto -> 193
    // Exception table:
    //   from	to	target	type
    //   2	19	186	finally
    //   21	35	186	finally
    //   46	53	186	finally
    //   63	69	186	finally
    //   75	88	186	finally
    //   107	117	186	finally
    //   144	155	186	finally
    //   165	183	186	finally
  }
  
  public void d(d[] paramArrayOfd) {
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
    //   11: getfield h : [Lcom/google/android/exoplayer2/upstream/d;
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
    //   31: iconst_2
    //   32: imul
    //   33: iload_2
    //   34: aload_1
    //   35: arraylength
    //   36: iadd
    //   37: invokestatic max : (II)I
    //   40: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   43: checkcast [Lcom/google/android/exoplayer2/upstream/d;
    //   46: putfield h : [Lcom/google/android/exoplayer2/upstream/d;
    //   49: aload_1
    //   50: arraylength
    //   51: istore_3
    //   52: iconst_0
    //   53: istore_2
    //   54: iload_2
    //   55: iload_3
    //   56: if_icmpge -> 97
    //   59: aload_1
    //   60: iload_2
    //   61: aaload
    //   62: astore #4
    //   64: aload_0
    //   65: getfield h : [Lcom/google/android/exoplayer2/upstream/d;
    //   68: astore #5
    //   70: aload_0
    //   71: getfield g : I
    //   74: istore #6
    //   76: aload_0
    //   77: iload #6
    //   79: iconst_1
    //   80: iadd
    //   81: putfield g : I
    //   84: aload #5
    //   86: iload #6
    //   88: aload #4
    //   90: aastore
    //   91: iinc #2, 1
    //   94: goto -> 54
    //   97: aload_0
    //   98: aload_0
    //   99: getfield f : I
    //   102: aload_1
    //   103: arraylength
    //   104: isub
    //   105: putfield f : I
    //   108: aload_0
    //   109: invokevirtual notifyAll : ()V
    //   112: aload_0
    //   113: monitorexit
    //   114: return
    //   115: astore_1
    //   116: aload_0
    //   117: monitorexit
    //   118: goto -> 123
    //   121: aload_1
    //   122: athrow
    //   123: goto -> 121
    // Exception table:
    //   from	to	target	type
    //   2	49	115	finally
    //   49	52	115	finally
    //   64	84	115	finally
    //   97	112	115	finally
  }
  
  public int e() {
    return this.b;
  }
  
  public int f() {
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
  
  public void g() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: ifeq -> 14
    //   9: aload_0
    //   10: iconst_0
    //   11: invokevirtual h : (I)V
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
  
  public void h(int paramInt) {
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
    //   27: invokevirtual c : ()V
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
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */