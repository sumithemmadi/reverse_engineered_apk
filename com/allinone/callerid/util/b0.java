package com.allinone.callerid.util;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.allinone.callerid.mvc.controller.SinglePixelActivity;
import com.allinone.callerid.receiver.KeepReceiver;
import java.lang.ref.WeakReference;

public class b0 {
  private static final b0 a = new b0();
  
  private KeepReceiver b;
  
  private WeakReference<Activity> c;
  
  public static b0 b() {
    return a;
  }
  
  public void a() {
    try {
      WeakReference<Activity> weakReference = this.c;
      if (weakReference != null) {
        Activity activity = weakReference.get();
        if (activity != null)
          activity.finish(); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void c(Context paramContext) {
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.SCREEN_ON");
    intentFilter.addAction("android.intent.action.SCREEN_OFF");
    KeepReceiver keepReceiver = new KeepReceiver();
    this.b = keepReceiver;
    paramContext.registerReceiver((BroadcastReceiver)keepReceiver, intentFilter);
  }
  
  public void d(SinglePixelActivity paramSinglePixelActivity) {
    this.c = new WeakReference(paramSinglePixelActivity);
  }
  
  public void e(Context paramContext) {
    try {
      Intent intent = new Intent();
      this(paramContext, SinglePixelActivity.class);
      intent.setFlags(268435456);
      paramContext.startActivity(intent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void f(Context paramContext) {
    KeepReceiver keepReceiver = this.b;
    if (keepReceiver != null)
      paramContext.unregisterReceiver((BroadcastReceiver)keepReceiver); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */