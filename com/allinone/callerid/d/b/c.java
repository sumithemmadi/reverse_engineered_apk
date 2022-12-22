package com.allinone.callerid.d.b;

import android.util.Log;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.util.d0;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

public class c {
  private static c a;
  
  private DbManager b;
  
  private c() {
    try {
      DbManager.DaoConfig daoConfig2 = new DbManager.DaoConfig();
      this();
      DbManager.DaoConfig daoConfig4 = daoConfig2.setDbName("resourcedb.db").setDbVersion(2);
      c c1 = new c();
      this(this);
      DbManager.DaoConfig daoConfig1 = daoConfig4.setDbOpenListener(c1);
      b b = new b();
      this(this);
      DbManager.DaoConfig daoConfig3 = daoConfig1.setDbUpgradeListener(b);
      a a = new a();
      this(this);
      this.b = x.getDb(daoConfig3.setTableCreateListener(a));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static c d() {
    if (a == null)
      a = new c(); 
    return a;
  }
  
  public void a(PersonaliseContact paramPersonaliseContact) {
    try {
      PersonaliseContact personaliseContact = (PersonaliseContact)this.b.selector(PersonaliseContact.class).where("contacts_id", "=", Integer.valueOf(paramPersonaliseContact.getContacts_id())).findFirst();
      if (personaliseContact != null) {
        personaliseContact.setDataId(paramPersonaliseContact.getDataId());
        personaliseContact.setPath(paramPersonaliseContact.getPath());
        personaliseContact.setThemtname(paramPersonaliseContact.getThemtname());
        personaliseContact.setIsdiy(paramPersonaliseContact.isIsdiy());
        personaliseContact.setUseVideoAudioRing(paramPersonaliseContact.isUseVideoAudioRing());
        this.b.update(personaliseContact, new String[] { "data_id", "path", "themtname", "isdiy", "isUseVideoAudioRing" });
      } else {
        this.b.save(paramPersonaliseContact);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean b() {
    boolean bool = false;
    try {
      PersonaliseContact personaliseContact = (PersonaliseContact)this.b.selector(PersonaliseContact.class).where("isdiy", "=", Boolean.TRUE).findFirst();
      if (personaliseContact != null)
        bool = true; 
      return bool;
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
  }
  
  public void c(String paramString) {
    try {
      WhereBuilder whereBuilder = WhereBuilder.b("path", "=", paramString).and("isdiy", "=", Boolean.TRUE);
      this.b.delete(PersonaliseContact.class, whereBuilder);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public List<PersonaliseContact> e() {
    try {
      return this.b.selector(PersonaliseContact.class).where("isdiy", "=", Boolean.TRUE).findAll();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public PersonaliseContact f(String paramString) {
    try {
      return (PersonaliseContact)this.b.selector(PersonaliseContact.class).where("contacts_id", "=", paramString).findFirst();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public PersonaliseContact g(String paramString) {
    try {
      return (PersonaliseContact)this.b.selector(PersonaliseContact.class).where("num", "=", paramString).findFirst();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public boolean h(String paramString) {
    boolean bool1 = false;
    boolean bool2 = false;
    try {
      PersonaliseContact personaliseContact = (PersonaliseContact)this.b.selector(PersonaliseContact.class).where("data_id", "=", paramString).findFirst();
      if (personaliseContact != null) {
        boolean bool3 = true;
        boolean bool4 = true;
        bool2 = bool4;
        bool1 = bool3;
        if (d0.a) {
          bool2 = bool4;
          StringBuilder stringBuilder = new StringBuilder();
          bool2 = bool4;
          this();
          bool2 = bool4;
          stringBuilder.append("personaliseContact:");
          bool2 = bool4;
          stringBuilder.append(personaliseContact.toString());
          bool2 = bool4;
          d0.a("callscreen", stringBuilder.toString());
          bool1 = bool3;
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool1 = bool2;
    } 
    return bool1;
  }
  
  class a implements DbManager.TableCreateListener {
    a(c this$0) {}
    
    public void onTableCreated(DbManager param1DbManager, TableEntity<?> param1TableEntity) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onTableCreated：");
      stringBuilder.append(param1TableEntity.getName());
      Log.i("JAVA", stringBuilder.toString());
    }
  }
  
  class b implements DbManager.DbUpgradeListener {
    b(c this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(PersonaliseContact.class).findAll();
          param1DbManager.dropTable(PersonaliseContact.class);
          param1DbManager.save(list);
          if (d0.a)
            d0.a("wbb", "数据库更新成功"); 
        } catch (Exception exception) {
          Log.e("test", "数据库更新失败");
          exception.printStackTrace();
        }  
    }
  }
  
  class c implements DbManager.DbOpenListener {
    c(c this$0) {}
    
    public void onDbOpened(DbManager param1DbManager) {
      param1DbManager.getDatabase().enableWriteAheadLogging();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */