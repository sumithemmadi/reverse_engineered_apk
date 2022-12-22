package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.h;
import com.bumptech.glide.p.j;
import java.security.MessageDigest;
import java.util.Map;

class l implements c {
  private final Object b;
  
  private final int c;
  
  private final int d;
  
  private final Class<?> e;
  
  private final Class<?> f;
  
  private final c g;
  
  private final Map<Class<?>, h<?>> h;
  
  private final e i;
  
  private int j;
  
  l(Object paramObject, c paramc, int paramInt1, int paramInt2, Map<Class<?>, h<?>> paramMap, Class<?> paramClass1, Class<?> paramClass2, e parame) {
    this.b = j.d(paramObject);
    this.g = (c)j.e(paramc, "Signature must not be null");
    this.c = paramInt1;
    this.d = paramInt2;
    this.h = (Map<Class<?>, h<?>>)j.d(paramMap);
    this.e = (Class)j.e(paramClass1, "Resource class must not be null");
    this.f = (Class)j.e(paramClass2, "Transcode class must not be null");
    this.i = (e)j.d(parame);
  }
  
  public void a(MessageDigest paramMessageDigest) {
    throw new UnsupportedOperationException();
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof l;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (bool) {
      paramObject = paramObject;
      bool2 = bool1;
      if (this.b.equals(((l)paramObject).b)) {
        bool2 = bool1;
        if (this.g.equals(((l)paramObject).g)) {
          bool2 = bool1;
          if (this.d == ((l)paramObject).d) {
            bool2 = bool1;
            if (this.c == ((l)paramObject).c) {
              bool2 = bool1;
              if (this.h.equals(((l)paramObject).h)) {
                bool2 = bool1;
                if (this.e.equals(((l)paramObject).e)) {
                  bool2 = bool1;
                  if (this.f.equals(((l)paramObject).f)) {
                    bool2 = bool1;
                    if (this.i.equals(((l)paramObject).i))
                      bool2 = true; 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    return bool2;
  }
  
  public int hashCode() {
    if (this.j == 0) {
      int i = this.b.hashCode();
      this.j = i;
      i = i * 31 + this.g.hashCode();
      this.j = i;
      i = i * 31 + this.c;
      this.j = i;
      i = i * 31 + this.d;
      this.j = i;
      i = i * 31 + this.h.hashCode();
      this.j = i;
      i = i * 31 + this.e.hashCode();
      this.j = i;
      i = i * 31 + this.f.hashCode();
      this.j = i;
      this.j = i * 31 + this.i.hashCode();
    } 
    return this.j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EngineKey{model=");
    stringBuilder.append(this.b);
    stringBuilder.append(", width=");
    stringBuilder.append(this.c);
    stringBuilder.append(", height=");
    stringBuilder.append(this.d);
    stringBuilder.append(", resourceClass=");
    stringBuilder.append(this.e);
    stringBuilder.append(", transcodeClass=");
    stringBuilder.append(this.f);
    stringBuilder.append(", signature=");
    stringBuilder.append(this.g);
    stringBuilder.append(", hashCode=");
    stringBuilder.append(this.j);
    stringBuilder.append(", transformations=");
    stringBuilder.append(this.h);
    stringBuilder.append(", options=");
    stringBuilder.append(this.i);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */