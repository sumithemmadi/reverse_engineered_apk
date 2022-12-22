package com.bumptech.glide.load.i;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.o.d;

public class v<Model> implements n<Model, Model> {
  private static final v<?> a = new v();
  
  public static <T> v<T> c() {
    return (v)a;
  }
  
  public boolean a(Model paramModel) {
    return true;
  }
  
  public n.a<Model> b(Model paramModel, int paramInt1, int paramInt2, e parame) {
    return new n.a<Model>((c)new d(paramModel), new b<Model>(paramModel));
  }
  
  public static class a<Model> implements o<Model, Model> {
    private static final a<?> a = new a();
    
    public static <T> a<T> a() {
      return (a)a;
    }
    
    public n<Model, Model> b(r param1r) {
      return v.c();
    }
  }
  
  private static class b<Model> implements d<Model> {
    private final Model b;
    
    b(Model param1Model) {
      this.b = param1Model;
    }
    
    public Class<Model> a() {
      return (Class)this.b.getClass();
    }
    
    public void b() {}
    
    public void cancel() {}
    
    public DataSource d() {
      return DataSource.b;
    }
    
    public void e(Priority param1Priority, d.a<? super Model> param1a) {
      param1a.f(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */