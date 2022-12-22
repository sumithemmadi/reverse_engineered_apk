package com.bumptech.glide.load.i.y;

import com.bumptech.glide.load.i.g;
import com.bumptech.glide.load.i.n;
import com.bumptech.glide.load.i.o;
import com.bumptech.glide.load.i.r;
import java.io.InputStream;
import java.net.URL;

public class e implements n<URL, InputStream> {
  private final n<g, InputStream> a;
  
  public e(n<g, InputStream> paramn) {
    this.a = paramn;
  }
  
  public n.a<InputStream> c(URL paramURL, int paramInt1, int paramInt2, com.bumptech.glide.load.e parame) {
    return this.a.b(new g(paramURL), paramInt1, paramInt2, parame);
  }
  
  public boolean d(URL paramURL) {
    return true;
  }
  
  public static class a implements o<URL, InputStream> {
    public n<URL, InputStream> b(r param1r) {
      return new e(param1r.d(g.class, InputStream.class));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/y/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */