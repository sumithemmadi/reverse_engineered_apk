package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n91 implements s91<t91<Bundle>> {
  private final nt1 a;
  
  private final Context b;
  
  n91(nt1 paramnt1, Context paramContext) {
    this.a = paramnt1;
    this.b = paramContext;
  }
  
  public static Bundle b(Context paramContext, JSONArray paramJSONArray) {
    Bundle bundle = new Bundle();
    for (byte b = 0; b < paramJSONArray.length(); b++) {
      JSONObject jSONObject = paramJSONArray.optJSONObject(b);
      String str1 = jSONObject.optString("bk");
      String str2 = jSONObject.optString("sk");
      int i = jSONObject.optInt("type", -1);
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            i = 0;
          } else {
            i = r91.c;
          } 
        } else {
          i = r91.b;
        } 
      } else {
        i = r91.a;
      } 
      if (!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(str2) && i != 0) {
        String str;
        String[] arrayOfString = str2.split("/");
        if (arrayOfString.length > 2 || arrayOfString.length == 0) {
          arrayOfString = null;
        } else {
          SharedPreferences sharedPreferences;
          if (arrayOfString.length == 1) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
            str = arrayOfString[0];
          } else {
            sharedPreferences = paramContext.getSharedPreferences(str[0], 0);
            str = str[1];
          } 
          str = (String)sharedPreferences.getAll().get(str);
        } 
        if (str != null) {
          i = o91.a[i - 1];
          if (i != 1) {
            if (i != 2) {
              if (i == 3 && str instanceof Boolean)
                bundle.putBoolean(str1, ((Boolean)str).booleanValue()); 
            } else if (str instanceof Integer) {
              bundle.putInt(str1, ((Integer)str).intValue());
            } else if (str instanceof Long) {
              bundle.putLong(str1, ((Long)str).longValue());
            } else if (str instanceof Float) {
              bundle.putFloat(str1, ((Float)str).floatValue());
            } 
          } else if (str instanceof String) {
            bundle.putString(str1, str);
          } 
        } 
      } 
    } 
    return bundle;
  }
  
  public final ot1<t91<Bundle>> a() {
    return this.a.a(new m91(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */