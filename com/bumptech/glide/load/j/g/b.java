package com.bumptech.glide.load.j.g;

import android.graphics.Bitmap;
import com.bumptech.glide.l.a;
import com.bumptech.glide.load.engine.x.e;

public final class b implements a.a {
  private final e a;
  
  private final com.bumptech.glide.load.engine.x.b b;
  
  public b(e parame, com.bumptech.glide.load.engine.x.b paramb) {
    this.a = parame;
    this.b = paramb;
  }
  
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return this.a.e(paramInt1, paramInt2, paramConfig);
  }
  
  public int[] b(int paramInt) {
    com.bumptech.glide.load.engine.x.b b1 = this.b;
    return (b1 == null) ? new int[paramInt] : (int[])b1.e(paramInt, int[].class);
  }
  
  public void c(Bitmap paramBitmap) {
    this.a.c(paramBitmap);
  }
  
  public void d(byte[] paramArrayOfbyte) {
    com.bumptech.glide.load.engine.x.b b1 = this.b;
    if (b1 == null)
      return; 
    b1.d(paramArrayOfbyte);
  }
  
  public byte[] e(int paramInt) {
    com.bumptech.glide.load.engine.x.b b1 = this.b;
    return (b1 == null) ? new byte[paramInt] : (byte[])b1.e(paramInt, byte[].class);
  }
  
  public void f(int[] paramArrayOfint) {
    com.bumptech.glide.load.engine.x.b b1 = this.b;
    if (b1 == null)
      return; 
    b1.d(paramArrayOfint);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */