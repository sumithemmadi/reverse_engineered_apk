package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.HashSet;

public class f extends c {
  private String g = null;
  
  private int h = 0;
  
  private int i = -1;
  
  private float j = Float.NaN;
  
  private float k = 0.0F;
  
  private float l = Float.NaN;
  
  private int m = -1;
  
  private float n = Float.NaN;
  
  private float o = Float.NaN;
  
  private float p = Float.NaN;
  
  private float q = Float.NaN;
  
  private float r = Float.NaN;
  
  private float s = Float.NaN;
  
  private float t = Float.NaN;
  
  private float u = Float.NaN;
  
  private float v = Float.NaN;
  
  private float w = Float.NaN;
  
  private float x = Float.NaN;
  
  public f() {
    this.e = 4;
    this.f = new HashMap<String, ConstraintAttribute>();
  }
  
  public void O(HashMap<String, h> paramHashMap) {
    for (String str : paramHashMap.keySet()) {
      if (str.startsWith("CUSTOM")) {
        String str1 = str.substring(7);
        ConstraintAttribute constraintAttribute = this.f.get(str1);
        if (constraintAttribute != null && constraintAttribute.c() == ConstraintAttribute.AttributeType.c)
          ((h)paramHashMap.get(str)).e(this.b, this.i, this.m, this.j, this.k, constraintAttribute.d(), constraintAttribute); 
        continue;
      } 
      float f1 = P(str);
      if (!Float.isNaN(f1))
        ((h)paramHashMap.get(str)).d(this.b, this.i, this.m, this.j, this.k, f1); 
    } 
  }
  
  public float P(String paramString) {
    StringBuilder stringBuilder;
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b = -1;
    switch (i) {
      case 156108012:
        if (!paramString.equals("waveOffset"))
          break; 
        b = 12;
        break;
      case 92909918:
        if (!paramString.equals("alpha"))
          break; 
        b = 11;
        break;
      case 37232917:
        if (!paramString.equals("transitionPathRotate"))
          break; 
        b = 10;
        break;
      case -4379043:
        if (!paramString.equals("elevation"))
          break; 
        b = 9;
        break;
      case -40300674:
        if (!paramString.equals("rotation"))
          break; 
        b = 8;
        break;
      case -908189617:
        if (!paramString.equals("scaleY"))
          break; 
        b = 7;
        break;
      case -908189618:
        if (!paramString.equals("scaleX"))
          break; 
        b = 6;
        break;
      case -1001078227:
        if (!paramString.equals("progress"))
          break; 
        b = 5;
        break;
      case -1225497655:
        if (!paramString.equals("translationZ"))
          break; 
        b = 4;
        break;
      case -1225497656:
        if (!paramString.equals("translationY"))
          break; 
        b = 3;
        break;
      case -1225497657:
        if (!paramString.equals("translationX"))
          break; 
        b = 2;
        break;
      case -1249320805:
        if (!paramString.equals("rotationY"))
          break; 
        b = 1;
        break;
      case -1249320806:
        if (!paramString.equals("rotationX"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("WARNING! KeyCycle UNKNOWN  ");
        stringBuilder.append(paramString);
        Log.v("KeyCycle", stringBuilder.toString());
        return Float.NaN;
      case 12:
        return this.k;
      case 11:
        return this.n;
      case 10:
        return this.q;
      case 9:
        return this.o;
      case 8:
        return this.p;
      case 7:
        return this.u;
      case 6:
        return this.t;
      case 5:
        return this.l;
      case 4:
        return this.x;
      case 3:
        return this.w;
      case 2:
        return this.v;
      case 1:
        return this.s;
      case 0:
        break;
    } 
    return this.r;
  }
  
  public void a(HashMap<String, s> paramHashMap) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("add ");
    stringBuilder.append(paramHashMap.size());
    stringBuilder.append(" values");
    a.e("KeyCycle", stringBuilder.toString(), 2);
    for (String str : paramHashMap.keySet()) {
      StringBuilder stringBuilder1;
      s s = paramHashMap.get(str);
      str.hashCode();
      byte b = -1;
      switch (str.hashCode()) {
        case 156108012:
          if (!str.equals("waveOffset"))
            break; 
          b = 12;
          break;
        case 92909918:
          if (!str.equals("alpha"))
            break; 
          b = 11;
          break;
        case 37232917:
          if (!str.equals("transitionPathRotate"))
            break; 
          b = 10;
          break;
        case -4379043:
          if (!str.equals("elevation"))
            break; 
          b = 9;
          break;
        case -40300674:
          if (!str.equals("rotation"))
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
      switch (b) {
        default:
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("WARNING KeyCycle UNKNOWN  ");
          stringBuilder1.append(str);
          Log.v("KeyCycle", stringBuilder1.toString());
          continue;
        case 12:
          stringBuilder1.e(this.b, this.k);
          continue;
        case 11:
          stringBuilder1.e(this.b, this.n);
          continue;
        case 10:
          stringBuilder1.e(this.b, this.q);
          continue;
        case 9:
          stringBuilder1.e(this.b, this.o);
          continue;
        case 8:
          stringBuilder1.e(this.b, this.p);
          continue;
        case 7:
          stringBuilder1.e(this.b, this.u);
          continue;
        case 6:
          stringBuilder1.e(this.b, this.t);
          continue;
        case 5:
          stringBuilder1.e(this.b, this.l);
          continue;
        case 4:
          stringBuilder1.e(this.b, this.x);
          continue;
        case 3:
          stringBuilder1.e(this.b, this.w);
          continue;
        case 2:
          stringBuilder1.e(this.b, this.v);
          continue;
        case 1:
          stringBuilder1.e(this.b, this.s);
          continue;
        case 0:
          break;
      } 
      stringBuilder1.e(this.b, this.r);
    } 
  }
  
  public void b(HashSet<String> paramHashSet) {
    if (!Float.isNaN(this.n))
      paramHashSet.add("alpha"); 
    if (!Float.isNaN(this.o))
      paramHashSet.add("elevation"); 
    if (!Float.isNaN(this.p))
      paramHashSet.add("rotation"); 
    if (!Float.isNaN(this.r))
      paramHashSet.add("rotationX"); 
    if (!Float.isNaN(this.s))
      paramHashSet.add("rotationY"); 
    if (!Float.isNaN(this.t))
      paramHashSet.add("scaleX"); 
    if (!Float.isNaN(this.u))
      paramHashSet.add("scaleY"); 
    if (!Float.isNaN(this.q))
      paramHashSet.add("transitionPathRotate"); 
    if (!Float.isNaN(this.v))
      paramHashSet.add("translationX"); 
    if (!Float.isNaN(this.w))
      paramHashSet.add("translationY"); 
    if (!Float.isNaN(this.x))
      paramHashSet.add("translationZ"); 
    if (this.f.size() > 0)
      for (String str : this.f.keySet()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CUSTOM,");
        stringBuilder.append(str);
        paramHashSet.add(stringBuilder.toString());
      }  
  }
  
  public void c(Context paramContext, AttributeSet paramAttributeSet) {
    a.a(this, paramContext.obtainStyledAttributes(paramAttributeSet, e.KeyCycle));
  }
  
  private static class a {
    private static SparseIntArray a;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      a = sparseIntArray;
      sparseIntArray.append(e.KeyCycle_motionTarget, 1);
      a.append(e.KeyCycle_framePosition, 2);
      a.append(e.KeyCycle_transitionEasing, 3);
      a.append(e.KeyCycle_curveFit, 4);
      a.append(e.KeyCycle_waveShape, 5);
      a.append(e.KeyCycle_wavePeriod, 6);
      a.append(e.KeyCycle_waveOffset, 7);
      a.append(e.KeyCycle_waveVariesBy, 8);
      a.append(e.KeyCycle_android_alpha, 9);
      a.append(e.KeyCycle_android_elevation, 10);
      a.append(e.KeyCycle_android_rotation, 11);
      a.append(e.KeyCycle_android_rotationX, 12);
      a.append(e.KeyCycle_android_rotationY, 13);
      a.append(e.KeyCycle_transitionPathRotate, 14);
      a.append(e.KeyCycle_android_scaleX, 15);
      a.append(e.KeyCycle_android_scaleY, 16);
      a.append(e.KeyCycle_android_translationX, 17);
      a.append(e.KeyCycle_android_translationY, 18);
      a.append(e.KeyCycle_android_translationZ, 19);
      a.append(e.KeyCycle_motionProgress, 20);
    }
    
    private static void b(f param1f, TypedArray param1TypedArray) {
      int i = param1TypedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        StringBuilder stringBuilder;
        int j = param1TypedArray.getIndex(b);
        switch (a.get(j)) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("unused attribute 0x");
            stringBuilder.append(Integer.toHexString(j));
            stringBuilder.append("   ");
            stringBuilder.append(a.get(j));
            Log.e("KeyCycle", stringBuilder.toString());
            break;
          case 20:
            f.x(param1f, param1TypedArray.getFloat(j, f.w(param1f)));
            break;
          case 19:
            if (Build.VERSION.SDK_INT >= 21)
              f.v(param1f, param1TypedArray.getDimension(j, f.u(param1f))); 
            break;
          case 18:
            f.t(param1f, param1TypedArray.getDimension(j, f.s(param1f)));
            break;
          case 17:
            f.r(param1f, param1TypedArray.getDimension(j, f.q(param1f)));
            break;
          case 16:
            f.p(param1f, param1TypedArray.getFloat(j, f.o(param1f)));
            break;
          case 15:
            f.n(param1f, param1TypedArray.getFloat(j, f.m(param1f)));
            break;
          case 14:
            f.l(param1f, param1TypedArray.getFloat(j, f.k(param1f)));
            break;
          case 13:
            f.j(param1f, param1TypedArray.getFloat(j, f.i(param1f)));
            break;
          case 12:
            f.g(param1f, param1TypedArray.getFloat(j, f.f(param1f)));
            break;
          case 11:
            f.N(param1f, param1TypedArray.getFloat(j, f.M(param1f)));
            break;
          case 10:
            f.L(param1f, param1TypedArray.getDimension(j, f.K(param1f)));
            break;
          case 9:
            f.J(param1f, param1TypedArray.getFloat(j, f.I(param1f)));
            break;
          case 8:
            f.H(param1f, param1TypedArray.getInt(j, f.G(param1f)));
            break;
          case 7:
            if ((param1TypedArray.peekValue(j)).type == 5) {
              f.F(param1f, param1TypedArray.getDimension(j, f.E(param1f)));
              break;
            } 
            f.F(param1f, param1TypedArray.getFloat(j, f.E(param1f)));
            break;
          case 6:
            f.D(param1f, param1TypedArray.getFloat(j, f.C(param1f)));
            break;
          case 5:
            f.B(param1f, param1TypedArray.getInt(j, f.A(param1f)));
            break;
          case 4:
            f.z(param1f, param1TypedArray.getInteger(j, f.y(param1f)));
            break;
          case 3:
            f.h(param1f, param1TypedArray.getString(j));
            break;
          case 2:
            param1f.b = param1TypedArray.getInt(j, param1f.b);
            break;
          case 1:
            if (MotionLayout.y) {
              int k = param1TypedArray.getResourceId(j, param1f.c);
              param1f.c = k;
              if (k == -1)
                param1f.d = param1TypedArray.getString(j); 
              break;
            } 
            if ((param1TypedArray.peekValue(j)).type == 3) {
              param1f.d = param1TypedArray.getString(j);
              break;
            } 
            param1f.c = param1TypedArray.getResourceId(j, param1f.c);
            break;
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */