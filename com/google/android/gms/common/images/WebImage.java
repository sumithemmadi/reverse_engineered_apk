package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage extends AbstractSafeParcelable {
  public static final Parcelable.Creator<WebImage> CREATOR = new c();
  
  private final int b;
  
  private final Uri c;
  
  private final int d;
  
  private final int e;
  
  WebImage(int paramInt1, Uri paramUri, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.c = paramUri;
    this.d = paramInt2;
    this.e = paramInt3;
  }
  
  public WebImage(Uri paramUri, int paramInt1, int paramInt2) {
    this(1, paramUri, paramInt1, paramInt2);
    if (paramUri != null) {
      if (paramInt1 >= 0 && paramInt2 >= 0)
        return; 
      throw new IllegalArgumentException("width and height must not be negative");
    } 
    throw new IllegalArgumentException("url cannot be null");
  }
  
  public WebImage(JSONObject paramJSONObject) {
    this(r0(paramJSONObject), paramJSONObject.optInt("width", 0), paramJSONObject.optInt("height", 0));
  }
  
  private static Uri r0(JSONObject paramJSONObject) {
    if (paramJSONObject.has("url"))
      try {
        return Uri.parse(paramJSONObject.getString("url"));
      } catch (JSONException jSONException) {} 
    return null;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && paramObject instanceof WebImage) {
      paramObject = paramObject;
      if (r.a(this.c, ((WebImage)paramObject).c) && this.d == ((WebImage)paramObject).d && this.e == ((WebImage)paramObject).e)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return r.b(new Object[] { this.c, Integer.valueOf(this.d), Integer.valueOf(this.e) });
  }
  
  public final int o0() {
    return this.e;
  }
  
  public final Uri p0() {
    return this.c;
  }
  
  public final int q0() {
    return this.d;
  }
  
  public final String toString() {
    return String.format(Locale.US, "Image %dx%d %s", new Object[] { Integer.valueOf(this.d), Integer.valueOf(this.e), this.c.toString() });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.q(paramParcel, 2, (Parcelable)p0(), paramInt, false);
    a.k(paramParcel, 3, q0());
    a.k(paramParcel, 4, o0());
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/images/WebImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */