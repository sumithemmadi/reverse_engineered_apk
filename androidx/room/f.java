package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import b.r.a.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

public class f {
  private static final String[] a = new String[] { "UPDATE", "DELETE", "INSERT" };
  
  final b.e.a<String, Integer> b;
  
  final String[] c;
  
  private Map<String, Set<String>> d;
  
  final RoomDatabase e;
  
  AtomicBoolean f;
  
  private volatile boolean g;
  
  volatile b.r.a.f h;
  
  private b i;
  
  private final e j;
  
  @SuppressLint({"RestrictedApi"})
  final b.b.a.b.b<c, d> k;
  
  private g l;
  
  Runnable m;
  
  public f(RoomDatabase paramRoomDatabase, Map<String, String> paramMap, Map<String, Set<String>> paramMap1, String... paramVarArgs) {
    byte b1 = 0;
    this.f = new AtomicBoolean(false);
    this.g = false;
    this.k = new b.b.a.b.b();
    this.m = new a(this);
    this.e = paramRoomDatabase;
    this.i = new b(paramVarArgs.length);
    this.b = new b.e.a();
    this.d = paramMap1;
    this.j = new e(paramRoomDatabase);
    int i = paramVarArgs.length;
    this.c = new String[i];
    while (b1 < i) {
      String str1 = paramVarArgs[b1];
      Locale locale = Locale.US;
      str1 = str1.toLowerCase(locale);
      this.b.put(str1, Integer.valueOf(b1));
      String str2 = paramMap.get(paramVarArgs[b1]);
      if (str2 != null) {
        this.c[b1] = str2.toLowerCase(locale);
      } else {
        this.c[b1] = str1;
      } 
      b1++;
    } 
    for (Map.Entry<String, String> entry : paramMap.entrySet()) {
      String str = (String)entry.getValue();
      Locale locale = Locale.US;
      str = str.toLowerCase(locale);
      if (this.b.containsKey(str)) {
        String str1 = ((String)entry.getKey()).toLowerCase(locale);
        b.e.a<String, Integer> a1 = this.b;
        a1.put(str1, a1.get(str));
      } 
    } 
  }
  
  private static void b(StringBuilder paramStringBuilder, String paramString1, String paramString2) {
    paramStringBuilder.append("`");
    paramStringBuilder.append("room_table_modification_trigger_");
    paramStringBuilder.append(paramString1);
    paramStringBuilder.append("_");
    paramStringBuilder.append(paramString2);
    paramStringBuilder.append("`");
  }
  
  private String[] h(String[] paramArrayOfString) {
    b.e.b<String> b1 = new b.e.b();
    int i = paramArrayOfString.length;
    for (byte b2 = 0; b2 < i; b2++) {
      String str1 = paramArrayOfString[b2];
      String str2 = str1.toLowerCase(Locale.US);
      if (this.d.containsKey(str2)) {
        b1.addAll(this.d.get(str2));
      } else {
        b1.add(str1);
      } 
    } 
    return b1.<String>toArray(new String[b1.size()]);
  }
  
  private void j(b.r.a.b paramb, int paramInt) {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
    stringBuilder1.append(paramInt);
    stringBuilder1.append(", 0)");
    paramb.m(stringBuilder1.toString());
    String str = this.c[paramInt];
    StringBuilder stringBuilder2 = new StringBuilder();
    for (String str1 : a) {
      stringBuilder2.setLength(0);
      stringBuilder2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
      b(stringBuilder2, str, str1);
      stringBuilder2.append(" AFTER ");
      stringBuilder2.append(str1);
      stringBuilder2.append(" ON `");
      stringBuilder2.append(str);
      stringBuilder2.append("` BEGIN UPDATE ");
      stringBuilder2.append("room_table_modification_log");
      stringBuilder2.append(" SET ");
      stringBuilder2.append("invalidated");
      stringBuilder2.append(" = 1");
      stringBuilder2.append(" WHERE ");
      stringBuilder2.append("table_id");
      stringBuilder2.append(" = ");
      stringBuilder2.append(paramInt);
      stringBuilder2.append(" AND ");
      stringBuilder2.append("invalidated");
      stringBuilder2.append(" = 0");
      stringBuilder2.append("; END");
      paramb.m(stringBuilder2.toString());
    } 
  }
  
  private void k(b.r.a.b paramb, int paramInt) {
    String str = this.c[paramInt];
    StringBuilder stringBuilder = new StringBuilder();
    String[] arrayOfString = a;
    int i = arrayOfString.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      String str1 = arrayOfString[paramInt];
      stringBuilder.setLength(0);
      stringBuilder.append("DROP TRIGGER IF EXISTS ");
      b(stringBuilder, str, str1);
      paramb.m(stringBuilder.toString());
    } 
  }
  
  @SuppressLint({"RestrictedApi"})
  public void a(c paramc) {
    String[] arrayOfString = h(paramc.a);
    int[] arrayOfInt = new int[arrayOfString.length];
    int i = arrayOfString.length;
    byte b1 = 0;
    while (b1 < i) {
      Integer integer = (Integer)this.b.get(arrayOfString[b1].toLowerCase(Locale.US));
      if (integer != null) {
        arrayOfInt[b1] = integer.intValue();
        b1++;
        continue;
      } 
      null = new StringBuilder();
      null.append("There is no table with name ");
      null.append(arrayOfString[b1]);
      throw new IllegalArgumentException(null.toString());
    } 
    d d = new d((c)null, arrayOfInt, arrayOfString);
    synchronized (this.k) {
      d d1 = (d)this.k.l(null, d);
      if (d1 == null && this.i.b(arrayOfInt))
        l(); 
      return;
    } 
  }
  
  boolean c() {
    if (!this.e.o())
      return false; 
    if (!this.g)
      this.e.i().b(); 
    if (!this.g) {
      Log.e("ROOM", "database is not initialized even though it is open");
      return false;
    } 
    return true;
  }
  
  void d(b.r.a.b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Z
    //   6: ifeq -> 22
    //   9: ldc_w 'ROOM'
    //   12: ldc_w 'Invalidation tracker is initialized twice :/.'
    //   15: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   18: pop
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_1
    //   23: ldc_w 'PRAGMA temp_store = MEMORY;'
    //   26: invokeinterface m : (Ljava/lang/String;)V
    //   31: aload_1
    //   32: ldc_w 'PRAGMA recursive_triggers='ON';'
    //   35: invokeinterface m : (Ljava/lang/String;)V
    //   40: aload_1
    //   41: ldc_w 'CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)'
    //   44: invokeinterface m : (Ljava/lang/String;)V
    //   49: aload_0
    //   50: aload_1
    //   51: invokevirtual m : (Lb/r/a/b;)V
    //   54: aload_0
    //   55: aload_1
    //   56: ldc_w 'UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 '
    //   59: invokeinterface s : (Ljava/lang/String;)Lb/r/a/f;
    //   64: putfield h : Lb/r/a/f;
    //   67: aload_0
    //   68: iconst_1
    //   69: putfield g : Z
    //   72: aload_0
    //   73: monitorexit
    //   74: return
    //   75: astore_1
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_1
    //   79: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	75	finally
    //   22	74	75	finally
    //   76	78	75	finally
  }
  
  public void e(String... paramVarArgs) {
    synchronized (this.k) {
      for (Map.Entry entry : this.k) {
        if (!((c)entry.getKey()).a())
          ((d)entry.getValue()).b(paramVarArgs); 
      } 
      return;
    } 
  }
  
  public void f() {
    if (this.f.compareAndSet(false, true))
      this.e.j().execute(this.m); 
  }
  
  @SuppressLint({"RestrictedApi"})
  public void g(c paramc) {
    synchronized (this.k) {
      d d = (d)this.k.m(paramc);
      if (d != null && this.i.c(d.a))
        l(); 
      return;
    } 
  }
  
  void i(Context paramContext, String paramString) {
    this.l = new g(paramContext, paramString, this, this.e.j());
  }
  
  void l() {
    if (!this.e.o())
      return; 
    m(this.e.i().b());
  }
  
  void m(b.r.a.b paramb) {
    if (paramb.b0())
      return; 
    try {
      label37: while (true) {
        Lock lock = this.e.h();
        lock.lock();
        try {
          int[] arrayOfInt = this.i.a();
          if (arrayOfInt == null)
            return; 
          int i = arrayOfInt.length;
          paramb.a();
        } finally {
          lock.unlock();
        } 
        break;
      } 
    } catch (IllegalStateException illegalStateException) {
    
    } catch (SQLiteException sQLiteException) {}
    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)sQLiteException);
  }
  
  class a implements Runnable {
    a(f this$0) {}
    
    private Set<Integer> a() {
      null = new b.e.b();
      Cursor cursor = this.b.e.p((e)new b.r.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
      try {
        while (cursor.moveToNext())
          null.add(Integer.valueOf(cursor.getInt(0))); 
        cursor.close();
        return (Set<Integer>)null;
      } finally {
        cursor.close();
      } 
    }
    
    public void run() {
      Lock lock = this.b.e.h();
      Set<Integer> set1 = null;
      Set<Integer> set2 = null;
      Set<Integer> set3 = null;
      Set<Integer> set4 = set1;
      Set<Integer> set5 = set2;
      try {
        lock.lock();
        set4 = set1;
        set5 = set2;
        boolean bool = this.b.c();
        if (!bool) {
          lock.unlock();
          return;
        } 
        set4 = set1;
        set5 = set2;
        bool = this.b.f.compareAndSet(true, false);
        if (!bool) {
          lock.unlock();
          return;
        } 
        set4 = set1;
        set5 = set2;
        bool = this.b.e.k();
        if (bool) {
          lock.unlock();
          return;
        } 
        set4 = set1;
        set5 = set2;
        RoomDatabase roomDatabase = this.b.e;
        set4 = set1;
        set5 = set2;
        if (roomDatabase.g) {
          set4 = set1;
          set5 = set2;
          b.r.a.b b = roomDatabase.i().b();
          set4 = set1;
          set5 = set2;
          b.a();
          try {
            set1 = a();
          } finally {
            set4 = set3;
            set5 = set3;
            b.T();
            set4 = set3;
            set5 = set3;
          } 
        } else {
          set4 = set1;
          set5 = set2;
          set1 = a();
        } 
      } catch (IllegalStateException illegalStateException) {
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", illegalStateException);
        set1 = set5;
      } catch (SQLiteException sQLiteException1) {
        IllegalStateException illegalStateException1 = illegalStateException;
        SQLiteException sQLiteException2 = sQLiteException1;
      } finally {}
      lock.unlock();
      if (set1 != null && !set1.isEmpty())
        synchronized (this.b.k) {
          Iterator<Map.Entry> iterator = this.b.k.iterator();
          while (iterator.hasNext())
            ((f.d)((Map.Entry)iterator.next()).getValue()).a(set1); 
        }  
    }
  }
  
  static class b {
    final long[] a;
    
    final boolean[] b;
    
    final int[] c;
    
    boolean d;
    
    boolean e;
    
    b(int param1Int) {
      long[] arrayOfLong = new long[param1Int];
      this.a = arrayOfLong;
      boolean[] arrayOfBoolean = new boolean[param1Int];
      this.b = arrayOfBoolean;
      this.c = new int[param1Int];
      Arrays.fill(arrayOfLong, 0L);
      Arrays.fill(arrayOfBoolean, false);
    }
    
    int[] a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield d : Z
      //   6: ifeq -> 133
      //   9: aload_0
      //   10: getfield e : Z
      //   13: ifeq -> 19
      //   16: goto -> 133
      //   19: aload_0
      //   20: getfield a : [J
      //   23: arraylength
      //   24: istore_1
      //   25: iconst_0
      //   26: istore_2
      //   27: iconst_1
      //   28: istore_3
      //   29: iload_2
      //   30: iload_1
      //   31: if_icmpge -> 112
      //   34: aload_0
      //   35: getfield a : [J
      //   38: iload_2
      //   39: laload
      //   40: lconst_0
      //   41: lcmp
      //   42: ifle -> 51
      //   45: iconst_1
      //   46: istore #4
      //   48: goto -> 54
      //   51: iconst_0
      //   52: istore #4
      //   54: aload_0
      //   55: getfield b : [Z
      //   58: astore #5
      //   60: iload #4
      //   62: aload #5
      //   64: iload_2
      //   65: baload
      //   66: if_icmpeq -> 93
      //   69: aload_0
      //   70: getfield c : [I
      //   73: astore #6
      //   75: iload #4
      //   77: ifeq -> 83
      //   80: goto -> 85
      //   83: iconst_2
      //   84: istore_3
      //   85: aload #6
      //   87: iload_2
      //   88: iload_3
      //   89: iastore
      //   90: goto -> 100
      //   93: aload_0
      //   94: getfield c : [I
      //   97: iload_2
      //   98: iconst_0
      //   99: iastore
      //   100: aload #5
      //   102: iload_2
      //   103: iload #4
      //   105: bastore
      //   106: iinc #2, 1
      //   109: goto -> 27
      //   112: aload_0
      //   113: iconst_1
      //   114: putfield e : Z
      //   117: aload_0
      //   118: iconst_0
      //   119: putfield d : Z
      //   122: aload_0
      //   123: getfield c : [I
      //   126: astore #5
      //   128: aload_0
      //   129: monitorexit
      //   130: aload #5
      //   132: areturn
      //   133: aload_0
      //   134: monitorexit
      //   135: aconst_null
      //   136: areturn
      //   137: astore #5
      //   139: aload_0
      //   140: monitorexit
      //   141: goto -> 147
      //   144: aload #5
      //   146: athrow
      //   147: goto -> 144
      // Exception table:
      //   from	to	target	type
      //   2	16	137	finally
      //   19	25	137	finally
      //   34	45	137	finally
      //   54	60	137	finally
      //   69	75	137	finally
      //   93	100	137	finally
      //   112	130	137	finally
      //   133	135	137	finally
      //   139	141	137	finally
    }
    
    boolean b(int... param1VarArgs) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_1
      //   3: arraylength
      //   4: istore_2
      //   5: iconst_0
      //   6: istore_3
      //   7: iconst_0
      //   8: istore #4
      //   10: iload_3
      //   11: iload_2
      //   12: if_icmpge -> 63
      //   15: aload_1
      //   16: iload_3
      //   17: iaload
      //   18: istore #5
      //   20: aload_0
      //   21: getfield a : [J
      //   24: astore #6
      //   26: aload #6
      //   28: iload #5
      //   30: laload
      //   31: lstore #7
      //   33: aload #6
      //   35: iload #5
      //   37: lconst_1
      //   38: lload #7
      //   40: ladd
      //   41: lastore
      //   42: lload #7
      //   44: lconst_0
      //   45: lcmp
      //   46: ifne -> 57
      //   49: aload_0
      //   50: iconst_1
      //   51: putfield d : Z
      //   54: iconst_1
      //   55: istore #4
      //   57: iinc #3, 1
      //   60: goto -> 10
      //   63: aload_0
      //   64: monitorexit
      //   65: iload #4
      //   67: ireturn
      //   68: astore_1
      //   69: aload_0
      //   70: monitorexit
      //   71: goto -> 76
      //   74: aload_1
      //   75: athrow
      //   76: goto -> 74
      // Exception table:
      //   from	to	target	type
      //   2	5	68	finally
      //   20	26	68	finally
      //   49	54	68	finally
      //   63	65	68	finally
      //   69	71	68	finally
    }
    
    boolean c(int... param1VarArgs) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_1
      //   3: arraylength
      //   4: istore_2
      //   5: iconst_0
      //   6: istore_3
      //   7: iconst_0
      //   8: istore #4
      //   10: iload_3
      //   11: iload_2
      //   12: if_icmpge -> 63
      //   15: aload_1
      //   16: iload_3
      //   17: iaload
      //   18: istore #5
      //   20: aload_0
      //   21: getfield a : [J
      //   24: astore #6
      //   26: aload #6
      //   28: iload #5
      //   30: laload
      //   31: lstore #7
      //   33: aload #6
      //   35: iload #5
      //   37: lload #7
      //   39: lconst_1
      //   40: lsub
      //   41: lastore
      //   42: lload #7
      //   44: lconst_1
      //   45: lcmp
      //   46: ifne -> 57
      //   49: aload_0
      //   50: iconst_1
      //   51: putfield d : Z
      //   54: iconst_1
      //   55: istore #4
      //   57: iinc #3, 1
      //   60: goto -> 10
      //   63: aload_0
      //   64: monitorexit
      //   65: iload #4
      //   67: ireturn
      //   68: astore_1
      //   69: aload_0
      //   70: monitorexit
      //   71: goto -> 76
      //   74: aload_1
      //   75: athrow
      //   76: goto -> 74
      // Exception table:
      //   from	to	target	type
      //   2	5	68	finally
      //   20	26	68	finally
      //   49	54	68	finally
      //   63	65	68	finally
      //   69	71	68	finally
    }
    
    void d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_0
      //   4: putfield e : Z
      //   7: aload_0
      //   8: monitorexit
      //   9: return
      //   10: astore_1
      //   11: aload_0
      //   12: monitorexit
      //   13: aload_1
      //   14: athrow
      // Exception table:
      //   from	to	target	type
      //   2	9	10	finally
      //   11	13	10	finally
    }
  }
  
  public static abstract class c {
    final String[] a;
    
    public c(String[] param1ArrayOfString) {
      this.a = Arrays.<String>copyOf(param1ArrayOfString, param1ArrayOfString.length);
    }
    
    boolean a() {
      return false;
    }
    
    public abstract void b(Set<String> param1Set);
  }
  
  static class d {
    final int[] a;
    
    private final String[] b;
    
    final f.c c;
    
    private final Set<String> d;
    
    d(f.c param1c, int[] param1ArrayOfint, String[] param1ArrayOfString) {
      this.c = param1c;
      this.a = param1ArrayOfint;
      this.b = param1ArrayOfString;
      if (param1ArrayOfint.length == 1) {
        b.e.b b = new b.e.b();
        b.add(param1ArrayOfString[0]);
        this.d = Collections.unmodifiableSet((Set<? extends String>)b);
      } else {
        this.d = null;
      } 
    }
    
    void a(Set<Integer> param1Set) {
      b.e.b<String> b;
      int i = this.a.length;
      Set<String> set = null;
      byte b1 = 0;
      while (b1 < i) {
        b.e.b<String> b2;
        Set<String> set1 = set;
        if (param1Set.contains(Integer.valueOf(this.a[b1])))
          if (i == 1) {
            set1 = this.d;
          } else {
            set1 = set;
            if (set == null)
              b2 = new b.e.b(i); 
            b2.add(this.b[b1]);
          }  
        b1++;
        b = b2;
      } 
      if (b != null)
        this.c.b((Set<String>)b); 
    }
    
    void b(String[] param1ArrayOfString) {
      b.e.b b;
      int i = this.b.length;
      Set<String> set = null;
      if (i == 1) {
        int j = param1ArrayOfString.length;
        i = 0;
        while (true) {
          Set<String> set1 = set;
          if (i < j) {
            if (param1ArrayOfString[i].equalsIgnoreCase(this.b[0])) {
              set1 = this.d;
              break;
            } 
            i++;
            continue;
          } 
          break;
        } 
      } else {
        b.e.b b1 = new b.e.b();
        int j = param1ArrayOfString.length;
        for (i = 0; i < j; i++) {
          String str = param1ArrayOfString[i];
          for (String str1 : this.b) {
            if (str1.equalsIgnoreCase(str)) {
              b1.add(str1);
              break;
            } 
          } 
        } 
        Set<String> set1 = set;
        if (b1.size() > 0)
          b = b1; 
      } 
      if (b != null)
        this.c.b((Set<String>)b); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */