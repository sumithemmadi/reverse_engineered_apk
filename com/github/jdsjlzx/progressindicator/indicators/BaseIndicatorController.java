package com.github.jdsjlzx.progressindicator.indicators;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.List;

public abstract class BaseIndicatorController {
  private List<Animator> mAnimators;
  
  private View mTarget;
  
  public abstract List<Animator> createAnimation();
  
  public abstract void draw(Canvas paramCanvas, Paint paramPaint);
  
  public int getHeight() {
    return this.mTarget.getHeight();
  }
  
  public View getTarget() {
    return this.mTarget;
  }
  
  public int getWidth() {
    return this.mTarget.getWidth();
  }
  
  public void initAnimation() {
    this.mAnimators = createAnimation();
  }
  
  public void postInvalidate() {
    this.mTarget.postInvalidate();
  }
  
  public void setAnimationStatus(AnimStatus paramAnimStatus) {
    List<Animator> list = this.mAnimators;
    if (list == null)
      return; 
    int i = list.size();
    for (byte b = 0; b < i; b++) {
      Animator animator = this.mAnimators.get(b);
      boolean bool = animator.isRunning();
      int j = null.$SwitchMap$com$github$jdsjlzx$progressindicator$indicators$BaseIndicatorController$AnimStatus[paramAnimStatus.ordinal()];
      if (j != 1) {
        if (j != 2) {
          if (j == 3 && bool)
            animator.cancel(); 
        } else if (bool) {
          animator.end();
        } 
      } else if (!bool) {
        animator.start();
      } 
    } 
  }
  
  public void setTarget(View paramView) {
    this.mTarget = paramView;
  }
  
  public enum AnimStatus {
    CANCEL, END, START;
    
    static {
      AnimStatus animStatus1 = new AnimStatus("START", 0);
      START = animStatus1;
      AnimStatus animStatus2 = new AnimStatus("END", 1);
      END = animStatus2;
      AnimStatus animStatus3 = new AnimStatus("CANCEL", 2);
      CANCEL = animStatus3;
      $VALUES = new AnimStatus[] { animStatus1, animStatus2, animStatus3 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/indicators/BaseIndicatorController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */