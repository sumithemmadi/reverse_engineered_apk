package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
  public static final Parcelable.Creator<ActivityResult> CREATOR = new a();
  
  private final int b;
  
  private final Intent c;
  
  public ActivityResult(int paramInt, Intent paramIntent) {
    this.b = paramInt;
    this.c = paramIntent;
  }
  
  ActivityResult(Parcel paramParcel) {
    Intent intent;
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() == 0) {
      paramParcel = null;
    } else {
      intent = (Intent)Intent.CREATOR.createFromParcel(paramParcel);
    } 
    this.c = intent;
  }
  
  public static String c(int paramInt) {
    return (paramInt != -1) ? ((paramInt != 0) ? String.valueOf(paramInt) : "RESULT_CANCELED") : "RESULT_OK";
  }
  
  public Intent a() {
    return this.c;
  }
  
  public int b() {
    return this.b;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ActivityResult{resultCode=");
    stringBuilder.append(c(this.b));
    stringBuilder.append(", data=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    boolean bool;
    paramParcel.writeInt(this.b);
    if (this.c == null) {
      bool = false;
    } else {
      bool = true;
    } 
    paramParcel.writeInt(bool);
    Intent intent = this.c;
    if (intent != null)
      intent.writeToParcel(paramParcel, paramInt); 
  }
  
  class a implements Parcelable.Creator<ActivityResult> {
    public ActivityResult a(Parcel param1Parcel) {
      return new ActivityResult(param1Parcel);
    }
    
    public ActivityResult[] b(int param1Int) {
      return new ActivityResult[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/result/ActivityResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */