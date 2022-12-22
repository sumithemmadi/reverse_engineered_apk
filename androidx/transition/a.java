package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import java.util.ArrayList;

class a {
  static void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter) {
    if (Build.VERSION.SDK_INT >= 19)
      paramAnimator.addPauseListener((Animator.AnimatorPauseListener)paramAnimatorListenerAdapter); 
  }
  
  static void b(Animator paramAnimator) {
    if (Build.VERSION.SDK_INT >= 19) {
      paramAnimator.pause();
    } else {
      ArrayList<Animator.AnimatorListener> arrayList = paramAnimator.getListeners();
      if (arrayList != null) {
        byte b = 0;
        int i = arrayList.size();
        while (b < i) {
          Animator.AnimatorListener animatorListener = arrayList.get(b);
          if (animatorListener instanceof a)
            ((a)animatorListener).onAnimationPause(paramAnimator); 
          b++;
        } 
      } 
    } 
  }
  
  static void c(Animator paramAnimator) {
    if (Build.VERSION.SDK_INT >= 19) {
      paramAnimator.resume();
    } else {
      ArrayList<Animator.AnimatorListener> arrayList = paramAnimator.getListeners();
      if (arrayList != null) {
        byte b = 0;
        int i = arrayList.size();
        while (b < i) {
          Animator.AnimatorListener animatorListener = arrayList.get(b);
          if (animatorListener instanceof a)
            ((a)animatorListener).onAnimationResume(paramAnimator); 
          b++;
        } 
      } 
    } 
  }
  
  static interface a {
    void onAnimationPause(Animator param1Animator);
    
    void onAnimationResume(Animator param1Animator);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */