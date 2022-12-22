package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l<T> implements d<T> {
  private final Uri b;
  
  private final ContentResolver c;
  
  private T d;
  
  public l(ContentResolver paramContentResolver, Uri paramUri) {
    this.c = paramContentResolver;
    this.b = paramUri;
  }
  
  public void b() {
    T t = this.d;
    if (t != null)
      try {
        c(t);
      } catch (IOException iOException) {} 
  }
  
  protected abstract void c(T paramT);
  
  public void cancel() {}
  
  public DataSource d() {
    return DataSource.b;
  }
  
  public final void e(Priority paramPriority, d.a<? super T> parama) {
    try {
      paramPriority = (Priority)f(this.b, this.c);
      this.d = (T)paramPriority;
      parama.f((T)paramPriority);
    } catch (FileNotFoundException fileNotFoundException) {
      if (Log.isLoggable("LocalUriFetcher", 3))
        Log.d("LocalUriFetcher", "Failed to open Uri", fileNotFoundException); 
      parama.c(fileNotFoundException);
    } 
  }
  
  protected abstract T f(Uri paramUri, ContentResolver paramContentResolver);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */