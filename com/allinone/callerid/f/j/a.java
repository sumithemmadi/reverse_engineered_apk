package com.allinone.callerid.f.j;

import com.allinone.callerid.bean.NoDisturbBean;
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
      daoConfig.setDbName("DisturbWhiteDb");
      daoConfig.setDbVersion(1);
      a a1 = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a1);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static a b() {
    if (a == null)
      a = new a(); 
    return a;
  }
  
  public boolean a(String paramString) {
    try {
      NoDisturbBean noDisturbBean = (NoDisturbBean)this.b.selector(NoDisturbBean.class).where("number", "=", paramString).findFirst();
      if (noDisturbBean != null) {
        this.b.delete(noDisturbBean);
        return true;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  public boolean c(String paramString) {
    try {
      NoDisturbBean noDisturbBean = (NoDisturbBean)this.b.selector(NoDisturbBean.class).where("number", "=", paramString).findFirst();
      if (noDisturbBean != null)
        return true; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  public List<NoDisturbBean> d() {
    try {
      return this.b.selector(NoDisturbBean.class).orderBy("time", true).findAll();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public boolean e(NoDisturbBean paramNoDisturbBean) {
    try {
      String str = paramNoDisturbBean.getNumber();
      if ((NoDisturbBean)this.b.selector(NoDisturbBean.class).where("number", "=", str).findFirst() == null) {
        this.b.saveOrUpdate(paramNoDisturbBean);
        return true;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(a this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */