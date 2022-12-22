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

public class d extends c {
  private String g;
  
  private int h = -1;
  
  private boolean i = false;
  
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
  
  private float u = Float.NaN;
  
  private float v = Float.NaN;
  
  private float w = Float.NaN;
  
  public d() {
    this.e = 1;
    this.f = new HashMap<String, ConstraintAttribute>();
  }
  
  public void a(HashMap<String, s> paramHashMap) {
    for (String str : paramHashMap.keySet()) {
      ConstraintAttribute constraintAttribute;
      StringBuilder stringBuilder;
      s s = paramHashMap.get(str);
      boolean bool = str.startsWith("CUSTOM");
      byte b = 7;
      if (bool) {
        str = str.substring(7);
        constraintAttribute = this.f.get(str);
        if (constraintAttribute != null)
          ((s.b)s).i(this.b, constraintAttribute); 
        continue;
      } 
      switch (constraintAttribute.hashCode()) {
        default:
          b = -1;
          break;
        case 92909918:
          if (constraintAttribute.equals("alpha")) {
            b = 13;
            break;
          } 
        case 37232917:
          if (constraintAttribute.equals("transitionPathRotate")) {
            b = 12;
            break;
          } 
        case -4379043:
          if (constraintAttribute.equals("elevation")) {
            b = 11;
            break;
          } 
        case -40300674:
          if (constraintAttribute.equals("rotation")) {
            b = 10;
            break;
          } 
        case -760884509:
          if (constraintAttribute.equals("transformPivotY")) {
            b = 9;
            break;
          } 
        case -760884510:
          if (constraintAttribute.equals("transformPivotX")) {
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
          Log.v("KeyAttributes", stringBuilder.toString());
          continue;
        case 13:
          if (!Float.isNaN(this.j))
            stringBuilder.e(this.b, this.j); 
          continue;
        case 12:
          if (!Float.isNaN(this.q))
            stringBuilder.e(this.b, this.q); 
          continue;
        case 11:
          if (!Float.isNaN(this.k))
            stringBuilder.e(this.b, this.k); 
          continue;
        case 10:
          if (!Float.isNaN(this.l))
            stringBuilder.e(this.b, this.l); 
          continue;
        case 9:
          if (!Float.isNaN(this.n))
            stringBuilder.e(this.b, this.p); 
          continue;
        case 8:
          if (!Float.isNaN(this.m))
            stringBuilder.e(this.b, this.o); 
          continue;
        case 7:
          if (!Float.isNaN(this.s))
            stringBuilder.e(this.b, this.s); 
          continue;
        case 6:
          if (!Float.isNaN(this.r))
            stringBuilder.e(this.b, this.r); 
          continue;
        case 5:
          if (!Float.isNaN(this.w))
            stringBuilder.e(this.b, this.w); 
          continue;
        case 4:
          if (!Float.isNaN(this.v))
            stringBuilder.e(this.b, this.v); 
          continue;
        case 3:
          if (!Float.isNaN(this.u))
            stringBuilder.e(this.b, this.u); 
          continue;
        case 2:
          if (!Float.isNaN(this.t))
            stringBuilder.e(this.b, this.t); 
          continue;
        case 1:
          if (!Float.isNaN(this.n))
            stringBuilder.e(this.b, this.n); 
          continue;
        case 0:
          break;
      } 
      continue;
      if (!Float.isNaN(this.m))
        SYNTHETIC_LOCAL_VARIABLE_4.e(this.b, this.m); 
    } 
  }
  
  public void b(HashSet<String> paramHashSet) {
    if (!Float.isNaN(this.j))
      paramHashSet.add("alpha"); 
    if (!Float.isNaN(this.k))
      paramHashSet.add("elevation"); 
    if (!Float.isNaN(this.l))
      paramHashSet.add("rotation"); 
    if (!Float.isNaN(this.m))
      paramHashSet.add("rotationX"); 
    if (!Float.isNaN(this.n))
      paramHashSet.add("rotationY"); 
    if (!Float.isNaN(this.o))
      paramHashSet.add("transformPivotX"); 
    if (!Float.isNaN(this.p))
      paramHashSet.add("transformPivotY"); 
    if (!Float.isNaN(this.t))
      paramHashSet.add("translationX"); 
    if (!Float.isNaN(this.u))
      paramHashSet.add("translationY"); 
    if (!Float.isNaN(this.v))
      paramHashSet.add("translationZ"); 
    if (!Float.isNaN(this.q))
      paramHashSet.add("transitionPathRotate"); 
    if (!Float.isNaN(this.r))
      paramHashSet.add("scaleX"); 
    if (!Float.isNaN(this.s))
      paramHashSet.add("scaleY"); 
    if (!Float.isNaN(this.w))
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
    a.a(this, paramContext.obtainStyledAttributes(paramAttributeSet, e.KeyAttribute));
  }
  
  public void e(HashMap<String, Integer> paramHashMap) {
    if (this.h == -1)
      return; 
    if (!Float.isNaN(this.j))
      paramHashMap.put("alpha", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.k))
      paramHashMap.put("elevation", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.l))
      paramHashMap.put("rotation", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.m))
      paramHashMap.put("rotationX", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.n))
      paramHashMap.put("rotationY", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.o))
      paramHashMap.put("transformPivotX", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.p))
      paramHashMap.put("transformPivotY", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.t))
      paramHashMap.put("translationX", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.u))
      paramHashMap.put("translationY", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.v))
      paramHashMap.put("translationZ", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.q))
      paramHashMap.put("transitionPathRotate", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.r))
      paramHashMap.put("scaleX", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.s))
      paramHashMap.put("scaleY", Integer.valueOf(this.h)); 
    if (!Float.isNaN(this.w))
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
      sparseIntArray.append(e.KeyAttribute_android_alpha, 1);
      a.append(e.KeyAttribute_android_elevation, 2);
      a.append(e.KeyAttribute_android_rotation, 4);
      a.append(e.KeyAttribute_android_rotationX, 5);
      a.append(e.KeyAttribute_android_rotationY, 6);
      a.append(e.KeyAttribute_android_transformPivotX, 19);
      a.append(e.KeyAttribute_android_transformPivotY, 20);
      a.append(e.KeyAttribute_android_scaleX, 7);
      a.append(e.KeyAttribute_transitionPathRotate, 8);
      a.append(e.KeyAttribute_transitionEasing, 9);
      a.append(e.KeyAttribute_motionTarget, 10);
      a.append(e.KeyAttribute_framePosition, 12);
      a.append(e.KeyAttribute_curveFit, 13);
      a.append(e.KeyAttribute_android_scaleY, 14);
      a.append(e.KeyAttribute_android_translationX, 15);
      a.append(e.KeyAttribute_android_translationY, 16);
      a.append(e.KeyAttribute_android_translationZ, 17);
      a.append(e.KeyAttribute_motionProgress, 18);
    }
    
    public static void a(d param1d, TypedArray param1TypedArray) {
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
            Log.e("KeyAttribute", stringBuilder.toString());
            break;
          case 20:
            d.I(param1d, param1TypedArray.getDimension(j, d.H(param1d)));
            break;
          case 19:
            d.G(param1d, param1TypedArray.getDimension(j, d.F(param1d)));
            break;
          case 18:
            d.u(param1d, param1TypedArray.getFloat(j, d.t(param1d)));
            break;
          case 17:
            if (Build.VERSION.SDK_INT >= 21)
              d.s(param1d, param1TypedArray.getDimension(j, d.r(param1d))); 
            break;
          case 16:
            d.q(param1d, param1TypedArray.getDimension(j, d.p(param1d)));
            break;
          case 15:
            d.o(param1d, param1TypedArray.getDimension(j, d.n(param1d)));
            break;
          case 14:
            d.j(param1d, param1TypedArray.getFloat(j, d.i(param1d)));
            break;
          case 13:
            d.y(param1d, param1TypedArray.getInteger(j, d.x(param1d)));
            break;
          case 12:
            param1d.b = param1TypedArray.getInt(j, param1d.b);
            break;
          case 10:
            if (MotionLayout.y) {
              int k = param1TypedArray.getResourceId(j, param1d.c);
              param1d.c = k;
              if (k == -1)
                param1d.d = param1TypedArray.getString(j); 
              break;
            } 
            if ((param1TypedArray.peekValue(j)).type == 3) {
              param1d.d = param1TypedArray.getString(j);
              break;
            } 
            param1d.c = param1TypedArray.getResourceId(j, param1d.c);
            break;
          case 9:
            d.J(param1d, param1TypedArray.getString(j));
            break;
          case 8:
            d.m(param1d, param1TypedArray.getFloat(j, d.l(param1d)));
            break;
          case 7:
            d.A(param1d, param1TypedArray.getFloat(j, d.z(param1d)));
            break;
          case 6:
            d.E(param1d, param1TypedArray.getFloat(j, d.D(param1d)));
            break;
          case 5:
            d.C(param1d, param1TypedArray.getFloat(j, d.B(param1d)));
            break;
          case 4:
            d.w(param1d, param1TypedArray.getFloat(j, d.v(param1d)));
            break;
          case 2:
            d.k(param1d, param1TypedArray.getDimension(j, d.h(param1d)));
            break;
          case 1:
            d.g(param1d, param1TypedArray.getFloat(j, d.f(param1d)));
            break;
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */