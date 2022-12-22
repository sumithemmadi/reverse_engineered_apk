package com.allinone.callerid.util;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.allinone.callerid.bean.ShortCut;
import java.lang.reflect.Field;
import java.util.HashMap;

public class o extends SQLiteOpenHelper {
  public o(Context paramContext) {
    super(paramContext, "usershortcut", null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS usershortcut(_id integer primary key,name varchar,number varchar)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    if (paramInt2 != paramInt1)
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        Cursor cursor = paramSQLiteDatabase.rawQuery("select * from usershortcut", null);
        int i = cursor.getColumnCount();
        paramInt2 = 0;
        for (paramInt1 = 0; paramInt1 < i; paramInt1++)
          hashMap.put(cursor.getColumnName(paramInt1), cursor.getColumnName(paramInt1)); 
        cursor.close();
        Field[] arrayOfField = ShortCut.class.getDeclaredFields();
        for (paramInt1 = paramInt2; paramInt1 < arrayOfField.length; paramInt1++) {
          if (!hashMap.containsKey(arrayOfField[paramInt1].getName())) {
            hashMap.put(arrayOfField[paramInt1].getName(), arrayOfField[paramInt1].getName());
            boolean bool = arrayOfField[paramInt1].getType().toString().equals("class java.lang.String");
            if (bool) {
              bool = "ismyblocklist".equals(arrayOfField[paramInt1].getName());
              if (bool) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("alter table usershortcut add ");
                stringBuilder.append(arrayOfField[paramInt1].getName());
                stringBuilder.append(" TEXT ");
                stringBuilder.append("NOT NULL DEFAULT false");
                paramSQLiteDatabase.execSQL(stringBuilder.toString());
              } else {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("alter table usershortcut add ");
                stringBuilder.append(arrayOfField[paramInt1].getName());
                stringBuilder.append(" TEXT ");
                paramSQLiteDatabase.execSQL(stringBuilder.toString());
              } 
            } else if (arrayOfField[paramInt1].getType().equals("int") || arrayOfField[paramInt1].getType().equals("long") || arrayOfField[paramInt1].getType().equals("boolean")) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("alter table usershortcut add ");
              stringBuilder.append(arrayOfField[paramInt1].getName());
              stringBuilder.append(" INTEGER ");
              paramSQLiteDatabase.execSQL(stringBuilder.toString());
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */