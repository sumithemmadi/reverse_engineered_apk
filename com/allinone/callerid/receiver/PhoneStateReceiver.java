package com.allinone.callerid.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.allinone.callerid.service.PhoneSceneService;
import com.allinone.callerid.util.d0;

public class PhoneStateReceiver extends BroadcastReceiver {
  private Context a;
  
  private int b = 0;
  
  private boolean c;
  
  private int d = 0;
  
  private String e;
  
  private String f;
  
  private String g = null;
  
  public void a(int paramInt, String paramString) {
    if (this.b == paramInt)
      return; 
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("状态:");
      stringBuilder.append(paramInt);
      d0.a("callstatus", stringBuilder.toString());
    } 
    if (paramInt != 0) {
      Intent intent;
      if (paramInt != 1) {
        if (paramInt == 2)
          if (this.b != 1) {
            this.c = false;
            this.g = this.f;
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("去电:");
              stringBuilder.append(this.f);
              d0.a("callstatus", stringBuilder.toString());
            } 
            intent = new Intent(this.a, PhoneSceneService.class);
            intent.putExtra("telephonering_sence", 2);
            intent.putExtra("telephonering_num", this.f);
            this.a.startService(intent);
          } else {
            this.c = true;
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("来电接听:");
              stringBuilder.append(this.g);
              d0.a("callstatus", stringBuilder.toString());
            } 
            intent = new Intent(this.a, PhoneSceneService.class);
            intent.putExtra("telephonering_sence", 3);
            intent.putExtra("telephonering_num", this.g);
            this.a.startService(intent);
          }  
      } else {
        this.g = (String)intent;
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("来电响铃:");
          stringBuilder.append((String)intent);
          d0.a("callstatus", stringBuilder.toString());
        } 
        this.c = true;
        Intent intent1 = new Intent(this.a, PhoneSceneService.class);
        intent1.putExtra("telephonering_sence", 1);
        intent1.putExtra("telephonering_num", (String)intent);
        intent1.setFlags(268435456);
        this.a.startService(intent1);
      } 
    } else if (this.b == 1) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("来电未接挂断:");
        stringBuilder.append(this.g);
        d0.a("callstatus", stringBuilder.toString());
      } 
      Intent intent = new Intent(this.a, PhoneSceneService.class);
      intent.putExtra("telephonering_sence", 4);
      intent.putExtra("telephonering_num", this.g);
      this.a.startService(intent);
      this.g = null;
    } else if (this.c) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("来电已接挂断:");
        stringBuilder.append(this.g);
        d0.a("callstatus", stringBuilder.toString());
      } 
      Intent intent = new Intent(this.a, PhoneSceneService.class);
      intent.putExtra("telephonering_sence", 5);
      intent.putExtra("telephonering_num", this.g);
      this.a.startService(intent);
      this.g = null;
    } else {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("去电挂断:");
        stringBuilder.append(this.g);
        d0.a("callstatus", stringBuilder.toString());
      } 
      Intent intent = new Intent(this.a, PhoneSceneService.class);
      intent.putExtra("telephonering_sence", 6);
      intent.putExtra("telephonering_num", this.g);
      this.a.startService(intent);
      this.g = null;
    } 
    this.b = paramInt;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    this.a = paramContext;
    try {
      if (!"android.intent.action.NEW_OUTGOING_CALL".equals(paramIntent.getAction()) && paramIntent.hasExtra("incoming_number")) {
        this.e = paramIntent.getExtras().getString("state");
        this.f = paramIntent.getExtras().getString("incoming_number");
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("stateChange:");
          stringBuilder.append(this.e);
          d0.a("callstatus", stringBuilder.toString());
          stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("coming_num:");
          stringBuilder.append(this.f);
          d0.a("callstatus", stringBuilder.toString());
        } 
        if (this.f != null) {
          if (this.e.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
            this.d = 0;
          } else if (this.e.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
            this.d = 2;
          } else if (this.e.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
            this.d = 1;
          } 
          a(this.d, this.f);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/receiver/PhoneStateReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */