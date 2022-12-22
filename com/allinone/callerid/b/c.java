package com.allinone.callerid.b;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
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
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.u;
import java.util.ArrayList;
import java.util.List;

public class c extends BaseAdapter {
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  private final int h;
  
  private final int i;
  
  private final int j;
  
  private final int k;
  
  private Activity l;
  
  private List<CallLogBean> m;
  
  private LayoutInflater n;
  
  private ListView o;
  
  b p;
  
  public c(Activity paramActivity, List<CallLogBean> paramList, ListView paramListView) {
    this.l = paramActivity;
    this.m = paramList;
    this.n = LayoutInflater.from((Context)paramActivity);
    this.o = paramListView;
    this.b = d1.a((Context)paramActivity, 2130968855, 2131099719);
    this.c = d1.a((Context)paramActivity, 2130968902, 2131099725);
    this.d = d1.a((Context)paramActivity, 2130968858, 2131099729);
    this.e = d1.a((Context)paramActivity, 2130968855, 2131099719);
    this.f = d1.b((Context)paramActivity, 2130968686, 2131230858);
    this.g = d1.b((Context)paramActivity, 2130968685, 2131230857);
    this.h = d1.b((Context)paramActivity, 2130968687, 2131230859);
    this.i = d1.b((Context)paramActivity, 2130968688, 2131230860);
    this.j = d1.b((Context)this.l, 2130968700, 2131230906);
    this.k = d1.b((Context)this.l, 2130968701, 2131230909);
  }
  
  public void b(ArrayList<CallLogBean> paramArrayList) {
    if (paramArrayList == null) {
      this.m = new ArrayList<CallLogBean>();
    } else {
      this.m = paramArrayList;
    } 
    notifyDataSetChanged();
  }
  
  public int getCount() {
    return this.m.size();
  }
  
  public Object getItem(int paramInt) {
    return this.m.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (paramView == null) {
      paramView = this.n.inflate(2131492968, paramViewGroup, false);
      b b1 = new b(null);
      this.p = b1;
      b1.a = (TextView)paramView.findViewById(2131297304);
      this.p.b = (TextView)paramView.findViewById(2131298181);
      this.p.f = (TextView)paramView.findViewById(2131298061);
      this.p.c = (TextView)paramView.findViewById(2131298136);
      this.p.d = (TextView)paramView.findViewById(2131297880);
      this.p.e = (RelativeLayout)paramView.findViewById(2131297498);
      this.p.c.setVisibility(8);
      this.p.d.setVisibility(8);
      this.p.e.setVisibility(8);
      this.p.f.setVisibility(8);
      this.p.c.setBackgroundResource(this.j);
      this.p.c.setTextColor(this.d);
      this.p.g = (FrameLayout)paramView.findViewById(2131297469);
      this.p.h = (RelativeLayout)paramView.findViewById(2131297468);
      this.p.i = paramView.findViewById(2131297483);
      this.p.i.setVisibility(8);
      this.p.j = paramView.findViewById(2131297542);
      this.p.j.setVisibility(8);
      this.p.k = (ImageView)paramView.findViewById(2131297423);
      this.p.a.setTypeface(g1.b());
      this.p.b.setTypeface(g1.b());
      this.p.f.setTypeface(g1.b());
      this.p.c.setTypeface(g1.b());
      this.p.d.setTypeface(g1.a());
      paramView.setTag(this.p);
    } else {
      this.p = (b)paramView.getTag();
    } 
    ImageView imageView = this.p.k;
    int i = 2131231148;
    imageView.setImageResource(2131231148);
    this.p.a.setTextColor(this.b);
    this.p.f.setTextColor(this.c);
    this.p.b.setTextColor(this.c);
    CallLogBean callLogBean = this.m.get(paramInt);
    this.p.d.setVisibility(0);
    this.p.e.setVisibility(0);
    this.p.j.setVisibility(0);
    this.p.d.setText(i.c(callLogBean.b()));
    try {
      List<CallLogBean> list = this.m;
      if (list != null && list.size() > 1 && paramInt > 0)
        if (i.c(((CallLogBean)this.m.get(paramInt - 1)).b()).equals(i.c(((CallLogBean)this.m.get(paramInt)).b()))) {
          this.p.d.setVisibility(8);
          this.p.e.setVisibility(8);
          this.p.j.setVisibility(8);
        } else {
          this.p.d.setVisibility(0);
          this.p.e.setVisibility(0);
          this.p.j.setVisibility(0);
        }  
    } catch (Exception exception) {
      this.p.d.setVisibility(8);
      this.p.e.setVisibility(8);
      this.p.j.setVisibility(8);
      exception.printStackTrace();
    } 
    if (paramInt == 0) {
      this.p.d.setVisibility(0);
      this.p.e.setVisibility(0);
      this.p.j.setVisibility(0);
    } 
    try {
      List<CallLogBean> list = this.m;
      if (list != null && list.size() > 1 && paramInt > 0) {
        if (i.c(((CallLogBean)this.m.get(paramInt - 1)).b()).equals(i.c(((CallLogBean)this.m.get(paramInt)).b()))) {
          if (paramInt != this.m.size() - 1) {
            if (i.c(((CallLogBean)this.m.get(paramInt + 1)).b()).equals(i.c(((CallLogBean)this.m.get(paramInt)).b()))) {
              this.p.h.setBackgroundResource(this.h);
            } else {
              this.p.h.setBackgroundResource(this.f);
              this.p.i.setVisibility(0);
            } 
          } else {
            this.p.h.setBackgroundResource(this.f);
            this.p.i.setVisibility(0);
          } 
        } else if (paramInt != this.m.size() - 1) {
          if (i.c(((CallLogBean)this.m.get(paramInt + 1)).b()).equals(i.c(((CallLogBean)this.m.get(paramInt)).b()))) {
            this.p.h.setBackgroundResource(this.i);
          } else {
            this.p.h.setBackgroundResource(this.g);
            this.p.i.setVisibility(0);
          } 
        } else {
          this.p.h.setBackgroundResource(this.g);
          this.p.i.setVisibility(0);
        } 
      } else if (paramInt != this.m.size() - 1) {
        if (i.c(((CallLogBean)this.m.get(paramInt + 1)).b()).equals(i.c(((CallLogBean)this.m.get(paramInt)).b()))) {
          if (paramInt == 0) {
            this.p.h.setBackgroundResource(this.i);
          } else {
            this.p.h.setBackgroundResource(this.i);
          } 
        } else if (paramInt == 0) {
          this.p.h.setBackgroundResource(this.g);
          this.p.i.setVisibility(0);
        } else {
          this.p.h.setBackgroundResource(this.g);
          this.p.i.setVisibility(0);
        } 
      } else {
        this.p.h.setBackgroundResource(this.g);
        this.p.i.setVisibility(0);
      } 
    } catch (Exception exception) {
      this.p.h.setBackgroundResource(this.g);
      this.p.i.setVisibility(0);
      exception.printStackTrace();
    } 
    if (callLogBean.N() != null && !"".equals(callLogBean.N()) && callLogBean.x() != null && !callLogBean.x().equals("")) {
      this.p.f.setVisibility(0);
      TextView textView = this.p.f;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(callLogBean.x());
      stringBuilder.append(" ");
      stringBuilder.append(this.l.getResources().getString(2131755590));
      textView.setText(stringBuilder.toString());
    } else if (callLogBean.n() != null && !"".equals(callLogBean.n())) {
      this.p.f.setText(callLogBean.p());
      this.p.f.setVisibility(0);
    } else if (callLogBean.y() != null && !"".equals(callLogBean.y())) {
      this.p.f.setText(callLogBean.p());
      this.p.f.setVisibility(0);
    } else {
      this.p.f.setText("");
      this.p.f.setVisibility(8);
    } 
    if (!callLogBean.T()) {
      if (callLogBean.N() != null && !"".equals(callLogBean.N()) && callLogBean.x() != null && !"".equals(callLogBean.x())) {
        this.p.c.setVisibility(0);
        this.p.c.setBackgroundResource(this.j);
        this.p.c.setTextColor(this.d);
        this.p.c.setText(callLogBean.N());
      } else if (callLogBean.y() != null && !"".equals(callLogBean.y())) {
        this.p.c.setBackgroundResource(this.k);
        this.p.c.setVisibility(0);
        this.p.c.setTextColor(this.e);
        this.p.c.setText(this.l.getResources().getString(2131755414));
      } else {
        this.p.c.setVisibility(8);
      } 
    } else {
      this.p.c.setVisibility(8);
    } 
    String str = callLogBean.n();
    if (str == null || "".equals(str)) {
      if (callLogBean.y() != null && !"".equals(callLogBean.y())) {
        this.p.a.setText(callLogBean.y());
      } else {
        this.p.a.setText(callLogBean.p());
      } 
    } else {
      this.p.a.setText(str);
    } 
    this.p.b.setText(i.i(callLogBean.b()));
    this.p.g.setOnClickListener(new a(this, paramInt));
    if (callLogBean.T()) {
      u.c(this.l, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, callLogBean.v()), callLogBean.a(), 2131231148, this.p.k);
    } else {
      if (callLogBean.N() != null && !"".equals(callLogBean.N()) && callLogBean.x() != null && !"".equals(callLogBean.x())) {
        this.p.k.setImageResource(2131231149);
        paramInt = 2131231149;
      } else {
        this.p.k.setImageResource(2131231148);
        paramInt = i;
      } 
      if (callLogBean.a() != null && !"".equals(callLogBean.a()))
        u.a(this.l, callLogBean.a(), paramInt, this.p.k); 
    } 
    return paramView;
  }
  
  class a implements View.OnClickListener {
    a(c this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = c.a(this.c).getOnItemClickListener();
      ListView listView = c.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  private static class b {
    TextView a;
    
    TextView b;
    
    TextView c;
    
    TextView d;
    
    RelativeLayout e;
    
    TextView f;
    
    FrameLayout g;
    
    RelativeLayout h;
    
    View i;
    
    View j;
    
    ImageView k;
    
    private b() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */