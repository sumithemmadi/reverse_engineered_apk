package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class xd2 implements ad2 {
  private int b = -1;
  
  private int c = -1;
  
  private ud2 d;
  
  private float e = 1.0F;
  
  private float f = 1.0F;
  
  private ByteBuffer g;
  
  private ShortBuffer h;
  
  private ByteBuffer i;
  
  private long j;
  
  private long k;
  
  private boolean l;
  
  public xd2() {
    ByteBuffer byteBuffer = ad2.a;
    this.g = byteBuffer;
    this.h = byteBuffer.asShortBuffer();
    this.i = byteBuffer;
  }
  
  public final void a() {
    this.d = null;
    ByteBuffer byteBuffer = ad2.a;
    this.g = byteBuffer;
    this.h = byteBuffer.asShortBuffer();
    this.i = byteBuffer;
    this.b = -1;
    this.c = -1;
    this.j = 0L;
    this.k = 0L;
    this.l = false;
  }
  
  public final boolean b() {
    if (this.l) {
      ud2 ud21 = this.d;
      if (ud21 == null || ud21.j() == 0)
        return true; 
    } 
    return false;
  }
  
  public final boolean c() {
    return (Math.abs(this.e - 1.0F) >= 0.01F || Math.abs(this.f - 1.0F) >= 0.01F);
  }
  
  public final void d() {
    this.d.i();
    this.l = true;
  }
  
  public final void e(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.hasRemaining()) {
      ShortBuffer shortBuffer = paramByteBuffer.asShortBuffer();
      int j = paramByteBuffer.remaining();
      this.j += j;
      this.d.e(shortBuffer);
      paramByteBuffer.position(paramByteBuffer.position() + j);
    } 
    int i = this.d.j() * this.b << 1;
    if (i > 0) {
      if (this.g.capacity() < i) {
        paramByteBuffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        this.g = paramByteBuffer;
        this.h = paramByteBuffer.asShortBuffer();
      } else {
        this.g.clear();
        this.h.clear();
      } 
      this.d.g(this.h);
      this.k += i;
      this.g.limit(i);
      this.i = this.g;
    } 
  }
  
  public final ByteBuffer f() {
    ByteBuffer byteBuffer = this.i;
    this.i = ad2.a;
    return byteBuffer;
  }
  
  public final void flush() {
    ud2 ud21 = new ud2(this.c, this.b);
    this.d = ud21;
    ud21.a(this.e);
    this.d.c(this.f);
    this.i = ad2.a;
    this.j = 0L;
    this.k = 0L;
    this.l = false;
  }
  
  public final int g() {
    return this.b;
  }
  
  public final boolean h(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 == 2) {
      if (this.c == paramInt1 && this.b == paramInt2)
        return false; 
      this.c = paramInt1;
      this.b = paramInt2;
      return true;
    } 
    throw new zzii(paramInt1, paramInt2, paramInt3);
  }
  
  public final int i() {
    return 2;
  }
  
  public final float j(float paramFloat) {
    paramFloat = wj2.a(paramFloat, 0.1F, 8.0F);
    this.e = paramFloat;
    return paramFloat;
  }
  
  public final float k(float paramFloat) {
    this.f = wj2.a(paramFloat, 0.1F, 8.0F);
    return paramFloat;
  }
  
  public final long l() {
    return this.j;
  }
  
  public final long m() {
    return this.k;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */