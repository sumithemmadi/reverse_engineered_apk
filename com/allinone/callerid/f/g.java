package com.allinone.callerid.f;

import com.allinone.callerid.bean.ReportedContent;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.x;

public class g {
  private static g a;
  
  private DbManager b;
  
  private g() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("com.report.reportnumber");
      daoConfig.setDbVersion(1);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static g a() {
    if (a == null)
      a = new g(); 
    return a;
  }
  
  public List<ReportedContent> b() {
    try {
      return this.b.findAll(ReportedContent.class);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void c(ReportedContent paramReportedContent) {
    try {
      this.b.saveOrUpdate(paramReportedContent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(g this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(ReportedContent.class).findAll();
          param1DbManager.dropTable(ReportedContent.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */