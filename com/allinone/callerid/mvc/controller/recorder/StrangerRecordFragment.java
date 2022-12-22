package com.allinone.callerid.mvc.controller.recorder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.b.z.g;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class StrangerRecordFragment extends Fragment implements View.OnClickListener {
  private final String c0 = "StrangerRecordFragment";
  
  private RecorderActivity d0;
  
  private View e0;
  
  private RecyclerView f0;
  
  private LinearLayout g0;
  
  private TextView h0;
  
  private LinearLayout i0;
  
  private LinearLayout j0;
  
  private g k0;
  
  private UpdateViewReceiver l0;
  
  private boolean m0 = true;
  
  private Context n0;
  
  private PopupWindow o0;
  
  private void Y1() {
    try {
      View view = LayoutInflater.from((Context)this.d0).inflate(2131493149, null);
      TextView textView1 = (TextView)view.findViewById(2131297911);
      TextView textView2 = (TextView)view.findViewById(2131297913);
      TextView textView3 = (TextView)view.findViewById(2131297915);
      TextView textView4 = (TextView)view.findViewById(2131297914);
      TextView textView5 = (TextView)view.findViewById(2131297912);
      FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296745);
      FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296747);
      FrameLayout frameLayout3 = (FrameLayout)view.findViewById(2131296749);
      FrameLayout frameLayout4 = (FrameLayout)view.findViewById(2131296748);
      FrameLayout frameLayout5 = (FrameLayout)view.findViewById(2131296746);
      textView1.setTypeface(g1.b());
      textView2.setTypeface(g1.b());
      textView3.setTypeface(g1.b());
      textView4.setTypeface(g1.b());
      textView5.setTypeface(g1.b());
      frameLayout1.setOnClickListener(this);
      frameLayout2.setOnClickListener(this);
      frameLayout3.setOnClickListener(this);
      frameLayout4.setVisibility(8);
      frameLayout5.setVisibility(8);
      PopupWindow popupWindow = new PopupWindow();
      this(view);
      this.o0 = popupWindow;
      popupWindow.setHeight(-2);
      this.o0.setWidth(-2);
      this.o0.setFocusable(true);
      if (i1.f0(this.n0).booleanValue()) {
        this.o0.setAnimationStyle(2131821306);
      } else {
        this.o0.setAnimationStyle(2131821305);
      } 
      ColorDrawable colorDrawable = new ColorDrawable();
      this(0);
      this.o0.setBackgroundDrawable((Drawable)colorDrawable);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void a2(int paramInt) {
    (j0.a()).b.execute(new e(this, paramInt));
  }
  
  public void I0() {
    super.I0();
  }
  
  public void N0() {
    super.N0();
    RecorderActivity recorderActivity = this.d0;
    if (recorderActivity != null && recorderActivity.getIntent() != null && this.m0 && this.d0.getIntent().getBooleanExtra("record_open", false)) {
      this.m0 = false;
      AlertDialog alertDialog = com.allinone.callerid.util.recorder.f.p((Activity)this.d0, null);
      if (alertDialog != null)
        alertDialog.setOnDismissListener(new f(this)); 
    } 
    Z1();
  }
  
  void Z1() {
    (j0.a()).b.execute(new d(this));
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131296864:
        if (this.o0 != null) {
          int[] arrayOfInt = new int[2];
          paramView.getLocationOnScreen(arrayOfInt);
          PopupWindow popupWindow1 = this.o0;
          popupWindow1.showAtLocation(paramView, 0, arrayOfInt[0], arrayOfInt[1] - popupWindow1.getHeight());
        } 
      case 2131296749:
        a2(111);
        popupWindow = this.o0;
        if (popupWindow != null)
          popupWindow.dismiss(); 
      case 2131296747:
        a2(110);
        popupWindow = this.o0;
        if (popupWindow != null)
          popupWindow.dismiss(); 
      case 2131296745:
        break;
    } 
    Z1();
    PopupWindow popupWindow = this.o0;
    if (popupWindow != null)
      popupWindow.dismiss(); 
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.n0 = paramContext;
    this.d0 = (RecorderActivity)paramContext;
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    if (this.e0 == null) {
      this.e0 = paramLayoutInflater.inflate(2131493044, paramViewGroup, false);
      Typeface typeface = g1.b();
      this.i0 = (LinearLayout)this.e0.findViewById(2131297420);
      TextView textView1 = (TextView)this.e0.findViewById(2131297422);
      Button button = (Button)this.e0.findViewById(2131297421);
      this.j0 = (LinearLayout)this.e0.findViewById(2131297419);
      TextView textView2 = (TextView)this.e0.findViewById(2131297428);
      this.f0 = (RecyclerView)this.e0.findViewById(2131297425);
      this.g0 = (LinearLayout)this.e0.findViewById(2131296340);
      this.h0 = (TextView)this.e0.findViewById(2131297910);
      ImageView imageView = (ImageView)this.e0.findViewById(2131296864);
      textView1.setTypeface(typeface);
      textView2.setTypeface(typeface);
      this.h0.setTypeface(typeface);
      imageView.setOnClickListener(this);
      this.l0 = new UpdateViewReceiver(this);
      IntentFilter intentFilter = new IntentFilter();
      intentFilter.addAction("com.allinone.callerid.UPDATEVIEW");
      b.p.a.a.b(this.n0).c(this.l0, intentFilter);
      this.k0 = new g((Activity)this.d0, new ArrayList());
      LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)m());
      linearLayoutManager.z2(1);
      this.f0.setLayoutManager((RecyclerView.o)linearLayoutManager);
      this.f0.setItemAnimator((RecyclerView.l)new androidx.recyclerview.widget.c());
      this.f0.setAdapter((RecyclerView.Adapter)this.k0);
      this.f0.l(new a(this));
      Y1();
      this.k0.L(new b(this));
      button.setOnClickListener(new c(this));
    } 
    return this.e0;
  }
  
  public void z0() {
    super.z0();
    try {
      View view = this.e0;
      if (view != null)
        ((ViewGroup)view.getParent()).removeView(this.e0); 
      b.p.a.a.b(this.n0).e(this.l0);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public class UpdateViewReceiver extends BroadcastReceiver {
    public UpdateViewReceiver(StrangerRecordFragment this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if ("com.allinone.callerid.UPDATEVIEW".equals(param1Intent.getAction())) {
        this.a.Z1();
        StrangerRecordFragment.R1(this.a).i();
      } 
    }
  }
  
  class a extends RecyclerView.s {
    int a = 0;
    
    a(StrangerRecordFragment this$0) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int) {
      super.a(param1RecyclerView, param1Int);
    }
    
    public void b(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      super.b(param1RecyclerView, param1Int1, param1Int2);
      try {
        boolean bool = param1RecyclerView.canScrollVertically(-1);
        if (!bool) {
          if (d0.a)
            d0.a("tony", "顶部"); 
          StrangerRecordFragment.Q1(this.b).setVisibility(8);
        } else {
          if (d0.a)
            d0.a("tony", "不是顶部"); 
          if (StrangerRecordFragment.Q1(this.b).getVisibility() == 8) {
            StrangerRecordFragment.Q1(this.b).setVisibility(0);
            LinearLayoutManager linearLayoutManager1 = (LinearLayoutManager)param1RecyclerView.getLayoutManager();
            if (linearLayoutManager1 != null) {
              param1Int1 = linearLayoutManager1.Z1();
              this.a = param1Int1;
              ArrayList<RecordCall> arrayList = StrangerRecordFragment.R1(this.b).C();
              if (param1Int1 < arrayList.size() && param1Int1 >= 0)
                if (com.allinone.callerid.util.recorder.e.a(((RecordCall)arrayList.get(param1Int1)).getStarttime())) {
                  StrangerRecordFragment.S1(this.b).setText(this.b.U(2131755803));
                } else {
                  StrangerRecordFragment.S1(this.b).setText(((RecordCall)arrayList.get(param1Int1)).getRecordtime());
                }  
            } 
          } 
          LinearLayoutManager linearLayoutManager = (LinearLayoutManager)param1RecyclerView.getLayoutManager();
          if (linearLayoutManager != null) {
            param1Int1 = linearLayoutManager.Z1();
            if (this.a != param1Int1) {
              this.a = param1Int1;
              ArrayList<RecordCall> arrayList = StrangerRecordFragment.R1(this.b).C();
              if (param1Int1 < arrayList.size() && param1Int1 >= 0)
                if (com.allinone.callerid.util.recorder.e.a(((RecordCall)arrayList.get(param1Int1)).getStarttime())) {
                  StrangerRecordFragment.S1(this.b).setText(this.b.U(2131755803));
                } else {
                  StrangerRecordFragment.S1(this.b).setText(((RecordCall)arrayList.get(param1Int1)).getRecordtime());
                }  
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class b implements g.g {
    b(StrangerRecordFragment this$0) {}
    
    public void a(View param1View) {
      if (StrangerRecordFragment.T1(this.a) != null) {
        int[] arrayOfInt = new int[2];
        param1View.getLocationOnScreen(arrayOfInt);
        StrangerRecordFragment.T1(this.a).showAtLocation(param1View, 0, arrayOfInt[0], arrayOfInt[1] - StrangerRecordFragment.T1(this.a).getHeight());
      } 
    }
  }
  
  class c implements View.OnClickListener {
    c(StrangerRecordFragment this$0) {}
    
    public void onClick(View param1View) {
      if (com.allinone.callerid.util.recorder.b.f()) {
        com.allinone.callerid.util.recorder.b.n(true);
      } else {
        AlertDialog alertDialog = com.allinone.callerid.util.recorder.f.p((Activity)StrangerRecordFragment.U1(this.b), null);
        if (alertDialog != null)
          alertDialog.setOnDismissListener(new a(this)); 
      } 
      StrangerRecordFragment.U1(this.b).S();
      q.b().c("recorder_stranger_permission_open_click");
    }
    
    class a implements DialogInterface.OnDismissListener {
      a(StrangerRecordFragment.c this$0) {}
      
      public void onDismiss(DialogInterface param2DialogInterface) {
        StrangerRecordFragment.U1(this.b.b).T();
        StrangerRecordFragment.U1(this.b.b).S();
      }
    }
  }
  
  class a implements DialogInterface.OnDismissListener {
    a(StrangerRecordFragment this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      StrangerRecordFragment.U1(this.b.b).T();
      StrangerRecordFragment.U1(this.b.b).S();
    }
  }
  
  class d implements Runnable {
    d(StrangerRecordFragment this$0) {}
    
    public void run() {
      ArrayList arrayList = (ArrayList)com.allinone.callerid.f.k.b.d().h(100);
      if (arrayList != null && arrayList.size() > 0) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.ENGLISH);
        for (RecordCall recordCall : arrayList) {
          recordCall.setRecordtime(i.c(new Date(recordCall.getStarttime())));
          recordCall.setRecordtimems(SimpleDateFormat.getTimeInstance(3).format(new Date(recordCall.getStarttime())));
          recordCall.setTimespanstring(simpleDateFormat.format(new Date(recordCall.getTimespan())));
        } 
        StrangerRecordFragment.R1(this.b).A(arrayList, true);
        if (StrangerRecordFragment.U1(this.b) != null)
          StrangerRecordFragment.U1(this.b).runOnUiThread(new a(this)); 
      } else if (StrangerRecordFragment.U1(this.b) != null) {
        StrangerRecordFragment.U1(this.b).runOnUiThread(new b(this));
      } 
    }
    
    class a implements Runnable {
      a(StrangerRecordFragment.d this$0) {}
      
      public void run() {
        StrangerRecordFragment.R1(this.b.b).i();
        StrangerRecordFragment.V1(this.b.b).setVisibility(8);
        StrangerRecordFragment.W1(this.b.b).setVisibility(8);
        StrangerRecordFragment.X1(this.b.b).setVisibility(0);
      }
    }
    
    class b implements Runnable {
      b(StrangerRecordFragment.d this$0) {}
      
      public void run() {
        if (!com.allinone.callerid.util.recorder.b.e()) {
          StrangerRecordFragment.V1(this.b.b).setVisibility(0);
          StrangerRecordFragment.W1(this.b.b).setVisibility(8);
          StrangerRecordFragment.X1(this.b.b).setVisibility(8);
        } else {
          StrangerRecordFragment.V1(this.b.b).setVisibility(8);
          StrangerRecordFragment.W1(this.b.b).setVisibility(0);
          StrangerRecordFragment.X1(this.b.b).setVisibility(8);
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(StrangerRecordFragment this$0) {}
    
    public void run() {
      StrangerRecordFragment.R1(this.b.b).i();
      StrangerRecordFragment.V1(this.b.b).setVisibility(8);
      StrangerRecordFragment.W1(this.b.b).setVisibility(8);
      StrangerRecordFragment.X1(this.b.b).setVisibility(0);
    }
  }
  
  class b implements Runnable {
    b(StrangerRecordFragment this$0) {}
    
    public void run() {
      if (!com.allinone.callerid.util.recorder.b.e()) {
        StrangerRecordFragment.V1(this.b.b).setVisibility(0);
        StrangerRecordFragment.W1(this.b.b).setVisibility(8);
        StrangerRecordFragment.X1(this.b.b).setVisibility(8);
      } else {
        StrangerRecordFragment.V1(this.b.b).setVisibility(8);
        StrangerRecordFragment.W1(this.b.b).setVisibility(0);
        StrangerRecordFragment.X1(this.b.b).setVisibility(8);
      } 
    }
  }
  
  class e implements Runnable {
    e(StrangerRecordFragment this$0, int param1Int) {}
    
    public void run() {
      ArrayList arrayList = (ArrayList)com.allinone.callerid.f.k.b.d().j(this.b);
      if (arrayList != null && arrayList.size() > 0) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.ENGLISH);
        for (RecordCall recordCall : arrayList) {
          Date date = new Date(recordCall.getStarttime());
          recordCall.setRecordtime(i.c(date));
          recordCall.setRecordtimems(SimpleDateFormat.getTimeInstance(3).format(date));
          recordCall.setTimespanstring(simpleDateFormat.format(new Date(recordCall.getTimespan())));
        } 
        StrangerRecordFragment.R1(this.c).A(arrayList, true);
        StrangerRecordFragment.U1(this.c).runOnUiThread(new a(this));
      } else {
        StrangerRecordFragment.U1(this.c).runOnUiThread(new b(this));
      } 
    }
    
    class a implements Runnable {
      a(StrangerRecordFragment.e this$0) {}
      
      public void run() {
        StrangerRecordFragment.R1(this.b.c).i();
        StrangerRecordFragment.V1(this.b.c).setVisibility(8);
        StrangerRecordFragment.W1(this.b.c).setVisibility(8);
        StrangerRecordFragment.X1(this.b.c).setVisibility(0);
        StrangerRecordFragment.Q1(this.b.c).setVisibility(8);
      }
    }
    
    class b implements Runnable {
      b(StrangerRecordFragment.e this$0) {}
      
      public void run() {
        StrangerRecordFragment.V1(this.b.c).setVisibility(8);
        StrangerRecordFragment.W1(this.b.c).setVisibility(0);
        StrangerRecordFragment.X1(this.b.c).setVisibility(8);
        StrangerRecordFragment.Q1(this.b.c).setVisibility(0);
      }
    }
  }
  
  class a implements Runnable {
    a(StrangerRecordFragment this$0) {}
    
    public void run() {
      StrangerRecordFragment.R1(this.b.c).i();
      StrangerRecordFragment.V1(this.b.c).setVisibility(8);
      StrangerRecordFragment.W1(this.b.c).setVisibility(8);
      StrangerRecordFragment.X1(this.b.c).setVisibility(0);
      StrangerRecordFragment.Q1(this.b.c).setVisibility(8);
    }
  }
  
  class b implements Runnable {
    b(StrangerRecordFragment this$0) {}
    
    public void run() {
      StrangerRecordFragment.V1(this.b.c).setVisibility(8);
      StrangerRecordFragment.W1(this.b.c).setVisibility(0);
      StrangerRecordFragment.X1(this.b.c).setVisibility(8);
      StrangerRecordFragment.Q1(this.b.c).setVisibility(0);
    }
  }
  
  class f implements DialogInterface.OnDismissListener {
    f(StrangerRecordFragment this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      StrangerRecordFragment.U1(this.b).T();
      StrangerRecordFragment.U1(this.b).S();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/recorder/StrangerRecordFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */