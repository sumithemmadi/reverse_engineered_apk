package com.allinone.callerid.b.a0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.b.z.b;
import com.allinone.callerid.bean.NoDisturbBean;
import com.allinone.callerid.i.a.k.e.c;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;

public class b extends b<NoDisturbBean> {
  private Context f;
  
  public b(Context paramContext) {
    super(paramContext);
    this.f = paramContext;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    b b1 = (b)paramb0;
    if (b1 != null) {
      NoDisturbBean noDisturbBean = this.d.get(paramInt);
      String str2 = noDisturbBean.getName();
      String str1 = noDisturbBean.getNumber();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("telphone: ");
        stringBuilder.append(str1);
        d0.a("wbb", stringBuilder.toString());
      } 
      if (str2 != null && !"".equals(str2)) {
        b.M(b1).setText(str2);
        if (str1 != null)
          b.N(b1).setText(str1); 
        b.N(b1).setVisibility(0);
      } else if (str1 != null) {
        b.M(b1).setText(str1);
        b.N(b1).setVisibility(8);
      } 
      b.O(b1).setOnClickListener(new a(this, paramInt, noDisturbBean));
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new b(this.e.inflate(2131493049, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(b this$0, int param1Int, NoDisturbBean param1NoDisturbBean) {}
    
    public void onClick(View param1View) {
      try {
        b.D(this.d).remove(this.b);
        this.d.n(this.b);
        b b1 = this.d;
        b1.k(0, b.E(b1).size());
        String str = this.c.getNumber();
        a a1 = new a();
        this(this);
        c.b(str, a1);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements com.allinone.callerid.i.a.k.e.b {
      a(b.a this$0) {}
      
      public void a(boolean param2Boolean) {
        if (b.F(this.a.d) != null && b.G(this.a.d).size() <= 1)
          b.p.a.a.b(b.H(this.a.d)).d(new Intent("com.allinone.callerid.WHITE_DATE_UPDATA")); 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.k.e.b {
    a(b this$0) {}
    
    public void a(boolean param1Boolean) {
      if (b.F(this.a.d) != null && b.G(this.a.d).size() <= 1)
        b.p.a.a.b(b.H(this.a.d)).d(new Intent("com.allinone.callerid.WHITE_DATE_UPDATA")); 
    }
  }
  
  private static class b extends RecyclerView.b0 {
    private FrameLayout u;
    
    private TextView v;
    
    private TextView w;
    
    private ImageView x;
    
    b(View param1View) {
      super(param1View);
      Typeface typeface = g1.b();
      this.u = (FrameLayout)param1View.findViewById(2131296930);
      this.v = (TextView)param1View.findViewById(2131296932);
      this.w = (TextView)param1View.findViewById(2131296931);
      this.x = (ImageView)param1View.findViewById(2131296929);
      this.v.setTypeface(typeface);
      this.w.setTypeface(typeface);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/a0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */