package com.allinone.callerid.k;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c.d.a.i;
import c.d.a.q;
import com.allinone.callerid.bean.ParserIpBean;
import com.allinone.callerid.l.a.d;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.e;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.hzy.lib7z.ExtractCallback;
import com.hzy.lib7z.Z7Extractor;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

public class c extends AsyncTask<String, Void, String> {
  private String a;
  
  private String b;
  
  private d c;
  
  private boolean d;
  
  private Context e;
  
  private int f;
  
  private String g;
  
  private i h;
  
  public c(Context paramContext, boolean paramBoolean, d paramd) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(EZCallApplication.c().getExternalFilesDir(""));
    stringBuilder.append("/offlinedata.7z");
    this.a = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append("data/data/");
    stringBuilder.append(i1.M((Context)EZCallApplication.c()));
    stringBuilder.append("/databases");
    this.b = stringBuilder.toString();
    this.f = 0;
    this.g = "";
    this.h = new a(this);
    this.c = paramd;
    this.d = paramBoolean;
    this.e = paramContext.getApplicationContext();
  }
  
  private void i(String paramString) {
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("开始下载离线库: ");
      stringBuilder.append(paramString);
      d0.a("checkupdate", stringBuilder.toString());
    } 
    try {
      q.d().c(paramString).h(this.a).P(this.h).F(8).N(1000).I(1000).start();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void j(String paramString1, String paramString2) {
    q.b().c("un_7zip");
    Z7Extractor.extractFile(paramString1, paramString2, new b(this));
  }
  
  protected String g(String... paramVarArgs) {
    try {
      String str1;
      String str2 = p.d(this.e).getIso_code().split("/")[0].toLowerCase();
      String str3 = p.d(this.e).getCountry_code();
      String str4 = i1.T(this.e);
      String str5 = "0";
      ParserIpBean parserIpBean = com.allinone.callerid.i.a.n.c.a().b();
      if (parserIpBean != null) {
        str1 = str2;
        if (parserIpBean.getCountry() != null) {
          str1 = str2;
          if (!"".equals(parserIpBean.getCountry()))
            str1 = parserIpBean.getCountry(); 
        } 
        if (parserIpBean.getState() != null && !"".equals(parserIpBean.getState())) {
          str6 = parserIpBean.getState();
        } else {
          str6 = "";
        } 
        if (parserIpBean.getCity() != null && !"".equals(parserIpBean.getCity())) {
          String str = parserIpBean.getCity();
          str2 = str1;
          str1 = str;
        } else {
          String str = "";
          str2 = str1;
          str1 = str;
        } 
      } else {
        str1 = "";
        str6 = str1;
      } 
      if (b1.r())
        str5 = "1"; 
      g0.A((Context)EZCallApplication.c());
      q.b().d("request_offline_db_new");
      if (b1.W() == 0L) {
        q.b().c("request_offline_db_first_new");
        q.b().d("request_offline_db_first_new");
      } 
      g0.z((Context)EZCallApplication.c());
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("last_update_time", String.valueOf(b1.W() / 1000L));
      hashMap.put("cc", str3);
      hashMap.put("platform", "android");
      hashMap.put("package", i1.M(this.e));
      hashMap.put("app_version", i1.W(this.e));
      hashMap.put("uid", str4);
      hashMap.put("stamp", i1.Q(this.e, str4));
      hashMap.put("country", str2);
      hashMap.put("state", str6);
      hashMap.put("city", str1);
      hashMap.put("is_need_full", str5);
      boolean bool = d0.a;
      if (bool) {
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append("params: ");
        stringBuilder1.append(hashMap.toString());
        d0.a("checkupdate", stringBuilder1.toString());
      } 
      String str6 = com.allinone.callerid.j.a.b("https://app.show-caller.com/proc/v1/offpaccheupd.php", hashMap);
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("result=");
      stringBuilder.append(str6);
      d0.a("checkupdate", stringBuilder.toString());
      if (str6 != null && !"".equals(str6)) {
        b1.M1(System.currentTimeMillis() + 43200000L);
        JSONObject jSONObject = new JSONObject();
        this(str6);
        if (jSONObject.getInt("status") == 1) {
          str6 = jSONObject.getString("data_url");
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("dataurl=");
          stringBuilder1.append(str6);
          d0.a("checkupdate", stringBuilder1.toString());
          String str = jSONObject.getString("filesize");
          if (str != null && !"".equals(str))
            this.f = Integer.valueOf(str).intValue(); 
          if (jSONObject.getInt("is_need_full") == 1) {
            b1.V0(true);
          } else {
            b1.V0(false);
          } 
          if (str6 != null) {
            bool = "".equals(str6);
            if (!bool)
              return str6; 
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception: ");
        stringBuilder.append(exception.getMessage());
        d0.a("wbb", stringBuilder.toString());
      } 
    } 
    return "";
  }
  
  protected void h(String paramString) {
    super.onPostExecute(paramString);
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onPostExecute: ");
      stringBuilder.append(paramString);
      d0.a("checkupdate", stringBuilder.toString());
    } 
    if (paramString != null && !paramString.equals("")) {
      d d1;
      if (this.d) {
        if (e.d(this.e)) {
          g0.l(this.e);
          q.b().d("download_offline_db_new");
          g0.k(this.e);
          i(paramString);
          if (b1.W() == 0L)
            q.b().d("download_offline_db_first_new"); 
        } else if (e.c(this.e)) {
          if (b1.W() == 0L) {
            g0.l(this.e);
            q.b().d("download_offline_db_new");
            g0.k(this.e);
            i(paramString);
            if (b1.W() == 0L)
              q.b().d("download_offline_db_first_new"); 
          } else {
            int j = this.f;
            if (j != 0)
              if (j < 1048576) {
                g0.l(this.e);
                q.b().d("download_offline_db_new");
                g0.k(this.e);
                i(paramString);
                if (b1.W() == 0L)
                  q.b().d("download_offline_db_first_new"); 
              } else {
                d1 = this.c;
                if (d1 != null)
                  d1.b(); 
              }  
          } 
        } 
      } else {
        g0.l(this.e);
        q.b().d("download_offline_db_new");
        g0.k(this.e);
        i((String)d1);
      } 
    } else {
      d d1 = this.c;
      if (d1 != null)
        d1.b(); 
    } 
  }
  
  class a extends i {
    a(c this$0) {}
    
    protected void b(c.d.a.a param1a) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("下载完成：开始解压数据： ");
        stringBuilder.append(Thread.currentThread().getName());
        d0.a("checkupdate", stringBuilder.toString());
      } 
      q.b().c("download_offline_db_complete");
      (new Thread(new b(this))).start();
    }
    
    protected void d(c.d.a.a param1a, Throwable param1Throwable) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("下载失败：失败原因：");
        stringBuilder.append(param1Throwable.getMessage());
        stringBuilder.append(" : ");
        stringBuilder.append(Thread.currentThread().getName());
        d0.a("checkupdate", stringBuilder.toString());
      } 
      if ("Requested Range Not Satisfiable".equals(param1Throwable.getMessage()))
        (new Thread(new a(this))).start(); 
      b1.M1(0L);
      if (c.a(this.a) != null)
        c.a(this.a).b(); 
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
        d0.a("checkupdate", stringBuilder.toString());
      } 
    }
    
    protected void k(c.d.a.a param1a) {}
  }
  
  class b extends ExtractCallback {
    b(c this$0) {}
    
    public void onError(int param1Int, String param1String) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("解压失败： ");
        stringBuilder.append(param1String);
        Log.e("checkupdate", stringBuilder.toString());
      } 
      q.b().c("un_7zip_filed");
      (new File(c.b(this.a))).delete();
      if (c.a(this.a) != null)
        c.a(this.a).b(); 
    }
    
    public void onProgress(String param1String, long param1Long) {
      c.f(this.a, param1String);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("解压中... ");
        stringBuilder.append(param1Long);
        Log.e("checkupdate", stringBuilder.toString());
      } 
    }
    
    public void onSucceed() {
      super.onSucceed();
      if (d0.a)
        Log.e("checkupdate", "解压完成... "); 
      try {
        File file1 = new File();
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(c.c(this.a));
        stringBuilder1.append("/");
        stringBuilder1.append(c.e(this.a));
        this(stringBuilder1.toString());
        File file2 = new File();
        StringBuilder stringBuilder2 = new StringBuilder();
        this();
        stringBuilder2.append(c.c(this.a));
        stringBuilder2.append("/offlinedata.sqlite");
        this(stringBuilder2.toString());
        file1.renameTo(file2);
        Thread.sleep(1000L);
        file1 = new File();
        this(c.b(this.a));
        if (file1.exists())
          file1.delete(); 
        if (i1.k0()) {
          d0.a("checkupdate", "保存成功");
          g0.m((Context)EZCallApplication.c());
          q.b().d("download_offline_db_ok_new");
          g0.q((Context)EZCallApplication.c());
          if (b1.W() == 0L) {
            g0.n((Context)EZCallApplication.c());
            q.b().d("download_offline_db_ok_first_new");
          } 
          d0.a("checkupdate", "保存成功");
          b1.B1(System.currentTimeMillis());
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      (new Handler(Looper.getMainLooper())).post(new a(this));
    }
    
    class a implements Runnable {
      a(c.b this$0) {}
      
      public void run() {
        if (c.a(this.b.a) != null) {
          c.a(this.b.a).b();
          c.a(this.b.a).a();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(c this$0) {}
    
    public void run() {
      if (c.a(this.b.a) != null) {
        c.a(this.b.a).b();
        c.a(this.b.a).a();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */