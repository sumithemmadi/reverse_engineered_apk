package com.allinone.callerid.mvc.controller.report;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.allinone.callerid.b.r;
import com.allinone.callerid.i.a.v.d;
import com.allinone.callerid.i.a.v.e;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.contactpdt.ContactActivity;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import java.util.ArrayList;
import java.util.List;

public class a extends Fragment {
  private ListView c0;
  
  private ArrayList<CallLogBean> d0;
  
  private ArrayList<CallLogBean> e0;
  
  private r f0;
  
  private RelativeLayout g0;
  
  public List h0 = new ArrayList();
  
  private c i0;
  
  private TextView j0;
  
  private TextView k0;
  
  private LinearLayout l0;
  
  private LinearLayout m0;
  
  private LinearLayout n0;
  
  private int o0;
  
  private int p0;
  
  private int q0;
  
  private TextView r0;
  
  private RelativeLayout s0;
  
  private Context t0;
  
  private ReportListActivity u0;
  
  private void l2() {
    d.c(this.o0, this.p0, this.q0, new b(this));
  }
  
  private void m2() {
    View view = LayoutInflater.from((Context)this.u0).inflate(2131493125, null);
    ((TextView)view.findViewById(2131298067)).setTypeface(g1.b());
    ((TextView)view.findViewById(2131298100)).setTypeface(g1.b());
    ((TextView)view.findViewById(2131298101)).setTypeface(g1.b());
    ((TextView)view.findViewById(2131298136)).setTypeface(g1.b());
    ((TextView)view.findViewById(2131298137)).setTypeface(g1.b());
    ((TextView)view.findViewById(2131298170)).setTypeface(g1.b());
    ((TextView)view.findViewById(2131298171)).setTypeface(g1.b());
    this.s0 = (RelativeLayout)view.findViewById(2131297542);
    this.l0 = (LinearLayout)view.findViewById(2131297199);
    this.j0 = (TextView)view.findViewById(2131298102);
    this.m0 = (LinearLayout)view.findViewById(2131297207);
    this.k0 = (TextView)view.findViewById(2131298138);
    this.n0 = (LinearLayout)view.findViewById(2131297216);
    this.r0 = (TextView)view.findViewById(2131298172);
    this.j0.setTypeface(g1.b());
    this.k0.setTypeface(g1.b());
    this.r0.setTypeface(g1.b());
    this.c0.addHeaderView(view, null, false);
  }
  
  private void n2(View paramView) {
    this.c0 = (ListView)paramView.findViewById(2131297235);
    this.g0 = (RelativeLayout)paramView.findViewById(2131297516);
    this.d0 = new ArrayList<CallLogBean>();
    m2();
    r r1 = new r((Context)this.u0, this.d0, this.c0);
    this.f0 = r1;
    this.c0.setAdapter((ListAdapter)r1);
    this.c0.setOnItemClickListener(new a(this));
    ((TextView)paramView.findViewById(2131297995)).setTypeface(g1.b());
  }
  
  public static a o2() {
    return new a();
  }
  
  public void I0() {
    super.I0();
  }
  
  public void N0() {
    super.N0();
  }
  
  public void R0(View paramView, Bundle paramBundle) {
    super.R0(paramView, paramBundle);
    n2(paramView);
    l2();
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.t0 = paramContext;
    this.u0 = (ReportListActivity)paramContext;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
    View view = View.inflate(this.t0, 2131493042, null);
    this.i0 = new c(null);
    b.p.a.a.b(this.t0).c(this.i0, new IntentFilter("com.allinone.callerid.REPROT_NUMBER"));
    return view;
  }
  
  public void x0() {
    super.x0();
    try {
      b.p.a.a.b(this.t0).e(this.i0);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements AdapterView.OnItemClickListener {
    a(a this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (a.Q1(this.b) != null && a.Q1(this.b).size() != 0) {
        CallLogBean callLogBean = a.Q1(this.b).get(param1Int);
        if (callLogBean.T()) {
          Intent intent = new Intent();
          Bundle bundle = new Bundle();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)a.Y1(this.b), ContactActivity.class);
          this.b.M1(intent);
          a.Y1(this.b).overridePendingTransition(2130771968, 2130771969);
        } else {
          Intent intent = new Intent();
          Bundle bundle = new Bundle();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)a.Y1(this.b), UnknownContactActivity.class);
          this.b.M1(intent);
          a.Y1(this.b).overridePendingTransition(2130771968, 2130771969);
        } 
      } 
    }
  }
  
  class b implements e {
    b(a this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList, int param1Int1, int param1Int2, int param1Int3) {
      a.a2(this.a, new ArrayList());
      if (param1ArrayList != null)
        a.Z1(this.a).addAll(param1ArrayList); 
      a.c2(this.a, param1Int1);
      a.e2(this.a, param1Int2);
      a.g2(this.a, param1Int3);
      if (a.Z1(this.a) != null && a.Z1(this.a).size() > 0) {
        a.Q1(this.a).clear();
        a.Q1(this.a).addAll(a.Z1(this.a));
        if (a.Q1(this.a) != null && a.h2(this.a) != null && a.Q1(this.a).size() > 0) {
          a.i2(this.a).setVisibility(8);
          a.h2(this.a).b(a.Q1(this.a));
          a.k2(this.a).setVisibility(0);
        } else {
          a.i2(this.a).setVisibility(0);
          a.k2(this.a).setVisibility(8);
        } 
        if (a.b2(this.a) > 0) {
          a.R1(this.a).setVisibility(0);
          TextView textView = a.S1(this.a);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(a.b2(this.a));
          stringBuilder.append("");
          textView.setText(stringBuilder.toString());
        } 
        if (a.d2(this.a) > 0) {
          a.T1(this.a).setVisibility(0);
          TextView textView = a.U1(this.a);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(a.d2(this.a));
          stringBuilder.append("");
          textView.setText(stringBuilder.toString());
        } 
        if (a.f2(this.a) > 0) {
          a.V1(this.a).setVisibility(0);
          TextView textView = a.W1(this.a);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(a.f2(this.a));
          stringBuilder.append("");
          textView.setText(stringBuilder.toString());
        } 
      } else {
        a.i2(this.a).setVisibility(0);
        a.k2(this.a).setVisibility(8);
      } 
    }
  }
  
  private class c extends BroadcastReceiver {
    private c(a this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      a.c2(this.a, 0);
      a.e2(this.a, 0);
      a.g2(this.a, 0);
      a.X1(this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/report/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */