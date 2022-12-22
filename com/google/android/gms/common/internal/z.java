package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class z extends g {
  z(Intent paramIntent, Activity paramActivity, int paramInt) {}
  
  public final void c() {
    Intent intent = this.b;
    if (intent != null)
      this.c.startActivityForResult(intent, this.d); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */