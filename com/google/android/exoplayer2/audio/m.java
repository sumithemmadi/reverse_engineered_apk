package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.util.h0;

final class m {
  private final a a;
  
  private int b;
  
  private long c;
  
  private long d;
  
  private long e;
  
  private long f;
  
  public m(AudioTrack paramAudioTrack) {
    if (h0.a >= 19) {
      this.a = new a(paramAudioTrack);
      h();
    } else {
      this.a = null;
      i(3);
    } 
  }
  
  private void i(int paramInt) {
    this.b = paramInt;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2 && paramInt != 3) {
          if (paramInt == 4) {
            this.d = 500000L;
          } else {
            throw new IllegalStateException();
          } 
        } else {
          this.d = 10000000L;
        } 
      } else {
        this.d = 5000L;
      } 
    } else {
      this.e = 0L;
      this.f = -1L;
      this.c = System.nanoTime() / 1000L;
      this.d = 5000L;
    } 
  }
  
  public void a() {
    if (this.b == 4)
      h(); 
  }
  
  public long b() {
    long l;
    a a1 = this.a;
    if (a1 != null) {
      l = a1.a();
    } else {
      l = -1L;
    } 
    return l;
  }
  
  public long c() {
    long l;
    a a1 = this.a;
    if (a1 != null) {
      l = a1.b();
    } else {
      l = -9223372036854775807L;
    } 
    return l;
  }
  
  public boolean d() {
    int i = this.b;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != 1)
      if (i == 2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    return bool2;
  }
  
  public boolean e() {
    boolean bool;
    if (this.b == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean f(long paramLong) {
    a a1 = this.a;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (a1 != null)
      if (paramLong - this.e < this.d) {
        bool2 = bool1;
      } else {
        this.e = paramLong;
        boolean bool = a1.c();
        int i = this.b;
        if (i != 0) {
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                if (i != 4)
                  throw new IllegalStateException(); 
              } else if (bool) {
                h();
              } 
            } else if (!bool) {
              h();
            } 
          } else if (bool) {
            if (this.a.a() > this.f)
              i(2); 
          } else {
            h();
          } 
        } else if (bool) {
          bool2 = bool1;
          if (this.a.b() >= this.c) {
            this.f = this.a.a();
            i(1);
          } else {
            return bool2;
          } 
        } else if (paramLong - this.c > 500000L) {
          i(3);
        } 
        bool2 = bool;
      }  
    return bool2;
  }
  
  public void g() {
    i(4);
  }
  
  public void h() {
    if (this.a != null)
      i(0); 
  }
  
  @TargetApi(19)
  private static final class a {
    private final AudioTrack a;
    
    private final AudioTimestamp b;
    
    private long c;
    
    private long d;
    
    private long e;
    
    public a(AudioTrack param1AudioTrack) {
      this.a = param1AudioTrack;
      this.b = new AudioTimestamp();
    }
    
    public long a() {
      return this.e;
    }
    
    public long b() {
      return this.b.nanoTime / 1000L;
    }
    
    public boolean c() {
      boolean bool = this.a.getTimestamp(this.b);
      if (bool) {
        long l = this.b.framePosition;
        if (this.d > l)
          this.c++; 
        this.d = l;
        this.e = l + (this.c << 32L);
      } 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */