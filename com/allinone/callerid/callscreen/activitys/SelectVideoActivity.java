package com.allinone.callerid.callscreen.activitys;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.customview.MyGridLayoutManager;
import com.allinone.callerid.d.a.d;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import java.io.Serializable;
import java.util.ArrayList;

public class SelectVideoActivity extends BaseActivity {
  private final String s = "SelectVideoActivity";
  
  private RecyclerView t;
  
  private d u;
  
  private ViewStub v;
  
  private boolean w;
  
  private void R() {
    (j0.a()).b.execute(new a(this));
  }
  
  private void S() {
    TextView textView = (TextView)findViewById(2131298187);
    this.v = (ViewStub)findViewById(2131298272);
    ImageView imageView = (ImageView)findViewById(2131296850);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new b(this));
    textView.setTypeface(g1.b());
    this.t = (RecyclerView)findViewById(2131297453);
    MyGridLayoutManager myGridLayoutManager = new MyGridLayoutManager(getApplicationContext(), 4);
    myGridLayoutManager.z2(1);
    myGridLayoutManager.f3(true);
    this.t.setLayoutManager((RecyclerView.o)myGridLayoutManager);
    d d1 = new d((Context)this);
    this.u = d1;
    this.t.setAdapter((RecyclerView.Adapter)d1);
    this.u.D(new c(this));
  }
  
  private void T() {
    try {
      TextView textView = (TextView)((RelativeLayout)this.v.inflate()).findViewById(2131297997);
      textView.setText(getResources().getString(2131755544));
      textView.setTypeface(g1.b());
    } catch (Exception exception) {
      this.v.setVisibility(0);
    } 
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 999 && paramInt2 == 888) {
      if (this.w) {
        startActivity(new Intent(getApplicationContext(), ManageDiyActivity.class));
        overridePendingTransition(2130771968, 2130771969);
      } 
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492957);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.w = getIntent().getBooleanExtra("is_from_main", false);
    S();
    R();
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
    private ArrayList<HomeInfo> b;
    
    a(SelectVideoActivity this$0) {}
    
    public void run() {
      Cursor cursor = this.c.getApplicationContext().getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, null, null, null, null);
      if (cursor != null) {
        this.b = new ArrayList<HomeInfo>();
        while (cursor.moveToNext()) {
          int i = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
          String str1 = cursor.getString(cursor.getColumnIndexOrThrow("title"));
          cursor.getString(cursor.getColumnIndexOrThrow("album"));
          cursor.getString(cursor.getColumnIndexOrThrow("artist"));
          cursor.getString(cursor.getColumnIndexOrThrow("_display_name"));
          cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
          String str2 = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
          cursor.getInt(cursor.getColumnIndexOrThrow("duration"));
          cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
          HomeInfo homeInfo = new HomeInfo();
          homeInfo.setPath(str2);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(i);
          stringBuilder.append("");
          homeInfo.setData_id(stringBuilder.toString());
          homeInfo.setName(str1);
          homeInfo.setIsdiy(true);
          this.b.add(homeInfo);
        } 
        cursor.close();
      } 
      this.c.runOnUiThread(new a(this));
    }
    
    class a implements Runnable {
      a(SelectVideoActivity.a this$0) {}
      
      public void run() {
        if (SelectVideoActivity.a.a(this.b) != null && SelectVideoActivity.a.a(this.b).size() > 0) {
          SelectVideoActivity.O(this.b.c).A(SelectVideoActivity.a.a(this.b), true);
          SelectVideoActivity.O(this.b.c).i();
          SelectVideoActivity.P(this.b.c).setVisibility(8);
        } else {
          SelectVideoActivity.Q(this.b.c);
          q.b().c("callscreen_no_video");
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(SelectVideoActivity this$0) {}
    
    public void run() {
      if (SelectVideoActivity.a.a(this.b) != null && SelectVideoActivity.a.a(this.b).size() > 0) {
        SelectVideoActivity.O(this.b.c).A(SelectVideoActivity.a.a(this.b), true);
        SelectVideoActivity.O(this.b.c).i();
        SelectVideoActivity.P(this.b.c).setVisibility(8);
      } else {
        SelectVideoActivity.Q(this.b.c);
        q.b().c("callscreen_no_video");
      } 
    }
  }
  
  class b implements View.OnClickListener {
    b(SelectVideoActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class c implements d.b {
    c(SelectVideoActivity this$0) {}
    
    public void a(HomeInfo param1HomeInfo) {
      try {
        Intent intent = new Intent();
        this(this.a.getApplicationContext(), CallScreenDiyPdtActivity.class);
        intent.putExtra("homeinfo", (Serializable)param1HomeInfo);
        this.a.startActivityForResult(intent, 999);
        this.a.overridePendingTransition(2130771968, 2130771969);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/SelectVideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */