package com.google.android.datatransport.h.x.j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.h.g;
import com.google.android.datatransport.h.h;
import com.google.android.datatransport.h.m;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class b0 implements c, a {
  private static final com.google.android.datatransport.b b = com.google.android.datatransport.b.b("proto");
  
  private final h0 c;
  
  private final com.google.android.datatransport.h.y.a d;
  
  private final com.google.android.datatransport.h.y.a e;
  
  private final d f;
  
  b0(com.google.android.datatransport.h.y.a parama1, com.google.android.datatransport.h.y.a parama2, d paramd, h0 paramh0) {
    this.c = paramh0;
    this.d = parama1;
    this.e = parama2;
    this.f = paramd;
  }
  
  private List<i> U(SQLiteDatabase paramSQLiteDatabase, m paramm) {
    ArrayList<i> arrayList = new ArrayList();
    Long long_ = j(paramSQLiteDatabase, paramm);
    if (long_ == null)
      return arrayList; 
    String str = long_.toString();
    int i = this.f.d();
    f0(paramSQLiteDatabase.query("events", new String[] { "_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline" }, "context_id = ?", new String[] { str }, null, null, null, String.valueOf(i)), n.b(this, arrayList, paramm));
    return arrayList;
  }
  
  private Map<Long, Set<c>> V(SQLiteDatabase paramSQLiteDatabase, List<i> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    StringBuilder stringBuilder = new StringBuilder("event_id IN (");
    for (byte b1 = 0; b1 < paramList.size(); b1++) {
      stringBuilder.append(((i)paramList.get(b1)).c());
      if (b1 < paramList.size() - 1)
        stringBuilder.append(','); 
    } 
    stringBuilder.append(')');
    String str = stringBuilder.toString();
    f0(paramSQLiteDatabase.query("event_metadata", new String[] { "event_id", "name", "value" }, str, null, null, null, null), p.b(hashMap));
    return (Map)hashMap;
  }
  
  private static byte[] W(String paramString) {
    return (paramString == null) ? null : Base64.decode(paramString, 0);
  }
  
  private byte[] Z(long paramLong) {
    return f0(e().query("event_payloads", new String[] { "bytes" }, "event_id = ?", new String[] { String.valueOf(paramLong) }, null, null, "sequence_num"), o.b());
  }
  
  private <T> T a0(d<T> paramd, b<Throwable, T> paramb) {
    long l = this.e.a();
    while (true) {
      try {
        return paramd.a();
      } catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
        if (this.e.a() >= this.f.b() + l)
          return paramb.a(sQLiteDatabaseLockedException); 
        SystemClock.sleep(50L);
      } 
    } 
  }
  
  private void c(SQLiteDatabase paramSQLiteDatabase) {
    a0(q.b(paramSQLiteDatabase), r.b());
  }
  
  private static com.google.android.datatransport.b c0(String paramString) {
    return (paramString == null) ? b : com.google.android.datatransport.b.b(paramString);
  }
  
  private long d(SQLiteDatabase paramSQLiteDatabase, m paramm) {
    Long long_ = j(paramSQLiteDatabase, paramm);
    if (long_ != null)
      return long_.longValue(); 
    ContentValues contentValues = new ContentValues();
    contentValues.put("backend_name", paramm.b());
    contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.h.z.a.a(paramm.d())));
    contentValues.put("next_request_ms", Integer.valueOf(0));
    if (paramm.c() != null)
      contentValues.put("extras", Base64.encodeToString(paramm.c(), 0)); 
    return paramSQLiteDatabase.insert("transport_contexts", null, contentValues);
  }
  
  private static String e0(Iterable<i> paramIterable) {
    StringBuilder stringBuilder = new StringBuilder("(");
    Iterator<i> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(((i)iterator.next()).c());
      if (iterator.hasNext())
        stringBuilder.append(','); 
    } 
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  static <T> T f0(Cursor paramCursor, b<Cursor, T> paramb) {
    try {
      paramb = (b<Cursor, T>)paramb.a(paramCursor);
      return (T)paramb;
    } finally {
      paramCursor.close();
    } 
  }
  
  private long g() {
    return e().compileStatement("PRAGMA page_count").simpleQueryForLong();
  }
  
  private long h() {
    return e().compileStatement("PRAGMA page_size").simpleQueryForLong();
  }
  
  private Long j(SQLiteDatabase paramSQLiteDatabase, m paramm) {
    StringBuilder stringBuilder = new StringBuilder("backend_name = ? and priority = ?");
    ArrayList<String> arrayList = new ArrayList(Arrays.asList((Object[])new String[] { paramm.b(), String.valueOf(com.google.android.datatransport.h.z.a.a(paramm.d())) }));
    if (paramm.c() != null) {
      stringBuilder.append(" and extras = ?");
      arrayList.add(Base64.encodeToString(paramm.c(), 0));
    } else {
      stringBuilder.append(" and extras is null");
    } 
    String str = stringBuilder.toString();
    String[] arrayOfString = arrayList.<String>toArray(new String[0]);
    return f0(paramSQLiteDatabase.query("transport_contexts", new String[] { "_id" }, str, arrayOfString, null, null, null), x.b());
  }
  
  private boolean o() {
    boolean bool;
    if (g() * h() >= this.f.f()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private List<i> p(List<i> paramList, Map<Long, Set<c>> paramMap) {
    ListIterator<i> listIterator = paramList.listIterator();
    while (listIterator.hasNext()) {
      i i = listIterator.next();
      if (!paramMap.containsKey(Long.valueOf(i.c())))
        continue; 
      h.a a1 = i.b().l();
      for (c c1 : paramMap.get(Long.valueOf(i.c())))
        a1.c(c1.a, c1.b); 
      listIterator.set(i.a(i.c(), i.d(), a1.d()));
    } 
    return paramList;
  }
  
  public Iterable<m> E() {
    return l(l.b());
  }
  
  public <T> T b(a.a<T> parama) {
    SQLiteDatabase sQLiteDatabase = e();
    c(sQLiteDatabase);
    try {
      Object object = parama.execute();
      sQLiteDatabase.setTransactionSuccessful();
      return (T)object;
    } finally {
      sQLiteDatabase.endTransaction();
    } 
  }
  
  public void close() {
    this.c.close();
  }
  
  public i d0(m paramm, h paramh) {
    com.google.android.datatransport.h.v.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", new Object[] { paramm.d(), paramh.j(), paramm.b() });
    long l = ((Long)l(w.b(this, paramm, paramh))).longValue();
    return (l < 1L) ? null : i.a(l, paramm, paramh);
  }
  
  SQLiteDatabase e() {
    h0 h01 = this.c;
    h01.getClass();
    return a0(s.b(h01), v.b());
  }
  
  public int f() {
    return ((Integer)l(m.b(this.d.a() - this.f.c()))).intValue();
  }
  
  public long g0(m paramm) {
    return ((Long)f0(e().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { paramm.b(), String.valueOf(com.google.android.datatransport.h.z.a.a(paramm.d())) }), z.b())).longValue();
  }
  
  public boolean h0(m paramm) {
    return ((Boolean)l(a0.b(this, paramm))).booleanValue();
  }
  
  public void i(Iterable<i> paramIterable) {
    if (!paramIterable.iterator().hasNext())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DELETE FROM events WHERE _id in ");
    stringBuilder.append(e0(paramIterable));
    String str = stringBuilder.toString();
    e().compileStatement(str).execute();
  }
  
  public void k0(Iterable<i> paramIterable) {
    if (!paramIterable.iterator().hasNext())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
    stringBuilder.append(e0(paramIterable));
    l(y.b(stringBuilder.toString()));
  }
  
  <T> T l(b<SQLiteDatabase, T> paramb) {
    SQLiteDatabase sQLiteDatabase = e();
    sQLiteDatabase.beginTransaction();
    try {
      paramb = (b<SQLiteDatabase, T>)paramb.a(sQLiteDatabase);
      sQLiteDatabase.setTransactionSuccessful();
      return (T)paramb;
    } finally {
      sQLiteDatabase.endTransaction();
    } 
  }
  
  public Iterable<i> t(m paramm) {
    return l(k.b(this, paramm));
  }
  
  public void y(m paramm, long paramLong) {
    l(j.b(paramLong, paramm));
  }
  
  static interface b<T, U> {
    U a(T param1T);
  }
  
  private static class c {
    final String a;
    
    final String b;
    
    private c(String param1String1, String param1String2) {
      this.a = param1String1;
      this.b = param1String2;
    }
  }
  
  static interface d<T> {
    T a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/j/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */