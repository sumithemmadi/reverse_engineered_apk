package com.getkeepsafe.relinker.f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class g extends d {
  private final i j;
  
  public g(boolean paramBoolean, i parami) {
    ByteOrder byteOrder;
    this.a = paramBoolean;
    this.j = parami;
    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
    if (paramBoolean) {
      byteOrder = ByteOrder.BIG_ENDIAN;
    } else {
      byteOrder = ByteOrder.LITTLE_ENDIAN;
    } 
    byteBuffer.order(byteOrder);
    this.b = parami.h(byteBuffer, 16L);
    this.c = parami.o(byteBuffer, 28L);
    this.d = parami.o(byteBuffer, 32L);
    this.e = parami.h(byteBuffer, 42L);
    this.f = parami.h(byteBuffer, 44L);
    this.g = parami.h(byteBuffer, 46L);
    this.h = parami.h(byteBuffer, 48L);
    this.i = parami.h(byteBuffer, 50L);
  }
  
  public c a(long paramLong, int paramInt) {
    return new a(this.j, this, paramLong, paramInt);
  }
  
  public e b(long paramLong) {
    return new j(this.j, this, paramLong);
  }
  
  public f c(int paramInt) {
    return new l(this.j, this, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */