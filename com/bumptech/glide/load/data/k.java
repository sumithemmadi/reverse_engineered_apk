package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;

public final class k implements e<InputStream> {
  private final RecyclableBufferedInputStream a;
  
  public k(InputStream paramInputStream, b paramb) {
    RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(paramInputStream, paramb);
    this.a = recyclableBufferedInputStream;
    recyclableBufferedInputStream.mark(5242880);
  }
  
  public void b() {
    this.a.d();
  }
  
  public void c() {
    this.a.c();
  }
  
  public InputStream d() {
    this.a.reset();
    return (InputStream)this.a;
  }
  
  public static final class a implements e.a<InputStream> {
    private final b a;
    
    public a(b param1b) {
      this.a = param1b;
    }
    
    public Class<InputStream> a() {
      return InputStream.class;
    }
    
    public e<InputStream> c(InputStream param1InputStream) {
      return new k(param1InputStream, this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */