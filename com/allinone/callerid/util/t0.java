package com.allinone.callerid.util;

import android.os.AsyncTask;
import com.allinone.callerid.j.a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class t0 extends AsyncTask<Void, Void, String> {
  private String a;
  
  private String b;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  public t0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7) {
    this.a = paramString4;
    this.c = paramString6;
    this.b = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString5;
    this.g = paramString7;
  }
  
  protected String a(Void... paramVarArgs) {
    String str1;
    String str2;
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("所有参数：tel_number:");
      stringBuilder.append(this.a);
      stringBuilder.append("\n");
      stringBuilder.append("device:");
      stringBuilder.append(this.b);
      stringBuilder.append("\n");
      stringBuilder.append("country:");
      stringBuilder.append(this.c);
      stringBuilder.append("\n");
      stringBuilder.append("version:");
      stringBuilder.append(this.d);
      stringBuilder.append("\n");
      stringBuilder.append("cc:");
      stringBuilder.append(this.e);
      stringBuilder.append("\n");
      stringBuilder.append("stamp:");
      stringBuilder.append(this.f);
      stringBuilder.append("\n");
      stringBuilder.append("content:");
      stringBuilder.append(this.g);
      stringBuilder.append("\n");
      d0.a("reportName", stringBuilder.toString());
    } 
    Void[] arrayOfVoid = null;
    paramVarArgs = arrayOfVoid;
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      paramVarArgs = arrayOfVoid;
      this();
      paramVarArgs = arrayOfVoid;
      hashMap.put("device", this.b);
      paramVarArgs = arrayOfVoid;
      hashMap.put("version", this.d);
      paramVarArgs = arrayOfVoid;
      hashMap.put("cc", this.e);
      paramVarArgs = arrayOfVoid;
      hashMap.put("tel_number", this.a);
      paramVarArgs = arrayOfVoid;
      hashMap.put("stamp", this.f);
      paramVarArgs = arrayOfVoid;
      hashMap.put("country", this.c);
      paramVarArgs = arrayOfVoid;
      hashMap.put("content", this.g);
      paramVarArgs = arrayOfVoid;
      String str = a.b("https://ct.show-caller.com/c_l/api/v1/clrnam.php", hashMap);
      str1 = str;
      str2 = str;
      if (d0.a) {
        str1 = str;
        StringBuilder stringBuilder = new StringBuilder();
        str1 = str;
        this();
        str1 = str;
        stringBuilder.append("result：");
        str1 = str;
        stringBuilder.append(str);
        str1 = str;
        d0.a("reportName", stringBuilder.toString());
        String str3 = str;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      str2 = str1;
    } 
    return str2;
  }
  
  protected void b(String paramString) {
    super.onPostExecute(paramString);
    if (paramString != null)
      try {
        if (!"".equals(paramString)) {
          JSONObject jSONObject = new JSONObject();
          this(paramString);
          int i = jSONObject.getInt("status");
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("标记状态：");
            if (i == 1) {
              paramString = "ok";
            } else {
              paramString = "failed";
            } 
            stringBuilder.append(paramString);
            d0.a("reportName", stringBuilder.toString());
          } 
        } 
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/t0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */