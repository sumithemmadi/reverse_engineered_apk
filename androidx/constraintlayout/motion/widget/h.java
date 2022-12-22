package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public abstract class h {
  private b.f.a.a.b a;
  
  private d b;
  
  protected ConstraintAttribute c;
  
  private String d;
  
  private int e = 0;
  
  public int f = 0;
  
  ArrayList<p> g = new ArrayList<p>();
  
  static h c(String paramString) {
    if (paramString.startsWith("CUSTOM"))
      return new c(); 
    byte b1 = -1;
    switch (paramString.hashCode()) {
      case 156108012:
        if (!paramString.equals("waveOffset"))
          break; 
        b1 = 13;
        break;
      case 92909918:
        if (!paramString.equals("alpha"))
          break; 
        b1 = 12;
        break;
      case 37232917:
        if (!paramString.equals("transitionPathRotate"))
          break; 
        b1 = 11;
        break;
      case -4379043:
        if (!paramString.equals("elevation"))
          break; 
        b1 = 10;
        break;
      case -40300674:
        if (!paramString.equals("rotation"))
          break; 
        b1 = 9;
        break;
      case -797520672:
        if (!paramString.equals("waveVariesBy"))
          break; 
        b1 = 8;
        break;
      case -908189617:
        if (!paramString.equals("scaleY"))
          break; 
        b1 = 7;
        break;
      case -908189618:
        if (!paramString.equals("scaleX"))
          break; 
        b1 = 6;
        break;
      case -1001078227:
        if (!paramString.equals("progress"))
          break; 
        b1 = 5;
        break;
      case -1225497655:
        if (!paramString.equals("translationZ"))
          break; 
        b1 = 4;
        break;
      case -1225497656:
        if (!paramString.equals("translationY"))
          break; 
        b1 = 3;
        break;
      case -1225497657:
        if (!paramString.equals("translationX"))
          break; 
        b1 = 2;
        break;
      case -1249320805:
        if (!paramString.equals("rotationY"))
          break; 
        b1 = 1;
        break;
      case -1249320806:
        if (!paramString.equals("rotationX"))
          break; 
        b1 = 0;
        break;
    } 
    switch (b1) {
      default:
        return null;
      case 13:
        return new b();
      case 12:
        return new b();
      case 11:
        return new f();
      case 10:
        return new e();
      case 9:
        return new h();
      case 8:
        return new b();
      case 7:
        return new l();
      case 6:
        return new k();
      case 5:
        return new g();
      case 4:
        return new o();
      case 3:
        return new n();
      case 2:
        return new m();
      case 1:
        return new j();
      case 0:
        break;
    } 
    return new i();
  }
  
  public float a(float paramFloat) {
    return (float)this.b.b(paramFloat);
  }
  
  public float b(float paramFloat) {
    return (float)this.b.a(paramFloat);
  }
  
  public void d(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.g.add(new p(paramInt1, paramFloat1, paramFloat2, paramFloat3));
    if (paramInt3 != -1)
      this.f = paramInt3; 
    this.e = paramInt2;
  }
  
  public void e(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, ConstraintAttribute paramConstraintAttribute) {
    this.g.add(new p(paramInt1, paramFloat1, paramFloat2, paramFloat3));
    if (paramInt3 != -1)
      this.f = paramInt3; 
    this.e = paramInt2;
    this.c = paramConstraintAttribute;
  }
  
  public abstract void f(View paramView, float paramFloat);
  
  public void g(String paramString) {
    this.d = paramString;
  }
  
  @TargetApi(19)
  public void h(float paramFloat) {
    int i = this.g.size();
    if (i == 0)
      return; 
    Collections.sort(this.g, new a(this));
    double[] arrayOfDouble = new double[i];
    double[][] arrayOfDouble1 = new double[i][2];
    this.b = new d(this.e, this.f, i);
    Iterator<p> iterator = this.g.iterator();
    for (i = 0; iterator.hasNext(); i++) {
      p p = iterator.next();
      float f1 = p.d;
      double d1 = f1;
      Double.isNaN(d1);
      arrayOfDouble[i] = d1 * 0.01D;
      double[] arrayOfDouble2 = arrayOfDouble1[i];
      float f2 = p.b;
      arrayOfDouble2[0] = f2;
      arrayOfDouble2 = arrayOfDouble1[i];
      float f3 = p.c;
      arrayOfDouble2[1] = f3;
      this.b.c(i, p.a, f1, f3, f2);
    } 
    this.b.d(paramFloat);
    this.a = b.f.a.a.b.a(0, arrayOfDouble, arrayOfDouble1);
  }
  
  public boolean i() {
    int i = this.f;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public String toString() {
    String str = this.d;
    DecimalFormat decimalFormat = new DecimalFormat("##.##");
    for (p p : this.g) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append("[");
      stringBuilder.append(p.a);
      stringBuilder.append(" , ");
      stringBuilder.append(decimalFormat.format(p.b));
      stringBuilder.append("] ");
      str = stringBuilder.toString();
    } 
    return str;
  }
  
  class a implements Comparator<p> {
    a(h this$0) {}
    
    public int a(h.p param1p1, h.p param1p2) {
      return g.a(param1p1.a, param1p2.a);
    }
  }
  
  static class b extends h {
    public void f(View param1View, float param1Float) {
      param1View.setAlpha(a(param1Float));
    }
  }
  
  static class c extends h {
    float[] h = new float[1];
    
    public void f(View param1View, float param1Float) {
      this.h[0] = a(param1Float);
      this.c.i(param1View, this.h);
    }
  }
  
  static class d {
    private final int a;
    
    b.f.a.a.f b = new b.f.a.a.f();
    
    float[] c;
    
    double[] d;
    
    float[] e;
    
    float[] f;
    
    float[] g;
    
    int h;
    
    b.f.a.a.b i;
    
    double[] j;
    
    double[] k;
    
    float l;
    
    public HashMap<String, ConstraintAttribute> m = new HashMap<String, ConstraintAttribute>();
    
    d(int param1Int1, int param1Int2, int param1Int3) {
      this.h = param1Int1;
      this.a = param1Int2;
      this.b.g(param1Int1);
      this.c = new float[param1Int3];
      this.d = new double[param1Int3];
      this.e = new float[param1Int3];
      this.f = new float[param1Int3];
      this.g = new float[param1Int3];
    }
    
    public double a(float param1Float) {
      b.f.a.a.b b1 = this.i;
      if (b1 != null) {
        double d3 = param1Float;
        b1.g(d3, this.k);
        this.i.d(d3, this.j);
      } else {
        double[] arrayOfDouble1 = this.k;
        arrayOfDouble1[0] = 0.0D;
        arrayOfDouble1[1] = 0.0D;
      } 
      b.f.a.a.f f1 = this.b;
      double d2 = param1Float;
      double d1 = f1.e(d2);
      d2 = this.b.d(d2);
      double[] arrayOfDouble = this.k;
      return arrayOfDouble[0] + d1 * arrayOfDouble[1] + d2 * this.j[1];
    }
    
    public double b(float param1Float) {
      b.f.a.a.b b1 = this.i;
      if (b1 != null) {
        b1.d(param1Float, this.j);
      } else {
        double[] arrayOfDouble = this.j;
        arrayOfDouble[0] = this.f[0];
        arrayOfDouble[1] = this.c[0];
      } 
      return this.j[0] + this.b.e(param1Float) * this.j[1];
    }
    
    public void c(int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3) {
      double[] arrayOfDouble = this.d;
      double d1 = param1Int2;
      Double.isNaN(d1);
      arrayOfDouble[param1Int1] = d1 / 100.0D;
      this.e[param1Int1] = param1Float1;
      this.f[param1Int1] = param1Float2;
      this.c[param1Int1] = param1Float3;
    }
    
    public void d(float param1Float) {
      this.l = param1Float;
      double[][] arrayOfDouble = new double[this.d.length][2];
      float[] arrayOfFloat = this.c;
      this.j = new double[arrayOfFloat.length + 1];
      this.k = new double[arrayOfFloat.length + 1];
      if (this.d[0] > 0.0D)
        this.b.a(0.0D, this.e[0]); 
      double[] arrayOfDouble1 = this.d;
      int i = arrayOfDouble1.length - 1;
      if (arrayOfDouble1[i] < 1.0D)
        this.b.a(1.0D, this.e[i]); 
      i = 0;
      while (i < arrayOfDouble.length) {
        arrayOfDouble[i][0] = this.f[i];
        byte b1 = 0;
        while (true) {
          float[] arrayOfFloat1 = this.c;
          if (b1 < arrayOfFloat1.length) {
            arrayOfDouble[b1][1] = arrayOfFloat1[b1];
            b1++;
            continue;
          } 
          this.b.a(this.d[i], this.e[i]);
          i++;
        } 
      } 
      this.b.f();
      arrayOfDouble1 = this.d;
      if (arrayOfDouble1.length > 1) {
        this.i = b.f.a.a.b.a(0, arrayOfDouble1, arrayOfDouble);
      } else {
        this.i = null;
      } 
    }
  }
  
  static class e extends h {
    public void f(View param1View, float param1Float) {
      if (Build.VERSION.SDK_INT >= 21)
        param1View.setElevation(a(param1Float)); 
    }
  }
  
  static class f extends h {
    public void f(View param1View, float param1Float) {}
    
    public void j(View param1View, float param1Float, double param1Double1, double param1Double2) {
      param1View.setRotation(a(param1Float) + (float)Math.toDegrees(Math.atan2(param1Double2, param1Double1)));
    }
  }
  
  static class g extends h {
    boolean h = false;
    
    public void f(View param1View, float param1Float) {
      if (param1View instanceof MotionLayout) {
        ((MotionLayout)param1View).setProgress(a(param1Float));
      } else {
        if (this.h)
          return; 
        Method method = null;
        try {
          Method method1 = param1View.getClass().getMethod("setProgress", new Class[] { float.class });
          method = method1;
        } catch (NoSuchMethodException noSuchMethodException) {
          this.h = true;
        } 
        if (method != null)
          try {
            method.invoke(param1View, new Object[] { Float.valueOf(a(param1Float)) });
          } catch (IllegalAccessException illegalAccessException) {
            Log.e("KeyCycleOscillator", "unable to setProgress", illegalAccessException);
          } catch (InvocationTargetException invocationTargetException) {
            Log.e("KeyCycleOscillator", "unable to setProgress", invocationTargetException);
          }  
      } 
    }
  }
  
  static class h extends h {
    public void f(View param1View, float param1Float) {
      param1View.setRotation(a(param1Float));
    }
  }
  
  static class i extends h {
    public void f(View param1View, float param1Float) {
      param1View.setRotationX(a(param1Float));
    }
  }
  
  static class j extends h {
    public void f(View param1View, float param1Float) {
      param1View.setRotationY(a(param1Float));
    }
  }
  
  static class k extends h {
    public void f(View param1View, float param1Float) {
      param1View.setScaleX(a(param1Float));
    }
  }
  
  static class l extends h {
    public void f(View param1View, float param1Float) {
      param1View.setScaleY(a(param1Float));
    }
  }
  
  static class m extends h {
    public void f(View param1View, float param1Float) {
      param1View.setTranslationX(a(param1Float));
    }
  }
  
  static class n extends h {
    public void f(View param1View, float param1Float) {
      param1View.setTranslationY(a(param1Float));
    }
  }
  
  static class o extends h {
    public void f(View param1View, float param1Float) {
      if (Build.VERSION.SDK_INT >= 21)
        param1View.setTranslationZ(a(param1Float)); 
    }
  }
  
  static class p {
    int a;
    
    float b;
    
    float c;
    
    float d;
    
    public p(int param1Int, float param1Float1, float param1Float2, float param1Float3) {
      this.a = param1Int;
      this.b = param1Float3;
      this.c = param1Float2;
      this.d = param1Float1;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */