package com.google.android.gms.internal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.k.c;

public final class zzzt extends ContentProvider {
  private static Bundle a(Context paramContext) {
    try {
      return (c.a(paramContext).c(paramContext.getPackageName(), 128)).metaData;
    } catch (NullPointerException nullPointerException) {
      cm.c("Failed to load metadata: Null pointer exception.", nullPointerException);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      cm.c("Failed to load metadata: Package name not found.", (Throwable)nameNotFoundException);
    } 
    return null;
  }
  
  public final void attachInfo(Context paramContext, ProviderInfo paramProviderInfo) {
    Bundle bundle = a(paramContext);
    hb hb = hb.b();
    if (bundle == null) {
      cm.g("Metadata was null.");
    } else {
      try {
        String str = (String)bundle.get("com.google.android.gms.ads.APPLICATION_ID");
        try {
          Boolean bool = (Boolean)bundle.get("com.google.android.gms.ads.AD_MANAGER_APP");
          try {
            Boolean bool1 = (Boolean)bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
            try {
              String str2;
              String str1 = (String)bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
              if (str != null && !str.matches("^/\\d+~.+$")) {
                if (str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                  if (str.length() != 0) {
                    str2 = "Publisher provided Google AdMob App ID in manifest: ".concat(str);
                  } else {
                    str2 = new String("Publisher provided Google AdMob App ID in manifest: ");
                  } 
                  cm.e(str2);
                  if (bool1 == null || !bool1.booleanValue())
                    hb.a(paramContext, str); 
                } else {
                  throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n******************************************************************************\n\n");
                } 
              } else if (str2 == null || !str2.booleanValue()) {
                if (!TextUtils.isEmpty(str1)) {
                  str2 = String.valueOf(str1);
                  if (str2.length() != 0) {
                    str2 = "The Google Mobile Ads SDK is integrated by ".concat(str2);
                  } else {
                    str2 = new String("The Google Mobile Ads SDK is integrated by ");
                  } 
                  cm.e(str2);
                } else {
                  throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                } 
              } 
              super.attachInfo(paramContext, paramProviderInfo);
              return;
            } catch (ClassCastException null) {
              throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", classCastException);
            } 
          } catch (ClassCastException null) {
            throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", classCastException);
          } 
        } catch (ClassCastException null) {
          throw new IllegalStateException("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value.", classCastException);
        } 
      } catch (ClassCastException classCastException) {
        throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", classCastException);
      } 
    } 
    super.attachInfo((Context)classCastException, paramProviderInfo);
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString) {
    return 0;
  }
  
  public final String getType(Uri paramUri) {
    return null;
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues) {
    return null;
  }
  
  public final boolean onCreate() {
    return false;
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    return null;
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    return 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */