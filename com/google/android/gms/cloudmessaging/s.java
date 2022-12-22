package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

final class s extends q<Bundle> {
  s(int paramInt1, int paramInt2, Bundle paramBundle) {
    super(paramInt1, 1, paramBundle);
  }
  
  final void a(Bundle paramBundle) {
    Bundle bundle = paramBundle.getBundle("data");
    paramBundle = bundle;
    if (bundle == null)
      paramBundle = Bundle.EMPTY; 
    c((T)paramBundle);
  }
  
  final boolean d() {
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */