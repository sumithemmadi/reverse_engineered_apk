package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.util.h0;

public final class i {
  public final int a;
  
  public final u0[] b;
  
  public final g c;
  
  public final Object d;
  
  public i(u0[] paramArrayOfu0, f[] paramArrayOff, Object paramObject) {
    this.b = paramArrayOfu0;
    this.c = new g(paramArrayOff);
    this.d = paramObject;
    this.a = paramArrayOfu0.length;
  }
  
  public boolean a(i parami) {
    if (parami == null || parami.c.a != this.c.a)
      return false; 
    for (byte b = 0; b < this.c.a; b++) {
      if (!b(parami, b))
        return false; 
    } 
    return true;
  }
  
  public boolean b(i parami, int paramInt) {
    boolean bool1 = false;
    if (parami == null)
      return false; 
    boolean bool2 = bool1;
    if (h0.b(this.b[paramInt], parami.b[paramInt])) {
      bool2 = bool1;
      if (h0.b(this.c.a(paramInt), parami.c.a(paramInt)))
        bool2 = true; 
    } 
    return bool2;
  }
  
  public boolean c(int paramInt) {
    boolean bool;
    if (this.b[paramInt] != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */