package com.bumptech.glide.load.engine.x;

import android.graphics.Bitmap;

public class f implements e {
  public void a(int paramInt) {}
  
  public void b() {}
  
  public void c(Bitmap paramBitmap) {
    paramBitmap.recycle();
  }
  
  public Bitmap d(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
  }
  
  public Bitmap e(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return d(paramInt1, paramInt2, paramConfig);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/x/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */