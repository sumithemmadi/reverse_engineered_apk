package com.allinone.callerid.util;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.main.EZCallApplication;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.builder.PostFormBuilder;
import java.util.HashMap;
import okhttp3.Headers;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

public class t {
  public static void a() {
    (new b(null)).executeOnExecutor(f1.a(), (Object[])new Void[0]);
  }
  
  static class b extends AsyncTask<Void, Void, String> {
    private b() {}
    
    protected String a(Void... param1VarArgs) {
      String str1;
      String str2;
      Void[] arrayOfVoid = null;
      HashMap<Object, Object> hashMap1 = null;
      HashMap<Object, Object> hashMap2 = null;
      param1VarArgs = arrayOfVoid;
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        param1VarArgs = arrayOfVoid;
        this();
        param1VarArgs = arrayOfVoid;
        hashMap.put("device", "android");
        param1VarArgs = arrayOfVoid;
        hashMap.put("uid", i1.T((Context)EZCallApplication.c()));
        param1VarArgs = arrayOfVoid;
        hashMap.put("version", i1.W((Context)EZCallApplication.c()));
        param1VarArgs = arrayOfVoid;
        Response response = ((PostFormBuilder)OkHttpUtils.post().url("https://app.show-caller.com/api/v1/sertim.php")).params(hashMap).build().execute();
        hashMap = hashMap1;
        if (response != null) {
          param1VarArgs = arrayOfVoid;
          hashMap = hashMap1;
          if (response.isSuccessful()) {
            String str;
            param1VarArgs = arrayOfVoid;
            str2 = response.body().string();
            param1VarArgs = arrayOfVoid;
            boolean bool = d0.a;
            if (bool) {
              param1VarArgs = arrayOfVoid;
              StringBuilder stringBuilder = new StringBuilder();
              param1VarArgs = arrayOfVoid;
              this();
              param1VarArgs = arrayOfVoid;
              stringBuilder.append("result:");
              param1VarArgs = arrayOfVoid;
              stringBuilder.append(str2);
              param1VarArgs = arrayOfVoid;
              d0.a("servertime", stringBuilder.toString());
            } 
            hashMap1 = hashMap2;
            if (str2 != null) {
              hashMap1 = hashMap2;
              param1VarArgs = arrayOfVoid;
              if (!"".equals(str2)) {
                param1VarArgs = arrayOfVoid;
                str2 = w.b(str2);
                String str3 = str2;
                if (d0.a) {
                  str3 = str2;
                  StringBuilder stringBuilder = new StringBuilder();
                  str3 = str2;
                  this();
                  str3 = str2;
                  stringBuilder.append("解密后result=");
                  str3 = str2;
                  stringBuilder.append(str2);
                  str3 = str2;
                  d0.a("servertime", stringBuilder.toString());
                } 
                str3 = str2;
                JSONObject jSONObject = new JSONObject();
                str3 = str2;
                this(str2.toString());
                str = str2;
                str3 = str2;
                if (jSONObject.getInt("status") == 1) {
                  str3 = str2;
                  String str4 = jSONObject.getString("timestamp");
                  str3 = str2;
                  if (d0.a) {
                    str3 = str2;
                    StringBuilder stringBuilder = new StringBuilder();
                    str3 = str2;
                    this();
                    str3 = str2;
                    stringBuilder.append("time=");
                    str3 = str2;
                    stringBuilder.append(str4);
                    str3 = str2;
                    d0.a("servertime", stringBuilder.toString());
                  } 
                  str3 = str2;
                  long l = System.currentTimeMillis() / 1000L - Long.parseLong(str4);
                  str3 = str2;
                  b1.H1(l);
                  str = str2;
                  str3 = str2;
                  if (d0.a) {
                    str3 = str2;
                    StringBuilder stringBuilder = new StringBuilder();
                    str3 = str2;
                    this();
                    str3 = str2;
                    stringBuilder.append("midtime=");
                    str3 = str2;
                    stringBuilder.append(String.valueOf(l));
                    str3 = str2;
                    d0.a("servertime", stringBuilder.toString());
                    str = str2;
                  } 
                } 
              } 
            } 
            str1 = str;
            Headers headers = response.headers();
            str2 = str;
            if (headers != null) {
              str1 = str;
              str2 = headers.get("cf-server");
              str1 = str;
              i1.d0((Context)EZCallApplication.c(), str2);
              str2 = str;
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        str2 = str1;
      } 
      return str2;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if (param1String != null && !"".equals(param1String))
        try {
          JSONObject jSONObject = new JSONObject();
          this(param1String);
          if (jSONObject.getInt("status") == 1) {
            com.allinone.callerid.i.a.n.a.a();
            s.a();
          } 
        } catch (JSONException jSONException) {
          jSONException.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */