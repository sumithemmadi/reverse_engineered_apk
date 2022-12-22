package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

public interface d<T> {
  Class<T> a();
  
  void b();
  
  void cancel();
  
  DataSource d();
  
  void e(Priority paramPriority, a<? super T> parama);
  
  public static interface a<T> {
    void c(Exception param1Exception);
    
    void f(T param1T);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */