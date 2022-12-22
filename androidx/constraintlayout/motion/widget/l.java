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

public class l extends c {
  private String g;
  
  private int h = -1;
  
  private float i = Float.NaN;
  
  private float j = Float.NaN;
  
  private float k = Float.NaN;
  
  private float l = Float.NaN;
  
  private float m = Float.NaN;
  
  private float n = Float.NaN;
  
  private float o = Float.NaN;
  
  private float p = Float.NaN;
  
  private float q = Float.NaN;
  
  private float r = Float.NaN;
  
  private float s = Float.NaN;
  
  private float t = Float.NaN;
  
  private int u = 0;
  
  private float v = Float.NaN;
  
  private float w = 0.0F;
  
  public l() {
    this.e = 3;
    this.f = new HashMap<String, ConstraintAttribute>();
  }
  
  public void M(HashMap<String, t> paramHashMap) {
    for (String str : paramHashMap.keySet()) {
      ConstraintAttribute constraintAttribute;
      StringBuilder stringBuilder;
      t t = paramHashMap.get(str);
      boolean bool = str.startsWith("CUSTOM");
      byte b = 7;
      if (bool) {
        str = str.substring(7);
        constraintAttribute = this.f.get(str);
        if (constraintAttribute != null)
          ((t.b)t).j(this.b, constraintAttribute, this.v, this.u, this.w); 
        continue;
      } 
      switch (constraintAttribute.hashCode()) {
        default:
          b = -1;
          break;
        case 92909918:
          if (constraintAttribute.equals("alpha")) {
            b = 11;
            break;
          } 
        case 37232917:
          if (constraintAttribute.equals("transitionPathRotate")) {
            b = 10;
            break;
          } 
        case -4379043:
          if (constraintAttribute.equals("elevation")) {
            b = 9;
            break;
          } 
        case -40300674:
          if (constraintAttribute.equals("rotation")) {
            b = 8;
            break;
          } 
        case -908189617:
        
        case -908189618:
          if (constraintAttribute.equals("scaleX")) {
            b = 6;
            break;
          } 
        case -1001078227:
          if (constraintAttribute.equals("progress")) {
            b = 5;
            break;
          } 
        case -1225497655:
          if (constraintAttribute.equals("translationZ")) {
            b = 4;
            break;
          } 
        case -1225497656:
          if (constraintAttribute.equals("translationY")) {
            b = 3;
            break;
          } 
        case -1225497657:
          if (constraintAttribute.equals("translationX")) {
            b = 2;
            break;
          } 
        case -1249320805:
          if (constraintAttribute.equals("rotationY")) {
            b = 1;
            break;
          } 
        case -1249320806:
          if (constraintAttribute.equals("rotationX")) {
            b = 0;
            break;
          } 
      } 
      switch (b) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("UNKNOWN addValues \"");
          stringBuilder.append((String)constraintAttribute);
          stringBuilder.append("\"");
          Log.e("KeyTimeCycles", stringBuilder.toString());
          continue;
        case 11:
          if (!Float.isNaN(this.i))
            stringBuilder.e(this.b, this.i, this.v, this.u, this.w); 
          continue;
        case 10:
          if (!Float.isNaN(this.n))
            stringBuilder.e(this.b, this.n, this.v, this.u, this.w); 
          continue;
        case 9:
          if (!Float.isNaN(this.j))
            stringBuilder.e(this.b, this.j, this.v, this.u, this.w); 
          continue;
        case 8:
          if (!Float.isNaN(this.k))
            stringBuilder.e(this.b, this.k, this.v, this.u, this.w); 
          continue;
        case 7:
          if (!Float.isNaN(this.p))
            stringBuilder.e(this.b, this.p, this.v, this.u, this.w); 
          continue;
        case 6:
          if (!Float.isNaN(this.o))
            stringBuilder.e(this.b, this.o, this.v, this.u, this.w); 
          continue;
        case 5:
          if (!Float.isNaN(this.t))
            stringBuilder.e(this.b, this.t, this.v, this.u, this.w); 
          continue;
        case 4:
          if (!Float.isNaN(this.s))
            stringBuilder.e(this.b, this.s, this.v, this.u, this.w); 
          continue;
        case 3:
          if (!Float.isNaN(this.r))
            stringBuilder.e(this.b, this.r, this.v, this.u, this.w); 
          continue;
        case 2:
          if (!Float.isNaN(this.q))
            stringBuilder.e(this.b, this.q, this.v, this.u, this.w); 
          continue;
        case 1:
          if (!Float.isNaN(this.m))
            stringBuilder.e(this.b, this.m, this.v, this.u, this.w); 
          continue;
        case 0:
          break;
      } 
      continue;
      if (!Float.isNaN(this.l))
        SYNTHETIC_LOCAL_VARIABLE_4.e(this.b, this.l, this.v, this.u, this.w); 
    } 
  }
  
  public void a(HashMap<String, s> paramHashMap) {
    throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
  }
  
  public void b(HashSet<String> paramHashSet) {
    if (!Float.isNaN(this.i))
      paramHashSet.add("alpha"); 
    if (!Float.isNaN(this.j))
      paramHashSet.add("elevation"); 
    if (!Float.isNaN(this.k))
      paramHashSet.add("rotation"); 
    if (!Float.isNaN(this.l))
      paramHashSet.add("rotationX"); 
    if (!Float.isNaN(this.m))
      paramHashSet.add("rotationY"); 
    if (!Float.isNaN(this.q))
      paramHashSet.add("translationX"); 
    if (!Float.isNaN(this.r))
      paramHashSet.add("translationY"); 
    if (!Float.isNaN(this.s))
      paramHashSet.add("translationZ"); 
    if (!Float.isNaN(this.n))
      paramHashSet.add("transitionPathRotate"); 
    if (!Float.isNaN(this.o))
      paramHashSet.add("scaleX"); 
    if (!Float.isNaN(this.p))
      paramHashSet.add("scaleY"); 
    if (!Float.isNaN(this.t))
      paramHashSet.add("progress"); 
    if (this.f.size() > 0)
      for (String str : this.f.keySet()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CUSTOM,");
        stringBuilder.append(str);
        paramHashSet.add(stringBuilder.toString());
      }  
  }
  
  public void c(Context paramContext, AttributeSet paramAttributeSet) {
    a.a(this, paramContext.obtainStyledAttributes(paramAttributeSet, e.KeyTimeCycle));
  }
  
  public void e(HashMap<String, Integer> paramHashMap) {
    if (this.h == -1)
      return; 
    if (!Float.isNaN(this.i))
      paramHashMap.put("alpha", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.j))
      paramHashMap.put("elevation", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.k))
      paramHashMap.put("rotation", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.l))
      paramHashMap.put("rotationX", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.m))
      paramHashMap.put("rotationY", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.q))
      paramHashMap.put("translationX", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.r))
      paramHashMap.put("translationY", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.s))
      paramHashMap.put("translationZ", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.n))
      paramHashMap.put("transitionPathRotate", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.o))
      paramHashMap.put("scaleX", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.o))
      paramHashMap.put("scaleY", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.t))
      paramHashMap.put("progress", Integer.valueOf(this.h)); 
    if (this.f.size() > 0)
      for (String str : this.f.keySet()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CUSTOM,");
        stringBuilder.append(str);
        paramHashMap.put(stringBuilder.toString(), Integer.valueOf(this.h));
      }  
  }
  
  private static class a {
    private static SparseIntArray a;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      a = sparseIntArray;
      sparseIntArray.append(e.KeyTimeCycle_android_alpha, 1);
      a.append(e.KeyTimeCycle_android_elevation, 2);
      a.append(e.KeyTimeCycle_android_rotation, 4);
      a.append(e.KeyTimeCycle_android_rotationX, 5);
      a.append(e.KeyTimeCycle_android_rotationY, 6);
      a.append(e.KeyTimeCycle_android_scaleX, 7);
      a.append(e.KeyTimeCycle_transitionPathRotate, 8);
      a.append(e.KeyTimeCycle_transitionEasing, 9);
      a.append(e.KeyTimeCycle_motionTarget, 10);
      a.append(e.KeyTimeCycle_framePosition, 12);
      a.append(e.KeyTimeCycle_curveFit, 13);
      a.append(e.KeyTimeCycle_android_scaleY, 14);
      a.append(e.KeyTimeCycle_android_translationX, 15);
      a.append(e.KeyTimeCycle_android_translationY, 16);
      a.append(e.KeyTimeCycle_android_translationZ, 17);
      a.append(e.KeyTimeCycle_motionProgress, 18);
      a.append(e.KeyTimeCycle_wavePeriod, 20);
      a.append(e.KeyTimeCycle_waveOffset, 21);
      a.append(e.KeyTimeCycle_waveShape, 19);
    }
    
    public static void a(l param1l, TypedArray param1TypedArray) {
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
            Log.e("KeyTimeCycle", stringBuilder.toString());
            break;
          case 21:
            if ((param1TypedArray.peekValue(j)).type == 5) {
              l.F(param1l, param1TypedArray.getDimension(j, l.E(param1l)));
              break;
            } 
            l.F(param1l, param1TypedArray.getFloat(j, l.E(param1l)));
            break;
          case 20:
            l.D(param1l, param1TypedArray.getFloat(j, l.C(param1l)));
            break;
          case 19:
            l.B(param1l, param1TypedArray.getInt(j, l.A(param1l)));
            break;
          case 18:
            l.v(param1l, param1TypedArray.getFloat(j, l.u(param1l)));
            break;
          case 17:
            if (Build.VERSION.SDK_INT >= 21)
              l.t(param1l, param1TypedArray.getDimension(j, l.s(param1l))); 
            break;
          case 16:
            l.r(param1l, param1TypedArray.getDimension(j, l.q(param1l)));
            break;
          case 15:
            l.p(param1l, param1TypedArray.getDimension(j, l.o(param1l)));
            break;
          case 14:
            l.l(param1l, param1TypedArray.getFloat(j, l.k(param1l)));
            break;
          case 13:
            l.z(param1l, param1TypedArray.getInteger(j, l.y(param1l)));
            break;
          case 12:
            param1l.b = param1TypedArray.getInt(j, param1l.b);
            break;
          case 10:
            if (MotionLayout.y) {
              int k = param1TypedArray.getResourceId(j, param1l.c);
              param1l.c = k;
              if (k == -1)
                param1l.d = param1TypedArray.getString(j); 
              break;
            } 
            if ((param1TypedArray.peekValue(j)).type == 3) {
              param1l.d = param1TypedArray.getString(j);
              break;
            } 
            param1l.c = param1TypedArray.getResourceId(j, param1l.c);
            break;
          case 9:
            l.i(param1l, param1TypedArray.getString(j));
            break;
          case 8:
            l.n(param1l, param1TypedArray.getFloat(j, l.m(param1l)));
            break;
          case 7:
            l.H(param1l, param1TypedArray.getFloat(j, l.G(param1l)));
            break;
          case 6:
            l.L(param1l, param1TypedArray.getFloat(j, l.K(param1l)));
            break;
          case 5:
            l.J(param1l, param1TypedArray.getFloat(j, l.I(param1l)));
            break;
          case 4:
            l.x(param1l, param1TypedArray.getFloat(j, l.w(param1l)));
            break;
          case 2:
            l.j(param1l, param1TypedArray.getDimension(j, l.h(param1l)));
            break;
          case 1:
            l.g(param1l, param1TypedArray.getFloat(j, l.f(param1l)));
            break;
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */