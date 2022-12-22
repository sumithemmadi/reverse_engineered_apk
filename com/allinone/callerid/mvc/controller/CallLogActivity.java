package com.allinone.callerid.mvc.controller;

import android.app.AlertDialog;
import android.app.role.RoleManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.allinone.callerid.i.a.f.h;
import com.allinone.callerid.i.a.f.i;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallLogActivity extends BaseActivity implements View.OnClickListener {
  private final String s = "CallLogActivity";
  
  private ImageView t;
  
  private ListView u;
  
  private List<CallLogBean> v = new ArrayList<CallLogBean>();
  
  private String w;
  
  private FrameLayout x;
  
  private com.allinone.callerid.b.d y;
  
  private int z;
  
  private void U() {
    try {
      AlertDialog.Builder builder1 = new AlertDialog.Builder();
      this((Context)this);
      AlertDialog.Builder builder2 = builder1.setMessage(getResources().getString(2131755289));
      String str2 = getResources().getString(2131755287);
      c c = new c();
      this(this);
      AlertDialog.Builder builder3 = builder2.setPositiveButton(str2, c);
      String str1 = getResources().getString(2131755180);
      b b = new b();
      this(this);
      AlertDialog alertDialog = builder3.setNegativeButton(str1, b).create();
      alertDialog.show();
      alertDialog.getButton(-1).setTextColor(this.z);
      alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void V() {
    this.z = d1.a((Context)this, 2130968859, 2131099706);
    ImageView imageView = (ImageView)findViewById(2131297114);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    this.t = (ImageView)findViewById(2131297115);
    TextView textView1 = (TextView)findViewById(2131297835);
    TextView textView2 = (TextView)findViewById(2131297997);
    this.x = (FrameLayout)findViewById(2131297517);
    imageView.setOnClickListener(this);
    this.t.setOnClickListener(this);
    textView1.setTypeface(g1.b());
    textView2.setTypeface(g1.b());
    this.u = (ListView)findViewById(2131297236);
    W(this.v);
    this.u.setOnItemLongClickListener(new a(this));
    u();
  }
  
  private void W(List<CallLogBean> paramList) {
    com.allinone.callerid.b.d d1 = new com.allinone.callerid.b.d((Context)this, paramList, this.u);
    this.y = d1;
    this.u.setAdapter((ListAdapter)d1);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 999 && com.allinone.callerid.util.k1.a.g(getApplicationContext()))
      q.b().c("delete_request_default_dialer_enabled"); 
  }
  
  public void onClick(View paramView) {
    int i;
    switch (paramView.getId()) {
      default:
        return;
      case 2131297115:
        i = Build.VERSION.SDK_INT;
        if (i >= 23) {
          if (com.allinone.callerid.util.k1.a.g((Context)EZCallApplication.c())) {
            U();
          } else if (i >= 29) {
            try {
              RoleManager roleManager = (RoleManager)getSystemService(RoleManager.class);
              if (roleManager != null && roleManager.isRoleAvailable("android.app.role.DIALER")) {
                boolean bool = roleManager.isRoleHeld("android.app.role.DIALER");
                if (bool) {
                  if (d0.a)
                    d0.a("default_dialer", "This app is the default dialer app"); 
                  U();
                } else {
                  if (d0.a)
                    d0.a("default_dialer", "This app isn't the default dialer app"); 
                  startActivityForResult(roleManager.createRequestRoleIntent("android.app.role.DIALER"), 999);
                } 
              } 
              q.b().c("delete_request_default_dialer");
            } catch (Exception exception) {
              U();
              exception.printStackTrace();
            } 
          } else {
            Intent intent = new Intent();
            this("android.telecom.action.CHANGE_DEFAULT_DIALER");
            intent.putExtra("android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME", i1.M((Context)EZCallApplication.c()));
            startActivityForResult(intent, 999);
            q.b().c("delete_request_default_dialer");
          } 
        } else {
          U();
        } 
      case 2131297114:
        break;
    } 
    finish();
    overridePendingTransition(2130771968, 2130771969);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492906);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    String str2 = getIntent().getStringExtra("call_log_number");
    String str3 = "";
    String str1 = str3;
    if (str2 != null) {
      str1 = str3;
      if (!"".equals(getIntent().getStringExtra("call_log_number")))
        str1 = getIntent().getStringExtra("call_log_number"); 
    } 
    this.w = str1;
    V();
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
  
  public void u() {
    if (androidx.core.content.a.a(getApplicationContext(), "android.permission.READ_CALL_LOG") == 0) {
      String str = this.w;
      if (str != null && !"".equals(str))
        (j0.a()).b.execute(new d(this)); 
    } 
  }
  
  class a implements AdapterView.OnItemLongClickListener {
    a(CallLogActivity this$0) {}
    
    private void a(int param1Int) {
      try {
        String str1;
        if (i1.v0(((CallLogBean)CallLogActivity.O(this.a).get(param1Int)).p())) {
          str1 = this.a.getResources().getString(2131755829);
        } else {
          str1 = ((CallLogBean)CallLogActivity.O(this.a).get(param1Int)).p();
        } 
        AlertDialog.Builder builder = new AlertDialog.Builder();
        this((Context)this.a);
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(str1);
        stringBuilder.append("\n");
        stringBuilder.append(((CallLogBean)CallLogActivity.O(this.a).get(param1Int)).g());
        builder = builder.setMessage(stringBuilder.toString());
        String str2 = this.a.getResources().getString(2131755287);
        b b = new b();
        this(this, param1Int);
        builder = builder.setPositiveButton(str2, b);
        str2 = this.a.getResources().getString(2131755180);
        a a1 = new a();
        this(this);
        AlertDialog alertDialog = builder.setNegativeButton(str2, a1).create();
        alertDialog.show();
        alertDialog.getButton(-1).setTextColor(CallLogActivity.P(this.a));
        alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public boolean onItemLongClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 23) {
        if (com.allinone.callerid.util.k1.a.g((Context)EZCallApplication.c())) {
          a(param1Int);
        } else if (i >= 29) {
          try {
            RoleManager roleManager = (RoleManager)this.a.getSystemService(RoleManager.class);
            if (roleManager != null && roleManager.isRoleAvailable("android.app.role.DIALER")) {
              boolean bool = roleManager.isRoleHeld("android.app.role.DIALER");
              if (bool) {
                if (d0.a)
                  d0.a("default_dialer", "This app is the default dialer app"); 
                a(param1Int);
              } else {
                if (d0.a)
                  d0.a("default_dialer", "This app isn't the default dialer app"); 
                Intent intent = roleManager.createRequestRoleIntent("android.app.role.DIALER");
                this.a.startActivityForResult(intent, 999);
              } 
            } 
            q.b().c("delete_request_default_dialer");
          } catch (Exception exception) {
            a(param1Int);
            exception.printStackTrace();
          } 
        } else {
          Intent intent = new Intent();
          this("android.telecom.action.CHANGE_DEFAULT_DIALER");
          intent.putExtra("android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME", i1.M((Context)EZCallApplication.c()));
          this.a.startActivityForResult(intent, 999);
          q.b().c("delete_request_default_dialer");
        } 
      } else {
        a(param1Int);
      } 
      return true;
    }
    
    class a implements DialogInterface.OnClickListener {
      a(CallLogActivity.a this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(CallLogActivity.a this$0, int param2Int) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          Context context = this.c.a.getApplicationContext();
          param2Int = ((CallLogBean)CallLogActivity.O(this.c.a).get(this.b)).j();
          a a1 = new a();
          this(this);
          i.b(context, String.valueOf(param2Int), a1);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
      
      class a implements h {
        a(CallLogActivity.a.b this$0) {}
        
        public void a() {
          this.a.c.a.u();
          Intent intent = new Intent();
          intent.setAction("com.allinone.callerid.RELOAD_DATA");
          b.p.a.a.b(this.a.c.a.getApplicationContext()).d(intent);
        }
      }
    }
    
    class a implements h {
      a(CallLogActivity.a this$0) {}
      
      public void a() {
        this.a.c.a.u();
        Intent intent = new Intent();
        intent.setAction("com.allinone.callerid.RELOAD_DATA");
        b.p.a.a.b(this.a.c.a.getApplicationContext()).d(intent);
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(CallLogActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(CallLogActivity this$0, int param1Int) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        Context context = this.c.a.getApplicationContext();
        param1Int = ((CallLogBean)CallLogActivity.O(this.c.a).get(this.b)).j();
        a a1 = new a();
        this(this);
        i.b(context, String.valueOf(param1Int), a1);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements h {
      a(CallLogActivity.a.b this$0) {}
      
      public void a() {
        this.a.c.a.u();
        Intent intent = new Intent();
        intent.setAction("com.allinone.callerid.RELOAD_DATA");
        b.p.a.a.b(this.a.c.a.getApplicationContext()).d(intent);
      }
    }
  }
  
  class a implements h {
    a(CallLogActivity this$0) {}
    
    public void a() {
      this.a.c.a.u();
      Intent intent = new Intent();
      intent.setAction("com.allinone.callerid.RELOAD_DATA");
      b.p.a.a.b(this.a.c.a.getApplicationContext()).d(intent);
    }
  }
  
  class b implements DialogInterface.OnClickListener {
    b(CallLogActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class c implements DialogInterface.OnClickListener {
    c(CallLogActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        Context context = this.b.getApplicationContext();
        String str = CallLogActivity.Q(this.b);
        a a = new a();
        this(this);
        i.c(context, str, a);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements h {
      a(CallLogActivity.c this$0) {}
      
      public void a() {
        this.a.b.u();
        Intent intent = new Intent();
        intent.setAction("com.allinone.callerid.RELOAD_DATA");
        b.p.a.a.b(this.a.b.getApplicationContext()).d(intent);
      }
    }
  }
  
  class a implements h {
    a(CallLogActivity this$0) {}
    
    public void a() {
      this.a.b.u();
      Intent intent = new Intent();
      intent.setAction("com.allinone.callerid.RELOAD_DATA");
      b.p.a.a.b(this.a.b.getApplicationContext()).d(intent);
    }
  }
  
  class d implements Runnable {
    private ArrayList<CallLogBean> b;
    
    d(CallLogActivity this$0) {}
    
    public void run() {
      ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
      Uri uri = CallLog.Calls.CONTENT_URI;
      String str = CallLogActivity.Q(this.c);
      byte b = 0;
      Cursor cursor = contentResolver.query(uri, null, "number=?", new String[] { str }, "date DESC");
      if (cursor != null && cursor.getCount() > 0) {
        this.b = new ArrayList<CallLogBean>();
        cursor.moveToFirst();
        while (b < cursor.getCount()) {
          cursor.moveToPosition(b);
          Date date = new Date(cursor.getLong(cursor.getColumnIndex("date")));
          String str1 = cursor.getString(cursor.getColumnIndex("number"));
          int i = cursor.getInt(cursor.getColumnIndex("type"));
          String str2 = cursor.getString(cursor.getColumnIndex("name"));
          String str3 = cursor.getString(cursor.getColumnIndex("duration"));
          int j = cursor.getInt(cursor.getColumnIndex("_id"));
          int k = cursor.getInt(cursor.getColumnIndex("numbertype"));
          str = cursor.getString(cursor.getColumnIndex("numberlabel"));
          if (k == 0 && str == null) {
            str = "";
          } else {
            str = (String)ContactsContract.CommonDataKinds.Phone.getTypeLabel(EZCallApplication.c().getResources(), k, str);
          } 
          CallLogBean callLogBean = new CallLogBean();
          callLogBean.x0(j);
          callLogBean.D0(str1);
          callLogBean.B0(str2);
          callLogBean.E0(str);
          callLogBean.c1(i);
          callLogBean.r0(DateFormat.getDateTimeInstance(2, 3).format(date));
          callLogBean.d0(date);
          callLogBean.s0(str3);
          this.b.add(callLogBean);
          b++;
        } 
        this.c.runOnUiThread(new a(this));
      } else {
        this.c.runOnUiThread(new b(this));
      } 
      if (cursor != null)
        cursor.close(); 
    }
    
    class a implements Runnable {
      a(CallLogActivity.d this$0) {}
      
      public void run() {
        if (CallLogActivity.d.a(this.b) != null && CallLogActivity.d.a(this.b).size() > 0) {
          CallLogActivity.O(this.b.c).clear();
          CallLogActivity.O(this.b.c).addAll(CallLogActivity.d.a(this.b));
          CallLogActivity.R(this.b.c).notifyDataSetChanged();
          CallLogActivity.S(this.b.c).setVisibility(0);
          CallLogActivity.T(this.b.c).setVisibility(8);
        } else {
          CallLogActivity.T(this.b.c).setVisibility(0);
        } 
      }
    }
    
    class b implements Runnable {
      b(CallLogActivity.d this$0) {}
      
      public void run() {
        CallLogActivity.T(this.b.c).setVisibility(0);
      }
    }
  }
  
  class a implements Runnable {
    a(CallLogActivity this$0) {}
    
    public void run() {
      if (CallLogActivity.d.a(this.b) != null && CallLogActivity.d.a(this.b).size() > 0) {
        CallLogActivity.O(this.b.c).clear();
        CallLogActivity.O(this.b.c).addAll(CallLogActivity.d.a(this.b));
        CallLogActivity.R(this.b.c).notifyDataSetChanged();
        CallLogActivity.S(this.b.c).setVisibility(0);
        CallLogActivity.T(this.b.c).setVisibility(8);
      } else {
        CallLogActivity.T(this.b.c).setVisibility(0);
      } 
    }
  }
  
  class b implements Runnable {
    b(CallLogActivity this$0) {}
    
    public void run() {
      CallLogActivity.T(this.b.c).setVisibility(0);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/CallLogActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */