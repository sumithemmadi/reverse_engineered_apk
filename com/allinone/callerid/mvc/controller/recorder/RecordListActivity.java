package com.allinone.callerid.mvc.controller.recorder;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.b.z.f;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.f.k.b;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.j0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class RecordListActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "RecordListActivity";
  
  private String t = "";
  
  private String u;
  
  private f v;
  
  private UpdateViewReceiver w;
  
  private void R() {
    ImageView imageView = (ImageView)findViewById(2131297443);
    TextView textView = (TextView)findViewById(2131297445);
    RecyclerView recyclerView = (RecyclerView)findViewById(2131297444);
    textView.setTypeface(g1.b());
    String str = this.u;
    if (str != null && !"".equals(str)) {
      textView.setText(this.u);
    } else {
      textView.setText(this.t);
    } 
    imageView.setOnClickListener(this);
    this.v = new f((Activity)this, new ArrayList());
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)this);
    linearLayoutManager.z2(1);
    recyclerView.setLayoutManager((RecyclerView.o)linearLayoutManager);
    recyclerView.setAdapter((RecyclerView.Adapter)this.v);
    S();
    this.w = new UpdateViewReceiver(this);
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("com.allinone.callerid.UPDATERECORDLIST");
    b.p.a.a.b(getApplicationContext()).c(this.w, intentFilter);
  }
  
  private void S() {
    (j0.a()).b.execute(new a(this));
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131297443) {
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492950);
    this.t = getIntent().getStringExtra("recordnumber");
    this.u = getIntent().getStringExtra("recordname");
    R();
  }
  
  protected void onDestroy() {
    super.onDestroy();
    if (this.w != null)
      b.p.a.a.b(getApplicationContext()).e(this.w); 
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  public class UpdateViewReceiver extends BroadcastReceiver {
    public UpdateViewReceiver(RecordListActivity this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if ("com.allinone.callerid.UPDATERECORDLIST".equals(param1Intent.getAction()))
        RecordListActivity.Q(this.a); 
    }
  }
  
  class a implements Runnable {
    a(RecordListActivity this$0) {}
    
    public void run() {
      ArrayList arrayList = (ArrayList)b.d().f(RecordListActivity.O(this.b));
      if (arrayList != null && arrayList.size() > 0) {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MMM dd", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("mm:ss", Locale.getDefault());
        for (RecordCall recordCall : arrayList) {
          recordCall.setRecordtime(simpleDateFormat1.format(new Date(recordCall.getStarttime())));
          recordCall.setRecordtimems(i.m(new Date(recordCall.getStarttime())));
          recordCall.setTimespanstring(simpleDateFormat2.format(new Date(recordCall.getTimespan())));
        } 
        this.b.runOnUiThread(new a(this, arrayList));
      } 
    }
    
    class a implements Runnable {
      a(RecordListActivity.a this$0, ArrayList param2ArrayList) {}
      
      public void run() {
        if (this.b.size() > 0) {
          RecordListActivity.P(this.c.b).A(this.b, true);
          RecordListActivity.P(this.c.b).i();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(RecordListActivity this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      if (this.b.size() > 0) {
        RecordListActivity.P(this.c.b).A(this.b, true);
        RecordListActivity.P(this.c.b).i();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/recorder/RecordListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */