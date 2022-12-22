package com.allinone.callerid.callscreen.activitys;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.customview.SideBar;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CallScreenSelectActivity extends BaseActivity implements View.OnClickListener {
  private BaseEditText A;
  
  private SideBar B;
  
  private ArrayList<PersonaliseContact> C;
  
  private com.allinone.callerid.d.a.a D;
  
  private ListView E;
  
  private ArrayList<PersonaliseContact> F = new ArrayList<PersonaliseContact>();
  
  private ArrayList<PersonaliseContact> G;
  
  private i H = new i(this);
  
  private String I;
  
  private boolean J;
  
  private ImageView K;
  
  private boolean L;
  
  private TextWatcher M;
  
  private Runnable N = new d(this);
  
  private final String s = "CallScreenSelectActivity";
  
  private Typeface t;
  
  private FrameLayout u;
  
  private ArrayList<PersonaliseContact> v = new ArrayList<PersonaliseContact>();
  
  private Handler w = new Handler();
  
  private RelativeLayout x;
  
  private FrameLayout y;
  
  private ImageView z;
  
  private void j0() {
    this.w.post(this.N);
  }
  
  private void k0() {
    this.z.setOnClickListener(new f(this));
    g g = new g(this);
    this.M = g;
    this.A.addTextChangedListener(g);
    this.B.setOnTouchingLetterChangedListener(new h(this));
  }
  
  private void l0() {
    ImageView imageView1 = (ImageView)findViewById(2131296949);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView1.setImageResource(2131231059); 
    TextView textView1 = (TextView)findViewById(2131298187);
    ImageView imageView2 = (ImageView)findViewById(2131297044);
    this.K = imageView2;
    imageView2.setOnClickListener(this);
    this.x = (RelativeLayout)findViewById(2131297517);
    ((TextView)findViewById(2131297997)).setTypeface(this.t);
    this.y = (FrameLayout)findViewById(2131296781);
    this.z = (ImageView)findViewById(2131296940);
    this.A = (BaseEditText)findViewById(2131296661);
    this.B = (SideBar)findViewById(2131297634);
    TextView textView3 = (TextView)findViewById(2131296563);
    this.B.setTextView(textView3);
    this.E = (ListView)findViewById(2131297336);
    this.C = new ArrayList<PersonaliseContact>();
    com.allinone.callerid.d.a.a a1 = new com.allinone.callerid.d.a.a((Context)this, this.C);
    this.D = a1;
    this.E.setAdapter((ListAdapter)a1);
    this.D.c(new b(this));
    this.u = (FrameLayout)findViewById(2131296792);
    TextView textView2 = (TextView)findViewById(2131298122);
    imageView1.setOnClickListener(this);
    textView1.setTypeface(this.t);
    textView2.setTypeface(this.t);
    this.u.setOnClickListener(new c(this));
  }
  
  private void m0() {
    com.allinone.callerid.d.e.b.a(this.J, this.I, new e(this));
  }
  
  private List<PersonaliseContact> n0(String paramString) {
    ArrayList<PersonaliseContact> arrayList = new ArrayList();
    if (paramString.matches("^([0-9]|[/+]).*")) {
      String str = paramString.replaceAll("\\-|\\s", "");
      for (PersonaliseContact personaliseContact : this.C) {
        if (personaliseContact.getNumber() != null && personaliseContact.getName() != null && (personaliseContact.getNumber().replaceAll("\\-|\\s", "").contains(str) || personaliseContact.getName().contains(paramString)) && !arrayList.contains(personaliseContact))
          arrayList.add(personaliseContact); 
      } 
    } else {
      for (PersonaliseContact personaliseContact : this.C) {
        if (personaliseContact.getNumber() != null && personaliseContact.getName() != null && (personaliseContact.getName().toLowerCase(Locale.CHINESE).contains(paramString.toLowerCase(Locale.CHINESE)) || personaliseContact.sortKey.toLowerCase(Locale.CHINESE).replace(" ", "").contains(paramString.toLowerCase(Locale.CHINESE)) || personaliseContact.sortToken.b.toLowerCase(Locale.CHINESE).contains(paramString.toLowerCase(Locale.CHINESE)) || personaliseContact.sortToken.c.toLowerCase(Locale.CHINESE).contains(paramString.toLowerCase(Locale.CHINESE))) && !arrayList.contains(personaliseContact))
          arrayList.add(personaliseContact); 
      } 
    } 
    return arrayList;
  }
  
  private void o0() {
    Intent intent = new Intent();
    Bundle bundle = new Bundle();
    bundle.putParcelableArrayList("selected_contacts", this.v);
    intent.putExtras(bundle);
    setResult(9898, intent);
    finish();
    overridePendingTransition(2130771968, 2130771969);
  }
  
  public void onClick(View paramView) {
    int j = paramView.getId();
    if (j != 2131296949) {
      if (j == 2131297044) {
        boolean bool = this.L;
        j = 0;
        if (bool) {
          this.L = false;
          ArrayList<PersonaliseContact> arrayList = this.G;
          if (arrayList != null && arrayList.size() > 0)
            for (j = 0; j < this.G.size(); j++)
              ((PersonaliseContact)this.G.get(j)).setIsselect(false);  
          this.v.clear();
        } else {
          this.L = true;
          ArrayList<PersonaliseContact> arrayList = this.G;
          if (arrayList != null && arrayList.size() > 0) {
            while (j < this.G.size()) {
              ((PersonaliseContact)this.G.get(j)).setIsselect(true);
              j++;
            } 
            this.v.clear();
            this.v.addAll(this.G);
          } 
        } 
        com.allinone.callerid.d.a.a a1 = this.D;
        if (a1 != null)
          a1.notifyDataSetChanged(); 
      } 
    } else {
      setResult(9898);
      finish();
      overridePendingTransition(2130771968, 2130771969);
    } 
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      setContentView(2131492912);
      if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      this.I = getIntent().getStringExtra("theme_name");
      this.J = getIntent().getBooleanExtra("is_default", false);
      View view = getWindow().getDecorView();
      a a1 = new a();
      this(this);
      view.post(a1);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void onDestroy() {
    super.onDestroy();
    try {
      this.A.removeTextChangedListener(this.M);
      this.M = null;
      this.A.setOnEditorActionListener(null);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      setResult(9898);
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
    a(CallScreenSelectActivity this$0) {}
    
    public void run() {
      CallScreenSelectActivity.O(this.b, g1.b());
      CallScreenSelectActivity.P(this.b);
      CallScreenSelectActivity.a0(this.b);
    }
  }
  
  class b implements com.allinone.callerid.d.a.a.b {
    b(CallScreenSelectActivity this$0) {}
    
    public void a(View param1View, int param1Int, List<PersonaliseContact> param1List) {
      boolean bool;
      CallScreenSelectActivity.b0(this.a).clear();
      CallScreenSelectActivity.b0(this.a).addAll(param1List);
      FrameLayout frameLayout = CallScreenSelectActivity.c0(this.a);
      if (param1List.size() > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      frameLayout.setEnabled(bool);
    }
  }
  
  class c implements View.OnClickListener {
    c(CallScreenSelectActivity this$0) {}
    
    public void onClick(View param1View) {
      CallScreenSelectActivity.d0(this.b);
    }
  }
  
  class d implements Runnable {
    d(CallScreenSelectActivity this$0) {}
    
    public void run() {
      try {
        CallScreenSelectActivity.R(this.b);
        CallScreenSelectActivity.S(this.b);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class e implements com.allinone.callerid.d.e.b.a {
    e(CallScreenSelectActivity this$0) {}
    
    public void a(ArrayList<PersonaliseContact> param1ArrayList) {
      CallScreenSelectActivity.f0(this.a, new ArrayList());
      CallScreenSelectActivity.e0(this.a).addAll(param1ArrayList);
      CallScreenSelectActivity.T(this.a).sendEmptyMessage(777);
    }
    
    public void b() {
      try {
        CallScreenSelectActivity.g0(this.a).setVisibility(0);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class f implements View.OnClickListener {
    f(CallScreenSelectActivity this$0) {}
    
    public void onClick(View param1View) {
      CallScreenSelectActivity.U(this.b).setText("");
      try {
        ((InputMethodManager)param1View.getContext().getSystemService("input_method")).hideSoftInputFromWindow(param1View.getWindowToken(), 0);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements TextWatcher {
    g(CallScreenSelectActivity this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      String str = CallScreenSelectActivity.U(this.b).getText().toString();
      if ("".equals(str)) {
        CallScreenSelectActivity.V(this.b).setVisibility(4);
      } else {
        CallScreenSelectActivity.V(this.b).setVisibility(0);
      } 
      if (str.length() > 0) {
        CallScreenSelectActivity callScreenSelectActivity = this.b;
        CallScreenSelectActivity.X(callScreenSelectActivity, (ArrayList)CallScreenSelectActivity.Y(callScreenSelectActivity, str));
        CallScreenSelectActivity.Q(this.b).d(CallScreenSelectActivity.W(this.b));
        q.b().c("contact_search");
      } else {
        CallScreenSelectActivity.W(this.b).clear();
        CallScreenSelectActivity.Q(this.b).d(CallScreenSelectActivity.i0(this.b));
      } 
      CallScreenSelectActivity.Z(this.b).setSelection(0);
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  class h implements SideBar.a {
    h(CallScreenSelectActivity this$0) {}
    
    public void a(String param1String) {
      int i = CallScreenSelectActivity.Q(this.a).getPositionForSection(param1String.charAt(0));
      if (i != -1) {
        if (i == 0) {
          CallScreenSelectActivity.Z(this.a).setSelection(i);
        } else {
          CallScreenSelectActivity.Z(this.a).setSelection(i + 1);
        } 
      } else {
        CallScreenSelectActivity.Z(this.a).setSelection(i);
      } 
      if (param1String.equals("☆"))
        CallScreenSelectActivity.Z(this.a).setSelection(0); 
    }
  }
  
  private static class i extends Handler {
    private WeakReference<CallScreenSelectActivity> a;
    
    i(CallScreenSelectActivity param1CallScreenSelectActivity) {
      this.a = new WeakReference<CallScreenSelectActivity>(param1CallScreenSelectActivity);
    }
    
    public void handleMessage(Message param1Message) {
      super.handleMessage(param1Message);
      CallScreenSelectActivity callScreenSelectActivity = this.a.get();
      if (callScreenSelectActivity != null && param1Message.what == 777)
        try {
          if (CallScreenSelectActivity.e0(callScreenSelectActivity) != null && CallScreenSelectActivity.e0(callScreenSelectActivity).size() > 0) {
            CallScreenSelectActivity.g0(callScreenSelectActivity).setVisibility(8);
            CallScreenSelectActivity.h0(callScreenSelectActivity).setVisibility(0);
            CallScreenSelectActivity.i0(callScreenSelectActivity).clear();
            CallScreenSelectActivity.i0(callScreenSelectActivity).addAll(CallScreenSelectActivity.e0(callScreenSelectActivity));
          } 
          CallScreenSelectActivity.Q(callScreenSelectActivity).d(CallScreenSelectActivity.i0(callScreenSelectActivity));
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/CallScreenSelectActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */