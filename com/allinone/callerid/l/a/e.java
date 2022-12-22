package com.allinone.callerid.l.a;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import c.d.a.i;
import c.d.a.q;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.phone.libphone.k;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONObject;

public class e extends AsyncTask<String, Void, String> {
  private String a;
  
  private d b;
  
  private i c;
  
  public e(d paramd) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(k.a);
    stringBuilder.append("/office.zip");
    this.a = stringBuilder.toString();
    this.c = new a(this);
    this.b = paramd;
  }
  
  private static File d(String paramString1, String paramString2) {
    String str = paramString2.replace("\\", "/");
    String[] arrayOfString = str.split("/");
    File file = new File(paramString1);
    if (arrayOfString.length > 1) {
      for (byte b = 0; b < arrayOfString.length - 1; b++)
        file = new File(file, arrayOfString[b]); 
      if (!file.exists())
        file.mkdirs(); 
      return new File(file, arrayOfString[arrayOfString.length - 1]);
    } 
    return new File(file, str);
  }
  
  protected String c(String... paramVarArgs) {
    try {
      long l = b1.x2();
      if (l != 0L && System.currentTimeMillis() - l <= 2592000000L)
        return null; 
      q.b().c("request_offline_parser_new");
      g0.B((Context)EZCallApplication.c());
      String str2 = p.d((Context)EZCallApplication.c()).getIso_code();
      String str3 = p.d((Context)EZCallApplication.c()).getCountry_code();
      String str1 = str2;
      if (str2.contains("/"))
        str1 = str2.substring(0, str2.indexOf("/")); 
      String str4 = i1.T((Context)EZCallApplication.c());
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("app_version", i1.W((Context)EZCallApplication.c()));
      hashMap.put("uid", str4);
      hashMap.put("country", str1);
      hashMap.put("cc", str3);
      hashMap.put("language", Locale.getDefault().getLanguage());
      hashMap.put("last_update_time", String.valueOf(l));
      hashMap.put("stamp", i1.Q((Context)EZCallApplication.c(), str4));
      boolean bool = d0.a;
      if (bool) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("params: ");
        stringBuilder.append(hashMap.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      str1 = com.allinone.callerid.j.a.b("https://app.show-caller.com/proc/v1/parcheupd.php", hashMap);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("result=");
        stringBuilder.append(str1);
        d0.a("wbb", stringBuilder.toString());
      } 
      if (str1 != null) {
        JSONObject jSONObject = new JSONObject();
        this(str1);
        str1 = jSONObject.getString("data_url");
        if (!"".equals(str1) && str1 != null)
          return str1; 
        if (l != 0L)
          b1.Q2(); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return "";
  }
  
  protected void e(String paramString) {
    super.onPostExecute(paramString);
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onPostExecute: ");
      stringBuilder.append(paramString);
      d0.a("wbb", stringBuilder.toString());
    } 
    if (paramString != null && !paramString.equals("")) {
      if (com.allinone.callerid.util.e.d((Context)EZCallApplication.c())) {
        q.b().c("download_offline_parser_new");
        g0.o((Context)EZCallApplication.c());
        f(paramString);
      } else {
        d d1 = this.b;
        if (d1 != null)
          d1.b(); 
      } 
    } else {
      d d1 = this.b;
      if (d1 != null)
        d1.b(); 
    } 
  }
  
  public void f(String paramString) {
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("开始下载离线解析库: ");
      stringBuilder.append(paramString);
      d0.a("wbb", stringBuilder.toString());
    } 
    try {
      q.d().c(paramString).h(this.a).P(this.c).F(8).N(1000).I(1000).start();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void g(String paramString1, String paramString2) {
    ZipFile zipFile = new ZipFile(paramString1);
    Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
    byte[] arrayOfByte = new byte[1024];
    while (enumeration.hasMoreElements()) {
      String str;
      ZipEntry zipEntry = enumeration.nextElement();
      if (zipEntry.isDirectory()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramString2);
        stringBuilder.append(zipEntry.getName());
        str = stringBuilder.toString();
        str.trim();
        (new File(str)).mkdir();
        continue;
      } 
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d(paramString2, str.getName())));
      BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream((ZipEntry)str));
      while (true) {
        int j = bufferedInputStream.read(arrayOfByte, 0, 1024);
        if (j != -1) {
          bufferedOutputStream.write(arrayOfByte, 0, j);
          continue;
        } 
        bufferedInputStream.close();
        bufferedOutputStream.close();
      } 
    } 
    zipFile.close();
    Thread.sleep(2000L);
    try {
      File file = new File();
      this(paramString1);
      if (file.exists())
        file.delete(); 
      q.b().c("download_offline_parser_ok_new");
      g0.p((Context)EZCallApplication.c());
      b1.Q2();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    (new Handler(Looper.getMainLooper())).post(new b(this));
  }
  
  class a extends i {
    a(e this$0) {}
    
    protected void b(c.d.a.a param1a) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("下载完成：开始解压数据： ");
        stringBuilder.append(Thread.currentThread().getName());
        d0.a("wbb", stringBuilder.toString());
      } 
      (new Thread(new b(this))).start();
    }
    
    protected void d(c.d.a.a param1a, Throwable param1Throwable) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("下载失败：失败原因：");
        stringBuilder.append(param1Throwable.getMessage());
        stringBuilder.append(" : ");
        stringBuilder.append(Thread.currentThread().getName());
        d0.a("wbb", stringBuilder.toString());
      } 
      if ("Requested Range Not Satisfiable".equals(param1Throwable.getMessage()))
        (new Thread(new a(this))).start(); 
      if (e.a(this.a) != null)
        e.a(this.a).b(); 
    }
    
    protected void f(c.d.a.a param1a, int param1Int1, int param1Int2) {}
    
    protected void g(c.d.a.a param1a, int param1Int1, int param1Int2) {}
    
    protected void h(c.d.a.a param1a, int param1Int1, int param1Int2) {
      float f = param1a.v() / param1a.f();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("下载进度： ");
        stringBuilder.append(param1Int2);
        stringBuilder.append("/");
        stringBuilder.append(param1Int1);
        stringBuilder.append("/   进度：");
        stringBuilder.append((int)(f * 100.0F));
        stringBuilder.append("%");
        d0.a("wbb", stringBuilder.toString());
      } 
    }
    
    protected void k(c.d.a.a param1a) {}
  }
  
  class b implements Runnable {
    b(e this$0) {}
    
    public void run() {
      if (e.a(this.b) != null) {
        e.a(this.b).b();
        e.a(this.b).a();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/l/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */