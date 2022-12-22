package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

public class BallZigZagDeflectIndicator extends BallZigZagIndicator {
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    float f1 = (getWidth() / 6);
    float f2 = (getWidth() / 6);
    for (final byte index = 0; b < 2; b++) {
      ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { f1, getWidth() - f1, f1, getWidth() - f1, f1 });
      if (b == 1)
        valueAnimator1 = ValueAnimator.ofFloat(new float[] { getWidth() - f1, f1, getWidth() - f1, f1, getWidth() - f1 }); 
      ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[] { f2, f2, getHeight() - f2, getHeight() - f2, f2 });
      if (b == 1)
        valueAnimator2 = ValueAnimator.ofFloat(new float[] { getHeight() - f2, getHeight() - f2, f2, f2, getHeight() - f2 }); 
      valueAnimator1.setDuration(2000L);
      valueAnimator1.setInterpolator((TimeInterpolator)new LinearInterpolator());
      valueAnimator1.setRepeatCount(-1);
      addUpdateListener(valueAnimator1, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              BallZigZagDeflectIndicator.this.translateX[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              BallZigZagDeflectIndicator.this.postInvalidate();
            }
          });
      valueAnimator2.setDuration(2000L);
      valueAnimator2.setInterpolator((TimeInterpolator)new LinearInterpolator());
      valueAnimator2.setRepeatCount(-1);
      addUpdateListener(valueAnimator2, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              BallZigZagDeflectIndicator.this.translateY[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              BallZigZagDeflectIndicator.this.postInvalidate();
            }
          });
      arrayList.add(valueAnimator1);
      arrayList.add(valueAnimator2);
    } 
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/BallZigZagDeflectIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */