package com.google.android.exoplayer2.video.r;

import com.google.android.exoplayer2.util.e;

public final class d {
  public final a a;
  
  public final a b;
  
  public final int c;
  
  public final boolean d;
  
  public d(a parama, int paramInt) {
    this(parama, parama, paramInt);
  }
  
  public d(a parama1, a parama2, int paramInt) {
    boolean bool;
    this.a = parama1;
    this.b = parama2;
    this.c = paramInt;
    if (parama1 == parama2) {
      bool = true;
    } else {
      bool = false;
    } 
    this.d = bool;
  }
  
  public static d a(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, float paramFloat3, int paramInt3) {
    boolean bool;
    int i = paramInt1;
    int j = paramInt2;
    if (paramFloat1 > 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    if (i >= 1) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    if (j >= 1) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    if (paramFloat2 > 0.0F && paramFloat2 <= 180.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    if (paramFloat3 > 0.0F && paramFloat3 <= 360.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    float f1 = (float)Math.toRadians(paramFloat2);
    float f2 = (float)Math.toRadians(paramFloat3);
    float f3 = f1 / i;
    float f4 = f2 / j;
    int k = j + 1;
    i = (k * 2 + 2) * i;
    float[] arrayOfFloat1 = new float[i * 3];
    float[] arrayOfFloat2 = new float[i * 2];
    i = 0;
    int m = 0;
    int n = 0;
    while (i < paramInt1) {
      paramFloat3 = i;
      paramFloat2 = f1 / 2.0F;
      paramFloat3 = paramFloat3 * f3 - paramFloat2;
      int i1 = i + 1;
      paramFloat2 = i1 * f3 - paramFloat2;
      int i2 = 0;
      int i3 = i;
      i = i1;
      while (i2 < k) {
        byte b = 0;
        i1 = i2;
        while (b < 2) {
          float f5;
          if (b == 0) {
            f5 = paramFloat3;
          } else {
            f5 = paramFloat2;
          } 
          float f6 = i1 * f4;
          float f7 = f2 / 2.0F;
          j = m + 1;
          double d1 = paramFloat1;
          double d2 = (f6 + 3.1415927F - f7);
          double d3 = Math.sin(d2);
          Double.isNaN(d1);
          double d4 = f5;
          arrayOfFloat1[m] = -((float)(d3 * d1 * Math.cos(d4)));
          i2 = j + 1;
          d3 = Math.sin(d4);
          Double.isNaN(d1);
          arrayOfFloat1[j] = (float)(d1 * d3);
          j = i2 + 1;
          d2 = Math.cos(d2);
          Double.isNaN(d1);
          arrayOfFloat1[i2] = (float)(d1 * d2 * Math.cos(d4));
          m = n + 1;
          arrayOfFloat2[n] = f6 / f2;
          i2 = m + 1;
          arrayOfFloat2[m] = (i3 + b) * f3 / f1;
          if ((i1 == 0 && b == 0) || (i1 == paramInt2 && b == 1)) {
            System.arraycopy(arrayOfFloat1, j - 3, arrayOfFloat1, j, 3);
            j += 3;
            float[] arrayOfFloat = arrayOfFloat2;
            System.arraycopy(arrayOfFloat, i2 - 2, arrayOfFloat, i2, 2);
            i2 += 2;
          } 
          m = j;
          b++;
          j = paramInt2;
          n = i2;
        } 
        i2 = i1 + 1;
      } 
    } 
    return new d(new a(new b[] { new b(0, arrayOfFloat1, arrayOfFloat2, 1) }), paramInt3);
  }
  
  public static d b(int paramInt) {
    return a(50.0F, 36, 72, 180.0F, 360.0F, paramInt);
  }
  
  public static final class a {
    private final d.b[] a;
    
    public a(d.b... param1VarArgs) {
      this.a = param1VarArgs;
    }
    
    public d.b a(int param1Int) {
      return this.a[param1Int];
    }
    
    public int b() {
      return this.a.length;
    }
  }
  
  public static final class b {
    public final int a;
    
    public final int b;
    
    public final float[] c;
    
    public final float[] d;
    
    public b(int param1Int1, float[] param1ArrayOffloat1, float[] param1ArrayOffloat2, int param1Int2) {
      boolean bool;
      this.a = param1Int1;
      if (param1ArrayOffloat1.length * 2L == param1ArrayOffloat2.length * 3L) {
        bool = true;
      } else {
        bool = false;
      } 
      e.a(bool);
      this.c = param1ArrayOffloat1;
      this.d = param1ArrayOffloat2;
      this.b = param1Int2;
    }
    
    public int a() {
      return this.c.length / 3;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/r/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */