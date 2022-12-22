package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public final class zzth extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzth> CREATOR = new kn2();
  
  public final String b;
  
  private final long c;
  
  private final String d;
  
  private final String e;
  
  private final String f;
  
  private final Bundle g;
  
  public final boolean h;
  
  public long i;
  
  public String j;
  
  public int k;
  
  zzth(String paramString1, long paramLong1, String paramString2, String paramString3, String paramString4, Bundle paramBundle, boolean paramBoolean, long paramLong2, String paramString5, int paramInt) {
    this.b = paramString1;
    this.c = paramLong1;
    if (paramString2 == null)
      paramString2 = ""; 
    this.d = paramString2;
    if (paramString3 == null)
      paramString3 = ""; 
    this.e = paramString3;
    if (paramString4 == null)
      paramString4 = ""; 
    this.f = paramString4;
    if (paramBundle == null)
      paramBundle = new Bundle(); 
    this.g = paramBundle;
    this.h = paramBoolean;
    this.i = paramLong2;
    this.j = paramString5;
    this.k = paramInt;
  }
  
  public static zzth o0(String paramString) {
    return p0(Uri.parse(paramString));
  }
  
  public static zzth p0(Uri paramUri) {
    try {
      StringBuilder stringBuilder;
      long l;
      if (!"gcache".equals(paramUri.getScheme()))
        return null; 
      List<String> list = paramUri.getPathSegments();
      if (list.size() != 2) {
        int i = list.size();
        stringBuilder = new StringBuilder();
        this(62);
        stringBuilder.append("Expected 2 path parts for namespace and id, found :");
        stringBuilder.append(i);
        cm.i(stringBuilder.toString());
        return null;
      } 
      String str2 = list.get(0);
      String str1 = list.get(1);
      String str3 = stringBuilder.getHost();
      String str4 = stringBuilder.getQueryParameter("url");
      boolean bool = "1".equals(stringBuilder.getQueryParameter("read_only"));
      String str5 = stringBuilder.getQueryParameter("expiration");
      if (str5 == null) {
        l = 0L;
      } else {
        l = Long.parseLong(str5);
      } 
      Bundle bundle = new Bundle();
      this();
      for (String str : stringBuilder.getQueryParameterNames()) {
        if (str.startsWith("tag."))
          bundle.putString(str.substring(4), stringBuilder.getQueryParameter(str)); 
      } 
      return new zzth(str4, l, str3, str2, str1, bundle, bool, 0L, "", 0);
    } catch (NullPointerException nullPointerException) {
    
    } catch (NumberFormatException numberFormatException) {}
    cm.d("Unable to parse Uri into cache offering.", numberFormatException);
    return null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 2, this.b, false);
    a.n(paramParcel, 3, this.c);
    a.r(paramParcel, 4, this.d, false);
    a.r(paramParcel, 5, this.e, false);
    a.r(paramParcel, 6, this.f, false);
    a.e(paramParcel, 7, this.g, false);
    a.c(paramParcel, 8, this.h);
    a.n(paramParcel, 9, this.i);
    a.r(paramParcel, 10, this.j, false);
    a.k(paramParcel, 11, this.k);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */