package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.b;

public class RemoteActionCompatParcelizer {
  public static RemoteActionCompat read(VersionedParcel paramVersionedParcel) {
    RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
    remoteActionCompat.a = (IconCompat)paramVersionedParcel.v((b)remoteActionCompat.a, 1);
    remoteActionCompat.b = paramVersionedParcel.l(remoteActionCompat.b, 2);
    remoteActionCompat.c = paramVersionedParcel.l(remoteActionCompat.c, 3);
    remoteActionCompat.d = (PendingIntent)paramVersionedParcel.r((Parcelable)remoteActionCompat.d, 4);
    remoteActionCompat.e = paramVersionedParcel.h(remoteActionCompat.e, 5);
    remoteActionCompat.f = paramVersionedParcel.h(remoteActionCompat.f, 6);
    return remoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, VersionedParcel paramVersionedParcel) {
    paramVersionedParcel.x(false, false);
    paramVersionedParcel.M((b)paramRemoteActionCompat.a, 1);
    paramVersionedParcel.D(paramRemoteActionCompat.b, 2);
    paramVersionedParcel.D(paramRemoteActionCompat.c, 3);
    paramVersionedParcel.H((Parcelable)paramRemoteActionCompat.d, 4);
    paramVersionedParcel.z(paramRemoteActionCompat.e, 5);
    paramVersionedParcel.z(paramRemoteActionCompat.f, 6);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/RemoteActionCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */