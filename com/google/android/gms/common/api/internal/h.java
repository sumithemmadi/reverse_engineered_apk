package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

public interface h {
  void b(String paramString, LifecycleCallback paramLifecycleCallback);
  
  <T extends LifecycleCallback> T d(String paramString, Class<T> paramClass);
  
  Activity e();
  
  void startActivityForResult(Intent paramIntent, int paramInt);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */