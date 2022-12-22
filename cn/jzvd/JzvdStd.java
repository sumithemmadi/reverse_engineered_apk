package cn.jzvd;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class JzvdStd extends Jzvd {
  public static long a0 = 0L;
  
  public static int b0 = 70;
  
  protected static Timer c0;
  
  protected ImageView A0;
  
  protected Dialog B0;
  
  protected ProgressBar C0;
  
  protected TextView D0;
  
  private BroadcastReceiver E0 = new a(this);
  
  public ImageView d0;
  
  public ProgressBar e0;
  
  public ProgressBar f0;
  
  public TextView g0;
  
  public ImageView h0;
  
  public ImageView i0;
  
  public LinearLayout j0;
  
  public ImageView k0;
  
  public TextView l0;
  
  public TextView m0;
  
  public TextView n0;
  
  public PopupWindow o0;
  
  public TextView p0;
  
  public LinearLayout q0;
  
  protected b r0;
  
  protected Dialog s0;
  
  protected ProgressBar t0;
  
  protected TextView u0;
  
  protected TextView v0;
  
  protected ImageView w0;
  
  protected Dialog x0;
  
  protected ProgressBar y0;
  
  protected TextView z0;
  
  public JzvdStd(Context paramContext) {
    super(paramContext);
  }
  
  public JzvdStd(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public void A() {
    super.A();
    U();
  }
  
  public void B() {
    super.B();
    W();
  }
  
  public void E() {
    super.E();
    N();
    PopupWindow popupWindow = this.o0;
    if (popupWindow != null)
      popupWindow.dismiss(); 
  }
  
  public void F() {
    super.F();
    this.e0.setProgress(0);
    this.e0.setSecondaryProgress(0);
  }
  
  public void G(int paramInt) {
    int i;
    super.G(paramInt);
    if (this.B0 == null) {
      View view = LayoutInflater.from(getContext()).inflate(z.jz_dialog_brightness, null);
      this.D0 = (TextView)view.findViewById(y.tv_brightness);
      this.C0 = (ProgressBar)view.findViewById(y.brightness_progressbar);
      this.B0 = X(view);
    } 
    if (!this.B0.isShowing())
      this.B0.show(); 
    if (paramInt > 100) {
      i = 100;
    } else {
      i = paramInt;
      if (paramInt < 0)
        i = 0; 
    } 
    TextView textView = this.D0;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(i);
    stringBuilder.append("%");
    textView.setText(stringBuilder.toString());
    this.C0.setProgress(i);
    h0();
  }
  
  public void H(float paramFloat, String paramString1, long paramLong1, String paramString2, long paramLong2) {
    int i;
    super.H(paramFloat, paramString1, paramLong1, paramString2, paramLong2);
    if (this.s0 == null) {
      View view = LayoutInflater.from(getContext()).inflate(z.jz_dialog_progress, null);
      this.t0 = (ProgressBar)view.findViewById(y.duration_progressbar);
      this.u0 = (TextView)view.findViewById(y.tv_current);
      this.v0 = (TextView)view.findViewById(y.tv_duration);
      this.w0 = (ImageView)view.findViewById(y.duration_image_tip);
      this.s0 = X(view);
    } 
    if (!this.s0.isShowing())
      this.s0.show(); 
    this.u0.setText(paramString1);
    TextView textView = this.v0;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(" / ");
    stringBuilder.append(paramString2);
    textView.setText(stringBuilder.toString());
    ProgressBar progressBar = this.t0;
    if (paramLong2 <= 0L) {
      i = 0;
    } else {
      i = (int)(paramLong1 * 100L / paramLong2);
    } 
    progressBar.setProgress(i);
    if (paramFloat > 0.0F) {
      this.w0.setBackgroundResource(x.jz_forward_icon);
    } else {
      this.w0.setBackgroundResource(x.jz_backward_icon);
    } 
    h0();
  }
  
  public void I(float paramFloat, int paramInt) {
    int i;
    super.I(paramFloat, paramInt);
    if (this.x0 == null) {
      View view = LayoutInflater.from(getContext()).inflate(z.jz_dialog_volume, null);
      this.A0 = (ImageView)view.findViewById(y.volume_image_tip);
      this.z0 = (TextView)view.findViewById(y.tv_volume);
      this.y0 = (ProgressBar)view.findViewById(y.volume_progressbar);
      this.x0 = X(view);
    } 
    if (!this.x0.isShowing())
      this.x0.show(); 
    if (paramInt <= 0) {
      this.A0.setBackgroundResource(x.jz_close_volume);
    } else {
      this.A0.setBackgroundResource(x.jz_add_volume);
    } 
    if (paramInt > 100) {
      i = 100;
    } else {
      i = paramInt;
      if (paramInt < 0)
        i = 0; 
    } 
    TextView textView = this.z0;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(i);
    stringBuilder.append("%");
    textView.setText(stringBuilder.toString());
    this.y0.setProgress(i);
    h0();
  }
  
  public void J() {
    super.J();
    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
    builder.setMessage(getResources().getString(a0.tips_not_wifi));
    builder.setPositiveButton(getResources().getString(a0.tips_not_wifi_confirm), new p(this));
    builder.setNegativeButton(getResources().getString(a0.tips_not_wifi_cancel), new q(this));
    builder.setOnCancelListener(s.b);
    builder.create().show();
  }
  
  public void N() {
    Timer timer = c0;
    if (timer != null)
      timer.cancel(); 
    b b1 = this.r0;
    if (b1 != null)
      b1.cancel(); 
  }
  
  public void O(int paramInt) {
    ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
    layoutParams.height = paramInt;
    layoutParams.width = paramInt;
    layoutParams = this.f0.getLayoutParams();
    layoutParams.height = paramInt;
    layoutParams.width = paramInt;
  }
  
  public void P() {
    int i = this.n;
    if (i != 0) {
      if (i == 1) {
        setAllControlsVisiblity(0, 4, 0, 4, 0, 4, 4);
        k0();
      } 
    } else {
      setAllControlsVisiblity(0, 4, 0, 4, 0, 4, 4);
      k0();
    } 
  }
  
  public void Q() {
    int i = this.n;
    if (i != 0) {
      if (i == 1) {
        setAllControlsVisiblity(0, 4, 0, 4, 4, 4, 0);
        k0();
      } 
    } else {
      setAllControlsVisiblity(4, 4, 0, 4, 4, 4, 0);
      k0();
    } 
  }
  
  public void R() {
    int i = this.n;
    if (i != 0) {
      if (i == 1) {
        setAllControlsVisiblity(0, 4, 0, 4, 0, 4, 4);
        k0();
      } 
    } else {
      setAllControlsVisiblity(0, 4, 0, 4, 0, 4, 4);
      k0();
    } 
  }
  
  public void S() {
    int i = this.n;
    if (i != 0) {
      if (i == 1)
        setAllControlsVisiblity(4, 4, 4, 4, 4, 0, 4); 
    } else {
      setAllControlsVisiblity(4, 4, 4, 4, 4, 0, 4);
    } 
  }
  
  public void T() {
    int i = this.n;
    if (i != 0) {
      if (i == 1) {
        setAllControlsVisiblity(0, 0, 0, 4, 4, 4, 4);
        k0();
      } 
    } else {
      setAllControlsVisiblity(0, 0, 0, 4, 4, 4, 4);
      k0();
    } 
  }
  
  public void U() {
    int i = this.n;
    if (i != 0) {
      if (i == 1)
        setAllControlsVisiblity(4, 4, 4, 4, 4, 0, 4); 
    } else {
      setAllControlsVisiblity(4, 4, 4, 4, 4, 0, 4);
    } 
  }
  
  public void V() {
    int i = this.n;
    if (i != 0) {
      if (i == 1) {
        setAllControlsVisiblity(0, 0, 0, 4, 4, 4, 4);
        k0();
      } 
    } else {
      setAllControlsVisiblity(0, 0, 0, 4, 4, 4, 4);
      k0();
    } 
  }
  
  public void W() {
    int i = this.n;
    if (i == 0 || i == 1) {
      setAllControlsVisiblity(4, 4, 4, 0, 0, 4, 4);
      k0();
    } 
  }
  
  public Dialog X(View paramView) {
    Dialog dialog = new Dialog(getContext(), b0.jz_style_dialog_progress);
    dialog.setContentView(paramView);
    Window window = dialog.getWindow();
    window.addFlags(8);
    window.addFlags(32);
    window.addFlags(16);
    window.setLayout(-2, -2);
    WindowManager.LayoutParams layoutParams = window.getAttributes();
    layoutParams.gravity = 17;
    window.setAttributes(layoutParams);
    return dialog;
  }
  
  public void Y() {
    int i = this.m;
    if (i != 0 && i != 7 && i != 6)
      post(new r(this)); 
  }
  
  public void e(int paramInt, long paramLong) {
    super.e(paramInt, paramLong);
    this.y.setVisibility(4);
    this.m0.setVisibility(8);
    this.q0.setVisibility(8);
  }
  
  public int getLayoutId() {
    return z.jz_layout_std;
  }
  
  public void h() {
    super.h();
    Dialog dialog = this.B0;
    if (dialog != null)
      dialog.dismiss(); 
  }
  
  public void h0() {
    int i = this.m;
    if (i == 1) {
      if (this.F.getVisibility() == 0)
        W(); 
    } else if (i == 4) {
      if (this.F.getVisibility() == 0)
        U(); 
    } else if (i == 5) {
      if (this.F.getVisibility() == 0)
        S(); 
    } else if (i == 6 && this.F.getVisibility() == 0) {
      P();
    } 
  }
  
  public void i() {
    super.i();
    Dialog dialog = this.s0;
    if (dialog != null)
      dialog.dismiss(); 
  }
  
  public void i0() {
    if (this.F.getVisibility() != 0) {
      setSystemTimeAndBattery();
      this.n0.setText(this.o.b().toString());
    } 
    int i = this.m;
    if (i == 1) {
      W();
      if (this.F.getVisibility() != 0)
        setSystemTimeAndBattery(); 
    } else if (i == 4) {
      if (this.F.getVisibility() == 0) {
        U();
      } else {
        V();
      } 
    } else if (i == 5) {
      if (this.F.getVisibility() == 0) {
        S();
      } else {
        T();
      } 
    } 
  }
  
  public void j() {
    super.j();
    Dialog dialog = this.x0;
    if (dialog != null)
      dialog.dismiss(); 
  }
  
  public void j0() {
    N();
    c0 = new Timer();
    b b1 = new b(this);
    this.r0 = b1;
    c0.schedule(b1, 2500L);
  }
  
  public void k0() {
    int i = this.m;
    if (i == 4) {
      this.y.setVisibility(0);
      this.y.setImageResource(x.jz_click_pause_selector);
      this.m0.setVisibility(8);
    } else if (i == 7) {
      this.y.setVisibility(4);
      this.m0.setVisibility(8);
    } else if (i == 6) {
      this.y.setVisibility(0);
      this.y.setImageResource(x.jz_click_replay_selector);
      this.m0.setVisibility(0);
    } else {
      this.y.setImageResource(x.jz_click_play_selector);
      this.m0.setVisibility(8);
    } 
  }
  
  public void onClick(View paramView) {
    super.onClick(paramView);
    int i = paramView.getId();
    if (i == y.thumb) {
      t t = this.o;
      if (t == null || t.b.isEmpty() || this.o.c() == null) {
        Toast.makeText(getContext(), getResources().getString(a0.no_url), 0).show();
        return;
      } 
      i = this.m;
      if (i == 0) {
        if (!this.o.c().toString().startsWith("file") && !this.o.c().toString().startsWith("/") && !v.f(getContext()) && !Jzvd.h) {
          J();
          return;
        } 
        L();
      } else if (i == 6) {
        i0();
      } 
    } else if (i == y.surface_container) {
      j0();
    } else if (i == y.back) {
      Jzvd.b();
    } else if (i == y.back_tiny) {
      f();
    } else if (i == y.clarity) {
      LinearLayout linearLayout = (LinearLayout)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(z.jz_layout_clarity, null);
      o o = new o(this, linearLayout);
      for (i = 0; i < this.o.b.size(); i++) {
        String str = this.o.d(i);
        TextView textView = (TextView)View.inflate(getContext(), z.jz_layout_clarity_item, null);
        textView.setText(str);
        textView.setTag(Integer.valueOf(i));
        linearLayout.addView((View)textView, i);
        textView.setOnClickListener(o);
        if (i == this.o.a)
          textView.setTextColor(Color.parseColor("#fff85959")); 
      } 
      PopupWindow popupWindow = new PopupWindow((View)linearLayout, -2, -2, true);
      this.o0 = popupWindow;
      popupWindow.setContentView((View)linearLayout);
      this.o0.showAsDropDown((View)this.n0);
      linearLayout.measure(0, 0);
      i = this.n0.getMeasuredWidth() / 3;
      int j = this.n0.getMeasuredHeight() / 3;
      this.o0.update((View)this.n0, -i, -j, Math.round((linearLayout.getMeasuredWidth() * 2)), linearLayout.getMeasuredHeight());
    } else if (i == y.retry_btn) {
      if (this.o.b.isEmpty() || this.o.c() == null) {
        Toast.makeText(getContext(), getResources().getString(a0.no_url), 0).show();
        return;
      } 
      if (!this.o.c().toString().startsWith("file") && !this.o.c().toString().startsWith("/") && !v.f(getContext()) && !Jzvd.h) {
        J();
        return;
      } 
      a();
      B();
    } 
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {
    super.onStartTrackingTouch(paramSeekBar);
    N();
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {
    super.onStopTrackingTouch(paramSeekBar);
    j0();
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    int i = paramView.getId();
    if (i == y.surface_container) {
      if (paramMotionEvent.getAction() == 1) {
        j0();
        if (this.Q) {
          long l1 = getDuration();
          long l2 = this.V;
          long l3 = l1;
          if (l1 == 0L)
            l3 = 1L; 
          i = (int)(l2 * 100L / l3);
          this.e0.setProgress(i);
        } 
        if (!this.Q && !this.P)
          i0(); 
      } 
    } else if (i == y.bottom_seek_progress) {
      i = paramMotionEvent.getAction();
      if (i != 0) {
        if (i == 1)
          j0(); 
      } else {
        N();
      } 
    } 
    return super.onTouch(paramView, paramMotionEvent);
  }
  
  public void p(Context paramContext) {
    super.p(paramContext);
    this.j0 = (LinearLayout)findViewById(y.battery_time_layout);
    this.e0 = (ProgressBar)findViewById(y.bottom_progress);
    this.g0 = (TextView)findViewById(y.title);
    this.d0 = (ImageView)findViewById(y.back);
    this.h0 = (ImageView)findViewById(y.thumb);
    this.f0 = (ProgressBar)findViewById(y.loading);
    this.i0 = (ImageView)findViewById(y.back_tiny);
    this.k0 = (ImageView)findViewById(y.battery_level);
    this.l0 = (TextView)findViewById(y.video_current_time);
    this.m0 = (TextView)findViewById(y.replay_text);
    this.n0 = (TextView)findViewById(y.clarity);
    this.p0 = (TextView)findViewById(y.retry_btn);
    this.q0 = (LinearLayout)findViewById(y.retry_layout);
    this.h0.setOnClickListener(this);
    this.d0.setOnClickListener(this);
    this.i0.setOnClickListener(this);
    this.n0.setOnClickListener(this);
    this.p0.setOnClickListener(this);
  }
  
  public void q() {
    super.q();
    N();
  }
  
  public void setAllControlsVisiblity(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    this.E.setVisibility(paramInt1);
    this.F.setVisibility(paramInt2);
    this.y.setVisibility(paramInt3);
    this.f0.setVisibility(paramInt4);
    this.h0.setVisibility(paramInt5);
    this.e0.setVisibility(8);
    this.q0.setVisibility(paramInt7);
  }
  
  public void setBatteryLevel() {
    int i = b0;
    if (i < 15) {
      this.k0.setBackgroundResource(x.jz_battery_level_10);
    } else if (i >= 15 && i < 40) {
      this.k0.setBackgroundResource(x.jz_battery_level_30);
    } else if (i >= 40 && i < 60) {
      this.k0.setBackgroundResource(x.jz_battery_level_50);
    } else if (i >= 60 && i < 80) {
      this.k0.setBackgroundResource(x.jz_battery_level_70);
    } else if (i >= 80 && i < 95) {
      this.k0.setBackgroundResource(x.jz_battery_level_90);
    } else if (i >= 95 && i <= 100) {
      this.k0.setBackgroundResource(x.jz_battery_level_100);
    } 
  }
  
  public void setBufferProgress(int paramInt) {
    super.setBufferProgress(paramInt);
    if (paramInt != 0)
      this.e0.setSecondaryProgress(paramInt); 
  }
  
  public void setScreenFullscreen() {
    super.setScreenFullscreen();
    this.A.setImageResource(x.jz_shrink);
    this.d0.setVisibility(0);
    this.i0.setVisibility(4);
    this.j0.setVisibility(0);
    if (this.o.b.size() == 1) {
      this.n0.setVisibility(8);
    } else {
      this.n0.setText(this.o.b().toString());
      this.n0.setVisibility(0);
    } 
    O((int)getResources().getDimension(w.jz_start_button_w_h_fullscreen));
    setSystemTimeAndBattery();
  }
  
  public void setScreenNormal() {
    super.setScreenNormal();
    this.A.setImageResource(x.jz_enlarge);
    this.d0.setVisibility(8);
    this.i0.setVisibility(4);
    O((int)getResources().getDimension(w.jz_start_button_w_h_normal));
    this.j0.setVisibility(8);
    this.n0.setVisibility(8);
  }
  
  public void setScreenTiny() {
    super.setScreenTiny();
    this.i0.setVisibility(0);
    setAllControlsVisiblity(4, 4, 4, 4, 4, 4, 4);
    this.j0.setVisibility(8);
    this.n0.setVisibility(8);
  }
  
  public void setSystemTimeAndBattery() {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
    Date date = new Date();
    this.l0.setText(simpleDateFormat.format(date));
    if (System.currentTimeMillis() - a0 > 30000L) {
      a0 = System.currentTimeMillis();
      getContext().registerReceiver(this.E0, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    } else {
      setBatteryLevel();
    } 
  }
  
  public void setUp(t paramt, int paramInt, Class paramClass) {
    super.setUp(paramt, paramInt, paramClass);
    this.g0.setText(paramt.c);
    setScreen(paramInt);
  }
  
  public void u(int paramInt, long paramLong1, long paramLong2) {
    super.u(paramInt, paramLong1, paramLong2);
    if (paramInt != 0)
      this.e0.setProgress(paramInt); 
  }
  
  public void w() {
    super.w();
    P();
    N();
  }
  
  public void x() {
    super.x();
    Q();
  }
  
  public void y() {
    super.y();
    R();
  }
  
  public void z() {
    super.z();
    T();
    N();
  }
  
  class a extends BroadcastReceiver {
    a(JzvdStd this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if ("android.intent.action.BATTERY_CHANGED".equals(param1Intent.getAction())) {
        JzvdStd.b0 = param1Intent.getIntExtra("level", 0) * 100 / param1Intent.getIntExtra("scale", 100);
        this.a.setBatteryLevel();
        try {
          this.a.getContext().unregisterReceiver(JzvdStd.M(this.a));
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
    }
  }
  
  public class b extends TimerTask {
    public b(JzvdStd this$0) {}
    
    public void run() {
      this.b.Y();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/cn/jzvd/JzvdStd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */