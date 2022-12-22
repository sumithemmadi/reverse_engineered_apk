package com.google.android.gms.ads.v;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public final class c {
  private SharedPreferences a;
  
  public c(Context paramContext) {
    try {
      return;
    } finally {
      paramContext = null;
      Log.w("GmscoreFlag", "Error while getting SharedPreferences ", (Throwable)paramContext);
      this.a = null;
    } 
  }
  
  public final boolean a(String paramString, boolean paramBoolean) {
    try {
      return (sharedPreferences == null) ? false : sharedPreferences.getBoolean(paramString, false);
    } finally {
      paramString = null;
      Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", (Throwable)paramString);
    } 
  }
  
  final float b(String paramString, float paramFloat) {
    try {
      return (sharedPreferences == null) ? 0.0F : sharedPreferences.getFloat(paramString, 0.0F);
    } finally {
      paramString = null;
      Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", (Throwable)paramString);
    } 
  }
  
  final String c(String paramString1, String paramString2) {
    try {
      return (sharedPreferences == null) ? paramString2 : sharedPreferences.getString(paramString1, paramString2);
    } finally {
      paramString1 = null;
      Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", (Throwable)paramString1);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/v/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */