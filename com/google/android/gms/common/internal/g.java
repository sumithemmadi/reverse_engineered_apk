package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.internal.h;

public abstract class g implements DialogInterface.OnClickListener {
  public static g a(Activity paramActivity, Intent paramIntent, int paramInt) {
    return new z(paramIntent, paramActivity, paramInt);
  }
  
  public static g b(h paramh, Intent paramIntent, int paramInt) {
    return new a0(paramIntent, paramh, paramInt);
  }
  
  protected abstract void c();
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt) {
    Exception exception;
    try {
      c();
      paramDialogInterface.dismiss();
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      Log.e("DialogRedirect", "Failed to start resolution intent", (Throwable)activityNotFoundException);
      paramDialogInterface.dismiss();
      return;
    } finally {}
    paramDialogInterface.dismiss();
    throw exception;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */