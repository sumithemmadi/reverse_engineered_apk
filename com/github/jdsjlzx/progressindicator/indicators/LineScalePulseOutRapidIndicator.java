package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.ValueAnimator;
import java.util.ArrayList;

public class LineScalePulseOutRapidIndicator extends LineScaleIndicator {
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    for (final byte index = 0; b < 5; b++) {
      ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 1.0F, 0.4F, 1.0F });
      valueAnimator.setDuration(1000L);
      valueAnimator.setRepeatCount(-1);
      (new long[5])[0] = 400L;
      (new long[5])[1] = 200L;
      (new long[5])[2] = 0L;
      (new long[5])[3] = 200L;
      (new long[5])[4] = 400L;
      valueAnimator.setStartDelay((new long[5])[b]);
      addUpdateListener(valueAnimator, new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
              LineScalePulseOutRapidIndicator.this.scaleYFloats[index] = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
              LineScalePulseOutRapidIndicator.this.postInvalidate();
            }
          });
      arrayList.add(valueAnimator);
    } 
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/LineScalePulseOutRapidIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */