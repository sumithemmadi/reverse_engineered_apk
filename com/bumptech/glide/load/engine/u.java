package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.h;
import com.bumptech.glide.p.g;
import com.bumptech.glide.p.k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class u implements c {
  private static final g<Class<?>, byte[]> b = new g(50L);
  
  private final b c;
  
  private final c d;
  
  private final c e;
  
  private final int f;
  
  private final int g;
  
  private final Class<?> h;
  
  private final e i;
  
  private final h<?> j;
  
  u(b paramb, c paramc1, c paramc2, int paramInt1, int paramInt2, h<?> paramh, Class<?> paramClass, e parame) {
    this.c = paramb;
    this.d = paramc1;
    this.e = paramc2;
    this.f = paramInt1;
    this.g = paramInt2;
    this.j = paramh;
    this.h = paramClass;
    this.i = parame;
  }
  
  private byte[] c() {
    g<Class<?>, byte[]> g1 = b;
    byte[] arrayOfByte1 = (byte[])g1.g(this.h);
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1 == null) {
      arrayOfByte2 = this.h.getName().getBytes(c.a);
      g1.k(this.h, arrayOfByte2);
    } 
    return arrayOfByte2;
  }
  
  public void a(MessageDigest paramMessageDigest) {
    byte[] arrayOfByte = (byte[])this.c.c(8, byte[].class);
    ByteBuffer.wrap(arrayOfByte).putInt(this.f).putInt(this.g).array();
    this.e.a(paramMessageDigest);
    this.d.a(paramMessageDigest);
    paramMessageDigest.update(arrayOfByte);
    h<?> h1 = this.j;
    if (h1 != null)
      h1.a(paramMessageDigest); 
    this.i.a(paramMessageDigest);
    paramMessageDigest.update(c());
    this.c.d(arrayOfByte);
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof u;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (bool) {
      paramObject = paramObject;
      bool2 = bool1;
      if (this.g == ((u)paramObject).g) {
        bool2 = bool1;
        if (this.f == ((u)paramObject).f) {
          bool2 = bool1;
          if (k.c(this.j, ((u)paramObject).j)) {
            bool2 = bool1;
            if (this.h.equals(((u)paramObject).h)) {
              bool2 = bool1;
              if (this.d.equals(((u)paramObject).d)) {
                bool2 = bool1;
                if (this.e.equals(((u)paramObject).e)) {
                  bool2 = bool1;
                  if (this.i.equals(((u)paramObject).i))
                    bool2 = true; 
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
    int i = ((this.d.hashCode() * 31 + this.e.hashCode()) * 31 + this.f) * 31 + this.g;
    h<?> h1 = this.j;
    int j = i;
    if (h1 != null)
      j = i * 31 + h1.hashCode(); 
    return (j * 31 + this.h.hashCode()) * 31 + this.i.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ResourceCacheKey{sourceKey=");
    stringBuilder.append(this.d);
    stringBuilder.append(", signature=");
    stringBuilder.append(this.e);
    stringBuilder.append(", width=");
    stringBuilder.append(this.f);
    stringBuilder.append(", height=");
    stringBuilder.append(this.g);
    stringBuilder.append(", decodedResourceClass=");
    stringBuilder.append(this.h);
    stringBuilder.append(", transformation='");
    stringBuilder.append(this.j);
    stringBuilder.append('\'');
    stringBuilder.append(", options=");
    stringBuilder.append(this.i);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */