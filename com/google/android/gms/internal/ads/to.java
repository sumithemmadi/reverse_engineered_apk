package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

final class to extends SSLSocketFactory {
  private SSLSocketFactory a = (SSLSocketFactory)SSLSocketFactory.getDefault();
  
  to(uo paramuo) {}
  
  private final Socket a(Socket paramSocket) {
    if (uo.c(this.b) > 0)
      paramSocket.setReceiveBufferSize(uo.c(this.b)); 
    uo.d(this.b, paramSocket);
    return paramSocket;
  }
  
  public final Socket createSocket(String paramString, int paramInt) {
    return a(this.a.createSocket(paramString, paramInt));
  }
  
  public final Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) {
    return a(this.a.createSocket(paramString, paramInt1, paramInetAddress, paramInt2));
  }
  
  public final Socket createSocket(InetAddress paramInetAddress, int paramInt) {
    return a(this.a.createSocket(paramInetAddress, paramInt));
  }
  
  public final Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) {
    return a(this.a.createSocket(paramInetAddress1, paramInt1, paramInetAddress2, paramInt2));
  }
  
  public final Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) {
    return a(this.a.createSocket(paramSocket, paramString, paramInt, paramBoolean));
  }
  
  public final String[] getDefaultCipherSuites() {
    return this.a.getDefaultCipherSuites();
  }
  
  public final String[] getSupportedCipherSuites() {
    return this.a.getSupportedCipherSuites();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/to.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */