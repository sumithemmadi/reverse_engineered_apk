package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

public final class n32 extends OutputStream {
  private static final byte[] b = new byte[0];
  
  private final int c = 128;
  
  private final ArrayList<zzejr> d = new ArrayList<zzejr>();
  
  private int e;
  
  private byte[] f = new byte[128];
  
  private int g;
  
  n32(int paramInt) {}
  
  private final int b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : I
    //   6: istore_1
    //   7: aload_0
    //   8: getfield g : I
    //   11: istore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: iload_1
    //   15: iload_2
    //   16: iadd
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
  
  private final void d(int paramInt) {
    this.d.add(new zzekb(this.f));
    int i = this.e + this.f.length;
    this.e = i;
    this.f = new byte[Math.max(this.c, Math.max(paramInt, i >>> 1))];
    this.g = 0;
  }
  
  public final zzejr c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : I
    //   6: istore_1
    //   7: aload_0
    //   8: getfield f : [B
    //   11: astore_2
    //   12: iload_1
    //   13: aload_2
    //   14: arraylength
    //   15: if_icmpge -> 65
    //   18: iload_1
    //   19: ifle -> 95
    //   22: iload_1
    //   23: newarray byte
    //   25: astore_3
    //   26: aload_2
    //   27: iconst_0
    //   28: aload_3
    //   29: iconst_0
    //   30: aload_2
    //   31: arraylength
    //   32: iload_1
    //   33: invokestatic min : (II)I
    //   36: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   39: aload_0
    //   40: getfield d : Ljava/util/ArrayList;
    //   43: astore_2
    //   44: new com/google/android/gms/internal/ads/zzekb
    //   47: astore #4
    //   49: aload #4
    //   51: aload_3
    //   52: invokespecial <init> : ([B)V
    //   55: aload_2
    //   56: aload #4
    //   58: invokevirtual add : (Ljava/lang/Object;)Z
    //   61: pop
    //   62: goto -> 95
    //   65: aload_0
    //   66: getfield d : Ljava/util/ArrayList;
    //   69: astore_2
    //   70: new com/google/android/gms/internal/ads/zzekb
    //   73: astore_3
    //   74: aload_3
    //   75: aload_0
    //   76: getfield f : [B
    //   79: invokespecial <init> : ([B)V
    //   82: aload_2
    //   83: aload_3
    //   84: invokevirtual add : (Ljava/lang/Object;)Z
    //   87: pop
    //   88: aload_0
    //   89: getstatic com/google/android/gms/internal/ads/n32.b : [B
    //   92: putfield f : [B
    //   95: aload_0
    //   96: aload_0
    //   97: getfield e : I
    //   100: aload_0
    //   101: getfield g : I
    //   104: iadd
    //   105: putfield e : I
    //   108: aload_0
    //   109: iconst_0
    //   110: putfield g : I
    //   113: aload_0
    //   114: getfield d : Ljava/util/ArrayList;
    //   117: invokestatic zzl : (Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzejr;
    //   120: astore_3
    //   121: aload_0
    //   122: monitorexit
    //   123: aload_3
    //   124: areturn
    //   125: astore_3
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_3
    //   129: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	125	finally
    //   22	62	125	finally
    //   65	95	125	finally
    //   95	121	125	finally
  }
  
  public final String toString() {
    return String.format("<ByteString.Output@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()) });
  }
  
  public final void write(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : I
    //   6: aload_0
    //   7: getfield f : [B
    //   10: arraylength
    //   11: if_icmpne -> 19
    //   14: aload_0
    //   15: iconst_1
    //   16: invokespecial d : (I)V
    //   19: aload_0
    //   20: getfield f : [B
    //   23: astore_2
    //   24: aload_0
    //   25: getfield g : I
    //   28: istore_3
    //   29: aload_0
    //   30: iload_3
    //   31: iconst_1
    //   32: iadd
    //   33: putfield g : I
    //   36: aload_2
    //   37: iload_3
    //   38: iload_1
    //   39: i2b
    //   40: i2b
    //   41: bastore
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: astore_2
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_2
    //   49: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	45	finally
    //   19	36	45	finally
  }
  
  public final void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : [B
    //   6: astore #4
    //   8: aload #4
    //   10: arraylength
    //   11: istore #5
    //   13: aload_0
    //   14: getfield g : I
    //   17: istore #6
    //   19: iload_3
    //   20: iload #5
    //   22: iload #6
    //   24: isub
    //   25: if_icmpgt -> 51
    //   28: aload_1
    //   29: iload_2
    //   30: aload #4
    //   32: iload #6
    //   34: iload_3
    //   35: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   38: aload_0
    //   39: aload_0
    //   40: getfield g : I
    //   43: iload_3
    //   44: iadd
    //   45: putfield g : I
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: aload #4
    //   53: arraylength
    //   54: iload #6
    //   56: isub
    //   57: istore #5
    //   59: aload_1
    //   60: iload_2
    //   61: aload #4
    //   63: iload #6
    //   65: iload #5
    //   67: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   70: iload_3
    //   71: iload #5
    //   73: isub
    //   74: istore_3
    //   75: aload_0
    //   76: iload_3
    //   77: invokespecial d : (I)V
    //   80: aload_1
    //   81: iload_2
    //   82: iload #5
    //   84: iadd
    //   85: aload_0
    //   86: getfield f : [B
    //   89: iconst_0
    //   90: iload_3
    //   91: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   94: aload_0
    //   95: iload_3
    //   96: putfield g : I
    //   99: aload_0
    //   100: monitorexit
    //   101: return
    //   102: astore_1
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	102	finally
    //   28	48	102	finally
    //   51	70	102	finally
    //   75	99	102	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */