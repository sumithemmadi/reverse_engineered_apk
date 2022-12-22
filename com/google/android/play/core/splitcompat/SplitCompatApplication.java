package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;

public class SplitCompatApplication extends Application {
  protected void attachBaseContext(Context paramContext) {
    super.attachBaseContext(paramContext);
    a.g((Context)this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/SplitCompatApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */