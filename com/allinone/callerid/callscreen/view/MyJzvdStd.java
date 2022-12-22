package com.allinone.callerid.callscreen.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;
import com.allinone.callerid.util.q;

public class MyJzvdStd extends JzvdStd {
  private boolean F0;
  
  public MyJzvdStd(Context paramContext) {
    super(paramContext);
  }
  
  public MyJzvdStd(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public void A() {
    super.A();
  }
  
  public void B() {
    super.B();
  }
  
  public void C(int paramInt1, int paramInt2) {
    super.C(paramInt1, paramInt2);
    Log.i("JZVD", "onVideoSizeChanged");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("isSilence:");
    stringBuilder.append(this.F0);
    Log.i("JZVD", stringBuilder.toString());
    if (this.F0)
      ((Jzvd)this).s.setVolume(0.0F, 0.0F); 
  }
  
  public void L() {
    super.L();
    Log.i("JZVD", "startVideo");
  }
  
  public void P() {
    super.P();
  }
  
  public void Q() {
    super.Q();
  }
  
  public void R() {
    super.R();
  }
  
  public void S() {
    super.S();
  }
  
  public void T() {
    super.T();
  }
  
  public void U() {
    super.U();
  }
  
  public void V() {
    super.V();
  }
  
  public void W() {
    super.W();
  }
  
  public int getLayoutId() {
    return 2131493065;
  }
  
  public void i0() {
    super.i0();
    Log.i("JZVD", "click blank");
  }
  
  public void n() {
    super.n();
    Log.i("JZVD", "goto Fullscreen");
  }
  
  public void o() {
    super.o();
    Log.i("JZVD", "quit Fullscreen");
  }
  
  public void onClick(View paramView) {
    super.onClick(paramView);
    int i = paramView.getId();
    if (i == 2131296831) {
      Log.i("JZVD", "onClick: fullscreen button");
    } else if (i == 2131297656) {
      Log.i("JZVD", "onClick: start button");
    } 
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {
    super.onStopTrackingTouch(paramSeekBar);
    Log.i("JZVD", "Seek position ");
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    super.onTouch(paramView, paramMotionEvent);
    if (paramView.getId() == 2131297684 && paramMotionEvent.getAction() == 1) {
      if (((Jzvd)this).Q)
        Log.i("JZVD", "Touch screen seek position"); 
      if (((Jzvd)this).P)
        Log.i("JZVD", "Touch screen change volume"); 
    } 
    return false;
  }
  
  public void p(Context paramContext) {
    super.p(paramContext);
  }
  
  public void r(int paramInt1, int paramInt2) {
    super.r(paramInt1, paramInt2);
  }
  
  public void s(int paramInt1, int paramInt2) {
    super.s(paramInt1, paramInt2);
  }
  
  public void setSilence(boolean paramBoolean) {
    this.F0 = paramBoolean;
  }
  
  public void w() {
    super.w();
    Log.i("JZVD", "Auto complete");
  }
  
  public void x() {
    super.x();
    q.b().c("callscreen_play_error");
  }
  
  public void y() {
    super.y();
  }
  
  public void z() {
    super.z();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/view/MyJzvdStd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */