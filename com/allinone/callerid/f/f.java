package com.allinone.callerid.f;

import com.allinone.callerid.model.EZSearchContacts;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.x;

public class f {
  private static f a;
  
  private DbManager b;
  
  private f() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("com.callid.search");
      daoConfig.setDbVersion(12);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static f b() {
    if (a == null)
      a = new f(); 
    return a;
  }
  
  public void a() {
    try {
      this.b.delete(EZSearchContacts.class);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void c(EZSearchContacts paramEZSearchContacts) {
    try {
      this.b.saveOrUpdate(paramEZSearchContacts);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public EZSearchContacts d(String paramString) {
    try {
      return (EZSearchContacts)this.b.selector(EZSearchContacts.class).where("old_tel_number", "=", paramString).findFirst();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void e(EZSearchContacts paramEZSearchContacts, String... paramVarArgs) {
    try {
      this.b.update(paramEZSearchContacts, paramVarArgs);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(f this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(EZSearchContacts.class).findAll();
          param1DbManager.dropTable(EZSearchContacts.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */