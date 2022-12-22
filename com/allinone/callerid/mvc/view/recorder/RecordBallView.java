package com.allinone.callerid.mvc.view.recorder;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.j;
import com.allinone.callerid.util.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RecordBallView extends RelativeLayout {
  private Context b;
  
  public WindowManager.LayoutParams c;
  
  private WindowManager d;
  
  private float e;
  
  private float f;
  
  private float g;
  
  private float h;
  
  private ImageView i;
  
  private FrameLayout j;
  
  private TextView k;
  
  private ImageView l;
  
  private FrameLayout m;
  
  private int n = j.a((Context)EZCallApplication.c(), 62.0F);
  
  private int o;
  
  private int p;
  
  private boolean q = true;
  
  private int r;
  
  private int s;
  
  private String t;
  
  private long u = 0L;
  
  private Handler v;
  
  private Runnable w;
  
  public RecordBallView(Context paramContext, int paramInt1, int paramInt2) {
    super(paramContext);
    this.b = paramContext;
    this.o = paramInt1;
    this.p = paramInt2;
    h();
  }
  
  public RecordBallView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.b = paramContext;
    h();
  }
  
  public RecordBallView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = paramContext;
    h();
  }
  
  private void g() {
    this.v = new Handler();
    a a = new a(this);
    this.w = a;
    this.v.post(a);
  }
  
  private void h() {
    View view = RelativeLayout.inflate(this.b, 2131493154, (ViewGroup)this);
    this.d = (WindowManager)getContext().getSystemService("window");
    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
    this.c = layoutParams;
    if (Build.VERSION.SDK_INT >= 26) {
      layoutParams.type = 2038;
    } else {
      layoutParams.type = 2010;
    } 
    layoutParams.height = -2;
    layoutParams.width = -2;
    layoutParams.gravity = 51;
    layoutParams.format = 1;
    layoutParams.y = this.p + this.n;
    layoutParams.x = j.a((Context)EZCallApplication.c(), 294.0F);
    this.c.flags = 524328;
    this.i = (ImageView)view.findViewById(2131297429);
    this.j = (FrameLayout)view.findViewById(2131297410);
    this.k = (TextView)view.findViewById(2131297412);
    this.l = (ImageView)view.findViewById(2131297411);
    this.m = (FrameLayout)view.findViewById(2131297424);
    if (!com.allinone.callerid.util.recorder.b.e()) {
      setVisibility(8);
    } else if (this.r == 10002) {
      g();
    } 
  }
  
  private String k(long paramLong) {
    return (new SimpleDateFormat("mm:ss", Locale.ENGLISH)).format(new Date(paramLong * 1000L));
  }
  
  private void l(View paramView) {
    Animation animation = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130772002);
    animation.setAnimationListener(new b(this));
    paramView.startAnimation(animation);
  }
  
  public void f() {
    this.d.addView((View)this, (ViewGroup.LayoutParams)this.c);
  }
  
  public int getCall_status() {
    return this.s;
  }
  
  public int getStatus() {
    return this.r;
  }
  
  public String getTel_phone() {
    return this.t;
  }
  
  public void i() {
    this.m.setVisibility(8);
    this.j.setVisibility(0);
    this.k.setVisibility(0);
    l((View)this.k);
  }
  
  public void j() {
    try {
      Handler handler = this.v;
      if (handler != null) {
        Runnable runnable = this.w;
        if (runnable != null) {
          handler.removeCallbacks(runnable);
          this.w = null;
        } 
        this.v = null;
      } 
      this.d.removeView((View)this);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void m(int paramInt1, int paramInt2) {
    WindowManager.LayoutParams layoutParams = this.c;
    layoutParams.x = paramInt1;
    layoutParams.y = paramInt2;
    this.d.updateViewLayout((View)this, (ViewGroup.LayoutParams)layoutParams);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    RecordCall recordCall;
    if (this.q) {
      int i = paramMotionEvent.getAction();
      if (i != 0) {
        if (i != 1) {
          if (i != 2)
            return false; 
          this.c.x = (int)paramMotionEvent.getRawX() - getMeasuredWidth() / 2;
          this.c.y = (int)paramMotionEvent.getRawY() - getMeasuredHeight() / 2;
          if (Math.abs(this.c.y - this.f) > 10.0F || Math.abs(this.c.x - this.e) > 10.0F)
            this.d.updateViewLayout((View)this, (ViewGroup.LayoutParams)this.c); 
          return false;
        } 
        this.h = ((int)paramMotionEvent.getRawY() - getMeasuredHeight() / 2);
        this.g = ((int)paramMotionEvent.getRawX() - getMeasuredWidth() / 2);
        if (Math.abs(this.h - this.f) > 10.0F || Math.abs(this.g - this.e) > 10.0F) {
          this.d.updateViewLayout((View)this, (ViewGroup.LayoutParams)this.c);
          return false;
        } 
        i = this.r;
        if (i == 10001) {
          this.l.setImageResource(2131231401);
          this.r = 10002;
          recordCall = new RecordCall();
          if (Build.VERSION.SDK_INT >= 28) {
            recordCall.setNumber("");
          } else {
            recordCall.setNumber(this.t);
          } 
          if (this.s == 1) {
            recordCall.setPhonestatus(110);
          } else {
            recordCall.setPhonestatus(111);
          } 
          com.allinone.callerid.service.b.f().k(recordCall);
          g();
          i();
          q.b().c("recorder_floatingball_click");
        } else if (i == 10002) {
          this.r = 10003;
          com.allinone.callerid.service.b.f().m(false);
          this.l.setImageResource(2131231400);
          this.k.setText("00:00");
          this.u = 0L;
          Handler handler = this.v;
          if (handler != null) {
            Runnable runnable = this.w;
            if (runnable != null)
              handler.removeCallbacks(runnable); 
          } 
          this.v = null;
          this.w = null;
        } else if (i == 10003) {
          this.r = 10002;
          this.l.setImageResource(2131231401);
          recordCall = new RecordCall();
          if (Build.VERSION.SDK_INT >= 28) {
            recordCall.setNumber("");
          } else {
            recordCall.setNumber(this.t);
          } 
          if (this.s == 1) {
            recordCall.setPhonestatus(110);
          } else {
            recordCall.setPhonestatus(111);
          } 
          com.allinone.callerid.service.b.f().k(recordCall);
          g();
        } 
        return false;
      } 
      this.e = ((int)recordCall.getRawX() - getMeasuredWidth() / 2);
      this.f = ((int)recordCall.getRawY() - getMeasuredHeight() / 2);
      return false;
    } 
    return super.onTouchEvent((MotionEvent)recordCall);
  }
  
  public void setCall_status(int paramInt) {
    this.s = paramInt;
  }
  
  public void setInitTime() {
    g();
  }
  
  public void setIsonTouch(boolean paramBoolean) {
    this.q = paramBoolean;
  }
  
  public void setLayoutParams(int paramInt1, int paramInt2) {
    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)this.m.getLayoutParams();
    layoutParams.width = j.a(this.b, paramInt1);
    layoutParams.height = j.a(this.b, paramInt2);
    this.m.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  public void setStatus(int paramInt) {
    this.r = paramInt;
  }
  
  public void setTel_phone(String paramString) {
    this.t = paramString;
  }
  
  class a implements Runnable {
    a(RecordBallView this$0) {}
    
    public void run() {
      RecordBallView.b(this.b);
      RecordBallView recordBallView = this.b;
      String str = RecordBallView.c(recordBallView, RecordBallView.a(recordBallView));
      RecordBallView.d(this.b).setText(str);
      RecordBallView.e(this.b).postDelayed(this, 1000L);
    }
  }
  
  class b implements Animation.AnimationListener {
    b(RecordBallView this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {}
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/view/recorder/RecordBallView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */