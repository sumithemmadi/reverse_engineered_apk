package com.allinone.callerid.d.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.callscreen.activitys.CallScreenDiyPdtActivity;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.d.a.e.a;
import com.allinone.callerid.util.x0;
import com.bumptech.glide.load.h;
import com.bumptech.glide.request.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.xutils.common.util.DensityUtil;

public class c extends a<PersonaliseContact> {
  private final e f;
  
  private Context g;
  
  private Activity h;
  
  private boolean i;
  
  private List<PersonaliseContact> j = new ArrayList<PersonaliseContact>();
  
  private b k;
  
  public c(Context paramContext) {
    super(paramContext);
    this.g = paramContext;
    this.h = (Activity)paramContext;
    x0 x0 = new x0(this.g, DensityUtil.dip2px(4.0F));
    x0.c(true, true, true, true);
    this.f = (e)(new e()).l0((h)x0);
  }
  
  public void H(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public void I(b paramb) {
    this.k = paramb;
  }
  
  public int f(int paramInt) {
    return 0;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    paramb0 = paramb0;
    PersonaliseContact personaliseContact = this.d.get(paramInt);
    if (this.i) {
      c.M((c)paramb0).setVisibility(0);
      c.N((c)paramb0).setVisibility(8);
      if (personaliseContact.isselect) {
        c.M((c)paramb0).setChecked(true);
      } else {
        c.M((c)paramb0).setChecked(false);
      } 
      this.j.clear();
    } else {
      personaliseContact.isselect = false;
      c.N((c)paramb0).setVisibility(0);
      c.M((c)paramb0).setVisibility(8);
      if (personaliseContact.isIs_default()) {
        c.N((c)paramb0).setImageResource(2131231082);
      } else {
        c.N((c)paramb0).setImageResource(2131231143);
      } 
    } 
    com.allinone.callerid.main.a.b(this.g).C().W0(personaliseContact.getPath()).h1(false).L0((com.bumptech.glide.request.a)this.f).c1(c.O((c)paramb0).getDrawable()).C0(c.O((c)paramb0));
    c.P((c)paramb0).setOnClickListener(new a(this, personaliseContact, (c)paramb0, paramInt));
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new c(this.e.inflate(2131493056, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(c this$0, PersonaliseContact param1PersonaliseContact, c.c param1c, int param1Int) {}
    
    public void onClick(View param1View) {
      try {
        if (c.C(this.e)) {
          PersonaliseContact personaliseContact = this.b;
          if (!personaliseContact.isselect) {
            personaliseContact.isselect = true;
            c.D(this.e).add(this.b);
            c.c.M(this.c).setChecked(true);
          } else {
            c.D(this.e).remove(this.b);
            this.b.isselect = false;
            c.c.M(this.c).setChecked(false);
          } 
          if (c.E(this.e) != null)
            c.E(this.e).a(param1View, this.d, c.D(this.e)); 
        } else {
          Intent intent = new Intent();
          this(c.F(this.e), CallScreenDiyPdtActivity.class);
          HomeInfo homeInfo = new HomeInfo();
          this();
          homeInfo.setPath(this.b.getPath());
          homeInfo.setName(this.b.getThemtname());
          homeInfo.setIsdefault(this.b.isIs_default());
          homeInfo.setContacts_diy_counts(this.b.getContacts_counts());
          homeInfo.setIsdiy(this.b.isIsdiy());
          intent.putExtra("homeinfo", (Serializable)homeInfo);
          c.F(this.e).startActivity(intent);
          c.G(this.e).overridePendingTransition(2130771968, 2130771969);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  public static interface b {
    void a(View param1View, int param1Int, List<PersonaliseContact> param1List);
  }
  
  private static class c extends RecyclerView.b0 {
    private FrameLayout u;
    
    private ImageView v;
    
    private ImageView w;
    
    private CheckBox x;
    
    c(View param1View) {
      super(param1View);
      this.u = (FrameLayout)param1View.findViewById(2131296936);
      this.v = (ImageView)param1View.findViewById(2131296937);
      this.w = (ImageView)param1View.findViewById(2131297043);
      this.x = (CheckBox)param1View.findViewById(2131296467);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */