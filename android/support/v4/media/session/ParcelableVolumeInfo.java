package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public ParcelableVolumeInfo(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.c = paramParcel.readInt();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.c);
  }
  
  static final class a implements Parcelable.Creator<ParcelableVolumeInfo> {
    public ParcelableVolumeInfo a(Parcel param1Parcel) {
      return new ParcelableVolumeInfo(param1Parcel);
    }
    
    public ParcelableVolumeInfo[] b(int param1Int) {
      return new ParcelableVolumeInfo[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/session/ParcelableVolumeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */