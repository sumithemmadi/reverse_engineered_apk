package com.allinone.callerid.d.b;

import com.allinone.callerid.callscreen.bean.ActionInfo;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.x;

public class a {
  private static a a;
  
  private DbManager b;
  
  private a() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("callscreenaction");
      daoConfig.setDbVersion(1);
      a a1 = new a();
      this(this);
      daoConfig.setDbOpenListener(a1);
      b b = new b();
      this(this);
      daoConfig.setDbUpgradeListener(b);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static a a() {
    if (a == null)
      a = new a(); 
    return a;
  }
  
  public ActionInfo b(String paramString) {
    try {
      return (ActionInfo)this.b.selector(ActionInfo.class).where("data_id", "=", paramString).findFirst();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void c(String paramString, boolean paramBoolean, int paramInt) {
    try {
      ActionInfo actionInfo = (ActionInfo)this.b.selector(ActionInfo.class).where("data_id", "=", paramString).findFirst();
      if (actionInfo != null) {
        actionInfo.setLike(paramBoolean);
        actionInfo.setLike_counts(paramInt);
        this.b.update(actionInfo, new String[] { "isLike", "like_counts" });
      } else {
        actionInfo = new ActionInfo();
        this();
        actionInfo.setData_id(paramString);
        actionInfo.setLike(paramBoolean);
        actionInfo.setLike_counts(paramInt);
        this.b.saveOrUpdate(actionInfo);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void d(String paramString, boolean paramBoolean) {
    try {
      ActionInfo actionInfo = (ActionInfo)this.b.selector(ActionInfo.class).where("data_id", "=", paramString).findFirst();
      if (actionInfo != null) {
        actionInfo.setReport(paramBoolean);
        this.b.update(actionInfo, new String[] { "isReport" });
      } else {
        actionInfo = new ActionInfo();
        this();
        actionInfo.setData_id(paramString);
        actionInfo.setReport(paramBoolean);
        this.b.saveOrUpdate(actionInfo);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbOpenListener {
    a(a this$0) {}
    
    public void onDbOpened(DbManager param1DbManager) {
      param1DbManager.getDatabase().enableWriteAheadLogging();
    }
  }
  
  class b implements DbManager.DbUpgradeListener {
    b(a this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(ActionInfo.class).findAll();
          param1DbManager.dropTable(ActionInfo.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */