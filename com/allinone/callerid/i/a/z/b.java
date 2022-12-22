package com.allinone.callerid.i.a.z;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.w;
import java.util.HashMap;

public class b {
  public static void a(Context paramContext, String paramString1, String paramString2, a parama) {
    try {
      a a1 = new a();
      this(paramContext, paramString1, paramString2, parama);
      a1.executeOnExecutor(f1.a(), (Object[])new String[0]);
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
      this.b = param1String2;
      this.c = param1String1;
    }
    
    protected String a(String... param1VarArgs) {
      String str1;
      String str2;
      HashMap<Object, Object> hashMap = null;
      String[] arrayOfString = null;
      param1VarArgs = arrayOfString;
      try {
        String str3 = i1.N();
        param1VarArgs = arrayOfString;
        String str4 = i1.T(this.d);
        param1VarArgs = arrayOfString;
        String str5 = i1.W(this.d);
        param1VarArgs = arrayOfString;
        String str6 = p.d(this.d).getCountry_code();
        param1VarArgs = arrayOfString;
        String str7 = i1.Q(this.d, this.b);
        param1VarArgs = arrayOfString;
        String str8 = this.b;
        HashMap<Object, Object> hashMap1 = hashMap;
        if (str8 != null) {
          param1VarArgs = arrayOfString;
          hashMap1 = hashMap;
          if (!"".equals(str8)) {
            hashMap1 = hashMap;
            if (str6 != null) {
              param1VarArgs = arrayOfString;
              hashMap1 = hashMap;
              if (!"".equals(str6)) {
                hashMap1 = hashMap;
                if (str7 != null) {
                  param1VarArgs = arrayOfString;
                  hashMap1 = hashMap;
                  if (!"".equals(str7)) {
                    param1VarArgs = arrayOfString;
                    hashMap1 = new HashMap<Object, Object>();
                    param1VarArgs = arrayOfString;
                    this();
                    param1VarArgs = arrayOfString;
                    hashMap1.put("platform", "android");
                    param1VarArgs = arrayOfString;
                    hashMap1.put("device", str3);
                    param1VarArgs = arrayOfString;
                    hashMap1.put("uid", str4);
                    param1VarArgs = arrayOfString;
                    hashMap1.put("app_version", str5);
                    param1VarArgs = arrayOfString;
                    hashMap1.put("tel_number", w.c(this.b));
                    param1VarArgs = arrayOfString;
                    hashMap1.put("default_cc", str6);
                    param1VarArgs = arrayOfString;
                    hashMap1.put("cc", this.c);
                    param1VarArgs = arrayOfString;
                    hashMap1.put("stamp", str7);
                    param1VarArgs = arrayOfString;
                    boolean bool = d0.a;
                    if (bool) {
                      param1VarArgs = arrayOfString;
                      StringBuilder stringBuilder = new StringBuilder();
                      param1VarArgs = arrayOfString;
                      this();
                      param1VarArgs = arrayOfString;
                      stringBuilder.append("searchNumber：");
                      param1VarArgs = arrayOfString;
                      stringBuilder.append(this.b);
                      param1VarArgs = arrayOfString;
                      d0.a("buyu", stringBuilder.toString());
                      param1VarArgs = arrayOfString;
                      stringBuilder = new StringBuilder();
                      param1VarArgs = arrayOfString;
                      this();
                      param1VarArgs = arrayOfString;
                      stringBuilder.append("所有参数：");
                      param1VarArgs = arrayOfString;
                      stringBuilder.append(hashMap1.toString());
                      param1VarArgs = arrayOfString;
                      d0.a("buyu", stringBuilder.toString());
                    } 
                    param1VarArgs = arrayOfString;
                    String str = com.allinone.callerid.j.a.b("https://app2.show-caller.com/api/v1/scl.php", hashMap1);
                    str1 = str;
                    str2 = str;
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
                      d0.a("buyu", stringBuilder.toString());
                      String str9 = str;
                    } 
                  } 
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/z/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */