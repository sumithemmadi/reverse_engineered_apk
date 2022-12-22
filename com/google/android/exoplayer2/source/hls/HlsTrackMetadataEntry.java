package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HlsTrackMetadataEntry implements Metadata.Entry {
  public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();
  
  public final String b;
  
  public final String c;
  
  public final List<VariantInfo> d;
  
  HlsTrackMetadataEntry(Parcel paramParcel) {
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    int i = paramParcel.readInt();
    ArrayList<Parcelable> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++)
      arrayList.add(paramParcel.readParcelable(VariantInfo.class.getClassLoader())); 
    this.d = Collections.unmodifiableList(arrayList);
  }
  
  public HlsTrackMetadataEntry(String paramString1, String paramString2, List<VariantInfo> paramList) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = Collections.unmodifiableList(new ArrayList<VariantInfo>(paramList));
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || HlsTrackMetadataEntry.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!TextUtils.equals(this.b, ((HlsTrackMetadataEntry)paramObject).b) || !TextUtils.equals(this.c, ((HlsTrackMetadataEntry)paramObject).c) || !this.d.equals(((HlsTrackMetadataEntry)paramObject).d))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    byte b;
    String str = this.b;
    int i = 0;
    if (str != null) {
      b = str.hashCode();
    } else {
      b = 0;
    } 
    str = this.c;
    if (str != null)
      i = str.hashCode(); 
    return (b * 31 + i) * 31 + this.d.hashCode();
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("HlsTrackMetadataEntry");
    if (this.b != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(" [");
      stringBuilder1.append(this.b);
      stringBuilder1.append(", ");
      stringBuilder1.append(this.c);
      stringBuilder1.append("]");
      str = stringBuilder1.toString();
    } else {
      str = "";
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    int i = this.d.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeParcelable(this.d.get(paramInt), 0); 
  }
  
  public static final class VariantInfo implements Parcelable {
    public static final Parcelable.Creator<VariantInfo> CREATOR = new a();
    
    public final long b;
    
    public final String c;
    
    public final String d;
    
    public final String e;
    
    public final String f;
    
    public VariantInfo(long param1Long, String param1String1, String param1String2, String param1String3, String param1String4) {
      this.b = param1Long;
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1String3;
      this.f = param1String4;
    }
    
    VariantInfo(Parcel param1Parcel) {
      this.b = param1Parcel.readLong();
      this.c = param1Parcel.readString();
      this.d = param1Parcel.readString();
      this.e = param1Parcel.readString();
      this.f = param1Parcel.readString();
    }
    
    public int describeContents() {
      return 0;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || VariantInfo.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (this.b != ((VariantInfo)param1Object).b || !TextUtils.equals(this.c, ((VariantInfo)param1Object).c) || !TextUtils.equals(this.d, ((VariantInfo)param1Object).d) || !TextUtils.equals(this.e, ((VariantInfo)param1Object).e) || !TextUtils.equals(this.f, ((VariantInfo)param1Object).f))
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      byte b1;
      byte b2;
      byte b3;
      long l = this.b;
      int i = (int)(l ^ l >>> 32L);
      String str = this.c;
      int j = 0;
      if (str != null) {
        b1 = str.hashCode();
      } else {
        b1 = 0;
      } 
      str = this.d;
      if (str != null) {
        b2 = str.hashCode();
      } else {
        b2 = 0;
      } 
      str = this.e;
      if (str != null) {
        b3 = str.hashCode();
      } else {
        b3 = 0;
      } 
      str = this.f;
      if (str != null)
        j = str.hashCode(); 
      return (((i * 31 + b1) * 31 + b2) * 31 + b3) * 31 + j;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeLong(this.b);
      param1Parcel.writeString(this.c);
      param1Parcel.writeString(this.d);
      param1Parcel.writeString(this.e);
      param1Parcel.writeString(this.f);
    }
    
    static final class a implements Parcelable.Creator<VariantInfo> {
      public HlsTrackMetadataEntry.VariantInfo a(Parcel param2Parcel) {
        return new HlsTrackMetadataEntry.VariantInfo(param2Parcel);
      }
      
      public HlsTrackMetadataEntry.VariantInfo[] b(int param2Int) {
        return new HlsTrackMetadataEntry.VariantInfo[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<VariantInfo> {
    public HlsTrackMetadataEntry.VariantInfo a(Parcel param1Parcel) {
      return new HlsTrackMetadataEntry.VariantInfo(param1Parcel);
    }
    
    public HlsTrackMetadataEntry.VariantInfo[] b(int param1Int) {
      return new HlsTrackMetadataEntry.VariantInfo[param1Int];
    }
  }
  
  static final class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
    public HlsTrackMetadataEntry a(Parcel param1Parcel) {
      return new HlsTrackMetadataEntry(param1Parcel);
    }
    
    public HlsTrackMetadataEntry[] b(int param1Int) {
      return new HlsTrackMetadataEntry[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/HlsTrackMetadataEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */