package com.allinone.callerid.util;

import android.os.AsyncTask;
import com.allinone.callerid.f.f;
import com.allinone.callerid.model.EZSearchContacts;
import org.json.JSONObject;

public class z0 {
  public static void a(JSONObject paramJSONObject, String paramString) {
    try {
      a a = new a();
      this(paramJSONObject, paramString);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  static class a extends AsyncTask<Object, Void, Object> {
    JSONObject a;
    
    String b;
    
    private EZSearchContacts c;
    
    a(JSONObject param1JSONObject, String param1String) {
      this.a = param1JSONObject;
      this.b = param1String;
    }
    
    protected String a(Object[] param1ArrayOfObject) {
      try {
        EZSearchContacts eZSearchContacts = f.b().d(this.b);
        this.c = eZSearchContacts;
        if (eZSearchContacts == null) {
          eZSearchContacts = new EZSearchContacts();
          this();
          eZSearchContacts.setOld_tel_number(this.b);
          eZSearchContacts.setT_p(this.a.getString("t_p"));
          eZSearchContacts.setSubtype(this.a.getString("subtype"));
          eZSearchContacts.setTel_number(this.a.getString("tel_number"));
          eZSearchContacts.setSubtype_cc(this.a.getString("cc"));
          eZSearchContacts.setKeyword(this.a.getString("keyword"));
          eZSearchContacts.setComment_count(this.a.getString("comments_count"));
          eZSearchContacts.setSubtype_isserach(true);
          f.b().c(eZSearchContacts);
        } else {
          String str = this.a.getString("t_p");
          if (str != null && !"".equals(str))
            this.c.setT_p(str); 
          str = this.a.getString("subtype");
          if (str != null && !"".equals(str))
            this.c.setSubtype(str); 
          str = this.a.getString("keyword");
          if (str != null && !"".equals(str))
            this.c.setKeyword(str); 
          str = this.a.getString("tel_number");
          if (str != null && !"".equals(str))
            this.c.setTel_number(str); 
          str = this.a.getString("cc");
          if (str != null && !"".equals(str))
            this.c.setSubtype_cc(str); 
          str = this.a.getString("comments_count");
          if (str != null && !"".equals(str))
            this.c.setComment_count(str); 
          this.c.setSubtype_isserach(true);
          f.b().e(this.c, new String[] { "t_p", "subtype", "keyword", "tel_number", "subtype_cc", "subtype_isserach", "comment_count" });
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void onPostExecute(Object param1Object) {
      super.onPostExecute(param1Object);
      if (d0.a)
        d0.a("subtype", "OK"); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */