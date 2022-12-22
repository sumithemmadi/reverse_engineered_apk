package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class LineScalePartyIndicator extends a {
  public static final float SCALE = 1.0F;
  
  float[] scaleFloats = new float[] { 1.0F, 1.0F, 1.0F, 1.0F, 1.0F };
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    float f1 = (getWidth() / 9);
    float f2 = (getHeight() / 2);
    for (byte b = 0; b < 4; b++) {
      paramCanvas.save();
      float f3 = (b * 2 + 2);
      float f4 = f1 / 2.0F;
      paramCanvas.translate(f3 * f1 - f4, f2);
      float[] arrayOfFloat = this.scaleFloats;
      paramCanvas.scale(arrayOfFloat[b], arrayOfFloat[b]);
      paramCanvas.drawRoundRect(new RectF(-f1 / 2.0F, -getHeight() / 2.5F, f4, getHeight() / 2.5F), 5.0F, 5.0F, paramPaint);
      paramCanvas.restore();
    } 
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    for (final byte index = 0; b < 4; b++) {
      ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 1.0F, 0.4F, 1.0F });
      (new long[4])[0] = 1260L;
      (new long[4])[1] = 430L;
      (new long[4])[2] = 1010L;
      (new long[4])[3] = 730L;
      valueAnimator.setDuration((new long[4])[b]);
      valueAnimator.setRepeatCount(-1);
      (new long[4])[0] = 770L;
      (new long[4])[1] = 290L;
      (new long[4])[2] = 280L;
      (new long[4])[3] = 740L;
      valueAnimator.setStartDelay((new long[4])[b]);
      addUpdateListener(valueAnimator, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              LineScalePartyIndicator.this.scaleFloats[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              LineScalePartyIndicator.this.postInvalidate();
            }
          });
      arrayList.add(valueAnimator);
    } 
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/LineScalePartyIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */