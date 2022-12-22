package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

final class xn implements SensorEventListener {
  private final SensorManager a;
  
  private final Object b;
  
  private final Display c;
  
  private final float[] d;
  
  private final float[] e;
  
  private float[] f;
  
  private Handler g;
  
  private zn h;
  
  xn(Context paramContext) {
    this.a = (SensorManager)paramContext.getSystemService("sensor");
    this.c = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    this.d = new float[9];
    this.e = new float[9];
    this.b = new Object();
  }
  
  private final void e(int paramInt1, int paramInt2) {
    float[] arrayOfFloat = this.e;
    float f = arrayOfFloat[paramInt1];
    arrayOfFloat[paramInt1] = arrayOfFloat[paramInt2];
    arrayOfFloat[paramInt2] = f;
  }
  
  final void a() {
    if (this.g != null)
      return; 
    Sensor sensor = this.a.getDefaultSensor(11);
    if (sensor == null) {
      cm.g("No Sensor of TYPE_ROTATION_VECTOR");
      return;
    } 
    HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
    handlerThread.start();
    xp1 xp1 = new xp1(handlerThread.getLooper());
    this.g = xp1;
    if (!this.a.registerListener(this, sensor, 0, xp1)) {
      cm.g("SensorManager.registerListener failed.");
      b();
    } 
  }
  
  final void b() {
    if (this.g == null)
      return; 
    this.a.unregisterListener(this);
    this.g.post(new ao(this));
    this.g = null;
  }
  
  final void c(zn paramzn) {
    this.h = paramzn;
  }
  
  final boolean d(float[] paramArrayOffloat) {
    synchronized (this.b) {
      float[] arrayOfFloat = this.f;
      if (arrayOfFloat == null)
        return false; 
      System.arraycopy(arrayOfFloat, 0, paramArrayOffloat, 0, arrayOfFloat.length);
      return true;
    } 
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent) {
    float[] arrayOfFloat = paramSensorEvent.values;
    if (arrayOfFloat[0] != 0.0F || arrayOfFloat[1] != 0.0F || arrayOfFloat[2] != 0.0F)
      synchronized (this.b) {
        if (this.f == null)
          this.f = new float[9]; 
        SensorManager.getRotationMatrixFromVector(this.d, arrayOfFloat);
        int i = this.c.getRotation();
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              System.arraycopy(this.d, 0, this.e, 0, 9);
            } else {
              SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
            } 
          } else {
            SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
          } 
        } else {
          SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
        } 
        e(1, 3);
        e(2, 6);
        e(5, 7);
        synchronized (this.b) {
          System.arraycopy(this.e, 0, this.f, 0, 9);
          null = this.h;
          if (null != null)
            null.a(); 
          return;
        } 
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */