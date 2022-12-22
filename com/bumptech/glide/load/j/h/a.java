package com.bumptech.glide.load.j.h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.j.d.b;
import java.io.ByteArrayOutputStream;

public class a implements e<Bitmap, byte[]> {
  private final Bitmap.CompressFormat a;
  
  private final int b;
  
  public a() {
    this(Bitmap.CompressFormat.JPEG, 100);
  }
  
  public a(Bitmap.CompressFormat paramCompressFormat, int paramInt) {
    this.a = paramCompressFormat;
    this.b = paramInt;
  }
  
  public s<byte[]> a(s<Bitmap> params, e parame) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ((Bitmap)params.get()).compress(this.a, this.b, byteArrayOutputStream);
    params.a();
    return (s<byte[]>)new b(byteArrayOutputStream.toByteArray());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */