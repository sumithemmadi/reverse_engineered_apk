package com.allinone.callerid.c.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.allinone.callerid.util.d0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class a {
  public static void a(Context paramContext) {
    try {
      if (androidx.core.content.a.a(paramContext, "android.permission.READ_CONTACTS") == 0) {
        Cursor cursor = paramContext.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        if (cursor != null) {
          int i = cursor.getColumnIndex("lookup");
          try {
            FileOutputStream fileOutputStream = new FileOutputStream();
            this(com.allinone.callerid.c.a.a.a);
            byte[] arrayOfByte = new byte[1024];
            while (cursor.moveToNext()) {
              String str = cursor.getString(i);
              Uri uri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str);
              AssetFileDescriptor assetFileDescriptor = paramContext.getContentResolver().openAssetFileDescriptor(uri, "r");
              if (assetFileDescriptor != null) {
                FileInputStream fileInputStream = assetFileDescriptor.createInputStream();
                while (true) {
                  int j = fileInputStream.read(arrayOfByte);
                  if (j != -1) {
                    fileOutputStream.write(arrayOfByte, 0, j);
                    continue;
                  } 
                  fileInputStream.close();
                } 
              } 
            } 
            fileOutputStream.close();
            cursor.close();
          } catch (Exception exception) {
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("exportContactsException:");
              stringBuilder.append(exception.getMessage());
              d0.a("backup", stringBuilder.toString());
            } 
            exception.printStackTrace();
          } 
        } 
        if (d0.a)
          d0.a("backup", "exportContacts ok"); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(Context paramContext) {
    try {
      File file = new File();
      this(com.allinone.callerid.c.a.a.a);
      if (file.exists()) {
        Intent intent = new Intent();
        this();
        intent.setPackage("com.android.contacts");
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(file), "text/x-vcard");
        intent.setFlags(268435456);
        paramContext.startActivity(intent);
      } 
    } catch (Exception exception) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getMessage());
        d0.a("backup", stringBuilder.toString());
      } 
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/c/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */