package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

public abstract class t {
  private static float a = 6.2831855F;
  
  protected b.f.a.a.b b;
  
  protected int c = 0;
  
  protected int[] d = new int[10];
  
  protected float[][] e = new float[10][3];
  
  private int f;
  
  private String g;
  
  private float[] h = new float[3];
  
  protected boolean i = false;
  
  long j;
  
  float k = Float.NaN;
  
  static t c(String paramString, SparseArray<ConstraintAttribute> paramSparseArray) {
    return new b(paramString, paramSparseArray);
  }
  
  static t d(String paramString, long paramLong) {
    a a;
    d d;
    c c;
    f f;
    j j;
    i i;
    e e;
    n n;
    m m;
    l l;
    h h;
    paramString.hashCode();
    int k = paramString.hashCode();
    byte b1 = -1;
    switch (k) {
      case 92909918:
        if (!paramString.equals("alpha"))
          break; 
        b1 = 11;
        break;
      case 37232917:
        if (!paramString.equals("transitionPathRotate"))
          break; 
        b1 = 10;
        break;
      case -4379043:
        if (!paramString.equals("elevation"))
          break; 
        b1 = 9;
        break;
      case -40300674:
        if (!paramString.equals("rotation"))
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
      case 11:
        a = new a();
        a.g(paramLong);
        return a;
      case 10:
        d = new d();
        d.g(paramLong);
        return d;
      case 9:
        c = new c();
        c.g(paramLong);
        return c;
      case 8:
        f = new f();
        f.g(paramLong);
        return f;
      case 7:
        j = new j();
        j.g(paramLong);
        return j;
      case 6:
        i = new i();
        i.g(paramLong);
        return i;
      case 5:
        e = new e();
        e.g(paramLong);
        return e;
      case 4:
        n = new n();
        n.g(paramLong);
        return n;
      case 3:
        m = new m();
        m.g(paramLong);
        return m;
      case 2:
        l = new l();
        l.g(paramLong);
        return l;
      case 1:
        h = new h();
        h.g(paramLong);
        return h;
      case 0:
        break;
    } 
    g g = new g();
    g.g(paramLong);
    return g;
  }
  
  protected float a(float paramFloat) {
    switch (this.c) {
      default:
        return (float)Math.sin((paramFloat * a));
      case 6:
        paramFloat = 1.0F - Math.abs(paramFloat * 4.0F % 4.0F - 2.0F);
        paramFloat *= paramFloat;
        return 1.0F - paramFloat;
      case 5:
        return (float)Math.cos((paramFloat * a));
      case 4:
        paramFloat = (paramFloat * 2.0F + 1.0F) % 2.0F;
        return 1.0F - paramFloat;
      case 3:
        return (paramFloat * 2.0F + 1.0F) % 2.0F - 1.0F;
      case 2:
        paramFloat = Math.abs(paramFloat);
        return 1.0F - paramFloat;
      case 1:
        break;
    } 
    return Math.signum(paramFloat * a);
  }
  
  public float b(float paramFloat, long paramLong, View paramView, e parame) {
    this.b.e(paramFloat, this.h);
    float[] arrayOfFloat = this.h;
    boolean bool1 = true;
    paramFloat = arrayOfFloat[1];
    if (paramFloat == 0.0F) {
      this.i = false;
      return arrayOfFloat[2];
    } 
    if (Float.isNaN(this.k)) {
      float f = parame.a(paramView, this.g, 0);
      this.k = f;
      if (Float.isNaN(f))
        this.k = 0.0F; 
    } 
    long l = this.j;
    double d1 = this.k;
    double d2 = (paramLong - l);
    Double.isNaN(d2);
    double d3 = paramFloat;
    Double.isNaN(d3);
    Double.isNaN(d1);
    float f1 = (float)((d1 + d2 * 1.0E-9D * d3) % 1.0D);
    this.k = f1;
    parame.b(paramView, this.g, 0, f1);
    this.j = paramLong;
    f1 = this.h[0];
    float f2 = a(this.k);
    float f3 = this.h[2];
    boolean bool2 = bool1;
    if (f1 == 0.0F)
      if (paramFloat != 0.0F) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    this.i = bool2;
    return f2 * f1 + f3;
  }
  
  public void e(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, float paramFloat3) {
    int[] arrayOfInt = this.d;
    int i = this.f;
    arrayOfInt[i] = paramInt1;
    float[][] arrayOfFloat = this.e;
    arrayOfFloat[i][0] = paramFloat1;
    arrayOfFloat[i][1] = paramFloat2;
    arrayOfFloat[i][2] = paramFloat3;
    this.c = Math.max(this.c, paramInt2);
    this.f++;
  }
  
  public abstract boolean f(View paramView, float paramFloat, long paramLong, e parame);
  
  protected void g(long paramLong) {
    this.j = paramLong;
  }
  
  public void h(String paramString) {
    this.g = paramString;
  }
  
  public void i(int paramInt) {
    int i = this.f;
    if (i == 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Error no points added to ");
      stringBuilder.append(this.g);
      Log.e("SplineSet", stringBuilder.toString());
      return;
    } 
    k.a(this.d, this.e, 0, i - 1);
    byte b1 = 1;
    i = 0;
    while (true) {
      int[] arrayOfInt = this.d;
      if (b1 < arrayOfInt.length) {
        int k = i;
        if (arrayOfInt[b1] != arrayOfInt[b1 - 1])
          k = i + 1; 
        b1++;
        i = k;
        continue;
      } 
      int j = i;
      if (i == 0)
        j = 1; 
      double[] arrayOfDouble1 = new double[j];
      double[][] arrayOfDouble = new double[j][3];
      i = 0;
      j = 0;
      while (i < this.f) {
        if (i > 0) {
          int[] arrayOfInt1 = this.d;
          if (arrayOfInt1[i] == arrayOfInt1[i - 1])
            continue; 
        } 
        double d = this.d[i];
        Double.isNaN(d);
        arrayOfDouble1[j] = d * 0.01D;
        double[] arrayOfDouble2 = arrayOfDouble[j];
        float[][] arrayOfFloat = this.e;
        arrayOfDouble2[0] = arrayOfFloat[i][0];
        arrayOfDouble[j][1] = arrayOfFloat[i][1];
        arrayOfDouble[j][2] = arrayOfFloat[i][2];
        j++;
        continue;
        i++;
      } 
      this.b = b.f.a.a.b.a(paramInt, arrayOfDouble1, arrayOfDouble);
      return;
    } 
  }
  
  public String toString() {
    String str = this.g;
    DecimalFormat decimalFormat = new DecimalFormat("##.##");
    for (byte b1 = 0; b1 < this.f; b1++) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append("[");
      stringBuilder.append(this.d[b1]);
      stringBuilder.append(" , ");
      stringBuilder.append(decimalFormat.format(this.e[b1]));
      stringBuilder.append("] ");
      str = stringBuilder.toString();
    } 
    return str;
  }
  
  static class a extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      param1View.setAlpha(b(param1Float, param1Long, param1View, param1e));
      return this.i;
    }
  }
  
  static class b extends t {
    String l;
    
    SparseArray<ConstraintAttribute> m;
    
    SparseArray<float[]> n = new SparseArray();
    
    float[] o;
    
    float[] p;
    
    public b(String param1String, SparseArray<ConstraintAttribute> param1SparseArray) {
      this.l = param1String.split(",")[1];
      this.m = param1SparseArray;
    }
    
    public void e(int param1Int1, float param1Float1, float param1Float2, int param1Int2, float param1Float3) {
      throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }
    
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      this.b.e(param1Float, this.o);
      float[] arrayOfFloat = this.o;
      param1Float = arrayOfFloat[arrayOfFloat.length - 2];
      float f1 = arrayOfFloat[arrayOfFloat.length - 1];
      long l = this.j;
      if (Float.isNaN(this.k)) {
        float f = param1e.a(param1View, this.l, 0);
        this.k = f;
        if (Float.isNaN(f))
          this.k = 0.0F; 
      } 
      double d1 = this.k;
      double d2 = (param1Long - l);
      Double.isNaN(d2);
      double d3 = param1Float;
      Double.isNaN(d3);
      Double.isNaN(d1);
      float f2 = (float)((d1 + d2 * 1.0E-9D * d3) % 1.0D);
      this.k = f2;
      this.j = param1Long;
      f2 = a(f2);
      this.i = false;
      byte b1 = 0;
      while (true) {
        arrayOfFloat = this.p;
        if (b1 < arrayOfFloat.length) {
          boolean bool2;
          boolean bool1 = this.i;
          float[] arrayOfFloat1 = this.o;
          if (arrayOfFloat1[b1] != 0.0D) {
            bool2 = true;
          } else {
            bool2 = false;
          } 
          this.i = bool1 | bool2;
          arrayOfFloat[b1] = arrayOfFloat1[b1] * f2 + f1;
          b1++;
          continue;
        } 
        ((ConstraintAttribute)this.m.valueAt(0)).i(param1View, this.p);
        if (param1Float != 0.0F)
          this.i = true; 
        return this.i;
      } 
    }
    
    public void i(int param1Int) {
      int i = this.m.size();
      int j = ((ConstraintAttribute)this.m.valueAt(0)).f();
      double[] arrayOfDouble = new double[i];
      int k = j + 2;
      this.o = new float[k];
      this.p = new float[j];
      double[][] arrayOfDouble1 = new double[i][k];
      k = 0;
      while (k < i) {
        int m = this.m.keyAt(k);
        ConstraintAttribute constraintAttribute = (ConstraintAttribute)this.m.valueAt(k);
        float[] arrayOfFloat = (float[])this.n.valueAt(k);
        double d = m;
        Double.isNaN(d);
        arrayOfDouble[k] = d * 0.01D;
        constraintAttribute.e(this.o);
        m = 0;
        while (true) {
          float[] arrayOfFloat1 = this.o;
          if (m < arrayOfFloat1.length) {
            arrayOfDouble1[k][m] = arrayOfFloat1[m];
            m++;
            continue;
          } 
          arrayOfDouble1[k][j] = arrayOfFloat[0];
          arrayOfDouble1[k][j + 1] = arrayOfFloat[1];
          k++;
        } 
      } 
      this.b = b.f.a.a.b.a(param1Int, arrayOfDouble, arrayOfDouble1);
    }
    
    public void j(int param1Int1, ConstraintAttribute param1ConstraintAttribute, float param1Float1, int param1Int2, float param1Float2) {
      this.m.append(param1Int1, param1ConstraintAttribute);
      this.n.append(param1Int1, new float[] { param1Float1, param1Float2 });
      this.c = Math.max(this.c, param1Int2);
    }
  }
  
  static class c extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      if (Build.VERSION.SDK_INT >= 21)
        param1View.setElevation(b(param1Float, param1Long, param1View, param1e)); 
      return this.i;
    }
  }
  
  static class d extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      return this.i;
    }
    
    public boolean j(View param1View, e param1e, float param1Float, long param1Long, double param1Double1, double param1Double2) {
      param1View.setRotation(b(param1Float, param1Long, param1View, param1e) + (float)Math.toDegrees(Math.atan2(param1Double2, param1Double1)));
      return this.i;
    }
  }
  
  static class e extends t {
    boolean l = false;
    
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      if (param1View instanceof MotionLayout) {
        ((MotionLayout)param1View).setProgress(b(param1Float, param1Long, param1View, param1e));
      } else {
        if (this.l)
          return false; 
        Method method = null;
        try {
          Method method1 = param1View.getClass().getMethod("setProgress", new Class[] { float.class });
          method = method1;
        } catch (NoSuchMethodException noSuchMethodException) {
          this.l = true;
        } 
        if (method != null)
          try {
            method.invoke(param1View, new Object[] { Float.valueOf(b(param1Float, param1Long, param1View, param1e)) });
          } catch (IllegalAccessException illegalAccessException) {
            Log.e("SplineSet", "unable to setProgress", illegalAccessException);
          } catch (InvocationTargetException invocationTargetException) {
            Log.e("SplineSet", "unable to setProgress", invocationTargetException);
          }  
      } 
      return this.i;
    }
  }
  
  static class f extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      param1View.setRotation(b(param1Float, param1Long, param1View, param1e));
      return this.i;
    }
  }
  
  static class g extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      param1View.setRotationX(b(param1Float, param1Long, param1View, param1e));
      return this.i;
    }
  }
  
  static class h extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      param1View.setRotationY(b(param1Float, param1Long, param1View, param1e));
      return this.i;
    }
  }
  
  static class i extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      param1View.setScaleX(b(param1Float, param1Long, param1View, param1e));
      return this.i;
    }
  }
  
  static class j extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      param1View.setScaleY(b(param1Float, param1Long, param1View, param1e));
      return this.i;
    }
  }
  
  private static class k {
    static void a(int[] param1ArrayOfint, float[][] param1ArrayOffloat, int param1Int1, int param1Int2) {
      int[] arrayOfInt = new int[param1ArrayOfint.length + 10];
      arrayOfInt[0] = param1Int2;
      arrayOfInt[1] = param1Int1;
      param1Int1 = 2;
      while (param1Int1 > 0) {
        int i = arrayOfInt[--param1Int1];
        param1Int2 = param1Int1 - 1;
        int j = arrayOfInt[param1Int2];
        param1Int1 = param1Int2;
        if (i < j) {
          int m = b(param1ArrayOfint, param1ArrayOffloat, i, j);
          param1Int1 = param1Int2 + 1;
          arrayOfInt[param1Int2] = m - 1;
          param1Int2 = param1Int1 + 1;
          arrayOfInt[param1Int1] = i;
          i = param1Int2 + 1;
          arrayOfInt[param1Int2] = j;
          param1Int1 = i + 1;
          arrayOfInt[i] = m + 1;
        } 
      } 
    }
    
    private static int b(int[] param1ArrayOfint, float[][] param1ArrayOffloat, int param1Int1, int param1Int2) {
      int i = param1ArrayOfint[param1Int2];
      int j;
      for (j = param1Int1; param1Int1 < param1Int2; j = m) {
        int m = j;
        if (param1ArrayOfint[param1Int1] <= i) {
          c(param1ArrayOfint, param1ArrayOffloat, j, param1Int1);
          m = j + 1;
        } 
        param1Int1++;
      } 
      c(param1ArrayOfint, param1ArrayOffloat, j, param1Int2);
      return j;
    }
    
    private static void c(int[] param1ArrayOfint, float[][] param1ArrayOffloat, int param1Int1, int param1Int2) {
      int i = param1ArrayOfint[param1Int1];
      param1ArrayOfint[param1Int1] = param1ArrayOfint[param1Int2];
      param1ArrayOfint[param1Int2] = i;
      float[] arrayOfFloat = param1ArrayOffloat[param1Int1];
      param1ArrayOffloat[param1Int1] = param1ArrayOffloat[param1Int2];
      param1ArrayOffloat[param1Int2] = arrayOfFloat;
    }
  }
  
  static class l extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      param1View.setTranslationX(b(param1Float, param1Long, param1View, param1e));
      return this.i;
    }
  }
  
  static class m extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      param1View.setTranslationY(b(param1Float, param1Long, param1View, param1e));
      return this.i;
    }
  }
  
  static class n extends t {
    public boolean f(View param1View, float param1Float, long param1Long, e param1e) {
      if (Build.VERSION.SDK_INT >= 21)
        param1View.setTranslationZ(b(param1Float, param1Long, param1View, param1e)); 
      return this.i;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */