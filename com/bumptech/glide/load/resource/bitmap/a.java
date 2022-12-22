package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;
import com.bumptech.glide.p.j;

public class a<DataType> implements f<DataType, BitmapDrawable> {
  private final f<DataType, Bitmap> a;
  
  private final Resources b;
  
  public a(Resources paramResources, f<DataType, Bitmap> paramf) {
    this.b = (Resources)j.d(paramResources);
    this.a = (f<DataType, Bitmap>)j.d(paramf);
  }
  
  public boolean a(DataType paramDataType, e parame) {
    return this.a.a(paramDataType, parame);
  }
  
  public s<BitmapDrawable> b(DataType paramDataType, int paramInt1, int paramInt2, e parame) {
    s<Bitmap> s = this.a.b(paramDataType, paramInt1, paramInt2, parame);
    return t.e(this.b, s);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */