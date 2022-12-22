package com.allinone.callerid.mvc.controller.block;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class BlockSettingActivity extends BaseActivity implements View.OnClickListener {
  private FrameLayout A;
  
  private FrameLayout B;
  
  private FrameLayout C;
  
  private FrameLayout D;
  
  private boolean E;
  
  private int F;
  
  private final String s = "BlockSettingActivity";
  
  private TextView t;
  
  private TextView u;
  
  private TextView v;
  
  private Switch w;
  
  private Switch x;
  
  private Switch y;
  
  private LinearLayout z;
  
  private void O() {
    try {
      AlertDialog.Builder builder1 = new AlertDialog.Builder();
      this((Context)this);
      AlertDialog.Builder builder2 = builder1.setTitle(getResources().getString(2131755615)).setMessage(getResources().getString(2131755614));
      String str = getResources().getString(2131755797);
      b b = new b();
      this(this);
      AlertDialog alertDialog = builder2.setPositiveButton(str, b).create();
      alertDialog.show();
      alertDialog.getButton(-1).setTextColor(this.F);
      alertDialog.getButton(-2).setTextColor(getResources().getColor(2131099695));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void j0() {
    try {
      if (!b1.y2().booleanValue()) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d(getApplicationContext())) {
          q.b().c("setting_norifi_per_show");
          this.z.setVisibility(0);
          this.A.setVisibility(8);
          this.B.setAlpha(0.3F);
          this.C.setAlpha(0.3F);
          this.D.setAlpha(0.3F);
          this.w.setEnabled(false);
          this.x.setEnabled(false);
          this.y.setEnabled(false);
          return;
        } 
      } 
      this.z.setVisibility(8);
      this.A.setVisibility(0);
      this.B.setAlpha(1.0F);
      this.C.setAlpha(1.0F);
      this.D.setAlpha(1.0F);
      this.w.setEnabled(true);
      this.x.setEnabled(true);
      this.y.setEnabled(true);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void i0() {
    boolean bool = b1.u();
    this.w.setChecked(bool);
    if (bool) {
      this.t.setText(getResources().getString(2131755406));
    } else {
      this.t.setText(getResources().getString(2131755405));
    } 
  }
  
  public void k0() {
    boolean bool = b1.v();
    this.x.setChecked(bool);
    if (bool) {
      this.u.setText(getResources().getString(2131755407));
    } else {
      this.u.setText(getResources().getString(2131755405));
    } 
  }
  
  public void l0() {
    boolean bool = b1.w();
    this.y.setChecked(bool);
    if (bool) {
      this.v.setText(getResources().getString(2131755828));
    } else {
      this.v.setText(getResources().getString(2131755405));
    } 
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131298202:
        O();
      case 2131297000:
        O();
      case 2131296818:
        this.E = true;
        q.b().c("setting_norifi_per_click");
        com.allinone.callerid.util.k1.b.c(getApplicationContext());
      case 2131296817:
        break;
    } 
    this.E = true;
    q.b().c("setting_norifi_per_click");
    com.allinone.callerid.util.k1.b.c(getApplicationContext());
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492904);
    Typeface typeface = g1.b();
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    getWindow().getDecorView().post(new a(this, typeface));
  }
  
  protected void onDestroy() {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      finish();
      overridePendingTransition(2130771968, 2130771969);
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onRestart() {
    super.onRestart();
    j0();
  }
  
  protected void onResume() {
    super.onResume();
    if (this.E) {
      this.E = false;
      if (com.allinone.callerid.util.k1.b.b(getApplicationContext()))
        q.b().c("setting_norifi_per_enalbleed"); 
    } 
  }
  
  class a implements Runnable {
    a(BlockSettingActivity this$0, Typeface param1Typeface) {}
    
    public void run() {
      BlockSettingActivity blockSettingActivity3 = this.c;
      BlockSettingActivity.P(blockSettingActivity3, d1.a((Context)blockSettingActivity3, 2130968859, 2131099706));
      TextView textView2 = (TextView)this.c.findViewById(2131297809);
      ImageView imageView1 = (ImageView)this.c.findViewById(2131296850);
      if (i1.f0(this.c.getApplicationContext()).booleanValue())
        imageView1.setImageResource(2131231059); 
      imageView1.setOnClickListener(new a(this));
      textView2.setTypeface(this.b);
      ((TextView)this.c.findViewById(2131297811)).setTypeface(this.b);
      ((TextView)this.c.findViewById(2131297812)).setTypeface(this.b);
      ((TextView)this.c.findViewById(2131297820)).setTypeface(this.b);
      ((TextView)this.c.findViewById(2131297816)).setTypeface(this.b);
      BlockSettingActivity blockSettingActivity2 = this.c;
      BlockSettingActivity.S(blockSettingActivity2, (FrameLayout)blockSettingActivity2.findViewById(2131297478));
      blockSettingActivity2 = this.c;
      BlockSettingActivity.W(blockSettingActivity2, (FrameLayout)blockSettingActivity2.findViewById(2131297481));
      blockSettingActivity2 = this.c;
      BlockSettingActivity.X(blockSettingActivity2, (FrameLayout)blockSettingActivity2.findViewById(2131297477));
      blockSettingActivity2 = this.c;
      BlockSettingActivity.Y(blockSettingActivity2, (FrameLayout)blockSettingActivity2.findViewById(2131297542));
      blockSettingActivity2 = this.c;
      BlockSettingActivity.Z(blockSettingActivity2, (LinearLayout)blockSettingActivity2.findViewById(2131297190));
      FrameLayout frameLayout = (FrameLayout)this.c.findViewById(2131296817);
      ImageView imageView2 = (ImageView)this.c.findViewById(2131296818);
      TextView textView1 = (TextView)this.c.findViewById(2131298202);
      textView1.setTypeface(this.b);
      textView1.setOnClickListener(this.c);
      imageView2.setOnClickListener(this.c);
      frameLayout.setOnClickListener(this.c);
      ((ImageView)this.c.findViewById(2131297000)).setOnClickListener(this.c);
      BlockSettingActivity blockSettingActivity1 = this.c;
      BlockSettingActivity.b0(blockSettingActivity1, (TextView)blockSettingActivity1.findViewById(2131297708));
      BlockSettingActivity.a0(this.c).setTypeface(this.b);
      blockSettingActivity1 = this.c;
      BlockSettingActivity.d0(blockSettingActivity1, (TextView)blockSettingActivity1.findViewById(2131298203));
      BlockSettingActivity.c0(this.c).setTypeface(this.b);
      blockSettingActivity1 = this.c;
      BlockSettingActivity.f0(blockSettingActivity1, (Switch)blockSettingActivity1.findViewById(2131297698));
      blockSettingActivity1 = this.c;
      BlockSettingActivity.h0(blockSettingActivity1, (TextView)blockSettingActivity1.findViewById(2131297707));
      BlockSettingActivity.g0(this.c).setTypeface(this.b);
      blockSettingActivity1 = this.c;
      BlockSettingActivity.R(blockSettingActivity1, (Switch)blockSettingActivity1.findViewById(2131297709));
      blockSettingActivity1 = this.c;
      BlockSettingActivity.U(blockSettingActivity1, (Switch)blockSettingActivity1.findViewById(2131297711));
      BlockSettingActivity.e0(this.c).setOnCheckedChangeListener(new b(this));
      BlockSettingActivity.Q(this.c).setOnCheckedChangeListener(new c(this));
      BlockSettingActivity.T(this.c).setOnCheckedChangeListener(new d(this));
      this.c.i0();
      this.c.k0();
      this.c.l0();
      BlockSettingActivity.V(this.c);
    }
    
    class a implements View.OnClickListener {
      a(BlockSettingActivity.a this$0) {}
      
      public void onClick(View param2View) {
        this.b.c.finish();
        this.b.c.overridePendingTransition(2130771968, 2130771969);
      }
    }
    
    class b implements CompoundButton.OnCheckedChangeListener {
      b(BlockSettingActivity.a this$0) {}
      
      public void onCheckedChanged(CompoundButton param2CompoundButton, boolean param2Boolean) {
        if (param2Boolean) {
          BlockSettingActivity.a0(this.a.c).setText(this.a.c.getResources().getString(2131755406));
          b1.Y0(true);
        } else {
          BlockSettingActivity.a0(this.a.c).setText(this.a.c.getResources().getString(2131755405));
          b1.Y0(false);
        } 
        BlockSettingActivity.e0(this.a.c).setChecked(param2Boolean);
      }
    }
    
    class c implements CompoundButton.OnCheckedChangeListener {
      c(BlockSettingActivity.a this$0) {}
      
      public void onCheckedChanged(CompoundButton param2CompoundButton, boolean param2Boolean) {
        if (param2Boolean) {
          BlockSettingActivity.g0(this.a.c).setText(this.a.c.getResources().getString(2131755407));
          b1.Z0(true);
        } else {
          BlockSettingActivity.g0(this.a.c).setText(this.a.c.getResources().getString(2131755405));
          b1.Z0(false);
        } 
        BlockSettingActivity.Q(this.a.c).setChecked(param2Boolean);
      }
    }
    
    class d implements CompoundButton.OnCheckedChangeListener {
      d(BlockSettingActivity.a this$0) {}
      
      public void onCheckedChanged(CompoundButton param2CompoundButton, boolean param2Boolean) {
        if (param2Boolean) {
          q.b().c("block_unknown_open");
          BlockSettingActivity.c0(this.a.c).setText(this.a.c.getResources().getString(2131755828));
          b1.a1(true);
        } else {
          q.b().c("block_unknown_close");
          BlockSettingActivity.c0(this.a.c).setText(this.a.c.getResources().getString(2131755405));
          b1.a1(false);
        } 
        BlockSettingActivity.T(this.a.c).setChecked(param2Boolean);
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(BlockSettingActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.c.finish();
      this.b.c.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class b implements CompoundButton.OnCheckedChangeListener {
    b(BlockSettingActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        BlockSettingActivity.a0(this.a.c).setText(this.a.c.getResources().getString(2131755406));
        b1.Y0(true);
      } else {
        BlockSettingActivity.a0(this.a.c).setText(this.a.c.getResources().getString(2131755405));
        b1.Y0(false);
      } 
      BlockSettingActivity.e0(this.a.c).setChecked(param1Boolean);
    }
  }
  
  class c implements CompoundButton.OnCheckedChangeListener {
    c(BlockSettingActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        BlockSettingActivity.g0(this.a.c).setText(this.a.c.getResources().getString(2131755407));
        b1.Z0(true);
      } else {
        BlockSettingActivity.g0(this.a.c).setText(this.a.c.getResources().getString(2131755405));
        b1.Z0(false);
      } 
      BlockSettingActivity.Q(this.a.c).setChecked(param1Boolean);
    }
  }
  
  class d implements CompoundButton.OnCheckedChangeListener {
    d(BlockSettingActivity this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        q.b().c("block_unknown_open");
        BlockSettingActivity.c0(this.a.c).setText(this.a.c.getResources().getString(2131755828));
        b1.a1(true);
      } else {
        q.b().c("block_unknown_close");
        BlockSettingActivity.c0(this.a.c).setText(this.a.c.getResources().getString(2131755405));
        b1.a1(false);
      } 
      BlockSettingActivity.T(this.a.c).setChecked(param1Boolean);
    }
  }
  
  class b implements DialogInterface.OnClickListener {
    b(BlockSettingActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/block/BlockSettingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */