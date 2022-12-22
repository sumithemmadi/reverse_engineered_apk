package com.allinone.callerid.i.a.v;

import android.os.AsyncTask;
import com.allinone.callerid.f.f;
import com.allinone.callerid.model.EZSearchContacts;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
  public static void a(String paramString, a parama) {
    try {
      a a1 = new a();
      this(paramString, parama);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private String a;
    
    String b = "";
    
    String c = "";
    
    String d = "";
    
    String e = "";
    
    private a f;
    
    a(String param1String, a param1a) {
      this.a = param1String;
      this.f = param1a;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        EZSearchContacts eZSearchContacts = f.b().d(this.a);
        if (eZSearchContacts != null) {
          String str = eZSearchContacts.getType_tags();
          if (str != null && !"".equals(str)) {
            this.b = str;
            if (str != null) {
              boolean bool = "".equals(str);
              if (!bool)
                try {
                  JSONObject jSONObject = new JSONObject();
                  this(this.b);
                  this.c = jSONObject.getString("Spam");
                  this.d = jSONObject.getString("Scam");
                  this.e = jSONObject.getString("Telemarketing");
                } catch (JSONException jSONException) {
                  jSONException.printStackTrace();
                }  
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return this.b;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.f.a(this.c, this.d, this.e);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/v/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */