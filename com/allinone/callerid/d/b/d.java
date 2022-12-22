package com.allinone.callerid.d.b;

import com.allinone.callerid.callscreen.bean.RewardedAdInfo;
import com.allinone.callerid.util.d0;
import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

public class d {
  private static d a;
  
  public DbManager b;
  
  private d() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig = daoConfig.setDbName("rewardedad").setDbVersion(1);
      b b = new b();
      this(this);
      daoConfig = daoConfig.setDbOpenListener(b);
      a a = new a();
      this(this);
      this.b = x.getDb(daoConfig.setTableCreateListener(a));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static d b() {
    if (a == null)
      a = new d(); 
    return a;
  }
  
  public boolean a(RewardedAdInfo paramRewardedAdInfo) {
    if (paramRewardedAdInfo != null)
      try {
        if ((RewardedAdInfo)this.b.selector(RewardedAdInfo.class).where("dataId", "=", paramRewardedAdInfo.getDataId()).findFirst() == null) {
          this.b.save(paramRewardedAdInfo);
          if (d0.a)
            d0.a("wbb", "添加解锁数据到数据库"); 
          return true;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Exception: ");
          stringBuilder.append(exception.getMessage());
          d0.a("wbb", stringBuilder.toString());
        } 
      }  
    return false;
  }
  
  public boolean c(String paramString) {
    try {
      RewardedAdInfo rewardedAdInfo = (RewardedAdInfo)this.b.selector(RewardedAdInfo.class).where("dataId", "=", paramString).findFirst();
      if (rewardedAdInfo != null)
        return true; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  class a implements DbManager.TableCreateListener {
    a(d this$0) {}
    
    public void onTableCreated(DbManager param1DbManager, TableEntity<?> param1TableEntity) {}
  }
  
  class b implements DbManager.DbOpenListener {
    b(d this$0) {}
    
    public void onDbOpened(DbManager param1DbManager) {
      param1DbManager.getDatabase().enableWriteAheadLogging();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */