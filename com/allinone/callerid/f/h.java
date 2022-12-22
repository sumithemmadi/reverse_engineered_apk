package com.allinone.callerid.f;

import com.allinone.callerid.bean.SearchHis;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.x;

public class h {
  private static h a;
  
  private DbManager b;
  
  private h() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("callid.search.history");
      daoConfig.setDbVersion(1);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static h b() {
    if (a == null)
      a = new h(); 
    return a;
  }
  
  public void a() {
    try {
      this.b.delete(SearchHis.class);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public List<SearchHis> c() {
    try {
      return this.b.findAll(SearchHis.class);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public SearchHis d(String paramString) {
    try {
      return (SearchHis)this.b.selector(SearchHis.class).where("number", "=", paramString).findFirst();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void e(SearchHis paramSearchHis) {
    try {
      this.b.saveOrUpdate(paramSearchHis);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(h this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(SearchHis.class).findAll();
          param1DbManager.dropTable(SearchHis.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */