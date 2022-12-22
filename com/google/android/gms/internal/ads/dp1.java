package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Arrays;

public final class dp1 {
  private final rb2 a;
  
  private final File b;
  
  private final File c;
  
  private final File d;
  
  private byte[] e;
  
  public dp1(rb2 paramrb2, File paramFile1, File paramFile2, File paramFile3) {
    this.a = paramrb2;
    this.b = paramFile1;
    this.c = paramFile3;
    this.d = paramFile2;
  }
  
  public final rb2 a() {
    return this.a;
  }
  
  public final File b() {
    return this.b;
  }
  
  public final File c() {
    return this.c;
  }
  
  public final byte[] d() {
    if (this.e == null)
      this.e = fp1.f(this.d); 
    byte[] arrayOfByte = this.e;
    return (arrayOfByte == null) ? null : Arrays.copyOf(arrayOfByte, arrayOfByte.length);
  }
  
  public final boolean e(long paramLong) {
    return (this.a.V() - System.currentTimeMillis() / 1000L < 3600L);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */