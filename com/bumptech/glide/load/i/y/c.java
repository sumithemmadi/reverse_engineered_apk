package com.bumptech.glide.load.i.y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.o.b;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.i.n;
import com.bumptech.glide.load.i.o;
import com.bumptech.glide.load.i.r;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.o.d;
import java.io.InputStream;

public class c implements n<Uri, InputStream> {
  private final Context a;
  
  public c(Context paramContext) {
    this.a = paramContext.getApplicationContext();
  }
  
  private boolean e(e parame) {
    boolean bool;
    Long long_ = (Long)parame.c(VideoDecoder.a);
    if (long_ != null && long_.longValue() == -1L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public n.a<InputStream> c(Uri paramUri, int paramInt1, int paramInt2, e parame) {
    return (b.d(paramInt1, paramInt2) && e(parame)) ? new n.a((com.bumptech.glide.load.c)new d(paramUri), (d)com.bumptech.glide.load.data.o.c.g(this.a, paramUri)) : null;
  }
  
  public boolean d(Uri paramUri) {
    return b.c(paramUri);
  }
  
  public static class a implements o<Uri, InputStream> {
    private final Context a;
    
    public a(Context param1Context) {
      this.a = param1Context;
    }
    
    public n<Uri, InputStream> b(r param1r) {
      return new c(this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/y/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */