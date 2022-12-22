package androidx.room.o;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class d {
  public final String a;
  
  public final Map<String, a> b;
  
  public final Set<b> c;
  
  public final Set<d> d;
  
  public d(String paramString, Map<String, a> paramMap, Set<b> paramSet, Set<d> paramSet1) {
    Set<d> set;
    this.a = paramString;
    this.b = Collections.unmodifiableMap(paramMap);
    this.c = Collections.unmodifiableSet(paramSet);
    if (paramSet1 == null) {
      paramString = null;
    } else {
      set = Collections.unmodifiableSet(paramSet1);
    } 
    this.d = set;
  }
  
  public static d a(b.r.a.b paramb, String paramString) {
    return new d(paramString, b(paramb, paramString), d(paramb, paramString), f(paramb, paramString));
  }
  
  private static Map<String, a> b(b.r.a.b paramb, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PRAGMA table_info(`");
    stringBuilder.append(paramString);
    stringBuilder.append("`)");
    Cursor cursor = paramb.R(stringBuilder.toString());
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    try {
      if (cursor.getColumnCount() > 0) {
        int i = cursor.getColumnIndex("name");
        int j = cursor.getColumnIndex("type");
        int k = cursor.getColumnIndex("notnull");
        int m = cursor.getColumnIndex("pk");
        while (cursor.moveToNext()) {
          boolean bool;
          String str1 = cursor.getString(i);
          String str2 = cursor.getString(j);
          if (cursor.getInt(k) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          int n = cursor.getInt(m);
          a a = new a();
          this(str1, str2, bool, n);
          hashMap.put(str1, a);
        } 
      } 
      return (Map)hashMap;
    } finally {
      cursor.close();
    } 
  }
  
  private static List<c> c(Cursor paramCursor) {
    int i = paramCursor.getColumnIndex("id");
    int j = paramCursor.getColumnIndex("seq");
    int k = paramCursor.getColumnIndex("from");
    int m = paramCursor.getColumnIndex("to");
    int n = paramCursor.getCount();
    ArrayList<c> arrayList = new ArrayList();
    for (byte b = 0; b < n; b++) {
      paramCursor.moveToPosition(b);
      arrayList.add(new c(paramCursor.getInt(i), paramCursor.getInt(j), paramCursor.getString(k), paramCursor.getString(m)));
    } 
    Collections.sort(arrayList);
    return arrayList;
  }
  
  private static Set<b> d(b.r.a.b paramb, String paramString) {
    HashSet<b> hashSet = new HashSet();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PRAGMA foreign_key_list(`");
    stringBuilder.append(paramString);
    stringBuilder.append("`)");
    Cursor cursor = paramb.R(stringBuilder.toString());
    try {
      int i = cursor.getColumnIndex("id");
      int j = cursor.getColumnIndex("seq");
      int k = cursor.getColumnIndex("table");
      int m = cursor.getColumnIndex("on_delete");
      int n = cursor.getColumnIndex("on_update");
      List<c> list = c(cursor);
      int i1 = cursor.getCount();
      for (byte b1 = 0; b1 < i1; b1++) {
        cursor.moveToPosition(b1);
        if (cursor.getInt(j) == 0) {
          int i2 = cursor.getInt(i);
          ArrayList<String> arrayList2 = new ArrayList();
          this();
          ArrayList<String> arrayList1 = new ArrayList();
          this();
          for (c c : list) {
            if (c.b == i2) {
              arrayList2.add(c.d);
              arrayList1.add(c.e);
            } 
          } 
          b b2 = new b();
          this(cursor.getString(k), cursor.getString(m), cursor.getString(n), arrayList2, arrayList1);
          hashSet.add(b2);
        } 
      } 
      return hashSet;
    } finally {
      cursor.close();
    } 
  }
  
  private static d e(b.r.a.b paramb, String paramString, boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PRAGMA index_xinfo(`");
    stringBuilder.append(paramString);
    stringBuilder.append("`)");
    Cursor cursor = paramb.R(stringBuilder.toString());
    try {
      int i = cursor.getColumnIndex("seqno");
      int j = cursor.getColumnIndex("cid");
      int k = cursor.getColumnIndex("name");
      if (i == -1 || j == -1 || k == -1)
        return null; 
      TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
      this();
      while (cursor.moveToNext()) {
        if (cursor.getInt(j) < 0)
          continue; 
        treeMap.put(Integer.valueOf(cursor.getInt(i)), cursor.getString(k));
      } 
      ArrayList<String> arrayList = new ArrayList();
      this(treeMap.size());
      arrayList.addAll(treeMap.values());
      return new d(paramString, paramBoolean, arrayList);
    } finally {
      cursor.close();
    } 
  }
  
  private static Set<d> f(b.r.a.b paramb, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PRAGMA index_list(`");
    stringBuilder.append(paramString);
    stringBuilder.append("`)");
    Cursor cursor = paramb.R(stringBuilder.toString());
    try {
      int i = cursor.getColumnIndex("name");
      int j = cursor.getColumnIndex("origin");
      int k = cursor.getColumnIndex("unique");
      if (i == -1 || j == -1 || k == -1)
        return null; 
      HashSet<d> hashSet = new HashSet();
      this();
      while (cursor.moveToNext()) {
        if (!"c".equals(cursor.getString(j)))
          continue; 
        String str = cursor.getString(i);
        int m = cursor.getInt(k);
        boolean bool = true;
        if (m != 1)
          bool = false; 
        d d1 = e(paramb, str, bool);
        if (d1 == null)
          return null; 
        hashSet.add(d1);
      } 
      return hashSet;
    } finally {
      cursor.close();
    } 
  }
  
  public boolean equals(Object<d> paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || d.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    String str = this.a;
    if ((str != null) ? !str.equals(((d)paramObject).a) : (((d)paramObject).a != null))
      return false; 
    Map<String, a> map = this.b;
    if ((map != null) ? !map.equals(((d)paramObject).b) : (((d)paramObject).b != null))
      return false; 
    Set<b> set1 = this.c;
    if ((set1 != null) ? !set1.equals(((d)paramObject).c) : (((d)paramObject).c != null))
      return false; 
    Set<d> set = this.d;
    if (set != null) {
      paramObject = (Object<d>)((d)paramObject).d;
      if (paramObject != null)
        return set.equals(paramObject); 
    } 
    return true;
  }
  
  public int hashCode() {
    byte b1;
    byte b2;
    String str = this.a;
    int i = 0;
    if (str != null) {
      b1 = str.hashCode();
    } else {
      b1 = 0;
    } 
    Map<String, a> map = this.b;
    if (map != null) {
      b2 = map.hashCode();
    } else {
      b2 = 0;
    } 
    Set<b> set = this.c;
    if (set != null)
      i = set.hashCode(); 
    return (b1 * 31 + b2) * 31 + i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("TableInfo{name='");
    stringBuilder.append(this.a);
    stringBuilder.append('\'');
    stringBuilder.append(", columns=");
    stringBuilder.append(this.b);
    stringBuilder.append(", foreignKeys=");
    stringBuilder.append(this.c);
    stringBuilder.append(", indices=");
    stringBuilder.append(this.d);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public static class a {
    public final String a;
    
    public final String b;
    
    public final int c;
    
    public final boolean d;
    
    public final int e;
    
    public a(String param1String1, String param1String2, boolean param1Boolean, int param1Int) {
      this.a = param1String1;
      this.b = param1String2;
      this.d = param1Boolean;
      this.e = param1Int;
      this.c = a(param1String2);
    }
    
    private static int a(String param1String) {
      if (param1String == null)
        return 5; 
      param1String = param1String.toUpperCase(Locale.US);
      return param1String.contains("INT") ? 3 : ((param1String.contains("CHAR") || param1String.contains("CLOB") || param1String.contains("TEXT")) ? 2 : (param1String.contains("BLOB") ? 5 : ((param1String.contains("REAL") || param1String.contains("FLOA") || param1String.contains("DOUB")) ? 4 : 1)));
    }
    
    public boolean b() {
      boolean bool;
      if (this.e > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || a.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (Build.VERSION.SDK_INT >= 20) {
        if (this.e != ((a)param1Object).e)
          return false; 
      } else if (b() != param1Object.b()) {
        return false;
      } 
      if (!this.a.equals(((a)param1Object).a))
        return false; 
      if (this.d != ((a)param1Object).d)
        return false; 
      if (this.c != ((a)param1Object).c)
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      char c;
      int i = this.a.hashCode();
      int j = this.c;
      if (this.d) {
        c = 'ӏ';
      } else {
        c = 'ӕ';
      } 
      return ((i * 31 + j) * 31 + c) * 31 + this.e;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Column{name='");
      stringBuilder.append(this.a);
      stringBuilder.append('\'');
      stringBuilder.append(", type='");
      stringBuilder.append(this.b);
      stringBuilder.append('\'');
      stringBuilder.append(", affinity='");
      stringBuilder.append(this.c);
      stringBuilder.append('\'');
      stringBuilder.append(", notNull=");
      stringBuilder.append(this.d);
      stringBuilder.append(", primaryKeyPosition=");
      stringBuilder.append(this.e);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  public static class b {
    public final String a;
    
    public final String b;
    
    public final String c;
    
    public final List<String> d;
    
    public final List<String> e;
    
    public b(String param1String1, String param1String2, String param1String3, List<String> param1List1, List<String> param1List2) {
      this.a = param1String1;
      this.b = param1String2;
      this.c = param1String3;
      this.d = Collections.unmodifiableList(param1List1);
      this.e = Collections.unmodifiableList(param1List2);
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null || b.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      return !this.a.equals(((b)param1Object).a) ? false : (!this.b.equals(((b)param1Object).b) ? false : (!this.c.equals(((b)param1Object).c) ? false : (!this.d.equals(((b)param1Object).d) ? false : this.e.equals(((b)param1Object).e))));
    }
    
    public int hashCode() {
      return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ForeignKey{referenceTable='");
      stringBuilder.append(this.a);
      stringBuilder.append('\'');
      stringBuilder.append(", onDelete='");
      stringBuilder.append(this.b);
      stringBuilder.append('\'');
      stringBuilder.append(", onUpdate='");
      stringBuilder.append(this.c);
      stringBuilder.append('\'');
      stringBuilder.append(", columnNames=");
      stringBuilder.append(this.d);
      stringBuilder.append(", referenceColumnNames=");
      stringBuilder.append(this.e);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  static class c implements Comparable<c> {
    final int b;
    
    final int c;
    
    final String d;
    
    final String e;
    
    c(int param1Int1, int param1Int2, String param1String1, String param1String2) {
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1String1;
      this.e = param1String2;
    }
    
    public int a(c param1c) {
      int i = this.b - param1c.b;
      int j = i;
      if (i == 0)
        j = this.c - param1c.c; 
      return j;
    }
  }
  
  public static class d {
    public final String a;
    
    public final boolean b;
    
    public final List<String> c;
    
    public d(String param1String, boolean param1Boolean, List<String> param1List) {
      this.a = param1String;
      this.b = param1Boolean;
      this.c = param1List;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null || d.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      return (this.b != ((d)param1Object).b) ? false : (!this.c.equals(((d)param1Object).c) ? false : (this.a.startsWith("index_") ? ((d)param1Object).a.startsWith("index_") : this.a.equals(((d)param1Object).a)));
    }
    
    public int hashCode() {
      int i;
      if (this.a.startsWith("index_")) {
        i = -1184239155;
      } else {
        i = this.a.hashCode();
      } 
      return (i * 31 + this.b) * 31 + this.c.hashCode();
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Index{name='");
      stringBuilder.append(this.a);
      stringBuilder.append('\'');
      stringBuilder.append(", unique=");
      stringBuilder.append(this.b);
      stringBuilder.append(", columns=");
      stringBuilder.append(this.c);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */