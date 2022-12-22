package com.allinone.callerid.b;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;
import java.util.List;

public class v extends BaseAdapter {
  private Context b;
  
  a c;
  
  private List<SubscriptionInfo> d = new ArrayList<SubscriptionInfo>();
  
  private LayoutInflater e;
  
  public v(Context paramContext, List<SubscriptionInfo> paramList) {
    this.b = paramContext;
    this.d = paramList;
    this.e = LayoutInflater.from(paramContext);
  }
  
  public int getCount() {
    return this.d.size();
  }
  
  public Object getItem(int paramInt) {
    return this.d.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (paramView == null) {
      paramView = this.e.inflate(2131493048, paramViewGroup, false);
      a a1 = new a();
      this.c = a1;
      a1.a = (ImageView)paramView.findViewById(2131298130);
      this.c.b = (TextView)paramView.findViewById(2131298131);
      this.c.c = (TextView)paramView.findViewById(2131297844);
      this.c.b.setTypeface(g1.b());
      this.c.c.setTypeface(g1.b());
      paramView.setTag(this.c);
    } else {
      this.c = (a)paramView.getTag();
    } 
    if (paramInt == 0) {
      this.c.a.setImageResource(2131231170);
    } else {
      this.c.a.setImageResource(2131231171);
    } 
    TextView textView = this.c.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b.getResources().getString(2131755744));
    stringBuilder.append(" ");
    stringBuilder.append(paramInt + 1);
    textView.setText(stringBuilder.toString());
    ((SubscriptionInfo)this.d.get(paramInt)).getNumber();
    SubscriptionInfo subscriptionInfo = this.d.get(paramInt);
    if (subscriptionInfo != null && subscriptionInfo.getCarrierName() != null && !"".equals(subscriptionInfo.getCarrierName())) {
      this.c.c.setText(((SubscriptionInfo)this.d.get(paramInt)).getCarrierName());
      this.c.c.setVisibility(0);
    } else {
      this.c.c.setVisibility(8);
    } 
    return paramView;
  }
  
  public static class a {
    ImageView a;
    
    TextView b;
    
    TextView c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */