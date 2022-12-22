package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class ea2 {
  private static final char[] a = "0123456789abcdef".toCharArray();
  
  public static boolean a() {
    return (Looper.myLooper() == Looper.getMainLooper());
  }
  
  public static long b(double paramDouble, DisplayMetrics paramDisplayMetrics) {
    double d = paramDisplayMetrics.density;
    Double.isNaN(d);
    return Math.round(paramDouble / d);
  }
  
  public static String c(Throwable paramThrowable) {
    StringWriter stringWriter = new StringWriter();
    p22.a(paramThrowable, new PrintWriter(stringWriter));
    return stringWriter.toString();
  }
  
  public static boolean d(DisplayMetrics paramDisplayMetrics) {
    return (paramDisplayMetrics != null && paramDisplayMetrics.density != 0.0F);
  }
  
  public static String e(String paramString) {
    String str = paramString;
    if (paramString != null) {
      str = paramString;
      if (paramString.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
        UUID uUID = UUID.fromString(paramString);
        byte[] arrayOfByte = new byte[16];
        ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte);
        byteBuffer.putLong(uUID.getMostSignificantBits());
        byteBuffer.putLong(uUID.getLeastSignificantBits());
        str = b21.a(arrayOfByte, true);
      } 
    } 
    return str;
  }
  
  public static boolean f(String paramString) {
    return (paramString == null || paramString.isEmpty());
  }
  
  public static Activity g(View paramView) {
    View view = paramView.getRootView();
    if (view != null)
      paramView = view; 
    Context context = paramView.getContext();
    for (byte b = 0; context instanceof ContextWrapper && b < 10; b++) {
      if (context instanceof Activity)
        return (Activity)context; 
      context = ((ContextWrapper)context).getBaseContext();
    } 
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ea2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */