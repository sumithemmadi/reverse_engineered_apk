package com.allinone.callerid.util.gg;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.l;

public class AppOpenManager_LifecycleAdapter implements d {
  final AppOpenManager a;
  
  AppOpenManager_LifecycleAdapter(AppOpenManager paramAppOpenManager) {
    this.a = paramAppOpenManager;
  }
  
  public void a(h paramh, Lifecycle.Event paramEvent, boolean paramBoolean, l paraml) {
    boolean bool;
    if (paraml != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (paramBoolean)
      return; 
    if (paramEvent == Lifecycle.Event.ON_START) {
      if (!bool || paraml.a("onStart", 1))
        this.a.onStart(); 
      return;
    } 
    if (paramEvent == Lifecycle.Event.ON_CREATE) {
      if (!bool || paraml.a("onCreate", 1))
        this.a.onCreate(); 
      return;
    } 
    if (paramEvent == Lifecycle.Event.ON_RESUME) {
      if (!bool || paraml.a("onResume", 1))
        this.a.onResume(); 
      return;
    } 
    if (paramEvent == Lifecycle.Event.ON_PAUSE) {
      if (!bool || paraml.a("onPause", 1))
        this.a.onPause(); 
      return;
    } 
    if (paramEvent == Lifecycle.Event.ON_STOP) {
      if (!bool || paraml.a("onStop", 1))
        this.a.onStop(); 
      return;
    } 
    if (paramEvent == Lifecycle.Event.ON_DESTROY && (!bool || paraml.a("onDestroy", 1)))
      this.a.onDestroy(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/gg/AppOpenManager_LifecycleAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */