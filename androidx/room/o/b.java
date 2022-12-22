package androidx.room.o;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import androidx.room.RoomDatabase;
import b.r.a.e;
import java.util.ArrayList;

public class b {
  public static void a(b.r.a.b paramb) {
    ArrayList<String> arrayList = new ArrayList();
    Cursor cursor = paramb.R("SELECT name FROM sqlite_master WHERE type = 'trigger'");
    try {
      while (cursor.moveToNext())
        arrayList.add(cursor.getString(0)); 
      cursor.close();
      return;
    } finally {
      cursor.close();
    } 
  }
  
  public static Cursor b(RoomDatabase paramRoomDatabase, e parame, boolean paramBoolean) {
    AbstractWindowedCursor abstractWindowedCursor;
    Cursor cursor = paramRoomDatabase.p(parame);
    null = cursor;
    if (paramBoolean) {
      null = cursor;
      if (cursor instanceof AbstractWindowedCursor) {
        int j;
        abstractWindowedCursor = (AbstractWindowedCursor)cursor;
        int i = abstractWindowedCursor.getCount();
        if (abstractWindowedCursor.hasWindow()) {
          j = abstractWindowedCursor.getWindow().getNumRows();
        } else {
          j = i;
        } 
        if (Build.VERSION.SDK_INT >= 23) {
          null = cursor;
          return (j < i) ? a.a((Cursor)abstractWindowedCursor) : null;
        } 
      } else {
        return null;
      } 
    } else {
      return null;
    } 
    return a.a((Cursor)abstractWindowedCursor);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/o/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */