package com.allinone.callerid.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.bean.SpamCall;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import java.util.ArrayList;
import java.util.List;

public class w extends BaseAdapter {
  private Context b;
  
  private List<SpamCall> c;
  
  private LayoutInflater d;
  
  w(Context paramContext) {
    this.b = paramContext;
    this.c = new ArrayList<SpamCall>();
    this.d = LayoutInflater.from(paramContext);
  }
  
  void b(List<SpamCall> paramList, boolean paramBoolean) {
    if (paramBoolean)
      this.c.clear(); 
    this.c.addAll(paramList);
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
    c c;
    if (paramView == null) {
      paramView = this.d.inflate(2131493059, paramViewGroup, false);
      c = new c();
      c.c = (TextView)paramView.findViewById(2131298022);
      c.a = (TextView)paramView.findViewById(2131298199);
      c.b = (TextView)paramView.findViewById(2131297753);
      c.e = (TextView)paramView.findViewById(2131297875);
      c.d = (TextView)paramView.findViewById(2131298200);
      c.f = (ImageView)paramView.findViewById(2131296451);
      c.g = (FrameLayout)paramView.findViewById(2131297469);
      c.h = (CheckBox)paramView.findViewById(2131296458);
      c.c.setTypeface(g1.b());
      c.a.setTypeface(g1.b());
      c.b.setTypeface(g1.b());
      c.e.setTypeface(g1.b());
      c.d.setTypeface(g1.b());
      paramView.setTag(c);
    } else {
      c = (c)paramView.getTag();
    } 
    SpamCall spamCall = this.c.get(paramInt);
    if (spamCall.getFormat_tel_number() != null && !"".equals(spamCall.getFormat_tel_number())) {
      c.c.setText(spamCall.getFormat_tel_number());
    } else if (spamCall.getNumber() != null && !"".equals(spamCall.getNumber())) {
      c.c.setText(spamCall.getNumber());
    } 
    if (spamCall.getType() != null && ("Mobile".equals(spamCall.getType()) || "Fixed line".equals(spamCall.getType()))) {
      c.a.setText(i1.J(this.b, spamCall.getType()));
      c.a.setVisibility(0);
    } else {
      c.a.setText("");
      c.a.setVisibility(8);
    } 
    if (spamCall.getDate() != null && !"".equals(spamCall.getDate()))
      c.b.setText(spamCall.getDate()); 
    if (spamCall.getReportcounts() != null && !"".equals(spamCall.getReportcounts()))
      c.e.setText(spamCall.getReportcounts()); 
    if (spamCall.getTypelabel() != null && !"".equals(spamCall.getTypelabel())) {
      TextView textView = c.d;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(i1.D(this.b, spamCall.getTypelabel()));
      stringBuilder.append(" ");
      stringBuilder.append(this.b.getResources().getString(2131755656));
      textView.setText(stringBuilder.toString());
    } 
    if (spamCall.isSelected()) {
      c.h.setChecked(true);
    } else {
      c.h.setChecked(false);
    } 
    paramInt = spamCall.getCalltype();
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 5) {
            if (paramInt != 9) {
              c.f.setImageResource(2131231080);
            } else {
              c.f.setImageResource(2131231080);
            } 
          } else {
            c.f.setImageResource(2131231080);
          } 
        } else {
          c.f.setImageResource(2131231080);
        } 
      } else {
        c.f.setImageResource(2131231081);
      } 
    } else {
      c.f.setImageResource(2131231079);
    } 
    c.h.setOnCheckedChangeListener(new a(this, spamCall));
    CallLogBean callLogBean = new CallLogBean();
    callLogBean.D0(spamCall.getNumber());
    callLogBean.d1(i1.D(this.b, spamCall.getTypelabel()));
    callLogBean.e1(spamCall.getTypelabel());
    callLogBean.K0(spamCall.getReportcounts());
    callLogBean.e0(spamCall.getBelong_area());
    callLogBean.L0(spamCall.getName());
    callLogBean.N0(spamCall.getType());
    callLogBean.F0(spamCall.getNumber());
    callLogBean.Z0(spamCall.getTel_number());
    callLogBean.w0(spamCall.getFormat_tel_number());
    callLogBean.G0(spamCall.getOperator());
    callLogBean.a0(spamCall.getAddress());
    callLogBean.b0(spamCall.getAvatar());
    callLogBean.n0(spamCall.getComment_tags());
    callLogBean.q0(spamCall.getCountry());
    c.g.setOnClickListener(new b(this, callLogBean));
    return paramView;
  }
  
  class a implements CompoundButton.OnCheckedChangeListener {
    a(w this$0, SpamCall param1SpamCall) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      this.a.setSelected(param1Boolean);
    }
  }
  
  class b implements View.OnClickListener {
    b(w this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      Intent intent = new Intent();
      Bundle bundle = new Bundle();
      bundle.putParcelable("contact_tony", (Parcelable)this.b);
      intent.putExtras(bundle);
      intent.setClass(w.a(this.c), UnknownContactActivity.class);
      intent.setFlags(268435456);
      w.a(this.c).startActivity(intent);
    }
  }
  
  static class c {
    TextView a;
    
    TextView b;
    
    TextView c;
    
    TextView d;
    
    TextView e;
    
    ImageView f;
    
    FrameLayout g;
    
    CheckBox h;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */