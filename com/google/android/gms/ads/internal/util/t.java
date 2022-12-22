package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

public final class t {
  private final String[] a;
  
  private final double[] b;
  
  private final double[] c;
  
  private final int[] d;
  
  private int e;
  
  private t(u paramu) {
    int i = u.b(paramu).size();
    this.a = (String[])u.c(paramu).toArray((Object[])new String[i]);
    this.b = b(u.b(paramu));
    this.c = b(u.d(paramu));
    this.d = new int[i];
    this.e = 0;
  }
  
  private static double[] b(List<Double> paramList) {
    int i = paramList.size();
    double[] arrayOfDouble = new double[i];
    for (byte b = 0; b < i; b++)
      arrayOfDouble[b] = ((Double)paramList.get(b)).doubleValue(); 
    return arrayOfDouble;
  }
  
  public final void a(double paramDouble) {
    this.e++;
    byte b = 0;
    while (true) {
      double[] arrayOfDouble = this.c;
      if (b < arrayOfDouble.length) {
        if (arrayOfDouble[b] <= paramDouble && paramDouble < this.b[b]) {
          int[] arrayOfInt = this.d;
          arrayOfInt[b] = arrayOfInt[b] + 1;
        } 
        if (paramDouble >= arrayOfDouble[b]) {
          b++;
          continue;
        } 
      } 
      break;
    } 
  }
  
  public final List<v> c() {
    ArrayList<v> arrayList = new ArrayList(this.a.length);
    byte b = 0;
    while (true) {
      String[] arrayOfString = this.a;
      if (b < arrayOfString.length) {
        String str = arrayOfString[b];
        double d1 = this.c[b];
        double d2 = this.b[b];
        int[] arrayOfInt = this.d;
        double d3 = arrayOfInt[b];
        double d4 = this.e;
        Double.isNaN(d3);
        Double.isNaN(d4);
        arrayList.add(new v(str, d1, d2, d3 / d4, arrayOfInt[b]));
        b++;
        continue;
      } 
      return arrayList;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */