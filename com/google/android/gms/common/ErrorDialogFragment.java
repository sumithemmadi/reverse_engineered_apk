package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.t;

public class ErrorDialogFragment extends DialogFragment {
  private Dialog b = null;
  
  private DialogInterface.OnCancelListener c = null;
  
  public static ErrorDialogFragment a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener) {
    ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
    paramDialog = (Dialog)t.k(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    errorDialogFragment.b = paramDialog;
    if (paramOnCancelListener != null)
      errorDialogFragment.c = paramOnCancelListener; 
    return errorDialogFragment;
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {
    DialogInterface.OnCancelListener onCancelListener = this.c;
    if (onCancelListener != null)
      onCancelListener.onCancel(paramDialogInterface); 
  }
  
  public Dialog onCreateDialog(Bundle paramBundle) {
    if (this.b == null)
      setShowsDialog(false); 
    return this.b;
  }
  
  public void show(FragmentManager paramFragmentManager, String paramString) {
    super.show(paramFragmentManager, paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/ErrorDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */