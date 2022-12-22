package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public final class qp extends re {
  private final qr a = null;
  
  private final SSLSocketFactory b = null;
  
  public qp() {
    this(null);
  }
  
  private qp(qr paramqr) {
    this(null, null);
  }
  
  private qp(qr paramqr, SSLSocketFactory paramSSLSocketFactory) {}
  
  private static InputStream b(HttpURLConnection paramHttpURLConnection) {
    InputStream inputStream;
    try {
      InputStream inputStream1 = paramHttpURLConnection.getInputStream();
      inputStream = inputStream1;
    } catch (IOException iOException) {
      inputStream = inputStream.getErrorStream();
    } 
    return inputStream;
  }
  
  private static List<yp2> c(Map<String, List<String>> paramMap) {
    ArrayList<yp2> arrayList = new ArrayList(paramMap.size());
    for (Map.Entry<String, List<String>> entry : paramMap.entrySet()) {
      if (entry.getKey() != null)
        for (String str : entry.getValue())
          arrayList.add(new yp2((String)entry.getKey(), str));  
    } 
    return arrayList;
  }
  
  private static void d(HttpURLConnection paramHttpURLConnection, w<?> paramw) {
    byte[] arrayOfByte = paramw.B();
    if (arrayOfByte != null) {
      paramHttpURLConnection.setDoOutput(true);
      if (!paramHttpURLConnection.getRequestProperties().containsKey("Content-Type")) {
        String str;
        if ("UTF-8".length() != 0) {
          str = "application/x-www-form-urlencoded; charset=".concat("UTF-8");
        } else {
          str = new String("application/x-www-form-urlencoded; charset=");
        } 
        paramHttpURLConnection.setRequestProperty("Content-Type", str);
      } 
      DataOutputStream dataOutputStream = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      dataOutputStream.write(arrayOfByte);
      dataOutputStream.close();
    } 
  }
  
  public final pn a(w<?> paramw, Map<String, String> paramMap) {
    String str = paramw.f();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.putAll(paramMap);
    hashMap.putAll(paramw.a());
    URL uRL = new URL(str);
    HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
    httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
    int i = paramw.D();
    httpURLConnection.setConnectTimeout(i);
    httpURLConnection.setReadTimeout(i);
    boolean bool = false;
    httpURLConnection.setUseCaches(false);
    httpURLConnection.setDoInput(true);
    "https".equals(uRL.getProtocol());
    try {
      IllegalStateException illegalStateException;
      for (String str1 : hashMap.keySet())
        httpURLConnection.setRequestProperty(str1, (String)hashMap.get(str1)); 
      switch (paramw.e()) {
        default:
          illegalStateException = new IllegalStateException();
          this("Unknown method type.");
          throw illegalStateException;
        case 7:
          httpURLConnection.setRequestMethod("PATCH");
          d(httpURLConnection, (w<?>)illegalStateException);
          break;
        case 6:
          httpURLConnection.setRequestMethod("TRACE");
          break;
        case 5:
          httpURLConnection.setRequestMethod("OPTIONS");
          break;
        case 4:
          httpURLConnection.setRequestMethod("HEAD");
          break;
        case 3:
          httpURLConnection.setRequestMethod("DELETE");
          break;
        case 2:
          httpURLConnection.setRequestMethod("PUT");
          d(httpURLConnection, (w<?>)illegalStateException);
          break;
        case 1:
          httpURLConnection.setRequestMethod("POST");
          d(httpURLConnection, (w<?>)illegalStateException);
          break;
        case 0:
          httpURLConnection.setRequestMethod("GET");
          break;
        case -1:
          break;
      } 
      int j = httpURLConnection.getResponseCode();
    } finally {
      paramw = null;
    } 
    if (i == 0)
      httpURLConnection.disconnect(); 
    throw paramw;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */