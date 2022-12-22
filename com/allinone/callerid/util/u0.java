package com.allinone.callerid.util;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.allinone.callerid.f.e;
import com.allinone.callerid.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class u0 extends AsyncTask {
  private String a;
  
  private String b;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  private String h;
  
  private Context i;
  
  public u0(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.e = paramString4;
    this.f = paramString5;
    this.h = paramString6;
    this.i = paramContext;
  }
  
  private void a() {
    (new a(this.a, this.h)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  protected Object doInBackground(Object[] paramArrayOfObject) {
    String str2 = "";
    String str1 = i1.T(this.i);
    this.d = str1;
    this.g = i1.Q(this.i, str1);
    String str3 = i1.N();
    String str4 = i1.R();
    String str5 = i1.A();
    str1 = p.e(this.i);
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("所有参数：number:");
      stringBuilder.append(this.a);
      stringBuilder.append("\n");
      stringBuilder.append("report_type:");
      stringBuilder.append(this.b);
      stringBuilder.append("\n");
      stringBuilder.append("device:");
      stringBuilder.append(this.c);
      stringBuilder.append("\n");
      stringBuilder.append("uid:");
      stringBuilder.append(this.d);
      stringBuilder.append("\n");
      stringBuilder.append("version:");
      stringBuilder.append(this.e);
      stringBuilder.append("\n");
      stringBuilder.append("default_cc:");
      stringBuilder.append(this.f);
      stringBuilder.append("\n");
      stringBuilder.append("stamp:");
      stringBuilder.append(this.g);
      stringBuilder.append("\n");
      d0.a("reportNumber", stringBuilder.toString());
    } 
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject.put("cc", this.f);
      jSONObject.put("tel_number", this.a);
      jSONObject.put("report_type", this.b);
      jSONObject.put("user", str1);
      jSONObject.put("version", str4);
      jSONObject.put("device", str3);
      jSONObject.put("uid", this.d);
      jSONObject.put("ip", str5);
      str1 = w.c(jSONObject.toString());
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      str1 = "";
    } 
    str5 = str2;
    if (!"".equals(str1))
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        hashMap.put("device", this.c);
        hashMap.put("uid", this.d);
        hashMap.put("version", this.e);
        hashMap.put("stamp", this.g);
        hashMap.put("content", str1);
        String str = com.allinone.callerid.j.a.b("https://ct.show-caller.com/c_l/api/v1/clrnum.php", hashMap);
      } catch (Exception exception) {
        exception.printStackTrace();
        str5 = str2;
      }  
    return str5;
  }
  
  protected void onPostExecute(Object paramObject) {
    super.onPostExecute(paramObject);
    if (paramObject != null)
      try {
        if (!"".equals(paramObject)) {
          JSONObject jSONObject = new JSONObject();
          this(paramObject.toString());
          int i = jSONObject.getInt("status");
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("标记状态：");
            if (i == 1) {
              paramObject = "ok";
            } else {
              paramObject = "failed";
            } 
            stringBuilder.append((String)paramObject);
            d0.a("reportNumber", stringBuilder.toString());
          } 
          a();
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  private static class a extends AsyncTask<Void, Void, Void> {
    String a;
    
    String b;
    
    a(String param1String1, String param1String2) {
      this.a = param1String1;
      this.b = param1String2;
    }
    
    protected Void a(Void... param1VarArgs) {
      try {
        e.d().g(this.a);
        EZSearchContacts eZSearchContacts = f.b().d(this.a);
        if (eZSearchContacts != null) {
          eZSearchContacts.setType_label(this.b);
          if (eZSearchContacts.getReport_count() != null && !"".equals(eZSearchContacts.getReport_count())) {
            eZSearchContacts.setReport_count(String.valueOf(Integer.parseInt(eZSearchContacts.getReport_count()) + 1));
          } else {
            eZSearchContacts.setReport_count("1");
          } 
          f.b().e(eZSearchContacts, new String[] { "type_label", "report_count" });
        } else {
          eZSearchContacts = new EZSearchContacts();
          this();
          eZSearchContacts.setOld_tel_number(this.a);
          eZSearchContacts.setType_label(this.b);
          eZSearchContacts.setReport_count("1");
          f.b().c(eZSearchContacts);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      Intent intent = new Intent();
      intent.setAction("com.allinone.callerid.RELOAD_DATA");
      b.p.a.a.b((Context)EZCallApplication.c()).d(intent);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */