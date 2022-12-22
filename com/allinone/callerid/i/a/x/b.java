package com.allinone.callerid.i.a.x;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.model.EZCountryCode;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
  private static List b(Context paramContext) {
    List list;
    ArrayList arrayList = new ArrayList();
    try {
      list = p.a(paramContext);
    } catch (IOException iOException) {
      iOException.printStackTrace();
      list = arrayList;
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      list = arrayList;
    } 
    return list;
  }
  
  public static void c(Context paramContext, String paramString1, String paramString2, a parama) {
    try {
      a a1 = new a();
      this(paramContext, paramString1, paramString2, parama);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private a a;
    
    private String b;
    
    private String c;
    
    private Context d;
    
    a(Context param1Context, String param1String1, String param1String2, a param1a) {
      this.a = param1a;
      this.d = param1Context;
      this.b = param1String1;
      this.c = param1String2;
    }
    
    protected String a(String... param1VarArgs) {
      String str1;
      String str2 = null;
      String[] arrayOfString = null;
      param1VarArgs = arrayOfString;
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        param1VarArgs = arrayOfString;
        this();
        param1VarArgs = arrayOfString;
        hashMap.put("tel_number", this.c);
        param1VarArgs = arrayOfString;
        hashMap.put("device", "android");
        param1VarArgs = arrayOfString;
        hashMap.put("uid", i1.T(this.d));
        param1VarArgs = arrayOfString;
        hashMap.put("version", i1.W(this.d));
        param1VarArgs = arrayOfString;
        hashMap.put("default_cc", p.d(this.d).getCountry_code());
        param1VarArgs = arrayOfString;
        hashMap.put("stamp", i1.Q(this.d, this.c));
        param1VarArgs = arrayOfString;
        String str = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/gecc.php", hashMap);
        param1VarArgs = arrayOfString;
        if (d0.a) {
          param1VarArgs = arrayOfString;
          StringBuilder stringBuilder = new StringBuilder();
          param1VarArgs = arrayOfString;
          this();
          param1VarArgs = arrayOfString;
          stringBuilder.append("response:");
          param1VarArgs = arrayOfString;
          stringBuilder.append(str);
          param1VarArgs = arrayOfString;
          d0.a("searchCC", stringBuilder.toString());
        } 
        param1VarArgs = arrayOfString;
        JSONObject jSONObject = new JSONObject();
        param1VarArgs = arrayOfString;
        this(str);
        param1VarArgs = arrayOfString;
        if (jSONObject.getString("status").equals("1")) {
          param1VarArgs = arrayOfString;
          String str3 = jSONObject.getString("cc");
          str1 = str3;
          str2 = str3;
          if (!str3.equals(this.b)) {
            str1 = str3;
            b1.N0(str3);
            str1 = str3;
            List list = b.a(this.d);
            str2 = str3;
            if (list != null) {
              str1 = str3;
              str2 = str3;
              if (!"".equals(list)) {
                str1 = str3;
                Iterator<EZCountryCode> iterator = list.iterator();
                while (true) {
                  str1 = str3;
                  str2 = str3;
                  if (iterator.hasNext()) {
                    str1 = str3;
                    EZCountryCode eZCountryCode = iterator.next();
                    str1 = str3;
                    if (str3.equals(eZCountryCode.getCountry_code())) {
                      str1 = str3;
                      b1.P0(eZCountryCode.getIso_code());
                      str1 = str3;
                      b1.O0(eZCountryCode.getCountry_name());
                    } 
                    continue;
                  } 
                  break;
                } 
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
      this.a.a(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/x/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */