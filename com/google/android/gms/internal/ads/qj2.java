package com.google.android.gms.internal.ads;

public final class qj2 {
  public byte[] a;
  
  private int b;
  
  private int c;
  
  public qj2() {}
  
  public qj2(int paramInt) {
    this.a = new byte[paramInt];
    this.c = paramInt;
  }
  
  public qj2(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
    this.c = paramArrayOfbyte.length;
  }
  
  public final int a() {
    byte[] arrayOfByte = this.a;
    return (arrayOfByte == null) ? 0 : arrayOfByte.length;
  }
  
  public final int b() {
    return this.b;
  }
  
  public final int c() {
    return this.c;
  }
  
  public final int d() {
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
  
  public final long e() {
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
  
  public final short f() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    i = arrayOfByte[i];
    this.b = j + 1;
    return (short)(arrayOfByte[j] & 0xFF | (i & 0xFF) << 8);
  }
  
  public final int g() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = i + 1;
    return arrayOfByte[i] & 0xFF;
  }
  
  public final int h() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    i = arrayOfByte[i];
    this.b = j + 1;
    return arrayOfByte[j] & 0xFF | (i & 0xFF) << 8;
  }
  
  public final void i() {
    this.b = 0;
    this.c = 0;
  }
  
  public final void j(int paramInt) {
    byte[] arrayOfByte;
    if (a() < paramInt) {
      arrayOfByte = new byte[paramInt];
    } else {
      arrayOfByte = this.a;
    } 
    o(arrayOfByte, paramInt);
  }
  
  public final void k(int paramInt) {
    boolean bool;
    if (paramInt >= 0 && paramInt <= this.a.length) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.a(bool);
    this.c = paramInt;
  }
  
  public final void l(int paramInt) {
    boolean bool;
    if (paramInt >= 0 && paramInt <= this.c) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.a(bool);
    this.b = paramInt;
  }
  
  public final void m(int paramInt) {
    l(this.b + paramInt);
  }
  
  public final String n(int paramInt) {
    if (paramInt == 0)
      return ""; 
    int i = this.b + paramInt - 1;
    if (i < this.c && this.a[i] == 0) {
      i = paramInt - 1;
    } else {
      i = paramInt;
    } 
    String str = new String(this.a, this.b, i);
    this.b += paramInt;
    return str;
  }
  
  public final void o(byte[] paramArrayOfbyte, int paramInt) {
    this.a = paramArrayOfbyte;
    this.c = paramInt;
    this.b = 0;
  }
  
  public final void p(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    System.arraycopy(this.a, this.b, paramArrayOfbyte, paramInt1, paramInt2);
    this.b += paramInt2;
  }
  
  public final int q() {
    return this.c - this.b;
  }
  
  public final int r() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    i = arrayOfByte[i];
    this.b = j + 1;
    return (arrayOfByte[j] & 0xFF) << 8 | i & 0xFF;
  }
  
  public final long s() {
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
  
  public final long t() {
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
  
  public final int u() {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    int j = i + 1;
    this.b = j;
    i = arrayOfByte[i];
    int k = j + 1;
    this.b = k;
    j = arrayOfByte[j];
    this.b = k + 2;
    return j & 0xFF | (i & 0xFF) << 8;
  }
  
  public final int v() {
    int i = d();
    if (i >= 0)
      return i; 
    StringBuilder stringBuilder = new StringBuilder(29);
    stringBuilder.append("Top bit not zero: ");
    stringBuilder.append(i);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final long w() {
    long l = e();
    if (l >= 0L)
      return l; 
    StringBuilder stringBuilder = new StringBuilder(38);
    stringBuilder.append("Top bit not zero: ");
    stringBuilder.append(l);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final String x() {
    if (q() == 0)
      return null; 
    int i;
    for (i = this.b; i < this.c && this.a[i] != 0; i++);
    byte[] arrayOfByte = this.a;
    int j = this.b;
    String str = new String(arrayOfByte, j, i - j);
    this.b = i;
    if (i < this.c)
      this.b = i + 1; 
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */