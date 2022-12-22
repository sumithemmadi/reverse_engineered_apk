package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
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
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
  static final boolean b = Log.isLoggable("MBServiceCompat", 3);
  
  private g c;
  
  final b.e.a<IBinder, f> d = new b.e.a();
  
  f e;
  
  final q f = new q(this);
  
  MediaSessionCompat.Token g;
  
  void a(String paramString, f paramf, IBinder paramIBinder, Bundle paramBundle) {
    List<b.h.j.e> list1 = (List)paramf.g.get(paramString);
    List<b.h.j.e> list2 = list1;
    if (list1 == null)
      list2 = new ArrayList(); 
    for (b.h.j.e e : list2) {
      if (paramIBinder == e.a && a.a(paramBundle, (Bundle)e.b))
        return; 
    } 
    list2.add(new b.h.j.e(paramIBinder, paramBundle));
    paramf.g.put(paramString, list2);
    m(paramString, paramf, paramBundle, null);
    this.e = paramf;
    j(paramString, paramBundle);
    this.e = null;
  }
  
  List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle) {
    if (paramList == null)
      return null; 
    int i = paramBundle.getInt("android.media.browse.extra.PAGE", -1);
    int j = paramBundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    if (i == -1 && j == -1)
      return paramList; 
    int k = j * i;
    int m = k + j;
    if (i < 0 || j < 1 || k >= paramList.size())
      return Collections.emptyList(); 
    i = m;
    if (m > paramList.size())
      i = paramList.size(); 
    return paramList.subList(k, i);
  }
  
  boolean c(String paramString, int paramInt) {
    if (paramString == null)
      return false; 
    String[] arrayOfString = getPackageManager().getPackagesForUid(paramInt);
    int i = arrayOfString.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      if (arrayOfString[paramInt].equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public void d(String paramString, Bundle paramBundle, m<Bundle> paramm) {
    paramm.e(null);
  }
  
  public void dump(FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public abstract e e(String paramString, int paramInt, Bundle paramBundle);
  
  public abstract void f(String paramString, m<List<MediaBrowserCompat.MediaItem>> paramm);
  
  public void g(String paramString, m<List<MediaBrowserCompat.MediaItem>> paramm, Bundle paramBundle) {
    paramm.g(1);
    f(paramString, paramm);
  }
  
  public void h(String paramString, m<MediaBrowserCompat.MediaItem> paramm) {
    paramm.g(2);
    paramm.f(null);
  }
  
  public void i(String paramString, Bundle paramBundle, m<List<MediaBrowserCompat.MediaItem>> paramm) {
    paramm.g(4);
    paramm.f(null);
  }
  
  public void j(String paramString, Bundle paramBundle) {}
  
  public void k(String paramString) {}
  
  void l(String paramString, Bundle paramBundle, f paramf, ResultReceiver paramResultReceiver) {
    d d = new d(this, paramString, paramResultReceiver);
    this.e = paramf;
    d(paramString, paramBundle, d);
    this.e = null;
    if (d.b())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
    stringBuilder.append(paramString);
    stringBuilder.append(" extras=");
    stringBuilder.append(paramBundle);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  void m(String paramString, f paramf, Bundle paramBundle1, Bundle paramBundle2) {
    a a1 = new a(this, paramString, paramf, paramString, paramBundle1, paramBundle2);
    this.e = paramf;
    if (paramBundle1 == null) {
      f(paramString, a1);
    } else {
      g(paramString, a1, paramBundle1);
    } 
    this.e = null;
    if (a1.b())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onLoadChildren must call detach() or sendResult() before returning for package=");
    stringBuilder.append(paramf.a);
    stringBuilder.append(" id=");
    stringBuilder.append(paramString);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  void n(String paramString, f paramf, ResultReceiver paramResultReceiver) {
    b b = new b(this, paramString, paramResultReceiver);
    this.e = paramf;
    h(paramString, b);
    this.e = null;
    if (b.b())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onLoadItem must call detach() or sendResult() before returning for id=");
    stringBuilder.append(paramString);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  void o(String paramString, Bundle paramBundle, f paramf, ResultReceiver paramResultReceiver) {
    c c = new c(this, paramString, paramResultReceiver);
    this.e = paramf;
    i(paramString, paramBundle, c);
    this.e = null;
    if (c.b())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onSearch must call detach() or sendResult() before returning for query=");
    stringBuilder.append(paramString);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public IBinder onBind(Intent paramIntent) {
    return this.c.Y0(paramIntent);
  }
  
  public void onCreate() {
    super.onCreate();
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      this.c = new k(this);
    } else if (i >= 26) {
      this.c = new j(this);
    } else if (i >= 23) {
      this.c = new i(this);
    } else if (i >= 21) {
      this.c = new h(this);
    } else {
      this.c = new l(this);
    } 
    this.c.a();
  }
  
  boolean p(String paramString, f paramf, IBinder paramIBinder) {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramIBinder == null)
      try {
        paramIBinder = (IBinder)paramf.g.remove(paramString);
        if (paramIBinder != null) {
          bool3 = bool1;
        } else {
          bool3 = false;
        } 
        return bool3;
      } finally {
        this.e = paramf;
        k(paramString);
        this.e = null;
      }  
    List list = paramf.g.get(paramString);
    bool1 = bool2;
    if (list != null) {
      Iterator iterator = list.iterator();
      while (iterator.hasNext()) {
        if (paramIBinder == ((b.h.j.e)iterator.next()).a) {
          iterator.remove();
          bool3 = true;
        } 
      } 
      bool1 = bool3;
      if (list.size() == 0) {
        paramf.g.remove(paramString);
        bool1 = bool3;
      } 
    } 
    this.e = paramf;
    k(paramString);
    this.e = null;
    return bool1;
  }
  
  class a extends m<List<MediaBrowserCompat.MediaItem>> {
    a(MediaBrowserServiceCompat this$0, Object param1Object, MediaBrowserServiceCompat.f param1f, String param1String, Bundle param1Bundle1, Bundle param1Bundle2) {
      super(param1Object);
    }
    
    void h(List<MediaBrowserCompat.MediaItem> param1List) {
      StringBuilder stringBuilder1;
      List<MediaBrowserCompat.MediaItem> list;
      if (this.j.d.get(this.f.f.asBinder()) != this.f) {
        if (MediaBrowserServiceCompat.b) {
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
          stringBuilder1.append(this.f.a);
          stringBuilder1.append(" id=");
          stringBuilder1.append(this.g);
          Log.d("MBServiceCompat", stringBuilder1.toString());
        } 
        return;
      } 
      StringBuilder stringBuilder2 = stringBuilder1;
      if ((a() & 0x1) != 0)
        list = this.j.b((List<MediaBrowserCompat.MediaItem>)stringBuilder1, this.h); 
      try {
        this.f.f.a(this.g, list, this.h, this.i);
      } catch (RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Calling onLoadChildren() failed for id=");
        stringBuilder.append(this.g);
        stringBuilder.append(" package=");
        stringBuilder.append(this.f.a);
        Log.w("MBServiceCompat", stringBuilder.toString());
      } 
    }
  }
  
  class b extends m<MediaBrowserCompat.MediaItem> {
    b(MediaBrowserServiceCompat this$0, Object param1Object, ResultReceiver param1ResultReceiver) {
      super(param1Object);
    }
    
    void h(MediaBrowserCompat.MediaItem param1MediaItem) {
      if ((a() & 0x2) != 0) {
        this.f.b(-1, null);
        return;
      } 
      Bundle bundle = new Bundle();
      bundle.putParcelable("media_item", (Parcelable)param1MediaItem);
      this.f.b(0, bundle);
    }
  }
  
  class c extends m<List<MediaBrowserCompat.MediaItem>> {
    c(MediaBrowserServiceCompat this$0, Object param1Object, ResultReceiver param1ResultReceiver) {
      super(param1Object);
    }
    
    void h(List<MediaBrowserCompat.MediaItem> param1List) {
      if ((a() & 0x4) != 0 || param1List == null) {
        this.f.b(-1, null);
        return;
      } 
      Bundle bundle = new Bundle();
      bundle.putParcelableArray("search_results", (Parcelable[])param1List.toArray((Object[])new MediaBrowserCompat.MediaItem[0]));
      this.f.b(0, bundle);
    }
  }
  
  class d extends m<Bundle> {
    d(MediaBrowserServiceCompat this$0, Object param1Object, ResultReceiver param1ResultReceiver) {
      super(param1Object);
    }
    
    void c(Bundle param1Bundle) {
      this.f.b(-1, param1Bundle);
    }
    
    void h(Bundle param1Bundle) {
      this.f.b(0, param1Bundle);
    }
  }
  
  public static final class e {}
  
  private class f implements IBinder.DeathRecipient {
    public final String a;
    
    public final int b;
    
    public final int c;
    
    public final e d;
    
    public final Bundle e;
    
    public final MediaBrowserServiceCompat.o f;
    
    public final HashMap<String, List<b.h.j.e<IBinder, Bundle>>> g = new HashMap<String, List<b.h.j.e<IBinder, Bundle>>>();
    
    f(MediaBrowserServiceCompat this$0, String param1String, int param1Int1, int param1Int2, Bundle param1Bundle, MediaBrowserServiceCompat.o param1o) {
      this.a = param1String;
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = new e(param1String, param1Int1, param1Int2);
      this.e = param1Bundle;
      this.f = param1o;
    }
    
    public void binderDied() {
      this.h.f.post(new a(this));
    }
    
    class a implements Runnable {
      a(MediaBrowserServiceCompat.f this$0) {}
      
      public void run() {
        MediaBrowserServiceCompat.f f1 = this.b;
        f1.h.d.remove(f1.f.asBinder());
      }
    }
  }
  
  class a implements Runnable {
    a(MediaBrowserServiceCompat this$0) {}
    
    public void run() {
      MediaBrowserServiceCompat.f f1 = this.b;
      f1.h.d.remove(f1.f.asBinder());
    }
  }
  
  static interface g {
    IBinder Y0(Intent param1Intent);
    
    void a();
  }
  
  class h implements g, b.d {
    final List<Bundle> a = new ArrayList<Bundle>();
    
    Object b;
    
    Messenger c;
    
    h(MediaBrowserServiceCompat this$0) {}
    
    public IBinder Y0(Intent param1Intent) {
      return b.b(this.b, param1Intent);
    }
    
    public void a() {
      Object object = b.a((Context)this.d, this);
      this.b = object;
      b.c(object);
    }
    
    public void c(String param1String, b.c<List<Parcel>> param1c) {
      a a = new a(this, param1String, param1c);
      this.d.f(param1String, a);
    }
    
    public b.a e(String param1String, int param1Int, Bundle param1Bundle) {
      Object object;
      if (param1Bundle != null && param1Bundle.getInt("extra_client_version", 0) != 0) {
        param1Bundle.remove("extra_client_version");
        this.c = new Messenger(this.d.f);
        Bundle bundle = new Bundle();
        bundle.putInt("extra_service_version", 2);
        androidx.core.app.f.b(bundle, "extra_messenger", this.c.getBinder());
        object = this.d.g;
        if (object != null) {
          IBinder iBinder;
          android.support.v4.media.session.b b = object.c();
          if (b == null) {
            b = null;
          } else {
            iBinder = b.asBinder();
          } 
          androidx.core.app.f.b(bundle, "extra_session_binder", iBinder);
          Bundle bundle1 = bundle;
        } else {
          this.a.add(bundle);
          Bundle bundle1 = bundle;
        } 
      } else {
        object = null;
      } 
      MediaBrowserServiceCompat mediaBrowserServiceCompat = this.d;
      mediaBrowserServiceCompat.e = new MediaBrowserServiceCompat.f(mediaBrowserServiceCompat, param1String, -1, param1Int, param1Bundle, null);
      MediaBrowserServiceCompat.e e = this.d.e(param1String, param1Int, param1Bundle);
      this.d.e = null;
      if (e == null)
        return null; 
      object.getClass();
      throw null;
    }
    
    class a extends MediaBrowserServiceCompat.m<List<MediaBrowserCompat.MediaItem>> {
      a(MediaBrowserServiceCompat.h this$0, Object param2Object, b.c param2c) {
        super(param2Object);
      }
      
      void h(List<MediaBrowserCompat.MediaItem> param2List) {
        if (param2List != null) {
          ArrayList<MediaBrowserCompat.MediaItem> arrayList = new ArrayList();
          Iterator<MediaBrowserCompat.MediaItem> iterator = param2List.iterator();
          while (true) {
            param2List = arrayList;
            if (iterator.hasNext()) {
              MediaBrowserCompat.MediaItem mediaItem = iterator.next();
              Parcel parcel = Parcel.obtain();
              mediaItem.writeToParcel(parcel, 0);
              arrayList.add(parcel);
              continue;
            } 
            break;
          } 
        } else {
          param2List = null;
        } 
        this.f.b(param2List);
      }
    }
  }
  
  class a extends m<List<MediaBrowserCompat.MediaItem>> {
    a(MediaBrowserServiceCompat this$0, Object param1Object, b.c param1c) {
      super(param1Object);
    }
    
    void h(List<MediaBrowserCompat.MediaItem> param1List) {
      if (param1List != null) {
        ArrayList<MediaBrowserCompat.MediaItem> arrayList = new ArrayList();
        Iterator<MediaBrowserCompat.MediaItem> iterator = param1List.iterator();
        while (true) {
          param1List = arrayList;
          if (iterator.hasNext()) {
            MediaBrowserCompat.MediaItem mediaItem = iterator.next();
            Parcel parcel = Parcel.obtain();
            mediaItem.writeToParcel(parcel, 0);
            arrayList.add(parcel);
            continue;
          } 
          break;
        } 
      } else {
        param1List = null;
      } 
      this.f.b(param1List);
    }
  }
  
  class i extends h implements c.b {
    i(MediaBrowserServiceCompat this$0) {
      super(this$0);
    }
    
    public void a() {
      Object object = c.a((Context)this.e, this);
      this.b = object;
      b.c(object);
    }
    
    public void b(String param1String, b.c<Parcel> param1c) {
      a a = new a(this, param1String, param1c);
      this.e.h(param1String, a);
    }
    
    class a extends MediaBrowserServiceCompat.m<MediaBrowserCompat.MediaItem> {
      a(MediaBrowserServiceCompat.i this$0, Object param2Object, b.c param2c) {
        super(param2Object);
      }
      
      void h(MediaBrowserCompat.MediaItem param2MediaItem) {
        if (param2MediaItem == null) {
          this.f.b(null);
        } else {
          Parcel parcel = Parcel.obtain();
          param2MediaItem.writeToParcel(parcel, 0);
          this.f.b(parcel);
        } 
      }
    }
  }
  
  class a extends m<MediaBrowserCompat.MediaItem> {
    a(MediaBrowserServiceCompat this$0, Object param1Object, b.c param1c) {
      super(param1Object);
    }
    
    void h(MediaBrowserCompat.MediaItem param1MediaItem) {
      if (param1MediaItem == null) {
        this.f.b(null);
      } else {
        Parcel parcel = Parcel.obtain();
        param1MediaItem.writeToParcel(parcel, 0);
        this.f.b(parcel);
      } 
    }
  }
  
  class j extends i implements d.c {
    j(MediaBrowserServiceCompat this$0) {
      super(this$0);
    }
    
    public void a() {
      Object object = d.a((Context)this.f, this);
      this.b = object;
      b.c(object);
    }
    
    public void d(String param1String, d.b param1b, Bundle param1Bundle) {
      a a = new a(this, param1String, param1b);
      this.f.g(param1String, a, param1Bundle);
    }
    
    class a extends MediaBrowserServiceCompat.m<List<MediaBrowserCompat.MediaItem>> {
      a(MediaBrowserServiceCompat.j this$0, Object param2Object, d.b param2b) {
        super(param2Object);
      }
      
      void h(List<MediaBrowserCompat.MediaItem> param2List) {
        if (param2List != null) {
          ArrayList<MediaBrowserCompat.MediaItem> arrayList = new ArrayList();
          Iterator<MediaBrowserCompat.MediaItem> iterator = param2List.iterator();
          while (true) {
            param2List = arrayList;
            if (iterator.hasNext()) {
              MediaBrowserCompat.MediaItem mediaItem = iterator.next();
              Parcel parcel = Parcel.obtain();
              mediaItem.writeToParcel(parcel, 0);
              arrayList.add(parcel);
              continue;
            } 
            break;
          } 
        } else {
          param2List = null;
        } 
        this.f.b((List)param2List, a());
      }
    }
  }
  
  class a extends m<List<MediaBrowserCompat.MediaItem>> {
    a(MediaBrowserServiceCompat this$0, Object param1Object, d.b param1b) {
      super(param1Object);
    }
    
    void h(List<MediaBrowserCompat.MediaItem> param1List) {
      if (param1List != null) {
        ArrayList<MediaBrowserCompat.MediaItem> arrayList = new ArrayList();
        Iterator<MediaBrowserCompat.MediaItem> iterator = param1List.iterator();
        while (true) {
          param1List = arrayList;
          if (iterator.hasNext()) {
            MediaBrowserCompat.MediaItem mediaItem = iterator.next();
            Parcel parcel = Parcel.obtain();
            mediaItem.writeToParcel(parcel, 0);
            arrayList.add(parcel);
            continue;
          } 
          break;
        } 
      } else {
        param1List = null;
      } 
      this.f.b((List)param1List, a());
    }
  }
  
  class k extends j {
    k(MediaBrowserServiceCompat this$0) {
      super(this$0);
    }
  }
  
  class l implements g {
    private Messenger a;
    
    l(MediaBrowserServiceCompat this$0) {}
    
    public IBinder Y0(Intent param1Intent) {
      return "android.media.browse.MediaBrowserService".equals(param1Intent.getAction()) ? this.a.getBinder() : null;
    }
    
    public void a() {
      this.a = new Messenger(this.b.f);
    }
  }
  
  public static class m<T> {
    private final Object a;
    
    private boolean b;
    
    private boolean c;
    
    private boolean d;
    
    private int e;
    
    m(Object param1Object) {
      this.a = param1Object;
    }
    
    int a() {
      return this.e;
    }
    
    boolean b() {
      return (this.b || this.c || this.d);
    }
    
    void c(Bundle param1Bundle) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("It is not supported to send an error for ");
      stringBuilder.append(this.a);
      throw new UnsupportedOperationException(stringBuilder.toString());
    }
    
    void d(T param1T) {
      throw null;
    }
    
    public void e(Bundle param1Bundle) {
      if (!this.c && !this.d) {
        this.d = true;
        c(param1Bundle);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("sendError() called when either sendResult() or sendError() had already been called for: ");
      stringBuilder.append(this.a);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public void f(T param1T) {
      if (!this.c && !this.d) {
        this.c = true;
        d(param1T);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
      stringBuilder.append(this.a);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    void g(int param1Int) {
      this.e = param1Int;
    }
  }
  
  private class n {
    n(MediaBrowserServiceCompat this$0) {}
    
    public void a(String param1String, IBinder param1IBinder, Bundle param1Bundle, MediaBrowserServiceCompat.o param1o) {
      this.a.f.a(new c(this, param1o, param1String, param1IBinder, param1Bundle));
    }
    
    public void b(String param1String, int param1Int1, int param1Int2, Bundle param1Bundle, MediaBrowserServiceCompat.o param1o) {
      if (this.a.c(param1String, param1Int2)) {
        this.a.f.a(new a(this, param1o, param1String, param1Int1, param1Int2, param1Bundle));
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Package/uid mismatch: uid=");
      stringBuilder.append(param1Int2);
      stringBuilder.append(" package=");
      stringBuilder.append(param1String);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public void c(MediaBrowserServiceCompat.o param1o) {
      this.a.f.a(new b(this, param1o));
    }
    
    public void d(String param1String, ResultReceiver param1ResultReceiver, MediaBrowserServiceCompat.o param1o) {
      if (!TextUtils.isEmpty(param1String) && param1ResultReceiver != null)
        this.a.f.a(new e(this, param1o, param1String, param1ResultReceiver)); 
    }
    
    public void e(MediaBrowserServiceCompat.o param1o, String param1String, int param1Int1, int param1Int2, Bundle param1Bundle) {
      this.a.f.a(new f(this, param1o, param1String, param1Int1, param1Int2, param1Bundle));
    }
    
    public void f(String param1String, IBinder param1IBinder, MediaBrowserServiceCompat.o param1o) {
      this.a.f.a(new d(this, param1o, param1String, param1IBinder));
    }
    
    public void g(String param1String, Bundle param1Bundle, ResultReceiver param1ResultReceiver, MediaBrowserServiceCompat.o param1o) {
      if (!TextUtils.isEmpty(param1String) && param1ResultReceiver != null)
        this.a.f.a(new h(this, param1o, param1String, param1Bundle, param1ResultReceiver)); 
    }
    
    public void h(String param1String, Bundle param1Bundle, ResultReceiver param1ResultReceiver, MediaBrowserServiceCompat.o param1o) {
      if (!TextUtils.isEmpty(param1String) && param1ResultReceiver != null)
        this.a.f.a(new i(this, param1o, param1String, param1Bundle, param1ResultReceiver)); 
    }
    
    public void i(MediaBrowserServiceCompat.o param1o) {
      this.a.f.a(new g(this, param1o));
    }
    
    class a implements Runnable {
      a(MediaBrowserServiceCompat.n this$0, MediaBrowserServiceCompat.o param2o, String param2String, int param2Int1, int param2Int2, Bundle param2Bundle) {}
      
      public void run() {
        StringBuilder stringBuilder;
        IBinder iBinder = this.b.asBinder();
        this.g.a.d.remove(iBinder);
        MediaBrowserServiceCompat.f f = new MediaBrowserServiceCompat.f(this.g.a, this.c, this.d, this.e, this.f, this.b);
        MediaBrowserServiceCompat mediaBrowserServiceCompat1 = this.g.a;
        mediaBrowserServiceCompat1.e = f;
        MediaBrowserServiceCompat.e e = mediaBrowserServiceCompat1.e(this.c, this.e, this.f);
        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = this.g.a;
        mediaBrowserServiceCompat2.e = null;
        if (e == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("No root for client ");
          stringBuilder.append(this.c);
          stringBuilder.append(" from service ");
          stringBuilder.append(a.class.getName());
          Log.i("MBServiceCompat", stringBuilder.toString());
          try {
            this.b.b();
          } catch (RemoteException remoteException) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Calling onConnectFailed() failed. Ignoring. pkg=");
            stringBuilder.append(this.c);
            Log.w("MBServiceCompat", stringBuilder.toString());
          } 
        } else {
          try {
            mediaBrowserServiceCompat2.d.put(stringBuilder, f);
            stringBuilder.linkToDeath(f, 0);
            MediaSessionCompat.Token token = this.g.a.g;
            if (token != null)
              throw null; 
          } catch (RemoteException remoteException) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Calling onConnect() failed. Dropping client. pkg=");
            stringBuilder1.append(this.c);
            Log.w("MBServiceCompat", stringBuilder1.toString());
            this.g.a.d.remove(stringBuilder);
          } 
        } 
      }
    }
    
    class b implements Runnable {
      b(MediaBrowserServiceCompat.n this$0, MediaBrowserServiceCompat.o param2o) {}
      
      public void run() {
        IBinder iBinder = this.b.asBinder();
        MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.c.a.d.remove(iBinder);
        if (f != null)
          f.f.asBinder().unlinkToDeath(f, 0); 
      }
    }
    
    class c implements Runnable {
      c(MediaBrowserServiceCompat.n this$0, MediaBrowserServiceCompat.o param2o, String param2String, IBinder param2IBinder, Bundle param2Bundle) {}
      
      public void run() {
        StringBuilder stringBuilder;
        IBinder iBinder = this.b.asBinder();
        MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.f.a.d.get(iBinder);
        if (f == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("addSubscription for callback that isn't registered id=");
          stringBuilder.append(this.c);
          Log.w("MBServiceCompat", stringBuilder.toString());
          return;
        } 
        this.f.a.a(this.c, (MediaBrowserServiceCompat.f)stringBuilder, this.d, this.e);
      }
    }
    
    class d implements Runnable {
      d(MediaBrowserServiceCompat.n this$0, MediaBrowserServiceCompat.o param2o, String param2String, IBinder param2IBinder) {}
      
      public void run() {
        StringBuilder stringBuilder;
        IBinder iBinder = this.b.asBinder();
        MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.e.a.d.get(iBinder);
        if (f == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("removeSubscription for callback that isn't registered id=");
          stringBuilder.append(this.c);
          Log.w("MBServiceCompat", stringBuilder.toString());
          return;
        } 
        if (!this.e.a.p(this.c, (MediaBrowserServiceCompat.f)stringBuilder, this.d)) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("removeSubscription called for ");
          stringBuilder.append(this.c);
          stringBuilder.append(" which is not subscribed");
          Log.w("MBServiceCompat", stringBuilder.toString());
        } 
      }
    }
    
    class e implements Runnable {
      e(MediaBrowserServiceCompat.n this$0, MediaBrowserServiceCompat.o param2o, String param2String, ResultReceiver param2ResultReceiver) {}
      
      public void run() {
        StringBuilder stringBuilder;
        IBinder iBinder = this.b.asBinder();
        MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.e.a.d.get(iBinder);
        if (f == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("getMediaItem for callback that isn't registered id=");
          stringBuilder.append(this.c);
          Log.w("MBServiceCompat", stringBuilder.toString());
          return;
        } 
        this.e.a.n(this.c, (MediaBrowserServiceCompat.f)stringBuilder, this.d);
      }
    }
    
    class f implements Runnable {
      f(MediaBrowserServiceCompat.n this$0, MediaBrowserServiceCompat.o param2o, String param2String, int param2Int1, int param2Int2, Bundle param2Bundle) {}
      
      public void run() {
        IBinder iBinder = this.b.asBinder();
        this.g.a.d.remove(iBinder);
        MediaBrowserServiceCompat.f f1 = new MediaBrowserServiceCompat.f(this.g.a, this.c, this.d, this.e, this.f, this.b);
        this.g.a.d.put(iBinder, f1);
        try {
          iBinder.linkToDeath(f1, 0);
        } catch (RemoteException remoteException) {
          Log.w("MBServiceCompat", "IBinder is already dead.");
        } 
      }
    }
    
    class g implements Runnable {
      g(MediaBrowserServiceCompat.n this$0, MediaBrowserServiceCompat.o param2o) {}
      
      public void run() {
        IBinder iBinder = this.b.asBinder();
        MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.c.a.d.remove(iBinder);
        if (f != null)
          iBinder.unlinkToDeath(f, 0); 
      }
    }
    
    class h implements Runnable {
      h(MediaBrowserServiceCompat.n this$0, MediaBrowserServiceCompat.o param2o, String param2String, Bundle param2Bundle, ResultReceiver param2ResultReceiver) {}
      
      public void run() {
        StringBuilder stringBuilder;
        IBinder iBinder = this.b.asBinder();
        MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.f.a.d.get(iBinder);
        if (f == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("search for callback that isn't registered query=");
          stringBuilder.append(this.c);
          Log.w("MBServiceCompat", stringBuilder.toString());
          return;
        } 
        this.f.a.o(this.c, this.d, (MediaBrowserServiceCompat.f)stringBuilder, this.e);
      }
    }
    
    class i implements Runnable {
      i(MediaBrowserServiceCompat.n this$0, MediaBrowserServiceCompat.o param2o, String param2String, Bundle param2Bundle, ResultReceiver param2ResultReceiver) {}
      
      public void run() {
        StringBuilder stringBuilder;
        IBinder iBinder = this.b.asBinder();
        MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.f.a.d.get(iBinder);
        if (f == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("sendCustomAction for callback that isn't registered action=");
          stringBuilder.append(this.c);
          stringBuilder.append(", extras=");
          stringBuilder.append(this.d);
          Log.w("MBServiceCompat", stringBuilder.toString());
          return;
        } 
        this.f.a.l(this.c, this.d, (MediaBrowserServiceCompat.f)stringBuilder, this.e);
      }
    }
  }
  
  class a implements Runnable {
    a(MediaBrowserServiceCompat this$0, MediaBrowserServiceCompat.o param1o, String param1String, int param1Int1, int param1Int2, Bundle param1Bundle) {}
    
    public void run() {
      StringBuilder stringBuilder;
      IBinder iBinder = this.b.asBinder();
      this.g.a.d.remove(iBinder);
      MediaBrowserServiceCompat.f f = new MediaBrowserServiceCompat.f(this.g.a, this.c, this.d, this.e, this.f, this.b);
      MediaBrowserServiceCompat mediaBrowserServiceCompat1 = this.g.a;
      mediaBrowserServiceCompat1.e = f;
      MediaBrowserServiceCompat.e e = mediaBrowserServiceCompat1.e(this.c, this.e, this.f);
      MediaBrowserServiceCompat mediaBrowserServiceCompat2 = this.g.a;
      mediaBrowserServiceCompat2.e = null;
      if (e == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No root for client ");
        stringBuilder.append(this.c);
        stringBuilder.append(" from service ");
        stringBuilder.append(a.class.getName());
        Log.i("MBServiceCompat", stringBuilder.toString());
        try {
          this.b.b();
        } catch (RemoteException remoteException) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Calling onConnectFailed() failed. Ignoring. pkg=");
          stringBuilder.append(this.c);
          Log.w("MBServiceCompat", stringBuilder.toString());
        } 
      } else {
        try {
          mediaBrowserServiceCompat2.d.put(stringBuilder, f);
          stringBuilder.linkToDeath(f, 0);
          MediaSessionCompat.Token token = this.g.a.g;
          if (token != null)
            throw null; 
        } catch (RemoteException remoteException) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Calling onConnect() failed. Dropping client. pkg=");
          stringBuilder1.append(this.c);
          Log.w("MBServiceCompat", stringBuilder1.toString());
          this.g.a.d.remove(stringBuilder);
        } 
      } 
    }
  }
  
  class b implements Runnable {
    b(MediaBrowserServiceCompat this$0, MediaBrowserServiceCompat.o param1o) {}
    
    public void run() {
      IBinder iBinder = this.b.asBinder();
      MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.c.a.d.remove(iBinder);
      if (f != null)
        f.f.asBinder().unlinkToDeath(f, 0); 
    }
  }
  
  class c implements Runnable {
    c(MediaBrowserServiceCompat this$0, MediaBrowserServiceCompat.o param1o, String param1String, IBinder param1IBinder, Bundle param1Bundle) {}
    
    public void run() {
      StringBuilder stringBuilder;
      IBinder iBinder = this.b.asBinder();
      MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.f.a.d.get(iBinder);
      if (f == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("addSubscription for callback that isn't registered id=");
        stringBuilder.append(this.c);
        Log.w("MBServiceCompat", stringBuilder.toString());
        return;
      } 
      this.f.a.a(this.c, (MediaBrowserServiceCompat.f)stringBuilder, this.d, this.e);
    }
  }
  
  class d implements Runnable {
    d(MediaBrowserServiceCompat this$0, MediaBrowserServiceCompat.o param1o, String param1String, IBinder param1IBinder) {}
    
    public void run() {
      StringBuilder stringBuilder;
      IBinder iBinder = this.b.asBinder();
      MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.e.a.d.get(iBinder);
      if (f == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("removeSubscription for callback that isn't registered id=");
        stringBuilder.append(this.c);
        Log.w("MBServiceCompat", stringBuilder.toString());
        return;
      } 
      if (!this.e.a.p(this.c, (MediaBrowserServiceCompat.f)stringBuilder, this.d)) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("removeSubscription called for ");
        stringBuilder.append(this.c);
        stringBuilder.append(" which is not subscribed");
        Log.w("MBServiceCompat", stringBuilder.toString());
      } 
    }
  }
  
  class e implements Runnable {
    e(MediaBrowserServiceCompat this$0, MediaBrowserServiceCompat.o param1o, String param1String, ResultReceiver param1ResultReceiver) {}
    
    public void run() {
      StringBuilder stringBuilder;
      IBinder iBinder = this.b.asBinder();
      MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.e.a.d.get(iBinder);
      if (f == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("getMediaItem for callback that isn't registered id=");
        stringBuilder.append(this.c);
        Log.w("MBServiceCompat", stringBuilder.toString());
        return;
      } 
      this.e.a.n(this.c, (MediaBrowserServiceCompat.f)stringBuilder, this.d);
    }
  }
  
  class f implements Runnable {
    f(MediaBrowserServiceCompat this$0, MediaBrowserServiceCompat.o param1o, String param1String, int param1Int1, int param1Int2, Bundle param1Bundle) {}
    
    public void run() {
      IBinder iBinder = this.b.asBinder();
      this.g.a.d.remove(iBinder);
      MediaBrowserServiceCompat.f f1 = new MediaBrowserServiceCompat.f(this.g.a, this.c, this.d, this.e, this.f, this.b);
      this.g.a.d.put(iBinder, f1);
      try {
        iBinder.linkToDeath(f1, 0);
      } catch (RemoteException remoteException) {
        Log.w("MBServiceCompat", "IBinder is already dead.");
      } 
    }
  }
  
  class g implements Runnable {
    g(MediaBrowserServiceCompat this$0, MediaBrowserServiceCompat.o param1o) {}
    
    public void run() {
      IBinder iBinder = this.b.asBinder();
      MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.c.a.d.remove(iBinder);
      if (f != null)
        iBinder.unlinkToDeath(f, 0); 
    }
  }
  
  class h implements Runnable {
    h(MediaBrowserServiceCompat this$0, MediaBrowserServiceCompat.o param1o, String param1String, Bundle param1Bundle, ResultReceiver param1ResultReceiver) {}
    
    public void run() {
      StringBuilder stringBuilder;
      IBinder iBinder = this.b.asBinder();
      MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.f.a.d.get(iBinder);
      if (f == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("search for callback that isn't registered query=");
        stringBuilder.append(this.c);
        Log.w("MBServiceCompat", stringBuilder.toString());
        return;
      } 
      this.f.a.o(this.c, this.d, (MediaBrowserServiceCompat.f)stringBuilder, this.e);
    }
  }
  
  class i implements Runnable {
    i(MediaBrowserServiceCompat this$0, MediaBrowserServiceCompat.o param1o, String param1String, Bundle param1Bundle, ResultReceiver param1ResultReceiver) {}
    
    public void run() {
      StringBuilder stringBuilder;
      IBinder iBinder = this.b.asBinder();
      MediaBrowserServiceCompat.f f = (MediaBrowserServiceCompat.f)this.f.a.d.get(iBinder);
      if (f == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("sendCustomAction for callback that isn't registered action=");
        stringBuilder.append(this.c);
        stringBuilder.append(", extras=");
        stringBuilder.append(this.d);
        Log.w("MBServiceCompat", stringBuilder.toString());
        return;
      } 
      this.f.a.l(this.c, this.d, (MediaBrowserServiceCompat.f)stringBuilder, this.e);
    }
  }
  
  private static interface o {
    void a(String param1String, List<MediaBrowserCompat.MediaItem> param1List, Bundle param1Bundle1, Bundle param1Bundle2);
    
    IBinder asBinder();
    
    void b();
  }
  
  private static class p implements o {
    final Messenger a;
    
    p(Messenger param1Messenger) {
      this.a = param1Messenger;
    }
    
    private void c(int param1Int, Bundle param1Bundle) {
      Message message = Message.obtain();
      message.what = param1Int;
      message.arg1 = 2;
      message.setData(param1Bundle);
      this.a.send(message);
    }
    
    public void a(String param1String, List<MediaBrowserCompat.MediaItem> param1List, Bundle param1Bundle1, Bundle param1Bundle2) {
      Bundle bundle = new Bundle();
      bundle.putString("data_media_item_id", param1String);
      bundle.putBundle("data_options", param1Bundle1);
      bundle.putBundle("data_notify_children_changed_options", param1Bundle2);
      if (param1List != null) {
        ArrayList<MediaBrowserCompat.MediaItem> arrayList;
        if (param1List instanceof ArrayList) {
          arrayList = (ArrayList)param1List;
        } else {
          arrayList = new ArrayList<MediaBrowserCompat.MediaItem>(param1List);
        } 
        bundle.putParcelableArrayList("data_media_item_list", arrayList);
      } 
      c(3, bundle);
    }
    
    public IBinder asBinder() {
      return this.a.getBinder();
    }
    
    public void b() {
      c(2, null);
    }
  }
  
  private final class q extends Handler {
    private final MediaBrowserServiceCompat.n a;
    
    q(MediaBrowserServiceCompat this$0) {
      this.a = new MediaBrowserServiceCompat.n(this$0);
    }
    
    public void a(Runnable param1Runnable) {
      if (Thread.currentThread() == getLooper().getThread()) {
        param1Runnable.run();
      } else {
        post(param1Runnable);
      } 
    }
    
    public void handleMessage(Message param1Message) {
      StringBuilder stringBuilder;
      Bundle bundle1 = param1Message.getData();
      switch (param1Message.what) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unhandled message: ");
          stringBuilder.append(param1Message);
          stringBuilder.append("\n  Service version: ");
          stringBuilder.append(2);
          stringBuilder.append("\n  Client version: ");
          stringBuilder.append(param1Message.arg1);
          Log.w("MBServiceCompat", stringBuilder.toString());
          return;
        case 9:
          bundle2 = stringBuilder.getBundle("data_custom_action_extras");
          MediaSessionCompat.a(bundle2);
          this.a.h(stringBuilder.getString("data_custom_action"), bundle2, (ResultReceiver)stringBuilder.getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.p(param1Message.replyTo));
          return;
        case 8:
          bundle2 = stringBuilder.getBundle("data_search_extras");
          MediaSessionCompat.a(bundle2);
          this.a.g(stringBuilder.getString("data_search_query"), bundle2, (ResultReceiver)stringBuilder.getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.p(param1Message.replyTo));
          return;
        case 7:
          this.a.i(new MediaBrowserServiceCompat.p(param1Message.replyTo));
          return;
        case 6:
          bundle2 = stringBuilder.getBundle("data_root_hints");
          MediaSessionCompat.a(bundle2);
          this.a.e(new MediaBrowserServiceCompat.p(param1Message.replyTo), stringBuilder.getString("data_package_name"), stringBuilder.getInt("data_calling_pid"), stringBuilder.getInt("data_calling_uid"), bundle2);
          return;
        case 5:
          this.a.d(stringBuilder.getString("data_media_item_id"), (ResultReceiver)stringBuilder.getParcelable("data_result_receiver"), new MediaBrowserServiceCompat.p(param1Message.replyTo));
          return;
        case 4:
          this.a.f(stringBuilder.getString("data_media_item_id"), androidx.core.app.f.a((Bundle)stringBuilder, "data_callback_token"), new MediaBrowserServiceCompat.p(param1Message.replyTo));
          return;
        case 3:
          bundle2 = stringBuilder.getBundle("data_options");
          MediaSessionCompat.a(bundle2);
          this.a.a(stringBuilder.getString("data_media_item_id"), androidx.core.app.f.a((Bundle)stringBuilder, "data_callback_token"), bundle2, new MediaBrowserServiceCompat.p(param1Message.replyTo));
          return;
        case 2:
          this.a.c(new MediaBrowserServiceCompat.p(param1Message.replyTo));
          return;
        case 1:
          break;
      } 
      Bundle bundle2 = stringBuilder.getBundle("data_root_hints");
      MediaSessionCompat.a(bundle2);
      this.a.b(stringBuilder.getString("data_package_name"), stringBuilder.getInt("data_calling_pid"), stringBuilder.getInt("data_calling_uid"), bundle2, new MediaBrowserServiceCompat.p(param1Message.replyTo));
    }
    
    public boolean sendMessageAtTime(Message param1Message, long param1Long) {
      Bundle bundle = param1Message.getData();
      bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
      bundle.putInt("data_calling_uid", Binder.getCallingUid());
      bundle.putInt("data_calling_pid", Binder.getCallingPid());
      return super.sendMessageAtTime(param1Message, param1Long);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/MediaBrowserServiceCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */