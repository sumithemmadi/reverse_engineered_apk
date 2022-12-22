package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;

class b {
  public static Object a(Context paramContext, d paramd) {
    return new b(paramContext, paramd);
  }
  
  public static IBinder b(Object paramObject, Intent paramIntent) {
    return ((MediaBrowserService)paramObject).onBind(paramIntent);
  }
  
  public static void c(Object paramObject) {
    ((MediaBrowserService)paramObject).onCreate();
  }
  
  static class a {
    final String a;
    
    final Bundle b;
  }
  
  static class b extends MediaBrowserService {
    final b.d b;
    
    b(Context param1Context, b.d param1d) {
      attachBaseContext(param1Context);
      this.b = param1d;
    }
    
    public MediaBrowserService.BrowserRoot onGetRoot(String param1String, int param1Int, Bundle param1Bundle) {
      MediaBrowserService.BrowserRoot browserRoot;
      MediaSessionCompat.a(param1Bundle);
      b.d d1 = this.b;
      b.a a2 = null;
      if (param1Bundle == null) {
        param1Bundle = null;
      } else {
        param1Bundle = new Bundle(param1Bundle);
      } 
      b.a a1 = d1.e(param1String, param1Int, param1Bundle);
      if (a1 == null) {
        a1 = a2;
      } else {
        browserRoot = new MediaBrowserService.BrowserRoot(a1.a, a1.b);
      } 
      return browserRoot;
    }
    
    public void onLoadChildren(String param1String, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> param1Result) {
      this.b.c(param1String, new b.c<List<Parcel>>(param1Result));
    }
  }
  
  static class c<T> {
    MediaBrowserService.Result a;
    
    c(MediaBrowserService.Result param1Result) {
      this.a = param1Result;
    }
    
    List<MediaBrowser.MediaItem> a(List<Parcel> param1List) {
      if (param1List == null)
        return null; 
      ArrayList<Object> arrayList = new ArrayList();
      for (Parcel parcel : param1List) {
        parcel.setDataPosition(0);
        arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
        parcel.recycle();
      } 
      return arrayList;
    }
    
    public void b(T param1T) {
      if (param1T instanceof List) {
        this.a.sendResult(a((List<Parcel>)param1T));
      } else if (param1T instanceof Parcel) {
        Parcel parcel = (Parcel)param1T;
        parcel.setDataPosition(0);
        this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
        parcel.recycle();
      } else {
        this.a.sendResult(null);
      } 
    }
  }
  
  public static interface d {
    void c(String param1String, b.c<List<Parcel>> param1c);
    
    b.a e(String param1String, int param1Int, Bundle param1Bundle);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */