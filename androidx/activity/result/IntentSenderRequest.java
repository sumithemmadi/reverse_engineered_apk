package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
  public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();
  
  private final IntentSender b;
  
  private final Intent c;
  
  private final int d;
  
  private final int e;
  
  IntentSenderRequest(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2) {
    this.b = paramIntentSender;
    this.c = paramIntent;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  IntentSenderRequest(Parcel paramParcel) {
    this.b = (IntentSender)paramParcel.readParcelable(IntentSender.class.getClassLoader());
    this.c = (Intent)paramParcel.readParcelable(Intent.class.getClassLoader());
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
  }
  
  public Intent a() {
    return this.c;
  }
  
  public int b() {
    return this.d;
  }
  
  public int c() {
    return this.e;
  }
  
  public IntentSender d() {
    return this.b;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable((Parcelable)this.b, paramInt);
    paramParcel.writeParcelable((Parcelable)this.c, paramInt);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
  }
  
  class a implements Parcelable.Creator<IntentSenderRequest> {
    public IntentSenderRequest a(Parcel param1Parcel) {
      return new IntentSenderRequest(param1Parcel);
    }
    
    public IntentSenderRequest[] b(int param1Int) {
      return new IntentSenderRequest[param1Int];
    }
  }
  
  public static final class b {
    private IntentSender a;
    
    private Intent b;
    
    private int c;
    
    private int d;
    
    public b(IntentSender param1IntentSender) {
      this.a = param1IntentSender;
    }
    
    public IntentSenderRequest a() {
      return new IntentSenderRequest(this.a, this.b, this.c, this.d);
    }
    
    public b b(Intent param1Intent) {
      this.b = param1Intent;
      return this;
    }
    
    public b c(int param1Int1, int param1Int2) {
      this.d = param1Int1;
      this.c = param1Int2;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/result/IntentSenderRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */