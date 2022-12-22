package com.bumptech.glide.o;

import com.bumptech.glide.load.c;
import com.bumptech.glide.p.j;
import java.security.MessageDigest;

public final class d implements c {
  private final Object b;
  
  public d(Object paramObject) {
    this.b = j.d(paramObject);
  }
  
  public void a(MessageDigest paramMessageDigest) {
    paramMessageDigest.update(this.b.toString().getBytes(c.a));
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof d) {
      paramObject = paramObject;
      return this.b.equals(((d)paramObject).b);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.b.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ObjectKey{object=");
    stringBuilder.append(this.b);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */