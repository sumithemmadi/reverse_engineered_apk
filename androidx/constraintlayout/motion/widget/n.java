package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.b;
import b.f.a.a.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class n implements Comparable<n> {
  static String[] b = new String[] { "position", "x", "y", "width", "height", "pathRotate" };
  
  LinkedHashMap<String, ConstraintAttribute> A = new LinkedHashMap<String, ConstraintAttribute>();
  
  int B = 0;
  
  double[] C = new double[18];
  
  double[] D = new double[18];
  
  private float c = 1.0F;
  
  int d = 0;
  
  int e;
  
  private boolean f = false;
  
  private float g = 0.0F;
  
  private float h = 0.0F;
  
  private float i = 0.0F;
  
  public float j = 0.0F;
  
  private float k = 1.0F;
  
  private float l = 1.0F;
  
  private float m = Float.NaN;
  
  private float n = Float.NaN;
  
  private float o = 0.0F;
  
  private float p = 0.0F;
  
  private float q = 0.0F;
  
  private c r;
  
  private int s = 0;
  
  private float t;
  
  private float u;
  
  private float v;
  
  private float w;
  
  private float x;
  
  private float y = Float.NaN;
  
  private float z = Float.NaN;
  
  private boolean k(float paramFloat1, float paramFloat2) {
    boolean bool = Float.isNaN(paramFloat1);
    boolean bool1 = true;
    boolean bool2 = true;
    if (bool || Float.isNaN(paramFloat2)) {
      if (Float.isNaN(paramFloat1) != Float.isNaN(paramFloat2)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
      return bool2;
    } 
    if (Math.abs(paramFloat1 - paramFloat2) <= 1.0E-6F)
      bool2 = false; 
    return bool2;
  }
  
  public void a(HashMap<String, s> paramHashMap, int paramInt) {
    for (String str : paramHashMap.keySet()) {
      StringBuilder stringBuilder1;
      StringBuilder stringBuilder2;
      s s = paramHashMap.get(str);
      str.hashCode();
      byte b = -1;
      switch (str.hashCode()) {
        case 92909918:
          if (!str.equals("alpha"))
            break; 
          b = 13;
          break;
        case 37232917:
          if (!str.equals("transitionPathRotate"))
            break; 
          b = 12;
          break;
        case -4379043:
          if (!str.equals("elevation"))
            break; 
          b = 11;
          break;
        case -40300674:
          if (!str.equals("rotation"))
            break; 
          b = 10;
          break;
        case -760884509:
          if (!str.equals("transformPivotY"))
            break; 
          b = 9;
          break;
        case -760884510:
          if (!str.equals("transformPivotX"))
            break; 
          b = 8;
          break;
        case -908189617:
          if (!str.equals("scaleY"))
            break; 
          b = 7;
          break;
        case -908189618:
          if (!str.equals("scaleX"))
            break; 
          b = 6;
          break;
        case -1001078227:
          if (!str.equals("progress"))
            break; 
          b = 5;
          break;
        case -1225497655:
          if (!str.equals("translationZ"))
            break; 
          b = 4;
          break;
        case -1225497656:
          if (!str.equals("translationY"))
            break; 
          b = 3;
          break;
        case -1225497657:
          if (!str.equals("translationX"))
            break; 
          b = 2;
          break;
        case -1249320805:
          if (!str.equals("rotationY"))
            break; 
          b = 1;
          break;
        case -1249320806:
          if (!str.equals("rotationX"))
            break; 
          b = 0;
          break;
      } 
      float f1 = 1.0F;
      float f2 = 0.0F;
      float f3 = 0.0F;
      float f4 = 0.0F;
      float f5 = 0.0F;
      float f6 = 0.0F;
      float f7 = 0.0F;
      float f8 = 0.0F;
      float f9 = 0.0F;
      float f10 = 0.0F;
      float f11 = 0.0F;
      float f12 = 0.0F;
      switch (b) {
        default:
          if (str.startsWith("CUSTOM")) {
            StringBuilder stringBuilder;
            String str1 = str.split(",")[1];
            if (this.A.containsKey(str1)) {
              ConstraintAttribute constraintAttribute = this.A.get(str1);
              if (s instanceof s.b) {
                ((s.b)s).i(paramInt, constraintAttribute);
                continue;
              } 
              stringBuilder = new StringBuilder();
              stringBuilder.append(str);
              stringBuilder.append(" splineSet not a CustomSet frame = ");
              stringBuilder.append(paramInt);
              stringBuilder.append(", value");
              stringBuilder.append(constraintAttribute.d());
              stringBuilder.append(s);
              Log.e("MotionPaths", stringBuilder.toString());
              continue;
            } 
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append("UNKNOWN customName ");
            stringBuilder1.append((String)stringBuilder);
            Log.e("MotionPaths", stringBuilder1.toString());
            continue;
          } 
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("UNKNOWN spline ");
          stringBuilder2.append((String)stringBuilder1);
          Log.e("MotionPaths", stringBuilder2.toString());
          continue;
        case 13:
          if (!Float.isNaN(this.c))
            f1 = this.c; 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 12:
          if (Float.isNaN(this.y)) {
            f1 = f12;
          } else {
            f1 = this.y;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 11:
          if (Float.isNaN(this.g)) {
            f1 = f2;
          } else {
            f1 = this.g;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 10:
          if (Float.isNaN(this.h)) {
            f1 = f3;
          } else {
            f1 = this.h;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 9:
          if (Float.isNaN(this.n)) {
            f1 = f4;
          } else {
            f1 = this.n;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 8:
          if (Float.isNaN(this.m)) {
            f1 = f5;
          } else {
            f1 = this.m;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 7:
          if (!Float.isNaN(this.l))
            f1 = this.l; 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 6:
          if (!Float.isNaN(this.k))
            f1 = this.k; 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 5:
          if (Float.isNaN(this.z)) {
            f1 = f6;
          } else {
            f1 = this.z;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 4:
          if (Float.isNaN(this.q)) {
            f1 = f7;
          } else {
            f1 = this.q;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 3:
          if (Float.isNaN(this.p)) {
            f1 = f8;
          } else {
            f1 = this.p;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 2:
          if (Float.isNaN(this.o)) {
            f1 = f9;
          } else {
            f1 = this.o;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 1:
          if (Float.isNaN(this.j)) {
            f1 = f10;
          } else {
            f1 = this.j;
          } 
          stringBuilder2.e(paramInt, f1);
          continue;
        case 0:
          break;
      } 
      if (Float.isNaN(this.i)) {
        f1 = f11;
      } else {
        f1 = this.i;
      } 
      stringBuilder2.e(paramInt, f1);
    } 
  }
  
  public void e(View paramView) {
    float f;
    this.e = paramView.getVisibility();
    if (paramView.getVisibility() != 0) {
      f = 0.0F;
    } else {
      f = paramView.getAlpha();
    } 
    this.c = f;
    this.f = false;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
      this.g = paramView.getElevation(); 
    this.h = paramView.getRotation();
    this.i = paramView.getRotationX();
    this.j = paramView.getRotationY();
    this.k = paramView.getScaleX();
    this.l = paramView.getScaleY();
    this.m = paramView.getPivotX();
    this.n = paramView.getPivotY();
    this.o = paramView.getTranslationX();
    this.p = paramView.getTranslationY();
    if (i >= 21)
      this.q = paramView.getTranslationZ(); 
  }
  
  public void f(b.a parama) {
    float f;
    b.d d = parama.b;
    int i = d.c;
    this.d = i;
    int j = d.b;
    this.e = j;
    if (j != 0 && i == 0) {
      f = 0.0F;
    } else {
      f = d.d;
    } 
    this.c = f;
    b.e e = parama.e;
    this.f = e.m;
    this.g = e.n;
    this.h = e.c;
    this.i = e.d;
    this.j = e.e;
    this.k = e.f;
    this.l = e.g;
    this.m = e.h;
    this.n = e.i;
    this.o = e.j;
    this.p = e.k;
    this.q = e.l;
    this.r = c.c(parama.c.d);
    b.c c1 = parama.c;
    this.y = c1.h;
    this.s = c1.f;
    this.z = parama.b.e;
    for (String str : parama.f.keySet()) {
      ConstraintAttribute constraintAttribute = (ConstraintAttribute)parama.f.get(str);
      if (constraintAttribute.c() != ConstraintAttribute.AttributeType.f)
        this.A.put(str, constraintAttribute); 
    } 
  }
  
  public int i(n paramn) {
    return Float.compare(this.t, paramn.t);
  }
  
  void l(n paramn, HashSet<String> paramHashSet) {
    if (k(this.c, paramn.c))
      paramHashSet.add("alpha"); 
    if (k(this.g, paramn.g))
      paramHashSet.add("elevation"); 
    int i = this.e;
    int j = paramn.e;
    if (i != j && this.d == 0 && (i == 0 || j == 0))
      paramHashSet.add("alpha"); 
    if (k(this.h, paramn.h))
      paramHashSet.add("rotation"); 
    if (!Float.isNaN(this.y) || !Float.isNaN(paramn.y))
      paramHashSet.add("transitionPathRotate"); 
    if (!Float.isNaN(this.z) || !Float.isNaN(paramn.z))
      paramHashSet.add("progress"); 
    if (k(this.i, paramn.i))
      paramHashSet.add("rotationX"); 
    if (k(this.j, paramn.j))
      paramHashSet.add("rotationY"); 
    if (k(this.m, paramn.m))
      paramHashSet.add("transformPivotX"); 
    if (k(this.n, paramn.n))
      paramHashSet.add("transformPivotY"); 
    if (k(this.k, paramn.k))
      paramHashSet.add("scaleX"); 
    if (k(this.l, paramn.l))
      paramHashSet.add("scaleY"); 
    if (k(this.o, paramn.o))
      paramHashSet.add("translationX"); 
    if (k(this.p, paramn.p))
      paramHashSet.add("translationY"); 
    if (k(this.q, paramn.q))
      paramHashSet.add("translationZ"); 
  }
  
  void m(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.u = paramFloat1;
    this.v = paramFloat2;
    this.w = paramFloat3;
    this.x = paramFloat4;
  }
  
  public void n(View paramView) {
    m(paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
    e(paramView);
  }
  
  public void q(ConstraintWidget paramConstraintWidget, b paramb, int paramInt) {
    m(paramConstraintWidget.V(), paramConstraintWidget.W(), paramConstraintWidget.U(), paramConstraintWidget.y());
    f(paramb.s(paramInt));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */