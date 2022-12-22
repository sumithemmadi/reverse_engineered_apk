package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

final class o extends q<Void> {
  o(int paramInt1, int paramInt2, Bundle paramBundle) {
    super(paramInt1, 2, paramBundle);
  }
  
  final void a(Bundle paramBundle) {
    if (paramBundle.getBoolean("ack", false)) {
      c(null);
      return;
    } 
    b(new zzp(4, "Invalid response to one way request"));
  }
  
  final boolean d() {
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */