package com.allinone.callerid.d.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.d.a.e.a;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.x0;
import com.bumptech.glide.load.h;
import org.xutils.common.util.DensityUtil;

public class b extends a<HomeInfo> {
  private final com.bumptech.glide.request.e f;
  
  private final int g;
  
  private Context h;
  
  private Activity i;
  
  public boolean j = false;
  
  private e k;
  
  private f l;
  
  public b(Context paramContext) {
    super(paramContext);
    this.h = paramContext;
    this.i = (Activity)paramContext;
    x0 x0 = new x0(this.h, DensityUtil.dip2px(4.0F));
    x0.c(true, true, true, true);
    this.f = (com.bumptech.glide.request.e)(new com.bumptech.glide.request.e()).l0((h)x0);
    this.g = d1.b(this.h, 2130969278, 2131231193);
  }
  
  public void E(e parame) {
    this.k = parame;
  }
  
  public void F(f paramf) {
    this.l = paramf;
  }
  
  public int f(int paramInt) {
    return (paramInt == 1) ? 666 : 0;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    HomeInfo homeInfo;
    int i = f(paramInt);
    if (i != 0) {
      if (i == 666) {
        c c = (c)paramb0;
        homeInfo = this.d.get(paramInt);
        if (homeInfo.isDefautl_diy()) {
          c.M(c).setVisibility(0);
          c.N(c).setVisibility(8);
          c.O(c).setVisibility(8);
          com.allinone.callerid.main.a.b(this.h).C().W0(homeInfo.getPath()).h1(false).L0((com.bumptech.glide.request.a)this.f).b1(2131230991).C0(c.P(c));
        } else {
          com.allinone.callerid.main.a.b(this.h).C().U0(Integer.valueOf(2131230991)).h1(true).L0((com.bumptech.glide.request.a)this.f).b1(2131230991).C0(c.P(c));
          c.M(c).setVisibility(8);
          c.N(c).setVisibility(0);
          c.O(c).setVisibility(0);
        } 
        c.Q(c).setOnClickListener(new a(this, homeInfo));
      } 
    } else {
      d d = (d)homeInfo;
      HomeInfo homeInfo1 = this.d.get(paramInt);
      if (this.j) {
        if (homeInfo1.getGifimg_url() != null && !"".equals(homeInfo1.getGifimg_url()))
          com.allinone.callerid.main.a.b(this.h).B(pl.droidsonroids.gif.c.class).W0(homeInfo1.getGifimg_url()).b1(this.g).C0(d.v); 
      } else {
        com.allinone.callerid.main.a.b(this.h).C().W0(homeInfo1.getJpgimg_url()).h1(false).L0((com.bumptech.glide.request.a)this.f).b1(this.g).C0(d.v);
      } 
      d.A.setText(homeInfo1.getName());
      d.z.setText(String.valueOf(homeInfo1.getLike_count()));
      if (homeInfo1.isIsselect()) {
        d.w.setVisibility(0);
      } else {
        d.w.setVisibility(8);
      } 
      if (homeInfo1.isIslike()) {
        d.x.setImageResource(2131231098);
      } else {
        d.x.setImageResource(2131231099);
      } 
      if (homeInfo1.isDownloaded()) {
        d.y.setVisibility(8);
      } else if (homeInfo1.isUnLock()) {
        d.y.setVisibility(8);
      } else {
        d.y.setVisibility(0);
      } 
      d.u.setOnClickListener(new b(this, homeInfo1));
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return (RecyclerView.b0)((paramInt == 666) ? new c(this.e.inflate(2131493053, paramViewGroup, false)) : new d(this.e.inflate(2131493055, paramViewGroup, false)));
  }
  
  class a implements View.OnClickListener {
    a(b this$0, HomeInfo param1HomeInfo) {}
    
    public void onClick(View param1View) {
      b.C(this.c).a(this.b);
    }
  }
  
  class b implements View.OnClickListener {
    b(b this$0, HomeInfo param1HomeInfo) {}
    
    public void onClick(View param1View) {
      b.D(this.c).a(this.b);
    }
  }
  
  private static class c extends RecyclerView.b0 {
    private FrameLayout u;
    
    private ImageView v;
    
    private ImageView w;
    
    private TextView x;
    
    private ImageView y;
    
    c(View param1View) {
      super(param1View);
      Typeface typeface = g1.b();
      this.u = (FrameLayout)param1View.findViewById(2131296936);
      this.v = (ImageView)param1View.findViewById(2131296937);
      this.w = (ImageView)param1View.findViewById(2131296982);
      this.x = (TextView)param1View.findViewById(2131297894);
      this.y = (ImageView)param1View.findViewById(2131297043);
      this.x.setTypeface(typeface);
    }
  }
  
  private static class d extends RecyclerView.b0 {
    TextView A;
    
    FrameLayout u;
    
    ImageView v;
    
    ImageView w;
    
    ImageView x;
    
    ImageView y;
    
    TextView z;
    
    d(View param1View) {
      super(param1View);
      Typeface typeface = g1.b();
      this.u = (FrameLayout)param1View.findViewById(2131296936);
      this.v = (ImageView)param1View.findViewById(2131296937);
      this.w = (ImageView)param1View.findViewById(2131297043);
      this.x = (ImageView)param1View.findViewById(2131296989);
      this.y = (ImageView)param1View.findViewById(2131297010);
      this.z = (TextView)param1View.findViewById(2131297904);
      this.A = (TextView)param1View.findViewById(2131297984);
      this.z.setTypeface(typeface);
      this.A.setTypeface(typeface);
    }
  }
  
  public static interface e {
    void a(HomeInfo param1HomeInfo);
  }
  
  public static interface f {
    void a(HomeInfo param1HomeInfo);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */