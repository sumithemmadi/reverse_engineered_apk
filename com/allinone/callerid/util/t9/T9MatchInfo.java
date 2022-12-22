package com.allinone.callerid.util.t9;

import android.os.Parcel;
import android.os.Parcelable;

public final class T9MatchInfo implements Parcelable {
  public static final Parcelable.Creator<T9MatchInfo> CREATOR = new a();
  
  private boolean b;
  
  private int c;
  
  private int d;
  
  private T9MatchInfo e;
  
  T9MatchInfo() {
    this.b = false;
    this.c = -1;
    this.d = 0;
  }
  
  T9MatchInfo(Parcel paramParcel) {
    boolean bool;
    if (paramParcel.readByte() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b = bool;
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = (T9MatchInfo)paramParcel.readParcelable(T9MatchInfo.class.getClassLoader());
  }
  
  public boolean a() {
    return this.b;
  }
  
  public int b() {
    return this.d;
  }
  
  public T9MatchInfo c() {
    return this.e;
  }
  
  void d(int paramInt1, int paramInt2) {
    if ((paramInt1 >= 0 || paramInt2 <= 0) && (paramInt1 < 0 || paramInt2 > 0)) {
      boolean bool;
      if (paramInt1 >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.b = bool;
      this.c = paramInt1;
      this.d = paramInt2;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("INVALID MATCH OFFSETS: matchStart=");
    stringBuilder.append(paramInt1);
    stringBuilder.append(", matchLength=");
    stringBuilder.append(paramInt2);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public int describeContents() {
    return 0;
  }
  
  void e(T9MatchInfo paramT9MatchInfo) {
    if (this != paramT9MatchInfo)
      this.e = paramT9MatchInfo; 
  }
  
  public int f() {
    return this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("T9MatchInfo{mMatchFound=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mMatchStart=");
    stringBuilder.append(this.c);
    stringBuilder.append(", mMatchLength=");
    stringBuilder.append(this.d);
    stringBuilder.append(", mNext=");
    stringBuilder.append(this.e);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeByte(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeParcelable(this.e, paramInt);
  }
  
  static final class a implements Parcelable.Creator<T9MatchInfo> {
    public T9MatchInfo a(Parcel param1Parcel) {
      return new T9MatchInfo(param1Parcel);
    }
    
    public T9MatchInfo[] b(int param1Int) {
      return new T9MatchInfo[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/t9/T9MatchInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */