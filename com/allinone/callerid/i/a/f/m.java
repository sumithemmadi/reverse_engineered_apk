package com.allinone.callerid.i.a.f;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.CallLog;
import com.allinone.callerid.util.i;
import java.util.Date;

public class m {
  public static void a(Context paramContext, String paramString, o paramo) {
    try {
      a a = new a();
      this(paramContext, paramString, paramo);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private o a;
    
    private Context b;
    
    private String c;
    
    private String d;
    
    private String e;
    
    a(Context param1Context, String param1String, o param1o) {
      this.a = param1o;
      this.b = param1Context;
      this.c = param1String;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        ContentResolver contentResolver = this.b.getContentResolver();
        if (androidx.core.content.a.a(this.b, "android.permission.READ_CALL_LOG") == 0) {
          Cursor cursor = contentResolver.query(CallLog.Calls.CONTENT_URI, null, "number=?", new String[] { this.c }, "date DESC");
          if (cursor != null && cursor.getCount() > 0)
            while (cursor.moveToNext()) {
              int i = cursor.getInt(cursor.getColumnIndex("type"));
              if (i != 2) {
                long l = cursor.getLong(cursor.getColumnIndex("date"));
                if (i == 1) {
                  this.d = "1";
                } else {
                  this.d = "0";
                } 
                Date date = new Date();
                this(l);
                this.e = i.b(date);
                break;
              } 
            }  
          if (cursor != null)
            cursor.close(); 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(this.e, this.d);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/f/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */