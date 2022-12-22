package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.util.e;
import java.util.Arrays;

final class v {
  private final int a;
  
  private boolean b;
  
  private boolean c;
  
  public byte[] d;
  
  public int e;
  
  public v(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    byte[] arrayOfByte = new byte[paramInt2 + 3];
    this.d = arrayOfByte;
    arrayOfByte[2] = (byte)1;
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (!this.b)
      return; 
    paramInt2 -= paramInt1;
    byte[] arrayOfByte = this.d;
    int i = arrayOfByte.length;
    int j = this.e;
    if (i < j + paramInt2)
      this.d = Arrays.copyOf(arrayOfByte, (j + paramInt2) * 2); 
    System.arraycopy(paramArrayOfbyte, paramInt1, this.d, this.e, paramInt2);
    this.e += paramInt2;
  }
  
  public boolean b(int paramInt) {
    if (!this.b)
      return false; 
    this.e -= paramInt;
    this.b = false;
    this.c = true;
    return true;
  }
  
  public boolean c() {
    return this.c;
  }
  
  public void d() {
    this.b = false;
    this.c = false;
  }
  
  public void e(int paramInt) {
    boolean bool = this.b;
    boolean bool1 = true;
    e.f(bool ^ true);
    if (paramInt != this.a)
      bool1 = false; 
    this.b = bool1;
    if (bool1) {
      this.e = 3;
      this.c = false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */