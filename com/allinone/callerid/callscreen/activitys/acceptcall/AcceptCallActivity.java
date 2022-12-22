package com.allinone.callerid.callscreen.activitys.acceptcall;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import java.io.IOException;

public class AcceptCallActivity extends Activity {
  private KeyguardManager b;
  
  private AudioManager c;
  
  private b d;
  
  private void a() {
    boolean bool;
    if ("HTC".equalsIgnoreCase(Build.MANUFACTURER) && !this.c.isWiredHeadsetOn()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      b(false); 
    try {
      Runtime runtime = Runtime.getRuntime();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("input keyevent ");
      stringBuilder.append(Integer.toString(79));
      runtime.exec(stringBuilder.toString());
    } catch (IOException iOException) {
      Intent intent2 = new Intent();
      this("android.intent.action.MEDIA_BUTTON");
      KeyEvent keyEvent2 = new KeyEvent();
      this(0, 79);
      Intent intent3 = intent2.putExtra("android.intent.extra.KEY_EVENT", (Parcelable)keyEvent2);
      Intent intent4 = new Intent();
      this("android.intent.action.MEDIA_BUTTON");
      KeyEvent keyEvent1 = new KeyEvent();
      this(1, 79);
      Intent intent1 = intent4.putExtra("android.intent.extra.KEY_EVENT", (Parcelable)keyEvent1);
      sendOrderedBroadcast(intent3, "android.permission.CALL_PRIVILEGED");
      sendOrderedBroadcast(intent1, "android.permission.CALL_PRIVILEGED");
    } finally {
      Exception exception;
    } 
    if (bool)
      b(false); 
  }
  
  private void b(boolean paramBoolean) {
    Intent intent = new Intent("android.intent.action.HEADSET_PLUG");
    intent.addFlags(1073741824);
    intent.putExtra("state", paramBoolean);
    intent.putExtra("name", "mysms");
    try {
      sendOrderedBroadcast(intent, null);
    } catch (Exception exception) {}
  }
  
  private void c() {
    this.d = new b(null);
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.PHONE_STATE");
    registerReceiver(this.d, intentFilter);
  }
  
  private void d() {
    if (this.b.inKeyguardRestrictedInputMode()) {
      getWindow().addFlags(6815744);
    } else {
      getWindow().clearFlags(4718720);
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.b = (KeyguardManager)getSystemService("keyguard");
    this.c = (AudioManager)getSystemService("audio");
  }
  
  protected void onPause() {
    super.onPause();
    b b1 = this.d;
    if (b1 != null) {
      unregisterReceiver(b1);
      this.d = null;
    } 
  }
  
  protected void onResume() {
    super.onResume();
    c();
    d();
    a();
  }
  
  private class b extends BroadcastReceiver {
    private b(AcceptCallActivity this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      this.a.finish();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/activitys/acceptcall/AcceptCallActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */