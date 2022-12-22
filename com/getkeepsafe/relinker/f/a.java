package com.getkeepsafe.relinker.f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class a extends c {
  public a(i parami, d paramd, long paramLong, int paramInt) {
    ByteOrder byteOrder;
    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
    if (paramd.a) {
      byteOrder = ByteOrder.BIG_ENDIAN;
    } else {
      byteOrder = ByteOrder.LITTLE_ENDIAN;
    } 
    byteBuffer.order(byteOrder);
    paramLong += (paramInt * 8);
    this.a = parami.o(byteBuffer, paramLong);
    this.b = parami.o(byteBuffer, paramLong + 4L);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */