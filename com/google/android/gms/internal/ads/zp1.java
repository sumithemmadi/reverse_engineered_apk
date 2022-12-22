package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

public final class zp1 {
  private static final ClipData a = ClipData.newIntent("", new Intent());
  
  public static PendingIntent a(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2) {
    boolean bool2;
    boolean bool1 = true;
    if ((paramInt2 & 0x5F) == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    xq1.a(bool2, "Cannot set any dangerous parts of intent to be mutable.");
    if (paramIntent.getComponent() != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    xq1.a(bool2, "Must set component on Intent.");
    if (b(0, 1)) {
      xq1.a(b(paramInt2, 67108864) ^ true, "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
    } else {
      bool2 = bool1;
      if (Build.VERSION.SDK_INT >= 23)
        if (b(paramInt2, 67108864)) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }  
      xq1.a(bool2, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
    } 
    paramIntent = new Intent(paramIntent);
    if (Build.VERSION.SDK_INT < 23 || !b(paramInt2, 67108864)) {
      if (paramIntent.getPackage() == null)
        paramIntent.setPackage(paramIntent.getComponent().getPackageName()); 
      if (!b(0, 3) && paramIntent.getAction() == null)
        paramIntent.setAction(""); 
      if (!b(0, 9) && paramIntent.getCategories() == null)
        paramIntent.addCategory(""); 
      if (!b(0, 5) && paramIntent.getData() == null)
        paramIntent.setDataAndType(Uri.EMPTY, "*/*"); 
      if (!b(0, 17) && paramIntent.getClipData() == null)
        paramIntent.setClipData(a); 
    } 
    return PendingIntent.getService(paramContext, 0, paramIntent, paramInt2);
  }
  
  private static boolean b(int paramInt1, int paramInt2) {
    return ((paramInt1 & paramInt2) == paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */