package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

class k {
  private static boolean a = true;
  
  private static Field b;
  
  private static boolean c;
  
  static void a(ImageView paramImageView, Matrix paramMatrix) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      paramImageView.animateTransform(paramMatrix);
    } else {
      Drawable drawable;
      if (paramMatrix == null) {
        drawable = paramImageView.getDrawable();
        if (drawable != null) {
          drawable.setBounds(0, 0, paramImageView.getWidth() - paramImageView.getPaddingLeft() - paramImageView.getPaddingRight(), paramImageView.getHeight() - paramImageView.getPaddingTop() - paramImageView.getPaddingBottom());
          paramImageView.invalidate();
        } 
      } else if (i >= 21) {
        c(paramImageView, (Matrix)drawable);
      } else {
        Matrix matrix;
        Drawable drawable1 = paramImageView.getDrawable();
        if (drawable1 != null) {
          drawable1.setBounds(0, 0, drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight());
          drawable1 = null;
          Drawable drawable2 = null;
          b();
          Field field = b;
          if (field != null) {
            drawable1 = drawable2;
            try {
              Matrix matrix1 = (Matrix)field.get(paramImageView);
              if (matrix1 == null)
                try {
                  Matrix matrix3 = new Matrix();
                  this();
                  Matrix matrix2 = matrix3;
                  b.set(paramImageView, matrix3);
                  matrix2 = matrix3;
                  if (matrix2 != null)
                    matrix2.set((Matrix)drawable); 
                } catch (IllegalAccessException illegalAccessException) {} 
              matrix = matrix1;
            } catch (IllegalAccessException illegalAccessException) {}
          } 
        } else {
          return;
        } 
        if (matrix != null)
          matrix.set((Matrix)drawable); 
      } 
    } 
  }
  
  private static void b() {
    if (!c) {
      try {
        Field field = ImageView.class.getDeclaredField("mDrawMatrix");
        b = field;
        field.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {}
      c = true;
    } 
  }
  
  @SuppressLint({"NewApi"})
  private static void c(ImageView paramImageView, Matrix paramMatrix) {
    if (a)
      try {
        paramImageView.animateTransform(paramMatrix);
      } catch (NoSuchMethodError noSuchMethodError) {
        a = false;
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */