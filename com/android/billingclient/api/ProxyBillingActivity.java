package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c.c.a.a.b.d.a;

public class ProxyBillingActivity extends Activity {
  private ResultReceiver b;
  
  private boolean c;
  
  private final Intent a() {
    Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
    intent.setPackage(getApplicationContext().getPackageName());
    return intent;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 100) {
      int i = a.c(paramIntent, "ProxyBillingActivity").b();
      paramInt1 = paramInt2;
      if (paramInt2 == -1)
        if (i != 0) {
          paramInt1 = -1;
        } else {
          paramInt1 = 0;
          ResultReceiver resultReceiver1 = this.b;
        }  
      StringBuilder stringBuilder = new StringBuilder(85);
      stringBuilder.append("Activity finished with resultCode ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" and billing's responseCode: ");
      stringBuilder.append(i);
      a.b("ProxyBillingActivity", stringBuilder.toString());
      paramInt1 = i;
    } else {
      StringBuilder stringBuilder = new StringBuilder(69);
      stringBuilder.append("Got onActivityResult with wrong requestCode: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append("; skipping...");
      a.b("ProxyBillingActivity", stringBuilder.toString());
      this.c = false;
      finish();
    } 
    ResultReceiver resultReceiver = this.b;
  }
  
  protected void onCreate(Bundle paramBundle) {
    Intent intent;
    super.onCreate(paramBundle);
    if (paramBundle == null) {
      a.a("ProxyBillingActivity", "Launching Play Store billing flow");
      if (getIntent().hasExtra("BUY_INTENT")) {
        PendingIntent pendingIntent = (PendingIntent)getIntent().getParcelableExtra("BUY_INTENT");
      } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
        PendingIntent pendingIntent = (PendingIntent)getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
        this.b = (ResultReceiver)getIntent().getParcelableExtra("result_receiver");
      } else {
        paramBundle = null;
      } 
      try {
        this.c = true;
        IntentSender intentSender = paramBundle.getIntentSender();
        Intent intent1 = new Intent();
        this();
        startIntentSenderForResult(intentSender, 100, intent1, 0, 0, 0);
        return;
      } catch (android.content.IntentSender.SendIntentException sendIntentException) {
        String str = String.valueOf(sendIntentException);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 53);
        stringBuilder.append("Got exception while trying to start a purchase flow: ");
        stringBuilder.append(str);
        a.b("ProxyBillingActivity", stringBuilder.toString());
        ResultReceiver resultReceiver = this.b;
        if (resultReceiver != null) {
          resultReceiver.send(6, null);
        } else {
          intent = a();
          intent.putExtra("RESPONSE_CODE", 6);
          intent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
          sendBroadcast(intent);
        } 
        this.c = false;
        finish();
        return;
      } 
    } 
    a.a("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
    this.c = intent.getBoolean("send_cancelled_broadcast_if_finished", false);
    if (intent.containsKey("result_receiver"))
      this.b = (ResultReceiver)intent.getParcelable("result_receiver"); 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    if (!isFinishing())
      return; 
    if (!this.c)
      return; 
    Intent intent = a();
    intent.putExtra("RESPONSE_CODE", 1);
    intent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
    sendBroadcast(intent);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    ResultReceiver resultReceiver = this.b;
    if (resultReceiver != null)
      paramBundle.putParcelable("result_receiver", (Parcelable)resultReceiver); 
    paramBundle.putBoolean("send_cancelled_broadcast_if_finished", this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/ProxyBillingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */