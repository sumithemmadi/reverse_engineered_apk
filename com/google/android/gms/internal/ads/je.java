package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.w.a;
import java.util.Map;

public final class je extends oe {
  private final Map<String, String> c;
  
  private final Context d;
  
  public je(tq paramtq, Map<String, String> paramMap) {
    super(paramtq, "storePicture");
    this.c = paramMap;
    this.d = (Context)paramtq.a();
  }
  
  public final void h() {
    String str2;
    if (this.d == null) {
      e("Activity context is not available");
      return;
    } 
    q.c();
    if (!h1.z(this.d).d()) {
      e("Feature is not supported by the device.");
      return;
    } 
    String str1 = this.c.get("iurl");
    if (TextUtils.isEmpty(str1)) {
      e("Image url cannot be empty.");
      return;
    } 
    if (!URLUtil.isValidUrl(str1)) {
      str2 = String.valueOf(str1);
      if (str2.length() != 0) {
        str2 = "Invalid image url: ".concat(str2);
      } else {
        str2 = new String("Invalid image url: ");
      } 
      e(str2);
      return;
    } 
    String str3 = Uri.parse(str1).getLastPathSegment();
    q.c();
    if (!h1.b0(str3)) {
      str2 = String.valueOf(str3);
      if (str2.length() != 0) {
        str2 = "Image type not recognized: ".concat(str2);
      } else {
        str2 = new String("Image type not recognized: ");
      } 
      e(str2);
      return;
    } 
    Resources resources = q.g().b();
    q.c();
    AlertDialog.Builder builder = h1.y(this.d);
    if (resources != null) {
      str2 = resources.getString(a.s1);
    } else {
      str2 = "Save image";
    } 
    builder.setTitle(str2);
    if (resources != null) {
      str2 = resources.getString(a.s2);
    } else {
      str2 = "Allow Ad to store image in Picture gallery?";
    } 
    builder.setMessage(str2);
    if (resources != null) {
      str2 = resources.getString(a.s3);
    } else {
      str2 = "Accept";
    } 
    builder.setPositiveButton(str2, new ie(this, str1, str3));
    if (resources != null) {
      str2 = resources.getString(a.s4);
    } else {
      str2 = "Decline";
    } 
    builder.setNegativeButton(str2, new le(this));
    builder.create().show();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/je.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */