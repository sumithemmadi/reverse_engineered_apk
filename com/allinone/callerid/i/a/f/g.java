package com.allinone.callerid.i.a.f;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import com.allinone.callerid.bean.EZSimpleContact;
import com.allinone.callerid.main.EZCallApplication;
import java.util.ArrayList;

public class g {
  public static void a(k paramk) {
    try {
      a a = new a();
      this(paramk);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private k a;
    
    private ArrayList<EZSimpleContact> b = new ArrayList<EZSimpleContact>();
    
    a(k param1k) {
      this.a = param1k;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        EZCallApplication eZCallApplication = EZCallApplication.c();
        if (androidx.core.content.a.a((Context)eZCallApplication, "android.permission.READ_CONTACTS") == 0) {
          byte b = 0;
          Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
          Cursor cursor = eZCallApplication.getContentResolver().query(uri, new String[] { "display_name", "sort_key", "contact_id", "data1", "photo_id" }, null, null, "sort_key");
          this.b.clear();
          if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (b < cursor.getCount()) {
              cursor.moveToPosition(b);
              String str3 = cursor.getString(cursor.getColumnIndex("data1"));
              String str1 = cursor.getString(cursor.getColumnIndex("display_name"));
              String str2 = cursor.getString(cursor.getColumnIndex("photo_id"));
              int i = cursor.getInt(cursor.getColumnIndex("contact_id"));
              EZSimpleContact eZSimpleContact = new EZSimpleContact();
              this();
              eZSimpleContact.setId(i);
              eZSimpleContact.setNumber(str3);
              if (str2 != null && !str2.equals(""))
                eZSimpleContact.setPhoto_id(str2); 
              if (str1 != null) {
                eZSimpleContact.setName(str1);
                this.b.add(eZSimpleContact);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */