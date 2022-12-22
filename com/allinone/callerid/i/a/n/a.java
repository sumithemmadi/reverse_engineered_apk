package com.allinone.callerid.i.a.n;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.bean.ParserIpBean;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i1;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
  public static void a() {
    try {
      EZCallApplication eZCallApplication = EZCallApplication.c();
      if (System.currentTimeMillis() - b1.h0() > 86400000L && i1.a((Context)eZCallApplication)) {
        String str1 = b1.Z();
        String str2 = i1.A();
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("local_ip:");
          stringBuilder.append(str1);
          stringBuilder.append(" now_ip:");
          stringBuilder.append(str2);
          d0.a("ipparser", stringBuilder.toString());
        } 
        if (str1 != null && str2 != null)
          if ("".equals(str1)) {
            a a1 = new a();
            this();
            a1.executeOnExecutor(f1.a(), new Object[0]);
          } else if (!"".equals(str2) && !str1.equals(str2)) {
            a a1 = new a();
            this();
            a1.executeOnExecutor(f1.a(), new Object[0]);
          }  
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  static class a extends AsyncTask<Object, Void, Object> {
    protected String a(Object[] param1ArrayOfObject) {
      String str1;
      String str2;
      Object[] arrayOfObject = null;
      param1ArrayOfObject = arrayOfObject;
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        param1ArrayOfObject = arrayOfObject;
        this();
        param1ArrayOfObject = arrayOfObject;
        EZCallApplication eZCallApplication = EZCallApplication.c();
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("platform", "android");
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("uid", i1.T((Context)eZCallApplication));
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("app_version", i1.W((Context)eZCallApplication));
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("ip", i1.A());
        param1ArrayOfObject = arrayOfObject;
        hashMap.put("stamp", i1.Q((Context)eZCallApplication, i1.T((Context)eZCallApplication)));
        param1ArrayOfObject = arrayOfObject;
        if (d0.a) {
          param1ArrayOfObject = arrayOfObject;
          StringBuilder stringBuilder = new StringBuilder();
          param1ArrayOfObject = arrayOfObject;
          this();
          param1ArrayOfObject = arrayOfObject;
          stringBuilder.append("params:");
          param1ArrayOfObject = arrayOfObject;
          stringBuilder.append(hashMap.toString());
          param1ArrayOfObject = arrayOfObject;
          d0.a("ipparser", stringBuilder.toString());
        } 
        param1ArrayOfObject = arrayOfObject;
        String str = com.allinone.callerid.j.a.b("https://ip.show-caller.com/api/v1/ipa.php", hashMap);
        str1 = str;
        if (d0.a) {
          str1 = str;
          StringBuilder stringBuilder = new StringBuilder();
          str1 = str;
          this();
          str1 = str;
          stringBuilder.append("enlode_result=");
          str1 = str;
          stringBuilder.append(str);
          str1 = str;
          d0.a("ipparser", stringBuilder.toString());
        } 
        str2 = str;
        if (str != null) {
          str1 = str;
          boolean bool = "".equals(str);
          str2 = str;
          if (!bool) {
            str1 = str;
            try {
              JSONObject jSONObject = new JSONObject();
              str1 = str;
              this(str);
              str1 = str;
              str2 = str;
              if (jSONObject.getInt("status") == 1) {
                str1 = str;
                b1.F1(i1.A());
                str1 = str;
                b1.N1(System.currentTimeMillis());
                str1 = str;
                jSONObject = jSONObject.getJSONObject("ip_info");
                str1 = str;
                ParserIpBean parserIpBean = new ParserIpBean();
                str1 = str;
                this();
                str1 = str;
                parserIpBean.setTrue_ip(jSONObject.getString("true_ip"));
                str1 = str;
                parserIpBean.setCountry_full(jSONObject.getString("country_full"));
                str1 = str;
                parserIpBean.setCountry(jSONObject.getString("country"));
                str1 = str;
                parserIpBean.setState_full(jSONObject.getString("state_full"));
                str1 = str;
                parserIpBean.setState(jSONObject.getString("state"));
                str1 = str;
                parserIpBean.setCity(jSONObject.getString("city"));
                str1 = str;
                c.a().c(parserIpBean);
                String str3 = str;
              } 
            } catch (JSONException jSONException) {
              str1 = str;
              jSONException.printStackTrace();
              String str3 = str;
            } 
          } 
        } 
      } catch (Exception exception) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Exception=");
          stringBuilder.append(exception.getMessage());
          d0.a("ipparser", stringBuilder.toString());
        } 
        exception.printStackTrace();
        str2 = str1;
      } 
      return str2;
    }
    
    protected void onPostExecute(Object param1Object) {
      super.onPostExecute(param1Object);
      if (d0.a)
        d.a(new a(this)); 
    }
    
    class a implements b {
      a(a.a this$0) {}
      
      public void a(ParserIpBean param2ParserIpBean) {
        if (param2ParserIpBean != null) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("bean:");
          stringBuilder.append(param2ParserIpBean.toString());
          d0.a("ipparser", stringBuilder.toString());
        } 
      }
    }
  }
  
  class a implements b {
    a(a this$0) {}
    
    public void a(ParserIpBean param1ParserIpBean) {
      if (param1ParserIpBean != null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bean:");
        stringBuilder.append(param1ParserIpBean.toString());
        d0.a("ipparser", stringBuilder.toString());
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */