package com.allinone.callerid.mvc.controller.block;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.bean.EZSimpleContact;
import com.allinone.callerid.customview.DeletableEditText;
import com.allinone.callerid.dialog.m;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.contactpdt.ContactActivity;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.mvc.controller.nodisturb.NoDisturbActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.h1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import java.util.ArrayList;
import java.util.List;

public class BlockManagerActivity extends BaseActivity implements View.OnClickListener {
  private List<String> A = new ArrayList<String>();
  
  public List B = new ArrayList();
  
  public List C = new ArrayList();
  
  private FloatingActionMenu D;
  
  private LinearLayout E;
  
  private Typeface F;
  
  private ImageView G;
  
  private LayoutInflater H;
  
  private int I;
  
  private final String s = "BlockManagerActivity";
  
  private ImageView t;
  
  private PopupWindow u;
  
  private Typeface v;
  
  private ArrayList<CallLogBean> w;
  
  private ArrayList<CallLogBean> x;
  
  private com.allinone.callerid.b.c y;
  
  private LinearLayout z;
  
  private void m0() {
    try {
      ArrayList<CallLogBean> arrayList = this.w;
      if (arrayList != null && arrayList.size() > 0) {
        if (!b1.y2().booleanValue()) {
          int i = Build.VERSION.SDK_INT;
          if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext())) {
            com.allinone.callerid.dialog.f f = new com.allinone.callerid.dialog.f();
            this((Context)this, 2131820783);
            f.setCanceledOnTouchOutside(false);
            f.show();
          } 
        } 
      } else {
        if (!b1.y2().booleanValue()) {
          int i = Build.VERSION.SDK_INT;
          if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext())) {
            q.b().c("block_norifi_per_show");
            this.E.setVisibility(0);
            this.z.setVisibility(8);
            return;
          } 
        } 
        this.E.setVisibility(8);
        this.z.setVisibility(0);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void n0() {
    try {
      int i = Build.VERSION.SDK_INT;
      if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext()) && this.D.s())
        this.D.u(true); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void o0() {
    com.allinone.callerid.i.a.o.c.a(new g(this));
  }
  
  private void p0() {
    com.allinone.callerid.i.a.o.c.c(new h(this), this.x);
  }
  
  private void q0() {
    getWindow().getDecorView().post(new d(this));
  }
  
  private void r0() {
    View view = this.H.inflate(2131493146, null);
    TextView textView1 = (TextView)view.findViewById(2131297982);
    TextView textView2 = (TextView)view.findViewById(2131297815);
    FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131297513);
    FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131297479);
    textView1.setTypeface(this.v);
    textView2.setTypeface(this.v);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    this.u = new PopupWindow(view);
    int i = getWindowManager().getDefaultDisplay().getWidth();
    this.u.setWidth(i / 2);
    this.u.setHeight(-2);
    this.u.setFocusable(true);
    if (i1.f0(getApplicationContext()).booleanValue()) {
      this.u.setAnimationStyle(2131821306);
    } else {
      this.u.setAnimationStyle(2131821305);
    } 
    ColorDrawable colorDrawable = new ColorDrawable(0);
    this.u.setBackgroundDrawable((Drawable)colorDrawable);
  }
  
  private void s0() {
    this.F = g1.b();
    ListView listView = (ListView)findViewById(2131297235);
    this.z = (LinearLayout)findViewById(2131297516);
    this.E = (LinearLayout)findViewById(2131297190);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296817);
    this.w = new ArrayList<CallLogBean>();
    com.allinone.callerid.b.c c1 = new com.allinone.callerid.b.c((Activity)this, this.w, listView);
    this.y = c1;
    listView.setAdapter((ListAdapter)c1);
    listView.setOnItemClickListener(new e(this));
    ((TextView)findViewById(2131297995)).setTypeface(this.F);
    ((TextView)findViewById(2131297996)).setTypeface(this.F);
    ((TextView)findViewById(2131298038)).setTypeface(this.F);
    ((TextView)findViewById(2131297901)).setTypeface(this.F);
    frameLayout.setOnClickListener(this);
    FloatingActionMenu floatingActionMenu = (FloatingActionMenu)findViewById(2131297697);
    this.D = floatingActionMenu;
    floatingActionMenu.setContentDescription(getResources().getString(2131755077));
    this.D.setClosedOnTouchOutside(true);
    FloatingActionButton floatingActionButton1 = (FloatingActionButton)findViewById(2131296693);
    FloatingActionButton floatingActionButton3 = (FloatingActionButton)findViewById(2131296695);
    FloatingActionButton floatingActionButton4 = (FloatingActionButton)findViewById(2131296694);
    FloatingActionButton floatingActionButton2 = (FloatingActionButton)findViewById(2131296692);
    floatingActionButton1.setOnClickListener(this);
    floatingActionButton3.setOnClickListener(this);
    floatingActionButton4.setOnClickListener(this);
    floatingActionButton2.setOnClickListener(this);
    floatingActionButton1.setLabelTextType(this.F);
    floatingActionButton3.setLabelTextType(this.F);
    floatingActionButton4.setLabelTextType(this.F);
    floatingActionButton2.setLabelTextType(this.F);
    this.D.setMenuButtonShowAnimation(AnimationUtils.loadAnimation(getApplicationContext(), 2130772045));
    this.D.setMenuButtonHideAnimation(AnimationUtils.loadAnimation(getApplicationContext(), 2130772033));
    this.D.setOnMenuToggleListener(new f(this));
    if (!b1.y2().booleanValue()) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext()))
        this.G.setVisibility(8); 
    } 
  }
  
  private void t0(String paramString1, String paramString2, boolean paramBoolean) {
    if (paramString2 != null) {
      try {
        if (!"".equals(paramString2)) {
          a a = new a();
          this(this, paramString2, paramString1, paramBoolean);
          com.allinone.callerid.i.a.e.b.b(paramString2, a);
          return;
        } 
        Toast.makeText((Context)this, getResources().getString(2131755420), 0).show();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return;
    } 
    Toast.makeText((Context)this, getResources().getString(2131755420), 0).show();
  }
  
  private void u0() {
    m.h((Activity)this, new k(this));
  }
  
  private void v0() {
    m.g((Activity)this, new l(this));
  }
  
  private void w0() {
    View view = this.H.inflate(2131493205, null);
    DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
    DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
    deletableEditText1.setHint(2131755120);
    deletableEditText2.setTypeface(this.F);
    deletableEditText2.setHint(2131755123);
    androidx.appcompat.app.a a = (new androidx.appcompat.app.a.a((Context)this)).h(getResources().getString(2131755077)).r(view).n(getResources().getString(2131755681), new c(this, deletableEditText2, deletableEditText1)).j(getResources().getString(2131755180), new b(this)).a();
    a.show();
    a.g(-1).setTextColor(this.I);
    a.g(-2).setTextColor(getResources().getColor(2131099695));
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297513:
        q.b().c("more_blacklist_click");
        intent = new Intent();
        intent.setClass((Context)this, MyBlockListActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
        this.u.dismiss();
      case 2131297479:
        q.b().c("more_block_set_click");
        this.u.dismiss();
        intent = new Intent();
        intent.setClass((Context)this, BlockSettingActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131297123:
        intent = new Intent();
        intent.setClass((Context)this, NoDisturbActivity.class);
        startActivity(intent);
        overridePendingTransition(2130771968, 2130771969);
      case 2131297113:
        if (i1.f0(getApplicationContext()).booleanValue()) {
          this.u.showAtLocation((View)this.t, 51, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
        } else {
          this.u.showAtLocation((View)this.t, 53, 5, com.allinone.callerid.util.j.a(getApplicationContext(), 14.0F) + 25);
        } 
      case 2131296850:
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296817:
        q.b().c("block_norifi_per_click");
        com.allinone.callerid.util.k1.b.a = true;
        com.allinone.callerid.util.k1.b.c(getApplicationContext());
      case 2131296695:
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
          if (this.D.s())
            this.D.u(true); 
          v0();
        } else {
          com.allinone.callerid.util.k1.a.o((Activity)this, new i(this));
        } 
      case 2131296694:
        if (com.allinone.callerid.util.k1.a.c((Context)this)) {
          if (this.D.s())
            this.D.u(true); 
          u0();
        } else {
          com.allinone.callerid.util.k1.a.k((Activity)this, new j(this));
        } 
      case 2131296693:
        if (this.D.s())
          this.D.u(true); 
        w0();
      case 2131296692:
        break;
    } 
    if (this.D.s())
      this.D.u(true); 
    Intent intent = new Intent();
    q.b().c(h1.q);
    intent.setClass((Context)this, AddCustomNumActivity.class);
    startActivity(intent);
    overridePendingTransition(2130771968, 2130771969);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492903);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.H = LayoutInflater.from((Context)this);
    q0();
  }
  
  protected void onDestroy() {
    super.onDestroy();
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
    if (com.allinone.callerid.util.k1.b.a) {
      if (com.allinone.callerid.util.k1.b.b(getApplicationContext())) {
        q.b().c("dialog_notifi_per_tip_enalbleed");
        this.G.setVisibility(0);
      } 
      com.allinone.callerid.util.k1.b.a = false;
      m0();
    } 
  }
  
  class a implements com.allinone.callerid.i.a.e.a {
    a(BlockManagerActivity this$0, String param1String1, String param1String2, boolean param1Boolean) {}
    
    public void a(boolean param1Boolean) {
      if (!this.d.isFinishing())
        if (param1Boolean) {
          BlockManagerActivity blockManagerActivity = this.d;
          Toast.makeText((Context)blockManagerActivity, blockManagerActivity.getResources().getString(2131755131), 0).show();
        } else {
          EZBlackList eZBlackList = new EZBlackList();
          eZBlackList.setNumber(this.a.replace("-", ""));
          eZBlackList.setName(this.b);
          eZBlackList.setIs_myblock("true");
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new a(this));
        }  
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(BlockManagerActivity.a this$0) {}
      
      public void a() {
        q.b().c("add_blacklist");
        BlockManagerActivity blockManagerActivity = this.a.d;
        Toast.makeText((Context)blockManagerActivity, blockManagerActivity.getResources().getString(2131755131), 0).show();
        if (this.a.c) {
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(this.a.a);
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(BlockManagerActivity this$0) {}
    
    public void a() {
      q.b().c("add_blacklist");
      BlockManagerActivity blockManagerActivity = this.a.d;
      Toast.makeText((Context)blockManagerActivity, blockManagerActivity.getResources().getString(2131755131), 0).show();
      if (this.a.c) {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.a);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      } 
    }
  }
  
  class b implements DialogInterface.OnClickListener {
    b(BlockManagerActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class c implements DialogInterface.OnClickListener {
    c(BlockManagerActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        BlockManagerActivity.a0(this.d, str2, str1, true);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class d implements Runnable {
    d(BlockManagerActivity this$0) {}
    
    public void run() {
      BlockManagerActivity blockManagerActivity = this.b;
      BlockManagerActivity.P(blockManagerActivity, d1.a((Context)blockManagerActivity, 2130968859, 2131099706));
      BlockManagerActivity.S(this.b, g1.b());
      ((TextView)this.b.findViewById(2131297808)).setTypeface(BlockManagerActivity.Q(this.b));
      blockManagerActivity = this.b;
      BlockManagerActivity.c0(blockManagerActivity, (ImageView)blockManagerActivity.findViewById(2131297113));
      blockManagerActivity = this.b;
      BlockManagerActivity.e0(blockManagerActivity, (ImageView)blockManagerActivity.findViewById(2131297123));
      ImageView imageView = (ImageView)this.b.findViewById(2131296850);
      BlockManagerActivity.b0(this.b).setOnClickListener(this.b);
      BlockManagerActivity.d0(this.b).setOnClickListener(this.b);
      imageView.setOnClickListener(this.b);
      if (i1.f0(this.b.getApplicationContext()).booleanValue())
        imageView.setImageResource(2131231059); 
      BlockManagerActivity.f0(this.b);
      BlockManagerActivity.g0(this.b);
      BlockManagerActivity.h0(this.b);
    }
  }
  
  class e implements AdapterView.OnItemClickListener {
    e(BlockManagerActivity this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (BlockManagerActivity.i0(this.b) != null && BlockManagerActivity.i0(this.b).size() != 0) {
        CallLogBean callLogBean = BlockManagerActivity.i0(this.b).get(param1Int);
        if (callLogBean.T()) {
          Intent intent = new Intent();
          Bundle bundle = new Bundle();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)this.b, ContactActivity.class);
          this.b.startActivity(intent);
          this.b.overridePendingTransition(2130771968, 2130771969);
        } else {
          Intent intent = new Intent();
          Bundle bundle = new Bundle();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)this.b, UnknownContactActivity.class);
          this.b.startActivity(intent);
          this.b.overridePendingTransition(2130771968, 2130771969);
        } 
      } 
    }
  }
  
  class f implements FloatingActionMenu.h {
    f(BlockManagerActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        q.b().c("addBlockButton");
        if (!b1.y2().booleanValue()) {
          int i = Build.VERSION.SDK_INT;
          if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(this.a.getApplicationContext())) {
            com.allinone.callerid.dialog.f f1 = new com.allinone.callerid.dialog.f((Context)this.a, 2131820783);
            f1.setCanceledOnTouchOutside(false);
            f1.setOnDismissListener(new a(this));
            f1.show();
          } 
        } 
      } 
    }
    
    class a implements DialogInterface.OnDismissListener {
      a(BlockManagerActivity.f this$0) {}
      
      public void onDismiss(DialogInterface param2DialogInterface) {
        BlockManagerActivity.j0(this.b.a);
      }
    }
  }
  
  class a implements DialogInterface.OnDismissListener {
    a(BlockManagerActivity this$0) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      BlockManagerActivity.j0(this.b.a);
    }
  }
  
  class g implements com.allinone.callerid.i.a.o.a {
    g(BlockManagerActivity this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList) {
      BlockManagerActivity.l0(this.a, param1ArrayList);
      if (BlockManagerActivity.k0(this.a) != null && BlockManagerActivity.k0(this.a).size() > 0) {
        BlockManagerActivity.i0(this.a).clear();
        BlockManagerActivity.i0(this.a).addAll(BlockManagerActivity.k0(this.a));
        if (BlockManagerActivity.i0(this.a) != null && BlockManagerActivity.R(this.a) != null && BlockManagerActivity.i0(this.a).size() > 0) {
          BlockManagerActivity.T(this.a).setVisibility(8);
          BlockManagerActivity.R(this.a).b(BlockManagerActivity.i0(this.a));
        } else {
          BlockManagerActivity.T(this.a).setVisibility(0);
        } 
        BlockManagerActivity.U(this.a);
      } else {
        BlockManagerActivity.T(this.a).setVisibility(0);
      } 
      BlockManagerActivity.V(this.a);
    }
  }
  
  class h implements com.allinone.callerid.i.a.o.a {
    h(BlockManagerActivity this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList) {
      if (param1ArrayList != null && param1ArrayList.size() > 0) {
        BlockManagerActivity.i0(this.a).clear();
        BlockManagerActivity.i0(this.a).addAll(param1ArrayList);
        if (BlockManagerActivity.i0(this.a) != null && BlockManagerActivity.R(this.a) != null && BlockManagerActivity.i0(this.a).size() > 0)
          BlockManagerActivity.R(this.a).b(BlockManagerActivity.i0(this.a)); 
      } else {
        BlockManagerActivity.T(this.a).setVisibility(0);
      } 
    }
  }
  
  class i implements com.allinone.callerid.util.k1.a.g {
    i(BlockManagerActivity this$0) {}
    
    public void a() {
      if (BlockManagerActivity.W(this.a).s())
        BlockManagerActivity.W(this.a).u(true); 
      BlockManagerActivity.X(this.a);
    }
  }
  
  class j implements com.allinone.callerid.util.k1.a.g {
    j(BlockManagerActivity this$0) {}
    
    public void a() {
      if (BlockManagerActivity.W(this.a).s())
        BlockManagerActivity.W(this.a).u(true); 
      BlockManagerActivity.Y(this.a);
    }
  }
  
  class k implements com.allinone.callerid.i.a.f.f {
    k(BlockManagerActivity this$0) {}
    
    public void a(EZSimpleContact param1EZSimpleContact) {
      View view = LayoutInflater.from((Context)this.a).inflate(2131493205, null);
      DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
      DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
      deletableEditText1.setText(param1EZSimpleContact.getName());
      deletableEditText2.setTypeface(BlockManagerActivity.Z(this.a));
      deletableEditText2.setText(param1EZSimpleContact.getNumber());
      deletableEditText2.setSelection(deletableEditText2.getText().length());
      AlertDialog alertDialog = (new AlertDialog.Builder((Context)this.a)).setMessage(this.a.getResources().getString(2131755077)).setView(view).setPositiveButton(this.a.getResources().getString(2131755681), new b(this, deletableEditText2, deletableEditText1)).setNegativeButton(this.a.getResources().getString(2131755180), new a(this)).create();
      alertDialog.show();
      alertDialog.getButton(-1).setTextColor(BlockManagerActivity.O(this.a));
      alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
    }
    
    class a implements DialogInterface.OnClickListener {
      a(BlockManagerActivity.k this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(BlockManagerActivity.k this$0, DeletableEditText param2DeletableEditText1, DeletableEditText param2DeletableEditText2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str1 = this.b.getText().toString();
          String str2 = this.c.getText().toString();
          BlockManagerActivity.a0(this.d.a, str2, str1, false);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(BlockManagerActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(BlockManagerActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        BlockManagerActivity.a0(this.d.a, str2, str1, false);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class l implements com.allinone.callerid.i.a.f.b {
    l(BlockManagerActivity this$0) {}
    
    public void a(CallLogBean param1CallLogBean) {
      View view = LayoutInflater.from((Context)this.a).inflate(2131493205, null);
      DeletableEditText deletableEditText1 = (DeletableEditText)view.findViewById(2131296645);
      DeletableEditText deletableEditText2 = (DeletableEditText)view.findViewById(2131296646);
      deletableEditText1.setHint(2131755120);
      deletableEditText2.setTypeface(BlockManagerActivity.Z(this.a));
      deletableEditText2.setHint(2131755123);
      deletableEditText1.setText(param1CallLogBean.n());
      deletableEditText2.setText(param1CallLogBean.p());
      deletableEditText2.setSelection(deletableEditText2.getText().length());
      AlertDialog alertDialog = (new AlertDialog.Builder((Context)this.a)).setMessage(this.a.getResources().getString(2131755077)).setView(view).setPositiveButton(this.a.getResources().getString(2131755681), new b(this, deletableEditText2, deletableEditText1)).setNegativeButton(this.a.getResources().getString(2131755180), new a(this)).create();
      alertDialog.show();
      alertDialog.getButton(-1).setTextColor(BlockManagerActivity.O(this.a));
      alertDialog.getButton(-2).setTextColor(this.a.getResources().getColor(2131099695));
    }
    
    class a implements DialogInterface.OnClickListener {
      a(BlockManagerActivity.l this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(BlockManagerActivity.l this$0, DeletableEditText param2DeletableEditText1, DeletableEditText param2DeletableEditText2) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        try {
          String str1 = this.b.getText().toString();
          String str2 = this.c.getText().toString();
          BlockManagerActivity.a0(this.d.a, str2, str1, true);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(BlockManagerActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(BlockManagerActivity this$0, DeletableEditText param1DeletableEditText1, DeletableEditText param1DeletableEditText2) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      try {
        String str1 = this.b.getText().toString();
        String str2 = this.c.getText().toString();
        BlockManagerActivity.a0(this.d.a, str2, str1, true);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/block/BlockManagerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */