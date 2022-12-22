package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
public final class p0 {
  private BlockingQueue<z0> a = new ArrayBlockingQueue<z0>(100);
  
  private LinkedHashMap<String, String> b = new LinkedHashMap<String, String>();
  
  private Map<String, t0> c = new HashMap<String, t0>();
  
  private String d;
  
  private Context e;
  
  private String f;
  
  private final HashSet<String> g = new HashSet<String>(Arrays.asList(new String[] { "noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged" }));
  
  private AtomicBoolean h;
  
  private File i;
  
  private final void c(Map<String, String> paramMap, c1 paramc1) {
    Uri.Builder builder = Uri.parse(this.d).buildUpon();
    for (Map.Entry<String, String> entry : paramMap.entrySet())
      builder.appendQueryParameter((String)entry.getKey(), (String)entry.getValue()); 
    String str = builder.build().toString();
    if (paramc1 != null) {
      StringBuilder stringBuilder = new StringBuilder(str);
      if (!TextUtils.isEmpty(paramc1.a())) {
        stringBuilder.append("&it=");
        stringBuilder.append(paramc1.a());
      } 
      if (!TextUtils.isEmpty(paramc1.b())) {
        stringBuilder.append("&blat=");
        stringBuilder.append(paramc1.b());
      } 
      str = stringBuilder.toString();
    } 
    if (this.h.get()) {
      File file = this.i;
      if (file != null) {
        c1 c12 = null;
        Map<String, String> map = null;
        paramMap = map;
        try {
          FileOutputStream fileOutputStream = new FileOutputStream();
          paramMap = map;
          this(file, true);
          try {
            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(10);
          } catch (IOException iOException1) {
          
          } finally {
            FileOutputStream fileOutputStream1;
            str = null;
          } 
        } catch (IOException iOException) {
          paramc1 = c12;
        } finally {}
        c1 c11 = paramc1;
        cm.d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", (Throwable)str);
        if (paramc1 != null)
          try {
            paramc1.close();
          } catch (IOException iOException) {
            cm.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException);
          }  
        return;
      } 
      cm.i("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
      return;
    } 
    q.c();
    h1.N(this.e, this.f, str);
  }
  
  final Map<String, String> a(Map<String, String> paramMap1, Map<String, String> paramMap2) {
    paramMap1 = new LinkedHashMap<String, String>(paramMap1);
    if (paramMap2 == null)
      return paramMap1; 
    for (Map.Entry<String, String> entry : paramMap2.entrySet()) {
      String str1 = (String)entry.getKey();
      String str3 = (String)entry.getValue();
      String str2 = paramMap1.get(str1);
      paramMap1.put(str1, e(str1).a(str2, str3));
    } 
    return paramMap1;
  }
  
  public final void b(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap) {
    this.e = paramContext;
    this.f = paramString1;
    this.d = paramString2;
    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
    this.h = atomicBoolean;
    atomicBoolean.set(((Boolean)b2.c.a()).booleanValue());
    if (this.h.get()) {
      File file = Environment.getExternalStorageDirectory();
      if (file != null)
        this.i = new File(file, "sdk_csi_data.txt"); 
    } 
    for (Map.Entry<String, String> entry : paramMap.entrySet())
      this.b.put((String)entry.getKey(), (String)entry.getValue()); 
    fm.a.execute(new s0(this));
    Map<String, t0> map = this.c;
    t0 t0 = t0.b;
    map.put("action", t0);
    this.c.put("ad_format", t0);
    this.c.put("e", t0.c);
  }
  
  public final boolean d(z0 paramz0) {
    return this.a.offer(paramz0);
  }
  
  public final t0 e(String paramString) {
    t0 t0 = this.c.get(paramString);
    return (t0 != null) ? t0 : t0.a;
  }
  
  public final void f(String paramString) {
    if (this.g.contains(paramString))
      return; 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    linkedHashMap.put("sdkVersion", this.f);
    linkedHashMap.put("ue", paramString);
    c(a(this.b, (Map)linkedHashMap), null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */