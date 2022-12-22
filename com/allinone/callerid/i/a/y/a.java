package com.allinone.callerid.i.a.y;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.w;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
  public static void a(ArrayList<String> paramArrayList, c paramc) {
    try {
      a a1 = new a();
      this(paramArrayList, paramc);
      a1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private c a;
    
    private ArrayList<String> b;
    
    a(ArrayList<String> param1ArrayList, c param1c) {
      this.a = param1c;
      this.b = param1ArrayList;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        JSONArray jSONArray = new JSONArray();
        this(this.b);
        String str2 = jSONArray.toString();
        boolean bool = d0.a;
        if (bool) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("search_list:");
          stringBuilder.append(str2);
          d0.d("comment", stringBuilder.toString());
        } 
        String str3 = w.c(str2);
        String str4 = i1.T((Context)EZCallApplication.c());
        String str5 = i1.W((Context)EZCallApplication.c());
        String str1 = p.d((Context)EZCallApplication.c()).getCountry_code();
        str2 = i1.Q((Context)EZCallApplication.c(), str4);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        hashMap.put("tel_number_list", str3);
        hashMap.put("device", "android");
        hashMap.put("uid", str4);
        hashMap.put("version", str5);
        hashMap.put("cc", str1);
        hashMap.put("stamp", str2);
        str1 = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/seacomcoumul.php", hashMap);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("response:");
          stringBuilder.append(str1);
          d0.a("comment", stringBuilder.toString());
        } 
        if (str1 != null && !"".equals(str1)) {
          JSONObject jSONObject = new JSONObject();
          this(str1);
          if (jSONObject.getInt("status") == 1) {
            String str = jSONObject.getString("list");
            JSONArray jSONArray1 = new JSONArray();
            this(str);
            for (byte b = 0; b < jSONArray1.length(); b++) {
              JSONObject jSONObject1 = jSONArray1.getJSONObject(b);
              str3 = jSONObject1.getString("old_tel_number");
              String str6 = jSONObject1.getString("comment_counts");
              if (str6 != null && str3 != null && !"".equals(str3)) {
                EZSearchContacts eZSearchContacts = f.b().d(str3);
                if (eZSearchContacts != null) {
                  eZSearchContacts.setComment_count(str6);
                  eZSearchContacts.setCan_search_commentcount(false);
                  f.b().e(eZSearchContacts, new String[] { "comment_count", "can_search_commentcount" });
                } else {
                  eZSearchContacts = new EZSearchContacts();
                  this();
                  eZSearchContacts.setComment_count(str6);
                  eZSearchContacts.setCan_search_commentcount(false);
                  f.b().c(eZSearchContacts);
                } 
              } 
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "ok";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/y/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */