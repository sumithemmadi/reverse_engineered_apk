package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class eg {
  private static final Comparator<byte[]> a = new zi();
  
  private final List<byte[]> b = (List)new ArrayList<byte>();
  
  private final List<byte[]> c = (List)new ArrayList<byte>(64);
  
  private int d = 0;
  
  private final int e = 4096;
  
  public eg(int paramInt) {}
  
  private final void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : I
    //   6: aload_0
    //   7: getfield e : I
    //   10: if_icmple -> 52
    //   13: aload_0
    //   14: getfield b : Ljava/util/List;
    //   17: iconst_0
    //   18: invokeinterface remove : (I)Ljava/lang/Object;
    //   23: checkcast [B
    //   26: astore_1
    //   27: aload_0
    //   28: getfield c : Ljava/util/List;
    //   31: aload_1
    //   32: invokeinterface remove : (Ljava/lang/Object;)Z
    //   37: pop
    //   38: aload_0
    //   39: aload_0
    //   40: getfield d : I
    //   43: aload_1
    //   44: arraylength
    //   45: isub
    //   46: putfield d : I
    //   49: goto -> 2
    //   52: aload_0
    //   53: monitorexit
    //   54: return
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: goto -> 63
    //   61: aload_1
    //   62: athrow
    //   63: goto -> 61
    // Exception table:
    //   from	to	target	type
    //   2	49	55	finally
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull -> 86
    //   6: aload_1
    //   7: arraylength
    //   8: aload_0
    //   9: getfield e : I
    //   12: if_icmple -> 18
    //   15: goto -> 86
    //   18: aload_0
    //   19: getfield b : Ljava/util/List;
    //   22: aload_1
    //   23: invokeinterface add : (Ljava/lang/Object;)Z
    //   28: pop
    //   29: aload_0
    //   30: getfield c : Ljava/util/List;
    //   33: aload_1
    //   34: getstatic com/google/android/gms/internal/ads/eg.a : Ljava/util/Comparator;
    //   37: invokestatic binarySearch : (Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I
    //   40: istore_2
    //   41: iload_2
    //   42: istore_3
    //   43: iload_2
    //   44: ifge -> 52
    //   47: iload_2
    //   48: ineg
    //   49: iconst_1
    //   50: isub
    //   51: istore_3
    //   52: aload_0
    //   53: getfield c : Ljava/util/List;
    //   56: iload_3
    //   57: aload_1
    //   58: invokeinterface add : (ILjava/lang/Object;)V
    //   63: aload_0
    //   64: aload_0
    //   65: getfield d : I
    //   68: aload_1
    //   69: arraylength
    //   70: iadd
    //   71: putfield d : I
    //   74: aload_0
    //   75: invokespecial c : ()V
    //   78: aload_0
    //   79: monitorexit
    //   80: return
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    // Exception table:
    //   from	to	target	type
    //   6	15	81	finally
    //   18	41	81	finally
    //   52	78	81	finally
  }
  
  public final byte[] b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: istore_2
    //   4: iload_2
    //   5: aload_0
    //   6: getfield c : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 80
    //   17: aload_0
    //   18: getfield c : Ljava/util/List;
    //   21: iload_2
    //   22: invokeinterface get : (I)Ljava/lang/Object;
    //   27: checkcast [B
    //   30: astore_3
    //   31: aload_3
    //   32: arraylength
    //   33: iload_1
    //   34: if_icmplt -> 74
    //   37: aload_0
    //   38: aload_0
    //   39: getfield d : I
    //   42: aload_3
    //   43: arraylength
    //   44: isub
    //   45: putfield d : I
    //   48: aload_0
    //   49: getfield c : Ljava/util/List;
    //   52: iload_2
    //   53: invokeinterface remove : (I)Ljava/lang/Object;
    //   58: pop
    //   59: aload_0
    //   60: getfield b : Ljava/util/List;
    //   63: aload_3
    //   64: invokeinterface remove : (Ljava/lang/Object;)Z
    //   69: pop
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_3
    //   73: areturn
    //   74: iinc #2, 1
    //   77: goto -> 4
    //   80: iload_1
    //   81: newarray byte
    //   83: astore_3
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_3
    //   87: areturn
    //   88: astore_3
    //   89: aload_0
    //   90: monitorexit
    //   91: goto -> 96
    //   94: aload_3
    //   95: athrow
    //   96: goto -> 94
    // Exception table:
    //   from	to	target	type
    //   4	70	88	finally
    //   80	84	88	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/eg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */