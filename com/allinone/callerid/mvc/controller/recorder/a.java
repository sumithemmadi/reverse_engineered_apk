package com.allinone.callerid.mvc.controller.recorder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.b.z.c;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.recorder.f;
import java.util.ArrayList;
import org.xutils.db.table.DbModel;

public class a extends Fragment {
  private final String c0 = "ContactRecordFragment";
  
  private RecorderActivity d0;
  
  private View e0;
  
  private RecyclerView f0;
  
  private c g0;
  
  private LinearLayout h0;
  
  private LinearLayout i0;
  
  public void I0() {
    super.I0();
  }
  
  public void N0() {
    super.N0();
    V1();
  }
  
  void V1() {
    (j0.a()).b.execute(new b(this));
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.d0 = (RecorderActivity)paramContext;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    if (this.e0 == null) {
      this.e0 = paramLayoutInflater.inflate(2131493044, paramViewGroup, false);
      Typeface typeface = g1.b();
      this.h0 = (LinearLayout)this.e0.findViewById(2131297420);
      TextView textView2 = (TextView)this.e0.findViewById(2131297422);
      Button button = (Button)this.e0.findViewById(2131297421);
      this.i0 = (LinearLayout)this.e0.findViewById(2131297419);
      TextView textView1 = (TextView)this.e0.findViewById(2131297428);
      this.f0 = (RecyclerView)this.e0.findViewById(2131297425);
      ((LinearLayout)this.e0.findViewById(2131296340)).setVisibility(8);
      textView2.setTypeface(typeface);
      textView1.setTypeface(typeface);
      this.g0 = new c((Context)this.d0, new ArrayList());
      LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)m());
      linearLayoutManager.z2(1);
      this.f0.setLayoutManager((RecyclerView.o)linearLayoutManager);
      this.f0.setAdapter((RecyclerView.Adapter)this.g0);
      button.setOnClickListener(new a(this));
    } 
    return this.e0;
  }
  
  public void z0() {
    super.z0();
    try {
      View view = this.e0;
      if (view != null)
        ((ViewGroup)view.getParent()).removeView(this.e0); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements View.OnClickListener {
    a(a this$0) {}
    
    public void onClick(View param1View) {
      if (com.allinone.callerid.util.recorder.b.f()) {
        com.allinone.callerid.util.recorder.b.n(true);
      } else {
        AlertDialog alertDialog = f.p((Activity)a.Q1(this.b), null);
        if (alertDialog != null)
          alertDialog.setOnDismissListener(new a(this)); 
      } 
      a.Q1(this.b).S();
      q.b().c("recorder_contacts_permission_open_click");
    }
    
    class a implements DialogInterface.OnDismissListener {
      a(a.a this$0) {}
      
      public void onDismiss(DialogInterface param2DialogInterface) {
        a.Q1(this.b.b).T();
        a.Q1(this.b.b).S();
      }
    }
  }
  
  class a implements DialogInterface.OnDismissListener {
    a(a this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      a.Q1(this.b.b).T();
      a.Q1(this.b.b).S();
    }
  }
  
  class b implements Runnable {
    b(a this$0) {}
    
    public void run() {
      ArrayList arrayList = (ArrayList)com.allinone.callerid.f.k.b.d().i();
      if (arrayList != null && arrayList.size() > 0) {
        ArrayList<RecordCall> arrayList1 = new ArrayList();
        for (DbModel dbModel : arrayList) {
          RecordCall recordCall = new RecordCall();
          String str1 = dbModel.getString("number");
          String str2 = com.allinone.callerid.f.k.b.d().g(str1);
          recordCall.setRecordcount(com.allinone.callerid.f.k.b.d().e(str1));
          recordCall.setName(str2);
          recordCall.setNumber(str1);
          arrayList1.add(recordCall);
        } 
        if (a.Q1(this.b) != null)
          a.Q1(this.b).runOnUiThread(new a(this, arrayList1)); 
      } else if (a.Q1(this.b) != null) {
        a.Q1(this.b).runOnUiThread(new b(this));
      } 
    }
    
    class a implements Runnable {
      a(a.b this$0, ArrayList param2ArrayList) {}
      
      public void run() {
        if (this.b.size() > 0) {
          a.R1(this.c.b).A(this.b, true);
          a.R1(this.c.b).i();
          a.S1(this.c.b).setVisibility(8);
          a.T1(this.c.b).setVisibility(8);
          a.U1(this.c.b).setVisibility(0);
        } else if (!com.allinone.callerid.util.recorder.b.e()) {
          a.S1(this.c.b).setVisibility(0);
          a.T1(this.c.b).setVisibility(8);
          a.U1(this.c.b).setVisibility(8);
        } else {
          a.S1(this.c.b).setVisibility(8);
          a.T1(this.c.b).setVisibility(0);
          a.U1(this.c.b).setVisibility(8);
        } 
      }
    }
    
    class b implements Runnable {
      b(a.b this$0) {}
      
      public void run() {
        if (!com.allinone.callerid.util.recorder.b.e()) {
          a.S1(this.b.b).setVisibility(0);
          a.T1(this.b.b).setVisibility(8);
          a.U1(this.b.b).setVisibility(8);
        } else {
          a.S1(this.b.b).setVisibility(8);
          a.T1(this.b.b).setVisibility(0);
          a.U1(this.b.b).setVisibility(8);
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(a this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      if (this.b.size() > 0) {
        a.R1(this.c.b).A(this.b, true);
        a.R1(this.c.b).i();
        a.S1(this.c.b).setVisibility(8);
        a.T1(this.c.b).setVisibility(8);
        a.U1(this.c.b).setVisibility(0);
      } else if (!com.allinone.callerid.util.recorder.b.e()) {
        a.S1(this.c.b).setVisibility(0);
        a.T1(this.c.b).setVisibility(8);
        a.U1(this.c.b).setVisibility(8);
      } else {
        a.S1(this.c.b).setVisibility(8);
        a.T1(this.c.b).setVisibility(0);
        a.U1(this.c.b).setVisibility(8);
      } 
    }
  }
  
  class b implements Runnable {
    b(a this$0) {}
    
    public void run() {
      if (!com.allinone.callerid.util.recorder.b.e()) {
        a.S1(this.b.b).setVisibility(0);
        a.T1(this.b.b).setVisibility(8);
        a.U1(this.b.b).setVisibility(8);
      } else {
        a.S1(this.b.b).setVisibility(8);
        a.T1(this.b.b).setVisibility(0);
        a.U1(this.b.b).setVisibility(8);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/recorder/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */