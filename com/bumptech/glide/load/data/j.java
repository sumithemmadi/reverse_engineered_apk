package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.i.g;
import com.bumptech.glide.p.c;
import com.bumptech.glide.p.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class j implements d<InputStream> {
  static final b b = new a();
  
  private final g c;
  
  private final int d;
  
  private final b e;
  
  private HttpURLConnection f;
  
  private InputStream g;
  
  private volatile boolean h;
  
  public j(g paramg, int paramInt) {
    this(paramg, paramInt, b);
  }
  
  j(g paramg, int paramInt, b paramb) {
    this.c = paramg;
    this.d = paramInt;
    this.e = paramb;
  }
  
  private HttpURLConnection c(URL paramURL, Map<String, String> paramMap) {
    try {
      HttpURLConnection httpURLConnection = this.e.a(paramURL);
      for (Map.Entry<String, String> entry : paramMap.entrySet())
        httpURLConnection.addRequestProperty((String)entry.getKey(), (String)entry.getValue()); 
      httpURLConnection.setConnectTimeout(this.d);
      httpURLConnection.setReadTimeout(this.d);
      httpURLConnection.setUseCaches(false);
      httpURLConnection.setDoInput(true);
      httpURLConnection.setInstanceFollowRedirects(false);
      return httpURLConnection;
    } catch (IOException iOException) {
      HttpException httpException = new HttpException("URL.openConnection threw", 0, iOException);
      throw httpException;
    } 
  }
  
  private static int f(HttpURLConnection paramHttpURLConnection) {
    try {
      return paramHttpURLConnection.getResponseCode();
    } catch (IOException iOException) {
      if (Log.isLoggable("HttpUrlFetcher", 3))
        Log.d("HttpUrlFetcher", "Failed to get a response code", iOException); 
      return -1;
    } 
  }
  
  private InputStream g(HttpURLConnection paramHttpURLConnection) {
    try {
      if (TextUtils.isEmpty(paramHttpURLConnection.getContentEncoding())) {
        int i = paramHttpURLConnection.getContentLength();
        this.g = c.c(paramHttpURLConnection.getInputStream(), i);
      } else {
        if (Log.isLoggable("HttpUrlFetcher", 3)) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Got non empty content encoding: ");
          stringBuilder.append(paramHttpURLConnection.getContentEncoding());
          Log.d("HttpUrlFetcher", stringBuilder.toString());
        } 
        this.g = paramHttpURLConnection.getInputStream();
      } 
      return this.g;
    } catch (IOException iOException) {
      throw new HttpException("Failed to obtain InputStream", f(paramHttpURLConnection), iOException);
    } 
  }
  
  private static boolean h(int paramInt) {
    boolean bool;
    if (paramInt / 100 == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean i(int paramInt) {
    boolean bool;
    if (paramInt / 100 == 3) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private InputStream j(URL paramURL1, int paramInt, URL paramURL2, Map<String, String> paramMap) {
    if (paramInt < 5) {
      if (paramURL2 != null)
        try {
          if (paramURL1.toURI().equals(paramURL2.toURI())) {
            HttpException httpException = new HttpException();
            this("In re-direct loop", -1);
            throw httpException;
          } 
        } catch (URISyntaxException uRISyntaxException) {} 
      HttpURLConnection httpURLConnection = c(paramURL1, paramMap);
      this.f = httpURLConnection;
      try {
        httpURLConnection.connect();
        this.g = this.f.getInputStream();
        if (this.h)
          return null; 
        int i = f(this.f);
        if (h(i))
          return g(this.f); 
        if (i(i)) {
          String str = this.f.getHeaderField("Location");
          if (!TextUtils.isEmpty(str))
            try {
              URL uRL = new URL(paramURL1, str);
              b();
              return j(uRL, paramInt + 1, paramURL1, paramMap);
            } catch (MalformedURLException malformedURLException) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Bad redirect url: ");
              stringBuilder.append(str);
              throw new HttpException(stringBuilder.toString(), i, malformedURLException);
            }  
          throw new HttpException("Received empty or null redirect url", i);
        } 
        if (i == -1)
          throw new HttpException(i); 
        try {
          HttpException httpException = new HttpException();
          this(this.f.getResponseMessage(), i);
          throw httpException;
        } catch (IOException iOException) {
          throw new HttpException("Failed to get a response message", i, iOException);
        } 
      } catch (IOException iOException) {
        throw new HttpException("Failed to connect or obtain data", f(this.f), iOException);
      } 
    } 
    throw new HttpException("Too many (> 5) redirects!", -1);
  }
  
  public Class<InputStream> a() {
    return InputStream.class;
  }
  
  public void b() {
    InputStream inputStream = this.g;
    if (inputStream != null)
      try {
        inputStream.close();
      } catch (IOException iOException) {} 
    HttpURLConnection httpURLConnection = this.f;
    if (httpURLConnection != null)
      httpURLConnection.disconnect(); 
    this.f = null;
  }
  
  public void cancel() {
    this.h = true;
  }
  
  public DataSource d() {
    return DataSource.c;
  }
  
  public void e(Priority paramPriority, d.a<? super InputStream> parama) {
    long l = f.b();
    try {
      parama.f(j(this.c.h(), 0, null, this.c.e()));
      if (Log.isLoggable("HttpUrlFetcher", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
      } else {
        return;
      } 
    } catch (IOException iOException) {
      if (Log.isLoggable("HttpUrlFetcher", 3))
        Log.d("HttpUrlFetcher", "Failed to load data for url", iOException); 
      parama.c(iOException);
      if (Log.isLoggable("HttpUrlFetcher", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
      } else {
        return;
      } 
    } finally {}
    paramPriority.append("Finished http url fetcher fetch in ");
    paramPriority.append(f.a(l));
    Log.v("HttpUrlFetcher", paramPriority.toString());
  }
  
  private static class a implements b {
    public HttpURLConnection a(URL param1URL) {
      return (HttpURLConnection)param1URL.openConnection();
    }
  }
  
  static interface b {
    HttpURLConnection a(URL param1URL);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */