package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
  public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
  
  final boolean b = false;
  
  final Handler c = null;
  
  a d;
  
  ResultReceiver(Parcel paramParcel) {
    this.d = a.a.Y0(paramParcel.readStrongBinder());
  }
  
  protected void a(int paramInt, Bundle paramBundle) {}
  
  public void b(int paramInt, Bundle paramBundle) {
    if (this.b) {
      Handler handler = this.c;
      if (handler != null) {
        handler.post(new c(this, paramInt, paramBundle));
      } else {
        a(paramInt, paramBundle);
      } 
      return;
    } 
    a a1 = this.d;
    if (a1 != null)
      try {
        a1.K9(paramInt, paramBundle);
      } catch (RemoteException remoteException) {} 
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Landroid/support/v4/os/a;
    //   6: ifnonnull -> 23
    //   9: new android/support/v4/os/ResultReceiver$b
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: invokespecial <init> : (Landroid/support/v4/os/ResultReceiver;)V
    //   18: aload_0
    //   19: aload_3
    //   20: putfield d : Landroid/support/v4/os/a;
    //   23: aload_1
    //   24: aload_0
    //   25: getfield d : Landroid/support/v4/os/a;
    //   28: invokeinterface asBinder : ()Landroid/os/IBinder;
    //   33: invokevirtual writeStrongBinder : (Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: monitorexit
    //   38: return
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	39	finally
    //   23	38	39	finally
    //   40	42	39	finally
  }
  
  class a implements Parcelable.Creator<ResultReceiver> {
    public ResultReceiver a(Parcel param1Parcel) {
      return new ResultReceiver(param1Parcel);
    }
    
    public ResultReceiver[] b(int param1Int) {
      return new ResultReceiver[param1Int];
    }
  }
  
  class b extends a.a {
    b(ResultReceiver this$0) {}
    
    public void K9(int param1Int, Bundle param1Bundle) {
      ResultReceiver resultReceiver = this.b;
      Handler handler = resultReceiver.c;
      if (handler != null) {
        handler.post(new ResultReceiver.c(resultReceiver, param1Int, param1Bundle));
      } else {
        resultReceiver.a(param1Int, param1Bundle);
      } 
    }
  }
  
  class c implements Runnable {
    final int b;
    
    final Bundle c;
    
    c(ResultReceiver this$0, int param1Int, Bundle param1Bundle) {
      this.b = param1Int;
      this.c = param1Bundle;
    }
    
    public void run() {
      this.d.a(this.b, this.c);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/os/ResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */