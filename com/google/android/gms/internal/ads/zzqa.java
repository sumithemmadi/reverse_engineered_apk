package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

@TargetApi(17)
public final class zzqa extends Surface {
  private static boolean b;
  
  private static boolean c;
  
  private final boolean d;
  
  private final ek2 e;
  
  private boolean f;
  
  private zzqa(ek2 paramek2, SurfaceTexture paramSurfaceTexture, boolean paramBoolean) {
    super(paramSurfaceTexture);
    this.e = paramek2;
    this.d = paramBoolean;
  }
  
  public static zzqa a(Context paramContext, boolean paramBoolean) {
    if (wj2.a >= 17) {
      if (!paramBoolean || b(paramContext)) {
        boolean bool1 = true;
        jj2.e(bool1);
        return (new ek2()).b(paramBoolean);
      } 
      boolean bool = false;
      jj2.e(bool);
      return (new ek2()).b(paramBoolean);
    } 
    throw new UnsupportedOperationException("Unsupported prior to API level 17");
  }
  
  public static boolean b(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/zzqa
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/internal/ads/zzqa.c : Z
    //   6: ifne -> 117
    //   9: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   12: istore_1
    //   13: iload_1
    //   14: bipush #17
    //   16: if_icmplt -> 113
    //   19: iconst_0
    //   20: istore_2
    //   21: iconst_0
    //   22: invokestatic eglGetDisplay : (I)Landroid/opengl/EGLDisplay;
    //   25: sipush #12373
    //   28: invokestatic eglQueryString : (Landroid/opengl/EGLDisplay;I)Ljava/lang/String;
    //   31: astore_3
    //   32: iload_2
    //   33: istore #4
    //   35: aload_3
    //   36: ifnull -> 108
    //   39: iload_2
    //   40: istore #4
    //   42: aload_3
    //   43: ldc 'EGL_EXT_protected_content'
    //   45: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   48: ifeq -> 108
    //   51: iload_1
    //   52: bipush #24
    //   54: if_icmpne -> 96
    //   57: getstatic com/google/android/gms/internal/ads/wj2.d : Ljava/lang/String;
    //   60: astore_3
    //   61: aload_3
    //   62: ldc 'SM-G950'
    //   64: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   67: ifne -> 79
    //   70: aload_3
    //   71: ldc 'SM-G955'
    //   73: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   76: ifeq -> 96
    //   79: aload_0
    //   80: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   83: ldc 'android.hardware.vr.high_performance'
    //   85: invokevirtual hasSystemFeature : (Ljava/lang/String;)Z
    //   88: ifne -> 96
    //   91: iconst_1
    //   92: istore_1
    //   93: goto -> 98
    //   96: iconst_0
    //   97: istore_1
    //   98: iload_2
    //   99: istore #4
    //   101: iload_1
    //   102: ifne -> 108
    //   105: iconst_1
    //   106: istore #4
    //   108: iload #4
    //   110: putstatic com/google/android/gms/internal/ads/zzqa.b : Z
    //   113: iconst_1
    //   114: putstatic com/google/android/gms/internal/ads/zzqa.c : Z
    //   117: getstatic com/google/android/gms/internal/ads/zzqa.b : Z
    //   120: istore #4
    //   122: ldc com/google/android/gms/internal/ads/zzqa
    //   124: monitorexit
    //   125: iload #4
    //   127: ireturn
    //   128: astore_0
    //   129: ldc com/google/android/gms/internal/ads/zzqa
    //   131: monitorexit
    //   132: aload_0
    //   133: athrow
    // Exception table:
    //   from	to	target	type
    //   3	13	128	finally
    //   21	32	128	finally
    //   42	51	128	finally
    //   57	79	128	finally
    //   79	91	128	finally
    //   108	113	128	finally
    //   113	117	128	finally
    //   117	122	128	finally
  }
  
  public final void release() {
    super.release();
    synchronized (this.e) {
      if (!this.f) {
        this.e.a();
        this.f = true;
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */