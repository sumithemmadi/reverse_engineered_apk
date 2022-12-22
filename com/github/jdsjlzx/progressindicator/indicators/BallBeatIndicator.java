package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class BallBeatIndicator extends a {
  public static final int ALPHA = 255;
  
  public static final float SCALE = 1.0F;
  
  int[] alphas = new int[] { 255, 255, 255 };
  
  private float[] scaleFloats = new float[] { 1.0F, 1.0F, 1.0F };
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    float f1 = (getWidth() - 8.0F) / 6.0F;
    float f2 = (getWidth() / 2);
    float f3 = 2.0F * f1;
    float f4 = (getHeight() / 2);
    for (byte b = 0; b < 3; b++) {
      paramCanvas.save();
      float f = b;
      paramCanvas.translate(f3 * f + f2 - f3 + 4.0F + f * 4.0F, f4);
      float[] arrayOfFloat = this.scaleFloats;
      paramCanvas.scale(arrayOfFloat[b], arrayOfFloat[b]);
      paramPaint.setAlpha(this.alphas[b]);
      paramCanvas.drawCircle(0.0F, 0.0F, f1, paramPaint);
      paramCanvas.restore();
    } 
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = 350;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 350;
    for (final byte index = 0; b < 3; b++) {
      ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { 1.0F, 0.75F, 1.0F });
      valueAnimator1.setDuration(700L);
      valueAnimator1.setRepeatCount(-1);
      valueAnimator1.setStartDelay(arrayOfInt[b]);
      addUpdateListener(valueAnimator1, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              BallBeatIndicator.this.scaleFloats[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              BallBeatIndicator.this.postInvalidate();
            }
          });
      ValueAnimator valueAnimator2 = ValueAnimator.ofInt(new int[] { 255, 51, 255 });
      valueAnimator2.setDuration(700L);
      valueAnimator2.setRepeatCount(-1);
      valueAnimator2.setStartDelay(arrayOfInt[b]);
      addUpdateListener(valueAnimator2, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              BallBeatIndicator.this.alphas[index] = ((Integer)param1ValueAnimator.getAnimatedValue()).intValue();
              BallBeatIndicator.this.postInvalidate();
            }
          });
      arrayList.add(valueAnimator1);
      arrayList.add(valueAnimator2);
    } 
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/BallBeatIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */