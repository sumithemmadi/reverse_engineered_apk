package com.allinone.callerid.util;

import android.os.AsyncTask;
import com.allinone.callerid.j.a;
import java.util.HashMap;
import org.json.JSONObject;

public class w0 extends AsyncTask<Void, Void, String> {
  private String a;
  
  private String b;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  public w0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7) {
    this.a = paramString4;
    this.c = paramString6;
    this.b = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString5;
    this.g = paramString7;
  }
  
  protected String a(Void... paramVarArgs) {
    String str;
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
      d0.a("reportWrongInfo", stringBuilder.toString());
    } 
    paramVarArgs = null;
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("device", this.b);
      hashMap.put("version", this.d);
      hashMap.put("cc", this.e);
      hashMap.put("tel_number", this.a);
      hashMap.put("stamp", this.f);
      hashMap.put("country", this.c);
      hashMap.put("content", this.g);
      String str1 = a.b("https://ct.show-caller.com/c_l/api/v1/clrwro.php", hashMap);
      str = str1;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("result:");
      stringBuilder.append(str);
      d0.a("reportWrongInfo", stringBuilder.toString());
    } 
    return str;
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
            d0.a("reportWrongInfo", stringBuilder.toString());
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */