package org.xutils.http.app;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

public class DefaultParamsBuilder implements ParamsBuilder {
  private static SSLSocketFactory a;
  
  public static SSLSocketFactory getTrustAllSSLSocketFactory() {
    // Byte code:
    //   0: getstatic org/xutils/http/app/DefaultParamsBuilder.a : Ljavax/net/ssl/SSLSocketFactory;
    //   3: ifnonnull -> 74
    //   6: ldc org/xutils/http/app/DefaultParamsBuilder
    //   8: monitorenter
    //   9: getstatic org/xutils/http/app/DefaultParamsBuilder.a : Ljavax/net/ssl/SSLSocketFactory;
    //   12: ifnonnull -> 62
    //   15: new org/xutils/http/app/DefaultParamsBuilder$a
    //   18: astore_0
    //   19: aload_0
    //   20: invokespecial <init> : ()V
    //   23: ldc 'TLS'
    //   25: invokestatic getInstance : (Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   28: astore_1
    //   29: aload_1
    //   30: aconst_null
    //   31: iconst_1
    //   32: anewarray javax/net/ssl/TrustManager
    //   35: dup
    //   36: iconst_0
    //   37: aload_0
    //   38: aastore
    //   39: aconst_null
    //   40: invokevirtual init : ([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   43: aload_1
    //   44: invokevirtual getSocketFactory : ()Ljavax/net/ssl/SSLSocketFactory;
    //   47: putstatic org/xutils/http/app/DefaultParamsBuilder.a : Ljavax/net/ssl/SSLSocketFactory;
    //   50: goto -> 62
    //   53: astore_1
    //   54: aload_1
    //   55: invokevirtual getMessage : ()Ljava/lang/String;
    //   58: aload_1
    //   59: invokestatic e : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   62: ldc org/xutils/http/app/DefaultParamsBuilder
    //   64: monitorexit
    //   65: goto -> 74
    //   68: astore_1
    //   69: ldc org/xutils/http/app/DefaultParamsBuilder
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    //   74: getstatic org/xutils/http/app/DefaultParamsBuilder.a : Ljavax/net/ssl/SSLSocketFactory;
    //   77: areturn
    // Exception table:
    //   from	to	target	type
    //   9	23	68	finally
    //   23	50	53	finally
    //   54	62	68	finally
    //   62	65	68	finally
    //   69	72	68	finally
  }
  
  public String buildCacheKey(RequestParams paramRequestParams, String[] paramArrayOfString) {
    StringBuilder stringBuilder = new StringBuilder();
    if (paramArrayOfString != null && paramArrayOfString.length > 0) {
      stringBuilder.append(paramRequestParams.getUri());
      stringBuilder.append("?");
      int i = paramArrayOfString.length;
      for (byte b = 0; b < i; b++) {
        String str = paramArrayOfString[b];
        List list = paramRequestParams.getParams(str);
        if (list != null && !list.isEmpty()) {
          Iterator<KeyValue> iterator = list.iterator();
          while (iterator.hasNext()) {
            String str1 = ((KeyValue)iterator.next()).getValueStrOrNull();
            if (str1 != null) {
              stringBuilder.append(str);
              stringBuilder.append("=");
              stringBuilder.append(str1);
              stringBuilder.append("&");
            } 
          } 
        } 
      } 
    } 
    return stringBuilder.toString();
  }
  
  public void buildParams(RequestParams paramRequestParams) {}
  
  public void buildSign(RequestParams paramRequestParams, String[] paramArrayOfString) {}
  
  public String buildUri(RequestParams paramRequestParams, HttpRequest paramHttpRequest) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramHttpRequest.host());
    stringBuilder.append("/");
    stringBuilder.append(paramHttpRequest.path());
    return stringBuilder.toString();
  }
  
  public SSLSocketFactory getSSLSocketFactory() {
    return getTrustAllSSLSocketFactory();
  }
  
  static final class a implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] param1ArrayOfX509Certificate, String param1String) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("checkClientTrusted:");
      stringBuilder.append(param1String);
      LogUtil.d(stringBuilder.toString());
    }
    
    public void checkServerTrusted(X509Certificate[] param1ArrayOfX509Certificate, String param1String) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("checkServerTrusted:");
      stringBuilder.append(param1String);
      LogUtil.d(stringBuilder.toString());
    }
    
    public X509Certificate[] getAcceptedIssuers() {
      return new X509Certificate[0];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/http/app/DefaultParamsBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */