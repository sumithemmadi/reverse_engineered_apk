package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

public class ChangeImageTransform extends Transition {
  private static final String[] L = new String[] { "android:changeImageTransform:matrix", "android:changeImageTransform:bounds" };
  
  private static final TypeEvaluator<Matrix> M = new a();
  
  private static final Property<ImageView, Matrix> N = new b(Matrix.class, "animatedTransform");
  
  public ChangeImageTransform() {}
  
  public ChangeImageTransform(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private void o0(y paramy) {
    View view = paramy.b;
    if (view instanceof ImageView && view.getVisibility() == 0) {
      ImageView imageView = (ImageView)view;
      if (imageView.getDrawable() == null)
        return; 
      Map<String, Object> map = paramy.a;
      map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
      map.put("android:changeImageTransform:matrix", q0(imageView));
    } 
  }
  
  private static Matrix p0(ImageView paramImageView) {
    Drawable drawable = paramImageView.getDrawable();
    int i = drawable.getIntrinsicWidth();
    float f1 = paramImageView.getWidth();
    float f2 = i;
    float f3 = f1 / f2;
    i = drawable.getIntrinsicHeight();
    float f4 = paramImageView.getHeight();
    float f5 = i;
    f3 = Math.max(f3, f4 / f5);
    int j = Math.round((f1 - f2 * f3) / 2.0F);
    i = Math.round((f4 - f5 * f3) / 2.0F);
    Matrix matrix = new Matrix();
    matrix.postScale(f3, f3);
    matrix.postTranslate(j, i);
    return matrix;
  }
  
  private static Matrix q0(ImageView paramImageView) {
    Drawable drawable = paramImageView.getDrawable();
    if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
      int i = c.a[paramImageView.getScaleType().ordinal()];
      if (i != 1) {
        if (i == 2)
          return p0(paramImageView); 
      } else {
        return t0(paramImageView);
      } 
    } 
    return new Matrix(paramImageView.getImageMatrix());
  }
  
  private ObjectAnimator r0(ImageView paramImageView, Matrix paramMatrix1, Matrix paramMatrix2) {
    return ObjectAnimator.ofObject(paramImageView, N, new x.a(), (Object[])new Matrix[] { paramMatrix1, paramMatrix2 });
  }
  
  private ObjectAnimator s0(ImageView paramImageView) {
    Property<ImageView, Matrix> property = N;
    TypeEvaluator<Matrix> typeEvaluator = M;
    Matrix matrix = l.a;
    return ObjectAnimator.ofObject(paramImageView, property, typeEvaluator, (Object[])new Matrix[] { matrix, matrix });
  }
  
  private static Matrix t0(ImageView paramImageView) {
    Drawable drawable = paramImageView.getDrawable();
    Matrix matrix = new Matrix();
    matrix.postScale(paramImageView.getWidth() / drawable.getIntrinsicWidth(), paramImageView.getHeight() / drawable.getIntrinsicHeight());
    return matrix;
  }
  
  public String[] M() {
    return L;
  }
  
  public void l(y paramy) {
    o0(paramy);
  }
  
  public void q(y paramy) {
    o0(paramy);
  }
  
  public Animator v(ViewGroup paramViewGroup, y paramy1, y paramy2) {
    ObjectAnimator objectAnimator;
    ViewGroup viewGroup = null;
    paramViewGroup = viewGroup;
    if (paramy1 != null)
      if (paramy2 == null) {
        paramViewGroup = viewGroup;
      } else {
        Rect rect1 = (Rect)paramy1.a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect)paramy2.a.get("android:changeImageTransform:bounds");
        paramViewGroup = viewGroup;
        if (rect1 != null)
          if (rect2 == null) {
            paramViewGroup = viewGroup;
          } else {
            Matrix matrix2 = (Matrix)paramy1.a.get("android:changeImageTransform:matrix");
            Matrix matrix3 = (Matrix)paramy2.a.get("android:changeImageTransform:matrix");
            if ((matrix2 == null && matrix3 == null) || (matrix2 != null && matrix2.equals(matrix3))) {
              i = 1;
            } else {
              i = 0;
            } 
            if (rect1.equals(rect2) && i)
              return null; 
            ImageView imageView = (ImageView)paramy2.b;
            Drawable drawable = imageView.getDrawable();
            int j = drawable.getIntrinsicWidth();
            int i = drawable.getIntrinsicHeight();
            if (j <= 0 || i <= 0)
              return (Animator)s0(imageView); 
            Matrix matrix1 = matrix2;
            if (matrix2 == null)
              matrix1 = l.a; 
            matrix2 = matrix3;
            if (matrix3 == null)
              matrix2 = l.a; 
            N.set(imageView, matrix1);
            objectAnimator = r0(imageView, matrix1, matrix2);
          }  
      }  
    return (Animator)objectAnimator;
  }
  
  static final class a implements TypeEvaluator<Matrix> {
    public Matrix a(float param1Float, Matrix param1Matrix1, Matrix param1Matrix2) {
      return null;
    }
  }
  
  static final class b extends Property<ImageView, Matrix> {
    b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Matrix a(ImageView param1ImageView) {
      return null;
    }
    
    public void b(ImageView param1ImageView, Matrix param1Matrix) {
      k.a(param1ImageView, param1Matrix);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/ChangeImageTransform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */