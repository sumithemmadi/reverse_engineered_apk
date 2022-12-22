package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class BallPulseSyncIndicator extends a {
  float[] translateYFloats = new float[3];
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    float f1 = (getWidth() - 8.0F) / 6.0F;
    float f2 = (getWidth() / 2);
    float f3 = 2.0F * f1;
    for (byte b = 0; b < 3; b++) {
      paramCanvas.save();
      float f = b;
      paramCanvas.translate(f3 * f + f2 - f3 + 4.0F + f * 4.0F, this.translateYFloats[b]);
      paramCanvas.drawCircle(0.0F, 0.0F, f1, paramPaint);
      paramCanvas.restore();
    } 
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    float f = (getWidth() - 8.0F) / 6.0F;
    for (final byte index = 0; b < 3; b++) {
      ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { (getHeight() / 2), (getHeight() / 2) - 2.0F * f, (getHeight() / 2) });
      valueAnimator.setDuration(600L);
      valueAnimator.setRepeatCount(-1);
      (new int[3])[0] = 70;
      (new int[3])[1] = 140;
      (new int[3])[2] = 210;
      valueAnimator.setStartDelay((new int[3])[b]);
      addUpdateListener(valueAnimator, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              BallPulseSyncIndicator.this.translateYFloats[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              BallPulseSyncIndicator.this.postInvalidate();
            }
          });
      arrayList.add(valueAnimator);
    } 
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/BallPulseSyncIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */