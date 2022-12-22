package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

final class r {
  private final Context a;
  
  private final a b;
  
  private boolean c;
  
  public r(Context paramContext, Handler paramHandler, b paramb) {
    this.a = paramContext.getApplicationContext();
    this.b = new a(this, paramHandler, paramb);
  }
  
  public void b(boolean paramBoolean) {
    if (paramBoolean && !this.c) {
      this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
      this.c = true;
    } else if (!paramBoolean && this.c) {
      this.a.unregisterReceiver(this.b);
      this.c = false;
    } 
  }
  
  private final class a extends BroadcastReceiver implements Runnable {
    private final r.b b;
    
    private final Handler c;
    
    public a(r this$0, Handler param1Handler, r.b param1b) {
      this.c = param1Handler;
      this.b = param1b;
    }
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if ("android.media.AUDIO_BECOMING_NOISY".equals(param1Intent.getAction()))
        this.c.post(this); 
    }
    
    public void run() {
      if (r.a(this.d))
        this.b.e(); 
    }
  }
  
  public static interface b {
    void e();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */