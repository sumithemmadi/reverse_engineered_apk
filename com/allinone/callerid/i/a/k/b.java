package com.allinone.callerid.i.a.k;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.CallLog;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;

public class b {
  private static boolean c(String paramString) {
    return (com.allinone.callerid.util.j1.a.f() && com.allinone.callerid.util.k1.a.c((Context)EZCallApplication.c()) && i1.Y((Context)EZCallApplication.c(), paramString)) ? true : ((com.allinone.callerid.util.j1.a.g() && com.allinone.callerid.f.j.a.b().c(paramString)));
  }
  
  public static void d(String paramString, a parama) {
    try {
      a a1 = new a();
      this(paramString, parama);
      a1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static boolean e(String paramString) {
    boolean bool1 = com.allinone.callerid.util.j1.a.h();
    boolean bool = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (bool1) {
      bool1 = bool;
      bool4 = bool2;
      try {
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
          bool1 = bool;
          Cursor cursor = EZCallApplication.c().getContentResolver().query(CallLog.Calls.CONTENT_URI, null, "number=?", new String[] { paramString }, "date DESC");
          bool2 = bool3;
          if (cursor != null) {
            bool2 = bool3;
            bool1 = bool;
            if (cursor.getCount() > 0) {
              bool1 = bool;
              cursor.moveToNext();
              bool2 = bool3;
              bool1 = bool;
              if (cursor.getInt(cursor.getColumnIndex("type")) != 2) {
                bool1 = bool;
                long l = cursor.getLong(cursor.getColumnIndex("date"));
                bool2 = bool3;
                if (l != 0L) {
                  bool2 = bool3;
                  bool1 = bool;
                  if (System.currentTimeMillis() - l < 180000L)
                    bool2 = true; 
                } 
              } 
            } 
          } 
          bool4 = bool2;
          if (cursor != null) {
            bool1 = bool2;
            cursor.close();
            bool4 = bool2;
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        bool4 = bool1;
      } 
    } 
    return bool4;
  }
  
  private static class a extends AsyncTask<String, Void, Boolean> {
    private String a;
    
    private a b;
    
    a(String param1String, a param1a) {
      this.a = param1String;
      this.b = param1a;
    }
    
    protected Boolean a(String... param1VarArgs) {
      return com.allinone.callerid.util.j1.a.i() ? (!b.a(this.a) ? (!b.b(this.a) ? (com.allinone.callerid.util.j1.a.j() ? (com.allinone.callerid.f.j.b.a().c() ? (i.q(com.allinone.callerid.util.j1.a.a(), com.allinone.callerid.util.j1.a.b(), com.allinone.callerid.util.j1.a.d(), com.allinone.callerid.util.j1.a.e()) ? Boolean.TRUE : Boolean.FALSE) : Boolean.FALSE) : Boolean.TRUE) : Boolean.FALSE) : Boolean.FALSE) : Boolean.FALSE;
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      a a1 = this.b;
      if (a1 != null)
        a1.a(param1Boolean.booleanValue()); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */