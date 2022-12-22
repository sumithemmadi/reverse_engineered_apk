package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class DownloadRequest implements Parcelable {
  public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();
  
  public final String b;
  
  public final String c;
  
  public final Uri d;
  
  public final List<StreamKey> e;
  
  public final String f;
  
  public final byte[] g;
  
  DownloadRequest(Parcel paramParcel) {
    this.b = (String)h0.g(paramParcel.readString());
    this.c = (String)h0.g(paramParcel.readString());
    this.d = Uri.parse((String)h0.g(paramParcel.readString()));
    int i = paramParcel.readInt();
    ArrayList<Parcelable> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++)
      arrayList.add(paramParcel.readParcelable(StreamKey.class.getClassLoader())); 
    this.e = Collections.unmodifiableList(arrayList);
    this.f = paramParcel.readString();
    this.g = (byte[])h0.g(paramParcel.createByteArray());
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof DownloadRequest;
    boolean bool1 = false;
    if (!bool)
      return false; 
    paramObject = paramObject;
    bool = bool1;
    if (this.b.equals(((DownloadRequest)paramObject).b)) {
      bool = bool1;
      if (this.c.equals(((DownloadRequest)paramObject).c)) {
        bool = bool1;
        if (this.d.equals(((DownloadRequest)paramObject).d)) {
          bool = bool1;
          if (this.e.equals(((DownloadRequest)paramObject).e)) {
            bool = bool1;
            if (h0.b(this.f, ((DownloadRequest)paramObject).f)) {
              bool = bool1;
              if (Arrays.equals(this.g, ((DownloadRequest)paramObject).g))
                bool = true; 
            } 
          } 
        } 
      } 
    } 
    return bool;
  }
  
  public final int hashCode() {
    byte b;
    int i = this.c.hashCode();
    int j = this.b.hashCode();
    int k = this.c.hashCode();
    int m = this.d.hashCode();
    int n = this.e.hashCode();
    String str = this.f;
    if (str != null) {
      b = str.hashCode();
    } else {
      b = 0;
    } 
    return (((((i * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + b) * 31 + Arrays.hashCode(this.g);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.c);
    stringBuilder.append(":");
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d.toString());
    paramParcel.writeInt(this.e.size());
    for (paramInt = 0; paramInt < this.e.size(); paramInt++)
      paramParcel.writeParcelable(this.e.get(paramInt), 0); 
    paramParcel.writeString(this.f);
    paramParcel.writeByteArray(this.g);
  }
  
  public static class UnsupportedRequestException extends IOException {}
  
  static final class a implements Parcelable.Creator<DownloadRequest> {
    public DownloadRequest a(Parcel param1Parcel) {
      return new DownloadRequest(param1Parcel);
    }
    
    public DownloadRequest[] b(int param1Int) {
      return new DownloadRequest[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/offline/DownloadRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */