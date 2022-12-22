package com.allinone.callerid.mvc.controller.contactslist;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.customview.MyListView;
import com.allinone.callerid.customview.SideBar;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.mvc.controller.contactpdt.ContactActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ContactsListActivity extends BaseActivity {
  private SideBar A;
  
  private ArrayList<CallLogBean> B;
  
  private ArrayList<CallLogBean> C = new ArrayList<CallLogBean>();
  
  private com.allinone.callerid.b.i D;
  
  private LinearLayout E;
  
  private TextView F;
  
  private List<String> G = new ArrayList<String>();
  
  private ArrayList<CallLogBean> H;
  
  private ArrayList<CallLogBean> I;
  
  private LinearLayout J;
  
  private RelativeLayout K;
  
  private m L = new m(this);
  
  private FrameLayout M;
  
  private ImageView N;
  
  private BaseEditText O;
  
  private int P;
  
  private TextWatcher Q;
  
  public List<CallLogBean> R = new ArrayList<CallLogBean>();
  
  private Typeface S;
  
  private Handler T = new Handler();
  
  private Runnable U = new a(this);
  
  private final String s = "ContactsListActivity";
  
  public List<String> t = new ArrayList<String>();
  
  public ArrayList<CallLogBean> u = new ArrayList<CallLogBean>();
  
  public List<CallLogBean> v = new ArrayList<CallLogBean>();
  
  private ListView w;
  
  private MyListView x;
  
  private com.allinone.callerid.b.m y;
  
  private n z;
  
  private void A0() {
    ImageView imageView = (ImageView)findViewById(2131296850);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new f(this));
    this.K = (RelativeLayout)findViewById(2131297517);
    ((TextView)findViewById(2131297997)).setTypeface(this.S);
    this.M = (FrameLayout)findViewById(2131296781);
    this.N = (ImageView)findViewById(2131296940);
    this.O = (BaseEditText)findViewById(2131296661);
    this.A = (SideBar)findViewById(2131297634);
    TextView textView = (TextView)findViewById(2131296563);
    this.A.setTextView(textView);
    y0();
    this.B = new ArrayList<CallLogBean>();
    com.allinone.callerid.b.i i1 = new com.allinone.callerid.b.i((Context)this, this.B, this.w);
    this.D = i1;
    this.w.setAdapter((ListAdapter)i1);
  }
  
  private void B0() {
    com.allinone.callerid.i.a.q.b.f((Context)this, new g(this));
  }
  
  private void C0() {
    com.allinone.callerid.i.a.q.b.i(this.t, this.G, this.v, new c(this));
  }
  
  private List<CallLogBean> D0(String paramString) {
    ArrayList<CallLogBean> arrayList = new ArrayList();
    try {
      boolean bool = paramString.matches("^([0-9]|[/+]).*");
      if (bool) {
        String str = paramString.replaceAll("\\-|\\s", "");
        for (CallLogBean callLogBean : this.B) {
          if (callLogBean.p() != null && callLogBean.n() != null && (callLogBean.p().replaceAll("\\-|\\s", "").contains(str) || callLogBean.n().contains(paramString)) && !arrayList.contains(callLogBean))
            arrayList.add(callLogBean); 
        } 
      } else {
        for (CallLogBean callLogBean : this.B) {
          if (callLogBean.p() != null && callLogBean.n() != null) {
            if (!callLogBean.n().toLowerCase(Locale.CHINESE).contains(paramString.toLowerCase(Locale.CHINESE))) {
              String str = callLogBean.s;
              if (str == null || !str.toLowerCase(Locale.CHINESE).replace(" ", "").contains(paramString.toLowerCase(Locale.CHINESE))) {
                str = callLogBean.f0.b;
                if (str == null || !str.toLowerCase(Locale.CHINESE).contains(paramString.toLowerCase(Locale.CHINESE))) {
                  str = callLogBean.f0.c;
                  if (str != null && str.toLowerCase(Locale.CHINESE).contains(paramString.toLowerCase(Locale.CHINESE)))
                    continue; 
                  continue;
                } 
              } 
            } 
            continue;
          } 
          continue;
          if (!arrayList.contains(SYNTHETIC_LOCAL_VARIABLE_5))
            arrayList.add(SYNTHETIC_LOCAL_VARIABLE_5); 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return arrayList;
  }
  
  private void E0(View paramView) {
    Typeface typeface = g1.a();
    TextView textView1 = (TextView)paramView.findViewById(2131298231);
    this.F = (TextView)paramView.findViewById(2131297905);
    this.J = (LinearLayout)paramView.findViewById(2131297187);
    ((TextView)paramView.findViewById(2131298001)).setTypeface(this.S);
    ((TextView)paramView.findViewById(2131298002)).setTypeface(typeface);
    ((TextView)paramView.findViewById(2131298003)).setTypeface(this.S);
    TextView textView2 = (TextView)paramView.findViewById(2131297896);
    textView1.setTypeface(typeface);
    this.F.setTypeface(this.S);
    textView2.setTypeface(typeface);
    this.x = (MyListView)paramView.findViewById(2131297145);
    com.allinone.callerid.b.m m1 = new com.allinone.callerid.b.m((Activity)this, this.u);
    this.y = m1;
    this.x.setAdapter((ListAdapter)m1);
    textView2.setOnClickListener(new l(this));
  }
  
  private void w0() {
    this.I = new ArrayList<CallLogBean>();
    com.allinone.callerid.i.a.q.b.e(getApplicationContext(), new b(this));
  }
  
  private void x0() {
    getWindow().getDecorView().post(new e(this));
  }
  
  private void y0() {
    View view = LayoutInflater.from((Context)this).inflate(2131492977, null);
    this.E = (LinearLayout)view.findViewById(2131297179);
    E0(view);
    this.w.addHeaderView(view, null, false);
  }
  
  private void z0() {
    this.N.setOnClickListener(new h(this));
    i i1 = new i(this);
    this.Q = i1;
    this.O.addTextChangedListener(i1);
    this.O.setOnTouchListener(new j(this));
    this.A.setOnTouchingLetterChangedListener(new k(this));
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 703 && paramInt2 == 700)
      try {
        d d = new d();
        this(this);
        com.allinone.callerid.i.a.q.a.f(d);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492918);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    x0();
  }
  
  public void onDestroy() {
    super.onDestroy();
    try {
      if (this.z != null)
        b.p.a.a.b(getApplicationContext()).e(this.z); 
      this.L.removeCallbacksAndMessages(null);
      this.O.removeTextChangedListener(this.Q);
      this.Q = null;
      this.O.setOnEditorActionListener(null);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      finish();
      overridePendingTransition(2130771968, 2130771969);
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause() {
    super.onPause();
  }
  
  public void onResume() {
    super.onResume();
  }
  
  class a implements Runnable {
    a(ContactsListActivity this$0) {}
    
    public void run() {
      ContactsListActivity.S(this.b);
      ContactsListActivity.V(this.b).setOnItemClickListener(new a(this));
      ContactsListActivity.V(this.b).setOnScrollListener(new b(this));
      try {
        ContactsListActivity contactsListActivity = this.b;
        ContactsListActivity.n n2 = new ContactsListActivity.n();
        this(this.b, null);
        ContactsListActivity.b0(contactsListActivity, n2);
        b.p.a.a a1 = b.p.a.a.b(this.b.getApplicationContext());
        ContactsListActivity.n n1 = ContactsListActivity.a0(this.b);
        IntentFilter intentFilter = new IntentFilter();
        this("com.allinone.callerid.STARRED_DATA");
        a1.c(n1, intentFilter);
        i1.F0((Activity)this.b);
        ContactsListActivity.c0(this.b);
        ContactsListActivity.e0(this.b);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements AdapterView.OnItemClickListener {
      a(ContactsListActivity.a this$0) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        try {
          ArrayList arrayList = ContactsListActivity.T(this.b.b);
          if (arrayList != null && ContactsListActivity.T(this.b.b).size() > 0) {
            CallLogBean callLogBean = ContactsListActivity.T(this.b.b).get(param2Int);
            Intent intent = new Intent();
            this();
            Bundle bundle = new Bundle();
            this();
            bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
            intent.putExtras(bundle);
            intent.setClass((Context)this.b.b, ContactActivity.class);
            this.b.b.startActivity(intent);
            this.b.b.overridePendingTransition(2130771968, 2130771969);
          } else if (ContactsListActivity.p0(this.b.b) != null && ContactsListActivity.p0(this.b.b).size() > 0) {
            CallLogBean callLogBean = ContactsListActivity.p0(this.b.b).get(param2Int);
            Intent intent = new Intent();
            this();
            Bundle bundle = new Bundle();
            this();
            bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
            intent.putExtras(bundle);
            intent.setClass((Context)this.b.b, ContactActivity.class);
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("联系人：");
              stringBuilder.append(callLogBean.toString());
              d0.a("favtest", stringBuilder.toString());
            } 
            this.b.b.startActivity(intent);
            this.b.b.overridePendingTransition(2130771968, 2130771969);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
    
    class b implements AbsListView.OnScrollListener {
      b(ContactsListActivity.a this$0) {}
      
      public void onScroll(AbsListView param2AbsListView, int param2Int1, int param2Int2, int param2Int3) {
        try {
          if (param2Int1 > ContactsListActivity.Y(this.a.b)) {
            ((InputMethodManager)param2AbsListView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(param2AbsListView.getWindowToken(), 0);
          } else {
            ContactsListActivity.Y(this.a.b);
          } 
          ContactsListActivity.Z(this.a.b, param2Int1);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
      
      public void onScrollStateChanged(AbsListView param2AbsListView, int param2Int) {
        if (ContactsListActivity.X(this.a.b) != null && ContactsListActivity.X(this.a.b).isCursorVisible())
          ContactsListActivity.X(this.a.b).setCursorVisible(false); 
      }
    }
  }
  
  class a implements AdapterView.OnItemClickListener {
    a(ContactsListActivity this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      try {
        ArrayList arrayList = ContactsListActivity.T(this.b.b);
        if (arrayList != null && ContactsListActivity.T(this.b.b).size() > 0) {
          CallLogBean callLogBean = ContactsListActivity.T(this.b.b).get(param1Int);
          Intent intent = new Intent();
          this();
          Bundle bundle = new Bundle();
          this();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)this.b.b, ContactActivity.class);
          this.b.b.startActivity(intent);
          this.b.b.overridePendingTransition(2130771968, 2130771969);
        } else if (ContactsListActivity.p0(this.b.b) != null && ContactsListActivity.p0(this.b.b).size() > 0) {
          CallLogBean callLogBean = ContactsListActivity.p0(this.b.b).get(param1Int);
          Intent intent = new Intent();
          this();
          Bundle bundle = new Bundle();
          this();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)this.b.b, ContactActivity.class);
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("联系人：");
            stringBuilder.append(callLogBean.toString());
            d0.a("favtest", stringBuilder.toString());
          } 
          this.b.b.startActivity(intent);
          this.b.b.overridePendingTransition(2130771968, 2130771969);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class b implements AbsListView.OnScrollListener {
    b(ContactsListActivity this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {
      try {
        if (param1Int1 > ContactsListActivity.Y(this.a.b)) {
          ((InputMethodManager)param1AbsListView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(param1AbsListView.getWindowToken(), 0);
        } else {
          ContactsListActivity.Y(this.a.b);
        } 
        ContactsListActivity.Z(this.a.b, param1Int1);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {
      if (ContactsListActivity.X(this.a.b) != null && ContactsListActivity.X(this.a.b).isCursorVisible())
        ContactsListActivity.X(this.a.b).setCursorVisible(false); 
    }
  }
  
  class b implements com.allinone.callerid.i.a.q.e {
    b(ContactsListActivity this$0) {}
    
    public void a(List<CallLogBean> param1List) {
      ContactsListActivity.r0(this.a).addAll(param1List);
      ContactsListActivity.k0(this.a).sendEmptyMessage(999);
    }
  }
  
  class c implements com.allinone.callerid.i.a.q.c {
    c(ContactsListActivity this$0) {}
    
    public void a(List<String> param1List1, List<String> param1List2, List<CallLogBean> param1List) {
      ContactsListActivity.n0(this.a, param1List2);
      ContactsListActivity contactsListActivity = this.a;
      contactsListActivity.t = param1List1;
      contactsListActivity.v = param1List;
      ContactsListActivity.k0(contactsListActivity).sendEmptyMessage(2222);
    }
    
    public void b() {
      ContactsListActivity.k0(this.a).sendEmptyMessage(3333);
    }
  }
  
  class d implements com.allinone.callerid.i.a.q.f {
    d(ContactsListActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        ContactsListActivity.s0(this.a).setVisibility(8);
        ContactsListActivity.e0(this.a);
      } else {
        ArrayList<CallLogBean> arrayList = this.a.u;
        if (arrayList != null && arrayList.size() > 0) {
          this.a.u.clear();
          ContactsListActivity.u0(this.a).notifyDataSetChanged();
        } 
        ContactsListActivity.R(this.a);
      } 
    }
  }
  
  class e implements Runnable {
    e(ContactsListActivity this$0) {}
    
    public void run() {
      ContactsListActivity.g0(this.b, g1.b());
      ContactsListActivity contactsListActivity = this.b;
      ContactsListActivity.W(contactsListActivity, (ListView)contactsListActivity.findViewById(2131297336));
      ContactsListActivity.h0(this.b);
      ContactsListActivity.j0(this.b).post(ContactsListActivity.i0(this.b));
    }
  }
  
  class f implements View.OnClickListener {
    f(ContactsListActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class g implements com.allinone.callerid.i.a.q.g {
    g(ContactsListActivity this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList) {
      ContactsListActivity.f0(this.a, new ArrayList());
      ContactsListActivity.d0(this.a).addAll(param1ArrayList);
      ContactsListActivity.k0(this.a).sendEmptyMessage(777);
    }
    
    public void b() {
      try {
        ContactsListActivity.O(this.a).setVisibility(0);
        ContactsListActivity.P(this.a).setVisibility(8);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class h implements View.OnClickListener {
    h(ContactsListActivity this$0) {}
    
    public void onClick(View param1View) {
      try {
        ContactsListActivity.X(this.b).setText("");
        ((InputMethodManager)param1View.getContext().getSystemService("input_method")).hideSoftInputFromWindow(param1View.getWindowToken(), 0);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class i implements TextWatcher {
    i(ContactsListActivity this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      try {
        if (ContactsListActivity.X(this.b) != null) {
          String str = ContactsListActivity.X(this.b).getText().toString();
          if ("".equals(str)) {
            ContactsListActivity.l0(this.b).setVisibility(4);
          } else {
            ContactsListActivity.l0(this.b).setVisibility(0);
          } 
          if (str.length() > 0) {
            ContactsListActivity contactsListActivity = this.b;
            ContactsListActivity.U(contactsListActivity, (ArrayList)ContactsListActivity.m0(contactsListActivity, str));
            ContactsListActivity.P(this.b).setVisibility(8);
            ContactsListActivity.q0(this.b).c(ContactsListActivity.T(this.b), str);
            q.b().c("contact_search");
          } else {
            ContactsListActivity.T(this.b).clear();
            ContactsListActivity.P(this.b).setVisibility(0);
            ContactsListActivity.q0(this.b).c(ContactsListActivity.p0(this.b), "");
            ContactsListActivity.X(this.b).setCursorVisible(false);
          } 
          ContactsListActivity.V(this.b).setSelection(0);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  class j implements View.OnTouchListener {
    j(ContactsListActivity this$0) {}
    
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      if (param1MotionEvent.getAction() == 0)
        ContactsListActivity.X(this.b).setCursorVisible(true); 
      return false;
    }
  }
  
  class k implements SideBar.a {
    k(ContactsListActivity this$0) {}
    
    public void a(String param1String) {
      int i = ContactsListActivity.q0(this.a).getPositionForSection(param1String.charAt(0));
      if (i != -1) {
        if (i == 0) {
          ContactsListActivity.V(this.a).setSelection(i);
        } else {
          ContactsListActivity.V(this.a).setSelection(i + 1);
        } 
      } else {
        ContactsListActivity.V(this.a).setSelection(i);
      } 
      if (param1String.equals("☆"))
        ContactsListActivity.V(this.a).setSelection(0); 
    }
  }
  
  class l implements View.OnClickListener {
    l(ContactsListActivity this$0) {}
    
    public void onClick(View param1View) {
      Intent intent = new Intent((Context)this.b, EditFavActivity.class);
      this.b.startActivityForResult(intent, 703);
      this.b.overridePendingTransition(2130771968, 2130771969);
      q.b().c("tv_edit");
    }
  }
  
  private static class m extends Handler {
    private WeakReference<ContactsListActivity> a;
    
    public m(ContactsListActivity param1ContactsListActivity) {
      this.a = new WeakReference<ContactsListActivity>(param1ContactsListActivity);
    }
    
    public void handleMessage(Message param1Message) {
      super.handleMessage(param1Message);
      ContactsListActivity contactsListActivity = this.a.get();
      if (contactsListActivity != null) {
        int i = param1Message.what;
        if (i != 666) {
          if (i != 777) {
            if (i != 999) {
              if (i != 2222) {
                if (i == 3333)
                  try {
                    ContactsListActivity.Q(contactsListActivity).setVisibility(8);
                    ContactsListActivity.t0(contactsListActivity).setVisibility(0);
                  } catch (Exception exception) {
                    exception.printStackTrace();
                  }  
              } else {
                try {
                  List<CallLogBean> list = contactsListActivity.v;
                  if (list != null && list.size() > 0) {
                    ((CallLogBean)contactsListActivity.v.get(0)).p0(0);
                    contactsListActivity.u.clear();
                    contactsListActivity.u.add(contactsListActivity.v.get(0));
                    if (ContactsListActivity.u0(contactsListActivity) != null) {
                      ContactsListActivity.u0(contactsListActivity).b(contactsListActivity.u);
                    } else {
                      com.allinone.callerid.b.m m1 = new com.allinone.callerid.b.m();
                      this((Activity)contactsListActivity, contactsListActivity.u);
                      ContactsListActivity.v0(contactsListActivity, m1);
                      ContactsListActivity.Q(contactsListActivity).setAdapter((ListAdapter)ContactsListActivity.u0(contactsListActivity));
                    } 
                    if (contactsListActivity.u.size() != 0) {
                      ContactsListActivity.s0(contactsListActivity).setVisibility(0);
                      ContactsListActivity.t0(contactsListActivity).setVisibility(8);
                      ContactsListActivity.Q(contactsListActivity).setVisibility(0);
                    } else {
                      ContactsListActivity.s0(contactsListActivity).setVisibility(8);
                      ContactsListActivity.Q(contactsListActivity).setVisibility(8);
                      ContactsListActivity.t0(contactsListActivity).setVisibility(0);
                    } 
                  } else {
                    ContactsListActivity.Q(contactsListActivity).setVisibility(8);
                    ContactsListActivity.t0(contactsListActivity).setVisibility(0);
                  } 
                } catch (Exception exception) {
                  exception.printStackTrace();
                } 
              } 
            } else {
              try {
                if (ContactsListActivity.r0(contactsListActivity) != null && ContactsListActivity.r0(contactsListActivity).size() > 0) {
                  ContactsListActivity.s0(contactsListActivity).setVisibility(8);
                  ContactsListActivity.t0(contactsListActivity).setVisibility(8);
                  contactsListActivity.u.clear();
                  contactsListActivity.u.addAll(ContactsListActivity.r0(contactsListActivity));
                  if (ContactsListActivity.u0(contactsListActivity) != null) {
                    ContactsListActivity.u0(contactsListActivity).b(contactsListActivity.u);
                  } else {
                    com.allinone.callerid.b.m m1 = new com.allinone.callerid.b.m();
                    this((Activity)contactsListActivity, contactsListActivity.u);
                    ContactsListActivity.v0(contactsListActivity, m1);
                    ContactsListActivity.Q(contactsListActivity).setAdapter((ListAdapter)ContactsListActivity.u0(contactsListActivity));
                  } 
                } else {
                  ContactsListActivity.R(contactsListActivity);
                } 
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
            } 
          } else {
            try {
              if (ContactsListActivity.d0(contactsListActivity) != null && ContactsListActivity.d0(contactsListActivity).size() > 0) {
                ContactsListActivity.O(contactsListActivity).setVisibility(8);
                ContactsListActivity.o0(contactsListActivity).setVisibility(0);
                ContactsListActivity.P(contactsListActivity).setVisibility(0);
                ContactsListActivity.p0(contactsListActivity).clear();
                ContactsListActivity.p0(contactsListActivity).addAll(ContactsListActivity.d0(contactsListActivity));
              } 
              ContactsListActivity.q0(contactsListActivity).b(ContactsListActivity.p0(contactsListActivity));
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } 
        } else {
          try {
            ContactsListActivity.O(contactsListActivity).setVisibility(0);
            ContactsListActivity.P(contactsListActivity).setVisibility(8);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } 
      } 
    }
  }
  
  private class n extends BroadcastReceiver {
    private n(ContactsListActivity this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if ("com.allinone.callerid.STARRED_DATA".equals(param1Intent.getAction()))
        com.allinone.callerid.i.a.q.a.f(new a(this)); 
    }
    
    class a implements com.allinone.callerid.i.a.q.f {
      a(ContactsListActivity.n this$0) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean) {
          ContactsListActivity.s0(this.a.a).setVisibility(8);
          ContactsListActivity.e0(this.a.a);
        } else {
          ContactsListActivity.R(this.a.a);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.q.f {
    a(ContactsListActivity this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        ContactsListActivity.s0(this.a.a).setVisibility(8);
        ContactsListActivity.e0(this.a.a);
      } else {
        ContactsListActivity.R(this.a.a);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/contactslist/ContactsListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */