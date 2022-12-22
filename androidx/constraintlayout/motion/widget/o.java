package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import b.f.a.a.b;
import b.f.a.a.c;
import b.f.a.a.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class o {
  private m[] A;
  
  private int B = c.a;
  
  View a;
  
  int b;
  
  String c;
  
  private int d = -1;
  
  private q e = new q();
  
  private q f = new q();
  
  private n g = new n();
  
  private n h = new n();
  
  private b[] i;
  
  private b j;
  
  float k = Float.NaN;
  
  float l = 0.0F;
  
  float m = 1.0F;
  
  private int[] n;
  
  private double[] o;
  
  private double[] p;
  
  private String[] q;
  
  private int[] r;
  
  private int s = 4;
  
  private float[] t = new float[4];
  
  private ArrayList<q> u = new ArrayList<q>();
  
  private float[] v = new float[1];
  
  private ArrayList<c> w = new ArrayList<c>();
  
  private HashMap<String, t> x;
  
  private HashMap<String, s> y;
  
  private HashMap<String, h> z;
  
  o(View paramView) {
    u(paramView);
  }
  
  private float f(float paramFloat, float[] paramArrayOffloat) {
    float f3;
    float f1 = 0.0F;
    float f2 = 1.0F;
    if (paramArrayOffloat != null) {
      paramArrayOffloat[0] = 1.0F;
      f3 = paramFloat;
    } else {
      float f = this.m;
      f3 = paramFloat;
      if (f != 1.0D) {
        float f5 = this.l;
        float f6 = paramFloat;
        if (paramFloat < f5)
          f6 = 0.0F; 
        f3 = f6;
        if (f6 > f5) {
          f3 = f6;
          if (f6 < 1.0D)
            f3 = (f6 - f5) * f; 
        } 
      } 
    } 
    c c = this.e.c;
    paramFloat = Float.NaN;
    Iterator<q> iterator = this.u.iterator();
    float f4 = f1;
    while (iterator.hasNext()) {
      q q1 = iterator.next();
      c c1 = q1.c;
      if (c1 != null) {
        f1 = q1.e;
        if (f1 < f3) {
          c = c1;
          f4 = f1;
          continue;
        } 
        if (Float.isNaN(paramFloat))
          paramFloat = q1.e; 
      } 
    } 
    f1 = f3;
    if (c != null) {
      if (Float.isNaN(paramFloat))
        paramFloat = f2; 
      paramFloat -= f4;
      double d = ((f3 - f4) / paramFloat);
      paramFloat = (float)c.a(d) * paramFloat + f4;
      f1 = paramFloat;
      if (paramArrayOffloat != null) {
        paramArrayOffloat[0] = (float)c.b(d);
        f1 = paramFloat;
      } 
    } 
    return f1;
  }
  
  private float m() {
    float[] arrayOfFloat = new float[2];
    float f1 = 1.0F / 99;
    double d1 = 0.0D;
    double d2 = 0.0D;
    byte b1 = 0;
    float f2;
    for (f2 = 0.0F; b1 < 100; f2 = f4) {
      float f3 = b1 * f1;
      double d = f3;
      c c = this.e.c;
      float f4 = Float.NaN;
      Iterator<q> iterator = this.u.iterator();
      float f5;
      for (f5 = 0.0F; iterator.hasNext(); f5 = f7) {
        q q1 = iterator.next();
        c c1 = q1.c;
        c c2 = c;
        float f6 = f4;
        float f7 = f5;
        if (c1 != null) {
          f7 = q1.e;
          if (f7 < f3) {
            c2 = c1;
            f6 = f4;
          } else {
            c2 = c;
            f6 = f4;
            f7 = f5;
            if (Float.isNaN(f4)) {
              f6 = q1.e;
              f7 = f5;
              c2 = c;
            } 
          } 
        } 
        c = c2;
        f4 = f6;
      } 
      if (c != null) {
        float f = f4;
        if (Float.isNaN(f4))
          f = 1.0F; 
        f4 = f - f5;
        d = ((float)c.a(((f3 - f5) / f4)) * f4 + f5);
      } 
      this.i[0].d(d, this.o);
      this.e.l(this.n, this.o, arrayOfFloat, 0);
      f4 = f2;
      if (b1 > 0) {
        d = f2;
        double d3 = arrayOfFloat[1];
        Double.isNaN(d3);
        double d4 = arrayOfFloat[0];
        Double.isNaN(d4);
        d2 = Math.hypot(d2 - d3, d1 - d4);
        Double.isNaN(d);
        f4 = (float)(d + d2);
      } 
      d1 = arrayOfFloat[0];
      d2 = arrayOfFloat[1];
      b1++;
    } 
    return f2;
  }
  
  private void n(q paramq) {
    int i = Collections.binarySearch((List)this.u, paramq);
    if (i == 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(" KeyPath positon \"");
      stringBuilder.append(paramq.f);
      stringBuilder.append("\" outside of range");
      Log.e("MotionController", stringBuilder.toString());
    } 
    this.u.add(-i - 1, paramq);
  }
  
  private void p(q paramq) {
    paramq.v((int)this.a.getX(), (int)this.a.getY(), this.a.getWidth(), this.a.getHeight());
  }
  
  void a(c paramc) {
    this.w.add(paramc);
  }
  
  void b(ArrayList<c> paramArrayList) {
    this.w.addAll(paramArrayList);
  }
  
  int c(float[] paramArrayOffloat, int[] paramArrayOfint) {
    if (paramArrayOffloat != null) {
      double[] arrayOfDouble = this.i[0].h();
      if (paramArrayOfint != null) {
        Iterator<q> iterator = this.u.iterator();
        for (byte b3 = 0; iterator.hasNext(); b3++)
          paramArrayOfint[b3] = ((q)iterator.next()).o; 
      } 
      byte b1 = 0;
      byte b2 = 0;
      while (b1 < arrayOfDouble.length) {
        this.i[0].d(arrayOfDouble[b1], this.o);
        this.e.l(this.n, this.o, paramArrayOffloat, b2);
        b2 += true;
        b1++;
      } 
      return b2 / 2;
    } 
    return 0;
  }
  
  void d(float[] paramArrayOffloat, int paramInt) {
    s s1;
    s s2;
    h h2;
    float f = 1.0F / (paramInt - 1);
    HashMap<String, s> hashMap1 = this.y;
    h h1 = null;
    if (hashMap1 == null) {
      hashMap1 = null;
    } else {
      s1 = hashMap1.get("translationX");
    } 
    HashMap<String, s> hashMap2 = this.y;
    if (hashMap2 == null) {
      hashMap2 = null;
    } else {
      s2 = hashMap2.get("translationY");
    } 
    HashMap<String, h> hashMap3 = this.z;
    if (hashMap3 == null) {
      hashMap3 = null;
    } else {
      h2 = hashMap3.get("translationX");
    } 
    HashMap<String, h> hashMap4 = this.z;
    if (hashMap4 != null)
      h1 = hashMap4.get("translationY"); 
    for (byte b1 = 0; b1 < paramInt; b1++) {
      float f1 = b1 * f;
      float f2 = this.m;
      float f3 = f1;
      if (f2 != 1.0F) {
        float f5 = this.l;
        float f6 = f1;
        if (f1 < f5)
          f6 = 0.0F; 
        f3 = f6;
        if (f6 > f5) {
          f3 = f6;
          if (f6 < 1.0D)
            f3 = (f6 - f5) * f2; 
        } 
      } 
      double d = f3;
      c c = this.e.c;
      float f4 = Float.NaN;
      Iterator<q> iterator = this.u.iterator();
      for (f1 = 0.0F; iterator.hasNext(); f1 = f2) {
        q q2 = iterator.next();
        c c2 = q2.c;
        c c1 = c;
        float f5 = f4;
        f2 = f1;
        if (c2 != null) {
          f2 = q2.e;
          if (f2 < f3) {
            c1 = c2;
            f5 = f4;
          } else {
            c1 = c;
            f5 = f4;
            f2 = f1;
            if (Float.isNaN(f4)) {
              f5 = q2.e;
              f2 = f1;
              c1 = c;
            } 
          } 
        } 
        c = c1;
        f4 = f5;
      } 
      if (c != null) {
        f2 = f4;
        if (Float.isNaN(f4))
          f2 = 1.0F; 
        f4 = f2 - f1;
        d = ((float)c.a(((f3 - f1) / f4)) * f4 + f1);
      } 
      this.i[0].d(d, this.o);
      b b2 = this.j;
      if (b2 != null) {
        double[] arrayOfDouble1 = this.o;
        if (arrayOfDouble1.length > 0)
          b2.d(d, arrayOfDouble1); 
      } 
      q q1 = this.e;
      int[] arrayOfInt = this.n;
      double[] arrayOfDouble = this.o;
      int i = b1 * 2;
      q1.l(arrayOfInt, arrayOfDouble, paramArrayOffloat, i);
      if (h2 != null) {
        paramArrayOffloat[i] = paramArrayOffloat[i] + h2.a(f3);
      } else if (s1 != null) {
        paramArrayOffloat[i] = paramArrayOffloat[i] + s1.a(f3);
      } 
      if (h1 != null) {
        paramArrayOffloat[++i] = paramArrayOffloat[i] + h1.a(f3);
      } else if (s2 != null) {
        paramArrayOffloat[++i] = paramArrayOffloat[i] + s2.a(f3);
      } 
    } 
  }
  
  void e(float paramFloat, float[] paramArrayOffloat, int paramInt) {
    paramFloat = f(paramFloat, null);
    this.i[0].d(paramFloat, this.o);
    this.e.q(this.n, this.o, paramArrayOffloat, paramInt);
  }
  
  void g(float paramFloat1, float paramFloat2, float paramFloat3, float[] paramArrayOffloat) {
    paramFloat1 = f(paramFloat1, this.v);
    b[] arrayOfB = this.i;
    byte b1 = 0;
    if (arrayOfB != null) {
      b b2 = arrayOfB[0];
      double d = paramFloat1;
      b2.g(d, this.p);
      this.i[0].d(d, this.o);
      paramFloat1 = this.v[0];
      while (true) {
        double[] arrayOfDouble = this.p;
        if (b1 < arrayOfDouble.length) {
          double d1 = arrayOfDouble[b1];
          double d2 = paramFloat1;
          Double.isNaN(d2);
          arrayOfDouble[b1] = d1 * d2;
          b1++;
          continue;
        } 
        b2 = this.j;
        if (b2 != null) {
          arrayOfDouble = this.o;
          if (arrayOfDouble.length > 0) {
            b2.d(d, arrayOfDouble);
            this.j.g(d, this.p);
            this.e.w(paramFloat2, paramFloat3, paramArrayOffloat, this.n, this.p, this.o);
          } 
          return;
        } 
        this.e.w(paramFloat2, paramFloat3, paramArrayOffloat, this.n, arrayOfDouble, this.o);
        return;
      } 
    } 
    q q2 = this.f;
    paramFloat1 = q2.g;
    q q1 = this.e;
    float f1 = paramFloat1 - q1.g;
    float f2 = q2.h - q1.h;
    float f3 = q2.i;
    float f4 = q1.i;
    paramFloat1 = q2.j;
    float f5 = q1.j;
    paramArrayOffloat[0] = f1 * (1.0F - paramFloat2) + (f3 - f4 + f1) * paramFloat2;
    paramArrayOffloat[1] = f2 * (1.0F - paramFloat3) + (paramFloat1 - f5 + f2) * paramFloat3;
  }
  
  public int h() {
    int i = this.e.d;
    Iterator<q> iterator = this.u.iterator();
    while (iterator.hasNext())
      i = Math.max(i, ((q)iterator.next()).d); 
    return Math.max(i, this.f.d);
  }
  
  float i() {
    return this.f.g;
  }
  
  float j() {
    return this.f.h;
  }
  
  q k(int paramInt) {
    return this.u.get(paramInt);
  }
  
  void l(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, float paramFloat3, float[] paramArrayOffloat) {
    s s1;
    double[] arrayOfDouble;
    s s2;
    s s3;
    s s4;
    s s5;
    h h2;
    h h3;
    h h4;
    h h5;
    paramFloat1 = f(paramFloat1, this.v);
    HashMap<String, s> hashMap1 = this.y;
    h h1 = null;
    if (hashMap1 == null) {
      hashMap1 = null;
    } else {
      s1 = hashMap1.get("translationX");
    } 
    HashMap<String, s> hashMap2 = this.y;
    if (hashMap2 == null) {
      hashMap2 = null;
    } else {
      s2 = hashMap2.get("translationY");
    } 
    HashMap<String, s> hashMap3 = this.y;
    if (hashMap3 == null) {
      hashMap3 = null;
    } else {
      s3 = hashMap3.get("rotation");
    } 
    HashMap<String, s> hashMap4 = this.y;
    if (hashMap4 == null) {
      hashMap4 = null;
    } else {
      s4 = hashMap4.get("scaleX");
    } 
    HashMap<String, s> hashMap5 = this.y;
    if (hashMap5 == null) {
      hashMap5 = null;
    } else {
      s5 = hashMap5.get("scaleY");
    } 
    HashMap<String, h> hashMap6 = this.z;
    if (hashMap6 == null) {
      hashMap6 = null;
    } else {
      h2 = hashMap6.get("translationX");
    } 
    HashMap<String, h> hashMap7 = this.z;
    if (hashMap7 == null) {
      hashMap7 = null;
    } else {
      h3 = hashMap7.get("translationY");
    } 
    HashMap<String, h> hashMap8 = this.z;
    if (hashMap8 == null) {
      hashMap8 = null;
    } else {
      h4 = hashMap8.get("rotation");
    } 
    HashMap<String, h> hashMap9 = this.z;
    if (hashMap9 == null) {
      hashMap9 = null;
    } else {
      h5 = hashMap9.get("scaleX");
    } 
    HashMap<String, h> hashMap10 = this.z;
    if (hashMap10 != null)
      h1 = hashMap10.get("scaleY"); 
    h h = new h();
    h.b();
    h.d(s3, paramFloat1);
    h.h(s1, s2, paramFloat1);
    h.f(s4, s5, paramFloat1);
    h.c(h4, paramFloat1);
    h.g(h2, h3, paramFloat1);
    h.e(h5, h1, paramFloat1);
    b b1 = this.j;
    if (b1 != null) {
      arrayOfDouble = this.o;
      if (arrayOfDouble.length > 0) {
        double d = paramFloat1;
        b1.d(d, arrayOfDouble);
        this.j.g(d, this.p);
        this.e.w(paramFloat2, paramFloat3, paramArrayOffloat, this.n, this.p, this.o);
      } 
      h.a(paramFloat2, paramFloat3, paramInt1, paramInt2, paramArrayOffloat);
      return;
    } 
    b[] arrayOfB = this.i;
    byte b2 = 0;
    if (arrayOfB != null) {
      paramFloat1 = f(paramFloat1, this.v);
      b b3 = this.i[0];
      double d = paramFloat1;
      b3.g(d, this.p);
      this.i[0].d(d, this.o);
      paramFloat1 = this.v[0];
      while (true) {
        arrayOfDouble = this.p;
        if (b2 < arrayOfDouble.length) {
          d = arrayOfDouble[b2];
          double d1 = paramFloat1;
          Double.isNaN(d1);
          arrayOfDouble[b2] = d * d1;
          b2++;
          continue;
        } 
        this.e.w(paramFloat2, paramFloat3, paramArrayOffloat, this.n, arrayOfDouble, this.o);
        h.a(paramFloat2, paramFloat3, paramInt1, paramInt2, paramArrayOffloat);
        return;
      } 
    } 
    q q1 = this.f;
    float f1 = q1.g;
    q q2 = this.e;
    float f2 = f1 - q2.g;
    float f3 = q1.h - q2.h;
    float f4 = q1.i;
    f1 = q2.i;
    float f5 = q1.j;
    float f6 = q2.j;
    paramArrayOffloat[0] = f2 * (1.0F - paramFloat2) + (f4 - f1 + f2) * paramFloat2;
    paramArrayOffloat[1] = f3 * (1.0F - paramFloat3) + (f5 - f6 + f3) * paramFloat3;
    h.b();
    h.d(s3, paramFloat1);
    h.h((s)arrayOfDouble, s2, paramFloat1);
    h.f(s4, s5, paramFloat1);
    h.c(h4, paramFloat1);
    h.g(h2, h3, paramFloat1);
    h.e(h5, h1, paramFloat1);
    h.a(paramFloat2, paramFloat3, paramInt1, paramInt2, paramArrayOffloat);
  }
  
  boolean o(View paramView, float paramFloat, long paramLong, e parame) {
    // Byte code:
    //   0: aload_0
    //   1: fload_2
    //   2: aconst_null
    //   3: invokespecial f : (F[F)F
    //   6: fstore #6
    //   8: aload_0
    //   9: getfield y : Ljava/util/HashMap;
    //   12: astore #7
    //   14: aload #7
    //   16: ifnull -> 60
    //   19: aload #7
    //   21: invokevirtual values : ()Ljava/util/Collection;
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #7
    //   31: aload #7
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 60
    //   41: aload #7
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast androidx/constraintlayout/motion/widget/s
    //   51: aload_1
    //   52: fload #6
    //   54: invokevirtual f : (Landroid/view/View;F)V
    //   57: goto -> 31
    //   60: aload_0
    //   61: getfield x : Ljava/util/HashMap;
    //   64: astore #7
    //   66: aload #7
    //   68: ifnull -> 151
    //   71: aload #7
    //   73: invokevirtual values : ()Ljava/util/Collection;
    //   76: invokeinterface iterator : ()Ljava/util/Iterator;
    //   81: astore #8
    //   83: aconst_null
    //   84: astore #7
    //   86: iconst_0
    //   87: istore #9
    //   89: aload #8
    //   91: invokeinterface hasNext : ()Z
    //   96: ifeq -> 148
    //   99: aload #8
    //   101: invokeinterface next : ()Ljava/lang/Object;
    //   106: checkcast androidx/constraintlayout/motion/widget/t
    //   109: astore #10
    //   111: aload #10
    //   113: instanceof androidx/constraintlayout/motion/widget/t$d
    //   116: ifeq -> 129
    //   119: aload #10
    //   121: checkcast androidx/constraintlayout/motion/widget/t$d
    //   124: astore #7
    //   126: goto -> 89
    //   129: iload #9
    //   131: aload #10
    //   133: aload_1
    //   134: fload #6
    //   136: lload_3
    //   137: aload #5
    //   139: invokevirtual f : (Landroid/view/View;FJLandroidx/constraintlayout/motion/widget/e;)Z
    //   142: ior
    //   143: istore #9
    //   145: goto -> 89
    //   148: goto -> 157
    //   151: aconst_null
    //   152: astore #7
    //   154: iconst_0
    //   155: istore #9
    //   157: aload_0
    //   158: getfield i : [Lb/f/a/a/b;
    //   161: astore #8
    //   163: aload #8
    //   165: ifnull -> 584
    //   168: aload #8
    //   170: iconst_0
    //   171: aaload
    //   172: astore #8
    //   174: fload #6
    //   176: f2d
    //   177: dstore #11
    //   179: aload #8
    //   181: dload #11
    //   183: aload_0
    //   184: getfield o : [D
    //   187: invokevirtual d : (D[D)V
    //   190: aload_0
    //   191: getfield i : [Lb/f/a/a/b;
    //   194: iconst_0
    //   195: aaload
    //   196: dload #11
    //   198: aload_0
    //   199: getfield p : [D
    //   202: invokevirtual g : (D[D)V
    //   205: aload_0
    //   206: getfield j : Lb/f/a/a/b;
    //   209: astore #10
    //   211: aload #10
    //   213: ifnull -> 250
    //   216: aload_0
    //   217: getfield o : [D
    //   220: astore #8
    //   222: aload #8
    //   224: arraylength
    //   225: ifle -> 250
    //   228: aload #10
    //   230: dload #11
    //   232: aload #8
    //   234: invokevirtual d : (D[D)V
    //   237: aload_0
    //   238: getfield j : Lb/f/a/a/b;
    //   241: dload #11
    //   243: aload_0
    //   244: getfield p : [D
    //   247: invokevirtual g : (D[D)V
    //   250: aload_0
    //   251: getfield e : Landroidx/constraintlayout/motion/widget/q;
    //   254: aload_1
    //   255: aload_0
    //   256: getfield n : [I
    //   259: aload_0
    //   260: getfield o : [D
    //   263: aload_0
    //   264: getfield p : [D
    //   267: aconst_null
    //   268: invokevirtual x : (Landroid/view/View;[I[D[D[D)V
    //   271: aload_0
    //   272: getfield y : Ljava/util/HashMap;
    //   275: astore #8
    //   277: aload #8
    //   279: ifnull -> 356
    //   282: aload #8
    //   284: invokevirtual values : ()Ljava/util/Collection;
    //   287: invokeinterface iterator : ()Ljava/util/Iterator;
    //   292: astore #8
    //   294: aload #8
    //   296: invokeinterface hasNext : ()Z
    //   301: ifeq -> 356
    //   304: aload #8
    //   306: invokeinterface next : ()Ljava/lang/Object;
    //   311: checkcast androidx/constraintlayout/motion/widget/s
    //   314: astore #10
    //   316: aload #10
    //   318: instanceof androidx/constraintlayout/motion/widget/s$d
    //   321: ifeq -> 294
    //   324: aload #10
    //   326: checkcast androidx/constraintlayout/motion/widget/s$d
    //   329: astore #13
    //   331: aload_0
    //   332: getfield p : [D
    //   335: astore #10
    //   337: aload #13
    //   339: aload_1
    //   340: fload #6
    //   342: aload #10
    //   344: iconst_0
    //   345: daload
    //   346: aload #10
    //   348: iconst_1
    //   349: daload
    //   350: invokevirtual i : (Landroid/view/View;FDD)V
    //   353: goto -> 294
    //   356: aload #7
    //   358: ifnull -> 394
    //   361: aload_0
    //   362: getfield p : [D
    //   365: astore #8
    //   367: aload #7
    //   369: aload_1
    //   370: aload #5
    //   372: fload #6
    //   374: lload_3
    //   375: aload #8
    //   377: iconst_0
    //   378: daload
    //   379: aload #8
    //   381: iconst_1
    //   382: daload
    //   383: invokevirtual j : (Landroid/view/View;Landroidx/constraintlayout/motion/widget/e;FJDD)Z
    //   386: iload #9
    //   388: ior
    //   389: istore #9
    //   391: goto -> 394
    //   394: iconst_1
    //   395: istore #14
    //   397: aload_0
    //   398: getfield i : [Lb/f/a/a/b;
    //   401: astore #5
    //   403: iload #14
    //   405: aload #5
    //   407: arraylength
    //   408: if_icmpge -> 461
    //   411: aload #5
    //   413: iload #14
    //   415: aaload
    //   416: dload #11
    //   418: aload_0
    //   419: getfield t : [F
    //   422: invokevirtual e : (D[F)V
    //   425: aload_0
    //   426: getfield e : Landroidx/constraintlayout/motion/widget/q;
    //   429: getfield n : Ljava/util/LinkedHashMap;
    //   432: aload_0
    //   433: getfield q : [Ljava/lang/String;
    //   436: iload #14
    //   438: iconst_1
    //   439: isub
    //   440: aaload
    //   441: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   444: checkcast androidx/constraintlayout/widget/ConstraintAttribute
    //   447: aload_1
    //   448: aload_0
    //   449: getfield t : [F
    //   452: invokevirtual i : (Landroid/view/View;[F)V
    //   455: iinc #14, 1
    //   458: goto -> 397
    //   461: aload_0
    //   462: getfield g : Landroidx/constraintlayout/motion/widget/n;
    //   465: astore #5
    //   467: aload #5
    //   469: getfield d : I
    //   472: ifne -> 535
    //   475: fload #6
    //   477: fconst_0
    //   478: fcmpg
    //   479: ifgt -> 494
    //   482: aload_1
    //   483: aload #5
    //   485: getfield e : I
    //   488: invokevirtual setVisibility : (I)V
    //   491: goto -> 535
    //   494: fload #6
    //   496: fconst_1
    //   497: fcmpl
    //   498: iflt -> 515
    //   501: aload_1
    //   502: aload_0
    //   503: getfield h : Landroidx/constraintlayout/motion/widget/n;
    //   506: getfield e : I
    //   509: invokevirtual setVisibility : (I)V
    //   512: goto -> 535
    //   515: aload_0
    //   516: getfield h : Landroidx/constraintlayout/motion/widget/n;
    //   519: getfield e : I
    //   522: aload #5
    //   524: getfield e : I
    //   527: if_icmpeq -> 535
    //   530: aload_1
    //   531: iconst_0
    //   532: invokevirtual setVisibility : (I)V
    //   535: iload #9
    //   537: istore #15
    //   539: aload_0
    //   540: getfield A : [Landroidx/constraintlayout/motion/widget/m;
    //   543: ifnull -> 784
    //   546: iconst_0
    //   547: istore #14
    //   549: aload_0
    //   550: getfield A : [Landroidx/constraintlayout/motion/widget/m;
    //   553: astore #5
    //   555: iload #9
    //   557: istore #15
    //   559: iload #14
    //   561: aload #5
    //   563: arraylength
    //   564: if_icmpge -> 784
    //   567: aload #5
    //   569: iload #14
    //   571: aaload
    //   572: fload #6
    //   574: aload_1
    //   575: invokevirtual r : (FLandroid/view/View;)V
    //   578: iinc #14, 1
    //   581: goto -> 549
    //   584: aload_0
    //   585: getfield e : Landroidx/constraintlayout/motion/widget/q;
    //   588: astore #5
    //   590: aload #5
    //   592: getfield g : F
    //   595: fstore #16
    //   597: aload_0
    //   598: getfield f : Landroidx/constraintlayout/motion/widget/q;
    //   601: astore #7
    //   603: aload #7
    //   605: getfield g : F
    //   608: fstore #17
    //   610: aload #5
    //   612: getfield h : F
    //   615: fstore #18
    //   617: aload #7
    //   619: getfield h : F
    //   622: fstore #19
    //   624: aload #5
    //   626: getfield i : F
    //   629: fstore #20
    //   631: aload #7
    //   633: getfield i : F
    //   636: fstore #21
    //   638: aload #5
    //   640: getfield j : F
    //   643: fstore_2
    //   644: aload #7
    //   646: getfield j : F
    //   649: fstore #22
    //   651: fload #16
    //   653: fload #17
    //   655: fload #16
    //   657: fsub
    //   658: fload #6
    //   660: fmul
    //   661: fadd
    //   662: ldc_w 0.5
    //   665: fadd
    //   666: fstore #17
    //   668: fload #17
    //   670: f2i
    //   671: istore #23
    //   673: fload #18
    //   675: fload #19
    //   677: fload #18
    //   679: fsub
    //   680: fload #6
    //   682: fmul
    //   683: fadd
    //   684: ldc_w 0.5
    //   687: fadd
    //   688: fstore #19
    //   690: fload #19
    //   692: f2i
    //   693: istore #24
    //   695: fload #17
    //   697: fload #21
    //   699: fload #20
    //   701: fsub
    //   702: fload #6
    //   704: fmul
    //   705: fload #20
    //   707: fadd
    //   708: fadd
    //   709: f2i
    //   710: istore #14
    //   712: fload #19
    //   714: fload #22
    //   716: fload_2
    //   717: fsub
    //   718: fload #6
    //   720: fmul
    //   721: fload_2
    //   722: fadd
    //   723: fadd
    //   724: f2i
    //   725: istore #25
    //   727: fload #21
    //   729: fload #20
    //   731: fcmpl
    //   732: ifne -> 742
    //   735: fload #22
    //   737: fload_2
    //   738: fcmpl
    //   739: ifeq -> 768
    //   742: aload_1
    //   743: iload #14
    //   745: iload #23
    //   747: isub
    //   748: ldc_w 1073741824
    //   751: invokestatic makeMeasureSpec : (II)I
    //   754: iload #25
    //   756: iload #24
    //   758: isub
    //   759: ldc_w 1073741824
    //   762: invokestatic makeMeasureSpec : (II)I
    //   765: invokevirtual measure : (II)V
    //   768: aload_1
    //   769: iload #23
    //   771: iload #24
    //   773: iload #14
    //   775: iload #25
    //   777: invokevirtual layout : (IIII)V
    //   780: iload #9
    //   782: istore #15
    //   784: aload_0
    //   785: getfield z : Ljava/util/HashMap;
    //   788: astore #5
    //   790: aload #5
    //   792: ifnull -> 880
    //   795: aload #5
    //   797: invokevirtual values : ()Ljava/util/Collection;
    //   800: invokeinterface iterator : ()Ljava/util/Iterator;
    //   805: astore #5
    //   807: aload #5
    //   809: invokeinterface hasNext : ()Z
    //   814: ifeq -> 880
    //   817: aload #5
    //   819: invokeinterface next : ()Ljava/lang/Object;
    //   824: checkcast androidx/constraintlayout/motion/widget/h
    //   827: astore #7
    //   829: aload #7
    //   831: instanceof androidx/constraintlayout/motion/widget/h$f
    //   834: ifeq -> 869
    //   837: aload #7
    //   839: checkcast androidx/constraintlayout/motion/widget/h$f
    //   842: astore #7
    //   844: aload_0
    //   845: getfield p : [D
    //   848: astore #8
    //   850: aload #7
    //   852: aload_1
    //   853: fload #6
    //   855: aload #8
    //   857: iconst_0
    //   858: daload
    //   859: aload #8
    //   861: iconst_1
    //   862: daload
    //   863: invokevirtual j : (Landroid/view/View;FDD)V
    //   866: goto -> 807
    //   869: aload #7
    //   871: aload_1
    //   872: fload #6
    //   874: invokevirtual f : (Landroid/view/View;F)V
    //   877: goto -> 807
    //   880: iload #15
    //   882: ireturn
  }
  
  void q(ConstraintWidget paramConstraintWidget, b paramb) {
    q q1 = this.f;
    q1.e = 1.0F;
    q1.f = 1.0F;
    p(q1);
    this.f.v(paramConstraintWidget.V(), paramConstraintWidget.W(), paramConstraintWidget.U(), paramConstraintWidget.y());
    this.f.a(paramb.s(this.b));
    this.h.q(paramConstraintWidget, paramb, this.b);
  }
  
  public void r(int paramInt) {
    this.B = paramInt;
  }
  
  void s(View paramView) {
    q q1 = this.e;
    q1.e = 0.0F;
    q1.f = 0.0F;
    q1.v(paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
    this.g.n(paramView);
  }
  
  void t(ConstraintWidget paramConstraintWidget, b paramb) {
    q q1 = this.e;
    q1.e = 0.0F;
    q1.f = 0.0F;
    p(q1);
    this.e.v(paramConstraintWidget.V(), paramConstraintWidget.W(), paramConstraintWidget.U(), paramConstraintWidget.y());
    b.a a = paramb.s(this.b);
    this.e.a(a);
    this.k = a.c.g;
    this.g.q(paramConstraintWidget, paramb, this.b);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(" start: x: ");
    stringBuilder.append(this.e.g);
    stringBuilder.append(" y: ");
    stringBuilder.append(this.e.h);
    stringBuilder.append(" end: x: ");
    stringBuilder.append(this.f.g);
    stringBuilder.append(" y: ");
    stringBuilder.append(this.f.h);
    return stringBuilder.toString();
  }
  
  public void u(View paramView) {
    this.a = paramView;
    this.b = paramView.getId();
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (layoutParams instanceof ConstraintLayout.LayoutParams)
      this.c = ((ConstraintLayout.LayoutParams)layoutParams).a(); 
  }
  
  public void v(int paramInt1, int paramInt2, float paramFloat, long paramLong) {
    ArrayList arrayList1;
    new HashSet();
    HashSet<String> hashSet1 = new HashSet();
    HashSet<String> hashSet2 = new HashSet();
    HashSet<String> hashSet3 = new HashSet();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    int i = this.B;
    if (i != c.a)
      this.e.m = i; 
    this.g.l(this.h, hashSet2);
    ArrayList<c> arrayList = this.w;
    if (arrayList != null) {
      Iterator<c> iterator = arrayList.iterator();
      arrayList = null;
      while (true) {
        arrayList1 = arrayList;
        if (iterator.hasNext()) {
          c c = iterator.next();
          if (c instanceof j) {
            j j1 = (j)c;
            n(new q(paramInt1, paramInt2, j1, this.e, this.f));
            i = j1.g;
            if (i != c.a)
              this.d = i; 
            continue;
          } 
          if (c instanceof f) {
            c.b(hashSet3);
            continue;
          } 
          if (c instanceof l) {
            c.b(hashSet1);
            continue;
          } 
          if (c instanceof m) {
            arrayList1 = arrayList;
            if (arrayList == null)
              arrayList1 = new ArrayList<c>(); 
            arrayList1.add(c);
            arrayList = arrayList1;
            continue;
          } 
          c.e((HashMap)hashMap);
          c.b(hashSet2);
          continue;
        } 
        break;
      } 
    } else {
      arrayList1 = null;
    } 
    if (arrayList1 != null)
      this.A = (m[])arrayList1.toArray((Object[])new m[0]); 
    if (!hashSet2.isEmpty()) {
      this.y = new HashMap<String, s>();
      for (String str : hashSet2) {
        s s;
        if (str.startsWith("CUSTOM,")) {
          SparseArray<ConstraintAttribute> sparseArray = new SparseArray();
          String str1 = str.split(",")[1];
          for (c c : this.w) {
            HashMap<String, ConstraintAttribute> hashMap1 = c.f;
            if (hashMap1 == null)
              continue; 
            ConstraintAttribute constraintAttribute = hashMap1.get(str1);
            if (constraintAttribute != null)
              sparseArray.append(c.b, constraintAttribute); 
          } 
          s = s.c(str, sparseArray);
        } else {
          s = s.d(str);
        } 
        if (s == null)
          continue; 
        s.g(str);
        this.y.put(str, s);
      } 
      arrayList = this.w;
      if (arrayList != null)
        for (c c : arrayList) {
          if (c instanceof d)
            c.a(this.y); 
        }  
      this.g.a(this.y, 0);
      this.h.a(this.y, 100);
      for (String str : this.y.keySet()) {
        if (hashMap.containsKey(str)) {
          paramInt1 = ((Integer)hashMap.get(str)).intValue();
        } else {
          paramInt1 = 0;
        } 
        ((s)this.y.get(str)).h(paramInt1);
      } 
    } 
    if (!hashSet1.isEmpty()) {
      if (this.x == null)
        this.x = new HashMap<String, t>(); 
      for (String str : hashSet1) {
        t t;
        if (this.x.containsKey(str))
          continue; 
        if (str.startsWith("CUSTOM,")) {
          SparseArray<ConstraintAttribute> sparseArray = new SparseArray();
          String str1 = str.split(",")[1];
          for (c c : this.w) {
            HashMap<String, ConstraintAttribute> hashMap1 = c.f;
            if (hashMap1 == null)
              continue; 
            ConstraintAttribute constraintAttribute = hashMap1.get(str1);
            if (constraintAttribute != null)
              sparseArray.append(c.b, constraintAttribute); 
          } 
          t = t.c(str, sparseArray);
        } else {
          t = t.d(str, paramLong);
        } 
        if (t == null)
          continue; 
        t.h(str);
        this.x.put(str, t);
      } 
      arrayList = this.w;
      if (arrayList != null)
        for (c c : arrayList) {
          if (c instanceof l)
            ((l)c).M(this.x); 
        }  
      for (String str : this.x.keySet()) {
        if (hashMap.containsKey(str)) {
          paramInt1 = ((Integer)hashMap.get(str)).intValue();
        } else {
          paramInt1 = 0;
        } 
        ((t)this.x.get(str)).i(paramInt1);
      } 
    } 
    int j = this.u.size() + 2;
    q[] arrayOfQ = new q[j];
    arrayOfQ[0] = this.e;
    arrayOfQ[j - 1] = this.f;
    if (this.u.size() > 0 && this.d == -1)
      this.d = 0; 
    null = this.u.iterator();
    for (paramInt1 = 1; null.hasNext(); paramInt1++)
      arrayOfQ[paramInt1] = null.next(); 
    HashSet<String> hashSet4 = new HashSet();
    for (String str : this.f.n.keySet()) {
      if (this.e.n.containsKey(str)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CUSTOM,");
        stringBuilder.append(str);
        if (!hashSet2.contains(stringBuilder.toString()))
          hashSet4.add(str); 
      } 
    } 
    String[] arrayOfString = hashSet4.<String>toArray(new String[0]);
    this.q = arrayOfString;
    this.r = new int[arrayOfString.length];
    paramInt1 = 0;
    while (true) {
      String str;
      boolean bool;
      arrayOfString = this.q;
      if (paramInt1 < arrayOfString.length) {
        str = arrayOfString[paramInt1];
        this.r[paramInt1] = 0;
        for (paramInt2 = 0; paramInt2 < j; paramInt2++) {
          if ((arrayOfQ[paramInt2]).n.containsKey(str)) {
            int[] arrayOfInt1 = this.r;
            arrayOfInt1[paramInt1] = arrayOfInt1[paramInt1] + ((ConstraintAttribute)(arrayOfQ[paramInt2]).n.get(str)).f();
            break;
          } 
        } 
        paramInt1++;
        continue;
      } 
      if ((arrayOfQ[0]).m != c.a) {
        bool = true;
      } else {
        bool = false;
      } 
      int k = 18 + str.length;
      boolean[] arrayOfBoolean = new boolean[k];
      for (paramInt1 = 1; paramInt1 < j; paramInt1++)
        arrayOfQ[paramInt1].i(arrayOfQ[paramInt1 - 1], arrayOfBoolean, this.q, bool); 
      paramInt1 = 1;
      for (i = 0; paramInt1 < k; i = paramInt2) {
        paramInt2 = i;
        if (arrayOfBoolean[paramInt1])
          paramInt2 = i + 1; 
        paramInt1++;
      } 
      int[] arrayOfInt = new int[i];
      this.n = arrayOfInt;
      this.o = new double[arrayOfInt.length];
      this.p = new double[arrayOfInt.length];
      paramInt1 = 1;
      for (paramInt2 = 0; paramInt1 < k; paramInt2 = i) {
        i = paramInt2;
        if (arrayOfBoolean[paramInt1]) {
          this.n[paramInt2] = paramInt1;
          i = paramInt2 + 1;
        } 
        paramInt1++;
      } 
      double[][] arrayOfDouble1 = new double[j][this.n.length];
      double[] arrayOfDouble = new double[j];
      for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
        arrayOfQ[paramInt1].k(arrayOfDouble1[paramInt1], this.n);
        arrayOfDouble[paramInt1] = (arrayOfQ[paramInt1]).e;
      } 
      paramInt1 = 0;
      while (true) {
        arrayOfInt = this.n;
        if (paramInt1 < arrayOfInt.length) {
          if (arrayOfInt[paramInt1] < q.b.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(q.b[this.n[paramInt1]]);
            stringBuilder.append(" [");
            String str1 = stringBuilder.toString();
            for (paramInt2 = 0; paramInt2 < j; paramInt2++) {
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append(str1);
              stringBuilder1.append(arrayOfDouble1[paramInt2][paramInt1]);
              str1 = stringBuilder1.toString();
            } 
          } 
          paramInt1++;
          continue;
        } 
        this.i = new b[this.q.length + 1];
        paramInt1 = 0;
        while (true) {
          String[] arrayOfString1 = this.q;
          if (paramInt1 < arrayOfString1.length) {
            String str1 = arrayOfString1[paramInt1];
            i = 0;
            arrayOfBoolean = null;
            k = 0;
            arrayOfString1 = null;
            while (i < j) {
              double[][] arrayOfDouble4;
              double[] arrayOfDouble5;
              boolean[] arrayOfBoolean1 = arrayOfBoolean;
              paramInt2 = k;
              String[] arrayOfString2 = arrayOfString1;
              if (arrayOfQ[i].r(str1)) {
                double[] arrayOfDouble6;
                arrayOfString2 = arrayOfString1;
                if (arrayOfString1 == null) {
                  arrayOfDouble6 = new double[j];
                  arrayOfDouble4 = new double[j][arrayOfQ[i].n(str1)];
                } 
                arrayOfDouble6[k] = (arrayOfQ[i]).e;
                arrayOfQ[i].m(str1, arrayOfDouble4[k], 0);
                paramInt2 = k + 1;
                arrayOfDouble5 = arrayOfDouble6;
              } 
              i++;
              arrayOfDouble3 = arrayOfDouble5;
              k = paramInt2;
              arrayOfDouble2 = arrayOfDouble4;
            } 
            double[] arrayOfDouble3 = Arrays.copyOf(arrayOfDouble3, k);
            double[][] arrayOfDouble2 = Arrays.<double[]>copyOf(arrayOfDouble2, k);
            b[] arrayOfB = this.i;
            arrayOfB[++paramInt1] = b.a(this.d, arrayOfDouble3, arrayOfDouble2);
            continue;
          } 
          this.i[0] = b.a(this.d, arrayOfDouble, arrayOfDouble1);
          if ((arrayOfQ[0]).m != c.a) {
            int[] arrayOfInt1 = new int[j];
            double[] arrayOfDouble3 = new double[j];
            double[][] arrayOfDouble2 = new double[j][2];
            for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
              arrayOfInt1[paramInt1] = (arrayOfQ[paramInt1]).m;
              arrayOfDouble3[paramInt1] = (arrayOfQ[paramInt1]).e;
              arrayOfDouble2[paramInt1][0] = (arrayOfQ[paramInt1]).g;
              arrayOfDouble2[paramInt1][1] = (arrayOfQ[paramInt1]).h;
            } 
            this.j = b.b(arrayOfInt1, arrayOfDouble3, arrayOfDouble2);
          } 
          paramFloat = Float.NaN;
          this.z = new HashMap<String, h>();
          if (this.w != null) {
            for (String str1 : hashSet3) {
              h h = h.c(str1);
              if (h == null)
                continue; 
              float f = paramFloat;
              if (h.i()) {
                f = paramFloat;
                if (Float.isNaN(paramFloat))
                  f = m(); 
              } 
              h.g(str1);
              this.z.put(str1, h);
              paramFloat = f;
            } 
            for (c c : this.w) {
              if (c instanceof f)
                ((f)c).O(this.z); 
            } 
            Iterator<h> iterator = this.z.values().iterator();
            while (iterator.hasNext())
              ((h)iterator.next()).h(paramFloat); 
          } 
          return;
        } 
        break;
      } 
      break;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */