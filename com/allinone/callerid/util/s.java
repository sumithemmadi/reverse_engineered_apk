package com.allinone.callerid.util;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.main.EZCallApplication;
import java.util.HashMap;
import org.json.JSONObject;

public class s {
  static void a() {
    (new a()).executeOnExecutor(f1.a(), new Object[0]);
  }
  
  static class a extends AsyncTask<Object, Void, Object> {
    protected String a(Object[] param1ArrayOfObject) {
      String str1;
      String str2;
      Object[] arrayOfObject = null;
      param1ArrayOfObject = arrayOfObject;
      try {
        EZCallApplication eZCallApplication = EZCallApplication.c();
        param1ArrayOfObject = arrayOfObject;
        String str5 = i1.N();
        param1ArrayOfObject = arrayOfObject;
        str2 = i1.T((Context)eZCallApplication);
        param1ArrayOfObject = arrayOfObject;
        String str6 = i1.W((Context)eZCallApplication);
        param1ArrayOfObject = arrayOfObject;
        String str7 = i1.R();
        param1ArrayOfObject = arrayOfObject;
        String str8 = i1.G();
        param1ArrayOfObject = arrayOfObject;
        String str9 = p.d((Context)eZCallApplication).getCountry_code();
        param1ArrayOfObject = arrayOfObject;
        String str4 = i1.Q((Context)eZCallApplication, str2);
        param1ArrayOfObject = arrayOfObject;
        StringBuilder stringBuilder = new StringBuilder();
        param1ArrayOfObject = arrayOfObject;
        this();
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("所有参数：\nplatform:");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("android");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("\n");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("device:");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append(str5);
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("\n");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("app_version:");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append(str6);
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("\n");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("uid:");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append(str2);
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("\n");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("os_version:");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append(str7);
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("\n");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("language:");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append(str8);
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("\n");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("default_cc:");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append(str9);
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("\n");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("stamp:");
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append(str4);
        param1ArrayOfObject = arrayOfObject;
        stringBuilder.append("\n");
        param1ArrayOfObject = arrayOfObject;
        d0.a("config", stringBuilder.toString());
        param1ArrayOfObject = arrayOfObject;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        param1ArrayOfObject = arrayOfObject;
        this();
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("platform", "android");
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("device", str5);
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("uid", str2);
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("app_version", str6);
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("os_version", str7);
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("language", str8);
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("default_cc", str9);
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("stamp", str4);
        param1ArrayOfObject = arrayOfObject;
        String str3 = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/gcon.php", hashMap);
        str2 = str3;
        if (str3 != null) {
          str1 = str3;
          boolean bool = "".equals(str3);
          str2 = str3;
          if (!bool)
            try {
              JSONObject jSONObject = new JSONObject();
              this(str3);
              str2 = str3;
              if (jSONObject.getInt("status") == 1) {
                jSONObject.getInt("contact");
                if (jSONObject.getInt("wiki_log") == 1) {
                  b1.I0(true);
                  str2 = str3;
                } else {
                  b1.I0(false);
                  str2 = str3;
                } 
              } 
            } catch (Exception exception) {
              str1 = str3;
              exception.printStackTrace();
              str1 = str3;
              str2 = str3;
              if (d0.a) {
                str1 = str3;
                StringBuilder stringBuilder1 = new StringBuilder();
                str1 = str3;
                this();
                str1 = str3;
                stringBuilder1.append("Exception:");
                str1 = str3;
                stringBuilder1.append(exception.getMessage());
                str1 = str3;
                d0.a("config", stringBuilder1.toString());
                String str = str3;
              } 
            }  
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        str2 = str1;
      } 
      return str2;
    }
    
    protected void onPostExecute(Object param1Object) {
      super.onPostExecute(param1Object);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("result=");
      stringBuilder.append(param1Object);
      d0.a("config", stringBuilder.toString());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */