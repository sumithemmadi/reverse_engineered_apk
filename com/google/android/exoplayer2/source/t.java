package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.v;
import java.util.List;
import java.util.Map;

final class t implements j {
  private final j b;
  
  private final int c;
  
  private final a d;
  
  private final byte[] e;
  
  private int f;
  
  public t(j paramj, int paramInt, a parama) {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.b = paramj;
    this.c = paramInt;
    this.d = parama;
    this.e = new byte[1];
    this.f = paramInt;
  }
  
  private boolean a() {
    int n;
    if (this.b.read(this.e, 0, 1) == -1)
      return false; 
    int i = (this.e[0] & 0xFF) << 4;
    if (i == 0)
      return true; 
    byte[] arrayOfByte = new byte[i];
    int k = i;
    int m = 0;
    while (true) {
      n = i;
      if (k > 0) {
        n = this.b.read(arrayOfByte, m, k);
        if (n == -1)
          return false; 
        m += n;
        k -= n;
        continue;
      } 
      break;
    } 
    while (n > 0 && arrayOfByte[n - 1] == 0)
      n--; 
    if (n > 0)
      this.d.c(new v(arrayOfByte, n)); 
    return true;
  }
  
  public void close() {
    throw new UnsupportedOperationException();
  }
  
  public Uri e0() {
    return this.b.e0();
  }
  
  public void f0(x paramx) {
    this.b.f0(paramx);
  }
  
  public long g0(l paraml) {
    throw new UnsupportedOperationException();
  }
  
  public Map<String, List<String>> getResponseHeaders() {
    return this.b.getResponseHeaders();
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.f == 0)
      if (a()) {
        this.f = this.c;
      } else {
        return -1;
      }  
    paramInt1 = this.b.read(paramArrayOfbyte, paramInt1, Math.min(this.f, paramInt2));
    if (paramInt1 != -1)
      this.f -= paramInt1; 
    return paramInt1;
  }
  
  public static interface a {
    void c(v param1v);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */