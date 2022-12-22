package com.bumptech.glide.load.i;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import com.bumptech.glide.load.e;
import com.bumptech.glide.o.d;
import java.io.InputStream;

public class a<Data> implements n<Uri, Data> {
  private static final int a = 22;
  
  private final AssetManager b;
  
  private final a<Data> c;
  
  public a(AssetManager paramAssetManager, a<Data> parama) {
    this.b = paramAssetManager;
    this.c = parama;
  }
  
  public n.a<Data> c(Uri paramUri, int paramInt1, int paramInt2, e parame) {
    String str = paramUri.toString().substring(a);
    return new n.a<Data>((com.bumptech.glide.load.c)new d(paramUri), this.c.a(this.b, str));
  }
  
  public boolean d(Uri paramUri) {
    boolean bool = "file".equals(paramUri.getScheme());
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (bool) {
      bool2 = bool1;
      if (!paramUri.getPathSegments().isEmpty()) {
        bool2 = bool1;
        if ("android_asset".equals(paramUri.getPathSegments().get(0)))
          bool2 = true; 
      } 
    } 
    return bool2;
  }
  
  public static interface a<Data> {
    d<Data> a(AssetManager param1AssetManager, String param1String);
  }
  
  public static class b implements o<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor> {
    private final AssetManager a;
    
    public b(AssetManager param1AssetManager) {
      this.a = param1AssetManager;
    }
    
    public d<ParcelFileDescriptor> a(AssetManager param1AssetManager, String param1String) {
      return (d<ParcelFileDescriptor>)new h(param1AssetManager, param1String);
    }
    
    public n<Uri, ParcelFileDescriptor> b(r param1r) {
      return new a<ParcelFileDescriptor>(this.a, this);
    }
  }
  
  public static class c implements o<Uri, InputStream>, a<InputStream> {
    private final AssetManager a;
    
    public c(AssetManager param1AssetManager) {
      this.a = param1AssetManager;
    }
    
    public d<InputStream> a(AssetManager param1AssetManager, String param1String) {
      return (d<InputStream>)new m(param1AssetManager, param1String);
    }
    
    public n<Uri, InputStream> b(r param1r) {
      return new a<InputStream>(this.a, this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */