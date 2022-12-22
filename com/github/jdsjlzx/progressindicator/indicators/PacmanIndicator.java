package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.github.jdsjlzx.progressindicator.a;
import java.util.ArrayList;

public class PacmanIndicator extends a {
  private int alpha;
  
  private float degrees1;
  
  private float degrees2;
  
  private float translateX;
  
  private void drawCircle(Canvas paramCanvas, Paint paramPaint) {
    float f = (getWidth() / 11);
    paramPaint.setAlpha(this.alpha);
    paramCanvas.drawCircle(this.translateX, (getHeight() / 2), f, paramPaint);
  }
  
  private void drawPacman(Canvas paramCanvas, Paint paramPaint) {
    float f1 = (getWidth() / 2);
    float f2 = (getHeight() / 2);
    paramCanvas.save();
    paramCanvas.translate(f1, f2);
    paramCanvas.rotate(this.degrees1);
    paramPaint.setAlpha(255);
    float f3 = -f1 / 1.7F;
    float f4 = -f2 / 1.7F;
    float f5 = f1 / 1.7F;
    float f6 = f2 / 1.7F;
    paramCanvas.drawArc(new RectF(f3, f4, f5, f6), 0.0F, 270.0F, true, paramPaint);
    paramCanvas.restore();
    paramCanvas.save();
    paramCanvas.translate(f1, f2);
    paramCanvas.rotate(this.degrees2);
    paramPaint.setAlpha(255);
    paramCanvas.drawArc(new RectF(f3, f4, f5, f6), 90.0F, 270.0F, true, paramPaint);
    paramCanvas.restore();
  }
  
  public void draw(Canvas paramCanvas, Paint paramPaint) {
    drawPacman(paramCanvas, paramPaint);
    drawCircle(paramCanvas, paramPaint);
  }
  
  public ArrayList<ValueAnimator> onCreateAnimators() {
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    float f = (getWidth() / 11);
    ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { getWidth() - f, (getWidth() / 2) });
    valueAnimator1.setDuration(650L);
    valueAnimator1.setInterpolator((TimeInterpolator)new LinearInterpolator());
    valueAnimator1.setRepeatCount(-1);
    addUpdateListener(valueAnimator1, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            PacmanIndicator.access$002(PacmanIndicator.this, ((Float)param1ValueAnimator.getAnimatedValue()).floatValue());
            PacmanIndicator.this.postInvalidate();
          }
        });
    ValueAnimator valueAnimator2 = ValueAnimator.ofInt(new int[] { 255, 122 });
    valueAnimator2.setDuration(650L);
    valueAnimator2.setRepeatCount(-1);
    addUpdateListener(valueAnimator2, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            PacmanIndicator.access$102(PacmanIndicator.this, ((Integer)param1ValueAnimator.getAnimatedValue()).intValue());
            PacmanIndicator.this.postInvalidate();
          }
        });
    ValueAnimator valueAnimator3 = ValueAnimator.ofFloat(new float[] { 0.0F, 45.0F, 0.0F });
    valueAnimator3.setDuration(650L);
    valueAnimator3.setRepeatCount(-1);
    addUpdateListener(valueAnimator3, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            PacmanIndicator.access$202(PacmanIndicator.this, ((Float)param1ValueAnimator.getAnimatedValue()).floatValue());
            PacmanIndicator.this.postInvalidate();
          }
        });
    ValueAnimator valueAnimator4 = ValueAnimator.ofFloat(new float[] { 0.0F, -45.0F, 0.0F });
    valueAnimator4.setDuration(650L);
    valueAnimator4.setRepeatCount(-1);
    addUpdateListener(valueAnimator4, new ValueAnimator.AnimatorUpdateListener() {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
            PacmanIndicator.access$302(PacmanIndicator.this, ((Float)param1ValueAnimator.getAnimatedValue()).floatValue());
            PacmanIndicator.this.postInvalidate();
          }
        });
    arrayList.add(valueAnimator1);
    arrayList.add(valueAnimator2);
    arrayList.add(valueAnimator3);
    arrayList.add(valueAnimator4);
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/PacmanIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */