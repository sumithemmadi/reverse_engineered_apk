package com.allinone.callerid.util;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.InputStream;

public class c {
  private Context a;
  
  public c(Context paramContext) {
    this.a = paramContext;
  }
  
  public Bitmap a(String paramString) {
    Bitmap bitmap2;
    Bitmap bitmap1 = null;
    Uri uri = null;
    Bitmap bitmap3 = bitmap1;
    try {
      Bitmap bitmap;
      StringBuilder stringBuilder = new StringBuilder();
      bitmap3 = bitmap1;
      this();
      bitmap3 = bitmap1;
      stringBuilder.append("content://com.android.contacts/data/phones/filter/");
      bitmap3 = bitmap1;
      stringBuilder.append(paramString);
      bitmap3 = bitmap1;
      Uri uri1 = Uri.parse(stringBuilder.toString());
      bitmap3 = bitmap1;
      Cursor cursor = this.a.getContentResolver().query(uri1, null, null, null, null);
      uri1 = uri;
      if (cursor != null) {
        uri1 = uri;
        bitmap3 = bitmap1;
        if (cursor.getCount() > 0) {
          bitmap3 = bitmap1;
          cursor.moveToFirst();
          bitmap3 = bitmap1;
          long l = cursor.getLong(cursor.getColumnIndex("contact_id"));
          bitmap3 = bitmap1;
          uri1 = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.valueOf(l).longValue());
          bitmap3 = bitmap1;
          InputStream inputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.a.getContentResolver(), uri1);
          uri1 = uri;
          if (inputStream != null) {
            bitmap3 = bitmap1;
            Bitmap bitmap4 = BitmapFactory.decodeStream(inputStream);
            uri1 = uri;
            if (bitmap4 != null) {
              bitmap3 = bitmap1;
              bitmap = b(bitmap4);
            } 
          } 
        } 
      } 
      bitmap2 = bitmap;
      if (cursor != null) {
        bitmap3 = bitmap;
        cursor.close();
        bitmap2 = bitmap;
      } 
    } catch (Exception exception) {
      bitmap2 = bitmap3;
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramString);
        stringBuilder.append("出错啦:");
        stringBuilder.append(exception.getMessage());
        d0.a("quick", stringBuilder.toString());
        bitmap2 = bitmap3;
      } 
    } 
    return bitmap2;
  }
  
  public Bitmap b(Bitmap paramBitmap) {
    float f1;
    float f2;
    float f3;
    float f4;
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    if (i <= j) {
      f1 = (i / 2);
      f2 = i;
      f3 = f2;
      f4 = 0.0F;
    } else {
      f1 = (j / 2);
      f4 = ((i - j) / 2);
      f2 = i;
      f3 = j;
      f2 -= f4;
      i = j;
    } 
    Bitmap bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(bitmap);
    Paint paint = new Paint();
    Rect rect1 = new Rect((int)f4, (int)0.0F, (int)f2, (int)f3);
    Rect rect2 = new Rect((int)0.0F, (int)0.0F, (int)f3, (int)f3);
    RectF rectF = new RectF(rect2);
    paint.setAntiAlias(true);
    canvas.drawARGB(0, 0, 0, 0);
    paint.setColor(-12434878);
    canvas.drawRoundRect(rectF, f1, f1, paint);
    paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    canvas.drawBitmap(paramBitmap, rect1, rect2, paint);
    return bitmap;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */