package com.bumptech.glide.load.j.d;

import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.p.j;

public class b implements s<byte[]> {
  private final byte[] b;
  
  public b(byte[] paramArrayOfbyte) {
    this.b = (byte[])j.d(paramArrayOfbyte);
  }
  
  public void a() {}
  
  public int b() {
    return this.b.length;
  }
  
  public Class<byte[]> c() {
    return byte[].class;
  }
  
  public byte[] d() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */