package android.support.v4.media.session;

import android.media.session.MediaSession;

class d {
  public static Object a(Object paramObject) {
    if (paramObject instanceof MediaSession.Token)
      return paramObject; 
    throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
  }
  
  static class a {
    public static Object a(Object param1Object) {
      return ((MediaSession.QueueItem)param1Object).getDescription();
    }
    
    public static long b(Object param1Object) {
      return ((MediaSession.QueueItem)param1Object).getQueueId();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/session/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */