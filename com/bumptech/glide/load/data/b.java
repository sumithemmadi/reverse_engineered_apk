package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

public abstract class b<T> implements d<T> {
  private final String b;
  
  private final AssetManager c;
  
  private T d;
  
  public b(AssetManager paramAssetManager, String paramString) {
    this.c = paramAssetManager;
    this.b = paramString;
  }
  
  public void b() {
    T t = this.d;
    if (t == null)
      return; 
    try {
      c(t);
    } catch (IOException iOException) {}
  }
  
  protected abstract void c(T paramT);
  
  public void cancel() {}
  
  public DataSource d() {
    return DataSource.b;
  }
  
  public void e(Priority paramPriority, d.a<? super T> parama) {
    try {
      paramPriority = (Priority)f(this.c, this.b);
      this.d = (T)paramPriority;
      parama.f((T)paramPriority);
    } catch (IOException iOException) {
      if (Log.isLoggable("AssetPathFetcher", 3))
        Log.d("AssetPathFetcher", "Failed to load data from asset manager", iOException); 
      parama.c(iOException);
    } 
  }
  
  protected abstract T f(AssetManager paramAssetManager, String paramString);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */