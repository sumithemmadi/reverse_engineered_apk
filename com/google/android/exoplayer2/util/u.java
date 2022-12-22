package com.google.android.exoplayer2.util;

public final class u {
  public byte[] a = h0.f;
  
  private int b;
  
  private int c;
  
  private int d;
  
  public u() {}
  
  public u(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, paramArrayOfbyte.length);
  }
  
  public u(byte[] paramArrayOfbyte, int paramInt) {
    this.d = paramInt;
  }
  
  private void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_1
    //   5: iload_1
    //   6: iflt -> 36
    //   9: aload_0
    //   10: getfield d : I
    //   13: istore_2
    //   14: iload_1
    //   15: iload_2
    //   16: if_icmplt -> 31
    //   19: iload_1
    //   20: iload_2
    //   21: if_icmpne -> 36
    //   24: aload_0
    //   25: getfield c : I
    //   28: ifne -> 36
    //   31: iconst_1
    //   32: istore_3
    //   33: goto -> 38
    //   36: iconst_0
    //   37: istore_3
    //   38: iload_3
    //   39: invokestatic f : (Z)V
    //   42: return
  }
  
  public int b() {
    return (this.d - this.b) * 8 - this.c;
  }
  
  public void c() {
    if (this.c == 0)
      return; 
    this.c = 0;
    this.b++;
    a();
  }
  
  public int d() {
    boolean bool;
    if (this.c == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    return this.b;
  }
  
  public int e() {
    return this.b * 8 + this.c;
  }
  
  public void f(int paramInt1, int paramInt2) {
    int i = paramInt1;
    if (paramInt2 < 32)
      i = paramInt1 & (1 << paramInt2) - 1; 
    int j = Math.min(8 - this.c, paramInt2);
    int k = this.c;
    paramInt1 = 8 - k - j;
    byte[] arrayOfByte = this.a;
    int m = this.b;
    arrayOfByte[m] = (byte)(byte)((65280 >> k | (1 << paramInt1) - 1) & arrayOfByte[m]);
    j = paramInt2 - j;
    arrayOfByte[m] = (byte)(byte)(i >>> j << paramInt1 | arrayOfByte[m]);
    for (paramInt1 = m + 1; j > 8; paramInt1++) {
      this.a[paramInt1] = (byte)(byte)(i >>> j - 8);
      j -= 8;
    } 
    m = 8 - j;
    arrayOfByte = this.a;
    arrayOfByte[paramInt1] = (byte)(byte)(arrayOfByte[paramInt1] & (1 << m) - 1);
    arrayOfByte[paramInt1] = (byte)(byte)((i & (1 << j) - 1) << m | arrayOfByte[paramInt1]);
    q(paramInt2);
    a();
  }
  
  public boolean g() {
    boolean bool;
    if ((this.a[this.b] & 128 >> this.c) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    p();
    return bool;
  }
  
  public int h(int paramInt) {
    if (paramInt == 0)
      return 0; 
    this.c += paramInt;
    int i = 0;
    while (true) {
      int j = this.c;
      if (j > 8) {
        int m = j - 8;
        this.c = m;
        byte[] arrayOfByte1 = this.a;
        int n = this.b;
        this.b = n + 1;
        i |= (arrayOfByte1[n] & 0xFF) << m;
        continue;
      } 
      byte[] arrayOfByte = this.a;
      int k = this.b;
      byte b = arrayOfByte[k];
      if (j == 8) {
        this.c = 0;
        this.b = k + 1;
      } 
      a();
      return -1 >>> 32 - paramInt & (i | (b & 0xFF) >> 8 - j);
    } 
  }
  
  public void i(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = (paramInt2 >> 3) + paramInt1;
    while (paramInt1 < i) {
      byte[] arrayOfByte1 = this.a;
      int k = this.b;
      int m = k + 1;
      this.b = m;
      byte b = arrayOfByte1[k];
      k = this.c;
      paramArrayOfbyte[paramInt1] = (byte)(byte)(b << k);
      b = paramArrayOfbyte[paramInt1];
      paramArrayOfbyte[paramInt1] = (byte)(byte)((0xFF & arrayOfByte1[m]) >> 8 - k | b);
      paramInt1++;
    } 
    paramInt1 = paramInt2 & 0x7;
    if (paramInt1 == 0)
      return; 
    paramArrayOfbyte[i] = (byte)(byte)(paramArrayOfbyte[i] & 255 >> paramInt1);
    paramInt2 = this.c;
    if (paramInt2 + paramInt1 > 8) {
      byte b = paramArrayOfbyte[i];
      byte[] arrayOfByte1 = this.a;
      int k = this.b;
      this.b = k + 1;
      paramArrayOfbyte[i] = (byte)(byte)(b | (arrayOfByte1[k] & 0xFF) << paramInt2);
      this.c = paramInt2 - 8;
    } 
    int j = this.c + paramInt1;
    this.c = j;
    byte[] arrayOfByte = this.a;
    paramInt2 = this.b;
    byte b2 = arrayOfByte[paramInt2];
    byte b1 = paramArrayOfbyte[i];
    paramArrayOfbyte[i] = (byte)(byte)((byte)((0xFF & b2) >> 8 - j << 8 - paramInt1) | b1);
    if (j == 8) {
      this.c = 0;
      this.b = paramInt2 + 1;
    } 
    a();
  }
  
  public long j(int paramInt) {
    return (paramInt <= 32) ? h0.v0(h(paramInt)) : h0.t0(h(paramInt - 32), h(32));
  }
  
  public void k(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    boolean bool;
    if (this.c == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    System.arraycopy(this.a, this.b, paramArrayOfbyte, paramInt1, paramInt2);
    this.b += paramInt2;
    a();
  }
  
  public void l(v paramv) {
    n(paramv.a, paramv.d());
    o(paramv.c() * 8);
  }
  
  public void m(byte[] paramArrayOfbyte) {
    n(paramArrayOfbyte, paramArrayOfbyte.length);
  }
  
  public void n(byte[] paramArrayOfbyte, int paramInt) {
    this.a = paramArrayOfbyte;
    this.b = 0;
    this.c = 0;
    this.d = paramInt;
  }
  
  public void o(int paramInt) {
    int i = paramInt / 8;
    this.b = i;
    this.c = paramInt - i * 8;
    a();
  }
  
  public void p() {
    int i = this.c + 1;
    this.c = i;
    if (i == 8) {
      this.c = 0;
      this.b++;
    } 
    a();
  }
  
  public void q(int paramInt) {
    int i = paramInt / 8;
    int j = this.b + i;
    this.b = j;
    paramInt = this.c + paramInt - i * 8;
    this.c = paramInt;
    if (paramInt > 7) {
      this.b = j + 1;
      this.c = paramInt - 8;
    } 
    a();
  }
  
  public void r(int paramInt) {
    boolean bool;
    if (this.c == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.b += paramInt;
    a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */