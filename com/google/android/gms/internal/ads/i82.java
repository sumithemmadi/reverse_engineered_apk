package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class i82 implements a50 {
  private static r82 b = r82.b(i82.class);
  
  private String c;
  
  private z30 d;
  
  boolean e;
  
  private boolean f;
  
  private ByteBuffer g;
  
  private long h;
  
  private long i;
  
  private long j = -1L;
  
  private l82 k;
  
  private ByteBuffer l = null;
  
  protected i82(String paramString) {
    this.c = paramString;
    this.f = true;
    this.e = true;
  }
  
  private final void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifne -> 96
    //   11: getstatic com/google/android/gms/internal/ads/i82.b : Lcom/google/android/gms/internal/ads/r82;
    //   14: astore_2
    //   15: aload_0
    //   16: getfield c : Ljava/lang/String;
    //   19: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   22: astore_3
    //   23: aload_3
    //   24: invokevirtual length : ()I
    //   27: ifeq -> 40
    //   30: ldc 'mem mapping '
    //   32: aload_3
    //   33: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   36: astore_3
    //   37: goto -> 50
    //   40: new java/lang/String
    //   43: dup
    //   44: ldc 'mem mapping '
    //   46: invokespecial <init> : (Ljava/lang/String;)V
    //   49: astore_3
    //   50: aload_2
    //   51: aload_3
    //   52: invokevirtual a : (Ljava/lang/String;)V
    //   55: aload_0
    //   56: aload_0
    //   57: getfield k : Lcom/google/android/gms/internal/ads/l82;
    //   60: aload_0
    //   61: getfield h : J
    //   64: aload_0
    //   65: getfield j : J
    //   68: invokeinterface P : (JJ)Ljava/nio/ByteBuffer;
    //   73: putfield g : Ljava/nio/ByteBuffer;
    //   76: aload_0
    //   77: iconst_1
    //   78: putfield f : Z
    //   81: goto -> 96
    //   84: astore_2
    //   85: new java/lang/RuntimeException
    //   88: astore_3
    //   89: aload_3
    //   90: aload_2
    //   91: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   94: aload_3
    //   95: athrow
    //   96: aload_0
    //   97: monitorexit
    //   98: return
    //   99: astore_3
    //   100: aload_0
    //   101: monitorexit
    //   102: aload_3
    //   103: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	99	finally
    //   11	37	84	java/io/IOException
    //   11	37	99	finally
    //   40	50	84	java/io/IOException
    //   40	50	99	finally
    //   50	76	84	java/io/IOException
    //   50	76	99	finally
    //   76	81	99	finally
    //   85	96	99	finally
  }
  
  public final void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial a : ()V
    //   6: getstatic com/google/android/gms/internal/ads/i82.b : Lcom/google/android/gms/internal/ads/r82;
    //   9: astore_1
    //   10: aload_0
    //   11: getfield c : Ljava/lang/String;
    //   14: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   17: astore_2
    //   18: aload_2
    //   19: invokevirtual length : ()I
    //   22: ifeq -> 35
    //   25: ldc 'parsing details of '
    //   27: aload_2
    //   28: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   31: astore_2
    //   32: goto -> 45
    //   35: new java/lang/String
    //   38: dup
    //   39: ldc 'parsing details of '
    //   41: invokespecial <init> : (Ljava/lang/String;)V
    //   44: astore_2
    //   45: aload_1
    //   46: aload_2
    //   47: invokevirtual a : (Ljava/lang/String;)V
    //   50: aload_0
    //   51: getfield g : Ljava/nio/ByteBuffer;
    //   54: astore_2
    //   55: aload_2
    //   56: ifnull -> 94
    //   59: aload_0
    //   60: iconst_1
    //   61: putfield e : Z
    //   64: aload_2
    //   65: invokevirtual rewind : ()Ljava/nio/Buffer;
    //   68: pop
    //   69: aload_0
    //   70: aload_2
    //   71: invokevirtual e : (Ljava/nio/ByteBuffer;)V
    //   74: aload_2
    //   75: invokevirtual remaining : ()I
    //   78: ifle -> 89
    //   81: aload_0
    //   82: aload_2
    //   83: invokevirtual slice : ()Ljava/nio/ByteBuffer;
    //   86: putfield l : Ljava/nio/ByteBuffer;
    //   89: aload_0
    //   90: aconst_null
    //   91: putfield g : Ljava/nio/ByteBuffer;
    //   94: aload_0
    //   95: monitorexit
    //   96: return
    //   97: astore_2
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_2
    //   101: athrow
    // Exception table:
    //   from	to	target	type
    //   2	32	97	finally
    //   35	45	97	finally
    //   45	55	97	finally
    //   59	89	97	finally
    //   89	94	97	finally
  }
  
  public final void c(l82 paraml82, ByteBuffer paramByteBuffer, long paramLong, wz paramwz) {
    long l = paraml82.K();
    this.h = l;
    this.i = l - paramByteBuffer.remaining();
    this.j = paramLong;
    this.k = paraml82;
    paraml82.D(paraml82.K() + paramLong);
    this.f = false;
    this.e = false;
    b();
  }
  
  public final void d(z30 paramz30) {
    this.d = paramz30;
  }
  
  protected abstract void e(ByteBuffer paramByteBuffer);
  
  public final String l() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */