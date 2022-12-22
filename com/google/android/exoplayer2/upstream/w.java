package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.e;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class w implements j {
  private final j b;
  
  private long c;
  
  private Uri d;
  
  private Map<String, List<String>> e;
  
  public w(j paramj) {
    this.b = (j)e.e(paramj);
    this.d = Uri.EMPTY;
    this.e = Collections.emptyMap();
  }
  
  public long a() {
    return this.c;
  }
  
  public Uri b() {
    return this.d;
  }
  
  public Map<String, List<String>> c() {
    return this.e;
  }
  
  public void close() {
    this.b.close();
  }
  
  public void d() {
    this.c = 0L;
  }
  
  public Uri e0() {
    return this.b.e0();
  }
  
  public void f0(x paramx) {
    this.b.f0(paramx);
  }
  
  public long g0(l paraml) {
    this.d = paraml.a;
    this.e = Collections.emptyMap();
    long l1 = this.b.g0(paraml);
    this.d = (Uri)e.e(e0());
    this.e = getResponseHeaders();
    return l1;
  }
  
  public Map<String, List<String>> getResponseHeaders() {
    return this.b.getResponseHeaders();
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt1 = this.b.read(paramArrayOfbyte, paramInt1, paramInt2);
    if (paramInt1 != -1)
      this.c += paramInt1; 
    return paramInt1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */