package com.bumptech.glide.load.i;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b<Data> implements n<byte[], Data> {
  private final b<Data> a;
  
  public b(b<Data> paramb) {
    this.a = paramb;
  }
  
  public n.a<Data> c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, e parame) {
    return new n.a<Data>((com.bumptech.glide.load.c)new com.bumptech.glide.o.d(paramArrayOfbyte), new c<Data>(paramArrayOfbyte, this.a));
  }
  
  public boolean d(byte[] paramArrayOfbyte) {
    return true;
  }
  
  public static class a implements o<byte[], ByteBuffer> {
    public n<byte[], ByteBuffer> b(r param1r) {
      return new b<ByteBuffer>(new a(this));
    }
    
    class a implements b.b<ByteBuffer> {
      a(b.a this$0) {}
      
      public Class<ByteBuffer> a() {
        return ByteBuffer.class;
      }
      
      public ByteBuffer c(byte[] param2ArrayOfbyte) {
        return ByteBuffer.wrap(param2ArrayOfbyte);
      }
    }
  }
  
  class a implements b<ByteBuffer> {
    a(b this$0) {}
    
    public Class<ByteBuffer> a() {
      return ByteBuffer.class;
    }
    
    public ByteBuffer c(byte[] param1ArrayOfbyte) {
      return ByteBuffer.wrap(param1ArrayOfbyte);
    }
  }
  
  public static interface b<Data> {
    Class<Data> a();
    
    Data b(byte[] param1ArrayOfbyte);
  }
  
  private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {
    private final byte[] b;
    
    private final b.b<Data> c;
    
    c(byte[] param1ArrayOfbyte, b.b<Data> param1b) {
      this.b = param1ArrayOfbyte;
      this.c = param1b;
    }
    
    public Class<Data> a() {
      return this.c.a();
    }
    
    public void b() {}
    
    public void cancel() {}
    
    public DataSource d() {
      return DataSource.b;
    }
    
    public void e(Priority param1Priority, com.bumptech.glide.load.data.d.a<? super Data> param1a) {
      param1a.f(this.c.b(this.b));
    }
  }
  
  public static class d implements o<byte[], InputStream> {
    public n<byte[], InputStream> b(r param1r) {
      return new b<InputStream>(new a(this));
    }
    
    class a implements b.b<InputStream> {
      a(b.d this$0) {}
      
      public Class<InputStream> a() {
        return InputStream.class;
      }
      
      public InputStream c(byte[] param2ArrayOfbyte) {
        return new ByteArrayInputStream(param2ArrayOfbyte);
      }
    }
  }
  
  class a implements b<InputStream> {
    a(b this$0) {}
    
    public Class<InputStream> a() {
      return InputStream.class;
    }
    
    public InputStream c(byte[] param1ArrayOfbyte) {
      return new ByteArrayInputStream(param1ArrayOfbyte);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */