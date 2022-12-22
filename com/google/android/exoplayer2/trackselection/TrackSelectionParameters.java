package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.h0;

public class TrackSelectionParameters implements Parcelable {
  public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;
  
  public static final TrackSelectionParameters b;
  
  @Deprecated
  public static final TrackSelectionParameters c;
  
  public final String d;
  
  public final String e;
  
  public final int f;
  
  public final boolean g;
  
  public final int h;
  
  static {
    TrackSelectionParameters trackSelectionParameters = (new b()).a();
    b = trackSelectionParameters;
    c = trackSelectionParameters;
    CREATOR = new a();
  }
  
  TrackSelectionParameters(Parcel paramParcel) {
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.readInt();
    this.g = h0.i0(paramParcel);
    this.h = paramParcel.readInt();
  }
  
  TrackSelectionParameters(String paramString1, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2) {
    this.d = h0.c0(paramString1);
    this.e = h0.c0(paramString2);
    this.f = paramInt1;
    this.g = paramBoolean;
    this.h = paramInt2;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!TextUtils.equals(this.d, ((TrackSelectionParameters)paramObject).d) || !TextUtils.equals(this.e, ((TrackSelectionParameters)paramObject).e) || this.f != ((TrackSelectionParameters)paramObject).f || this.g != ((TrackSelectionParameters)paramObject).g || this.h != ((TrackSelectionParameters)paramObject).h)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    int j;
    String str = this.d;
    int i = 0;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    } 
    str = this.e;
    if (str != null)
      i = str.hashCode(); 
    return ((((j + 31) * 31 + i) * 31 + this.f) * 31 + this.g) * 31 + this.h;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeInt(this.f);
    h0.x0(paramParcel, this.g);
    paramParcel.writeInt(this.h);
  }
  
  static final class a implements Parcelable.Creator<TrackSelectionParameters> {
    public TrackSelectionParameters a(Parcel param1Parcel) {
      return new TrackSelectionParameters(param1Parcel);
    }
    
    public TrackSelectionParameters[] b(int param1Int) {
      return new TrackSelectionParameters[param1Int];
    }
  }
  
  public static class b {
    String a = null;
    
    String b = null;
    
    int c = 0;
    
    boolean d = false;
    
    int e = 0;
    
    public TrackSelectionParameters a() {
      return new TrackSelectionParameters(this.a, this.b, this.c, this.d, this.e);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/TrackSelectionParameters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */