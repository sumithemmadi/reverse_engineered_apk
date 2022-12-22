package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.k;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.v;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@TargetApi(18)
class DefaultDrmSession<T extends m> implements DrmSession<T> {
  public final List<DrmInitData.SchemeData> a;
  
  private final n<T> b;
  
  private final a<T> c;
  
  private final b<T> d;
  
  private final int e;
  
  private final boolean f;
  
  private final boolean g;
  
  private final HashMap<String, String> h;
  
  private final k<h> i;
  
  private final u j;
  
  final p k;
  
  final UUID l;
  
  final e m;
  
  private int n;
  
  private int o;
  
  private HandlerThread p;
  
  private c q;
  
  private T r;
  
  private DrmSession.DrmSessionException s;
  
  private byte[] t;
  
  private byte[] u;
  
  private n.a v;
  
  private n.d w;
  
  public DefaultDrmSession(UUID paramUUID, n<T> paramn, a<T> parama, b<T> paramb, List<DrmInitData.SchemeData> paramList, int paramInt, boolean paramBoolean1, boolean paramBoolean2, byte[] paramArrayOfbyte, HashMap<String, String> paramHashMap, p paramp, Looper paramLooper, k<h> paramk, u paramu) {
    if (paramInt == 1 || paramInt == 3)
      com.google.android.exoplayer2.util.e.e(paramArrayOfbyte); 
    this.l = paramUUID;
    this.c = parama;
    this.d = paramb;
    this.b = paramn;
    this.e = paramInt;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    if (paramArrayOfbyte != null) {
      this.u = paramArrayOfbyte;
      this.a = null;
    } else {
      this.a = Collections.unmodifiableList((List<? extends DrmInitData.SchemeData>)com.google.android.exoplayer2.util.e.e(paramList));
    } 
    this.h = paramHashMap;
    this.k = paramp;
    this.i = paramk;
    this.j = paramu;
    this.n = 2;
    this.m = new e(this, paramLooper);
  }
  
  @RequiresNonNull({"sessionId"})
  private void j(boolean paramBoolean) {
    if (this.g)
      return; 
    byte[] arrayOfByte = (byte[])h0.g(this.t);
    int i = this.e;
    if (i != 0 && i != 1) {
      if (i != 2) {
        if (i == 3) {
          com.google.android.exoplayer2.util.e.e(this.u);
          com.google.android.exoplayer2.util.e.e(this.t);
          if (x())
            v(this.u, 3, paramBoolean); 
        } 
      } else if (this.u == null || x()) {
        v(arrayOfByte, 2, paramBoolean);
      } 
    } else if (this.u == null) {
      v(arrayOfByte, 1, paramBoolean);
    } else if (this.n == 4 || x()) {
      long l = k();
      if (this.e == 0 && l <= 60L) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Offline license has expired or will expire soon. Remaining seconds: ");
        stringBuilder.append(l);
        o.b("DefaultDrmSession", stringBuilder.toString());
        v(arrayOfByte, 2, paramBoolean);
      } else if (l <= 0L) {
        o(new KeysExpiredException());
      } else {
        this.n = 4;
        this.i.b(e.a);
      } 
    } 
  }
  
  private long k() {
    if (!v.d.equals(this.l))
      return Long.MAX_VALUE; 
    Pair pair = (Pair)com.google.android.exoplayer2.util.e.e(q.b(this));
    return Math.min(((Long)pair.first).longValue(), ((Long)pair.second).longValue());
  }
  
  @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
  private boolean m() {
    int i = this.n;
    return (i == 3 || i == 4);
  }
  
  private void o(Exception paramException) {
    this.s = new DrmSession.DrmSessionException(paramException);
    this.i.b(new b(paramException));
    if (this.n != 4)
      this.n = 1; 
  }
  
  private void p(Object paramObject1, Object paramObject2) {
    if (paramObject1 == this.v && m()) {
      this.v = null;
      if (paramObject2 instanceof Exception) {
        q((Exception)paramObject2);
        return;
      } 
      try {
        paramObject1 = paramObject2;
        if (this.e == 3) {
          this.b.j((byte[])h0.g(this.u), (byte[])paramObject1);
          this.i.b(e.a);
        } else {
          paramObject1 = this.b.j(this.t, (byte[])paramObject1);
          int i = this.e;
          if ((i == 2 || (i == 0 && this.u != null)) && paramObject1 != null && paramObject1.length != 0)
            this.u = (byte[])paramObject1; 
          this.n = 4;
          this.i.b(f.a);
        } 
      } catch (Exception exception) {
        q(exception);
      } 
    } 
  }
  
  private void q(Exception paramException) {
    if (paramException instanceof NotProvisionedException) {
      this.c.a(this);
    } else {
      o(paramException);
    } 
  }
  
  private void r() {
    if (this.e == 0 && this.n == 4) {
      h0.g(this.t);
      j(false);
    } 
  }
  
  private void t(Object paramObject1, Object paramObject2) {
    if (paramObject1 == this.w && (this.n == 2 || m())) {
      this.w = null;
      if (paramObject2 instanceof Exception) {
        this.c.b((Exception)paramObject2);
        return;
      } 
      try {
        this.b.k((byte[])paramObject2);
        this.c.c();
        return;
      } catch (Exception exception) {
        this.c.b(exception);
      } 
    } 
  }
  
  @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
  private boolean u(boolean paramBoolean) {
    if (m())
      return true; 
    try {
      byte[] arrayOfByte = this.b.f();
      this.t = arrayOfByte;
      this.r = this.b.d(arrayOfByte);
      this.i.b(g.a);
      this.n = 3;
      com.google.android.exoplayer2.util.e.e(this.t);
      return true;
    } catch (NotProvisionedException notProvisionedException) {
      if (paramBoolean) {
        this.c.a(this);
      } else {
        o((Exception)notProvisionedException);
      } 
    } catch (Exception exception) {
      o(exception);
    } 
    return false;
  }
  
  private void v(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    try {
      this.v = this.b.l(paramArrayOfbyte, this.a, paramInt, this.h);
      ((c)h0.g(this.q)).b(1, com.google.android.exoplayer2.util.e.e(this.v), paramBoolean);
    } catch (Exception exception) {
      q(exception);
    } 
  }
  
  @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
  private boolean x() {
    try {
      this.b.g(this.t, this.u);
      return true;
    } catch (Exception exception) {
      o.d("DefaultDrmSession", "Error trying to restore keys.", exception);
      o(exception);
      return false;
    } 
  }
  
  public void a() {
    int i = this.o - 1;
    this.o = i;
    if (i == 0) {
      this.n = 0;
      ((e)h0.g(this.m)).removeCallbacksAndMessages(null);
      ((c)h0.g(this.q)).removeCallbacksAndMessages(null);
      this.q = null;
      ((HandlerThread)h0.g(this.p)).quit();
      this.p = null;
      this.r = null;
      this.s = null;
      this.v = null;
      this.w = null;
      byte[] arrayOfByte = this.t;
      if (arrayOfByte != null) {
        this.b.h(arrayOfByte);
        this.t = null;
        this.i.b(a.a);
      } 
      this.d.a(this);
    } 
  }
  
  public void b() {
    boolean bool2;
    int i = this.o;
    boolean bool1 = false;
    if (i >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool2);
    i = this.o + 1;
    this.o = i;
    if (i == 1) {
      bool2 = bool1;
      if (this.n == 2)
        bool2 = true; 
      com.google.android.exoplayer2.util.e.f(bool2);
      HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
      this.p = handlerThread;
      handlerThread.start();
      this.q = new c(this, this.p.getLooper());
      if (u(true))
        j(true); 
    } 
  }
  
  public boolean c() {
    return this.f;
  }
  
  public Map<String, String> d() {
    Map<String, String> map;
    byte[] arrayOfByte = this.t;
    if (arrayOfByte == null) {
      arrayOfByte = null;
    } else {
      map = this.b.c(arrayOfByte);
    } 
    return map;
  }
  
  public final T e() {
    return this.r;
  }
  
  public final DrmSession.DrmSessionException f() {
    DrmSession.DrmSessionException drmSessionException;
    if (this.n == 1) {
      drmSessionException = this.s;
    } else {
      drmSessionException = null;
    } 
    return drmSessionException;
  }
  
  public final int getState() {
    return this.n;
  }
  
  public boolean l(byte[] paramArrayOfbyte) {
    return Arrays.equals(this.t, paramArrayOfbyte);
  }
  
  public void s(int paramInt) {
    if (paramInt == 2)
      r(); 
  }
  
  public void w() {
    this.w = this.b.e();
    ((c)h0.g(this.q)).b(0, com.google.android.exoplayer2.util.e.e(this.w), true);
  }
  
  public static final class UnexpectedDrmSessionException extends IOException {
    public UnexpectedDrmSessionException(Throwable param1Throwable) {
      super(stringBuilder.toString(), param1Throwable);
    }
  }
  
  public static interface a<T extends m> {
    void a(DefaultDrmSession<T> param1DefaultDrmSession);
    
    void b(Exception param1Exception);
    
    void c();
  }
  
  public static interface b<T extends m> {
    void a(DefaultDrmSession<T> param1DefaultDrmSession);
  }
  
  @SuppressLint({"HandlerLeak"})
  private class c extends Handler {
    public c(DefaultDrmSession this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    private boolean a(Message param1Message, Exception param1Exception) {
      DefaultDrmSession.d d = (DefaultDrmSession.d)param1Message.obj;
      if (!d.a)
        return false; 
      int i = d.d + 1;
      d.d = i;
      if (i > DefaultDrmSession.i(this.a).c(3))
        return false; 
      if (param1Exception instanceof IOException) {
        param1Exception = param1Exception;
      } else {
        param1Exception = new DefaultDrmSession.UnexpectedDrmSessionException(param1Exception);
      } 
      long l = DefaultDrmSession.i(this.a).a(3, SystemClock.elapsedRealtime() - d.b, (IOException)param1Exception, d.d);
      if (l == -9223372036854775807L)
        return false; 
      sendMessageDelayed(Message.obtain(param1Message), l);
      return true;
    }
    
    void b(int param1Int, Object param1Object, boolean param1Boolean) {
      obtainMessage(param1Int, new DefaultDrmSession.d(param1Boolean, SystemClock.elapsedRealtime(), param1Object)).sendToTarget();
    }
    
    public void handleMessage(Message param1Message) {
      Exception exception;
      DefaultDrmSession.d d = (DefaultDrmSession.d)param1Message.obj;
      try {
        int i = param1Message.what;
        if (i != 0) {
          if (i == 1) {
            DefaultDrmSession defaultDrmSession = this.a;
            byte[] arrayOfByte = defaultDrmSession.k.a(defaultDrmSession.l, (n.a)d.c);
          } else {
            exception = new RuntimeException();
            this();
            throw exception;
          } 
        } else {
          DefaultDrmSession defaultDrmSession = this.a;
          byte[] arrayOfByte = defaultDrmSession.k.b(defaultDrmSession.l, (n.d)d.c);
        } 
      } catch (Exception exception1) {
        exception = exception1;
        if (a(param1Message, exception1))
          return; 
      } 
      this.a.m.obtainMessage(param1Message.what, Pair.create(d.c, exception)).sendToTarget();
    }
  }
  
  private static final class d {
    public final boolean a;
    
    public final long b;
    
    public final Object c;
    
    public int d;
    
    public d(boolean param1Boolean, long param1Long, Object param1Object) {
      this.a = param1Boolean;
      this.b = param1Long;
      this.c = param1Object;
    }
  }
  
  @SuppressLint({"HandlerLeak"})
  private class e extends Handler {
    public e(DefaultDrmSession this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    public void handleMessage(Message param1Message) {
      Pair pair = (Pair)param1Message.obj;
      Object object2 = pair.first;
      Object object1 = pair.second;
      int i = param1Message.what;
      if (i != 0) {
        if (i == 1)
          DefaultDrmSession.h(this.a, object2, object1); 
      } else {
        DefaultDrmSession.g(this.a, object2, object1);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/drm/DefaultDrmSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */