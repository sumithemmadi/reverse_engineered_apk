package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class pd2 implements ad2 {
  private int b;
  
  private int c;
  
  private int[] d;
  
  private boolean e;
  
  private int[] f;
  
  private ByteBuffer g;
  
  private ByteBuffer h;
  
  private boolean i;
  
  public pd2() {
    ByteBuffer byteBuffer = ad2.a;
    this.g = byteBuffer;
    this.h = byteBuffer;
    this.b = -1;
    this.c = -1;
  }
  
  public final void a() {
    flush();
    this.g = ad2.a;
    this.b = -1;
    this.c = -1;
    this.f = null;
    this.e = false;
  }
  
  public final boolean b() {
    return (this.i && this.h == ad2.a);
  }
  
  public final boolean c() {
    return this.e;
  }
  
  public final void d() {
    this.i = true;
  }
  
  public final void e(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = (j - i) / this.b * 2 * this.f.length << 1;
    if (this.g.capacity() < k) {
      this.g = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
    } else {
      this.g.clear();
    } 
    while (i < j) {
      for (int m : this.f)
        this.g.putShort(paramByteBuffer.getShort(m * 2 + i)); 
      i += this.b << 1;
    } 
    paramByteBuffer.position(j);
    this.g.flip();
    this.h = this.g;
  }
  
  public final ByteBuffer f() {
    ByteBuffer byteBuffer = this.h;
    this.h = ad2.a;
    return byteBuffer;
  }
  
  public final void flush() {
    this.h = ad2.a;
    this.i = false;
  }
  
  public final int g() {
    int[] arrayOfInt = this.f;
    return (arrayOfInt == null) ? this.b : arrayOfInt.length;
  }
  
  public final boolean h(int paramInt1, int paramInt2, int paramInt3) {
    int i = Arrays.equals(this.d, this.f) ^ true;
    int[] arrayOfInt = this.d;
    this.f = arrayOfInt;
    if (arrayOfInt == null) {
      this.e = false;
      return i;
    } 
    if (paramInt3 == 2) {
      if (i == 0 && this.c == paramInt1 && this.b == paramInt2)
        return false; 
      this.c = paramInt1;
      this.b = paramInt2;
      if (paramInt2 != arrayOfInt.length) {
        i = 1;
      } else {
        i = 0;
      } 
      this.e = i;
      byte b = 0;
      while (true) {
        arrayOfInt = this.f;
        if (b < arrayOfInt.length) {
          int j = arrayOfInt[b];
          if (j < paramInt2) {
            int k = this.e;
            if (j != b) {
              j = 1;
            } else {
              j = 0;
            } 
            this.e = j | k;
            b++;
            continue;
          } 
          throw new zzii(paramInt1, paramInt2, paramInt3);
        } 
        return true;
      } 
    } 
    zzii zzii = new zzii(paramInt1, paramInt2, paramInt3);
    throw zzii;
  }
  
  public final int i() {
    return 2;
  }
  
  public final void j(int[] paramArrayOfint) {
    this.d = paramArrayOfint;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */