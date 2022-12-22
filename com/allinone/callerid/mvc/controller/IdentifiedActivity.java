package com.allinone.callerid.mvc.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.allinone.callerid.b.j;
import com.allinone.callerid.i.a.v.d;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IdentifiedActivity extends BaseActivity {
  private final String s = "IdentifiedActivity";
  
  private ListView t;
  
  private List<CallLogBean> u = new ArrayList<CallLogBean>();
  
  private HashMap<String, Integer> v = new HashMap<String, Integer>();
  
  private j w;
  
  private List<String> x = new ArrayList<String>();
  
  private void S() {
    d.a(getApplicationContext(), this.u, this.x, this.v, new c(this));
  }
  
  private void T() {
    this.t = (ListView)findViewById(2131297336);
    ArrayList<CallLogBean> arrayList = new ArrayList();
    this.u = arrayList;
    U(arrayList, this.v);
    this.t.setOnItemClickListener(new b(this));
    S();
  }
  
  private void U(List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap) {
    j j1 = new j((Context)this, paramList, paramHashMap, this.t, null, null, null);
    this.w = j1;
    this.t.setAdapter((ListAdapter)j1);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492927);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    getWindow().getDecorView().post(new a(this));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      finish();
      overridePendingTransition(2130771968, 2130771969);
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements Runnable {
    a(IdentifiedActivity this$0) {}
    
    public void run() {
      TextView textView = (TextView)this.b.findViewById(2131298187);
      ImageView imageView = (ImageView)this.b.findViewById(2131296850);
      if (i1.f0(this.b.getApplicationContext()).booleanValue())
        imageView.setImageResource(2131231059); 
      imageView.setOnClickListener(new a(this));
      textView.setTypeface(g1.b());
      IdentifiedActivity.O(this.b);
    }
    
    class a implements View.OnClickListener {
      a(IdentifiedActivity.a this$0) {}
      
      public void onClick(View param2View) {
        this.b.b.finish();
        this.b.b.overridePendingTransition(2130771968, 2130771969);
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(IdentifiedActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.b.finish();
      this.b.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class b implements AdapterView.OnItemClickListener {
    b(IdentifiedActivity this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (IdentifiedActivity.P(this.b) != null && IdentifiedActivity.P(this.b).size() != 0) {
        CallLogBean callLogBean = IdentifiedActivity.P(this.b).get(param1Int);
        Intent intent = new Intent((Context)this.b, UnknownContactActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
        intent.putExtras(bundle);
        this.b.startActivity(intent);
        this.b.overridePendingTransition(2130771968, 2130771969);
      } 
    }
  }
  
  class c implements com.allinone.callerid.i.a.v.c {
    c(IdentifiedActivity this$0) {}
    
    public void a(List<CallLogBean> param1List, HashMap<String, Integer> param1HashMap) {
      IdentifiedActivity.Q(this.a, param1List, param1HashMap);
      IdentifiedActivity.R(this.a).notifyDataSetChanged();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/IdentifiedActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */