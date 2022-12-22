package com.getkeepsafe.relinker.f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class j extends e {
  public j(i parami, d paramd, long paramLong) {
    ByteOrder byteOrder;
    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
    if (paramd.a) {
      byteOrder = ByteOrder.BIG_ENDIAN;
    } else {
      byteOrder = ByteOrder.LITTLE_ENDIAN;
    } 
    byteBuffer.order(byteOrder);
    paramLong = paramd.c + paramLong * paramd.e;
    this.a = parami.o(byteBuffer, paramLong);
    this.b = parami.o(byteBuffer, 4L + paramLong);
    this.c = parami.o(byteBuffer, 8L + paramLong);
    this.d = parami.o(byteBuffer, paramLong + 20L);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */