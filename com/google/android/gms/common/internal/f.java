package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import b.e.g;
import c.c.a.a.a.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.g;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.i;

public final class f {
  private static final g<String, String> a = new g();
  
  public static String a(Context paramContext) {
    String str = paramContext.getPackageName();
    try {
      return c.a(paramContext).d(str).toString();
    } catch (android.content.pm.PackageManager.NameNotFoundException|NullPointerException nameNotFoundException) {
      String str1 = (paramContext.getApplicationInfo()).name;
      return TextUtils.isEmpty(str1) ? str : str1;
    } 
  }
  
  public static String b(Context paramContext) {
    return paramContext.getResources().getString(c.common_google_play_services_notification_channel_name);
  }
  
  public static String c(Context paramContext, int paramInt) {
    Resources resources = paramContext.getResources();
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? resources.getString(17039370) : resources.getString(c.common_google_play_services_enable_button)) : resources.getString(c.common_google_play_services_update_button)) : resources.getString(c.common_google_play_services_install_button);
  }
  
  public static String d(Context paramContext, int paramInt) {
    Resources resources = paramContext.getResources();
    String str = a(paramContext);
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 5) {
            if (paramInt != 7) {
              if (paramInt != 9) {
                if (paramInt != 20) {
                  switch (paramInt) {
                    default:
                      return resources.getString(g.common_google_play_services_unknown_issue, new Object[] { str });
                    case 18:
                      return resources.getString(c.common_google_play_services_updating_text, new Object[] { str });
                    case 17:
                      return i(paramContext, "common_google_play_services_sign_in_failed_text", str);
                    case 16:
                      break;
                  } 
                  return i(paramContext, "common_google_play_services_api_unavailable_text", str);
                } 
                return i(paramContext, "common_google_play_services_restricted_profile_text", str);
              } 
              return resources.getString(c.common_google_play_services_unsupported_text, new Object[] { str });
            } 
            return i(paramContext, "common_google_play_services_network_error_text", str);
          } 
          return i(paramContext, "common_google_play_services_invalid_account_text", str);
        } 
        return resources.getString(c.common_google_play_services_enable_text, new Object[] { str });
      } 
      return i.f(paramContext) ? resources.getString(c.common_google_play_services_wear_update_text) : resources.getString(c.common_google_play_services_update_text, new Object[] { str });
    } 
    return resources.getString(c.common_google_play_services_install_text, new Object[] { str });
  }
  
  public static String e(Context paramContext, int paramInt) {
    return (paramInt == 6 || paramInt == 19) ? i(paramContext, "common_google_play_services_resolution_required_text", a(paramContext)) : d(paramContext, paramInt);
  }
  
  public static String f(Context paramContext, int paramInt) {
    String str1;
    if (paramInt == 6) {
      str1 = h(paramContext, "common_google_play_services_resolution_required_title");
    } else {
      str1 = g(paramContext, paramInt);
    } 
    String str2 = str1;
    if (str1 == null)
      str2 = paramContext.getResources().getString(c.common_google_play_services_notification_ticker); 
    return str2;
  }
  
  public static String g(Context paramContext, int paramInt) {
    StringBuilder stringBuilder;
    Resources resources = paramContext.getResources();
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder(33);
        stringBuilder.append("Unexpected error code ");
        stringBuilder.append(paramInt);
        Log.e("GoogleApiAvailability", stringBuilder.toString());
        return null;
      case 20:
        Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
        return h((Context)stringBuilder, "common_google_play_services_restricted_profile_title");
      case 17:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        return h((Context)stringBuilder, "common_google_play_services_sign_in_failed_title");
      case 16:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        return null;
      case 11:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        return null;
      case 10:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        return null;
      case 9:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        return null;
      case 8:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        return null;
      case 7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        return h((Context)stringBuilder, "common_google_play_services_network_error_title");
      case 5:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        return h((Context)stringBuilder, "common_google_play_services_invalid_account_title");
      case 4:
      case 6:
      case 18:
        return null;
      case 3:
        return resources.getString(c.common_google_play_services_enable_title);
      case 2:
        return resources.getString(c.common_google_play_services_update_title);
      case 1:
        break;
    } 
    return resources.getString(c.common_google_play_services_install_title);
  }
  
  private static String h(Context paramContext, String paramString) {
    synchronized (a) {
      String str2 = (String)null.get(paramString);
      if (str2 != null)
        return str2; 
      Resources resources = d.e(paramContext);
      if (resources == null)
        return null; 
      int i = resources.getIdentifier(paramString, "string", "com.google.android.gms");
      if (i == 0) {
        str1 = String.valueOf(paramString);
        if (str1.length() != 0) {
          str1 = "Missing resource: ".concat(str1);
        } else {
          str1 = new String("Missing resource: ");
        } 
        Log.w("GoogleApiAvailability", str1);
        return null;
      } 
      String str1 = str1.getString(i);
      if (TextUtils.isEmpty(str1)) {
        str1 = String.valueOf(paramString);
        if (str1.length() != 0) {
          str1 = "Got empty resource: ".concat(str1);
        } else {
          str1 = new String("Got empty resource: ");
        } 
        Log.w("GoogleApiAvailability", str1);
        return null;
      } 
      null.put(paramString, str1);
      return str1;
    } 
  }
  
  private static String i(Context paramContext, String paramString1, String paramString2) {
    Resources resources = paramContext.getResources();
    paramString1 = h(paramContext, paramString1);
    String str = paramString1;
    if (paramString1 == null)
      str = resources.getString(g.common_google_play_services_unknown_issue); 
    return String.format((resources.getConfiguration()).locale, str, new Object[] { paramString2 });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */