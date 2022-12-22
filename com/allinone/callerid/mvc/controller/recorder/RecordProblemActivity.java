package com.allinone.callerid.mvc.controller.recorder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.b.z.e;
import com.allinone.callerid.f.k.c;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;

public class RecordProblemActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "RecordProblemActivity";
  
  private e t;
  
  private void P() {
    ImageView imageView = (ImageView)findViewById(2131297437);
    TextView textView1 = (TextView)findViewById(2131297442);
    TextView textView2 = (TextView)findViewById(2131297441);
    TextView textView3 = (TextView)findViewById(2131297439);
    TextView textView4 = (TextView)findViewById(2131297440);
    RecyclerView recyclerView = (RecyclerView)findViewById(2131297438);
    textView1.setTypeface(g1.b());
    textView2.setTypeface(g1.b());
    textView3.setTypeface(g1.b());
    textView4.setTypeface(g1.b());
    imageView.setOnClickListener(this);
    this.t = new e((Context)this, new ArrayList());
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)this);
    linearLayoutManager.z2(1);
    recyclerView.setLayoutManager((RecyclerView.o)linearLayoutManager);
    recyclerView.setAdapter((RecyclerView.Adapter)this.t);
    Q();
  }
  
  private void Q() {
    (new Thread(new a(this))).start();
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131297437) {
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492947);
    P();
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements Runnable {
    a(RecordProblemActivity this$0) {}
    
    public void run() {
      ArrayList arrayList = (ArrayList)c.b().c();
      this.b.runOnUiThread(new a(this, arrayList));
    }
    
    class a implements Runnable {
      a(RecordProblemActivity.a this$0, ArrayList param2ArrayList) {}
      
      public void run() {
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.size() > 0) {
          RecordProblemActivity.O(this.c.b).A(this.b, true);
          RecordProblemActivity.O(this.c.b).i();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(RecordProblemActivity this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      ArrayList arrayList = this.b;
      if (arrayList != null && arrayList.size() > 0) {
        RecordProblemActivity.O(this.c.b).A(this.b, true);
        RecordProblemActivity.O(this.c.b).i();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/recorder/RecordProblemActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */