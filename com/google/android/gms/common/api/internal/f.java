package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.base.e;
import com.google.android.gms.tasks.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class f implements Handler.Callback {
  public static final Status b = new Status(4, "Sign-out occurred while this API call was in progress.");
  
  private static final Status c = new Status(4, "The user must be signed in to make this API call.");
  
  private static final Object d = new Object();
  
  private static f e;
  
  private long f = 5000L;
  
  private long g = 120000L;
  
  private long h = 10000L;
  
  private final Context i;
  
  private final com.google.android.gms.common.b j;
  
  private final k k;
  
  private final AtomicInteger l = new AtomicInteger(1);
  
  private final AtomicInteger m = new AtomicInteger(0);
  
  private final Map<b<?>, a<?>> n = new ConcurrentHashMap<b<?>, a<?>>(5, 0.75F, 1);
  
  private p o = null;
  
  private final Set<b<?>> p = (Set<b<?>>)new b.e.b();
  
  private final Set<b<?>> q = (Set<b<?>>)new b.e.b();
  
  private final Handler r;
  
  private f(Context paramContext, Looper paramLooper, com.google.android.gms.common.b paramb) {
    this.i = paramContext;
    e e = new e(paramLooper, this);
    this.r = (Handler)e;
    this.j = paramb;
    this.k = new k((com.google.android.gms.common.c)paramb);
    e.sendMessage(e.obtainMessage(6));
  }
  
  public static void a() {
    synchronized (d) {
      f f1 = e;
      if (f1 != null) {
        f1.m.incrementAndGet();
        Handler handler = f1.r;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
      } 
      return;
    } 
  }
  
  public static f h(Context paramContext) {
    synchronized (d) {
      if (e == null) {
        HandlerThread handlerThread = new HandlerThread();
        this("GoogleApiHandler", 9);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        f f1 = new f();
        this(paramContext.getApplicationContext(), looper, com.google.android.gms.common.b.n());
        e = f1;
      } 
      return e;
    } 
  }
  
  private final void i(com.google.android.gms.common.api.c<?> paramc) {
    b<?> b1 = paramc.a();
    a<?> a1 = this.n.get(b1);
    a<?> a2 = a1;
    if (a1 == null) {
      a2 = new a(this, paramc);
      this.n.put(b1, a2);
    } 
    if (a2.d())
      this.q.add(b1); 
    a2.a();
  }
  
  public final void c(ConnectionResult paramConnectionResult, int paramInt) {
    if (!o(paramConnectionResult, paramInt)) {
      Handler handler = this.r;
      handler.sendMessage(handler.obtainMessage(5, paramInt, 0, paramConnectionResult));
    } 
  }
  
  public final void d(com.google.android.gms.common.api.c<?> paramc) {
    Handler handler = this.r;
    handler.sendMessage(handler.obtainMessage(7, paramc));
  }
  
  public final <O extends com.google.android.gms.common.api.a.d> void e(com.google.android.gms.common.api.c<O> paramc, int paramInt, d<? extends i, com.google.android.gms.common.api.a.b> paramd) {
    l0<d<? extends i, com.google.android.gms.common.api.a.b>> l0 = new l0<d<? extends i, com.google.android.gms.common.api.a.b>>(paramInt, paramd);
    Handler handler = this.r;
    handler.sendMessage(handler.obtainMessage(4, new b0(l0, this.m.get(), paramc)));
  }
  
  public final void f(p paramp) {
    synchronized (d) {
      if (this.o != paramp) {
        this.o = paramp;
        this.p.clear();
      } 
      this.p.addAll((Collection<? extends b<?>>)paramp.r());
      return;
    } 
  }
  
  public boolean handleMessage(Message paramMessage) {
    StringBuilder stringBuilder2;
    c c;
    a a;
    StringBuilder stringBuilder1;
    a<?> a1;
    ConnectionResult connectionResult;
    b0 b0;
    Iterator<a> iterator;
    o0 o0;
    int i = paramMessage.what;
    long l = 300000L;
    q q = null;
    switch (i) {
      default:
        stringBuilder2 = new StringBuilder(31);
        stringBuilder2.append("Unknown message id: ");
        stringBuilder2.append(i);
        Log.w("GoogleApiManager", stringBuilder2.toString());
        return false;
      case 16:
        c = (c)((Message)stringBuilder2).obj;
        if (this.n.containsKey(c.a(c)))
          a.n(this.n.get(c.a(c)), c); 
        return true;
      case 15:
        c = (c)((Message)c).obj;
        if (this.n.containsKey(c.a(c)))
          a.g(this.n.get(c.a(c)), c); 
        return true;
      case 14:
        q = (q)((Message)c).obj;
        b1 = q.a();
        if (!this.n.containsKey(b1)) {
          q.b().c(Boolean.FALSE);
        } else {
          boolean bool = a.k(this.n.get(b1), false);
          q.b().c(Boolean.valueOf(bool));
        } 
        return true;
      case 12:
        if (this.n.containsKey(((Message)b1).obj))
          ((a)this.n.get(((Message)b1).obj)).z(); 
        return true;
      case 11:
        if (this.n.containsKey(((Message)b1).obj))
          ((a)this.n.get(((Message)b1).obj)).m(); 
        return true;
      case 10:
        for (b<?> b1 : this.q)
          ((a)this.n.remove(b1)).t(); 
        this.q.clear();
        return true;
      case 9:
        if (this.n.containsKey(((Message)b1).obj))
          ((a)this.n.get(((Message)b1).obj)).e(); 
        return true;
      case 7:
        i((com.google.android.gms.common.api.c)((Message)b1).obj);
        return true;
      case 6:
        if (o.a() && this.i.getApplicationContext() instanceof Application) {
          c.c((Application)this.i.getApplicationContext());
          c.b().a(new t(this));
          if (!c.b().e(true))
            this.h = 300000L; 
        } 
        return true;
      case 5:
        i = ((Message)b1).arg1;
        connectionResult = (ConnectionResult)((Message)b1).obj;
        iterator = this.n.values().iterator();
        while (true) {
          q q1 = q;
          if (iterator.hasNext()) {
            a = iterator.next();
            if (a.b() == i)
              break; 
            continue;
          } 
          break;
        } 
        if (a != null) {
          String str1 = this.j.e(connectionResult.o0());
          String str2 = connectionResult.p0();
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 69 + String.valueOf(str2).length());
          stringBuilder.append("Error resolution was canceled by the user, original error message: ");
          stringBuilder.append(str1);
          stringBuilder.append(": ");
          stringBuilder.append(str2);
          a.A(new Status(17, stringBuilder.toString()));
        } else {
          stringBuilder1 = new StringBuilder(76);
          stringBuilder1.append("Could not find API instance ");
          stringBuilder1.append(i);
          stringBuilder1.append(" while trying to fail enqueued calls.");
          Log.wtf("GoogleApiManager", stringBuilder1.toString(), new Exception());
        } 
        return true;
      case 4:
      case 8:
      case 13:
        b0 = (b0)((Message)stringBuilder1).obj;
        a2 = this.n.get(b0.c.a());
        a1 = a2;
        if (a2 == null) {
          i(b0.c);
          a1 = this.n.get(b0.c.a());
        } 
        if (a1.d() && this.m.get() != b0.b) {
          b0.a.b(b);
          a1.t();
        } else {
          a1.i(b0.a);
        } 
        return true;
      case 3:
        for (a<?> a2 : this.n.values()) {
          a2.v();
          a2.a();
        } 
        return true;
      case 2:
        o0 = (o0)((Message)a1).obj;
        for (b<?> b2 : o0.b()) {
          a1 = this.n.get(b2);
          if (a1 == null) {
            o0.a(b2, new ConnectionResult(13), null);
            break;
          } 
          if (a1.c()) {
            o0.a(b2, ConnectionResult.b, a1.l().h());
            continue;
          } 
          if (a1.w() != null) {
            o0.a(b2, a1.w(), null);
            continue;
          } 
          a1.j(o0);
          a1.a();
        } 
        return true;
      case 1:
        break;
    } 
    if (((Boolean)((Message)a1).obj).booleanValue())
      l = 10000L; 
    this.h = l;
    this.r.removeMessages(12);
    for (b<?> b2 : this.n.keySet()) {
      Handler handler = this.r;
      handler.sendMessageDelayed(handler.obtainMessage(12, b2), this.h);
    } 
    return true;
  }
  
  final void j(p paramp) {
    synchronized (d) {
      if (this.o == paramp) {
        this.o = null;
        this.p.clear();
      } 
      return;
    } 
  }
  
  public final int k() {
    return this.l.getAndIncrement();
  }
  
  final boolean o(ConnectionResult paramConnectionResult, int paramInt) {
    return this.j.x(this.i, paramConnectionResult, paramInt);
  }
  
  public final void w() {
    Handler handler = this.r;
    handler.sendMessage(handler.obtainMessage(3));
  }
  
  public final class a<O extends com.google.android.gms.common.api.a.d> implements d.a, d.b {
    private final Queue<d0> b = new LinkedList<d0>();
    
    private final com.google.android.gms.common.api.a.f c;
    
    private final com.google.android.gms.common.api.a.b d;
    
    private final b<O> e;
    
    private final u0 f;
    
    private final Set<o0> g = new HashSet<o0>();
    
    private final Map<i<?>, c0> h = new HashMap<i<?>, c0>();
    
    private final int i;
    
    private final f0 j;
    
    private boolean k;
    
    private final List<f.c> l = new ArrayList<f.c>();
    
    private ConnectionResult m = null;
    
    public a(f this$0, com.google.android.gms.common.api.c<O> param1c) {
      com.google.android.gms.common.api.a.f f1 = param1c.i(f.b(this$0).getLooper(), this);
      this.c = f1;
      if (f1 instanceof v) {
        this.d = (com.google.android.gms.common.api.a.b)((v)f1).n0();
      } else {
        this.d = (com.google.android.gms.common.api.a.b)f1;
      } 
      this.e = param1c.a();
      this.f = new u0();
      this.i = param1c.g();
      if (f1.q()) {
        this.j = param1c.k(f.g(this$0), f.b(this$0));
        return;
      } 
      this.j = null;
    }
    
    private final void B(d0 param1d0) {
      param1d0.c(this.f, d());
      try {
        param1d0.f(this);
        return;
      } catch (DeadObjectException deadObjectException) {
        Y0(1);
        this.c.a();
        return;
      } 
    }
    
    private final boolean C(boolean param1Boolean) {
      t.d(f.b(this.n));
      if (this.c.c() && this.h.size() == 0) {
        if (this.f.d()) {
          if (param1Boolean)
            y(); 
          return false;
        } 
        this.c.a();
        return true;
      } 
      return false;
    }
    
    private final boolean H(ConnectionResult param1ConnectionResult) {
      synchronized (f.l()) {
        if (f.r(this.n) != null && f.s(this.n).contains(this.e)) {
          f.r(this.n).n(param1ConnectionResult, this.i);
          return true;
        } 
        return false;
      } 
    }
    
    private final void I(ConnectionResult param1ConnectionResult) {
      for (o0 o0 : this.g) {
        String str = null;
        if (r.a(param1ConnectionResult, ConnectionResult.b))
          str = this.c.h(); 
        o0.a(this.e, param1ConnectionResult, str);
      } 
      this.g.clear();
    }
    
    private final Feature f(Feature[] param1ArrayOfFeature) {
      if (param1ArrayOfFeature != null && param1ArrayOfFeature.length != 0) {
        Feature[] arrayOfFeature1 = this.c.p();
        boolean bool = false;
        Feature[] arrayOfFeature2 = arrayOfFeature1;
        if (arrayOfFeature1 == null)
          arrayOfFeature2 = new Feature[0]; 
        b.e.a<String, Long> a1 = new b.e.a(arrayOfFeature2.length);
        int i = arrayOfFeature2.length;
        byte b1;
        for (b1 = 0; b1 < i; b1++) {
          Feature feature = arrayOfFeature2[b1];
          a1.put(feature.o0(), Long.valueOf(feature.p0()));
        } 
        i = param1ArrayOfFeature.length;
        for (b1 = bool; b1 < i; b1++) {
          Feature feature = param1ArrayOfFeature[b1];
          if (!a1.containsKey(feature.o0()) || ((Long)a1.get(feature.o0())).longValue() < feature.p0())
            return feature; 
        } 
      } 
      return null;
    }
    
    private final void h(f.c param1c) {
      if (!this.l.contains(param1c))
        return; 
      if (!this.k) {
        if (!this.c.c()) {
          a();
          return;
        } 
        s();
      } 
    }
    
    private final void o(f.c param1c) {
      if (this.l.remove(param1c)) {
        f.b(this.n).removeMessages(15, param1c);
        f.b(this.n).removeMessages(16, param1c);
        Feature feature = f.c.b(param1c);
        ArrayList<d0> arrayList = new ArrayList(this.b.size());
        for (d0 d0 : this.b) {
          if (d0 instanceof s) {
            Feature[] arrayOfFeature = ((s)d0).g(this);
            if (arrayOfFeature != null && com.google.android.gms.common.util.b.b((Object[])arrayOfFeature, feature))
              arrayList.add(d0); 
          } 
        } 
        int i = arrayList.size();
        byte b1 = 0;
        while (b1 < i) {
          d0 d0 = (d0)arrayList.get(b1);
          b1++;
          d0 = d0;
          this.b.remove(d0);
          d0.d((RuntimeException)new UnsupportedApiCallException(feature));
        } 
      } 
    }
    
    private final boolean p(d0 param1d0) {
      if (!(param1d0 instanceof s)) {
        B(param1d0);
        return true;
      } 
      s s = (s)param1d0;
      Feature feature = f(s.g(this));
      if (feature == null) {
        B(param1d0);
        return true;
      } 
      if (s.h(this)) {
        f.c c = new f.c(this.e, feature, null);
        int i = this.l.indexOf(c);
        if (i >= 0) {
          c = this.l.get(i);
          f.b(this.n).removeMessages(15, c);
          f.b(this.n).sendMessageDelayed(Message.obtain(f.b(this.n), 15, c), f.n(this.n));
        } else {
          this.l.add(c);
          f.b(this.n).sendMessageDelayed(Message.obtain(f.b(this.n), 15, c), f.n(this.n));
          f.b(this.n).sendMessageDelayed(Message.obtain(f.b(this.n), 16, c), f.p(this.n));
          ConnectionResult connectionResult = new ConnectionResult(2, null);
          if (!H(connectionResult))
            this.n.o(connectionResult, this.i); 
        } 
      } else {
        s.d((RuntimeException)new UnsupportedApiCallException(feature));
      } 
      return false;
    }
    
    private final void q() {
      v();
      I(ConnectionResult.b);
      x();
      Iterator iterator = this.h.values().iterator();
      if (!iterator.hasNext()) {
        s();
        y();
        return;
      } 
      k<com.google.android.gms.common.api.a.b, ?> k = ((c0)iterator.next()).a;
      throw null;
    }
    
    private final void r() {
      v();
      this.k = true;
      this.f.f();
      f.b(this.n).sendMessageDelayed(Message.obtain(f.b(this.n), 9, this.e), f.n(this.n));
      f.b(this.n).sendMessageDelayed(Message.obtain(f.b(this.n), 11, this.e), f.p(this.n));
      f.q(this.n).a();
    }
    
    private final void s() {
      ArrayList<d0> arrayList = new ArrayList<d0>(this.b);
      int i = arrayList.size();
      int j = 0;
      while (j < i) {
        d0 d0 = (d0)arrayList.get(j);
        int k = j + 1;
        d0 = d0;
        if (this.c.c()) {
          j = k;
          if (p(d0)) {
            this.b.remove(d0);
            j = k;
          } 
        } 
      } 
    }
    
    private final void x() {
      if (this.k) {
        f.b(this.n).removeMessages(11, this.e);
        f.b(this.n).removeMessages(9, this.e);
        this.k = false;
      } 
    }
    
    private final void y() {
      f.b(this.n).removeMessages(12, this.e);
      f.b(this.n).sendMessageDelayed(f.b(this.n).obtainMessage(12, this.e), f.u(this.n));
    }
    
    public final void A(Status param1Status) {
      t.d(f.b(this.n));
      Iterator<d0> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((d0)iterator.next()).b(param1Status); 
      this.b.clear();
    }
    
    public final void G(ConnectionResult param1ConnectionResult) {
      t.d(f.b(this.n));
      this.c.a();
      i1(param1ConnectionResult);
    }
    
    public final void Y0(int param1Int) {
      if (Looper.myLooper() == f.b(this.n).getLooper()) {
        r();
        return;
      } 
      f.b(this.n).post(new v(this));
    }
    
    public final void a() {
      t.d(f.b(this.n));
      if (!this.c.c() && !this.c.g()) {
        int i = f.q(this.n).b(f.g(this.n), this.c);
        if (i != 0) {
          i1(new ConnectionResult(i, null));
          return;
        } 
        f.b b1 = new f.b(this.n, this.c, this.e);
        if (this.c.q())
          this.j.M2(b1); 
        this.c.i(b1);
      } 
    }
    
    public final int b() {
      return this.i;
    }
    
    final boolean c() {
      return this.c.c();
    }
    
    public final boolean d() {
      return this.c.q();
    }
    
    public final void e() {
      t.d(f.b(this.n));
      if (this.k)
        a(); 
    }
    
    public final void i(d0 param1d0) {
      t.d(f.b(this.n));
      if (this.c.c()) {
        if (p(param1d0)) {
          y();
          return;
        } 
        this.b.add(param1d0);
        return;
      } 
      this.b.add(param1d0);
      ConnectionResult connectionResult = this.m;
      if (connectionResult != null && connectionResult.r0()) {
        i1(this.m);
        return;
      } 
      a();
    }
    
    public final void i1(ConnectionResult param1ConnectionResult) {
      t.d(f.b(this.n));
      f0 f01 = this.j;
      if (f01 != null)
        f01.j3(); 
      v();
      f.q(this.n).a();
      I(param1ConnectionResult);
      if (param1ConnectionResult.o0() == 4) {
        A(f.m());
        return;
      } 
      if (this.b.isEmpty()) {
        this.m = param1ConnectionResult;
        return;
      } 
      if (H(param1ConnectionResult))
        return; 
      if (!this.n.o(param1ConnectionResult, this.i)) {
        if (param1ConnectionResult.o0() == 18)
          this.k = true; 
        if (this.k) {
          f.b(this.n).sendMessageDelayed(Message.obtain(f.b(this.n), 9, this.e), f.n(this.n));
          return;
        } 
        String str2 = this.e.a();
        String str1 = String.valueOf(param1ConnectionResult);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 63 + str1.length());
        stringBuilder.append("API: ");
        stringBuilder.append(str2);
        stringBuilder.append(" is not available on this device. Connection failed with: ");
        stringBuilder.append(str1);
        A(new Status(17, stringBuilder.toString()));
      } 
    }
    
    public final void j(o0 param1o0) {
      t.d(f.b(this.n));
      this.g.add(param1o0);
    }
    
    public final com.google.android.gms.common.api.a.f l() {
      return this.c;
    }
    
    public final void m() {
      t.d(f.b(this.n));
      if (this.k) {
        Status status;
        x();
        if (f.t(this.n).g(f.g(this.n)) == 18) {
          status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
        } else {
          status = new Status(8, "API failed to connect while resuming due to an unknown error.");
        } 
        A(status);
        this.c.a();
      } 
    }
    
    public final void o1(Bundle param1Bundle) {
      if (Looper.myLooper() == f.b(this.n).getLooper()) {
        q();
        return;
      } 
      f.b(this.n).post(new u(this));
    }
    
    public final void t() {
      t.d(f.b(this.n));
      A(f.b);
      this.f.e();
      i[] arrayOfI = (i[])this.h.keySet().toArray((Object[])new i[this.h.size()]);
      int i = arrayOfI.length;
      for (byte b1 = 0; b1 < i; b1++)
        i(new n0(arrayOfI[b1], new h())); 
      I(new ConnectionResult(4));
      if (this.c.c())
        this.c.k(new x(this)); 
    }
    
    public final Map<i<?>, c0> u() {
      return this.h;
    }
    
    public final void v() {
      t.d(f.b(this.n));
      this.m = null;
    }
    
    public final ConnectionResult w() {
      t.d(f.b(this.n));
      return this.m;
    }
    
    public final boolean z() {
      return C(true);
    }
  }
  
  private final class b implements g0, d.c {
    private final com.google.android.gms.common.api.a.f a;
    
    private final b<?> b;
    
    private l c = null;
    
    private Set<Scope> d = null;
    
    private boolean e = false;
    
    public b(f this$0, com.google.android.gms.common.api.a.f param1f, b<?> param1b) {
      this.a = param1f;
      this.b = param1b;
    }
    
    private final void g() {
      if (this.e) {
        l l1 = this.c;
        if (l1 != null)
          this.a.e(l1, this.d); 
      } 
    }
    
    public final void a(ConnectionResult param1ConnectionResult) {
      f.b(this.f).post(new z(this, param1ConnectionResult));
    }
    
    public final void b(l param1l, Set<Scope> param1Set) {
      if (param1l == null || param1Set == null) {
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        c(new ConnectionResult(4));
        return;
      } 
      this.c = param1l;
      this.d = param1Set;
      g();
    }
    
    public final void c(ConnectionResult param1ConnectionResult) {
      ((f.a)f.v(this.f).get(this.b)).G(param1ConnectionResult);
    }
  }
  
  private static final class c {
    private final b<?> a;
    
    private final Feature b;
    
    private c(b<?> param1b, Feature param1Feature) {
      this.a = param1b;
      this.b = param1Feature;
    }
    
    public final boolean equals(Object param1Object) {
      if (param1Object != null && param1Object instanceof c) {
        param1Object = param1Object;
        if (r.a(this.a, ((c)param1Object).a) && r.a(this.b, ((c)param1Object).b))
          return true; 
      } 
      return false;
    }
    
    public final int hashCode() {
      return r.b(new Object[] { this.a, this.b });
    }
    
    public final String toString() {
      return r.c(this).a("key", this.a).a("feature", this.b).toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */