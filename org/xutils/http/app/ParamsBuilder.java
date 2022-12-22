package org.xutils.http.app;

import javax.net.ssl.SSLSocketFactory;
import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

public interface ParamsBuilder {
  String buildCacheKey(RequestParams paramRequestParams, String[] paramArrayOfString);
  
  void buildParams(RequestParams paramRequestParams);
  
  void buildSign(RequestParams paramRequestParams, String[] paramArrayOfString);
  
  String buildUri(RequestParams paramRequestParams, HttpRequest paramHttpRequest);
  
  SSLSocketFactory getSSLSocketFactory();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/http/app/ParamsBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */