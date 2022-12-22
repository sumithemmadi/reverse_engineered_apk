package com.google.android.gms.internal.ads;

public final class t22 {
  private final byte[] a = new byte[256];
  
  private int b;
  
  private int c;
  
  public t22(byte[] paramArrayOfbyte) {
    byte b;
    for (b = 0; b < 'Ā'; b++)
      this.a[b] = (byte)(byte)b; 
    b = 0;
    int i = 0;
    while (b < 'Ā') {
      byte[] arrayOfByte = this.a;
      i = i + arrayOfByte[b] + paramArrayOfbyte[b % paramArrayOfbyte.length] & 0xFF;
      byte b1 = arrayOfByte[b];
      arrayOfByte[b] = (byte)arrayOfByte[i];
      arrayOfByte[i] = (byte)b1;
      b++;
    } 
    this.b = 0;
    this.c = 0;
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    int i = this.b;
    int j = this.c;
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      i = i + 1 & 0xFF;
      byte[] arrayOfByte = this.a;
      j = j + arrayOfByte[i] & 0xFF;
      byte b1 = arrayOfByte[i];
      arrayOfByte[i] = (byte)arrayOfByte[j];
      arrayOfByte[j] = (byte)b1;
      b1 = paramArrayOfbyte[b];
      paramArrayOfbyte[b] = (byte)(byte)(arrayOfByte[arrayOfByte[i] + arrayOfByte[j] & 0xFF] ^ b1);
    } 
    this.b = i;
    this.c = j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */