package com.allinone.callerid.i.a.j;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i1;

public class f {
  public static void a(Context paramContext, String paramString, d paramd) {
    try {
      b b = new b();
      this(paramContext, paramString, paramd);
      b.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(Context paramContext, String paramString, e parame) {
    try {
      a a = new a();
      this(paramContext, paramString, parame);
      a.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private e a;
    
    private String b;
    
    private Context c;
    
    private int d;
    
    a(Context param1Context, String param1String, e param1e) {
      this.a = param1e;
      this.b = param1String;
      this.c = param1Context;
    }
    
    protected String a(String... param1VarArgs) {
      this.d = i1.Z(this.c, this.b);
      return i1.w(this.c, this.b);
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(this.d, param1String);
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private d a;
    
    private String b;
    
    private Context c;
    
    b(Context param1Context, String param1String, d param1d) {
      this.a = param1d;
      this.b = param1String;
      this.c = param1Context;
    }
    
    protected String a(String... param1VarArgs) {
      return i1.w(this.c, this.b);
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/j/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */