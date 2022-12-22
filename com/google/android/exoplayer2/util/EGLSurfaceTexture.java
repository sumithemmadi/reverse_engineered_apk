package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

@TargetApi(17)
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
  private static final int[] b = new int[] { 
      12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
      12325, 0, 12327, 12344, 12339, 4, 12344 };
  
  private final Handler c;
  
  private final int[] d;
  
  private final b e;
  
  private EGLDisplay f;
  
  private EGLContext g;
  
  private EGLSurface h;
  
  private SurfaceTexture i;
  
  public EGLSurfaceTexture(Handler paramHandler) {
    this(paramHandler, null);
  }
  
  public EGLSurfaceTexture(Handler paramHandler, b paramb) {
    this.c = paramHandler;
    this.e = paramb;
    this.d = new int[1];
  }
  
  private static EGLConfig a(EGLDisplay paramEGLDisplay) {
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
    int[] arrayOfInt = new int[1];
    boolean bool = EGL14.eglChooseConfig(paramEGLDisplay, b, 0, arrayOfEGLConfig, 0, 1, arrayOfInt, 0);
    if (bool && arrayOfInt[0] > 0 && arrayOfEGLConfig[0] != null)
      return arrayOfEGLConfig[0]; 
    throw new GlException(h0.u("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(arrayOfInt[0]), arrayOfEGLConfig[0] }), null);
  }
  
  private static EGLContext b(EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt) {
    int[] arrayOfInt;
    if (paramInt == 0) {
      arrayOfInt = new int[3];
      arrayOfInt[0] = 12440;
      arrayOfInt[1] = 2;
      arrayOfInt[2] = 12344;
    } else {
      arrayOfInt = new int[5];
      arrayOfInt[0] = 12440;
      arrayOfInt[1] = 2;
      arrayOfInt[2] = 12992;
      arrayOfInt[3] = 1;
      arrayOfInt[4] = 12344;
    } 
    EGLContext eGLContext = EGL14.eglCreateContext(paramEGLDisplay, paramEGLConfig, EGL14.EGL_NO_CONTEXT, arrayOfInt, 0);
    if (eGLContext != null)
      return eGLContext; 
    throw new GlException("eglCreateContext failed", null);
  }
  
  private static EGLSurface c(EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, EGLContext paramEGLContext, int paramInt) {
    EGLSurface eGLSurface;
    if (paramInt == 1) {
      eGLSurface = EGL14.EGL_NO_SURFACE;
    } else {
      int[] arrayOfInt;
      if (paramInt == 2) {
        arrayOfInt = new int[7];
        arrayOfInt[0] = 12375;
        arrayOfInt[1] = 1;
        arrayOfInt[2] = 12374;
        arrayOfInt[3] = 1;
        arrayOfInt[4] = 12992;
        arrayOfInt[5] = 1;
        arrayOfInt[6] = 12344;
      } else {
        arrayOfInt = new int[5];
        arrayOfInt[0] = 12375;
        arrayOfInt[1] = 1;
        arrayOfInt[2] = 12374;
        arrayOfInt[3] = 1;
        arrayOfInt[4] = 12344;
      } 
      eGLSurface = EGL14.eglCreatePbufferSurface(paramEGLDisplay, (EGLConfig)eGLSurface, arrayOfInt, 0);
      if (eGLSurface == null)
        throw new GlException("eglCreatePbufferSurface failed", null); 
    } 
    if (EGL14.eglMakeCurrent(paramEGLDisplay, eGLSurface, eGLSurface, paramEGLContext))
      return eGLSurface; 
    throw new GlException("eglMakeCurrent failed", null);
  }
  
  private void d() {
    b b1 = this.e;
    if (b1 != null)
      b1.a(); 
  }
  
  private static void e(int[] paramArrayOfint) {
    GLES20.glGenTextures(1, paramArrayOfint, 0);
    m.b();
  }
  
  private static EGLDisplay f() {
    EGLDisplay eGLDisplay = EGL14.eglGetDisplay(0);
    if (eGLDisplay != null) {
      int[] arrayOfInt = new int[2];
      if (EGL14.eglInitialize(eGLDisplay, arrayOfInt, 0, arrayOfInt, 1))
        return eGLDisplay; 
      throw new GlException("eglInitialize failed", null);
    } 
    throw new GlException("eglGetDisplay failed", null);
  }
  
  public SurfaceTexture g() {
    return e.<SurfaceTexture>e(this.i);
  }
  
  public void h(int paramInt) {
    EGLDisplay eGLDisplay = f();
    this.f = eGLDisplay;
    EGLConfig eGLConfig = a(eGLDisplay);
    EGLContext eGLContext = b(this.f, eGLConfig, paramInt);
    this.g = eGLContext;
    this.h = c(this.f, eGLConfig, eGLContext, paramInt);
    e(this.d);
    SurfaceTexture surfaceTexture = new SurfaceTexture(this.d[0]);
    this.i = surfaceTexture;
    surfaceTexture.setOnFrameAvailableListener(this);
  }
  
  public void i() {
    this.c.removeCallbacks(this);
    try {
      SurfaceTexture surfaceTexture = this.i;
      if (surfaceTexture != null) {
        surfaceTexture.release();
        GLES20.glDeleteTextures(1, this.d, 0);
      } 
      return;
    } finally {
      EGLDisplay eGLDisplay2 = this.f;
      if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
        eGLDisplay2 = this.f;
        EGLSurface eGLSurface1 = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface1, eGLSurface1, EGL14.EGL_NO_CONTEXT);
      } 
      EGLSurface eGLSurface = this.h;
      if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE))
        EGL14.eglDestroySurface(this.f, this.h); 
      EGLContext eGLContext = this.g;
      if (eGLContext != null)
        EGL14.eglDestroyContext(this.f, eGLContext); 
      if (h0.a >= 19)
        EGL14.eglReleaseThread(); 
      EGLDisplay eGLDisplay1 = this.f;
      if (eGLDisplay1 != null && !eGLDisplay1.equals(EGL14.EGL_NO_DISPLAY))
        EGL14.eglTerminate(this.f); 
      this.f = null;
      this.g = null;
      this.h = null;
      this.i = null;
    } 
  }
  
  public void onFrameAvailable(SurfaceTexture paramSurfaceTexture) {
    this.c.post(this);
  }
  
  public void run() {
    d();
    SurfaceTexture surfaceTexture = this.i;
    if (surfaceTexture != null)
      try {
        surfaceTexture.updateTexImage();
      } catch (RuntimeException runtimeException) {} 
  }
  
  public static final class GlException extends RuntimeException {
    private GlException(String param1String) {
      super(param1String);
    }
  }
  
  public static interface b {
    void a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/EGLSurfaceTexture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */