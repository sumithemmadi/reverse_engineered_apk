package com.google.android.gms.internal.ads;

import android.content.Context;

public final class na2 extends kb2 {
  private static mb2<String> i = new mb2<String>();
  
  private final Context j;
  
  public na2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2, Context paramContext) {
    super(paramz92, paramString1, paramString2, parama, paramInt1, 29);
    this.j = paramContext;
  }
  
  protected final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   4: ldc 'E'
    //   6: invokevirtual A : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   9: pop
    //   10: getstatic com/google/android/gms/internal/ads/na2.i : Lcom/google/android/gms/internal/ads/mb2;
    //   13: aload_0
    //   14: getfield j : Landroid/content/Context;
    //   17: invokevirtual getPackageName : ()Ljava/lang/String;
    //   20: invokevirtual a : (Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReference;
    //   23: astore_1
    //   24: aload_1
    //   25: invokevirtual get : ()Ljava/lang/Object;
    //   28: ifnonnull -> 76
    //   31: aload_1
    //   32: monitorenter
    //   33: aload_1
    //   34: invokevirtual get : ()Ljava/lang/Object;
    //   37: ifnonnull -> 66
    //   40: aload_1
    //   41: aload_0
    //   42: getfield f : Ljava/lang/reflect/Method;
    //   45: aconst_null
    //   46: iconst_1
    //   47: anewarray java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: aload_0
    //   53: getfield j : Landroid/content/Context;
    //   56: aastore
    //   57: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   60: checkcast java/lang/String
    //   63: invokevirtual set : (Ljava/lang/Object;)V
    //   66: aload_1
    //   67: monitorexit
    //   68: goto -> 76
    //   71: astore_2
    //   72: aload_1
    //   73: monitorexit
    //   74: aload_2
    //   75: athrow
    //   76: aload_1
    //   77: invokevirtual get : ()Ljava/lang/Object;
    //   80: checkcast java/lang/String
    //   83: astore_2
    //   84: aload_0
    //   85: getfield e : Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   88: astore_1
    //   89: aload_1
    //   90: monitorenter
    //   91: aload_0
    //   92: getfield e : Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   95: aload_2
    //   96: invokevirtual getBytes : ()[B
    //   99: iconst_1
    //   100: invokestatic a : ([BZ)Ljava/lang/String;
    //   103: invokevirtual A : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzcf$zza$a;
    //   106: pop
    //   107: aload_1
    //   108: monitorexit
    //   109: return
    //   110: astore_2
    //   111: aload_1
    //   112: monitorexit
    //   113: aload_2
    //   114: athrow
    // Exception table:
    //   from	to	target	type
    //   33	66	71	finally
    //   66	68	71	finally
    //   72	74	71	finally
    //   91	109	110	finally
    //   111	113	110	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/na2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */