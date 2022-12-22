package com.allinone.callerid.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.resource.bitmap.e;
import java.security.MessageDigest;

public class x0 implements h<Bitmap> {
  private e b;
  
  private float c;
  
  private boolean d;
  
  private boolean e;
  
  private boolean f;
  
  private boolean g;
  
  public x0(Context paramContext, float paramFloat) {
    this.b = c.c(paramContext).f();
    this.c = paramFloat;
  }
  
  public void a(MessageDigest paramMessageDigest) {}
  
  public s<Bitmap> b(Context paramContext, s<Bitmap> params, int paramInt1, int paramInt2) {
    int i;
    Bitmap bitmap3 = (Bitmap)params.get();
    if (paramInt1 > paramInt2) {
      float f1 = paramInt2;
      float f2 = paramInt1;
      float f3 = f1 / f2;
      i = bitmap3.getWidth();
      int j = (int)(bitmap3.getWidth() * f3);
      paramInt1 = j;
      if (j > bitmap3.getHeight()) {
        f2 /= f1;
        paramInt1 = bitmap3.getHeight();
        i = (int)(bitmap3.getHeight() * f2);
      } 
    } else if (paramInt1 < paramInt2) {
      float f2 = paramInt1;
      float f1 = paramInt2;
      float f3 = f2 / f1;
      paramInt1 = bitmap3.getHeight();
      i = (int)(bitmap3.getHeight() * f3);
      if (i > bitmap3.getWidth()) {
        f2 = f1 / f2;
        i = bitmap3.getWidth();
        paramInt1 = (int)(bitmap3.getWidth() * f2);
      } 
    } else {
      i = bitmap3.getHeight();
      paramInt1 = i;
    } 
    this.c *= paramInt1 / paramInt2;
    Bitmap bitmap2 = this.b.d(i, paramInt1, Bitmap.Config.ARGB_8888);
    Bitmap bitmap1 = bitmap2;
    if (bitmap2 == null)
      bitmap1 = Bitmap.createBitmap(i, paramInt1, Bitmap.Config.ARGB_8888); 
    Canvas canvas = new Canvas(bitmap1);
    Paint paint = new Paint();
    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
    paramInt2 = (bitmap3.getWidth() - i) / 2;
    paramInt1 = (bitmap3.getHeight() - paramInt1) / 2;
    if (paramInt2 != 0 || paramInt1 != 0) {
      Matrix matrix = new Matrix();
      matrix.setTranslate(-paramInt2, -paramInt1);
      bitmapShader.setLocalMatrix(matrix);
    } 
    paint.setShader((Shader)bitmapShader);
    paint.setAntiAlias(true);
    RectF rectF = new RectF(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight());
    float f = this.c;
    canvas.drawRoundRect(rectF, f, f, paint);
    if (!this.d) {
      f = this.c;
      canvas.drawRect(0.0F, 0.0F, f, f, paint);
    } 
    if (!this.e)
      canvas.drawRect(canvas.getWidth() - this.c, 0.0F, canvas.getWidth(), this.c, paint); 
    if (!this.f) {
      f = canvas.getHeight();
      float f1 = this.c;
      canvas.drawRect(0.0F, f - f1, f1, canvas.getHeight(), paint);
    } 
    if (!this.g)
      canvas.drawRect(canvas.getWidth() - this.c, canvas.getHeight() - this.c, canvas.getWidth(), canvas.getHeight(), paint); 
    return (s<Bitmap>)e.e(bitmap1, this.b);
  }
  
  public void c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramBoolean3;
    this.g = paramBoolean4;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */