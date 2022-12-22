package com.getkeepsafe.relinker.f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class l extends f {
  public l(i parami, d paramd, int paramInt) {
    ByteOrder byteOrder;
    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
    if (paramd.a) {
      byteOrder = ByteOrder.BIG_ENDIAN;
    } else {
      byteOrder = ByteOrder.LITTLE_ENDIAN;
    } 
    byteBuffer.order(byteOrder);
    this.a = parami.o(byteBuffer, paramd.d + (paramInt * paramd.g) + 28L);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */