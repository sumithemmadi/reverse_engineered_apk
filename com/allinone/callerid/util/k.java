package com.allinone.callerid.util;

import android.util.Log;
import com.allinone.callerid.bean.EZBlackList;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

public class k {
  private static k a;
  
  public static k a() {
    if (a == null)
      a = new k(); 
    return a;
  }
  
  public DbManager b() {
    try {
      DbManager.DaoConfig daoConfig2 = new DbManager.DaoConfig();
      this();
      DbManager.DaoConfig daoConfig4 = daoConfig2.setDbName("blacklist").setDbVersion(6);
      c c = new c();
      this(this);
      DbManager.DaoConfig daoConfig1 = daoConfig4.setDbOpenListener(c);
      b b = new b();
      this(this);
      DbManager.DaoConfig daoConfig3 = daoConfig1.setDbUpgradeListener(b);
      a a = new a();
      this(this);
      return x.getDb(daoConfig3.setTableCreateListener(a));
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  class a implements DbManager.TableCreateListener {
    a(k this$0) {}
    
    public void onTableCreated(DbManager param1DbManager, TableEntity<?> param1TableEntity) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onTableCreated：");
      stringBuilder.append(param1TableEntity.getName());
      Log.i("JAVA", stringBuilder.toString());
    }
  }
  
  class b implements DbManager.DbUpgradeListener {
    b(k this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(EZBlackList.class).findAll();
          param1DbManager.dropTable(EZBlackList.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
  
  class c implements DbManager.DbOpenListener {
    c(k this$0) {}
    
    public void onDbOpened(DbManager param1DbManager) {
      param1DbManager.getDatabase().enableWriteAheadLogging();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */