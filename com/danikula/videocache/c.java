package com.danikula.videocache;

import com.danikula.videocache.q.a;
import com.danikula.videocache.q.c;
import com.danikula.videocache.r.b;
import com.danikula.videocache.s.c;
import java.io.File;

class c {
  public final File a;
  
  public final c b;
  
  public final a c;
  
  public final c d;
  
  public final b e;
  
  c(File paramFile, c paramc, a parama, c paramc1, b paramb) {
    this.a = paramFile;
    this.b = paramc;
    this.c = parama;
    this.d = paramc1;
    this.e = paramb;
  }
  
  File a(String paramString) {
    paramString = this.b.a(paramString);
    return new File(this.a, paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */