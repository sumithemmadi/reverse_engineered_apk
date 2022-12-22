package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.b;
import androidx.room.k;
import androidx.room.o.b;
import b.r.a.e;
import b.r.a.f;
import java.util.ArrayList;
import java.util.List;

public final class c implements b {
  private final RoomDatabase a;
  
  private final b b;
  
  public c(RoomDatabase paramRoomDatabase) {
    this.a = paramRoomDatabase;
    this.b = new a(this, paramRoomDatabase);
  }
  
  public void a(a parama) {
    this.a.b();
    this.a.c();
    try {
      this.b.h(parama);
      this.a.q();
      return;
    } finally {
      this.a.g();
    } 
  }
  
  public List<String> b(String paramString) {
    k k = k.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
    if (paramString == null) {
      k.Y(1);
    } else {
      k.n(1, paramString);
    } 
    this.a.b();
    Cursor cursor = b.b(this.a, (e)k, false);
    try {
      ArrayList<String> arrayList = new ArrayList();
      this(cursor.getCount());
      while (cursor.moveToNext())
        arrayList.add(cursor.getString(0)); 
      return arrayList;
    } finally {
      cursor.close();
      k.h();
    } 
  }
  
  public boolean c(String paramString) {
    boolean bool1 = true;
    k k = k.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
    if (paramString == null) {
      k.Y(1);
    } else {
      k.n(1, paramString);
    } 
    this.a.b();
    null = this.a;
    boolean bool2 = false;
    Cursor cursor = b.b(null, (e)k, false);
    try {
      if (cursor.moveToFirst()) {
        int i = cursor.getInt(0);
        if (i != 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        } 
      } 
      return bool2;
    } finally {
      cursor.close();
      k.h();
    } 
  }
  
  public boolean d(String paramString) {
    boolean bool1 = true;
    k k = k.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
    if (paramString == null) {
      k.Y(1);
    } else {
      k.n(1, paramString);
    } 
    this.a.b();
    null = this.a;
    boolean bool2 = false;
    Cursor cursor = b.b(null, (e)k, false);
    try {
      if (cursor.moveToFirst()) {
        int i = cursor.getInt(0);
        if (i != 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        } 
      } 
      return bool2;
    } finally {
      cursor.close();
      k.h();
    } 
  }
  
  class a extends b<a> {
    a(c this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
    
    public void i(f param1f, a param1a) {
      String str2 = param1a.a;
      if (str2 == null) {
        param1f.Y(1);
      } else {
        param1f.n(1, str2);
      } 
      String str1 = param1a.b;
      if (str1 == null) {
        param1f.Y(2);
      } else {
        param1f.n(2, str1);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */