package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.g.a;

public final class b implements a {
  public static final a a = new b();
  
  public void a(com.google.firebase.encoders.g.b<?> paramb) {
    b b1 = b.a;
    paramb.a(j.class, b1);
    paramb.a(d.class, b1);
    e e = e.a;
    paramb.a(l.class, e);
    paramb.a(g.class, e);
    c c = c.a;
    paramb.a(ClientInfo.class, c);
    paramb.a(e.class, c);
    a a1 = a.a;
    paramb.a(a.class, a1);
    paramb.a(c.class, a1);
    d d = d.a;
    paramb.a(k.class, d);
    paramb.a(f.class, d);
    f f = f.a;
    paramb.a(NetworkConnectionInfo.class, f);
    paramb.a(i.class, f);
  }
  
  private static final class a implements com.google.firebase.encoders.c<a> {
    static final a a = new a();
    
    private static final com.google.firebase.encoders.b b = com.google.firebase.encoders.b.b("sdkVersion");
    
    private static final com.google.firebase.encoders.b c = com.google.firebase.encoders.b.b("model");
    
    private static final com.google.firebase.encoders.b d = com.google.firebase.encoders.b.b("hardware");
    
    private static final com.google.firebase.encoders.b e = com.google.firebase.encoders.b.b("device");
    
    private static final com.google.firebase.encoders.b f = com.google.firebase.encoders.b.b("product");
    
    private static final com.google.firebase.encoders.b g = com.google.firebase.encoders.b.b("osBuild");
    
    private static final com.google.firebase.encoders.b h = com.google.firebase.encoders.b.b("manufacturer");
    
    private static final com.google.firebase.encoders.b i = com.google.firebase.encoders.b.b("fingerprint");
    
    private static final com.google.firebase.encoders.b j = com.google.firebase.encoders.b.b("locale");
    
    private static final com.google.firebase.encoders.b k = com.google.firebase.encoders.b.b("country");
    
    private static final com.google.firebase.encoders.b l = com.google.firebase.encoders.b.b("mccMnc");
    
    private static final com.google.firebase.encoders.b m = com.google.firebase.encoders.b.b("applicationBuild");
    
    public void b(a param1a, com.google.firebase.encoders.d param1d) {
      param1d.h(b, param1a.m());
      param1d.h(c, param1a.j());
      param1d.h(d, param1a.f());
      param1d.h(e, param1a.d());
      param1d.h(f, param1a.l());
      param1d.h(g, param1a.k());
      param1d.h(h, param1a.h());
      param1d.h(i, param1a.e());
      param1d.h(j, param1a.g());
      param1d.h(k, param1a.c());
      param1d.h(l, param1a.i());
      param1d.h(m, param1a.b());
    }
  }
  
  private static final class b implements com.google.firebase.encoders.c<j> {
    static final b a = new b();
    
    private static final com.google.firebase.encoders.b b = com.google.firebase.encoders.b.b("logRequest");
    
    public void b(j param1j, com.google.firebase.encoders.d param1d) {
      param1d.h(b, param1j.c());
    }
  }
  
  private static final class c implements com.google.firebase.encoders.c<ClientInfo> {
    static final c a = new c();
    
    private static final com.google.firebase.encoders.b b = com.google.firebase.encoders.b.b("clientType");
    
    private static final com.google.firebase.encoders.b c = com.google.firebase.encoders.b.b("androidClientInfo");
    
    public void b(ClientInfo param1ClientInfo, com.google.firebase.encoders.d param1d) {
      param1d.h(b, param1ClientInfo.c());
      param1d.h(c, param1ClientInfo.b());
    }
  }
  
  private static final class d implements com.google.firebase.encoders.c<k> {
    static final d a = new d();
    
    private static final com.google.firebase.encoders.b b = com.google.firebase.encoders.b.b("eventTimeMs");
    
    private static final com.google.firebase.encoders.b c = com.google.firebase.encoders.b.b("eventCode");
    
    private static final com.google.firebase.encoders.b d = com.google.firebase.encoders.b.b("eventUptimeMs");
    
    private static final com.google.firebase.encoders.b e = com.google.firebase.encoders.b.b("sourceExtension");
    
    private static final com.google.firebase.encoders.b f = com.google.firebase.encoders.b.b("sourceExtensionJsonProto3");
    
    private static final com.google.firebase.encoders.b g = com.google.firebase.encoders.b.b("timezoneOffsetSeconds");
    
    private static final com.google.firebase.encoders.b h = com.google.firebase.encoders.b.b("networkConnectionInfo");
    
    public void b(k param1k, com.google.firebase.encoders.d param1d) {
      param1d.b(b, param1k.c());
      param1d.h(c, param1k.b());
      param1d.b(d, param1k.d());
      param1d.h(e, param1k.f());
      param1d.h(f, param1k.g());
      param1d.b(g, param1k.h());
      param1d.h(h, param1k.e());
    }
  }
  
  private static final class e implements com.google.firebase.encoders.c<l> {
    static final e a = new e();
    
    private static final com.google.firebase.encoders.b b = com.google.firebase.encoders.b.b("requestTimeMs");
    
    private static final com.google.firebase.encoders.b c = com.google.firebase.encoders.b.b("requestUptimeMs");
    
    private static final com.google.firebase.encoders.b d = com.google.firebase.encoders.b.b("clientInfo");
    
    private static final com.google.firebase.encoders.b e = com.google.firebase.encoders.b.b("logSource");
    
    private static final com.google.firebase.encoders.b f = com.google.firebase.encoders.b.b("logSourceName");
    
    private static final com.google.firebase.encoders.b g = com.google.firebase.encoders.b.b("logEvent");
    
    private static final com.google.firebase.encoders.b h = com.google.firebase.encoders.b.b("qosTier");
    
    public void b(l param1l, com.google.firebase.encoders.d param1d) {
      param1d.b(b, param1l.g());
      param1d.b(c, param1l.h());
      param1d.h(d, param1l.b());
      param1d.h(e, param1l.d());
      param1d.h(f, param1l.e());
      param1d.h(g, param1l.c());
      param1d.h(h, param1l.f());
    }
  }
  
  private static final class f implements com.google.firebase.encoders.c<NetworkConnectionInfo> {
    static final f a = new f();
    
    private static final com.google.firebase.encoders.b b = com.google.firebase.encoders.b.b("networkType");
    
    private static final com.google.firebase.encoders.b c = com.google.firebase.encoders.b.b("mobileSubtype");
    
    public void b(NetworkConnectionInfo param1NetworkConnectionInfo, com.google.firebase.encoders.d param1d) {
      param1d.h(b, param1NetworkConnectionInfo.c());
      param1d.h(c, param1NetworkConnectionInfo.b());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */