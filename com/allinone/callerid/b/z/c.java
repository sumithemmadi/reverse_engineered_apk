package com.allinone.callerid.b.z;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.mvc.controller.recorder.RecordListActivity;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.j;
import com.allinone.callerid.util.recorder.f;
import java.util.ArrayList;

public class c extends b<RecordCall> {
  private Typeface f;
  
  private Context g;
  
  private Activity h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  public c(Context paramContext, ArrayList<RecordCall> paramArrayList) {
    super(paramContext, paramArrayList);
    this.g = paramContext;
    this.f = g1.b();
    this.i = j.a(this.g, 8.0F);
    this.h = (Activity)paramContext;
    this.j = d1.b(this.g, 2130968686, 2131230858);
    this.k = d1.b(this.g, 2130968685, 2131230857);
    this.l = d1.b(this.g, 2130968687, 2131230859);
    this.m = d1.b(this.g, 2130968688, 2131230860);
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    b b1 = (b)paramb0;
    if (b1 != null) {
      RecordCall recordCall = (RecordCall)this.d.get(paramInt);
      if (this.d.size() == 1) {
        LinearLayout linearLayout = b.M(b1);
        int i = this.i;
        f.r((View)linearLayout, i, i, i, i);
        b.M(b1).setBackgroundResource(this.k);
      } else if (paramInt == 0) {
        LinearLayout linearLayout = b.M(b1);
        int i = this.i;
        f.r((View)linearLayout, i, i, i, 0);
        b.M(b1).setBackgroundResource(this.m);
      } else if (paramInt == this.d.size() - 1) {
        LinearLayout linearLayout = b.M(b1);
        int i = this.i;
        f.r((View)linearLayout, i, 0, i, i);
        b.M(b1).setBackgroundResource(this.j);
      } else {
        LinearLayout linearLayout = b.M(b1);
        int i = this.i;
        f.r((View)linearLayout, i, 0, i, 0);
        b.M(b1).setBackgroundResource(this.l);
      } 
      if (paramInt == 0) {
        b.N(b1).setVisibility(0);
      } else {
        b.N(b1).setVisibility(8);
      } 
      b.O(b1).setText(recordCall.getShowName());
      TextView textView = b.P(b1);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("(");
      stringBuilder.append(recordCall.getRecordcount());
      stringBuilder.append(")");
      textView.setText(stringBuilder.toString());
      b.Q(b1).setOnClickListener(new a(this, recordCall));
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new b(this, this.e.inflate(2131492983, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(c this$0, RecordCall param1RecordCall) {}
    
    public void onClick(View param1View) {
      Intent intent = new Intent(c.D(this.c), RecordListActivity.class);
      intent.putExtra("recordnumber", this.b.getNumber());
      intent.putExtra("recordname", this.b.getName());
      intent.addFlags(268435456);
      c.D(this.c).startActivity(intent);
      c.E(this.c).overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  private class b extends RecyclerView.b0 {
    private LinearLayout u;
    
    private RelativeLayout v;
    
    private TextView w;
    
    private FrameLayout x;
    
    private TextView y;
    
    private TextView z;
    
    b(c this$0, View param1View) {
      super(param1View);
      this.u = (LinearLayout)param1View.findViewById(2131296491);
      this.v = (RelativeLayout)param1View.findViewById(2131296490);
      this.w = (TextView)param1View.findViewById(2131296495);
      this.x = (FrameLayout)param1View.findViewById(2131296492);
      this.y = (TextView)param1View.findViewById(2131296494);
      this.z = (TextView)param1View.findViewById(2131297671);
      this.w.setTypeface(c.F(this$0));
      this.y.setTypeface(c.F(this$0));
      this.z.setTypeface(c.F(this$0));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/z/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */