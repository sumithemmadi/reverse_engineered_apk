package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.e;
import java.util.Map;

public final class l<T extends m> implements DrmSession<T> {
  private final DrmSession.DrmSessionException a;
  
  public l(DrmSession.DrmSessionException paramDrmSessionException) {
    this.a = (DrmSession.DrmSessionException)e.e(paramDrmSessionException);
  }
  
  public void a() {}
  
  public void b() {}
  
  public boolean c() {
    return false;
  }
  
  public Map<String, String> d() {
    return null;
  }
  
  public T e() {
    return null;
  }
  
  public DrmSession.DrmSessionException f() {
    return this.a;
  }
  
  public int getState() {
    return 1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/drm/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */