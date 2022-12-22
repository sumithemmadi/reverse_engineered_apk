package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.util.e;

final class m implements b0 {
  private final int a;
  
  private final n b;
  
  private int c;
  
  public m(n paramn, int paramInt) {
    this.b = paramn;
    this.a = paramInt;
    this.c = -1;
  }
  
  private boolean e() {
    boolean bool;
    int i = this.c;
    if (i != -1 && i != -3 && i != -2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int a(f0 paramf0, e parame, boolean paramBoolean) {
    int i = this.c;
    int j = -3;
    if (i == -3) {
      parame.addFlag(4);
      return -4;
    } 
    if (e())
      j = this.b.Z(this.c, paramf0, parame, paramBoolean); 
    return j;
  }
  
  public void b() {
    int i = this.c;
    if (i != -2) {
      if (i == -1) {
        this.b.Q();
      } else if (i != -3) {
        this.b.R(i);
      } 
      return;
    } 
    throw new SampleQueueMappingException((this.b.C().a(this.a).a(0)).j);
  }
  
  public int c(long paramLong) {
    boolean bool;
    if (e()) {
      bool = this.b.j0(this.c, paramLong);
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void d() {
    boolean bool;
    if (this.c == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.c = this.b.i(this.a);
  }
  
  public void f() {
    if (this.c != -1) {
      this.b.k0(this.a);
      this.c = -1;
    } 
  }
  
  public boolean m() {
    return (this.c == -3 || (e() && this.b.L(this.c)));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */