package com.allinone.callerid.i.a.n;

import com.allinone.callerid.bean.ParserIpBean;
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
      daoConfig.setDbName("parseripdb");
      daoConfig.setDbVersion(1);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static c a() {
    if (a == null)
      a = new c(); 
    return a;
  }
  
  public ParserIpBean b() {
    ParserIpBean parserIpBean2;
    ParserIpBean parserIpBean1 = null;
    try {
      List<ParserIpBean> list = this.b.findAll(ParserIpBean.class);
      parserIpBean2 = parserIpBean1;
      if (list != null) {
        parserIpBean2 = parserIpBean1;
        if (list.size() > 0)
          parserIpBean2 = list.get(0); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      parserIpBean2 = parserIpBean1;
    } 
    return parserIpBean2;
  }
  
  public void c(ParserIpBean paramParserIpBean) {
    try {
      ParserIpBean parserIpBean = b();
      if (parserIpBean == null) {
        this.b.saveOrUpdate(paramParserIpBean);
      } else {
        parserIpBean.setTrue_ip(paramParserIpBean.getTrue_ip());
        parserIpBean.setCountry(paramParserIpBean.getCountry());
        parserIpBean.setCountry_full(paramParserIpBean.getCountry_full());
        parserIpBean.setState(paramParserIpBean.getState());
        parserIpBean.setState_full(paramParserIpBean.getState_full());
        parserIpBean.setCity(paramParserIpBean.getCity());
        this.b.update(parserIpBean, new String[] { "true_ip", "country", "country_full", "state", "state_full", "city" });
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(c this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(ParserIpBean.class).findAll();
          param1DbManager.dropTable(ParserIpBean.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/n/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */