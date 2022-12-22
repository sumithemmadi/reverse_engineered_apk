package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.e0.d;
import com.google.android.exoplayer2.source.e0.e;
import java.util.List;

public interface f {
  TrackGroup a();
  
  int b();
  
  boolean c(int paramInt, long paramLong);
  
  Format d(int paramInt);
  
  void e();
  
  int f(int paramInt);
  
  void g(long paramLong1, long paramLong2, long paramLong3, List<? extends d> paramList, e[] paramArrayOfe);
  
  int h();
  
  Format i();
  
  int j();
  
  void k(float paramFloat);
  
  Object l();
  
  int length();
  
  void m();
  
  int n(int paramInt);
  
  void p();
  
  public static final class a {
    public final TrackGroup a;
    
    public final int[] b;
    
    public final int c;
    
    public final Object d;
    
    public a(TrackGroup param1TrackGroup, int... param1VarArgs) {
      this(param1TrackGroup, param1VarArgs, 0, null);
    }
    
    public a(TrackGroup param1TrackGroup, int[] param1ArrayOfint, int param1Int, Object param1Object) {
      this.a = param1TrackGroup;
      this.b = param1ArrayOfint;
      this.c = param1Int;
      this.d = param1Object;
    }
  }
  
  public static interface b {
    f[] a(f.a[] param1ArrayOfa, com.google.android.exoplayer2.upstream.f param1f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */