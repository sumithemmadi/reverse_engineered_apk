package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.j;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import b.h.k.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MotionLayout extends ConstraintLayout implements n {
  public static boolean y;
  
  Interpolator A;
  
  int A0;
  
  float B = 0.0F;
  
  int B0;
  
  private int C = -1;
  
  int C0;
  
  int D = -1;
  
  int D0;
  
  private int E = -1;
  
  int E0;
  
  private int F = 0;
  
  float F0;
  
  private int G = 0;
  
  private e G0 = new e();
  
  private boolean H = true;
  
  private boolean H0 = false;
  
  HashMap<View, o> I = new HashMap<View, o>();
  
  private h I0;
  
  private long J = 0L;
  
  TransitionState J0 = TransitionState.b;
  
  private float K = 1.0F;
  
  e K0 = new e(this);
  
  float L = 0.0F;
  
  private boolean L0 = false;
  
  float M = 0.0F;
  
  private RectF M0 = new RectF();
  
  private long N;
  
  private View N0 = null;
  
  float O = 0.0F;
  
  ArrayList<Integer> O0 = new ArrayList<Integer>();
  
  private boolean P;
  
  boolean Q = false;
  
  boolean R = false;
  
  private i S;
  
  private float T;
  
  private float U;
  
  int V = 0;
  
  d W;
  
  private boolean a0 = false;
  
  private b.f.a.a.g b0 = new b.f.a.a.g();
  
  private c c0 = new c(this);
  
  private b d0;
  
  boolean e0 = true;
  
  int f0;
  
  int g0;
  
  int h0;
  
  int i0;
  
  boolean j0 = false;
  
  float k0;
  
  float l0;
  
  long m0;
  
  float n0;
  
  private boolean o0 = false;
  
  private ArrayList<MotionHelper> p0 = null;
  
  private ArrayList<MotionHelper> q0 = null;
  
  private ArrayList<i> r0 = null;
  
  private int s0 = 0;
  
  private long t0 = -1L;
  
  private float u0 = 0.0F;
  
  private int v0 = 0;
  
  private float w0 = 0.0F;
  
  boolean x0 = false;
  
  protected boolean y0 = false;
  
  r z;
  
  int z0;
  
  public MotionLayout(Context paramContext) {
    super(paramContext);
    i0(null);
  }
  
  public MotionLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    i0(paramAttributeSet);
  }
  
  public MotionLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    i0(paramAttributeSet);
  }
  
  private void V() {
    r r1 = this.z;
    if (r1 == null) {
      Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
      return;
    } 
    int j = r1.x();
    r1 = this.z;
    W(j, r1.i(r1.x()));
    SparseIntArray sparseIntArray1 = new SparseIntArray();
    SparseIntArray sparseIntArray2 = new SparseIntArray();
    for (r.b b1 : this.z.l()) {
      if (b1 == this.z.c)
        Log.v("MotionLayout", "CHECK: CURRENT"); 
      X(b1);
      int k = b1.B();
      j = b1.z();
      String str1 = a.b(getContext(), k);
      String str2 = a.b(getContext(), j);
      if (sparseIntArray1.get(k) == j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CHECK: two transitions with the same start and end ");
        stringBuilder.append(str1);
        stringBuilder.append("->");
        stringBuilder.append(str2);
        Log.e("MotionLayout", stringBuilder.toString());
      } 
      if (sparseIntArray2.get(j) == k) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CHECK: you can't have reverse transitions");
        stringBuilder.append(str1);
        stringBuilder.append("->");
        stringBuilder.append(str2);
        Log.e("MotionLayout", stringBuilder.toString());
      } 
      sparseIntArray1.put(k, j);
      sparseIntArray2.put(j, k);
      if (this.z.i(k) == null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" no such constraintSetStart ");
        stringBuilder.append(str1);
        Log.e("MotionLayout", stringBuilder.toString());
      } 
      if (this.z.i(j) == null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" no such constraintSetEnd ");
        stringBuilder.append(str1);
        Log.e("MotionLayout", stringBuilder.toString());
      } 
    } 
  }
  
  private void W(int paramInt, androidx.constraintlayout.widget.b paramb) {
    String str = a.b(getContext(), paramInt);
    int j = getChildCount();
    int k = 0;
    for (paramInt = 0; paramInt < j; paramInt++) {
      View view = getChildAt(paramInt);
      int m = view.getId();
      if (m == -1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CHECK: ");
        stringBuilder.append(str);
        stringBuilder.append(" ALL VIEWS SHOULD HAVE ID's ");
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append(" does not!");
        Log.w("MotionLayout", stringBuilder.toString());
      } 
      if (paramb.p(m) == null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CHECK: ");
        stringBuilder.append(str);
        stringBuilder.append(" NO CONSTRAINTS for ");
        stringBuilder.append(a.c(view));
        Log.w("MotionLayout", stringBuilder.toString());
      } 
    } 
    int[] arrayOfInt = paramb.r();
    for (paramInt = k; paramInt < arrayOfInt.length; paramInt++) {
      k = arrayOfInt[paramInt];
      String str1 = a.b(getContext(), k);
      if (findViewById(arrayOfInt[paramInt]) == null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CHECK: ");
        stringBuilder.append(str);
        stringBuilder.append(" NO View matches id ");
        stringBuilder.append(str1);
        Log.w("MotionLayout", stringBuilder.toString());
      } 
      if (paramb.q(k) == -1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CHECK: ");
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(str1);
        stringBuilder.append(") no LAYOUT_HEIGHT");
        Log.w("MotionLayout", stringBuilder.toString());
      } 
      if (paramb.v(k) == -1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CHECK: ");
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(str1);
        stringBuilder.append(") no LAYOUT_HEIGHT");
        Log.w("MotionLayout", stringBuilder.toString());
      } 
    } 
  }
  
  private void X(r.b paramb) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CHECK: transition = ");
    stringBuilder.append(paramb.u(getContext()));
    Log.v("MotionLayout", stringBuilder.toString());
    stringBuilder = new StringBuilder();
    stringBuilder.append("CHECK: transition.setDuration = ");
    stringBuilder.append(paramb.y());
    Log.v("MotionLayout", stringBuilder.toString());
    if (paramb.B() == paramb.z())
      Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!"); 
  }
  
  private void Y() {
    int j = getChildCount();
    for (byte b1 = 0; b1 < j; b1++) {
      View view = getChildAt(b1);
      o o = this.I.get(view);
      if (o != null)
        o.s(view); 
    } 
  }
  
  private void a0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield O : F
    //   4: aload_0
    //   5: getfield M : F
    //   8: fsub
    //   9: invokestatic signum : (F)F
    //   12: fstore_1
    //   13: aload_0
    //   14: invokevirtual getNanoTime : ()J
    //   17: lstore_2
    //   18: aload_0
    //   19: getfield A : Landroid/view/animation/Interpolator;
    //   22: astore #4
    //   24: aload #4
    //   26: instanceof b/f/a/a/g
    //   29: ifne -> 55
    //   32: lload_2
    //   33: aload_0
    //   34: getfield N : J
    //   37: lsub
    //   38: l2f
    //   39: fload_1
    //   40: fmul
    //   41: ldc_w 1.0E-9
    //   44: fmul
    //   45: aload_0
    //   46: getfield K : F
    //   49: fdiv
    //   50: fstore #5
    //   52: goto -> 58
    //   55: fconst_0
    //   56: fstore #5
    //   58: aload_0
    //   59: getfield M : F
    //   62: fload #5
    //   64: fadd
    //   65: fstore #6
    //   67: aload_0
    //   68: getfield P : Z
    //   71: ifeq -> 80
    //   74: aload_0
    //   75: getfield O : F
    //   78: fstore #6
    //   80: iconst_0
    //   81: istore #7
    //   83: fload_1
    //   84: fconst_0
    //   85: fcmpl
    //   86: ifle -> 99
    //   89: fload #6
    //   91: aload_0
    //   92: getfield O : F
    //   95: fcmpl
    //   96: ifge -> 115
    //   99: fload_1
    //   100: fconst_0
    //   101: fcmpg
    //   102: ifgt -> 127
    //   105: fload #6
    //   107: aload_0
    //   108: getfield O : F
    //   111: fcmpg
    //   112: ifgt -> 127
    //   115: aload_0
    //   116: getfield O : F
    //   119: fstore #6
    //   121: iconst_1
    //   122: istore #8
    //   124: goto -> 130
    //   127: iconst_0
    //   128: istore #8
    //   130: fload #6
    //   132: fstore #5
    //   134: aload #4
    //   136: ifnull -> 189
    //   139: fload #6
    //   141: fstore #5
    //   143: iload #8
    //   145: ifne -> 189
    //   148: aload_0
    //   149: getfield a0 : Z
    //   152: ifeq -> 178
    //   155: aload #4
    //   157: lload_2
    //   158: aload_0
    //   159: getfield J : J
    //   162: lsub
    //   163: l2f
    //   164: ldc_w 1.0E-9
    //   167: fmul
    //   168: invokeinterface getInterpolation : (F)F
    //   173: fstore #5
    //   175: goto -> 189
    //   178: aload #4
    //   180: fload #6
    //   182: invokeinterface getInterpolation : (F)F
    //   187: fstore #5
    //   189: fload_1
    //   190: fconst_0
    //   191: fcmpl
    //   192: ifle -> 205
    //   195: fload #5
    //   197: aload_0
    //   198: getfield O : F
    //   201: fcmpl
    //   202: ifge -> 229
    //   205: fload #5
    //   207: fstore #6
    //   209: fload_1
    //   210: fconst_0
    //   211: fcmpg
    //   212: ifgt -> 235
    //   215: fload #5
    //   217: fstore #6
    //   219: fload #5
    //   221: aload_0
    //   222: getfield O : F
    //   225: fcmpg
    //   226: ifgt -> 235
    //   229: aload_0
    //   230: getfield O : F
    //   233: fstore #6
    //   235: aload_0
    //   236: fload #6
    //   238: putfield F0 : F
    //   241: aload_0
    //   242: invokevirtual getChildCount : ()I
    //   245: istore #9
    //   247: aload_0
    //   248: invokevirtual getNanoTime : ()J
    //   251: lstore_2
    //   252: iload #7
    //   254: istore #8
    //   256: iload #8
    //   258: iload #9
    //   260: if_icmpge -> 311
    //   263: aload_0
    //   264: iload #8
    //   266: invokevirtual getChildAt : (I)Landroid/view/View;
    //   269: astore #4
    //   271: aload_0
    //   272: getfield I : Ljava/util/HashMap;
    //   275: aload #4
    //   277: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   280: checkcast androidx/constraintlayout/motion/widget/o
    //   283: astore #10
    //   285: aload #10
    //   287: ifnull -> 305
    //   290: aload #10
    //   292: aload #4
    //   294: fload #6
    //   296: lload_2
    //   297: aload_0
    //   298: getfield G0 : Landroidx/constraintlayout/motion/widget/e;
    //   301: invokevirtual o : (Landroid/view/View;FJLandroidx/constraintlayout/motion/widget/e;)Z
    //   304: pop
    //   305: iinc #8, 1
    //   308: goto -> 256
    //   311: aload_0
    //   312: getfield y0 : Z
    //   315: ifeq -> 322
    //   318: aload_0
    //   319: invokevirtual requestLayout : ()V
    //   322: return
  }
  
  private void b0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield S : Landroidx/constraintlayout/motion/widget/MotionLayout$i;
    //   4: ifnonnull -> 23
    //   7: aload_0
    //   8: getfield r0 : Ljava/util/ArrayList;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 219
    //   16: aload_1
    //   17: invokevirtual isEmpty : ()Z
    //   20: ifne -> 219
    //   23: aload_0
    //   24: getfield w0 : F
    //   27: aload_0
    //   28: getfield L : F
    //   31: fcmpl
    //   32: ifeq -> 219
    //   35: aload_0
    //   36: getfield v0 : I
    //   39: iconst_m1
    //   40: if_icmpeq -> 121
    //   43: aload_0
    //   44: getfield S : Landroidx/constraintlayout/motion/widget/MotionLayout$i;
    //   47: astore_1
    //   48: aload_1
    //   49: ifnull -> 67
    //   52: aload_1
    //   53: aload_0
    //   54: aload_0
    //   55: getfield C : I
    //   58: aload_0
    //   59: getfield E : I
    //   62: invokeinterface b : (Landroidx/constraintlayout/motion/widget/MotionLayout;II)V
    //   67: aload_0
    //   68: getfield r0 : Ljava/util/ArrayList;
    //   71: astore_1
    //   72: aload_1
    //   73: ifnull -> 116
    //   76: aload_1
    //   77: invokevirtual iterator : ()Ljava/util/Iterator;
    //   80: astore_1
    //   81: aload_1
    //   82: invokeinterface hasNext : ()Z
    //   87: ifeq -> 116
    //   90: aload_1
    //   91: invokeinterface next : ()Ljava/lang/Object;
    //   96: checkcast androidx/constraintlayout/motion/widget/MotionLayout$i
    //   99: aload_0
    //   100: aload_0
    //   101: getfield C : I
    //   104: aload_0
    //   105: getfield E : I
    //   108: invokeinterface b : (Landroidx/constraintlayout/motion/widget/MotionLayout;II)V
    //   113: goto -> 81
    //   116: aload_0
    //   117: iconst_1
    //   118: putfield x0 : Z
    //   121: aload_0
    //   122: iconst_m1
    //   123: putfield v0 : I
    //   126: aload_0
    //   127: getfield L : F
    //   130: fstore_2
    //   131: aload_0
    //   132: fload_2
    //   133: putfield w0 : F
    //   136: aload_0
    //   137: getfield S : Landroidx/constraintlayout/motion/widget/MotionLayout$i;
    //   140: astore_1
    //   141: aload_1
    //   142: ifnull -> 161
    //   145: aload_1
    //   146: aload_0
    //   147: aload_0
    //   148: getfield C : I
    //   151: aload_0
    //   152: getfield E : I
    //   155: fload_2
    //   156: invokeinterface a : (Landroidx/constraintlayout/motion/widget/MotionLayout;IIF)V
    //   161: aload_0
    //   162: getfield r0 : Ljava/util/ArrayList;
    //   165: astore_1
    //   166: aload_1
    //   167: ifnull -> 214
    //   170: aload_1
    //   171: invokevirtual iterator : ()Ljava/util/Iterator;
    //   174: astore_1
    //   175: aload_1
    //   176: invokeinterface hasNext : ()Z
    //   181: ifeq -> 214
    //   184: aload_1
    //   185: invokeinterface next : ()Ljava/lang/Object;
    //   190: checkcast androidx/constraintlayout/motion/widget/MotionLayout$i
    //   193: aload_0
    //   194: aload_0
    //   195: getfield C : I
    //   198: aload_0
    //   199: getfield E : I
    //   202: aload_0
    //   203: getfield L : F
    //   206: invokeinterface a : (Landroidx/constraintlayout/motion/widget/MotionLayout;IIF)V
    //   211: goto -> 175
    //   214: aload_0
    //   215: iconst_1
    //   216: putfield x0 : Z
    //   219: return
  }
  
  private boolean h0(float paramFloat1, float paramFloat2, View paramView, MotionEvent paramMotionEvent) {
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      int j = viewGroup.getChildCount();
      for (byte b1 = 0; b1 < j; b1++) {
        View view = viewGroup.getChildAt(b1);
        if (h0(paramView.getLeft() + paramFloat1, paramView.getTop() + paramFloat2, view, paramMotionEvent))
          return true; 
      } 
    } 
    this.M0.set(paramView.getLeft() + paramFloat1, paramView.getTop() + paramFloat2, paramFloat1 + paramView.getRight(), paramFloat2 + paramView.getBottom());
    if (paramMotionEvent.getAction() == 0) {
      if (this.M0.contains(paramMotionEvent.getX(), paramMotionEvent.getY()) && paramView.onTouchEvent(paramMotionEvent))
        return true; 
    } else if (paramView.onTouchEvent(paramMotionEvent)) {
      return true;
    } 
    return false;
  }
  
  private void i0(AttributeSet paramAttributeSet) {
    y = isInEditMode();
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, androidx.constraintlayout.widget.e.MotionLayout);
      int j = typedArray.getIndexCount();
      byte b1 = 0;
      boolean bool;
      for (bool = true; b1 < j; bool = bool1) {
        boolean bool1;
        int k = typedArray.getIndex(b1);
        if (k == androidx.constraintlayout.widget.e.MotionLayout_layoutDescription) {
          k = typedArray.getResourceId(k, -1);
          this.z = new r(getContext(), this, k);
          bool1 = bool;
        } else if (k == androidx.constraintlayout.widget.e.MotionLayout_currentState) {
          this.D = typedArray.getResourceId(k, -1);
          bool1 = bool;
        } else if (k == androidx.constraintlayout.widget.e.MotionLayout_motionProgress) {
          this.O = typedArray.getFloat(k, 0.0F);
          this.Q = true;
          bool1 = bool;
        } else if (k == androidx.constraintlayout.widget.e.MotionLayout_applyMotionScene) {
          bool1 = typedArray.getBoolean(k, bool);
        } else if (k == androidx.constraintlayout.widget.e.MotionLayout_showPaths) {
          bool1 = bool;
          if (this.V == 0) {
            if (typedArray.getBoolean(k, false)) {
              k = 2;
            } else {
              k = 0;
            } 
            this.V = k;
            bool1 = bool;
          } 
        } else {
          bool1 = bool;
          if (k == androidx.constraintlayout.widget.e.MotionLayout_motionDebug) {
            this.V = typedArray.getInt(k, 0);
            bool1 = bool;
          } 
        } 
        b1++;
      } 
      typedArray.recycle();
      if (this.z == null)
        Log.e("MotionLayout", "WARNING NO app:layoutDescription tag"); 
      if (!bool)
        this.z = null; 
    } 
    if (this.V != 0)
      V(); 
    if (this.D == -1) {
      r r1 = this.z;
      if (r1 != null) {
        this.D = r1.x();
        this.C = this.z.x();
        this.E = this.z.n();
      } 
    } 
  }
  
  private void m0() {
    if (this.S == null) {
      ArrayList<i> arrayList = this.r0;
      if (arrayList == null || arrayList.isEmpty())
        return; 
    } 
    this.x0 = false;
    for (Integer integer : this.O0) {
      i i1 = this.S;
      if (i1 != null)
        i1.d(this, integer.intValue()); 
      ArrayList<i> arrayList = this.r0;
      if (arrayList != null) {
        Iterator<i> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((i)iterator.next()).d(this, integer.intValue()); 
      } 
    } 
    this.O0.clear();
  }
  
  private void o0() {
    int j = getChildCount();
    this.K0.a();
    boolean bool = true;
    this.Q = true;
    int k = getWidth();
    int m = getHeight();
    int i1 = this.z.h();
    byte b1 = 0;
    byte b2 = 0;
    if (i1 != -1)
      for (byte b4 = 0; b4 < j; b4++) {
        o o = this.I.get(getChildAt(b4));
        if (o != null)
          o.r(i1); 
      }  
    byte b3;
    for (b3 = 0; b3 < j; b3++) {
      o o = this.I.get(getChildAt(b3));
      if (o != null) {
        this.z.q(o);
        o.v(k, m, this.K, getNanoTime());
      } 
    } 
    float f = this.z.w();
    if (f != 0.0F) {
      if (f < 0.0D) {
        b3 = 1;
      } else {
        b3 = 0;
      } 
      float f1 = Math.abs(f);
      float f2 = -3.4028235E38F;
      float f3 = Float.MAX_VALUE;
      k = 0;
      float f4 = Float.MAX_VALUE;
      f = -3.4028235E38F;
      while (true) {
        if (k < j) {
          o o = this.I.get(getChildAt(k));
          if (!Float.isNaN(o.k)) {
            k = bool;
            break;
          } 
          float f5 = o.i();
          float f6 = o.j();
          if (b3 != 0) {
            f5 = f6 - f5;
          } else {
            f5 = f6 + f5;
          } 
          f4 = Math.min(f4, f5);
          f = Math.max(f, f5);
          k++;
          continue;
        } 
        k = 0;
        break;
      } 
      if (k != 0) {
        k = 0;
        f4 = f3;
        float f5 = f2;
        while (true) {
          b1 = b2;
          if (k < j) {
            o o = this.I.get(getChildAt(k));
            f2 = f5;
            f = f4;
            if (!Float.isNaN(o.k)) {
              f = Math.min(f4, o.k);
              f2 = Math.max(f5, o.k);
            } 
            k++;
            f5 = f2;
            f4 = f;
            continue;
          } 
          break;
        } 
        while (b1 < j) {
          o o = this.I.get(getChildAt(b1));
          if (!Float.isNaN(o.k)) {
            o.m = 1.0F / (1.0F - f1);
            if (b3 != 0) {
              o.l = f1 - (f5 - o.k) / (f5 - f4) * f1;
            } else {
              o.l = f1 - (o.k - f4) * f1 / (f5 - f4);
            } 
          } 
          b1++;
        } 
      } else {
        while (b1 < j) {
          o o = this.I.get(getChildAt(b1));
          f2 = o.i();
          float f5 = o.j();
          if (b3 != 0) {
            f5 -= f2;
          } else {
            f5 += f2;
          } 
          o.m = 1.0F / (1.0F - f1);
          o.l = f1 - (f5 - f4) * f1 / (f - f4);
          b1++;
        } 
      } 
    } 
  }
  
  private static boolean u0(float paramFloat1, float paramFloat2, float paramFloat3) {
    boolean bool1 = true;
    boolean bool2 = true;
    if (paramFloat1 > 0.0F) {
      float f1 = paramFloat1 / paramFloat3;
      if (paramFloat2 + paramFloat1 * f1 - paramFloat3 * f1 * f1 / 2.0F <= 1.0F)
        bool2 = false; 
      return bool2;
    } 
    float f = -paramFloat1 / paramFloat3;
    if (paramFloat2 + paramFloat1 * f + paramFloat3 * f * f / 2.0F < 0.0F) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    return bool2;
  }
  
  void U(float paramFloat) {
    r r1 = this.z;
    if (r1 == null)
      return; 
    float f1 = this.M;
    float f2 = this.L;
    if (f1 != f2 && this.P)
      this.M = f2; 
    f2 = this.M;
    if (f2 == paramFloat)
      return; 
    this.a0 = false;
    this.O = paramFloat;
    this.K = r1.m() / 1000.0F;
    setProgress(this.O);
    this.A = this.z.p();
    this.P = false;
    this.J = getNanoTime();
    this.Q = true;
    this.L = f2;
    this.M = f2;
    invalidate();
  }
  
  void Z(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield N : J
    //   4: ldc2_w -1
    //   7: lcmp
    //   8: ifne -> 19
    //   11: aload_0
    //   12: aload_0
    //   13: invokevirtual getNanoTime : ()J
    //   16: putfield N : J
    //   19: aload_0
    //   20: getfield M : F
    //   23: fstore_2
    //   24: fload_2
    //   25: fconst_0
    //   26: fcmpl
    //   27: ifle -> 41
    //   30: fload_2
    //   31: fconst_1
    //   32: fcmpg
    //   33: ifge -> 41
    //   36: aload_0
    //   37: iconst_m1
    //   38: putfield D : I
    //   41: aload_0
    //   42: getfield o0 : Z
    //   45: istore_3
    //   46: iconst_1
    //   47: istore #4
    //   49: iconst_1
    //   50: istore #5
    //   52: iconst_0
    //   53: istore #6
    //   55: iconst_0
    //   56: istore #7
    //   58: iload_3
    //   59: ifne -> 90
    //   62: iload #6
    //   64: istore #8
    //   66: aload_0
    //   67: getfield Q : Z
    //   70: ifeq -> 1022
    //   73: iload_1
    //   74: ifne -> 90
    //   77: iload #6
    //   79: istore #8
    //   81: aload_0
    //   82: getfield O : F
    //   85: fload_2
    //   86: fcmpl
    //   87: ifeq -> 1022
    //   90: aload_0
    //   91: getfield O : F
    //   94: fload_2
    //   95: fsub
    //   96: invokestatic signum : (F)F
    //   99: fstore #9
    //   101: aload_0
    //   102: invokevirtual getNanoTime : ()J
    //   105: lstore #10
    //   107: aload_0
    //   108: getfield A : Landroid/view/animation/Interpolator;
    //   111: astore #12
    //   113: aload #12
    //   115: instanceof androidx/constraintlayout/motion/widget/p
    //   118: ifne -> 152
    //   121: lload #10
    //   123: aload_0
    //   124: getfield N : J
    //   127: lsub
    //   128: l2f
    //   129: fload #9
    //   131: fmul
    //   132: ldc_w 1.0E-9
    //   135: fmul
    //   136: aload_0
    //   137: getfield K : F
    //   140: fdiv
    //   141: fstore #13
    //   143: aload_0
    //   144: fload #13
    //   146: putfield B : F
    //   149: goto -> 155
    //   152: fconst_0
    //   153: fstore #13
    //   155: aload_0
    //   156: getfield M : F
    //   159: fload #13
    //   161: fadd
    //   162: fstore #14
    //   164: aload_0
    //   165: getfield P : Z
    //   168: ifeq -> 177
    //   171: aload_0
    //   172: getfield O : F
    //   175: fstore #14
    //   177: fload #9
    //   179: fconst_0
    //   180: fcmpl
    //   181: ifle -> 194
    //   184: fload #14
    //   186: aload_0
    //   187: getfield O : F
    //   190: fcmpl
    //   191: ifge -> 211
    //   194: fload #9
    //   196: fconst_0
    //   197: fcmpg
    //   198: ifgt -> 228
    //   201: fload #14
    //   203: aload_0
    //   204: getfield O : F
    //   207: fcmpg
    //   208: ifgt -> 228
    //   211: aload_0
    //   212: getfield O : F
    //   215: fstore #14
    //   217: aload_0
    //   218: iconst_0
    //   219: putfield Q : Z
    //   222: iconst_1
    //   223: istore #8
    //   225: goto -> 231
    //   228: iconst_0
    //   229: istore #8
    //   231: aload_0
    //   232: fload #14
    //   234: putfield M : F
    //   237: aload_0
    //   238: fload #14
    //   240: putfield L : F
    //   243: aload_0
    //   244: lload #10
    //   246: putfield N : J
    //   249: fload #14
    //   251: fstore_2
    //   252: aload #12
    //   254: ifnull -> 493
    //   257: fload #14
    //   259: fstore_2
    //   260: iload #8
    //   262: ifne -> 493
    //   265: aload_0
    //   266: getfield a0 : Z
    //   269: ifeq -> 430
    //   272: aload #12
    //   274: lload #10
    //   276: aload_0
    //   277: getfield J : J
    //   280: lsub
    //   281: l2f
    //   282: ldc_w 1.0E-9
    //   285: fmul
    //   286: invokeinterface getInterpolation : (F)F
    //   291: fstore #13
    //   293: aload_0
    //   294: fload #13
    //   296: putfield M : F
    //   299: aload_0
    //   300: lload #10
    //   302: putfield N : J
    //   305: aload_0
    //   306: getfield A : Landroid/view/animation/Interpolator;
    //   309: astore #12
    //   311: fload #13
    //   313: fstore_2
    //   314: aload #12
    //   316: instanceof androidx/constraintlayout/motion/widget/p
    //   319: ifeq -> 493
    //   322: aload #12
    //   324: checkcast androidx/constraintlayout/motion/widget/p
    //   327: invokevirtual a : ()F
    //   330: fstore #15
    //   332: aload_0
    //   333: fload #15
    //   335: putfield B : F
    //   338: fload #15
    //   340: invokestatic abs : (F)F
    //   343: aload_0
    //   344: getfield K : F
    //   347: fmul
    //   348: ldc_w 1.0E-5
    //   351: fcmpg
    //   352: ifgt -> 360
    //   355: aload_0
    //   356: iconst_0
    //   357: putfield Q : Z
    //   360: fload #13
    //   362: fstore #14
    //   364: fload #15
    //   366: fconst_0
    //   367: fcmpl
    //   368: ifle -> 395
    //   371: fload #13
    //   373: fstore #14
    //   375: fload #13
    //   377: fconst_1
    //   378: fcmpl
    //   379: iflt -> 395
    //   382: aload_0
    //   383: fconst_1
    //   384: putfield M : F
    //   387: aload_0
    //   388: iconst_0
    //   389: putfield Q : Z
    //   392: fconst_1
    //   393: fstore #14
    //   395: fload #14
    //   397: fstore_2
    //   398: fload #15
    //   400: fconst_0
    //   401: fcmpg
    //   402: ifge -> 493
    //   405: fload #14
    //   407: fstore_2
    //   408: fload #14
    //   410: fconst_0
    //   411: fcmpg
    //   412: ifgt -> 493
    //   415: aload_0
    //   416: fconst_0
    //   417: putfield M : F
    //   420: aload_0
    //   421: iconst_0
    //   422: putfield Q : Z
    //   425: fconst_0
    //   426: fstore_2
    //   427: goto -> 493
    //   430: aload #12
    //   432: fload #14
    //   434: invokeinterface getInterpolation : (F)F
    //   439: fstore_2
    //   440: aload_0
    //   441: getfield A : Landroid/view/animation/Interpolator;
    //   444: astore #12
    //   446: aload #12
    //   448: instanceof androidx/constraintlayout/motion/widget/p
    //   451: ifeq -> 469
    //   454: aload_0
    //   455: aload #12
    //   457: checkcast androidx/constraintlayout/motion/widget/p
    //   460: invokevirtual a : ()F
    //   463: putfield B : F
    //   466: goto -> 493
    //   469: aload_0
    //   470: aload #12
    //   472: fload #14
    //   474: fload #13
    //   476: fadd
    //   477: invokeinterface getInterpolation : (F)F
    //   482: fload_2
    //   483: fsub
    //   484: fload #9
    //   486: fmul
    //   487: fload #13
    //   489: fdiv
    //   490: putfield B : F
    //   493: aload_0
    //   494: getfield B : F
    //   497: invokestatic abs : (F)F
    //   500: ldc_w 1.0E-5
    //   503: fcmpl
    //   504: ifle -> 514
    //   507: aload_0
    //   508: getstatic androidx/constraintlayout/motion/widget/MotionLayout$TransitionState.d : Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;
    //   511: invokevirtual setState : (Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;)V
    //   514: fload #9
    //   516: fconst_0
    //   517: fcmpl
    //   518: ifle -> 530
    //   521: fload_2
    //   522: aload_0
    //   523: getfield O : F
    //   526: fcmpl
    //   527: ifge -> 552
    //   530: fload_2
    //   531: fstore #14
    //   533: fload #9
    //   535: fconst_0
    //   536: fcmpg
    //   537: ifgt -> 563
    //   540: fload_2
    //   541: fstore #14
    //   543: fload_2
    //   544: aload_0
    //   545: getfield O : F
    //   548: fcmpg
    //   549: ifgt -> 563
    //   552: aload_0
    //   553: getfield O : F
    //   556: fstore #14
    //   558: aload_0
    //   559: iconst_0
    //   560: putfield Q : Z
    //   563: fload #14
    //   565: fconst_1
    //   566: fcmpl
    //   567: ifge -> 577
    //   570: fload #14
    //   572: fconst_0
    //   573: fcmpg
    //   574: ifgt -> 589
    //   577: aload_0
    //   578: iconst_0
    //   579: putfield Q : Z
    //   582: aload_0
    //   583: getstatic androidx/constraintlayout/motion/widget/MotionLayout$TransitionState.e : Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;
    //   586: invokevirtual setState : (Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;)V
    //   589: aload_0
    //   590: invokevirtual getChildCount : ()I
    //   593: istore #6
    //   595: aload_0
    //   596: iconst_0
    //   597: putfield o0 : Z
    //   600: aload_0
    //   601: invokevirtual getNanoTime : ()J
    //   604: lstore #10
    //   606: aload_0
    //   607: fload #14
    //   609: putfield F0 : F
    //   612: iconst_0
    //   613: istore #8
    //   615: iload #8
    //   617: iload #6
    //   619: if_icmpge -> 679
    //   622: aload_0
    //   623: iload #8
    //   625: invokevirtual getChildAt : (I)Landroid/view/View;
    //   628: astore #12
    //   630: aload_0
    //   631: getfield I : Ljava/util/HashMap;
    //   634: aload #12
    //   636: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   639: checkcast androidx/constraintlayout/motion/widget/o
    //   642: astore #16
    //   644: aload #16
    //   646: ifnull -> 673
    //   649: aload_0
    //   650: aload_0
    //   651: getfield o0 : Z
    //   654: aload #16
    //   656: aload #12
    //   658: fload #14
    //   660: lload #10
    //   662: aload_0
    //   663: getfield G0 : Landroidx/constraintlayout/motion/widget/e;
    //   666: invokevirtual o : (Landroid/view/View;FJLandroidx/constraintlayout/motion/widget/e;)Z
    //   669: ior
    //   670: putfield o0 : Z
    //   673: iinc #8, 1
    //   676: goto -> 615
    //   679: fload #9
    //   681: fconst_0
    //   682: fcmpl
    //   683: ifle -> 696
    //   686: fload #14
    //   688: aload_0
    //   689: getfield O : F
    //   692: fcmpl
    //   693: ifge -> 713
    //   696: fload #9
    //   698: fconst_0
    //   699: fcmpg
    //   700: ifgt -> 719
    //   703: fload #14
    //   705: aload_0
    //   706: getfield O : F
    //   709: fcmpg
    //   710: ifgt -> 719
    //   713: iconst_1
    //   714: istore #8
    //   716: goto -> 722
    //   719: iconst_0
    //   720: istore #8
    //   722: aload_0
    //   723: getfield o0 : Z
    //   726: ifne -> 748
    //   729: aload_0
    //   730: getfield Q : Z
    //   733: ifne -> 748
    //   736: iload #8
    //   738: ifeq -> 748
    //   741: aload_0
    //   742: getstatic androidx/constraintlayout/motion/widget/MotionLayout$TransitionState.e : Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;
    //   745: invokevirtual setState : (Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;)V
    //   748: aload_0
    //   749: getfield y0 : Z
    //   752: ifeq -> 759
    //   755: aload_0
    //   756: invokevirtual requestLayout : ()V
    //   759: aload_0
    //   760: iload #8
    //   762: iconst_1
    //   763: ixor
    //   764: aload_0
    //   765: getfield o0 : Z
    //   768: ior
    //   769: putfield o0 : Z
    //   772: iload #7
    //   774: istore #8
    //   776: fload #14
    //   778: fconst_0
    //   779: fcmpg
    //   780: ifgt -> 841
    //   783: aload_0
    //   784: getfield C : I
    //   787: istore #6
    //   789: iload #7
    //   791: istore #8
    //   793: iload #6
    //   795: iconst_m1
    //   796: if_icmpeq -> 841
    //   799: iload #7
    //   801: istore #8
    //   803: aload_0
    //   804: getfield D : I
    //   807: iload #6
    //   809: if_icmpeq -> 841
    //   812: aload_0
    //   813: iload #6
    //   815: putfield D : I
    //   818: aload_0
    //   819: getfield z : Landroidx/constraintlayout/motion/widget/r;
    //   822: iload #6
    //   824: invokevirtual i : (I)Landroidx/constraintlayout/widget/b;
    //   827: aload_0
    //   828: invokevirtual c : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   831: aload_0
    //   832: getstatic androidx/constraintlayout/motion/widget/MotionLayout$TransitionState.e : Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;
    //   835: invokevirtual setState : (Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;)V
    //   838: iconst_1
    //   839: istore #8
    //   841: iload #8
    //   843: istore #7
    //   845: fload #14
    //   847: f2d
    //   848: dconst_1
    //   849: dcmpl
    //   850: iflt -> 905
    //   853: aload_0
    //   854: getfield D : I
    //   857: istore #17
    //   859: aload_0
    //   860: getfield E : I
    //   863: istore #6
    //   865: iload #8
    //   867: istore #7
    //   869: iload #17
    //   871: iload #6
    //   873: if_icmpeq -> 905
    //   876: aload_0
    //   877: iload #6
    //   879: putfield D : I
    //   882: aload_0
    //   883: getfield z : Landroidx/constraintlayout/motion/widget/r;
    //   886: iload #6
    //   888: invokevirtual i : (I)Landroidx/constraintlayout/widget/b;
    //   891: aload_0
    //   892: invokevirtual c : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   895: aload_0
    //   896: getstatic androidx/constraintlayout/motion/widget/MotionLayout$TransitionState.e : Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;
    //   899: invokevirtual setState : (Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;)V
    //   902: iconst_1
    //   903: istore #7
    //   905: aload_0
    //   906: getfield o0 : Z
    //   909: ifne -> 960
    //   912: aload_0
    //   913: getfield Q : Z
    //   916: ifeq -> 922
    //   919: goto -> 960
    //   922: fload #9
    //   924: fconst_0
    //   925: fcmpl
    //   926: ifle -> 936
    //   929: fload #14
    //   931: fconst_1
    //   932: fcmpl
    //   933: ifeq -> 950
    //   936: fload #9
    //   938: fconst_0
    //   939: fcmpg
    //   940: ifge -> 964
    //   943: fload #14
    //   945: fconst_0
    //   946: fcmpl
    //   947: ifne -> 964
    //   950: aload_0
    //   951: getstatic androidx/constraintlayout/motion/widget/MotionLayout$TransitionState.e : Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;
    //   954: invokevirtual setState : (Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;)V
    //   957: goto -> 964
    //   960: aload_0
    //   961: invokevirtual invalidate : ()V
    //   964: aload_0
    //   965: getfield o0 : Z
    //   968: ifne -> 992
    //   971: aload_0
    //   972: getfield Q : Z
    //   975: ifeq -> 992
    //   978: fload #9
    //   980: fconst_0
    //   981: fcmpl
    //   982: ifle -> 992
    //   985: fload #14
    //   987: fconst_1
    //   988: fcmpl
    //   989: ifeq -> 1014
    //   992: iload #7
    //   994: istore #8
    //   996: fload #9
    //   998: fconst_0
    //   999: fcmpg
    //   1000: ifge -> 1022
    //   1003: iload #7
    //   1005: istore #8
    //   1007: fload #14
    //   1009: fconst_0
    //   1010: fcmpl
    //   1011: ifne -> 1022
    //   1014: aload_0
    //   1015: invokevirtual l0 : ()V
    //   1018: iload #7
    //   1020: istore #8
    //   1022: aload_0
    //   1023: getfield M : F
    //   1026: fstore_2
    //   1027: fload_2
    //   1028: fconst_1
    //   1029: fcmpl
    //   1030: iflt -> 1072
    //   1033: aload_0
    //   1034: getfield D : I
    //   1037: istore #4
    //   1039: aload_0
    //   1040: getfield E : I
    //   1043: istore #7
    //   1045: iload #4
    //   1047: iload #7
    //   1049: if_icmpeq -> 1059
    //   1052: iload #5
    //   1054: istore #8
    //   1056: goto -> 1059
    //   1059: aload_0
    //   1060: iload #7
    //   1062: putfield D : I
    //   1065: iload #8
    //   1067: istore #7
    //   1069: goto -> 1117
    //   1072: iload #8
    //   1074: istore #7
    //   1076: fload_2
    //   1077: fconst_0
    //   1078: fcmpg
    //   1079: ifgt -> 1117
    //   1082: aload_0
    //   1083: getfield D : I
    //   1086: istore #5
    //   1088: aload_0
    //   1089: getfield C : I
    //   1092: istore #7
    //   1094: iload #5
    //   1096: iload #7
    //   1098: if_icmpeq -> 1108
    //   1101: iload #4
    //   1103: istore #8
    //   1105: goto -> 1108
    //   1108: aload_0
    //   1109: iload #7
    //   1111: putfield D : I
    //   1114: goto -> 1065
    //   1117: aload_0
    //   1118: aload_0
    //   1119: getfield L0 : Z
    //   1122: iload #7
    //   1124: ior
    //   1125: putfield L0 : Z
    //   1128: iload #7
    //   1130: ifeq -> 1144
    //   1133: aload_0
    //   1134: getfield H0 : Z
    //   1137: ifne -> 1144
    //   1140: aload_0
    //   1141: invokevirtual requestLayout : ()V
    //   1144: aload_0
    //   1145: aload_0
    //   1146: getfield M : F
    //   1149: putfield L : F
    //   1152: return
  }
  
  protected void c0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield S : Landroidx/constraintlayout/motion/widget/MotionLayout$i;
    //   4: ifnonnull -> 23
    //   7: aload_0
    //   8: getfield r0 : Ljava/util/ArrayList;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 103
    //   16: aload_1
    //   17: invokevirtual isEmpty : ()Z
    //   20: ifne -> 103
    //   23: aload_0
    //   24: getfield v0 : I
    //   27: iconst_m1
    //   28: if_icmpne -> 103
    //   31: aload_0
    //   32: aload_0
    //   33: getfield D : I
    //   36: putfield v0 : I
    //   39: aload_0
    //   40: getfield O0 : Ljava/util/ArrayList;
    //   43: invokevirtual isEmpty : ()Z
    //   46: ifne -> 74
    //   49: aload_0
    //   50: getfield O0 : Ljava/util/ArrayList;
    //   53: astore_1
    //   54: aload_1
    //   55: aload_1
    //   56: invokevirtual size : ()I
    //   59: iconst_1
    //   60: isub
    //   61: invokevirtual get : (I)Ljava/lang/Object;
    //   64: checkcast java/lang/Integer
    //   67: invokevirtual intValue : ()I
    //   70: istore_2
    //   71: goto -> 76
    //   74: iconst_m1
    //   75: istore_2
    //   76: aload_0
    //   77: getfield D : I
    //   80: istore_3
    //   81: iload_2
    //   82: iload_3
    //   83: if_icmpeq -> 103
    //   86: iload_3
    //   87: iconst_m1
    //   88: if_icmpeq -> 103
    //   91: aload_0
    //   92: getfield O0 : Ljava/util/ArrayList;
    //   95: iload_3
    //   96: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   99: invokevirtual add : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: aload_0
    //   104: invokespecial m0 : ()V
    //   107: return
  }
  
  public void d0(int paramInt, boolean paramBoolean, float paramFloat) {
    i i1 = this.S;
    if (i1 != null)
      i1.c(this, paramInt, paramBoolean, paramFloat); 
    ArrayList<i> arrayList = this.r0;
    if (arrayList != null) {
      Iterator<i> iterator = arrayList.iterator();
      while (iterator.hasNext())
        ((i)iterator.next()).c(this, paramInt, paramBoolean, paramFloat); 
    } 
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    Z(false);
    super.dispatchDraw(paramCanvas);
    if (this.z == null)
      return; 
    if ((this.V & 0x1) == 1 && !isInEditMode()) {
      this.s0++;
      long l1 = getNanoTime();
      long l2 = this.t0;
      if (l2 != -1L) {
        l2 = l1 - l2;
        if (l2 > 200000000L) {
          this.u0 = (int)(this.s0 / (float)l2 * 1.0E-9F * 100.0F) / 100.0F;
          this.s0 = 0;
          this.t0 = l1;
        } 
      } else {
        this.t0 = l1;
      } 
      Paint paint = new Paint();
      paint.setTextSize(42.0F);
      float f = (int)(getProgress() * 1000.0F) / 10.0F;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.u0);
      stringBuilder1.append(" fps ");
      stringBuilder1.append(a.d(this, this.C));
      stringBuilder1.append(" -> ");
      String str = stringBuilder1.toString();
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(str);
      stringBuilder2.append(a.d(this, this.E));
      stringBuilder2.append(" (progress: ");
      stringBuilder2.append(f);
      stringBuilder2.append(" ) state=");
      int j = this.D;
      if (j == -1) {
        str = "undefined";
      } else {
        str = a.d(this, j);
      } 
      stringBuilder2.append(str);
      str = stringBuilder2.toString();
      paint.setColor(-16777216);
      paramCanvas.drawText(str, 11.0F, (getHeight() - 29), paint);
      paint.setColor(-7864184);
      paramCanvas.drawText(str, 10.0F, (getHeight() - 30), paint);
    } 
    if (this.V > 1) {
      if (this.W == null)
        this.W = new d(this); 
      this.W.a(paramCanvas, this.I, this.z.m(), this.V);
    } 
  }
  
  void e0(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float[] paramArrayOffloat) {
    HashMap<View, o> hashMap = this.I;
    View view = o(paramInt);
    o o = hashMap.get(view);
    if (o != null) {
      o.g(paramFloat1, paramFloat2, paramFloat3, paramArrayOffloat);
      paramFloat3 = view.getY();
      paramFloat2 = this.T;
      this.T = paramFloat1;
      this.U = paramFloat3;
    } else {
      String str;
      if (view == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(paramInt);
        str = stringBuilder1.toString();
      } else {
        str = view.getContext().getResources().getResourceName(paramInt);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("WARNING could not find view id ");
      stringBuilder.append(str);
      Log.w("MotionLayout", stringBuilder.toString());
    } 
  }
  
  public r.b f0(int paramInt) {
    return this.z.y(paramInt);
  }
  
  public void g0(View paramView, float paramFloat1, float paramFloat2, float[] paramArrayOffloat, int paramInt) {
    float f1 = this.B;
    float f2 = this.M;
    if (this.A != null) {
      float f = Math.signum(this.O - f2);
      f1 = this.A.getInterpolation(this.M + 1.0E-5F);
      f2 = this.A.getInterpolation(this.M);
      f1 = f * (f1 - f2) / 1.0E-5F / this.K;
    } 
    Interpolator interpolator = this.A;
    if (interpolator instanceof p)
      f1 = ((p)interpolator).a(); 
    o o = this.I.get(paramView);
    if ((paramInt & 0x1) == 0) {
      o.l(f2, paramView.getWidth(), paramView.getHeight(), paramFloat1, paramFloat2, paramArrayOffloat);
    } else {
      o.g(f2, paramFloat1, paramFloat2, paramArrayOffloat);
    } 
    if (paramInt < 2) {
      paramArrayOffloat[0] = paramArrayOffloat[0] * f1;
      paramArrayOffloat[1] = paramArrayOffloat[1] * f1;
    } 
  }
  
  public int[] getConstraintSetIds() {
    r r1 = this.z;
    return (r1 == null) ? null : r1.k();
  }
  
  public int getCurrentState() {
    return this.D;
  }
  
  public ArrayList<r.b> getDefinedTransitions() {
    r r1 = this.z;
    return (r1 == null) ? null : r1.l();
  }
  
  public b getDesignTool() {
    if (this.d0 == null)
      this.d0 = new b(this); 
    return this.d0;
  }
  
  public int getEndState() {
    return this.E;
  }
  
  protected long getNanoTime() {
    return System.nanoTime();
  }
  
  public float getProgress() {
    return this.M;
  }
  
  public int getStartState() {
    return this.C;
  }
  
  public float getTargetPosition() {
    return this.O;
  }
  
  public Bundle getTransitionState() {
    if (this.I0 == null)
      this.I0 = new h(this); 
    this.I0.c();
    return this.I0.b();
  }
  
  public long getTransitionTimeMs() {
    r r1 = this.z;
    if (r1 != null)
      this.K = r1.m() / 1000.0F; 
    return (long)(this.K * 1000.0F);
  }
  
  public float getVelocity() {
    return this.B;
  }
  
  public void h(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    if (this.j0 || paramInt1 != 0 || paramInt2 != 0) {
      paramArrayOfint[0] = paramArrayOfint[0] + paramInt3;
      paramArrayOfint[1] = paramArrayOfint[1] + paramInt4;
    } 
    this.j0 = false;
  }
  
  public void i(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public boolean isAttachedToWindow() {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 19)
      return super.isAttachedToWindow(); 
    if (getWindowToken() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean j(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    r r1 = this.z;
    if (r1 != null) {
      r.b b1 = r1.c;
      if (b1 != null && b1.C() != null && (this.z.c.C().d() & 0x2) == 0)
        return true; 
    } 
    return false;
  }
  
  public boolean j0() {
    return this.H;
  }
  
  public void k(View paramView1, View paramView2, int paramInt1, int paramInt2) {}
  
  protected f k0() {
    return g.f();
  }
  
  public void l(View paramView, int paramInt) {
    r r1 = this.z;
    if (r1 == null)
      return; 
    float f1 = this.k0;
    float f2 = this.n0;
    r1.G(f1 / f2, this.l0 / f2);
  }
  
  void l0() {
    r r1 = this.z;
    if (r1 == null)
      return; 
    if (r1.f(this, this.D)) {
      requestLayout();
      return;
    } 
    int j = this.D;
    if (j != -1)
      this.z.e(this, j); 
    if (this.z.Q())
      this.z.O(); 
  }
  
  public void m(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    r r1 = this.z;
    if (r1 != null) {
      r.b b1 = r1.c;
      if (b1 != null) {
        if (!b1.D())
          return; 
        b1 = this.z.c;
        if (b1 != null && b1.D()) {
          u u = b1.C();
          if (u != null) {
            paramInt3 = u.k();
            if (paramInt3 != -1 && paramView.getId() != paramInt3)
              return; 
          } 
        } 
        r r2 = this.z;
        if (r2 != null && r2.t()) {
          float f = this.L;
          if ((f == 1.0F || f == 0.0F) && paramView.canScrollVertically(-1))
            return; 
        } 
        if (b1.C() != null && (this.z.c.C().d() & 0x1) != 0) {
          float f4 = this.z.u(paramInt1, paramInt2);
          float f5 = this.M;
          if ((f5 <= 0.0F && f4 < 0.0F) || (f5 >= 1.0F && f4 > 0.0F)) {
            if (Build.VERSION.SDK_INT >= 21) {
              paramView.setNestedScrollingEnabled(false);
              paramView.post(new a(this, paramView));
            } 
            return;
          } 
        } 
        float f3 = this.L;
        long l = getNanoTime();
        float f1 = paramInt1;
        this.k0 = f1;
        float f2 = paramInt2;
        this.l0 = f2;
        double d1 = (l - this.m0);
        Double.isNaN(d1);
        this.n0 = (float)(d1 * 1.0E-9D);
        this.m0 = l;
        this.z.F(f1, f2);
        if (f3 != this.L) {
          paramArrayOfint[0] = paramInt1;
          paramArrayOfint[1] = paramInt2;
        } 
        Z(false);
        if (paramArrayOfint[0] != 0 || paramArrayOfint[1] != 0)
          this.j0 = true; 
      } 
    } 
  }
  
  public void n0() {
    this.K0.g();
    invalidate();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    r r1 = this.z;
    if (r1 != null) {
      int j = this.D;
      if (j != -1) {
        androidx.constraintlayout.widget.b b1 = r1.i(j);
        this.z.J(this);
        if (b1 != null)
          b1.d(this); 
        this.C = this.D;
      } 
    } 
    l0();
    h h1 = this.I0;
    if (h1 != null) {
      h1.a();
    } else {
      r r2 = this.z;
      if (r2 != null) {
        r.b b1 = r2.c;
        if (b1 != null && b1.x() == 4) {
          q0();
          setState(TransitionState.c);
          setState(TransitionState.d);
        } 
      } 
    } 
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    r r1 = this.z;
    if (r1 != null && this.H) {
      r.b b1 = r1.c;
      if (b1 != null && b1.D()) {
        u u = b1.C();
        if (u != null) {
          if (paramMotionEvent.getAction() == 0) {
            RectF rectF = u.j((ViewGroup)this, new RectF());
            if (rectF != null && !rectF.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
              return false; 
          } 
          int j = u.k();
          if (j != -1) {
            View view = this.N0;
            if (view == null || view.getId() != j)
              this.N0 = findViewById(j); 
            view = this.N0;
            if (view != null) {
              this.M0.set(view.getLeft(), this.N0.getTop(), this.N0.getRight(), this.N0.getBottom());
              if (this.M0.contains(paramMotionEvent.getX(), paramMotionEvent.getY()) && !h0(0.0F, 0.0F, this.N0, paramMotionEvent))
                return onTouchEvent(paramMotionEvent); 
            } 
          } 
        } 
      } 
    } 
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.H0 = true;
    try {
      if (this.z == null) {
        super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      } 
      paramInt1 = paramInt3 - paramInt1;
      paramInt2 = paramInt4 - paramInt2;
      if (this.h0 != paramInt1 || this.i0 != paramInt2) {
        n0();
        Z(true);
      } 
      this.h0 = paramInt1;
      this.i0 = paramInt2;
      this.f0 = paramInt1;
      this.g0 = paramInt2;
      return;
    } finally {
      this.H0 = false;
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.z == null) {
      super.onMeasure(paramInt1, paramInt2);
      return;
    } 
    int j = this.F;
    int k = 0;
    if (j != paramInt1 || this.G != paramInt2) {
      j = 1;
    } else {
      j = 0;
    } 
    if (this.L0) {
      this.L0 = false;
      l0();
      m0();
      j = 1;
    } 
    if (this.i)
      j = 1; 
    this.F = paramInt1;
    this.G = paramInt2;
    int m = this.z.x();
    int i1 = this.z.n();
    if ((j != 0 || this.K0.e(m, i1)) && this.C != -1) {
      super.onMeasure(paramInt1, paramInt2);
      this.K0.d(this.d, this.z.i(m), this.z.i(i1));
      this.K0.g();
      this.K0.h(m, i1);
      paramInt1 = k;
    } else {
      paramInt1 = 1;
    } 
    if (this.y0 || paramInt1 != 0) {
      paramInt2 = getPaddingTop();
      j = getPaddingBottom();
      paramInt1 = getPaddingLeft();
      k = getPaddingRight();
      paramInt1 = this.d.U() + paramInt1 + k;
      paramInt2 = this.d.y() + paramInt2 + j;
      j = this.D0;
      if (j == Integer.MIN_VALUE || j == 0) {
        paramInt1 = this.z0;
        paramInt1 = (int)(paramInt1 + this.F0 * (this.B0 - paramInt1));
        requestLayout();
      } 
      j = this.E0;
      if (j == Integer.MIN_VALUE || j == 0) {
        paramInt2 = this.A0;
        paramInt2 = (int)(paramInt2 + this.F0 * (this.C0 - paramInt2));
        requestLayout();
      } 
      setMeasuredDimension(paramInt1, paramInt2);
    } 
    a0();
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return false;
  }
  
  public void onRtlPropertiesChanged(int paramInt) {
    r r1 = this.z;
    if (r1 != null)
      r1.L(r()); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    r r1 = this.z;
    if (r1 != null && this.H && r1.Q()) {
      r.b b1 = this.z.c;
      if (b1 != null && !b1.D())
        return super.onTouchEvent(paramMotionEvent); 
      this.z.H(paramMotionEvent, getCurrentState(), this);
      return true;
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void onViewAdded(View paramView) {
    super.onViewAdded(paramView);
    if (paramView instanceof MotionHelper) {
      MotionHelper motionHelper = (MotionHelper)paramView;
      if (this.r0 == null)
        this.r0 = new ArrayList<i>(); 
      this.r0.add(motionHelper);
      if (motionHelper.x()) {
        if (this.p0 == null)
          this.p0 = new ArrayList<MotionHelper>(); 
        this.p0.add(motionHelper);
      } 
      if (motionHelper.w()) {
        if (this.q0 == null)
          this.q0 = new ArrayList<MotionHelper>(); 
        this.q0.add(motionHelper);
      } 
    } 
  }
  
  public void onViewRemoved(View paramView) {
    super.onViewRemoved(paramView);
    ArrayList<MotionHelper> arrayList = this.p0;
    if (arrayList != null)
      arrayList.remove(paramView); 
    arrayList = this.q0;
    if (arrayList != null)
      arrayList.remove(paramView); 
  }
  
  public void p0(int paramInt, float paramFloat1, float paramFloat2) {
    if (this.z == null)
      return; 
    if (this.M == paramFloat1)
      return; 
    this.a0 = true;
    this.J = getNanoTime();
    float f = this.z.m() / 1000.0F;
    this.K = f;
    this.O = paramFloat1;
    this.Q = true;
    if (paramInt != 0 && paramInt != 1 && paramInt != 2) {
      if (paramInt != 4) {
        if (paramInt == 5)
          if (u0(paramFloat2, this.M, this.z.r())) {
            this.c0.b(paramFloat2, this.M, this.z.r());
            this.A = this.c0;
          } else {
            this.b0.c(this.M, paramFloat1, paramFloat2, this.K, this.z.r(), this.z.s());
            this.B = 0.0F;
            paramInt = this.D;
            this.O = paramFloat1;
            this.D = paramInt;
            this.A = (Interpolator)this.b0;
          }  
      } else {
        this.c0.b(paramFloat2, this.M, this.z.r());
        this.A = this.c0;
      } 
    } else {
      if (paramInt == 1) {
        paramFloat1 = 0.0F;
      } else if (paramInt == 2) {
        paramFloat1 = 1.0F;
      } 
      this.b0.c(this.M, paramFloat1, paramFloat2, f, this.z.r(), this.z.s());
      paramInt = this.D;
      this.O = paramFloat1;
      this.D = paramInt;
      this.A = (Interpolator)this.b0;
    } 
    this.P = false;
    this.J = getNanoTime();
    invalidate();
  }
  
  public void q0() {
    U(1.0F);
  }
  
  public void r0() {
    U(0.0F);
  }
  
  public void requestLayout() {
    if (!this.y0 && this.D == -1) {
      r r1 = this.z;
      if (r1 != null) {
        r.b b1 = r1.c;
        if (b1 != null && b1.A() == 0)
          return; 
      } 
    } 
    super.requestLayout();
  }
  
  public void s0(int paramInt) {
    if (!isAttachedToWindow()) {
      if (this.I0 == null)
        this.I0 = new h(this); 
      this.I0.d(paramInt);
      return;
    } 
    t0(paramInt, -1, -1);
  }
  
  public void setDebugMode(int paramInt) {
    this.V = paramInt;
    invalidate();
  }
  
  public void setInteractionEnabled(boolean paramBoolean) {
    this.H = paramBoolean;
  }
  
  public void setInterpolatedProgress(float paramFloat) {
    if (this.z != null) {
      setState(TransitionState.d);
      Interpolator interpolator = this.z.p();
      if (interpolator != null) {
        setProgress(interpolator.getInterpolation(paramFloat));
        return;
      } 
    } 
    setProgress(paramFloat);
  }
  
  public void setOnHide(float paramFloat) {
    ArrayList<MotionHelper> arrayList = this.q0;
    if (arrayList != null) {
      int j = arrayList.size();
      for (byte b1 = 0; b1 < j; b1++)
        ((MotionHelper)this.q0.get(b1)).setProgress(paramFloat); 
    } 
  }
  
  public void setOnShow(float paramFloat) {
    ArrayList<MotionHelper> arrayList = this.p0;
    if (arrayList != null) {
      int j = arrayList.size();
      for (byte b1 = 0; b1 < j; b1++)
        ((MotionHelper)this.p0.get(b1)).setProgress(paramFloat); 
    } 
  }
  
  public void setProgress(float paramFloat) {
    if (paramFloat < 0.0F || paramFloat > 1.0F)
      Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"); 
    if (!isAttachedToWindow()) {
      if (this.I0 == null)
        this.I0 = new h(this); 
      this.I0.e(paramFloat);
      return;
    } 
    if (paramFloat <= 0.0F) {
      this.D = this.C;
      if (this.M == 0.0F)
        setState(TransitionState.e); 
    } else if (paramFloat >= 1.0F) {
      this.D = this.E;
      if (this.M == 1.0F)
        setState(TransitionState.e); 
    } else {
      this.D = -1;
      setState(TransitionState.d);
    } 
    if (this.z == null)
      return; 
    this.P = true;
    this.O = paramFloat;
    this.L = paramFloat;
    this.N = -1L;
    this.J = -1L;
    this.A = null;
    this.Q = true;
    invalidate();
  }
  
  public void setProgress(float paramFloat1, float paramFloat2) {
    if (!isAttachedToWindow()) {
      if (this.I0 == null)
        this.I0 = new h(this); 
      this.I0.e(paramFloat1);
      this.I0.h(paramFloat2);
      return;
    } 
    setProgress(paramFloat1);
    setState(TransitionState.d);
    this.B = paramFloat2;
    U(1.0F);
  }
  
  public void setScene(r paramr) {
    this.z = paramr;
    paramr.L(r());
    n0();
  }
  
  public void setState(int paramInt1, int paramInt2, int paramInt3) {
    setState(TransitionState.c);
    this.D = paramInt1;
    this.C = -1;
    this.E = -1;
    androidx.constraintlayout.widget.a a = this.l;
    if (a != null) {
      a.d(paramInt1, paramInt2, paramInt3);
    } else {
      r r1 = this.z;
      if (r1 != null)
        r1.i(paramInt1).d(this); 
    } 
  }
  
  void setState(TransitionState paramTransitionState) {
    TransitionState transitionState1 = TransitionState.e;
    if (paramTransitionState == transitionState1 && this.D == -1)
      return; 
    TransitionState transitionState2 = this.J0;
    this.J0 = paramTransitionState;
    TransitionState transitionState3 = TransitionState.d;
    if (transitionState2 == transitionState3 && paramTransitionState == transitionState3)
      b0(); 
    int j = b.a[transitionState2.ordinal()];
    if (j != 1 && j != 2) {
      if (j == 3 && paramTransitionState == transitionState1)
        c0(); 
    } else {
      if (paramTransitionState == transitionState3)
        b0(); 
      if (paramTransitionState == transitionState1)
        c0(); 
    } 
  }
  
  public void setTransition(int paramInt) {
    if (this.z != null) {
      r.b b1 = f0(paramInt);
      this.C = b1.B();
      this.E = b1.z();
      if (!isAttachedToWindow()) {
        if (this.I0 == null)
          this.I0 = new h(this); 
        this.I0.f(this.C);
        this.I0.d(this.E);
        return;
      } 
      float f1 = Float.NaN;
      int j = this.D;
      paramInt = this.C;
      float f2 = 0.0F;
      if (j == paramInt) {
        f1 = 0.0F;
      } else if (j == this.E) {
        f1 = 1.0F;
      } 
      this.z.N(b1);
      this.K0.d(this.d, this.z.i(this.C), this.z.i(this.E));
      n0();
      if (!Float.isNaN(f1))
        f2 = f1; 
      this.M = f2;
      if (Float.isNaN(f1)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a.a());
        stringBuilder.append(" transitionToStart ");
        Log.v("MotionLayout", stringBuilder.toString());
        r0();
      } else {
        setProgress(f1);
      } 
    } 
  }
  
  public void setTransition(int paramInt1, int paramInt2) {
    if (!isAttachedToWindow()) {
      if (this.I0 == null)
        this.I0 = new h(this); 
      this.I0.f(paramInt1);
      this.I0.d(paramInt2);
      return;
    } 
    r r1 = this.z;
    if (r1 != null) {
      this.C = paramInt1;
      this.E = paramInt2;
      r1.M(paramInt1, paramInt2);
      this.K0.d(this.d, this.z.i(paramInt1), this.z.i(paramInt2));
      n0();
      this.M = 0.0F;
      r0();
    } 
  }
  
  protected void setTransition(r.b paramb) {
    long l;
    this.z.N(paramb);
    setState(TransitionState.c);
    if (this.D == this.z.n()) {
      this.M = 1.0F;
      this.L = 1.0F;
      this.O = 1.0F;
    } else {
      this.M = 0.0F;
      this.L = 0.0F;
      this.O = 0.0F;
    } 
    if (paramb.E(1)) {
      l = -1L;
    } else {
      l = getNanoTime();
    } 
    this.N = l;
    int j = this.z.x();
    int k = this.z.n();
    if (j == this.C && k == this.E)
      return; 
    this.C = j;
    this.E = k;
    this.z.M(j, k);
    this.K0.d(this.d, this.z.i(this.C), this.z.i(this.E));
    this.K0.h(this.C, this.E);
    this.K0.g();
    n0();
  }
  
  public void setTransitionDuration(int paramInt) {
    r r1 = this.z;
    if (r1 == null) {
      Log.e("MotionLayout", "MotionScene not defined");
      return;
    } 
    r1.K(paramInt);
  }
  
  public void setTransitionListener(i parami) {
    this.S = parami;
  }
  
  public void setTransitionState(Bundle paramBundle) {
    if (this.I0 == null)
      this.I0 = new h(this); 
    this.I0.g(paramBundle);
    if (isAttachedToWindow())
      this.I0.a(); 
  }
  
  protected void t(int paramInt) {
    this.l = null;
  }
  
  public void t0(int paramInt1, int paramInt2, int paramInt3) {
    r r1 = this.z;
    int j = paramInt1;
    if (r1 != null) {
      androidx.constraintlayout.widget.f f1 = r1.b;
      j = paramInt1;
      if (f1 != null) {
        paramInt2 = f1.a(this.D, paramInt1, paramInt2, paramInt3);
        j = paramInt1;
        if (paramInt2 != -1)
          j = paramInt2; 
      } 
    } 
    paramInt1 = this.D;
    if (paramInt1 == j)
      return; 
    if (this.C == j) {
      U(0.0F);
      return;
    } 
    if (this.E == j) {
      U(1.0F);
      return;
    } 
    this.E = j;
    if (paramInt1 != -1) {
      setTransition(paramInt1, j);
      U(1.0F);
      this.M = 0.0F;
      q0();
      return;
    } 
    paramInt3 = 0;
    this.a0 = false;
    this.O = 1.0F;
    this.L = 0.0F;
    this.M = 0.0F;
    this.N = getNanoTime();
    this.J = getNanoTime();
    this.P = false;
    this.A = null;
    this.K = this.z.m() / 1000.0F;
    this.C = -1;
    this.z.M(-1, this.E);
    this.z.x();
    int k = getChildCount();
    this.I.clear();
    for (paramInt1 = 0; paramInt1 < k; paramInt1++) {
      View view = getChildAt(paramInt1);
      o o = new o(view);
      this.I.put(view, o);
    } 
    this.Q = true;
    this.K0.d(this.d, null, this.z.i(j));
    n0();
    this.K0.a();
    Y();
    j = getWidth();
    paramInt2 = getHeight();
    for (paramInt1 = 0; paramInt1 < k; paramInt1++) {
      o o = this.I.get(getChildAt(paramInt1));
      this.z.q(o);
      o.v(j, paramInt2, this.K, getNanoTime());
    } 
    float f = this.z.w();
    if (f != 0.0F) {
      float f1 = Float.MAX_VALUE;
      float f2 = -3.4028235E38F;
      paramInt1 = 0;
      while (true) {
        paramInt2 = paramInt3;
        if (paramInt1 < k) {
          o o = this.I.get(getChildAt(paramInt1));
          float f3 = o.i();
          f3 = o.j() + f3;
          f1 = Math.min(f1, f3);
          f2 = Math.max(f2, f3);
          paramInt1++;
          continue;
        } 
        break;
      } 
      while (paramInt2 < k) {
        o o = this.I.get(getChildAt(paramInt2));
        float f3 = o.i();
        float f4 = o.j();
        o.m = 1.0F / (1.0F - f);
        o.l = f - (f3 + f4 - f1) * f / (f2 - f1);
        paramInt2++;
      } 
    } 
    this.L = 0.0F;
    this.M = 0.0F;
    this.Q = true;
    invalidate();
  }
  
  public String toString() {
    Context context = getContext();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a.b(context, this.C));
    stringBuilder.append("->");
    stringBuilder.append(a.b(context, this.E));
    stringBuilder.append(" (pos:");
    stringBuilder.append(this.M);
    stringBuilder.append(" Dpos/Dt:");
    stringBuilder.append(this.B);
    return stringBuilder.toString();
  }
  
  enum TransitionState {
    b, c, d, e;
    
    static {
      TransitionState transitionState1 = new TransitionState("UNDEFINED", 0);
      b = transitionState1;
      TransitionState transitionState2 = new TransitionState("SETUP", 1);
      c = transitionState2;
      TransitionState transitionState3 = new TransitionState("MOVING", 2);
      d = transitionState3;
      TransitionState transitionState4 = new TransitionState("FINISHED", 3);
      e = transitionState4;
      f = new TransitionState[] { transitionState1, transitionState2, transitionState3, transitionState4 };
    }
  }
  
  class a implements Runnable {
    a(MotionLayout this$0, View param1View) {}
    
    public void run() {
      this.b.setNestedScrollingEnabled(true);
    }
  }
  
  class c extends p {
    float a = 0.0F;
    
    float b = 0.0F;
    
    float c;
    
    c(MotionLayout this$0) {}
    
    public float a() {
      return this.d.B;
    }
    
    public void b(float param1Float1, float param1Float2, float param1Float3) {
      this.a = param1Float1;
      this.b = param1Float2;
      this.c = param1Float3;
    }
    
    public float getInterpolation(float param1Float) {
      float f1 = this.a;
      if (f1 > 0.0F) {
        float f5 = this.c;
        float f6 = param1Float;
        if (f1 / f5 < param1Float)
          f6 = f1 / f5; 
        this.d.B = f1 - f5 * f6;
        f6 = f1 * f6 - f5 * f6 * f6 / 2.0F;
        param1Float = this.b;
        return f6 + param1Float;
      } 
      float f4 = -f1;
      float f2 = this.c;
      float f3 = param1Float;
      if (f4 / f2 < param1Float)
        f3 = -f1 / f2; 
      this.d.B = f2 * f3 + f1;
      f3 = f1 * f3 + f2 * f3 * f3 / 2.0F;
      param1Float = this.b;
      return f3 + param1Float;
    }
  }
  
  private class d {
    float[] a;
    
    int[] b;
    
    float[] c;
    
    Path d;
    
    Paint e;
    
    Paint f;
    
    Paint g;
    
    Paint h;
    
    Paint i;
    
    private float[] j;
    
    final int k = -21965;
    
    final int l = -2067046;
    
    final int m = -13391360;
    
    final int n = 1996488704;
    
    final int o = 10;
    
    DashPathEffect p;
    
    int q;
    
    Rect r = new Rect();
    
    boolean s = false;
    
    int t = 1;
    
    public d(MotionLayout this$0) {
      Paint paint2 = new Paint();
      this.e = paint2;
      paint2.setAntiAlias(true);
      this.e.setColor(-21965);
      this.e.setStrokeWidth(2.0F);
      this.e.setStyle(Paint.Style.STROKE);
      paint2 = new Paint();
      this.f = paint2;
      paint2.setAntiAlias(true);
      this.f.setColor(-2067046);
      this.f.setStrokeWidth(2.0F);
      this.f.setStyle(Paint.Style.STROKE);
      paint2 = new Paint();
      this.g = paint2;
      paint2.setAntiAlias(true);
      this.g.setColor(-13391360);
      this.g.setStrokeWidth(2.0F);
      this.g.setStyle(Paint.Style.STROKE);
      paint2 = new Paint();
      this.h = paint2;
      paint2.setAntiAlias(true);
      this.h.setColor(-13391360);
      this.h.setTextSize((this$0.getContext().getResources().getDisplayMetrics()).density * 12.0F);
      this.j = new float[8];
      Paint paint1 = new Paint();
      this.i = paint1;
      paint1.setAntiAlias(true);
      DashPathEffect dashPathEffect = new DashPathEffect(new float[] { 4.0F, 8.0F }, 0.0F);
      this.p = dashPathEffect;
      this.g.setPathEffect((PathEffect)dashPathEffect);
      this.c = new float[100];
      this.b = new int[50];
      if (this.s) {
        this.e.setStrokeWidth(8.0F);
        this.i.setStrokeWidth(8.0F);
        this.f.setStrokeWidth(8.0F);
        this.t = 4;
      } 
    }
    
    private void c(Canvas param1Canvas) {
      param1Canvas.drawLines(this.a, this.e);
    }
    
    private void d(Canvas param1Canvas) {
      byte b = 0;
      boolean bool1 = false;
      boolean bool2 = false;
      while (b < this.q) {
        int[] arrayOfInt = this.b;
        if (arrayOfInt[b] == 1)
          bool1 = true; 
        if (arrayOfInt[b] == 2)
          bool2 = true; 
        b++;
      } 
      if (bool1)
        g(param1Canvas); 
      if (bool2)
        e(param1Canvas); 
    }
    
    private void e(Canvas param1Canvas) {
      float[] arrayOfFloat = this.a;
      float f1 = arrayOfFloat[0];
      float f2 = arrayOfFloat[1];
      float f3 = arrayOfFloat[arrayOfFloat.length - 2];
      float f4 = arrayOfFloat[arrayOfFloat.length - 1];
      param1Canvas.drawLine(Math.min(f1, f3), Math.max(f2, f4), Math.max(f1, f3), Math.max(f2, f4), this.g);
      param1Canvas.drawLine(Math.min(f1, f3), Math.min(f2, f4), Math.min(f1, f3), Math.max(f2, f4), this.g);
    }
    
    private void f(Canvas param1Canvas, float param1Float1, float param1Float2) {
      float[] arrayOfFloat = this.a;
      float f1 = arrayOfFloat[0];
      float f2 = arrayOfFloat[1];
      float f3 = arrayOfFloat[arrayOfFloat.length - 2];
      float f4 = arrayOfFloat[arrayOfFloat.length - 1];
      float f5 = Math.min(f1, f3);
      float f6 = Math.max(f2, f4);
      float f7 = param1Float1 - Math.min(f1, f3);
      float f8 = Math.max(f2, f4) - param1Float2;
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("");
      double d1 = (f7 * 100.0F / Math.abs(f3 - f1));
      Double.isNaN(d1);
      stringBuilder2.append((int)(d1 + 0.5D) / 100.0F);
      String str2 = stringBuilder2.toString();
      l(str2, this.h);
      param1Canvas.drawText(str2, f7 / 2.0F - (this.r.width() / 2) + f5, param1Float2 - 20.0F, this.h);
      param1Canvas.drawLine(param1Float1, param1Float2, Math.min(f1, f3), param1Float2, this.g);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("");
      d1 = (f8 * 100.0F / Math.abs(f4 - f2));
      Double.isNaN(d1);
      stringBuilder1.append((int)(d1 + 0.5D) / 100.0F);
      String str1 = stringBuilder1.toString();
      l(str1, this.h);
      param1Canvas.drawText(str1, param1Float1 + 5.0F, f6 - f8 / 2.0F - (this.r.height() / 2), this.h);
      param1Canvas.drawLine(param1Float1, param1Float2, param1Float1, Math.max(f2, f4), this.g);
    }
    
    private void g(Canvas param1Canvas) {
      float[] arrayOfFloat = this.a;
      param1Canvas.drawLine(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[arrayOfFloat.length - 2], arrayOfFloat[arrayOfFloat.length - 1], this.g);
    }
    
    private void h(Canvas param1Canvas, float param1Float1, float param1Float2) {
      float[] arrayOfFloat = this.a;
      float f1 = arrayOfFloat[0];
      float f2 = arrayOfFloat[1];
      float f3 = arrayOfFloat[arrayOfFloat.length - 2];
      float f4 = arrayOfFloat[arrayOfFloat.length - 1];
      float f5 = (float)Math.hypot((f1 - f3), (f2 - f4));
      f3 -= f1;
      float f6 = f4 - f2;
      f4 = ((param1Float1 - f1) * f3 + (param1Float2 - f2) * f6) / f5 * f5;
      f1 += f3 * f4;
      f3 = f2 + f4 * f6;
      Path path = new Path();
      path.moveTo(param1Float1, param1Float2);
      path.lineTo(f1, f3);
      f2 = (float)Math.hypot((f1 - param1Float1), (f3 - param1Float2));
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("");
      stringBuilder.append((int)(f2 * 100.0F / f5) / 100.0F);
      String str = stringBuilder.toString();
      l(str, this.h);
      param1Canvas.drawTextOnPath(str, path, f2 / 2.0F - (this.r.width() / 2), -20.0F, this.h);
      param1Canvas.drawLine(param1Float1, param1Float2, f1, f3, this.g);
    }
    
    private void i(Canvas param1Canvas, float param1Float1, float param1Float2, int param1Int1, int param1Int2) {
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("");
      double d1 = ((param1Float1 - (param1Int1 / 2)) * 100.0F / (this.u.getWidth() - param1Int1));
      Double.isNaN(d1);
      stringBuilder2.append((int)(d1 + 0.5D) / 100.0F);
      String str2 = stringBuilder2.toString();
      l(str2, this.h);
      param1Canvas.drawText(str2, param1Float1 / 2.0F - (this.r.width() / 2) + 0.0F, param1Float2 - 20.0F, this.h);
      param1Canvas.drawLine(param1Float1, param1Float2, Math.min(0.0F, 1.0F), param1Float2, this.g);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("");
      d1 = ((param1Float2 - (param1Int2 / 2)) * 100.0F / (this.u.getHeight() - param1Int2));
      Double.isNaN(d1);
      stringBuilder1.append((int)(d1 + 0.5D) / 100.0F);
      String str1 = stringBuilder1.toString();
      l(str1, this.h);
      param1Canvas.drawText(str1, param1Float1 + 5.0F, 0.0F - param1Float2 / 2.0F - (this.r.height() / 2), this.h);
      param1Canvas.drawLine(param1Float1, param1Float2, param1Float1, Math.max(0.0F, 1.0F), this.g);
    }
    
    private void j(Canvas param1Canvas, o param1o) {
      this.d.reset();
      for (byte b = 0; b <= 50; b++) {
        param1o.e(b / 50, this.j, 0);
        Path path2 = this.d;
        float[] arrayOfFloat3 = this.j;
        path2.moveTo(arrayOfFloat3[0], arrayOfFloat3[1]);
        Path path3 = this.d;
        float[] arrayOfFloat1 = this.j;
        path3.lineTo(arrayOfFloat1[2], arrayOfFloat1[3]);
        path3 = this.d;
        arrayOfFloat1 = this.j;
        path3.lineTo(arrayOfFloat1[4], arrayOfFloat1[5]);
        Path path1 = this.d;
        float[] arrayOfFloat2 = this.j;
        path1.lineTo(arrayOfFloat2[6], arrayOfFloat2[7]);
        this.d.close();
      } 
      this.e.setColor(1140850688);
      param1Canvas.translate(2.0F, 2.0F);
      param1Canvas.drawPath(this.d, this.e);
      param1Canvas.translate(-2.0F, -2.0F);
      this.e.setColor(-65536);
      param1Canvas.drawPath(this.d, this.e);
    }
    
    private void k(Canvas param1Canvas, int param1Int1, int param1Int2, o param1o) {
      boolean bool1;
      boolean bool2;
      View view = param1o.a;
      if (view != null) {
        bool1 = view.getWidth();
        bool2 = param1o.a.getHeight();
      } else {
        bool1 = false;
        bool2 = false;
      } 
      for (byte b = 1; b < param1Int2 - 1; b++) {
        if (param1Int1 != 4 || this.b[b - 1] != 0) {
          float[] arrayOfFloat1 = this.c;
          int i = b * 2;
          float f1 = arrayOfFloat1[i];
          float f2 = arrayOfFloat1[i + 1];
          this.d.reset();
          this.d.moveTo(f1, f2 + 10.0F);
          this.d.lineTo(f1 + 10.0F, f2);
          this.d.lineTo(f1, f2 - 10.0F);
          this.d.lineTo(f1 - 10.0F, f2);
          this.d.close();
          i = b - 1;
          param1o.k(i);
          if (param1Int1 == 4) {
            int[] arrayOfInt = this.b;
            if (arrayOfInt[i] == 1) {
              h(param1Canvas, f1 - 0.0F, f2 - 0.0F);
            } else if (arrayOfInt[i] == 2) {
              f(param1Canvas, f1 - 0.0F, f2 - 0.0F);
            } else if (arrayOfInt[i] == 3) {
              i(param1Canvas, f1 - 0.0F, f2 - 0.0F, bool1, bool2);
            } 
            param1Canvas.drawPath(this.d, this.i);
          } 
          if (param1Int1 == 2)
            h(param1Canvas, f1 - 0.0F, f2 - 0.0F); 
          if (param1Int1 == 3)
            f(param1Canvas, f1 - 0.0F, f2 - 0.0F); 
          if (param1Int1 == 6)
            i(param1Canvas, f1 - 0.0F, f2 - 0.0F, bool1, bool2); 
          param1Canvas.drawPath(this.d, this.i);
        } 
      } 
      float[] arrayOfFloat = this.a;
      if (arrayOfFloat.length > 1) {
        param1Canvas.drawCircle(arrayOfFloat[0], arrayOfFloat[1], 8.0F, this.f);
        arrayOfFloat = this.a;
        param1Canvas.drawCircle(arrayOfFloat[arrayOfFloat.length - 2], arrayOfFloat[arrayOfFloat.length - 1], 8.0F, this.f);
      } 
    }
    
    public void a(Canvas param1Canvas, HashMap<View, o> param1HashMap, int param1Int1, int param1Int2) {
      if (param1HashMap != null && param1HashMap.size() != 0) {
        param1Canvas.save();
        if (!this.u.isInEditMode() && (param1Int2 & 0x1) == 2) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.u.getContext().getResources().getResourceName(MotionLayout.z(this.u)));
          stringBuilder.append(":");
          stringBuilder.append(this.u.getProgress());
          String str = stringBuilder.toString();
          param1Canvas.drawText(str, 10.0F, (this.u.getHeight() - 30), this.h);
          param1Canvas.drawText(str, 11.0F, (this.u.getHeight() - 29), this.e);
        } 
        for (o o : param1HashMap.values()) {
          int i = o.h();
          int j = i;
          if (param1Int2 > 0) {
            j = i;
            if (i == 0)
              j = 1; 
          } 
          if (j == 0)
            continue; 
          this.q = o.c(this.c, this.b);
          if (j >= 1) {
            i = param1Int1 / 16;
            float[] arrayOfFloat = this.a;
            if (arrayOfFloat == null || arrayOfFloat.length != i * 2) {
              this.a = new float[i * 2];
              this.d = new Path();
            } 
            int k = this.t;
            param1Canvas.translate(k, k);
            this.e.setColor(1996488704);
            this.i.setColor(1996488704);
            this.f.setColor(1996488704);
            this.g.setColor(1996488704);
            o.d(this.a, i);
            b(param1Canvas, j, this.q, o);
            this.e.setColor(-21965);
            this.f.setColor(-2067046);
            this.i.setColor(-2067046);
            this.g.setColor(-13391360);
            i = this.t;
            param1Canvas.translate(-i, -i);
            b(param1Canvas, j, this.q, o);
            if (j == 5)
              j(param1Canvas, o); 
          } 
        } 
        param1Canvas.restore();
      } 
    }
    
    public void b(Canvas param1Canvas, int param1Int1, int param1Int2, o param1o) {
      if (param1Int1 == 4)
        d(param1Canvas); 
      if (param1Int1 == 2)
        g(param1Canvas); 
      if (param1Int1 == 3)
        e(param1Canvas); 
      c(param1Canvas);
      k(param1Canvas, param1Int1, param1Int2, param1o);
    }
    
    void l(String param1String, Paint param1Paint) {
      param1Paint.getTextBounds(param1String, 0, param1String.length(), this.r);
    }
  }
  
  class e {
    androidx.constraintlayout.solver.widgets.d a = new androidx.constraintlayout.solver.widgets.d();
    
    androidx.constraintlayout.solver.widgets.d b = new androidx.constraintlayout.solver.widgets.d();
    
    androidx.constraintlayout.widget.b c = null;
    
    androidx.constraintlayout.widget.b d = null;
    
    int e;
    
    int f;
    
    e(MotionLayout this$0) {}
    
    private void i(androidx.constraintlayout.solver.widgets.d param1d, androidx.constraintlayout.widget.b param1b) {
      SparseArray sparseArray = new SparseArray();
      Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
      sparseArray.clear();
      sparseArray.put(0, param1d);
      sparseArray.put(this.g.getId(), param1d);
      for (ConstraintWidget constraintWidget : param1d.e1())
        sparseArray.put(((View)constraintWidget.t()).getId(), constraintWidget); 
      for (ConstraintWidget constraintWidget : param1d.e1()) {
        View view = (View)constraintWidget.t();
        param1b.g(view.getId(), (ConstraintLayout.LayoutParams)layoutParams);
        constraintWidget.Y0(param1b.v(view.getId()));
        constraintWidget.z0(param1b.q(view.getId()));
        if (view instanceof ConstraintHelper) {
          param1b.e((ConstraintHelper)view, constraintWidget, (ConstraintLayout.LayoutParams)layoutParams, sparseArray);
          if (view instanceof Barrier)
            ((Barrier)view).v(); 
        } 
        if (Build.VERSION.SDK_INT >= 17) {
          layoutParams.resolveLayoutDirection(this.g.getLayoutDirection());
        } else {
          layoutParams.resolveLayoutDirection(0);
        } 
        MotionLayout.S(this.g, false, view, constraintWidget, (ConstraintLayout.LayoutParams)layoutParams, sparseArray);
        if (param1b.u(view.getId()) == 1) {
          constraintWidget.X0(view.getVisibility());
          continue;
        } 
        constraintWidget.X0(param1b.t(view.getId()));
      } 
      for (ConstraintWidget constraintWidget : param1d.e1()) {
        if (constraintWidget instanceof j) {
          ConstraintHelper constraintHelper = (ConstraintHelper)constraintWidget.t();
          androidx.constraintlayout.solver.widgets.g g = (androidx.constraintlayout.solver.widgets.g)constraintWidget;
          constraintHelper.t(param1d, g, sparseArray);
          ((j)g).h1();
        } 
      } 
    }
    
    public void a() {
      byte b3;
      int i = this.g.getChildCount();
      this.g.I.clear();
      byte b1 = 0;
      byte b2 = 0;
      while (true) {
        b3 = b1;
        if (b2 < i) {
          View view = this.g.getChildAt(b2);
          o o = new o(view);
          this.g.I.put(view, o);
          b2++;
          continue;
        } 
        break;
      } 
      while (b3 < i) {
        View view = this.g.getChildAt(b3);
        o o = this.g.I.get(view);
        if (o != null) {
          if (this.c != null) {
            ConstraintWidget constraintWidget = c(this.a, view);
            if (constraintWidget != null) {
              o.t(constraintWidget, this.c);
            } else if (this.g.V != 0) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append(a.a());
              stringBuilder.append("no widget for  ");
              stringBuilder.append(a.c(view));
              stringBuilder.append(" (");
              stringBuilder.append(view.getClass().getName());
              stringBuilder.append(")");
              Log.e("MotionLayout", stringBuilder.toString());
            } 
          } 
          if (this.d != null) {
            ConstraintWidget constraintWidget = c(this.b, view);
            if (constraintWidget != null) {
              o.q(constraintWidget, this.d);
            } else if (this.g.V != 0) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append(a.a());
              stringBuilder.append("no widget for  ");
              stringBuilder.append(a.c(view));
              stringBuilder.append(" (");
              stringBuilder.append(view.getClass().getName());
              stringBuilder.append(")");
              Log.e("MotionLayout", stringBuilder.toString());
            } 
          } 
        } 
        b3++;
      } 
    }
    
    void b(androidx.constraintlayout.solver.widgets.d param1d1, androidx.constraintlayout.solver.widgets.d param1d2) {
      ArrayList arrayList = param1d1.e1();
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      hashMap.put(param1d1, param1d2);
      param1d2.e1().clear();
      param1d2.m((ConstraintWidget)param1d1, hashMap);
      for (ConstraintWidget constraintWidget2 : arrayList) {
        ConstraintWidget constraintWidget1;
        if (constraintWidget2 instanceof androidx.constraintlayout.solver.widgets.a) {
          androidx.constraintlayout.solver.widgets.a a = new androidx.constraintlayout.solver.widgets.a();
        } else if (constraintWidget2 instanceof androidx.constraintlayout.solver.widgets.f) {
          androidx.constraintlayout.solver.widgets.f f = new androidx.constraintlayout.solver.widgets.f();
        } else if (constraintWidget2 instanceof androidx.constraintlayout.solver.widgets.e) {
          androidx.constraintlayout.solver.widgets.e e1 = new androidx.constraintlayout.solver.widgets.e();
        } else if (constraintWidget2 instanceof androidx.constraintlayout.solver.widgets.g) {
          androidx.constraintlayout.solver.widgets.h h = new androidx.constraintlayout.solver.widgets.h();
        } else {
          constraintWidget1 = new ConstraintWidget();
        } 
        param1d2.a(constraintWidget1);
        hashMap.put(constraintWidget2, constraintWidget1);
      } 
      for (ConstraintWidget constraintWidget : arrayList)
        ((ConstraintWidget)hashMap.get(constraintWidget)).m(constraintWidget, hashMap); 
    }
    
    ConstraintWidget c(androidx.constraintlayout.solver.widgets.d param1d, View param1View) {
      if (param1d.t() == param1View)
        return (ConstraintWidget)param1d; 
      ArrayList<ConstraintWidget> arrayList = param1d.e1();
      int i = arrayList.size();
      for (byte b1 = 0; b1 < i; b1++) {
        ConstraintWidget constraintWidget = arrayList.get(b1);
        if (constraintWidget.t() == param1View)
          return constraintWidget; 
      } 
      return null;
    }
    
    void d(androidx.constraintlayout.solver.widgets.d param1d, androidx.constraintlayout.widget.b param1b1, androidx.constraintlayout.widget.b param1b2) {
      this.c = param1b1;
      this.d = param1b2;
      this.a = new androidx.constraintlayout.solver.widgets.d();
      this.b = new androidx.constraintlayout.solver.widgets.d();
      this.a.I1(MotionLayout.L(this.g).v1());
      this.b.I1(MotionLayout.N(this.g).v1());
      this.a.h1();
      this.b.h1();
      b(MotionLayout.O(this.g), this.a);
      b(MotionLayout.P(this.g), this.b);
      if (this.g.M > 0.5D) {
        if (param1b1 != null)
          i(this.a, param1b1); 
        i(this.b, param1b2);
      } else {
        i(this.b, param1b2);
        if (param1b1 != null)
          i(this.a, param1b1); 
      } 
      this.a.K1(MotionLayout.Q(this.g));
      this.a.M1();
      this.b.K1(MotionLayout.R(this.g));
      this.b.M1();
      ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
      if (layoutParams != null) {
        if (layoutParams.width == -2) {
          androidx.constraintlayout.solver.widgets.d d1 = this.a;
          ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
          d1.D0(dimensionBehaviour);
          this.b.D0(dimensionBehaviour);
        } 
        if (layoutParams.height == -2) {
          androidx.constraintlayout.solver.widgets.d d1 = this.a;
          ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
          d1.U0(dimensionBehaviour);
          this.b.U0(dimensionBehaviour);
        } 
      } 
    }
    
    public boolean e(int param1Int1, int param1Int2) {
      return (param1Int1 != this.e || param1Int2 != this.f);
    }
    
    public void f(int param1Int1, int param1Int2) {
      // Byte code:
      //   0: iload_1
      //   1: invokestatic getMode : (I)I
      //   4: istore_3
      //   5: iload_2
      //   6: invokestatic getMode : (I)I
      //   9: istore #4
      //   11: aload_0
      //   12: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   15: astore #5
      //   17: aload #5
      //   19: iload_3
      //   20: putfield D0 : I
      //   23: aload #5
      //   25: iload #4
      //   27: putfield E0 : I
      //   30: aload #5
      //   32: invokevirtual getOptimizationLevel : ()I
      //   35: istore #6
      //   37: aload_0
      //   38: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   41: astore #5
      //   43: aload #5
      //   45: getfield D : I
      //   48: aload #5
      //   50: invokevirtual getStartState : ()I
      //   53: if_icmpne -> 96
      //   56: aload_0
      //   57: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   60: aload_0
      //   61: getfield b : Landroidx/constraintlayout/solver/widgets/d;
      //   64: iload #6
      //   66: iload_1
      //   67: iload_2
      //   68: invokestatic D : (Landroidx/constraintlayout/motion/widget/MotionLayout;Landroidx/constraintlayout/solver/widgets/d;III)V
      //   71: aload_0
      //   72: getfield c : Landroidx/constraintlayout/widget/b;
      //   75: ifnull -> 133
      //   78: aload_0
      //   79: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   82: aload_0
      //   83: getfield a : Landroidx/constraintlayout/solver/widgets/d;
      //   86: iload #6
      //   88: iload_1
      //   89: iload_2
      //   90: invokestatic E : (Landroidx/constraintlayout/motion/widget/MotionLayout;Landroidx/constraintlayout/solver/widgets/d;III)V
      //   93: goto -> 133
      //   96: aload_0
      //   97: getfield c : Landroidx/constraintlayout/widget/b;
      //   100: ifnull -> 118
      //   103: aload_0
      //   104: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   107: aload_0
      //   108: getfield a : Landroidx/constraintlayout/solver/widgets/d;
      //   111: iload #6
      //   113: iload_1
      //   114: iload_2
      //   115: invokestatic F : (Landroidx/constraintlayout/motion/widget/MotionLayout;Landroidx/constraintlayout/solver/widgets/d;III)V
      //   118: aload_0
      //   119: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   122: aload_0
      //   123: getfield b : Landroidx/constraintlayout/solver/widgets/d;
      //   126: iload #6
      //   128: iload_1
      //   129: iload_2
      //   130: invokestatic G : (Landroidx/constraintlayout/motion/widget/MotionLayout;Landroidx/constraintlayout/solver/widgets/d;III)V
      //   133: aload_0
      //   134: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   137: invokevirtual getParent : ()Landroid/view/ViewParent;
      //   140: instanceof androidx/constraintlayout/motion/widget/MotionLayout
      //   143: istore #7
      //   145: iconst_0
      //   146: istore #8
      //   148: iload #7
      //   150: ifeq -> 174
      //   153: iload_3
      //   154: ldc_w 1073741824
      //   157: if_icmpne -> 174
      //   160: iload #4
      //   162: ldc_w 1073741824
      //   165: if_icmpne -> 174
      //   168: iconst_0
      //   169: istore #9
      //   171: goto -> 177
      //   174: iconst_1
      //   175: istore #9
      //   177: iload #9
      //   179: ifeq -> 398
      //   182: aload_0
      //   183: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   186: astore #5
      //   188: aload #5
      //   190: iload_3
      //   191: putfield D0 : I
      //   194: aload #5
      //   196: iload #4
      //   198: putfield E0 : I
      //   201: aload #5
      //   203: getfield D : I
      //   206: aload #5
      //   208: invokevirtual getStartState : ()I
      //   211: if_icmpne -> 254
      //   214: aload_0
      //   215: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   218: aload_0
      //   219: getfield b : Landroidx/constraintlayout/solver/widgets/d;
      //   222: iload #6
      //   224: iload_1
      //   225: iload_2
      //   226: invokestatic H : (Landroidx/constraintlayout/motion/widget/MotionLayout;Landroidx/constraintlayout/solver/widgets/d;III)V
      //   229: aload_0
      //   230: getfield c : Landroidx/constraintlayout/widget/b;
      //   233: ifnull -> 291
      //   236: aload_0
      //   237: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   240: aload_0
      //   241: getfield a : Landroidx/constraintlayout/solver/widgets/d;
      //   244: iload #6
      //   246: iload_1
      //   247: iload_2
      //   248: invokestatic I : (Landroidx/constraintlayout/motion/widget/MotionLayout;Landroidx/constraintlayout/solver/widgets/d;III)V
      //   251: goto -> 291
      //   254: aload_0
      //   255: getfield c : Landroidx/constraintlayout/widget/b;
      //   258: ifnull -> 276
      //   261: aload_0
      //   262: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   265: aload_0
      //   266: getfield a : Landroidx/constraintlayout/solver/widgets/d;
      //   269: iload #6
      //   271: iload_1
      //   272: iload_2
      //   273: invokestatic J : (Landroidx/constraintlayout/motion/widget/MotionLayout;Landroidx/constraintlayout/solver/widgets/d;III)V
      //   276: aload_0
      //   277: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   280: aload_0
      //   281: getfield b : Landroidx/constraintlayout/solver/widgets/d;
      //   284: iload #6
      //   286: iload_1
      //   287: iload_2
      //   288: invokestatic K : (Landroidx/constraintlayout/motion/widget/MotionLayout;Landroidx/constraintlayout/solver/widgets/d;III)V
      //   291: aload_0
      //   292: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   295: aload_0
      //   296: getfield a : Landroidx/constraintlayout/solver/widgets/d;
      //   299: invokevirtual U : ()I
      //   302: putfield z0 : I
      //   305: aload_0
      //   306: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   309: aload_0
      //   310: getfield a : Landroidx/constraintlayout/solver/widgets/d;
      //   313: invokevirtual y : ()I
      //   316: putfield A0 : I
      //   319: aload_0
      //   320: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   323: aload_0
      //   324: getfield b : Landroidx/constraintlayout/solver/widgets/d;
      //   327: invokevirtual U : ()I
      //   330: putfield B0 : I
      //   333: aload_0
      //   334: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   337: aload_0
      //   338: getfield b : Landroidx/constraintlayout/solver/widgets/d;
      //   341: invokevirtual y : ()I
      //   344: putfield C0 : I
      //   347: aload_0
      //   348: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   351: astore #5
      //   353: aload #5
      //   355: getfield z0 : I
      //   358: aload #5
      //   360: getfield B0 : I
      //   363: if_icmpne -> 388
      //   366: aload #5
      //   368: getfield A0 : I
      //   371: aload #5
      //   373: getfield C0 : I
      //   376: if_icmpeq -> 382
      //   379: goto -> 388
      //   382: iconst_0
      //   383: istore #7
      //   385: goto -> 391
      //   388: iconst_1
      //   389: istore #7
      //   391: aload #5
      //   393: iload #7
      //   395: putfield y0 : Z
      //   398: aload_0
      //   399: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   402: astore #5
      //   404: aload #5
      //   406: getfield z0 : I
      //   409: istore_3
      //   410: aload #5
      //   412: getfield A0 : I
      //   415: istore #6
      //   417: aload #5
      //   419: getfield D0 : I
      //   422: istore #4
      //   424: iload #4
      //   426: ldc_w -2147483648
      //   429: if_icmpeq -> 440
      //   432: iload_3
      //   433: istore #9
      //   435: iload #4
      //   437: ifne -> 460
      //   440: iload_3
      //   441: i2f
      //   442: aload #5
      //   444: getfield F0 : F
      //   447: aload #5
      //   449: getfield B0 : I
      //   452: iload_3
      //   453: isub
      //   454: i2f
      //   455: fmul
      //   456: fadd
      //   457: f2i
      //   458: istore #9
      //   460: aload #5
      //   462: getfield E0 : I
      //   465: istore #4
      //   467: iload #4
      //   469: ldc_w -2147483648
      //   472: if_icmpeq -> 483
      //   475: iload #6
      //   477: istore_3
      //   478: iload #4
      //   480: ifne -> 504
      //   483: iload #6
      //   485: i2f
      //   486: aload #5
      //   488: getfield F0 : F
      //   491: aload #5
      //   493: getfield C0 : I
      //   496: iload #6
      //   498: isub
      //   499: i2f
      //   500: fmul
      //   501: fadd
      //   502: f2i
      //   503: istore_3
      //   504: aload_0
      //   505: getfield a : Landroidx/constraintlayout/solver/widgets/d;
      //   508: invokevirtual D1 : ()Z
      //   511: ifne -> 533
      //   514: aload_0
      //   515: getfield b : Landroidx/constraintlayout/solver/widgets/d;
      //   518: invokevirtual D1 : ()Z
      //   521: ifeq -> 527
      //   524: goto -> 533
      //   527: iconst_0
      //   528: istore #7
      //   530: goto -> 536
      //   533: iconst_1
      //   534: istore #7
      //   536: aload_0
      //   537: getfield a : Landroidx/constraintlayout/solver/widgets/d;
      //   540: invokevirtual B1 : ()Z
      //   543: ifne -> 556
      //   546: aload_0
      //   547: getfield b : Landroidx/constraintlayout/solver/widgets/d;
      //   550: invokevirtual B1 : ()Z
      //   553: ifeq -> 559
      //   556: iconst_1
      //   557: istore #8
      //   559: aload_0
      //   560: getfield g : Landroidx/constraintlayout/motion/widget/MotionLayout;
      //   563: iload_1
      //   564: iload_2
      //   565: iload #9
      //   567: iload_3
      //   568: iload #7
      //   570: iload #8
      //   572: invokestatic M : (Landroidx/constraintlayout/motion/widget/MotionLayout;IIIIZZ)V
      //   575: return
    }
    
    public void g() {
      f(MotionLayout.T(this.g), MotionLayout.B(this.g));
      MotionLayout.C(this.g);
    }
    
    public void h(int param1Int1, int param1Int2) {
      this.e = param1Int1;
      this.f = param1Int2;
    }
  }
  
  protected static interface f {
    void a();
    
    void b(MotionEvent param1MotionEvent);
    
    float c();
    
    float d();
    
    void e(int param1Int);
  }
  
  private static class g implements f {
    private static g a = new g();
    
    VelocityTracker b;
    
    public static g f() {
      a.b = VelocityTracker.obtain();
      return a;
    }
    
    public void a() {
      VelocityTracker velocityTracker = this.b;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.b = null;
      } 
    }
    
    public void b(MotionEvent param1MotionEvent) {
      VelocityTracker velocityTracker = this.b;
      if (velocityTracker != null)
        velocityTracker.addMovement(param1MotionEvent); 
    }
    
    public float c() {
      VelocityTracker velocityTracker = this.b;
      return (velocityTracker != null) ? velocityTracker.getYVelocity() : 0.0F;
    }
    
    public float d() {
      VelocityTracker velocityTracker = this.b;
      return (velocityTracker != null) ? velocityTracker.getXVelocity() : 0.0F;
    }
    
    public void e(int param1Int) {
      VelocityTracker velocityTracker = this.b;
      if (velocityTracker != null)
        velocityTracker.computeCurrentVelocity(param1Int); 
    }
  }
  
  class h {
    float a = Float.NaN;
    
    float b = Float.NaN;
    
    int c = -1;
    
    int d = -1;
    
    final String e = "motion.progress";
    
    final String f = "motion.velocity";
    
    final String g = "motion.StartState";
    
    final String h = "motion.EndState";
    
    h(MotionLayout this$0) {}
    
    void a() {
      int i = this.c;
      if (i != -1 || this.d != -1) {
        if (i == -1) {
          this.i.s0(this.d);
        } else {
          int j = this.d;
          if (j == -1) {
            this.i.setState(i, -1, -1);
          } else {
            this.i.setTransition(i, j);
          } 
        } 
        this.i.setState(MotionLayout.TransitionState.c);
      } 
      if (Float.isNaN(this.b)) {
        if (Float.isNaN(this.a))
          return; 
        this.i.setProgress(this.a);
        return;
      } 
      this.i.setProgress(this.a, this.b);
      this.a = Float.NaN;
      this.b = Float.NaN;
      this.c = -1;
      this.d = -1;
    }
    
    public Bundle b() {
      Bundle bundle = new Bundle();
      bundle.putFloat("motion.progress", this.a);
      bundle.putFloat("motion.velocity", this.b);
      bundle.putInt("motion.StartState", this.c);
      bundle.putInt("motion.EndState", this.d);
      return bundle;
    }
    
    public void c() {
      this.d = MotionLayout.z(this.i);
      this.c = MotionLayout.A(this.i);
      this.b = this.i.getVelocity();
      this.a = this.i.getProgress();
    }
    
    public void d(int param1Int) {
      this.d = param1Int;
    }
    
    public void e(float param1Float) {
      this.a = param1Float;
    }
    
    public void f(int param1Int) {
      this.c = param1Int;
    }
    
    public void g(Bundle param1Bundle) {
      this.a = param1Bundle.getFloat("motion.progress");
      this.b = param1Bundle.getFloat("motion.velocity");
      this.c = param1Bundle.getInt("motion.StartState");
      this.d = param1Bundle.getInt("motion.EndState");
    }
    
    public void h(float param1Float) {
      this.b = param1Float;
    }
  }
  
  public static interface i {
    void a(MotionLayout param1MotionLayout, int param1Int1, int param1Int2, float param1Float);
    
    void b(MotionLayout param1MotionLayout, int param1Int1, int param1Int2);
    
    void c(MotionLayout param1MotionLayout, int param1Int, boolean param1Boolean, float param1Float);
    
    void d(MotionLayout param1MotionLayout, int param1Int);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/MotionLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */