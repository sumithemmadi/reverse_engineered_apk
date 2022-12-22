package com.bumptech.glide.load;

import com.bumptech.glide.p.j;
import java.security.MessageDigest;

public final class d<T> {
  private static final b<Object> a = new a();
  
  private final T b;
  
  private final b<T> c;
  
  private final String d;
  
  private volatile byte[] e;
  
  private d(String paramString, T paramT, b<T> paramb) {
    this.d = j.b(paramString);
    this.b = paramT;
    this.c = (b<T>)j.d(paramb);
  }
  
  public static <T> d<T> a(String paramString, T paramT, b<T> paramb) {
    return new d<T>(paramString, paramT, paramb);
  }
  
  private static <T> b<T> b() {
    return (b)a;
  }
  
  private byte[] d() {
    if (this.e == null)
      this.e = this.d.getBytes(c.a); 
    return this.e;
  }
  
  public static <T> d<T> e(String paramString) {
    return new d<T>(paramString, null, b());
  }
  
  public static <T> d<T> f(String paramString, T paramT) {
    return new d<T>(paramString, paramT, b());
  }
  
  public T c() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof d) {
      paramObject = paramObject;
      return this.d.equals(((d)paramObject).d);
    } 
    return false;
  }
  
  public void g(T paramT, MessageDigest paramMessageDigest) {
    this.c.a(d(), paramT, paramMessageDigest);
  }
  
  public int hashCode() {
    return this.d.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Option{key='");
    stringBuilder.append(this.d);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  class a implements b<Object> {
    public void a(byte[] param1ArrayOfbyte, Object param1Object, MessageDigest param1MessageDigest) {}
  }
  
  public static interface b<T> {
    void a(byte[] param1ArrayOfbyte, T param1T, MessageDigest param1MessageDigest);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */