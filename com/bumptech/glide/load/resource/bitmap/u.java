package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;

public final class u implements f<ParcelFileDescriptor, Bitmap> {
  private final l a;
  
  public u(l paraml) {
    this.a = paraml;
  }
  
  public s<Bitmap> c(ParcelFileDescriptor paramParcelFileDescriptor, int paramInt1, int paramInt2, e parame) {
    return this.a.d(paramParcelFileDescriptor, paramInt1, paramInt2, parame);
  }
  
  public boolean d(ParcelFileDescriptor paramParcelFileDescriptor, e parame) {
    return this.a.o(paramParcelFileDescriptor);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */