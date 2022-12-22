package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class d {
  static Field a;
  
  static {
    try {
      Field field = MediaBrowserService.Result.class.getDeclaredField("mFlags");
      a = field;
      field.setAccessible(true);
    } catch (NoSuchFieldException noSuchFieldException) {
      Log.w("MBSCompatApi26", noSuchFieldException);
    } 
  }
  
  public static Object a(Context paramContext, c paramc) {
    return new a(paramContext, paramc);
  }
  
  static class a extends c.a {
    a(Context param1Context, d.c param1c) {
      super(param1Context, param1c);
    }
    
    public void onLoadChildren(String param1String, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> param1Result, Bundle param1Bundle) {
      MediaSessionCompat.a(param1Bundle);
      ((d.c)this.b).d(param1String, new d.b(param1Result), param1Bundle);
    }
  }
  
  static class b {
    MediaBrowserService.Result a;
    
    b(MediaBrowserService.Result param1Result) {
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
    
    public void b(List<Parcel> param1List, int param1Int) {
      try {
        d.a.setInt(this.a, param1Int);
      } catch (IllegalAccessException illegalAccessException) {
        Log.w("MBSCompatApi26", illegalAccessException);
      } 
      this.a.sendResult(a(param1List));
    }
  }
  
  public static interface c extends c.b {
    void d(String param1String, d.b param1b, Bundle param1Bundle);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */