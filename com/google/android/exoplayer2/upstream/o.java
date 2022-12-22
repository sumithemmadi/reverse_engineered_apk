package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class o implements j {
  private final Context b;
  
  private final List<x> c;
  
  private final j d;
  
  private j e;
  
  private j f;
  
  private j g;
  
  private j h;
  
  private j i;
  
  private j j;
  
  private j k;
  
  private j l;
  
  public o(Context paramContext, j paramj) {
    this.b = paramContext.getApplicationContext();
    this.d = (j)e.e(paramj);
    this.c = new ArrayList<x>();
  }
  
  private void a(j paramj) {
    for (byte b = 0; b < this.c.size(); b++)
      paramj.f0(this.c.get(b)); 
  }
  
  private j b() {
    if (this.f == null) {
      AssetDataSource assetDataSource = new AssetDataSource(this.b);
      this.f = assetDataSource;
      a(assetDataSource);
    } 
    return this.f;
  }
  
  private j c() {
    if (this.g == null) {
      ContentDataSource contentDataSource = new ContentDataSource(this.b);
      this.g = contentDataSource;
      a(contentDataSource);
    } 
    return this.g;
  }
  
  private j d() {
    if (this.j == null) {
      h h = new h();
      this.j = h;
      a(h);
    } 
    return this.j;
  }
  
  private j e() {
    if (this.e == null) {
      FileDataSource fileDataSource = new FileDataSource();
      this.e = fileDataSource;
      a(fileDataSource);
    } 
    return this.e;
  }
  
  private j f() {
    if (this.k == null) {
      RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.b);
      this.k = rawResourceDataSource;
      a(rawResourceDataSource);
    } 
    return this.k;
  }
  
  private j g() {
    if (this.h == null) {
      try {
        j j1 = Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
        this.h = j1;
        a(j1);
      } catch (ClassNotFoundException classNotFoundException) {
        com.google.android.exoplayer2.util.o.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
      } catch (Exception exception) {
        throw new RuntimeException("Error instantiating RTMP extension", exception);
      } 
      if (this.h == null)
        this.h = this.d; 
    } 
    return this.h;
  }
  
  private j h() {
    if (this.i == null) {
      UdpDataSource udpDataSource = new UdpDataSource();
      this.i = udpDataSource;
      a(udpDataSource);
    } 
    return this.i;
  }
  
  private void i(j paramj, x paramx) {
    if (paramj != null)
      paramj.f0(paramx); 
  }
  
  public void close() {
    j j1 = this.l;
    if (j1 != null)
      try {
        j1.close();
      } finally {
        this.l = null;
      }  
  }
  
  public Uri e0() {
    Uri uri;
    j j1 = this.l;
    if (j1 == null) {
      j1 = null;
    } else {
      uri = j1.e0();
    } 
    return uri;
  }
  
  public void f0(x paramx) {
    this.d.f0(paramx);
    this.c.add(paramx);
    i(this.e, paramx);
    i(this.f, paramx);
    i(this.g, paramx);
    i(this.h, paramx);
    i(this.i, paramx);
    i(this.j, paramx);
    i(this.k, paramx);
  }
  
  public long g0(l paraml) {
    boolean bool;
    if (this.l == null) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    String str = paraml.a.getScheme();
    if (h0.W(paraml.a)) {
      str = paraml.a.getPath();
      if (str != null && str.startsWith("/android_asset/")) {
        this.l = b();
      } else {
        this.l = e();
      } 
    } else if ("asset".equals(str)) {
      this.l = b();
    } else if ("content".equals(str)) {
      this.l = c();
    } else if ("rtmp".equals(str)) {
      this.l = g();
    } else if ("udp".equals(str)) {
      this.l = h();
    } else if ("data".equals(str)) {
      this.l = d();
    } else if ("rawresource".equals(str)) {
      this.l = f();
    } else {
      this.l = this.d;
    } 
    return this.l.g0(paraml);
  }
  
  public Map<String, List<String>> getResponseHeaders() {
    Map<?, ?> map;
    j j1 = this.l;
    if (j1 == null) {
      map = Collections.emptyMap();
    } else {
      map = map.getResponseHeaders();
    } 
    return (Map)map;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return ((j)e.e(this.l)).read(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */