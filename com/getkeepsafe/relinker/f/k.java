package com.getkeepsafe.relinker.f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class k extends e {
  public k(i parami, d paramd, long paramLong) {
    ByteOrder byteOrder;
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    if (paramd.a) {
      byteOrder = ByteOrder.BIG_ENDIAN;
    } else {
      byteOrder = ByteOrder.LITTLE_ENDIAN;
    } 
    byteBuffer.order(byteOrder);
    paramLong = paramd.c + paramLong * paramd.e;
    this.a = parami.o(byteBuffer, paramLong);
    this.b = parami.j(byteBuffer, 8L + paramLong);
    this.c = parami.j(byteBuffer, 16L + paramLong);
    this.d = parami.j(byteBuffer, paramLong + 40L);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */