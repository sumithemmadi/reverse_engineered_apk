package com.allinone.callerid.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.main.BaseThemeActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.gg.d;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;

public class DialogMissed extends BaseThemeActivity {
  private final String s = "DialogMissed";
  
  private FrameLayout t;
  
  private void N() {
    if ((com.allinone.callerid.util.gg.a.a()).b != null) {
      try {
        b1.J1(System.currentTimeMillis());
        UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)LayoutInflater.from((Context)this).inflate(2131492866, null);
        d.a((com.allinone.callerid.util.gg.a.a()).b, unifiedNativeAdView);
        this.t.removeAllViews();
        this.t.addView((View)unifiedNativeAdView);
        this.t.setVisibility(0);
        (com.allinone.callerid.util.gg.a.a()).b = null;
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } else {
      finish();
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      setContentView(2131493002);
      ((TextView)findViewById(2131297755)).setTypeface(g1.b());
      ImageView imageView = (ImageView)findViewById(2131296485);
      this.t = (FrameLayout)findViewById(2131296753);
      a a = new a();
      this(this);
      imageView.setOnClickListener(a);
      N();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    N();
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements View.OnClickListener {
    a(DialogMissed this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/DialogMissed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */