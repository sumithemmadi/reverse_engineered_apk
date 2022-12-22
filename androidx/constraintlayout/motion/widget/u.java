package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.e;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

class u {
  private static final float[][] a;
  
  private static final float[][] b;
  
  private int c = 0;
  
  private int d = 0;
  
  private int e = 0;
  
  private int f = -1;
  
  private int g = -1;
  
  private int h = -1;
  
  private float i = 0.5F;
  
  private float j = 0.5F;
  
  private float k = 0.0F;
  
  private float l = 1.0F;
  
  private boolean m = false;
  
  private float[] n = new float[2];
  
  private float o;
  
  private float p;
  
  private final MotionLayout q;
  
  private float r = 4.0F;
  
  private float s = 1.2F;
  
  private boolean t = true;
  
  private float u = 1.0F;
  
  private int v = 0;
  
  private float w = 10.0F;
  
  static {
    float[] arrayOfFloat1 = { 0.5F, 1.0F };
    float[] arrayOfFloat2 = { 0.5F, 0.5F };
    a = new float[][] { { 0.5F, 0.0F }, { 0.0F, 0.5F }, { 1.0F, 0.5F }, arrayOfFloat1, arrayOfFloat2, { 0.0F, 0.5F }, { 1.0F, 0.5F } };
    arrayOfFloat1 = new float[] { 0.0F, -1.0F };
    arrayOfFloat2 = new float[] { 0.0F, 1.0F };
    float[] arrayOfFloat3 = { 1.0F, 0.0F };
    float[] arrayOfFloat4 = { -1.0F, 0.0F };
    b = new float[][] { arrayOfFloat1, arrayOfFloat2, { -1.0F, 0.0F }, arrayOfFloat3, arrayOfFloat4, { 1.0F, 0.0F } };
  }
  
  u(Context paramContext, MotionLayout paramMotionLayout, XmlPullParser paramXmlPullParser) {
    this.q = paramMotionLayout;
    c(paramContext, Xml.asAttributeSet(paramXmlPullParser));
  }
  
  private void b(TypedArray paramTypedArray) {
    int i = paramTypedArray.getIndexCount();
    for (byte b = 0; b < i; b++) {
      int j = paramTypedArray.getIndex(b);
      if (j == e.OnSwipe_touchAnchorId) {
        this.f = paramTypedArray.getResourceId(j, this.f);
      } else if (j == e.OnSwipe_touchAnchorSide) {
        j = paramTypedArray.getInt(j, this.c);
        this.c = j;
        float[][] arrayOfFloat = a;
        this.j = arrayOfFloat[j][0];
        this.i = arrayOfFloat[j][1];
      } else if (j == e.OnSwipe_dragDirection) {
        j = paramTypedArray.getInt(j, this.d);
        this.d = j;
        float[][] arrayOfFloat = b;
        this.k = arrayOfFloat[j][0];
        this.l = arrayOfFloat[j][1];
      } else if (j == e.OnSwipe_maxVelocity) {
        this.r = paramTypedArray.getFloat(j, this.r);
      } else if (j == e.OnSwipe_maxAcceleration) {
        this.s = paramTypedArray.getFloat(j, this.s);
      } else if (j == e.OnSwipe_moveWhenScrollAtTop) {
        this.t = paramTypedArray.getBoolean(j, this.t);
      } else if (j == e.OnSwipe_dragScale) {
        this.u = paramTypedArray.getFloat(j, this.u);
      } else if (j == e.OnSwipe_dragThreshold) {
        this.w = paramTypedArray.getFloat(j, this.w);
      } else if (j == e.OnSwipe_touchRegionId) {
        this.g = paramTypedArray.getResourceId(j, this.g);
      } else if (j == e.OnSwipe_onTouchUp) {
        this.e = paramTypedArray.getInt(j, this.e);
      } else if (j == e.OnSwipe_nestedScrollFlags) {
        this.v = paramTypedArray.getInteger(j, 0);
      } else if (j == e.OnSwipe_limitBoundsTo) {
        this.h = paramTypedArray.getResourceId(j, 0);
      } 
    } 
  }
  
  private void c(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.OnSwipe);
    b(typedArray);
    typedArray.recycle();
  }
  
  float a(float paramFloat1, float paramFloat2) {
    return paramFloat1 * this.k + paramFloat2 * this.l;
  }
  
  public int d() {
    return this.v;
  }
  
  RectF e(ViewGroup paramViewGroup, RectF paramRectF) {
    int i = this.h;
    if (i == -1)
      return null; 
    View view = paramViewGroup.findViewById(i);
    if (view == null)
      return null; 
    paramRectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    return paramRectF;
  }
  
  float f() {
    return this.s;
  }
  
  public float g() {
    return this.r;
  }
  
  boolean h() {
    return this.t;
  }
  
  float i(float paramFloat1, float paramFloat2) {
    float f = this.q.getProgress();
    this.q.e0(this.f, f, this.j, this.i, this.n);
    f = this.k;
    if (f != 0.0F) {
      float[] arrayOfFloat = this.n;
      if (arrayOfFloat[0] == 0.0F)
        arrayOfFloat[0] = 1.0E-7F; 
      paramFloat1 = paramFloat1 * f / arrayOfFloat[0];
    } else {
      float[] arrayOfFloat = this.n;
      if (arrayOfFloat[1] == 0.0F)
        arrayOfFloat[1] = 1.0E-7F; 
      paramFloat1 = paramFloat2 * this.l / arrayOfFloat[1];
    } 
    return paramFloat1;
  }
  
  RectF j(ViewGroup paramViewGroup, RectF paramRectF) {
    int i = this.g;
    if (i == -1)
      return null; 
    View view = paramViewGroup.findViewById(i);
    if (view == null)
      return null; 
    paramRectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    return paramRectF;
  }
  
  int k() {
    return this.g;
  }
  
  void l(MotionEvent paramMotionEvent, MotionLayout.f paramf, int paramInt, r paramr) {
    MotionLayout motionLayout;
    paramf.b(paramMotionEvent);
    paramInt = paramMotionEvent.getAction();
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2) {
          float f1 = paramMotionEvent.getRawY() - this.p;
          float f2 = paramMotionEvent.getRawX() - this.o;
          if (Math.abs(this.k * f2 + this.l * f1) > this.w || this.m) {
            float f3 = this.q.getProgress();
            if (!this.m) {
              this.m = true;
              this.q.setProgress(f3);
            } 
            paramInt = this.f;
            if (paramInt != -1) {
              this.q.e0(paramInt, f3, this.j, this.i, this.n);
            } else {
              float f5 = Math.min(this.q.getWidth(), this.q.getHeight());
              float[] arrayOfFloat1 = this.n;
              arrayOfFloat1[1] = this.l * f5;
              arrayOfFloat1[0] = f5 * this.k;
            } 
            float f4 = this.k;
            float[] arrayOfFloat = this.n;
            if (Math.abs((f4 * arrayOfFloat[0] + this.l * arrayOfFloat[1]) * this.u) < 0.01D) {
              arrayOfFloat = this.n;
              arrayOfFloat[0] = 0.01F;
              arrayOfFloat[1] = 0.01F;
            } 
            if (this.k != 0.0F) {
              f2 /= this.n[0];
            } else {
              f2 = f1 / this.n[1];
            } 
            f2 = Math.max(Math.min(f3 + f2, 1.0F), 0.0F);
            if (f2 != this.q.getProgress()) {
              this.q.setProgress(f2);
              paramf.e(1000);
              f3 = paramf.d();
              f2 = paramf.c();
              if (this.k != 0.0F) {
                f2 = f3 / this.n[0];
              } else {
                f2 /= this.n[1];
              } 
              this.q.B = f2;
            } else {
              this.q.B = 0.0F;
            } 
            this.o = paramMotionEvent.getRawX();
            this.p = paramMotionEvent.getRawY();
          } 
        } 
      } else {
        this.m = false;
        paramf.e(1000);
        float f3 = paramf.d();
        float f2 = paramf.c();
        float f1 = this.q.getProgress();
        paramInt = this.f;
        if (paramInt != -1) {
          this.q.e0(paramInt, f1, this.j, this.i, this.n);
        } else {
          float f6 = Math.min(this.q.getWidth(), this.q.getHeight());
          float[] arrayOfFloat1 = this.n;
          arrayOfFloat1[1] = this.l * f6;
          arrayOfFloat1[0] = f6 * this.k;
        } 
        float f4 = this.k;
        float[] arrayOfFloat = this.n;
        float f5 = arrayOfFloat[0];
        f5 = arrayOfFloat[1];
        if (f4 != 0.0F) {
          f2 = f3 / arrayOfFloat[0];
        } else {
          f2 /= arrayOfFloat[1];
        } 
        if (!Float.isNaN(f2)) {
          f3 = f2 / 3.0F + f1;
        } else {
          f3 = f1;
        } 
        if (f3 != 0.0F && f3 != 1.0F) {
          paramInt = this.e;
          if (paramInt != 3) {
            motionLayout = this.q;
            if (f3 < 0.5D) {
              f3 = 0.0F;
            } else {
              f3 = 1.0F;
            } 
            motionLayout.p0(paramInt, f3, f2);
            if (0.0F >= f1 || 1.0F <= f1)
              this.q.setState(MotionLayout.TransitionState.e); 
            return;
          } 
        } 
        if (0.0F >= f3 || 1.0F <= f3)
          this.q.setState(MotionLayout.TransitionState.e); 
      } 
    } else {
      this.o = motionLayout.getRawX();
      this.p = motionLayout.getRawY();
      this.m = false;
    } 
  }
  
  void m(float paramFloat1, float paramFloat2) {
    float f1 = this.q.getProgress();
    if (!this.m) {
      this.m = true;
      this.q.setProgress(f1);
    } 
    this.q.e0(this.f, f1, this.j, this.i, this.n);
    float f2 = this.k;
    float[] arrayOfFloat = this.n;
    if (Math.abs(f2 * arrayOfFloat[0] + this.l * arrayOfFloat[1]) < 0.01D) {
      arrayOfFloat = this.n;
      arrayOfFloat[0] = 0.01F;
      arrayOfFloat[1] = 0.01F;
    } 
    f2 = this.k;
    if (f2 != 0.0F) {
      paramFloat1 = paramFloat1 * f2 / this.n[0];
    } else {
      paramFloat1 = paramFloat2 * this.l / this.n[1];
    } 
    paramFloat1 = Math.max(Math.min(f1 + paramFloat1, 1.0F), 0.0F);
    if (paramFloat1 != this.q.getProgress())
      this.q.setProgress(paramFloat1); 
  }
  
  void n(float paramFloat1, float paramFloat2) {
    boolean bool = false;
    this.m = false;
    float f1 = this.q.getProgress();
    this.q.e0(this.f, f1, this.j, this.i, this.n);
    float f2 = this.k;
    float[] arrayOfFloat = this.n;
    float f3 = arrayOfFloat[0];
    float f4 = this.l;
    f3 = arrayOfFloat[1];
    f3 = 0.0F;
    if (f2 != 0.0F) {
      paramFloat1 = paramFloat1 * f2 / arrayOfFloat[0];
    } else {
      paramFloat1 = paramFloat2 * f4 / arrayOfFloat[1];
    } 
    paramFloat2 = f1;
    if (!Float.isNaN(paramFloat1))
      paramFloat2 = f1 + paramFloat1 / 3.0F; 
    if (paramFloat2 != 0.0F) {
      boolean bool1;
      if (paramFloat2 != 1.0F) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      int i = this.e;
      if (i != 3)
        bool = true; 
      if ((bool & bool1) != 0) {
        MotionLayout motionLayout = this.q;
        if (paramFloat2 < 0.5D) {
          paramFloat2 = f3;
        } else {
          paramFloat2 = 1.0F;
        } 
        motionLayout.p0(i, paramFloat2, paramFloat1);
      } 
    } 
  }
  
  void o(float paramFloat1, float paramFloat2) {
    this.o = paramFloat1;
    this.p = paramFloat2;
  }
  
  public void p(boolean paramBoolean) {
    if (paramBoolean) {
      float[][] arrayOfFloat1 = b;
      arrayOfFloat1[4] = arrayOfFloat1[3];
      arrayOfFloat1[5] = arrayOfFloat1[2];
      arrayOfFloat1 = a;
      arrayOfFloat1[5] = arrayOfFloat1[2];
      arrayOfFloat1[6] = arrayOfFloat1[1];
    } else {
      float[][] arrayOfFloat1 = b;
      arrayOfFloat1[4] = arrayOfFloat1[2];
      arrayOfFloat1[5] = arrayOfFloat1[3];
      arrayOfFloat1 = a;
      arrayOfFloat1[5] = arrayOfFloat1[1];
      arrayOfFloat1[6] = arrayOfFloat1[2];
    } 
    float[][] arrayOfFloat = a;
    int i = this.c;
    this.j = arrayOfFloat[i][0];
    this.i = arrayOfFloat[i][1];
    arrayOfFloat = b;
    i = this.d;
    this.k = arrayOfFloat[i][0];
    this.l = arrayOfFloat[i][1];
  }
  
  void q(float paramFloat1, float paramFloat2) {
    this.o = paramFloat1;
    this.p = paramFloat2;
    this.m = false;
  }
  
  void r() {
    NestedScrollView nestedScrollView;
    int i = this.f;
    if (i != -1) {
      View view = this.q.findViewById(i);
      nestedScrollView = (NestedScrollView)view;
      if (view == null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cannot find TouchAnchorId @id/");
        stringBuilder.append(a.b(this.q.getContext(), this.f));
        Log.e("TouchResponse", stringBuilder.toString());
        View view1 = view;
      } 
    } else {
      nestedScrollView = null;
    } 
    if (nestedScrollView instanceof NestedScrollView) {
      nestedScrollView = nestedScrollView;
      nestedScrollView.setOnTouchListener(new a(this));
      nestedScrollView.setOnScrollChangeListener(new b(this));
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.k);
    stringBuilder.append(" , ");
    stringBuilder.append(this.l);
    return stringBuilder.toString();
  }
  
  class a implements View.OnTouchListener {
    a(u this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      return false;
    }
  }
  
  class b implements NestedScrollView.b {
    b(u this$0) {}
    
    public void a(NestedScrollView param1NestedScrollView, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */