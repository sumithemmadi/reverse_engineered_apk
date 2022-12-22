package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.k;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;

public final class l implements k {
  private final RoomDatabase a;
  
  private final androidx.room.b b;
  
  private final androidx.room.l c;
  
  private final androidx.room.l d;
  
  private final androidx.room.l e;
  
  private final androidx.room.l f;
  
  private final androidx.room.l g;
  
  private final androidx.room.l h;
  
  private final androidx.room.l i;
  
  private final androidx.room.l j;
  
  public l(RoomDatabase paramRoomDatabase) {
    this.a = paramRoomDatabase;
    this.b = new a(this, paramRoomDatabase);
    this.c = new b(this, paramRoomDatabase);
    this.d = new c(this, paramRoomDatabase);
    this.e = new d(this, paramRoomDatabase);
    this.f = new e(this, paramRoomDatabase);
    this.g = new f(this, paramRoomDatabase);
    this.h = new g(this, paramRoomDatabase);
    this.i = new h(this, paramRoomDatabase);
    this.j = new i(this, paramRoomDatabase);
  }
  
  public int a(WorkInfo.State paramState, String... paramVarArgs) {
    this.a.b();
    StringBuilder stringBuilder = androidx.room.o.c.b();
    stringBuilder.append("UPDATE workspec SET state=");
    stringBuilder.append("?");
    stringBuilder.append(" WHERE id IN (");
    androidx.room.o.c.a(stringBuilder, paramVarArgs.length);
    stringBuilder.append(")");
    String str = stringBuilder.toString();
    b.r.a.f f = this.a.d(str);
    f.I(1, p.h(paramState));
    int i = paramVarArgs.length;
    byte b1 = 2;
    int j;
    for (j = 0; j < i; j++) {
      String str1 = paramVarArgs[j];
      if (str1 == null) {
        f.Y(b1);
      } else {
        f.n(b1, str1);
      } 
      b1++;
    } 
    this.a.c();
    try {
      j = f.r();
      this.a.q();
      return j;
    } finally {
      this.a.g();
    } 
  }
  
  public int b(String paramString, long paramLong) {
    this.a.b();
    b.r.a.f f = this.h.a();
    f.I(1, paramLong);
    if (paramString == null) {
      f.Y(2);
    } else {
      f.n(2, paramString);
    } 
    this.a.c();
    try {
      int i = f.r();
      this.a.q();
      return i;
    } finally {
      this.a.g();
      this.h.f(f);
    } 
  }
  
  public List<j.b> c(String paramString) {
    k k1 = k.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
    if (paramString == null) {
      k1.Y(1);
    } else {
      k1.n(1, paramString);
    } 
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      int i = androidx.room.o.a.b(cursor, "id");
      int j = androidx.room.o.a.b(cursor, "state");
      ArrayList<j.b> arrayList = new ArrayList();
      this(cursor.getCount());
      while (cursor.moveToNext()) {
        j.b b1 = new j.b();
        this();
        b1.a = cursor.getString(i);
        b1.b = p.f(cursor.getInt(j));
        arrayList.add(b1);
      } 
      return arrayList;
    } finally {
      cursor.close();
      k1.h();
    } 
  }
  
  public List<j> d(int paramInt) {
    Exception exception;
    k k1 = k.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
    k1.I(1, paramInt);
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      int i = androidx.room.o.a.b(cursor, "id");
      int j = androidx.room.o.a.b(cursor, "state");
      int m = androidx.room.o.a.b(cursor, "worker_class_name");
      int n = androidx.room.o.a.b(cursor, "input_merger_class_name");
      int i1 = androidx.room.o.a.b(cursor, "input");
      int i2 = androidx.room.o.a.b(cursor, "output");
      int i3 = androidx.room.o.a.b(cursor, "initial_delay");
      paramInt = androidx.room.o.a.b(cursor, "interval_duration");
      int i4 = androidx.room.o.a.b(cursor, "flex_duration");
      int i5 = androidx.room.o.a.b(cursor, "run_attempt_count");
      int i6 = androidx.room.o.a.b(cursor, "backoff_policy");
      int i7 = androidx.room.o.a.b(cursor, "backoff_delay_duration");
      int i8 = androidx.room.o.a.b(cursor, "period_start_time");
      int i9 = androidx.room.o.a.b(cursor, "minimum_retention_duration");
      try {
        int i10 = androidx.room.o.a.b(cursor, "schedule_requested_at");
        int i11 = androidx.room.o.a.b(cursor, "required_network_type");
        int i12 = androidx.room.o.a.b(cursor, "requires_charging");
        int i13 = androidx.room.o.a.b(cursor, "requires_device_idle");
        int i14 = androidx.room.o.a.b(cursor, "requires_battery_not_low");
        int i15 = androidx.room.o.a.b(cursor, "requires_storage_not_low");
        int i16 = androidx.room.o.a.b(cursor, "trigger_content_update_delay");
        int i17 = androidx.room.o.a.b(cursor, "trigger_max_content_delay");
        int i18 = androidx.room.o.a.b(cursor, "content_uri_triggers");
        ArrayList<j> arrayList = new ArrayList();
        this(cursor.getCount());
        while (cursor.moveToNext()) {
          boolean bool;
          String str1 = cursor.getString(i);
          String str2 = cursor.getString(m);
          androidx.work.b b1 = new androidx.work.b();
          this();
          b1.k(p.e(cursor.getInt(i11)));
          if (cursor.getInt(i12) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.m(bool);
          if (cursor.getInt(i13) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.n(bool);
          if (cursor.getInt(i14) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.l(bool);
          if (cursor.getInt(i15) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.o(bool);
          b1.p(cursor.getLong(i16));
          b1.q(cursor.getLong(i17));
          b1.j(p.b(cursor.getBlob(i18)));
          j j1 = new j();
          this(str1, str2);
          j1.d = p.f(cursor.getInt(j));
          j1.f = cursor.getString(n);
          j1.g = androidx.work.d.g(cursor.getBlob(i1));
          j1.h = androidx.work.d.g(cursor.getBlob(i2));
          j1.i = cursor.getLong(i3);
          j1.j = cursor.getLong(paramInt);
          j1.k = cursor.getLong(i4);
          j1.m = cursor.getInt(i5);
          int i19 = cursor.getInt(i6);
          j1.n = p.d(i19);
          j1.o = cursor.getLong(i7);
          j1.p = cursor.getLong(i8);
          j1.q = cursor.getLong(i9);
          j1.r = cursor.getLong(i10);
          j1.l = b1;
          arrayList.add(j1);
        } 
        cursor.close();
        k1.h();
        return arrayList;
      } finally {}
    } finally {}
    cursor.close();
    k1.h();
    throw exception;
  }
  
  public void e(String paramString) {
    this.a.b();
    b.r.a.f f = this.c.a();
    if (paramString == null) {
      f.Y(1);
    } else {
      f.n(1, paramString);
    } 
    this.a.c();
    try {
      f.r();
      this.a.q();
      return;
    } finally {
      this.a.g();
      this.c.f(f);
    } 
  }
  
  public void f(j paramj) {
    this.a.b();
    this.a.c();
    try {
      this.b.h(paramj);
      this.a.q();
      return;
    } finally {
      this.a.g();
    } 
  }
  
  public List<j> g() {
    Exception exception;
    k k1 = k.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      int i = androidx.room.o.a.b(cursor, "id");
      int j = androidx.room.o.a.b(cursor, "state");
      int m = androidx.room.o.a.b(cursor, "worker_class_name");
      int n = androidx.room.o.a.b(cursor, "input_merger_class_name");
      int i1 = androidx.room.o.a.b(cursor, "input");
      int i2 = androidx.room.o.a.b(cursor, "output");
      int i3 = androidx.room.o.a.b(cursor, "initial_delay");
      int i4 = androidx.room.o.a.b(cursor, "interval_duration");
      int i5 = androidx.room.o.a.b(cursor, "flex_duration");
      int i6 = androidx.room.o.a.b(cursor, "run_attempt_count");
      int i7 = androidx.room.o.a.b(cursor, "backoff_policy");
      int i8 = androidx.room.o.a.b(cursor, "backoff_delay_duration");
      int i9 = androidx.room.o.a.b(cursor, "period_start_time");
      int i10 = androidx.room.o.a.b(cursor, "minimum_retention_duration");
      try {
        int i11 = androidx.room.o.a.b(cursor, "schedule_requested_at");
        int i12 = androidx.room.o.a.b(cursor, "required_network_type");
        int i13 = androidx.room.o.a.b(cursor, "requires_charging");
        int i14 = androidx.room.o.a.b(cursor, "requires_device_idle");
        int i15 = androidx.room.o.a.b(cursor, "requires_battery_not_low");
        int i16 = androidx.room.o.a.b(cursor, "requires_storage_not_low");
        int i17 = androidx.room.o.a.b(cursor, "trigger_content_update_delay");
        int i18 = androidx.room.o.a.b(cursor, "trigger_max_content_delay");
        int i19 = androidx.room.o.a.b(cursor, "content_uri_triggers");
        ArrayList<j> arrayList = new ArrayList();
        this(cursor.getCount());
        while (cursor.moveToNext()) {
          boolean bool;
          String str1 = cursor.getString(i);
          String str2 = cursor.getString(m);
          androidx.work.b b1 = new androidx.work.b();
          this();
          b1.k(p.e(cursor.getInt(i12)));
          if (cursor.getInt(i13) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.m(bool);
          if (cursor.getInt(i14) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.n(bool);
          if (cursor.getInt(i15) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.l(bool);
          if (cursor.getInt(i16) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.o(bool);
          b1.p(cursor.getLong(i17));
          b1.q(cursor.getLong(i18));
          b1.j(p.b(cursor.getBlob(i19)));
          j j1 = new j();
          this(str1, str2);
          j1.d = p.f(cursor.getInt(j));
          j1.f = cursor.getString(n);
          j1.g = androidx.work.d.g(cursor.getBlob(i1));
          j1.h = androidx.work.d.g(cursor.getBlob(i2));
          j1.i = cursor.getLong(i3);
          j1.j = cursor.getLong(i4);
          j1.k = cursor.getLong(i5);
          j1.m = cursor.getInt(i6);
          int i20 = cursor.getInt(i7);
          j1.n = p.d(i20);
          j1.o = cursor.getLong(i8);
          j1.p = cursor.getLong(i9);
          j1.q = cursor.getLong(i10);
          j1.r = cursor.getLong(i11);
          j1.l = b1;
          arrayList.add(j1);
        } 
        cursor.close();
        k1.h();
        return arrayList;
      } finally {}
    } finally {}
    cursor.close();
    k1.h();
    throw exception;
  }
  
  public void h(String paramString, androidx.work.d paramd) {
    this.a.b();
    b.r.a.f f = this.d.a();
    byte[] arrayOfByte = androidx.work.d.k(paramd);
    if (arrayOfByte == null) {
      f.Y(1);
    } else {
      f.O(1, arrayOfByte);
    } 
    if (paramString == null) {
      f.Y(2);
    } else {
      f.n(2, paramString);
    } 
    this.a.c();
    try {
      f.r();
      this.a.q();
      return;
    } finally {
      this.a.g();
      this.d.f(f);
    } 
  }
  
  public List<j> i() {
    Exception exception;
    k k1 = k.d("SELECT * FROM workspec WHERE state=1", 0);
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      int i = androidx.room.o.a.b(cursor, "id");
      int j = androidx.room.o.a.b(cursor, "state");
      int m = androidx.room.o.a.b(cursor, "worker_class_name");
      int n = androidx.room.o.a.b(cursor, "input_merger_class_name");
      int i1 = androidx.room.o.a.b(cursor, "input");
      int i2 = androidx.room.o.a.b(cursor, "output");
      int i3 = androidx.room.o.a.b(cursor, "initial_delay");
      int i4 = androidx.room.o.a.b(cursor, "interval_duration");
      int i5 = androidx.room.o.a.b(cursor, "flex_duration");
      int i6 = androidx.room.o.a.b(cursor, "run_attempt_count");
      int i7 = androidx.room.o.a.b(cursor, "backoff_policy");
      int i8 = androidx.room.o.a.b(cursor, "backoff_delay_duration");
      int i9 = androidx.room.o.a.b(cursor, "period_start_time");
      int i10 = androidx.room.o.a.b(cursor, "minimum_retention_duration");
      try {
        int i11 = androidx.room.o.a.b(cursor, "schedule_requested_at");
        int i12 = androidx.room.o.a.b(cursor, "required_network_type");
        int i13 = androidx.room.o.a.b(cursor, "requires_charging");
        int i14 = androidx.room.o.a.b(cursor, "requires_device_idle");
        int i15 = androidx.room.o.a.b(cursor, "requires_battery_not_low");
        int i16 = androidx.room.o.a.b(cursor, "requires_storage_not_low");
        int i17 = androidx.room.o.a.b(cursor, "trigger_content_update_delay");
        int i18 = androidx.room.o.a.b(cursor, "trigger_max_content_delay");
        int i19 = androidx.room.o.a.b(cursor, "content_uri_triggers");
        ArrayList<j> arrayList = new ArrayList();
        this(cursor.getCount());
        while (cursor.moveToNext()) {
          boolean bool;
          String str1 = cursor.getString(i);
          String str2 = cursor.getString(m);
          androidx.work.b b1 = new androidx.work.b();
          this();
          b1.k(p.e(cursor.getInt(i12)));
          if (cursor.getInt(i13) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.m(bool);
          if (cursor.getInt(i14) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.n(bool);
          if (cursor.getInt(i15) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.l(bool);
          if (cursor.getInt(i16) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.o(bool);
          b1.p(cursor.getLong(i17));
          b1.q(cursor.getLong(i18));
          b1.j(p.b(cursor.getBlob(i19)));
          j j1 = new j();
          this(str1, str2);
          j1.d = p.f(cursor.getInt(j));
          j1.f = cursor.getString(n);
          j1.g = androidx.work.d.g(cursor.getBlob(i1));
          j1.h = androidx.work.d.g(cursor.getBlob(i2));
          j1.i = cursor.getLong(i3);
          j1.j = cursor.getLong(i4);
          j1.k = cursor.getLong(i5);
          j1.m = cursor.getInt(i6);
          int i20 = cursor.getInt(i7);
          j1.n = p.d(i20);
          j1.o = cursor.getLong(i8);
          j1.p = cursor.getLong(i9);
          j1.q = cursor.getLong(i10);
          j1.r = cursor.getLong(i11);
          j1.l = b1;
          arrayList.add(j1);
        } 
        cursor.close();
        k1.h();
        return arrayList;
      } finally {}
    } finally {}
    cursor.close();
    k1.h();
    throw exception;
  }
  
  public List<String> j() {
    k k1 = k.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      ArrayList<String> arrayList = new ArrayList();
      this(cursor.getCount());
      while (cursor.moveToNext())
        arrayList.add(cursor.getString(0)); 
      return arrayList;
    } finally {
      cursor.close();
      k1.h();
    } 
  }
  
  public List<String> k(String paramString) {
    k k1 = k.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
    if (paramString == null) {
      k1.Y(1);
    } else {
      k1.n(1, paramString);
    } 
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      ArrayList<String> arrayList = new ArrayList();
      this(cursor.getCount());
      while (cursor.moveToNext())
        arrayList.add(cursor.getString(0)); 
      return arrayList;
    } finally {
      cursor.close();
      k1.h();
    } 
  }
  
  public WorkInfo.State l(String paramString) {
    k k1 = k.d("SELECT state FROM workspec WHERE id=?", 1);
    if (paramString == null) {
      k1.Y(1);
    } else {
      k1.n(1, paramString);
    } 
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      if (cursor.moveToFirst()) {
        WorkInfo.State state = p.f(cursor.getInt(0));
      } else {
        paramString = null;
      } 
      return (WorkInfo.State)paramString;
    } finally {
      cursor.close();
      k1.h();
    } 
  }
  
  public j m(String paramString) {
    k k1 = k.d("SELECT * FROM workspec WHERE id=?", 1);
    if (paramString == null) {
      k1.Y(1);
    } else {
      k1.n(1, paramString);
    } 
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      int i = androidx.room.o.a.b(cursor, "id");
      int j = androidx.room.o.a.b(cursor, "state");
      int m = androidx.room.o.a.b(cursor, "worker_class_name");
      int n = androidx.room.o.a.b(cursor, "input_merger_class_name");
      int i1 = androidx.room.o.a.b(cursor, "input");
      int i2 = androidx.room.o.a.b(cursor, "output");
      int i3 = androidx.room.o.a.b(cursor, "initial_delay");
      int i4 = androidx.room.o.a.b(cursor, "interval_duration");
      int i5 = androidx.room.o.a.b(cursor, "flex_duration");
      int i6 = androidx.room.o.a.b(cursor, "run_attempt_count");
      int i7 = androidx.room.o.a.b(cursor, "backoff_policy");
      int i8 = androidx.room.o.a.b(cursor, "backoff_delay_duration");
      int i9 = androidx.room.o.a.b(cursor, "period_start_time");
      int i10 = androidx.room.o.a.b(cursor, "minimum_retention_duration");
      try {
        int i11 = androidx.room.o.a.b(cursor, "schedule_requested_at");
        int i12 = androidx.room.o.a.b(cursor, "required_network_type");
        int i13 = androidx.room.o.a.b(cursor, "requires_charging");
        int i14 = androidx.room.o.a.b(cursor, "requires_device_idle");
        int i15 = androidx.room.o.a.b(cursor, "requires_battery_not_low");
        int i16 = androidx.room.o.a.b(cursor, "requires_storage_not_low");
        int i17 = androidx.room.o.a.b(cursor, "trigger_content_update_delay");
        int i18 = androidx.room.o.a.b(cursor, "trigger_max_content_delay");
        int i19 = androidx.room.o.a.b(cursor, "content_uri_triggers");
        if (cursor.moveToFirst()) {
          boolean bool;
          String str1 = cursor.getString(i);
          String str2 = cursor.getString(m);
          androidx.work.b b1 = new androidx.work.b();
          this();
          b1.k(p.e(cursor.getInt(i12)));
          if (cursor.getInt(i13) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.m(bool);
          if (cursor.getInt(i14) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.n(bool);
          if (cursor.getInt(i15) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.l(bool);
          if (cursor.getInt(i16) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          b1.o(bool);
          b1.p(cursor.getLong(i17));
          b1.q(cursor.getLong(i18));
          b1.j(p.b(cursor.getBlob(i19)));
          j j1 = new j();
          this(str1, str2);
          j1.d = p.f(cursor.getInt(j));
          j1.f = cursor.getString(n);
          j1.g = androidx.work.d.g(cursor.getBlob(i1));
          j1.h = androidx.work.d.g(cursor.getBlob(i2));
          j1.i = cursor.getLong(i3);
          j1.j = cursor.getLong(i4);
          j1.k = cursor.getLong(i5);
          j1.m = cursor.getInt(i6);
          j1.n = p.d(cursor.getInt(i7));
          j1.o = cursor.getLong(i8);
          j1.p = cursor.getLong(i9);
          j1.q = cursor.getLong(i10);
          j1.r = cursor.getLong(i11);
          j1.l = b1;
        } else {
          paramString = null;
        } 
        cursor.close();
        k1.h();
        return (j)paramString;
      } finally {}
    } finally {}
    cursor.close();
    k1.h();
    throw paramString;
  }
  
  public int n(String paramString) {
    this.a.b();
    b.r.a.f f = this.g.a();
    if (paramString == null) {
      f.Y(1);
    } else {
      f.n(1, paramString);
    } 
    this.a.c();
    try {
      int i = f.r();
      this.a.q();
      return i;
    } finally {
      this.a.g();
      this.g.f(f);
    } 
  }
  
  public List<String> o(String paramString) {
    k k1 = k.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
    if (paramString == null) {
      k1.Y(1);
    } else {
      k1.n(1, paramString);
    } 
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      ArrayList<String> arrayList = new ArrayList();
      this(cursor.getCount());
      while (cursor.moveToNext())
        arrayList.add(cursor.getString(0)); 
      return arrayList;
    } finally {
      cursor.close();
      k1.h();
    } 
  }
  
  public List<androidx.work.d> p(String paramString) {
    k k1 = k.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
    if (paramString == null) {
      k1.Y(1);
    } else {
      k1.n(1, paramString);
    } 
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (b.r.a.e)k1, false);
    try {
      ArrayList<androidx.work.d> arrayList = new ArrayList();
      this(cursor.getCount());
      while (cursor.moveToNext())
        arrayList.add(androidx.work.d.g(cursor.getBlob(0))); 
      return arrayList;
    } finally {
      cursor.close();
      k1.h();
    } 
  }
  
  public int q(String paramString) {
    this.a.b();
    b.r.a.f f = this.f.a();
    if (paramString == null) {
      f.Y(1);
    } else {
      f.n(1, paramString);
    } 
    this.a.c();
    try {
      int i = f.r();
      this.a.q();
      return i;
    } finally {
      this.a.g();
      this.f.f(f);
    } 
  }
  
  public void r(String paramString, long paramLong) {
    this.a.b();
    b.r.a.f f = this.e.a();
    f.I(1, paramLong);
    if (paramString == null) {
      f.Y(2);
    } else {
      f.n(2, paramString);
    } 
    this.a.c();
    try {
      f.r();
      this.a.q();
      return;
    } finally {
      this.a.g();
      this.e.f(f);
    } 
  }
  
  public int s() {
    this.a.b();
    b.r.a.f f = this.i.a();
    this.a.c();
    try {
      int i = f.r();
      this.a.q();
      return i;
    } finally {
      this.a.g();
      this.i.f(f);
    } 
  }
  
  class a extends androidx.room.b<j> {
    a(l this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
    
    public void i(b.r.a.f param1f, j param1j) {
      String str = param1j.c;
      if (str == null) {
        param1f.Y(1);
      } else {
        param1f.n(1, str);
      } 
      param1f.I(2, p.h(param1j.d));
      str = param1j.e;
      if (str == null) {
        param1f.Y(3);
      } else {
        param1f.n(3, str);
      } 
      str = param1j.f;
      if (str == null) {
        param1f.Y(4);
      } else {
        param1f.n(4, str);
      } 
      byte[] arrayOfByte = androidx.work.d.k(param1j.g);
      if (arrayOfByte == null) {
        param1f.Y(5);
      } else {
        param1f.O(5, arrayOfByte);
      } 
      arrayOfByte = androidx.work.d.k(param1j.h);
      if (arrayOfByte == null) {
        param1f.Y(6);
      } else {
        param1f.O(6, arrayOfByte);
      } 
      param1f.I(7, param1j.i);
      param1f.I(8, param1j.j);
      param1f.I(9, param1j.k);
      param1f.I(10, param1j.m);
      param1f.I(11, p.a(param1j.n));
      param1f.I(12, param1j.o);
      param1f.I(13, param1j.p);
      param1f.I(14, param1j.q);
      param1f.I(15, param1j.r);
      androidx.work.b b1 = param1j.l;
      if (b1 != null) {
        param1f.I(16, p.g(b1.b()));
        param1f.I(17, b1.g());
        param1f.I(18, b1.h());
        param1f.I(19, b1.f());
        param1f.I(20, b1.i());
        param1f.I(21, b1.c());
        param1f.I(22, b1.d());
        byte[] arrayOfByte1 = p.c(b1.a());
        if (arrayOfByte1 == null) {
          param1f.Y(23);
        } else {
          param1f.O(23, arrayOfByte1);
        } 
      } else {
        param1f.Y(16);
        param1f.Y(17);
        param1f.Y(18);
        param1f.Y(19);
        param1f.Y(20);
        param1f.Y(21);
        param1f.Y(22);
        param1f.Y(23);
      } 
    }
  }
  
  class b extends androidx.room.l {
    b(l this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "DELETE FROM workspec WHERE id=?";
    }
  }
  
  class c extends androidx.room.l {
    c(l this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "UPDATE workspec SET output=? WHERE id=?";
    }
  }
  
  class d extends androidx.room.l {
    d(l this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "UPDATE workspec SET period_start_time=? WHERE id=?";
    }
  }
  
  class e extends androidx.room.l {
    e(l this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
  }
  
  class f extends androidx.room.l {
    f(l this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
  }
  
  class g extends androidx.room.l {
    g(l this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
  }
  
  class h extends androidx.room.l {
    h(l this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
  }
  
  class i extends androidx.room.l {
    i(l this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/l/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */