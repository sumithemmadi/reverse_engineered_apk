package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.p.d;
import com.bumptech.glide.p.h;
import java.io.IOException;
import java.io.InputStream;

public class w implements f<InputStream, Bitmap> {
  private final l a;
  
  private final b b;
  
  public w(l paraml, b paramb) {
    this.a = paraml;
    this.b = paramb;
  }
  
  public s<Bitmap> c(InputStream paramInputStream, int paramInt1, int paramInt2, e parame) {
    boolean bool;
    if (paramInputStream instanceof RecyclableBufferedInputStream) {
      paramInputStream = paramInputStream;
      bool = false;
    } else {
      paramInputStream = new RecyclableBufferedInputStream(paramInputStream, this.b);
      bool = true;
    } 
    d d = d.c(paramInputStream);
    h h = new h((InputStream)d);
    a a = new a((RecyclableBufferedInputStream)paramInputStream, d);
    try {
      return this.a.g((InputStream)h, paramInt1, paramInt2, parame, a);
    } finally {
      d.d();
      if (bool)
        paramInputStream.d(); 
    } 
  }
  
  public boolean d(InputStream paramInputStream, e parame) {
    return this.a.p(paramInputStream);
  }
  
  static class a implements l.b {
    private final RecyclableBufferedInputStream a;
    
    private final d b;
    
    a(RecyclableBufferedInputStream param1RecyclableBufferedInputStream, d param1d) {
      this.a = param1RecyclableBufferedInputStream;
      this.b = param1d;
    }
    
    public void a(e param1e, Bitmap param1Bitmap) {
      IOException iOException = this.b.b();
      if (iOException != null) {
        if (param1Bitmap != null)
          param1e.c(param1Bitmap); 
        throw iOException;
      } 
    }
    
    public void b() {
      this.a.c();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */