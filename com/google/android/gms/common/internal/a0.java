package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.h;

final class a0 extends g {
  a0(Intent paramIntent, h paramh, int paramInt) {}
  
  public final void c() {
    Intent intent = this.b;
    if (intent != null)
      this.c.startActivityForResult(intent, this.d); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */