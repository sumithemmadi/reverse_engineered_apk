package com.allinone.callerid.util;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.allinone.callerid.model.EZSearchContacts;

public class o0 {
  private SQLiteDatabase a;
  
  private p0 b;
  
  public o0(Context paramContext) {
    p0 p01 = new p0(paramContext);
    this.b = p01;
    try {
      this.a = p01.getWritableDatabase();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void b() {
    SQLiteDatabase sQLiteDatabase = this.a;
    if (sQLiteDatabase != null)
      sQLiteDatabase.close(); 
  }
  
  public EZSearchContacts a(String paramString1, String paramString2) {
    EZSearchContacts eZSearchContacts3;
    EZSearchContacts eZSearchContacts1 = null;
    String str = null;
    EZSearchContacts eZSearchContacts2 = eZSearchContacts1;
    try {
      String str1 = e0.b(paramString1);
      eZSearchContacts2 = eZSearchContacts1;
      Cursor cursor = this.a.query("android_spam", null, "tel_number=?", new String[] { str1 }, null, null, null);
      str1 = str;
      if (cursor != null) {
        str1 = str;
        eZSearchContacts2 = eZSearchContacts1;
        if (cursor.moveToFirst()) {
          eZSearchContacts2 = eZSearchContacts1;
          eZSearchContacts3 = new EZSearchContacts();
          eZSearchContacts2 = eZSearchContacts1;
          this();
          try {
            eZSearchContacts3.setSearched(true);
            eZSearchContacts3.setOld_tel_number(paramString2);
            eZSearchContacts3.setTel_number(paramString1);
            eZSearchContacts3.setOperator(cursor.getString(cursor.getColumnIndex("operator")));
            eZSearchContacts3.setType(cursor.getString(cursor.getColumnIndex("type")));
            eZSearchContacts3.setName(cursor.getString(cursor.getColumnIndex("name")));
            eZSearchContacts3.setReport_count(cursor.getString(cursor.getColumnIndex("report_count")));
            eZSearchContacts3.setType_label(cursor.getString(cursor.getColumnIndex("type_label")));
            eZSearchContacts3.setBelong_area(cursor.getString(cursor.getColumnIndex("belong_area")));
            if (d0.a)
              d0.a("searchofflinedata", eZSearchContacts3.toString()); 
          } catch (Exception exception) {
            eZSearchContacts2 = eZSearchContacts3;
          } 
        } 
      } 
      if (cursor != null) {
        eZSearchContacts2 = eZSearchContacts3;
        cursor.close();
      } 
      eZSearchContacts2 = eZSearchContacts3;
      b();
    } catch (Exception exception) {
      exception.printStackTrace();
      eZSearchContacts3 = eZSearchContacts2;
    } 
    return eZSearchContacts3;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */