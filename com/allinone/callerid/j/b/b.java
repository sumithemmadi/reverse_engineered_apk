package com.allinone.callerid.j.b;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class b extends SSLSocketFactory {
  private static final String[] a = new String[] { "TLSv1.1", "TLSv1.2" };
  
  final SSLSocketFactory b;
  
  public b(SSLSocketFactory paramSSLSocketFactory) {
    this.b = paramSSLSocketFactory;
  }
  
  private Socket a(Socket paramSocket) {
    if (paramSocket instanceof SSLSocket)
      ((SSLSocket)paramSocket).setEnabledProtocols(a); 
    return paramSocket;
  }
  
  public Socket createSocket(String paramString, int paramInt) {
    return a(this.b.createSocket(paramString, paramInt));
  }
  
  public Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) {
    return a(this.b.createSocket(paramString, paramInt1, paramInetAddress, paramInt2));
  }
  
  public Socket createSocket(InetAddress paramInetAddress, int paramInt) {
    return a(this.b.createSocket(paramInetAddress, paramInt));
  }
  
  public Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) {
    return a(this.b.createSocket(paramInetAddress1, paramInt1, paramInetAddress2, paramInt2));
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) {
    return a(this.b.createSocket(paramSocket, paramString, paramInt, paramBoolean));
  }
  
  public String[] getDefaultCipherSuites() {
    return this.b.getDefaultCipherSuites();
  }
  
  public String[] getSupportedCipherSuites() {
    return this.b.getSupportedCipherSuites();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/j/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */