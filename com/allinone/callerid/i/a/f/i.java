package com.allinone.callerid.i.a.f;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.CallLog;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import java.util.List;

public class i {
  public static void a(h paramh) {
    try {
      a a = new a();
      this(paramh);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(Context paramContext, String paramString, h paramh) {
    try {
      b b = new b();
      this(paramContext, paramString, paramh);
      b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(Context paramContext, String paramString, h paramh) {
    try {
      c c = new c();
      this(paramContext, paramString, paramh);
      c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void d(List<CallLogBean> paramList, h paramh) {
    try {
      d d = new d();
      this(paramList, paramh);
      d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private h a;
    
    a(h param1h) {
      this.a = param1h;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.WRITE_CALL_LOG") == 0)
          EZCallApplication.c().getContentResolver().delete(CallLog.Calls.CONTENT_URI, null, null); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a();
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private h a;
    
    private Context b;
    
    private String c;
    
    b(Context param1Context, String param1String, h param1h) {
      this.a = param1h;
      this.b = param1Context;
      this.c = param1String;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        if (androidx.core.content.a.a(this.b, "android.permission.WRITE_CALL_LOG") == 0)
          EZCallApplication.c().getContentResolver().delete(CallLog.Calls.CONTENT_URI, "_id=?", new String[] { this.c }); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a();
    }
  }
  
  private static class c extends AsyncTask<String, Void, String> {
    private h a;
    
    private Context b;
    
    private String c;
    
    c(Context param1Context, String param1String, h param1h) {
      this.a = param1h;
      this.b = param1Context;
      this.c = param1String;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        if (androidx.core.content.a.a(this.b, "android.permission.WRITE_CALL_LOG") == 0)
          this.b.getContentResolver().delete(CallLog.Calls.CONTENT_URI, "number=?", new String[] { this.c }); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a();
    }
  }
  
  private static class d extends AsyncTask<String, Void, String> {
    private h a;
    
    private List<CallLogBean> b;
    
    d(List<CallLogBean> param1List, h param1h) {
      this.a = param1h;
      this.b = param1List;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        if (com.allinone.callerid.util.k1.a.b((Context)EZCallApplication.c(), "android.permission.WRITE_CALL_LOG"))
          for (byte b = 0; b < this.b.size(); b++) {
            CallLogBean callLogBean = this.b.get(b);
            ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
            Uri uri = CallLog.Calls.CONTENT_URI;
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("number=? and (type=");
            stringBuilder.append(callLogBean.M());
            stringBuilder.append(")");
            contentResolver.delete(uri, stringBuilder.toString(), new String[] { callLogBean.p() });
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */