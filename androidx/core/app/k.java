package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

class k {
  private static final Object a = new Object();
  
  private static Field b;
  
  private static boolean c;
  
  private static final Object d = new Object();
  
  public static SparseArray<Bundle> a(List<Bundle> paramList) {
    int i = paramList.size();
    SparseArray<Bundle> sparseArray = null;
    byte b = 0;
    while (b < i) {
      Bundle bundle = paramList.get(b);
      SparseArray<Bundle> sparseArray1 = sparseArray;
      if (bundle != null) {
        sparseArray1 = sparseArray;
        if (sparseArray == null)
          sparseArray1 = new SparseArray(); 
        sparseArray1.put(b, bundle);
      } 
      b++;
      sparseArray = sparseArray1;
    } 
    return sparseArray;
  }
  
  static Bundle b(i.a parama) {
    Bundle bundle2;
    boolean bool;
    Bundle bundle1 = new Bundle();
    IconCompat iconCompat = parama.e();
    if (iconCompat != null) {
      bool = iconCompat.e();
    } else {
      bool = false;
    } 
    bundle1.putInt("icon", bool);
    bundle1.putCharSequence("title", parama.i());
    bundle1.putParcelable("actionIntent", (Parcelable)parama.a());
    if (parama.d() != null) {
      bundle2 = new Bundle(parama.d());
    } else {
      bundle2 = new Bundle();
    } 
    bundle2.putBoolean("android.support.allowGeneratedReplies", parama.b());
    bundle1.putBundle("extras", bundle2);
    bundle1.putParcelableArray("remoteInputs", (Parcelable[])e(parama.f()));
    bundle1.putBoolean("showsUserInterface", parama.h());
    bundle1.putInt("semanticAction", parama.g());
    return bundle1;
  }
  
  public static Bundle c(Notification paramNotification) {
    synchronized (a) {
      if (c)
        return null; 
      try {
        if (b == null) {
          Field field = Notification.class.getDeclaredField("extras");
          if (!Bundle.class.isAssignableFrom(field.getType())) {
            Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
            c = true;
            return null;
          } 
          field.setAccessible(true);
          b = field;
        } 
        Bundle bundle2 = (Bundle)b.get(paramNotification);
        Bundle bundle1 = bundle2;
        if (bundle2 == null) {
          bundle1 = new Bundle();
          this();
          b.set(paramNotification, bundle1);
        } 
        return bundle1;
      } catch (IllegalAccessException illegalAccessException) {
        Log.e("NotificationCompat", "Unable to access notification extras", illegalAccessException);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.e("NotificationCompat", "Unable to access notification extras", noSuchFieldException);
      } 
      c = true;
      return null;
    } 
  }
  
  private static Bundle d(n paramn) {
    new Bundle();
    throw null;
  }
  
  private static Bundle[] e(n[] paramArrayOfn) {
    if (paramArrayOfn == null)
      return null; 
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfn.length];
    for (byte b = 0; b < paramArrayOfn.length; b++)
      arrayOfBundle[b] = d(paramArrayOfn[b]); 
    return arrayOfBundle;
  }
  
  public static Bundle f(Notification.Builder paramBuilder, i.a parama) {
    boolean bool;
    IconCompat iconCompat = parama.e();
    if (iconCompat != null) {
      bool = iconCompat.e();
    } else {
      bool = false;
    } 
    paramBuilder.addAction(bool, parama.i(), parama.a());
    Bundle bundle = new Bundle(parama.d());
    if (parama.f() != null)
      bundle.putParcelableArray("android.support.remoteInputs", (Parcelable[])e(parama.f())); 
    if (parama.c() != null)
      bundle.putParcelableArray("android.support.dataRemoteInputs", (Parcelable[])e(parama.c())); 
    bundle.putBoolean("android.support.allowGeneratedReplies", parama.b());
    return bundle;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */