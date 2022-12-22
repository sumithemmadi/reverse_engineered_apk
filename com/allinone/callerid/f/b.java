package com.allinone.callerid.f;

import com.allinone.callerid.bean.BlockCall;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.x;

public class b {
  private static b a;
  
  private DbManager b;
  
  private b() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("com.block.blockcall");
      daoConfig.setDbVersion(1);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static b a() {
    if (a == null)
      a = new b(); 
    return a;
  }
  
  public List<BlockCall> b() {
    try {
      return this.b.findAll(BlockCall.class);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void c(BlockCall paramBlockCall) {
    try {
      this.b.saveOrUpdate(paramBlockCall);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(b this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(BlockCall.class).findAll();
          param1DbManager.dropTable(BlockCall.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */