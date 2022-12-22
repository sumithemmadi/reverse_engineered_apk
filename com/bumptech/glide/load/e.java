package com.bumptech.glide.load;

import b.e.a;
import b.e.g;
import com.bumptech.glide.p.b;
import java.security.MessageDigest;

public final class e implements c {
  private final a<d<?>, Object> b = (a<d<?>, Object>)new b();
  
  private static <T> void f(d<T> paramd, Object paramObject, MessageDigest paramMessageDigest) {
    paramd.g((T)paramObject, paramMessageDigest);
  }
  
  public void a(MessageDigest paramMessageDigest) {
    for (byte b = 0; b < this.b.size(); b++)
      f((d)this.b.i(b), this.b.m(b), paramMessageDigest); 
  }
  
  public <T> T c(d<T> paramd) {
    Object object;
    if (this.b.containsKey(paramd)) {
      object = this.b.get(paramd);
    } else {
      object = object.c();
    } 
    return (T)object;
  }
  
  public void d(e parame) {
    this.b.j((g)parame.b);
  }
  
  public <T> e e(d<T> paramd, T paramT) {
    this.b.put(paramd, paramT);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof e) {
      paramObject = paramObject;
      return this.b.equals(((e)paramObject).b);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.b.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Options{values=");
    stringBuilder.append(this.b);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */