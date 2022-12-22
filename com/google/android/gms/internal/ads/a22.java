package com.google.android.gms.internal.ads;

public final class a22 {
  private final byte[] a;
  
  private a22(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[paramInt2];
    this.a = arrayOfByte;
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramInt2);
  }
  
  public static a22 b(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : new a22(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public final byte[] a() {
    byte[] arrayOfByte1 = this.a;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    return arrayOfByte2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */