package com.allinone.callerid.f;

import android.util.Log;
import com.allinone.callerid.bean.CommentContent;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

public class d {
  private static d a;
  
  private DbManager b;
  
  private d() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig = daoConfig.setDbName("comment").setDbVersion(3);
      c c = new c();
      this(this);
      daoConfig = daoConfig.setDbOpenListener(c);
      b b = new b();
      this(this);
      daoConfig = daoConfig.setDbUpgradeListener(b);
      a a = new a();
      this(this);
      this.b = x.getDb(daoConfig.setTableCreateListener(a));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static d a() {
    if (a == null)
      a = new d(); 
    return a;
  }
  
  public List<CommentContent> b(String paramString) {
    try {
      return this.b.selector(CommentContent.class).where("tel_number", "=", paramString).orderBy("id", true).findAll();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public void c(CommentContent paramCommentContent) {
    try {
      this.b.saveOrUpdate(paramCommentContent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements DbManager.TableCreateListener {
    a(d this$0) {}
    
    public void onTableCreated(DbManager param1DbManager, TableEntity<?> param1TableEntity) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onTableCreated：");
      stringBuilder.append(param1TableEntity.getName());
      Log.i("JAVA", stringBuilder.toString());
    }
  }
  
  class b implements DbManager.DbUpgradeListener {
    b(d this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {
      if (param1Int2 != param1Int1)
        try {
          List list = param1DbManager.selector(CommentContent.class).findAll();
          param1DbManager.dropTable(CommentContent.class);
          param1DbManager.save(list);
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
  
  class c implements DbManager.DbOpenListener {
    c(d this$0) {}
    
    public void onDbOpened(DbManager param1DbManager) {
      param1DbManager.getDatabase().enableWriteAheadLogging();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */