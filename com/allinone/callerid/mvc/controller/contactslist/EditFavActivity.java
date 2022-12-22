package com.allinone.callerid.mvc.controller.contactslist;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.allinone.callerid.b.h;
import com.allinone.callerid.i.a.q.e;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import java.util.ArrayList;
import java.util.List;

public class EditFavActivity extends BaseActivity {
  private final String s = "EditFavActivity";
  
  public List<CallLogBean> t = new ArrayList<CallLogBean>();
  
  private h u;
  
  private void P() {
    if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CONTACTS") == 0)
      com.allinone.callerid.i.a.q.b.d(this.t, new b(this)); 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492924);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    ((TextView)findViewById(2131296648)).setTypeface(g1.b());
    ((TextView)findViewById(2131297898)).setTypeface(g1.b());
    ImageView imageView = (ImageView)findViewById(2131296850);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new a(this));
    ListView listView = (ListView)findViewById(2131297145);
    h h1 = new h((Activity)this);
    this.u = h1;
    listView.setAdapter((ListAdapter)h1);
    P();
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
  
  class a implements View.OnClickListener {
    a(EditFavActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class b implements e {
    b(EditFavActivity this$0) {}
    
    public void a(List<CallLogBean> param1List) {
      EditFavActivity editFavActivity = this.a;
      editFavActivity.t = param1List;
      EditFavActivity.O(editFavActivity).a(this.a.t, true);
      EditFavActivity.O(this.a).notifyDataSetChanged();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/contactslist/EditFavActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */