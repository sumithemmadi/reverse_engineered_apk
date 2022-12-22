package com.allinone.callerid.d.f;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import androidx.core.content.a;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import java.io.File;

public class e {
  public static boolean a(Context paramContext, String paramString1, String paramString2) {
    try {
      File file = new File();
      this(paramString1);
      ContentValues contentValues = new ContentValues();
      this();
      contentValues.put("_data", file.getAbsolutePath());
      contentValues.put("title", paramString2);
      contentValues.put("mime_type", "audio/aac");
      contentValues.put("is_ringtone", Boolean.TRUE);
      Uri uri = MediaStore.Audio.Media.getContentUriForPath(file.getAbsolutePath());
      paramString2 = "";
      Exception exception2 = null;
      try {
        Cursor cursor = paramContext.getContentResolver().query(uri, null, "_data=?", new String[] { paramString1 }, null);
        paramString1 = paramString2;
        if (cursor != null) {
          paramString1 = paramString2;
          if (cursor.moveToFirst())
            paramString1 = cursor.getString(cursor.getColumnIndex("_id")); 
          cursor.close();
        } 
        if (d0.a) {
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("deleteId:");
          stringBuilder1.append(paramString1);
          d0.a("callscreen", stringBuilder1.toString());
        } 
        ContentResolver contentResolver = paramContext.getContentResolver();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("_data=\"");
        stringBuilder.append(file.getAbsolutePath());
        stringBuilder.append("\"");
        contentResolver.delete(uri, stringBuilder.toString(), null);
        Uri uri1 = paramContext.getContentResolver().insert(uri, contentValues);
      } catch (Exception exception1) {
        exception1.printStackTrace();
        exception1 = exception2;
      } 
      if (exception1 != null) {
        RingtoneManager.setActualDefaultRingtoneUri(paramContext, 1, (Uri)exception1);
        return true;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  public static boolean b(Context paramContext, String paramString1, String paramString2, long paramLong) {
    try {
      if (a.a((Context)EZCallApplication.c(), "android.permission.WRITE_CONTACTS") == 0 && a.a((Context)EZCallApplication.c(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
        ContentValues contentValues = new ContentValues();
        this();
        ContentResolver contentResolver = paramContext.getContentResolver();
        File file = new File();
        this(paramString1);
        if (file.exists()) {
          Uri uri = MediaStore.Audio.Media.getContentUriForPath(file.getAbsolutePath());
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("_data=\"");
          stringBuilder.append(file.getAbsolutePath());
          stringBuilder.append("\"");
          contentResolver.delete(uri, stringBuilder.toString(), null);
          uri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, Long.toString(paramLong));
          Cursor cursor = paramContext.getContentResolver().query(uri, new String[] { "_id", "lookup" }, null, null, null);
          if (cursor != null && cursor.moveToFirst()) {
            cursor.moveToFirst();
            uri = ContactsContract.Contacts.getLookupUri(cursor.getLong(0), cursor.getString(1));
            contentValues.put("_data", file.getAbsolutePath());
            contentValues.put("title", paramString2);
            contentValues.put("mime_type", "audio/aac");
            contentValues.put("is_ringtone", Boolean.TRUE);
            Uri uri1 = contentResolver.insert(MediaStore.Audio.Media.getContentUriForPath(file.getAbsolutePath()), contentValues);
            if (uri1 != null) {
              String str = uri1.toString();
              contentValues.put("custom_ringtone", str);
              if (d0.a) {
                StringBuilder stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append("Uri String for:");
                stringBuilder1.append(str);
                d0.a("callscreen", stringBuilder1.toString());
              } 
              paramLong = contentResolver.update(uri, contentValues, null, null);
              if (d0.a) {
                StringBuilder stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append("updated:");
                stringBuilder1.append(paramLong);
                d0.a("callscreen", stringBuilder1.toString());
              } 
            } 
            cursor.close();
          } 
        } else if (d0.a) {
          d0.a("callscreen", "File does not exist");
        } 
      } 
    } catch (Exception exception) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getMessage());
        d0.a("callscreen", stringBuilder.toString());
      } 
      exception.printStackTrace();
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */