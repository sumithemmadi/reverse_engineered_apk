package com.bumptech.glide.load.data.o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class c implements d<InputStream> {
  private final Uri b;
  
  private final e c;
  
  private InputStream d;
  
  c(Uri paramUri, e parame) {
    this.b = paramUri;
    this.c = parame;
  }
  
  private static c c(Context paramContext, Uri paramUri, d paramd) {
    com.bumptech.glide.load.engine.x.b b = com.bumptech.glide.c.c(paramContext).e();
    return new c(paramUri, new e(com.bumptech.glide.c.c(paramContext).j().g(), paramd, b, paramContext.getContentResolver()));
  }
  
  public static c f(Context paramContext, Uri paramUri) {
    return c(paramContext, paramUri, new a(paramContext.getContentResolver()));
  }
  
  public static c g(Context paramContext, Uri paramUri) {
    return c(paramContext, paramUri, new b(paramContext.getContentResolver()));
  }
  
  private InputStream h() {
    byte b;
    g g;
    InputStream inputStream1 = this.c.d(this.b);
    if (inputStream1 != null) {
      b = this.c.a(this.b);
    } else {
      b = -1;
    } 
    InputStream inputStream2 = inputStream1;
    if (b != -1)
      g = new g(inputStream1, b); 
    return (InputStream)g;
  }
  
  public Class<InputStream> a() {
    return InputStream.class;
  }
  
  public void b() {
    InputStream inputStream = this.d;
    if (inputStream != null)
      try {
        inputStream.close();
      } catch (IOException iOException) {} 
  }
  
  public void cancel() {}
  
  public DataSource d() {
    return DataSource.b;
  }
  
  public void e(Priority paramPriority, d.a<? super InputStream> parama) {
    try {
      InputStream inputStream = h();
      this.d = inputStream;
      parama.f(inputStream);
    } catch (FileNotFoundException fileNotFoundException) {
      if (Log.isLoggable("MediaStoreThumbFetcher", 3))
        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", fileNotFoundException); 
      parama.c(fileNotFoundException);
    } 
  }
  
  static class a implements d {
    private static final String[] a = new String[] { "_data" };
    
    private final ContentResolver b;
    
    a(ContentResolver param1ContentResolver) {
      this.b = param1ContentResolver;
    }
    
    public Cursor a(Uri param1Uri) {
      String str = param1Uri.getLastPathSegment();
      return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[] { str }, null);
    }
  }
  
  static class b implements d {
    private static final String[] a = new String[] { "_data" };
    
    private final ContentResolver b;
    
    b(ContentResolver param1ContentResolver) {
      this.b = param1ContentResolver;
    }
    
    public Cursor a(Uri param1Uri) {
      String str = param1Uri.getLastPathSegment();
      return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[] { str }, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/o/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */