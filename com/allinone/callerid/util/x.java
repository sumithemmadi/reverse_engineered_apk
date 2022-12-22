package com.allinone.callerid.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class x {
  private Context a;
  
  private IntentFilter b;
  
  private b c;
  
  private a d;
  
  public x(Context paramContext) {
    this.a = paramContext;
    this.b = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
  }
  
  public void b(b paramb) {
    this.c = paramb;
    this.d = new a(this);
  }
  
  public void c() {
    a a1 = this.d;
    if (a1 != null)
      this.a.registerReceiver(a1, this.b); 
  }
  
  public void d() {
    a a1 = this.d;
    if (a1 != null)
      this.a.unregisterReceiver(a1); 
  }
  
  class a extends BroadcastReceiver {
    final String a = "reason";
    
    final String b = "globalactions";
    
    final String c = "recentapps";
    
    final String d = "homekey";
    
    a(x this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if (param1Intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
        String str = param1Intent.getStringExtra("reason");
        if (str != null && x.a(this.e) != null)
          if (str.equals("homekey")) {
            x.a(this.e).b();
          } else if (str.equals("recentapps")) {
            x.a(this.e).a();
          }  
      } 
    }
  }
  
  public static interface b {
    void a();
    
    void b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */