package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class wl {
  private static Object a = new Object();
  
  private static boolean b = false;
  
  private static boolean c = false;
  
  private static e d = h.d();
  
  private static final Set<String> e = new HashSet<String>(Arrays.asList(new String[0]));
  
  private final List<String> f;
  
  public wl() {
    this(null);
  }
  
  public wl(String paramString) {
    List<String> list;
    if (!a()) {
      list = new ArrayList();
    } else {
      paramString = String.valueOf(UUID.randomUUID().toString());
      if (paramString.length() != 0) {
        paramString = "network_request_".concat(paramString);
      } else {
        paramString = new String("network_request_");
      } 
      list = Arrays.asList(new String[] { paramString });
    } 
    this.f = list;
  }
  
  public static boolean a() {
    synchronized (a) {
      boolean bool;
      if (b && c) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  private static void c(JsonWriter paramJsonWriter, Map<String, ?> paramMap) {
    if (paramMap == null)
      return; 
    paramJsonWriter.name("headers").beginArray();
    for (Map.Entry<String, ?> entry : paramMap.entrySet()) {
      String str = (String)entry.getKey();
      if (!e.contains(str)) {
        if (entry.getValue() instanceof List) {
          for (String str1 : entry.getValue()) {
            paramJsonWriter.beginObject();
            paramJsonWriter.name("name").value(str);
            paramJsonWriter.name("value").value(str1);
            paramJsonWriter.endObject();
          } 
          continue;
        } 
        if (entry.getValue() instanceof String) {
          paramJsonWriter.beginObject();
          paramJsonWriter.name("name").value(str);
          paramJsonWriter.name("value").value((String)entry.getValue());
          paramJsonWriter.endObject();
          continue;
        } 
        cm.g("Connection headers should be either Map<String, String> or Map<String, List<String>>");
        break;
      } 
    } 
    paramJsonWriter.endArray();
  }
  
  private final void e(String paramString, zl paramzl) {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    try {
      jsonWriter.beginObject();
      jsonWriter.name("timestamp").value(d.a());
      jsonWriter.name("event").value(paramString);
      jsonWriter.name("components").beginArray();
      Iterator<String> iterator = this.f.iterator();
      while (iterator.hasNext())
        jsonWriter.value(iterator.next()); 
      jsonWriter.endArray();
      paramzl.a(jsonWriter);
      jsonWriter.endObject();
      jsonWriter.flush();
      jsonWriter.close();
    } catch (IOException iOException) {
      cm.c("unable to log", iOException);
    } 
    s(stringWriter.toString());
  }
  
  public static boolean l() {
    synchronized (a) {
      return b;
    } 
  }
  
  public static void m(boolean paramBoolean) {
    synchronized (a) {
      b = true;
      c = paramBoolean;
      return;
    } 
  }
  
  private final void n(String paramString1, String paramString2, Map<String, ?> paramMap, byte[] paramArrayOfbyte) {
    e("onNetworkRequest", new vl(paramString1, paramString2, paramMap, paramArrayOfbyte));
  }
  
  private final void o(Map<String, ?> paramMap, int paramInt) {
    e("onNetworkResponse", new yl(paramInt, paramMap));
  }
  
  public static boolean p(Context paramContext) {
    if (Build.VERSION.SDK_INT < 17)
      return false; 
    if (!((Boolean)e2.a.a()).booleanValue())
      return false; 
    try {
      int i = Settings.Global.getInt(paramContext.getContentResolver(), "development_settings_enabled", 0);
      return (i != 0);
    } catch (Exception exception) {
      cm.d("Fail to determine debug setting.", exception);
      return false;
    } 
  }
  
  private final void r(String paramString) {
    e("onNetworkRequestError", new am(paramString));
  }
  
  private static void s(String paramString) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/wl
    //   2: monitorenter
    //   3: ldc_w 'GMA Debug BEGIN'
    //   6: invokestatic h : (Ljava/lang/String;)V
    //   9: iconst_0
    //   10: istore_1
    //   11: iload_1
    //   12: aload_0
    //   13: invokevirtual length : ()I
    //   16: if_icmpge -> 80
    //   19: iload_1
    //   20: sipush #4000
    //   23: iadd
    //   24: istore_2
    //   25: aload_0
    //   26: iload_1
    //   27: iload_2
    //   28: aload_0
    //   29: invokevirtual length : ()I
    //   32: invokestatic min : (II)I
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   41: astore_3
    //   42: aload_3
    //   43: invokevirtual length : ()I
    //   46: ifeq -> 60
    //   49: ldc_w 'GMA Debug CONTENT '
    //   52: aload_3
    //   53: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   56: astore_3
    //   57: goto -> 71
    //   60: new java/lang/String
    //   63: dup
    //   64: ldc_w 'GMA Debug CONTENT '
    //   67: invokespecial <init> : (Ljava/lang/String;)V
    //   70: astore_3
    //   71: aload_3
    //   72: invokestatic h : (Ljava/lang/String;)V
    //   75: iload_2
    //   76: istore_1
    //   77: goto -> 11
    //   80: ldc_w 'GMA Debug FINISH'
    //   83: invokestatic h : (Ljava/lang/String;)V
    //   86: ldc com/google/android/gms/internal/ads/wl
    //   88: monitorexit
    //   89: return
    //   90: astore_0
    //   91: ldc com/google/android/gms/internal/ads/wl
    //   93: monitorexit
    //   94: goto -> 99
    //   97: aload_0
    //   98: athrow
    //   99: goto -> 97
    // Exception table:
    //   from	to	target	type
    //   3	9	90	finally
    //   11	19	90	finally
    //   25	57	90	finally
    //   60	71	90	finally
    //   71	75	90	finally
    //   80	86	90	finally
  }
  
  public static void u() {
    synchronized (a) {
      b = false;
      c = false;
      cm.i("Ad debug logging enablement is out of date.");
      return;
    } 
  }
  
  public final void f(String paramString1, String paramString2, Map<String, ?> paramMap, byte[] paramArrayOfbyte) {
    if (!a())
      return; 
    n(paramString1, paramString2, paramMap, paramArrayOfbyte);
  }
  
  public final void h(HttpURLConnection paramHttpURLConnection, int paramInt) {
    if (!a())
      return; 
    Map<String, List<String>> map = paramHttpURLConnection.getHeaderFields();
    String str = null;
    if (map == null) {
      map = null;
    } else {
      map = new HashMap<String, List<String>>(paramHttpURLConnection.getHeaderFields());
    } 
    o(map, paramInt);
    if (paramInt < 200 || paramInt >= 300) {
      String str1;
      try {
        str1 = paramHttpURLConnection.getResponseMessage();
      } catch (IOException iOException) {
        str1 = String.valueOf(iOException.getMessage());
        if (str1.length() != 0) {
          str1 = "Can not get error message from error HttpURLConnection\n".concat(str1);
        } else {
          str1 = new String("Can not get error message from error HttpURLConnection\n");
        } 
        cm.i(str1);
        str1 = str;
      } 
      r(str1);
    } 
  }
  
  public final void i(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfbyte) {
    HashMap<String, List<String>> hashMap;
    if (!a())
      return; 
    if (paramHttpURLConnection.getRequestProperties() == null) {
      hashMap = null;
    } else {
      hashMap = new HashMap<String, List<String>>(paramHttpURLConnection.getRequestProperties());
    } 
    n(new String(paramHttpURLConnection.getURL().toString()), new String(paramHttpURLConnection.getRequestMethod()), hashMap, paramArrayOfbyte);
  }
  
  public final void j(Map<String, ?> paramMap, int paramInt) {
    if (!a())
      return; 
    o(paramMap, paramInt);
    if (paramInt < 200 || paramInt >= 300)
      r(null); 
  }
  
  public final void q(String paramString) {
    if (!a())
      return; 
    if (paramString == null)
      return; 
    t(paramString.getBytes());
  }
  
  public final void t(byte[] paramArrayOfbyte) {
    e("onNetworkResponseBody", new xl(paramArrayOfbyte));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */