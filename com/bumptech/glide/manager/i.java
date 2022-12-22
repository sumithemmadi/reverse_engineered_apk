package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class i implements k, ComponentCallbacks2 {
  public void a(Activity paramActivity) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onLowMemory() {
    onTrimMemory(20);
  }
  
  public void onTrimMemory(int paramInt) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/manager/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */