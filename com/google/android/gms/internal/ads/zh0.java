package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.x;
import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;

public final class zh0 {
  private final x a;
  
  private final e b;
  
  private final Executor c;
  
  public zh0(x paramx, e parame, Executor paramExecutor) {
    this.a = paramx;
    this.b = parame;
    this.c = paramExecutor;
  }
  
  private final Bitmap b(byte[] paramArrayOfbyte, double paramDouble, boolean paramBoolean) {
    BitmapFactory.Options options = new BitmapFactory.Options();
    options.inDensity = (int)(paramDouble * 160.0D);
    if (!paramBoolean)
      options.inPreferredConfig = Bitmap.Config.RGB_565; 
    x<Boolean> x1 = m0.M4;
    if (((Boolean)er2.e().<Boolean>c(x1)).booleanValue()) {
      options.inJustDecodeBounds = true;
      c(paramArrayOfbyte, options);
      options.inJustDecodeBounds = false;
      int i = options.outWidth * options.outHeight;
      if (i > 0) {
        x<Integer> x2 = m0.N4;
        options.inSampleSize = 1 << (33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer)er2.e().<Integer>c(x2)).intValue())) / 2;
      } 
    } 
    return c(paramArrayOfbyte, options);
  }
  
  private final Bitmap c(byte[] paramArrayOfbyte, BitmapFactory.Options paramOptions) {
    long l1 = this.b.b();
    int i = paramArrayOfbyte.length;
    boolean bool = false;
    Bitmap bitmap = BitmapFactory.decodeByteArray(paramArrayOfbyte, 0, i, paramOptions);
    long l2 = this.b.b();
    if (Build.VERSION.SDK_INT >= 19 && bitmap != null) {
      i = bitmap.getWidth();
      int j = bitmap.getHeight();
      int k = bitmap.getAllocationByteCount();
      if (Looper.getMainLooper().getThread() == Thread.currentThread())
        bool = true; 
      StringBuilder stringBuilder = new StringBuilder(108);
      stringBuilder.append("Decoded image w: ");
      stringBuilder.append(i);
      stringBuilder.append(" h:");
      stringBuilder.append(j);
      stringBuilder.append(" bytes: ");
      stringBuilder.append(k);
      stringBuilder.append(" time: ");
      stringBuilder.append(l2 - l1);
      stringBuilder.append(" on ui thread: ");
      stringBuilder.append(bool);
      b1.m(stringBuilder.toString());
    } 
    return bitmap;
  }
  
  public final ot1<Bitmap> d(String paramString, double paramDouble, boolean paramBoolean) {
    return dt1.j(x.d(paramString), new yh0(this, paramDouble, paramBoolean), this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */