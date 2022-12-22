package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements f {
  private static int b;
  
  private static Field c;
  
  private static Field d;
  
  private static Field e;
  
  private Activity f;
  
  ImmLeaksCleaner(Activity paramActivity) {
    this.f = paramActivity;
  }
  
  private static void h() {
    try {
      b = 2;
      Field field = InputMethodManager.class.getDeclaredField("mServedView");
      d = field;
      field.setAccessible(true);
      field = InputMethodManager.class.getDeclaredField("mNextServedView");
      e = field;
      field.setAccessible(true);
      field = InputMethodManager.class.getDeclaredField("mH");
      c = field;
      field.setAccessible(true);
      b = 1;
    } catch (NoSuchFieldException noSuchFieldException) {}
  }
  
  public void c(h paramh, Lifecycle.Event paramEvent) {
    if (paramEvent != Lifecycle.Event.ON_DESTROY)
      return; 
    if (b == 0)
      h(); 
    if (b == 1) {
      InputMethodManager inputMethodManager = (InputMethodManager)this.f.getSystemService("input_method");
      try {
        Object object = c.get(inputMethodManager);
        if (object == null)
          return; 
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          View view = (View)d.get(inputMethodManager);
          if (view == null) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
          if (view.isAttachedToWindow()) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
          try {
            e.set(inputMethodManager, null);
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            inputMethodManager.isActive();
          } catch (IllegalAccessException illegalAccessException) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
        } catch (IllegalAccessException illegalAccessException) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } catch (ClassCastException classCastException) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } finally {}
      } catch (IllegalAccessException illegalAccessException) {}
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/ImmLeaksCleaner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */