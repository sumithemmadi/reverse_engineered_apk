package org.xutils.http;

import android.content.Context;
import android.text.TextUtils;
import java.net.Proxy;
import java.util.concurrent.Executor;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.xutils.common.task.Priority;
import org.xutils.http.annotation.HttpRequest;
import org.xutils.http.app.DefaultParamsBuilder;
import org.xutils.http.app.DefaultRedirectHandler;
import org.xutils.http.app.HttpRetryHandler;
import org.xutils.http.app.ParamsBuilder;
import org.xutils.http.app.RedirectHandler;
import org.xutils.http.app.RequestTracker;
import org.xutils.x;

public class RequestParams extends BaseParams {
  public static final int MAX_FILE_LOAD_WORKER = 10;
  
  private static final DefaultRedirectHandler k = new DefaultRedirectHandler();
  
  private Executor A;
  
  private Priority B;
  
  private int C;
  
  private int D;
  
  private boolean E;
  
  private boolean F;
  
  private int G;
  
  private String H;
  
  private boolean I;
  
  private int J;
  
  private HttpRetryHandler K;
  
  private RequestTracker L;
  
  private RedirectHandler M;
  
  private boolean N;
  
  private HttpRequest l;
  
  private String m;
  
  private final String[] n;
  
  private final String[] o;
  
  private ParamsBuilder p;
  
  private String q;
  
  private String r;
  
  private SSLSocketFactory s;
  
  private Context t;
  
  private Proxy u;
  
  private HostnameVerifier v;
  
  private boolean w;
  
  private String x;
  
  private long y;
  
  private long z;
  
  public RequestParams() {
    this(null, null, null, null);
  }
  
  public RequestParams(String paramString) {
    this(paramString, null, null, null);
  }
  
  public RequestParams(String paramString, ParamsBuilder paramParamsBuilder, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    DefaultParamsBuilder defaultParamsBuilder;
    this.w = true;
    this.B = Priority.DEFAULT;
    this.C = 15000;
    this.D = 15000;
    this.E = true;
    this.F = false;
    this.G = 2;
    this.I = false;
    this.J = 300;
    this.M = (RedirectHandler)k;
    this.N = false;
    ParamsBuilder paramsBuilder = paramParamsBuilder;
    if (paramString != null) {
      paramsBuilder = paramParamsBuilder;
      if (paramParamsBuilder == null)
        defaultParamsBuilder = new DefaultParamsBuilder(); 
    } 
    this.m = paramString;
    this.n = paramArrayOfString1;
    this.o = paramArrayOfString2;
    this.p = (ParamsBuilder)defaultParamsBuilder;
    this.t = (Context)x.app();
  }
  
  private HttpRequest c() {
    if (this.l == null && !this.N) {
      this.N = true;
      Class<?> clazz = getClass();
      if (clazz != RequestParams.class)
        this.l = clazz.<HttpRequest>getAnnotation(HttpRequest.class); 
    } 
    return this.l;
  }
  
  private void e() {
    a.b(this, getClass(), (a.b)new a(this));
  }
  
  void d() {
    if (!TextUtils.isEmpty(this.q))
      return; 
    if (!TextUtils.isEmpty(this.m) || c() != null) {
      e();
      this.q = this.m;
      HttpRequest httpRequest = c();
      if (httpRequest != null) {
        ParamsBuilder paramsBuilder = httpRequest.builder().newInstance();
        this.p = paramsBuilder;
        this.q = paramsBuilder.buildUri(this, httpRequest);
        this.p.buildParams(this);
        this.p.buildSign(this, httpRequest.signs());
        if (this.s == null)
          this.s = this.p.getSSLSocketFactory(); 
      } else {
        ParamsBuilder paramsBuilder = this.p;
        if (paramsBuilder != null) {
          paramsBuilder.buildParams(this);
          this.p.buildSign(this, this.n);
          if (this.s == null)
            this.s = this.p.getSSLSocketFactory(); 
        } 
      } 
      return;
    } 
    throw new IllegalStateException("uri is empty && @HttpRequest == null");
  }
  
  public String getCacheDirName() {
    return this.x;
  }
  
  public String getCacheKey() {
    if (TextUtils.isEmpty(this.r) && this.p != null) {
      HttpRequest httpRequest = c();
      if (httpRequest != null) {
        this.r = this.p.buildCacheKey(this, httpRequest.cacheKeys());
      } else {
        this.r = this.p.buildCacheKey(this, this.o);
      } 
    } 
    return this.r;
  }
  
  public long getCacheMaxAge() {
    return this.z;
  }
  
  public long getCacheSize() {
    return this.y;
  }
  
  public int getConnectTimeout() {
    return this.C;
  }
  
  public Context getContext() {
    return this.t;
  }
  
  public Executor getExecutor() {
    return this.A;
  }
  
  public HostnameVerifier getHostnameVerifier() {
    return this.v;
  }
  
  public HttpRetryHandler getHttpRetryHandler() {
    return this.K;
  }
  
  public int getLoadingUpdateMaxTimeSpan() {
    return this.J;
  }
  
  public int getMaxRetryCount() {
    return this.G;
  }
  
  public Priority getPriority() {
    return this.B;
  }
  
  public Proxy getProxy() {
    return this.u;
  }
  
  public int getReadTimeout() {
    return this.D;
  }
  
  public RedirectHandler getRedirectHandler() {
    return this.M;
  }
  
  public RequestTracker getRequestTracker() {
    return this.L;
  }
  
  public String getSaveFilePath() {
    return this.H;
  }
  
  public SSLSocketFactory getSslSocketFactory() {
    return this.s;
  }
  
  public String getUri() {
    String str;
    if (TextUtils.isEmpty(this.q)) {
      str = this.m;
    } else {
      str = this.q;
    } 
    return str;
  }
  
  public boolean isAutoRename() {
    return this.F;
  }
  
  public boolean isAutoResume() {
    return this.E;
  }
  
  public boolean isCancelFast() {
    return this.I;
  }
  
  public boolean isUseCookie() {
    return this.w;
  }
  
  public void setAutoRename(boolean paramBoolean) {
    this.F = paramBoolean;
  }
  
  public void setAutoResume(boolean paramBoolean) {
    this.E = paramBoolean;
  }
  
  public void setCacheDirName(String paramString) {
    this.x = paramString;
  }
  
  public void setCacheMaxAge(long paramLong) {
    this.z = paramLong;
  }
  
  public void setCacheSize(long paramLong) {
    this.y = paramLong;
  }
  
  public void setCancelFast(boolean paramBoolean) {
    this.I = paramBoolean;
  }
  
  public void setConnectTimeout(int paramInt) {
    if (paramInt > 0)
      this.C = paramInt; 
  }
  
  public void setContext(Context paramContext) {
    this.t = paramContext;
  }
  
  public void setExecutor(Executor paramExecutor) {
    this.A = paramExecutor;
  }
  
  public void setHostnameVerifier(HostnameVerifier paramHostnameVerifier) {
    this.v = paramHostnameVerifier;
  }
  
  public void setHttpRetryHandler(HttpRetryHandler paramHttpRetryHandler) {
    this.K = paramHttpRetryHandler;
  }
  
  public void setLoadingUpdateMaxTimeSpan(int paramInt) {
    this.J = paramInt;
  }
  
  public void setMaxRetryCount(int paramInt) {
    this.G = paramInt;
  }
  
  public void setPriority(Priority paramPriority) {
    this.B = paramPriority;
  }
  
  public void setProxy(Proxy paramProxy) {
    this.u = paramProxy;
  }
  
  public void setReadTimeout(int paramInt) {
    if (paramInt > 0)
      this.D = paramInt; 
  }
  
  public void setRedirectHandler(RedirectHandler paramRedirectHandler) {
    this.M = paramRedirectHandler;
  }
  
  public void setRequestTracker(RequestTracker paramRequestTracker) {
    this.L = paramRequestTracker;
  }
  
  public void setSaveFilePath(String paramString) {
    this.H = paramString;
  }
  
  public void setSslSocketFactory(SSLSocketFactory paramSSLSocketFactory) {
    this.s = paramSSLSocketFactory;
  }
  
  public void setUri(String paramString) {
    if (TextUtils.isEmpty(this.q)) {
      this.m = paramString;
    } else {
      this.q = paramString;
    } 
  }
  
  public void setUseCookie(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public String toString() {
    String str3;
    String str1 = getUri();
    String str2 = super.toString();
    if (TextUtils.isEmpty(str1)) {
      str3 = str2;
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      str3 = "?";
      if (str1.contains("?"))
        str3 = "&"; 
      stringBuilder.append(str3);
      stringBuilder.append(str2);
      str3 = stringBuilder.toString();
    } 
    return str3;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/http/RequestParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */