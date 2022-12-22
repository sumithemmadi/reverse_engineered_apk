package com.allinone.callerid.f.k;

import com.allinone.callerid.bean.recorder.CustomRecord;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.x;

public class a {
  private static a a;
  
  private DbManager b;
  
  private a() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("CustomRecordDb");
      daoConfig.setDbVersion(1);
      a a1 = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a1);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static a c() {
    if (a == null)
      a = new a(); 
    return a;
  }
  
  public boolean a(CustomRecord paramCustomRecord) {
    if (paramCustomRecord != null)
      try {
        CustomRecord customRecord = (CustomRecord)this.b.selector(CustomRecord.class).where("phone", "=", paramCustomRecord.getPhone()).findFirst();
        if (customRecord == null) {
          this.b.saveOrUpdate(paramCustomRecord);
          return true;
        } 
        customRecord.setType(paramCustomRecord.getType());
        this.b.saveOrUpdate(customRecord);
        return true;
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return false;
  }
  
  public void b(String paramString) {
    try {
      WhereBuilder whereBuilder = WhereBuilder.b();
      whereBuilder.and("phone", "=", paramString);
      this.b.delete(CustomRecord.class, whereBuilder);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean d(String paramString) {
    try {
      CustomRecord customRecord = (CustomRecord)this.b.selector(CustomRecord.class).where("phone", "=", paramString).findFirst();
      if (customRecord != null) {
        int i = customRecord.getType();
        if (i == 0)
          return true; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  public List<CustomRecord> e(int paramInt) {
    try {
      return this.b.selector(CustomRecord.class).where("type", "=", Integer.valueOf(paramInt)).orderBy("id", true).findAll();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(a this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(CustomRecord.class).findAll();
          param1DbManager.dropTable(CustomRecord.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */