package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.d;

interface e {
  boolean b();
  
  void cancel();
  
  public static interface a {
    void a(c param1c, Exception param1Exception, d<?> param1d, DataSource param1DataSource);
    
    void e();
    
    void f(c param1c1, Object param1Object, d<?> param1d, DataSource param1DataSource, c param1c2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */