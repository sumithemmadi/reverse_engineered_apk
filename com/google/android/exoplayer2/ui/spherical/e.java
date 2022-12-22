package com.google.android.exoplayer2.ui.spherical;

import android.opengl.GLES20;
import com.google.android.exoplayer2.util.m;
import com.google.android.exoplayer2.video.r.d;
import java.nio.FloatBuffer;

final class e {
  private static final String[] a = new String[] { "uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}" };
  
  private static final String[] b = new String[] { "#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}" };
  
  private static final float[] c = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F };
  
  private static final float[] d = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 1.0F };
  
  private static final float[] e = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F };
  
  private static final float[] f = new float[] { 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F };
  
  private static final float[] g = new float[] { 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 1.0F, 1.0F };
  
  private int h;
  
  private a i;
  
  private a j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  public static boolean c(d paramd) {
    d.a a2 = paramd.a;
    d.a a1 = paramd.b;
    int i = a2.b();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i == 1) {
      bool2 = bool1;
      if ((a2.a(0)).a == 0) {
        bool2 = bool1;
        if (a1.b() == 1) {
          bool2 = bool1;
          if ((a1.a(0)).a == 0)
            bool2 = true; 
        } 
      } 
    } 
    return bool2;
  }
  
  void a(int paramInt, float[] paramArrayOffloat, boolean paramBoolean) {
    a a1;
    float[] arrayOfFloat;
    if (paramBoolean) {
      a1 = this.j;
    } else {
      a1 = this.i;
    } 
    if (a1 == null)
      return; 
    GLES20.glUseProgram(this.k);
    m.b();
    GLES20.glEnableVertexAttribArray(this.n);
    GLES20.glEnableVertexAttribArray(this.o);
    m.b();
    int i = this.h;
    if (i == 1) {
      if (paramBoolean) {
        arrayOfFloat = e;
      } else {
        arrayOfFloat = d;
      } 
    } else if (i == 2) {
      if (paramBoolean) {
        arrayOfFloat = g;
      } else {
        arrayOfFloat = f;
      } 
    } else {
      arrayOfFloat = c;
    } 
    GLES20.glUniformMatrix3fv(this.m, 1, false, arrayOfFloat, 0);
    GLES20.glUniformMatrix4fv(this.l, 1, false, paramArrayOffloat, 0);
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(36197, paramInt);
    GLES20.glUniform1i(this.p, 0);
    m.b();
    GLES20.glVertexAttribPointer(this.n, 3, 5126, false, 12, a.a(a1));
    m.b();
    GLES20.glVertexAttribPointer(this.o, 2, 5126, false, 8, a.b(a1));
    m.b();
    GLES20.glDrawArrays(a.c(a1), 0, a.d(a1));
    m.b();
    GLES20.glDisableVertexAttribArray(this.n);
    GLES20.glDisableVertexAttribArray(this.o);
  }
  
  void b() {
    int i = m.d(a, b);
    this.k = i;
    this.l = GLES20.glGetUniformLocation(i, "uMvpMatrix");
    this.m = GLES20.glGetUniformLocation(this.k, "uTexMatrix");
    this.n = GLES20.glGetAttribLocation(this.k, "aPosition");
    this.o = GLES20.glGetAttribLocation(this.k, "aTexCoords");
    this.p = GLES20.glGetUniformLocation(this.k, "uTexture");
  }
  
  public void d(d paramd) {
    a a1;
    if (!c(paramd))
      return; 
    this.h = paramd.c;
    a a2 = new a(paramd.a.a(0));
    this.i = a2;
    if (paramd.d) {
      a1 = a2;
    } else {
      a1 = new a(((d)a1).b.a(0));
    } 
    this.j = a1;
  }
  
  private static class a {
    private final int a;
    
    private final FloatBuffer b;
    
    private final FloatBuffer c;
    
    private final int d;
    
    public a(d.b param1b) {
      this.a = param1b.a();
      this.b = m.f(param1b.c);
      this.c = m.f(param1b.d);
      int i = param1b.b;
      if (i != 1) {
        if (i != 2) {
          this.d = 4;
        } else {
          this.d = 6;
        } 
      } else {
        this.d = 5;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/spherical/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */