package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

public final class je2 implements le2 {
  private static final byte[] a = new byte[4096];
  
  private final ti2 b;
  
  private final long c;
  
  private long d;
  
  private byte[] e;
  
  private int f;
  
  private int g;
  
  public je2(ti2 paramti2, long paramLong1, long paramLong2) {
    this.b = paramti2;
    this.d = paramLong1;
    this.c = paramLong2;
    this.e = new byte[65536];
  }
  
  private final int h(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (!Thread.interrupted()) {
      paramInt1 = this.b.read(paramArrayOfbyte, paramInt1 + paramInt3, paramInt2 - paramInt3);
      if (paramInt1 == -1) {
        if (paramInt3 == 0 && paramBoolean)
          return -1; 
        throw new EOFException();
      } 
      return paramInt3 + paramInt1;
    } 
    throw new InterruptedException();
  }
  
  private final int i(int paramInt) {
    paramInt = Math.min(this.g, paramInt);
    j(paramInt);
    return paramInt;
  }
  
  private final void j(int paramInt) {
    byte[] arrayOfByte2;
    int i = this.g - paramInt;
    this.g = i;
    this.f = 0;
    byte[] arrayOfByte1 = this.e;
    if (i < arrayOfByte1.length - 524288) {
      arrayOfByte2 = new byte[65536 + i];
    } else {
      arrayOfByte2 = arrayOfByte1;
    } 
    System.arraycopy(arrayOfByte1, paramInt, arrayOfByte2, 0, i);
    this.e = arrayOfByte2;
  }
  
  private final void k(int paramInt) {
    if (paramInt != -1)
      this.d += paramInt; 
  }
  
  private final int l(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.g;
    if (i == 0)
      return 0; 
    paramInt2 = Math.min(i, paramInt2);
    System.arraycopy(this.e, 0, paramArrayOfbyte, paramInt1, paramInt2);
    j(paramInt2);
    return paramInt2;
  }
  
  private final boolean m(int paramInt, boolean paramBoolean) {
    int i = this.f + paramInt;
    byte[] arrayOfByte = this.e;
    if (i > arrayOfByte.length) {
      i = wj2.o(arrayOfByte.length << 1, 65536 + i, i + 524288);
      this.e = Arrays.copyOf(this.e, i);
    } 
    i = Math.min(this.g - this.f, paramInt);
    while (i < paramInt) {
      int j = h(this.e, this.f, paramInt, i, false);
      i = j;
      if (j == -1)
        return false; 
    } 
    paramInt = this.f + paramInt;
    this.f = paramInt;
    this.g = Math.max(this.g, paramInt);
    return true;
  }
  
  public final long a() {
    return this.d;
  }
  
  public final void b() {
    this.f = 0;
  }
  
  public final void c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (m(paramInt2, false))
      System.arraycopy(this.e, this.f - paramInt2, paramArrayOfbyte, paramInt1, paramInt2); 
  }
  
  public final void d(int paramInt) {
    m(paramInt, false);
  }
  
  public final boolean e(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    int i;
    for (i = l(paramArrayOfbyte, paramInt1, paramInt2); i < paramInt2 && i != -1; i = h(paramArrayOfbyte, paramInt1, paramInt2, i, paramBoolean));
    k(i);
    return (i != -1);
  }
  
  public final int f(int paramInt) {
    int i = i(paramInt);
    int j = i;
    if (i == 0) {
      byte[] arrayOfByte = a;
      j = h(arrayOfByte, 0, Math.min(paramInt, arrayOfByte.length), 0, true);
    } 
    k(j);
    return j;
  }
  
  public final void g(int paramInt) {
    int i;
    for (i = i(paramInt); i < paramInt && i != -1; i = h(arrayOfByte, -i, Math.min(paramInt, arrayOfByte.length + i), i, false))
      byte[] arrayOfByte = a; 
    k(i);
  }
  
  public final long getLength() {
    return this.c;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = l(paramArrayOfbyte, paramInt1, paramInt2);
    int j = i;
    if (i == 0)
      j = h(paramArrayOfbyte, paramInt1, paramInt2, 0, true); 
    k(j);
    return j;
  }
  
  public final void readFully(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    e(paramArrayOfbyte, paramInt1, paramInt2, false);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/je2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */