package com.bumptech.glide.load.i;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.p.j;
import java.util.Collections;
import java.util.List;

public interface n<Model, Data> {
  boolean a(Model paramModel);
  
  a<Data> b(Model paramModel, int paramInt1, int paramInt2, e parame);
  
  public static class a<Data> {
    public final c a;
    
    public final List<c> b;
    
    public final d<Data> c;
    
    public a(c param1c, d<Data> param1d) {
      this(param1c, Collections.emptyList(), param1d);
    }
    
    public a(c param1c, List<c> param1List, d<Data> param1d) {
      this.a = (c)j.d(param1c);
      this.b = (List<c>)j.d(param1List);
      this.c = (d<Data>)j.d(param1d);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */