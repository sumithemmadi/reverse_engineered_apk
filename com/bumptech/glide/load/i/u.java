package com.bumptech.glide.load.i;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.e;
import java.io.File;
import java.io.InputStream;

public class u<Data> implements n<String, Data> {
  private final n<Uri, Data> a;
  
  public u(n<Uri, Data> paramn) {
    this.a = paramn;
  }
  
  private static Uri e(String paramString) {
    Uri uri;
    if (TextUtils.isEmpty(paramString))
      return null; 
    if (paramString.charAt(0) == '/') {
      uri = f(paramString);
    } else {
      Uri uri1 = Uri.parse((String)uri);
      if (uri1.getScheme() == null) {
        uri = f((String)uri);
      } else {
        uri = uri1;
      } 
    } 
    return uri;
  }
  
  private static Uri f(String paramString) {
    return Uri.fromFile(new File(paramString));
  }
  
  public n.a<Data> c(String paramString, int paramInt1, int paramInt2, e parame) {
    Uri uri = e(paramString);
    return (uri == null || !this.a.a(uri)) ? null : this.a.b(uri, paramInt1, paramInt2, parame);
  }
  
  public boolean d(String paramString) {
    return true;
  }
  
  public static final class a implements o<String, AssetFileDescriptor> {
    public n<String, AssetFileDescriptor> b(r param1r) {
      return new u<AssetFileDescriptor>(param1r.d(Uri.class, AssetFileDescriptor.class));
    }
  }
  
  public static class b implements o<String, ParcelFileDescriptor> {
    public n<String, ParcelFileDescriptor> b(r param1r) {
      return new u<ParcelFileDescriptor>(param1r.d(Uri.class, ParcelFileDescriptor.class));
    }
  }
  
  public static class c implements o<String, InputStream> {
    public n<String, InputStream> b(r param1r) {
      return new u<InputStream>(param1r.d(Uri.class, InputStream.class));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */