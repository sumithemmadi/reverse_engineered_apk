package com.google.android.gms.common.util;

public class j {
  private static final char[] a = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'A', 'B', 'C', 'D', 'E', 'F' };
  
  private static final char[] b = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'a', 'b', 'c', 'd', 'e', 'f' };
  
  public static String a(byte[] paramArrayOfbyte) {
    char[] arrayOfChar = new char[paramArrayOfbyte.length << 1];
    byte b = 0;
    int i = 0;
    while (b < paramArrayOfbyte.length) {
      int k = paramArrayOfbyte[b] & 0xFF;
      int m = i + 1;
      char[] arrayOfChar1 = b;
      arrayOfChar[i] = (char)arrayOfChar1[k >>> 4];
      i = m + 1;
      arrayOfChar[m] = (char)arrayOfChar1[k & 0xF];
      b++;
    } 
    return new String(arrayOfChar);
  }
  
  public static String b(byte[] paramArrayOfbyte, boolean paramBoolean) {
    int i = paramArrayOfbyte.length;
    StringBuilder stringBuilder = new StringBuilder(i << 1);
    for (byte b = 0; b < i && (!paramBoolean || b != i - 1 || (paramArrayOfbyte[b] & 0xFF) != 0); b++) {
      char[] arrayOfChar = a;
      stringBuilder.append(arrayOfChar[(paramArrayOfbyte[b] & 0xF0) >>> 4]);
      stringBuilder.append(arrayOfChar[paramArrayOfbyte[b] & 0xF]);
    } 
    return stringBuilder.toString();
  }
  
  public static byte[] c(String paramString) {
    int i = paramString.length();
    if (i % 2 == 0) {
      byte[] arrayOfByte = new byte[i / 2];
      for (int k = 0; k < i; k = n) {
        int m = k / 2;
        int n = k + 2;
        arrayOfByte[m] = (byte)(byte)Integer.parseInt(paramString.substring(k, n), 16);
      } 
      return arrayOfByte;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Hex string has odd number of characters");
    throw illegalArgumentException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */