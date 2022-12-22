package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

public final class bm2 extends yl2 {
  private MessageDigest c;
  
  public final byte[] a(String paramString) {
    String[] arrayOfString = paramString.split(" ");
    int i = arrayOfString.length;
    byte b = 4;
    if (i == 1) {
      i = cm2.a(arrayOfString[0]);
      ByteBuffer byteBuffer = ByteBuffer.allocate(4);
      byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      byteBuffer.putInt(i);
      null = byteBuffer.array();
    } else if (arrayOfString.length < 5) {
      byte[] arrayOfByte = new byte[arrayOfString.length << 1];
      i = 0;
      while (true) {
        null = arrayOfByte;
        if (i < arrayOfString.length) {
          int j = cm2.a(arrayOfString[i]);
          j = j >> 16 ^ 0xFFFF & j;
          null = new byte[2];
          null[0] = (byte)(byte)j;
          null[1] = (byte)(byte)(j >> 8);
          j = i << 1;
          arrayOfByte[j] = (byte)null[0];
          arrayOfByte[j + 1] = (byte)null[1];
          i++;
          continue;
        } 
        break;
      } 
    } else {
      byte[] arrayOfByte = new byte[arrayOfString.length];
      i = 0;
      while (true) {
        null = arrayOfByte;
        if (i < arrayOfString.length) {
          int j = cm2.a(arrayOfString[i]);
          arrayOfByte[i] = (byte)(byte)(j >> 24 ^ j & 0xFF ^ j >> 8 & 0xFF ^ j >> 16 & 0xFF);
          i++;
          continue;
        } 
        break;
      } 
    } 
    this.c = b();
    synchronized (this.b) {
      MessageDigest messageDigest = this.c;
      if (messageDigest == null)
        return new byte[0]; 
      messageDigest.reset();
      this.c.update(null);
      null = this.c.digest();
      if (null.length > 4) {
        i = b;
      } else {
        i = null.length;
      } 
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(null, 0, arrayOfByte, 0, i);
      return arrayOfByte;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */