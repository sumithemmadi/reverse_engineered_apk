package com.allinone.callerid.d.b;

import android.util.Log;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.util.d0;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

public class e {
  private static e a;
  
  DbManager.DaoConfig b = (new DbManager.DaoConfig()).setDbName("showanimation.db").setDbVersion(3).setDbOpenListener(new c(this)).setDbUpgradeListener(new b(this)).setTableCreateListener(new a(this));
  
  public DbManager c;
  
  public static e e() {
    if (a == null)
      a = new e(); 
    return a;
  }
  
  public void a(HomeInfo paramHomeInfo) {
    if (paramHomeInfo != null)
      try {
        DbManager dbManager = x.getDb(this.b);
        this.c = dbManager;
        HomeInfo homeInfo = (HomeInfo)dbManager.selector(HomeInfo.class).findFirst();
        if (homeInfo != null) {
          if (d0.a)
            d0.a("wbb", "更新数据0"); 
          homeInfo.setIsselect(paramHomeInfo.isIsselect());
          homeInfo.setPath(paramHomeInfo.getPath());
          homeInfo.setPhone(paramHomeInfo.getPhone());
          homeInfo.setName(paramHomeInfo.getName());
          homeInfo.setIsdiy(paramHomeInfo.isIsdiy());
          homeInfo.setUseVideoAudioRing(paramHomeInfo.isUseVideoAudioRing());
          this.c.update(homeInfo, new String[] { "isselect", "path", "phone", "name", "isdiy", "isUseVideoAudioRing" });
        } else {
          paramHomeInfo.setIsdefault(true);
          this.c.save(paramHomeInfo);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public boolean b() {
    boolean bool = false;
    try {
      DbManager dbManager = x.getDb(this.b);
      this.c = dbManager;
      HomeInfo homeInfo = (HomeInfo)dbManager.selector(HomeInfo.class).where("isdiy", "=", Boolean.TRUE).findFirst();
      if (homeInfo != null)
        bool = true; 
      return bool;
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
  }
  
  public void c(String paramString) {
    if (paramString != null)
      try {
        DbManager dbManager = x.getDb(this.b);
        this.c = dbManager;
        dbManager.delete(HomeInfo.class, WhereBuilder.b("path", "=", paramString));
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void d() {
    try {
      DbManager dbManager = x.getDb(this.b);
      this.c = dbManager;
      dbManager.delete(HomeInfo.class, WhereBuilder.b("isdiy", "=", Boolean.TRUE));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public HomeInfo f() {
    try {
      DbManager dbManager = x.getDb(this.b);
      this.c = dbManager;
      return (HomeInfo)dbManager.selector(HomeInfo.class).where("isdefault", "=", Boolean.TRUE).findFirst();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public HomeInfo g() {
    try {
      DbManager dbManager = x.getDb(this.b);
      this.c = dbManager;
      return (HomeInfo)dbManager.selector(HomeInfo.class).where("isdiy", "=", Boolean.TRUE).findFirst();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public boolean h(HomeInfo paramHomeInfo) {
    if (paramHomeInfo != null)
      try {
        DbManager dbManager = x.getDb(this.b);
        this.c = dbManager;
        paramHomeInfo = (HomeInfo)dbManager.selector(HomeInfo.class).where("isdefault", "=", Boolean.TRUE).and("name", "=", paramHomeInfo.getName()).findFirst();
        if (paramHomeInfo != null)
          return true; 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return false;
  }
  
  class a implements DbManager.TableCreateListener {
    a(e this$0) {}
    
    public void onTableCreated(DbManager param1DbManager, TableEntity<?> param1TableEntity) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onTableCreated：");
      stringBuilder.append(param1TableEntity.getName());
      Log.i("JAVA", stringBuilder.toString());
    }
  }
  
  class b implements DbManager.DbUpgradeListener {
    b(e this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(HomeInfo.class).findAll();
          param1DbManager.dropTable(HomeInfo.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          Log.e("wbb", "数据库更新失败");
          exception.printStackTrace();
        }  
    }
  }
  
  class c implements DbManager.DbOpenListener {
    c(e this$0) {}
    
    public void onDbOpened(DbManager param1DbManager) {
      param1DbManager.getDatabase().enableWriteAheadLogging();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */