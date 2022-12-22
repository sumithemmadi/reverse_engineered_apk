package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {
  public static void a(Bundle paramBundle) {
    if (paramBundle != null)
      paramBundle.setClassLoader(MediaSessionCompat.class.getClassLoader()); 
  }
  
  public static final class QueueItem implements Parcelable {
    public static final Parcelable.Creator<QueueItem> CREATOR = new a();
    
    private final MediaDescriptionCompat b;
    
    private final long c;
    
    private Object d;
    
    QueueItem(Parcel param1Parcel) {
      this.b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(param1Parcel);
      this.c = param1Parcel.readLong();
    }
    
    private QueueItem(Object param1Object, MediaDescriptionCompat param1MediaDescriptionCompat, long param1Long) {
      if (param1MediaDescriptionCompat != null) {
        if (param1Long != -1L) {
          this.b = param1MediaDescriptionCompat;
          this.c = param1Long;
          this.d = param1Object;
          return;
        } 
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
      } 
      throw new IllegalArgumentException("Description cannot be null.");
    }
    
    public static QueueItem a(Object param1Object) {
      return (param1Object == null || Build.VERSION.SDK_INT < 21) ? null : new QueueItem(param1Object, MediaDescriptionCompat.a(d.a.a(param1Object)), d.a.b(param1Object));
    }
    
    public static List<QueueItem> b(List<?> param1List) {
      if (param1List == null || Build.VERSION.SDK_INT < 21)
        return null; 
      ArrayList<QueueItem> arrayList = new ArrayList();
      Iterator<?> iterator = param1List.iterator();
      while (iterator.hasNext())
        arrayList.add(a(iterator.next())); 
      return arrayList;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("MediaSession.QueueItem {Description=");
      stringBuilder.append(this.b);
      stringBuilder.append(", Id=");
      stringBuilder.append(this.c);
      stringBuilder.append(" }");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      this.b.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeLong(this.c);
    }
    
    static final class a implements Parcelable.Creator<QueueItem> {
      public MediaSessionCompat.QueueItem a(Parcel param2Parcel) {
        return new MediaSessionCompat.QueueItem(param2Parcel);
      }
      
      public MediaSessionCompat.QueueItem[] b(int param2Int) {
        return new MediaSessionCompat.QueueItem[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<QueueItem> {
    public MediaSessionCompat.QueueItem a(Parcel param1Parcel) {
      return new MediaSessionCompat.QueueItem(param1Parcel);
    }
    
    public MediaSessionCompat.QueueItem[] b(int param1Int) {
      return new MediaSessionCompat.QueueItem[param1Int];
    }
  }
  
  public static final class ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
    
    ResultReceiver b;
    
    ResultReceiverWrapper(Parcel param1Parcel) {
      this.b = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(param1Parcel);
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      this.b.writeToParcel(param1Parcel, param1Int);
    }
    
    static final class a implements Parcelable.Creator<ResultReceiverWrapper> {
      public MediaSessionCompat.ResultReceiverWrapper a(Parcel param2Parcel) {
        return new MediaSessionCompat.ResultReceiverWrapper(param2Parcel);
      }
      
      public MediaSessionCompat.ResultReceiverWrapper[] b(int param2Int) {
        return new MediaSessionCompat.ResultReceiverWrapper[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<ResultReceiverWrapper> {
    public MediaSessionCompat.ResultReceiverWrapper a(Parcel param1Parcel) {
      return new MediaSessionCompat.ResultReceiverWrapper(param1Parcel);
    }
    
    public MediaSessionCompat.ResultReceiverWrapper[] b(int param1Int) {
      return new MediaSessionCompat.ResultReceiverWrapper[param1Int];
    }
  }
  
  public static final class Token implements Parcelable {
    public static final Parcelable.Creator<Token> CREATOR = new a();
    
    private final Object b;
    
    private b c;
    
    private Bundle d;
    
    Token(Object param1Object) {
      this(param1Object, null, null);
    }
    
    Token(Object param1Object, b param1b) {
      this(param1Object, param1b, null);
    }
    
    Token(Object param1Object, b param1b, Bundle param1Bundle) {
      this.b = param1Object;
      this.c = param1b;
      this.d = param1Bundle;
    }
    
    public static Token a(Object param1Object) {
      return b(param1Object, null);
    }
    
    public static Token b(Object param1Object, b param1b) {
      return (param1Object != null && Build.VERSION.SDK_INT >= 21) ? new Token(d.a(param1Object), param1b) : null;
    }
    
    public b c() {
      return this.c;
    }
    
    public Object d() {
      return this.b;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void e(b param1b) {
      this.c = param1b;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof Token))
        return false; 
      Token token = (Token)param1Object;
      param1Object = this.b;
      if (param1Object == null) {
        if (token.b != null)
          bool = false; 
        return bool;
      } 
      Object object = token.b;
      return (object == null) ? false : param1Object.equals(object);
    }
    
    public void f(Bundle param1Bundle) {
      this.d = param1Bundle;
    }
    
    public int hashCode() {
      Object object = this.b;
      return (object == null) ? 0 : object.hashCode();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      if (Build.VERSION.SDK_INT >= 21) {
        param1Parcel.writeParcelable((Parcelable)this.b, param1Int);
      } else {
        param1Parcel.writeStrongBinder((IBinder)this.b);
      } 
    }
    
    static final class a implements Parcelable.Creator<Token> {
      public MediaSessionCompat.Token a(Parcel param2Parcel) {
        Parcelable parcelable;
        IBinder iBinder;
        if (Build.VERSION.SDK_INT >= 21) {
          parcelable = param2Parcel.readParcelable(null);
        } else {
          iBinder = parcelable.readStrongBinder();
        } 
        return new MediaSessionCompat.Token(iBinder);
      }
      
      public MediaSessionCompat.Token[] b(int param2Int) {
        return new MediaSessionCompat.Token[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<Token> {
    public MediaSessionCompat.Token a(Parcel param1Parcel) {
      Parcelable parcelable;
      IBinder iBinder;
      if (Build.VERSION.SDK_INT >= 21) {
        parcelable = param1Parcel.readParcelable(null);
      } else {
        iBinder = parcelable.readStrongBinder();
      } 
      return new MediaSessionCompat.Token(iBinder);
    }
    
    public MediaSessionCompat.Token[] b(int param1Int) {
      return new MediaSessionCompat.Token[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/session/MediaSessionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */