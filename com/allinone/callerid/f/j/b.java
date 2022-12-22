package com.allinone.callerid.f.j;

import com.allinone.callerid.bean.WeekInfo;
import com.allinone.callerid.util.d0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.xutils.DbManager;
import org.xutils.x;

public class b {
  private static b a;
  
  private DbManager b;
  
  private b() {
    try {
      DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
      this();
      daoConfig.setDbName("WeekDb");
      daoConfig.setDbVersion(1);
      a a = new a();
      this(this);
      daoConfig.setDbUpgradeListener(a);
      this.b = x.getDb(daoConfig);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static b a() {
    if (a == null)
      a = new b(); 
    return a;
  }
  
  public void b() {
    try {
      List<WeekInfo> list = d();
      if (list == null || list.size() <= 0) {
        list = new ArrayList<WeekInfo>();
        super();
        byte b1 = 0;
        while (b1 < 7) {
          WeekInfo weekInfo1 = new WeekInfo();
          this();
          weekInfo1.setWeekId(++b1);
          weekInfo1.setSelect(true);
          list.add(weekInfo1);
        } 
        WeekInfo weekInfo = new WeekInfo();
        this();
        weekInfo.setSelect(true);
        weekInfo.setWeekId(-1);
        list.add(weekInfo);
        e((ArrayList<WeekInfo>)list);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean c() {
    try {
      Calendar calendar = Calendar.getInstance();
      byte b1 = 7;
      int i = calendar.get(7) - 1;
      if (i == 0)
        i = b1; 
      WeekInfo weekInfo = (WeekInfo)this.b.selector(WeekInfo.class).where("weekId", "=", Integer.valueOf(i)).findFirst();
      if (weekInfo != null) {
        boolean bool = weekInfo.isSelect();
        if (bool)
          return true; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  public List<WeekInfo> d() {
    try {
      return this.b.selector(WeekInfo.class).findAll();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public boolean e(ArrayList<WeekInfo> paramArrayList) {
    if (d0.a)
      d0.a("wbb", "保存数据集合: "); 
    try {
      this.b.saveOrUpdate(paramArrayList);
      return true;
    } catch (Exception exception) {
      exception.printStackTrace();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("saveData_Exception: ");
        stringBuilder.append(exception.getMessage());
        d0.a("wbb", stringBuilder.toString());
      } 
      return false;
    } 
  }
  
  public void f(ArrayList<WeekInfo> paramArrayList) {
    try {
      this.b.delete(WeekInfo.class);
      this.b.save(paramArrayList);
    } catch (Exception exception) {
      exception.printStackTrace();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("saveData_Exception: ");
        stringBuilder.append(exception.getMessage());
        d0.a("wbb", stringBuilder.toString());
      } 
    } 
  }
  
  class a implements DbManager.DbUpgradeListener {
    a(b this$0) {}
    
    public void onUpgrade(DbManager param1DbManager, int param1Int1, int param1Int2) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/f/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */