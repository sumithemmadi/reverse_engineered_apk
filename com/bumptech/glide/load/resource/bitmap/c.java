package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.g;
import java.io.File;

public class c implements g<Bitmap> {
  public static final d<Integer> a = d.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
  
  public static final d<Bitmap.CompressFormat> b = d.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
  
  private final b c;
  
  public c(b paramb) {
    this.c = paramb;
  }
  
  private Bitmap.CompressFormat d(Bitmap paramBitmap, e parame) {
    Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat)parame.c(b);
    return (compressFormat != null) ? compressFormat : (paramBitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG);
  }
  
  public EncodeStrategy b(e parame) {
    return EncodeStrategy.c;
  }
  
  public boolean c(s<Bitmap> params, File paramFile, e parame) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface get : ()Ljava/lang/Object;
    //   6: checkcast android/graphics/Bitmap
    //   9: astore #4
    //   11: aload_0
    //   12: aload #4
    //   14: aload_3
    //   15: invokespecial d : (Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/e;)Landroid/graphics/Bitmap$CompressFormat;
    //   18: astore #5
    //   20: ldc 'encode: [%dx%d] %s'
    //   22: aload #4
    //   24: invokevirtual getWidth : ()I
    //   27: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   30: aload #4
    //   32: invokevirtual getHeight : ()I
    //   35: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   38: aload #5
    //   40: invokestatic c : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   43: invokestatic b : ()J
    //   46: lstore #6
    //   48: aload_3
    //   49: getstatic com/bumptech/glide/load/resource/bitmap/c.a : Lcom/bumptech/glide/load/d;
    //   52: invokevirtual c : (Lcom/bumptech/glide/load/d;)Ljava/lang/Object;
    //   55: checkcast java/lang/Integer
    //   58: invokevirtual intValue : ()I
    //   61: istore #8
    //   63: iconst_0
    //   64: istore #9
    //   66: iconst_0
    //   67: istore #10
    //   69: aconst_null
    //   70: astore #11
    //   72: aconst_null
    //   73: astore #12
    //   75: aload #12
    //   77: astore #13
    //   79: aload #11
    //   81: astore #14
    //   83: new java/io/FileOutputStream
    //   86: astore_1
    //   87: aload #12
    //   89: astore #13
    //   91: aload #11
    //   93: astore #14
    //   95: aload_1
    //   96: aload_2
    //   97: invokespecial <init> : (Ljava/io/File;)V
    //   100: aload_0
    //   101: getfield c : Lcom/bumptech/glide/load/engine/x/b;
    //   104: ifnull -> 125
    //   107: new com/bumptech/glide/load/data/c
    //   110: astore_2
    //   111: aload_2
    //   112: aload_1
    //   113: aload_0
    //   114: getfield c : Lcom/bumptech/glide/load/engine/x/b;
    //   117: invokespecial <init> : (Ljava/io/OutputStream;Lcom/bumptech/glide/load/engine/x/b;)V
    //   120: aload_2
    //   121: astore_1
    //   122: goto -> 125
    //   125: aload_1
    //   126: astore #13
    //   128: aload_1
    //   129: astore #14
    //   131: aload #4
    //   133: aload #5
    //   135: iload #8
    //   137: aload_1
    //   138: invokevirtual compress : (Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   141: pop
    //   142: aload_1
    //   143: astore #13
    //   145: aload_1
    //   146: astore #14
    //   148: aload_1
    //   149: invokevirtual close : ()V
    //   152: iconst_1
    //   153: istore #9
    //   155: aload_1
    //   156: invokevirtual close : ()V
    //   159: goto -> 218
    //   162: astore_2
    //   163: aload_1
    //   164: astore #13
    //   166: aload_2
    //   167: astore_1
    //   168: goto -> 335
    //   171: astore_2
    //   172: goto -> 183
    //   175: astore_1
    //   176: goto -> 335
    //   179: astore_2
    //   180: aload #14
    //   182: astore_1
    //   183: aload_1
    //   184: astore #13
    //   186: ldc 'BitmapEncoder'
    //   188: iconst_3
    //   189: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   192: ifeq -> 207
    //   195: aload_1
    //   196: astore #13
    //   198: ldc 'BitmapEncoder'
    //   200: ldc 'Failed to encode Bitmap'
    //   202: aload_2
    //   203: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   206: pop
    //   207: aload_1
    //   208: ifnull -> 218
    //   211: iload #10
    //   213: istore #9
    //   215: goto -> 155
    //   218: ldc 'BitmapEncoder'
    //   220: iconst_2
    //   221: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   224: ifeq -> 329
    //   227: new java/lang/StringBuilder
    //   230: astore_1
    //   231: aload_1
    //   232: invokespecial <init> : ()V
    //   235: aload_1
    //   236: ldc 'Compressed with type: '
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: aload_1
    //   243: aload #5
    //   245: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: aload_1
    //   250: ldc ' of size '
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload_1
    //   257: aload #4
    //   259: invokestatic g : (Landroid/graphics/Bitmap;)I
    //   262: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   265: pop
    //   266: aload_1
    //   267: ldc ' in '
    //   269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: pop
    //   273: aload_1
    //   274: lload #6
    //   276: invokestatic a : (J)D
    //   279: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   282: pop
    //   283: aload_1
    //   284: ldc ', options format: '
    //   286: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   289: pop
    //   290: aload_1
    //   291: aload_3
    //   292: getstatic com/bumptech/glide/load/resource/bitmap/c.b : Lcom/bumptech/glide/load/d;
    //   295: invokevirtual c : (Lcom/bumptech/glide/load/d;)Ljava/lang/Object;
    //   298: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   301: pop
    //   302: aload_1
    //   303: ldc ', hasAlpha: '
    //   305: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: pop
    //   309: aload_1
    //   310: aload #4
    //   312: invokevirtual hasAlpha : ()Z
    //   315: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   318: pop
    //   319: ldc 'BitmapEncoder'
    //   321: aload_1
    //   322: invokevirtual toString : ()Ljava/lang/String;
    //   325: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   328: pop
    //   329: invokestatic d : ()V
    //   332: iload #9
    //   334: ireturn
    //   335: aload #13
    //   337: ifnull -> 345
    //   340: aload #13
    //   342: invokevirtual close : ()V
    //   345: aload_1
    //   346: athrow
    //   347: astore_1
    //   348: invokestatic d : ()V
    //   351: goto -> 356
    //   354: aload_1
    //   355: athrow
    //   356: goto -> 354
    //   359: astore_1
    //   360: goto -> 218
    //   363: astore_2
    //   364: goto -> 345
    // Exception table:
    //   from	to	target	type
    //   43	63	347	finally
    //   83	87	179	java/io/IOException
    //   83	87	175	finally
    //   95	100	179	java/io/IOException
    //   95	100	175	finally
    //   100	120	171	java/io/IOException
    //   100	120	162	finally
    //   131	142	179	java/io/IOException
    //   131	142	175	finally
    //   148	152	179	java/io/IOException
    //   148	152	175	finally
    //   155	159	359	java/io/IOException
    //   155	159	347	finally
    //   186	195	175	finally
    //   198	207	175	finally
    //   218	329	347	finally
    //   340	345	363	java/io/IOException
    //   340	345	347	finally
    //   345	347	347	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */