package b.j.a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import b.h.k.w;
import java.util.Arrays;

public class c {
  private static final Interpolator a = new a();
  
  private int b;
  
  private int c;
  
  private int d = -1;
  
  private float[] e;
  
  private float[] f;
  
  private float[] g;
  
  private float[] h;
  
  private int[] i;
  
  private int[] j;
  
  private int[] k;
  
  private int l;
  
  private VelocityTracker m;
  
  private float n;
  
  private float o;
  
  private int p;
  
  private int q;
  
  private OverScroller r;
  
  private final c s;
  
  private View t;
  
  private boolean u;
  
  private final ViewGroup v;
  
  private final Runnable w = new b(this);
  
  private c(Context paramContext, ViewGroup paramViewGroup, c paramc) {
    if (paramViewGroup != null) {
      if (paramc != null) {
        this.v = paramViewGroup;
        this.s = paramc;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(paramContext);
        this.p = (int)((paramContext.getResources().getDisplayMetrics()).density * 20.0F + 0.5F);
        this.c = viewConfiguration.getScaledTouchSlop();
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(paramContext, a);
        return;
      } 
      throw new IllegalArgumentException("Callback may not be null");
    } 
    throw new IllegalArgumentException("Parent view may not be null");
  }
  
  private boolean D(int paramInt) {
    if (!C(paramInt)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Ignoring pointerId=");
      stringBuilder.append(paramInt);
      stringBuilder.append(" because ACTION_DOWN was not received ");
      stringBuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
      stringBuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
      Log.e("ViewDragHelper", stringBuilder.toString());
      return false;
    } 
    return true;
  }
  
  private void G() {
    this.m.computeCurrentVelocity(1000, this.n);
    q(h(this.m.getXVelocity(this.d), this.o, this.n), h(this.m.getYVelocity(this.d), this.o, this.n));
  }
  
  private void H(float paramFloat1, float paramFloat2, int paramInt) {
    int i = 1;
    if (!d(paramFloat1, paramFloat2, paramInt, 1))
      i = 0; 
    int j = i;
    if (d(paramFloat2, paramFloat1, paramInt, 4))
      j = i | 0x4; 
    i = j;
    if (d(paramFloat1, paramFloat2, paramInt, 2))
      i = j | 0x2; 
    j = i;
    if (d(paramFloat2, paramFloat1, paramInt, 8))
      j = i | 0x8; 
    if (j != 0) {
      int[] arrayOfInt = this.j;
      arrayOfInt[paramInt] = arrayOfInt[paramInt] | j;
      this.s.f(j, paramInt);
    } 
  }
  
  private void I(float paramFloat1, float paramFloat2, int paramInt) {
    t(paramInt);
    float[] arrayOfFloat = this.e;
    this.g[paramInt] = paramFloat1;
    arrayOfFloat[paramInt] = paramFloat1;
    arrayOfFloat = this.f;
    this.h[paramInt] = paramFloat2;
    arrayOfFloat[paramInt] = paramFloat2;
    this.i[paramInt] = y((int)paramFloat1, (int)paramFloat2);
    this.l |= 1 << paramInt;
  }
  
  private void J(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getPointerCount();
    for (byte b = 0; b < i; b++) {
      int j = paramMotionEvent.getPointerId(b);
      if (D(j)) {
        float f1 = paramMotionEvent.getX(b);
        float f2 = paramMotionEvent.getY(b);
        this.g[j] = f1;
        this.h[j] = f2;
      } 
    } 
  }
  
  private boolean d(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    int i = this.i[paramInt1];
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((i & paramInt2) == paramInt2) {
      bool2 = bool1;
      if ((this.q & paramInt2) != 0) {
        bool2 = bool1;
        if ((this.k[paramInt1] & paramInt2) != paramInt2) {
          bool2 = bool1;
          if ((this.j[paramInt1] & paramInt2) != paramInt2) {
            i = this.c;
            if (paramFloat1 <= i && paramFloat2 <= i) {
              bool2 = bool1;
            } else {
              if (paramFloat1 < paramFloat2 * 0.5F && this.s.g(paramInt2)) {
                int[] arrayOfInt = this.k;
                arrayOfInt[paramInt1] = arrayOfInt[paramInt1] | paramInt2;
                return false;
              } 
              bool2 = bool1;
              if ((this.j[paramInt1] & paramInt2) == 0) {
                bool2 = bool1;
                if (paramFloat1 > this.c)
                  bool2 = true; 
              } 
            } 
          } 
        } 
      } 
    } 
    return bool2;
  }
  
  private boolean g(View paramView, float paramFloat1, float paramFloat2) {
    int i;
    boolean bool4;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramView == null)
      return false; 
    if (this.s.d(paramView) > 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (this.s.e(paramView) > 0) {
      bool4 = true;
    } else {
      bool4 = false;
    } 
    if (i && bool4) {
      i = this.c;
      if (paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2 > (i * i))
        bool3 = true; 
      return bool3;
    } 
    if (i != 0) {
      bool3 = bool1;
      if (Math.abs(paramFloat1) > this.c)
        bool3 = true; 
      return bool3;
    } 
    bool3 = bool2;
    if (bool4) {
      bool3 = bool2;
      if (Math.abs(paramFloat2) > this.c)
        bool3 = true; 
    } 
    return bool3;
  }
  
  private float h(float paramFloat1, float paramFloat2, float paramFloat3) {
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2)
      return 0.0F; 
    if (f > paramFloat3) {
      if (paramFloat1 <= 0.0F)
        paramFloat3 = -paramFloat3; 
      return paramFloat3;
    } 
    return paramFloat1;
  }
  
  private int i(int paramInt1, int paramInt2, int paramInt3) {
    int i = Math.abs(paramInt1);
    if (i < paramInt2)
      return 0; 
    if (i > paramInt3) {
      if (paramInt1 <= 0)
        paramInt3 = -paramInt3; 
      return paramInt3;
    } 
    return paramInt1;
  }
  
  private void j() {
    float[] arrayOfFloat = this.e;
    if (arrayOfFloat == null)
      return; 
    Arrays.fill(arrayOfFloat, 0.0F);
    Arrays.fill(this.f, 0.0F);
    Arrays.fill(this.g, 0.0F);
    Arrays.fill(this.h, 0.0F);
    Arrays.fill(this.i, 0);
    Arrays.fill(this.j, 0);
    Arrays.fill(this.k, 0);
    this.l = 0;
  }
  
  private void k(int paramInt) {
    if (this.e != null && C(paramInt)) {
      this.e[paramInt] = 0.0F;
      this.f[paramInt] = 0.0F;
      this.g[paramInt] = 0.0F;
      this.h[paramInt] = 0.0F;
      this.i[paramInt] = 0;
      this.j[paramInt] = 0;
      this.k[paramInt] = 0;
      this.l = (1 << paramInt ^ 0xFFFFFFFF) & this.l;
    } 
  }
  
  private int l(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 0)
      return 0; 
    int i = this.v.getWidth();
    int j = i / 2;
    float f1 = Math.min(1.0F, Math.abs(paramInt1) / i);
    float f2 = j;
    f1 = r(f1);
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {
      paramInt1 = Math.round(Math.abs((f2 + f1 * f2) / paramInt2) * 1000.0F) * 4;
    } else {
      paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F);
    } 
    return Math.min(paramInt1, 600);
  }
  
  private int m(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    float f1;
    float f2;
    paramInt3 = i(paramInt3, (int)this.o, (int)this.n);
    paramInt4 = i(paramInt4, (int)this.o, (int)this.n);
    int i = Math.abs(paramInt1);
    int j = Math.abs(paramInt2);
    int k = Math.abs(paramInt3);
    int m = Math.abs(paramInt4);
    int n = k + m;
    int i1 = i + j;
    if (paramInt3 != 0) {
      f1 = k;
      f2 = n;
    } else {
      f1 = i;
      f2 = i1;
    } 
    float f3 = f1 / f2;
    if (paramInt4 != 0) {
      f1 = m;
      f2 = n;
    } else {
      f1 = j;
      f2 = i1;
    } 
    f1 /= f2;
    paramInt1 = l(paramInt1, paramInt3, this.s.d(paramView));
    paramInt2 = l(paramInt2, paramInt4, this.s.e(paramView));
    return (int)(paramInt1 * f3 + paramInt2 * f1);
  }
  
  public static c o(ViewGroup paramViewGroup, float paramFloat, c paramc) {
    c c1 = p(paramViewGroup, paramc);
    c1.c = (int)(c1.c * 1.0F / paramFloat);
    return c1;
  }
  
  public static c p(ViewGroup paramViewGroup, c paramc) {
    return new c(paramViewGroup.getContext(), paramViewGroup, paramc);
  }
  
  private void q(float paramFloat1, float paramFloat2) {
    this.u = true;
    this.s.l(this.t, paramFloat1, paramFloat2);
    this.u = false;
    if (this.b == 1)
      K(0); 
  }
  
  private float r(float paramFloat) {
    return (float)Math.sin(((paramFloat - 0.5F) * 0.47123894F));
  }
  
  private void s(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.t.getLeft();
    int j = this.t.getTop();
    int k = paramInt1;
    if (paramInt3 != 0) {
      k = this.s.a(this.t, paramInt1, paramInt3);
      w.a0(this.t, k - i);
    } 
    paramInt1 = paramInt2;
    if (paramInt4 != 0) {
      paramInt1 = this.s.b(this.t, paramInt2, paramInt4);
      w.b0(this.t, paramInt1 - j);
    } 
    if (paramInt3 != 0 || paramInt4 != 0)
      this.s.k(this.t, k, paramInt1, k - i, paramInt1 - j); 
  }
  
  private void t(int paramInt) {
    float[] arrayOfFloat = this.e;
    if (arrayOfFloat == null || arrayOfFloat.length <= paramInt) {
      float[] arrayOfFloat1 = new float[++paramInt];
      float[] arrayOfFloat2 = new float[paramInt];
      float[] arrayOfFloat3 = new float[paramInt];
      float[] arrayOfFloat4 = new float[paramInt];
      int[] arrayOfInt1 = new int[paramInt];
      int[] arrayOfInt2 = new int[paramInt];
      int[] arrayOfInt3 = new int[paramInt];
      if (arrayOfFloat != null) {
        System.arraycopy(arrayOfFloat, 0, arrayOfFloat1, 0, arrayOfFloat.length);
        arrayOfFloat = this.f;
        System.arraycopy(arrayOfFloat, 0, arrayOfFloat2, 0, arrayOfFloat.length);
        arrayOfFloat = this.g;
        System.arraycopy(arrayOfFloat, 0, arrayOfFloat3, 0, arrayOfFloat.length);
        arrayOfFloat = this.h;
        System.arraycopy(arrayOfFloat, 0, arrayOfFloat4, 0, arrayOfFloat.length);
        int[] arrayOfInt = this.i;
        System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
        arrayOfInt = this.j;
        System.arraycopy(arrayOfInt, 0, arrayOfInt2, 0, arrayOfInt.length);
        arrayOfInt = this.k;
        System.arraycopy(arrayOfInt, 0, arrayOfInt3, 0, arrayOfInt.length);
      } 
      this.e = arrayOfFloat1;
      this.f = arrayOfFloat2;
      this.g = arrayOfFloat3;
      this.h = arrayOfFloat4;
      this.i = arrayOfInt1;
      this.j = arrayOfInt2;
      this.k = arrayOfInt3;
    } 
  }
  
  private boolean v(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.t.getLeft();
    int j = this.t.getTop();
    paramInt1 -= i;
    paramInt2 -= j;
    if (paramInt1 == 0 && paramInt2 == 0) {
      this.r.abortAnimation();
      K(0);
      return false;
    } 
    paramInt3 = m(this.t, paramInt1, paramInt2, paramInt3, paramInt4);
    this.r.startScroll(i, j, paramInt1, paramInt2, paramInt3);
    K(2);
    return true;
  }
  
  private int y(int paramInt1, int paramInt2) {
    if (paramInt1 < this.v.getLeft() + this.p) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = i;
    if (paramInt2 < this.v.getTop() + this.p)
      j = i | 0x4; 
    int i = j;
    if (paramInt1 > this.v.getRight() - this.p)
      i = j | 0x2; 
    paramInt1 = i;
    if (paramInt2 > this.v.getBottom() - this.p)
      paramInt1 = i | 0x8; 
    return paramInt1;
  }
  
  public int A() {
    return this.b;
  }
  
  public boolean B(int paramInt1, int paramInt2) {
    return E(this.t, paramInt1, paramInt2);
  }
  
  public boolean C(int paramInt) {
    int i = this.l;
    boolean bool = true;
    if ((1 << paramInt & i) == 0)
      bool = false; 
    return bool;
  }
  
  public boolean E(View paramView, int paramInt1, int paramInt2) {
    boolean bool1 = false;
    if (paramView == null)
      return false; 
    boolean bool2 = bool1;
    if (paramInt1 >= paramView.getLeft()) {
      bool2 = bool1;
      if (paramInt1 < paramView.getRight()) {
        bool2 = bool1;
        if (paramInt2 >= paramView.getTop()) {
          bool2 = bool1;
          if (paramInt2 < paramView.getBottom())
            bool2 = true; 
        } 
      } 
    } 
    return bool2;
  }
  
  public void F(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    int j = paramMotionEvent.getActionIndex();
    if (i == 0)
      b(); 
    if (this.m == null)
      this.m = VelocityTracker.obtain(); 
    this.m.addMovement(paramMotionEvent);
    int k = 0;
    int m = 0;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 5) {
              if (i == 6) {
                k = paramMotionEvent.getPointerId(j);
                if (this.b == 1 && k == this.d) {
                  j = paramMotionEvent.getPointerCount();
                  while (true) {
                    if (m < j) {
                      i = paramMotionEvent.getPointerId(m);
                      if (i != this.d) {
                        float f1 = paramMotionEvent.getX(m);
                        float f2 = paramMotionEvent.getY(m);
                        View view1 = u((int)f1, (int)f2);
                        View view2 = this.t;
                        if (view1 == view2 && Q(view2, i)) {
                          m = this.d;
                          break;
                        } 
                      } 
                      m++;
                      continue;
                    } 
                    m = -1;
                    break;
                  } 
                  if (m == -1)
                    G(); 
                } 
                k(k);
              } 
            } else {
              m = paramMotionEvent.getPointerId(j);
              float f1 = paramMotionEvent.getX(j);
              float f2 = paramMotionEvent.getY(j);
              I(f1, f2, m);
              if (this.b == 0) {
                Q(u((int)f1, (int)f2), m);
                j = this.i[m];
                k = this.q;
                if ((j & k) != 0)
                  this.s.h(j & k, m); 
              } else if (B((int)f1, (int)f2)) {
                Q(this.t, m);
              } 
            } 
          } else {
            if (this.b == 1)
              q(0.0F, 0.0F); 
            b();
          } 
        } else if (this.b == 1) {
          if (D(this.d)) {
            m = paramMotionEvent.findPointerIndex(this.d);
            float f2 = paramMotionEvent.getX(m);
            float f1 = paramMotionEvent.getY(m);
            float[] arrayOfFloat = this.g;
            k = this.d;
            m = (int)(f2 - arrayOfFloat[k]);
            k = (int)(f1 - this.h[k]);
            s(this.t.getLeft() + m, this.t.getTop() + k, m, k);
            J(paramMotionEvent);
          } 
        } else {
          j = paramMotionEvent.getPointerCount();
          for (m = k; m < j; m++) {
            k = paramMotionEvent.getPointerId(m);
            if (D(k)) {
              float f1 = paramMotionEvent.getX(m);
              float f2 = paramMotionEvent.getY(m);
              float f3 = f1 - this.e[k];
              float f4 = f2 - this.f[k];
              H(f3, f4, k);
              if (this.b == 1)
                break; 
              View view = u((int)f1, (int)f2);
              if (g(view, f3, f4) && Q(view, k))
                break; 
            } 
          } 
          J(paramMotionEvent);
        } 
      } else {
        if (this.b == 1)
          G(); 
        b();
      } 
    } else {
      float f2 = paramMotionEvent.getX();
      float f1 = paramMotionEvent.getY();
      k = paramMotionEvent.getPointerId(0);
      View view = u((int)f2, (int)f1);
      I(f2, f1, k);
      Q(view, k);
      j = this.i[k];
      m = this.q;
      if ((j & m) != 0)
        this.s.h(j & m, k); 
    } 
  }
  
  void K(int paramInt) {
    this.v.removeCallbacks(this.w);
    if (this.b != paramInt) {
      this.b = paramInt;
      this.s.j(paramInt);
      if (this.b == 0)
        this.t = null; 
    } 
  }
  
  public void L(int paramInt) {
    this.q = paramInt;
  }
  
  public void M(float paramFloat) {
    this.o = paramFloat;
  }
  
  public boolean N(int paramInt1, int paramInt2) {
    if (this.u)
      return v(paramInt1, paramInt2, (int)this.m.getXVelocity(this.d), (int)this.m.getYVelocity(this.d)); 
    throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
  }
  
  public boolean O(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_2
    //   5: aload_1
    //   6: invokevirtual getActionIndex : ()I
    //   9: istore_3
    //   10: iload_2
    //   11: ifne -> 18
    //   14: aload_0
    //   15: invokevirtual b : ()V
    //   18: aload_0
    //   19: getfield m : Landroid/view/VelocityTracker;
    //   22: ifnonnull -> 32
    //   25: aload_0
    //   26: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   29: putfield m : Landroid/view/VelocityTracker;
    //   32: aload_0
    //   33: getfield m : Landroid/view/VelocityTracker;
    //   36: aload_1
    //   37: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   40: iload_2
    //   41: ifeq -> 500
    //   44: iload_2
    //   45: iconst_1
    //   46: if_icmpeq -> 493
    //   49: iload_2
    //   50: iconst_2
    //   51: if_icmpeq -> 192
    //   54: iload_2
    //   55: iconst_3
    //   56: if_icmpeq -> 493
    //   59: iload_2
    //   60: iconst_5
    //   61: if_icmpeq -> 85
    //   64: iload_2
    //   65: bipush #6
    //   67: if_icmpeq -> 73
    //   70: goto -> 593
    //   73: aload_0
    //   74: aload_1
    //   75: iload_3
    //   76: invokevirtual getPointerId : (I)I
    //   79: invokespecial k : (I)V
    //   82: goto -> 70
    //   85: aload_1
    //   86: iload_3
    //   87: invokevirtual getPointerId : (I)I
    //   90: istore_2
    //   91: aload_1
    //   92: iload_3
    //   93: invokevirtual getX : (I)F
    //   96: fstore #4
    //   98: aload_1
    //   99: iload_3
    //   100: invokevirtual getY : (I)F
    //   103: fstore #5
    //   105: aload_0
    //   106: fload #4
    //   108: fload #5
    //   110: iload_2
    //   111: invokespecial I : (FFI)V
    //   114: aload_0
    //   115: getfield b : I
    //   118: istore_3
    //   119: iload_3
    //   120: ifne -> 158
    //   123: aload_0
    //   124: getfield i : [I
    //   127: iload_2
    //   128: iaload
    //   129: istore #6
    //   131: aload_0
    //   132: getfield q : I
    //   135: istore_3
    //   136: iload #6
    //   138: iload_3
    //   139: iand
    //   140: ifeq -> 70
    //   143: aload_0
    //   144: getfield s : Lb/j/a/c$c;
    //   147: iload #6
    //   149: iload_3
    //   150: iand
    //   151: iload_2
    //   152: invokevirtual h : (II)V
    //   155: goto -> 70
    //   158: iload_3
    //   159: iconst_2
    //   160: if_icmpne -> 70
    //   163: aload_0
    //   164: fload #4
    //   166: f2i
    //   167: fload #5
    //   169: f2i
    //   170: invokevirtual u : (II)Landroid/view/View;
    //   173: astore_1
    //   174: aload_1
    //   175: aload_0
    //   176: getfield t : Landroid/view/View;
    //   179: if_acmpne -> 70
    //   182: aload_0
    //   183: aload_1
    //   184: iload_2
    //   185: invokevirtual Q : (Landroid/view/View;I)Z
    //   188: pop
    //   189: goto -> 70
    //   192: aload_0
    //   193: getfield e : [F
    //   196: ifnull -> 70
    //   199: aload_0
    //   200: getfield f : [F
    //   203: ifnonnull -> 209
    //   206: goto -> 70
    //   209: aload_1
    //   210: invokevirtual getPointerCount : ()I
    //   213: istore #6
    //   215: iconst_0
    //   216: istore_2
    //   217: iload_2
    //   218: iload #6
    //   220: if_icmpge -> 485
    //   223: aload_1
    //   224: iload_2
    //   225: invokevirtual getPointerId : (I)I
    //   228: istore #7
    //   230: aload_0
    //   231: iload #7
    //   233: invokespecial D : (I)Z
    //   236: ifne -> 242
    //   239: goto -> 479
    //   242: aload_1
    //   243: iload_2
    //   244: invokevirtual getX : (I)F
    //   247: fstore #4
    //   249: aload_1
    //   250: iload_2
    //   251: invokevirtual getY : (I)F
    //   254: fstore #8
    //   256: fload #4
    //   258: aload_0
    //   259: getfield e : [F
    //   262: iload #7
    //   264: faload
    //   265: fsub
    //   266: fstore #5
    //   268: fload #8
    //   270: aload_0
    //   271: getfield f : [F
    //   274: iload #7
    //   276: faload
    //   277: fsub
    //   278: fstore #9
    //   280: aload_0
    //   281: fload #4
    //   283: f2i
    //   284: fload #8
    //   286: f2i
    //   287: invokevirtual u : (II)Landroid/view/View;
    //   290: astore #10
    //   292: aload #10
    //   294: ifnull -> 315
    //   297: aload_0
    //   298: aload #10
    //   300: fload #5
    //   302: fload #9
    //   304: invokespecial g : (Landroid/view/View;FF)Z
    //   307: ifeq -> 315
    //   310: iconst_1
    //   311: istore_3
    //   312: goto -> 317
    //   315: iconst_0
    //   316: istore_3
    //   317: iload_3
    //   318: ifeq -> 440
    //   321: aload #10
    //   323: invokevirtual getLeft : ()I
    //   326: istore #11
    //   328: fload #5
    //   330: f2i
    //   331: istore #12
    //   333: aload_0
    //   334: getfield s : Lb/j/a/c$c;
    //   337: aload #10
    //   339: iload #11
    //   341: iload #12
    //   343: iadd
    //   344: iload #12
    //   346: invokevirtual a : (Landroid/view/View;II)I
    //   349: istore #13
    //   351: aload #10
    //   353: invokevirtual getTop : ()I
    //   356: istore #12
    //   358: fload #9
    //   360: f2i
    //   361: istore #14
    //   363: aload_0
    //   364: getfield s : Lb/j/a/c$c;
    //   367: aload #10
    //   369: iload #12
    //   371: iload #14
    //   373: iadd
    //   374: iload #14
    //   376: invokevirtual b : (Landroid/view/View;II)I
    //   379: istore #15
    //   381: aload_0
    //   382: getfield s : Lb/j/a/c$c;
    //   385: aload #10
    //   387: invokevirtual d : (Landroid/view/View;)I
    //   390: istore #14
    //   392: aload_0
    //   393: getfield s : Lb/j/a/c$c;
    //   396: aload #10
    //   398: invokevirtual e : (Landroid/view/View;)I
    //   401: istore #16
    //   403: iload #14
    //   405: ifeq -> 420
    //   408: iload #14
    //   410: ifle -> 440
    //   413: iload #13
    //   415: iload #11
    //   417: if_icmpne -> 440
    //   420: iload #16
    //   422: ifeq -> 485
    //   425: iload #16
    //   427: ifle -> 440
    //   430: iload #15
    //   432: iload #12
    //   434: if_icmpne -> 440
    //   437: goto -> 485
    //   440: aload_0
    //   441: fload #5
    //   443: fload #9
    //   445: iload #7
    //   447: invokespecial H : (FFI)V
    //   450: aload_0
    //   451: getfield b : I
    //   454: iconst_1
    //   455: if_icmpne -> 461
    //   458: goto -> 485
    //   461: iload_3
    //   462: ifeq -> 479
    //   465: aload_0
    //   466: aload #10
    //   468: iload #7
    //   470: invokevirtual Q : (Landroid/view/View;I)Z
    //   473: ifeq -> 479
    //   476: goto -> 485
    //   479: iinc #2, 1
    //   482: goto -> 217
    //   485: aload_0
    //   486: aload_1
    //   487: invokespecial J : (Landroid/view/MotionEvent;)V
    //   490: goto -> 70
    //   493: aload_0
    //   494: invokevirtual b : ()V
    //   497: goto -> 70
    //   500: aload_1
    //   501: invokevirtual getX : ()F
    //   504: fstore #4
    //   506: aload_1
    //   507: invokevirtual getY : ()F
    //   510: fstore #5
    //   512: aload_1
    //   513: iconst_0
    //   514: invokevirtual getPointerId : (I)I
    //   517: istore_3
    //   518: aload_0
    //   519: fload #4
    //   521: fload #5
    //   523: iload_3
    //   524: invokespecial I : (FFI)V
    //   527: aload_0
    //   528: fload #4
    //   530: f2i
    //   531: fload #5
    //   533: f2i
    //   534: invokevirtual u : (II)Landroid/view/View;
    //   537: astore_1
    //   538: aload_1
    //   539: aload_0
    //   540: getfield t : Landroid/view/View;
    //   543: if_acmpne -> 561
    //   546: aload_0
    //   547: getfield b : I
    //   550: iconst_2
    //   551: if_icmpne -> 561
    //   554: aload_0
    //   555: aload_1
    //   556: iload_3
    //   557: invokevirtual Q : (Landroid/view/View;I)Z
    //   560: pop
    //   561: aload_0
    //   562: getfield i : [I
    //   565: iload_3
    //   566: iaload
    //   567: istore #6
    //   569: aload_0
    //   570: getfield q : I
    //   573: istore_2
    //   574: iload #6
    //   576: iload_2
    //   577: iand
    //   578: ifeq -> 593
    //   581: aload_0
    //   582: getfield s : Lb/j/a/c$c;
    //   585: iload #6
    //   587: iload_2
    //   588: iand
    //   589: iload_3
    //   590: invokevirtual h : (II)V
    //   593: iconst_0
    //   594: istore #17
    //   596: aload_0
    //   597: getfield b : I
    //   600: iconst_1
    //   601: if_icmpne -> 607
    //   604: iconst_1
    //   605: istore #17
    //   607: iload #17
    //   609: ireturn
  }
  
  public boolean P(View paramView, int paramInt1, int paramInt2) {
    this.t = paramView;
    this.d = -1;
    boolean bool = v(paramInt1, paramInt2, 0, 0);
    if (!bool && this.b == 0 && this.t != null)
      this.t = null; 
    return bool;
  }
  
  boolean Q(View paramView, int paramInt) {
    if (paramView == this.t && this.d == paramInt)
      return true; 
    if (paramView != null && this.s.m(paramView, paramInt)) {
      this.d = paramInt;
      c(paramView, paramInt);
      return true;
    } 
    return false;
  }
  
  public void a() {
    b();
    if (this.b == 2) {
      int i = this.r.getCurrX();
      int j = this.r.getCurrY();
      this.r.abortAnimation();
      int k = this.r.getCurrX();
      int m = this.r.getCurrY();
      this.s.k(this.t, k, m, k - i, m - j);
    } 
    K(0);
  }
  
  public void b() {
    this.d = -1;
    j();
    VelocityTracker velocityTracker = this.m;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.m = null;
    } 
  }
  
  public void c(View paramView, int paramInt) {
    if (paramView.getParent() == this.v) {
      this.t = paramView;
      this.d = paramInt;
      this.s.i(paramView, paramInt);
      K(1);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    stringBuilder.append(this.v);
    stringBuilder.append(")");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public boolean e(int paramInt) {
    int i = this.e.length;
    for (byte b = 0; b < i; b++) {
      if (f(paramInt, b))
        return true; 
    } 
    return false;
  }
  
  public boolean f(int paramInt1, int paramInt2) {
    boolean bool4;
    boolean bool = C(paramInt2);
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool)
      return false; 
    if ((paramInt1 & 0x1) == 1) {
      bool4 = true;
    } else {
      bool4 = false;
    } 
    if ((paramInt1 & 0x2) == 2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    float f1 = this.g[paramInt2] - this.e[paramInt2];
    float f2 = this.h[paramInt2] - this.f[paramInt2];
    if (bool4 && paramInt1 != 0) {
      paramInt1 = this.c;
      if (f1 * f1 + f2 * f2 > (paramInt1 * paramInt1))
        bool3 = true; 
      return bool3;
    } 
    if (bool4) {
      bool3 = bool1;
      if (Math.abs(f1) > this.c)
        bool3 = true; 
      return bool3;
    } 
    bool3 = bool2;
    if (paramInt1 != 0) {
      bool3 = bool2;
      if (Math.abs(f2) > this.c)
        bool3 = true; 
    } 
    return bool3;
  }
  
  public boolean n(boolean paramBoolean) {
    int i = this.b;
    boolean bool = false;
    if (i == 2) {
      boolean bool1 = this.r.computeScrollOffset();
      int j = this.r.getCurrX();
      int k = this.r.getCurrY();
      i = j - this.t.getLeft();
      int m = k - this.t.getTop();
      if (i != 0)
        w.a0(this.t, i); 
      if (m != 0)
        w.b0(this.t, m); 
      if (i != 0 || m != 0)
        this.s.k(this.t, j, k, i, m); 
      boolean bool2 = bool1;
      if (bool1) {
        bool2 = bool1;
        if (j == this.r.getFinalX()) {
          bool2 = bool1;
          if (k == this.r.getFinalY()) {
            this.r.abortAnimation();
            bool2 = false;
          } 
        } 
      } 
      if (!bool2)
        if (paramBoolean) {
          this.v.post(this.w);
        } else {
          K(0);
        }  
    } 
    paramBoolean = bool;
    if (this.b == 2)
      paramBoolean = true; 
    return paramBoolean;
  }
  
  public View u(int paramInt1, int paramInt2) {
    for (int i = this.v.getChildCount() - 1; i >= 0; i--) {
      View view = this.v.getChildAt(this.s.c(i));
      if (paramInt1 >= view.getLeft() && paramInt1 < view.getRight() && paramInt2 >= view.getTop() && paramInt2 < view.getBottom())
        return view; 
    } 
    return null;
  }
  
  public View w() {
    return this.t;
  }
  
  public int x() {
    return this.p;
  }
  
  public int z() {
    return this.c;
  }
  
  static final class a implements Interpolator {
    public float getInterpolation(float param1Float) {
      param1Float--;
      return param1Float * param1Float * param1Float * param1Float * param1Float + 1.0F;
    }
  }
  
  class b implements Runnable {
    b(c this$0) {}
    
    public void run() {
      this.b.K(0);
    }
  }
  
  public static abstract class c {
    public abstract int a(View param1View, int param1Int1, int param1Int2);
    
    public abstract int b(View param1View, int param1Int1, int param1Int2);
    
    public int c(int param1Int) {
      return param1Int;
    }
    
    public int d(View param1View) {
      return 0;
    }
    
    public int e(View param1View) {
      return 0;
    }
    
    public void f(int param1Int1, int param1Int2) {}
    
    public boolean g(int param1Int) {
      return false;
    }
    
    public void h(int param1Int1, int param1Int2) {}
    
    public void i(View param1View, int param1Int) {}
    
    public abstract void j(int param1Int);
    
    public abstract void k(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
    
    public abstract void l(View param1View, float param1Float1, float param1Float2);
    
    public abstract boolean m(View param1View, int param1Int);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/j/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */