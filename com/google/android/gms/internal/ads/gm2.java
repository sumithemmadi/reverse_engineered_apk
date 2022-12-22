package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class gm2 extends yl2 {
  private MessageDigest c;
  
  private final int d;
  
  private final int e;
  
  public gm2(int paramInt) {
    int i = paramInt / 8;
    int j = i;
    if (paramInt % 8 > 0)
      j = i + 1; 
    this.d = j;
    this.e = paramInt;
  }
  
  public final byte[] a(String paramString) {
    synchronized (this.b) {
      MessageDigest messageDigest = b();
      this.c = messageDigest;
      byte b = 0;
      if (messageDigest == null)
        return new byte[0]; 
      messageDigest.reset();
      this.c.update(paramString.getBytes(Charset.forName("UTF-8")));
      byte[] arrayOfByte1 = this.c.digest();
      int i = arrayOfByte1.length;
      int j = this.d;
      if (i <= j)
        j = arrayOfByte1.length; 
      byte[] arrayOfByte2 = new byte[j];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, j);
      if (this.e % 8 > 0) {
        long l = 0L;
        while (b < j) {
          long l1 = l;
          if (b > 0)
            l1 = l << 8L; 
          l = l1 + (arrayOfByte2[b] & 0xFF);
          b++;
        } 
        l >>>= 8 - this.e % 8;
        for (j = this.d - 1; j >= 0; j--) {
          arrayOfByte2[j] = (byte)(byte)(int)(0xFFL & l);
          l >>>= 8L;
        } 
      } 
      return arrayOfByte2;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */