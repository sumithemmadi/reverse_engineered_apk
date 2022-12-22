package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.e;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.r;

@TargetApi(17)
public class u1 extends p1 {
  public u1() {
    super(null);
  }
  
  public final String a(Context paramContext) {
    u0 u0 = u0.a();
    if (TextUtils.isEmpty(u0.b)) {
      String str;
      if (d.a()) {
        str = r0.<String>a(paramContext, new t0(u0, paramContext));
      } else {
        str = r0.<String>a((Context)str, new w0(u0, e.d((Context)str), (Context)str));
      } 
      u0.b = str;
    } 
    return u0.b;
  }
  
  public final int c(ContentResolver paramContentResolver) {
    return Settings.Global.getInt(paramContentResolver, "wifi_on", 0);
  }
  
  public final Drawable d(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat) {
    if (!paramBoolean || paramFloat <= 0.0F || paramFloat > 25.0F)
      return (Drawable)new BitmapDrawable(paramContext.getResources(), paramBitmap); 
    try {
      Bitmap bitmap1 = Bitmap.createScaledBitmap(paramBitmap, paramBitmap.getWidth(), paramBitmap.getHeight(), false);
      Bitmap bitmap2 = Bitmap.createBitmap(bitmap1);
      RenderScript renderScript = RenderScript.create(paramContext);
      ScriptIntrinsicBlur scriptIntrinsicBlur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
      Allocation allocation1 = Allocation.createFromBitmap(renderScript, bitmap1);
      Allocation allocation2 = Allocation.createFromBitmap(renderScript, bitmap2);
      scriptIntrinsicBlur.setRadius(paramFloat);
      scriptIntrinsicBlur.setInput(allocation1);
      scriptIntrinsicBlur.forEach(allocation2);
      allocation2.copyTo(bitmap2);
      return (Drawable)new BitmapDrawable(paramContext.getResources(), bitmap2);
    } catch (RuntimeException runtimeException) {
      return (Drawable)new BitmapDrawable(paramContext.getResources(), paramBitmap);
    } 
  }
  
  public final boolean i(Context paramContext, WebSettings paramWebSettings) {
    super.i(paramContext, paramWebSettings);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
    return true;
  }
  
  public final int j(ContentResolver paramContentResolver) {
    return Settings.Global.getInt(paramContentResolver, "airplane_mode_on", 0);
  }
  
  public final void k(Context paramContext) {
    u0 u0 = u0.a();
    b1.m("Updating user agent.");
    String str = WebSettings.getDefaultUserAgent(paramContext);
    if (!str.equals(u0.b)) {
      Context context = e.d(paramContext);
      if (d.a() || context == null) {
        String str1 = WebSettings.getDefaultUserAgent(paramContext);
        SharedPreferences.Editor editor = paramContext.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", str1);
        if (context == null) {
          editor.apply();
        } else {
          r.a(paramContext, editor, "admob_user_agent");
        } 
      } 
      u0.b = str;
    } 
    b1.m("User agent is updated.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/u1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */