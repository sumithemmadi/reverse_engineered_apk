package com.google.android.exoplayer2.video.r;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.d0;

public final class c {
  private final float[] a = new float[16];
  
  private final float[] b = new float[16];
  
  private final d0<float[]> c = new d0();
  
  private boolean d;
  
  public static void a(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    Matrix.setIdentityM(paramArrayOffloat1, 0);
    float f = (float)Math.sqrt((paramArrayOffloat2[10] * paramArrayOffloat2[10] + paramArrayOffloat2[8] * paramArrayOffloat2[8]));
    paramArrayOffloat1[0] = paramArrayOffloat2[10] / f;
    paramArrayOffloat1[2] = paramArrayOffloat2[8] / f;
    paramArrayOffloat1[8] = -paramArrayOffloat2[8] / f;
    paramArrayOffloat1[10] = paramArrayOffloat2[10] / f;
  }
  
  private static void b(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    float f1 = paramArrayOffloat2[0];
    float f2 = -paramArrayOffloat2[1];
    float f3 = -paramArrayOffloat2[2];
    float f4 = Matrix.length(f1, f2, f3);
    if (f4 != 0.0F) {
      Matrix.setRotateM(paramArrayOffloat1, 0, (float)Math.toDegrees(f4), f1 / f4, f2 / f4, f3 / f4);
    } else {
      Matrix.setIdentityM(paramArrayOffloat1, 0);
    } 
  }
  
  public boolean c(float[] paramArrayOffloat, long paramLong) {
    float[] arrayOfFloat = (float[])this.c.i(paramLong);
    if (arrayOfFloat == null)
      return false; 
    b(this.b, arrayOfFloat);
    if (!this.d) {
      a(this.a, this.b);
      this.d = true;
    } 
    Matrix.multiplyMM(paramArrayOffloat, 0, this.a, 0, this.b, 0);
    return true;
  }
  
  public void d() {
    this.c.c();
    this.d = false;
  }
  
  public void e(long paramLong, float[] paramArrayOffloat) {
    this.c.a(paramLong, paramArrayOffloat);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/r/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */