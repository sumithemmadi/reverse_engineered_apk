package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.utils.e;

public class g {
  public static androidx.room.n.a a = new a(1, 2);
  
  public static androidx.room.n.a b = new b(3, 4);
  
  public static androidx.room.n.a c = new c(4, 5);
  
  static final class a extends androidx.room.n.a {
    a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public void a(b.r.a.b param1b) {
      param1b.m("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
      param1b.m("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
      param1b.m("DROP TABLE IF EXISTS alarmInfo");
      param1b.m("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
    }
  }
  
  static final class b extends androidx.room.n.a {
    b(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public void a(b.r.a.b param1b) {
      if (Build.VERSION.SDK_INT >= 23)
        param1b.m("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0"); 
    }
  }
  
  static final class c extends androidx.room.n.a {
    c(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public void a(b.r.a.b param1b) {
      param1b.m("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
      param1b.m("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
  }
  
  public static class d extends androidx.room.n.a {
    final Context c;
    
    public d(Context param1Context, int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.c = param1Context;
    }
    
    public void a(b.r.a.b param1b) {
      (new e(this.c)).c(true);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */