package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable {
  public static final Parcelable.Creator<AbsSavedState> CREATOR;
  
  public static final AbsSavedState b = new AbsSavedState() {
    
    };
  
  private final Parcelable c;
  
  static {
    CREATOR = (Parcelable.Creator<AbsSavedState>)new a();
  }
  
  private AbsSavedState() {
    this.c = null;
  }
  
  protected AbsSavedState(Parcel paramParcel, ClassLoader paramClassLoader) {
    Parcelable parcelable = paramParcel.readParcelable(paramClassLoader);
    if (parcelable == null)
      parcelable = b; 
    this.c = parcelable;
  }
  
  protected AbsSavedState(Parcelable paramParcelable) {
    if (paramParcelable != null) {
      if (paramParcelable == b)
        paramParcelable = null; 
      this.c = paramParcelable;
      return;
    } 
    throw new IllegalArgumentException("superState must not be null");
  }
  
  public final Parcelable a() {
    return this.c;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable(this.c, paramInt);
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
    public AbsSavedState a(Parcel param1Parcel) {
      return b(param1Parcel, null);
    }
    
    public AbsSavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      if (param1Parcel.readParcelable(param1ClassLoader) == null)
        return AbsSavedState.b; 
      throw new IllegalStateException("superState must be null");
    }
    
    public AbsSavedState[] c(int param1Int) {
      return new AbsSavedState[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/customview/view/AbsSavedState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */