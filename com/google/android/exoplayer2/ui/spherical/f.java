package com.google.android.exoplayer2.ui.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.m;
import com.google.android.exoplayer2.video.m;
import com.google.android.exoplayer2.video.r.a;
import com.google.android.exoplayer2.video.r.c;
import com.google.android.exoplayer2.video.r.d;
import com.google.android.exoplayer2.video.r.e;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

final class f implements m, a {
  private final AtomicBoolean a = new AtomicBoolean();
  
  private final AtomicBoolean b = new AtomicBoolean(true);
  
  private final e c = new e();
  
  private final c d = new c();
  
  private final d0<Long> e = new d0();
  
  private final d0<d> f = new d0();
  
  private final float[] g = new float[16];
  
  private final float[] h = new float[16];
  
  private int i;
  
  private SurfaceTexture j;
  
  private volatile int k = 0;
  
  private int l = -1;
  
  private byte[] m;
  
  private void i(byte[] paramArrayOfbyte, int paramInt, long paramLong) {
    d d;
    byte[] arrayOfByte = this.m;
    int i = this.l;
    this.m = paramArrayOfbyte;
    int j = paramInt;
    if (paramInt == -1)
      j = this.k; 
    this.l = j;
    if (i == j && Arrays.equals(arrayOfByte, this.m))
      return; 
    paramArrayOfbyte = null;
    arrayOfByte = this.m;
    if (arrayOfByte != null)
      d = e.a(arrayOfByte, this.l); 
    if (d == null || !e.c(d))
      d = d.b(this.l); 
    this.f.a(paramLong, d);
  }
  
  public void a(long paramLong, float[] paramArrayOffloat) {
    this.d.e(paramLong, paramArrayOffloat);
  }
  
  public void b() {
    this.e.c();
    this.d.d();
    this.b.set(true);
  }
  
  public void c(long paramLong1, long paramLong2, Format paramFormat, MediaFormat paramMediaFormat) {
    this.e.a(paramLong2, Long.valueOf(paramLong1));
    i(paramFormat.u, paramFormat.t, paramLong2);
  }
  
  public void d(float[] paramArrayOffloat, boolean paramBoolean) {
    GLES20.glClear(16384);
    m.b();
    if (this.a.compareAndSet(true, false)) {
      ((SurfaceTexture)e.e(this.j)).updateTexImage();
      m.b();
      if (this.b.compareAndSet(true, false))
        Matrix.setIdentityM(this.g, 0); 
      long l = this.j.getTimestamp();
      Long long_ = (Long)this.e.g(l);
      if (long_ != null)
        this.d.c(this.g, long_.longValue()); 
      d d = (d)this.f.i(l);
      if (d != null)
        this.c.d(d); 
    } 
    Matrix.multiplyMM(this.h, 0, paramArrayOffloat, 0, this.g, 0);
    this.c.a(this.i, this.h, paramBoolean);
  }
  
  public SurfaceTexture e() {
    GLES20.glClearColor(0.5F, 0.5F, 0.5F, 1.0F);
    m.b();
    this.c.b();
    m.b();
    this.i = m.g();
    SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
    this.j = surfaceTexture;
    surfaceTexture.setOnFrameAvailableListener(new a(this));
    return this.j;
  }
  
  public void h(int paramInt) {
    this.k = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/spherical/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */