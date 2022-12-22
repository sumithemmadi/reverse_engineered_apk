package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzzt;

public class MobileAdsInitProvider extends ContentProvider {
  private final zzzt b = new zzzt();
  
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo) {
    this.b.attachInfo(paramContext, paramProviderInfo);
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString) {
    return this.b.delete(paramUri, paramString, paramArrayOfString);
  }
  
  public String getType(Uri paramUri) {
    return this.b.getType(paramUri);
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues) {
    return this.b.insert(paramUri, paramContentValues);
  }
  
  public boolean onCreate() {
    return this.b.onCreate();
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    return this.b.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2);
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    return this.b.update(paramUri, paramContentValues, paramString, paramArrayOfString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/MobileAdsInitProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */