package com.allinone.callerid.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import java.util.ArrayList;
import java.util.List;

public class n {
  private SQLiteDatabase a;
  
  private o b;
  
  public n(Context paramContext) {
    this.b = new o(paramContext);
  }
  
  private void a() {
    SQLiteDatabase sQLiteDatabase = this.a;
    if (sQLiteDatabase != null)
      sQLiteDatabase.close(); 
  }
  
  public void b(String paramString) {
    try {
      SQLiteDatabase sQLiteDatabase = this.b.getWritableDatabase();
      this.a = sQLiteDatabase;
      int i = sQLiteDatabase.delete("usershortcut", "number=?", new String[] { paramString });
      if (i > 0L) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(paramString);
          stringBuilder.append("删除成功");
          d0.a("quick", stringBuilder.toString());
        } 
      } else if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(paramString);
        stringBuilder.append("删除失败");
        d0.a("quick", stringBuilder.toString());
      } 
      a();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public List<CallLogBean> c() {
    ArrayList<CallLogBean> arrayList = new ArrayList();
    try {
      SQLiteDatabase sQLiteDatabase = this.b.getWritableDatabase();
      this.a = sQLiteDatabase;
      Cursor cursor = sQLiteDatabase.query("usershortcut", null, null, null, null, null, null);
      cursor.moveToFirst();
      while (!cursor.isAfterLast() && cursor.getString(1) != null) {
        CallLogBean callLogBean = new CallLogBean();
        this();
        callLogBean.B0(cursor.getString(cursor.getColumnIndex("name")));
        String str = cursor.getString(cursor.getColumnIndex("number"));
        callLogBean.D0(str);
        callLogBean.I0(i1.Z((Context)EZCallApplication.c(), str));
        if (arrayList.contains(callLogBean)) {
          arrayList.remove(callLogBean);
        } else {
          arrayList.add(callLogBean);
        } 
        cursor.moveToNext();
      } 
      cursor.close();
      a();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("快捷联系人长度:");
        stringBuilder.append(arrayList.size());
        d0.a("quick", stringBuilder.toString());
      } 
      return arrayList;
    } catch (Exception exception) {
      exception.printStackTrace();
      return arrayList;
    } 
  }
  
  public Boolean d(String paramString) {
    SQLiteDatabase sQLiteDatabase = this.b.getWritableDatabase();
    this.a = sQLiteDatabase;
    boolean bool1 = false;
    boolean bool2 = bool1;
    try {
      Cursor cursor = sQLiteDatabase.query("usershortcut", null, "number=?", new String[] { paramString }, null, null, null);
      bool2 = bool1;
      bool1 = cursor.moveToFirst();
      bool2 = bool1;
      int i = cursor.getCount();
      if (i > 0) {
        bool2 = bool1;
        if (d0.a) {
          bool2 = bool1;
          StringBuilder stringBuilder = new StringBuilder();
          bool2 = bool1;
          this();
          bool2 = bool1;
          stringBuilder.append(paramString);
          bool2 = bool1;
          stringBuilder.append("查询成功");
          bool2 = bool1;
          d0.a("quick", stringBuilder.toString());
        } 
      } else {
        bool2 = bool1;
        if (d0.a) {
          bool2 = bool1;
          StringBuilder stringBuilder = new StringBuilder();
          bool2 = bool1;
          this();
          bool2 = bool1;
          stringBuilder.append(paramString);
          bool2 = bool1;
          stringBuilder.append("失败");
          bool2 = bool1;
          d0.a("quick", stringBuilder.toString());
        } 
      } 
      bool2 = bool1;
      cursor.close();
      bool2 = bool1;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    a();
    return Boolean.valueOf(bool2);
  }
  
  public void e(CallLogBean paramCallLogBean) {
    try {
      this.a = this.b.getWritableDatabase();
      ContentValues contentValues = new ContentValues();
      this();
      String str1 = paramCallLogBean.n();
      String str2 = paramCallLogBean.p();
      String str3 = str1;
      if (str1 == null)
        str3 = paramCallLogBean.p(); 
      contentValues.put("name", str3);
      contentValues.put("number", str2);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("name==");
        stringBuilder.append(str3);
        stringBuilder.append("----number==");
        stringBuilder.append(str2);
        d0.a("quick", stringBuilder.toString());
      } 
      Cursor cursor = this.a.query("usershortcut", null, "number=?", new String[] { str2 }, null, null, null);
      if (!cursor.moveToFirst())
        if (Long.valueOf(this.a.insert("usershortcut", null, contentValues)).longValue() > 0L) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(str2);
            stringBuilder.append("保存成功");
            d0.a("quick", stringBuilder.toString());
          } 
        } else if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(str2);
          stringBuilder.append("保存失败");
          d0.a("quick", stringBuilder.toString());
        }  
      cursor.close();
      a();
    } catch (Exception exception) {
      exception.printStackTrace();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("出错啦");
        stringBuilder.append(exception.getMessage());
        d0.a("quick", stringBuilder.toString());
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */