package com.allinone.callerid.g;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
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
import androidx.fragment.app.Fragment;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.customview.MyListView;
import com.allinone.callerid.customview.NestedScrollingListView;
import com.allinone.callerid.customview.SideBar;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.contactpdt.ContactActivity;
import com.allinone.callerid.mvc.controller.contactslist.EditFavActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.github.clans.fab.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class c extends Fragment {
  private Context A0;
  
  private TextWatcher B0;
  
  public List<CallLogBean> C0 = new ArrayList<CallLogBean>();
  
  private MainActivity D0;
  
  private View E0;
  
  private boolean F0;
  
  private Handler G0 = new Handler();
  
  private Runnable H0 = new d(this);
  
  private Typeface I0;
  
  private Typeface J0;
  
  public FloatingActionButton c0;
  
  public List<String> d0 = new ArrayList<String>();
  
  public ArrayList<CallLogBean> e0 = new ArrayList<CallLogBean>();
  
  public List<CallLogBean> f0 = new ArrayList<CallLogBean>();
  
  private NestedScrollingListView g0;
  
  private int h0;
  
  private MyListView i0;
  
  private com.allinone.callerid.b.m j0;
  
  private m k0;
  
  private SideBar l0;
  
  private ArrayList<CallLogBean> m0;
  
  private ArrayList<CallLogBean> n0 = new ArrayList<CallLogBean>();
  
  private com.allinone.callerid.b.i o0;
  
  private LinearLayout p0;
  
  private TextView q0;
  
  private List<String> r0 = new ArrayList<String>();
  
  private ArrayList<CallLogBean> s0;
  
  private ArrayList<CallLogBean> t0;
  
  private LinearLayout u0;
  
  private l v0 = new l(this, null);
  
  private FrameLayout w0;
  
  private ImageView x0;
  
  private BaseEditText y0;
  
  private ViewStub z0;
  
  private void F2() {
    this.t0 = new ArrayList<CallLogBean>();
    com.allinone.callerid.i.a.q.a.g((Context)this.D0, new a(this));
  }
  
  private void G2() {
    MainActivity mainActivity = this.D0;
    if (mainActivity != null)
      mainActivity.getWindow().getDecorView().post(new e(this)); 
  }
  
  private void H2() {
    View view = LayoutInflater.from((Context)this.D0).inflate(2131492977, null);
    this.p0 = (LinearLayout)view.findViewById(2131297179);
    O2(view);
    this.g0.addHeaderView(view, null, false);
  }
  
  private void I2() {
    this.l0.setOnTouchingLetterChangedListener(new j(this));
  }
  
  private void J2() {
    this.x0.setOnClickListener(new g(this));
    h h = new h(this);
    this.B0 = h;
    this.y0.addTextChangedListener(h);
    this.y0.setOnTouchListener(new i(this));
  }
  
  private void K2(View paramView) {
    this.I0 = g1.a();
    this.J0 = g1.b();
    this.w0 = (FrameLayout)paramView.findViewById(2131296781);
    this.x0 = (ImageView)paramView.findViewById(2131296940);
    this.y0 = (BaseEditText)paramView.findViewById(2131296661);
    this.l0 = (SideBar)paramView.findViewById(2131297634);
    TextView textView = (TextView)paramView.findViewById(2131296563);
    this.l0.setTextView(textView);
    this.m0 = new ArrayList<CallLogBean>();
    com.allinone.callerid.b.i i1 = new com.allinone.callerid.b.i((Context)this.D0, this.m0, (ListView)this.g0);
    this.o0 = i1;
    this.g0.setAdapter((ListAdapter)i1);
  }
  
  private void L2(boolean paramBoolean) {
    com.allinone.callerid.i.a.q.a.h((Context)this.D0, paramBoolean, new f(this));
  }
  
  private void M2() {
    com.allinone.callerid.i.a.q.a.k(this.d0, this.r0, this.f0, new b(this));
  }
  
  private List<CallLogBean> N2(String paramString) {
    ArrayList<CallLogBean> arrayList = new ArrayList();
    try {
      boolean bool = paramString.matches("^([0-9]|[/+]).*");
      if (bool) {
        String str = paramString.replaceAll("\\-|\\s", "");
        for (CallLogBean callLogBean : this.m0) {
          if (callLogBean.p() != null && callLogBean.n() != null && (callLogBean.p().replaceAll("\\-|\\s", "").contains(str) || callLogBean.n().contains(paramString)) && !arrayList.contains(callLogBean))
            arrayList.add(callLogBean); 
        } 
      } else {
        for (CallLogBean callLogBean : this.m0) {
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
  
  private void O2(View paramView) {
    TextView textView1 = (TextView)paramView.findViewById(2131298231);
    this.q0 = (TextView)paramView.findViewById(2131297905);
    this.u0 = (LinearLayout)paramView.findViewById(2131297187);
    ((TextView)paramView.findViewById(2131298001)).setTypeface(this.J0);
    ((TextView)paramView.findViewById(2131298002)).setTypeface(this.I0);
    ((TextView)paramView.findViewById(2131298003)).setTypeface(this.J0);
    TextView textView2 = (TextView)paramView.findViewById(2131297896);
    textView1.setTypeface(this.I0);
    this.q0.setTypeface(this.J0);
    textView2.setTypeface(this.I0);
    this.i0 = (MyListView)paramView.findViewById(2131297145);
    com.allinone.callerid.b.m m1 = new com.allinone.callerid.b.m((Activity)this.D0, this.e0);
    this.j0 = m1;
    this.i0.setAdapter((ListAdapter)m1);
    textView2.setOnClickListener(new k(this));
  }
  
  private void P2() {
    try {
      ((TextView)((RelativeLayout)this.z0.inflate()).findViewById(2131298000)).setTypeface(g1.b());
    } catch (Exception exception) {
      this.z0.setVisibility(0);
    } 
  }
  
  public void I0() {
    super.I0();
  }
  
  public void L1(boolean paramBoolean) {
    super.L1(paramBoolean);
    if (paramBoolean) {
      try {
        if (this.F0) {
          this.F0 = false;
          Handler handler = new Handler();
          this();
          c c1 = new c();
          this(this);
          handler.postDelayed(c1, 600L);
        } 
        q.b().c("in_speeddial");
        FloatingActionButton floatingActionButton = this.c0;
        if (floatingActionButton != null && floatingActionButton.y())
          this.c0.H(true); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } else {
      BaseEditText baseEditText = this.y0;
      if (baseEditText != null)
        baseEditText.setCursorVisible(false); 
    } 
  }
  
  public void N0() {
    super.N0();
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.A0 = paramContext;
    MainActivity mainActivity = (MainActivity)paramContext;
    this.D0 = mainActivity;
    this.c0 = (FloatingActionButton)mainActivity.findViewById(2131296823);
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
    if (this.E0 == null)
      try {
        View view = paramLayoutInflater.inflate(2131493035, paramViewGroup, false);
        this.E0 = view;
        this.z0 = (ViewStub)view.findViewById(2131298271);
        this.g0 = (NestedScrollingListView)this.E0.findViewById(2131297336);
        this.F0 = true;
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return this.E0;
  }
  
  public void x0() {
    super.x0();
    try {
      if (this.k0 != null)
        b.p.a.a.b(this.A0).e(this.k0); 
      this.v0.removeCallbacksAndMessages(null);
      try {
        View view = this.E0;
        if (view != null) {
          ViewGroup viewGroup = (ViewGroup)view.getParent();
          if (viewGroup != null)
            viewGroup.removeView(this.E0); 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      this.y0.removeTextChangedListener(this.B0);
      this.B0 = null;
      this.y0.setOnEditorActionListener(null);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements com.allinone.callerid.i.a.q.e {
    a(c this$0) {}
    
    public void a(List<CallLogBean> param1List) {
      c.E2(this.a).addAll(param1List);
      c.v2(this.a).sendEmptyMessage(999);
    }
  }
  
  class b implements com.allinone.callerid.i.a.q.c {
    b(c this$0) {}
    
    public void a(List<String> param1List1, List<String> param1List2, List<CallLogBean> param1List) {
      c.y2(this.a, param1List2);
      c c1 = this.a;
      c1.d0 = param1List1;
      c1.f0 = param1List;
      c.v2(c1).sendEmptyMessage(2222);
    }
    
    public void b() {
      c.v2(this.a).sendEmptyMessage(3333);
    }
  }
  
  class c implements Runnable {
    c(c this$0) {}
    
    public void run() {
      c.Y1(this.b);
      c c1 = this.b;
      c.a2(c1, c.Z1(c1));
      c.b2(this.b);
    }
  }
  
  class d implements Runnable {
    d(c this$0) {}
    
    public void run() {
      c.d2(this.b);
      c.e2(this.b);
      c.C2(this.b).setOnItemClickListener(new a(this));
      c.C2(this.b).setOnScrollListener(new b(this));
      try {
        c c1 = this.b;
        c.m m = new c.m();
        this(this.b, null);
        c.m2(c1, m);
        b.p.a.a a = b.p.a.a.b(c.n2(this.b));
        m = c.l2(this.b);
        IntentFilter intentFilter = new IntentFilter();
        this("com.allinone.callerid.STARRED_DATA");
        a.c(m, intentFilter);
        i1.F0((Activity)c.V1(this.b));
        c.o2(this.b);
        c.p2(this.b, false);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements AdapterView.OnItemClickListener {
      a(c.d this$0) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        try {
          ArrayList arrayList = c.f2(this.b.b);
          if (arrayList != null && c.f2(this.b.b).size() > 0) {
            CallLogBean callLogBean = c.f2(this.b.b).get(param2Int);
            Intent intent = new Intent();
            this();
            Bundle bundle = new Bundle();
            this();
            bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
            intent.putExtras(bundle);
            intent.setClass((Context)c.V1(this.b.b), ContactActivity.class);
            this.b.b.M1(intent);
            c.V1(this.b.b).overridePendingTransition(2130771968, 2130771969);
          } else if (c.A2(this.b.b) != null && c.A2(this.b.b).size() > 0) {
            CallLogBean callLogBean = c.A2(this.b.b).get(param2Int);
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("contact:");
              stringBuilder.append(callLogBean.toString());
              d0.a("favtest", stringBuilder.toString());
            } 
            Intent intent = new Intent();
            this();
            Bundle bundle = new Bundle();
            this();
            bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
            intent.putExtras(bundle);
            intent.setClass((Context)c.V1(this.b.b), ContactActivity.class);
            this.b.b.M1(intent);
            c.V1(this.b.b).overridePendingTransition(2130771968, 2130771969);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
    
    class b implements AbsListView.OnScrollListener {
      b(c.d this$0) {}
      
      public void onScroll(AbsListView param2AbsListView, int param2Int1, int param2Int2, int param2Int3) {
        if (param2Int1 > c.i2(this.a.b)) {
          FloatingActionButton floatingActionButton = this.a.b.c0;
          if (floatingActionButton != null && !floatingActionButton.y())
            this.a.b.c0.u(true); 
          try {
            ((InputMethodManager)param2AbsListView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(param2AbsListView.getWindowToken(), 0);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } else if (param2Int1 < c.i2(this.a.b)) {
          FloatingActionButton floatingActionButton = this.a.b.c0;
          if (floatingActionButton != null && floatingActionButton.y())
            this.a.b.c0.H(true); 
        } 
        c.k2(this.a.b, param2Int1);
      }
      
      public void onScrollStateChanged(AbsListView param2AbsListView, int param2Int) {
        if (c.h2(this.a.b) != null && c.h2(this.a.b).isCursorVisible())
          c.h2(this.a.b).setCursorVisible(false); 
      }
    }
  }
  
  class a implements AdapterView.OnItemClickListener {
    a(c this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      try {
        ArrayList arrayList = c.f2(this.b.b);
        if (arrayList != null && c.f2(this.b.b).size() > 0) {
          CallLogBean callLogBean = c.f2(this.b.b).get(param1Int);
          Intent intent = new Intent();
          this();
          Bundle bundle = new Bundle();
          this();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)c.V1(this.b.b), ContactActivity.class);
          this.b.b.M1(intent);
          c.V1(this.b.b).overridePendingTransition(2130771968, 2130771969);
        } else if (c.A2(this.b.b) != null && c.A2(this.b.b).size() > 0) {
          CallLogBean callLogBean = c.A2(this.b.b).get(param1Int);
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("contact:");
            stringBuilder.append(callLogBean.toString());
            d0.a("favtest", stringBuilder.toString());
          } 
          Intent intent = new Intent();
          this();
          Bundle bundle = new Bundle();
          this();
          bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
          intent.putExtras(bundle);
          intent.setClass((Context)c.V1(this.b.b), ContactActivity.class);
          this.b.b.M1(intent);
          c.V1(this.b.b).overridePendingTransition(2130771968, 2130771969);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class b implements AbsListView.OnScrollListener {
    b(c this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {
      if (param1Int1 > c.i2(this.a.b)) {
        FloatingActionButton floatingActionButton = this.a.b.c0;
        if (floatingActionButton != null && !floatingActionButton.y())
          this.a.b.c0.u(true); 
        try {
          ((InputMethodManager)param1AbsListView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(param1AbsListView.getWindowToken(), 0);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else if (param1Int1 < c.i2(this.a.b)) {
        FloatingActionButton floatingActionButton = this.a.b.c0;
        if (floatingActionButton != null && floatingActionButton.y())
          this.a.b.c0.H(true); 
      } 
      c.k2(this.a.b, param1Int1);
    }
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {
      if (c.h2(this.a.b) != null && c.h2(this.a.b).isCursorVisible())
        c.h2(this.a.b).setCursorVisible(false); 
    }
  }
  
  class e implements Runnable {
    e(c this$0) {}
    
    public void run() {
      c.u2(this.b).post(c.s2(this.b));
    }
  }
  
  class f implements com.allinone.callerid.i.a.q.g {
    f(c this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList) {
      c.t2(this.a, new ArrayList());
      c.r2(this.a).addAll(param1ArrayList);
      c.v2(this.a).sendEmptyMessage(777);
    }
    
    public void b() {
      try {
        c.Q1(this.a);
        c.c2(this.a).setVisibility(8);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements View.OnClickListener {
    g(c this$0) {}
    
    public void onClick(View param1View) {
      try {
        c.h2(this.b).setText("");
        ((InputMethodManager)param1View.getContext().getSystemService("input_method")).hideSoftInputFromWindow(param1View.getWindowToken(), 0);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class h implements TextWatcher {
    h(c this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      try {
        String str = c.h2(this.b).getText().toString();
        if ("".equals(str)) {
          c.w2(this.b).setVisibility(4);
        } else {
          c.w2(this.b).setVisibility(0);
        } 
        if (str.length() > 0) {
          c c1 = this.b;
          c.g2(c1, (ArrayList)c.x2(c1, str));
          c.c2(this.b).setVisibility(8);
          c.B2(this.b).c(c.f2(this.b), str);
          q.b().c("contact_search");
        } else {
          c.f2(this.b).clear();
          c.c2(this.b).setVisibility(0);
          c.B2(this.b).c(c.A2(this.b), "");
          c.h2(this.b).setCursorVisible(false);
        } 
        c.C2(this.b).setSelection(0);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  class i implements View.OnTouchListener {
    i(c this$0) {}
    
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      if (param1MotionEvent.getAction() == 0)
        c.h2(this.b).setCursorVisible(true); 
      return false;
    }
  }
  
  class j implements SideBar.a {
    j(c this$0) {}
    
    public void a(String param1String) {
      int i = c.B2(this.a).getPositionForSection(param1String.charAt(0));
      if (i != -1) {
        if (i == 0) {
          c.C2(this.a).setSelection(i);
        } else {
          c.C2(this.a).setSelection(i + 1);
        } 
      } else {
        c.C2(this.a).setSelection(i);
      } 
      if (param1String.equals("☆"))
        c.C2(this.a).setSelection(0); 
    }
  }
  
  class k implements View.OnClickListener {
    k(c this$0) {}
    
    public void onClick(View param1View) {
      Intent intent = new Intent((Context)c.V1(this.b), EditFavActivity.class);
      this.b.M1(intent);
      c.V1(this.b).overridePendingTransition(2130771968, 2130771969);
      q.b().c("tv_edit");
    }
  }
  
  private static class l extends Handler {
    private WeakReference<c> a;
    
    private l(c param1c) {
      this.a = new WeakReference<c>(param1c);
    }
    
    public void handleMessage(Message param1Message) {
      super.handleMessage(param1Message);
      c c = this.a.get();
      if (c != null) {
        int i = param1Message.what;
        if (i != 666) {
          if (i != 777) {
            if (i != 999) {
              if (i != 2222) {
                if (i == 3333)
                  try {
                    c.W1(c).setVisibility(8);
                    c.S1(c).setVisibility(0);
                  } catch (Exception exception) {
                    exception.printStackTrace();
                  }  
              } else {
                try {
                  List<CallLogBean> list = c.f0;
                  if (list != null && list.size() > 0) {
                    ((CallLogBean)c.f0.get(0)).p0(0);
                    c.e0.clear();
                    c.e0.add(c.f0.get(0));
                    if (c.T1(c) != null) {
                      c.T1(c).b(c.e0);
                    } else {
                      com.allinone.callerid.b.m m = new com.allinone.callerid.b.m();
                      this((Activity)c.V1(c), c.e0);
                      c.U1(c, m);
                      c.W1(c).setAdapter((ListAdapter)c.T1(c));
                    } 
                    if (c.e0.size() != 0) {
                      c.R1(c).setVisibility(0);
                      c.S1(c).setVisibility(8);
                      c.W1(c).setVisibility(0);
                    } else {
                      c.R1(c).setVisibility(8);
                      c.W1(c).setVisibility(8);
                      c.S1(c).setVisibility(0);
                    } 
                  } else {
                    c.W1(c).setVisibility(8);
                    c.S1(c).setVisibility(0);
                  } 
                } catch (Exception exception) {
                  exception.printStackTrace();
                } 
              } 
            } else {
              try {
                if (c.E2(c) != null && c.E2(c).size() > 0) {
                  c.R1(c).setVisibility(8);
                  c.S1(c).setVisibility(8);
                  c.e0.clear();
                  c.e0.addAll(c.E2(c));
                  if (c.T1(c) != null) {
                    c.T1(c).b(c.e0);
                  } else {
                    com.allinone.callerid.b.m m = new com.allinone.callerid.b.m();
                    this((Activity)c.V1(c), c.e0);
                    c.U1(c, m);
                    c.W1(c).setAdapter((ListAdapter)c.T1(c));
                  } 
                } else {
                  c.X1(c);
                } 
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
            } 
          } else {
            try {
              if (c.r2(c) != null && c.r2(c).size() > 0) {
                c.z2(c).setVisibility(8);
                c.c2(c).setVisibility(0);
                c.A2(c).clear();
                c.A2(c).addAll(c.r2(c));
              } 
              c.B2(c).b(c.A2(c));
              if (c.C2(c).getVisibility() == 8) {
                c.D2(c).setVisibility(0);
                c.C2(c).setVisibility(0);
              } 
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } 
        } else {
          try {
            c.Q1(c);
            c.c2(c).setVisibility(8);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } 
      } 
    }
  }
  
  private class m extends BroadcastReceiver {
    private m(c this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if ("com.allinone.callerid.STARRED_DATA".equals(param1Intent.getAction()))
        com.allinone.callerid.i.a.q.a.f(new a(this)); 
    }
    
    class a implements com.allinone.callerid.i.a.q.f {
      a(c.m this$0) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean) {
          c.R1(this.a.a).setVisibility(8);
          c.o2(this.a.a);
        } else {
          c.X1(this.a.a);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.q.f {
    a(c this$0) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        c.R1(this.a.a).setVisibility(8);
        c.o2(this.a.a);
      } else {
        c.X1(this.a.a);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */