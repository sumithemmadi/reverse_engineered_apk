package com.google.android.exoplayer2.ui.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.google.android.exoplayer2.video.r.c;

final class d implements SensorEventListener {
  private final float[] a = new float[16];
  
  private final float[] b = new float[16];
  
  private final float[] c = new float[16];
  
  private final float[] d = new float[3];
  
  private final Display e;
  
  private final a[] f;
  
  private boolean g;
  
  public d(Display paramDisplay, a... paramVarArgs) {
    this.e = paramDisplay;
    this.f = paramVarArgs;
  }
  
  private float a(float[] paramArrayOffloat) {
    SensorManager.remapCoordinateSystem(paramArrayOffloat, 1, 131, this.b);
    SensorManager.getOrientation(this.b, this.d);
    return this.d[2];
  }
  
  private void b(float[] paramArrayOffloat, float paramFloat) {
    a[] arrayOfA = this.f;
    int i = arrayOfA.length;
    for (byte b = 0; b < i; b++)
      arrayOfA[b].a(paramArrayOffloat, paramFloat); 
  }
  
  private void c(float[] paramArrayOffloat) {
    if (!this.g) {
      c.a(this.c, paramArrayOffloat);
      this.g = true;
    } 
    float[] arrayOfFloat = this.b;
    System.arraycopy(paramArrayOffloat, 0, arrayOfFloat, 0, arrayOfFloat.length);
    Matrix.multiplyMM(paramArrayOffloat, 0, this.b, 0, this.c, 0);
  }
  
  private void d(float[] paramArrayOffloat, int paramInt) {
    if (paramInt != 0) {
      char c1 = '';
      char c2 = '';
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt == 3) {
            c2 = '\001';
            paramInt = c1;
            c1 = c2;
          } else {
            throw new IllegalStateException();
          } 
        } else {
          paramInt = 129;
          c1 = '';
        } 
      } else {
        paramInt = 2;
        c1 = c2;
      } 
      float[] arrayOfFloat = this.b;
      System.arraycopy(paramArrayOffloat, 0, arrayOfFloat, 0, arrayOfFloat.length);
      SensorManager.remapCoordinateSystem(this.b, paramInt, c1, paramArrayOffloat);
    } 
  }
  
  private static void e(float[] paramArrayOffloat) {
    Matrix.rotateM(paramArrayOffloat, 0, 90.0F, 1.0F, 0.0F, 0.0F);
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent) {
    SensorManager.getRotationMatrixFromVector(this.a, paramSensorEvent.values);
    d(this.a, this.e.getRotation());
    float f = a(this.a);
    e(this.a);
    c(this.a);
    b(this.a, f);
  }
  
  public static interface a {
    void a(float[] param1ArrayOffloat, float param1Float);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/spherical/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */