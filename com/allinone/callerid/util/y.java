package com.allinone.callerid.util;

import android.content.Context;
import android.os.AsyncTask;
import java.util.HashMap;
import org.json.JSONObject;

public class y extends AsyncTask {
  private String a;
  
  private String b;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private Context g;
  
  private a h;
  
  public y(Context paramContext, String paramString1, String paramString2, String paramString3) {
    this.a = paramString3;
    this.b = paramString2;
    this.c = paramString1;
    this.g = paramContext;
  }
  
  public void a(a parama) {
    this.h = parama;
  }
  
  protected Object doInBackground(Object[] paramArrayOfObject) {
    String str;
    this.d = i1.T(this.g);
    this.e = i1.W(this.g);
    this.f = i1.Q(this.g, this.b);
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("所有参数：device:");
      stringBuilder.append(this.c);
      stringBuilder.append("\n");
      stringBuilder.append("uid:");
      stringBuilder.append(this.d);
      stringBuilder.append("\n");
      stringBuilder.append("version:");
      stringBuilder.append(this.e);
      stringBuilder.append("\n");
      stringBuilder.append("stamp:");
      stringBuilder.append(this.f);
      stringBuilder.append("\n");
      stringBuilder.append("cid:");
      stringBuilder.append(this.b);
      stringBuilder.append("\n");
      stringBuilder.append("t_p:");
      stringBuilder.append(this.a);
      stringBuilder.append("\n");
      d0.a("comment", stringBuilder.toString());
    } 
    paramArrayOfObject = null;
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("device", "android");
      hashMap.put("uid", this.d);
      hashMap.put("version", this.e);
      hashMap.put("stamp", this.f);
      hashMap.put("cid", this.b);
      hashMap.put("t_p", this.a);
      String str1 = com.allinone.callerid.j.a.b("https://ct.show-caller.com/c_l/api/v1/clcinf.php", hashMap);
      str = str1;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("enlode_result:");
      stringBuilder.append(str);
      d0.a("comment", stringBuilder.toString());
    } 
    return str;
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
            d0.a("comment", stringBuilder.toString());
          } 
          paramObject = this.h;
          if (paramObject != null)
            paramObject.a(i); 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public static interface a {
    void a(int param1Int);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */