package com.bumptech.glide.load.i;

import android.net.Uri;
import com.bumptech.glide.load.e;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class x<Data> implements n<Uri, Data> {
  private static final Set<String> a = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(new String[] { "http", "https" })));
  
  private final n<g, Data> b;
  
  public x(n<g, Data> paramn) {
    this.b = paramn;
  }
  
  public n.a<Data> c(Uri paramUri, int paramInt1, int paramInt2, e parame) {
    g g = new g(paramUri.toString());
    return this.b.b(g, paramInt1, paramInt2, parame);
  }
  
  public boolean d(Uri paramUri) {
    return a.contains(paramUri.getScheme());
  }
  
  public static class a implements o<Uri, InputStream> {
    public n<Uri, InputStream> b(r param1r) {
      return new x<InputStream>(param1r.d(g.class, InputStream.class));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */