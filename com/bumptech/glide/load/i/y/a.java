package com.bumptech.glide.load.i.y;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.j;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.i.g;
import com.bumptech.glide.load.i.m;
import com.bumptech.glide.load.i.n;
import com.bumptech.glide.load.i.o;
import com.bumptech.glide.load.i.r;
import java.io.InputStream;

public class a implements n<g, InputStream> {
  public static final d<Integer> a = d.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
  
  private final m<g, g> b;
  
  public a(m<g, g> paramm) {
    this.b = paramm;
  }
  
  public n.a<InputStream> c(g paramg, int paramInt1, int paramInt2, e parame) {
    m<g, g> m1 = this.b;
    g g1 = paramg;
    if (m1 != null) {
      g1 = (g)m1.a(paramg, 0, 0);
      if (g1 == null) {
        this.b.b(paramg, 0, 0, paramg);
        g1 = paramg;
      } 
    } 
    return new n.a((c)g1, (d)new j(g1, ((Integer)parame.c(a)).intValue()));
  }
  
  public boolean d(g paramg) {
    return true;
  }
  
  public static class a implements o<g, InputStream> {
    private final m<g, g> a = new m(500L);
    
    public n<g, InputStream> b(r param1r) {
      return new a(this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/y/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */