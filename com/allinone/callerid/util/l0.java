package com.allinone.callerid.util;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.d.f.f;
import com.allinone.callerid.main.EZCallApplication;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class l0 {
  public static String a() {
    return f0.e("ntapp", "mr_ntapp", "com.colorflash.callerscreen");
  }
  
  public static String b() {
    return f0.e("ntapp", "nt_description", "");
  }
  
  public static String c() {
    return f0.e("ntapp", "head_line", "");
  }
  
  public static String d() {
    return f0.e("ntapp", "nt_image", "");
  }
  
  public static String e() {
    return f0.e("ntapp", "nt_thumb", "");
  }
  
  private static long f() {
    return f0.c("ntapp", "search_ntapp_time", 0L);
  }
  
  public static void g() {
    if (System.currentTimeMillis() - f() > 43200000L && i1.r0((Context)EZCallApplication.c()))
      (new b(null)).executeOnExecutor(f1.a(), (Object[])new String[0]); 
  }
  
  private static void h(String paramString) {
    f0.i("ntapp", "mr_ntapp", paramString);
  }
  
  private static void i(String paramString) {
    f0.i("ntapp", "nt_description", paramString);
  }
  
  private static void j(String paramString) {
    f0.i("ntapp", "head_line", paramString);
  }
  
  private static void k(String paramString) {
    f0.i("ntapp", "nt_image", paramString);
  }
  
  private static void l(String paramString) {
    f0.i("ntapp", "nt_thumb", paramString);
  }
  
  private static void m(long paramLong) {
    f0.h("ntapp", "search_ntapp_time", paramLong);
  }
  
  public static boolean u() {
    return f0.a("ntapp", "isOpenAd", false);
  }
  
  private static void v(boolean paramBoolean) {
    f0.f("ntapp", "isOpenAd", paramBoolean);
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private b() {}
    
    protected String a(String... param1VarArgs) {
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        hashMap.put("id", i1.M((Context)EZCallApplication.c()));
        hashMap.put("version", i1.W((Context)EZCallApplication.c()));
        hashMap.put("is_android", "1");
        String str = com.allinone.callerid.j.a.a("https://info.show-caller.com/gonglue_xilie/ping.php", hashMap);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("content:");
          stringBuilder.append(str);
          d0.a("neitui", stringBuilder.toString());
        } 
        JSONObject jSONObject = new JSONObject();
        this(str);
        if ("iad".equals(jSONObject.getString("ad_banner"))) {
          f.u(false);
        } else {
          f.u(true);
        } 
        JSONArray jSONArray = jSONObject.optJSONArray("neitui_list");
        if (jSONArray != null && jSONArray.length() > 0) {
          l0.n(true);
          JSONObject jSONObject1 = jSONArray.getJSONObject(0);
          String str1 = jSONObject1.optString("url_scheme");
          if (str1 != null && !"".equals(str1)) {
            if (!str1.equals(l0.a())) {
              b1.D2(Boolean.TRUE);
              b1.R0(0);
              b1.Z1(0L);
              b1.U1(true);
            } 
            l0.o(str1);
          } 
          if (jSONObject1.has("headline")) {
            str1 = jSONObject1.optString("headline");
            if (str1 != null && !"".equals(str1))
              l0.p(str1); 
          } 
          if (jSONObject1.has("description")) {
            str1 = jSONObject1.optString("description");
            if (str1 != null && !"".equals(str1))
              l0.q(str1); 
          } 
          if (jSONObject1.has("thumb_url")) {
            str1 = jSONObject1.optString("thumb_url");
            if (str1 != null && !"".equals(str1))
              l0.r(str1); 
          } 
          if (jSONObject1.has("img_url")) {
            String str2 = jSONObject1.optString("img_url");
            if (str2 != null && !"".equals(str2))
              l0.s(str2); 
          } 
        } else {
          l0.n(false);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      l0.t(System.currentTimeMillis());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */