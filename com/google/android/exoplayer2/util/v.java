package com.google.android.exoplayer2.util;

import java.nio.charset.Charset;

public final class v {
  public byte[] a = h0.f;
  
  private int b;
  
  private int c;
  
  public v() {}
  
  public v(int paramInt) {
    this.c = paramInt;
  }
  
  public v(byte[] paramArrayOfbyte) {
    this.c = paramArrayOfbyte.length;
  }
  
  public v(byte[] paramArrayOfbyte, int paramInt) {
    this.c = paramInt;
  }
  
  public int A() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    byte b = arrayOfByte[i];
    i = j + 1;
    this.b = i;
    j = arrayOfByte[j];
    this.b = i + 2;
    return j & 0xFF | (b & 0xFF) << 8;
  }
  
  public long B() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    long l1 = arrayOfByte[i];
    i = j + 1;
    this.b = i;
    long l2 = arrayOfByte[j];
    j = i + 1;
    this.b = j;
    long l3 = arrayOfByte[i];
    this.b = j + 1;
    return arrayOfByte[j] & 0xFFL | (l1 & 0xFFL) << 24L | (l2 & 0xFFL) << 16L | (l3 & 0xFFL) << 8L;
  }
  
  public int C() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    byte b = arrayOfByte[i];
    i = j + 1;
    this.b = i;
    j = arrayOfByte[j];
    this.b = i + 1;
    return arrayOfByte[i] & 0xFF | (b & 0xFF) << 16 | (j & 0xFF) << 8;
  }
  
  public int D() {
    int i = k();
    if (i >= 0)
      return i; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Top bit not zero: ");
    stringBuilder.append(i);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public long E() {
    long l = s();
    if (l >= 0L)
      return l; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Top bit not zero: ");
    stringBuilder.append(l);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public int F() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    i = arrayOfByte[i];
    this.b = j + 1;
    return arrayOfByte[j] & 0xFF | (i & 0xFF) << 8;
  }
  
  public long G() {
    byte b;
    long l = this.a[this.b];
    int i = 7;
    while (true) {
      b = 1;
      if (i >= 0) {
        int j = 1 << i;
        if ((j & l) == 0L) {
          if (i < 6) {
            l &= (j - 1);
            i = 7 - i;
            break;
          } 
          if (i == 7) {
            i = 1;
            break;
          } 
        } else {
          i--;
          continue;
        } 
      } 
      i = 0;
      break;
    } 
    if (i != 0) {
      while (b < i) {
        byte b1 = this.a[this.b + b];
        if ((b1 & 0xC0) == 128) {
          l = l << 6L | (b1 & 0x3F);
          b++;
          continue;
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Invalid UTF-8 sequence continuation byte: ");
        stringBuilder1.append(l);
        throw new NumberFormatException(stringBuilder1.toString());
      } 
      this.b += i;
      return l;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid UTF-8 sequence first byte: ");
    stringBuilder.append(l);
    NumberFormatException numberFormatException = new NumberFormatException(stringBuilder.toString());
    throw numberFormatException;
  }
  
  public void H() {
    this.b = 0;
    this.c = 0;
  }
  
  public void I(int paramInt) {
    byte[] arrayOfByte;
    if (b() < paramInt) {
      arrayOfByte = new byte[paramInt];
    } else {
      arrayOfByte = this.a;
    } 
    K(arrayOfByte, paramInt);
  }
  
  public void J(byte[] paramArrayOfbyte) {
    K(paramArrayOfbyte, paramArrayOfbyte.length);
  }
  
  public void K(byte[] paramArrayOfbyte, int paramInt) {
    this.a = paramArrayOfbyte;
    this.c = paramInt;
    this.b = 0;
  }
  
  public void L(int paramInt) {
    boolean bool;
    if (paramInt >= 0 && paramInt <= this.a.length) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.c = paramInt;
  }
  
  public void M(int paramInt) {
    boolean bool;
    if (paramInt >= 0 && paramInt <= this.c) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.b = paramInt;
  }
  
  public void N(int paramInt) {
    M(this.b + paramInt);
  }
  
  public int a() {
    return this.c - this.b;
  }
  
  public int b() {
    return this.a.length;
  }
  
  public int c() {
    return this.b;
  }
  
  public int d() {
    return this.c;
  }
  
  public char e() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    byte b = arrayOfByte[i];
    return (char)(arrayOfByte[i + 1] & 0xFF | (b & 0xFF) << 8);
  }
  
  public int f() {
    return this.a[this.b] & 0xFF;
  }
  
  public void g(u paramu, int paramInt) {
    h(paramu.a, 0, paramInt);
    paramu.o(0);
  }
  
  public void h(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    System.arraycopy(this.a, this.b, paramArrayOfbyte, paramInt1, paramInt2);
    this.b += paramInt2;
  }
  
  public double i() {
    return Double.longBitsToDouble(s());
  }
  
  public float j() {
    return Float.intBitsToFloat(k());
  }
  
  public int k() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    i = arrayOfByte[i];
    int k = j + 1;
    this.b = k;
    j = arrayOfByte[j];
    int m = k + 1;
    this.b = m;
    k = arrayOfByte[k];
    this.b = m + 1;
    return arrayOfByte[m] & 0xFF | (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8;
  }
  
  public int l() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    byte b = arrayOfByte[i];
    i = j + 1;
    this.b = i;
    j = arrayOfByte[j];
    this.b = i + 1;
    return arrayOfByte[i] & 0xFF | (b & 0xFF) << 24 >> 8 | (j & 0xFF) << 8;
  }
  
  public String m() {
    if (a() == 0)
      return null; 
    int i;
    for (i = this.b; i < this.c && !h0.V(this.a[i]); i++);
    int j = this.b;
    if (i - j >= 3) {
      byte[] arrayOfByte1 = this.a;
      if (arrayOfByte1[j] == -17 && arrayOfByte1[j + 1] == -69 && arrayOfByte1[j + 2] == -65)
        this.b = j + 3; 
    } 
    byte[] arrayOfByte = this.a;
    j = this.b;
    String str = h0.w(arrayOfByte, j, i - j);
    this.b = i;
    j = this.c;
    if (i == j)
      return str; 
    arrayOfByte = this.a;
    if (arrayOfByte[i] == 13) {
      this.b = ++i;
      if (i == j)
        return str; 
    } 
    i = this.b;
    if (arrayOfByte[i] == 10)
      this.b = i + 1; 
    return str;
  }
  
  public int n() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    i = arrayOfByte[i];
    int k = j + 1;
    this.b = k;
    byte b = arrayOfByte[j];
    j = k + 1;
    this.b = j;
    k = arrayOfByte[k];
    this.b = j + 1;
    return (arrayOfByte[j] & 0xFF) << 24 | i & 0xFF | (b & 0xFF) << 8 | (k & 0xFF) << 16;
  }
  
  public long o() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    long l1 = arrayOfByte[i];
    i = j + 1;
    this.b = i;
    long l2 = arrayOfByte[j];
    int k = i + 1;
    this.b = k;
    long l3 = arrayOfByte[i];
    j = k + 1;
    this.b = j;
    long l4 = arrayOfByte[k];
    i = j + 1;
    this.b = i;
    long l5 = arrayOfByte[j];
    j = i + 1;
    this.b = j;
    long l6 = arrayOfByte[i];
    i = j + 1;
    this.b = i;
    long l7 = arrayOfByte[j];
    this.b = i + 1;
    return (arrayOfByte[i] & 0xFFL) << 56L | l1 & 0xFFL | (l2 & 0xFFL) << 8L | (l3 & 0xFFL) << 16L | (l4 & 0xFFL) << 24L | (l5 & 0xFFL) << 32L | (l6 & 0xFFL) << 40L | (l7 & 0xFFL) << 48L;
  }
  
  public long p() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    long l1 = arrayOfByte[i];
    i = j + 1;
    this.b = i;
    long l2 = arrayOfByte[j];
    j = i + 1;
    this.b = j;
    long l3 = arrayOfByte[i];
    this.b = j + 1;
    return (arrayOfByte[j] & 0xFFL) << 24L | l1 & 0xFFL | (l2 & 0xFFL) << 8L | (l3 & 0xFFL) << 16L;
  }
  
  public int q() {
    int i = n();
    if (i >= 0)
      return i; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Top bit not zero: ");
    stringBuilder.append(i);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public int r() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    i = arrayOfByte[i];
    this.b = j + 1;
    return (arrayOfByte[j] & 0xFF) << 8 | i & 0xFF;
  }
  
  public long s() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    long l1 = arrayOfByte[i];
    i = j + 1;
    this.b = i;
    long l2 = arrayOfByte[j];
    int k = i + 1;
    this.b = k;
    long l3 = arrayOfByte[i];
    j = k + 1;
    this.b = j;
    long l4 = arrayOfByte[k];
    i = j + 1;
    this.b = i;
    long l5 = arrayOfByte[j];
    j = i + 1;
    this.b = j;
    long l6 = arrayOfByte[i];
    i = j + 1;
    this.b = i;
    long l7 = arrayOfByte[j];
    this.b = i + 1;
    return arrayOfByte[i] & 0xFFL | (l1 & 0xFFL) << 56L | (l2 & 0xFFL) << 48L | (l3 & 0xFFL) << 40L | (l4 & 0xFFL) << 32L | (l5 & 0xFFL) << 24L | (l6 & 0xFFL) << 16L | (l7 & 0xFFL) << 8L;
  }
  
  public String t() {
    if (a() == 0)
      return null; 
    int i;
    for (i = this.b; i < this.c && this.a[i] != 0; i++);
    byte[] arrayOfByte = this.a;
    int j = this.b;
    String str = h0.w(arrayOfByte, j, i - j);
    this.b = i;
    if (i < this.c)
      this.b = i + 1; 
    return str;
  }
  
  public String u(int paramInt) {
    if (paramInt == 0)
      return ""; 
    int i = this.b;
    int j = i + paramInt - 1;
    if (j < this.c && this.a[j] == 0) {
      j = paramInt - 1;
    } else {
      j = paramInt;
    } 
    String str = h0.w(this.a, i, j);
    this.b += paramInt;
    return str;
  }
  
  public short v() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    i = arrayOfByte[i];
    this.b = j + 1;
    return (short)(arrayOfByte[j] & 0xFF | (i & 0xFF) << 8);
  }
  
  public String w(int paramInt) {
    return x(paramInt, Charset.forName("UTF-8"));
  }
  
  public String x(int paramInt, Charset paramCharset) {
    String str = new String(this.a, this.b, paramInt, paramCharset);
    this.b += paramInt;
    return str;
  }
  
  public int y() {
    return z() << 21 | z() << 14 | z() << 7 | z();
  }
  
  public int z() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = i + 1;
    return arrayOfByte[i] & 0xFF;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */