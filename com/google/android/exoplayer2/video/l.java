package com.google.android.exoplayer2.video;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.m;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

class l implements GLSurfaceView.Renderer, k {
  private static final float[] b = new float[] { 1.164F, 1.164F, 1.164F, 0.0F, -0.392F, 2.017F, 1.596F, -0.813F, 0.0F };
  
  private static final float[] c = new float[] { 1.164F, 1.164F, 1.164F, 0.0F, -0.213F, 2.112F, 1.793F, -0.533F, 0.0F };
  
  private static final float[] d = new float[] { 1.168F, 1.168F, 1.168F, 0.0F, -0.188F, 2.148F, 1.683F, -0.652F, 0.0F };
  
  private static final String[] e = new String[] { "y_tex", "u_tex", "v_tex" };
  
  private static final FloatBuffer f = m.f(new float[] { -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F });
  
  private final GLSurfaceView g;
  
  private final int[] h = new int[3];
  
  private final AtomicReference<VideoDecoderOutputBuffer> i;
  
  private FloatBuffer[] j;
  
  private int k;
  
  private int[] l;
  
  private int m;
  
  private int[] n;
  
  private int[] o;
  
  private VideoDecoderOutputBuffer p;
  
  public l(GLSurfaceView paramGLSurfaceView) {
    this.g = paramGLSurfaceView;
    this.i = new AtomicReference<VideoDecoderOutputBuffer>();
    this.j = new FloatBuffer[3];
    this.l = new int[3];
    this.n = new int[3];
    this.o = new int[3];
    for (byte b = 0; b < 3; b++) {
      int[] arrayOfInt = this.n;
      this.o[b] = -1;
      arrayOfInt[b] = -1;
    } 
  }
  
  private void a() {
    int[] arrayOfInt = this.h;
    byte b = 0;
    GLES20.glGenTextures(3, arrayOfInt, 0);
    while (b < 3) {
      GLES20.glUniform1i(GLES20.glGetUniformLocation(this.k, e[b]), b);
      GLES20.glActiveTexture(33984 + b);
      GLES20.glBindTexture(3553, this.h[b]);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      b++;
    } 
    m.b();
  }
  
  public void onDrawFrame(GL10 paramGL10) {
    VideoDecoderOutputBuffer videoDecoderOutputBuffer1 = this.i.getAndSet(null);
    if (videoDecoderOutputBuffer1 == null && this.p == null)
      return; 
    if (videoDecoderOutputBuffer1 != null) {
      VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.p;
      if (videoDecoderOutputBuffer != null)
        videoDecoderOutputBuffer.release(); 
      this.p = videoDecoderOutputBuffer1;
    } 
    VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.p;
    float[] arrayOfFloat = c;
    int i = videoDecoderOutputBuffer2.colorspace;
    if (i != 1) {
      if (i == 3)
        arrayOfFloat = d; 
    } else {
      arrayOfFloat = b;
    } 
    GLES20.glUniformMatrix3fv(this.m, 1, false, arrayOfFloat, 0);
    for (i = 0; i < 3; i++) {
      int j;
      if (i == 0) {
        j = videoDecoderOutputBuffer2.height;
      } else {
        j = (videoDecoderOutputBuffer2.height + 1) / 2;
      } 
      GLES20.glActiveTexture(33984 + i);
      GLES20.glBindTexture(3553, this.h[i]);
      GLES20.glPixelStorei(3317, 1);
      GLES20.glTexImage2D(3553, 0, 6409, videoDecoderOutputBuffer2.yuvStrides[i], j, 0, 6409, 5121, videoDecoderOutputBuffer2.yuvPlanes[i]);
    } 
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = videoDecoderOutputBuffer2.width;
    i = (arrayOfInt[0] + 1) / 2;
    arrayOfInt[2] = i;
    arrayOfInt[1] = i;
    for (i = 0; i < 3; i++) {
      if (this.n[i] != arrayOfInt[i] || this.o[i] != videoDecoderOutputBuffer2.yuvStrides[i]) {
        boolean bool;
        if (videoDecoderOutputBuffer2.yuvStrides[i] != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        e.f(bool);
        float f = arrayOfInt[i] / videoDecoderOutputBuffer2.yuvStrides[i];
        this.j[i] = m.f(new float[] { 0.0F, 0.0F, 0.0F, 1.0F, f, 0.0F, f, 1.0F });
        GLES20.glVertexAttribPointer(this.l[i], 2, 5126, false, 0, this.j[i]);
        this.n[i] = arrayOfInt[i];
        this.o[i] = videoDecoderOutputBuffer2.yuvStrides[i];
      } 
    } 
    GLES20.glClear(16384);
    GLES20.glDrawArrays(5, 0, 4);
    m.b();
  }
  
  public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2) {
    GLES20.glViewport(0, 0, paramInt1, paramInt2);
  }
  
  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig) {
    int i = m.c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
    this.k = i;
    GLES20.glUseProgram(i);
    i = GLES20.glGetAttribLocation(this.k, "in_pos");
    GLES20.glEnableVertexAttribArray(i);
    GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, f);
    this.l[0] = GLES20.glGetAttribLocation(this.k, "in_tc_y");
    GLES20.glEnableVertexAttribArray(this.l[0]);
    this.l[1] = GLES20.glGetAttribLocation(this.k, "in_tc_u");
    GLES20.glEnableVertexAttribArray(this.l[1]);
    this.l[2] = GLES20.glGetAttribLocation(this.k, "in_tc_v");
    GLES20.glEnableVertexAttribArray(this.l[2]);
    m.b();
    this.m = GLES20.glGetUniformLocation(this.k, "mColorConversion");
    m.b();
    a();
    m.b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */