package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.b.b.a;
import c.c.a.a.b.b.f;
import com.google.android.gms.common.util.v.a;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class CloudMessagingReceiver extends BroadcastReceiver {
  private final ExecutorService a = a.a().c((ThreadFactory)new a("firebase-iid-executor"), f.a);
  
  private final int e(Context paramContext, Intent paramIntent) {
    PendingIntent pendingIntent = (PendingIntent)paramIntent.getParcelableExtra("pending_intent");
    if (pendingIntent != null)
      try {
        pendingIntent.send();
      } catch (android.app.PendingIntent.CanceledException canceledException) {
        Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
      }  
    Bundle bundle = paramIntent.getExtras();
    if (bundle != null) {
      bundle.remove("pending_intent");
    } else {
      bundle = new Bundle();
    } 
    if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(paramIntent.getAction())) {
      d(paramContext, bundle);
    } else {
      if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(paramIntent.getAction())) {
        c(paramContext, bundle);
        return -1;
      } 
      Log.e("CloudMessagingReceiver", "Unknown notification action");
      return 500;
    } 
    return -1;
  }
  
  private final int g(Context paramContext, Intent paramIntent) {
    g<Void> g;
    if (paramIntent.getExtras() == null)
      return 500; 
    String str = paramIntent.getStringExtra("google.message_id");
    if (TextUtils.isEmpty(str)) {
      g = j.e(null);
    } else {
      Bundle bundle = new Bundle();
      bundle.putString("google.message_id", str);
      g = f.c(paramContext).d(2, bundle);
    } 
    int i = b(paramContext, new CloudMessage(paramIntent));
    try {
      j.b(g, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
    } catch (ExecutionException executionException) {
      String str1 = String.valueOf(executionException);
      StringBuilder stringBuilder = new StringBuilder(str1.length() + 20);
      stringBuilder.append("Message ack failed: ");
      stringBuilder.append(str1);
      Log.w("CloudMessagingReceiver", stringBuilder.toString());
    } catch (InterruptedException interruptedException) {
    
    } catch (TimeoutException timeoutException) {}
    return i;
  }
  
  protected Executor a() {
    return this.a;
  }
  
  protected abstract int b(Context paramContext, CloudMessage paramCloudMessage);
  
  protected void c(Context paramContext, Bundle paramBundle) {}
  
  protected void d(Context paramContext, Bundle paramBundle) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    if (paramIntent == null)
      return; 
    boolean bool = isOrderedBroadcast();
    BroadcastReceiver.PendingResult pendingResult = goAsync();
    a().execute(new e(this, paramIntent, paramContext, bool, pendingResult));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/CloudMessagingReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */