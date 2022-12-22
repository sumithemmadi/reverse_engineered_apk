package com.allinone.callerid.mvc.controller.report;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.allinone.callerid.b.j;
import com.allinone.callerid.i.a.v.c;
import com.allinone.callerid.i.a.v.d;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class b extends Fragment {
  private LayoutInflater c0;
  
  private ListView d0;
  
  private List<CallLogBean> e0 = new ArrayList<CallLogBean>();
  
  private HashMap<String, Integer> f0 = new HashMap<String, Integer>();
  
  private j g0;
  
  private List<String> h0 = new ArrayList<String>();
  
  private ReportListActivity i0;
  
  private void T1() {
    d.b((Context)m(), this.e0, this.h0, this.f0, new b(this));
  }
  
  private void U1() {
    View view = this.c0.inflate(2131493216, null);
    ((TextView)view.findViewById(2131298062)).setTypeface(g1.b());
    this.d0.addHeaderView(view, null, false);
  }
  
  public static b V1() {
    return new b();
  }
  
  private void W1(List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap) {
    j j1 = new j((Context)this.i0, paramList, paramHashMap, this.d0, null, null, null);
    this.g0 = j1;
    this.d0.setAdapter((ListAdapter)j1);
  }
  
  public void I0() {
    super.I0();
  }
  
  public void N0() {
    super.N0();
  }
  
  public void R0(View paramView, Bundle paramBundle) {
    super.R0(paramView, paramBundle);
    this.d0 = (ListView)paramView.findViewById(2131297336);
    this.e0 = new ArrayList<CallLogBean>();
    U1();
    W1(this.e0, this.f0);
    this.d0.setOnItemClickListener(new a(this));
    T1();
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.i0 = (ReportListActivity)paramContext;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
    this.c0 = paramLayoutInflater;
    return View.inflate((Context)m(), 2131493045, null);
  }
  
  public void x0() {
    super.x0();
  }
  
  class a implements AdapterView.OnItemClickListener {
    a(b this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (b.Q1(this.b) != null && b.Q1(this.b).size() != 0) {
        CallLogBean callLogBean = b.Q1(this.b).get(param1Int);
        Intent intent = new Intent((Context)this.b.m(), ReportContactActivity.class);
        intent.putExtra("report_number", callLogBean.p());
        this.b.M1(intent);
        this.b.m().overridePendingTransition(2130772034, 0);
      } 
    }
  }
  
  class b implements c {
    b(b this$0) {}
    
    public void a(List<CallLogBean> param1List, HashMap<String, Integer> param1HashMap) {
      b.R1(this.a, param1List, param1HashMap);
      b.S1(this.a).notifyDataSetChanged();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/report/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */