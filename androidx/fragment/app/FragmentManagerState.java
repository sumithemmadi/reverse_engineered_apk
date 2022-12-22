package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
  public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
  
  ArrayList<FragmentState> b;
  
  ArrayList<String> c;
  
  BackStackState[] d;
  
  int e;
  
  String f = null;
  
  ArrayList<String> g = new ArrayList<String>();
  
  ArrayList<Bundle> h = new ArrayList<Bundle>();
  
  ArrayList<FragmentManager.LaunchedFragmentInfo> i;
  
  public FragmentManagerState() {}
  
  public FragmentManagerState(Parcel paramParcel) {
    this.b = paramParcel.createTypedArrayList(FragmentState.CREATOR);
    this.c = paramParcel.createStringArrayList();
    this.d = (BackStackState[])paramParcel.createTypedArray(BackStackState.CREATOR);
    this.e = paramParcel.readInt();
    this.f = paramParcel.readString();
    this.g = paramParcel.createStringArrayList();
    this.h = paramParcel.createTypedArrayList(Bundle.CREATOR);
    this.i = paramParcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeTypedList(this.b);
    paramParcel.writeStringList(this.c);
    paramParcel.writeTypedArray((Parcelable[])this.d, paramInt);
    paramParcel.writeInt(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeStringList(this.g);
    paramParcel.writeTypedList(this.h);
    paramParcel.writeTypedList(this.i);
  }
  
  class a implements Parcelable.Creator<FragmentManagerState> {
    public FragmentManagerState a(Parcel param1Parcel) {
      return new FragmentManagerState(param1Parcel);
    }
    
    public FragmentManagerState[] b(int param1Int) {
      return new FragmentManagerState[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/FragmentManagerState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */