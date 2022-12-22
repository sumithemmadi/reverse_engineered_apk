package com.allinone.callerid.customview;

import com.google.android.material.appbar.AppBarLayout;

public abstract class AppBarStateChangeListener implements AppBarLayout.d {
  private State a = State.d;
  
  public final void a(AppBarLayout paramAppBarLayout, int paramInt) {
    if (paramInt == 0) {
      State state1 = this.a;
      State state2 = State.b;
      if (state1 != state2)
        b(paramAppBarLayout, state2); 
      this.a = state2;
    } else if (Math.abs(paramInt) >= paramAppBarLayout.getTotalScrollRange()) {
      State state1 = this.a;
      State state2 = State.c;
      if (state1 != state2)
        b(paramAppBarLayout, state2); 
      this.a = state2;
    } else {
      State state1 = this.a;
      State state2 = State.d;
      if (state1 != state2)
        b(paramAppBarLayout, state2); 
      this.a = state2;
    } 
  }
  
  public abstract void b(AppBarLayout paramAppBarLayout, State paramState);
  
  public enum State {
    b, c, d;
    
    static {
      State state1 = new State("EXPANDED", 0);
      b = state1;
      State state2 = new State("COLLAPSED", 1);
      c = state2;
      State state3 = new State("IDLE", 2);
      d = state3;
      e = new State[] { state1, state2, state3 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/AppBarStateChangeListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */