package com.allinone.callerid.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.allinone.callerid.i.a.s.a;
import com.allinone.callerid.inapputil.GoogleBillingUtil;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j;
import com.allinone.callerid.util.q;
import java.util.Date;

public class h extends Dialog implements View.OnClickListener {
  private FragmentActivity b;
  
  private Context c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private GoogleBillingUtil g;
  
  private boolean h;
  
  private boolean i;
  
  private LinearLayout j;
  
  private Typeface k;
  
  private PopupWindow l;
  
  private long m;
  
  public h(Context paramContext, int paramInt, FragmentActivity paramFragmentActivity, String paramString1, String paramString2, GoogleBillingUtil paramGoogleBillingUtil, boolean paramBoolean1, String paramString3, long paramLong, boolean paramBoolean2) {
    super(paramContext, paramInt);
    this.b = paramFragmentActivity;
    this.c = paramContext;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.g = paramGoogleBillingUtil;
    this.m = paramLong;
  }
  
  private void a() {
    try {
      View view = LayoutInflater.from((Context)this.b).inflate(2131493144, null);
      TextView textView = (TextView)view.findViewById(2131297854);
      FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296721);
      textView.setText(this.c.getResources().getString(2131755817));
      textView.setTypeface(this.k);
      frameLayout.setOnClickListener(this);
      PopupWindow popupWindow = new PopupWindow();
      this(view);
      this.l = popupWindow;
      popupWindow.setHeight(-2);
      this.l.setWidth(-2);
      this.l.setFocusable(true);
      if (i1.f0((Context)EZCallApplication.c()).booleanValue()) {
        this.l.setAnimationStyle(2131821306);
      } else {
        this.l.setAnimationStyle(2131821305);
      } 
      ColorDrawable colorDrawable = new ColorDrawable();
      this(0);
      this.l.setBackgroundDrawable((Drawable)colorDrawable);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void dismiss() {
    super.dismiss();
  }
  
  public void onClick(View paramView) {
    StringBuilder stringBuilder;
    Intent intent;
    GoogleBillingUtil googleBillingUtil;
    switch (paramView.getId()) {
      default:
        return;
      case 2131298071:
        stringBuilder = new StringBuilder();
        stringBuilder.append("https://play.google.com/store/account/subscriptions?sku=");
        stringBuilder.append(this.f);
        stringBuilder.append("&package=");
        stringBuilder.append(this.c.getPackageName());
        intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
        intent.setFlags(268435456);
        this.c.startActivity(intent);
        q.b().c("premium_dialog_click_restore");
        dismiss();
      case 2131297963:
        a.b(this.b);
      case 2131297626:
        if (this.l == null)
          a(); 
        if (this.l != null)
          if (i1.f0(this.c).booleanValue()) {
            this.l.showAtLocation((View)intent, 51, 5, j.a(this.c, 14.0F) + 25);
          } else {
            this.l.showAtLocation((View)intent, 53, 5, j.a(this.c, 14.0F) + 25);
          }  
      case 2131297546:
        googleBillingUtil = this.g;
        if (googleBillingUtil != null) {
          i1.f = "showcaller_removeads_year";
          googleBillingUtil.z((Activity)this.b, "showcaller_removeads_year");
          q.b().c("premium_dialog_click_year");
          if (this.i) {
            q.b().c("recommend_premium_dialog_click_year");
          } else {
            q.b().c("cehua_premium_dialog_click_year");
          } 
        } 
        dismiss();
      case 2131297512:
        googleBillingUtil = this.g;
        if (googleBillingUtil != null) {
          i1.f = "showcaller_removeads_month";
          googleBillingUtil.z((Activity)this.b, "showcaller_removeads_month");
          q.b().c("premium_dialog_click_month");
          if (this.i) {
            q.b().c("recommend_premium_dialog_click_month");
          } else {
            q.b().c("cehua_premium_dialog_click_month");
          } 
        } 
        dismiss();
      case 2131296968:
        q.b().c("subscribe_dialog_close_button_click");
        dismiss();
      case 2131296721:
        break;
    } 
    a.b(this.b);
    PopupWindow popupWindow = this.l;
    if (popupWindow != null)
      popupWindow.dismiss(); 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.H0(this.c, (EZCallApplication.c()).f);
    setContentView(2131493014);
    if (i1.f0(this.c).booleanValue() && Build.VERSION.SDK_INT >= 17 && getWindow() != null)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.k = g1.b();
    Typeface typeface = g1.a();
    this.j = (LinearLayout)findViewById(2131297175);
    TextView textView2 = (TextView)findViewById(2131298226);
    TextView textView3 = (TextView)findViewById(2131298225);
    TextView textView4 = (TextView)findViewById(2131298187);
    TextView textView5 = (TextView)findViewById(2131297866);
    String str1 = this.e;
    String str2 = str1.substring(0, str1.indexOf("$") + 1);
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("sign:");
      stringBuilder.append(str2);
      d0.a("inappbilling", stringBuilder.toString());
    } 
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(str2);
      str2 = this.e;
      stringBuilder.append(String.format("%.2f", new Object[] { Float.valueOf(Float.parseFloat(str2.substring(str2.indexOf("$") + 1)) / 12.0F) }));
      String str = stringBuilder.toString();
      textView3.setText(this.c.getResources().getString(2131755815));
    } catch (Exception exception) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getMessage());
        d0.a("inappbilling", stringBuilder.toString());
      } 
      exception.printStackTrace();
      str1 = this.e;
      textView3.setText(this.c.getResources().getString(2131755814));
    } 
    textView2.setText(str1);
    textView2.setTypeface(this.k);
    TextView textView1 = (TextView)findViewById(2131297979);
    textView1.setText(this.d);
    textView1.setTypeface(this.k);
    ((ImageView)findViewById(2131296968)).setOnClickListener(this);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131297546);
    frameLayout2.setOnClickListener(this);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131297512);
    frameLayout1.setOnClickListener(this);
    textView1 = (TextView)findViewById(2131298071);
    textView1.setOnClickListener(this);
    textView2 = (TextView)findViewById(2131297963);
    textView2.setOnClickListener(this);
    ((ImageView)findViewById(2131297626)).setOnClickListener(this);
    RelativeLayout relativeLayout = (RelativeLayout)findViewById(2131297547);
    if (this.h)
      textView1.setVisibility(0); 
    if (this.f != null) {
      textView4.setText(this.c.getResources().getString(2131755608));
      if ("showcaller_removeads_month".equals(this.f)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c.getResources().getString(2131755519));
        stringBuilder.append(" ");
        stringBuilder.append(i.k(new Date((this.m + 2592000L) * 1000L)));
        textView5.setText(stringBuilder.toString());
        frameLayout1.setVisibility(8);
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c.getResources().getString(2131755519));
        stringBuilder.append(" ");
        stringBuilder.append(i.k(new Date((this.m + 31104000L) * 1000L)));
        textView5.setText(stringBuilder.toString());
        frameLayout1.setVisibility(8);
        frameLayout2.setVisibility(8);
        relativeLayout.setVisibility(8);
      } 
    } 
    textView4.setTypeface(typeface);
    textView5.setTypeface(this.k);
    ((TextView)findViewById(2131297798)).setTypeface(this.k);
    ((TextView)findViewById(2131297804)).setTypeface(this.k);
    ((TextView)findViewById(2131297994)).setTypeface(this.k);
    ((TextView)findViewById(2131298004)).setTypeface(this.k);
    ((TextView)findViewById(2131298031)).setTypeface(this.k);
    textView3.setTypeface(this.k);
    ((TextView)findViewById(2131298030)).setTypeface(this.k);
    ((TextView)findViewById(2131297978)).setTypeface(this.k);
    ((TextView)findViewById(2131297925)).setTypeface(this.k);
    textView2.setTypeface(this.k);
    textView1.setTypeface(this.k);
    if (this.i) {
      q.b().c("recommend_subscribe_dialog_show");
    } else {
      q.b().c("cehua_subscribe_dialog_show");
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4)
      try {
        if (d0.a)
          d0.a("tony", "KEYCODE_BACK"); 
        q.b().c("subscribe_dialog_close_back_click");
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0 && (paramMotionEvent.getX() < -10.0F || paramMotionEvent.getY() < -10.0F || paramMotionEvent.getX() >= (this.j.getWidth() + 10) || paramMotionEvent.getY() >= (this.j.getHeight() + 20))) {
      if (d0.a)
        d0.a("tony", "ACTION_OUTSIDE"); 
      q.b().c("subscribe_dialog_close_without_click");
      dismiss();
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */