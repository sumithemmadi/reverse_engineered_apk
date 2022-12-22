package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import com.google.android.exoplayer2.util.h0;

public final class i {
  public static final i a = (new b()).a();
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  private AudioAttributes f;
  
  private i(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
  }
  
  @TargetApi(21)
  public AudioAttributes a() {
    if (this.f == null) {
      AudioAttributes.Builder builder = (new AudioAttributes.Builder()).setContentType(this.b).setFlags(this.c).setUsage(this.d);
      if (h0.a >= 29)
        builder.setAllowedCapturePolicy(this.e); 
      this.f = builder.build();
    } 
    return this.f;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || i.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((i)paramObject).b || this.c != ((i)paramObject).c || this.d != ((i)paramObject).d || this.e != ((i)paramObject).e)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (((527 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e;
  }
  
  public static final class b {
    private int a = 0;
    
    private int b = 0;
    
    private int c = 1;
    
    private int d = 1;
    
    public i a() {
      return new i(this.a, this.b, this.c, this.d, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */