package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class r12 implements gu1 {
  private final d22 a;
  
  private final uu1 b;
  
  private final int c;
  
  public r12(d22 paramd22, uu1 paramuu1, int paramInt) {
    this.a = paramd22;
    this.b = paramuu1;
    this.c = paramInt;
  }
  
  public final byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte = this.a.a(paramArrayOfbyte1);
    paramArrayOfbyte1 = paramArrayOfbyte2;
    if (paramArrayOfbyte2 == null)
      paramArrayOfbyte1 = new byte[0]; 
    paramArrayOfbyte2 = Arrays.copyOf(ByteBuffer.allocate(8).putLong(paramArrayOfbyte1.length * 8L).array(), 8);
    return e12.c(new byte[][] { arrayOfByte, this.b.a(e12.c(new byte[][] { paramArrayOfbyte1, arrayOfByte, paramArrayOfbyte2 })) });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */