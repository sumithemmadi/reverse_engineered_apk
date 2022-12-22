package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class b {
  private static final ThreadLocal<Matrix> a = new ThreadLocal<Matrix>();
  
  private static final ThreadLocal<RectF> b = new ThreadLocal<RectF>();
  
  public static void a(ViewGroup paramViewGroup, View paramView, Rect paramRect) {
    paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
    c(paramViewGroup, paramView, paramRect);
  }
  
  private static void b(ViewParent paramViewParent, View paramView, Matrix paramMatrix) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent instanceof View && viewParent != paramViewParent) {
      View view = (View)viewParent;
      b(paramViewParent, view, paramMatrix);
      paramMatrix.preTranslate(-view.getScrollX(), -view.getScrollY());
    } 
    paramMatrix.preTranslate(paramView.getLeft(), paramView.getTop());
    if (!paramView.getMatrix().isIdentity())
      paramMatrix.preConcat(paramView.getMatrix()); 
  }
  
  static void c(ViewGroup paramViewGroup, View paramView, Rect paramRect) {
    ThreadLocal<Matrix> threadLocal1 = a;
    Matrix matrix = threadLocal1.get();
    if (matrix == null) {
      matrix = new Matrix();
      threadLocal1.set(matrix);
    } else {
      matrix.reset();
    } 
    b((ViewParent)paramViewGroup, paramView, matrix);
    ThreadLocal<RectF> threadLocal = b;
    RectF rectF2 = threadLocal.get();
    RectF rectF1 = rectF2;
    if (rectF2 == null) {
      rectF1 = new RectF();
      threadLocal.set(rectF1);
    } 
    rectF1.set(paramRect);
    matrix.mapRect(rectF1);
    paramRect.set((int)(rectF1.left + 0.5F), (int)(rectF1.top + 0.5F), (int)(rectF1.right + 0.5F), (int)(rectF1.bottom + 0.5F));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/coordinatorlayout/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */