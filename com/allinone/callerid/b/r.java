package com.allinone.callerid.b;

import android.content.Context;
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
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class r extends BaseAdapter {
  private Context b;
  
  private List<CallLogBean> c;
  
  private LayoutInflater d;
  
  private ListView e;
  
  b f;
  
  public HashMap g = new HashMap<Object, Object>();
  
  public r(Context paramContext, List<CallLogBean> paramList, ListView paramListView) {
    this.b = paramContext;
    this.c = paramList;
    this.d = LayoutInflater.from(paramContext);
    this.e = paramListView;
  }
  
  public void b(ArrayList<CallLogBean> paramArrayList) {
    if (paramArrayList == null) {
      this.c = new ArrayList<CallLogBean>();
    } else {
      this.c = paramArrayList;
    } 
    notifyDataSetChanged();
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
    if (paramView == null) {
      paramView = this.d.inflate(2131493126, paramViewGroup, false);
      b b1 = new b(null);
      this.f = b1;
      b1.a = (TextView)paramView.findViewById(2131297304);
      this.f.d = (TextView)paramView.findViewById(2131298065);
      this.f.c = (TextView)paramView.findViewById(2131298064);
      this.f.b = (TextView)paramView.findViewById(2131298181);
      this.f.e = (FrameLayout)paramView.findViewById(2131297469);
      this.f.f = (RelativeLayout)paramView.findViewById(2131297468);
      this.f.g = paramView.findViewById(2131297483);
      this.f.g.setVisibility(8);
      this.f.h = paramView.findViewById(2131297542);
      this.f.h.setVisibility(8);
      this.f.i = (ImageView)paramView.findViewById(2131297423);
      this.f.a.setTypeface(g1.b());
      this.f.b.setTypeface(g1.b());
      this.f.c.setTypeface(g1.b());
      this.f.d.setTypeface(g1.b());
      paramView.setTag(this.f);
    } else {
      this.f = (b)paramView.getTag();
    } 
    ImageView imageView = this.f.i;
    int i = 2131231148;
    imageView.setImageResource(2131231148);
    CallLogBean callLogBean = this.c.get(paramInt);
    if (paramInt == 0) {
      this.f.h.setVisibility(0);
    } else {
      this.f.h.setVisibility(8);
    } 
    if (callLogBean.K() != null && !"".equals(callLogBean.K())) {
      String str = callLogBean.K();
      str.hashCode();
      byte b1 = -1;
      switch (str.hashCode()) {
        case 2082229566:
          if (!str.equals("is_spam"))
            break; 
          b1 = 2;
          break;
        case 2082217073:
          if (!str.equals("is_scam"))
            break; 
          b1 = 1;
          break;
        case -906718361:
          if (!str.equals("is_telemarketing"))
            break; 
          b1 = 0;
          break;
      } 
      switch (b1) {
        case 2:
          this.f.c.setText(this.b.getResources().getString(2131755747));
          break;
        case 1:
          this.f.c.setText(this.b.getResources().getString(2131755683));
          break;
        case 0:
          this.f.c.setText(this.b.getResources().getString(2131755776));
          break;
      } 
    } 
    try {
      if (this.c.size() > 0)
        if (this.c.size() == 1) {
          this.f.g.setVisibility(0);
        } else if (paramInt != 0 && paramInt == this.c.size() - 1) {
          this.f.g.setVisibility(0);
        }  
    } catch (Exception exception) {
      this.f.g.setVisibility(0);
      exception.printStackTrace();
    } 
    this.f.a.setText(callLogBean.p());
    this.f.b.setText(i.j(callLogBean.b()));
    this.f.e.setOnClickListener(new a(this, paramInt));
    if (callLogBean.N() != null && !"".equals(callLogBean.N()) && callLogBean.x() != null && !"".equals(callLogBean.x())) {
      this.f.i.setImageResource(2131231149);
      paramInt = 2131231149;
    } else {
      this.f.i.setImageResource(2131231148);
      paramInt = i;
    } 
    if (callLogBean.a() != null && !"".equals(callLogBean.a()))
      u.b(this.b, callLogBean.a(), paramInt, this.f.i); 
    return paramView;
  }
  
  class a implements View.OnClickListener {
    a(r this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = r.a(this.c).getOnItemClickListener();
      ListView listView = r.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  private static class b {
    TextView a;
    
    TextView b;
    
    TextView c;
    
    TextView d;
    
    FrameLayout e;
    
    RelativeLayout f;
    
    View g;
    
    View h;
    
    ImageView i;
    
    private b() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */