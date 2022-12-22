package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.m;

@TargetApi(17)
public final class DummySurface extends Surface {
  private static int b;
  
  private static boolean c;
  
  public final boolean d;
  
  private final b e;
  
  private boolean f;
  
  private DummySurface(b paramb, SurfaceTexture paramSurfaceTexture, boolean paramBoolean) {
    super(paramSurfaceTexture);
    this.e = paramb;
    this.d = paramBoolean;
  }
  
  private static void a() {
    if (h0.a >= 17)
      return; 
    throw new UnsupportedOperationException("Unsupported prior to API level 17");
  }
  
  private static int b(Context paramContext) {
    return m.h(paramContext) ? (m.i() ? 1 : 2) : 0;
  }
  
  public static boolean c(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/exoplayer2/video/DummySurface
    //   2: monitorenter
    //   3: getstatic com/google/android/exoplayer2/video/DummySurface.c : Z
    //   6: istore_1
    //   7: iconst_1
    //   8: istore_2
    //   9: iload_1
    //   10: ifne -> 24
    //   13: aload_0
    //   14: invokestatic b : (Landroid/content/Context;)I
    //   17: putstatic com/google/android/exoplayer2/video/DummySurface.b : I
    //   20: iconst_1
    //   21: putstatic com/google/android/exoplayer2/video/DummySurface.c : Z
    //   24: getstatic com/google/android/exoplayer2/video/DummySurface.b : I
    //   27: istore_3
    //   28: iload_3
    //   29: ifeq -> 35
    //   32: goto -> 37
    //   35: iconst_0
    //   36: istore_2
    //   37: ldc com/google/android/exoplayer2/video/DummySurface
    //   39: monitorexit
    //   40: iload_2
    //   41: ireturn
    //   42: astore_0
    //   43: ldc com/google/android/exoplayer2/video/DummySurface
    //   45: monitorexit
    //   46: aload_0
    //   47: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	42	finally
    //   13	24	42	finally
    //   24	28	42	finally
  }
  
  public static DummySurface d(Context paramContext, boolean paramBoolean) {
    boolean bool;
    a();
    int i = 0;
    if (!paramBoolean || c(paramContext)) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    b b1 = new b();
    if (paramBoolean)
      i = b; 
    return b1.a(i);
  }
  
  public void release() {
    super.release();
    synchronized (this.e) {
      if (!this.f) {
        this.e.c();
        this.f = true;
      } 
      return;
    } 
  }
  
  private static class b extends HandlerThread implements Handler.Callback {
    private EGLSurfaceTexture b;
    
    private Handler c;
    
    private Error d;
    
    private RuntimeException e;
    
    private DummySurface f;
    
    public b() {
      super("dummySurface");
    }
    
    private void b(int param1Int) {
      boolean bool;
      e.e(this.b);
      this.b.h(param1Int);
      SurfaceTexture surfaceTexture = this.b.g();
      if (param1Int != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.f = new DummySurface(this, surfaceTexture, bool, null);
    }
    
    private void d() {
      e.e(this.b);
      this.b.i();
    }
    
    public DummySurface a(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual start : ()V
      //   4: aload_0
      //   5: new android/os/Handler
      //   8: dup
      //   9: aload_0
      //   10: invokevirtual getLooper : ()Landroid/os/Looper;
      //   13: aload_0
      //   14: invokespecial <init> : (Landroid/os/Looper;Landroid/os/Handler$Callback;)V
      //   17: putfield c : Landroid/os/Handler;
      //   20: aload_0
      //   21: new com/google/android/exoplayer2/util/EGLSurfaceTexture
      //   24: dup
      //   25: aload_0
      //   26: getfield c : Landroid/os/Handler;
      //   29: invokespecial <init> : (Landroid/os/Handler;)V
      //   32: putfield b : Lcom/google/android/exoplayer2/util/EGLSurfaceTexture;
      //   35: aload_0
      //   36: monitorenter
      //   37: aload_0
      //   38: getfield c : Landroid/os/Handler;
      //   41: astore_2
      //   42: iconst_0
      //   43: istore_3
      //   44: aload_2
      //   45: iconst_1
      //   46: iload_1
      //   47: iconst_0
      //   48: invokevirtual obtainMessage : (III)Landroid/os/Message;
      //   51: invokevirtual sendToTarget : ()V
      //   54: iload_3
      //   55: istore_1
      //   56: aload_0
      //   57: getfield f : Lcom/google/android/exoplayer2/video/DummySurface;
      //   60: ifnonnull -> 92
      //   63: aload_0
      //   64: getfield e : Ljava/lang/RuntimeException;
      //   67: ifnonnull -> 92
      //   70: aload_0
      //   71: getfield d : Ljava/lang/Error;
      //   74: astore_2
      //   75: aload_2
      //   76: ifnonnull -> 92
      //   79: aload_0
      //   80: invokevirtual wait : ()V
      //   83: goto -> 56
      //   86: astore_2
      //   87: iconst_1
      //   88: istore_1
      //   89: goto -> 56
      //   92: aload_0
      //   93: monitorexit
      //   94: iload_1
      //   95: ifeq -> 104
      //   98: invokestatic currentThread : ()Ljava/lang/Thread;
      //   101: invokevirtual interrupt : ()V
      //   104: aload_0
      //   105: getfield e : Ljava/lang/RuntimeException;
      //   108: astore_2
      //   109: aload_2
      //   110: ifnonnull -> 135
      //   113: aload_0
      //   114: getfield d : Ljava/lang/Error;
      //   117: astore_2
      //   118: aload_2
      //   119: ifnonnull -> 133
      //   122: aload_0
      //   123: getfield f : Lcom/google/android/exoplayer2/video/DummySurface;
      //   126: invokestatic e : (Ljava/lang/Object;)Ljava/lang/Object;
      //   129: checkcast com/google/android/exoplayer2/video/DummySurface
      //   132: areturn
      //   133: aload_2
      //   134: athrow
      //   135: aload_2
      //   136: athrow
      //   137: astore_2
      //   138: aload_0
      //   139: monitorexit
      //   140: goto -> 145
      //   143: aload_2
      //   144: athrow
      //   145: goto -> 143
      // Exception table:
      //   from	to	target	type
      //   37	42	137	finally
      //   44	54	137	finally
      //   56	75	137	finally
      //   79	83	86	java/lang/InterruptedException
      //   79	83	137	finally
      //   92	94	137	finally
      //   138	140	137	finally
    }
    
    public void c() {
      e.e(this.c);
      this.c.sendEmptyMessage(2);
    }
    
    public boolean handleMessage(Message param1Message) {
      // Byte code:
      //   0: aload_1
      //   1: getfield what : I
      //   4: istore_2
      //   5: iload_2
      //   6: iconst_1
      //   7: if_icmpeq -> 51
      //   10: iload_2
      //   11: iconst_2
      //   12: if_icmpeq -> 17
      //   15: iconst_1
      //   16: ireturn
      //   17: aload_0
      //   18: invokespecial d : ()V
      //   21: aload_0
      //   22: invokevirtual quit : ()Z
      //   25: pop
      //   26: goto -> 41
      //   29: astore_1
      //   30: ldc 'DummySurface'
      //   32: ldc 'Failed to release dummy surface'
      //   34: aload_1
      //   35: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   38: goto -> 21
      //   41: iconst_1
      //   42: ireturn
      //   43: astore_1
      //   44: aload_0
      //   45: invokevirtual quit : ()Z
      //   48: pop
      //   49: aload_1
      //   50: athrow
      //   51: aload_0
      //   52: aload_1
      //   53: getfield arg1 : I
      //   56: invokespecial b : (I)V
      //   59: aload_0
      //   60: monitorenter
      //   61: aload_0
      //   62: invokevirtual notify : ()V
      //   65: aload_0
      //   66: monitorexit
      //   67: goto -> 131
      //   70: astore_1
      //   71: aload_0
      //   72: monitorexit
      //   73: aload_1
      //   74: athrow
      //   75: astore_1
      //   76: goto -> 138
      //   79: astore_1
      //   80: ldc 'DummySurface'
      //   82: ldc 'Failed to initialize dummy surface'
      //   84: aload_1
      //   85: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   88: aload_0
      //   89: aload_1
      //   90: putfield d : Ljava/lang/Error;
      //   93: aload_0
      //   94: monitorenter
      //   95: aload_0
      //   96: invokevirtual notify : ()V
      //   99: aload_0
      //   100: monitorexit
      //   101: goto -> 131
      //   104: astore_1
      //   105: aload_0
      //   106: monitorexit
      //   107: aload_1
      //   108: athrow
      //   109: astore_1
      //   110: ldc 'DummySurface'
      //   112: ldc 'Failed to initialize dummy surface'
      //   114: aload_1
      //   115: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   118: aload_0
      //   119: aload_1
      //   120: putfield e : Ljava/lang/RuntimeException;
      //   123: aload_0
      //   124: monitorenter
      //   125: aload_0
      //   126: invokevirtual notify : ()V
      //   129: aload_0
      //   130: monitorexit
      //   131: iconst_1
      //   132: ireturn
      //   133: astore_1
      //   134: aload_0
      //   135: monitorexit
      //   136: aload_1
      //   137: athrow
      //   138: aload_0
      //   139: monitorenter
      //   140: aload_0
      //   141: invokevirtual notify : ()V
      //   144: aload_0
      //   145: monitorexit
      //   146: aload_1
      //   147: athrow
      //   148: astore_1
      //   149: aload_0
      //   150: monitorexit
      //   151: goto -> 156
      //   154: aload_1
      //   155: athrow
      //   156: goto -> 154
      // Exception table:
      //   from	to	target	type
      //   17	21	29	finally
      //   30	38	43	finally
      //   51	59	109	java/lang/RuntimeException
      //   51	59	79	java/lang/Error
      //   51	59	75	finally
      //   61	67	70	finally
      //   71	73	70	finally
      //   80	93	75	finally
      //   95	101	104	finally
      //   105	107	104	finally
      //   110	123	75	finally
      //   125	131	133	finally
      //   134	136	133	finally
      //   140	146	148	finally
      //   149	151	148	finally
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/DummySurface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */