package c.c.a.a.b.a;

import android.os.IBinder;
import android.os.Parcel;

public final class f extends a implements d {
  f(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
  }
  
  public final boolean P3(boolean paramBoolean) {
    Parcel parcel = Y0();
    c.a(parcel, true);
    parcel = i1(2, parcel);
    paramBoolean = c.b(parcel);
    parcel.recycle();
    return paramBoolean;
  }
  
  public final boolean c() {
    Parcel parcel = i1(6, Y0());
    boolean bool = c.b(parcel);
    parcel.recycle();
    return bool;
  }
  
  public final String getId() {
    Parcel parcel = i1(1, Y0());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/a/b/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */