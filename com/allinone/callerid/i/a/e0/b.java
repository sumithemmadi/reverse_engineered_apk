package com.allinone.callerid.i.a.e0;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.f.f;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import java.util.HashMap;
import org.json.JSONObject;

public class b {
  public static void a(Context paramContext, String paramString, a parama) {
    try {
      a a1 = new a();
      this(paramContext, paramString, parama);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private a a;
    
    private Context b;
    
    private String c;
    
    private int d;
    
    private int e;
    
    private boolean f;
    
    a(Context param1Context, String param1String, a param1a) {
      this.a = param1a;
      this.b = param1Context;
      this.c = param1String;
    }
    
    protected String a(String... param1VarArgs) {
      String str1;
      String str2;
      String[] arrayOfString = null;
      param1VarArgs = arrayOfString;
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        param1VarArgs = arrayOfString;
        this();
        param1VarArgs = arrayOfString;
        hashMap.put("tel_number", this.c);
        param1VarArgs = arrayOfString;
        hashMap.put("platform", "android");
        param1VarArgs = arrayOfString;
        hashMap.put("uid", i1.T(this.b));
        param1VarArgs = arrayOfString;
        hashMap.put("app_version", i1.W(this.b));
        param1VarArgs = arrayOfString;
        hashMap.put("default_cc", p.d(this.b).getCountry_code());
        param1VarArgs = arrayOfString;
        hashMap.put("stamp", i1.Q(this.b, this.c));
        param1VarArgs = arrayOfString;
        boolean bool = d0.a;
        if (bool) {
          param1VarArgs = arrayOfString;
          StringBuilder stringBuilder = new StringBuilder();
          param1VarArgs = arrayOfString;
          this();
          param1VarArgs = arrayOfString;
          stringBuilder.append("params:");
          param1VarArgs = arrayOfString;
          stringBuilder.append(hashMap.toString());
          param1VarArgs = arrayOfString;
          d0.a("wiki", stringBuilder.toString());
        } 
        param1VarArgs = arrayOfString;
        String str = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/seawik.php", hashMap);
        str1 = str;
        if (d0.a) {
          str1 = str;
          StringBuilder stringBuilder = new StringBuilder();
          str1 = str;
          this();
          str1 = str;
          stringBuilder.append("response:");
          str1 = str;
          stringBuilder.append(str);
          str1 = str;
          d0.a("wiki", stringBuilder.toString());
        } 
        str2 = str;
        if (str != null) {
          str1 = str;
          str2 = str;
          if (!"".equals(str)) {
            str1 = str;
            JSONObject jSONObject = new JSONObject();
            str1 = str;
            this(str);
            str1 = str;
            str2 = str;
            if (jSONObject.getInt("status") == 1) {
              String str3;
              str1 = str;
              this.f = true;
              str1 = str;
              this.d = jSONObject.getInt("block_count");
              str1 = str;
              this.e = jSONObject.getInt("declined_count");
              str1 = str;
              EZSearchContacts eZSearchContacts = f.b().d(this.c);
              if (eZSearchContacts == null) {
                str1 = str;
                eZSearchContacts = new EZSearchContacts();
                str1 = str;
                this();
                str1 = str;
                eZSearchContacts.setBlock_count(this.d);
                str1 = str;
                eZSearchContacts.setDeclined_count(this.e);
                str1 = str;
                eZSearchContacts.setOld_tel_number(this.c);
                str1 = str;
                eZSearchContacts.setWiki_search_time(System.currentTimeMillis());
                str1 = str;
                f.b().c(eZSearchContacts);
                str3 = str;
              } else {
                str1 = str;
                str3.setBlock_count(this.d);
                str1 = str;
                str3.setDeclined_count(this.e);
                str1 = str;
                str3.setWiki_search_time(System.currentTimeMillis());
                str1 = str;
                f.b().e((EZSearchContacts)str3, new String[] { "block_count", "declined_count", "wiki_search_time" });
                str3 = str;
              } 
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        str2 = str1;
      } 
      return str2;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(this.f, this.d, this.e);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/e0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */