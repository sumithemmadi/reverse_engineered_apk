package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
  
  final int b;
  
  final long c;
  
  final long d;
  
  final float e;
  
  final long f;
  
  final int g;
  
  final CharSequence h;
  
  final long i;
  
  List<CustomAction> j;
  
  final long k;
  
  final Bundle l;
  
  private Object m;
  
  PlaybackStateCompat(int paramInt1, long paramLong1, long paramLong2, float paramFloat, long paramLong3, int paramInt2, CharSequence paramCharSequence, long paramLong4, List<CustomAction> paramList, long paramLong5, Bundle paramBundle) {
    this.b = paramInt1;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramFloat;
    this.f = paramLong3;
    this.g = paramInt2;
    this.h = paramCharSequence;
    this.i = paramLong4;
    this.j = new ArrayList<CustomAction>(paramList);
    this.k = paramLong5;
    this.l = paramBundle;
  }
  
  PlaybackStateCompat(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = paramParcel.readLong();
    this.e = paramParcel.readFloat();
    this.i = paramParcel.readLong();
    this.d = paramParcel.readLong();
    this.f = paramParcel.readLong();
    this.h = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.j = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    this.k = paramParcel.readLong();
    this.l = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    this.g = paramParcel.readInt();
  }
  
  public static PlaybackStateCompat a(Object paramObject) {
    PlaybackStateCompat playbackStateCompat;
    List<Object> list1 = null;
    Bundle bundle = null;
    List<Object> list2 = list1;
    if (paramObject != null) {
      list2 = list1;
      if (Build.VERSION.SDK_INT >= 21) {
        list1 = e.d(paramObject);
        if (list1 != null) {
          list2 = new ArrayList(list1.size());
          Iterator iterator = list1.iterator();
          while (iterator.hasNext())
            list2.add(CustomAction.a(iterator.next())); 
        } else {
          list2 = null;
        } 
        if (Build.VERSION.SDK_INT >= 22)
          bundle = f.a(paramObject); 
        playbackStateCompat = new PlaybackStateCompat(e.i(paramObject), e.h(paramObject), e.c(paramObject), e.g(paramObject), e.a(paramObject), 0, e.e(paramObject), e.f(paramObject), (List)list2, e.b(paramObject), bundle);
        playbackStateCompat.m = paramObject;
      } 
    } 
    return playbackStateCompat;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
    stringBuilder.append("state=");
    stringBuilder.append(this.b);
    stringBuilder.append(", position=");
    stringBuilder.append(this.c);
    stringBuilder.append(", buffered position=");
    stringBuilder.append(this.d);
    stringBuilder.append(", speed=");
    stringBuilder.append(this.e);
    stringBuilder.append(", updated=");
    stringBuilder.append(this.i);
    stringBuilder.append(", actions=");
    stringBuilder.append(this.f);
    stringBuilder.append(", error code=");
    stringBuilder.append(this.g);
    stringBuilder.append(", error message=");
    stringBuilder.append(this.h);
    stringBuilder.append(", custom actions=");
    stringBuilder.append(this.j);
    stringBuilder.append(", active item id=");
    stringBuilder.append(this.k);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeLong(this.c);
    paramParcel.writeFloat(this.e);
    paramParcel.writeLong(this.i);
    paramParcel.writeLong(this.d);
    paramParcel.writeLong(this.f);
    TextUtils.writeToParcel(this.h, paramParcel, paramInt);
    paramParcel.writeTypedList(this.j);
    paramParcel.writeLong(this.k);
    paramParcel.writeBundle(this.l);
    paramParcel.writeInt(this.g);
  }
  
  public static final class CustomAction implements Parcelable {
    public static final Parcelable.Creator<CustomAction> CREATOR = new a();
    
    private final String b;
    
    private final CharSequence c;
    
    private final int d;
    
    private final Bundle e;
    
    private Object f;
    
    CustomAction(Parcel param1Parcel) {
      this.b = param1Parcel.readString();
      this.c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(param1Parcel);
      this.d = param1Parcel.readInt();
      this.e = param1Parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    CustomAction(String param1String, CharSequence param1CharSequence, int param1Int, Bundle param1Bundle) {
      this.b = param1String;
      this.c = param1CharSequence;
      this.d = param1Int;
      this.e = param1Bundle;
    }
    
    public static CustomAction a(Object param1Object) {
      if (param1Object == null || Build.VERSION.SDK_INT < 21)
        return null; 
      CustomAction customAction = new CustomAction(e.a.a(param1Object), e.a.d(param1Object), e.a.c(param1Object), e.a.b(param1Object));
      customAction.f = param1Object;
      return customAction;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Action:mName='");
      stringBuilder.append(this.c);
      stringBuilder.append(", mIcon=");
      stringBuilder.append(this.d);
      stringBuilder.append(", mExtras=");
      stringBuilder.append(this.e);
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeString(this.b);
      TextUtils.writeToParcel(this.c, param1Parcel, param1Int);
      param1Parcel.writeInt(this.d);
      param1Parcel.writeBundle(this.e);
    }
    
    static final class a implements Parcelable.Creator<CustomAction> {
      public PlaybackStateCompat.CustomAction a(Parcel param2Parcel) {
        return new PlaybackStateCompat.CustomAction(param2Parcel);
      }
      
      public PlaybackStateCompat.CustomAction[] b(int param2Int) {
        return new PlaybackStateCompat.CustomAction[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<CustomAction> {
    public PlaybackStateCompat.CustomAction a(Parcel param1Parcel) {
      return new PlaybackStateCompat.CustomAction(param1Parcel);
    }
    
    public PlaybackStateCompat.CustomAction[] b(int param1Int) {
      return new PlaybackStateCompat.CustomAction[param1Int];
    }
  }
  
  static final class a implements Parcelable.Creator<PlaybackStateCompat> {
    public PlaybackStateCompat a(Parcel param1Parcel) {
      return new PlaybackStateCompat(param1Parcel);
    }
    
    public PlaybackStateCompat[] b(int param1Int) {
      return new PlaybackStateCompat[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/session/PlaybackStateCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */