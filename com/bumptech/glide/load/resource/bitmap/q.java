package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public final class q {
  public static final boolean a;
  
  public static final boolean b;
  
  private static final File c = new File("/proc/self/fd");
  
  private static volatile q d;
  
  private static volatile int e = -1;
  
  private final boolean f = f();
  
  private final int g;
  
  private final int h;
  
  private int i;
  
  private boolean j = true;
  
  private final AtomicBoolean k = new AtomicBoolean(false);
  
  q() {
    if (Build.VERSION.SDK_INT >= 28) {
      this.g = 20000;
      this.h = 0;
    } else {
      this.g = 700;
      this.h = 128;
    } 
  }
  
  private boolean a() {
    boolean bool;
    if (a && !this.k.get()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static q b() {
    // Byte code:
    //   0: getstatic com/bumptech/glide/load/resource/bitmap/q.d : Lcom/bumptech/glide/load/resource/bitmap/q;
    //   3: ifnonnull -> 39
    //   6: ldc com/bumptech/glide/load/resource/bitmap/q
    //   8: monitorenter
    //   9: getstatic com/bumptech/glide/load/resource/bitmap/q.d : Lcom/bumptech/glide/load/resource/bitmap/q;
    //   12: ifnonnull -> 27
    //   15: new com/bumptech/glide/load/resource/bitmap/q
    //   18: astore_0
    //   19: aload_0
    //   20: invokespecial <init> : ()V
    //   23: aload_0
    //   24: putstatic com/bumptech/glide/load/resource/bitmap/q.d : Lcom/bumptech/glide/load/resource/bitmap/q;
    //   27: ldc com/bumptech/glide/load/resource/bitmap/q
    //   29: monitorexit
    //   30: goto -> 39
    //   33: astore_0
    //   34: ldc com/bumptech/glide/load/resource/bitmap/q
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    //   39: getstatic com/bumptech/glide/load/resource/bitmap/q.d : Lcom/bumptech/glide/load/resource/bitmap/q;
    //   42: areturn
    // Exception table:
    //   from	to	target	type
    //   9	27	33	finally
    //   27	30	33	finally
    //   34	37	33	finally
  }
  
  private int c() {
    int i;
    if (e != -1) {
      i = e;
    } else {
      i = this.g;
    } 
    return i;
  }
  
  private boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : I
    //   6: istore_1
    //   7: iconst_1
    //   8: istore_2
    //   9: iinc #1, 1
    //   12: aload_0
    //   13: iload_1
    //   14: putfield i : I
    //   17: iload_1
    //   18: bipush #50
    //   20: if_icmplt -> 123
    //   23: aload_0
    //   24: iconst_0
    //   25: putfield i : I
    //   28: getstatic com/bumptech/glide/load/resource/bitmap/q.c : Ljava/io/File;
    //   31: invokevirtual list : ()[Ljava/lang/String;
    //   34: arraylength
    //   35: istore_1
    //   36: aload_0
    //   37: invokespecial c : ()I
    //   40: i2l
    //   41: lstore_3
    //   42: iload_1
    //   43: i2l
    //   44: lload_3
    //   45: lcmp
    //   46: ifge -> 52
    //   49: goto -> 54
    //   52: iconst_0
    //   53: istore_2
    //   54: aload_0
    //   55: iload_2
    //   56: putfield j : Z
    //   59: iload_2
    //   60: ifne -> 123
    //   63: ldc 'Downsampler'
    //   65: iconst_5
    //   66: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   69: ifeq -> 123
    //   72: new java/lang/StringBuilder
    //   75: astore #5
    //   77: aload #5
    //   79: invokespecial <init> : ()V
    //   82: aload #5
    //   84: ldc 'Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors '
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload #5
    //   92: iload_1
    //   93: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload #5
    //   99: ldc ', limit '
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload #5
    //   107: lload_3
    //   108: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: ldc 'Downsampler'
    //   114: aload #5
    //   116: invokevirtual toString : ()Ljava/lang/String;
    //   119: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   122: pop
    //   123: aload_0
    //   124: getfield j : Z
    //   127: istore_2
    //   128: aload_0
    //   129: monitorexit
    //   130: iload_2
    //   131: ireturn
    //   132: astore #5
    //   134: aload_0
    //   135: monitorexit
    //   136: aload #5
    //   138: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	132	finally
    //   12	17	132	finally
    //   23	42	132	finally
    //   54	59	132	finally
    //   63	123	132	finally
    //   123	128	132	finally
  }
  
  private static boolean f() {
    boolean bool;
    if (!g() && !h()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean g() {
    if (Build.VERSION.SDK_INT != 26)
      return false; 
    for (String str : Arrays.<String>asList(new String[] { 
          "SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", 
          "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play" })) {
      if (Build.MODEL.startsWith(str))
        return true; 
    } 
    return false;
  }
  
  private static boolean h() {
    return (Build.VERSION.SDK_INT != 27) ? false : Arrays.<String>asList(new String[] { 
          "LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", 
          "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", 
          "LM-X410PM" }).contains(Build.MODEL);
  }
  
  public boolean e(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    if (!paramBoolean1) {
      if (Log.isLoggable("HardwareConfig", 2))
        Log.v("HardwareConfig", "Hardware config disallowed by caller"); 
      return false;
    } 
    if (!this.f) {
      if (Log.isLoggable("HardwareConfig", 2))
        Log.v("HardwareConfig", "Hardware config disallowed by device model"); 
      return false;
    } 
    if (!b) {
      if (Log.isLoggable("HardwareConfig", 2))
        Log.v("HardwareConfig", "Hardware config disallowed by sdk"); 
      return false;
    } 
    if (a()) {
      if (Log.isLoggable("HardwareConfig", 2))
        Log.v("HardwareConfig", "Hardware config disallowed by app state"); 
      return false;
    } 
    if (paramBoolean2) {
      if (Log.isLoggable("HardwareConfig", 2))
        Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required"); 
      return false;
    } 
    int i = this.h;
    if (paramInt1 < i) {
      if (Log.isLoggable("HardwareConfig", 2))
        Log.v("HardwareConfig", "Hardware config disallowed because width is too small"); 
      return false;
    } 
    if (paramInt2 < i) {
      if (Log.isLoggable("HardwareConfig", 2))
        Log.v("HardwareConfig", "Hardware config disallowed because height is too small"); 
      return false;
    } 
    if (!d()) {
      if (Log.isLoggable("HardwareConfig", 2))
        Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs"); 
      return false;
    } 
    return true;
  }
  
  @TargetApi(26)
  boolean i(int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, boolean paramBoolean1, boolean paramBoolean2) {
    paramBoolean1 = e(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    if (paramBoolean1) {
      paramOptions.inPreferredConfig = Bitmap.Config.HARDWARE;
      paramOptions.inMutable = false;
    } 
    return paramBoolean1;
  }
  
  static {
    boolean bool2;
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = true;
    if (i < 29) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    a = bool2;
    if (i >= 26) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    b = bool2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */