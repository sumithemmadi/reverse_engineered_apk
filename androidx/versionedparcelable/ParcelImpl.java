package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
  public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
  
  private final b b;
  
  protected ParcelImpl(Parcel paramParcel) {
    this.b = (new a(paramParcel)).u();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    (new a(paramParcel)).L(this.b);
  }
  
  static final class a implements Parcelable.Creator<ParcelImpl> {
    public ParcelImpl a(Parcel param1Parcel) {
      return new ParcelImpl(param1Parcel);
    }
    
    public ParcelImpl[] b(int param1Int) {
      return new ParcelImpl[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/versionedparcelable/ParcelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */