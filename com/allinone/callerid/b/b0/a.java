package com.allinone.callerid.b.b0;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.u;
import java.util.ArrayList;
import java.util.List;

public class a extends BaseAdapter {
  private Activity b;
  
  private List<CallLogBean> c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private c h;
  
  public a(Activity paramActivity) {
    this.b = paramActivity;
    this.c = new ArrayList<CallLogBean>();
    this.d = d1.b((Context)this.b, 2130968686, 2131230858);
    this.e = d1.b((Context)this.b, 2130968685, 2131230857);
    this.f = d1.b((Context)this.b, 2130968687, 2131230859);
    this.g = d1.b((Context)this.b, 2130968688, 2131230860);
  }
  
  public void b(List<CallLogBean> paramList) {
    if (paramList != null) {
      this.c.clear();
      this.c.addAll(paramList);
    } 
  }
  
  public void c(c paramc) {
    this.h = paramc;
  }
  
  public int getCount() {
    return this.c.size();
  }
  
  public Object getItem(int paramInt) {
    return this.c.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    b b;
    if (paramView == null) {
      paramView = LayoutInflater.from((Context)this.b).inflate(2131493057, paramViewGroup, false);
      b = new b(null);
      b.b = (TextView)paramView.findViewById(2131297305);
      b.a = (TextView)paramView.findViewById(2131298187);
      TextView textView = (TextView)paramView.findViewById(2131297332);
      b.c = textView;
      textView.setVisibility(0);
      b.b.setTypeface(g1.b());
      b.a.setTypeface(g1.b());
      b.c.setTypeface(g1.b());
      b.d = (ImageView)paramView.findViewById(2131297361);
      b.e = (FrameLayout)paramView.findViewById(2131297469);
      b.f = (LinearLayout)paramView.findViewById(2131297159);
      paramView.setTag(b);
    } else {
      b = (b)paramView.getTag();
    } 
    try {
      ImageView imageView = b.d;
      int i = 2131231148;
      imageView.setImageResource(2131231148);
      if (paramInt == 0) {
        b.a.setVisibility(0);
        List<CallLogBean> list = this.c;
        if (list != null && list.size() == 1) {
          b.f.setBackgroundResource(this.e);
        } else {
          b.f.setBackgroundResource(this.g);
        } 
      } else {
        b.a.setVisibility(8);
        List<CallLogBean> list = this.c;
        if (list != null && list.size() > 0 && paramInt == this.c.size() - 1) {
          b.f.setBackgroundResource(this.d);
        } else {
          b.f.setBackgroundResource(this.f);
        } 
      } 
      CallLogBean callLogBean = this.c.get(paramInt);
      String str = callLogBean.d();
      if (str != null && !"".equals(callLogBean.d())) {
        b.c.setText(callLogBean.d());
      } else if (callLogBean.i() != null && !"".equals(callLogBean.i())) {
        b.c.setText(callLogBean.i());
      } else {
        b.c.setText(callLogBean.p());
      } 
      if (callLogBean.n() != null && !"".equals(callLogBean.n())) {
        b.b.setText(callLogBean.n());
        b.c.setVisibility(0);
      } else if (callLogBean.y() != null && !"".equals(callLogBean.y())) {
        b.b.setText(callLogBean.y());
        b.c.setVisibility(0);
      } else if (callLogBean.N() != null && !"".equals(callLogBean.N())) {
        b.b.setText(callLogBean.N());
        b.c.setVisibility(0);
      } else {
        b.b.setText(callLogBean.p());
        b.c.setVisibility(8);
      } 
      if (callLogBean.T()) {
        u.c(this.b, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, callLogBean.v()), callLogBean.a(), 2131231148, b.d);
      } else {
        paramInt = i;
        if (callLogBean.N() != null) {
          paramInt = i;
          if (!"".equals(callLogBean.N())) {
            paramInt = 2131231149;
            b.d.setImageResource(2131231149);
          } 
        } 
        if (callLogBean.a() != null && !"".equals(callLogBean.a()))
          u.a(this.b, callLogBean.a(), paramInt, b.d); 
      } 
      FrameLayout frameLayout = b.e;
      a a1 = new a();
      this(this, callLogBean);
      frameLayout.setOnClickListener(a1);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return paramView;
  }
  
  class a implements View.OnClickListener {
    a(a this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      if (a.a(this.c) != null)
        a.a(this.c).a(this.b.p()); 
    }
  }
  
  private static class b {
    TextView a;
    
    TextView b;
    
    TextView c;
    
    ImageView d;
    
    FrameLayout e;
    
    LinearLayout f;
    
    private b() {}
  }
  
  public static interface c {
    void a(String param1String);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/b0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */