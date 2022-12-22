package com.google.android.play.core.missingsplits;

import android.app.Application;
import android.content.Context;

@Deprecated
public class MissingSplitsDetectingApplication extends Application {
  private boolean b = false;
  
  @Deprecated
  public void a() {}
  
  public final void onCreate() {
    if (!this.b) {
      this.b = true;
      if (b.a((Context)this).a())
        return; 
      super.onCreate();
      a();
      return;
    } 
    throw new IllegalStateException("The onCreate method must be invoked at most once.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/missingsplits/MissingSplitsDetectingApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */