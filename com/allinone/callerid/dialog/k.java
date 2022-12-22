package com.allinone.callerid.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;

public class k extends Dialog implements View.OnClickListener {
  private Context b;
  
  private TextView c;
  
  private TextView d;
  
  private ImageView e;
  
  private ImageView f;
  
  private ImageView g;
  
  private ImageView h;
  
  private ImageView i;
  
  private Handler j = new Handler();
  
  private boolean k;
  
  private ImageView l;
  
  private FrameLayout m;
  
  private TextView n;
  
  private boolean o;
  
  private ImageView p;
  
  private LinearLayout q;
  
  public k(Context paramContext, int paramInt, boolean paramBoolean) {
    super(paramContext, paramInt);
    this.b = paramContext;
    this.k = paramBoolean;
  }
  
  private void c() {
    this.j.postDelayed(new c(this), 500L);
  }
  
  private void d() {
    q.b().c("rate_dialog_click_goto_feedback");
    b1.X1(false);
    try {
      Intent intent = new Intent();
      this("android.intent.action.SENDTO");
      intent.setData(Uri.parse("mailto:andreapps2015@gmail.com"));
      intent.putExtra("android.intent.extra.SUBJECT", "Showcaller-Feedback");
      intent.putExtra("android.intent.extra.TEXT", i1.V());
      intent.setFlags(268435456);
      this.b.startActivity(intent);
    } catch (Exception exception) {
      try {
        Intent intent = new Intent();
        this("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[] { "andreapps2015@gmail.com" });
        intent.putExtra("android.intent.extra.SUBJECT", "Showcaller-Feedback");
        intent.putExtra("android.intent.extra.TEXT", i1.V());
        this.b.startActivity(Intent.createChooser(intent, "E-mail"));
      } catch (Exception exception1) {
        exception1.printStackTrace();
      } 
    } 
  }
  
  private void e() {
    if (this.o) {
      this.n.setText(this.b.getResources().getString(2131755770));
      this.d.setText(this.b.getResources().getString(2131755620));
    } else {
      this.n.setText(this.b.getResources().getString(2131755360));
      this.d.setText(this.b.getResources().getString(2131755361));
    } 
    if (this.m.getVisibility() == 8)
      this.m.setVisibility(0); 
  }
  
  public void dismiss() {
    super.dismiss();
    (j0.a()).b.execute(new b(this));
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296817) {
      if (i != 2131297132) {
        switch (i) {
          default:
            return;
          case 2131297070:
            this.o = true;
            this.i.clearAnimation();
            this.p.clearAnimation();
            this.p.setVisibility(8);
            this.e.setImageResource(2131231444);
            this.f.setImageResource(2131231444);
            this.g.setImageResource(2131231444);
            this.h.setImageResource(2131231444);
            this.i.setImageResource(2131231444);
            this.l.setImageResource(2131231245);
            e();
            q.b().c("click_five_star_new");
          case 2131297069:
            this.o = false;
            this.i.clearAnimation();
            this.p.clearAnimation();
            this.p.setVisibility(8);
            this.e.setImageResource(2131231444);
            this.f.setImageResource(2131231444);
            this.g.setImageResource(2131231444);
            this.h.setImageResource(2131231444);
            this.i.setImageResource(2131231442);
            this.l.setImageResource(2131231235);
            e();
            q.b().c("click_star_new");
          case 2131297068:
            this.o = false;
            this.i.clearAnimation();
            this.p.clearAnimation();
            this.p.setVisibility(8);
            this.e.setImageResource(2131231444);
            this.f.setImageResource(2131231444);
            this.g.setImageResource(2131231444);
            this.h.setImageResource(2131231442);
            this.i.setImageResource(2131231442);
            this.l.setImageResource(2131231235);
            e();
            q.b().c("click_star_new");
          case 2131297067:
            this.o = false;
            this.i.clearAnimation();
            this.p.clearAnimation();
            this.p.setVisibility(8);
            this.e.setImageResource(2131231444);
            this.f.setImageResource(2131231444);
            this.g.setImageResource(2131231442);
            this.h.setImageResource(2131231442);
            this.i.setImageResource(2131231442);
            this.l.setImageResource(2131231235);
            e();
            q.b().c("click_star_new");
          case 2131297066:
            break;
        } 
        this.o = false;
        this.i.clearAnimation();
        this.p.clearAnimation();
        this.p.setVisibility(8);
        this.e.setImageResource(2131231444);
        this.f.setImageResource(2131231442);
        this.g.setImageResource(2131231442);
        this.h.setImageResource(2131231442);
        this.i.setImageResource(2131231442);
        this.l.setImageResource(2131231235);
        e();
        q.b().c("click_star_new");
      } 
      q.b().c("rate_dialog_close_button_click_new");
      dismiss();
    } 
    if (this.o)
      c(); 
    d();
    dismiss();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    i1.H0(this.b, (EZCallApplication.c()).f);
    setContentView(2131493015);
    boolean bool = i1.f0(this.b).booleanValue();
    int i = 1;
    if (bool && Build.VERSION.SDK_INT >= 17 && getWindow() != null)
      getWindow().getDecorView().setLayoutDirection(1); 
    Typeface typeface = g1.b();
    ImageView imageView = (ImageView)findViewById(2131297132);
    this.q = (LinearLayout)findViewById(2131297175);
    this.l = (ImageView)findViewById(2131297071);
    this.m = (FrameLayout)findViewById(2131296817);
    this.n = (TextView)findViewById(2131297901);
    TextView textView = (TextView)findViewById(2131298055);
    this.c = textView;
    textView.setTypeface(typeface);
    textView = (TextView)findViewById(2131298056);
    this.d = textView;
    textView.setTypeface(typeface);
    ((TextView)findViewById(2131297923)).setTypeface(typeface);
    this.e = (ImageView)findViewById(2131297066);
    this.f = (ImageView)findViewById(2131297067);
    this.g = (ImageView)findViewById(2131297068);
    this.h = (ImageView)findViewById(2131297069);
    this.i = (ImageView)findViewById(2131297070);
    this.p = (ImageView)findViewById(2131297024);
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.h.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.m.setOnClickListener(this);
    imageView.setOnClickListener(this);
    int j = b1.w0();
    if (j != 0)
      i = j; 
    if (this.k) {
      com.allinone.callerid.i.a.o.c.b(new a(this));
    } else {
      TextView textView1 = this.c;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(i);
      stringBuilder.append(" ");
      stringBuilder.append(this.b.getResources().getString(2131755175));
      textView1.setText(stringBuilder.toString());
    } 
    Animation animation2 = AnimationUtils.loadAnimation(this.b, 2130772036);
    animation2.setInterpolator((Interpolator)new LinearInterpolator());
    Animation animation1 = AnimationUtils.loadAnimation(this.b, 2130772037);
    animation1.setInterpolator((Interpolator)new LinearInterpolator());
    this.i.startAnimation(animation2);
    this.p.startAnimation(animation1);
    q.b().c("rate_dialog_show_counts");
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4)
      try {
        if (d0.a)
          d0.a("tony", "KEYCODE_BACK"); 
        q.b().c("rate_dialog_close_back_click_new");
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0 && (paramMotionEvent.getX() < -10.0F || paramMotionEvent.getY() < -10.0F || paramMotionEvent.getX() >= (this.q.getWidth() + 10) || paramMotionEvent.getY() >= (this.q.getHeight() + 20))) {
      if (d0.a)
        d0.a("tony", "ACTION_OUTSIDE"); 
      q.b().c("rate_dialog_close_without_click_new");
      dismiss();
    } 
    return true;
  }
  
  class a implements com.allinone.callerid.i.a.o.b {
    a(k this$0) {}
    
    public void a(String param1String, int param1Int) {
      String str = param1String;
      if ("0".equals(param1String))
        str = "1"; 
      TextView textView = k.b(this.a);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(" ");
      stringBuilder.append(k.a(this.a).getResources().getString(2131755174));
      textView.setText(stringBuilder.toString());
    }
  }
  
  class b implements Runnable {
    b(k this$0) {}
    
    public void run() {
      if (b1.I()) {
        b1.Y1(System.currentTimeMillis() + 259200000L);
        b1.n1(false);
      } else {
        b1.Y1(System.currentTimeMillis() + 604800000L);
      } 
    }
  }
  
  class c implements Runnable {
    c(k this$0) {}
    
    public void run() {
      q.b().c("rate_dialog_click_goto_rate");
      b1.X1(false);
      i1.C0(k.a(this.b), i1.M(k.a(this.b)));
      this.b.dismiss();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */