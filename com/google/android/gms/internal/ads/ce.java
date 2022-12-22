package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;

final class ce implements DialogInterface.OnClickListener {
  ce(de paramde) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt) {
    Intent intent = this.b.h();
    q.c();
    h1.k(de.j(this.b), intent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */