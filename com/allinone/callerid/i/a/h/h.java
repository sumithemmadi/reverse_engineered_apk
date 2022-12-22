package com.allinone.callerid.i.a.h;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.CallLog;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import java.util.Date;

public class h {
  public static void a(Context paramContext) {
    try {
      a a = new a();
      this(paramContext);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private Context a;
    
    a(Context param1Context) {
      this.a = param1Context;
    }
    
    protected String a(String... param1VarArgs) {
      byte b = 0;
      try {
        Cursor cursor = this.a.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[] { "date", "number", "type" }, null, null, "date DESC");
        if (cursor != null && cursor.getCount() > 0) {
          cursor.moveToFirst();
          while (b < cursor.getCount()) {
            cursor.moveToPosition(b);
            Date date = new Date();
            this(cursor.getLong(cursor.getColumnIndex("date")));
            String str = cursor.getString(cursor.getColumnIndex("number"));
            if (cursor.getInt(cursor.getColumnIndex("type")) != 2 && !i1.Y(this.a, str)) {
              b1.A1(date.getTime());
              break;
            } 
            b++;
          } 
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
        stringBuilder.append(b1.V());
        stringBuilder.append(" format:");
        stringBuilder.append(i.d(b1.V()));
        d0.a("collectinfo", stringBuilder.toString());
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/h/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */