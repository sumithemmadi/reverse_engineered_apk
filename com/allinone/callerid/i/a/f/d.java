package com.allinone.callerid.i.a.f;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.CallLog;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.f1;

public class d {
  public static void a(String paramString, a parama) {
    try {
      a a1 = new a();
      this(paramString, parama);
      a1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, Long> {
    private a a;
    
    private String b;
    
    a(String param1String, a param1a) {
      this.a = param1a;
      this.b = param1String;
    }
    
    protected Long a(String... param1VarArgs) {
      ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
      int i = androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG");
      long l1 = 0L;
      long l2 = l1;
      if (i == 0) {
        Uri uri = CallLog.Calls.CONTENT_URI;
        String str = this.b.replace(" ", "");
        Cursor cursor = contentResolver.query(uri, new String[] { "date" }, "number=?", new String[] { str }, "date DESC");
        long l = l1;
        if (cursor != null) {
          l = l1;
          if (cursor.moveToFirst())
            l = cursor.getLong(0); 
        } 
        l2 = l;
        if (cursor != null) {
          cursor.close();
          l2 = l;
        } 
      } 
      return Long.valueOf(l2);
    }
    
    protected void b(Long param1Long) {
      super.onPostExecute(param1Long);
      this.a.a(param1Long.longValue());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */