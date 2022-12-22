package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class p0 {
  private static Method a;
  
  private static boolean b;
  
  private static Field c;
  
  private static boolean d;
  
  private float[] e;
  
  @SuppressLint({"PrivateApi"})
  private void b() {
    if (!b) {
      try {
        Class<int> clazz = int.class;
        Method method = View.class.getDeclaredMethod("setFrame", new Class[] { clazz, clazz, clazz, clazz });
        a = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", noSuchMethodException);
      } 
      b = true;
    } 
  }
  
  public void a(View paramView) {
    if (paramView.getVisibility() == 0)
      paramView.setTag(p.save_non_transition_alpha, null); 
  }
  
  public float c(View paramView) {
    Float float_ = (Float)paramView.getTag(p.save_non_transition_alpha);
    return (float_ != null) ? (paramView.getAlpha() / float_.floatValue()) : paramView.getAlpha();
  }
  
  public void d(View paramView) {
    int i = p.save_non_transition_alpha;
    if (paramView.getTag(i) == null)
      paramView.setTag(i, Float.valueOf(paramView.getAlpha())); 
  }
  
  public void e(View paramView, Matrix paramMatrix) {
    boolean bool;
    if (paramMatrix == null || paramMatrix.isIdentity()) {
      paramView.setPivotX((paramView.getWidth() / 2));
      paramView.setPivotY((paramView.getHeight() / 2));
      paramView.setTranslationX(0.0F);
      paramView.setTranslationY(0.0F);
      paramView.setScaleX(1.0F);
      paramView.setScaleY(1.0F);
      paramView.setRotation(0.0F);
      return;
    } 
    float[] arrayOfFloat1 = this.e;
    float[] arrayOfFloat2 = arrayOfFloat1;
    if (arrayOfFloat1 == null) {
      arrayOfFloat2 = new float[9];
      this.e = arrayOfFloat2;
    } 
    paramMatrix.getValues(arrayOfFloat2);
    float f1 = arrayOfFloat2[3];
    float f2 = (float)Math.sqrt((1.0F - f1 * f1));
    if (arrayOfFloat2[0] < 0.0F) {
      bool = true;
    } else {
      bool = true;
    } 
    float f3 = f2 * bool;
    f1 = (float)Math.toDegrees(Math.atan2(f1, f3));
    f2 = arrayOfFloat2[0] / f3;
    f3 = arrayOfFloat2[4] / f3;
    float f4 = arrayOfFloat2[2];
    float f5 = arrayOfFloat2[5];
    paramView.setPivotX(0.0F);
    paramView.setPivotY(0.0F);
    paramView.setTranslationX(f4);
    paramView.setTranslationY(f5);
    paramView.setRotation(f1);
    paramView.setScaleX(f2);
    paramView.setScaleY(f3);
  }
  
  public void f(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    b();
    Method method = a;
    if (method != null)
      try {
        method.invoke(paramView, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      } catch (IllegalAccessException illegalAccessException) {
      
      } catch (InvocationTargetException invocationTargetException) {
        throw new RuntimeException(invocationTargetException.getCause());
      }  
  }
  
  public void g(View paramView, float paramFloat) {
    Float float_ = (Float)paramView.getTag(p.save_non_transition_alpha);
    if (float_ != null) {
      paramView.setAlpha(float_.floatValue() * paramFloat);
    } else {
      paramView.setAlpha(paramFloat);
    } 
  }
  
  public void h(View paramView, int paramInt) {
    if (!d) {
      try {
        Field field1 = View.class.getDeclaredField("mViewFlags");
        c = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
      } 
      d = true;
    } 
    Field field = c;
    if (field != null)
      try {
        int i = field.getInt(paramView);
        c.setInt(paramView, paramInt | i & 0xFFFFFFF3);
      } catch (IllegalAccessException illegalAccessException) {} 
  }
  
  public void i(View paramView, Matrix paramMatrix) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent instanceof View) {
      View view = (View)viewParent;
      i(view, paramMatrix);
      paramMatrix.preTranslate(-view.getScrollX(), -view.getScrollY());
    } 
    paramMatrix.preTranslate(paramView.getLeft(), paramView.getTop());
    Matrix matrix = paramView.getMatrix();
    if (!matrix.isIdentity())
      paramMatrix.preConcat(matrix); 
  }
  
  public void j(View paramView, Matrix paramMatrix) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent instanceof View) {
      View view = (View)viewParent;
      j(view, paramMatrix);
      paramMatrix.postTranslate(view.getScrollX(), view.getScrollY());
    } 
    paramMatrix.postTranslate(-paramView.getLeft(), -paramView.getTop());
    Matrix matrix = paramView.getMatrix();
    if (!matrix.isIdentity()) {
      Matrix matrix1 = new Matrix();
      if (matrix.invert(matrix1))
        paramMatrix.postConcat(matrix1); 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */