package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.util.h0;
import java.io.EOFException;
import java.util.Arrays;

public final class e implements i {
  private final byte[] a;
  
  private final j b;
  
  private final long c;
  
  private long d;
  
  private byte[] e;
  
  private int f;
  
  private int g;
  
  public e(j paramj, long paramLong1, long paramLong2) {
    this.b = paramj;
    this.d = paramLong1;
    this.c = paramLong2;
    this.e = new byte[65536];
    this.a = new byte[4096];
  }
  
  private void l(int paramInt) {
    if (paramInt != -1)
      this.d += paramInt; 
  }
  
  private void m(int paramInt) {
    paramInt = this.f + paramInt;
    byte[] arrayOfByte = this.e;
    if (paramInt > arrayOfByte.length) {
      paramInt = h0.n(arrayOfByte.length * 2, 65536 + paramInt, paramInt + 524288);
      this.e = Arrays.copyOf(this.e, paramInt);
    } 
  }
  
  private int n(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
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
  
  private int o(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int k = this.g;
    if (k == 0)
      return 0; 
    paramInt2 = Math.min(k, paramInt2);
    System.arraycopy(this.e, 0, paramArrayOfbyte, paramInt1, paramInt2);
    r(paramInt2);
    return paramInt2;
  }
  
  private int p(int paramInt) {
    paramInt = Math.min(this.g, paramInt);
    r(paramInt);
    return paramInt;
  }
  
  private void r(int paramInt) {
    byte[] arrayOfByte2;
    int k = this.g - paramInt;
    this.g = k;
    this.f = 0;
    byte[] arrayOfByte1 = this.e;
    if (k < arrayOfByte1.length - 524288) {
      arrayOfByte2 = new byte[65536 + k];
    } else {
      arrayOfByte2 = arrayOfByte1;
    } 
    System.arraycopy(arrayOfByte1, paramInt, arrayOfByte2, 0, k);
    this.e = arrayOfByte2;
  }
  
  public long a() {
    return this.d;
  }
  
  public boolean b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    int k;
    for (k = o(paramArrayOfbyte, paramInt1, paramInt2); k < paramInt2 && k != -1; k = n(paramArrayOfbyte, paramInt1, paramInt2, k, paramBoolean));
    l(k);
    if (k != -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    return paramBoolean;
  }
  
  public boolean c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (!j(paramInt2, paramBoolean))
      return false; 
    System.arraycopy(this.e, this.f - paramInt2, paramArrayOfbyte, paramInt1, paramInt2);
    return true;
  }
  
  public long d() {
    return this.d + this.f;
  }
  
  public void e(int paramInt) {
    j(paramInt, false);
  }
  
  public int f(int paramInt) {
    int k = p(paramInt);
    int m = k;
    if (k == 0) {
      byte[] arrayOfByte = this.a;
      m = n(arrayOfByte, 0, Math.min(paramInt, arrayOfByte.length), 0, true);
    } 
    l(m);
    return m;
  }
  
  public int g(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    m(paramInt2);
    int k = this.g;
    int m = this.f;
    k -= m;
    if (k == 0) {
      paramInt2 = n(this.e, m, paramInt2, 0, true);
      if (paramInt2 == -1)
        return -1; 
      this.g += paramInt2;
    } else {
      paramInt2 = Math.min(paramInt2, k);
    } 
    System.arraycopy(this.e, this.f, paramArrayOfbyte, paramInt1, paramInt2);
    this.f += paramInt2;
    return paramInt2;
  }
  
  public long getLength() {
    return this.c;
  }
  
  public void h() {
    this.f = 0;
  }
  
  public void i(int paramInt) {
    q(paramInt, false);
  }
  
  public boolean j(int paramInt, boolean paramBoolean) {
    m(paramInt);
    int k = this.g - this.f;
    while (k < paramInt) {
      k = n(this.e, this.f, paramInt, k, paramBoolean);
      if (k == -1)
        return false; 
      this.g = this.f + k;
    } 
    this.f += paramInt;
    return true;
  }
  
  public void k(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    c(paramArrayOfbyte, paramInt1, paramInt2, false);
  }
  
  public boolean q(int paramInt, boolean paramBoolean) {
    int k;
    for (k = p(paramInt); k < paramInt && k != -1; k = n(this.a, -k, m, k, paramBoolean))
      int m = Math.min(paramInt, this.a.length + k); 
    l(k);
    if (k != -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    return paramBoolean;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int k = o(paramArrayOfbyte, paramInt1, paramInt2);
    int m = k;
    if (k == 0)
      m = n(paramArrayOfbyte, paramInt1, paramInt2, 0, true); 
    l(m);
    return m;
  }
  
  public void readFully(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    b(paramArrayOfbyte, paramInt1, paramInt2, false);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */