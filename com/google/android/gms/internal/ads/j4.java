package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.t;
import com.google.android.gms.dynamic.b;

public final class j4 implements f {
  private final i4 a;
  
  private final MediaView b;
  
  private final t c;
  
  public j4(i4 parami4) {
    i4 i41;
    Context context;
    this.c = new t();
    this.a = parami4;
    i4 i42 = null;
    try {
      context = (Context)b.o1(parami4.h8());
    } catch (NullPointerException nullPointerException) {
      cm.c("", nullPointerException);
      context = null;
    } catch (RemoteException remoteException) {}
    parami4 = i42;
    if (context != null) {
      MediaView mediaView = new MediaView(context);
      try {
        boolean bool = this.a.h5(b.a2(mediaView));
        if (!bool)
          i41 = i42; 
      } catch (RemoteException remoteException) {
        cm.c("", (Throwable)remoteException);
        i41 = i42;
      } 
    } 
    this.b = (MediaView)i41;
  }
  
  public final i4 a() {
    return this.a;
  }
  
  public final String u0() {
    try {
      return this.a.u0();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */