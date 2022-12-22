package com.google.android.exoplayer2.util;

public final class w {
  private byte[] a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  public w(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    i(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: istore_1
    //   5: iload_1
    //   6: iflt -> 36
    //   9: aload_0
    //   10: getfield b : I
    //   13: istore_2
    //   14: iload_1
    //   15: iload_2
    //   16: if_icmplt -> 31
    //   19: iload_1
    //   20: iload_2
    //   21: if_icmpne -> 36
    //   24: aload_0
    //   25: getfield d : I
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
  
  private int f() {
    int i = 0;
    byte b;
    for (b = 0; !d(); b++);
    if (b > 0)
      i = e(b); 
    return (1 << b) - 1 + i;
  }
  
  private boolean j(int paramInt) {
    null = true;
    if (2 <= paramInt && paramInt < this.b) {
      byte[] arrayOfByte = this.a;
      if (arrayOfByte[paramInt] == 3 && arrayOfByte[paramInt - 2] == 0 && arrayOfByte[paramInt - 1] == 0)
        return null; 
    } 
    return false;
  }
  
  public boolean b(int paramInt) {
    int i = this.c;
    int j = paramInt / 8;
    int k = i + j;
    int m = this.d + paramInt - j * 8;
    paramInt = k;
    j = m;
    if (m > 7) {
      paramInt = k + 1;
      j = m - 8;
    } 
    boolean bool1 = true;
    k = paramInt;
    paramInt = i;
    while (true) {
      i = paramInt + 1;
      if (i <= k && k < this.b) {
        paramInt = i;
        if (j(i)) {
          k++;
          paramInt = i + 2;
        } 
        continue;
      } 
      break;
    } 
    paramInt = this.b;
    boolean bool2 = bool1;
    if (k >= paramInt)
      if (k == paramInt && j == 0) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    return bool2;
  }
  
  public boolean c() {
    boolean bool2;
    int i = this.c;
    int j = this.d;
    boolean bool1 = false;
    byte b;
    for (b = 0; this.c < this.b && !d(); b++);
    if (this.c == this.b) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.c = i;
    this.d = j;
    boolean bool3 = bool1;
    if (!bool2) {
      bool3 = bool1;
      if (b(b * 2 + 1))
        bool3 = true; 
    } 
    return bool3;
  }
  
  public boolean d() {
    boolean bool;
    if ((this.a[this.c] & 128 >> this.d) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    k();
    return bool;
  }
  
  public int e(int paramInt) {
    this.d += paramInt;
    int i = 0;
    while (true) {
      int j = this.d;
      byte b = 2;
      if (j > 8) {
        int m = j - 8;
        this.d = m;
        byte[] arrayOfByte1 = this.a;
        int n = this.c;
        i |= (arrayOfByte1[n] & 0xFF) << m;
        if (!j(n + 1))
          b = 1; 
        this.c = n + b;
        continue;
      } 
      byte[] arrayOfByte = this.a;
      int k = this.c;
      byte b1 = arrayOfByte[k];
      if (j == 8) {
        this.d = 0;
        if (!j(k + 1))
          b = 1; 
        this.c = k + b;
      } 
      a();
      return -1 >>> 32 - paramInt & (i | (b1 & 0xFF) >> 8 - j);
    } 
  }
  
  public int g() {
    byte b;
    int i = f();
    if (i % 2 == 0) {
      b = -1;
    } else {
      b = 1;
    } 
    return b * (i + 1) / 2;
  }
  
  public int h() {
    return f();
  }
  
  public void i(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.a = paramArrayOfbyte;
    this.c = paramInt1;
    this.b = paramInt2;
    this.d = 0;
    a();
  }
  
  public void k() {
    int i = this.d;
    byte b = 1;
    this.d = ++i;
    if (i == 8) {
      this.d = 0;
      i = this.c;
      if (j(i + 1))
        b = 2; 
      this.c = i + b;
    } 
    a();
  }
  
  public void l(int paramInt) {
    int i = this.c;
    int j = paramInt / 8;
    int k = i + j;
    this.c = k;
    j = this.d + paramInt - j * 8;
    this.d = j;
    paramInt = i;
    if (j > 7) {
      this.c = k + 1;
      this.d = j - 8;
      paramInt = i;
    } 
    while (true) {
      i = paramInt + 1;
      if (i <= this.c) {
        paramInt = i;
        if (j(i)) {
          this.c++;
          paramInt = i + 2;
        } 
        continue;
      } 
      a();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */