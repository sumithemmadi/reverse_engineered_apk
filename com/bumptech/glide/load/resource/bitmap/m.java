package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.engine.x.f;
import java.util.concurrent.locks.Lock;

final class m {
  private static final e a = (e)new a();
  
  static s<Bitmap> a(e parame, Drawable paramDrawable, int paramInt1, int paramInt2) {
    Bitmap bitmap;
    paramDrawable = paramDrawable.getCurrent();
    boolean bool = paramDrawable instanceof BitmapDrawable;
    boolean bool1 = false;
    if (bool) {
      bitmap = ((BitmapDrawable)paramDrawable).getBitmap();
      paramInt1 = bool1;
    } else if (!(bitmap instanceof android.graphics.drawable.Animatable)) {
      bitmap = b(parame, (Drawable)bitmap, paramInt1, paramInt2);
      paramInt1 = 1;
    } else {
      bitmap = null;
      paramInt1 = bool1;
    } 
    if (paramInt1 == 0)
      parame = a; 
    return e.e(bitmap, parame);
  }
  
  private static Bitmap b(e parame, Drawable paramDrawable, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder;
    if (paramInt1 == Integer.MIN_VALUE && paramDrawable.getIntrinsicWidth() <= 0) {
      if (Log.isLoggable("DrawableToBitmap", 5)) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to draw ");
        stringBuilder.append(paramDrawable);
        stringBuilder.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
        Log.w("DrawableToBitmap", stringBuilder.toString());
      } 
      return null;
    } 
    if (paramInt2 == Integer.MIN_VALUE && paramDrawable.getIntrinsicHeight() <= 0) {
      if (Log.isLoggable("DrawableToBitmap", 5)) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to draw ");
        stringBuilder.append(paramDrawable);
        stringBuilder.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
        Log.w("DrawableToBitmap", stringBuilder.toString());
      } 
      return null;
    } 
    if (paramDrawable.getIntrinsicWidth() > 0)
      paramInt1 = paramDrawable.getIntrinsicWidth(); 
    if (paramDrawable.getIntrinsicHeight() > 0)
      paramInt2 = paramDrawable.getIntrinsicHeight(); 
    Lock lock = x.i();
    lock.lock();
    null = stringBuilder.d(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    try {
      Canvas canvas = new Canvas();
      this(null);
      paramDrawable.setBounds(0, 0, paramInt1, paramInt2);
      paramDrawable.draw(canvas);
      canvas.setBitmap(null);
      return null;
    } finally {
      lock.unlock();
    } 
  }
  
  class a extends f {
    public void c(Bitmap param1Bitmap) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */