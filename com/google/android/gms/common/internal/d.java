package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d<T extends IInterface> {
  private static final Feature[] a = new Feature[0];
  
  public static final String[] b = new String[] { "service_esmobile", "service_googleme" };
  
  private ConnectionResult A = null;
  
  private boolean B = false;
  
  private volatile zzc C = null;
  
  protected AtomicInteger D = new AtomicInteger(0);
  
  private int c;
  
  private long d;
  
  private long e;
  
  private int f;
  
  private long g;
  
  private volatile String h = null;
  
  private t0 i;
  
  private final Context j;
  
  private final Looper k;
  
  private final i l;
  
  private final com.google.android.gms.common.c m;
  
  final Handler n;
  
  private final Object o = new Object();
  
  private final Object p = new Object();
  
  private p q;
  
  protected c r;
  
  private T s;
  
  private final ArrayList<h<?>> t = new ArrayList<h<?>>();
  
  private i u;
  
  private int v = 1;
  
  private final a w;
  
  private final b x;
  
  private final int y;
  
  private final String z;
  
  protected d(Context paramContext, Looper paramLooper, int paramInt, a parama, b paramb, String paramString) {
    this(paramContext, paramLooper, i.c(paramContext), com.google.android.gms.common.c.f(), paramInt, t.<a>j(parama), t.<b>j(paramb), paramString);
  }
  
  protected d(Context paramContext, Looper paramLooper, i parami, com.google.android.gms.common.c paramc, int paramInt, a parama, b paramb, String paramString) {
    this.j = t.<Context>k(paramContext, "Context must not be null");
    this.k = t.<Looper>k(paramLooper, "Looper must not be null");
    this.l = t.<i>k(parami, "Supervisor must not be null");
    this.m = t.<com.google.android.gms.common.c>k(paramc, "API availability must not be null");
    this.n = (Handler)new g(this, paramLooper);
    this.y = paramInt;
    this.w = parama;
    this.x = paramb;
    this.z = paramString;
  }
  
  private final String Q() {
    String str1 = this.z;
    String str2 = str1;
    if (str1 == null)
      str2 = this.j.getClass().getName(); 
    return str2;
  }
  
  private final void R(int paramInt) {
    if (a0()) {
      paramInt = 5;
      this.B = true;
    } else {
      paramInt = 4;
    } 
    Handler handler = this.n;
    handler.sendMessage(handler.obtainMessage(paramInt, this.D.get(), 16));
  }
  
  private final void T(int paramInt, T paramT) {
    int j;
    byte b1;
    boolean bool = false;
    if (paramInt == 4) {
      j = 1;
    } else {
      j = 0;
    } 
    if (paramT != null) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    if (j == b1)
      bool = true; 
    t.a(bool);
    synchronized (this.o) {
      this.v = paramInt;
      this.s = paramT;
      J(paramInt, paramT);
      if (paramInt != 1) {
        if (paramInt != 2 && paramInt != 3) {
          if (paramInt == 4)
            F(paramT); 
        } else {
          t0 t01;
          if (this.u != null) {
            t01 = this.i;
            if (t01 != null) {
              String str5 = t01.a();
              String str4 = this.i.b();
              j = String.valueOf(str5).length();
              paramInt = String.valueOf(str4).length();
              StringBuilder stringBuilder = new StringBuilder();
              this(j + 70 + paramInt);
              stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
              stringBuilder.append(str5);
              stringBuilder.append(" on ");
              stringBuilder.append(str4);
              Log.e("GmsClient", stringBuilder.toString());
              this.l.e(this.i.a(), this.i.b(), this.i.c(), this.u, Q(), this.i.d());
              this.D.incrementAndGet();
            } 
          } 
          i i1 = new i();
          this(this, this.D.get());
          this.u = i1;
          if (this.v == 3 && A() != null) {
            t01 = new t0();
            this(y().getPackageName(), A(), true, i.b(), false);
          } else {
            t01 = new t0(D(), r(), false, i.b(), E());
          } 
          this.i = t01;
          if (t01.d() && o() < 17895000) {
            IllegalStateException illegalStateException = new IllegalStateException();
            String str = String.valueOf(this.i.a());
            if (str.length() != 0) {
              str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(str);
            } else {
              str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
            } 
            this(str);
            throw illegalStateException;
          } 
          i i2 = this.l;
          String str2 = this.i.a();
          String str3 = this.i.b();
          paramInt = this.i.c();
          i i3 = this.u;
          String str1 = Q();
          bool = this.i.d();
          i.a a1 = new i.a();
          this(str2, str3, paramInt, bool);
          if (!i2.f(a1, i3, str1)) {
            String str = this.i.a();
            str1 = this.i.b();
            paramInt = String.valueOf(str).length();
            j = String.valueOf(str1).length();
            StringBuilder stringBuilder = new StringBuilder();
            this(paramInt + 34 + j);
            stringBuilder.append("unable to connect to service: ");
            stringBuilder.append(str);
            stringBuilder.append(" on ");
            stringBuilder.append(str1);
            Log.e("GmsClient", stringBuilder.toString());
            S(16, null, this.D.get());
          } 
        } 
      } else if (this.u != null) {
        this.l.e(this.i.a(), this.i.b(), this.i.c(), this.u, Q(), this.i.d());
        this.u = null;
      } 
      return;
    } 
  }
  
  private final void X(zzc paramzzc) {
    this.C = paramzzc;
  }
  
  private final boolean Y(int paramInt1, int paramInt2, T paramT) {
    synchronized (this.o) {
      if (this.v != paramInt1)
        return false; 
      T(paramInt2, paramT);
      return true;
    } 
  }
  
  private final boolean a0() {
    synchronized (this.o) {
      boolean bool;
      if (this.v == 3) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  private final boolean c0() {
    if (this.B)
      return false; 
    if (TextUtils.isEmpty(l()))
      return false; 
    if (TextUtils.isEmpty(A()))
      return false; 
    try {
      Class.forName(l());
      return true;
    } catch (ClassNotFoundException classNotFoundException) {
      return false;
    } 
  }
  
  protected String A() {
    return null;
  }
  
  protected Set<Scope> B() {
    return Collections.emptySet();
  }
  
  public final T C() {
    synchronized (this.o) {
      if (this.v != 5) {
        boolean bool;
        t();
        if (this.s != null) {
          bool = true;
        } else {
          bool = false;
        } 
        t.n(bool, "Client is connected but service is null");
        return this.s;
      } 
      DeadObjectException deadObjectException = new DeadObjectException();
      this();
      throw deadObjectException;
    } 
  }
  
  protected String D() {
    return "com.google.android.gms";
  }
  
  protected boolean E() {
    return false;
  }
  
  protected void F(T paramT) {
    this.e = System.currentTimeMillis();
  }
  
  protected void G(ConnectionResult paramConnectionResult) {
    this.f = paramConnectionResult.o0();
    this.g = System.currentTimeMillis();
  }
  
  protected void H(int paramInt) {
    this.c = paramInt;
    this.d = System.currentTimeMillis();
  }
  
  protected void I(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2) {
    Handler handler = this.n;
    handler.sendMessage(handler.obtainMessage(1, paramInt2, -1, new k(this, paramInt1, paramIBinder, paramBundle)));
  }
  
  void J(int paramInt, T paramT) {}
  
  public boolean K() {
    return false;
  }
  
  public void L(int paramInt) {
    Handler handler = this.n;
    handler.sendMessage(handler.obtainMessage(6, this.D.get(), paramInt));
  }
  
  protected void M(c paramc, int paramInt, PendingIntent paramPendingIntent) {
    this.r = t.<c>k(paramc, "Connection progress callbacks cannot be null.");
    Handler handler = this.n;
    handler.sendMessage(handler.obtainMessage(3, this.D.get(), paramInt, paramPendingIntent));
  }
  
  protected final void S(int paramInt1, Bundle paramBundle, int paramInt2) {
    Handler handler = this.n;
    handler.sendMessage(handler.obtainMessage(7, paramInt2, -1, new l(this, paramInt1, null)));
  }
  
  public void a() {
    this.D.incrementAndGet();
    synchronized (this.t) {
      int j = this.t.size();
      for (byte b1 = 0; b1 < j; b1++)
        ((h)this.t.get(b1)).e(); 
      this.t.clear();
      synchronized (this.p) {
        this.q = null;
        T(1, null);
        return;
      } 
    } 
  }
  
  public boolean c() {
    synchronized (this.o) {
      boolean bool;
      if (this.v == 4) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public void e(l paraml, Set<Scope> paramSet) {
    Bundle bundle = z();
    GetServiceRequest getServiceRequest = new GetServiceRequest(this.y);
    getServiceRequest.e = this.j.getPackageName();
    getServiceRequest.h = bundle;
    if (paramSet != null)
      getServiceRequest.g = paramSet.<Scope>toArray(new Scope[paramSet.size()]); 
    if (q()) {
      Account account;
      if (v() != null) {
        account = v();
      } else {
        account = new Account("<<default account>>", "com.google");
      } 
      getServiceRequest.i = account;
      if (paraml != null)
        getServiceRequest.f = paraml.asBinder(); 
    } else if (K()) {
      getServiceRequest.i = v();
    } 
    getServiceRequest.j = a;
    getServiceRequest.k = w();
    try {
      synchronized (this.p) {
        p p1 = this.q;
        if (p1 != null) {
          j j = new j();
          this(this, this.D.get());
          p1.N2(j, getServiceRequest);
        } else {
          Log.w("GmsClient", "mServiceBroker is null, client disconnected");
        } 
        return;
      } 
    } catch (DeadObjectException deadObjectException) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)deadObjectException);
      L(3);
      return;
    } catch (SecurityException securityException) {
      throw securityException;
    } catch (RemoteException remoteException) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)remoteException);
      I(8, null, null, this.D.get());
      return;
    } catch (RuntimeException runtimeException) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", runtimeException);
      I(8, null, null, this.D.get());
      return;
    } 
  }
  
  public boolean g() {
    synchronized (this.o) {
      int j = this.v;
      if (j == 2 || j == 3)
        return true; 
      return false;
    } 
  }
  
  public String h() {
    if (c()) {
      t0 t01 = this.i;
      if (t01 != null)
        return t01.b(); 
    } 
    throw new RuntimeException("Failed to connect when checking package");
  }
  
  public void i(c paramc) {
    this.r = t.<c>k(paramc, "Connection progress callbacks cannot be null.");
    T(2, null);
  }
  
  public void k(e parame) {
    parame.a();
  }
  
  protected abstract String l();
  
  protected abstract T m(IBinder paramIBinder);
  
  public boolean n() {
    return true;
  }
  
  public int o() {
    return com.google.android.gms.common.c.a;
  }
  
  public final Feature[] p() {
    zzc zzc1 = this.C;
    return (zzc1 == null) ? null : zzc1.c;
  }
  
  public boolean q() {
    return false;
  }
  
  protected abstract String r();
  
  public void s() {
    int j = this.m.h(this.j, o());
    if (j != 0) {
      T(1, null);
      M(new d(this), j, null);
      return;
    } 
    i(new d(this));
  }
  
  protected final void t() {
    if (c())
      return; 
    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }
  
  protected boolean u() {
    return false;
  }
  
  public Account v() {
    return null;
  }
  
  public Feature[] w() {
    return a;
  }
  
  public Bundle x() {
    return null;
  }
  
  public final Context y() {
    return this.j;
  }
  
  protected Bundle z() {
    return new Bundle();
  }
  
  public static interface a {
    void Y0(int param1Int);
    
    void o1(Bundle param1Bundle);
  }
  
  public static interface b {
    void i1(ConnectionResult param1ConnectionResult);
  }
  
  public static interface c {
    void a(ConnectionResult param1ConnectionResult);
  }
  
  protected class d implements c {
    public d(d this$0) {}
    
    public void a(ConnectionResult param1ConnectionResult) {
      d d1;
      if (param1ConnectionResult.s0()) {
        d1 = this.a;
        d1.e(null, d1.B());
        return;
      } 
      if (d.h0(this.a) != null)
        d.h0(this.a).i1((ConnectionResult)d1); 
    }
  }
  
  public static interface e {
    void a();
  }
  
  private abstract class f extends h<Boolean> {
    private final int d;
    
    private final Bundle e;
    
    protected f(d this$0, int param1Int, Bundle param1Bundle) {
      super(this$0, Boolean.TRUE);
      this.d = param1Int;
      this.e = param1Bundle;
    }
    
    protected final void b() {}
    
    protected abstract void f(ConnectionResult param1ConnectionResult);
    
    protected abstract boolean g();
  }
  
  final class g extends com.google.android.gms.internal.common.h {
    public g(d this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    private static void a(Message param1Message) {
      d.h h1 = (d.h)param1Message.obj;
      h1.b();
      h1.d();
    }
    
    private static boolean b(Message param1Message) {
      int i = param1Message.what;
      return (i == 2 || i == 1 || i == 7);
    }
    
    public final void handleMessage(Message param1Message) {
      ConnectionResult connectionResult;
      if (this.a.D.get() != param1Message.arg1) {
        if (b(param1Message))
          a(param1Message); 
        return;
      } 
      int i = param1Message.what;
      if ((i == 1 || i == 7 || (i == 4 && !this.a.u()) || param1Message.what == 5) && !this.a.g()) {
        a(param1Message);
        return;
      } 
      i = param1Message.what;
      PendingIntent pendingIntent = null;
      if (i == 4) {
        d.N(this.a, new ConnectionResult(param1Message.arg2));
        if (d.b0(this.a) && !d.d0(this.a)) {
          d.V(this.a, 3, null);
          return;
        } 
        if (d.e0(this.a) != null) {
          connectionResult = d.e0(this.a);
        } else {
          connectionResult = new ConnectionResult(8);
        } 
        this.a.r.a(connectionResult);
        this.a.G(connectionResult);
        return;
      } 
      if (i == 5) {
        if (d.e0(this.a) != null) {
          connectionResult = d.e0(this.a);
        } else {
          connectionResult = new ConnectionResult(8);
        } 
        this.a.r.a(connectionResult);
        this.a.G(connectionResult);
        return;
      } 
      if (i == 3) {
        Object object = ((Message)connectionResult).obj;
        if (object instanceof PendingIntent)
          pendingIntent = (PendingIntent)object; 
        connectionResult = new ConnectionResult(((Message)connectionResult).arg2, pendingIntent);
        this.a.r.a(connectionResult);
        this.a.G(connectionResult);
        return;
      } 
      if (i == 6) {
        d.V(this.a, 5, null);
        if (d.f0(this.a) != null)
          d.f0(this.a).Y0(((Message)connectionResult).arg2); 
        this.a.H(((Message)connectionResult).arg2);
        d.Z(this.a, 5, 1, null);
        return;
      } 
      if (i == 2 && !this.a.c()) {
        a((Message)connectionResult);
        return;
      } 
      if (b((Message)connectionResult)) {
        ((d.h)((Message)connectionResult).obj).c();
        return;
      } 
      i = ((Message)connectionResult).what;
      StringBuilder stringBuilder = new StringBuilder(45);
      stringBuilder.append("Don't know how to handle message: ");
      stringBuilder.append(i);
      Log.wtf("GmsClient", stringBuilder.toString(), new Exception());
    }
  }
  
  protected abstract class h<TListener> {
    private TListener a;
    
    private boolean b;
    
    public h(d this$0, TListener param1TListener) {
      this.a = param1TListener;
      this.b = false;
    }
    
    protected abstract void a(TListener param1TListener);
    
    protected abstract void b();
    
    public final void c() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield a : Ljava/lang/Object;
      //   6: astore_1
      //   7: aload_0
      //   8: getfield b : Z
      //   11: ifeq -> 72
      //   14: aload_0
      //   15: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
      //   18: astore_2
      //   19: aload_2
      //   20: invokevirtual length : ()I
      //   23: istore_3
      //   24: new java/lang/StringBuilder
      //   27: astore #4
      //   29: aload #4
      //   31: iload_3
      //   32: bipush #47
      //   34: iadd
      //   35: invokespecial <init> : (I)V
      //   38: aload #4
      //   40: ldc 'Callback proxy '
      //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   45: pop
      //   46: aload #4
      //   48: aload_2
      //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   52: pop
      //   53: aload #4
      //   55: ldc ' being reused. This is not safe.'
      //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   60: pop
      //   61: ldc 'GmsClient'
      //   63: aload #4
      //   65: invokevirtual toString : ()Ljava/lang/String;
      //   68: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
      //   71: pop
      //   72: aload_0
      //   73: monitorexit
      //   74: aload_1
      //   75: ifnull -> 93
      //   78: aload_0
      //   79: aload_1
      //   80: invokevirtual a : (Ljava/lang/Object;)V
      //   83: goto -> 97
      //   86: astore_1
      //   87: aload_0
      //   88: invokevirtual b : ()V
      //   91: aload_1
      //   92: athrow
      //   93: aload_0
      //   94: invokevirtual b : ()V
      //   97: aload_0
      //   98: monitorenter
      //   99: aload_0
      //   100: iconst_1
      //   101: putfield b : Z
      //   104: aload_0
      //   105: monitorexit
      //   106: aload_0
      //   107: invokevirtual d : ()V
      //   110: return
      //   111: astore_1
      //   112: aload_0
      //   113: monitorexit
      //   114: aload_1
      //   115: athrow
      //   116: astore_1
      //   117: aload_0
      //   118: monitorexit
      //   119: aload_1
      //   120: athrow
      // Exception table:
      //   from	to	target	type
      //   2	72	116	finally
      //   72	74	116	finally
      //   78	83	86	java/lang/RuntimeException
      //   99	106	111	finally
      //   112	114	111	finally
      //   117	119	116	finally
    }
    
    public final void d() {
      e();
      synchronized (d.g0(this.c)) {
        d.g0(this.c).remove(this);
        return;
      } 
    }
    
    public final void e() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: aconst_null
      //   4: putfield a : Ljava/lang/Object;
      //   7: aload_0
      //   8: monitorexit
      //   9: return
      //   10: astore_1
      //   11: aload_0
      //   12: monitorexit
      //   13: aload_1
      //   14: athrow
      // Exception table:
      //   from	to	target	type
      //   2	9	10	finally
      //   11	13	10	finally
    }
  }
  
  public final class i implements ServiceConnection {
    private final int a;
    
    public i(d this$0, int param1Int) {
      this.a = param1Int;
    }
    
    public final void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      if (param1IBinder == null) {
        d.U(this.b, 16);
        return;
      } 
      synchronized (d.P(this.b)) {
        d d1 = this.b;
        IInterface iInterface = param1IBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iInterface != null && iInterface instanceof p) {
          iInterface = iInterface;
        } else {
          iInterface = new o(param1IBinder);
        } 
        d.O(d1, (p)iInterface);
        this.b.S(0, null, this.a);
        return;
      } 
    }
    
    public final void onServiceDisconnected(ComponentName param1ComponentName) {
      synchronized (d.P(this.b)) {
        d.O(this.b, null);
        Handler handler = this.b.n;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        return;
      } 
    }
  }
  
  public static final class j extends n.a {
    private d b;
    
    private final int c;
    
    public j(d param1d, int param1Int) {
      this.b = param1d;
      this.c = param1Int;
    }
    
    public final void N4(int param1Int, Bundle param1Bundle) {
      Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
    
    public final void N7(int param1Int, IBinder param1IBinder, zzc param1zzc) {
      t.k(this.b, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
      t.j(param1zzc);
      d.W(this.b, param1zzc);
      t5(param1Int, param1IBinder, param1zzc.b);
    }
    
    public final void t5(int param1Int, IBinder param1IBinder, Bundle param1Bundle) {
      t.k(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
      this.b.I(param1Int, param1IBinder, param1Bundle, this.c);
      this.b = null;
    }
  }
  
  protected final class k extends f {
    private final IBinder g;
    
    public k(d this$0, int param1Int, IBinder param1IBinder, Bundle param1Bundle) {
      super(this$0, param1Int, param1Bundle);
      this.g = param1IBinder;
    }
    
    protected final void f(ConnectionResult param1ConnectionResult) {
      if (d.h0(this.h) != null)
        d.h0(this.h).i1(param1ConnectionResult); 
      this.h.G(param1ConnectionResult);
    }
    
    protected final boolean g() {
      try {
        String str = this.g.getInterfaceDescriptor();
        if (!this.h.l().equals(str)) {
          String str1 = this.h.l();
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 34 + String.valueOf(str).length());
          stringBuilder.append("service descriptor mismatch: ");
          stringBuilder.append(str1);
          stringBuilder.append(" vs. ");
          stringBuilder.append(str);
          Log.e("GmsClient", stringBuilder.toString());
          return false;
        } 
        IInterface iInterface = (IInterface)this.h.m(this.g);
        if (iInterface != null && (d.Z(this.h, 2, 4, iInterface) || d.Z(this.h, 3, 4, iInterface))) {
          d.N(this.h, null);
          Bundle bundle = this.h.x();
          if (d.f0(this.h) != null)
            d.f0(this.h).o1(bundle); 
          return true;
        } 
        return false;
      } catch (RemoteException remoteException) {
        Log.w("GmsClient", "service probably died");
        return false;
      } 
    }
  }
  
  protected final class l extends f {
    public l(d this$0, int param1Int, Bundle param1Bundle) {
      super(this$0, param1Int, null);
    }
    
    protected final void f(ConnectionResult param1ConnectionResult) {
      if (this.g.u() && d.b0(this.g)) {
        d.U(this.g, 16);
        return;
      } 
      this.g.r.a(param1ConnectionResult);
      this.g.G(param1ConnectionResult);
    }
    
    protected final boolean g() {
      this.g.r.a(ConnectionResult.b);
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */