package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.cct.internal.a;
import com.google.android.datatransport.cct.internal.j;
import com.google.android.datatransport.cct.internal.k;
import com.google.android.datatransport.cct.internal.l;
import com.google.android.datatransport.h.g;
import com.google.android.datatransport.h.h;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.l;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

final class d implements l {
  private final com.google.firebase.encoders.a a = j.b();
  
  private final ConnectivityManager b;
  
  private final Context c;
  
  final URL d;
  
  private final com.google.android.datatransport.h.y.a e;
  
  private final com.google.android.datatransport.h.y.a f;
  
  private final int g;
  
  d(Context paramContext, com.google.android.datatransport.h.y.a parama1, com.google.android.datatransport.h.y.a parama2) {
    this(paramContext, parama1, parama2, 40000);
  }
  
  d(Context paramContext, com.google.android.datatransport.h.y.a parama1, com.google.android.datatransport.h.y.a parama2, int paramInt) {
    this.c = paramContext;
    this.b = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.d = m(a.a);
    this.e = parama2;
    this.f = parama1;
    this.g = paramInt;
  }
  
  private b d(a parama) {
    com.google.android.datatransport.h.v.a.a("CctTransportBackend", "Making request to: %s", parama.a);
    HttpURLConnection httpURLConnection = (HttpURLConnection)parama.a.openConnection();
    httpURLConnection.setConnectTimeout(30000);
    httpURLConnection.setReadTimeout(this.g);
    httpURLConnection.setDoOutput(true);
    httpURLConnection.setInstanceFollowRedirects(false);
    httpURLConnection.setRequestMethod("POST");
    httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[] { "2.3.3" }));
    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
    httpURLConnection.setRequestProperty("Content-Type", "application/json");
    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
    String str = parama.c;
    if (str != null)
      httpURLConnection.setRequestProperty("X-Goog-Api-Key", str); 
    try {
      OutputStream outputStream = httpURLConnection.getOutputStream();
      try {
        BufferedReader bufferedReader;
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream();
        this(outputStream);
      } finally {
        if (outputStream != null)
          try {
            outputStream.close();
          } finally {} 
      } 
    } catch (ConnectException null) {
    
    } catch (UnknownHostException null) {
    
    } catch (EncodingException encodingException) {
      com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", (Throwable)encodingException);
      return new b(400, null, 0L);
    } catch (IOException iOException) {
      com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", iOException);
      return new b(400, null, 0L);
    } 
    com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", iOException);
    return new b(500, null, 0L);
  }
  
  private static int e(NetworkInfo paramNetworkInfo) {
    if (paramNetworkInfo == null)
      return NetworkConnectionInfo.MobileSubtype.b.getValue(); 
    int i = paramNetworkInfo.getSubtype();
    if (i == -1)
      return NetworkConnectionInfo.MobileSubtype.v.getValue(); 
    if (NetworkConnectionInfo.MobileSubtype.forNumber(i) == null)
      i = 0; 
    return i;
  }
  
  private static int f(NetworkInfo paramNetworkInfo) {
    return (paramNetworkInfo == null) ? NetworkConnectionInfo.NetworkType.t.getValue() : paramNetworkInfo.getType();
  }
  
  private static int g(Context paramContext) {
    try {
      return (paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0)).versionCode;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Unable to find version code for package", (Throwable)nameNotFoundException);
      return -1;
    } 
  }
  
  private j h(f paramf) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (h h : paramf.b()) {
      String str = h.j();
      if (!hashMap.containsKey(str)) {
        ArrayList<h> arrayList1 = new ArrayList();
        arrayList1.add(h);
        hashMap.put(str, arrayList1);
        continue;
      } 
      ((List<h>)hashMap.get(str)).add(h);
    } 
    ArrayList<l> arrayList = new ArrayList();
    for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
      h h = ((List<h>)entry.getValue()).get(0);
      l.a a1 = l.a().f(QosTier.b).g(this.f.a()).h(this.e.a()).b(ClientInfo.a().c(ClientInfo.ClientType.c).b(a.a().m(Integer.valueOf(h.g("sdk-version"))).j(h.b("model")).f(h.b("hardware")).d(h.b("device")).l(h.b("product")).k(h.b("os-uild")).h(h.b("manufacturer")).e(h.b("fingerprint")).c(h.b("country")).g(h.b("locale")).i(h.b("mcc_mnc")).b(h.b("application_build")).a()).a());
      try {
        a1.i(Integer.parseInt((String)entry.getKey()));
      } catch (NumberFormatException numberFormatException) {
        a1.j((String)entry.getKey());
      } 
      ArrayList<k> arrayList1 = new ArrayList();
      for (h h1 : entry.getValue()) {
        k.a a2;
        g g = h1.e();
        com.google.android.datatransport.b b = g.b();
        if (b.equals(com.google.android.datatransport.b.b("proto"))) {
          a2 = k.j(g.a());
        } else if (b.equals(com.google.android.datatransport.b.b("json"))) {
          a2 = k.i(new String(a2.a(), Charset.forName("UTF-8")));
        } else {
          com.google.android.datatransport.h.v.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b);
          continue;
        } 
        a2.c(h1.f()).d(h1.k()).h(h1.h("tz-offset")).e(NetworkConnectionInfo.a().c(NetworkConnectionInfo.NetworkType.forNumber(h1.g("net-type"))).b(NetworkConnectionInfo.MobileSubtype.forNumber(h1.g("mobile-subtype"))).a());
        if (h1.d() != null)
          a2.b(h1.d()); 
        arrayList1.add(a2.a());
      } 
      a1.c(arrayList1);
      arrayList.add(a1.a());
    } 
    return j.a(arrayList);
  }
  
  private static TelephonyManager i(Context paramContext) {
    return (TelephonyManager)paramContext.getSystemService("phone");
  }
  
  static long j() {
    Calendar.getInstance();
    return (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
  }
  
  private static InputStream l(InputStream paramInputStream, String paramString) {
    return "gzip".equals(paramString) ? new GZIPInputStream(paramInputStream) : paramInputStream;
  }
  
  private static URL m(String paramString) {
    try {
      return new URL(paramString);
    } catch (MalformedURLException malformedURLException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid url: ");
      stringBuilder.append(paramString);
      throw new IllegalArgumentException(stringBuilder.toString(), malformedURLException);
    } 
  }
  
  public BackendResponse a(f paramf) {
    j j = h(paramf);
    URL uRL1 = this.d;
    byte[] arrayOfByte = paramf.c();
    String str = null;
    f f1 = null;
    URL uRL2 = uRL1;
    if (arrayOfByte != null)
      try {
        String str1;
        a a1 = a.c(paramf.c());
        paramf = f1;
        if (a1.e() != null)
          str1 = a1.e(); 
        uRL2 = uRL1;
        str = str1;
        if (a1.f() != null) {
          uRL2 = m(a1.f());
          str = str1;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        return BackendResponse.a();
      }  
    try {
      a a1 = new a();
      this(uRL2, j, str);
      b b = (b)com.google.android.datatransport.h.w.b.a(5, a1, b.b(this), c.b());
      int i = b.a;
      return (i == 200) ? BackendResponse.d(b.c) : ((i >= 500 || i == 404) ? BackendResponse.e() : BackendResponse.a());
    } catch (IOException iOException) {
      com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Could not make request to the backend", iOException);
      return BackendResponse.e();
    } 
  }
  
  public h b(h paramh) {
    NetworkInfo networkInfo = this.b.getActiveNetworkInfo();
    return paramh.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", j()).a("net-type", f(networkInfo)).a("mobile-subtype", e(networkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", i(this.c).getSimOperator()).c("application_build", Integer.toString(g(this.c))).d();
  }
  
  static final class a {
    final URL a;
    
    final j b;
    
    final String c;
    
    a(URL param1URL, j param1j, String param1String) {
      this.a = param1URL;
      this.b = param1j;
      this.c = param1String;
    }
    
    a a(URL param1URL) {
      return new a(param1URL, this.b, this.c);
    }
  }
  
  static final class b {
    final int a;
    
    final URL b;
    
    final long c;
    
    b(int param1Int, URL param1URL, long param1Long) {
      this.a = param1Int;
      this.b = param1URL;
      this.c = param1Long;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */