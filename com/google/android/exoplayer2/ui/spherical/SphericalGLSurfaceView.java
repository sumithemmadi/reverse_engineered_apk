package com.google.android.exoplayer2.ui.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class SphericalGLSurfaceView extends GLSurfaceView {
  private final SensorManager b;
  
  private final Sensor c;
  
  private final d d;
  
  private final Handler e;
  
  private final h f;
  
  private final f g;
  
  private SurfaceTexture h;
  
  private Surface i;
  
  private o0.c j;
  
  public SphericalGLSurfaceView(Context paramContext) {
    this(paramContext, null);
  }
  
  public SphericalGLSurfaceView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    Sensor sensor;
    this.e = new Handler(Looper.getMainLooper());
    SensorManager sensorManager = (SensorManager)e.e(paramContext.getSystemService("sensor"));
    this.b = sensorManager;
    if (h0.a >= 18) {
      Sensor sensor1 = sensorManager.getDefaultSensor(15);
    } else {
      paramAttributeSet = null;
    } 
    AttributeSet attributeSet = paramAttributeSet;
    if (paramAttributeSet == null)
      sensor = sensorManager.getDefaultSensor(11); 
    this.c = sensor;
    f f1 = new f();
    this.g = f1;
    a a = new a(this, f1);
    h h1 = new h(paramContext, a, 25.0F);
    this.f = h1;
    this.d = new d(((WindowManager)e.e(paramContext.getSystemService("window"))).getDefaultDisplay(), new d.a[] { h1, a });
    setEGLContextClientVersion(2);
    setRenderer(a);
    setOnTouchListener(h1);
  }
  
  private void f(SurfaceTexture paramSurfaceTexture) {
    this.e.post(new c(this, paramSurfaceTexture));
  }
  
  private static void g(SurfaceTexture paramSurfaceTexture, Surface paramSurface) {
    if (paramSurfaceTexture != null)
      paramSurfaceTexture.release(); 
    if (paramSurface != null)
      paramSurface.release(); 
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.e.post(new b(this));
  }
  
  public void onPause() {
    if (this.c != null)
      this.b.unregisterListener(this.d); 
    super.onPause();
  }
  
  public void onResume() {
    super.onResume();
    Sensor sensor = this.c;
    if (sensor != null)
      this.b.registerListener(this.d, sensor, 0); 
  }
  
  public void setDefaultStereoMode(int paramInt) {
    this.g.h(paramInt);
  }
  
  public void setSingleTapListener(g paramg) {
    this.f.b(paramg);
  }
  
  public void setVideoComponent(o0.c paramc) {
    o0.c c1 = this.j;
    if (paramc == c1)
      return; 
    if (c1 != null) {
      Surface surface = this.i;
      if (surface != null)
        c1.d(surface); 
      this.j.k(this.g);
      this.j.e(this.g);
    } 
    this.j = paramc;
    if (paramc != null) {
      paramc.c(this.g);
      this.j.b(this.g);
      this.j.a(this.i);
    } 
  }
  
  class a implements GLSurfaceView.Renderer, h.a, d.a {
    private final f b;
    
    private final float[] c = new float[16];
    
    private final float[] d = new float[16];
    
    private final float[] e;
    
    private final float[] f;
    
    private final float[] g;
    
    private float h;
    
    private float i;
    
    private final float[] j;
    
    private final float[] k;
    
    public a(SphericalGLSurfaceView this$0, f param1f) {
      float[] arrayOfFloat1 = new float[16];
      this.e = arrayOfFloat1;
      float[] arrayOfFloat2 = new float[16];
      this.f = arrayOfFloat2;
      float[] arrayOfFloat3 = new float[16];
      this.g = arrayOfFloat3;
      this.j = new float[16];
      this.k = new float[16];
      this.b = param1f;
      Matrix.setIdentityM(arrayOfFloat1, 0);
      Matrix.setIdentityM(arrayOfFloat2, 0);
      Matrix.setIdentityM(arrayOfFloat3, 0);
      this.i = 3.1415927F;
    }
    
    private float c(float param1Float) {
      boolean bool;
      if (param1Float > 1.0F) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        double d1 = Math.tan(Math.toRadians(45.0D));
        double d2 = param1Float;
        Double.isNaN(d2);
        return (float)(Math.toDegrees(Math.atan(d1 / d2)) * 2.0D);
      } 
      return 90.0F;
    }
    
    private void d() {
      Matrix.setRotateM(this.f, 0, -this.h, (float)Math.cos(this.i), (float)Math.sin(this.i), 0.0F);
    }
    
    public void a(float[] param1ArrayOffloat, float param1Float) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield e : [F
      //   6: astore_3
      //   7: aload_1
      //   8: iconst_0
      //   9: aload_3
      //   10: iconst_0
      //   11: aload_3
      //   12: arraylength
      //   13: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
      //   16: aload_0
      //   17: fload_2
      //   18: fneg
      //   19: putfield i : F
      //   22: aload_0
      //   23: invokespecial d : ()V
      //   26: aload_0
      //   27: monitorexit
      //   28: return
      //   29: astore_1
      //   30: aload_0
      //   31: monitorexit
      //   32: aload_1
      //   33: athrow
      // Exception table:
      //   from	to	target	type
      //   2	26	29	finally
    }
    
    public void b(PointF param1PointF) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: aload_1
      //   4: getfield y : F
      //   7: putfield h : F
      //   10: aload_0
      //   11: invokespecial d : ()V
      //   14: aload_0
      //   15: getfield g : [F
      //   18: iconst_0
      //   19: aload_1
      //   20: getfield x : F
      //   23: fneg
      //   24: fconst_0
      //   25: fconst_1
      //   26: fconst_0
      //   27: invokestatic setRotateM : ([FIFFFF)V
      //   30: aload_0
      //   31: monitorexit
      //   32: return
      //   33: astore_1
      //   34: aload_0
      //   35: monitorexit
      //   36: aload_1
      //   37: athrow
      // Exception table:
      //   from	to	target	type
      //   2	30	33	finally
    }
    
    public void onDrawFrame(GL10 param1GL10) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield k : [F
      //   6: iconst_0
      //   7: aload_0
      //   8: getfield e : [F
      //   11: iconst_0
      //   12: aload_0
      //   13: getfield g : [F
      //   16: iconst_0
      //   17: invokestatic multiplyMM : ([FI[FI[FI)V
      //   20: aload_0
      //   21: getfield j : [F
      //   24: iconst_0
      //   25: aload_0
      //   26: getfield f : [F
      //   29: iconst_0
      //   30: aload_0
      //   31: getfield k : [F
      //   34: iconst_0
      //   35: invokestatic multiplyMM : ([FI[FI[FI)V
      //   38: aload_0
      //   39: monitorexit
      //   40: aload_0
      //   41: getfield d : [F
      //   44: iconst_0
      //   45: aload_0
      //   46: getfield c : [F
      //   49: iconst_0
      //   50: aload_0
      //   51: getfield j : [F
      //   54: iconst_0
      //   55: invokestatic multiplyMM : ([FI[FI[FI)V
      //   58: aload_0
      //   59: getfield b : Lcom/google/android/exoplayer2/ui/spherical/f;
      //   62: aload_0
      //   63: getfield d : [F
      //   66: iconst_0
      //   67: invokevirtual d : ([FZ)V
      //   70: return
      //   71: astore_1
      //   72: aload_0
      //   73: monitorexit
      //   74: aload_1
      //   75: athrow
      // Exception table:
      //   from	to	target	type
      //   2	40	71	finally
      //   72	74	71	finally
    }
    
    public void onSurfaceChanged(GL10 param1GL10, int param1Int1, int param1Int2) {
      GLES20.glViewport(0, 0, param1Int1, param1Int2);
      float f1 = param1Int1 / param1Int2;
      float f2 = c(f1);
      Matrix.perspectiveM(this.c, 0, f2, f1, 0.1F, 100.0F);
    }
    
    public void onSurfaceCreated(GL10 param1GL10, EGLConfig param1EGLConfig) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield l : Lcom/google/android/exoplayer2/ui/spherical/SphericalGLSurfaceView;
      //   6: aload_0
      //   7: getfield b : Lcom/google/android/exoplayer2/ui/spherical/f;
      //   10: invokevirtual e : ()Landroid/graphics/SurfaceTexture;
      //   13: invokestatic a : (Lcom/google/android/exoplayer2/ui/spherical/SphericalGLSurfaceView;Landroid/graphics/SurfaceTexture;)V
      //   16: aload_0
      //   17: monitorexit
      //   18: return
      //   19: astore_1
      //   20: aload_0
      //   21: monitorexit
      //   22: aload_1
      //   23: athrow
      // Exception table:
      //   from	to	target	type
      //   2	16	19	finally
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/spherical/SphericalGLSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */