package com.allinone.callerid.i.a.l;

import android.os.AsyncTask;
import com.allinone.callerid.bean.NumberContent;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;

public class b {
  public static void a(String paramString, a parama) {
    try {
      a a1 = new a();
      this(paramString, parama);
      a1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(String paramString, a parama) {
    try {
      d d = new d();
      this(paramString, parama);
      d.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(String paramString, a parama) {
    try {
      e e = new e();
      this(paramString, parama);
      e.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void d(String paramString, a parama) {
    try {
      b b1 = new b();
      this(paramString, parama);
      b1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void e(String paramString, a parama) {
    try {
      c c = new c();
      this(paramString, parama);
      c.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void f(String paramString) {
    try {
      f f = new f();
      this(paramString);
      f.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, Boolean> {
    private a a;
    
    private String b;
    
    a(String param1String, a param1a) {
      this.a = param1a;
      this.b = param1String;
    }
    
    protected Boolean a(String... param1VarArgs) {
      return Boolean.valueOf(com.allinone.callerid.f.e.d().a(this.b));
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      this.a.a(param1Boolean.booleanValue());
    }
  }
  
  private static class b extends AsyncTask<String, Void, Boolean> {
    private a a;
    
    private String b;
    
    b(String param1String, a param1a) {
      this.a = param1a;
      this.b = param1String;
    }
    
    protected Boolean a(String... param1VarArgs) {
      return Boolean.valueOf(com.allinone.callerid.f.e.d().b(this.b));
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      this.a.a(param1Boolean.booleanValue());
    }
  }
  
  private static class c extends AsyncTask<String, Void, Boolean> {
    private a a;
    
    private String b;
    
    c(String param1String, a param1a) {
      this.a = param1a;
      this.b = param1String;
    }
    
    protected Boolean a(String... param1VarArgs) {
      return Boolean.valueOf(com.allinone.callerid.f.e.d().c(this.b));
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      this.a.a(param1Boolean.booleanValue());
    }
  }
  
  private static class d extends AsyncTask<String, Void, Boolean> {
    private a a;
    
    private String b;
    
    d(String param1String, a param1a) {
      this.a = param1a;
      this.b = param1String;
    }
    
    protected Boolean a(String... param1VarArgs) {
      try {
        NumberContent numberContent = com.allinone.callerid.f.e.d().e(this.b);
        if (numberContent != null && d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("numberContent:");
          stringBuilder.append(numberContent.toString());
          d0.a("comment", stringBuilder.toString());
        } 
        return (numberContent != null && numberContent.getSubmit_commentst_time() != 0L) ? Boolean.FALSE : ((numberContent != null && numberContent.getShow_submit_comment_time() != 0L && System.currentTimeMillis() - numberContent.getShow_submit_comment_time() < 86400000L) ? Boolean.FALSE : Boolean.TRUE);
      } catch (Exception exception) {
        exception.printStackTrace();
        return Boolean.FALSE;
      } 
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      this.a.a(param1Boolean.booleanValue());
    }
  }
  
  private static class e extends AsyncTask<String, Void, Boolean> {
    private a a;
    
    private String b;
    
    e(String param1String, a param1a) {
      this.a = param1a;
      this.b = param1String;
    }
    
    protected Boolean a(String... param1VarArgs) {
      try {
        NumberContent numberContent = com.allinone.callerid.f.e.d().e(this.b);
        if (numberContent != null && d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("numberContent:");
          stringBuilder.append(numberContent.toString());
          d0.a("comment", stringBuilder.toString());
        } 
        return (numberContent != null && numberContent.getSubmit_commentst_time() != 0L && System.currentTimeMillis() - numberContent.getSubmit_commentst_time() < 86400000L) ? Boolean.FALSE : Boolean.TRUE;
      } catch (Exception exception) {
        exception.printStackTrace();
        return Boolean.TRUE;
      } 
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      this.a.a(param1Boolean.booleanValue());
    }
  }
  
  private static class f extends AsyncTask<String, Void, Boolean> {
    private String a;
    
    f(String param1String) {
      this.a = param1String;
    }
    
    protected Boolean a(String... param1VarArgs) {
      com.allinone.callerid.f.e.d().j(this.a);
      return Boolean.TRUE;
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */