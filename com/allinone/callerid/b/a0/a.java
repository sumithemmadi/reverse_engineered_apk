package com.allinone.callerid.b.a0;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.b.z.b;
import com.allinone.callerid.bean.WeekInfo;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;

public class a extends b<WeekInfo> {
  private RecyclerView f;
  
  public a(Context paramContext, RecyclerView paramRecyclerView) {
    super(paramContext);
    this.f = paramRecyclerView;
  }
  
  private boolean P() {
    if (this.d != null) {
      byte b1 = 0;
      try {
        while (b1 < this.d.size()) {
          WeekInfo weekInfo = this.d.get(b1);
          if (weekInfo.getWeekId() != -1) {
            boolean bool = weekInfo.isSelect();
            if (!bool)
              return false; 
          } 
          b1++;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
    return true;
  }
  
  private void Q(boolean paramBoolean) {
    if (this.d != null) {
      byte b1 = 0;
      try {
        while (b1 < this.d.size()) {
          ((WeekInfo)this.d.get(b1)).setSelect(paramBoolean);
          b b2 = (b)this.f.Y(b1);
          if (b2 != null)
            b.N(b2).setChecked(paramBoolean); 
          b1++;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  public boolean O() {
    if (this.d != null) {
      byte b1 = 0;
      try {
        while (b1 < this.d.size()) {
          WeekInfo weekInfo = this.d.get(b1);
          if (weekInfo.getWeekId() != -1) {
            boolean bool = weekInfo.isSelect();
            if (bool)
              return false; 
          } 
          b1++;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
    return true;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    paramb0 = paramb0;
    WeekInfo weekInfo = this.d.get(paramInt);
    if (weekInfo != null) {
      b.M((b)paramb0).setText(weekInfo.getWeek());
      b.O((b)paramb0).setOnClickListener(new a(this, weekInfo, (b)paramb0));
      b.N((b)paramb0).setChecked(weekInfo.isSelect());
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new b(this.e.inflate(2131493052, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(a this$0, WeekInfo param1WeekInfo, a.b param1b) {}
    
    public void onClick(View param1View) {
      try {
        if (this.b.getWeekId() == -1) {
          if (a.b.N(this.c).isChecked()) {
            a.G(this.d, false);
          } else {
            a.G(this.d, true);
          } 
        } else if (a.b.N(this.c).isChecked()) {
          a.b.N(this.c).setChecked(false);
          this.b.setSelect(false);
          if (a.H(this.d).size() > 0) {
            ((WeekInfo)a.J(this.d).get(a.I(this.d).size() - 1)).setSelect(false);
            a.b b1 = (a.b)a.L(this.d).Y(a.K(this.d).size() - 1);
            if (b1 != null)
              a.b.N(b1).setChecked(false); 
          } 
        } else {
          a.b.N(this.c).setChecked(true);
          this.b.setSelect(true);
          if (a.M(this.d) && a.N(this.d).size() > 0) {
            ((WeekInfo)a.E(this.d).get(a.D(this.d).size() - 1)).setSelect(true);
            a.b b1 = (a.b)a.L(this.d).Y(a.F(this.d).size() - 1);
            if (b1 != null)
              a.b.N(b1).setChecked(true); 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  private static class b extends RecyclerView.b0 {
    private LinearLayout u;
    
    private TextView v;
    
    private CheckBox w;
    
    b(View param1View) {
      super(param1View);
      Typeface typeface = g1.b();
      this.u = (LinearLayout)param1View.findViewById(2131296934);
      this.v = (TextView)param1View.findViewById(2131296935);
      CheckBox checkBox = (CheckBox)param1View.findViewById(2131296933);
      this.w = checkBox;
      checkBox.setClickable(false);
      this.v.setTypeface(typeface);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/a0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */