package com.allinone.callerid.i.a.k;

import android.os.AsyncTask;
import com.allinone.callerid.bean.WeekInfo;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i;
import java.util.ArrayList;

public class d {
  public static void a(ArrayList<WeekInfo> paramArrayList) {
    try {
      a a = new a();
      this(paramArrayList);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(c paramc) {
    try {
      b b = new b();
      this(paramc);
      b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, ArrayList<WeekInfo>> {
    private ArrayList<WeekInfo> a;
    
    public a(ArrayList<WeekInfo> param1ArrayList) {
      this.a = param1ArrayList;
    }
    
    protected ArrayList<WeekInfo> a(String... param1VarArgs) {
      ArrayList<WeekInfo> arrayList = this.a;
      if (arrayList != null && arrayList.size() > 0)
        com.allinone.callerid.f.j.b.a().f(this.a); 
      return this.a;
    }
  }
  
  private static class b extends AsyncTask<String, Void, ArrayList<WeekInfo>> {
    private c a;
    
    public b(c param1c) {
      this.a = param1c;
    }
    
    protected ArrayList<WeekInfo> a(String... param1VarArgs) {
      ArrayList<WeekInfo> arrayList = (ArrayList)com.allinone.callerid.f.j.b.a().d();
      if (arrayList != null && arrayList.size() > 0) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("list: ");
          stringBuilder.append(arrayList.toString());
          d0.a("wbb", stringBuilder.toString());
        } 
        for (WeekInfo weekInfo : arrayList) {
          if (weekInfo.getWeekId() == -1) {
            weekInfo.setWeek(EZCallApplication.c().getString(2131755009));
            continue;
          } 
          weekInfo.setWeek(i.o(weekInfo.getWeekId()));
        } 
      } 
      return arrayList;
    }
    
    protected void b(ArrayList<WeekInfo> param1ArrayList) {
      super.onPostExecute(param1ArrayList);
      c c1 = this.a;
      if (c1 != null)
        c1.a(param1ArrayList); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */