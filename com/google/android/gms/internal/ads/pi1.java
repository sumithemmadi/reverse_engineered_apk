package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class pi1 {
  public static Bundle a(Bundle paramBundle, String paramString) {
    Bundle bundle = paramBundle.getBundle(paramString);
    paramBundle = bundle;
    if (bundle == null)
      paramBundle = new Bundle(); 
    return paramBundle;
  }
  
  public static void b(Bundle paramBundle1, String paramString, Bundle paramBundle2) {
    if (paramBundle2 != null)
      paramBundle1.putBundle(paramString, paramBundle2); 
  }
  
  public static void c(Bundle paramBundle, String paramString, Boolean paramBoolean, boolean paramBoolean1) {
    if (paramBoolean1)
      paramBundle.putBoolean(paramString, paramBoolean.booleanValue()); 
  }
  
  public static void d(Bundle paramBundle, String paramString, Integer paramInteger, boolean paramBoolean) {
    if (paramBoolean)
      paramBundle.putInt(paramString, paramInteger.intValue()); 
  }
  
  public static void e(Bundle paramBundle, String paramString1, String paramString2) {
    if (paramString2 != null)
      paramBundle.putString(paramString1, paramString2); 
  }
  
  public static void f(Bundle paramBundle, String paramString1, String paramString2, boolean paramBoolean) {
    if (paramBoolean)
      paramBundle.putString(paramString1, paramString2); 
  }
  
  public static void g(Bundle paramBundle, String paramString, List<String> paramList) {
    if (paramList != null)
      paramBundle.putStringArrayList(paramString, new ArrayList<String>(paramList)); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */