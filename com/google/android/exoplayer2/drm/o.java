package com.google.android.exoplayer2.drm;

import java.util.UUID;

public final class o implements m {
  public static final boolean a;
  
  public final UUID b;
  
  public final byte[] c;
  
  public final boolean d;
  
  static {
    // Byte code:
    //   0: ldc 'Amazon'
    //   2: getstatic com/google/android/exoplayer2/util/h0.c : Ljava/lang/String;
    //   5: invokevirtual equals : (Ljava/lang/Object;)Z
    //   8: ifeq -> 38
    //   11: getstatic com/google/android/exoplayer2/util/h0.d : Ljava/lang/String;
    //   14: astore_0
    //   15: ldc 'AFTM'
    //   17: aload_0
    //   18: invokevirtual equals : (Ljava/lang/Object;)Z
    //   21: ifne -> 33
    //   24: ldc 'AFTB'
    //   26: aload_0
    //   27: invokevirtual equals : (Ljava/lang/Object;)Z
    //   30: ifeq -> 38
    //   33: iconst_1
    //   34: istore_1
    //   35: goto -> 40
    //   38: iconst_0
    //   39: istore_1
    //   40: iload_1
    //   41: putstatic com/google/android/exoplayer2/drm/o.a : Z
    //   44: return
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/drm/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */