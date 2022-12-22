package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

class e {
  public static long a(Object paramObject) {
    return ((PlaybackState)paramObject).getActions();
  }
  
  public static long b(Object paramObject) {
    return ((PlaybackState)paramObject).getActiveQueueItemId();
  }
  
  public static long c(Object paramObject) {
    return ((PlaybackState)paramObject).getBufferedPosition();
  }
  
  public static List<Object> d(Object paramObject) {
    return ((PlaybackState)paramObject).getCustomActions();
  }
  
  public static CharSequence e(Object paramObject) {
    return ((PlaybackState)paramObject).getErrorMessage();
  }
  
  public static long f(Object paramObject) {
    return ((PlaybackState)paramObject).getLastPositionUpdateTime();
  }
  
  public static float g(Object paramObject) {
    return ((PlaybackState)paramObject).getPlaybackSpeed();
  }
  
  public static long h(Object paramObject) {
    return ((PlaybackState)paramObject).getPosition();
  }
  
  public static int i(Object paramObject) {
    return ((PlaybackState)paramObject).getState();
  }
  
  static final class a {
    public static String a(Object param1Object) {
      return ((PlaybackState.CustomAction)param1Object).getAction();
    }
    
    public static Bundle b(Object param1Object) {
      return ((PlaybackState.CustomAction)param1Object).getExtras();
    }
    
    public static int c(Object param1Object) {
      return ((PlaybackState.CustomAction)param1Object).getIcon();
    }
    
    public static CharSequence d(Object param1Object) {
      return ((PlaybackState.CustomAction)param1Object).getName();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/session/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */