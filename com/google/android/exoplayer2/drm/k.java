package com.google.android.exoplayer2.drm;

import android.os.Looper;

public interface k<T extends m> {
  public static final k<m> a = new a();
  
  void a();
  
  Class<? extends m> b(DrmInitData paramDrmInitData);
  
  void c();
  
  DrmSession<T> d(Looper paramLooper, int paramInt);
  
  DrmSession<T> e(Looper paramLooper, DrmInitData paramDrmInitData);
  
  boolean f(DrmInitData paramDrmInitData);
  
  static final class a implements k<m> {
    public Class<m> b(DrmInitData param1DrmInitData) {
      return null;
    }
    
    public DrmSession<m> e(Looper param1Looper, DrmInitData param1DrmInitData) {
      return new l<m>(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
    }
    
    public boolean f(DrmInitData param1DrmInitData) {
      return false;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/drm/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */