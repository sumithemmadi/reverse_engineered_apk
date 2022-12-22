package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.y.a;
import java.io.File;

class d<DataType> implements a.b {
  private final a<DataType> a;
  
  private final DataType b;
  
  private final e c;
  
  d(a<DataType> parama, DataType paramDataType, e parame) {
    this.a = parama;
    this.b = paramDataType;
    this.c = parame;
  }
  
  public boolean a(File paramFile) {
    return this.a.a(this.b, paramFile, this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */