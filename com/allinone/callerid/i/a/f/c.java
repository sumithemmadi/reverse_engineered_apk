package com.allinone.callerid.i.a.f;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.CallLog;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.i1;
import java.util.ArrayList;
import java.util.List;

public class c {
  public static void a(j paramj) {
    try {
      a a = new a();
      this(paramj);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private j a;
    
    private ArrayList<CallLogBean> b = new ArrayList<CallLogBean>();
    
    private List<String> c = new ArrayList<String>();
    
    a(j param1j) {
      this.a = param1j;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        EZCallApplication eZCallApplication = EZCallApplication.c();
        if (androidx.core.content.a.a((Context)eZCallApplication, "android.permission.READ_CALL_LOG") == 0) {
          Uri uri = CallLog.Calls.CONTENT_URI;
          ContentResolver contentResolver = eZCallApplication.getContentResolver();
          byte b = 0;
          Cursor cursor = contentResolver.query(uri, new String[] { "number", "name" }, null, null, "date DESC");
          if (cursor != null && cursor.getCount() > 0) {
            this.b.clear();
            this.c.clear();
            cursor.moveToFirst();
            while (b < cursor.getCount()) {
              cursor.moveToPosition(b);
              String str1 = cursor.getString(cursor.getColumnIndex("number"));
              String str2 = cursor.getString(cursor.getColumnIndex("name"));
              if (str1 != null && !i1.v0(str1) && !this.c.contains(str1)) {
                this.c.add(str1);
                CallLogBean callLogBean = new CallLogBean();
                this();
                callLogBean.D0(str1);
                callLogBean.B0(str2);
                if (str2 != null && !"".equals(str2))
                  callLogBean.o0(true); 
                this.b.add(callLogBean);
              } 
              b++;
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
      this.a.a(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */