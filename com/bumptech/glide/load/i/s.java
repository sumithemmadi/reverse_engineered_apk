package com.bumptech.glide.load.i;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.e;
import java.io.InputStream;

public class s<Data> implements n<Integer, Data> {
  private final n<Uri, Data> a;
  
  private final Resources b;
  
  public s(Resources paramResources, n<Uri, Data> paramn) {
    this.b = paramResources;
    this.a = paramn;
  }
  
  private Uri d(Integer paramInteger) {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("android.resource://");
      stringBuilder.append(this.b.getResourcePackageName(paramInteger.intValue()));
      stringBuilder.append('/');
      stringBuilder.append(this.b.getResourceTypeName(paramInteger.intValue()));
      stringBuilder.append('/');
      stringBuilder.append(this.b.getResourceEntryName(paramInteger.intValue()));
      return Uri.parse(stringBuilder.toString());
    } catch (android.content.res.Resources.NotFoundException notFoundException) {
      if (Log.isLoggable("ResourceLoader", 5)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Received invalid resource id: ");
        stringBuilder.append(paramInteger);
        Log.w("ResourceLoader", stringBuilder.toString(), (Throwable)notFoundException);
      } 
      return null;
    } 
  }
  
  public n.a<Data> c(Integer paramInteger, int paramInt1, int paramInt2, e parame) {
    n.a<Data> a;
    Uri uri = d(paramInteger);
    if (uri == null) {
      uri = null;
    } else {
      a = this.a.b(uri, paramInt1, paramInt2, parame);
    } 
    return a;
  }
  
  public boolean e(Integer paramInteger) {
    return true;
  }
  
  public static final class a implements o<Integer, AssetFileDescriptor> {
    private final Resources a;
    
    public a(Resources param1Resources) {
      this.a = param1Resources;
    }
    
    public n<Integer, AssetFileDescriptor> b(r param1r) {
      return new s<AssetFileDescriptor>(this.a, param1r.d(Uri.class, AssetFileDescriptor.class));
    }
  }
  
  public static class b implements o<Integer, ParcelFileDescriptor> {
    private final Resources a;
    
    public b(Resources param1Resources) {
      this.a = param1Resources;
    }
    
    public n<Integer, ParcelFileDescriptor> b(r param1r) {
      return new s<ParcelFileDescriptor>(this.a, param1r.d(Uri.class, ParcelFileDescriptor.class));
    }
  }
  
  public static class c implements o<Integer, InputStream> {
    private final Resources a;
    
    public c(Resources param1Resources) {
      this.a = param1Resources;
    }
    
    public n<Integer, InputStream> b(r param1r) {
      return new s<InputStream>(this.a, param1r.d(Uri.class, InputStream.class));
    }
  }
  
  public static class d implements o<Integer, Uri> {
    private final Resources a;
    
    public d(Resources param1Resources) {
      this.a = param1Resources;
    }
    
    public n<Integer, Uri> b(r param1r) {
      return new s<Uri>(this.a, v.c());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */