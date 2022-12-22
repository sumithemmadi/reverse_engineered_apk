package com.allinone.callerid.f;

import com.allinone.callerid.bean.NumberContent;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.x;

public class e {
  private static e a;
  
  private DbManager b;
  
  private e() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("com.callid.number");
      daoConfig.setDbVersion(7);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static e d() {
    if (a == null)
      a = new e(); 
    return a;
  }
  
  public boolean a(String paramString) {
    boolean bool2;
    boolean bool1 = true;
    try {
      NumberContent numberContent = e(paramString);
      bool2 = bool1;
      if (numberContent != null) {
        bool2 = bool1;
        if (numberContent.is_reported()) {
          long l1 = System.currentTimeMillis();
          long l2 = numberContent.getReported_time();
          bool2 = bool1;
          if (l1 < l2)
            bool2 = false; 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool2 = bool1;
    } 
    return bool2;
  }
  
  public boolean b(String paramString) {
    boolean bool2;
    boolean bool1 = true;
    try {
      NumberContent numberContent = d().e(paramString);
      bool2 = bool1;
      if (numberContent != null) {
        long l1 = System.currentTimeMillis();
        long l2 = numberContent.getSuggest_time();
        if (l1 > l2) {
          bool2 = bool1;
        } else {
          bool2 = false;
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool2 = bool1;
    } 
    return bool2;
  }
  
  public boolean c(String paramString) {
    boolean bool2;
    boolean bool1 = true;
    try {
      NumberContent numberContent = e(paramString);
      bool2 = bool1;
      if (numberContent != null) {
        boolean bool = numberContent.is_reported_wrong();
        bool2 = bool1;
        if (bool)
          bool2 = false; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool2 = bool1;
    } 
    return bool2;
  }
  
  public NumberContent e(String paramString) {
    try {
      return (NumberContent)this.b.selector(NumberContent.class).where("number", "=", paramString).findFirst();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void f(String paramString) {
    try {
      NumberContent numberContent = (NumberContent)this.b.selector(NumberContent.class).where("number", "=", paramString).findFirst();
      if (numberContent != null) {
        numberContent.setSuggest_time(System.currentTimeMillis() + 43200000L);
        this.b.update(numberContent, new String[] { "suggest_time" });
      } else {
        numberContent = new NumberContent();
        this();
        numberContent.setNumber(paramString);
        numberContent.setSuggest_time(System.currentTimeMillis() + 43200000L);
        this.b.saveOrUpdate(numberContent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void g(String paramString) {
    try {
      NumberContent numberContent = (NumberContent)this.b.selector(NumberContent.class).where("number", "=", paramString).findFirst();
      if (numberContent != null) {
        numberContent.setIs_reported(true);
        this.b.update(numberContent, new String[] { "is_reported" });
        numberContent.setReported_time(System.currentTimeMillis() + 86400000L);
        this.b.update(numberContent, new String[] { "reported_time" });
      } else {
        numberContent = new NumberContent();
        this();
        numberContent.setNumber(paramString);
        numberContent.setIs_reported(true);
        numberContent.setReported_time(System.currentTimeMillis() + 86400000L);
        this.b.saveOrUpdate(numberContent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void h(String paramString) {
    try {
      NumberContent numberContent = (NumberContent)this.b.selector(NumberContent.class).where("number", "=", paramString).findFirst();
      if (numberContent == null) {
        numberContent = new NumberContent();
        this();
        numberContent.setNumber(paramString);
        numberContent.setSubtype_mark_time(System.currentTimeMillis() + 86400000L);
        this.b.saveOrUpdate(numberContent);
      } else {
        numberContent.setSubtype_mark_time(System.currentTimeMillis() + 86400000L);
        this.b.update(numberContent, new String[] { "subtype_mark_time" });
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void i(String paramString) {
    try {
      NumberContent numberContent = (NumberContent)this.b.selector(NumberContent.class).where("number", "=", paramString).findFirst();
      if (numberContent != null) {
        numberContent.setIs_reported_wrong(true);
        this.b.update(numberContent, new String[] { "is_reported_wrong" });
      } else {
        numberContent = new NumberContent();
        this();
        numberContent.setNumber(paramString);
        numberContent.setIs_reported_wrong(true);
        this.b.saveOrUpdate(numberContent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void j(String paramString) {
    try {
      NumberContent numberContent = (NumberContent)this.b.selector(NumberContent.class).where("number", "=", paramString).findFirst();
      if (numberContent != null) {
        numberContent.setShow_submit_comment_time(System.currentTimeMillis());
        this.b.update(numberContent, new String[] { "show_submit_comment_time" });
      } else {
        numberContent = new NumberContent();
        this();
        numberContent.setNumber(paramString);
        numberContent.setShow_submit_comment_time(System.currentTimeMillis());
        this.b.saveOrUpdate(numberContent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void k(String paramString) {
    try {
      NumberContent numberContent = (NumberContent)this.b.selector(NumberContent.class).where("number", "=", paramString).findFirst();
      if (numberContent != null) {
        numberContent.setSubmit_commentst_time(System.currentTimeMillis());
        this.b.update(numberContent, new String[] { "submit_commentst_time" });
      } else {
        numberContent = new NumberContent();
        this();
        numberContent.setNumber(paramString);
        numberContent.setSubmit_commentst_time(System.currentTimeMillis());
        this.b.saveOrUpdate(numberContent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(e this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(NumberContent.class).findAll();
          param1DbManager.dropTable(NumberContent.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */