package com.bumptech.glide.load.engine.y;

import b.h.j.f;
import com.bumptech.glide.load.c;
import com.bumptech.glide.p.g;
import com.bumptech.glide.p.k;
import com.bumptech.glide.p.l.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class j {
  private final g<c, String> a = new g(1000L);
  
  private final f<b> b = com.bumptech.glide.p.l.a.d(10, new a(this));
  
  private String a(c paramc) {
    b b = (b)com.bumptech.glide.p.j.d(this.b.b());
    try {
      paramc.a(b.b);
      return k.v(b.b.digest());
    } finally {
      this.b.c(b);
    } 
  }
  
  public String b(c paramc) {
    g<c, String> g1;
    String str;
    synchronized (this.a) {
      String str1 = (String)this.a.g(paramc);
      str = str1;
      if (str1 == null)
        str = a(paramc); 
      synchronized (this.a) {
        this.a.k(paramc, str);
        return str;
      } 
    } 
  }
  
  class a implements com.bumptech.glide.p.l.a.d<b> {
    a(j this$0) {}
    
    public j.b b() {
      try {
        return new j.b(MessageDigest.getInstance("SHA-256"));
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        throw new RuntimeException(noSuchAlgorithmException);
      } 
    }
  }
  
  private static final class b implements com.bumptech.glide.p.l.a.f {
    final MessageDigest b;
    
    private final c c = c.a();
    
    b(MessageDigest param1MessageDigest) {
      this.b = param1MessageDigest;
    }
    
    public c i() {
      return this.c;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/y/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */