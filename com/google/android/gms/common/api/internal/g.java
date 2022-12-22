package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.t;

public class g {
  private final Object a;
  
  public g(Activity paramActivity) {
    this.a = t.k(paramActivity, "Activity must not be null");
  }
  
  public Activity a() {
    return (Activity)this.a;
  }
  
  public FragmentActivity b() {
    return (FragmentActivity)this.a;
  }
  
  public boolean c() {
    return this.a instanceof FragmentActivity;
  }
  
  public final boolean d() {
    return this.a instanceof Activity;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */