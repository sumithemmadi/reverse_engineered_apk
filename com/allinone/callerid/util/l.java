package com.allinone.callerid.util;

import android.util.Log;
import com.allinone.callerid.bean.CustomBlock;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

public class l {
  public static String a = "block.db";
  
  private static l b;
  
  public static l a() {
    if (b == null)
      b = new l(); 
    return b;
  }
  
  public DbManager b() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig = daoConfig.setDbName(a).setDbVersion(3);
      c c = new c();
      this(this);
      daoConfig = daoConfig.setDbOpenListener(c);
      b b = new b();
      this(this);
      daoConfig = daoConfig.setDbUpgradeListener(b);
      a a = new a();
      this(this);
      return x.getDb(daoConfig.setTableCreateListener(a));
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  class a implements DbManager.TableCreateListener {
    a(l this$0) {}
    
    public void onTableCreated(DbManager param1DbManager, TableEntity<?> param1TableEntity) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onTableCreated：");
      stringBuilder.append(param1TableEntity.getName());
      Log.i("JAVA", stringBuilder.toString());
    }
  }
  
  class b implements DbManager.DbUpgradeListener {
    b(l this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(CustomBlock.class).findAll();
          param1DbManager.dropTable(CustomBlock.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
  
  class c implements DbManager.DbOpenListener {
    c(l this$0) {}
    
    public void onDbOpened(DbManager param1DbManager) {
      param1DbManager.getDatabase().enableWriteAheadLogging();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */