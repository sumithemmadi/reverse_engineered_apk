package android.support.v4.media.session;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class MediaControllerCompat {
  private final b a;
  
  private final MediaSessionCompat.Token b;
  
  private final HashSet<a> c = new HashSet<a>();
  
  public MediaControllerCompat(Context paramContext, MediaSessionCompat.Token paramToken) {
    if (paramToken != null) {
      this.b = paramToken;
      int i = Build.VERSION.SDK_INT;
      if (i >= 24) {
        this.a = new d(paramContext, paramToken);
      } else if (i >= 23) {
        this.a = new c(paramContext, paramToken);
      } else if (i >= 21) {
        this.a = new MediaControllerImplApi21(paramContext, paramToken);
      } else {
        this.a = new e(paramToken);
      } 
      return;
    } 
    throw new IllegalArgumentException("sessionToken must not be null");
  }
  
  public boolean a(KeyEvent paramKeyEvent) {
    if (paramKeyEvent != null)
      return this.a.a(paramKeyEvent); 
    throw new IllegalArgumentException("KeyEvent may not be null");
  }
  
  static class MediaControllerImplApi21 implements b {
    protected final Object a;
    
    final Object b = new Object();
    
    private final List<MediaControllerCompat.a> c = new ArrayList<MediaControllerCompat.a>();
    
    private HashMap<MediaControllerCompat.a, a> d = new HashMap<MediaControllerCompat.a, a>();
    
    final MediaSessionCompat.Token e;
    
    public MediaControllerImplApi21(Context param1Context, MediaSessionCompat.Token param1Token) {
      this.e = param1Token;
      Object object = c.c(param1Context, param1Token.d());
      this.a = object;
      if (object != null) {
        if (param1Token.c() == null)
          c(); 
        return;
      } 
      throw new RemoteException();
    }
    
    private void c() {
      d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
    }
    
    public boolean a(KeyEvent param1KeyEvent) {
      return c.b(this.a, param1KeyEvent);
    }
    
    void b() {
      if (this.e.c() == null)
        return; 
      Iterator<MediaControllerCompat.a> iterator = this.c.iterator();
      while (iterator.hasNext()) {
        MediaControllerCompat.a a = iterator.next();
        a a1 = new a(a);
        this.d.put(a, a1);
        a.c = a1;
        try {
          this.e.c().D1(a1);
          a.i(13, null, null);
        } catch (RemoteException remoteException) {
          Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)remoteException);
          break;
        } 
      } 
      this.c.clear();
    }
    
    public void d(String param1String, Bundle param1Bundle, ResultReceiver param1ResultReceiver) {
      c.d(this.a, param1String, param1Bundle, param1ResultReceiver);
    }
    
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
      private WeakReference<MediaControllerCompat.MediaControllerImplApi21> b;
      
      ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 param2MediaControllerImplApi21) {
        super(null);
        this.b = new WeakReference<MediaControllerCompat.MediaControllerImplApi21>(param2MediaControllerImplApi21);
      }
      
      protected void onReceiveResult(int param2Int, Bundle param2Bundle) {
        MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = this.b.get();
        if (mediaControllerImplApi21 == null || param2Bundle == null)
          return; 
        synchronized (mediaControllerImplApi21.b) {
          mediaControllerImplApi21.e.e(b.a.Y0(androidx.core.app.f.a(param2Bundle, "android.support.v4.media.session.EXTRA_BINDER")));
          mediaControllerImplApi21.e.f(param2Bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
          mediaControllerImplApi21.b();
          return;
        } 
      }
    }
    
    private static class a extends MediaControllerCompat.a.c {
      a(MediaControllerCompat.a param2a) {
        super(param2a);
      }
      
      public void C0(List<MediaSessionCompat.QueueItem> param2List) {
        throw new AssertionError();
      }
      
      public void P9(ParcelableVolumeInfo param2ParcelableVolumeInfo) {
        throw new AssertionError();
      }
      
      public void Q0(CharSequence param2CharSequence) {
        throw new AssertionError();
      }
      
      public void U0() {
        throw new AssertionError();
      }
      
      public void b6(MediaMetadataCompat param2MediaMetadataCompat) {
        throw new AssertionError();
      }
      
      public void z0(Bundle param2Bundle) {
        throw new AssertionError();
      }
    }
  }
  
  private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
    private WeakReference<MediaControllerCompat.MediaControllerImplApi21> b;
    
    ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 param1MediaControllerImplApi21) {
      super(null);
      this.b = new WeakReference<MediaControllerCompat.MediaControllerImplApi21>(param1MediaControllerImplApi21);
    }
    
    protected void onReceiveResult(int param1Int, Bundle param1Bundle) {
      MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = this.b.get();
      if (mediaControllerImplApi21 == null || param1Bundle == null)
        return; 
      synchronized (mediaControllerImplApi21.b) {
        mediaControllerImplApi21.e.e(b.a.Y0(androidx.core.app.f.a(param1Bundle, "android.support.v4.media.session.EXTRA_BINDER")));
        mediaControllerImplApi21.e.f(param1Bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
        mediaControllerImplApi21.b();
        return;
      } 
    }
  }
  
  private static class a extends a.c {
    a(MediaControllerCompat.a param1a) {
      super(param1a);
    }
    
    public void C0(List<MediaSessionCompat.QueueItem> param1List) {
      throw new AssertionError();
    }
    
    public void P9(ParcelableVolumeInfo param1ParcelableVolumeInfo) {
      throw new AssertionError();
    }
    
    public void Q0(CharSequence param1CharSequence) {
      throw new AssertionError();
    }
    
    public void U0() {
      throw new AssertionError();
    }
    
    public void b6(MediaMetadataCompat param1MediaMetadataCompat) {
      throw new AssertionError();
    }
    
    public void z0(Bundle param1Bundle) {
      throw new AssertionError();
    }
  }
  
  public static abstract class a implements IBinder.DeathRecipient {
    final Object a;
    
    a b;
    
    a c;
    
    public a() {
      if (Build.VERSION.SDK_INT >= 21) {
        this.a = c.a(new b(this));
      } else {
        c c = new c(this);
        this.c = c;
        this.a = c;
      } 
    }
    
    public void a(MediaControllerCompat.f param1f) {}
    
    public void b(Bundle param1Bundle) {}
    
    public void binderDied() {
      i(8, null, null);
    }
    
    public void c(MediaMetadataCompat param1MediaMetadataCompat) {}
    
    public void d(PlaybackStateCompat param1PlaybackStateCompat) {}
    
    public void e(List<MediaSessionCompat.QueueItem> param1List) {}
    
    public void f(CharSequence param1CharSequence) {}
    
    public void g() {}
    
    public void h(String param1String, Bundle param1Bundle) {}
    
    void i(int param1Int, Object param1Object, Bundle param1Bundle) {
      if (this.b == null)
        return; 
      throw null;
    }
    
    private class a extends Handler {}
    
    private static class b implements c.a {
      private final WeakReference<MediaControllerCompat.a> a;
      
      b(MediaControllerCompat.a param2a) {
        this.a = new WeakReference<MediaControllerCompat.a>(param2a);
      }
      
      public void C0(List<?> param2List) {
        MediaControllerCompat.a a1 = this.a.get();
        if (a1 != null)
          a1.e(MediaSessionCompat.QueueItem.b(param2List)); 
      }
      
      public void Q0(CharSequence param2CharSequence) {
        MediaControllerCompat.a a1 = this.a.get();
        if (a1 != null)
          a1.f(param2CharSequence); 
      }
      
      public void U0() {
        MediaControllerCompat.a a1 = this.a.get();
        if (a1 != null)
          a1.g(); 
      }
      
      public void a(Object param2Object) {
        MediaControllerCompat.a a1 = this.a.get();
        if (a1 != null)
          a1.c(MediaMetadataCompat.a(param2Object)); 
      }
      
      public void b(int param2Int1, int param2Int2, int param2Int3, int param2Int4, int param2Int5) {
        MediaControllerCompat.a a1 = this.a.get();
        if (a1 != null)
          a1.a(new MediaControllerCompat.f(param2Int1, param2Int2, param2Int3, param2Int4, param2Int5)); 
      }
      
      public void c(Object param2Object) {
        MediaControllerCompat.a a1 = this.a.get();
        if (a1 != null && a1.c == null)
          a1.d(PlaybackStateCompat.a(param2Object)); 
      }
      
      public void d(String param2String, Bundle param2Bundle) {
        MediaControllerCompat.a a1 = this.a.get();
        if (a1 != null && (a1.c == null || Build.VERSION.SDK_INT >= 23))
          a1.h(param2String, param2Bundle); 
      }
      
      public void z0(Bundle param2Bundle) {
        MediaControllerCompat.a a1 = this.a.get();
        if (a1 != null)
          a1.b(param2Bundle); 
      }
    }
    
    private static class c extends a.a {
      private final WeakReference<MediaControllerCompat.a> b;
      
      c(MediaControllerCompat.a param2a) {
        this.b = new WeakReference<MediaControllerCompat.a>(param2a);
      }
      
      public void A7(int param2Int) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(12, Integer.valueOf(param2Int), null); 
      }
      
      public void A9(PlaybackStateCompat param2PlaybackStateCompat) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(2, param2PlaybackStateCompat, null); 
      }
      
      public void B4(boolean param2Boolean) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(11, Boolean.valueOf(param2Boolean), null); 
      }
      
      public void C0(List<MediaSessionCompat.QueueItem> param2List) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(5, param2List, null); 
      }
      
      public void H5(boolean param2Boolean) {}
      
      public void P9(ParcelableVolumeInfo param2ParcelableVolumeInfo) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null) {
          if (param2ParcelableVolumeInfo != null) {
            MediaControllerCompat.f f = new MediaControllerCompat.f(param2ParcelableVolumeInfo.b, param2ParcelableVolumeInfo.c, param2ParcelableVolumeInfo.d, param2ParcelableVolumeInfo.e, param2ParcelableVolumeInfo.f);
          } else {
            param2ParcelableVolumeInfo = null;
          } 
          a1.i(4, param2ParcelableVolumeInfo, null);
        } 
      }
      
      public void Q0(CharSequence param2CharSequence) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(6, param2CharSequence, null); 
      }
      
      public void U0() {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(8, null, null); 
      }
      
      public void U2() {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(13, null, null); 
      }
      
      public void b6(MediaMetadataCompat param2MediaMetadataCompat) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(3, param2MediaMetadataCompat, null); 
      }
      
      public void m1(String param2String, Bundle param2Bundle) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(1, param2String, param2Bundle); 
      }
      
      public void onRepeatModeChanged(int param2Int) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(9, Integer.valueOf(param2Int), null); 
      }
      
      public void z0(Bundle param2Bundle) {
        MediaControllerCompat.a a1 = this.b.get();
        if (a1 != null)
          a1.i(7, param2Bundle, null); 
      }
    }
  }
  
  private class a extends Handler {}
  
  private static class b implements c.a {
    private final WeakReference<MediaControllerCompat.a> a;
    
    b(MediaControllerCompat.a param1a) {
      this.a = new WeakReference<MediaControllerCompat.a>(param1a);
    }
    
    public void C0(List<?> param1List) {
      MediaControllerCompat.a a1 = this.a.get();
      if (a1 != null)
        a1.e(MediaSessionCompat.QueueItem.b(param1List)); 
    }
    
    public void Q0(CharSequence param1CharSequence) {
      MediaControllerCompat.a a1 = this.a.get();
      if (a1 != null)
        a1.f(param1CharSequence); 
    }
    
    public void U0() {
      MediaControllerCompat.a a1 = this.a.get();
      if (a1 != null)
        a1.g(); 
    }
    
    public void a(Object param1Object) {
      MediaControllerCompat.a a1 = this.a.get();
      if (a1 != null)
        a1.c(MediaMetadataCompat.a(param1Object)); 
    }
    
    public void b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      MediaControllerCompat.a a1 = this.a.get();
      if (a1 != null)
        a1.a(new MediaControllerCompat.f(param1Int1, param1Int2, param1Int3, param1Int4, param1Int5)); 
    }
    
    public void c(Object param1Object) {
      MediaControllerCompat.a a1 = this.a.get();
      if (a1 != null && a1.c == null)
        a1.d(PlaybackStateCompat.a(param1Object)); 
    }
    
    public void d(String param1String, Bundle param1Bundle) {
      MediaControllerCompat.a a1 = this.a.get();
      if (a1 != null && (a1.c == null || Build.VERSION.SDK_INT >= 23))
        a1.h(param1String, param1Bundle); 
    }
    
    public void z0(Bundle param1Bundle) {
      MediaControllerCompat.a a1 = this.a.get();
      if (a1 != null)
        a1.b(param1Bundle); 
    }
  }
  
  private static class c extends a.a {
    private final WeakReference<MediaControllerCompat.a> b;
    
    c(MediaControllerCompat.a param1a) {
      this.b = new WeakReference<MediaControllerCompat.a>(param1a);
    }
    
    public void A7(int param1Int) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(12, Integer.valueOf(param1Int), null); 
    }
    
    public void A9(PlaybackStateCompat param1PlaybackStateCompat) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(2, param1PlaybackStateCompat, null); 
    }
    
    public void B4(boolean param1Boolean) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(11, Boolean.valueOf(param1Boolean), null); 
    }
    
    public void C0(List<MediaSessionCompat.QueueItem> param1List) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(5, param1List, null); 
    }
    
    public void H5(boolean param1Boolean) {}
    
    public void P9(ParcelableVolumeInfo param1ParcelableVolumeInfo) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null) {
        if (param1ParcelableVolumeInfo != null) {
          MediaControllerCompat.f f = new MediaControllerCompat.f(param1ParcelableVolumeInfo.b, param1ParcelableVolumeInfo.c, param1ParcelableVolumeInfo.d, param1ParcelableVolumeInfo.e, param1ParcelableVolumeInfo.f);
        } else {
          param1ParcelableVolumeInfo = null;
        } 
        a1.i(4, param1ParcelableVolumeInfo, null);
      } 
    }
    
    public void Q0(CharSequence param1CharSequence) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(6, param1CharSequence, null); 
    }
    
    public void U0() {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(8, null, null); 
    }
    
    public void U2() {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(13, null, null); 
    }
    
    public void b6(MediaMetadataCompat param1MediaMetadataCompat) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(3, param1MediaMetadataCompat, null); 
    }
    
    public void m1(String param1String, Bundle param1Bundle) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(1, param1String, param1Bundle); 
    }
    
    public void onRepeatModeChanged(int param1Int) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(9, Integer.valueOf(param1Int), null); 
    }
    
    public void z0(Bundle param1Bundle) {
      MediaControllerCompat.a a1 = this.b.get();
      if (a1 != null)
        a1.i(7, param1Bundle, null); 
    }
  }
  
  static interface b {
    boolean a(KeyEvent param1KeyEvent);
  }
  
  static class c extends MediaControllerImplApi21 {
    public c(Context param1Context, MediaSessionCompat.Token param1Token) {
      super(param1Context, param1Token);
    }
  }
  
  static class d extends c {
    public d(Context param1Context, MediaSessionCompat.Token param1Token) {
      super(param1Context, param1Token);
    }
  }
  
  static class e implements b {
    private b a;
    
    public e(MediaSessionCompat.Token param1Token) {
      this.a = b.a.Y0((IBinder)param1Token.d());
    }
    
    public boolean a(KeyEvent param1KeyEvent) {
      if (param1KeyEvent != null) {
        try {
          this.a.x5(param1KeyEvent);
        } catch (RemoteException remoteException) {
          Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", (Throwable)remoteException);
        } 
        return false;
      } 
      throw new IllegalArgumentException("event may not be null.");
    }
  }
  
  public static final class f {
    private final int a;
    
    private final int b;
    
    private final int c;
    
    private final int d;
    
    private final int e;
    
    f(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.d = param1Int4;
      this.e = param1Int5;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/session/MediaControllerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */