package com.allinone.callerid.h;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.j;
import com.allinone.callerid.util.q0;
import com.allinone.callerid.util.u;

public class a extends b {
  private static volatile a c;
  
  private Context d = null;
  
  private TextView e;
  
  private TextView f;
  
  private ImageView g;
  
  private float h;
  
  private float i;
  
  private float j;
  
  private float k;
  
  private WindowManager l;
  
  private WindowManager.LayoutParams m;
  
  private TextView n;
  
  private Typeface o;
  
  public ViewGroup p;
  
  public static a o() {
    // Byte code:
    //   0: getstatic com/allinone/callerid/h/a.c : Lcom/allinone/callerid/h/a;
    //   3: ifnonnull -> 39
    //   6: ldc com/allinone/callerid/h/a
    //   8: monitorenter
    //   9: getstatic com/allinone/callerid/h/a.c : Lcom/allinone/callerid/h/a;
    //   12: ifnonnull -> 27
    //   15: new com/allinone/callerid/h/a
    //   18: astore_0
    //   19: aload_0
    //   20: invokespecial <init> : ()V
    //   23: aload_0
    //   24: putstatic com/allinone/callerid/h/a.c : Lcom/allinone/callerid/h/a;
    //   27: ldc com/allinone/callerid/h/a
    //   29: monitorexit
    //   30: goto -> 39
    //   33: astore_0
    //   34: ldc com/allinone/callerid/h/a
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    //   39: getstatic com/allinone/callerid/h/a.c : Lcom/allinone/callerid/h/a;
    //   42: areturn
    // Exception table:
    //   from	to	target	type
    //   9	27	33	finally
    //   27	30	33	finally
    //   34	37	33	finally
  }
  
  private WindowManager.LayoutParams p() {
    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
    if (Build.VERSION.SDK_INT >= 26) {
      layoutParams.type = 2038;
    } else {
      layoutParams.type = 2010;
    } 
    layoutParams.height = -2;
    layoutParams.width = -1;
    layoutParams.gravity = 51;
    layoutParams.format = 1;
    layoutParams.y = j.a((Context)EZCallApplication.c(), 100.0F);
    layoutParams.flags = 524840;
    return layoutParams;
  }
  
  private void r(Context paramContext, CallLogBean paramCallLogBean) {
    q();
    if (this.m == null)
      this.m = p(); 
    if (this.l == null)
      this.l = (WindowManager)paramContext.getSystemService("window"); 
    if (Build.VERSION.SDK_INT >= 23) {
      if (Settings.canDrawOverlays((Context)EZCallApplication.c()))
        this.p = a(paramContext, 2131493210); 
    } else {
      this.p = a(paramContext, 2131493210);
    } 
    ViewGroup viewGroup = this.p;
    if (viewGroup != null) {
      c(this.d, viewGroup, this.m);
      s((View)this.p, paramCallLogBean);
    } 
  }
  
  private void s(View paramView, CallLogBean paramCallLogBean) {
    this.f = (TextView)paramView.findViewById(2131298023);
    this.g = (ImageView)paramView.findViewById(2131297360);
    this.e = (TextView)paramView.findViewById(2131297966);
    this.n = (TextView)paramView.findViewById(2131298199);
    TextView textView = (TextView)paramView.findViewById(2131297893);
    ImageView imageView1 = (ImageView)paramView.findViewById(2131296411);
    ImageView imageView2 = (ImageView)paramView.findViewById(2131296435);
    ImageView imageView3 = (ImageView)paramView.findViewById(2131296427);
    textView.setTypeface(g1.a());
    textView.setOnClickListener(new a(this));
    imageView1.setOnClickListener(new b(this, paramCallLogBean));
    imageView2.setOnClickListener(new c(this, paramCallLogBean));
    imageView3.setOnClickListener(new d(this, paramCallLogBean));
    this.f.setText(paramCallLogBean.p());
    this.f.setTypeface(this.o);
    this.e.setTypeface(this.o);
    this.n.setTypeface(this.o);
    if (paramCallLogBean.p() != null && !"".equals(paramCallLogBean.p()))
      t(this.d, paramCallLogBean); 
    paramView.setOnTouchListener(new e(this));
  }
  
  public void q() {
    synchronized (this.b) {
      ViewGroup viewGroup = this.p;
      if (viewGroup != null) {
        try {
          WindowManager windowManager = this.l;
          if (windowManager != null) {
            windowManager.removeView((View)viewGroup);
          } else {
            ((WindowManager)EZCallApplication.c().getSystemService("window")).removeView((View)this.p);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        this.p = null;
      } 
      return;
    } 
  }
  
  public void t(Context paramContext, CallLogBean paramCallLogBean) {
    boolean bool;
    if (paramCallLogBean.n() != null && !"".equals(paramCallLogBean.n()))
      this.f.setText(paramCallLogBean.n()); 
    if (paramCallLogBean.a() != null && !"".equals(paramCallLogBean.a())) {
      u.b(this.d, paramCallLogBean.a(), 2131231148, this.g);
    } else {
      this.g.setImageResource(2131231148);
    } 
    if (paramCallLogBean.c() != null && !"".equals(paramCallLogBean.c())) {
      this.e.setVisibility(0);
      this.e.setText(paramCallLogBean.c());
    } else {
      this.e.setText("");
    } 
    if (paramCallLogBean.x() != null && !"".equals(paramCallLogBean.x())) {
      bool = Integer.parseInt(paramCallLogBean.x());
    } else {
      bool = false;
    } 
    if (paramCallLogBean.N() != null && !paramCallLogBean.N().equals("") && !bool) {
      this.g.setImageResource(2131231149);
      this.e.setVisibility(8);
      this.n.setVisibility(0);
      TextView textView = this.n;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.d.getResources().getString(2131755648));
      stringBuilder.append(" ");
      stringBuilder.append(paramCallLogBean.N());
      textView.setText(stringBuilder.toString());
      this.n.setTextColor(this.d.getResources().getColor(2131099922));
    } 
    if (paramCallLogBean.N() != null && !paramCallLogBean.N().equals("") && bool) {
      this.g.setImageResource(2131231149);
      this.e.setVisibility(8);
      this.n.setVisibility(0);
      this.n.setTextColor(this.d.getResources().getColor(2131099922));
      TextView textView = this.n;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.d.getResources().getString(2131755647));
      stringBuilder.append(" ");
      stringBuilder.append(bool);
      stringBuilder.append(" ");
      stringBuilder.append(this.d.getResources().getString(2131755793));
      stringBuilder.append(" ");
      stringBuilder.append(paramCallLogBean.N());
      textView.setText(stringBuilder.toString());
    } 
  }
  
  public void u(Context paramContext, CallLogBean paramCallLogBean) {
    synchronized (this.b) {
      this.d = paramContext;
      if (this.o == null)
        this.o = g1.b(); 
      r(paramContext, paramCallLogBean);
      return;
    } 
  }
  
  class a implements View.OnClickListener {
    a(a this$0) {}
    
    public void onClick(View param1View) {
      this.b.q();
    }
  }
  
  class b implements View.OnClickListener {
    b(a this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      this.c.q();
      try {
        q0.a(a.d(this.c), this.b.p());
      } catch (Exception exception) {
        Toast.makeText(a.d(this.c), a.d(this.c).getResources().getString(2131755541), 1).show();
      } 
    }
  }
  
  class c implements View.OnClickListener {
    c(a this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      this.c.q();
      try {
        Intent intent = new Intent();
        this("android.intent.action.VIEW");
        intent.setType("vnd.android-dir/mms-sms");
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("smsto:");
        stringBuilder.append(this.b.p());
        intent.setData(Uri.parse(stringBuilder.toString()));
        intent.addFlags(268468224);
        a.d(this.c).startActivity(intent);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class d implements View.OnClickListener {
    d(a this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      this.c.q();
      Intent intent = new Intent();
      Bundle bundle = new Bundle();
      bundle.putParcelable("contact_tony", (Parcelable)this.b);
      intent.putExtras(bundle);
      intent.setClass(a.d(this.c), UnknownContactActivity.class);
      intent.setFlags(268435456);
      a.d(this.c).startActivity(intent);
    }
  }
  
  class e implements View.OnTouchListener {
    e(a this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      a a1;
      int i = param1MotionEvent.getAction();
      if (i != 0) {
        if (i != 1) {
          if (i == 2) {
            a.j(this.b, param1MotionEvent.getRawX());
            a.l(this.b, param1MotionEvent.getRawY());
            (a.m(this.b)).x = (int)(a.i(this.b) - a.e(this.b));
            (a.m(this.b)).y = (int)(a.k(this.b) - a.g(this.b));
            try {
              a.n(this.b).updateViewLayout(param1View, (ViewGroup.LayoutParams)a.m(this.b));
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } 
        } else {
          (a.m(this.b)).x = (int)(a.i(this.b) - a.e(this.b));
          (a.m(this.b)).y = (int)(a.k(this.b) - a.g(this.b));
          try {
            a.n(this.b).updateViewLayout((View)exception, (ViewGroup.LayoutParams)a.m(this.b));
          } catch (Exception exception1) {
            exception1.printStackTrace();
          } 
          a1 = this.b;
          a.f(a1, a.h(a1, 0.0F));
          exception.performClick();
        } 
      } else {
        a.f(this.b, a1.getX());
        a.h(this.b, a1.getY());
      } 
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */