package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaMetadataCompat implements Parcelable {
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
  
  static final b.e.a<String, Integer> b;
  
  private static final String[] c = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
  
  private static final String[] d = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
  
  private static final String[] e = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
  
  final Bundle f;
  
  private Object g;
  
  static {
    CREATOR = new a();
  }
  
  MediaMetadataCompat(Parcel paramParcel) {
    this.f = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public static MediaMetadataCompat a(Object paramObject) {
    if (paramObject != null && Build.VERSION.SDK_INT >= 21) {
      Parcel parcel = Parcel.obtain();
      c.a(paramObject, parcel, 0);
      parcel.setDataPosition(0);
      MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
      parcel.recycle();
      mediaMetadataCompat.g = paramObject;
      return mediaMetadataCompat;
    } 
    return null;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeBundle(this.f);
  }
  
  static {
    b.e.a<String, Integer> a1 = new b.e.a();
    b = a1;
    Integer integer1 = Integer.valueOf(1);
    a1.put("android.media.metadata.TITLE", integer1);
    a1.put("android.media.metadata.ARTIST", integer1);
    Integer integer2 = Integer.valueOf(0);
    a1.put("android.media.metadata.DURATION", integer2);
    a1.put("android.media.metadata.ALBUM", integer1);
    a1.put("android.media.metadata.AUTHOR", integer1);
    a1.put("android.media.metadata.WRITER", integer1);
    a1.put("android.media.metadata.COMPOSER", integer1);
    a1.put("android.media.metadata.COMPILATION", integer1);
    a1.put("android.media.metadata.DATE", integer1);
    a1.put("android.media.metadata.YEAR", integer2);
    a1.put("android.media.metadata.GENRE", integer1);
    a1.put("android.media.metadata.TRACK_NUMBER", integer2);
    a1.put("android.media.metadata.NUM_TRACKS", integer2);
    a1.put("android.media.metadata.DISC_NUMBER", integer2);
    a1.put("android.media.metadata.ALBUM_ARTIST", integer1);
    Integer integer3 = Integer.valueOf(2);
    a1.put("android.media.metadata.ART", integer3);
    a1.put("android.media.metadata.ART_URI", integer1);
    a1.put("android.media.metadata.ALBUM_ART", integer3);
    a1.put("android.media.metadata.ALBUM_ART_URI", integer1);
    Integer integer4 = Integer.valueOf(3);
    a1.put("android.media.metadata.USER_RATING", integer4);
    a1.put("android.media.metadata.RATING", integer4);
    a1.put("android.media.metadata.DISPLAY_TITLE", integer1);
    a1.put("android.media.metadata.DISPLAY_SUBTITLE", integer1);
    a1.put("android.media.metadata.DISPLAY_DESCRIPTION", integer1);
    a1.put("android.media.metadata.DISPLAY_ICON", integer3);
    a1.put("android.media.metadata.DISPLAY_ICON_URI", integer1);
    a1.put("android.media.metadata.MEDIA_ID", integer1);
    a1.put("android.media.metadata.BT_FOLDER_TYPE", integer2);
    a1.put("android.media.metadata.MEDIA_URI", integer1);
    a1.put("android.media.metadata.ADVERTISEMENT", integer2);
    a1.put("android.media.metadata.DOWNLOAD_STATUS", integer2);
  }
  
  static final class a implements Parcelable.Creator<MediaMetadataCompat> {
    public MediaMetadataCompat a(Parcel param1Parcel) {
      return new MediaMetadataCompat(param1Parcel);
    }
    
    public MediaMetadataCompat[] b(int param1Int) {
      return new MediaMetadataCompat[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/MediaMetadataCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */