package com.allinone.callerid.i.a.j;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.m;

public class h {
  public static void a(Context paramContext, String paramString1, String paramString2, g paramg) {
    try {
      a a = new a();
      this(paramContext, paramString1, paramString2, paramg);
      a.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private g a;
    
    private String b;
    
    private String c;
    
    private String d;
    
    private String e;
    
    private boolean f;
    
    private boolean g;
    
    private boolean h;
    
    private Context i;
    
    a(Context param1Context, String param1String1, String param1String2, g param1g) {
      this.a = param1g;
      this.b = param1String1;
      this.c = param1String2;
      this.i = param1Context;
    }
    
    protected String a(String... param1VarArgs) {
      this.e = this.i.getResources().getString(2131755466);
      String str = i1.w(this.i, this.b);
      this.d = str;
      if (str == null) {
        str = this.c;
        if (str != null && !"".equals(str)) {
          this.d = this.c;
        } else {
          this.d = this.b;
        } 
        if (b1.S()) {
          this.e = this.i.getResources().getString(2131755423);
        } else if (i1.y0(this.i) > 1) {
          this.d = i1.I(this.i);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(i1.y0(this.i));
          stringBuilder.append(" ");
          stringBuilder.append(this.i.getResources().getString(2131755470));
          this.e = stringBuilder.toString();
        } else {
          this.e = this.i.getResources().getString(2131755466);
        } 
      } else if (i1.y0(this.i) > 1) {
        this.d = i1.I(this.i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i1.y0(this.i));
        stringBuilder.append(" ");
        stringBuilder.append(this.i.getResources().getString(2131755470));
        this.e = stringBuilder.toString();
      } else {
        this.e = this.i.getResources().getString(2131755466);
      } 
      b1.x1(false);
      m m = new m(this.i);
      if (b1.u() && m.j(this.b).booleanValue()) {
        this.e = this.i.getResources().getString(2131755121);
        String str1 = this.c;
        if (str1 != null && !"".equals(str1)) {
          this.d = this.c;
        } else {
          this.d = this.b;
        } 
        this.f = true;
      } else if (b1.G()) {
        b1.l1(false);
        this.e = this.i.getResources().getString(2131755121);
        String str1 = this.c;
        if (str1 != null && !"".equals(str1)) {
          this.d = this.c;
        } else {
          this.d = this.b;
        } 
        this.f = true;
      } 
      this.g = b1.v2().booleanValue();
      this.h = b1.m2().booleanValue();
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(this.d, this.e, this.f, this.g, this.h);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/j/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */