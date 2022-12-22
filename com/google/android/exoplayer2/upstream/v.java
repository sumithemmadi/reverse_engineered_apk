package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public final class v<T> implements Loader.e {
  public final l a;
  
  public final int b;
  
  private final w c;
  
  private final a<? extends T> d;
  
  private volatile T e;
  
  public v(j paramj, Uri paramUri, int paramInt, a<? extends T> parama) {
    this(paramj, new l(paramUri, 1), paramInt, parama);
  }
  
  public v(j paramj, l paraml, int paramInt, a<? extends T> parama) {
    this.c = new w(paramj);
    this.a = paraml;
    this.b = paramInt;
    this.d = parama;
  }
  
  public final void a() {}
  
  public final void b() {
    this.c.d();
    k k = new k(this.c, this.a);
    try {
      k.c();
      Uri uri = (Uri)e.e(this.c.e0());
      this.e = this.d.a(uri, k);
      return;
    } finally {
      h0.k(k);
    } 
  }
  
  public long c() {
    return this.c.a();
  }
  
  public Map<String, List<String>> d() {
    return this.c.c();
  }
  
  public final T e() {
    return this.e;
  }
  
  public Uri f() {
    return this.c.b();
  }
  
  public static interface a<T> {
    T a(Uri param1Uri, InputStream param1InputStream);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */