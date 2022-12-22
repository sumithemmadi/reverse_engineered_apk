package com.allinone.callerid.f.k;

import com.allinone.callerid.bean.recorder.RecordCall;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.xutils.DbManager;
import org.xutils.db.sqlite.SqlInfo;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.db.table.DbModel;
import org.xutils.x;

public class b {
  private static b a;
  
  private DbManager b;
  
  private b() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("NumberSearchDb");
      daoConfig.setDbVersion(1);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static b d() {
    if (a == null)
      a = new b(); 
    return a;
  }
  
  public void a(RecordCall paramRecordCall) {
    if (paramRecordCall != null)
      try {
        this.b.save(paramRecordCall);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public boolean b(long paramLong) {
    if (paramLong != 0L)
      try {
        WhereBuilder whereBuilder = WhereBuilder.b();
        whereBuilder.and("endtime", "<", Long.valueOf(paramLong));
        this.b.delete(RecordCall.class, whereBuilder);
        return true;
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return false;
  }
  
  public void c(String paramString) {
    try {
      this.b.delete(RecordCall.class, WhereBuilder.b("filepath", "=", paramString));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public int e(String paramString) {
    if (paramString != null)
      try {
        List list = this.b.selector(RecordCall.class).where("number", "=", paramString).findAll();
        if (list != null)
          return list.size(); 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return 0;
  }
  
  public List<RecordCall> f(String paramString) {
    try {
      return this.b.selector(RecordCall.class).where("number", "=", paramString).orderBy("starttime", true).findAll();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public String g(String paramString) {
    try {
      RecordCall recordCall = (RecordCall)this.b.selector(RecordCall.class).where("number", "=", paramString).findFirst();
      if (recordCall != null)
        return recordCall.getName(); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return null;
  }
  
  public List<RecordCall> h(int paramInt) {
    try {
      return this.b.selector(RecordCall.class).where("numbertype", "=", Integer.valueOf(paramInt)).orderBy("starttime", true).findAll();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public List<DbModel> i() {
    try {
      DbManager dbManager = this.b;
      SqlInfo sqlInfo = new SqlInfo();
      this("select * from RrcordCall where numbertype = 101  group by number  order by name");
      return dbManager.findDbModelAll(sqlInfo);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public List<RecordCall> j(int paramInt) {
    try {
      return this.b.selector(RecordCall.class).where("numbertype", "=", Integer.valueOf(100)).and("phonestatus", "=", Integer.valueOf(paramInt)).orderBy("starttime", true).findAll();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void k(String paramString1, String paramString2) {
    (new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)).format(new Date());
    try {
      List list = this.b.selector(RecordCall.class).where("filepath", "=", paramString1).findAll();
      if (list != null && list.size() > 0)
        for (RecordCall recordCall : list) {
          recordCall.setRemark(paramString2);
          this.b.saveOrUpdate(recordCall);
        }  
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(b this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(RecordCall.class).findAll();
          param1DbManager.dropTable(RecordCall.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */