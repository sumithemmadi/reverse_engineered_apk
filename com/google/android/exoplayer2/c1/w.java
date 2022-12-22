package com.google.android.exoplayer2.c1;

public final class w {
  private final byte[] a;
  
  private final int b;
  
  private int c;
  
  private int d;
  
  public w(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
    this.b = paramArrayOfbyte.length;
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
  
  public int b() {
    return this.c * 8 + this.d;
  }
  
  public boolean c() {
    boolean bool;
    if (((this.a[this.c] & 0xFF) >> this.d & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    e(1);
    return bool;
  }
  
  public int d(int paramInt) {
    int i = this.c;
    int j = Math.min(paramInt, 8 - this.d);
    byte[] arrayOfByte = this.a;
    int k = i + 1;
    i = (arrayOfByte[i] & 0xFF) >> this.d & 255 >> 8 - j;
    while (j < paramInt) {
      i |= (this.a[k] & 0xFF) << j;
      j += 8;
      k++;
    } 
    e(paramInt);
    return i & -1 >>> 32 - paramInt;
  }
  
  public void e(int paramInt) {
    int i = paramInt / 8;
    int j = this.c + i;
    this.c = j;
    paramInt = this.d + paramInt - i * 8;
    this.d = paramInt;
    if (paramInt > 7) {
      this.c = j + 1;
      this.d = paramInt - 8;
    } 
    a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */