package com.bumptech.glide.load.i;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import com.bumptech.glide.load.e;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class w<Data> implements n<Uri, Data> {
  private static final Set<String> a = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(new String[] { "file", "android.resource", "content" })));
  
  private final c<Data> b;
  
  public w(c<Data> paramc) {
    this.b = paramc;
  }
  
  public n.a<Data> c(Uri paramUri, int paramInt1, int paramInt2, e parame) {
    return new n.a<Data>((com.bumptech.glide.load.c)new com.bumptech.glide.o.d(paramUri), this.b.a(paramUri));
  }
  
  public boolean d(Uri paramUri) {
    return a.contains(paramUri.getScheme());
  }
  
  public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
    private final ContentResolver a;
    
    public a(ContentResolver param1ContentResolver) {
      this.a = param1ContentResolver;
    }
    
    public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri param1Uri) {
      return (com.bumptech.glide.load.data.d<AssetFileDescriptor>)new com.bumptech.glide.load.data.a(this.a, param1Uri);
    }
    
    public n<Uri, AssetFileDescriptor> b(r param1r) {
      return new w<AssetFileDescriptor>(this);
    }
  }
  
  public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
    private final ContentResolver a;
    
    public b(ContentResolver param1ContentResolver) {
      this.a = param1ContentResolver;
    }
    
    public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri param1Uri) {
      return (com.bumptech.glide.load.data.d<ParcelFileDescriptor>)new i(this.a, param1Uri);
    }
    
    public n<Uri, ParcelFileDescriptor> b(r param1r) {
      return new w<ParcelFileDescriptor>(this);
    }
  }
  
  public static interface c<Data> {
    com.bumptech.glide.load.data.d<Data> a(Uri param1Uri);
  }
  
  public static class d implements o<Uri, InputStream>, c<InputStream> {
    private final ContentResolver a;
    
    public d(ContentResolver param1ContentResolver) {
      this.a = param1ContentResolver;
    }
    
    public com.bumptech.glide.load.data.d<InputStream> a(Uri param1Uri) {
      return (com.bumptech.glide.load.data.d<InputStream>)new n(this.a, param1Uri);
    }
    
    public n<Uri, InputStream> b(r param1r) {
      return new w<InputStream>(this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */