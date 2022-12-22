package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class MediaBrowserCompat {
  static final boolean a = Log.isLoggable("MediaBrowserCompat", 3);
  
  private final d b;
  
  public MediaBrowserCompat(Context paramContext, ComponentName paramComponentName, b paramb, Bundle paramBundle) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      this.b = new g(paramContext, paramComponentName, paramb, paramBundle);
    } else if (i >= 23) {
      this.b = new f(paramContext, paramComponentName, paramb, paramBundle);
    } else if (i >= 21) {
      this.b = new e(paramContext, paramComponentName, paramb, paramBundle);
    } else {
      this.b = new h(paramContext, paramComponentName, paramb, paramBundle);
    } 
  }
  
  public void a() {
    Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
    this.b.b();
  }
  
  public void b() {
    this.b.a();
  }
  
  public MediaSessionCompat.Token c() {
    return this.b.c();
  }
  
  private static class CustomActionResultReceiver extends ResultReceiver {
    private final Bundle e;
    
    private final MediaBrowserCompat.c f;
    
    protected void a(int param1Int, Bundle param1Bundle) {
      if (this.f == null)
        return; 
      MediaSessionCompat.a(param1Bundle);
      if (param1Int != -1) {
        if (param1Int != 0) {
          if (param1Int != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown result code: ");
            stringBuilder.append(param1Int);
            stringBuilder.append(" (extras=");
            stringBuilder.append(this.e);
            stringBuilder.append(", resultData=");
            stringBuilder.append(param1Bundle);
            stringBuilder.append(")");
            Log.w("MediaBrowserCompat", stringBuilder.toString());
            return;
          } 
          throw null;
        } 
        throw null;
      } 
      throw null;
    }
  }
  
  private static class ItemReceiver extends ResultReceiver {
    protected void a(int param1Int, Bundle param1Bundle) {
      MediaSessionCompat.a(param1Bundle);
      if (param1Int == 0 && param1Bundle != null && param1Bundle.containsKey("media_item")) {
        Parcelable parcelable = param1Bundle.getParcelable("media_item");
        if (parcelable == null || parcelable instanceof MediaBrowserCompat.MediaItem) {
          parcelable = parcelable;
          throw null;
        } 
        throw null;
      } 
      throw null;
    }
  }
  
  public static class MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaItem> CREATOR = new a();
    
    private final int b;
    
    private final MediaDescriptionCompat c;
    
    MediaItem(Parcel param1Parcel) {
      this.b = param1Parcel.readInt();
      this.c = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(param1Parcel);
    }
    
    public MediaItem(MediaDescriptionCompat param1MediaDescriptionCompat, int param1Int) {
      if (param1MediaDescriptionCompat != null) {
        if (!TextUtils.isEmpty(param1MediaDescriptionCompat.c())) {
          this.b = param1Int;
          this.c = param1MediaDescriptionCompat;
          return;
        } 
        throw new IllegalArgumentException("description must have a non-empty media id");
      } 
      throw new IllegalArgumentException("description cannot be null");
    }
    
    public static MediaItem a(Object param1Object) {
      if (param1Object == null || Build.VERSION.SDK_INT < 21)
        return null; 
      param1Object = param1Object;
      int i = param1Object.getFlags();
      return new MediaItem(MediaDescriptionCompat.a(param1Object.getDescription()), i);
    }
    
    public static List<MediaItem> b(List<?> param1List) {
      if (param1List == null || Build.VERSION.SDK_INT < 21)
        return null; 
      ArrayList<MediaItem> arrayList = new ArrayList(param1List.size());
      Iterator<?> iterator = param1List.iterator();
      while (iterator.hasNext())
        arrayList.add(a(iterator.next())); 
      return arrayList;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("MediaItem{");
      stringBuilder.append("mFlags=");
      stringBuilder.append(this.b);
      stringBuilder.append(", mDescription=");
      stringBuilder.append(this.c);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
      this.c.writeToParcel(param1Parcel, param1Int);
    }
    
    static final class a implements Parcelable.Creator<MediaItem> {
      public MediaBrowserCompat.MediaItem a(Parcel param2Parcel) {
        return new MediaBrowserCompat.MediaItem(param2Parcel);
      }
      
      public MediaBrowserCompat.MediaItem[] b(int param2Int) {
        return new MediaBrowserCompat.MediaItem[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<MediaItem> {
    public MediaBrowserCompat.MediaItem a(Parcel param1Parcel) {
      return new MediaBrowserCompat.MediaItem(param1Parcel);
    }
    
    public MediaBrowserCompat.MediaItem[] b(int param1Int) {
      return new MediaBrowserCompat.MediaItem[param1Int];
    }
  }
  
  private static class SearchResultReceiver extends ResultReceiver {
    protected void a(int param1Int, Bundle param1Bundle) {
      MediaSessionCompat.a(param1Bundle);
      if (param1Int == 0 && param1Bundle != null && param1Bundle.containsKey("search_results")) {
        Parcelable[] arrayOfParcelable = param1Bundle.getParcelableArray("search_results");
        if (arrayOfParcelable != null) {
          ArrayList<MediaBrowserCompat.MediaItem> arrayList = new ArrayList();
          int i = arrayOfParcelable.length;
          for (param1Int = 0; param1Int < i; param1Int++)
            arrayList.add((MediaBrowserCompat.MediaItem)arrayOfParcelable[param1Int]); 
        } 
        throw null;
      } 
      throw null;
    }
  }
  
  private static class a extends Handler {
    private final WeakReference<MediaBrowserCompat.i> a;
    
    private WeakReference<Messenger> b;
    
    a(MediaBrowserCompat.i param1i) {
      this.a = new WeakReference<MediaBrowserCompat.i>(param1i);
    }
    
    void a(Messenger param1Messenger) {
      this.b = new WeakReference<Messenger>(param1Messenger);
    }
    
    public void handleMessage(Message param1Message) {
      WeakReference<Messenger> weakReference = this.b;
      if (weakReference != null && weakReference.get() != null && this.a.get() != null) {
        Bundle bundle = param1Message.getData();
        MediaSessionCompat.a(bundle);
        MediaBrowserCompat.i i = this.a.get();
        Messenger messenger = this.b.get();
        try {
          StringBuilder stringBuilder;
          int j = param1Message.what;
          if (j != 1) {
            if (j != 2) {
              if (j != 3) {
                stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("Unhandled message: ");
                stringBuilder.append(param1Message);
                stringBuilder.append("\n  Client version: ");
                stringBuilder.append(1);
                stringBuilder.append("\n  Service version: ");
                stringBuilder.append(param1Message.arg1);
                Log.w("MediaBrowserCompat", stringBuilder.toString());
              } else {
                Bundle bundle1 = stringBuilder.getBundle("data_options");
                MediaSessionCompat.a(bundle1);
                Bundle bundle2 = stringBuilder.getBundle("data_notify_children_changed_options");
                MediaSessionCompat.a(bundle2);
                i.e(messenger, stringBuilder.getString("data_media_item_id"), stringBuilder.getParcelableArrayList("data_media_item_list"), bundle1, bundle2);
              } 
            } else {
              i.g(messenger);
            } 
          } else {
            Bundle bundle1 = stringBuilder.getBundle("data_root_hints");
            MediaSessionCompat.a(bundle1);
            i.d(messenger, stringBuilder.getString("data_media_item_id"), (MediaSessionCompat.Token)stringBuilder.getParcelable("data_media_session_token"), bundle1);
          } 
        } catch (BadParcelableException badParcelableException) {
          Log.e("MediaBrowserCompat", "Could not unparcel the data.");
          if (param1Message.what == 1)
            i.g(messenger); 
        } 
      } 
    }
  }
  
  public static class b {
    final MediaBrowser.ConnectionCallback a;
    
    b b;
    
    public b() {
      if (Build.VERSION.SDK_INT >= 21) {
        this.a = new a(this);
      } else {
        this.a = null;
      } 
    }
    
    public void a() {
      throw null;
    }
    
    public void b() {
      throw null;
    }
    
    public void c() {
      throw null;
    }
    
    void d(b param1b) {
      this.b = param1b;
    }
    
    private class a extends MediaBrowser.ConnectionCallback {
      a(MediaBrowserCompat.b this$0) {}
      
      public void onConnected() {
        MediaBrowserCompat.b.b b1 = this.a.b;
        if (b1 != null)
          b1.h(); 
        this.a.a();
      }
      
      public void onConnectionFailed() {
        MediaBrowserCompat.b.b b1 = this.a.b;
        if (b1 != null)
          b1.i(); 
        this.a.b();
      }
      
      public void onConnectionSuspended() {
        MediaBrowserCompat.b.b b1 = this.a.b;
        if (b1 != null)
          b1.f(); 
        this.a.c();
      }
    }
    
    static interface b {
      void f();
      
      void h();
      
      void i();
    }
  }
  
  private class a extends MediaBrowser.ConnectionCallback {
    a(MediaBrowserCompat this$0) {}
    
    public void onConnected() {
      MediaBrowserCompat.b.b b1 = this.a.b;
      if (b1 != null)
        b1.h(); 
      this.a.a();
    }
    
    public void onConnectionFailed() {
      MediaBrowserCompat.b.b b1 = this.a.b;
      if (b1 != null)
        b1.i(); 
      this.a.b();
    }
    
    public void onConnectionSuspended() {
      MediaBrowserCompat.b.b b1 = this.a.b;
      if (b1 != null)
        b1.f(); 
      this.a.c();
    }
  }
  
  static interface b {
    void f();
    
    void h();
    
    void i();
  }
  
  public static abstract class c {}
  
  static interface d {
    void a();
    
    void b();
    
    MediaSessionCompat.Token c();
  }
  
  static class e implements d, i, b.b {
    final Context a;
    
    protected final MediaBrowser b;
    
    protected final Bundle c;
    
    protected final MediaBrowserCompat.a d = new MediaBrowserCompat.a(this);
    
    private final b.e.a<String, MediaBrowserCompat.k> e = new b.e.a();
    
    protected int f;
    
    protected MediaBrowserCompat.j g;
    
    protected Messenger h;
    
    private MediaSessionCompat.Token i;
    
    private Bundle j;
    
    e(Context param1Context, ComponentName param1ComponentName, MediaBrowserCompat.b param1b, Bundle param1Bundle) {
      this.a = param1Context;
      Bundle bundle = new Bundle();
      if (param1Bundle != null) {
        this(param1Bundle);
      } else {
        this();
      } 
      this.c = bundle;
      bundle.putInt("extra_client_version", 1);
      param1b.d(this);
      this.b = new MediaBrowser(param1Context, param1ComponentName, param1b.a, bundle);
    }
    
    public void a() {
      MediaBrowserCompat.j j1 = this.g;
      if (j1 != null) {
        Messenger messenger = this.h;
        if (messenger != null)
          try {
            j1.f(messenger);
          } catch (RemoteException remoteException) {
            Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
          }  
      } 
      this.b.disconnect();
    }
    
    public void b() {
      this.b.connect();
    }
    
    public MediaSessionCompat.Token c() {
      if (this.i == null)
        this.i = MediaSessionCompat.Token.a(this.b.getSessionToken()); 
      return this.i;
    }
    
    public void d(Messenger param1Messenger, String param1String, MediaSessionCompat.Token param1Token, Bundle param1Bundle) {}
    
    public void e(Messenger param1Messenger, String param1String, List<MediaBrowserCompat.MediaItem> param1List, Bundle param1Bundle1, Bundle param1Bundle2) {
      StringBuilder stringBuilder;
      if (this.h != param1Messenger)
        return; 
      MediaBrowserCompat.k k = (MediaBrowserCompat.k)this.e.get(param1String);
      if (k == null) {
        if (MediaBrowserCompat.a) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("onLoadChildren for id that isn't subscribed id=");
          stringBuilder.append(param1String);
          Log.d("MediaBrowserCompat", stringBuilder.toString());
        } 
        return;
      } 
      MediaBrowserCompat.l l = stringBuilder.a(param1Bundle1);
      if (l != null)
        if (param1Bundle1 == null) {
          if (param1List == null) {
            l.c(param1String);
          } else {
            this.j = param1Bundle2;
            l.a(param1String, param1List);
            this.j = null;
          } 
        } else if (param1List == null) {
          l.d(param1String, param1Bundle1);
        } else {
          this.j = param1Bundle2;
          l.b(param1String, param1List, param1Bundle1);
          this.j = null;
        }  
    }
    
    public void f() {
      this.g = null;
      this.h = null;
      this.i = null;
      this.d.a(null);
    }
    
    public void g(Messenger param1Messenger) {}
    
    public void h() {
      try {
        Bundle bundle = this.b.getExtras();
        if (bundle == null)
          return; 
        this.f = bundle.getInt("extra_service_version", 0);
        IBinder iBinder = androidx.core.app.f.a(bundle, "extra_messenger");
        if (iBinder != null) {
          this.g = new MediaBrowserCompat.j(iBinder, this.c);
          Messenger messenger = new Messenger(this.d);
          this.h = messenger;
          this.d.a(messenger);
          try {
            this.g.d(this.a, this.h);
          } catch (RemoteException remoteException) {
            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
          } 
        } 
        b b1 = b.a.Y0(androidx.core.app.f.a(bundle, "extra_session_binder"));
        if (b1 != null)
          this.i = MediaSessionCompat.Token.b(this.b.getSessionToken(), b1); 
        return;
      } catch (IllegalStateException illegalStateException) {
        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", illegalStateException);
        return;
      } 
    }
    
    public void i() {}
  }
  
  static class f extends e {
    f(Context param1Context, ComponentName param1ComponentName, MediaBrowserCompat.b param1b, Bundle param1Bundle) {
      super(param1Context, param1ComponentName, param1b, param1Bundle);
    }
  }
  
  static class g extends f {
    g(Context param1Context, ComponentName param1ComponentName, MediaBrowserCompat.b param1b, Bundle param1Bundle) {
      super(param1Context, param1ComponentName, param1b, param1Bundle);
    }
  }
  
  static class h implements d, i {
    final Context a;
    
    final ComponentName b;
    
    final MediaBrowserCompat.b c;
    
    final Bundle d;
    
    final MediaBrowserCompat.a e = new MediaBrowserCompat.a(this);
    
    private final b.e.a<String, MediaBrowserCompat.k> f = new b.e.a();
    
    int g = 1;
    
    c h;
    
    MediaBrowserCompat.j i;
    
    Messenger j;
    
    private String k;
    
    private MediaSessionCompat.Token l;
    
    private Bundle m;
    
    private Bundle n;
    
    public h(Context param1Context, ComponentName param1ComponentName, MediaBrowserCompat.b param1b, Bundle param1Bundle) {
      if (param1Context != null) {
        if (param1ComponentName != null) {
          if (param1b != null) {
            Bundle bundle;
            this.a = param1Context;
            this.b = param1ComponentName;
            this.c = param1b;
            if (param1Bundle == null) {
              param1Context = null;
            } else {
              bundle = new Bundle(param1Bundle);
            } 
            this.d = bundle;
            return;
          } 
          throw new IllegalArgumentException("connection callback must not be null");
        } 
        throw new IllegalArgumentException("service component must not be null");
      } 
      throw new IllegalArgumentException("context must not be null");
    }
    
    private static String i(int param1Int) {
      if (param1Int != 0) {
        if (param1Int != 1) {
          if (param1Int != 2) {
            if (param1Int != 3) {
              if (param1Int != 4) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("UNKNOWN/");
                stringBuilder.append(param1Int);
                return stringBuilder.toString();
              } 
              return "CONNECT_STATE_SUSPENDED";
            } 
            return "CONNECT_STATE_CONNECTED";
          } 
          return "CONNECT_STATE_CONNECTING";
        } 
        return "CONNECT_STATE_DISCONNECTED";
      } 
      return "CONNECT_STATE_DISCONNECTING";
    }
    
    private boolean k(Messenger param1Messenger, String param1String) {
      if (this.j == param1Messenger) {
        int m = this.g;
        if (m != 0 && m != 1)
          return true; 
      } 
      int k = this.g;
      if (k != 0 && k != 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String);
        stringBuilder.append(" for ");
        stringBuilder.append(this.b);
        stringBuilder.append(" with mCallbacksMessenger=");
        stringBuilder.append(this.j);
        stringBuilder.append(" this=");
        stringBuilder.append(this);
        Log.i("MediaBrowserCompat", stringBuilder.toString());
      } 
      return false;
    }
    
    public void a() {
      this.g = 0;
      this.e.post(new b(this));
    }
    
    public void b() {
      int k = this.g;
      if (k == 0 || k == 1) {
        this.g = 2;
        this.e.post(new a(this));
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("connect() called while neigther disconnecting nor disconnected (state=");
      stringBuilder.append(i(this.g));
      stringBuilder.append(")");
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public MediaSessionCompat.Token c() {
      if (j())
        return this.l; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("getSessionToken() called while not connected(state=");
      stringBuilder.append(this.g);
      stringBuilder.append(")");
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public void d(Messenger param1Messenger, String param1String, MediaSessionCompat.Token param1Token, Bundle param1Bundle) {
      if (!k(param1Messenger, "onConnect"))
        return; 
      if (this.g != 2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onConnect from service while mState=");
        stringBuilder.append(i(this.g));
        stringBuilder.append("... ignoring");
        Log.w("MediaBrowserCompat", stringBuilder.toString());
        return;
      } 
      this.k = param1String;
      this.l = param1Token;
      this.m = param1Bundle;
      this.g = 3;
      if (MediaBrowserCompat.a) {
        Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
        f();
      } 
      this.c.a();
      try {
        for (Map.Entry entry : this.f.entrySet()) {
          String str = (String)entry.getKey();
          MediaBrowserCompat.k k = (MediaBrowserCompat.k)entry.getValue();
          List<MediaBrowserCompat.l> list = k.b();
          List<Bundle> list1 = k.c();
          for (byte b1 = 0; b1 < list.size(); b1++)
            this.i.a(str, ((MediaBrowserCompat.l)list.get(b1)).b, list1.get(b1), this.j); 
        } 
      } catch (RemoteException remoteException) {
        Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
      } 
    }
    
    public void e(Messenger param1Messenger, String param1String, List<MediaBrowserCompat.MediaItem> param1List, Bundle param1Bundle1, Bundle param1Bundle2) {
      StringBuilder stringBuilder;
      if (!k(param1Messenger, "onLoadChildren"))
        return; 
      boolean bool = MediaBrowserCompat.a;
      if (bool) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("onLoadChildren for ");
        stringBuilder.append(this.b);
        stringBuilder.append(" id=");
        stringBuilder.append(param1String);
        Log.d("MediaBrowserCompat", stringBuilder.toString());
      } 
      MediaBrowserCompat.k k = (MediaBrowserCompat.k)this.f.get(param1String);
      if (k == null) {
        if (bool) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("onLoadChildren for id that isn't subscribed id=");
          stringBuilder.append(param1String);
          Log.d("MediaBrowserCompat", stringBuilder.toString());
        } 
        return;
      } 
      MediaBrowserCompat.l l = stringBuilder.a(param1Bundle1);
      if (l != null)
        if (param1Bundle1 == null) {
          if (param1List == null) {
            l.c(param1String);
          } else {
            this.n = param1Bundle2;
            l.a(param1String, param1List);
            this.n = null;
          } 
        } else if (param1List == null) {
          l.d(param1String, param1Bundle1);
        } else {
          this.n = param1Bundle2;
          l.b(param1String, param1List, param1Bundle1);
          this.n = null;
        }  
    }
    
    void f() {
      Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("  mServiceComponent=");
      stringBuilder.append(this.b);
      Log.d("MediaBrowserCompat", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("  mCallback=");
      stringBuilder.append(this.c);
      Log.d("MediaBrowserCompat", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("  mRootHints=");
      stringBuilder.append(this.d);
      Log.d("MediaBrowserCompat", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("  mState=");
      stringBuilder.append(i(this.g));
      Log.d("MediaBrowserCompat", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("  mServiceConnection=");
      stringBuilder.append(this.h);
      Log.d("MediaBrowserCompat", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("  mServiceBinderWrapper=");
      stringBuilder.append(this.i);
      Log.d("MediaBrowserCompat", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("  mCallbacksMessenger=");
      stringBuilder.append(this.j);
      Log.d("MediaBrowserCompat", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("  mRootId=");
      stringBuilder.append(this.k);
      Log.d("MediaBrowserCompat", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("  mMediaSessionToken=");
      stringBuilder.append(this.l);
      Log.d("MediaBrowserCompat", stringBuilder.toString());
    }
    
    public void g(Messenger param1Messenger) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onConnectFailed for ");
      stringBuilder.append(this.b);
      Log.e("MediaBrowserCompat", stringBuilder.toString());
      if (!k(param1Messenger, "onConnectFailed"))
        return; 
      if (this.g != 2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("onConnect from service while mState=");
        stringBuilder1.append(i(this.g));
        stringBuilder1.append("... ignoring");
        Log.w("MediaBrowserCompat", stringBuilder1.toString());
        return;
      } 
      h();
      this.c.b();
    }
    
    void h() {
      c c1 = this.h;
      if (c1 != null)
        this.a.unbindService(c1); 
      this.g = 1;
      this.h = null;
      this.i = null;
      this.j = null;
      this.e.a(null);
      this.k = null;
      this.l = null;
    }
    
    public boolean j() {
      boolean bool;
      if (this.g == 3) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    class a implements Runnable {
      a(MediaBrowserCompat.h this$0) {}
      
      public void run() {
        MediaBrowserCompat.h h1 = this.b;
        if (h1.g == 0)
          return; 
        h1.g = 2;
        if (!MediaBrowserCompat.a || h1.h == null) {
          if (h1.i == null) {
            if (h1.j == null) {
              boolean bool2;
              Intent intent = new Intent("android.media.browse.MediaBrowserService");
              intent.setComponent(this.b.b);
              MediaBrowserCompat.h h2 = this.b;
              h2.h = new MediaBrowserCompat.h.c(h2);
              boolean bool1 = false;
              try {
                h2 = this.b;
                bool2 = h2.a.bindService(intent, h2.h, 1);
              } catch (Exception exception) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Failed binding to service ");
                stringBuilder3.append(this.b.b);
                Log.e("MediaBrowserCompat", stringBuilder3.toString());
                bool2 = bool1;
              } 
              if (!bool2) {
                this.b.h();
                this.b.c.b();
              } 
              if (MediaBrowserCompat.a) {
                Log.d("MediaBrowserCompat", "connect...");
                this.b.f();
              } 
              return;
            } 
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("mCallbacksMessenger should be null. Instead it is ");
            stringBuilder2.append(this.b.j);
            throw new RuntimeException(stringBuilder2.toString());
          } 
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("mServiceBinderWrapper should be null. Instead it is ");
          stringBuilder1.append(this.b.i);
          throw new RuntimeException(stringBuilder1.toString());
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mServiceConnection should be null. Instead it is ");
        stringBuilder.append(this.b.h);
        throw new RuntimeException(stringBuilder.toString());
      }
    }
    
    class b implements Runnable {
      b(MediaBrowserCompat.h this$0) {}
      
      public void run() {
        MediaBrowserCompat.h h1 = this.b;
        Messenger messenger = h1.j;
        if (messenger != null)
          try {
            h1.i.c(messenger);
          } catch (RemoteException remoteException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RemoteException during connect for ");
            stringBuilder.append(this.b.b);
            Log.w("MediaBrowserCompat", stringBuilder.toString());
          }  
        MediaBrowserCompat.h h2 = this.b;
        int i = h2.g;
        h2.h();
        if (i != 0)
          this.b.g = i; 
        if (MediaBrowserCompat.a) {
          Log.d("MediaBrowserCompat", "disconnect...");
          this.b.f();
        } 
      }
    }
    
    private class c implements ServiceConnection {
      c(MediaBrowserCompat.h this$0) {}
      
      private void b(Runnable param2Runnable) {
        if (Thread.currentThread() == this.a.e.getLooper().getThread()) {
          param2Runnable.run();
        } else {
          this.a.e.post(param2Runnable);
        } 
      }
      
      boolean a(String param2String) {
        MediaBrowserCompat.h h1 = this.a;
        if (h1.h == this) {
          int j = h1.g;
          if (j != 0 && j != 1)
            return true; 
        } 
        int i = h1.g;
        if (i != 0 && i != 1) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(param2String);
          stringBuilder.append(" for ");
          stringBuilder.append(this.a.b);
          stringBuilder.append(" with mServiceConnection=");
          stringBuilder.append(this.a.h);
          stringBuilder.append(" this=");
          stringBuilder.append(this);
          Log.i("MediaBrowserCompat", stringBuilder.toString());
        } 
        return false;
      }
      
      public void onServiceConnected(ComponentName param2ComponentName, IBinder param2IBinder) {
        b(new a(this, param2ComponentName, param2IBinder));
      }
      
      public void onServiceDisconnected(ComponentName param2ComponentName) {
        b(new b(this, param2ComponentName));
      }
      
      class a implements Runnable {
        a(MediaBrowserCompat.h.c this$0, ComponentName param3ComponentName, IBinder param3IBinder) {}
        
        public void run() {
          boolean bool = MediaBrowserCompat.a;
          if (bool) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaServiceConnection.onServiceConnected name=");
            stringBuilder.append(this.b);
            stringBuilder.append(" binder=");
            stringBuilder.append(this.c);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            this.d.a.f();
          } 
          if (!this.d.a("onServiceConnected"))
            return; 
          MediaBrowserCompat.h h = this.d.a;
          h.i = new MediaBrowserCompat.j(this.c, h.d);
          this.d.a.j = new Messenger(this.d.a.e);
          h = this.d.a;
          h.e.a(h.j);
          this.d.a.g = 2;
          if (bool) {
            try {
              Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
              this.d.a.f();
              h = this.d.a;
              h.i.b(h.a, h.j);
            } catch (RemoteException remoteException) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("RemoteException during connect for ");
              stringBuilder.append(this.d.a.b);
              Log.w("MediaBrowserCompat", stringBuilder.toString());
              if (MediaBrowserCompat.a) {
                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                this.d.a.f();
              } 
            } 
            return;
          } 
          h = this.d.a;
          h.i.b(h.a, h.j);
        }
      }
      
      class b implements Runnable {
        b(MediaBrowserCompat.h.c this$0, ComponentName param3ComponentName) {}
        
        public void run() {
          if (MediaBrowserCompat.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaServiceConnection.onServiceDisconnected name=");
            stringBuilder.append(this.b);
            stringBuilder.append(" this=");
            stringBuilder.append(this);
            stringBuilder.append(" mServiceConnection=");
            stringBuilder.append(this.c.a.h);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            this.c.a.f();
          } 
          if (!this.c.a("onServiceDisconnected"))
            return; 
          MediaBrowserCompat.h h = this.c.a;
          h.i = null;
          h.j = null;
          h.e.a(null);
          h = this.c.a;
          h.g = 4;
          h.c.c();
        }
      }
    }
    
    class a implements Runnable {
      a(MediaBrowserCompat.h this$0, ComponentName param2ComponentName, IBinder param2IBinder) {}
      
      public void run() {
        boolean bool = MediaBrowserCompat.a;
        if (bool) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("MediaServiceConnection.onServiceConnected name=");
          stringBuilder.append(this.b);
          stringBuilder.append(" binder=");
          stringBuilder.append(this.c);
          Log.d("MediaBrowserCompat", stringBuilder.toString());
          this.d.a.f();
        } 
        if (!this.d.a("onServiceConnected"))
          return; 
        MediaBrowserCompat.h h = this.d.a;
        h.i = new MediaBrowserCompat.j(this.c, h.d);
        this.d.a.j = new Messenger(this.d.a.e);
        h = this.d.a;
        h.e.a(h.j);
        this.d.a.g = 2;
        if (bool) {
          try {
            Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
            this.d.a.f();
            h = this.d.a;
            h.i.b(h.a, h.j);
          } catch (RemoteException remoteException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RemoteException during connect for ");
            stringBuilder.append(this.d.a.b);
            Log.w("MediaBrowserCompat", stringBuilder.toString());
            if (MediaBrowserCompat.a) {
              Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
              this.d.a.f();
            } 
          } 
          return;
        } 
        h = this.d.a;
        h.i.b(h.a, h.j);
      }
    }
    
    class b implements Runnable {
      b(MediaBrowserCompat.h this$0, ComponentName param2ComponentName) {}
      
      public void run() {
        if (MediaBrowserCompat.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("MediaServiceConnection.onServiceDisconnected name=");
          stringBuilder.append(this.b);
          stringBuilder.append(" this=");
          stringBuilder.append(this);
          stringBuilder.append(" mServiceConnection=");
          stringBuilder.append(this.c.a.h);
          Log.d("MediaBrowserCompat", stringBuilder.toString());
          this.c.a.f();
        } 
        if (!this.c.a("onServiceDisconnected"))
          return; 
        MediaBrowserCompat.h h = this.c.a;
        h.i = null;
        h.j = null;
        h.e.a(null);
        h = this.c.a;
        h.g = 4;
        h.c.c();
      }
    }
  }
  
  class a implements Runnable {
    a(MediaBrowserCompat this$0) {}
    
    public void run() {
      MediaBrowserCompat.h h1 = this.b;
      if (h1.g == 0)
        return; 
      h1.g = 2;
      if (!MediaBrowserCompat.a || h1.h == null) {
        if (h1.i == null) {
          if (h1.j == null) {
            boolean bool2;
            Intent intent = new Intent("android.media.browse.MediaBrowserService");
            intent.setComponent(this.b.b);
            MediaBrowserCompat.h h2 = this.b;
            h2.h = new MediaBrowserCompat.h.c(h2);
            boolean bool1 = false;
            try {
              h2 = this.b;
              bool2 = h2.a.bindService(intent, h2.h, 1);
            } catch (Exception exception) {
              StringBuilder stringBuilder3 = new StringBuilder();
              stringBuilder3.append("Failed binding to service ");
              stringBuilder3.append(this.b.b);
              Log.e("MediaBrowserCompat", stringBuilder3.toString());
              bool2 = bool1;
            } 
            if (!bool2) {
              this.b.h();
              this.b.c.b();
            } 
            if (MediaBrowserCompat.a) {
              Log.d("MediaBrowserCompat", "connect...");
              this.b.f();
            } 
            return;
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("mCallbacksMessenger should be null. Instead it is ");
          stringBuilder2.append(this.b.j);
          throw new RuntimeException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("mServiceBinderWrapper should be null. Instead it is ");
        stringBuilder1.append(this.b.i);
        throw new RuntimeException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("mServiceConnection should be null. Instead it is ");
      stringBuilder.append(this.b.h);
      throw new RuntimeException(stringBuilder.toString());
    }
  }
  
  class b implements Runnable {
    b(MediaBrowserCompat this$0) {}
    
    public void run() {
      MediaBrowserCompat.h h1 = this.b;
      Messenger messenger = h1.j;
      if (messenger != null)
        try {
          h1.i.c(messenger);
        } catch (RemoteException remoteException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("RemoteException during connect for ");
          stringBuilder.append(this.b.b);
          Log.w("MediaBrowserCompat", stringBuilder.toString());
        }  
      MediaBrowserCompat.h h2 = this.b;
      int i = h2.g;
      h2.h();
      if (i != 0)
        this.b.g = i; 
      if (MediaBrowserCompat.a) {
        Log.d("MediaBrowserCompat", "disconnect...");
        this.b.f();
      } 
    }
  }
  
  private class c implements ServiceConnection {
    c(MediaBrowserCompat this$0) {}
    
    private void b(Runnable param1Runnable) {
      if (Thread.currentThread() == this.a.e.getLooper().getThread()) {
        param1Runnable.run();
      } else {
        this.a.e.post(param1Runnable);
      } 
    }
    
    boolean a(String param1String) {
      MediaBrowserCompat.h h1 = this.a;
      if (h1.h == this) {
        int j = h1.g;
        if (j != 0 && j != 1)
          return true; 
      } 
      int i = h1.g;
      if (i != 0 && i != 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String);
        stringBuilder.append(" for ");
        stringBuilder.append(this.a.b);
        stringBuilder.append(" with mServiceConnection=");
        stringBuilder.append(this.a.h);
        stringBuilder.append(" this=");
        stringBuilder.append(this);
        Log.i("MediaBrowserCompat", stringBuilder.toString());
      } 
      return false;
    }
    
    public void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      b(new a(this, param1ComponentName, param1IBinder));
    }
    
    public void onServiceDisconnected(ComponentName param1ComponentName) {
      b(new b(this, param1ComponentName));
    }
    
    class a implements Runnable {
      a(MediaBrowserCompat.h.c this$0, ComponentName param3ComponentName, IBinder param3IBinder) {}
      
      public void run() {
        boolean bool = MediaBrowserCompat.a;
        if (bool) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("MediaServiceConnection.onServiceConnected name=");
          stringBuilder.append(this.b);
          stringBuilder.append(" binder=");
          stringBuilder.append(this.c);
          Log.d("MediaBrowserCompat", stringBuilder.toString());
          this.d.a.f();
        } 
        if (!this.d.a("onServiceConnected"))
          return; 
        MediaBrowserCompat.h h = this.d.a;
        h.i = new MediaBrowserCompat.j(this.c, h.d);
        this.d.a.j = new Messenger(this.d.a.e);
        h = this.d.a;
        h.e.a(h.j);
        this.d.a.g = 2;
        if (bool) {
          try {
            Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
            this.d.a.f();
            h = this.d.a;
            h.i.b(h.a, h.j);
          } catch (RemoteException remoteException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RemoteException during connect for ");
            stringBuilder.append(this.d.a.b);
            Log.w("MediaBrowserCompat", stringBuilder.toString());
            if (MediaBrowserCompat.a) {
              Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
              this.d.a.f();
            } 
          } 
          return;
        } 
        h = this.d.a;
        h.i.b(h.a, h.j);
      }
    }
    
    class b implements Runnable {
      b(MediaBrowserCompat.h.c this$0, ComponentName param3ComponentName) {}
      
      public void run() {
        if (MediaBrowserCompat.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("MediaServiceConnection.onServiceDisconnected name=");
          stringBuilder.append(this.b);
          stringBuilder.append(" this=");
          stringBuilder.append(this);
          stringBuilder.append(" mServiceConnection=");
          stringBuilder.append(this.c.a.h);
          Log.d("MediaBrowserCompat", stringBuilder.toString());
          this.c.a.f();
        } 
        if (!this.c.a("onServiceDisconnected"))
          return; 
        MediaBrowserCompat.h h = this.c.a;
        h.i = null;
        h.j = null;
        h.e.a(null);
        h = this.c.a;
        h.g = 4;
        h.c.c();
      }
    }
  }
  
  class a implements Runnable {
    a(MediaBrowserCompat this$0, ComponentName param1ComponentName, IBinder param1IBinder) {}
    
    public void run() {
      boolean bool = MediaBrowserCompat.a;
      if (bool) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaServiceConnection.onServiceConnected name=");
        stringBuilder.append(this.b);
        stringBuilder.append(" binder=");
        stringBuilder.append(this.c);
        Log.d("MediaBrowserCompat", stringBuilder.toString());
        this.d.a.f();
      } 
      if (!this.d.a("onServiceConnected"))
        return; 
      MediaBrowserCompat.h h = this.d.a;
      h.i = new MediaBrowserCompat.j(this.c, h.d);
      this.d.a.j = new Messenger(this.d.a.e);
      h = this.d.a;
      h.e.a(h.j);
      this.d.a.g = 2;
      if (bool) {
        try {
          Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
          this.d.a.f();
          h = this.d.a;
          h.i.b(h.a, h.j);
        } catch (RemoteException remoteException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("RemoteException during connect for ");
          stringBuilder.append(this.d.a.b);
          Log.w("MediaBrowserCompat", stringBuilder.toString());
          if (MediaBrowserCompat.a) {
            Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
            this.d.a.f();
          } 
        } 
        return;
      } 
      h = this.d.a;
      h.i.b(h.a, h.j);
    }
  }
  
  class b implements Runnable {
    b(MediaBrowserCompat this$0, ComponentName param1ComponentName) {}
    
    public void run() {
      if (MediaBrowserCompat.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaServiceConnection.onServiceDisconnected name=");
        stringBuilder.append(this.b);
        stringBuilder.append(" this=");
        stringBuilder.append(this);
        stringBuilder.append(" mServiceConnection=");
        stringBuilder.append(this.c.a.h);
        Log.d("MediaBrowserCompat", stringBuilder.toString());
        this.c.a.f();
      } 
      if (!this.c.a("onServiceDisconnected"))
        return; 
      MediaBrowserCompat.h h = this.c.a;
      h.i = null;
      h.j = null;
      h.e.a(null);
      h = this.c.a;
      h.g = 4;
      h.c.c();
    }
  }
  
  static interface i {
    void d(Messenger param1Messenger, String param1String, MediaSessionCompat.Token param1Token, Bundle param1Bundle);
    
    void e(Messenger param1Messenger, String param1String, List param1List, Bundle param1Bundle1, Bundle param1Bundle2);
    
    void g(Messenger param1Messenger);
  }
  
  private static class j {
    private Messenger a;
    
    private Bundle b;
    
    public j(IBinder param1IBinder, Bundle param1Bundle) {
      this.a = new Messenger(param1IBinder);
      this.b = param1Bundle;
    }
    
    private void e(int param1Int, Bundle param1Bundle, Messenger param1Messenger) {
      Message message = Message.obtain();
      message.what = param1Int;
      message.arg1 = 1;
      message.setData(param1Bundle);
      message.replyTo = param1Messenger;
      this.a.send(message);
    }
    
    void a(String param1String, IBinder param1IBinder, Bundle param1Bundle, Messenger param1Messenger) {
      Bundle bundle = new Bundle();
      bundle.putString("data_media_item_id", param1String);
      androidx.core.app.f.b(bundle, "data_callback_token", param1IBinder);
      bundle.putBundle("data_options", param1Bundle);
      e(3, bundle, param1Messenger);
    }
    
    void b(Context param1Context, Messenger param1Messenger) {
      Bundle bundle = new Bundle();
      bundle.putString("data_package_name", param1Context.getPackageName());
      bundle.putBundle("data_root_hints", this.b);
      e(1, bundle, param1Messenger);
    }
    
    void c(Messenger param1Messenger) {
      e(2, null, param1Messenger);
    }
    
    void d(Context param1Context, Messenger param1Messenger) {
      Bundle bundle = new Bundle();
      bundle.putString("data_package_name", param1Context.getPackageName());
      bundle.putBundle("data_root_hints", this.b);
      e(6, bundle, param1Messenger);
    }
    
    void f(Messenger param1Messenger) {
      e(7, null, param1Messenger);
    }
  }
  
  private static class k {
    private final List<MediaBrowserCompat.l> a = new ArrayList<MediaBrowserCompat.l>();
    
    private final List<Bundle> b = new ArrayList<Bundle>();
    
    public MediaBrowserCompat.l a(Bundle param1Bundle) {
      for (byte b = 0; b < this.b.size(); b++) {
        if (androidx.media.a.a(this.b.get(b), param1Bundle))
          return this.a.get(b); 
      } 
      return null;
    }
    
    public List<MediaBrowserCompat.l> b() {
      return this.a;
    }
    
    public List<Bundle> c() {
      return this.b;
    }
  }
  
  public static abstract class l {
    final MediaBrowser.SubscriptionCallback a;
    
    final IBinder b = (IBinder)new Binder();
    
    WeakReference<MediaBrowserCompat.k> c;
    
    public l() {
      int i = Build.VERSION.SDK_INT;
      if (i >= 26) {
        this.a = new b(this);
      } else if (i >= 21) {
        this.a = new a(this);
      } else {
        this.a = null;
      } 
    }
    
    public void a(String param1String, List<MediaBrowserCompat.MediaItem> param1List) {}
    
    public void b(String param1String, List<MediaBrowserCompat.MediaItem> param1List, Bundle param1Bundle) {}
    
    public void c(String param1String) {}
    
    public void d(String param1String, Bundle param1Bundle) {}
    
    private class a extends MediaBrowser.SubscriptionCallback {
      a(MediaBrowserCompat.l this$0) {}
      
      List<MediaBrowserCompat.MediaItem> a(List<MediaBrowserCompat.MediaItem> param2List, Bundle param2Bundle) {
        if (param2List == null)
          return null; 
        int i = param2Bundle.getInt("android.media.browse.extra.PAGE", -1);
        int j = param2Bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && j == -1)
          return param2List; 
        int k = j * i;
        int m = k + j;
        if (i < 0 || j < 1 || k >= param2List.size())
          return Collections.emptyList(); 
        j = m;
        if (m > param2List.size())
          j = param2List.size(); 
        return param2List.subList(k, j);
      }
      
      public void onChildrenLoaded(String param2String, List<MediaBrowser.MediaItem> param2List) {
        MediaBrowserCompat.k k;
        WeakReference<MediaBrowserCompat.k> weakReference = this.a.c;
        if (weakReference == null) {
          weakReference = null;
        } else {
          k = weakReference.get();
        } 
        if (k == null) {
          this.a.a(param2String, MediaBrowserCompat.MediaItem.b(param2List));
        } else {
          List<MediaBrowserCompat.MediaItem> list = MediaBrowserCompat.MediaItem.b(param2List);
          param2List = (List)k.b();
          List<Bundle> list1 = k.c();
          for (byte b = 0; b < param2List.size(); b++) {
            Bundle bundle = list1.get(b);
            if (bundle == null) {
              this.a.a(param2String, list);
            } else {
              this.a.b(param2String, a(list, bundle), bundle);
            } 
          } 
        } 
      }
      
      public void onError(String param2String) {
        this.a.c(param2String);
      }
    }
    
    private class b extends a {
      b(MediaBrowserCompat.l this$0) {
        super(this$0);
      }
      
      public void onChildrenLoaded(String param2String, List<MediaBrowser.MediaItem> param2List, Bundle param2Bundle) {
        MediaSessionCompat.a(param2Bundle);
        this.b.b(param2String, MediaBrowserCompat.MediaItem.b(param2List), param2Bundle);
      }
      
      public void onError(String param2String, Bundle param2Bundle) {
        MediaSessionCompat.a(param2Bundle);
        this.b.d(param2String, param2Bundle);
      }
    }
  }
  
  private class a extends MediaBrowser.SubscriptionCallback {
    a(MediaBrowserCompat this$0) {}
    
    List<MediaBrowserCompat.MediaItem> a(List<MediaBrowserCompat.MediaItem> param1List, Bundle param1Bundle) {
      if (param1List == null)
        return null; 
      int i = param1Bundle.getInt("android.media.browse.extra.PAGE", -1);
      int j = param1Bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
      if (i == -1 && j == -1)
        return param1List; 
      int k = j * i;
      int m = k + j;
      if (i < 0 || j < 1 || k >= param1List.size())
        return Collections.emptyList(); 
      j = m;
      if (m > param1List.size())
        j = param1List.size(); 
      return param1List.subList(k, j);
    }
    
    public void onChildrenLoaded(String param1String, List<MediaBrowser.MediaItem> param1List) {
      MediaBrowserCompat.k k;
      WeakReference<MediaBrowserCompat.k> weakReference = this.a.c;
      if (weakReference == null) {
        weakReference = null;
      } else {
        k = weakReference.get();
      } 
      if (k == null) {
        this.a.a(param1String, MediaBrowserCompat.MediaItem.b(param1List));
      } else {
        List<MediaBrowserCompat.MediaItem> list = MediaBrowserCompat.MediaItem.b(param1List);
        param1List = (List)k.b();
        List<Bundle> list1 = k.c();
        for (byte b = 0; b < param1List.size(); b++) {
          Bundle bundle = list1.get(b);
          if (bundle == null) {
            this.a.a(param1String, list);
          } else {
            this.a.b(param1String, a(list, bundle), bundle);
          } 
        } 
      } 
    }
    
    public void onError(String param1String) {
      this.a.c(param1String);
    }
  }
  
  private class b extends l.a {
    b(MediaBrowserCompat this$0) {
      super((MediaBrowserCompat.l)this$0);
    }
    
    public void onChildrenLoaded(String param1String, List<MediaBrowser.MediaItem> param1List, Bundle param1Bundle) {
      MediaSessionCompat.a(param1Bundle);
      this.b.b(param1String, MediaBrowserCompat.MediaItem.b(param1List), param1Bundle);
    }
    
    public void onError(String param1String, Bundle param1Bundle) {
      MediaSessionCompat.a(param1Bundle);
      this.b.d(param1String, param1Bundle);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/MediaBrowserCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */