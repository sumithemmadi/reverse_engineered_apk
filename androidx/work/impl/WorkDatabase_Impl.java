package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.room.f;
import androidx.room.j;
import androidx.room.o.b;
import androidx.room.o.d;
import androidx.work.impl.l.b;
import androidx.work.impl.l.e;
import androidx.work.impl.l.h;
import androidx.work.impl.l.k;
import androidx.work.impl.l.n;
import b.r.a.b;
import b.r.a.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class WorkDatabase_Impl extends WorkDatabase {
  private volatile k m;
  
  private volatile b n;
  
  private volatile n o;
  
  private volatile e p;
  
  private volatile h q;
  
  protected f e() {
    return new f(this, new HashMap<Object, Object>(0), new HashMap<Object, Object>(0), new String[] { "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName" });
  }
  
  protected c f(androidx.room.a parama) {
    j j = new j(parama, new a(this, 6), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
    c.b b1 = c.b.a(parama.b).c(parama.c).b((c.a)j).a();
    return parama.a.a(b1);
  }
  
  public b s() {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Landroidx/work/impl/l/b;
    //   4: ifnull -> 12
    //   7: aload_0
    //   8: getfield n : Landroidx/work/impl/l/b;
    //   11: areturn
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield n : Landroidx/work/impl/l/b;
    //   18: ifnonnull -> 35
    //   21: new androidx/work/impl/l/c
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: invokespecial <init> : (Landroidx/room/RoomDatabase;)V
    //   30: aload_0
    //   31: aload_1
    //   32: putfield n : Landroidx/work/impl/l/b;
    //   35: aload_0
    //   36: getfield n : Landroidx/work/impl/l/b;
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: areturn
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   14	35	44	finally
    //   35	42	44	finally
    //   45	47	44	finally
  }
  
  public e w() {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Landroidx/work/impl/l/e;
    //   4: ifnull -> 12
    //   7: aload_0
    //   8: getfield p : Landroidx/work/impl/l/e;
    //   11: areturn
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield p : Landroidx/work/impl/l/e;
    //   18: ifnonnull -> 35
    //   21: new androidx/work/impl/l/f
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: invokespecial <init> : (Landroidx/room/RoomDatabase;)V
    //   30: aload_0
    //   31: aload_1
    //   32: putfield p : Landroidx/work/impl/l/e;
    //   35: aload_0
    //   36: getfield p : Landroidx/work/impl/l/e;
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: areturn
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   14	35	44	finally
    //   35	42	44	finally
    //   45	47	44	finally
  }
  
  public h x() {
    // Byte code:
    //   0: aload_0
    //   1: getfield q : Landroidx/work/impl/l/h;
    //   4: ifnull -> 12
    //   7: aload_0
    //   8: getfield q : Landroidx/work/impl/l/h;
    //   11: areturn
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield q : Landroidx/work/impl/l/h;
    //   18: ifnonnull -> 35
    //   21: new androidx/work/impl/l/i
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: invokespecial <init> : (Landroidx/room/RoomDatabase;)V
    //   30: aload_0
    //   31: aload_1
    //   32: putfield q : Landroidx/work/impl/l/h;
    //   35: aload_0
    //   36: getfield q : Landroidx/work/impl/l/h;
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: areturn
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   14	35	44	finally
    //   35	42	44	finally
    //   45	47	44	finally
  }
  
  public k y() {
    // Byte code:
    //   0: aload_0
    //   1: getfield m : Landroidx/work/impl/l/k;
    //   4: ifnull -> 12
    //   7: aload_0
    //   8: getfield m : Landroidx/work/impl/l/k;
    //   11: areturn
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield m : Landroidx/work/impl/l/k;
    //   18: ifnonnull -> 35
    //   21: new androidx/work/impl/l/l
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: invokespecial <init> : (Landroidx/room/RoomDatabase;)V
    //   30: aload_0
    //   31: aload_1
    //   32: putfield m : Landroidx/work/impl/l/k;
    //   35: aload_0
    //   36: getfield m : Landroidx/work/impl/l/k;
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: areturn
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   14	35	44	finally
    //   35	42	44	finally
    //   45	47	44	finally
  }
  
  public n z() {
    // Byte code:
    //   0: aload_0
    //   1: getfield o : Landroidx/work/impl/l/n;
    //   4: ifnull -> 12
    //   7: aload_0
    //   8: getfield o : Landroidx/work/impl/l/n;
    //   11: areturn
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield o : Landroidx/work/impl/l/n;
    //   18: ifnonnull -> 35
    //   21: new androidx/work/impl/l/o
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: invokespecial <init> : (Landroidx/room/RoomDatabase;)V
    //   30: aload_0
    //   31: aload_1
    //   32: putfield o : Landroidx/work/impl/l/n;
    //   35: aload_0
    //   36: getfield o : Landroidx/work/impl/l/n;
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: areturn
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   14	35	44	finally
    //   35	42	44	finally
    //   45	47	44	finally
  }
  
  class a extends j.a {
    a(WorkDatabase_Impl this$0, int param1Int) {
      super(param1Int);
    }
    
    public void a(b param1b) {
      param1b.m("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
      param1b.m("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
      param1b.m("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
      param1b.m("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
      param1b.m("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
      param1b.m("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
      param1b.m("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
      param1b.m("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
      param1b.m("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
      param1b.m("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
      param1b.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
      param1b.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
    }
    
    public void b(b param1b) {
      param1b.m("DROP TABLE IF EXISTS `Dependency`");
      param1b.m("DROP TABLE IF EXISTS `WorkSpec`");
      param1b.m("DROP TABLE IF EXISTS `WorkTag`");
      param1b.m("DROP TABLE IF EXISTS `SystemIdInfo`");
      param1b.m("DROP TABLE IF EXISTS `WorkName`");
    }
    
    protected void c(b param1b) {
      if (WorkDatabase_Impl.A(this.b) != null) {
        byte b1 = 0;
        int i = WorkDatabase_Impl.B(this.b).size();
        while (b1 < i) {
          ((RoomDatabase.b)WorkDatabase_Impl.C(this.b).get(b1)).a(param1b);
          b1++;
        } 
      } 
    }
    
    public void d(b param1b) {
      WorkDatabase_Impl.D(this.b, param1b);
      param1b.m("PRAGMA foreign_keys = ON");
      WorkDatabase_Impl.E(this.b, param1b);
      if (WorkDatabase_Impl.F(this.b) != null) {
        byte b1 = 0;
        int i = WorkDatabase_Impl.G(this.b).size();
        while (b1 < i) {
          ((RoomDatabase.b)WorkDatabase_Impl.H(this.b).get(b1)).b(param1b);
          b1++;
        } 
      } 
    }
    
    public void e(b param1b) {}
    
    public void f(b param1b) {
      b.a(param1b);
    }
    
    protected void g(b param1b) {
      StringBuilder stringBuilder2;
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>(2);
      hashMap.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1));
      hashMap.put("prerequisite_id", new d.a("prerequisite_id", "TEXT", true, 2));
      HashSet<d.b> hashSet = new HashSet(2);
      hashSet.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }, ), Arrays.asList(new String[] { "id" })));
      hashSet.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "prerequisite_id" }, ), Arrays.asList(new String[] { "id" })));
      HashSet<d.d> hashSet1 = new HashSet(2);
      hashSet1.add(new d.d("index_Dependency_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" })));
      hashSet1.add(new d.d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[] { "prerequisite_id" })));
      d d1 = new d("Dependency", hashMap, hashSet, hashSet1);
      d d2 = d.a(param1b, "Dependency");
      if (d1.equals(d2)) {
        HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>(23);
        hashMap1.put("id", new d.a("id", "TEXT", true, 1));
        hashMap1.put("state", new d.a("state", "INTEGER", true, 0));
        hashMap1.put("worker_class_name", new d.a("worker_class_name", "TEXT", true, 0));
        hashMap1.put("input_merger_class_name", new d.a("input_merger_class_name", "TEXT", false, 0));
        hashMap1.put("input", new d.a("input", "BLOB", true, 0));
        hashMap1.put("output", new d.a("output", "BLOB", true, 0));
        hashMap1.put("initial_delay", new d.a("initial_delay", "INTEGER", true, 0));
        hashMap1.put("interval_duration", new d.a("interval_duration", "INTEGER", true, 0));
        hashMap1.put("flex_duration", new d.a("flex_duration", "INTEGER", true, 0));
        hashMap1.put("run_attempt_count", new d.a("run_attempt_count", "INTEGER", true, 0));
        hashMap1.put("backoff_policy", new d.a("backoff_policy", "INTEGER", true, 0));
        hashMap1.put("backoff_delay_duration", new d.a("backoff_delay_duration", "INTEGER", true, 0));
        hashMap1.put("period_start_time", new d.a("period_start_time", "INTEGER", true, 0));
        hashMap1.put("minimum_retention_duration", new d.a("minimum_retention_duration", "INTEGER", true, 0));
        hashMap1.put("schedule_requested_at", new d.a("schedule_requested_at", "INTEGER", true, 0));
        hashMap1.put("required_network_type", new d.a("required_network_type", "INTEGER", false, 0));
        hashMap1.put("requires_charging", new d.a("requires_charging", "INTEGER", true, 0));
        hashMap1.put("requires_device_idle", new d.a("requires_device_idle", "INTEGER", true, 0));
        hashMap1.put("requires_battery_not_low", new d.a("requires_battery_not_low", "INTEGER", true, 0));
        hashMap1.put("requires_storage_not_low", new d.a("requires_storage_not_low", "INTEGER", true, 0));
        hashMap1.put("trigger_content_update_delay", new d.a("trigger_content_update_delay", "INTEGER", true, 0));
        hashMap1.put("trigger_max_content_delay", new d.a("trigger_max_content_delay", "INTEGER", true, 0));
        hashMap1.put("content_uri_triggers", new d.a("content_uri_triggers", "BLOB", false, 0));
        HashSet<d.d> hashSet2 = new HashSet(0);
        HashSet<d.d> hashSet3 = new HashSet(1);
        hashSet3.add(new d.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[] { "schedule_requested_at" })));
        d1 = new d("WorkSpec", hashMap1, hashSet2, hashSet3);
        d d = d.a(param1b, "WorkSpec");
        if (d1.equals(d)) {
          HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>(2);
          hashMap2.put("tag", new d.a("tag", "TEXT", true, 1));
          hashMap2.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2));
          HashSet<d.b> hashSet4 = new HashSet(1);
          hashSet4.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }, ), Arrays.asList(new String[] { "id" })));
          hashSet2 = new HashSet(1);
          hashSet2.add(new d.d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" })));
          d d3 = new d("WorkTag", hashMap2, hashSet4, hashSet2);
          d1 = d.a(param1b, "WorkTag");
          if (d3.equals(d1)) {
            HashMap<Object, Object> hashMap3 = new HashMap<Object, Object>(2);
            hashMap3.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1));
            hashMap3.put("system_id", new d.a("system_id", "INTEGER", true, 0));
            HashSet<d.b> hashSet5 = new HashSet(1);
            hashSet5.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }, ), Arrays.asList(new String[] { "id" })));
            d d4 = new d("SystemIdInfo", hashMap3, hashSet5, new HashSet(0));
            d1 = d.a(param1b, "SystemIdInfo");
            if (d4.equals(d1)) {
              HashMap<Object, Object> hashMap4 = new HashMap<Object, Object>(2);
              hashMap4.put("name", new d.a("name", "TEXT", true, 1));
              hashMap4.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2));
              HashSet<d.b> hashSet6 = new HashSet(1);
              hashSet6.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }, ), Arrays.asList(new String[] { "id" })));
              HashSet<d.d> hashSet7 = new HashSet(1);
              hashSet7.add(new d.d("index_WorkName_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" })));
              d1 = new d("WorkName", hashMap4, hashSet6, hashSet7);
              d d5 = d.a(param1b, "WorkName");
              if (d1.equals(d5))
                return; 
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
              stringBuilder2.append(d1);
              stringBuilder2.append("\n Found:\n");
              stringBuilder2.append(d5);
              throw new IllegalStateException(stringBuilder2.toString());
            } 
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append("\n Found:\n");
            stringBuilder4.append(d1);
            throw new IllegalStateException(stringBuilder4.toString());
          } 
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
          stringBuilder3.append(stringBuilder2);
          stringBuilder3.append("\n Found:\n");
          stringBuilder3.append(d1);
          throw new IllegalStateException(stringBuilder3.toString());
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
        stringBuilder.append(d1);
        stringBuilder.append("\n Found:\n");
        stringBuilder.append(stringBuilder2);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
      stringBuilder1.append(d1);
      stringBuilder1.append("\n Found:\n");
      stringBuilder1.append(stringBuilder2);
      throw new IllegalStateException(stringBuilder1.toString());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/WorkDatabase_Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */