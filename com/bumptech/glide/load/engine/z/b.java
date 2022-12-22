package com.bumptech.glide.load.engine.z;

import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

final class b {
  static int a() {
    int i = Runtime.getRuntime().availableProcessors();
    int j = i;
    if (Build.VERSION.SDK_INT < 17)
      j = Math.max(b(), i); 
    return j;
  }
  
  private static int b() {
    // Byte code:
    //   0: invokestatic allowThreadDiskReads : ()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_0
    //   4: new java/io/File
    //   7: astore_1
    //   8: aload_1
    //   9: ldc '/sys/devices/system/cpu/'
    //   11: invokespecial <init> : (Ljava/lang/String;)V
    //   14: ldc 'cpu[0-9]+'
    //   16: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   19: astore_2
    //   20: new com/bumptech/glide/load/engine/z/b$a
    //   23: astore_3
    //   24: aload_3
    //   25: aload_2
    //   26: invokespecial <init> : (Ljava/util/regex/Pattern;)V
    //   29: aload_1
    //   30: aload_3
    //   31: invokevirtual listFiles : (Ljava/io/FilenameFilter;)[Ljava/io/File;
    //   34: astore_2
    //   35: aload_0
    //   36: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   39: goto -> 68
    //   42: astore_2
    //   43: ldc 'GlideRuntimeCompat'
    //   45: bipush #6
    //   47: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   50: ifeq -> 62
    //   53: ldc 'GlideRuntimeCompat'
    //   55: ldc 'Failed to calculate accurate cpu count'
    //   57: aload_2
    //   58: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   61: pop
    //   62: aload_0
    //   63: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   66: aconst_null
    //   67: astore_2
    //   68: aload_2
    //   69: ifnull -> 79
    //   72: aload_2
    //   73: arraylength
    //   74: istore #4
    //   76: goto -> 82
    //   79: iconst_0
    //   80: istore #4
    //   82: iconst_1
    //   83: iload #4
    //   85: invokestatic max : (II)I
    //   88: ireturn
    //   89: astore_2
    //   90: aload_0
    //   91: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   94: aload_2
    //   95: athrow
    // Exception table:
    //   from	to	target	type
    //   4	35	42	finally
    //   43	62	89	finally
  }
  
  class a implements FilenameFilter {
    a(b this$0) {}
    
    public boolean accept(File param1File, String param1String) {
      return this.a.matcher(param1String).matches();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/z/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */