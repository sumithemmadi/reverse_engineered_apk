package com.bumptech.glide.load.i.y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.o.c;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.i.n;
import com.bumptech.glide.load.i.o;
import com.bumptech.glide.load.i.r;
import com.bumptech.glide.o.d;
import java.io.InputStream;

public class b implements n<Uri, InputStream> {
  private final Context a;
  
  public b(Context paramContext) {
    this.a = paramContext.getApplicationContext();
  }
  
  public n.a<InputStream> c(Uri paramUri, int paramInt1, int paramInt2, e parame) {
    return com.bumptech.glide.load.data.o.b.d(paramInt1, paramInt2) ? new n.a((c)new d(paramUri), (d)c.f(this.a, paramUri)) : null;
  }
  
  public boolean d(Uri paramUri) {
    return com.bumptech.glide.load.data.o.b.a(paramUri);
  }
  
  public static class a implements o<Uri, InputStream> {
    private final Context a;
    
    public a(Context param1Context) {
      this.a = param1Context;
    }
    
    public n<Uri, InputStream> b(r param1r) {
      return new b(this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/y/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */