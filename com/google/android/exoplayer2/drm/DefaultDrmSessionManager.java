package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.k;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
public class DefaultDrmSessionManager<T extends m> implements k<T> {
  private final UUID b;
  
  private final n.c<T> c;
  
  private final p d;
  
  private final HashMap<String, String> e;
  
  private final k<h> f;
  
  private final boolean g;
  
  private final int[] h;
  
  private final boolean i;
  
  private final d j;
  
  private final u k;
  
  private final List<DefaultDrmSession<T>> l;
  
  private final List<DefaultDrmSession<T>> m;
  
  private int n;
  
  private n<T> o;
  
  private DefaultDrmSession<T> p;
  
  private DefaultDrmSession<T> q;
  
  private Looper r;
  
  private int s;
  
  private byte[] t;
  
  volatile c u;
  
  private void i(Looper paramLooper) {
    boolean bool;
    Looper looper = this.r;
    if (looper == null || looper == paramLooper) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.r = paramLooper;
  }
  
  private DefaultDrmSession<T> j(List<DrmInitData.SchemeData> paramList, boolean paramBoolean) {
    e.e(this.o);
    boolean bool = this.i;
    return new DefaultDrmSession<T>(this.b, this.o, this.j, new c(this), paramList, this.s, bool | paramBoolean, paramBoolean, this.t, this.e, this.d, (Looper)e.e(this.r), this.f, this.k);
  }
  
  private static List<DrmInitData.SchemeData> k(DrmInitData paramDrmInitData, UUID paramUUID, boolean paramBoolean) {
    ArrayList<DrmInitData.SchemeData> arrayList = new ArrayList(paramDrmInitData.e);
    for (byte b = 0; b < paramDrmInitData.e; b++) {
      boolean bool;
      DrmInitData.SchemeData schemeData = paramDrmInitData.e(b);
      if (schemeData.d(paramUUID) || (v.c.equals(paramUUID) && schemeData.d(v.b))) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool && (schemeData.f != null || paramBoolean))
        arrayList.add(schemeData); 
    } 
    return arrayList;
  }
  
  private void n(Looper paramLooper) {
    if (this.u == null)
      this.u = new c(this, paramLooper); 
  }
  
  private void o(DefaultDrmSession<T> paramDefaultDrmSession) {
    this.l.remove(paramDefaultDrmSession);
    if (this.p == paramDefaultDrmSession)
      this.p = null; 
    if (this.q == paramDefaultDrmSession)
      this.q = null; 
    if (this.m.size() > 1 && this.m.get(0) == paramDefaultDrmSession)
      ((DefaultDrmSession)this.m.get(1)).w(); 
    this.m.remove(paramDefaultDrmSession);
  }
  
  public final void a() {
    int i = this.n - 1;
    this.n = i;
    if (i == 0) {
      ((n)e.e(this.o)).a();
      this.o = null;
    } 
  }
  
  public Class<T> b(DrmInitData paramDrmInitData) {
    if (f(paramDrmInitData)) {
      Class clazz = ((n)e.e(this.o)).b();
    } else {
      paramDrmInitData = null;
    } 
    return (Class<T>)paramDrmInitData;
  }
  
  public final void c() {
    int i = this.n;
    this.n = i + 1;
    if (i == 0) {
      boolean bool;
      if (this.o == null) {
        bool = true;
      } else {
        bool = false;
      } 
      e.f(bool);
      n<T> n1 = this.c.a(this.b);
      this.o = n1;
      n1.i(new b(null));
    } 
  }
  
  public DrmSession<T> d(Looper paramLooper, int paramInt) {
    boolean bool;
    i(paramLooper);
    n n1 = (n)e.e(this.o);
    if (o.class.equals(n1.b()) && o.a) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool || h0.Z(this.h, paramInt) == -1 || n1.b() == null)
      return null; 
    n(paramLooper);
    if (this.p == null) {
      DefaultDrmSession<T> defaultDrmSession = j(Collections.emptyList(), true);
      this.l.add(defaultDrmSession);
      this.p = defaultDrmSession;
    } 
    this.p.b();
    return this.p;
  }
  
  public DrmSession<T> e(Looper paramLooper, DrmInitData paramDrmInitData) {
    DefaultDrmSession<T> defaultDrmSession1;
    i(paramLooper);
    n(paramLooper);
    byte[] arrayOfByte1 = this.t;
    byte[] arrayOfByte2 = null;
    if (arrayOfByte1 == null) {
      List<DrmInitData.SchemeData> list1 = k(paramDrmInitData, this.b, false);
      List<DrmInitData.SchemeData> list2 = list1;
      if (list1.isEmpty()) {
        MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.b, null);
        this.f.b(new d(missingSchemeDataException));
        return new l<T>(new DrmSession.DrmSessionException(missingSchemeDataException));
      } 
    } else {
      paramDrmInitData = null;
    } 
    if (!this.g) {
      defaultDrmSession1 = this.q;
    } else {
      Iterator<DefaultDrmSession<T>> iterator = this.l.iterator();
      while (true) {
        arrayOfByte1 = arrayOfByte2;
        if (iterator.hasNext()) {
          defaultDrmSession1 = iterator.next();
          if (h0.b(defaultDrmSession1.a, paramDrmInitData))
            break; 
          continue;
        } 
        break;
      } 
    } 
    DefaultDrmSession<T> defaultDrmSession2 = defaultDrmSession1;
    if (defaultDrmSession1 == null) {
      defaultDrmSession2 = j((List<DrmInitData.SchemeData>)paramDrmInitData, false);
      if (!this.g)
        this.q = defaultDrmSession2; 
      this.l.add(defaultDrmSession2);
    } 
    defaultDrmSession2.b();
    return defaultDrmSession2;
  }
  
  public boolean f(DrmInitData paramDrmInitData) {
    byte[] arrayOfByte = this.t;
    boolean bool1 = true;
    if (arrayOfByte != null)
      return true; 
    if (k(paramDrmInitData, this.b, true).isEmpty())
      if (paramDrmInitData.e == 1 && paramDrmInitData.e(0).d(v.b)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
        stringBuilder.append(this.b);
        o.f("DefaultDrmSessionMgr", stringBuilder.toString());
      } else {
        return false;
      }  
    String str = paramDrmInitData.d;
    boolean bool2 = bool1;
    if (str != null)
      if ("cenc".equals(str)) {
        bool2 = bool1;
      } else {
        if ("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) {
          if (h0.a >= 25) {
            bool2 = bool1;
          } else {
            bool2 = false;
          } 
          return bool2;
        } 
        return true;
      }  
    return bool2;
  }
  
  public final void h(Handler paramHandler, h paramh) {
    this.f.a(paramHandler, paramh);
  }
  
  public static final class MissingSchemeDataException extends Exception {
    private MissingSchemeDataException(UUID param1UUID) {
      super(stringBuilder.toString());
    }
  }
  
  private class b implements n.b<T> {
    private b(DefaultDrmSessionManager this$0) {}
  }
  
  @SuppressLint({"HandlerLeak"})
  private class c extends Handler {
    public c(DefaultDrmSessionManager this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    public void handleMessage(Message param1Message) {
      byte[] arrayOfByte = (byte[])param1Message.obj;
      if (arrayOfByte == null)
        return; 
      for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.g(this.a)) {
        if (defaultDrmSession.l(arrayOfByte)) {
          defaultDrmSession.s(param1Message.what);
          break;
        } 
      } 
    }
  }
  
  private class d implements DefaultDrmSession.a<T> {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/drm/DefaultDrmSessionManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */