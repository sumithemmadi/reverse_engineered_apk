package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
  public static final Parcelable.Creator<Metadata> CREATOR = new a();
  
  private final Entry[] b;
  
  Metadata(Parcel paramParcel) {
    this.b = new Entry[paramParcel.readInt()];
    byte b = 0;
    while (true) {
      Entry[] arrayOfEntry = this.b;
      if (b < arrayOfEntry.length) {
        arrayOfEntry[b] = (Entry)paramParcel.readParcelable(Entry.class.getClassLoader());
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public Metadata(List<? extends Entry> paramList) {
    Entry[] arrayOfEntry = new Entry[paramList.size()];
    this.b = arrayOfEntry;
    paramList.toArray(arrayOfEntry);
  }
  
  public Metadata(Entry... paramVarArgs) {
    this.b = paramVarArgs;
  }
  
  public Metadata a(Entry... paramVarArgs) {
    return (paramVarArgs.length == 0) ? this : new Metadata((Entry[])h0.e0((Object[])this.b, (Object[])paramVarArgs));
  }
  
  public Metadata b(Metadata paramMetadata) {
    return (paramMetadata == null) ? this : a(paramMetadata.b);
  }
  
  public Entry c(int paramInt) {
    return this.b[paramInt];
  }
  
  public int d() {
    return this.b.length;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || Metadata.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return Arrays.equals((Object[])this.b, (Object[])((Metadata)paramObject).b);
  }
  
  public int hashCode() {
    return Arrays.hashCode((Object[])this.b);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("entries=");
    stringBuilder.append(Arrays.toString((Object[])this.b));
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b.length);
    Entry[] arrayOfEntry = this.b;
    int i = arrayOfEntry.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeParcelable(arrayOfEntry[paramInt], 0); 
  }
  
  public static interface Entry extends Parcelable {
    Format A();
    
    byte[] l0();
  }
  
  static final class a implements Parcelable.Creator<Metadata> {
    public Metadata a(Parcel param1Parcel) {
      return new Metadata(param1Parcel);
    }
    
    public Metadata[] b(int param1Int) {
      return new Metadata[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/Metadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */