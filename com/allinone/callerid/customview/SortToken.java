package com.allinone.callerid.customview;

import android.os.Parcel;
import android.os.Parcelable;

public class SortToken implements Parcelable {
  public static final Parcelable.Creator<SortToken> CREATOR = new a();
  
  public String b = "";
  
  public String c = "";
  
  public String d = "";
  
  public SortToken() {}
  
  protected SortToken(Parcel paramParcel) {
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
  }
  
  static final class a implements Parcelable.Creator<SortToken> {
    public SortToken a(Parcel param1Parcel) {
      return new SortToken(param1Parcel);
    }
    
    public SortToken[] b(int param1Int) {
      return new SortToken[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/SortToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */