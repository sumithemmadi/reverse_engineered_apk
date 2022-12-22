package com.allinone.callerid.g;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;

public class f extends Fragment {
  private final String c0 = "GuideOneFragment";
  
  private Typeface d0;
  
  private View e0;
  
  private void Q1(View paramView) {
    TextView textView2 = (TextView)paramView.findViewById(2131298149);
    TextView textView1 = (TextView)paramView.findViewById(2131298148);
    textView2.setTypeface(this.d0);
    textView1.setTypeface(this.d0);
  }
  
  public void I0() {
    super.I0();
  }
  
  public void L1(boolean paramBoolean) {
    super.L1(paramBoolean);
  }
  
  public void N0() {
    super.N0();
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    if (this.e0 == null) {
      i1.H0((Context)EZCallApplication.c(), (EZCallApplication.c()).f);
      this.e0 = paramLayoutInflater.inflate(2131493038, paramViewGroup, false);
      if (i1.f0(t()).booleanValue() && Build.VERSION.SDK_INT >= 17 && m() != null)
        m().getWindow().getDecorView().setLayoutDirection(1); 
      this.d0 = g1.b();
      Q1(this.e0);
    } 
    return this.e0;
  }
  
  public void x0() {
    super.x0();
  }
  
  public void z0() {
    super.z0();
    try {
      View view = this.e0;
      if (view != null) {
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null)
          viewGroup.removeView(this.e0); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */