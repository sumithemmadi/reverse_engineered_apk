package com.google.android.exoplayer2.ui;

public interface m {
  void a(a parama);
  
  long getPreferredUpdateDelay();
  
  void setAdGroupTimesMs(long[] paramArrayOflong, boolean[] paramArrayOfboolean, int paramInt);
  
  void setBufferedPosition(long paramLong);
  
  void setDuration(long paramLong);
  
  void setEnabled(boolean paramBoolean);
  
  void setPosition(long paramLong);
  
  public static interface a {
    void a(m param1m, long param1Long);
    
    void b(m param1m, long param1Long, boolean param1Boolean);
    
    void c(m param1m, long param1Long);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */