package com.allinone.callerid.i.a.i;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.w;
import java.util.HashMap;

public class g {
  public static void a(String paramString1, long paramLong, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, f paramf) {
    try {
      a a = new a();
      this(paramString1, paramLong, paramString2, paramString3, paramString4, paramString5, paramString6, paramf);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private f a;
    
    private String b;
    
    private long c;
    
    private String d;
    
    private String e;
    
    private String f;
    
    private String g;
    
    private String h;
    
    a(String param1String1, long param1Long, String param1String2, String param1String3, String param1String4, String param1String5, String param1String6, f param1f) {
      this.a = param1f;
      this.b = param1String1;
      this.c = param1Long;
      this.d = param1String2;
      this.e = param1String3;
      this.f = param1String4;
      this.g = param1String5;
      this.h = param1String6;
    }
    
    protected String a(String... param1VarArgs) {
      String str1;
      String str2;
      String[] arrayOfString = null;
      param1VarArgs = arrayOfString;
      try {
        EZCallApplication eZCallApplication = EZCallApplication.c();
        param1VarArgs = arrayOfString;
        String str4 = p.d((Context)eZCallApplication).getCountry_code();
        param1VarArgs = arrayOfString;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        param1VarArgs = arrayOfString;
        this();
        param1VarArgs = arrayOfString;
        hashMap.put("tel_number", this.b);
        param1VarArgs = arrayOfString;
        hashMap.put("device", "android");
        param1VarArgs = arrayOfString;
        hashMap.put("uid", i1.T((Context)eZCallApplication));
        param1VarArgs = arrayOfString;
        hashMap.put("version", i1.W((Context)eZCallApplication));
        param1VarArgs = arrayOfString;
        hashMap.put("default_cc", str4);
        param1VarArgs = arrayOfString;
        hashMap.put("stamp", i1.Q((Context)eZCallApplication, i1.T((Context)eZCallApplication)));
        param1VarArgs = arrayOfString;
        hashMap.put("ip", i1.A());
        param1VarArgs = arrayOfString;
        hashMap.put("reply_time", String.valueOf(this.c / 1000L));
        param1VarArgs = arrayOfString;
        hashMap.put("call_time", this.d);
        param1VarArgs = arrayOfString;
        hashMap.put("is_answered", this.e);
        param1VarArgs = arrayOfString;
        hashMap.put("is_normal", this.f);
        param1VarArgs = arrayOfString;
        hashMap.put("type_label", this.g);
        param1VarArgs = arrayOfString;
        hashMap.put("content", w.c(this.h));
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
          d0.a("submitcomment", stringBuilder.toString());
        } 
        param1VarArgs = arrayOfString;
        String str3 = com.allinone.callerid.j.a.b("https://ct.show-caller.com/c_l/api/v1/scom.php", hashMap);
        str1 = str3;
        str2 = str3;
        if (d0.a) {
          str1 = str3;
          StringBuilder stringBuilder = new StringBuilder();
          str1 = str3;
          this();
          str1 = str3;
          stringBuilder.append("response:");
          str1 = str3;
          stringBuilder.append(str3);
          str1 = str3;
          d0.a("submitcomment", stringBuilder.toString());
          String str = str3;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/i/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */