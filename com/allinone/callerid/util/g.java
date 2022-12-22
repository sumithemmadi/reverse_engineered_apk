package com.allinone.callerid.util;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import java.util.HashMap;
import org.json.JSONObject;

public class g extends AsyncTask<Object, Void, String> {
  String a;
  
  Context b;
  
  public g(Context paramContext, String paramString) {
    this.a = paramString;
    this.b = paramContext;
  }
  
  protected String a(Object[] paramArrayOfObject) {
    String str1;
    String str2 = "";
    try {
      String str3 = i1.T((Context)EZCallApplication.c());
      String str4 = i1.W((Context)EZCallApplication.c());
      String str5 = p.d((Context)EZCallApplication.c()).getCountry_code();
      String str6 = i1.Q((Context)EZCallApplication.c(), this.a);
      String str7 = this.a;
      str1 = str2;
      if (str7 != null) {
        str1 = str2;
        if (!"".equals(str7)) {
          str1 = str2;
          if (str3 != null) {
            str1 = str2;
            if (!"".equals(str3)) {
              str1 = str2;
              if (str4 != null) {
                str1 = str2;
                if (!"".equals(str4)) {
                  str1 = str2;
                  if (str5 != null) {
                    str1 = str2;
                    if (!"".equals(str5)) {
                      str1 = str2;
                      if (str6 != null) {
                        str1 = str2;
                        if (!"".equals(str6)) {
                          if (d0.a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            this();
                            stringBuilder.append("所有参数：number:");
                            stringBuilder.append(this.a);
                            stringBuilder.append("\n");
                            stringBuilder.append("device:");
                            stringBuilder.append("android");
                            stringBuilder.append("\n");
                            stringBuilder.append("uid:");
                            stringBuilder.append(str3);
                            stringBuilder.append("\n");
                            stringBuilder.append("version:");
                            stringBuilder.append(str4);
                            stringBuilder.append("\n");
                            stringBuilder.append("default_cc:");
                            stringBuilder.append(str5);
                            stringBuilder.append("\n");
                            stringBuilder.append("stamp:");
                            stringBuilder.append(str6);
                            stringBuilder.append("\n");
                            d0.a("searchCopy", stringBuilder.toString());
                          } 
                          HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                          this();
                          hashMap.put("tel_number", this.a);
                          hashMap.put("device", "android");
                          hashMap.put("uid", str3);
                          hashMap.put("version", str4);
                          hashMap.put("default_cc", str5);
                          hashMap.put("cc", str5);
                          hashMap.put("stamp", str6);
                          hashMap.put("cid", "");
                          hashMap.put("is_contacts", "");
                          String str = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/sea.php", hashMap);
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      str1 = str2;
    } 
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("resultJson:");
      stringBuilder.append(str1);
      d0.a("searchCopy", stringBuilder.toString());
    } 
    return str1;
  }
  
  protected void b(String paramString) {
    super.onPostExecute(paramString);
    if (paramString != null && !"".equals(paramString)) {
      CallLogBean callLogBean = new CallLogBean();
      callLogBean.D0(this.a);
      try {
        JSONObject jSONObject = new JSONObject();
        this(paramString);
        if (jSONObject.getInt("status") == 1) {
          y0.b(jSONObject, this.a, false);
          paramString = jSONObject.getString("type_label");
          callLogBean.d1(i1.D((Context)EZCallApplication.c(), paramString));
          callLogBean.e1(paramString);
          paramString = jSONObject.getString("name");
          if (paramString != null && !"".equals(paramString)) {
            callLogBean.B0(paramString);
            callLogBean.L0(paramString);
          } else {
            callLogBean.B0("");
            callLogBean.L0("");
          } 
          callLogBean.K0(jSONObject.getString("report_count"));
          paramString = jSONObject.getString("old_tel_number");
          if (paramString != null && !"".equals(paramString))
            callLogBean.F0(paramString); 
          paramString = jSONObject.getString("format_tel_number");
          if (paramString != null && !paramString.equals(""))
            callLogBean.w0(paramString); 
          paramString = jSONObject.getString("avatar");
          if (paramString != null && !"".equals(paramString))
            callLogBean.b0(paramString); 
          callLogBean.G0(jSONObject.getString("operator"));
          callLogBean.N0(jSONObject.getString("type"));
          callLogBean.a0(jSONObject.getString("address"));
          paramString = jSONObject.getString("belong_area");
          if (paramString != null && !"".equals(paramString)) {
            callLogBean.e0(paramString);
          } else {
            callLogBean.e0("");
          } 
          int i = jSONObject.getInt("faild_error_log");
          if (i != 0 && i == 1)
            try {
              com.allinone.callerid.h.a.o().u(this.b, callLogBean);
              Handler handler = new Handler();
              this();
              a a = new a();
              this(this);
              handler.postDelayed(a, 6000L);
            } catch (Exception exception) {
              exception.printStackTrace();
            }  
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  class a implements Runnable {
    a(g this$0) {}
    
    public void run() {
      com.allinone.callerid.h.a.o().q();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */