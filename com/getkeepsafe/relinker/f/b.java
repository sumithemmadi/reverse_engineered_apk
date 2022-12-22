package com.getkeepsafe.relinker.f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class b extends c {
  public b(i parami, d paramd, long paramLong, int paramInt) {
    ByteOrder byteOrder;
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    if (paramd.a) {
      byteOrder = ByteOrder.BIG_ENDIAN;
    } else {
      byteOrder = ByteOrder.LITTLE_ENDIAN;
    } 
    byteBuffer.order(byteOrder);
    paramLong += (paramInt * 16);
    this.a = parami.j(byteBuffer, paramLong);
    this.b = parami.j(byteBuffer, paramLong + 8L);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */