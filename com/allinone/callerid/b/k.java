package com.allinone.callerid.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.allinone.callerid.model.EZCountryCode;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;
import java.util.List;

public class k extends BaseAdapter {
  private Context b;
  
  private List<EZCountryCode> c = new ArrayList<EZCountryCode>();
  
  b d;
  
  private ListView e;
  
  public k(Context paramContext, List<EZCountryCode> paramList, ListView paramListView) {
    this.b = paramContext;
    this.c = paramList;
    this.e = paramListView;
  }
  
  public void b(List<EZCountryCode> paramList) {
    List<EZCountryCode> list = this.c;
    if (list != null) {
      list.clear();
      this.c.addAll(paramList);
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
      paramView = View.inflate(this.b, 2131492971, null);
      b b1 = new b(null);
      this.d = b1;
      b1.a = (TextView)paramView.findViewById(2131296515);
      this.d.b = (TextView)paramView.findViewById(2131296486);
      this.d.a.setTypeface(g1.b());
      this.d.b.setTypeface(g1.b());
      this.d.c = (FrameLayout)paramView.findViewById(2131297469);
      paramView.setTag(this.d);
    } else {
      this.d = (b)paramView.getTag();
    } 
    this.d.c.setTag(Integer.valueOf(paramInt));
    this.d.c.setOnClickListener(new a(this));
    EZCountryCode eZCountryCode = this.c.get(paramInt);
    this.d.a.setText(eZCountryCode.getCountry_name());
    TextView textView = this.d.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("(+");
    stringBuilder.append(eZCountryCode.getCountry_code());
    stringBuilder.append(")");
    textView.setText(stringBuilder.toString());
    return paramView;
  }
  
  class a implements View.OnClickListener {
    a(k this$0) {}
    
    public void onClick(View param1View) {
      int i = ((Integer)param1View.getTag()).intValue();
      k.a(this.b).performItemClick((View)k.a(this.b), i, this.b.getItemId(i));
    }
  }
  
  private static class b {
    TextView a;
    
    TextView b;
    
    FrameLayout c;
    
    private b() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */