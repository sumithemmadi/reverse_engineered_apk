package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

class a {
  public static Object a(Parcel paramParcel) {
    return MediaDescription.CREATOR.createFromParcel(paramParcel);
  }
  
  public static CharSequence b(Object paramObject) {
    return ((MediaDescription)paramObject).getDescription();
  }
  
  public static Bundle c(Object paramObject) {
    return ((MediaDescription)paramObject).getExtras();
  }
  
  public static Bitmap d(Object paramObject) {
    return ((MediaDescription)paramObject).getIconBitmap();
  }
  
  public static Uri e(Object paramObject) {
    return ((MediaDescription)paramObject).getIconUri();
  }
  
  public static String f(Object paramObject) {
    return ((MediaDescription)paramObject).getMediaId();
  }
  
  public static CharSequence g(Object paramObject) {
    return ((MediaDescription)paramObject).getSubtitle();
  }
  
  public static CharSequence h(Object paramObject) {
    return ((MediaDescription)paramObject).getTitle();
  }
  
  public static void i(Object paramObject, Parcel paramParcel, int paramInt) {
    ((MediaDescription)paramObject).writeToParcel(paramParcel, paramInt);
  }
  
  static class a {
    public static Object a(Object param1Object) {
      return ((MediaDescription.Builder)param1Object).build();
    }
    
    public static Object b() {
      return new MediaDescription.Builder();
    }
    
    public static void c(Object param1Object, CharSequence param1CharSequence) {
      ((MediaDescription.Builder)param1Object).setDescription(param1CharSequence);
    }
    
    public static void d(Object param1Object, Bundle param1Bundle) {
      ((MediaDescription.Builder)param1Object).setExtras(param1Bundle);
    }
    
    public static void e(Object param1Object, Bitmap param1Bitmap) {
      ((MediaDescription.Builder)param1Object).setIconBitmap(param1Bitmap);
    }
    
    public static void f(Object param1Object, Uri param1Uri) {
      ((MediaDescription.Builder)param1Object).setIconUri(param1Uri);
    }
    
    public static void g(Object param1Object, String param1String) {
      ((MediaDescription.Builder)param1Object).setMediaId(param1String);
    }
    
    public static void h(Object param1Object, CharSequence param1CharSequence) {
      ((MediaDescription.Builder)param1Object).setSubtitle(param1CharSequence);
    }
    
    public static void i(Object param1Object, CharSequence param1CharSequence) {
      ((MediaDescription.Builder)param1Object).setTitle(param1CharSequence);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */