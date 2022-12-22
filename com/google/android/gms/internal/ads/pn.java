package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class pn {
  private final int a;
  
  private final List<yp2> b;
  
  private final int c;
  
  private final InputStream d;
  
  private final byte[] e;
  
  public pn(int paramInt, List<yp2> paramList) {
    this(paramInt, paramList, -1, null);
  }
  
  public pn(int paramInt1, List<yp2> paramList, int paramInt2, InputStream paramInputStream) {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramInt2;
    this.d = paramInputStream;
    this.e = null;
  }
  
  public final InputStream a() {
    InputStream inputStream = this.d;
    return (inputStream != null) ? inputStream : null;
  }
  
  public final int b() {
    return this.c;
  }
  
  public final int c() {
    return this.a;
  }
  
  public final List<yp2> d() {
    return Collections.unmodifiableList(this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */