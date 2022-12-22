package com.allinone.callerid.f;

import com.allinone.callerid.bean.CollectInfo;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.x;

public class c {
  private static c a;
  
  private DbManager b;
  
  private c() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("collectuserinfo");
      daoConfig.setDbVersion(1);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static c b() {
    if (a == null)
      a = new c(); 
    return a;
  }
  
  public void a() {
    try {
      this.b.delete(CollectInfo.class);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void c(CollectInfo paramCollectInfo) {
    try {
      this.b.saveOrUpdate(paramCollectInfo);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public List<CollectInfo> d() {
    try {
      return this.b.findAll(CollectInfo.class);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(c this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(CollectInfo.class).findAll();
          param1DbManager.dropTable(CollectInfo.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */