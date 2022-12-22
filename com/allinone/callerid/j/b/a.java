package com.allinone.callerid.j.b;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class a implements X509TrustManager {
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public X509Certificate[] getAcceptedIssuers() {
    return new X509Certificate[0];
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/j/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */