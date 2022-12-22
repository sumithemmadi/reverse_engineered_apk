package com.allinone.callerid.i.a.i;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i1;
import java.util.HashMap;

public class e {
  public static void a(String paramString1, String paramString2, int paramInt, d paramd) {
    try {
      a a = new a();
      this(paramString1, paramString2, paramInt, paramd);
      a.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private d a;
    
    private String b;
    
    private String c;
    
    private int d;
    
    a(String param1String1, String param1String2, int param1Int, d param1d) {
      this.a = param1d;
      this.b = param1String1;
      this.c = param1String2;
      this.d = param1Int;
    }
    
    protected String a(String... param1VarArgs) {
      String str1;
      String str2;
      EZCallApplication eZCallApplication = null;
      String[] arrayOfString = null;
      param1VarArgs = arrayOfString;
      try {
        EZCallApplication eZCallApplication1 = EZCallApplication.c();
        param1VarArgs = arrayOfString;
        String str3 = i1.T((Context)eZCallApplication1);
        param1VarArgs = arrayOfString;
        String str4 = i1.W((Context)eZCallApplication1);
        param1VarArgs = arrayOfString;
        String str5 = i1.Q((Context)eZCallApplication1, this.b);
        param1VarArgs = arrayOfString;
        String str6 = String.valueOf(this.d);
        eZCallApplication1 = eZCallApplication;
        if (str3 != null) {
          param1VarArgs = arrayOfString;
          eZCallApplication1 = eZCallApplication;
          if (!"".equals(str3)) {
            eZCallApplication1 = eZCallApplication;
            if (str4 != null) {
              param1VarArgs = arrayOfString;
              eZCallApplication1 = eZCallApplication;
              if (!"".equals(str4)) {
                eZCallApplication1 = eZCallApplication;
                if (str6 != null) {
                  param1VarArgs = arrayOfString;
                  eZCallApplication1 = eZCallApplication;
                  if (!"".equals(str6)) {
                    eZCallApplication1 = eZCallApplication;
                    if (str5 != null) {
                      param1VarArgs = arrayOfString;
                      eZCallApplication1 = eZCallApplication;
                      if (!"".equals(str5)) {
                        param1VarArgs = arrayOfString;
                        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                        param1VarArgs = arrayOfString;
                        this();
                        param1VarArgs = arrayOfString;
                        hashMap.put("device", "android");
                        param1VarArgs = arrayOfString;
                        hashMap.put("uid", str3);
                        param1VarArgs = arrayOfString;
                        hashMap.put("version", str4);
                        param1VarArgs = arrayOfString;
                        hashMap.put("stamp", str5);
                        param1VarArgs = arrayOfString;
                        hashMap.put("t_p", i1.f(this.c));
                        param1VarArgs = arrayOfString;
                        hashMap.put("tel_number", this.b);
                        param1VarArgs = arrayOfString;
                        hashMap.put("page", str6);
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
                          d0.a("comment", stringBuilder.toString());
                        } 
                        param1VarArgs = arrayOfString;
                        String str = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/getsofcom.php", hashMap);
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
                          d0.a("comment", stringBuilder.toString());
                          String str7 = str;
                        } 
                      } 
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */