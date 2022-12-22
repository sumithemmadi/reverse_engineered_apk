package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.a;
import java.util.Arrays;

public class a extends a {
  private static d c;
  
  public static void m(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.finishAffinity();
    } else {
      paramActivity.finish();
    } 
  }
  
  public static void n(Activity paramActivity) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      paramActivity.recreate();
    } else if (i <= 23) {
      (new Handler(paramActivity.getMainLooper())).post(new b(paramActivity));
    } else if (!d.i(paramActivity)) {
      paramActivity.recreate();
    } 
  }
  
  public static void o(Activity paramActivity, String[] paramArrayOfString, int paramInt) {
    StringBuilder stringBuilder;
    d d1 = c;
    if (d1 != null && d1.a(paramActivity, paramArrayOfString, paramInt))
      return; 
    int i = paramArrayOfString.length;
    byte b = 0;
    while (b < i) {
      if (!TextUtils.isEmpty(paramArrayOfString[b])) {
        b++;
        continue;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Permission request for permissions ");
      stringBuilder.append(Arrays.toString((Object[])paramArrayOfString));
      stringBuilder.append(" must not contain null or empty values");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    if (Build.VERSION.SDK_INT >= 23) {
      if (stringBuilder instanceof e)
        ((e)stringBuilder).b(paramInt); 
      stringBuilder.requestPermissions(paramArrayOfString, paramInt);
    } else if (stringBuilder instanceof c) {
      (new Handler(Looper.getMainLooper())).post(new a(paramArrayOfString, (Activity)stringBuilder, paramInt));
    } 
  }
  
  public static void p(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
    } else {
      paramActivity.startActivityForResult(paramIntent, paramInt);
    } 
  }
  
  public static void q(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
    } else {
      paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  class a implements Runnable {
    a(a this$0, Activity param1Activity, int param1Int) {}
    
    public void run() {
      int[] arrayOfInt = new int[this.b.length];
      PackageManager packageManager = this.c.getPackageManager();
      String str = this.c.getPackageName();
      int i = this.b.length;
      for (byte b = 0; b < i; b++)
        arrayOfInt[b] = packageManager.checkPermission(this.b[b], str); 
      ((a.c)this.c).onRequestPermissionsResult(this.d, this.b, arrayOfInt);
    }
  }
  
  class b implements Runnable {
    b(a this$0) {}
    
    public void run() {
      if (!this.b.isFinishing() && !d.i(this.b))
        this.b.recreate(); 
    }
  }
  
  public static interface c {
    void onRequestPermissionsResult(int param1Int, String[] param1ArrayOfString, int[] param1ArrayOfint);
  }
  
  public static interface d {
    boolean a(Activity param1Activity, String[] param1ArrayOfString, int param1Int);
  }
  
  public static interface e {
    void b(int param1Int);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */