package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class s {
  protected b.f.a.a.b a;
  
  protected int[] b = new int[10];
  
  protected float[] c = new float[10];
  
  private int d;
  
  private String e;
  
  static s c(String paramString, SparseArray<ConstraintAttribute> paramSparseArray) {
    return new b(paramString, paramSparseArray);
  }
  
  static s d(String paramString) {
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b1 = -1;
    switch (i) {
      case 156108012:
        if (!paramString.equals("waveOffset"))
          break; 
        b1 = 15;
        break;
      case 92909918:
        if (!paramString.equals("alpha"))
          break; 
        b1 = 14;
        break;
      case 37232917:
        if (!paramString.equals("transitionPathRotate"))
          break; 
        b1 = 13;
        break;
      case -4379043:
        if (!paramString.equals("elevation"))
          break; 
        b1 = 12;
        break;
      case -40300674:
        if (!paramString.equals("rotation"))
          break; 
        b1 = 11;
        break;
      case -760884509:
        if (!paramString.equals("transformPivotY"))
          break; 
        b1 = 10;
        break;
      case -760884510:
        if (!paramString.equals("transformPivotX"))
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
      case 15:
        return new a();
      case 14:
        return new a();
      case 13:
        return new d();
      case 12:
        return new c();
      case 11:
        return new h();
      case 10:
        return new f();
      case 9:
        return new e();
      case 8:
        return new a();
      case 7:
        return new l();
      case 6:
        return new k();
      case 5:
        return new g();
      case 4:
        return new p();
      case 3:
        return new o();
      case 2:
        return new n();
      case 1:
        return new j();
      case 0:
        break;
    } 
    return new i();
  }
  
  public float a(float paramFloat) {
    return (float)this.a.c(paramFloat, 0);
  }
  
  public float b(float paramFloat) {
    return (float)this.a.f(paramFloat, 0);
  }
  
  public void e(int paramInt, float paramFloat) {
    int[] arrayOfInt = this.b;
    if (arrayOfInt.length < this.d + 1) {
      this.b = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
      float[] arrayOfFloat = this.c;
      this.c = Arrays.copyOf(arrayOfFloat, arrayOfFloat.length * 2);
    } 
    arrayOfInt = this.b;
    int i = this.d;
    arrayOfInt[i] = paramInt;
    this.c[i] = paramFloat;
    this.d = i + 1;
  }
  
  public abstract void f(View paramView, float paramFloat);
  
  public void g(String paramString) {
    this.e = paramString;
  }
  
  public void h(int paramInt) {
    int i = this.d;
    if (i == 0)
      return; 
    m.a(this.b, this.c, 0, i - 1);
    byte b1 = 1;
    int j;
    for (j = 1; b1 < this.d; j = i) {
      int[] arrayOfInt = this.b;
      i = j;
      if (arrayOfInt[b1 - 1] != arrayOfInt[b1])
        i = j + 1; 
      b1++;
    } 
    double[] arrayOfDouble1 = new double[j];
    double[][] arrayOfDouble = new double[j][1];
    i = 0;
    j = 0;
    while (i < this.d) {
      if (i > 0) {
        int[] arrayOfInt = this.b;
        if (arrayOfInt[i] == arrayOfInt[i - 1])
          continue; 
      } 
      double d = this.b[i];
      Double.isNaN(d);
      arrayOfDouble1[j] = d * 0.01D;
      arrayOfDouble[j][0] = this.c[i];
      j++;
      continue;
      i++;
    } 
    this.a = b.f.a.a.b.a(paramInt, arrayOfDouble1, arrayOfDouble);
  }
  
  public String toString() {
    String str = this.e;
    DecimalFormat decimalFormat = new DecimalFormat("##.##");
    for (byte b1 = 0; b1 < this.d; b1++) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append("[");
      stringBuilder.append(this.b[b1]);
      stringBuilder.append(" , ");
      stringBuilder.append(decimalFormat.format(this.c[b1]));
      stringBuilder.append("] ");
      str = stringBuilder.toString();
    } 
    return str;
  }
  
  static class a extends s {
    public void f(View param1View, float param1Float) {
      param1View.setAlpha(a(param1Float));
    }
  }
  
  static class b extends s {
    String f;
    
    SparseArray<ConstraintAttribute> g;
    
    float[] h;
    
    public b(String param1String, SparseArray<ConstraintAttribute> param1SparseArray) {
      this.f = param1String.split(",")[1];
      this.g = param1SparseArray;
    }
    
    public void e(int param1Int, float param1Float) {
      throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }
    
    public void f(View param1View, float param1Float) {
      this.a.e(param1Float, this.h);
      ((ConstraintAttribute)this.g.valueAt(0)).i(param1View, this.h);
    }
    
    public void h(int param1Int) {
      int i = this.g.size();
      int j = ((ConstraintAttribute)this.g.valueAt(0)).f();
      double[] arrayOfDouble = new double[i];
      this.h = new float[j];
      double[][] arrayOfDouble1 = new double[i][j];
      j = 0;
      while (j < i) {
        int k = this.g.keyAt(j);
        ConstraintAttribute constraintAttribute = (ConstraintAttribute)this.g.valueAt(j);
        double d = k;
        Double.isNaN(d);
        arrayOfDouble[j] = d * 0.01D;
        constraintAttribute.e(this.h);
        k = 0;
        while (true) {
          float[] arrayOfFloat = this.h;
          if (k < arrayOfFloat.length) {
            arrayOfDouble1[j][k] = arrayOfFloat[k];
            k++;
            continue;
          } 
          j++;
        } 
      } 
      this.a = b.f.a.a.b.a(param1Int, arrayOfDouble, arrayOfDouble1);
    }
    
    public void i(int param1Int, ConstraintAttribute param1ConstraintAttribute) {
      this.g.append(param1Int, param1ConstraintAttribute);
    }
  }
  
  static class c extends s {
    public void f(View param1View, float param1Float) {
      if (Build.VERSION.SDK_INT >= 21)
        param1View.setElevation(a(param1Float)); 
    }
  }
  
  static class d extends s {
    public void f(View param1View, float param1Float) {}
    
    public void i(View param1View, float param1Float, double param1Double1, double param1Double2) {
      param1View.setRotation(a(param1Float) + (float)Math.toDegrees(Math.atan2(param1Double2, param1Double1)));
    }
  }
  
  static class e extends s {
    public void f(View param1View, float param1Float) {
      param1View.setPivotX(a(param1Float));
    }
  }
  
  static class f extends s {
    public void f(View param1View, float param1Float) {
      param1View.setPivotY(a(param1Float));
    }
  }
  
  static class g extends s {
    boolean f = false;
    
    public void f(View param1View, float param1Float) {
      if (param1View instanceof MotionLayout) {
        ((MotionLayout)param1View).setProgress(a(param1Float));
      } else {
        if (this.f)
          return; 
        Method method = null;
        try {
          Method method1 = param1View.getClass().getMethod("setProgress", new Class[] { float.class });
          method = method1;
        } catch (NoSuchMethodException noSuchMethodException) {
          this.f = true;
        } 
        if (method != null)
          try {
            method.invoke(param1View, new Object[] { Float.valueOf(a(param1Float)) });
          } catch (IllegalAccessException illegalAccessException) {
            Log.e("SplineSet", "unable to setProgress", illegalAccessException);
          } catch (InvocationTargetException invocationTargetException) {
            Log.e("SplineSet", "unable to setProgress", invocationTargetException);
          }  
      } 
    }
  }
  
  static class h extends s {
    public void f(View param1View, float param1Float) {
      param1View.setRotation(a(param1Float));
    }
  }
  
  static class i extends s {
    public void f(View param1View, float param1Float) {
      param1View.setRotationX(a(param1Float));
    }
  }
  
  static class j extends s {
    public void f(View param1View, float param1Float) {
      param1View.setRotationY(a(param1Float));
    }
  }
  
  static class k extends s {
    public void f(View param1View, float param1Float) {
      param1View.setScaleX(a(param1Float));
    }
  }
  
  static class l extends s {
    public void f(View param1View, float param1Float) {
      param1View.setScaleY(a(param1Float));
    }
  }
  
  private static class m {
    static void a(int[] param1ArrayOfint, float[] param1ArrayOffloat, int param1Int1, int param1Int2) {
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
          int k = b(param1ArrayOfint, param1ArrayOffloat, i, j);
          int n = param1Int2 + 1;
          arrayOfInt[param1Int2] = k - 1;
          param1Int1 = n + 1;
          arrayOfInt[n] = i;
          param1Int2 = param1Int1 + 1;
          arrayOfInt[param1Int1] = j;
          param1Int1 = param1Int2 + 1;
          arrayOfInt[param1Int2] = k + 1;
        } 
      } 
    }
    
    private static int b(int[] param1ArrayOfint, float[] param1ArrayOffloat, int param1Int1, int param1Int2) {
      int i = param1ArrayOfint[param1Int2];
      int j;
      for (j = param1Int1; param1Int1 < param1Int2; j = k) {
        int k = j;
        if (param1ArrayOfint[param1Int1] <= i) {
          c(param1ArrayOfint, param1ArrayOffloat, j, param1Int1);
          k = j + 1;
        } 
        param1Int1++;
      } 
      c(param1ArrayOfint, param1ArrayOffloat, j, param1Int2);
      return j;
    }
    
    private static void c(int[] param1ArrayOfint, float[] param1ArrayOffloat, int param1Int1, int param1Int2) {
      int i = param1ArrayOfint[param1Int1];
      param1ArrayOfint[param1Int1] = param1ArrayOfint[param1Int2];
      param1ArrayOfint[param1Int2] = i;
      float f = param1ArrayOffloat[param1Int1];
      param1ArrayOffloat[param1Int1] = param1ArrayOffloat[param1Int2];
      param1ArrayOffloat[param1Int2] = f;
    }
  }
  
  static class n extends s {
    public void f(View param1View, float param1Float) {
      param1View.setTranslationX(a(param1Float));
    }
  }
  
  static class o extends s {
    public void f(View param1View, float param1Float) {
      param1View.setTranslationY(a(param1Float));
    }
  }
  
  static class p extends s {
    public void f(View param1View, float param1Float) {
      if (Build.VERSION.SDK_INT >= 21)
        param1View.setTranslationZ(a(param1Float)); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */