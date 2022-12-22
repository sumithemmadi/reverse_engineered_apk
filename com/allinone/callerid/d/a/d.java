package com.allinone.callerid.d.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.d.a.e.a;
import com.allinone.callerid.util.d1;

public class d extends a<HomeInfo> {
  private final int f;
  
  private Context g;
  
  private Activity h;
  
  private b i;
  
  public d(Context paramContext) {
    super(paramContext);
    this.g = paramContext;
    Activity activity = (Activity)paramContext;
    this.h = activity;
    this.f = d1.b((Context)activity, 2130969278, 2131231193);
  }
  
  public void D(b paramb) {
    this.i = paramb;
  }
  
  public int f(int paramInt) {
    return 0;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    c c = (c)paramb0;
    HomeInfo homeInfo = this.d.get(paramInt);
    com.allinone.callerid.main.a.b(this.g).G(homeInfo.getPath()).b1(this.f).C0(c.M(c));
    c.N(c).setOnClickListener(new a(this, homeInfo));
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new c(this.e.inflate(2131493058, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(d this$0, HomeInfo param1HomeInfo) {}
    
    public void onClick(View param1View) {
      try {
        d.C(this.c).a(this.b);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  public static interface b {
    void a(HomeInfo param1HomeInfo);
  }
  
  private static class c extends RecyclerView.b0 {
    private FrameLayout u;
    
    private ImageView v;
    
    c(View param1View) {
      super(param1View);
      this.u = (FrameLayout)param1View.findViewById(2131296936);
      this.v = (ImageView)param1View.findViewById(2131296937);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */