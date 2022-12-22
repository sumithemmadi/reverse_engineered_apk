package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;

class c {
  public static Object a(Context paramContext, b paramb) {
    return new a(paramContext, paramb);
  }
  
  static class a extends b.b {
    a(Context param1Context, c.b param1b) {
      super(param1Context, param1b);
    }
    
    public void onLoadItem(String param1String, MediaBrowserService.Result<MediaBrowser.MediaItem> param1Result) {
      ((c.b)this.b).b(param1String, new b.c<Parcel>(param1Result));
    }
  }
  
  public static interface b extends b.d {
    void b(String param1String, b.c<Parcel> param1c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */