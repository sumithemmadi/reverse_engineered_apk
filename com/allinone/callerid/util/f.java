package com.allinone.callerid.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class f {
  public static void a(Context paramContext, String paramString, a parama) {
    Cursor cursor2;
    String str1 = "";
    byte b1 = 0;
    byte b2 = 0;
    StringBuilder stringBuilder1 = null;
    Cursor cursor1 = null;
    String str2 = str1;
    int i = b1;
    StringBuilder stringBuilder2 = stringBuilder1;
    if (paramString != null) {
      int j = b2;
      Cursor cursor = cursor1;
      str2 = str1;
      i = b1;
      stringBuilder2 = stringBuilder1;
      try {
        if (!"".equals(paramString)) {
          j = b2;
          cursor = cursor1;
          stringBuilder2 = new StringBuilder();
          j = b2;
          cursor = cursor1;
          this();
          j = b2;
          cursor = cursor1;
          stringBuilder2.append("content://com.android.contacts/data/phones/filter/");
          j = b2;
          cursor = cursor1;
          stringBuilder2.append(paramString);
          j = b2;
          cursor = cursor1;
          Uri uri = Uri.parse(stringBuilder2.toString());
          j = b2;
          cursor = cursor1;
          Cursor cursor3 = paramContext.getContentResolver().query(uri, new String[] { "contact_id", "display_name" }, null, null, null);
          str2 = str1;
          i = b1;
          cursor2 = cursor3;
          if (cursor3 != null) {
            j = b2;
            cursor = cursor3;
            str2 = str1;
            i = b1;
            cursor2 = cursor3;
            if (cursor3.getCount() > 0) {
              j = b2;
              cursor = cursor3;
              cursor3.moveToFirst();
              j = b2;
              cursor = cursor3;
              i = cursor3.getInt(0);
              j = i;
              cursor = cursor3;
              str2 = cursor3.getString(1);
              cursor2 = cursor3;
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        cursor2 = cursor;
        i = j;
        str2 = str1;
      } 
    } 
    if (cursor2 != null)
      cursor2.close(); 
    if (parama != null)
      parama.a(i, str2); 
  }
  
  public static interface a {
    void a(int param1Int, String param1String);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */