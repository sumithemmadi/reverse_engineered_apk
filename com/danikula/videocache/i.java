package com.danikula.videocache;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

class i extends ProxySelector {
  private static final List<Proxy> a = Arrays.asList(new Proxy[] { Proxy.NO_PROXY });
  
  private final ProxySelector b;
  
  private final String c;
  
  private final int d;
  
  i(ProxySelector paramProxySelector, String paramString, int paramInt) {
    this.b = k.<ProxySelector>d(paramProxySelector);
    this.c = k.<String>d(paramString);
    this.d = paramInt;
  }
  
  static void a(String paramString, int paramInt) {
    ProxySelector.setDefault(new i(ProxySelector.getDefault(), paramString, paramInt));
  }
  
  public void connectFailed(URI paramURI, SocketAddress paramSocketAddress, IOException paramIOException) {
    this.b.connectFailed(paramURI, paramSocketAddress, paramIOException);
  }
  
  public List<Proxy> select(URI paramURI) {
    List<Proxy> list;
    boolean bool;
    if (this.c.equals(paramURI.getHost()) && this.d == paramURI.getPort()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      list = a;
    } else {
      list = this.b.select((URI)list);
    } 
    return list;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */