package com.bumptech.glide.load.engine.y;

import java.io.File;

public class d implements a.a {
  private final long a;
  
  private final a b;
  
  public d(a parama, long paramLong) {
    this.a = paramLong;
    this.b = parama;
  }
  
  public a a() {
    File file = this.b.a();
    return (file == null) ? null : ((file.isDirectory() || file.mkdirs()) ? e.c(file, this.a) : null);
  }
  
  public static interface a {
    File a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/y/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */