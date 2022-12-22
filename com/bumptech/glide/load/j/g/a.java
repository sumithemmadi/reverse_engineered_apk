package com.bumptech.glide.load.j.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.l.c;
import com.bumptech.glide.l.d;
import com.bumptech.glide.l.e;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.j.c;
import com.bumptech.glide.p.f;
import com.bumptech.glide.p.k;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

public class a implements f<ByteBuffer, c> {
  private static final a a = new a();
  
  private static final b b = new b();
  
  private final Context c;
  
  private final List<ImageHeaderParser> d;
  
  private final b e;
  
  private final a f;
  
  private final b g;
  
  public a(Context paramContext, List<ImageHeaderParser> paramList, e parame, com.bumptech.glide.load.engine.x.b paramb) {
    this(paramContext, paramList, parame, paramb, b, a);
  }
  
  a(Context paramContext, List<ImageHeaderParser> paramList, e parame, com.bumptech.glide.load.engine.x.b paramb, b paramb1, a parama) {
    this.c = paramContext.getApplicationContext();
    this.d = paramList;
    this.f = parama;
    this.g = new b(parame, paramb);
    this.e = paramb1;
  }
  
  private e c(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, d paramd, e parame) {
    long l = f.b();
    try {
      StringBuilder stringBuilder2;
      StringBuilder stringBuilder1;
      Bitmap.Config config;
      c c2 = paramd.c();
      if (c2.b() <= 0 || c2.c() != 0)
        return null; 
      if (parame.c(i.a) == DecodeFormat.c) {
        config = Bitmap.Config.RGB_565;
      } else {
        config = Bitmap.Config.ARGB_8888;
      } 
      int i = e(c2, paramInt1, paramInt2);
      com.bumptech.glide.l.a a1 = this.f.a(this.g, c2, (ByteBuffer)stringBuilder2, i);
      a1.e(config);
      a1.b();
      Bitmap bitmap = a1.a();
      if (bitmap == null)
        return null; 
      c c1 = c.c();
      c c = new c();
      this(this.c, (com.bumptech.glide.l.a)stringBuilder1, (h<Bitmap>)c1, paramInt1, paramInt2, bitmap);
      return new e(c);
    } finally {
      if (Log.isLoggable("BufferGifDecoder", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Decoded GIF from stream in ");
        stringBuilder.append(f.a(l));
        Log.v("BufferGifDecoder", stringBuilder.toString());
      } 
    } 
  }
  
  private static int e(c paramc, int paramInt1, int paramInt2) {
    int i = Math.min(paramc.a() / paramInt2, paramc.d() / paramInt1);
    if (i == 0) {
      i = 0;
    } else {
      i = Integer.highestOneBit(i);
    } 
    i = Math.max(1, i);
    if (Log.isLoggable("BufferGifDecoder", 2) && i > 1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Downsampling GIF, sampleSize: ");
      stringBuilder.append(i);
      stringBuilder.append(", target dimens: [");
      stringBuilder.append(paramInt1);
      stringBuilder.append("x");
      stringBuilder.append(paramInt2);
      stringBuilder.append("], actual dimens: [");
      stringBuilder.append(paramc.d());
      stringBuilder.append("x");
      stringBuilder.append(paramc.a());
      stringBuilder.append("]");
      Log.v("BufferGifDecoder", stringBuilder.toString());
    } 
    return i;
  }
  
  public e d(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, e parame) {
    d d = this.e.a(paramByteBuffer);
    try {
      return c(paramByteBuffer, paramInt1, paramInt2, d, parame);
    } finally {
      this.e.b(d);
    } 
  }
  
  public boolean f(ByteBuffer paramByteBuffer, e parame) {
    boolean bool;
    if (!((Boolean)parame.c(i.b)).booleanValue() && com.bumptech.glide.load.b.f(this.d, paramByteBuffer) == ImageHeaderParser.ImageType.GIF) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  static class a {
    com.bumptech.glide.l.a a(com.bumptech.glide.l.a.a param1a, c param1c, ByteBuffer param1ByteBuffer, int param1Int) {
      return (com.bumptech.glide.l.a)new e(param1a, param1c, param1ByteBuffer, param1Int);
    }
  }
  
  static class b {
    private final Queue<d> a = k.e(0);
    
    d a(ByteBuffer param1ByteBuffer) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield a : Ljava/util/Queue;
      //   6: invokeinterface poll : ()Ljava/lang/Object;
      //   11: checkcast com/bumptech/glide/l/d
      //   14: astore_2
      //   15: aload_2
      //   16: astore_3
      //   17: aload_2
      //   18: ifnonnull -> 29
      //   21: new com/bumptech/glide/l/d
      //   24: astore_3
      //   25: aload_3
      //   26: invokespecial <init> : ()V
      //   29: aload_3
      //   30: aload_1
      //   31: invokevirtual p : (Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/l/d;
      //   34: astore_1
      //   35: aload_0
      //   36: monitorexit
      //   37: aload_1
      //   38: areturn
      //   39: astore_1
      //   40: aload_0
      //   41: monitorexit
      //   42: aload_1
      //   43: athrow
      // Exception table:
      //   from	to	target	type
      //   2	15	39	finally
      //   21	29	39	finally
      //   29	35	39	finally
    }
    
    void b(d param1d) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_1
      //   3: invokevirtual a : ()V
      //   6: aload_0
      //   7: getfield a : Ljava/util/Queue;
      //   10: aload_1
      //   11: invokeinterface offer : (Ljava/lang/Object;)Z
      //   16: pop
      //   17: aload_0
      //   18: monitorexit
      //   19: return
      //   20: astore_1
      //   21: aload_0
      //   22: monitorexit
      //   23: aload_1
      //   24: athrow
      // Exception table:
      //   from	to	target	type
      //   2	17	20	finally
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */