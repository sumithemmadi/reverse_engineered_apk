package com.bumptech.glide.load.j.d;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

public class a implements e<ByteBuffer> {
  private final ByteBuffer a;
  
  public a(ByteBuffer paramByteBuffer) {
    this.a = paramByteBuffer;
  }
  
  public void b() {}
  
  public ByteBuffer c() {
    this.a.position(0);
    return this.a;
  }
  
  public static class a implements e.a<ByteBuffer> {
    public Class<ByteBuffer> a() {
      return ByteBuffer.class;
    }
    
    public e<ByteBuffer> c(ByteBuffer param1ByteBuffer) {
      return new a(param1ByteBuffer);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */