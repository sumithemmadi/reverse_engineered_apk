package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.p.f;
import com.bumptech.glide.p.j;
import com.bumptech.glide.p.k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class l {
  public static final d<DecodeFormat> a = d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.d);
  
  public static final d<PreferredColorSpace> b = d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.b);
  
  @Deprecated
  public static final d<DownsampleStrategy> c = DownsampleStrategy.h;
  
  public static final d<Boolean> d;
  
  public static final d<Boolean> e;
  
  private static final Set<String> f = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(new String[] { "image/vnd.wap.wbmp", "image/x-ico" })));
  
  private static final b g = new a();
  
  private static final Set<ImageHeaderParser.ImageType> h = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
  
  private static final Queue<BitmapFactory.Options> i = k.e(0);
  
  private final e j;
  
  private final DisplayMetrics k;
  
  private final com.bumptech.glide.load.engine.x.b l;
  
  private final List<ImageHeaderParser> m;
  
  private final q n = q.b();
  
  public l(List<ImageHeaderParser> paramList, DisplayMetrics paramDisplayMetrics, e parame, com.bumptech.glide.load.engine.x.b paramb) {
    this.m = paramList;
    this.k = (DisplayMetrics)j.d(paramDisplayMetrics);
    this.j = (e)j.d(parame);
    this.l = (com.bumptech.glide.load.engine.x.b)j.d(paramb);
  }
  
  private static int a(double paramDouble) {
    int i = l(paramDouble);
    double d1 = i;
    Double.isNaN(d1);
    int j = x(d1 * paramDouble);
    d1 = (j / i);
    Double.isNaN(d1);
    d1 = paramDouble / d1;
    paramDouble = j;
    Double.isNaN(paramDouble);
    return x(d1 * paramDouble);
  }
  
  private void b(r paramr, DecodeFormat paramDecodeFormat, boolean paramBoolean1, boolean paramBoolean2, BitmapFactory.Options paramOptions, int paramInt1, int paramInt2) {
    Bitmap.Config config;
    if (this.n.i(paramInt1, paramInt2, paramOptions, paramBoolean1, paramBoolean2))
      return; 
    if (paramDecodeFormat == DecodeFormat.b || Build.VERSION.SDK_INT == 16) {
      paramOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
      return;
    } 
    paramBoolean2 = false;
    try {
      paramBoolean1 = paramr.d().hasAlpha();
    } catch (IOException iOException) {
      paramBoolean1 = paramBoolean2;
      if (Log.isLoggable("Downsampler", 3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot determine whether the image has alpha or not from header, format ");
        stringBuilder.append(paramDecodeFormat);
        Log.d("Downsampler", stringBuilder.toString(), iOException);
        paramBoolean1 = paramBoolean2;
      } 
    } 
    if (paramBoolean1) {
      config = Bitmap.Config.ARGB_8888;
    } else {
      config = Bitmap.Config.RGB_565;
    } 
    paramOptions.inPreferredConfig = config;
    if (config == Bitmap.Config.RGB_565)
      paramOptions.inDither = true; 
  }
  
  private static void c(ImageHeaderParser.ImageType paramImageType, r paramr, b paramb, e parame, DownsampleStrategy paramDownsampleStrategy, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, BitmapFactory.Options paramOptions) {
    StringBuilder stringBuilder;
    int i;
    int j;
    int k;
    if (paramInt2 <= 0 || paramInt3 <= 0) {
      if (Log.isLoggable("Downsampler", 3)) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to determine dimensions for: ");
        stringBuilder.append(paramImageType);
        stringBuilder.append(" with target [");
        stringBuilder.append(paramInt4);
        stringBuilder.append("x");
        stringBuilder.append(paramInt5);
        stringBuilder.append("]");
        Log.d("Downsampler", stringBuilder.toString());
      } 
      return;
    } 
    if (r(paramInt1)) {
      i = paramInt2;
      j = paramInt3;
    } else {
      j = paramInt2;
      i = paramInt3;
    } 
    float f = paramDownsampleStrategy.b(j, i, paramInt4, paramInt5);
    if (f > 0.0F) {
      DownsampleStrategy.SampleSizeRounding sampleSizeRounding = paramDownsampleStrategy.a(j, i, paramInt4, paramInt5);
      if (sampleSizeRounding != null) {
        float f1 = j;
        k = x((f * f1));
        float f2 = i;
        int m = x((f * f2));
        k = j / k;
        m = i / m;
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding1 = DownsampleStrategy.SampleSizeRounding.b;
        if (sampleSizeRounding == sampleSizeRounding1) {
          k = Math.max(k, m);
        } else {
          k = Math.min(k, m);
        } 
        int n = Build.VERSION.SDK_INT;
        if (n <= 23 && f.contains(paramOptions.outMimeType)) {
          m = 1;
        } else {
          m = Math.max(1, Integer.highestOneBit(k));
          k = m;
          if (sampleSizeRounding == sampleSizeRounding1) {
            k = m;
            if (m < 1.0F / f)
              k = m << 1; 
          } 
          m = k;
        } 
        paramOptions.inSampleSize = m;
        if (paramImageType == ImageHeaderParser.ImageType.JPEG) {
          float f3 = Math.min(m, 8);
          int i1 = (int)Math.ceil((f1 / f3));
          j = (int)Math.ceil((f2 / f3));
          int i2 = m / 8;
          k = j;
          i = i1;
          if (i2 > 0) {
            i = i1 / i2;
            k = j / i2;
          } 
        } else {
          double d2;
          if (paramImageType == ImageHeaderParser.ImageType.PNG || paramImageType == ImageHeaderParser.ImageType.PNG_A) {
            float f3 = m;
            i = (int)Math.floor((f1 / f3));
            d2 = Math.floor((f2 / f3));
          } else {
            if (paramImageType == ImageHeaderParser.ImageType.WEBP || paramImageType == ImageHeaderParser.ImageType.WEBP_A) {
              if (n >= 24) {
                float f3 = m;
                i = Math.round(f1 / f3);
                k = Math.round(f2 / f3);
              } else {
                float f3 = m;
                i = (int)Math.floor((f1 / f3));
                double d3 = Math.floor((f2 / f3));
                k = (int)d3;
              } 
            } else if (j % m != 0 || i % m != 0) {
              int[] arrayOfInt = m((r)stringBuilder, paramOptions, paramb, parame);
              i = arrayOfInt[0];
              k = arrayOfInt[1];
            } else {
              j /= m;
              k = i / m;
              i = j;
            } 
            d2 = paramDownsampleStrategy.b(i, k, paramInt4, paramInt5);
          } 
          k = (int)d2;
        } 
      } else {
        throw new IllegalArgumentException("Cannot round with null rounding");
      } 
    } else {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Cannot scale with factor: ");
      stringBuilder1.append(f);
      stringBuilder1.append(" from: ");
      stringBuilder1.append(paramDownsampleStrategy);
      stringBuilder1.append(", source: [");
      stringBuilder1.append(paramInt2);
      stringBuilder1.append("x");
      stringBuilder1.append(paramInt3);
      stringBuilder1.append("], target: [");
      stringBuilder1.append(paramInt4);
      stringBuilder1.append("x");
      stringBuilder1.append(paramInt5);
      stringBuilder1.append("]");
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    double d1 = paramDownsampleStrategy.b(i, k, paramInt4, paramInt5);
  }
  
  private s<Bitmap> e(r paramr, int paramInt1, int paramInt2, e parame, b paramb) {
    boolean bool1;
    byte[] arrayOfByte = (byte[])this.l.e(65536, byte[].class);
    BitmapFactory.Options options = k();
    options.inTempStorage = arrayOfByte;
    DecodeFormat decodeFormat = (DecodeFormat)parame.c(a);
    PreferredColorSpace preferredColorSpace = (PreferredColorSpace)parame.c(b);
    DownsampleStrategy downsampleStrategy = (DownsampleStrategy)parame.c(DownsampleStrategy.h);
    boolean bool = ((Boolean)parame.c(d)).booleanValue();
    d<Boolean> d1 = e;
    if (parame.c(d1) != null && ((Boolean)parame.c(d1)).booleanValue()) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    try {
      return e.e(h(paramr, options, downsampleStrategy, decodeFormat, preferredColorSpace, bool1, paramInt1, paramInt2, bool, paramb), this.j);
    } finally {
      v(options);
      this.l.d(arrayOfByte);
    } 
  }
  
  private Bitmap h(r paramr, BitmapFactory.Options paramOptions, DownsampleStrategy paramDownsampleStrategy, DecodeFormat paramDecodeFormat, PreferredColorSpace paramPreferredColorSpace, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, b paramb) {
    Bitmap bitmap1;
    int n;
    long l2 = f.b();
    int[] arrayOfInt = m(paramr, paramOptions, paramb, this.j);
    boolean bool = false;
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    String str = paramOptions.outMimeType;
    if (i == -1 || j == -1)
      paramBoolean1 = false; 
    int k = paramr.a();
    int m = x.j(k);
    boolean bool1 = x.m(k);
    if (paramInt1 == Integer.MIN_VALUE) {
      if (r(m)) {
        n = j;
      } else {
        n = i;
      } 
    } else {
      n = paramInt1;
    } 
    int i1 = paramInt2;
    if (i1 == Integer.MIN_VALUE)
      if (r(m)) {
        i1 = i;
      } else {
        i1 = j;
      }  
    ImageHeaderParser.ImageType imageType = paramr.d();
    c(imageType, paramr, paramb, this.j, paramDownsampleStrategy, m, i, j, n, i1, paramOptions);
    b(paramr, paramDecodeFormat, paramBoolean1, bool1, paramOptions, n, i1);
    int i2 = Build.VERSION.SDK_INT;
    if (i2 >= 19) {
      m = 1;
    } else {
      m = 0;
    } 
    if (paramOptions.inSampleSize == 1 || m != 0) {
      l l3 = this;
      if (l3.z(imageType)) {
        if (i < 0 || j < 0 || !paramBoolean2 || m == 0) {
          float f1;
          if (s(paramOptions)) {
            f1 = paramOptions.inTargetDensity / paramOptions.inDensity;
          } else {
            f1 = 1.0F;
          } 
          int i3 = paramOptions.inSampleSize;
          float f2 = i;
          float f3 = i3;
          i1 = (int)Math.ceil((f2 / f3));
          n = (int)Math.ceil((j / f3));
          m = Math.round(i1 * f1);
          int i4 = Math.round(n * f1);
          n = m;
          i1 = i4;
          if (Log.isLoggable("Downsampler", 2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Calculated target [");
            stringBuilder.append(m);
            stringBuilder.append("x");
            stringBuilder.append(i4);
            stringBuilder.append("] for source [");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(j);
            stringBuilder.append("], sampleSize: ");
            stringBuilder.append(i3);
            stringBuilder.append(", targetDensity: ");
            stringBuilder.append(paramOptions.inTargetDensity);
            stringBuilder.append(", density: ");
            stringBuilder.append(paramOptions.inDensity);
            stringBuilder.append(", density multiplier: ");
            stringBuilder.append(f1);
            Log.v("Downsampler", stringBuilder.toString());
            i1 = i4;
            n = m;
          } 
        } 
        if (n > 0 && i1 > 0)
          y(paramOptions, l3.j, n, i1); 
      } 
    } 
    l l1 = this;
    if (i2 >= 28) {
      ColorSpace.Named named;
      n = bool;
      if (paramPreferredColorSpace == PreferredColorSpace.c) {
        ColorSpace colorSpace = paramOptions.outColorSpace;
        n = bool;
        if (colorSpace != null) {
          n = bool;
          if (colorSpace.isWideGamut())
            n = 1; 
        } 
      } 
      if (n != 0) {
        named = ColorSpace.Named.DISPLAY_P3;
      } else {
        named = ColorSpace.Named.SRGB;
      } 
      paramOptions.inPreferredColorSpace = ColorSpace.get(named);
    } else if (i2 >= 26) {
      paramOptions.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
    } 
    Bitmap bitmap2 = i(paramr, paramOptions, paramb, l1.j);
    paramb.a(l1.j, bitmap2);
    if (Log.isLoggable("Downsampler", 2))
      t(i, j, str, paramOptions, bitmap2, paramInt1, paramInt2, l2); 
    paramr = null;
    if (bitmap2 != null) {
      bitmap2.setDensity(l1.k.densityDpi);
      Bitmap bitmap = x.n(l1.j, bitmap2, k);
      bitmap1 = bitmap;
      if (!bitmap2.equals(bitmap)) {
        l1.j.c(bitmap2);
        bitmap1 = bitmap;
      } 
    } 
    return bitmap1;
  }
  
  private static Bitmap i(r paramr, BitmapFactory.Options paramOptions, b paramb, e parame) {
    if (!paramOptions.inJustDecodeBounds) {
      paramb.b();
      paramr.c();
    } 
    int i = paramOptions.outWidth;
    int j = paramOptions.outHeight;
    String str = paramOptions.outMimeType;
    x.i().lock();
    try {
      Bitmap bitmap = paramr.b(paramOptions);
      x.i().unlock();
      return bitmap;
    } catch (IllegalArgumentException illegalArgumentException) {
      IOException iOException = u(illegalArgumentException, i, j, str, paramOptions);
      if (Log.isLoggable("Downsampler", 3))
        Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException); 
      Bitmap bitmap = paramOptions.inBitmap;
      if (bitmap != null)
        try {
          parame.c(bitmap);
          paramOptions.inBitmap = null;
          Bitmap bitmap1 = i(paramr, paramOptions, paramb, parame);
          x.i().unlock();
          return bitmap1;
        } catch (IOException iOException1) {
          throw iOException;
        }  
      throw iOException;
    } finally {}
    x.i().unlock();
    throw paramr;
  }
  
  @TargetApi(19)
  private static String j(Bitmap paramBitmap) {
    String str;
    if (paramBitmap == null)
      return null; 
    if (Build.VERSION.SDK_INT >= 19) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(" (");
      stringBuilder1.append(paramBitmap.getAllocationByteCount());
      stringBuilder1.append(")");
      str = stringBuilder1.toString();
    } else {
      str = "";
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    stringBuilder.append(paramBitmap.getWidth());
    stringBuilder.append("x");
    stringBuilder.append(paramBitmap.getHeight());
    stringBuilder.append("] ");
    stringBuilder.append(paramBitmap.getConfig());
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  private static BitmapFactory.Options k() {
    // Byte code:
    //   0: ldc com/bumptech/glide/load/resource/bitmap/l
    //   2: monitorenter
    //   3: getstatic com/bumptech/glide/load/resource/bitmap/l.i : Ljava/util/Queue;
    //   6: astore_0
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: invokeinterface poll : ()Ljava/lang/Object;
    //   15: checkcast android/graphics/BitmapFactory$Options
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: astore_0
    //   23: aload_1
    //   24: ifnonnull -> 39
    //   27: new android/graphics/BitmapFactory$Options
    //   30: astore_0
    //   31: aload_0
    //   32: invokespecial <init> : ()V
    //   35: aload_0
    //   36: invokestatic w : (Landroid/graphics/BitmapFactory$Options;)V
    //   39: ldc com/bumptech/glide/load/resource/bitmap/l
    //   41: monitorexit
    //   42: aload_0
    //   43: areturn
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    //   49: astore_0
    //   50: ldc com/bumptech/glide/load/resource/bitmap/l
    //   52: monitorexit
    //   53: aload_0
    //   54: athrow
    // Exception table:
    //   from	to	target	type
    //   3	9	49	finally
    //   9	21	44	finally
    //   27	39	49	finally
    //   45	47	44	finally
    //   47	49	49	finally
  }
  
  private static int l(double paramDouble) {
    if (paramDouble > 1.0D)
      paramDouble = 1.0D / paramDouble; 
    return (int)Math.round(paramDouble * 2.147483647E9D);
  }
  
  private static int[] m(r paramr, BitmapFactory.Options paramOptions, b paramb, e parame) {
    paramOptions.inJustDecodeBounds = true;
    i(paramr, paramOptions, paramb, parame);
    paramOptions.inJustDecodeBounds = false;
    return new int[] { paramOptions.outWidth, paramOptions.outHeight };
  }
  
  private static String n(BitmapFactory.Options paramOptions) {
    return j(paramOptions.inBitmap);
  }
  
  private static boolean r(int paramInt) {
    return (paramInt == 90 || paramInt == 270);
  }
  
  private static boolean s(BitmapFactory.Options paramOptions) {
    int i = paramOptions.inTargetDensity;
    if (i > 0) {
      int j = paramOptions.inDensity;
      if (j > 0 && i != j)
        return true; 
    } 
    return false;
  }
  
  private static void t(int paramInt1, int paramInt2, String paramString, BitmapFactory.Options paramOptions, Bitmap paramBitmap, int paramInt3, int paramInt4, long paramLong) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Decoded ");
    stringBuilder.append(j(paramBitmap));
    stringBuilder.append(" from [");
    stringBuilder.append(paramInt1);
    stringBuilder.append("x");
    stringBuilder.append(paramInt2);
    stringBuilder.append("] ");
    stringBuilder.append(paramString);
    stringBuilder.append(" with inBitmap ");
    stringBuilder.append(n(paramOptions));
    stringBuilder.append(" for [");
    stringBuilder.append(paramInt3);
    stringBuilder.append("x");
    stringBuilder.append(paramInt4);
    stringBuilder.append("], sample size: ");
    stringBuilder.append(paramOptions.inSampleSize);
    stringBuilder.append(", density: ");
    stringBuilder.append(paramOptions.inDensity);
    stringBuilder.append(", target density: ");
    stringBuilder.append(paramOptions.inTargetDensity);
    stringBuilder.append(", thread: ");
    stringBuilder.append(Thread.currentThread().getName());
    stringBuilder.append(", duration: ");
    stringBuilder.append(f.a(paramLong));
    Log.v("Downsampler", stringBuilder.toString());
  }
  
  private static IOException u(IllegalArgumentException paramIllegalArgumentException, int paramInt1, int paramInt2, String paramString, BitmapFactory.Options paramOptions) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Exception decoding bitmap, outWidth: ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(", outHeight: ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(", outMimeType: ");
    stringBuilder.append(paramString);
    stringBuilder.append(", inBitmap: ");
    stringBuilder.append(n(paramOptions));
    return new IOException(stringBuilder.toString(), paramIllegalArgumentException);
  }
  
  private static void v(BitmapFactory.Options paramOptions) {
    w(paramOptions);
    synchronized (i) {
      null.offer(paramOptions);
      return;
    } 
  }
  
  private static void w(BitmapFactory.Options paramOptions) {
    paramOptions.inTempStorage = null;
    paramOptions.inDither = false;
    paramOptions.inScaled = false;
    paramOptions.inSampleSize = 1;
    paramOptions.inPreferredConfig = null;
    paramOptions.inJustDecodeBounds = false;
    paramOptions.inDensity = 0;
    paramOptions.inTargetDensity = 0;
    if (Build.VERSION.SDK_INT >= 26) {
      paramOptions.inPreferredColorSpace = null;
      paramOptions.outColorSpace = null;
      paramOptions.outConfig = null;
    } 
    paramOptions.outWidth = 0;
    paramOptions.outHeight = 0;
    paramOptions.outMimeType = null;
    paramOptions.inBitmap = null;
    paramOptions.inMutable = true;
  }
  
  private static int x(double paramDouble) {
    return (int)(paramDouble + 0.5D);
  }
  
  @TargetApi(26)
  private static void y(BitmapFactory.Options paramOptions, e parame, int paramInt1, int paramInt2) {
    Bitmap.Config config1;
    if (Build.VERSION.SDK_INT >= 26) {
      if (paramOptions.inPreferredConfig == Bitmap.Config.HARDWARE)
        return; 
      config1 = paramOptions.outConfig;
    } else {
      config1 = null;
    } 
    Bitmap.Config config2 = config1;
    if (config1 == null)
      config2 = paramOptions.inPreferredConfig; 
    paramOptions.inBitmap = parame.e(paramInt1, paramInt2, config2);
  }
  
  private boolean z(ImageHeaderParser.ImageType paramImageType) {
    return (Build.VERSION.SDK_INT >= 19) ? true : h.contains(paramImageType);
  }
  
  public s<Bitmap> d(ParcelFileDescriptor paramParcelFileDescriptor, int paramInt1, int paramInt2, e parame) {
    return e(new r.b(paramParcelFileDescriptor, this.m, this.l), paramInt1, paramInt2, parame, g);
  }
  
  public s<Bitmap> f(InputStream paramInputStream, int paramInt1, int paramInt2, e parame) {
    return g(paramInputStream, paramInt1, paramInt2, parame, g);
  }
  
  public s<Bitmap> g(InputStream paramInputStream, int paramInt1, int paramInt2, e parame, b paramb) {
    return e(new r.a(paramInputStream, this.m, this.l), paramInt1, paramInt2, parame, paramb);
  }
  
  public boolean o(ParcelFileDescriptor paramParcelFileDescriptor) {
    return ParcelFileDescriptorRewinder.c();
  }
  
  public boolean p(InputStream paramInputStream) {
    return true;
  }
  
  public boolean q(ByteBuffer paramByteBuffer) {
    return true;
  }
  
  static {
    Boolean bool = Boolean.FALSE;
    d = d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
    e = d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
  }
  
  class a implements b {
    public void a(e param1e, Bitmap param1Bitmap) {}
    
    public void b() {}
  }
  
  public static interface b {
    void a(e param1e, Bitmap param1Bitmap);
    
    void b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */