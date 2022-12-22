package com.allinone.callerid.d.e;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.t;
import java.util.HashMap;
import org.json.JSONObject;

public class a {
  public static void a(String paramString1, String paramString2, b paramb) {
    (new a(paramString1, paramString2, paramb)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  public static void b(String paramString, int paramInt, boolean paramBoolean, b paramb) {
    (new c(paramString, paramInt, paramBoolean, paramb)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  public static void c(String paramString, b paramb) {
    (new d(paramString, paramb)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  private static class a extends AsyncTask<String, String, Boolean> {
    private a.b a;
    
    private String b;
    
    private String c;
    
    a(String param1String1, String param1String2, a.b param1b) {
      this.a = param1b;
      this.b = param1String1;
      this.c = param1String2;
    }
    
    protected Boolean a(String... param1VarArgs) {
      EZCallApplication eZCallApplication = EZCallApplication.c();
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      hashMap.put("uid", i1.T((Context)eZCallApplication));
      hashMap.put("version", i1.W((Context)eZCallApplication));
      hashMap.put("stamp", i1.Q((Context)eZCallApplication, i1.T((Context)eZCallApplication)));
      hashMap.put("id", this.b);
      hashMap.put("action", this.c);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("params: ");
        stringBuilder.append(hashMap.toString());
        d0.a("callscreen", stringBuilder.toString());
      } 
      try {
        String str = com.allinone.callerid.j.a.b("https://app.show-caller.com/caller_screen_v2/v1/recuseact.php", hashMap);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("request: ");
          stringBuilder.append(str);
          d0.a("callscreen", stringBuilder.toString());
        } 
        if (str != null && !"".equals(str)) {
          JSONObject jSONObject = new JSONObject();
          this(str);
          int i = jSONObject.getInt("status");
          if (i == 1)
            return Boolean.TRUE; 
          if (i == -20)
            t.a(); 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Exception: ");
          stringBuilder.append(exception.getMessage());
          d0.a("callscreen", stringBuilder.toString());
        } 
      } 
      return Boolean.TRUE;
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      a.b b1 = this.a;
      if (b1 != null)
        b1.a(); 
    }
    
    protected void c(String... param1VarArgs) {
      super.onProgressUpdate((Object[])param1VarArgs);
    }
  }
  
  public static interface b {
    void a();
  }
  
  private static class c extends AsyncTask<String, String, Boolean> {
    private a.b a;
    
    private String b;
    
    private boolean c;
    
    private int d;
    
    c(String param1String, int param1Int, boolean param1Boolean, a.b param1b) {
      this.a = param1b;
      this.b = param1String;
      this.c = param1Boolean;
      this.d = param1Int;
    }
    
    protected Boolean a(String... param1VarArgs) {
      com.allinone.callerid.d.b.a.a().c(this.b, this.c, this.d);
      return Boolean.TRUE;
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      a.b b1 = this.a;
      if (b1 != null)
        b1.a(); 
    }
    
    protected void c(String... param1VarArgs) {
      super.onProgressUpdate((Object[])param1VarArgs);
    }
  }
  
  private static class d extends AsyncTask<String, String, Boolean> {
    private a.b a;
    
    private String b;
    
    d(String param1String, a.b param1b) {
      this.a = param1b;
      this.b = param1String;
    }
    
    protected Boolean a(String... param1VarArgs) {
      com.allinone.callerid.d.b.a.a().d(this.b, true);
      return Boolean.TRUE;
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      a.b b1 = this.a;
      if (b1 != null)
        b1.a(); 
    }
    
    protected void c(String... param1VarArgs) {
      super.onProgressUpdate((Object[])param1VarArgs);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */