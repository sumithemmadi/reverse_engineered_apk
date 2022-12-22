package com.allinone.callerid.customview;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.allinone.callerid.b.p;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.k0;
import com.allinone.callerid.util.q;
import java.util.ArrayList;
import java.util.List;

public class FloatNormalView extends LinearLayout {
  private static WindowManager b;
  
  private static ImageView c;
  
  private static TextView d;
  
  private static TextView e;
  
  private static ViewPager f;
  
  private static LinearLayout g;
  
  private static Typeface h;
  
  private static p i;
  
  private static List<View> j;
  
  private static ImageView[] k;
  
  private static int[] l = new int[] { 2131493176, 2131493177, 2131493178 };
  
  private Context m = null;
  
  private View n = null;
  
  private WindowManager.LayoutParams o = new WindowManager.LayoutParams();
  
  private float p;
  
  private float q;
  
  private float r;
  
  private float s;
  
  private boolean t = false;
  
  private k0 u;
  
  public FloatNormalView(Context paramContext) {
    super(paramContext);
    this.m = paramContext;
    this.u = k0.b();
    LayoutInflater.from(paramContext).inflate(2131493168, (ViewGroup)this);
    this.n = findViewById(2131297177);
    b = (WindowManager)paramContext.getSystemService("window");
    u(this.n, paramContext);
    t();
    s();
  }
  
  private void r(Context paramContext) {
    for (byte b = 0; b < 3; b++) {
      View view = LayoutInflater.from(paramContext).inflate(l[b], null, false);
      j.add(view);
    } 
  }
  
  private void s() {
    this.n.setOnTouchListener(new d(this));
  }
  
  private void setBottomIndicator(Context paramContext) {
    k = new ImageView[j.size()];
    for (byte b = 0; b < k.length; b++) {
      ImageView imageView = new ImageView(paramContext);
      LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(20, 20);
      layoutParams.setMargins(5, 0, 5, 0);
      imageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      if (b == 0) {
        imageView.setImageResource(2131231199);
      } else {
        imageView.setImageResource(2131231198);
      } 
      k[b] = imageView;
      g.addView((View)imageView);
    } 
    f.setCurrentItem(0);
  }
  
  private void t() {
    int i = b.getDefaultDisplay().getWidth();
    int j = b.getDefaultDisplay().getHeight();
    if (Build.VERSION.SDK_INT >= 26) {
      this.o.type = 2038;
    } else {
      this.o.type = 2010;
    } 
    WindowManager.LayoutParams layoutParams = this.o;
    layoutParams.flags = 40;
    layoutParams.gravity = 8388659;
    layoutParams.x = i - (this.n.getLayoutParams()).width * 2;
    this.o.y = j / 2 + (this.n.getLayoutParams()).height * 2;
    layoutParams = this.o;
    layoutParams.width = -2;
    layoutParams.height = -2;
    layoutParams.format = -2;
    b.addView((View)this, (ViewGroup.LayoutParams)layoutParams);
  }
  
  private void u(View paramView, Context paramContext) {
    c = (ImageView)paramView.findViewById(2131296824);
    d = (TextView)paramView.findViewById(2131298187);
    e = (TextView)paramView.findViewById(2131298150);
    f = (ViewPager)paramView.findViewById(2131298265);
    g = (LinearLayout)paramView.findViewById(2131297176);
    Typeface typeface = g1.b();
    h = typeface;
    d.setTypeface(typeface);
    e.setTypeface(h);
    View view = LayoutInflater.from(paramContext).inflate(2131493176, null, false);
    ((TextView)view.findViewById(2131298053)).setTypeface(h);
    ((TextView)view.findViewById(2131298098)).setTypeface(h);
    j = new ArrayList<View>();
    r(this.m);
    p p1 = new p(j);
    i = p1;
    f.setAdapter((androidx.viewpager.widget.a)p1);
    f.setOnTouchListener(new a(this));
    f.c(new b(this));
    i.l();
    setBottomIndicator(this.m);
    c.setOnClickListener(new c(this, paramContext));
  }
  
  private void v() {
    WindowManager.LayoutParams layoutParams = this.o;
    layoutParams.x = (int)(this.r - this.p);
    layoutParams.y = (int)(this.s - this.q);
    b.updateViewLayout((View)this, (ViewGroup.LayoutParams)layoutParams);
  }
  
  class a implements View.OnTouchListener {
    a(FloatNormalView this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      if (param1MotionEvent.getAction() == 0)
        q.b().c("yindao_huadong"); 
      return false;
    }
  }
  
  class b implements ViewPager.i {
    b(FloatNormalView this$0) {}
    
    public void a(int param1Int1, float param1Float, int param1Int2) {}
    
    public void c(int param1Int) {}
    
    public void d(int param1Int) {
      int j = param1Int;
      if (FloatNormalView.a() != null) {
        int k = param1Int % (FloatNormalView.b()).length;
        int m = (FloatNormalView.b()).length;
        param1Int = 0;
        while (true) {
          j = k;
          if (param1Int < m) {
            if (param1Int == k) {
              FloatNormalView.b()[param1Int].setImageResource(2131231199);
            } else {
              FloatNormalView.b()[param1Int].setImageResource(2131231198);
            } 
            param1Int++;
            continue;
          } 
          break;
        } 
      } 
      if (j == 0)
        FloatNormalView.g().setText(FloatNormalView.f(this.b).getResources().getString(2131755756)); 
      if (j == 1)
        FloatNormalView.g().setText(FloatNormalView.f(this.b).getResources().getString(2131755757)); 
      if (j == 2)
        FloatNormalView.g().setText(FloatNormalView.f(this.b).getResources().getString(2131755758)); 
    }
  }
  
  class c implements View.OnClickListener {
    c(FloatNormalView this$0, Context param1Context) {}
    
    public void onClick(View param1View) {
      try {
        FloatNormalView.h(this.c).c(this.b);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class d implements View.OnTouchListener {
    d(FloatNormalView this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      int i = param1MotionEvent.getAction();
      if (i != 0) {
        if (i == 2) {
          FloatNormalView.q(this.b, param1MotionEvent.getRawX());
          FloatNormalView.d(this.b, param1MotionEvent.getRawY());
          FloatNormalView.e(this.b);
        } 
      } else if (!FloatNormalView.i(this.b)) {
        FloatNormalView.j(this.b, true);
        FloatNormalView floatNormalView = this.b;
        FloatNormalView.l(floatNormalView, FloatNormalView.k(floatNormalView) + param1MotionEvent.getRawX() - (FloatNormalView.m(this.b)).x);
        floatNormalView = this.b;
        FloatNormalView.o(floatNormalView, FloatNormalView.n(floatNormalView) + param1MotionEvent.getRawY() - (FloatNormalView.m(this.b)).y);
      } else {
        FloatNormalView floatNormalView = this.b;
        FloatNormalView.l(floatNormalView, FloatNormalView.k(floatNormalView) + param1MotionEvent.getRawX() - FloatNormalView.p(this.b));
        floatNormalView = this.b;
        FloatNormalView.o(floatNormalView, FloatNormalView.n(floatNormalView) + param1MotionEvent.getRawY() - FloatNormalView.c(this.b));
      } 
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/FloatNormalView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */