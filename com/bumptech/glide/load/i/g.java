package com.bumptech.glide.load.i;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.c;
import com.bumptech.glide.p.j;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class g implements c {
  private final h b;
  
  private final URL c = null;
  
  private final String d;
  
  private String e;
  
  private URL f;
  
  private volatile byte[] g;
  
  private int h;
  
  public g(String paramString) {
    this(paramString, h.b);
  }
  
  public g(String paramString, h paramh) {
    this.d = j.b(paramString);
    this.b = (h)j.d(paramh);
  }
  
  public g(URL paramURL) {
    this(paramURL, h.b);
  }
  
  public g(URL paramURL, h paramh) {
    this.d = null;
    this.b = (h)j.d(paramh);
  }
  
  private byte[] d() {
    if (this.g == null)
      this.g = c().getBytes(c.a); 
    return this.g;
  }
  
  private String f() {
    if (TextUtils.isEmpty(this.e)) {
      String str1 = this.d;
      String str2 = str1;
      if (TextUtils.isEmpty(str1))
        str2 = ((URL)j.d(this.c)).toString(); 
      this.e = Uri.encode(str2, "@#&=*+-_.,:!?()/~'%;$");
    } 
    return this.e;
  }
  
  private URL g() {
    if (this.f == null)
      this.f = new URL(f()); 
    return this.f;
  }
  
  public void a(MessageDigest paramMessageDigest) {
    paramMessageDigest.update(d());
  }
  
  public String c() {
    String str = this.d;
    if (str == null)
      str = ((URL)j.d(this.c)).toString(); 
    return str;
  }
  
  public Map<String, String> e() {
    return this.b.getHeaders();
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof g;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (bool) {
      paramObject = paramObject;
      bool2 = bool1;
      if (c().equals(paramObject.c())) {
        bool2 = bool1;
        if (this.b.equals(((g)paramObject).b))
          bool2 = true; 
      } 
    } 
    return bool2;
  }
  
  public URL h() {
    return g();
  }
  
  public int hashCode() {
    if (this.h == 0) {
      int i = c().hashCode();
      this.h = i;
      this.h = i * 31 + this.b.hashCode();
    } 
    return this.h;
  }
  
  public String toString() {
    return c();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */