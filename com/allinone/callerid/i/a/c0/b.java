package com.allinone.callerid.i.a.c0;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import java.util.HashMap;

public class b {
  public static void a(Context paramContext, String paramString1, String paramString2, a parama) {
    try {
      a a1 = new a();
      this(paramContext, paramString1, paramString2, parama);
      if (a1.getStatus() != AsyncTask.Status.RUNNING) {
        a1.cancel(true);
        a1 = new a();
        this(paramContext, paramString1, paramString2, parama);
        a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private a a;
    
    private Context b;
    
    private String c;
    
    private String d;
    
    private String e;
    
    a(Context param1Context, String param1String1, String param1String2, a param1a) {
      this.a = param1a;
      this.b = param1Context;
      this.d = param1String1;
      this.e = param1String2;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        String str1 = i1.G();
        String str2 = i1.Q(this.b, this.e);
        String str3 = i1.T((Context)EZCallApplication.c());
        String str4 = i1.W((Context)EZCallApplication.c());
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        hashMap.put("tel_number", this.e);
        hashMap.put("device", "android");
        hashMap.put("uid", str3);
        hashMap.put("version", str4);
        hashMap.put("cc", this.d);
        hashMap.put("stamp", str2);
        hashMap.put("lang", str1);
        boolean bool = d0.a;
        if (bool) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("params:");
          stringBuilder.append(hashMap.toString());
          d0.a("subtype", stringBuilder.toString());
        } 
        this.c = com.allinone.callerid.j.a.b("https://app.show-caller.com/api/v1/seacomcousub.php", hashMap);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("enlode_result:");
          stringBuilder.append(this.c);
          d0.a("subtype", stringBuilder.toString());
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return this.c;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/c0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */