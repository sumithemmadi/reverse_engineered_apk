package com.google.android.gms.internal.ads;

public final class rj2 {
  private byte[] a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  public rj2(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, paramArrayOfbyte.length);
  }
  
  private rj2(byte[] paramArrayOfbyte, int paramInt) {
    this.a = paramArrayOfbyte;
    this.d = paramInt;
  }
  
  public final int a(int paramInt) {
    boolean bool1 = false;
    if (paramInt == 0)
      return 0; 
    int i = paramInt / 8;
    int j = 0;
    int k = 0;
    int m = paramInt;
    paramInt = k;
    while (j < i) {
      int n = this.c;
      if (n != 0) {
        byte[] arrayOfByte = this.a;
        int i1 = this.b;
        k = arrayOfByte[i1];
        k = (arrayOfByte[i1 + 1] & 0xFF) >>> 8 - n | (k & 0xFF) << n;
      } else {
        k = this.a[this.b];
      } 
      m -= 8;
      paramInt |= (0xFF & k) << m;
      this.b++;
      j++;
    } 
    j = paramInt;
    if (m > 0) {
      j = this.c + m;
      i = (byte)(255 >> 8 - m);
      if (j > 8) {
        byte[] arrayOfByte = this.a;
        m = this.b;
        k = arrayOfByte[m];
        paramInt = i & ((0xFF & arrayOfByte[m + 1]) >> 16 - j | (k & 0xFF) << j - 8) | paramInt;
        this.b = m + 1;
      } else {
        byte[] arrayOfByte = this.a;
        k = this.b;
        m = i & (0xFF & arrayOfByte[k]) >> 8 - j | paramInt;
        paramInt = m;
        if (j == 8) {
          this.b = k + 1;
          paramInt = m;
        } 
      } 
      this.c = j % 8;
      j = paramInt;
    } 
    k = this.b;
    boolean bool2 = bool1;
    if (k >= 0) {
      m = this.c;
      bool2 = bool1;
      if (m >= 0) {
        bool2 = bool1;
        if (m < 8) {
          paramInt = this.d;
          if (k >= paramInt) {
            bool2 = bool1;
            if (k == paramInt) {
              bool2 = bool1;
              if (m == 0) {
                bool2 = true;
                jj2.e(bool2);
                return j;
              } 
            } 
            jj2.e(bool2);
            return j;
          } 
        } else {
          jj2.e(bool2);
          return j;
        } 
      } else {
        jj2.e(bool2);
        return j;
      } 
    } else {
      jj2.e(bool2);
      return j;
    } 
    bool2 = true;
    jj2.e(bool2);
    return j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */