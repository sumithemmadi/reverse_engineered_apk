package com.bumptech.glide.load.i;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.x.b;
import java.io.File;
import java.io.InputStream;

public class t implements a<InputStream> {
  private final b a;
  
  public t(b paramb) {
    this.a = paramb;
  }
  
  public boolean c(InputStream paramInputStream, File paramFile, e parame) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lcom/bumptech/glide/load/engine/x/b;
    //   4: ldc 65536
    //   6: ldc [B
    //   8: invokeinterface e : (ILjava/lang/Class;)Ljava/lang/Object;
    //   13: checkcast [B
    //   16: astore #4
    //   18: iconst_0
    //   19: istore #5
    //   21: iconst_0
    //   22: istore #6
    //   24: aconst_null
    //   25: astore #7
    //   27: aconst_null
    //   28: astore #8
    //   30: aload #8
    //   32: astore_3
    //   33: new java/io/FileOutputStream
    //   36: astore #9
    //   38: aload #8
    //   40: astore_3
    //   41: aload #9
    //   43: aload_2
    //   44: invokespecial <init> : (Ljava/io/File;)V
    //   47: aload_1
    //   48: aload #4
    //   50: invokevirtual read : ([B)I
    //   53: istore #10
    //   55: iload #10
    //   57: iconst_m1
    //   58: if_icmpeq -> 74
    //   61: aload #9
    //   63: aload #4
    //   65: iconst_0
    //   66: iload #10
    //   68: invokevirtual write : ([BII)V
    //   71: goto -> 47
    //   74: aload #9
    //   76: invokevirtual close : ()V
    //   79: iconst_1
    //   80: istore #11
    //   82: iconst_1
    //   83: istore #6
    //   85: aload #9
    //   87: invokevirtual close : ()V
    //   90: iload #6
    //   92: istore #11
    //   94: goto -> 161
    //   97: astore_1
    //   98: aload #9
    //   100: astore_3
    //   101: goto -> 175
    //   104: astore_2
    //   105: aload #9
    //   107: astore_1
    //   108: goto -> 119
    //   111: astore_1
    //   112: goto -> 175
    //   115: astore_2
    //   116: aload #7
    //   118: astore_1
    //   119: aload_1
    //   120: astore_3
    //   121: ldc 'StreamEncoder'
    //   123: iconst_3
    //   124: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   127: ifeq -> 141
    //   130: aload_1
    //   131: astore_3
    //   132: ldc 'StreamEncoder'
    //   134: ldc 'Failed to encode data onto the OutputStream'
    //   136: aload_2
    //   137: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   140: pop
    //   141: iload #6
    //   143: istore #11
    //   145: aload_1
    //   146: ifnull -> 161
    //   149: iload #5
    //   151: istore #11
    //   153: aload_1
    //   154: invokevirtual close : ()V
    //   157: iload #6
    //   159: istore #11
    //   161: aload_0
    //   162: getfield a : Lcom/bumptech/glide/load/engine/x/b;
    //   165: aload #4
    //   167: invokeinterface d : (Ljava/lang/Object;)V
    //   172: iload #11
    //   174: ireturn
    //   175: aload_3
    //   176: ifnull -> 183
    //   179: aload_3
    //   180: invokevirtual close : ()V
    //   183: aload_0
    //   184: getfield a : Lcom/bumptech/glide/load/engine/x/b;
    //   187: aload #4
    //   189: invokeinterface d : (Ljava/lang/Object;)V
    //   194: goto -> 199
    //   197: aload_1
    //   198: athrow
    //   199: goto -> 197
    //   202: astore_1
    //   203: goto -> 161
    //   206: astore_2
    //   207: goto -> 183
    // Exception table:
    //   from	to	target	type
    //   33	38	115	java/io/IOException
    //   33	38	111	finally
    //   41	47	115	java/io/IOException
    //   41	47	111	finally
    //   47	55	104	java/io/IOException
    //   47	55	97	finally
    //   61	71	104	java/io/IOException
    //   61	71	97	finally
    //   74	79	104	java/io/IOException
    //   74	79	97	finally
    //   85	90	202	java/io/IOException
    //   121	130	111	finally
    //   132	141	111	finally
    //   153	157	202	java/io/IOException
    //   179	183	206	java/io/IOException
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */