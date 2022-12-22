package b.f.a.a;

import android.util.Log;
import java.util.Arrays;

public class c {
  static c a = new c();
  
  public static String[] b = new String[] { "standard", "accelerate", "decelerate", "linear" };
  
  String c = "identity";
  
  public static c c(String paramString) {
    StringBuilder stringBuilder;
    if (paramString == null)
      return null; 
    if (paramString.startsWith("cubic"))
      return new a(paramString); 
    byte b = -1;
    switch (paramString.hashCode()) {
      case 1312628413:
        if (!paramString.equals("standard"))
          break; 
        b = 3;
        break;
      case -1102672091:
        if (!paramString.equals("linear"))
          break; 
        b = 2;
        break;
      case -1263948740:
        if (!paramString.equals("decelerate"))
          break; 
        b = 1;
        break;
      case -1354466595:
        if (!paramString.equals("accelerate"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
        stringBuilder.append(Arrays.toString((Object[])b));
        Log.e("ConstraintSet", stringBuilder.toString());
        return a;
      case 3:
        return new a("cubic(0.4, 0.0, 0.2, 1)");
      case 2:
        return new a("cubic(1, 1, 0, 0)");
      case 1:
        return new a("cubic(0.0, 0.0, 0.2, 0.95)");
      case 0:
        break;
    } 
    return new a("cubic(0.4, 0.05, 0.8, 0.7)");
  }
  
  public double a(double paramDouble) {
    return paramDouble;
  }
  
  public double b(double paramDouble) {
    return 1.0D;
  }
  
  public String toString() {
    return this.c;
  }
  
  static class a extends c {
    private static double d = 0.01D;
    
    private static double e = 1.0E-4D;
    
    double f;
    
    double g;
    
    double h;
    
    double i;
    
    a(String param1String) {
      this.c = param1String;
      int i = param1String.indexOf('(');
      int j = param1String.indexOf(',', i);
      this.f = Double.parseDouble(param1String.substring(i + 1, j).trim());
      i = param1String.indexOf(',', ++j);
      this.g = Double.parseDouble(param1String.substring(j, i).trim());
      j = param1String.indexOf(',', ++i);
      this.h = Double.parseDouble(param1String.substring(i, j).trim());
      i = j + 1;
      this.i = Double.parseDouble(param1String.substring(i, param1String.indexOf(')', i)).trim());
    }
    
    private double d(double param1Double) {
      double d1 = 1.0D - param1Double;
      double d2 = 3.0D * d1;
      return this.f * d1 * d2 * param1Double + this.h * d2 * param1Double * param1Double + param1Double * param1Double * param1Double;
    }
    
    private double e(double param1Double) {
      double d1 = 1.0D - param1Double;
      double d2 = 3.0D * d1;
      return this.g * d1 * d2 * param1Double + this.i * d2 * param1Double * param1Double + param1Double * param1Double * param1Double;
    }
    
    public double a(double param1Double) {
      if (param1Double <= 0.0D)
        return 0.0D; 
      if (param1Double >= 1.0D)
        return 1.0D; 
      double d1 = 0.5D;
      double d2;
      for (d2 = d1; d1 > d; d2 -= d1) {
        double d = d(d2);
        d1 *= 0.5D;
        if (d < param1Double) {
          d2 += d1;
          continue;
        } 
      } 
      double d4 = d2 - d1;
      double d3 = d(d4);
      d2 += d1;
      d1 = d(d2);
      d4 = e(d4);
      return (e(d2) - d4) * (param1Double - d3) / (d1 - d3) + d4;
    }
    
    public double b(double param1Double) {
      double d1 = 0.5D;
      double d2;
      for (d2 = d1; d1 > e; d2 -= d1) {
        double d = d(d2);
        d1 *= 0.5D;
        if (d < param1Double) {
          d2 += d1;
          continue;
        } 
      } 
      double d3 = d2 - d1;
      param1Double = d(d3);
      d1 = d2 + d1;
      d2 = d(d1);
      d3 = e(d3);
      return (e(d1) - d3) / (d2 - param1Double);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/f/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */