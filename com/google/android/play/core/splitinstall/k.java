package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.a;

public final class k {
  private static final a a = new a("SplitInstallInfoProvider");
  
  private final Context b;
  
  private final String c;
  
  public k(Context paramContext) {
    this.b = paramContext;
    this.c = paramContext.getPackageName();
  }
  
  public static boolean a(String paramString) {
    return paramString.startsWith("config.");
  }
  
  public static boolean b(String paramString) {
    return (a(paramString) || paramString.contains(".config."));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitinstall/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */