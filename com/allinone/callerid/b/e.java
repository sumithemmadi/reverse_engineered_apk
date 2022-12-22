package com.allinone.callerid.b;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.os.Build;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.mvc.controller.EZDialerActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q0;
import com.allinone.callerid.util.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class e extends BaseAdapter {
  private final int b;
  
  private int c;
  
  private Context d;
  
  private List<CallLogBean> e;
  
  private HashMap<String, Integer> f = new HashMap<String, Integer>();
  
  private LayoutInflater g;
  
  private ListView h;
  
  c i;
  
  private Activity j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  public e(EZDialerActivity paramEZDialerActivity, Context paramContext, ListView paramListView) {
    this.j = (Activity)paramEZDialerActivity;
    this.d = paramContext;
    this.e = new ArrayList<CallLogBean>();
    this.g = LayoutInflater.from((Context)this.j);
    this.h = paramListView;
    this.k = d1.a((Context)this.j, 2130968855, 2131099719);
    this.l = d1.a((Context)this.j, 2130968902, 2131099725);
    this.m = d1.a((Context)this.j, 2130968858, 2131099729);
    this.n = d1.a((Context)this.j, 2130968855, 2131099719);
    this.c = d1.b((Context)this.j, 2130968700, 2131230906);
    this.b = d1.b((Context)this.j, 2130968701, 2131230909);
  }
  
  private void d(View paramView, CallLogBean paramCallLogBean, int paramInt) {
    paramView.setOnClickListener(new b(this, paramCallLogBean));
  }
  
  public void e(List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap) {
    if (paramHashMap != null && paramHashMap.size() > 0)
      this.f = paramHashMap; 
    if (paramList != null) {
      this.e.clear();
      this.e.addAll(paramList);
    } 
  }
  
  public int getCount() {
    return this.e.size();
  }
  
  public Object getItem(int paramInt) {
    return this.e.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (paramView == null) {
      paramView = this.g.inflate(2131492980, paramViewGroup, false);
      c c1 = new c(null);
      this.i = c1;
      c1.a = (ImageView)paramView.findViewById(2131296451);
      this.i.l = (ImageView)paramView.findViewById(2131296452);
      this.i.m = (ImageView)paramView.findViewById(2131296453);
      this.i.l.setVisibility(8);
      this.i.m.setVisibility(8);
      this.i.b = (TextView)paramView.findViewById(2131297304);
      this.i.c = (TextView)paramView.findViewById(2131297753);
      this.i.d = (TextView)paramView.findViewById(2131296379);
      this.i.h = (TextView)paramView.findViewById(2131297875);
      this.i.i = (TextView)paramView.findViewById(2131298026);
      this.i.e = (TextView)paramView.findViewById(2131298136);
      this.i.f = (TextView)paramView.findViewById(2131297880);
      this.i.g = (RelativeLayout)paramView.findViewById(2131297498);
      this.i.e.setVisibility(8);
      this.i.f.setVisibility(8);
      this.i.g.setVisibility(8);
      this.i.i.setVisibility(8);
      this.i.e.setBackgroundResource(this.c);
      this.i.e.setTextColor(this.m);
      this.i.j = (ImageView)paramView.findViewById(2131296445);
      this.i.k = (ImageView)paramView.findViewById(2131296864);
      this.i.k.setVisibility(8);
      this.i.h.setText("");
      this.i.h.setVisibility(8);
      this.i.n = (FrameLayout)paramView.findViewById(2131297469);
      this.i.o = (RelativeLayout)paramView.findViewById(2131297468);
      this.i.p = paramView.findViewById(2131297483);
      this.i.p.setVisibility(8);
      this.i.q = paramView.findViewById(2131297542);
      this.i.q.setVisibility(8);
      this.i.s = (ImageView)paramView.findViewById(2131297054);
      this.i.t = (ImageView)paramView.findViewById(2131297055);
      this.i.s.setVisibility(8);
      this.i.t.setVisibility(8);
      this.i.r = (ImageView)paramView.findViewById(2131297423);
      this.i.b.setTypeface(g1.b());
      this.i.h.setTypeface(g1.b());
      this.i.c.setTypeface(g1.b());
      this.i.i.setTypeface(g1.b());
      this.i.d.setTypeface(g1.b());
      this.i.e.setTypeface(g1.b());
      this.i.f.setTypeface(g1.a());
      paramView.setTag(this.i);
    } else {
      this.i = (c)paramView.getTag();
    } 
    ImageView imageView = this.i.r;
    int i = 2131231148;
    imageView.setImageResource(2131231148);
    this.i.b.setTextColor(this.k);
    this.i.h.setTextColor(this.l);
    this.i.i.setTextColor(this.l);
    this.i.c.setTextColor(this.l);
    CallLogBean callLogBean = this.e.get(paramInt);
    if (c1.h(this.d.getApplicationContext())) {
      try {
        if (callLogBean.C() != null)
          if (callLogBean.C().equals("0")) {
            this.i.s.setVisibility(0);
            this.i.t.setVisibility(8);
          } else if (callLogBean.C().equals("1")) {
            this.i.t.setVisibility(0);
            this.i.s.setVisibility(8);
          } else {
            this.i.s.setVisibility(8);
            this.i.t.setVisibility(8);
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } else {
      this.i.s.setVisibility(8);
      this.i.t.setVisibility(8);
    } 
    this.i.f.setVisibility(0);
    this.i.g.setVisibility(0);
    this.i.q.setVisibility(0);
    this.i.f.setText(callLogBean.g());
    try {
      List<CallLogBean> list = this.e;
      if (list != null && list.size() > 1 && paramInt > 0)
        if (((CallLogBean)this.e.get(paramInt - 1)).g().equals(((CallLogBean)this.e.get(paramInt)).g())) {
          this.i.f.setVisibility(8);
          this.i.g.setVisibility(8);
          this.i.q.setVisibility(8);
        } else {
          this.i.f.setVisibility(0);
          this.i.g.setVisibility(0);
          this.i.q.setVisibility(0);
        }  
    } catch (Exception exception) {
      this.i.f.setVisibility(8);
      this.i.g.setVisibility(8);
      this.i.q.setVisibility(8);
      exception.printStackTrace();
    } 
    try {
      List<CallLogBean> list = this.e;
      if (list != null && list.size() > 1 && paramInt > 0) {
        if (((CallLogBean)this.e.get(paramInt - 1)).g().equals(((CallLogBean)this.e.get(paramInt)).g())) {
          if (paramInt != this.e.size() - 1) {
            if (!((CallLogBean)this.e.get(paramInt + 1)).g().equals(((CallLogBean)this.e.get(paramInt)).g()))
              this.i.p.setVisibility(0); 
          } else {
            this.i.p.setVisibility(0);
          } 
        } else if (paramInt != this.e.size() - 1) {
          if (!((CallLogBean)this.e.get(paramInt + 1)).g().equals(((CallLogBean)this.e.get(paramInt)).g()))
            this.i.p.setVisibility(0); 
        } else {
          this.i.p.setVisibility(0);
        } 
      } else if (paramInt != this.e.size() - 1) {
        if (!((CallLogBean)this.e.get(paramInt + 1)).g().equals(((CallLogBean)this.e.get(paramInt)).g()))
          if (paramInt == 0) {
            this.i.p.setVisibility(0);
          } else {
            this.i.p.setVisibility(0);
          }  
      } else {
        this.i.p.setVisibility(0);
      } 
    } catch (Exception exception) {
      this.i.p.setVisibility(0);
      exception.printStackTrace();
    } 
    if (callLogBean.c() != null && !callLogBean.c().equals("")) {
      this.i.d.setVisibility(0);
      TextView textView = this.i.d;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(callLogBean.c());
      stringBuilder.append(" ");
      textView.setText(stringBuilder.toString());
    } else {
      this.i.d.setText("");
      this.i.d.setVisibility(8);
    } 
    if (callLogBean.N() != null && !"".equals(callLogBean.N()) && callLogBean.x() != null && !"".equals(callLogBean.x())) {
      if (!callLogBean.T()) {
        this.i.e.setVisibility(0);
        this.i.e.setBackgroundResource(this.c);
        this.i.e.setTextColor(this.m);
        this.i.e.setText(callLogBean.N());
      } else {
        this.i.e.setVisibility(8);
      } 
    } else {
      String str1 = callLogBean.n();
      if (str1 != null && !"".equals(str1)) {
        this.i.e.setVisibility(8);
      } else if (callLogBean.y() != null && !"".equals(callLogBean.y())) {
        this.i.e.setBackgroundResource(this.b);
        this.i.e.setVisibility(0);
        this.i.e.setTextColor(this.n);
        this.i.e.setText(this.d.getResources().getString(2131755414));
      } else {
        this.i.e.setVisibility(8);
        this.i.e.setBackgroundResource(this.c);
        this.i.e.setTextColor(this.m);
      } 
      if (callLogBean.c() == null || callLogBean.c().equals("")) {
        this.i.d.setText("");
        this.i.d.setVisibility(8);
      } 
    } 
    String str = callLogBean.n();
    if (str == null || "".equals(str)) {
      if (callLogBean.y() != null && !"".equals(callLogBean.y())) {
        this.i.b.setText(callLogBean.y());
      } else if (callLogBean.p() != null) {
        str = callLogBean.d();
        if (str != null && !"".equals(str)) {
          this.i.b.setText(str);
        } else if (callLogBean.i() != null && !"".equals(callLogBean.i())) {
          this.i.b.setText(callLogBean.i());
        } else if (i1.v0(callLogBean.p())) {
          this.i.b.setText(this.d.getResources().getString(2131755829));
        } else {
          this.i.b.setText(callLogBean.p());
        } 
      } 
    } else {
      this.i.b.setText(str);
    } 
    int j = callLogBean.M();
    if (j != 1) {
      if (j != 2) {
        if (j != 3) {
          if (j != 5) {
            if (j != 9) {
              this.i.a.setBackgroundResource(2131231080);
              this.i.l.setBackgroundResource(2131231080);
              this.i.m.setBackgroundResource(2131231080);
            } else {
              this.i.a.setBackgroundResource(2131231080);
              this.i.l.setBackgroundResource(2131231080);
              this.i.m.setBackgroundResource(2131231080);
            } 
          } else {
            this.i.a.setBackgroundResource(2131231080);
            this.i.l.setBackgroundResource(2131231080);
            this.i.m.setBackgroundResource(2131231080);
          } 
        } else {
          this.i.a.setBackgroundResource(2131231080);
          this.i.l.setBackgroundResource(2131231080);
          this.i.m.setBackgroundResource(2131231080);
        } 
      } else {
        this.i.a.setBackgroundResource(2131231081);
        this.i.l.setBackgroundResource(2131231081);
        this.i.m.setBackgroundResource(2131231081);
      } 
    } else {
      this.i.a.setBackgroundResource(2131231079);
      this.i.l.setBackgroundResource(2131231079);
      this.i.m.setBackgroundResource(2131231079);
    } 
    HashMap<String, Integer> hashMap = this.f;
    if (hashMap != null && hashMap.size() != 0) {
      Integer integer = this.f.get(callLogBean.K());
      if (integer != null) {
        j = integer.intValue();
        if (j == 1) {
          this.i.l.setVisibility(8);
          this.i.m.setVisibility(8);
          this.i.h.setText("");
          this.i.h.setVisibility(8);
        } else if (j == 2) {
          this.i.l.setVisibility(0);
          this.i.m.setVisibility(8);
          this.i.h.setText("");
          this.i.h.setVisibility(8);
        } else if (j == 3) {
          this.i.l.setVisibility(0);
          this.i.m.setVisibility(0);
          this.i.h.setText("");
          this.i.h.setVisibility(8);
        } else if (j > 3) {
          this.i.l.setVisibility(0);
          this.i.m.setVisibility(0);
          TextView textView = this.i.h;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("(");
          stringBuilder.append(j);
          stringBuilder.append(") ");
          textView.setText(stringBuilder.toString());
          this.i.h.setVisibility(0);
        } 
      } 
    } 
    if (callLogBean.B() != null && !"".equals(callLogBean.B())) {
      this.i.i.setText(callLogBean.B());
      this.i.i.setVisibility(0);
    } else {
      this.i.i.setText("");
      this.i.i.setVisibility(8);
    } 
    this.i.c.setText(callLogBean.P());
    d((View)this.i.j, callLogBean, paramInt);
    this.i.n.setOnClickListener(new a(this, paramInt));
    if (callLogBean.T()) {
      if (callLogBean.p() != null)
        u.c(this.j, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, callLogBean.v()), null, 2131231148, this.i.r); 
    } else if (callLogBean.a() != null && !"".equals(callLogBean.a())) {
      if (callLogBean.N() != null && !"".equals(callLogBean.N()) && callLogBean.x() != null && !"".equals(callLogBean.x())) {
        this.i.r.setImageResource(2131231149);
        paramInt = 2131231149;
      } else {
        this.i.r.setImageResource(2131231148);
        paramInt = i;
      } 
      if (callLogBean.p() != null)
        u.b(this.d, callLogBean.a(), paramInt, this.i.r); 
    } else if (callLogBean.N() != null && !"".equals(callLogBean.N()) && callLogBean.x() != null && !"".equals(callLogBean.x())) {
      this.i.r.setImageResource(2131231149);
    } else {
      this.i.r.setImageResource(2131231148);
    } 
    return paramView;
  }
  
  class a implements View.OnClickListener {
    a(e this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = e.a(this.c).getOnItemClickListener();
      ListView listView = e.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  class b implements View.OnClickListener {
    b(e this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      try {
        EZDialerActivity.s = true;
        if (b1.R())
          b1.j1(true); 
        if (c1.h(e.b(this.c))) {
          if (b1.H()) {
            int i = b1.q();
            c1.d(e.b(this.c), i, this.b.p());
          } else if (Build.VERSION.SDK_INT >= 22) {
            c1.m((Context)e.c(this.c), this.b.p());
          } else if (this.b.p() != null && !i1.v0(this.b.p())) {
            q0.a(e.b(this.c), this.b.p());
          } 
        } else if (this.b.p() != null && !i1.v0(this.b.p())) {
          q0.a(e.b(this.c), this.b.p());
        } 
      } catch (Exception exception) {
        Toast.makeText(e.b(this.c), e.b(this.c).getResources().getString(2131755541), 1).show();
      } 
    }
  }
  
  private static class c {
    ImageView a;
    
    TextView b;
    
    TextView c;
    
    TextView d;
    
    TextView e;
    
    TextView f;
    
    RelativeLayout g;
    
    TextView h;
    
    TextView i;
    
    ImageView j;
    
    ImageView k;
    
    ImageView l;
    
    ImageView m;
    
    FrameLayout n;
    
    RelativeLayout o;
    
    View p;
    
    View q;
    
    ImageView r;
    
    ImageView s;
    
    ImageView t;
    
    private c() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */