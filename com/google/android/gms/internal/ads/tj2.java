package com.google.android.gms.internal.ads;

public final class tj2 {
  private byte[] a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  public tj2(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.a = paramArrayOfbyte;
    this.c = paramInt1;
    this.b = paramInt2;
    this.d = 0;
    h();
  }
  
  private final boolean c(int paramInt) {
    if (2 <= paramInt && paramInt < this.b) {
      byte[] arrayOfByte = this.a;
      if (arrayOfByte[paramInt] == 3 && arrayOfByte[paramInt - 2] == 0 && arrayOfByte[paramInt - 1] == 0)
        return true; 
    } 
    return false;
  }
  
  private final int g() {
    int i = 0;
    byte b;
    for (b = 0; !d(); b++);
    if (b > 0)
      i = a(b); 
    return (1 << b) - 1 + i;
  }
  
  private final void h() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: istore_1
    //   5: iload_1
    //   6: iflt -> 49
    //   9: aload_0
    //   10: getfield d : I
    //   13: istore_2
    //   14: iload_2
    //   15: iflt -> 49
    //   18: iload_2
    //   19: bipush #8
    //   21: if_icmpge -> 49
    //   24: aload_0
    //   25: getfield b : I
    //   28: istore_3
    //   29: iload_1
    //   30: iload_3
    //   31: if_icmplt -> 43
    //   34: iload_1
    //   35: iload_3
    //   36: if_icmpne -> 49
    //   39: iload_2
    //   40: ifne -> 49
    //   43: iconst_1
    //   44: istore #4
    //   46: goto -> 52
    //   49: iconst_0
    //   50: istore #4
    //   52: iload #4
    //   54: invokestatic e : (Z)V
    //   57: return
  }
  
  public final int a(int paramInt) {
    int i = 0;
    if (paramInt == 0)
      return 0; 
    int j = paramInt / 8;
    int k = 0;
    int m = paramInt;
    paramInt = k;
    while (i < j) {
      int i1;
      if (c(this.c + 1)) {
        k = this.c + 2;
      } else {
        k = this.c + 1;
      } 
      int n = this.d;
      if (n != 0) {
        byte[] arrayOfByte = this.a;
        byte b = arrayOfByte[this.c];
        i1 = (arrayOfByte[k] & 0xFF) >>> 8 - n | (b & 0xFF) << n;
      } else {
        i1 = this.a[this.c];
      } 
      m -= 8;
      paramInt |= (0xFF & i1) << m;
      this.c = k;
      i++;
    } 
    i = paramInt;
    if (m > 0) {
      k = this.d + m;
      i = (byte)(255 >> 8 - m);
      if (c(this.c + 1)) {
        m = this.c + 2;
      } else {
        m = this.c + 1;
      } 
      if (k > 8) {
        byte[] arrayOfByte = this.a;
        byte b = arrayOfByte[this.c];
        paramInt = i & ((0xFF & arrayOfByte[m]) >> 16 - k | (b & 0xFF) << k - 8) | paramInt;
        this.c = m;
      } else {
        i = i & (0xFF & this.a[this.c]) >> 8 - k | paramInt;
        paramInt = i;
        if (k == 8) {
          this.c = m;
          paramInt = i;
        } 
      } 
      this.d = k % 8;
      i = paramInt;
    } 
    h();
    return i;
  }
  
  public final void b(int paramInt) {
    int i = this.c;
    int j = paramInt / 8 + i;
    this.c = j;
    int k = this.d + paramInt % 8;
    this.d = k;
    paramInt = i;
    if (k > 7) {
      this.c = j + 1;
      this.d = k - 8;
      paramInt = i;
    } 
    while (true) {
      i = paramInt + 1;
      if (i <= this.c) {
        paramInt = i;
        if (c(i)) {
          this.c++;
          paramInt = i + 2;
        } 
        continue;
      } 
      h();
      return;
    } 
  }
  
  public final boolean d() {
    return (a(1) == 1);
  }
  
  public final int e() {
    return g();
  }
  
  public final int f() {
    byte b;
    int i = g();
    if (i % 2 == 0) {
      b = -1;
    } else {
      b = 1;
    } 
    return b * (i + 1) / 2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */