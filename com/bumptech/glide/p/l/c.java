package com.bumptech.glide.p.l;

public abstract class c {
  private c() {}
  
  public static c a() {
    return new b();
  }
  
  abstract void b(boolean paramBoolean);
  
  public abstract void c();
  
  private static class b extends c {
    private volatile boolean a;
    
    b() {
      super(null);
    }
    
    public void b(boolean param1Boolean) {
      this.a = param1Boolean;
    }
    
    public void c() {
      if (!this.a)
        return; 
      throw new IllegalStateException("Already released");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */