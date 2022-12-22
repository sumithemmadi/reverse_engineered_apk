package com.allinone.callerid.f;

import com.allinone.callerid.bean.SpamCall;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.x;

public class i {
  private static i a;
  
  private DbManager b;
  
  private i() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("com.searched.spamcall");
      daoConfig.setDbVersion(2);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static i a() {
    if (a == null)
      a = new i(); 
    return a;
  }
  
  public List<SpamCall> b() {
    try {
      return this.b.findAll(SpamCall.class);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void c(SpamCall paramSpamCall) {
    try {
      this.b.saveOrUpdate(paramSpamCall);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(i this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(SpamCall.class).findAll();
          param1DbManager.dropTable(SpamCall.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */