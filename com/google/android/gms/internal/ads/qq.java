package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class qq implements DialogInterface.OnClickListener {
  qq(JsPromptResult paramJsPromptResult, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt) {
    this.b.confirm(this.c.getText().toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */