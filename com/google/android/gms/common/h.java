package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.c;
import com.google.android.gms.common.internal.t;

public class h extends c {
  private Dialog s0 = null;
  
  private DialogInterface.OnCancelListener t0 = null;
  
  public static h f2(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener) {
    h h1 = new h();
    paramDialog = (Dialog)t.k(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    h1.s0 = paramDialog;
    if (paramOnCancelListener != null)
      h1.t0 = paramOnCancelListener; 
    return h1;
  }
  
  public Dialog X1(Bundle paramBundle) {
    if (this.s0 == null)
      c2(false); 
    return this.s0;
  }
  
  public void e2(FragmentManager paramFragmentManager, String paramString) {
    super.e2(paramFragmentManager, paramString);
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {
    DialogInterface.OnCancelListener onCancelListener = this.t0;
    if (onCancelListener != null)
      onCancelListener.onCancel(paramDialogInterface); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */