package com.getkeepsafe.relinker.f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class h extends d {
  private final i j;
  
  public h(boolean paramBoolean, i parami) {
    ByteOrder byteOrder;
    this.a = paramBoolean;
    this.j = parami;
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    if (paramBoolean) {
      byteOrder = ByteOrder.BIG_ENDIAN;
    } else {
      byteOrder = ByteOrder.LITTLE_ENDIAN;
    } 
    byteBuffer.order(byteOrder);
    this.b = parami.h(byteBuffer, 16L);
    this.c = parami.j(byteBuffer, 32L);
    this.d = parami.j(byteBuffer, 40L);
    this.e = parami.h(byteBuffer, 54L);
    this.f = parami.h(byteBuffer, 56L);
    this.g = parami.h(byteBuffer, 58L);
    this.h = parami.h(byteBuffer, 60L);
    this.i = parami.h(byteBuffer, 62L);
  }
  
  public c a(long paramLong, int paramInt) {
    return new b(this.j, this, paramLong, paramInt);
  }
  
  public e b(long paramLong) {
    return new k(this.j, this, paramLong);
  }
  
  public f c(int paramInt) {
    return new m(this.j, this, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */