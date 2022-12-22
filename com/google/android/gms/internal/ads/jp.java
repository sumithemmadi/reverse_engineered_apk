package com.google.android.gms.internal.ads;

import android.net.Uri;

final class jp implements ti2 {
  private final ti2 b;
  
  private final long c;
  
  private final ti2 d;
  
  private long e;
  
  private Uri f;
  
  jp(ti2 paramti21, int paramInt, ti2 paramti22) {
    this.b = paramti21;
    this.c = paramInt;
    this.d = paramti22;
  }
  
  public final long a(xi2 paramxi2) {
    xi2 xi22;
    this.f = paramxi2.a;
    long l1 = paramxi2.d;
    long l2 = this.c;
    xi2 xi21 = null;
    if (l1 >= l2) {
      xi22 = null;
    } else {
      long l = paramxi2.e;
      if (l != -1L) {
        l2 = Math.min(l, l2 - l1);
      } else {
        l2 -= l1;
      } 
      xi22 = new xi2(paramxi2.a, l1, l2, null);
    } 
    l2 = paramxi2.e;
    if (l2 == -1L || paramxi2.d + l2 > this.c) {
      l1 = Math.max(this.c, paramxi2.d);
      l2 = paramxi2.e;
      if (l2 != -1L) {
        l2 = Math.min(l2, paramxi2.d + l2 - this.c);
      } else {
        l2 = -1L;
      } 
      xi21 = new xi2(paramxi2.a, l1, l2, null);
    } 
    l1 = 0L;
    if (xi22 != null) {
      l2 = this.b.a(xi22);
    } else {
      l2 = 0L;
    } 
    if (xi21 != null)
      l1 = this.d.a(xi21); 
    this.e = paramxi2.d;
    return (l2 == -1L || l1 == -1L) ? -1L : (l2 + l1);
  }
  
  public final void close() {
    this.b.close();
    this.d.close();
  }
  
  public final Uri e0() {
    return this.f;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte b;
    long l1 = this.e;
    long l2 = this.c;
    if (l1 < l2) {
      b = (int)Math.min(paramInt2, l2 - l1);
      b = this.b.read(paramArrayOfbyte, paramInt1, b);
      this.e += b;
    } else {
      b = 0;
    } 
    int i = b;
    if (this.e >= this.c) {
      paramInt1 = this.d.read(paramArrayOfbyte, paramInt1 + b, paramInt2 - b);
      i = b + paramInt1;
      this.e += paramInt1;
    } 
    return i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */