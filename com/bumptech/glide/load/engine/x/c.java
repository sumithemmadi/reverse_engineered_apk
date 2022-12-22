package com.bumptech.glide.load.engine.x;

import android.graphics.Bitmap;
import com.bumptech.glide.p.k;

class c implements l {
  private final b a = new b();
  
  private final h<a, Bitmap> b = new h<a, Bitmap>();
  
  static String g(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    stringBuilder.append(paramInt1);
    stringBuilder.append("x");
    stringBuilder.append(paramInt2);
    stringBuilder.append("], ");
    stringBuilder.append(paramConfig);
    return stringBuilder.toString();
  }
  
  private static String h(Bitmap paramBitmap) {
    return g(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
  }
  
  public Bitmap a() {
    return this.b.f();
  }
  
  public String b(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return g(paramInt1, paramInt2, paramConfig);
  }
  
  public void c(Bitmap paramBitmap) {
    a a = this.a.e(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
    this.b.d(a, paramBitmap);
  }
  
  public Bitmap d(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    a a = this.a.e(paramInt1, paramInt2, paramConfig);
    return this.b.a(a);
  }
  
  public int e(Bitmap paramBitmap) {
    return k.g(paramBitmap);
  }
  
  public String f(Bitmap paramBitmap) {
    return h(paramBitmap);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("AttributeStrategy:\n  ");
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
  
  static class a implements m {
    private final c.b a;
    
    private int b;
    
    private int c;
    
    private Bitmap.Config d;
    
    public a(c.b param1b) {
      this.a = param1b;
    }
    
    public void a() {
      this.a.c(this);
    }
    
    public void b(int param1Int1, int param1Int2, Bitmap.Config param1Config) {
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Config;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = param1Object instanceof a;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (bool) {
        param1Object = param1Object;
        bool2 = bool1;
        if (this.b == ((a)param1Object).b) {
          bool2 = bool1;
          if (this.c == ((a)param1Object).c) {
            bool2 = bool1;
            if (this.d == ((a)param1Object).d)
              bool2 = true; 
          } 
        } 
      } 
      return bool2;
    }
    
    public int hashCode() {
      byte b1;
      int i = this.b;
      int j = this.c;
      Bitmap.Config config = this.d;
      if (config != null) {
        b1 = config.hashCode();
      } else {
        b1 = 0;
      } 
      return (i * 31 + j) * 31 + b1;
    }
    
    public String toString() {
      return c.g(this.b, this.c, this.d);
    }
  }
  
  static class b extends d<a> {
    protected c.a d() {
      return new c.a(this);
    }
    
    c.a e(int param1Int1, int param1Int2, Bitmap.Config param1Config) {
      c.a a = (c.a)b();
      a.b(param1Int1, param1Int2, param1Config);
      return a;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/x/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */