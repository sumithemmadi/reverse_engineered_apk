package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.c;
import java.security.MessageDigest;

final class c implements c {
  private final c b;
  
  private final c c;
  
  c(c paramc1, c paramc2) {
    this.b = paramc1;
    this.c = paramc2;
  }
  
  public void a(MessageDigest paramMessageDigest) {
    this.b.a(paramMessageDigest);
    this.c.a(paramMessageDigest);
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof c;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (bool) {
      paramObject = paramObject;
      bool2 = bool1;
      if (this.b.equals(((c)paramObject).b)) {
        bool2 = bool1;
        if (this.c.equals(((c)paramObject).c))
          bool2 = true; 
      } 
    } 
    return bool2;
  }
  
  public int hashCode() {
    return this.b.hashCode() * 31 + this.c.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DataCacheKey{sourceKey=");
    stringBuilder.append(this.b);
    stringBuilder.append(", signature=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */