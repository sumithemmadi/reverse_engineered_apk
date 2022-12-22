package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class u82 {
  public static final u82 a = new u82(1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
  
  private static final u82 b = new u82(0.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
  
  private static final u82 c = new u82(-1.0D, 0.0D, 0.0D, -1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
  
  private static final u82 d = new u82(0.0D, -1.0D, 1.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
  
  private final double e;
  
  private final double f;
  
  private final double g;
  
  private final double h;
  
  private final double i;
  
  private final double j;
  
  private final double k;
  
  private final double l;
  
  private final double m;
  
  private u82(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9) {
    this.e = paramDouble5;
    this.f = paramDouble6;
    this.g = paramDouble7;
    this.h = paramDouble1;
    this.i = paramDouble2;
    this.j = paramDouble3;
    this.k = paramDouble4;
    this.l = paramDouble8;
    this.m = paramDouble9;
  }
  
  public static u82 a(ByteBuffer paramByteBuffer) {
    double d1 = x10.e(paramByteBuffer);
    double d2 = x10.e(paramByteBuffer);
    double d3 = x10.f(paramByteBuffer);
    double d4 = x10.e(paramByteBuffer);
    double d5 = x10.e(paramByteBuffer);
    double d6 = x10.f(paramByteBuffer);
    double d7 = x10.e(paramByteBuffer);
    double d8 = x10.e(paramByteBuffer);
    return new u82(d1, d2, d4, d5, d3, d6, x10.f(paramByteBuffer), d7, d8);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || u82.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return (Double.compare(((u82)paramObject).h, this.h) != 0) ? false : ((Double.compare(((u82)paramObject).i, this.i) != 0) ? false : ((Double.compare(((u82)paramObject).j, this.j) != 0) ? false : ((Double.compare(((u82)paramObject).k, this.k) != 0) ? false : ((Double.compare(((u82)paramObject).l, this.l) != 0) ? false : ((Double.compare(((u82)paramObject).m, this.m) != 0) ? false : ((Double.compare(((u82)paramObject).e, this.e) != 0) ? false : ((Double.compare(((u82)paramObject).f, this.f) != 0) ? false : (!(Double.compare(((u82)paramObject).g, this.g) != 0)))))))));
  }
  
  public final int hashCode() {
    long l = Double.doubleToLongBits(this.e);
    int i = (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.f);
    int j = (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.g);
    int k = (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.h);
    int m = (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.i);
    int n = (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.j);
    int i1 = (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.k);
    int i2 = (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.l);
    int i3 = (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.m);
    return (((((((i * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + (int)(l ^ l >>> 32L);
  }
  
  public final String toString() {
    if (equals(a))
      return "Rotate 0°"; 
    if (equals(b))
      return "Rotate 90°"; 
    if (equals(c))
      return "Rotate 180°"; 
    if (equals(d))
      return "Rotate 270°"; 
    double d1 = this.e;
    double d2 = this.f;
    double d3 = this.g;
    double d4 = this.h;
    double d5 = this.i;
    double d6 = this.j;
    double d7 = this.k;
    double d8 = this.l;
    double d9 = this.m;
    StringBuilder stringBuilder = new StringBuilder(260);
    stringBuilder.append("Matrix{u=");
    stringBuilder.append(d1);
    stringBuilder.append(", v=");
    stringBuilder.append(d2);
    stringBuilder.append(", w=");
    stringBuilder.append(d3);
    stringBuilder.append(", a=");
    stringBuilder.append(d4);
    stringBuilder.append(", b=");
    stringBuilder.append(d5);
    stringBuilder.append(", c=");
    stringBuilder.append(d6);
    stringBuilder.append(", d=");
    stringBuilder.append(d7);
    stringBuilder.append(", tx=");
    stringBuilder.append(d8);
    stringBuilder.append(", ty=");
    stringBuilder.append(d9);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */