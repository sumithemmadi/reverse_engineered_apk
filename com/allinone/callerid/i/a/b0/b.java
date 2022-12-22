package com.allinone.callerid.i.a.b0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.CallLog;
import com.allinone.callerid.bean.SpamCall;
import com.allinone.callerid.f.i;
import com.allinone.callerid.main.EZCallApplication;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class b {
  public static void a(a parama) {
    try {
      a a1 = new a();
      this(parama);
      if (a1.getStatus() != AsyncTask.Status.RUNNING) {
        a1.cancel(true);
        a1 = new a();
        this(parama);
        a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, List<SpamCall>> {
    private a a;
    
    a(a param1a) {
      this.a = param1a;
    }
    
    protected List<SpamCall> a(String... param1VarArgs) {
      ArrayList<SpamCall> arrayList = new ArrayList();
      try {
        List<SpamCall> list = i.a().b();
        if (list != null && list.size() > 0)
          for (byte b = 0; b < list.size(); b++) {
            SpamCall spamCall = list.get(b);
            ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
            Uri uri = CallLog.Calls.CONTENT_URI;
            String str = spamCall.getNumber();
            Cursor cursor = contentResolver.query(uri, new String[] { "date", "number", "type", "duration" }, "number=?", new String[] { str }, "date DESC");
            if (cursor != null && cursor.getCount() > 0) {
              SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
              this("dd/MMM", Locale.ENGLISH);
              cursor.moveToFirst();
              cursor.moveToPosition(0);
              Date date = new Date();
              this(cursor.getLong(cursor.getColumnIndex("date")));
              int i = cursor.getInt(cursor.getColumnIndex("type"));
              spamCall.setDate(simpleDateFormat.format(date));
              spamCall.setCalltype(i);
              spamCall.setSelected(true);
              arrayList.add(spamCall);
              cursor.close();
            } 
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return arrayList;
    }
    
    protected void b(List<SpamCall> param1List) {
      super.onPostExecute(param1List);
      this.a.a(param1List);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/b0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */