package com.allinone.callerid.util;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.j.a;
import com.allinone.callerid.main.EZCallApplication;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class v0 extends AsyncTask {
  private String a;
  
  private String b;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  private String h;
  
  private String i;
  
  private String j;
  
  public v0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9) {
    this.a = paramString1;
    this.b = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
    this.g = paramString6;
    this.h = paramString7;
    this.i = paramString8;
    this.j = paramString9;
  }
  
  protected Object doInBackground(Object[] paramArrayOfObject) {
    try {
      this.c = i1.T((Context)EZCallApplication.c());
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("所有参数：tel_number:");
        stringBuilder.append(this.a);
        stringBuilder.append("\n");
        stringBuilder.append("device:");
        stringBuilder.append(this.b);
        stringBuilder.append("\n");
        stringBuilder.append("uid:");
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
        stringBuilder.append("t_p:");
        stringBuilder.append(this.h);
        stringBuilder.append("\n");
        stringBuilder.append("subtype_id:");
        stringBuilder.append(this.i);
        stringBuilder.append("\n");
        stringBuilder.append("type:");
        stringBuilder.append(this.j);
        stringBuilder.append("\n");
        d0.a("subtype", stringBuilder.toString());
      } 
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("tel_number", URLEncoder.encode(this.a, "UTF-8"));
      hashMap.put("device", this.b);
      hashMap.put("uid", this.c);
      hashMap.put("version", this.d);
      hashMap.put("cc", this.e);
      hashMap.put("stamp", this.f);
      hashMap.put("lang", this.g);
      hashMap.put("t_p", this.h);
      hashMap.put("subtype_id", this.i);
      hashMap.put("type", this.j);
      String str = a.b("https://sa.show-caller.com/api/v1/rtnsub.php", hashMap);
    } catch (Exception exception) {
      exception.printStackTrace();
      exception = null;
    } 
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("result:");
      stringBuilder.append((String)exception);
      d0.a("subtype", stringBuilder.toString());
    } 
    return exception;
  }
  
  protected void onPostExecute(Object paramObject) {
    super.onPostExecute(paramObject);
    try {
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
        d0.a("subtype", stringBuilder.toString());
      } 
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */