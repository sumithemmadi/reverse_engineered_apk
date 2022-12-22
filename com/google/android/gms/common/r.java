package com.google.android.gms.common;

import java.util.Arrays;

final class r extends o {
  private final byte[] c;
  
  r(byte[] paramArrayOfbyte) {
    super(Arrays.copyOfRange(paramArrayOfbyte, 0, 25));
    this.c = paramArrayOfbyte;
  }
  
  final byte[] o1() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */