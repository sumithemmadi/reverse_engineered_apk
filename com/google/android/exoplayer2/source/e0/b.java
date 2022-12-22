package com.google.android.exoplayer2.source.e0;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.exoplayer2.util.e;
import java.util.List;
import java.util.Map;

public abstract class b implements Loader.e {
  public final l a;
  
  public final int b;
  
  public final Format c;
  
  public final int d;
  
  public final Object e;
  
  public final long f;
  
  public final long g;
  
  protected final w h;
  
  public b(j paramj, l paraml, int paramInt1, Format paramFormat, int paramInt2, Object paramObject, long paramLong1, long paramLong2) {
    this.h = new w(paramj);
    this.a = (l)e.e(paraml);
    this.b = paramInt1;
    this.c = paramFormat;
    this.d = paramInt2;
    this.e = paramObject;
    this.f = paramLong1;
    this.g = paramLong2;
  }
  
  public final long c() {
    return this.h.a();
  }
  
  public final long d() {
    return this.g - this.f;
  }
  
  public final Map<String, List<String>> e() {
    return this.h.c();
  }
  
  public final Uri f() {
    return this.h.b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/e0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */