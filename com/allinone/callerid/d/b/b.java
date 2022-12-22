package com.allinone.callerid.d.b;

import com.allinone.callerid.callscreen.bean.DownloadInfo;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.util.d0;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

public class b {
  private static b a;
  
  public DbManager b;
  
  private b() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig = daoConfig.setDbName("download.db").setDbVersion(1);
      c c = new c();
      this(this);
      daoConfig = daoConfig.setDbOpenListener(c);
      b b1 = new b();
      this(this);
      daoConfig = daoConfig.setDbUpgradeListener(b1);
      a a = new a();
      this(this);
      this.b = x.getDb(daoConfig.setTableCreateListener(a));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static b b() {
    if (a == null)
      a = new b(); 
    return a;
  }
  
  public boolean a(DownloadInfo paramDownloadInfo) {
    if (paramDownloadInfo != null)
      try {
        DownloadInfo downloadInfo = (DownloadInfo)this.b.selector(DownloadInfo.class).where("dataId", "=", paramDownloadInfo.getDataId()).findFirst();
        if (downloadInfo != null) {
          downloadInfo.setAudio_path(paramDownloadInfo.getAudio_path());
          downloadInfo.setPath(paramDownloadInfo.getPath());
          downloadInfo.setDownloadStatus(1);
          downloadInfo.setTime(System.currentTimeMillis());
          this.b.update(downloadInfo, new String[] { "path", "audio_path", "download_status", "time" });
          if (d0.a)
            d0.a("callscreen", "更新数据库"); 
          return true;
        } 
        paramDownloadInfo.setDownloadStatus(1);
        paramDownloadInfo.setTime(System.currentTimeMillis());
        this.b.save(paramDownloadInfo);
        if (d0.a)
          d0.a("callscreen", "添加到数据库"); 
        return true;
      } catch (Exception exception) {
        exception.printStackTrace();
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Exception: ");
          stringBuilder.append(exception.getMessage());
          d0.a("wbb", stringBuilder.toString());
        } 
      }  
    return false;
  }
  
  public DownloadInfo c(HomeInfo paramHomeInfo) {
    if (paramHomeInfo != null) {
      DownloadInfo downloadInfo = new DownloadInfo();
      downloadInfo.setName(paramHomeInfo.getName());
      downloadInfo.setPath(paramHomeInfo.getPath());
      downloadInfo.setAudio_path(paramHomeInfo.getAudio_path());
      downloadInfo.setTime(paramHomeInfo.getTime());
      downloadInfo.setDataId(paramHomeInfo.getData_id());
      return downloadInfo;
    } 
    return null;
  }
  
  public DownloadInfo d(String paramString) {
    try {
      DownloadInfo downloadInfo = (DownloadInfo)this.b.selector(DownloadInfo.class).where("dataId", "=", paramString).and("download_status", "=", Integer.valueOf(1)).findFirst();
      if (downloadInfo != null)
        return downloadInfo; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return null;
  }
  
  class a implements DbManager.TableCreateListener {
    a(b this$0) {}
    
    public void onTableCreated(DbManager param1DbManager, TableEntity<?> param1TableEntity) {}
  }
  
  class b implements DbManager.DbUpgradeListener {
    b(b this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      try {
        List list = param1DbManager.selector(DownloadInfo.class).findAll();
        param1DbManager.dropTable(DownloadInfo.class);
        param1DbManager.save(list);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class c implements DbManager.DbOpenListener {
    c(b this$0) {}
    
    public void onDbOpened(DbManager param1DbManager) {
      param1DbManager.getDatabase().enableWriteAheadLogging();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */