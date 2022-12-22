package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
  public static final Parcelable.Creator<FragmentState> CREATOR = new a();
  
  final String b;
  
  final String c;
  
  final boolean d;
  
  final int e;
  
  final int f;
  
  final String g;
  
  final boolean h;
  
  final boolean i;
  
  final boolean j;
  
  final Bundle k;
  
  final boolean l;
  
  final int m;
  
  Bundle n;
  
  FragmentState(Parcel paramParcel) {
    boolean bool2;
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    int i = paramParcel.readInt();
    boolean bool1 = true;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.d = bool2;
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = paramParcel.readString();
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.h = bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.i = bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.j = bool2;
    this.k = paramParcel.readBundle();
    if (paramParcel.readInt() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    this.l = bool2;
    this.n = paramParcel.readBundle();
    this.m = paramParcel.readInt();
  }
  
  FragmentState(Fragment paramFragment) {
    this.b = paramFragment.getClass().getName();
    this.c = paramFragment.h;
    this.d = paramFragment.p;
    this.e = paramFragment.y;
    this.f = paramFragment.z;
    this.g = paramFragment.A;
    this.h = paramFragment.D;
    this.i = paramFragment.o;
    this.j = paramFragment.C;
    this.k = paramFragment.i;
    this.l = paramFragment.B;
    this.m = paramFragment.T.ordinal();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("FragmentState{");
    stringBuilder.append(this.b);
    stringBuilder.append(" (");
    stringBuilder.append(this.c);
    stringBuilder.append(")}:");
    if (this.d)
      stringBuilder.append(" fromLayout"); 
    if (this.f != 0) {
      stringBuilder.append(" id=0x");
      stringBuilder.append(Integer.toHexString(this.f));
    } 
    String str = this.g;
    if (str != null && !str.isEmpty()) {
      stringBuilder.append(" tag=");
      stringBuilder.append(this.g);
    } 
    if (this.h)
      stringBuilder.append(" retainInstance"); 
    if (this.i)
      stringBuilder.append(" removing"); 
    if (this.j)
      stringBuilder.append(" detached"); 
    if (this.l)
      stringBuilder.append(" hidden"); 
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.j);
    paramParcel.writeBundle(this.k);
    paramParcel.writeInt(this.l);
    paramParcel.writeBundle(this.n);
    paramParcel.writeInt(this.m);
  }
  
  class a implements Parcelable.Creator<FragmentState> {
    public FragmentState a(Parcel param1Parcel) {
      return new FragmentState(param1Parcel);
    }
    
    public FragmentState[] b(int param1Int) {
      return new FragmentState[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/FragmentState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */