package com.allinone.callerid.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.gg.f;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.u;

public class d extends Dialog {
  private FrameLayout b;
  
  private Context c;
  
  public d(Context paramContext, int paramInt) {
    super(paramContext, paramInt);
    this.c = paramContext;
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131493080);
    ImageView imageView = (ImageView)findViewById(2131296485);
    this.b = (FrameLayout)findViewById(2131296753);
    ((TextView)findViewById(2131297755)).setTypeface(g1.b());
    imageView.setOnClickListener(new a(this));
  }
  
  public void show() {
    super.show();
    if ((f.a()).b != null) {
      UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)getLayoutInflater().inflate(2131492864, null);
      com.allinone.callerid.util.gg.d.a((f.a()).b, unifiedNativeAdView);
      this.b.removeAllViews();
      this.b.addView((View)unifiedNativeAdView);
      this.b.setVisibility(0);
    } else {
      com.google.android.gms.ads.d.a a = new com.google.android.gms.ads.d.a(this.c, "ca-app-pub-5825926894918682/4484122459");
      a.e(new b(this));
      u u = (new u.a()).b(true).a();
      a.g((new com.google.android.gms.ads.formats.b.a()).h(u).a());
      a.f(new c(this)).a().b((new e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
    } 
  }
  
  class a implements View.OnClickListener {
    a(d this$0) {}
    
    public void onClick(View param1View) {
      this.b.dismiss();
    }
  }
  
  class b implements g.a {
    b(d this$0) {}
    
    public void r(g param1g) {
      UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)this.b.getLayoutInflater().inflate(2131492864, null);
      com.allinone.callerid.util.gg.d.a(param1g, unifiedNativeAdView);
      d.a(this.b).removeAllViews();
      d.a(this.b).addView((View)unifiedNativeAdView);
      d.a(this.b).setVisibility(0);
    }
  }
  
  class c extends com.google.android.gms.ads.b {
    c(d this$0) {}
    
    public void D(int param1Int) {
      super.D(param1Int);
      this.a.dismiss();
    }
    
    public void K() {
      super.K();
      this.a.dismiss();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */