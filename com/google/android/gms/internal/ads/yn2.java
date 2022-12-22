package com.google.android.gms.internal.ads;

import java.io.InputStream;

public final class yn2 {
  private final InputStream a;
  
  private final boolean b;
  
  private final boolean c;
  
  private final long d;
  
  private final boolean e;
  
  private yn2(InputStream paramInputStream, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3) {
    this.a = paramInputStream;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramLong;
    this.e = paramBoolean3;
  }
  
  public static yn2 b(InputStream paramInputStream, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3) {
    return new yn2(paramInputStream, paramBoolean1, paramBoolean2, paramLong, paramBoolean3);
  }
  
  public final InputStream a() {
    return this.a;
  }
  
  public final boolean c() {
    return this.b;
  }
  
  public final boolean d() {
    return this.e;
  }
  
  public final long e() {
    return this.d;
  }
  
  public final boolean f() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */