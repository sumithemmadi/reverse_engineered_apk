package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class ui2 implements ti2 {
  private final byte[] b;
  
  private Uri c;
  
  private int d;
  
  private int e;
  
  public ui2(byte[] paramArrayOfbyte) {
    boolean bool;
    jj2.d(paramArrayOfbyte);
    if (paramArrayOfbyte.length > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.a(bool);
    this.b = paramArrayOfbyte;
  }
  
  public final long a(xi2 paramxi2) {
    this.c = paramxi2.a;
    long l1 = paramxi2.d;
    int i = (int)l1;
    this.d = i;
    long l2 = paramxi2.e;
    long l3 = l2;
    if (l2 == -1L)
      l3 = this.b.length - l1; 
    int j = (int)l3;
    this.e = j;
    if (j > 0 && i + j <= this.b.length)
      return j; 
    i = this.d;
    l3 = paramxi2.e;
    j = this.b.length;
    StringBuilder stringBuilder = new StringBuilder(77);
    stringBuilder.append("Unsatisfiable range: [");
    stringBuilder.append(i);
    stringBuilder.append(", ");
    stringBuilder.append(l3);
    stringBuilder.append("], length: ");
    stringBuilder.append(j);
    throw new IOException(stringBuilder.toString());
  }
  
  public final void close() {
    this.c = null;
  }
  
  public final Uri e0() {
    return this.c;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return 0; 
    int i = this.e;
    if (i == 0)
      return -1; 
    paramInt2 = Math.min(paramInt2, i);
    System.arraycopy(this.b, this.d, paramArrayOfbyte, paramInt1, paramInt2);
    this.d += paramInt2;
    this.e -= paramInt2;
    return paramInt2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ui2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */