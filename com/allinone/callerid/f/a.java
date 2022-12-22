package com.allinone.callerid.f;

import android.content.Context;
import android.content.Intent;
import com.allinone.callerid.bean.AdContent;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.i1;
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
      daoConfig.setDbName("com.callid.adcontent");
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
  
  public boolean a() {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = bool2;
    try {
      AdContent adContent = (AdContent)this.b.selector(AdContent.class).where("adname", "=", "firstname").findFirst();
      if (adContent != null) {
        bool3 = bool2;
        bool2 = adContent.isSelected();
        bool1 = bool2;
        if (bool2) {
          bool3 = bool2;
          bool1 = bool2;
          if ("bigfatwhiteguy@gmail.com".equals(i1.F()))
            return false; 
        } 
      } else {
        bool3 = bool2;
        bool2 = "bigfatwhiteguy@gmail.com".equals(i1.F());
        if (bool2)
          return false; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool1 = bool3;
    } 
    return bool1;
  }
  
  public void b() {
    try {
      AdContent adContent = (AdContent)this.b.selector(AdContent.class).where("adname", "=", "firstname").findFirst();
      if (adContent != null) {
        adContent.setSelected(false);
        this.b.update(adContent, new String[] { "isSelected" });
      } else {
        adContent = new AdContent();
        this();
        adContent.setAdname("firstname");
        adContent.setSelected(false);
        this.b.saveOrUpdate(adContent);
      } 
      b.p.a.a a1 = b.p.a.a.b((Context)EZCallApplication.c());
      Intent intent = new Intent();
      this("com.allinone.callerid.CLOSE_AD");
      a1.d(intent);
      (com.allinone.callerid.util.gg.a.a()).b = null;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void d() {
    try {
      AdContent adContent = (AdContent)this.b.selector(AdContent.class).where("adname", "=", "firstname").findFirst();
      if (adContent != null) {
        adContent.setSelected(true);
        this.b.update(adContent, new String[] { "isSelected" });
      } else {
        adContent = new AdContent();
        this();
        adContent.setAdname("firstname");
        adContent.setSelected(true);
        this.b.saveOrUpdate(adContent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(a this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(AdContent.class).findAll();
          param1DbManager.dropTable(AdContent.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */