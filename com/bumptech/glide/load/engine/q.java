package com.bumptech.glide.load.engine;

import b.h.j.f;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.e;
import com.bumptech.glide.p.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q<Data, ResourceType, Transcode> {
  private final Class<Data> a;
  
  private final f<List<Throwable>> b;
  
  private final List<? extends g<Data, ResourceType, Transcode>> c;
  
  private final String d;
  
  public q(Class<Data> paramClass, Class<ResourceType> paramClass1, Class<Transcode> paramClass2, List<g<Data, ResourceType, Transcode>> paramList, f<List<Throwable>> paramf) {
    this.a = paramClass;
    this.b = paramf;
    this.c = (List<? extends g<Data, ResourceType, Transcode>>)j.c(paramList);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed LoadPath{");
    stringBuilder.append(paramClass.getSimpleName());
    stringBuilder.append("->");
    stringBuilder.append(paramClass1.getSimpleName());
    stringBuilder.append("->");
    stringBuilder.append(paramClass2.getSimpleName());
    stringBuilder.append("}");
    this.d = stringBuilder.toString();
  }
  
  private s<Transcode> b(e<Data> parame, e parame1, int paramInt1, int paramInt2, g.a<ResourceType> parama, List<Throwable> paramList) {
    s<Transcode> s;
    int i = this.c.size();
    g g = null;
    byte b = 0;
    while (true) {
      g g1 = g;
      if (b < i) {
        s<Transcode> s1;
        g1 = this.c.get(b);
        try {
          s = g1.a(parame, paramInt1, paramInt2, parame1, parama);
          s1 = s;
        } catch (GlideException glideException1) {
          paramList.add(glideException1);
        } 
        if (s1 != null) {
          s = s1;
          break;
        } 
        b++;
        continue;
      } 
      break;
    } 
    if (s != null)
      return s; 
    GlideException glideException = new GlideException(this.d, new ArrayList<Throwable>(paramList));
    throw glideException;
  }
  
  public s<Transcode> a(e<Data> parame, e parame1, int paramInt1, int paramInt2, g.a<ResourceType> parama) {
    List<Throwable> list = (List)j.d(this.b.b());
    try {
      return b(parame, parame1, paramInt1, paramInt2, parama, list);
    } finally {
      this.b.c(list);
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LoadPath{decodePaths=");
    stringBuilder.append(Arrays.toString(this.c.toArray()));
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */