package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.h0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class zzawu extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzawu> CREATOR = new sj();
  
  public final String b;
  
  public final String c;
  
  public final boolean d;
  
  public final boolean e;
  
  public final List<String> f;
  
  public final boolean g;
  
  public final boolean h;
  
  private final List<String> i;
  
  public zzawu(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, List<String> paramList1, boolean paramBoolean3, boolean paramBoolean4, List<String> paramList2) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramList1;
    this.g = paramBoolean3;
    this.h = paramBoolean4;
    List<String> list = paramList2;
    if (paramList2 == null)
      list = new ArrayList<String>(); 
    this.i = list;
  }
  
  public static zzawu o0(JSONObject paramJSONObject) {
    if (paramJSONObject == null)
      return null; 
    String str1 = paramJSONObject.optString("click_string", "");
    String str2 = paramJSONObject.optString("report_url", "");
    boolean bool1 = paramJSONObject.optBoolean("rendered_ad_enabled", false);
    boolean bool2 = paramJSONObject.optBoolean("non_malicious_reporting_enabled", false);
    List<String> list1 = h0.c(paramJSONObject.optJSONArray("allowed_headers"), null);
    List<String> list2 = h0.c(paramJSONObject.optJSONArray("webview_permissions"), null);
    return new zzawu(str1, str2, bool1, bool2, list1, paramJSONObject.optBoolean("protection_enabled", false), paramJSONObject.optBoolean("malicious_reporting_enabled", false), list2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 2, this.b, false);
    a.r(paramParcel, 3, this.c, false);
    a.c(paramParcel, 4, this.d);
    a.c(paramParcel, 5, this.e);
    a.t(paramParcel, 6, this.f, false);
    a.c(paramParcel, 7, this.g);
    a.c(paramParcel, 8, this.h);
    a.t(paramParcel, 9, this.i, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzawu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */