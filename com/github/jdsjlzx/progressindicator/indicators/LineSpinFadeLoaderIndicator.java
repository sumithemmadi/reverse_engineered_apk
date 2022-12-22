package com.github.jdsjlzx.progressindicator.indicators;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class LineSpinFadeLoaderIndicator extends BallSpinFadeLoaderIndicator {
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    float f = (getWidth() / 10);
    for (byte b = 0; b < 8; b++) {
      paramCanvas.save();
      int i = getWidth();
      int j = getHeight();
      float f1 = getWidth() / 2.5F;
      double d = b;
      Double.isNaN(d);
      BallSpinFadeLoaderIndicator.Point point = circleAt(i, j, f1 - f, 0.7853981633974483D * d);
      paramCanvas.translate(point.x, point.y);
      float[] arrayOfFloat = this.scaleFloats;
      paramCanvas.scale(arrayOfFloat[b], arrayOfFloat[b]);
      paramCanvas.rotate((b * 45));
      paramPaint.setAlpha(this.alphas[b]);
      f1 = -f;
      paramCanvas.drawRoundRect(new RectF(f1, f1 / 1.5F, f * 1.5F, f / 1.5F), 5.0F, 5.0F, paramPaint);
      paramCanvas.restore();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/LineSpinFadeLoaderIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */