package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.d.g;
import b.h.k.w;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
  private static final String[] L = new String[] { "android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix" };
  
  private static final Property<e, float[]> M = new a(float[].class, "nonTranslations");
  
  private static final Property<e, PointF> N = new b(PointF.class, "translations");
  
  private static final boolean O;
  
  boolean P = true;
  
  private boolean Q = true;
  
  private Matrix R = new Matrix();
  
  static {
    if (Build.VERSION.SDK_INT >= 21)
      bool = true; 
    O = bool;
  }
  
  public ChangeTransform() {}
  
  @SuppressLint({"RestrictedApi"})
  public ChangeTransform(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, t.g);
    XmlPullParser xmlPullParser = (XmlPullParser)paramAttributeSet;
    this.P = g.a(typedArray, xmlPullParser, "reparentWithOverlay", 1, true);
    this.Q = g.a(typedArray, xmlPullParser, "reparent", 0, true);
    typedArray.recycle();
  }
  
  private void o0(y paramy) {
    View view = paramy.b;
    if (view.getVisibility() == 8)
      return; 
    paramy.a.put("android:changeTransform:parent", view.getParent());
    f f = new f(view);
    paramy.a.put("android:changeTransform:transforms", f);
    Matrix matrix = view.getMatrix();
    if (matrix == null || matrix.isIdentity()) {
      matrix = null;
    } else {
      matrix = new Matrix(matrix);
    } 
    paramy.a.put("android:changeTransform:matrix", matrix);
    if (this.Q) {
      Matrix matrix1 = new Matrix();
      ViewGroup viewGroup = (ViewGroup)view.getParent();
      j0.j((View)viewGroup, matrix1);
      matrix1.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
      paramy.a.put("android:changeTransform:parentMatrix", matrix1);
      paramy.a.put("android:changeTransform:intermediateMatrix", view.getTag(p.transition_transform));
      paramy.a.put("android:changeTransform:intermediateParentMatrix", view.getTag(p.parent_matrix));
    } 
  }
  
  private void p0(ViewGroup paramViewGroup, y paramy1, y paramy2) {
    View view = paramy2.b;
    Matrix matrix = new Matrix((Matrix)paramy2.a.get("android:changeTransform:parentMatrix"));
    j0.k((View)paramViewGroup, matrix);
    f f = j.a(view, paramViewGroup, matrix);
    if (f == null)
      return; 
    f.a((ViewGroup)paramy1.a.get("android:changeTransform:parent"), paramy1.b);
    ChangeTransform changeTransform = this;
    while (true) {
      TransitionSet transitionSet1;
      TransitionSet transitionSet2 = changeTransform.v;
      if (transitionSet2 != null) {
        transitionSet1 = transitionSet2;
        continue;
      } 
      transitionSet1.a(new d(view, f));
      if (O) {
        View view1 = paramy1.b;
        if (view1 != paramy2.b)
          j0.h(view1, 0.0F); 
        j0.h(view, 1.0F);
      } 
      return;
    } 
  }
  
  private ObjectAnimator q0(y paramy1, y paramy2, boolean paramBoolean) {
    Matrix matrix1 = (Matrix)paramy1.a.get("android:changeTransform:matrix");
    Matrix matrix2 = (Matrix)paramy2.a.get("android:changeTransform:matrix");
    Matrix matrix3 = matrix1;
    if (matrix1 == null)
      matrix3 = l.a; 
    matrix1 = matrix2;
    if (matrix2 == null)
      matrix1 = l.a; 
    if (matrix3.equals(matrix1))
      return null; 
    f f = (f)paramy2.a.get("android:changeTransform:transforms");
    View view = paramy2.b;
    s0(view);
    float[] arrayOfFloat1 = new float[9];
    matrix3.getValues(arrayOfFloat1);
    float[] arrayOfFloat2 = new float[9];
    matrix1.getValues(arrayOfFloat2);
    e e = new e(view, arrayOfFloat1);
    PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofObject(M, new d(new float[9]), (Object[])new float[][] { arrayOfFloat1, arrayOfFloat2 });
    Path path = E().a(arrayOfFloat1[2], arrayOfFloat1[5], arrayOfFloat2[2], arrayOfFloat2[5]);
    ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(e, new PropertyValuesHolder[] { propertyValuesHolder, o.a(N, path) });
    c c = new c(this, paramBoolean, matrix1, view, f, e);
    objectAnimator.addListener((Animator.AnimatorListener)c);
    a.a((Animator)objectAnimator, c);
    return objectAnimator;
  }
  
  private boolean r0(ViewGroup paramViewGroup1, ViewGroup paramViewGroup2) {
    boolean bool = Q((View)paramViewGroup1);
    boolean bool1 = true;
    null = false;
    if (!bool || !Q((View)paramViewGroup2)) {
      if (paramViewGroup1 == paramViewGroup2)
        return bool1; 
    } else {
      y y = C((View)paramViewGroup1, true);
      if (y != null) {
        if (paramViewGroup2 == y.b)
          return bool1; 
      } else {
        return null;
      } 
    } 
    return false;
  }
  
  static void s0(View paramView) {
    u0(paramView, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
  }
  
  private void t0(y paramy1, y paramy2) {
    Matrix matrix2 = (Matrix)paramy2.a.get("android:changeTransform:parentMatrix");
    paramy2.b.setTag(p.parent_matrix, matrix2);
    Matrix matrix3 = this.R;
    matrix3.reset();
    matrix2.invert(matrix3);
    matrix2 = (Matrix)paramy1.a.get("android:changeTransform:matrix");
    Matrix matrix1 = matrix2;
    if (matrix2 == null) {
      matrix1 = new Matrix();
      paramy1.a.put("android:changeTransform:matrix", matrix1);
    } 
    matrix1.postConcat((Matrix)paramy1.a.get("android:changeTransform:parentMatrix"));
    matrix1.postConcat(matrix3);
  }
  
  static void u0(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8) {
    paramView.setTranslationX(paramFloat1);
    paramView.setTranslationY(paramFloat2);
    w.K0(paramView, paramFloat3);
    paramView.setScaleX(paramFloat4);
    paramView.setScaleY(paramFloat5);
    paramView.setRotationX(paramFloat6);
    paramView.setRotationY(paramFloat7);
    paramView.setRotation(paramFloat8);
  }
  
  public String[] M() {
    return L;
  }
  
  public void l(y paramy) {
    o0(paramy);
  }
  
  public void q(y paramy) {
    o0(paramy);
    if (!O)
      ((ViewGroup)paramy.b.getParent()).startViewTransition(paramy.b); 
  }
  
  public Animator v(ViewGroup paramViewGroup, y paramy1, y paramy2) {
    boolean bool;
    if (paramy1 == null || paramy2 == null || !paramy1.a.containsKey("android:changeTransform:parent") || !paramy2.a.containsKey("android:changeTransform:parent"))
      return null; 
    ViewGroup viewGroup1 = (ViewGroup)paramy1.a.get("android:changeTransform:parent");
    ViewGroup viewGroup2 = (ViewGroup)paramy2.a.get("android:changeTransform:parent");
    if (this.Q && !r0(viewGroup1, viewGroup2)) {
      bool = true;
    } else {
      bool = false;
    } 
    Matrix matrix = (Matrix)paramy1.a.get("android:changeTransform:intermediateMatrix");
    if (matrix != null)
      paramy1.a.put("android:changeTransform:matrix", matrix); 
    matrix = (Matrix)paramy1.a.get("android:changeTransform:intermediateParentMatrix");
    if (matrix != null)
      paramy1.a.put("android:changeTransform:parentMatrix", matrix); 
    if (bool)
      t0(paramy1, paramy2); 
    ObjectAnimator objectAnimator = q0(paramy1, paramy2, bool);
    if (bool && objectAnimator != null && this.P) {
      p0(paramViewGroup, paramy1, paramy2);
    } else if (!O) {
      viewGroup1.endViewTransition(paramy1.b);
    } 
    return (Animator)objectAnimator;
  }
  
  static {
    boolean bool = false;
  }
  
  static final class a extends Property<e, float[]> {
    a(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public float[] a(ChangeTransform.e param1e) {
      return null;
    }
    
    public void b(ChangeTransform.e param1e, float[] param1ArrayOffloat) {
      param1e.d(param1ArrayOffloat);
    }
  }
  
  static final class b extends Property<e, PointF> {
    b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(ChangeTransform.e param1e) {
      return null;
    }
    
    public void b(ChangeTransform.e param1e, PointF param1PointF) {
      param1e.c(param1PointF);
    }
  }
  
  class c extends AnimatorListenerAdapter {
    private boolean a;
    
    private Matrix b = new Matrix();
    
    c(ChangeTransform this$0, boolean param1Boolean, Matrix param1Matrix, View param1View, ChangeTransform.f param1f, ChangeTransform.e param1e) {}
    
    private void a(Matrix param1Matrix) {
      this.b.set(param1Matrix);
      this.e.setTag(p.transition_transform, this.b);
      this.f.a(this.e);
    }
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (!this.a)
        if (this.c && this.h.P) {
          a(this.d);
        } else {
          this.e.setTag(p.transition_transform, null);
          this.e.setTag(p.parent_matrix, null);
        }  
      j0.f(this.e, null);
      this.f.a(this.e);
    }
    
    public void onAnimationPause(Animator param1Animator) {
      a(this.g.a());
    }
    
    public void onAnimationResume(Animator param1Animator) {
      ChangeTransform.s0(this.e);
    }
  }
  
  private static class d extends u {
    private View a;
    
    private f b;
    
    d(View param1View, f param1f) {
      this.a = param1View;
      this.b = param1f;
    }
    
    public void b(Transition param1Transition) {
      this.b.setVisibility(4);
    }
    
    public void c(Transition param1Transition) {
      param1Transition.a0(this);
      j.b(this.a);
      this.a.setTag(p.transition_transform, null);
      this.a.setTag(p.parent_matrix, null);
    }
    
    public void e(Transition param1Transition) {
      this.b.setVisibility(0);
    }
  }
  
  private static class e {
    private final Matrix a = new Matrix();
    
    private final View b;
    
    private final float[] c;
    
    private float d;
    
    private float e;
    
    e(View param1View, float[] param1ArrayOffloat) {
      this.b = param1View;
      float[] arrayOfFloat = (float[])param1ArrayOffloat.clone();
      this.c = arrayOfFloat;
      this.d = arrayOfFloat[2];
      this.e = arrayOfFloat[5];
      b();
    }
    
    private void b() {
      float[] arrayOfFloat = this.c;
      arrayOfFloat[2] = this.d;
      arrayOfFloat[5] = this.e;
      this.a.setValues(arrayOfFloat);
      j0.f(this.b, this.a);
    }
    
    Matrix a() {
      return this.a;
    }
    
    void c(PointF param1PointF) {
      this.d = param1PointF.x;
      this.e = param1PointF.y;
      b();
    }
    
    void d(float[] param1ArrayOffloat) {
      System.arraycopy(param1ArrayOffloat, 0, this.c, 0, param1ArrayOffloat.length);
      b();
    }
  }
  
  private static class f {
    final float a;
    
    final float b;
    
    final float c;
    
    final float d;
    
    final float e;
    
    final float f;
    
    final float g;
    
    final float h;
    
    f(View param1View) {
      this.a = param1View.getTranslationX();
      this.b = param1View.getTranslationY();
      this.c = w.N(param1View);
      this.d = param1View.getScaleX();
      this.e = param1View.getScaleY();
      this.f = param1View.getRotationX();
      this.g = param1View.getRotationY();
      this.h = param1View.getRotation();
    }
    
    public void a(View param1View) {
      ChangeTransform.u0(param1View, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = param1Object instanceof f;
      boolean bool1 = false;
      if (!bool)
        return false; 
      param1Object = param1Object;
      bool = bool1;
      if (((f)param1Object).a == this.a) {
        bool = bool1;
        if (((f)param1Object).b == this.b) {
          bool = bool1;
          if (((f)param1Object).c == this.c) {
            bool = bool1;
            if (((f)param1Object).d == this.d) {
              bool = bool1;
              if (((f)param1Object).e == this.e) {
                bool = bool1;
                if (((f)param1Object).f == this.f) {
                  bool = bool1;
                  if (((f)param1Object).g == this.g) {
                    bool = bool1;
                    if (((f)param1Object).h == this.h)
                      bool = true; 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      return bool;
    }
    
    public int hashCode() {
      byte b1;
      byte b2;
      byte b3;
      byte b4;
      byte b5;
      byte b6;
      byte b7;
      float f1 = this.a;
      int i = 0;
      if (f1 != 0.0F) {
        b1 = Float.floatToIntBits(f1);
      } else {
        b1 = 0;
      } 
      f1 = this.b;
      if (f1 != 0.0F) {
        b2 = Float.floatToIntBits(f1);
      } else {
        b2 = 0;
      } 
      f1 = this.c;
      if (f1 != 0.0F) {
        b3 = Float.floatToIntBits(f1);
      } else {
        b3 = 0;
      } 
      f1 = this.d;
      if (f1 != 0.0F) {
        b4 = Float.floatToIntBits(f1);
      } else {
        b4 = 0;
      } 
      f1 = this.e;
      if (f1 != 0.0F) {
        b5 = Float.floatToIntBits(f1);
      } else {
        b5 = 0;
      } 
      f1 = this.f;
      if (f1 != 0.0F) {
        b6 = Float.floatToIntBits(f1);
      } else {
        b6 = 0;
      } 
      f1 = this.g;
      if (f1 != 0.0F) {
        b7 = Float.floatToIntBits(f1);
      } else {
        b7 = 0;
      } 
      f1 = this.h;
      if (f1 != 0.0F)
        i = Float.floatToIntBits(f1); 
      return ((((((b1 * 31 + b2) * 31 + b3) * 31 + b4) * 31 + b5) * 31 + b6) * 31 + b7) * 31 + i;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/ChangeTransform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */