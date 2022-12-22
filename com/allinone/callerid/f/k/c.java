package com.allinone.callerid.f.k;

import com.allinone.callerid.bean.recorder.AudioSourceInfo;
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
      daoConfig.setDbName("RecorderConfigurationDb");
      daoConfig.setDbVersion(1);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static c b() {
    if (a == null)
      a = new c(); 
    return a;
  }
  
  public void a(List<AudioSourceInfo> paramList) {
    if (paramList != null)
      try {
        this.b.saveBindingId(paramList);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public List<AudioSourceInfo> c() {
    try {
      return this.b.findAll(AudioSourceInfo.class);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public boolean d(String paramString) {
    try {
      for (AudioSourceInfo audioSourceInfo1 : this.b.selector(AudioSourceInfo.class).where("isselected", "=", Boolean.TRUE).findAll()) {
        audioSourceInfo1.setIsselected(false);
        this.b.saveOrUpdate(audioSourceInfo1);
      } 
      AudioSourceInfo audioSourceInfo = (AudioSourceInfo)this.b.selector(AudioSourceInfo.class).where("showname", "=", paramString).findFirst();
      audioSourceInfo.setIsselected(true);
      this.b.saveOrUpdate(audioSourceInfo);
      return true;
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(c this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(AudioSourceInfo.class).findAll();
          param1DbManager.dropTable(AudioSourceInfo.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */