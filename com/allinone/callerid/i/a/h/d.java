package com.allinone.callerid.i.a.h;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Handler;
import android.provider.CallLog;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i;
import java.util.Date;

public class d {
  public static void a(Context paramContext, e parame) {
    try {
      ContentResolver contentResolver = paramContext.getContentResolver();
      int i = androidx.core.content.a.a(paramContext, "android.permission.READ_CALL_LOG");
      long l1 = 0L;
      long l2 = l1;
      if (i == 0) {
        Cursor cursor = contentResolver.query(CallLog.Calls.CONTENT_URI, null, null, null, "date DESC");
        long l = l1;
        if (cursor != null) {
          l = l1;
          if (cursor.getCount() > 0) {
            cursor.moveToNext();
            l = cursor.getLong(cursor.getColumnIndex("date"));
          } 
        } 
        l2 = l;
        if (cursor != null) {
          cursor.close();
          l2 = l;
        } 
      } 
      parame.a(l2);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(Context paramContext) {
    try {
      Handler handler = new Handler();
      this();
      a a = new a();
      this(paramContext);
      handler.postDelayed(a, 1000L);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  static final class a implements Runnable {
    a(Context param1Context) {}
    
    public void run() {
      (new d.b(this.b)).executeOnExecutor(f1.a(), (Object[])new String[0]);
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private Context a;
    
    b(Context param1Context) {
      this.a = param1Context;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        ContentResolver contentResolver = this.a.getContentResolver();
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") != 0)
          return null; 
        Cursor cursor = contentResolver.query(CallLog.Calls.CONTENT_URI, new String[] { "date", "number", "type" }, null, null, "date DESC");
        if (cursor != null && cursor.getCount() > 0) {
          cursor.moveToPosition(0);
          Date date = new Date();
          this(cursor.getLong(cursor.getColumnIndex("date")));
          b1.z1(date.getTime());
        } 
        if (cursor != null)
          cursor.close(); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lasttime:");
        stringBuilder.append(b1.U());
        stringBuilder.append(" format:");
        stringBuilder.append(i.d(b1.U()));
        d0.a("tony", stringBuilder.toString());
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */