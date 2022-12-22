package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class gw1 implements gu1 {
  private static final byte[] a = new byte[0];
  
  private final xz1 b;
  
  private final gu1 c;
  
  public gw1(xz1 paramxz1, gu1 paramgu1) {
    this.b = paramxz1;
    this.c = paramgu1;
  }
  
  public final byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte1 = dv1.p(this.b).g();
    byte[] arrayOfByte2 = this.c.a(arrayOfByte1, a);
    paramArrayOfbyte1 = ((gu1)dv1.<gu1>i(this.b.J(), arrayOfByte1, gu1.class)).a(paramArrayOfbyte1, paramArrayOfbyte2);
    return ByteBuffer.allocate(arrayOfByte2.length + 4 + paramArrayOfbyte1.length).putInt(arrayOfByte2.length).put(arrayOfByte2).put(paramArrayOfbyte1).array();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */