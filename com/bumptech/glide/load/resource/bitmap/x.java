package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.x.e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class x {
  static {
    HashSet<String> hashSet = new HashSet(Arrays.asList((Object[])new String[] { 
            "XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", 
            "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", 
            "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079" }));
    d = hashSet;
    if (hashSet.contains(Build.MODEL)) {
      ReentrantLock reentrantLock = new ReentrantLock();
    } else {
      a = new a();
    } 
    e = a;
    Paint paint = new Paint(7);
    c = paint;
    paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
  }
  
  private static void a(Bitmap paramBitmap1, Bitmap paramBitmap2, Matrix paramMatrix) {
    Lock lock = e;
    lock.lock();
    try {
      Canvas canvas = new Canvas();
      this(paramBitmap2);
      canvas.drawBitmap(paramBitmap1, paramMatrix, a);
      e(canvas);
      return;
    } finally {
      e.unlock();
    } 
  }
  
  public static Bitmap b(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2) {
    float f2;
    float f3;
    if (paramBitmap.getWidth() == paramInt1 && paramBitmap.getHeight() == paramInt2)
      return paramBitmap; 
    Matrix matrix = new Matrix();
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f1 = 0.0F;
    if (i * paramInt2 > j * paramInt1) {
      f2 = paramInt2 / paramBitmap.getHeight();
      f1 = (paramInt1 - paramBitmap.getWidth() * f2) * 0.5F;
      f3 = 0.0F;
    } else {
      f2 = paramInt1 / paramBitmap.getWidth();
      f3 = (paramInt2 - paramBitmap.getHeight() * f2) * 0.5F;
    } 
    matrix.setScale(f2, f2);
    matrix.postTranslate((int)(f1 + 0.5F), (int)(f3 + 0.5F));
    Bitmap bitmap = parame.d(paramInt1, paramInt2, k(paramBitmap));
    o(paramBitmap, bitmap);
    a(paramBitmap, bitmap, matrix);
    return bitmap;
  }
  
  public static Bitmap c(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2) {
    if (paramBitmap.getWidth() <= paramInt1 && paramBitmap.getHeight() <= paramInt2) {
      if (Log.isLoggable("TransformationUtils", 2))
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input"); 
      return paramBitmap;
    } 
    if (Log.isLoggable("TransformationUtils", 2))
      Log.v("TransformationUtils", "requested target size too big for input, fit centering instead"); 
    return f(parame, paramBitmap, paramInt1, paramInt2);
  }
  
  public static Bitmap d(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2) {
    paramInt2 = Math.min(paramInt1, paramInt2);
    float f1 = paramInt2;
    float f2 = f1 / 2.0F;
    paramInt1 = paramBitmap.getWidth();
    int i = paramBitmap.getHeight();
    float f3 = paramInt1;
    float f4 = f1 / f3;
    float f5 = i;
    f4 = Math.max(f4, f1 / f5);
    f3 *= f4;
    f5 = f4 * f5;
    f4 = (f1 - f3) / 2.0F;
    f1 = (f1 - f5) / 2.0F;
    RectF rectF = new RectF(f4, f1, f3 + f4, f5 + f1);
    Bitmap bitmap1 = g(parame, paramBitmap);
    Bitmap bitmap2 = parame.d(paramInt2, paramInt2, h(paramBitmap));
    bitmap2.setHasAlpha(true);
    Lock lock = e;
    lock.lock();
    try {
      Canvas canvas = new Canvas();
      this(bitmap2);
      canvas.drawCircle(f2, f2, f2, b);
      canvas.drawBitmap(bitmap1, null, rectF, c);
      e(canvas);
      lock.unlock();
      return bitmap2;
    } finally {
      e.unlock();
    } 
  }
  
  private static void e(Canvas paramCanvas) {
    paramCanvas.setBitmap(null);
  }
  
  public static Bitmap f(e parame, Bitmap paramBitmap, int paramInt1, int paramInt2) {
    if (paramBitmap.getWidth() == paramInt1 && paramBitmap.getHeight() == paramInt2) {
      if (Log.isLoggable("TransformationUtils", 2))
        Log.v("TransformationUtils", "requested target size matches input, returning input"); 
      return paramBitmap;
    } 
    float f = Math.min(paramInt1 / paramBitmap.getWidth(), paramInt2 / paramBitmap.getHeight());
    int i = Math.round(paramBitmap.getWidth() * f);
    int j = Math.round(paramBitmap.getHeight() * f);
    if (paramBitmap.getWidth() == i && paramBitmap.getHeight() == j) {
      if (Log.isLoggable("TransformationUtils", 2))
        Log.v("TransformationUtils", "adjusted target size matches input, returning input"); 
      return paramBitmap;
    } 
    Bitmap bitmap = parame.d((int)(paramBitmap.getWidth() * f), (int)(paramBitmap.getHeight() * f), k(paramBitmap));
    o(paramBitmap, bitmap);
    if (Log.isLoggable("TransformationUtils", 2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("request: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append("x");
      stringBuilder.append(paramInt2);
      Log.v("TransformationUtils", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("toFit:   ");
      stringBuilder.append(paramBitmap.getWidth());
      stringBuilder.append("x");
      stringBuilder.append(paramBitmap.getHeight());
      Log.v("TransformationUtils", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("toReuse: ");
      stringBuilder.append(bitmap.getWidth());
      stringBuilder.append("x");
      stringBuilder.append(bitmap.getHeight());
      Log.v("TransformationUtils", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("minPct:   ");
      stringBuilder.append(f);
      Log.v("TransformationUtils", stringBuilder.toString());
    } 
    Matrix matrix = new Matrix();
    matrix.setScale(f, f);
    a(paramBitmap, bitmap, matrix);
    return bitmap;
  }
  
  private static Bitmap g(e parame, Bitmap paramBitmap) {
    Bitmap.Config config = h(paramBitmap);
    if (config.equals(paramBitmap.getConfig()))
      return paramBitmap; 
    Bitmap bitmap = parame.d(paramBitmap.getWidth(), paramBitmap.getHeight(), config);
    (new Canvas(bitmap)).drawBitmap(paramBitmap, 0.0F, 0.0F, null);
    return bitmap;
  }
  
  private static Bitmap.Config h(Bitmap paramBitmap) {
    return (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(paramBitmap.getConfig())) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
  }
  
  public static Lock i() {
    return e;
  }
  
  public static int j(int paramInt) {
    switch (paramInt) {
      default:
        return 0;
      case 7:
      case 8:
        return 270;
      case 5:
      case 6:
        return 90;
      case 3:
      case 4:
        break;
    } 
    return 180;
  }
  
  private static Bitmap.Config k(Bitmap paramBitmap) {
    Bitmap.Config config;
    if (paramBitmap.getConfig() != null) {
      config = paramBitmap.getConfig();
    } else {
      config = Bitmap.Config.ARGB_8888;
    } 
    return config;
  }
  
  static void l(int paramInt, Matrix paramMatrix) {
    switch (paramInt) {
      default:
        return;
      case 8:
        paramMatrix.setRotate(-90.0F);
      case 7:
        paramMatrix.setRotate(-90.0F);
        paramMatrix.postScale(-1.0F, 1.0F);
      case 6:
        paramMatrix.setRotate(90.0F);
      case 5:
        paramMatrix.setRotate(90.0F);
        paramMatrix.postScale(-1.0F, 1.0F);
      case 4:
        paramMatrix.setRotate(180.0F);
        paramMatrix.postScale(-1.0F, 1.0F);
      case 3:
        paramMatrix.setRotate(180.0F);
      case 2:
        break;
    } 
    paramMatrix.setScale(-1.0F, 1.0F);
  }
  
  public static boolean m(int paramInt) {
    switch (paramInt) {
      default:
        return false;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
        break;
    } 
    return true;
  }
  
  public static Bitmap n(e parame, Bitmap paramBitmap, int paramInt) {
    if (!m(paramInt))
      return paramBitmap; 
    Matrix matrix = new Matrix();
    l(paramInt, matrix);
    RectF rectF = new RectF(0.0F, 0.0F, paramBitmap.getWidth(), paramBitmap.getHeight());
    matrix.mapRect(rectF);
    Bitmap bitmap = parame.d(Math.round(rectF.width()), Math.round(rectF.height()), k(paramBitmap));
    matrix.postTranslate(-rectF.left, -rectF.top);
    bitmap.setHasAlpha(paramBitmap.hasAlpha());
    a(paramBitmap, bitmap, matrix);
    return bitmap;
  }
  
  public static void o(Bitmap paramBitmap1, Bitmap paramBitmap2) {
    paramBitmap2.setHasAlpha(paramBitmap1.hasAlpha());
  }
  
  static {
    a a;
  }
  
  private static final Paint a = new Paint(6);
  
  private static final Paint b = new Paint(7);
  
  private static final Paint c;
  
  private static final Set<String> d;
  
  private static final Lock e;
  
  private static final class a implements Lock {
    public void lock() {}
    
    public void lockInterruptibly() {}
    
    public Condition newCondition() {
      throw new UnsupportedOperationException("Should not be called");
    }
    
    public boolean tryLock() {
      return true;
    }
    
    public boolean tryLock(long param1Long, TimeUnit param1TimeUnit) {
      return true;
    }
    
    public void unlock() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */